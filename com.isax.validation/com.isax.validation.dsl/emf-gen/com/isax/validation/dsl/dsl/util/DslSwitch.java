/**
 */
package com.isax.validation.dsl.dsl.util;

import com.isax.validation.dsl.dsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.xbase.XExpression;

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
			case DslPackage.XX_ASSIGNMENT:
			{
				XXAssignment xxAssignment = (XXAssignment)theEObject;
				T result = caseXXAssignment(xxAssignment);
				if (result == null) result = caseXExpression(xxAssignment);
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
			case DslPackage.XX_PROPERTY_EXPRESSION:
			{
				XXPropertyExpression xxPropertyExpression = (XXPropertyExpression)theEObject;
				T result = caseXXPropertyExpression(xxPropertyExpression);
				if (result == null) result = caseXExpression(xxPropertyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.RELATION_QUALIFIER:
			{
				RelationQualifier relationQualifier = (RelationQualifier)theEObject;
				T result = caseRelationQualifier(relationQualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.MUST_HAVE:
			{
				MustHave mustHave = (MustHave)theEObject;
				T result = caseMustHave(mustHave);
				if (result == null) result = caseRelationQualifier(mustHave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.MUST_NOT_HAVE:
			{
				MustNotHave mustNotHave = (MustNotHave)theEObject;
				T result = caseMustNotHave(mustNotHave);
				if (result == null) result = caseRelationQualifier(mustNotHave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.CAN_HAVE:
			{
				CanHave canHave = (CanHave)theEObject;
				T result = caseCanHave(canHave);
				if (result == null) result = caseRelationQualifier(canHave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.RELATION_QUANTIFIER:
			{
				RelationQuantifier relationQuantifier = (RelationQuantifier)theEObject;
				T result = caseRelationQuantifier(relationQuantifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ONE:
			{
				One one = (One)theEObject;
				T result = caseOne(one);
				if (result == null) result = caseRelationQuantifier(one);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.MULTIPLE:
			{
				Multiple multiple = (Multiple)theEObject;
				T result = caseMultiple(multiple);
				if (result == null) result = caseRelationQuantifier(multiple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.AT_LEAST:
			{
				AtLeast atLeast = (AtLeast)theEObject;
				T result = caseAtLeast(atLeast);
				if (result == null) result = caseRelationQuantifier(atLeast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.AT_MOST:
			{
				AtMost atMost = (AtMost)theEObject;
				T result = caseAtMost(atMost);
				if (result == null) result = caseRelationQuantifier(atMost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.EXACTLY:
			{
				Exactly exactly = (Exactly)theEObject;
				T result = caseExactly(exactly);
				if (result == null) result = caseRelationQuantifier(exactly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.RELATION_AXIS:
			{
				RelationAxis relationAxis = (RelationAxis)theEObject;
				T result = caseRelationAxis(relationAxis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.PARENT:
			{
				Parent parent = (Parent)theEObject;
				T result = caseParent(parent);
				if (result == null) result = caseRelationAxis(parent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.CHILD:
			{
				Child child = (Child)theEObject;
				T result = caseChild(child);
				if (result == null) result = caseRelationAxis(child);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ANCESTOR:
			{
				Ancestor ancestor = (Ancestor)theEObject;
				T result = caseAncestor(ancestor);
				if (result == null) result = caseRelationAxis(ancestor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.DESCENDANT:
			{
				Descendant descendant = (Descendant)theEObject;
				T result = caseDescendant(descendant);
				if (result == null) result = caseRelationAxis(descendant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ERROR_DEFINITION:
			{
				ErrorDefinition errorDefinition = (ErrorDefinition)theEObject;
				T result = caseErrorDefinition(errorDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.MODEL:
			{
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ID_SELECTOR:
			{
				IDSelector idSelector = (IDSelector)theEObject;
				T result = caseIDSelector(idSelector);
				if (result == null) result = caseSelector(idSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ECLASS_SELECTOR:
			{
				EClassSelector eClassSelector = (EClassSelector)theEObject;
				T result = caseEClassSelector(eClassSelector);
				if (result == null) result = caseSelector(eClassSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.PROPERTY_REFERENCE:
			{
				PropertyReference propertyReference = (PropertyReference)theEObject;
				T result = casePropertyReference(propertyReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.NAMED_PROPERTY_REFERENCE:
			{
				NamedPropertyReference namedPropertyReference = (NamedPropertyReference)theEObject;
				T result = caseNamedPropertyReference(namedPropertyReference);
				if (result == null) result = casePropertyReference(namedPropertyReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.EATTRIBUTE_PROPERTY_REFERENCE:
			{
				EAttributePropertyReference eAttributePropertyReference = (EAttributePropertyReference)theEObject;
				T result = caseEAttributePropertyReference(eAttributePropertyReference);
				if (result == null) result = casePropertyReference(eAttributePropertyReference);
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
	 * Returns the result of interpreting the object as an instance of '<em>XX Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XX Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXXAssignment(XXAssignment object)
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
	 * Returns the result of interpreting the object as an instance of '<em>XX Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XX Property Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXXPropertyExpression(XXPropertyExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationQualifier(RelationQualifier object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Must Have</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Must Have</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMustHave(MustHave object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Must Not Have</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Must Not Have</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMustNotHave(MustNotHave object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Can Have</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Can Have</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanHave(CanHave object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Quantifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Quantifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationQuantifier(RelationQuantifier object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOne(One object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiple(Multiple object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>At Least</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>At Least</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtLeast(AtLeast object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>At Most</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>At Most</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtMost(AtMost object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exactly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exactly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExactly(Exactly object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationAxis(RelationAxis object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParent(Parent object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChild(Child object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ancestor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ancestor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAncestor(Ancestor object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descendant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descendant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescendant(Descendant object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorDefinition(ErrorDefinition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDSelector(IDSelector object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassSelector(EClassSelector object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyReference(PropertyReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Property Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Property Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedPropertyReference(NamedPropertyReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAttribute Property Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAttribute Property Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAttributePropertyReference(EAttributePropertyReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXExpression(XExpression object)
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
