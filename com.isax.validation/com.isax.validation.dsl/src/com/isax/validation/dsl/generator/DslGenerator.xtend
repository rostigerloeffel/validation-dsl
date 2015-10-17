/*
 * generated by Xtext
 */
package com.isax.validation.dsl.generator

import com.google.inject.Inject
import com.isax.validation.dsl.dsl.AndExpression
import com.isax.validation.dsl.dsl.Argument
import com.isax.validation.dsl.dsl.ArgumentList
import com.isax.validation.dsl.dsl.Axis
import com.isax.validation.dsl.dsl.ConstraintSentence
import com.isax.validation.dsl.dsl.DefinitionSentence
import com.isax.validation.dsl.dsl.DefinitionSentencePredicate
import com.isax.validation.dsl.dsl.ImpliesExpression
import com.isax.validation.dsl.dsl.NodeDefinition
import com.isax.validation.dsl.dsl.OrExpression
import com.isax.validation.dsl.dsl.Parameter
import com.isax.validation.dsl.dsl.ParameterList
import com.isax.validation.dsl.dsl.PredicateDefinitionSentence
import com.isax.validation.dsl.dsl.PredicateExpression
import com.isax.validation.dsl.dsl.PredicateReference
import com.isax.validation.dsl.dsl.PropertyRelationPredicate
import com.isax.validation.dsl.dsl.Quantor
import com.isax.validation.dsl.dsl.RelationQualifier
import com.isax.validation.dsl.dsl.Selector
import com.isax.validation.dsl.dsl.SelectorList
import com.isax.validation.dsl.dsl.StartOnSentence
import com.isax.validation.dsl.dsl.Validator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.serializer.ISerializer

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class DslGenerator implements IGenerator {

	@Inject ISerializer serializer;

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val validatorName = resource.URI.segmentsList.last.split('\\.').head
		fsa.generateFile(validatorName + '.java', generateValidator(validatorName, resource.contents.head as Validator))
	}

	def generateValidator(
		String validatorName,
		Validator validator
	) '''
		class «validatorName» {
			@FunctionalInterface
			private interface Predicate {
				boolean test();
			}
			
			private boolean eval(Predicate predicate) {
				return predicate.test();
			}
			
			public boolean validate(Node node) {
				«FOR sentence : validator.sentences»
					«IF sentence instanceof StartOnSentence»
						«sentenceStatements(sentence)»
						
					«ENDIF»
				«ENDFOR»
				
				«FOR sentence : validator.sentences»
					«IF sentence instanceof DefinitionSentence»
						«sentenceStatements(sentence)»
						{
							boolean satisfied = «qualifierSatisfiedStatement(sentence.target.definition, sentence.qualifier)»;
							if (!satisfied) return satisfied;
						}
						
					«ENDIF»
				«ENDFOR»
			}
			
			«FOR sentence : validator.sentences»
				«IF sentence instanceof PredicateDefinitionSentence»
					«sentenceStatements(sentence)»
					
				«ENDIF»
			«ENDFOR»
		}
	'''

	def dispatch sentenceStatements(
		StartOnSentence sentence
	) '''
		// «serializer.serialize(sentence).trim.replaceAll("\\n", "").replaceAll("\\r", "")»
		Node «sentence.definition.name» = node;
		if («sentence.definition.name» == null || !hasType(«sentence.definition.name», «selectorExpression(sentence.definition.selectors)»)) {
			return true;
		}
	'''

	def dispatch sentenceStatements(
		DefinitionSentence sentence
	) '''
		// «serializer.serialize(sentence).trim.replaceAll("\\n", "").replaceAll("\\r", "")»
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
		// «serializer.serialize(sentence).trim.replaceAll("\\n", "").replaceAll("\\r", "")»
	'''

	def dispatch sentenceStatements(
		PredicateDefinitionSentence sentence
	) '''
		// «serializer.serialize(sentence).trim.replaceAll("\\n", "").replaceAll("\\r", "")»
		private boolean «sentence.name»(«parameterList(sentence.parameters)») {
			return true;
		}
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
			boolean satisfied = «initialQualifierSatisfaction(sentence.qualifier)»;
			for («sentence.quantification.node.name» : «sentence.quantification.nodeSet.name») {
				«nodeAssignmentStatement(sentence.getTarget.definition, sentence.getTarget.axis, sentence.quantification.node, sentence.target.definition.selectors, sentence.target.predicate)»
				satisfied «quantorSatisfactionRelation(sentence.quantification.quantor)» «qualifierSatisfiedAssignment(sentence.getTarget.definition, sentence.qualifier)»;
			}
			if (!satisfied) return satisfied;
		}
	'''

	def evaluationStatement(DefinitionSentence sentence) '''
		«IF sentence.node != null»
			«singleNodeDefinition(sentence)»
		«ENDIF»
		«IF sentence.quantification != null»
			«quantifiedDefinition(sentence)»
		«ENDIF»
	'''

	def nodeAssignmentStatement(NodeDefinition assignee, Axis axis, NodeDefinition source, SelectorList types,
		PredicateExpression predicate) '''
		«nodeDeclarationStatement(assignee)» = «axis.getName().toLowerCase»(«source.name», «selectorExpression(types)», (Node node) -> {
			«IF predicate == null»
				return true;
			«ELSE»
				return eval(() -> { 
					«predicateExpression(predicate)»
				}
			«ENDIF»
		});
	'''

	def nodeDeclarationStatement(NodeDefinition assignee) {
		if (assignee.collection) {
			return "NodeSet " + assignee.name;
		} else {
			return "Node " + assignee.name;
		}
	}

	def qualifierSatisfiedAssignment(NodeDefinition node, RelationQualifier qualifier) {
		if (node.collection) {
			switch (qualifier) {
				case CAN: return "true"
				case MUST: return ".isEmpty()"
				case MUST_NOT: return ".isEmpty()"
			}
		} else {
			switch (qualifier) {
				case CAN: return "true"
				case MUST: return " != null"
				case MUST_NOT: return " == null"
			}
		}
	}

	def qualifierSatisfiedStatement(NodeDefinition node, RelationQualifier qualifier) {
		if (node.collection) {
			switch (qualifier) {
				case CAN: return qualifierSatisfiedAssignment(node, qualifier)
				case MUST: return "!" + node.name + qualifierSatisfiedAssignment(node, qualifier)
				case MUST_NOT: return node.name + qualifierSatisfiedAssignment(node, qualifier)
			}
		} else {
			switch (qualifier) {
				case CAN: return qualifierSatisfiedAssignment(node, qualifier)
				case MUST: return node.name + qualifierSatisfiedAssignment(node, qualifier)
				case MUST_NOT: return node.name + qualifierSatisfiedAssignment(node, qualifier)
			}
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

	def selectorExpression(SelectorList list) {
		if (list != null && list.selectors != null) {
			return list.selectors.selectors.join('_', [Selector s|s.type.toUpperCase()]) + '_TYPES'
		} else {
			return ""
		}
	}

//	def dispatch predicateExpression(PredicateExpression expression) {
//		if (expression.negated) "!" else "" +
//			switch (expression) {
//				AndExpression: andExpression(expression as AndExpression)
//				OrExpression: orExpression(expression as OrExpression)
//				ImpliesExpression: impliesExpression(expression as ImpliesExpression)
//				case expression.call != null: predicateCall(expression.call)
//				case expression.inner != null: predicateExpression(expression.inner)
//				case expression.lhs != null: predicateExpression(expression.lhs)
//			}
//	}



	def dispatch predicateExpression(PredicateExpression expression) {
		if (expression.call != null) return predicateCall(expression.call)
		if (expression.lhs != null) return predicateExpression(expression.lhs)
		if (expression.rhs != null) return predicateExpression(expression.rhs)
	}
	
	def dispatch predicateExpression(AndExpression and) '''
		«andExpression(and)»
	'''
	
	def dispatch predicateExpression(OrExpression or) '''
		«orExpression(or)»
	'''

//	def predicateExpressionEval(PredicateExpression expression) '''
//	'''

	def dispatch predicateExpression(ImpliesExpression implies) {
	}

	def dispatch predicateExpression(PropertyRelationPredicate predicate) '''
		PredicateUtil.«predicate.relation.getName().toFirstLower»(«predicate.lhs», «predicate.rhs»);
	'''

	def dispatch predicateExpression(DefinitionSentencePredicate predicate) '''
		«sentenceStatements(predicate.sentence)»
	'''

	def dispatch predicateExpression(PredicateReference reference) '''
		«reference.reference.name»(«argumentList(reference.arguments)»);
	'''
	
	def andExpression(AndExpression and) '''
		eval(() -> {
			boolean satisfied = true;			
			«IF and.lhs != null»satisfied &= «predicateExpression(and.lhs)»«ENDIF»		
			satisfied &= «predicateExpression(and.rhs)»
			return satisfied;
		});
	'''
	
	def orExpression(OrExpression or) '''
		eval(() -> {
			boolean satisfied = false;			
			«IF or.lhs != null»satisfied |= «predicateExpression(or.lhs)»«ENDIF»		
			satisfied |= «predicateExpression(or.rhs)»
			return satisfied;
		});
	'''
	
	def impliesExpression(ImpliesExpression implies) '''
		eval(() -> {
			boolean satisfied = false;			
			«IF implies.lhs != null»satisfied |= «predicateExpression(implies.lhs)»«ENDIF»		
			satisfied |= !«predicateExpression(implies.rhs)»
			return satisfied;
		});
	'''


	def dispatch predicateCall(PropertyRelationPredicate relation) '''
	'''

	def dispatch predicateCall(DefinitionSentencePredicate definition) '''
		eval(() -> {
			«sentenceStatements(definition.sentence)»
			return «qualifierSatisfiedStatement(definition.sentence.target.definition, definition.sentence.qualifier)»
		});
	'''

//	def dispatch predicateCall(DefinitionSentencePredicate definition) '''
//		«qualifierSatisfiedStatement(definition.sentence.target.definition, definition.sentence.qualifier)»;
//	'''

	def dispatch predicateCall(PredicateReference reference) '''
	'''

	def argumentList(ArgumentList list) {
		if(list != null) list.arguments.join(", ", [Argument argument|argument.node.name])
	}

	def parameterList(ParameterList list) {
		if (list != null)
			list.parameters.join(", ", [ Parameter parameter |
				if(parameter.node.isCollection) "Collection<Node>" else "Node" + " " + parameter.node.name
			])
	}
}
