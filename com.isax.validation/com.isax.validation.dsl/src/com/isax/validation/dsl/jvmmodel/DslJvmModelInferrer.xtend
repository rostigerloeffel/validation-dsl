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
import com.isax.validation.dsl.dsl.BodySentences
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
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

import static extension com.isax.validation.dsl.util.DslUtil.uniqueSuffix

class DslJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject ISerializer serializer;

	def dispatch void infer(Validator validator, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(validator.toClass("de.dbsystem.avb.Test")) [
			superTypes += typeRef(AbstractValidator)

			members += validator.toField("null$" + ResolvingNode.simpleName, typeRef(ResolvingNode)) [
				visibility = JvmVisibility.PRIVATE
				static = true
				final = true
				initializer = '''new «ResolvingNode.simpleName»()'''
			]
			members += validator.toField("null$" + ResolvingNodeSet.simpleName, typeRef(ResolvingNodeSet)) [
				visibility = JvmVisibility.PRIVATE
				static = true
				final = true
				initializer = '''new «ResolvingNodeSet.simpleName»()'''
			]

			members += validator.toField("traverser$", typeRef(Traverser)) [
				visibility = JvmVisibility.PRIVATE
			]
			members += validator.toField("predicates$", typeRef(NodePredicates)) [
				visibility = JvmVisibility.PRIVATE
			]

			members += compileStartOnDefinition(validator.startOn)
			members += compileNodeDefinitions(validator.body.definitions)

			members += validator.toMethod("validate", typeRef("boolean")) [
				annotations += annotationRef(Override)
				visibility = JvmVisibility.PUBLIC
				parameters += validator.toParameter("node$", typeRef(ResolvingNode))
				body = '''
					«compileStartOn(validator.startOn)»
					«compileBody(validator.body)»
					return true;
				'''
			]

			members += compilePredicates(validator.predicates)
			members += compileXExpressionPredicates(validator)
			members += compileXExpressionAssignments(validator)
		]
	}

	def serialize(EObject object) {
		serializer.serialize(object).trim.replaceAll("\\n", "").replaceAll("\\r", "").replaceAll("\\s+", " ")
	}

	


	def compileStartOnDefinition(StartOnSentence startOn) {
		startOn.toField(
			startOn.definition.name,
			if(startOn.definition.collection) typeRef(ResolvingNodeSet) else typeRef(ResolvingNode)
		)
	}

	def compileNodeDefinitions(List<DefinitionSentence> sentences) {
		sentences.map [ s |
			s.toField(
				s.target.definition.name,
				if(s.target.definition.collection) typeRef(ResolvingNodeSet) else typeRef(ResolvingNode)
			)
		]
	}

	def compileStartOn(StartOnSentence startOn) '''
		// «serialize(startOn)»
		«startOn.definition.name» = node$;
		if («startOn.definition.name» == null || !predicates$.hasType(«startOn.definition.name», "«startOn.definition.selectors.selectors.selectors.join("\", \"", [Selector s | s.type])»")) {
			return true;
		}
	'''

	def compileBody(BodySentences body) '''		
		«FOR definition : body.definitions»
			«compileDefinition(definition)»
		«ENDFOR»
		«FOR constraint : body.constraints»
			«compileConstraint(constraint)»
		«ENDFOR»
	'''
	
	def compileDefinition(DefinitionSentence sentence) '''
		// «serialize(sentence)»
		«IF sentence.node != null»
			«singleNodeDefinition(sentence)»
		«ENDIF»
		«IF sentence.quantification != null»
			«quantifiedDefinition(sentence)»
		«ENDIF»
		
		«IF sentence.quantification == null»
		{
			boolean satisfied$«sentence.uniqueSuffix» = «qualifierSatisfiedStatement(sentence.target.definition, sentence.qualifier)»;
			if (!satisfied$«sentence.uniqueSuffix») return satisfied$«sentence.uniqueSuffix»;
		}
		
		«ENDIF»
	'''
	
	def compileConstraint(ConstraintSentence sentence) '''
		// «serialize(sentence)»
		{
			«IF sentence.quantifications != null»
				boolean satisfied$«sentence.uniqueSuffix» = «constraintDispatch(sentence.quantifications.quantifications, 0, sentence)»
				if (!satisfied$«sentence.uniqueSuffix») return false;
			«ENDIF»
		}
	'''

	def compilePredicates(List<PredicateDefinitionSentence> sentences) {
		sentences.map [ s |
			s.toMethod(s.name, typeRef("boolean")) [
				visibility = JvmVisibility.PRIVATE
				parameters += s.parameters?.parameters.map[p|p.toParameter(p.node.name, if(p.node.collection) typeRef(ResolvingNodeSet) else typeRef(ResolvingNode))]
				body = '''
				«FOR definition : s.body.definitions»
					«compileNodeDefinition(definition)»
				«ENDFOR»					
				
				«compileBody(s.body)»
				return true;'''
			]
		]
	}

	def compileNodeDefinition(DefinitionSentence definition) {
		val nodeType = if(definition.target.definition.collection) ResolvingNodeSet.simpleName else ResolvingNode.simpleName
		nodeType + " " + definition.target.definition.name + " = null$" + nodeType + ";"
	}

	def compileXExpressionPredicates(Validator validator) {
		validator.eAllContents.toSet.filter(PredicateXExpression).map [ e |
			e.toMethod("predicate$" + e.hashCode, typeRef("boolean")) [
				body = e.expression
			]
		]
	}

	def compileXExpressionAssignments(Validator validator) {
		validator.eAllContents.toSet.filter(AssignmentXExpression).map [ e |
			e.toMethod("assignment$" + e.hashCode, e.expression.inferredType) [
				body = e.expression
			]
		]
	}

	def constraintDispatch(
		List<Quantification> quantifications,
		int index,
		ConstraintSentence sentence
	) '''
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

	def constraintQuantorEach(
		List<Quantification> quantifications,
		int index,
		ConstraintSentence sentence
	) '''
		eval(() -> {
			for («ResolvingNode.simpleName» «quantifications.get(index).node.name» : «quantifications.get(index).nodeSet.name») {
				boolean satisfied$«quantifications.get(index).node.uniqueSuffix» = «constraintDispatch(quantifications, index + 1, sentence)»
				if (!satisfied$«quantifications.get(index).node.uniqueSuffix») return false;
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
			for («ResolvingNode.simpleName» «quantifications.get(index).node.name» : «quantifications.get(index).nodeSet.name») {
				boolean satisfied$«quantifications.get(index).node.uniqueSuffix» = «constraintDispatch(quantifications, index + 1, sentence)»
				if (satisfied$«quantifications.get(index).node.uniqueSuffix») return true;
			}
			return false;
		});
	'''

	def singleNodeDefinition(
		DefinitionSentence sentence
	) '''
		«nodeAssignmentStatement(sentence.target.definition, sentence.target.axis, sentence.node, sentence.target.definition.selectors, sentence.target.body)»
	'''

	def quantifiedDefinition(
		DefinitionSentence sentence
	) '''
		{
			boolean satisfied$«sentence.uniqueSuffix» = «initialQualifierSatisfaction(sentence.qualifier)»;
			for («ResolvingNode.simpleName» «sentence.quantification.node.name» : «sentence.quantification.nodeSet.name») {
				«nodeAssignmentStatement(sentence.getTarget.definition, sentence.getTarget.axis, sentence.quantification.node, sentence.target.definition.selectors, sentence.target.body)»
				satisfied$«sentence.uniqueSuffix» «quantorSatisfactionRelation(sentence.quantification.quantor)» «qualifierSatisfiedStatement(sentence.getTarget.definition, sentence.qualifier)»;
			}
			if (!satisfied$«sentence.uniqueSuffix») return satisfied$«sentence.uniqueSuffix»;
		}
	'''
	
	def nodeAssignmentStatement(NodeDefinition assignee, Axis axis, NodeDefinition source, SelectorList types, BodySentences body) '''
		«assignee.name» = traverser$.«axis.getName().toLowerCase»(«source.name», («ResolvingNode.simpleName» node$«assignee.uniqueSuffix») -> {
			boolean satisfied$«assignee.uniqueSuffix» = true;
			«IF types != null»
				satisfied$«assignee.uniqueSuffix» &= predicates$.hasType(node$«assignee.uniqueSuffix», "«types.selectors.selectors.join("\", \"", [Selector s | s.type])»");
			«ENDIF»
			satisfied$«assignee.uniqueSuffix» &= «compileBody(body)»
			return satisfied$«assignee.uniqueSuffix»;
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
			boolean satisfied$«and.uniqueSuffix» = true;
			«IF and.lhs != null»satisfied$«and.uniqueSuffix» &= «predicateExpression(and.lhs)»«ENDIF»
			satisfied$«and.uniqueSuffix» &= «predicateExpression(and.rhs)»
			return satisfied$«and.uniqueSuffix»;
		});
	'''

	def dispatch predicateExpression(OrExpression or) '''
		eval(() -> {
			boolean satisfied$«or.uniqueSuffix» = false;
			«IF or.lhs != null»satisfied$«or.uniqueSuffix» |= «predicateExpression(or.lhs)»«ENDIF»
			satisfied$«or.uniqueSuffix» |= «predicateExpression(or.rhs)»
			return satisfied$«or.uniqueSuffix»;
		});
	'''

	def dispatch predicateExpression(ImpliesExpression implies) '''
		eval(() -> {
			boolean satisfied$«implies.uniqueSuffix» = false;
			«IF implies.lhs != null»satisfied$«implies.uniqueSuffix» |= «predicateExpression(implies.lhs)»«ENDIF»
			satisfied$«implies.uniqueSuffix» |= !«predicateExpression(implies.rhs)»
			return satisfied$«implies.uniqueSuffix»;
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
			«compileNodeDefinition(definition.sentence)»
			«compileDefinition(definition.sentence)»
			return «qualifierSatisfiedStatement(defined, definition.sentence.qualifier)»;
		});
	'''

	def dispatch predicateCall(PredicateXExpression expression) '''
		predicate$«expression.hashCode»();
	'''

	def dispatch predicateCall(PredicateReference reference) '''
		«reference.reference.name»(«argumentList(reference.arguments)»);
	'''

	def argumentList(ArgumentList list) {
		if(list != null) list.arguments.join(", ", [Argument argument|argument.node.name])
	}
}


