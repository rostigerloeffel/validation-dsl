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

class DslJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject ISerializer serializer;
	@Inject extension NameProvider names = new NameProvider

	def dispatch void infer(Validator validator, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(validator.toClass("de.dbsystem.avb." + validator.eResource.URI.lastSegment.split("\\.").get(0))) [
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

			members += compileStartOnDefinitionField(validator.startOn)
			members += compileNodeDefinitionFields(validator.body.definitions)

			members += validator.toMethod("validate", typeRef("boolean")) [
				annotations += annotationRef(Override)
				visibility = JvmVisibility.PUBLIC
				parameters += validator.toParameter("node$", typeRef(ResolvingNode))
				body = '''
					«compileStartOn(validator.startOn)»
					«compileBody(validator.body, false)»
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

	


	def compileStartOnDefinitionField(StartOnSentence startOn) {
		startOn.toField(
			startOn.definition.uniqueName,
			if(startOn.definition.collection) typeRef(ResolvingNodeSet) else typeRef(ResolvingNode)
		)
	}

	def compileNodeDefinitionFields(List<DefinitionSentence> sentences) {
		sentences.map [ s |
			s.toField(
				s.target.definition.uniqueName,
				if(s.target.definition.collection) typeRef(ResolvingNodeSet) else typeRef(ResolvingNode)
			)
		]
	}

	def compileStartOn(StartOnSentence startOn) '''
		// «serialize(startOn)»
		«startOn.definition.uniqueName» = node$;
		if («startOn.definition.uniqueName» == null || !predicates$.hasType(«startOn.definition.uniqueName», "«startOn.definition.selectors.selectors.selectors.join("\", \"", [Selector s | s.type])»")) {
			return true;
		}
	'''

	def compileBody(BodySentences body, boolean withDeclarations) '''
		«IF body != null»
			«FOR definition : body?.definitions»
				«compileDefinition(definition, withDeclarations)»
			«ENDFOR»
			«FOR constraint : body?.constraints»
				«compileConstraint(constraint)»
			«ENDFOR»
		«ENDIF»
	'''
	
	def compileDefinition(DefinitionSentence sentence, boolean withDeclarations) '''
		// «serialize(sentence)»
		«IF withDeclarations»
			«declareNode(sentence.target.definition)»
		«ENDIF»
		«IF sentence.node != null»
			«singleNodeDefinition(sentence)»
			{
				boolean satisfied$«sentence.uniqueSuffix» = «qualifierSatisfiedStatement(sentence.target.definition, sentence.qualifier)»;
				if (!satisfied$«sentence.uniqueSuffix») return satisfied$«sentence.uniqueSuffix»;
			}
		«ENDIF»
		«IF sentence.quantification != null»
			«quantifiedDefinition(sentence)»
		«ENDIF»
	'''
	
	def compileConstraint(ConstraintSentence sentence) '''
		// «serialize(sentence)»
		{
«««			TODO: Fix this
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
				parameters += s.parameters?.parameters?.map[p|p.toParameter(p.node.uniqueName, if(p.node.collection) typeRef(ResolvingNodeSet) else typeRef(ResolvingNode))]
				body = '''
				«compileBody(s.body, true)»
				return true;'''
			]
		]
	}

	def declareNode(NodeDefinition definition) {
		val nodeType = if(definition.collection) ResolvingNodeSet.simpleName else ResolvingNode.simpleName
		nodeType + " " + definition.uniqueName + " = null$" + nodeType + ";"
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
			for («ResolvingNode.simpleName» «quantifications.get(index).node.uniqueName» : «quantifications.get(index).nodeSet.uniqueName») {
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
			for («ResolvingNode.simpleName» «quantifications.get(index).node.uniqueName» : «quantifications.get(index).nodeSet.uniqueName») {
				boolean satisfied$«quantifications.get(index).node.uniqueSuffix» = «constraintDispatch(quantifications, index + 1, sentence)»
				if (satisfied$«quantifications.get(index).node.uniqueSuffix») return true;
			}
			return false;
		});
	'''





	def singleNodeDefinition(
		DefinitionSentence sentence
	) '''
		«nodeAssignmentStatement(sentence.target.definition, sentence.target.local, sentence.target.axis, sentence.node, sentence.target.definition.selectors, sentence.target.body)»
	'''

	def quantifiedDefinition(
		DefinitionSentence sentence
	) '''
		{
			boolean satisfied$«sentence.uniqueSuffix» = «initialQualifierSatisfaction(sentence.qualifier)»;
			for («ResolvingNode.simpleName» «sentence.quantification.node.uniqueName» : «sentence.quantification.nodeSet.uniqueName») {
				«nodeAssignmentStatement(sentence.target.definition, sentence.target.local, sentence.target.axis, sentence.quantification.node, sentence.target.definition.selectors, sentence.target.body)»
				satisfied$«sentence.uniqueSuffix» «quantorSatisfactionRelation(sentence.quantification.quantor)» «qualifierSatisfiedStatement(sentence.getTarget.definition, sentence.qualifier)»;
			}
			if (!satisfied$«sentence.uniqueSuffix») return satisfied$«sentence.uniqueSuffix»;
		}
	'''
		
	def nodeAssignmentStatement(NodeDefinition assignee, NodeDefinition local, Axis axis, NodeDefinition source, SelectorList types, BodySentences body) '''
		«val localName = if (local != null) local.uniqueName else "node$" + assignee.uniqueSuffix»
		«assignee.uniqueName» = traverser$.«axis.getName().toLowerCase»(«source.uniqueName», («ResolvingNode.simpleName» «localName») -> {		
			«names.map(assignee, localName)»
			boolean satisfied$«assignee.uniqueSuffix» = true;
			«IF types != null»
				satisfied$«assignee.uniqueSuffix» &= predicates$.hasType(«localName», "«types.selectors.selectors.join("\", \"", [Selector s | s.type])»");
			«ENDIF»
			«IF body != null»
				satisfied$«assignee.uniqueSuffix» &= eval(() -> {
					«compileBody(body, true)»
					return true;
				});
			«ENDIF»
			return satisfied$«assignee.uniqueSuffix»;
			«names.unmap(assignee)»
		});
	'''
	
	def qualifierSatisfiedStatement(NodeDefinition node, RelationQualifier qualifier) {
		switch (qualifier) {
			case CAN: return "true"
			case MUST: return node.uniqueName + ".hasCandidates()"
			case MUST_NOT: return "!" + node.uniqueName + ".hasCandidates()"
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
		expression.node.uniqueName + ".getProperty(" + "\"" + expression.property + "\"" + ")"
	}

	def dispatch predicateCall(DefinitionSentencePredicate definition) '''
		eval(() -> {
			«val sentence = definition.sentence»
			«compileDefinition(sentence, true)»
			return «qualifierSatisfiedStatement(sentence.target.definition, sentence.qualifier)»;
		});
	'''

	def dispatch predicateCall(PredicateXExpression expression) '''
		predicate$«expression.hashCode»();
	'''

	def dispatch predicateCall(PredicateReference reference) '''
		«reference.reference.name»(«argumentList(reference.arguments)»);
	'''

	def argumentList(ArgumentList list) {
		if(list != null) list.arguments.join(", ", [Argument argument|argument.node.uniqueName])
	}
}


