package com.isax.validation.dsl.jvmmodel

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
import com.isax.validation.dsl.dsl.PropertyReferenceExpression
import com.isax.validation.dsl.dsl.PropertyRelation
import com.isax.validation.dsl.dsl.PropertyRelationPredicate
import com.isax.validation.dsl.dsl.PropertyValueExpression
import com.isax.validation.dsl.dsl.Quantification
import com.isax.validation.dsl.dsl.Quantor
import com.isax.validation.dsl.dsl.RelationQualifier
import com.isax.validation.dsl.dsl.Selector
import com.isax.validation.dsl.dsl.SelectorList
import com.isax.validation.dsl.dsl.StartOnSentence
import com.isax.validation.dsl.dsl.Validator
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class DslJvmModelInferrer extends AbstractModelInferrer {

    /**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder
	@Inject ISerializer serializer;

	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the closure you pass to the returned
	 *            {@link IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
	 *            initializeLater(..)}.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
   	def dispatch void infer(Validator validator, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(validator.toClass("de.dbsystem.avb.Test")) [
			val predicateDecl = validator.toInterface("Predicate") [
				visibility = JvmVisibility.PRIVATE
				members += validator.toMethod("test", typeRef("boolean")) [
					abstract = true
				]
			]
			predicateDecl.annotations += annotationRef(typeof(FunctionalInterface))
			members += predicateDecl
			
			members += validator.toMethod("eval", typeRef("boolean")) [
				visibility = JvmVisibility.PRIVATE
				parameters += validator.toParameter("predicate", typeRef("Predicate"))
				body = '''return predicate.test();'''
			]
			
			members += validator.toMethod("validate", typeRef("boolean")) [
				visibility = JvmVisibility.PUBLIC
				parameters += validator.toParameter("node", typeRef("Node"))
				body = '''«compileBody(validator)»'''
			]
			
			members += compilePredicates(validator)
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
					boolean satisfied = «qualifierSatisfiedStatement(sentence.target.definition, sentence.qualifier)»;
					if (!satisfied) return satisfied;
				}
				
				«ENDIF»
			«ENDIF»
		«ENDFOR»

		«FOR sentence : validator.sentences»
			«IF sentence instanceof ConstraintSentence»
				«sentenceStatements(sentence)»
				
			«ENDIF»
		«ENDFOR»
		
«««		«FOR sentence : validator.sentences»
«««			«IF sentence instanceof PredicateDefinitionSentence»
«««				«sentenceStatements(sentence)»
«««				
«««			«ENDIF»
«««		«ENDFOR»
	'''
	
	def compilePredicates(Validator validator) {
		val compiledPredicates = new ArrayList<JvmMember>()
		for (sentence : validator.sentences) {
			if (sentence instanceof PredicateDefinitionSentence) {
				val predicate = sentence as PredicateDefinitionSentence
				compiledPredicates += validator.toMethod(predicate.name, typeRef("boolean")) []
			}	
		}		
		compiledPredicates
	}
	

	def dispatch sentenceStatements(
		StartOnSentence sentence
	) '''
		// «serialize(sentence)»
		Node «sentence.definition.name» = node;
		if («sentence.definition.name» == null || !hasType(«sentence.definition.name», «selectorExpression(sentence.definition.selectors)»)) {
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
				boolean satisfied = «constraintDispatch(sentence.quantifications.quantifications, 0, sentence)»
				if (!satisfied) return false;
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
	
	
	def constraintQuantorEach(List<Quantification> quantifications, int index, ConstraintSentence sentence) '''
		eval(() -> {
			for (Node «quantifications.get(index).node.name» : «quantifications.get(index).nodeSet.name») {
				boolean satisfied = «constraintDispatch(quantifications, index + 1, sentence)»
				if (!satisfied) return false;
			}
			return true;
		});
	'''
	
	def constraintQuantorAny(List<Quantification> quantifications, int index, ConstraintSentence sentence) '''
		eval(() -> {
			for (Node «quantifications.get(index).node.name» : «quantifications.get(index).nodeSet.name») {
				boolean satisfied = «constraintDispatch(quantifications, index + 1, sentence)»
				if (satisfied) return true;
			}
			return false;
		});
	'''

	def dispatch sentenceStatements(
		PredicateDefinitionSentence sentence
	) '''
		// «serialize(sentence)»
		private boolean «sentence.name»(«parameterList(sentence.parameters)») {
			return «predicateExpression(sentence.predicate)»
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
			for (Node «sentence.quantification.node.name» : «sentence.quantification.nodeSet.name») {
				«nodeAssignmentStatement(sentence.getTarget.definition, sentence.getTarget.axis, sentence.quantification.node, sentence.target.definition.selectors, sentence.target.predicate)»
				satisfied «quantorSatisfactionRelation(sentence.quantification.quantor)» «qualifierSatisfiedStatement(sentence.getTarget.definition, sentence.qualifier)»;
			}
			if (!satisfied) return satisfied;
		}
	'''

	def nodeAssignmentStatement(NodeDefinition assignee, Axis axis, NodeDefinition source, SelectorList types,
		PredicateExpression predicate) '''
		«nodeDeclarationStatement(assignee)» = «axis.getName().toLowerCase»(«source.name», «selectorExpression(types)», (Node node) -> {
			«IF predicate == null»
				return true;
			«ELSE»
				return «predicateExpression(predicate)»
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


	def dispatch predicateExpression(PredicateExpression expression) {
		if (expression.inner != null) return predicateExpression(expression.inner)		
		if (expression.lhs != null) return predicateExpression(expression.lhs)
		if (expression.rhs != null) return predicateExpression(expression.rhs)
		if (expression.call != null) return predicateCall(expression.call)
	}
	
	def dispatch predicateExpression(AndExpression and) '''
		eval(() -> {
			boolean satisfied = true;			
			«IF and.lhs != null»satisfied &= «predicateExpression(and.lhs)»«ENDIF»		
			satisfied &= «predicateExpression(and.rhs)»
			return satisfied;
		});
	'''
	
	def dispatch predicateExpression(OrExpression or) '''
		eval(() -> {
			boolean satisfied = false;			
			«IF or.lhs != null»satisfied |= «predicateExpression(or.lhs)»«ENDIF»		
			satisfied |= «predicateExpression(or.rhs)»
			return satisfied;
		});
	'''

	def dispatch predicateExpression(ImpliesExpression implies) '''
		eval(() -> {
			boolean satisfied = false;			
			«IF implies.lhs != null»satisfied |= «predicateExpression(implies.lhs)»«ENDIF»		
			satisfied |= !«predicateExpression(implies.rhs)»
			return satisfied;
		});
	'''

	def dispatch predicateExpression(DefinitionSentencePredicate predicate) '''
		«sentenceStatements(predicate.sentence)»
	'''

	def dispatch predicateExpression(PredicateReference reference) '''
		«reference.reference.name»(«argumentList(reference.arguments)»);
	'''

	def dispatch predicateCall(PropertyRelationPredicate relation) '''
		compare(«propertyExpression(relation.lhs)», «propertyRelation(relation.relation)», «propertyExpression(relation.rhs)»);
	'''

	def dispatch propertyExpression(PropertyValueExpression expression) {
		expression.value
	}

	def dispatch propertyExpression(PropertyReferenceExpression expression) {
		"property(" + expression.node.name + ", " + expression.property + ")"
	}
	
	def propertyRelation(PropertyRelation relation) {
		switch (relation) {
			case EQUALS: "EQUALS"
			case GREATER: "GREATER"
			case GREATER_EQUALS: "GREATER_EQUALS"
			case LESSER: "LESSER"
			case LESSER_EQUALS: "LESSER_EQUALS"
			case NOT_EQUALS: "NOT_EQUALS"
		}
	}

	def dispatch predicateCall(DefinitionSentencePredicate definition) '''
		eval(() -> {
			«sentenceStatements(definition.sentence)»
			return «qualifierSatisfiedStatement(definition.sentence.target.definition, definition.sentence.qualifier)»;
		});
	'''
	
	def dispatch predicateCall(PredicateReference reference) '''
		«reference.reference.name»(«argumentList(reference.arguments)»);
	'''

	def argumentList(ArgumentList list) {
		if (list != null) list.arguments.join(", ", [Argument argument|argument.node.name])
	}

	def parameterList(ParameterList list) {
		if (list != null)
			list.parameters.join(", ", [ Parameter parameter |
				(if (parameter.node.isCollection) "NodeSet" else "Node") + " " + parameter.node.name
			])
	}
}

