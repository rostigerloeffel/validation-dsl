/**
 */
package com.isax.validation.dsl.dsl.util;

import com.isax.validation.dsl.dsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.isax.validation.dsl.dsl.DslPackage
 * @generated
 */
public class DslSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = DslPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case DslPackage.VALIDATOR:
			{
				Validator validator = (Validator)theEObject;
				T result = caseValidator(validator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.BODY_SENTENCES:
			{
				BodySentences bodySentences = (BodySentences)theEObject;
				T result = caseBodySentences(bodySentences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.SENTENCE:
			{
				Sentence sentence = (Sentence)theEObject;
				T result = caseSentence(sentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.START_ON_SENTENCE:
			{
				StartOnSentence startOnSentence = (StartOnSentence)theEObject;
				T result = caseStartOnSentence(startOnSentence);
				if (result == null) result = caseSentence(startOnSentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.DEFINITION_SENTENCE:
			{
				DefinitionSentence definitionSentence = (DefinitionSentence)theEObject;
				T result = caseDefinitionSentence(definitionSentence);
				if (result == null) result = caseSentence(definitionSentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.CONSTRAINT_SENTENCE:
			{
				ConstraintSentence constraintSentence = (ConstraintSentence)theEObject;
				T result = caseConstraintSentence(constraintSentence);
				if (result == null) result = caseSentence(constraintSentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.PREDICATE_DEFINITION_SENTENCE:
			{
				PredicateDefinitionSentence predicateDefinitionSentence = (PredicateDefinitionSentence)theEObject;
				T result = casePredicateDefinitionSentence(predicateDefinitionSentence);
				if (result == null) result = caseSentence(predicateDefinitionSentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.NODE_DEFINITION:
			{
				NodeDefinition nodeDefinition = (NodeDefinition)theEObject;
				T result = caseNodeDefinition(nodeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.NODE_REFERENCE_LIST:
			{
				NodeReferenceList nodeReferenceList = (NodeReferenceList)theEObject;
				T result = caseNodeReferenceList(nodeReferenceList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.TARGET_DEFINITION:
			{
				TargetDefinition targetDefinition = (TargetDefinition)theEObject;
				T result = caseTargetDefinition(targetDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.SELECTOR_LIST:
			{
				SelectorList selectorList = (SelectorList)theEObject;
				T result = caseSelectorList(selectorList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.SELECTOR_LIST_DEF:
			{
				SelectorListDef selectorListDef = (SelectorListDef)theEObject;
				T result = caseSelectorListDef(selectorListDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.SELECTOR:
			{
				Selector selector = (Selector)theEObject;
				T result = caseSelector(selector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.PREDICATE_EXPRESSION:
			{
				PredicateExpression predicateExpression = (PredicateExpression)theEObject;
				T result = casePredicateExpression(predicateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.PREDICATE_CALL:
			{
				PredicateCall predicateCall = (PredicateCall)theEObject;
				T result = casePredicateCall(predicateCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.PREDICATE_XEXPRESSION:
			{
				PredicateXExpression predicateXExpression = (PredicateXExpression)theEObject;
				T result = casePredicateXExpression(predicateXExpression);
				if (result == null) result = casePredicateCall(predicateXExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.PROPERTY_RELATION_PREDICATE:
			{
				PropertyRelationPredicate propertyRelationPredicate = (PropertyRelationPredicate)theEObject;
				T result = casePropertyRelationPredicate(propertyRelationPredicate);
				if (result == null) result = casePredicateCall(propertyRelationPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.DEFINITION_SENTENCE_PREDICATE:
			{
				DefinitionSentencePredicate definitionSentencePredicate = (DefinitionSentencePredicate)theEObject;
				T result = caseDefinitionSentencePredicate(definitionSentencePredicate);
				if (result == null) result = casePredicateCall(definitionSentencePredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.PREDICATE_REFERENCE:
			{
				PredicateReference predicateReference = (PredicateReference)theEObject;
				T result = casePredicateReference(predicateReference);
				if (result == null) result = casePredicateCall(predicateReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.PARAMETER:
			{
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.PARAMETER_LIST:
			{
				ParameterList parameterList = (ParameterList)theEObject;
				T result = caseParameterList(parameterList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ARGUMENT:
			{
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ARGUMENT_LIST:
			{
				ArgumentList argumentList = (ArgumentList)theEObject;
				T result = caseArgumentList(argumentList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ASSIGNMENT:
			{
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ASSIGNMENT_LIST:
			{
				AssignmentList assignmentList = (AssignmentList)theEObject;
				T result = caseAssignmentList(assignmentList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ASSIGNMENT_EXPRESSION:
			{
				AssignmentExpression assignmentExpression = (AssignmentExpression)theEObject;
				T result = caseAssignmentExpression(assignmentExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ASSIGNMENT_XEXPRESSION:
			{
				AssignmentXExpression assignmentXExpression = (AssignmentXExpression)theEObject;
				T result = caseAssignmentXExpression(assignmentXExpression);
				if (result == null) result = caseAssignmentExpression(assignmentXExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.QUANTIFICATION:
			{
				Quantification quantification = (Quantification)theEObject;
				T result = caseQuantification(quantification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.QUANTIFICATION_LIST:
			{
				QuantificationList quantificationList = (QuantificationList)theEObject;
				T result = caseQuantificationList(quantificationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.PROPERTY_EXPRESSION:
			{
				PropertyExpression propertyExpression = (PropertyExpression)theEObject;
				T result = casePropertyExpression(propertyExpression);
				if (result == null) result = caseAssignmentExpression(propertyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.PROPERTY_VALUE_EXPRESSION:
			{
				PropertyValueExpression propertyValueExpression = (PropertyValueExpression)theEObject;
				T result = casePropertyValueExpression(propertyValueExpression);
				if (result == null) result = casePropertyExpression(propertyValueExpression);
				if (result == null) result = caseAssignmentExpression(propertyValueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.PROPERTY_REFERENCE_EXPRESSION:
			{
				PropertyReferenceExpression propertyReferenceExpression = (PropertyReferenceExpression)theEObject;
				T result = casePropertyReferenceExpression(propertyReferenceExpression);
				if (result == null) result = casePropertyExpression(propertyReferenceExpression);
				if (result == null) result = caseAssignmentExpression(propertyReferenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.AND_EXPRESSION:
			{
				AndExpression andExpression = (AndExpression)theEObject;
				T result = caseAndExpression(andExpression);
				if (result == null) result = casePredicateExpression(andExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.OR_EXPRESSION:
			{
				OrExpression orExpression = (OrExpression)theEObject;
				T result = caseOrExpression(orExpression);
				if (result == null) result = casePredicateExpression(orExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.IMPLIES_EXPRESSION:
			{
				ImpliesExpression impliesExpression = (ImpliesExpression)theEObject;
				T result = caseImpliesExpression(impliesExpression);
				if (result == null) result = casePredicateExpression(impliesExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidator(Validator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Sentences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Sentences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodySentences(BodySentences object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSentence(Sentence object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start On Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start On Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartOnSentence(StartOnSentence object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionSentence(DefinitionSentence object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintSentence(ConstraintSentence object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Definition Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Definition Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateDefinitionSentence(PredicateDefinitionSentence object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeDefinition(NodeDefinition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Reference List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Reference List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeReferenceList(NodeReferenceList object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetDefinition(TargetDefinition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selector List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selector List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectorList(SelectorList object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selector List Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selector List Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectorListDef(SelectorListDef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelector(Selector object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateExpression(PredicateExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateCall(PredicateCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate XExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate XExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateXExpression(PredicateXExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Relation Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Relation Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyRelationPredicate(PropertyRelationPredicate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Sentence Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Sentence Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionSentencePredicate(DefinitionSentencePredicate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateReference(PredicateReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterList(ParameterList object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentList(ArgumentList object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentList(AssignmentList object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentExpression(AssignmentExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment XExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment XExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentXExpression(AssignmentXExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantification(Quantification object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantification List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantification List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantificationList(QuantificationList object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyExpression(PropertyExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Value Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyValueExpression(PropertyValueExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Reference Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyReferenceExpression(PropertyReferenceExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndExpression(AndExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrExpression(OrExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implies Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implies Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpliesExpression(ImpliesExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //DslSwitch
