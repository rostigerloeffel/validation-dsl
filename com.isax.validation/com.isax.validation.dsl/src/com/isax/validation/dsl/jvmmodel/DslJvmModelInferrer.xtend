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
import com.isax.validation.dsl.dsl.Axis
import com.isax.validation.dsl.dsl.BodySentences
import com.isax.validation.dsl.dsl.ConstraintSentence
import com.isax.validation.dsl.dsl.DefinitionSentence
import com.isax.validation.dsl.dsl.DefinitionSentencePredicate
import com.isax.validation.dsl.dsl.ImpliesExpression
import com.isax.validation.dsl.dsl.NodeDefinition
import com.isax.validation.dsl.dsl.NodeReferenceList
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
import com.isax.validation.dsl.dsl.TargetDefinition
import com.isax.validation.dsl.dsl.Validator
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

import static extension com.isax.validation.dsl.util.DslUtil.path
import static extension com.isax.validation.dsl.util.DslUtil.visibleDefinitions

class DslJvmModelInferrer extends AbstractModelInferrer {

	private final static val TRAVERSER_FIELD = "traverser$" 
	private final static val PREDICATES_FIELD = "predicates$" 
	private final static val ASSIGNMENT_CLASS = "Assignment$"
	private final static val ASSIGMENT_METHOD = "method"
	private final static val PREDICATE_METHOD = "predicate$"
	private final static val SATISFIED = "satisfied$"
	private final static val INPUT_NODE = "node$"

	@Inject extension JvmTypesBuilder
	@Inject ISerializer serializer;
	@Inject extension NameProvider names = new NameProvider

	def dispatch void infer(Validator validator, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(validator.toClass("de.dbsystem.avb." + validator.eResource.URI.lastSegment.split("\\.").get(0))) [
			superTypes += typeRef(AbstractValidator)

			members += validator.toField(TRAVERSER_FIELD, typeRef(Traverser)) [
				visibility = JvmVisibility.PRIVATE
			]
			members += validator.toField(PREDICATES_FIELD, typeRef(NodePredicates)) [
				visibility = JvmVisibility.PRIVATE
			]

			members += validator.toMethod("validate", typeRef(boolean)) [
				annotations += annotationRef(Override)
				visibility = JvmVisibility.PUBLIC
				parameters += validator.toParameter(INPUT_NODE, typeRef(ResolvingNode))
				body = '''
					«compileStartOn(validator.startOn)»
					«compileBody(validator.body, false)»
					return true;
				'''
			]

			members += compilePredicates(validator.predicates)
			members += compileXExpressionPredicates(validator)
			members += compileThenClauses(validator)
		]
	}

	def serialize(EObject object) {
		//serializer.serialize(object).trim.replaceAll("\\n", "").replaceAll("\\r", "").replaceAll("\\s+", " ")
	}

	def compileStartOn(
		StartOnSentence startOn
	) '''
		// «serialize(startOn)»
		final «ResolvingNode.simpleName» «startOn.definition.uniqueName» = «INPUT_NODE»;
		if («startOn.definition.uniqueName» == null || !«PREDICATES_FIELD».hasType(«startOn.definition.uniqueName», "«startOn.definition.selectors.selectors.selectors.join("\", \"", [Selector s | s.type])»")) {
			return true;
		}
	'''

	def CharSequence compileBody(BodySentences body, boolean withDeclarations) '''
		«IF body != null»
			«FOR definition : body?.definitions»
				«compileDefinition(definition)»
			«ENDFOR»
			«FOR constraint : body?.constraints»
				«compileConstraint(constraint)»
			«ENDFOR»
		«ENDIF»
	'''

	def compileDefinition(DefinitionSentence sentence) '''
		// «serialize(sentence)»
		«IF sentence.node != null»
			«singleNodeDefinition(sentence)»
			{
				boolean «SATISFIED»«sentence.uniqueSuffix» = «qualifierSatisfiedStatement(sentence.target.definition, sentence.qualifier)»;
				if (!«SATISFIED»«sentence.uniqueSuffix») return «SATISFIED»«sentence.uniqueSuffix»;
			}
		«ENDIF»
		«IF sentence.quantification != null»
			«quantifiedDefinition(sentence)»
		«ENDIF»
	'''

	def compileConstraint(ConstraintSentence sentence) '''
		// «serialize(sentence)»
		{
			«val suffix = sentence.path»
			«IF sentence?.nodes?.nodes != null»
				«FOR NodeDefinition node : sentence.nodes?.nodes»
					final «ResolvingNode.simpleName» «node.name + '$' + suffix» = «node.uniqueName»;
				«ENDFOR»
			«ENDIF»
			«sentence.nodes?.map(suffix)»
			boolean «SATISFIED»«sentence.uniqueSuffix» = «constraintDispatch(sentence.quantifications?.quantifications, 0, sentence)»
			if (!«SATISFIED»«sentence.uniqueSuffix») return false;
			«sentence.nodes?.unmap»
		}
	'''

	def compilePredicates(List<PredicateDefinitionSentence> sentences) {
		sentences.map [ s |
			s.toMethod(s.name, typeRef(boolean)) [
				visibility = JvmVisibility.PRIVATE
				parameters += s.parameters?.parameters?.map[p|p.toParameter(p.node.uniqueName, definitionTypeRef(p.node))]
				body = '''
				«compileBody(s.body, true)»
				return true;'''
			]
		]
	}

	def compileXExpressionPredicates(Validator validator) {
		validator.eAllContents.toSet.filter(PredicateXExpression).map [ e |
			e.toMethod(PREDICATE_METHOD + e.hashCode, typeRef(boolean)) [
				body = e.expression
			]
		]
	}

	def compileThenClauses(Validator validator) {
		validator.eAllContents.toSet
			.filter(TargetDefinition).map[d | d.then]
			.filterNull.map [ e | e.toClass(DslJvmModelInferrer.ASSIGNMENT_CLASS + e.hashCode) [
				static = true
				visibility = JvmVisibility.PRIVATE
				members += e.toMethod(ASSIGMENT_METHOD, e.inferredType) [
					static = true
					visibility = JvmVisibility.PRIVATE
					val scope = e.visibleDefinitions[true]
					parameters += scope
						.allElements
						.map[d|d.EObjectOrProxy]
						.filter(NodeDefinition)
						.map[d|d.toParameter(d.name, definitionTypeRef(d))]
					body = e
				]
			]
		]
	}

	def CharSequence constraintDispatch(
		List<Quantification> quantifications,
		int index,
		ConstraintSentence sentence
	) '''
		«IF quantifications != null && index < quantifications.size»
			«IF quantifications.get(index).quantor == Quantor.EACH»
				«constraintQuantorEach(quantifications, index, sentence)»
			«ELSEIF quantifications.get(index).quantor == Quantor.ANY»
				«constraintQuantorAny(quantifications, index, sentence)»
			«ENDIF»
		«ELSE»
			«predicateExpression(sentence.predicate)»
		«ENDIF»
	'''
	
	def map(NodeReferenceList nodes, String suffix) {
		for (NodeDefinition definition : nodes.nodes) {
			definition.map(definition.name + '$' + suffix)
		}
	}
	
	def unmap(NodeReferenceList nodes) {
		for (NodeDefinition definition : nodes.nodes) {
			definition.unmap
		}
	}
	

	def constraintQuantorEach(
		List<Quantification> quantifications,
		int index,
		ConstraintSentence sentence
	) '''
		eval(() -> {
			for («ResolvingNode.simpleName» «quantifications.get(index).node.uniqueName» : «quantifications.get(index).nodeSet.uniqueName») {
				boolean «SATISFIED»«quantifications.get(index).node.uniqueSuffix» = «constraintDispatch(quantifications, index + 1, sentence)»
				if (!«SATISFIED»«quantifications.get(index).node.uniqueSuffix») return false;
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
				boolean «SATISFIED»«quantifications.get(index).node.uniqueSuffix» = «constraintDispatch(quantifications, index + 1, sentence)»
				if («SATISFIED»«quantifications.get(index).node.uniqueSuffix») return true;
			}
			return false;
		});
	'''

	def singleNodeDefinition(
		DefinitionSentence sentence
	) '''
		«val target = sentence.target»
		final «definitionTypeRef(target.definition).simpleName» «target.definition.uniqueName» = «nodeAssignmentStatement(target.definition, target.local, target.axis, sentence.node, target.definition.selectors, target.body)»
	'''

	def quantifiedDefinition(
		DefinitionSentence sentence
	) '''
		{
			boolean «SATISFIED»«sentence.uniqueSuffix» = «initialQualifierSatisfaction(sentence.qualifier)»;
			for («ResolvingNode.simpleName» «sentence.quantification.node.uniqueName» : «sentence.quantification.nodeSet.uniqueName») {
				«val target = sentence.target»
				final «definitionTypeRef(target.definition).simpleName» «target.definition.uniqueName» = «nodeAssignmentStatement(sentence.target.definition, sentence.target.local, sentence.target.axis, sentence.quantification.node, sentence.target.definition.selectors, sentence.target.body)»
				«SATISFIED»«sentence.uniqueSuffix» «quantorSatisfactionRelation(sentence.quantification.quantor)» «qualifierSatisfiedStatement(sentence.getTarget.definition, sentence.qualifier)»;
			}
			if (!«SATISFIED»«sentence.uniqueSuffix») return «SATISFIED»«sentence.uniqueSuffix»;
		}
	'''

	def nodeAssignmentStatement(NodeDefinition assignee, NodeDefinition local, Axis axis, NodeDefinition source, SelectorList types, BodySentences body) '''
		«val localName = if (local != null) local.uniqueName else INPUT_NODE + assignee.uniqueSuffix»
		«TRAVERSER_FIELD».«axis.getName().toLowerCase»(«source.uniqueName», («ResolvingNode.simpleName» «localName») -> {		
			«names.map(assignee, localName)»
			boolean «SATISFIED»«assignee.uniqueSuffix» = true;
			«IF types != null»
				«SATISFIED»«assignee.uniqueSuffix» &= «PREDICATES_FIELD».hasType(«localName», "«types.selectors.selectors.join("\", \"", [Selector s | s.type])»");
			«ENDIF»
			«IF body != null»
				«SATISFIED»«assignee.uniqueSuffix» &= eval(() -> {
					«compileBody(body, true)»
					return true;
				});
			«ENDIF»
			return «SATISFIED»«assignee.uniqueSuffix»;
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

	def dispatch CharSequence predicateExpression(PredicateExpression expression) {
		if(expression.inner != null) return predicateExpression(expression.inner)
		if(expression.lhs != null) return predicateExpression(expression.lhs)
		if(expression.rhs != null) return predicateExpression(expression.rhs)
		if(expression.call != null) return predicateCall(expression.call)
	}

	def dispatch CharSequence predicateExpression(AndExpression and) '''
		eval(() -> {
			boolean «SATISFIED»«and.uniqueSuffix» = true;
			«IF and.lhs != null»«SATISFIED»«and.uniqueSuffix» &= «predicateExpression(and.lhs)»«ENDIF»
			«SATISFIED»«and.uniqueSuffix» &= «predicateExpression(and.rhs)»
			return «SATISFIED»«and.uniqueSuffix»;
		});
	'''

	def dispatch CharSequence predicateExpression(OrExpression or) '''
		eval(() -> {
			boolean «SATISFIED»«or.uniqueSuffix» = false;
			«IF or.lhs != null»«SATISFIED»«or.uniqueSuffix» |= «predicateExpression(or.lhs)»«ENDIF»
			«SATISFIED»«or.uniqueSuffix» |= «predicateExpression(or.rhs)»
			return «SATISFIED»«or.uniqueSuffix»;
		});
	'''

	def dispatch CharSequence predicateExpression(ImpliesExpression implies) '''
		eval(() -> {
			boolean «SATISFIED»«implies.uniqueSuffix» = false;
			«IF implies.lhs != null»«SATISFIED»«implies.uniqueSuffix» |= «predicateExpression(implies.lhs)»«ENDIF»
			«SATISFIED»«implies.uniqueSuffix» |= !«predicateExpression(implies.rhs)»
			return «SATISFIED»«implies.uniqueSuffix»;
		});
	'''

	def dispatch predicateExpression(PredicateReference reference) '''
		«reference.reference.name»(«argumentList(reference.arguments)»);
	'''

	def dispatch propertyExpression(PropertyValueExpression expression) '''
		«expression.value»
	'''

	def dispatch propertyExpression(PropertyReferenceExpression expression) '''
		«expression.node.uniqueName».getProperty("«expression.property»")
	'''

	def dispatch predicateCall(PropertyRelationPredicate relation) '''
		«PREDICATES_FIELD».«relation.relation.getName().toFirstLower»(«propertyExpression(relation.lhs)», «propertyExpression(relation.rhs)»);
	'''

	def dispatch predicateCall(DefinitionSentencePredicate definition) '''
		eval(() -> {
			«val sentence = definition.sentence»
			«compileDefinition(sentence)»
			return «qualifierSatisfiedStatement(sentence.target.definition, sentence.qualifier)»;
		});
	'''

	def dispatch predicateCall(PredicateXExpression expression) '''
		«PREDICATE_METHOD»«expression.hashCode»();
	'''

	def dispatch predicateCall(PredicateReference reference) '''
		«reference.reference.name»(«argumentList(reference.arguments)»);
	'''

	def argumentList(ArgumentList list) {
		if(list != null) list.arguments.join(", ", [Argument argument|argument.node.uniqueName])
	}

	def definitionTypeRef(NodeDefinition definition) {
		if(definition.collection) typeRef(ResolvingNodeSet) else typeRef(ResolvingNode)
	}
}


