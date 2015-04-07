package com.isax.validation.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.isax.validation.dsl.dsl.AndExpression;
import com.isax.validation.dsl.dsl.Argument;
import com.isax.validation.dsl.dsl.ArgumentList;
import com.isax.validation.dsl.dsl.Assignment;
import com.isax.validation.dsl.dsl.AssignmentList;
import com.isax.validation.dsl.dsl.ConstraintSentence;
import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.DefinitionSentencePredicate;
import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.NodeReferenceList;
import com.isax.validation.dsl.dsl.OrExpression;
import com.isax.validation.dsl.dsl.Parameter;
import com.isax.validation.dsl.dsl.ParameterList;
import com.isax.validation.dsl.dsl.PredicateDefinitionSentence;
import com.isax.validation.dsl.dsl.PredicateExpression;
import com.isax.validation.dsl.dsl.PredicateReference;
import com.isax.validation.dsl.dsl.PropertyReferenceExpression;
import com.isax.validation.dsl.dsl.PropertyRelationPredicate;
import com.isax.validation.dsl.dsl.PropertyValueExpression;
import com.isax.validation.dsl.dsl.Quantification;
import com.isax.validation.dsl.dsl.QuantificationList;
import com.isax.validation.dsl.dsl.Selector;
import com.isax.validation.dsl.dsl.SelectorList;
import com.isax.validation.dsl.dsl.SelectorListDef;
import com.isax.validation.dsl.dsl.StartOnSentence;
import com.isax.validation.dsl.dsl.TargetDefinition;
import com.isax.validation.dsl.dsl.Validator;
import com.isax.validation.dsl.services.DslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DslPackage.AND_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule()) {
					sequence_AndExpression(context, (AndExpression) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.ARGUMENT:
				if(context == grammarAccess.getArgumentRule()) {
					sequence_Argument(context, (Argument) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.ARGUMENT_LIST:
				if(context == grammarAccess.getArgumentListRule()) {
					sequence_ArgumentList(context, (ArgumentList) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.ASSIGNMENT_LIST:
				if(context == grammarAccess.getAssignmentListRule()) {
					sequence_AssignmentList(context, (AssignmentList) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.CONSTRAINT_SENTENCE:
				if(context == grammarAccess.getConstraintSentenceRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_ConstraintSentence(context, (ConstraintSentence) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.DEFINITION_SENTENCE:
				if(context == grammarAccess.getDefinitionSentenceRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_DefinitionSentence(context, (DefinitionSentence) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.DEFINITION_SENTENCE_PREDICATE:
				if(context == grammarAccess.getDefinitionSentencePredicateRule()) {
					sequence_DefinitionSentencePredicate(context, (DefinitionSentencePredicate) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPredicateCallRule()) {
					sequence_DefinitionSentencePredicate_PredicateCall(context, (DefinitionSentencePredicate) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.NODE_DEFINITION:
				if(context == grammarAccess.getNodeDefinitionRule()) {
					sequence_NodeDefinition(context, (NodeDefinition) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.NODE_REFERENCE_LIST:
				if(context == grammarAccess.getNodeReferenceListRule()) {
					sequence_NodeReferenceList(context, (NodeReferenceList) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.OR_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule()) {
					sequence_OrExpression(context, (OrExpression) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.PARAMETER_LIST:
				if(context == grammarAccess.getParameterListRule()) {
					sequence_ParameterList(context, (ParameterList) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.PREDICATE_DEFINITION_SENTENCE:
				if(context == grammarAccess.getPredicateDefinitionSentenceRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_PredicateDefinitionSentence(context, (PredicateDefinitionSentence) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.PREDICATE_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0() ||
				   context == grammarAccess.getImpliesExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule()) {
					sequence_ImpliesExpression(context, (PredicateExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (PredicateExpression) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.PREDICATE_REFERENCE:
				if(context == grammarAccess.getPredicateCallRule()) {
					sequence_PredicateCall_PredicateReference(context, (PredicateReference) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPredicateReferenceRule()) {
					sequence_PredicateReference(context, (PredicateReference) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.PROPERTY_REFERENCE_EXPRESSION:
				if(context == grammarAccess.getPropertyExpressionRule() ||
				   context == grammarAccess.getPropertyReferenceExpressionRule()) {
					sequence_PropertyReferenceExpression(context, (PropertyReferenceExpression) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.PROPERTY_RELATION_PREDICATE:
				if(context == grammarAccess.getPredicateCallRule()) {
					sequence_PredicateCall_PropertyRelationPredicate(context, (PropertyRelationPredicate) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPropertyRelationPredicateRule()) {
					sequence_PropertyRelationPredicate(context, (PropertyRelationPredicate) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.PROPERTY_VALUE_EXPRESSION:
				if(context == grammarAccess.getPropertyExpressionRule() ||
				   context == grammarAccess.getPropertyValueExpressionRule()) {
					sequence_PropertyValueExpression(context, (PropertyValueExpression) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.QUANTIFICATION:
				if(context == grammarAccess.getQuantificationRule()) {
					sequence_Quantification(context, (Quantification) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.QUANTIFICATION_LIST:
				if(context == grammarAccess.getQuantificationListRule()) {
					sequence_QuantificationList(context, (QuantificationList) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.SELECTOR:
				if(context == grammarAccess.getSelectorRule()) {
					sequence_Selector(context, (Selector) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.SELECTOR_LIST:
				if(context == grammarAccess.getSelectorListRule()) {
					sequence_SelectorList(context, (SelectorList) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.SELECTOR_LIST_DEF:
				if(context == grammarAccess.getSelectorListDefRule()) {
					sequence_SelectorListDef(context, (SelectorListDef) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.START_ON_SENTENCE:
				if(context == grammarAccess.getSentenceRule() ||
				   context == grammarAccess.getStartOnSentenceRule()) {
					sequence_StartOnSentence(context, (StartOnSentence) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.TARGET_DEFINITION:
				if(context == grammarAccess.getTargetDefinitionRule()) {
					sequence_TargetDefinition(context, (TargetDefinition) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.VALIDATOR:
				if(context == grammarAccess.getValidatorRule()) {
					sequence_Validator(context, (Validator) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (lhs=AndExpression_AndExpression_1_0 rhs=OrExpression)
	 */
	protected void sequence_AndExpression(EObject context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arguments+=Argument arguments+=Argument*)
	 */
	protected void sequence_ArgumentList(EObject context, ArgumentList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     node=[NodeDefinition|ID]
	 */
	protected void sequence_Argument(EObject context, Argument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.ARGUMENT__NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ARGUMENT__NODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArgumentAccess().getNodeNodeDefinitionIDTerminalRuleCall_0_1(), semanticObject.getNode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (assignments+=Assignment assignments+=Assignment*)
	 */
	protected void sequence_AssignmentList(EObject context, AssignmentList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=PropertyReferenceExpression expression=PropertyExpression)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.ASSIGNMENT__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ASSIGNMENT__REFERENCE));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.ASSIGNMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ASSIGNMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getReferencePropertyReferenceExpressionParserRuleCall_0_0(), semanticObject.getReference());
		feeder.accept(grammarAccess.getAssignmentAccess().getExpressionPropertyExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (quantifications=QuantificationList? nodes=NodeReferenceList? predicate=PredicateExpression)
	 */
	protected void sequence_ConstraintSentence(EObject context, ConstraintSentence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sentence=DefinitionSentence
	 */
	protected void sequence_DefinitionSentencePredicate(EObject context, DefinitionSentencePredicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sentence=DefinitionSentence label=ID?)
	 */
	protected void sequence_DefinitionSentencePredicate_PredicateCall(EObject context, DefinitionSentencePredicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((quantification=Quantification | node=[NodeDefinition|ID]) qualifier=RelationQualifier target=TargetDefinition)
	 */
	protected void sequence_DefinitionSentence(EObject context, DefinitionSentence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=PrimaryExpression rhs=PrimaryExpression?)
	 */
	protected void sequence_ImpliesExpression(EObject context, PredicateExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID collection?='*'? selectors=SelectorList?)
	 */
	protected void sequence_NodeDefinition(EObject context, NodeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nodes+=[NodeDefinition|ID] nodes+=[NodeDefinition|ID]*)
	 */
	protected void sequence_NodeReferenceList(EObject context, NodeReferenceList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=OrExpression_OrExpression_1_0 rhs=ImpliesExpression)
	 */
	protected void sequence_OrExpression(EObject context, OrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameters+=Parameter parameters+=Parameter*)
	 */
	protected void sequence_ParameterList(EObject context, ParameterList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     node=NodeDefinition
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.PARAMETER__NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.PARAMETER__NODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getNodeNodeDefinitionParserRuleCall_0(), semanticObject.getNode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (reference=[PredicateDefinitionSentence|ID] arguments=ArgumentList label=ID?)
	 */
	protected void sequence_PredicateCall_PredicateReference(EObject context, PredicateReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=PropertyExpression relation=PropertyRelation rhs=PropertyExpression label=ID?)
	 */
	protected void sequence_PredicateCall_PropertyRelationPredicate(EObject context, PropertyRelationPredicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parameters=ParameterList? predicate=PredicateExpression)
	 */
	protected void sequence_PredicateDefinitionSentence(EObject context, PredicateDefinitionSentence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=[PredicateDefinitionSentence|ID] arguments=ArgumentList)
	 */
	protected void sequence_PredicateReference(EObject context, PredicateReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (negated?='not'? (call=PredicateCall | inner=PredicateExpression))
	 */
	protected void sequence_PrimaryExpression(EObject context, PredicateExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (node=[NodeDefinition|ID] Property=ID)
	 */
	protected void sequence_PropertyReferenceExpression(EObject context, PropertyReferenceExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.PROPERTY_REFERENCE_EXPRESSION__NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.PROPERTY_REFERENCE_EXPRESSION__NODE));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.PROPERTY_REFERENCE_EXPRESSION__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.PROPERTY_REFERENCE_EXPRESSION__PROPERTY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyReferenceExpressionAccess().getNodeNodeDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.getNode());
		feeder.accept(grammarAccess.getPropertyReferenceExpressionAccess().getPropertyIDTerminalRuleCall_3_0(), semanticObject.getProperty());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=PropertyExpression relation=PropertyRelation rhs=PropertyExpression)
	 */
	protected void sequence_PropertyRelationPredicate(EObject context, PropertyRelationPredicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_PropertyValueExpression(EObject context, PropertyValueExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.PROPERTY_VALUE_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.PROPERTY_VALUE_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyValueExpressionAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (quantifications+=Quantification quantifications+=Quantification*)
	 */
	protected void sequence_QuantificationList(EObject context, QuantificationList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (quantor=Quantor node=NodeDefinition nodeSet=[NodeDefinition|ID])
	 */
	protected void sequence_Quantification(EObject context, Quantification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.QUANTIFICATION__QUANTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.QUANTIFICATION__QUANTOR));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.QUANTIFICATION__NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.QUANTIFICATION__NODE));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.QUANTIFICATION__NODE_SET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.QUANTIFICATION__NODE_SET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQuantificationAccess().getQuantorQuantorEnumRuleCall_0_0(), semanticObject.getQuantor());
		feeder.accept(grammarAccess.getQuantificationAccess().getNodeNodeDefinitionParserRuleCall_1_0(), semanticObject.getNode());
		feeder.accept(grammarAccess.getQuantificationAccess().getNodeSetNodeDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.getNodeSet());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (selectors+=Selector selectors+=Selector*)
	 */
	protected void sequence_SelectorListDef(EObject context, SelectorListDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (selectors=SelectorListDef | selectors=SelectorListDef)
	 */
	protected void sequence_SelectorList(EObject context, SelectorList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=ID
	 */
	protected void sequence_Selector(EObject context, Selector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.SELECTOR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.SELECTOR__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectorAccess().getTypeIDTerminalRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     definition=NodeDefinition
	 */
	protected void sequence_StartOnSentence(EObject context, StartOnSentence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.START_ON_SENTENCE__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.START_ON_SENTENCE__DEFINITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStartOnSentenceAccess().getDefinitionNodeDefinitionParserRuleCall_2_0(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (axis=Axis definition=NodeDefinition predicate=PredicateExpression? assignments=AssignmentList?)
	 */
	protected void sequence_TargetDefinition(EObject context, TargetDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sentences+=Sentence+
	 */
	protected void sequence_Validator(EObject context, Validator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
