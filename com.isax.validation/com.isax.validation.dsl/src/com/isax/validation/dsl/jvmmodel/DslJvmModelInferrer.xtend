package com.isax.validation.dsl.jvmmodel

import com.google.inject.Inject
import com.isax.validation.dsl.api.AbstractValidator
import com.isax.validation.dsl.api.NodePredicates
import com.isax.validation.dsl.api.ResolvingNode
import com.isax.validation.dsl.api.ResolvingNodeSet
import com.isax.validation.dsl.api.Traverser
import com.isax.validation.dsl.dsl.AndExpression
import com.isax.validation.dsl.dsl.Argument
import com.isax.validation.dsl.dsl.ArgumentList
import com.isax.validation.dsl.dsl.AssignmentXExpression
import com.isax.validation.dsl.dsl.Axis
import com.isax.validation.dsl.dsl.ConstraintSentence
import com.isax.validation.dsl.dsl.DefinitionSentence
import com.isax.validation.dsl.dsl.DefinitionSentencePredicate
import com.isax.validation.dsl.dsl.ImpliesExpression
import com.isax.validation.dsl.dsl.NodeDefinition
import com.isax.validation.dsl.dsl.OrExpression
import com.isax.validation.dsl.dsl.PredicateDefinitionSentence
import com.isax.validation.dsl.dsl.PredicateExpression
import com.isax.validation.dsl.dsl.PredicateReference
import com.isax.validation.dsl.dsl.PredicateXExpression
import com.isax.validation.dsl.dsl.PropertyReferenceExpression
import com.isax.validation.dsl.dsl.PropertyRelationPredicate
import com.isax.validation.dsl.dsl.PropertyValueExpression
import com.isax.validation.dsl.dsl.Quantification
import com.isax.validation.dsl.dsl.Quantor
import com.isax.validation.dsl.dsl.RelationQualifier
import com.isax.validation.dsl.dsl.Selector
import com.isax.validation.dsl.dsl.SelectorList
import com.isax.validation.dsl.dsl.StartOnSentence
import com.isax.validation.dsl.dsl.Validator
import com.isax.validation.dsl.util.DslUtil
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class DslJvmModelInferrer extends AbstractModelInferrer {

	extension DslUtil dslUtil = new DslUtil 

	@Inject extension JvmTypesBuilder
	@Inject ISerializer serializer;

	def dispatch void infer(Validator validator, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(validator.toClass("de.dbsystem.avb.Test")) [
			superTypes += typeRef(typeof(AbstractValidator))
			
			members += validator.toField("traverser$", typeRef(typeof(Traverser))) [
				visibility = JvmVisibility.PRIVATE
			]
			members += validator.toField("predicates$", typeRef(typeof(NodePredicates))) [
				visibility = JvmVisibility.PRIVATE
			]

			members += compileStartOnDefinition(validator)
			members += compileNodeDefinitions(validator)

			members += validator.toMethod("validate", typeRef("boolean")) [
				annotations += annotationRef(typeof(Override))
				visibility = JvmVisibility.PUBLIC
				parameters += validator.toParameter("node$", typeRef("ResolvingNode"))
				body = '''«compileBody(validator)»'''
			]

			members += compilePredicates(validator)
			members += compileXExpressionPredicates(validator)
			members += compileXExpressionAssignments(validator)
		]
	}

	def serialize(EObject object) {
		serializer.serialize(object).trim.replaceAll("\\n", "").replaceAll("\\r", "").replaceAll("\\s+", " ")
	}

	def compileBody(Validator validator) '''		
		«FOR sentence : validator.sentences»
			«IF sentence instanceof StartOnSentence»
				«sentenceStatements(sentence)»
				
			«ENDIF»
		«ENDFOR»		
		«FOR sentence : validator.sentences»
			«IF sentence instanceof DefinitionSentence»
				«sentenceStatements(sentence)»
				«IF sentence.quantification == null»
					{
						boolean satisfied$«sentence.depth» = «qualifierSatisfiedStatement(sentence.target.definition, sentence.qualifier)»;
						if (!satisfied$«sentence.depth») return satisfied$«sentence.depth»;
					}
					
				«ENDIF»
			«ENDIF»
		«ENDFOR»	
		«FOR sentence : validator.sentences»
			«IF sentence instanceof ConstraintSentence»
				«sentenceStatements(sentence)»
				
			«ENDIF»
		«ENDFOR»
		return true;
	'''

	def compileStartOnDefinition(Validator validator) {
		validator.sentences.filter(typeof(StartOnSentence)).map [ it |
			it.toField(
				it.definition.name,
				if(it.definition.collection) typeRef(typeof(ResolvingNodeSet)) else typeRef(typeof(ResolvingNode))
			)
		]
	}

	def compileNodeDefinitions(Validator validator) {
		validator.sentences.filter(typeof(DefinitionSentence)).map [ it |
			it.toField(
				it.target.definition.name,
				if(it.target.definition.collection) typeRef(typeof(ResolvingNodeSet)) else typeRef(typeof(ResolvingNode))
			)
		]
	}

	def compilePredicates(Validator validator) {
		validator.sentences.filter(typeof(PredicateDefinitionSentence)).map [ s |
			s.toMethod(s.name, typeRef("boolean")) [
				visibility = JvmVisibility.PRIVATE
				parameters += s.parameters?.parameters.map[ p | p.toParameter(p.node.name, if (p.node.collection) typeRef(typeof(ResolvingNodeSet)) else typeRef(typeof(ResolvingNode))) ]			
				body = '''return «predicateExpression(s.predicate)»'''
			]
		]
	}

	def compileXExpressionPredicates(Validator validator) {
		validator.eAllContents.toSet.filter(typeof(PredicateXExpression)).map [ PredicateXExpression e |
			e.toMethod("predicate$" + e.hashCode, typeRef("boolean")) [
				body = e.expression
			]
		]
	}

	def compileXExpressionAssignments(Validator validator) {
		validator.eAllContents.toSet.filter(typeof(AssignmentXExpression)).map [ AssignmentXExpression e |
			e.toMethod("assignment$" + e.hashCode, e.expression.inferredType) [
				body = e.expression
			]
		]
	}

	def dispatch sentenceStatements(
		StartOnSentence sentence
	) '''	
		// «serialize(sentence)»
		«sentence.definition.name» = node$;
		if («sentence.definition.name» == null || !predicates$.hasType(«sentence.definition.name», "«sentence.definition.selectors.selectors.selectors.join("\", \"", [Selector s | s.type])»")) {
			return true;
		}
	'''

	def dispatch sentenceStatements(
		DefinitionSentence sentence
	) '''
		// «serialize(sentence)»
		«IF sentence.node != null»
			«singleNodeDefinition(sentence)»
		«ENDIF»
		«IF sentence.quantification != null»
			«quantifiedDefinition(sentence)»
		«ENDIF»
	'''

	def dispatch sentenceStatements(
		ConstraintSentence sentence
	) '''
		// «serialize(sentence)»
		{
			«IF sentence.quantifications != null»
				boolean satisfied$«sentence.depth» = «constraintDispatch(sentence.quantifications.quantifications, 0, sentence)»
				if (!satisfied$«sentence.depth») return false;
			«ENDIF»
		}
	'''

	def constraintDispatch(List<Quantification> quantifications, int index, ConstraintSentence sentence) '''
		«IF index < quantifications.size»
			«IF quantifications.get(index).quantor == Quantor.EACH»
				«constraintQuantorEach(quantifications, index, sentence)»
			«ELSEIF quantifications.get(index).quantor == Quantor.ANY»
				«constraintQuantorAny(quantifications, index, sentence)»
			«ENDIF»
		«ELSE»
			«predicateExpression(sentence.predicate)»
		«ENDIF»
	'''

	def constraintQuantorEach(List<Quantification> quantifications, int index,
		ConstraintSentence sentence
	) '''
		eval(() -> {
			for (ResolvingNode «quantifications.get(index).node.name» : «quantifications.get(index).nodeSet.name») {
				boolean satisfied$«quantifications.get(index).node.depth» = «constraintDispatch(quantifications, index + 1, sentence)»
				if (!satisfied$«quantifications.get(index).node.depth») return false;
			}
			return true;
		});
	'''

	def constraintQuantorAny(
		List<Quantification> quantifications,
		int index,
		ConstraintSentence sentence
	) '''
		eval(() -> {
			for (ResolvingNode «quantifications.get(index).node.name» : «quantifications.get(index).nodeSet.name») {
				boolean satisfied$«quantifications.get(index).node.depth» = «constraintDispatch(quantifications, index + 1, sentence)»
				if (satisfied$«quantifications.get(index).node.depth») return true;
			}
			return false;
		});
	'''

	def singleNodeDefinition(
		DefinitionSentence sentence
	) '''
		«nodeAssignmentStatement(sentence.target.definition, sentence.target.axis, sentence.node, sentence.target.definition.selectors, sentence.target.predicate)»
	'''

	def quantifiedDefinition(
		DefinitionSentence sentence
	) '''
		{
			boolean satisfied$«sentence.depth» = «initialQualifierSatisfaction(sentence.qualifier)»;
			for (ResolvingNode «sentence.quantification.node.name» : «sentence.quantification.nodeSet.name») {
				«nodeAssignmentStatement(sentence.getTarget.definition, sentence.getTarget.axis, sentence.quantification.node, sentence.target.definition.selectors, sentence.target.predicate)»
				satisfied$«sentence.depth» «quantorSatisfactionRelation(sentence.quantification.quantor)» «qualifierSatisfiedStatement(sentence.getTarget.definition, sentence.qualifier)»;
			}
			if (!satisfied$«sentence.depth») return satisfied$«sentence.depth»;
		}
	'''

	def nodeAssignmentStatement(NodeDefinition assignee, Axis axis, NodeDefinition source, SelectorList types, PredicateExpression predicate) '''
		«assignee.name» = traverser$.«axis.getName().toLowerCase»(«source.name», (ResolvingNode node$«assignee.depth») -> {
			boolean satisfied$«assignee.depth» = true;
			«IF types != null»
				satisfied$«assignee.depth» &= predicates$.hasType(node$«assignee.depth», "«types.selectors.selectors.join("\", \"", [Selector s | s.type])»");
			«ENDIF»
			«IF predicate != null»
				satisfied$«assignee.depth» &= «predicateExpression(predicate)»
			«ENDIF»
			return satisfied$«assignee.depth»;
		});
	'''

	def qualifierSatisfiedStatement(NodeDefinition node, RelationQualifier qualifier) {
		switch (qualifier) {
			case CAN: return "true"
			case MUST: return node.name + ".hasCandidates()"
			case MUST_NOT: return "!" + node.name + ".hasCandidates()"
		}
	}

	def initialQualifierSatisfaction(RelationQualifier qualifier) {
		switch (qualifier) {
			case CAN: return "true"
			case MUST: return "true"
			case MUST_NOT: return "false"
		}
	}

	def quantorSatisfactionRelation(Quantor quantor) {
		switch (quantor) {
			case ANY: return "|="
			case EACH: return "&="
		}
	}

	def dispatch predicateExpression(PredicateExpression expression) {
		if(expression.inner != null) return predicateExpression(expression.inner)
		if(expression.lhs != null) return predicateExpression(expression.lhs)
		if(expression.rhs != null) return predicateExpression(expression.rhs)
		if(expression.call != null) return predicateCall(expression.call)
	}

	def dispatch predicateExpression(AndExpression and) '''
		eval(() -> {
			boolean satisfied$«and.depth» = true;			
			«IF and.lhs != null»satisfied$«and.depth» &= «predicateExpression(and.lhs)»«ENDIF»		
			satisfied$«and.depth» &= «predicateExpression(and.rhs)»
			return satisfied$«and.depth»;
		});
	'''

	def dispatch predicateExpression(OrExpression or) '''
		eval(() -> {
			boolean satisfied$«or.depth» = false;			
			«IF or.lhs != null»satisfied$«or.depth» |= «predicateExpression(or.lhs)»«ENDIF»		
			satisfied$«or.depth» |= «predicateExpression(or.rhs)»
			return satisfied$«or.depth»;
		});
	'''

	def dispatch predicateExpression(ImpliesExpression implies) '''
		eval(() -> {
			boolean satisfied$«implies.depth» = false;			
			«IF implies.lhs != null»satisfied$«implies.depth» |= «predicateExpression(implies.lhs)»«ENDIF»		
			satisfied$«implies.depth» |= !«predicateExpression(implies.rhs)»
			return satisfied$«implies.depth»;
		});
	'''

	def dispatch predicateExpression(PredicateReference reference) '''
		«reference.reference.name»(«argumentList(reference.arguments)»);
	'''

	def dispatch predicateCall(
		PropertyRelationPredicate relation
	) '''
		predicates$.«relation.relation.getName().toFirstLower»(«propertyExpression(relation.lhs)», «propertyExpression(relation.rhs)»);
	'''

	def dispatch propertyExpression(PropertyValueExpression expression) {
		expression.value
	}

	def dispatch propertyExpression(PropertyReferenceExpression expression) {
		expression.node.name + ".getProperty(" + "\"" + expression.property + "\"" + ")"
	}

	def dispatch predicateCall(DefinitionSentencePredicate definition) '''
		eval(() -> {
			«val defined = definition.sentence.target.definition»
			«IF defined.collection»ResolvingNodeSet«ELSE»ResolvingNode«ENDIF» «defined.name»;
			«sentenceStatements(definition.sentence)»
			return «qualifierSatisfiedStatement(defined, definition.sentence.qualifier)»;
		});
	'''

	def dispatch predicateCall(PredicateReference reference) '''
		«reference.reference.name»(«argumentList(reference.arguments)»);
	'''

	def dispatch predicateCall(PredicateXExpression expression) '''
		predicate$«expression.hashCode»();
	'''

	def argumentList(ArgumentList list) {
		if(list != null) list.arguments.join(", ", [Argument argument|argument.node.name])
	}
}


