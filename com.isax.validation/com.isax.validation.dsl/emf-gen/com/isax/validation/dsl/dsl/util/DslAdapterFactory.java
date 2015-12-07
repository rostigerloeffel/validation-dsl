/**
 */
package com.isax.validation.dsl.dsl.util;

import com.isax.validation.dsl.dsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.isax.validation.dsl.dsl.DslPackage
 * @generated
 */
public class DslAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = DslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslSwitch<Adapter> modelSwitch =
		new DslSwitch<Adapter>()
		{
			@Override
			public Adapter caseValidator(Validator object)
			{
				return createValidatorAdapter();
			}
			@Override
			public Adapter caseBodySentences(BodySentences object)
			{
				return createBodySentencesAdapter();
			}
			@Override
			public Adapter caseSentence(Sentence object)
			{
				return createSentenceAdapter();
			}
			@Override
			public Adapter caseStartOnSentence(StartOnSentence object)
			{
				return createStartOnSentenceAdapter();
			}
			@Override
			public Adapter caseDefinitionSentence(DefinitionSentence object)
			{
				return createDefinitionSentenceAdapter();
			}
			@Override
			public Adapter caseConstraintSentence(ConstraintSentence object)
			{
				return createConstraintSentenceAdapter();
			}
			@Override
			public Adapter casePredicateDefinitionSentence(PredicateDefinitionSentence object)
			{
				return createPredicateDefinitionSentenceAdapter();
			}
			@Override
			public Adapter caseNodeDefinition(NodeDefinition object)
			{
				return createNodeDefinitionAdapter();
			}
			@Override
			public Adapter caseNodeReferenceList(NodeReferenceList object)
			{
				return createNodeReferenceListAdapter();
			}
			@Override
			public Adapter caseTargetDefinition(TargetDefinition object)
			{
				return createTargetDefinitionAdapter();
			}
			@Override
			public Adapter caseSelectorList(SelectorList object)
			{
				return createSelectorListAdapter();
			}
			@Override
			public Adapter caseSelectorListDef(SelectorListDef object)
			{
				return createSelectorListDefAdapter();
			}
			@Override
			public Adapter caseSelector(Selector object)
			{
				return createSelectorAdapter();
			}
			@Override
			public Adapter casePredicateExpression(PredicateExpression object)
			{
				return createPredicateExpressionAdapter();
			}
			@Override
			public Adapter casePredicateCall(PredicateCall object)
			{
				return createPredicateCallAdapter();
			}
			@Override
			public Adapter casePredicateXExpression(PredicateXExpression object)
			{
				return createPredicateXExpressionAdapter();
			}
			@Override
			public Adapter casePropertyRelationPredicate(PropertyRelationPredicate object)
			{
				return createPropertyRelationPredicateAdapter();
			}
			@Override
			public Adapter caseDefinitionSentencePredicate(DefinitionSentencePredicate object)
			{
				return createDefinitionSentencePredicateAdapter();
			}
			@Override
			public Adapter casePredicateReference(PredicateReference object)
			{
				return createPredicateReferenceAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object)
			{
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParameterList(ParameterList object)
			{
				return createParameterListAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object)
			{
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseArgumentList(ArgumentList object)
			{
				return createArgumentListAdapter();
			}
			@Override
			public Adapter caseXXAssignment(XXAssignment object)
			{
				return createXXAssignmentAdapter();
			}
			@Override
			public Adapter caseAssignmentList(AssignmentList object)
			{
				return createAssignmentListAdapter();
			}
			@Override
			public Adapter caseAssignmentExpression(AssignmentExpression object)
			{
				return createAssignmentExpressionAdapter();
			}
			@Override
			public Adapter caseAssignmentXExpression(AssignmentXExpression object)
			{
				return createAssignmentXExpressionAdapter();
			}
			@Override
			public Adapter caseQuantification(Quantification object)
			{
				return createQuantificationAdapter();
			}
			@Override
			public Adapter caseQuantificationList(QuantificationList object)
			{
				return createQuantificationListAdapter();
			}
			@Override
			public Adapter casePropertyExpression(PropertyExpression object)
			{
				return createPropertyExpressionAdapter();
			}
			@Override
			public Adapter casePropertyValueExpression(PropertyValueExpression object)
			{
				return createPropertyValueExpressionAdapter();
			}
			@Override
			public Adapter casePropertyReferenceExpression(PropertyReferenceExpression object)
			{
				return createPropertyReferenceExpressionAdapter();
			}
			@Override
			public Adapter caseAndExpression(AndExpression object)
			{
				return createAndExpressionAdapter();
			}
			@Override
			public Adapter caseOrExpression(OrExpression object)
			{
				return createOrExpressionAdapter();
			}
			@Override
			public Adapter caseImpliesExpression(ImpliesExpression object)
			{
				return createImpliesExpressionAdapter();
			}
			@Override
			public Adapter caseXXPropertyExpression(XXPropertyExpression object)
			{
				return createXXPropertyExpressionAdapter();
			}
			@Override
			public Adapter caseRelationQualifier(RelationQualifier object)
			{
				return createRelationQualifierAdapter();
			}
			@Override
			public Adapter caseMustHave(MustHave object)
			{
				return createMustHaveAdapter();
			}
			@Override
			public Adapter caseMustNotHave(MustNotHave object)
			{
				return createMustNotHaveAdapter();
			}
			@Override
			public Adapter caseCanHave(CanHave object)
			{
				return createCanHaveAdapter();
			}
			@Override
			public Adapter caseRelationQuantifier(RelationQuantifier object)
			{
				return createRelationQuantifierAdapter();
			}
			@Override
			public Adapter caseOne(One object)
			{
				return createOneAdapter();
			}
			@Override
			public Adapter caseMultiple(Multiple object)
			{
				return createMultipleAdapter();
			}
			@Override
			public Adapter caseAtLeast(AtLeast object)
			{
				return createAtLeastAdapter();
			}
			@Override
			public Adapter caseAtMost(AtMost object)
			{
				return createAtMostAdapter();
			}
			@Override
			public Adapter caseExactly(Exactly object)
			{
				return createExactlyAdapter();
			}
			@Override
			public Adapter caseRelationAxis(RelationAxis object)
			{
				return createRelationAxisAdapter();
			}
			@Override
			public Adapter caseParent(Parent object)
			{
				return createParentAdapter();
			}
			@Override
			public Adapter caseChild(Child object)
			{
				return createChildAdapter();
			}
			@Override
			public Adapter caseAncestor(Ancestor object)
			{
				return createAncestorAdapter();
			}
			@Override
			public Adapter caseDescendant(Descendant object)
			{
				return createDescendantAdapter();
			}
			@Override
			public Adapter caseErrorDefinition(ErrorDefinition object)
			{
				return createErrorDefinitionAdapter();
			}
			@Override
			public Adapter caseXExpression(XExpression object)
			{
				return createXExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.Validator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.Validator
	 * @generated
	 */
	public Adapter createValidatorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.BodySentences <em>Body Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.BodySentences
	 * @generated
	 */
	public Adapter createBodySentencesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.Sentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.Sentence
	 * @generated
	 */
	public Adapter createSentenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.StartOnSentence <em>Start On Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.StartOnSentence
	 * @generated
	 */
	public Adapter createStartOnSentenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.DefinitionSentence <em>Definition Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.DefinitionSentence
	 * @generated
	 */
	public Adapter createDefinitionSentenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.ConstraintSentence <em>Constraint Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.ConstraintSentence
	 * @generated
	 */
	public Adapter createConstraintSentenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.PredicateDefinitionSentence <em>Predicate Definition Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.PredicateDefinitionSentence
	 * @generated
	 */
	public Adapter createPredicateDefinitionSentenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.NodeDefinition <em>Node Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.NodeDefinition
	 * @generated
	 */
	public Adapter createNodeDefinitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.NodeReferenceList <em>Node Reference List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.NodeReferenceList
	 * @generated
	 */
	public Adapter createNodeReferenceListAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.TargetDefinition <em>Target Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.TargetDefinition
	 * @generated
	 */
	public Adapter createTargetDefinitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.SelectorList <em>Selector List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.SelectorList
	 * @generated
	 */
	public Adapter createSelectorListAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.SelectorListDef <em>Selector List Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.SelectorListDef
	 * @generated
	 */
	public Adapter createSelectorListDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.Selector
	 * @generated
	 */
	public Adapter createSelectorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.PredicateExpression <em>Predicate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.PredicateExpression
	 * @generated
	 */
	public Adapter createPredicateExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.PredicateCall <em>Predicate Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.PredicateCall
	 * @generated
	 */
	public Adapter createPredicateCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.PredicateXExpression <em>Predicate XExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.PredicateXExpression
	 * @generated
	 */
	public Adapter createPredicateXExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.PropertyRelationPredicate <em>Property Relation Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.PropertyRelationPredicate
	 * @generated
	 */
	public Adapter createPropertyRelationPredicateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.DefinitionSentencePredicate <em>Definition Sentence Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.DefinitionSentencePredicate
	 * @generated
	 */
	public Adapter createDefinitionSentencePredicateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.PredicateReference <em>Predicate Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.PredicateReference
	 * @generated
	 */
	public Adapter createPredicateReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.ParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.ParameterList
	 * @generated
	 */
	public Adapter createParameterListAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.ArgumentList <em>Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.ArgumentList
	 * @generated
	 */
	public Adapter createArgumentListAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.XXAssignment <em>XX Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.XXAssignment
	 * @generated
	 */
	public Adapter createXXAssignmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.AssignmentList <em>Assignment List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.AssignmentList
	 * @generated
	 */
	public Adapter createAssignmentListAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.AssignmentExpression <em>Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.AssignmentExpression
	 * @generated
	 */
	public Adapter createAssignmentExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.AssignmentXExpression <em>Assignment XExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.AssignmentXExpression
	 * @generated
	 */
	public Adapter createAssignmentXExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.Quantification <em>Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.Quantification
	 * @generated
	 */
	public Adapter createQuantificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.QuantificationList <em>Quantification List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.QuantificationList
	 * @generated
	 */
	public Adapter createQuantificationListAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.PropertyExpression <em>Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.PropertyExpression
	 * @generated
	 */
	public Adapter createPropertyExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.PropertyValueExpression <em>Property Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.PropertyValueExpression
	 * @generated
	 */
	public Adapter createPropertyValueExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.PropertyReferenceExpression <em>Property Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.PropertyReferenceExpression
	 * @generated
	 */
	public Adapter createPropertyReferenceExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.AndExpression
	 * @generated
	 */
	public Adapter createAndExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.OrExpression
	 * @generated
	 */
	public Adapter createOrExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.ImpliesExpression <em>Implies Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.ImpliesExpression
	 * @generated
	 */
	public Adapter createImpliesExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.XXPropertyExpression <em>XX Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.XXPropertyExpression
	 * @generated
	 */
	public Adapter createXXPropertyExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.RelationQualifier <em>Relation Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.RelationQualifier
	 * @generated
	 */
	public Adapter createRelationQualifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.MustHave <em>Must Have</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.MustHave
	 * @generated
	 */
	public Adapter createMustHaveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.MustNotHave <em>Must Not Have</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.MustNotHave
	 * @generated
	 */
	public Adapter createMustNotHaveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.CanHave <em>Can Have</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.CanHave
	 * @generated
	 */
	public Adapter createCanHaveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.RelationQuantifier <em>Relation Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.RelationQuantifier
	 * @generated
	 */
	public Adapter createRelationQuantifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.One <em>One</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.One
	 * @generated
	 */
	public Adapter createOneAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.Multiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.Multiple
	 * @generated
	 */
	public Adapter createMultipleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.AtLeast <em>At Least</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.AtLeast
	 * @generated
	 */
	public Adapter createAtLeastAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.AtMost <em>At Most</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.AtMost
	 * @generated
	 */
	public Adapter createAtMostAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.Exactly <em>Exactly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.Exactly
	 * @generated
	 */
	public Adapter createExactlyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.RelationAxis <em>Relation Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.RelationAxis
	 * @generated
	 */
	public Adapter createRelationAxisAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.Parent
	 * @generated
	 */
	public Adapter createParentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.Child <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.Child
	 * @generated
	 */
	public Adapter createChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.Ancestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.Ancestor
	 * @generated
	 */
	public Adapter createAncestorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.Descendant <em>Descendant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.Descendant
	 * @generated
	 */
	public Adapter createDescendantAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.isax.validation.dsl.dsl.ErrorDefinition <em>Error Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.isax.validation.dsl.dsl.ErrorDefinition
	 * @generated
	 */
	public Adapter createErrorDefinitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XExpression <em>XExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XExpression
	 * @generated
	 */
	public Adapter createXExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //DslAdapterFactory
