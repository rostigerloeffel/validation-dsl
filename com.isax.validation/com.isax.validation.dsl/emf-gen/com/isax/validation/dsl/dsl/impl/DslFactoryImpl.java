/**
 */
package com.isax.validation.dsl.dsl.impl;

import com.isax.validation.dsl.dsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslFactoryImpl extends EFactoryImpl implements DslFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DslFactory init()
	{
		try
		{
			DslFactory theDslFactory = (DslFactory)EPackage.Registry.INSTANCE.getEFactory(DslPackage.eNS_URI);
			if (theDslFactory != null)
			{
				return theDslFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case DslPackage.VALIDATOR: return createValidator();
			case DslPackage.BODY_SENTENCES: return createBodySentences();
			case DslPackage.SENTENCE: return createSentence();
			case DslPackage.START_ON_SENTENCE: return createStartOnSentence();
			case DslPackage.DEFINITION_SENTENCE: return createDefinitionSentence();
			case DslPackage.CONSTRAINT_SENTENCE: return createConstraintSentence();
			case DslPackage.PREDICATE_DEFINITION_SENTENCE: return createPredicateDefinitionSentence();
			case DslPackage.NODE_DEFINITION: return createNodeDefinition();
			case DslPackage.NODE_REFERENCE_LIST: return createNodeReferenceList();
			case DslPackage.TARGET_DEFINITION: return createTargetDefinition();
			case DslPackage.SELECTOR_LIST: return createSelectorList();
			case DslPackage.SELECTOR_LIST_DEF: return createSelectorListDef();
			case DslPackage.SELECTOR: return createSelector();
			case DslPackage.PREDICATE_EXPRESSION: return createPredicateExpression();
			case DslPackage.PREDICATE_CALL: return createPredicateCall();
			case DslPackage.PREDICATE_XEXPRESSION: return createPredicateXExpression();
			case DslPackage.PROPERTY_RELATION_PREDICATE: return createPropertyRelationPredicate();
			case DslPackage.DEFINITION_SENTENCE_PREDICATE: return createDefinitionSentencePredicate();
			case DslPackage.PREDICATE_REFERENCE: return createPredicateReference();
			case DslPackage.PARAMETER: return createParameter();
			case DslPackage.PARAMETER_LIST: return createParameterList();
			case DslPackage.ARGUMENT: return createArgument();
			case DslPackage.ARGUMENT_LIST: return createArgumentList();
			case DslPackage.XX_ASSIGNMENT: return createXXAssignment();
			case DslPackage.ASSIGNMENT_LIST: return createAssignmentList();
			case DslPackage.ASSIGNMENT_EXPRESSION: return createAssignmentExpression();
			case DslPackage.ASSIGNMENT_XEXPRESSION: return createAssignmentXExpression();
			case DslPackage.QUANTIFICATION: return createQuantification();
			case DslPackage.QUANTIFICATION_LIST: return createQuantificationList();
			case DslPackage.PROPERTY_EXPRESSION: return createPropertyExpression();
			case DslPackage.PROPERTY_VALUE_EXPRESSION: return createPropertyValueExpression();
			case DslPackage.PROPERTY_REFERENCE_EXPRESSION: return createPropertyReferenceExpression();
			case DslPackage.AND_EXPRESSION: return createAndExpression();
			case DslPackage.OR_EXPRESSION: return createOrExpression();
			case DslPackage.IMPLIES_EXPRESSION: return createImpliesExpression();
			case DslPackage.XX_PROPERTY_EXPRESSION: return createXXPropertyExpression();
			case DslPackage.MUST_HAVE: return createMustHave();
			case DslPackage.MUST_NOT_HAVE: return createMustNotHave();
			case DslPackage.CAN_HAVE: return createCanHave();
			case DslPackage.ONE: return createOne();
			case DslPackage.MULTIPLE: return createMultiple();
			case DslPackage.AT_LEAST: return createAtLeast();
			case DslPackage.AT_MOST: return createAtMost();
			case DslPackage.EXACTLY: return createExactly();
			case DslPackage.PARENT: return createParent();
			case DslPackage.CHILD: return createChild();
			case DslPackage.ANCESTOR: return createAncestor();
			case DslPackage.DESCENDANT: return createDescendant();
			case DslPackage.ERROR_DEFINITION: return createErrorDefinition();
			case DslPackage.MODEL: return createModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case DslPackage.QUANTOR:
				return createQuantorFromString(eDataType, initialValue);
			case DslPackage.PROPERTY_RELATION:
				return createPropertyRelationFromString(eDataType, initialValue);
			case DslPackage.RELATION_KIND:
				return createRelationKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case DslPackage.QUANTOR:
				return convertQuantorToString(eDataType, instanceValue);
			case DslPackage.PROPERTY_RELATION:
				return convertPropertyRelationToString(eDataType, instanceValue);
			case DslPackage.RELATION_KIND:
				return convertRelationKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validator createValidator()
	{
		ValidatorImpl validator = new ValidatorImpl();
		return validator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodySentences createBodySentences()
	{
		BodySentencesImpl bodySentences = new BodySentencesImpl();
		return bodySentences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence createSentence()
	{
		SentenceImpl sentence = new SentenceImpl();
		return sentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOnSentence createStartOnSentence()
	{
		StartOnSentenceImpl startOnSentence = new StartOnSentenceImpl();
		return startOnSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionSentence createDefinitionSentence()
	{
		DefinitionSentenceImpl definitionSentence = new DefinitionSentenceImpl();
		return definitionSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSentence createConstraintSentence()
	{
		ConstraintSentenceImpl constraintSentence = new ConstraintSentenceImpl();
		return constraintSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateDefinitionSentence createPredicateDefinitionSentence()
	{
		PredicateDefinitionSentenceImpl predicateDefinitionSentence = new PredicateDefinitionSentenceImpl();
		return predicateDefinitionSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeDefinition createNodeDefinition()
	{
		NodeDefinitionImpl nodeDefinition = new NodeDefinitionImpl();
		return nodeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeReferenceList createNodeReferenceList()
	{
		NodeReferenceListImpl nodeReferenceList = new NodeReferenceListImpl();
		return nodeReferenceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetDefinition createTargetDefinition()
	{
		TargetDefinitionImpl targetDefinition = new TargetDefinitionImpl();
		return targetDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectorList createSelectorList()
	{
		SelectorListImpl selectorList = new SelectorListImpl();
		return selectorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectorListDef createSelectorListDef()
	{
		SelectorListDefImpl selectorListDef = new SelectorListDefImpl();
		return selectorListDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selector createSelector()
	{
		SelectorImpl selector = new SelectorImpl();
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateExpression createPredicateExpression()
	{
		PredicateExpressionImpl predicateExpression = new PredicateExpressionImpl();
		return predicateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateCall createPredicateCall()
	{
		PredicateCallImpl predicateCall = new PredicateCallImpl();
		return predicateCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateXExpression createPredicateXExpression()
	{
		PredicateXExpressionImpl predicateXExpression = new PredicateXExpressionImpl();
		return predicateXExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRelationPredicate createPropertyRelationPredicate()
	{
		PropertyRelationPredicateImpl propertyRelationPredicate = new PropertyRelationPredicateImpl();
		return propertyRelationPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionSentencePredicate createDefinitionSentencePredicate()
	{
		DefinitionSentencePredicateImpl definitionSentencePredicate = new DefinitionSentencePredicateImpl();
		return definitionSentencePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateReference createPredicateReference()
	{
		PredicateReferenceImpl predicateReference = new PredicateReferenceImpl();
		return predicateReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter()
	{
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterList createParameterList()
	{
		ParameterListImpl parameterList = new ParameterListImpl();
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument()
	{
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentList createArgumentList()
	{
		ArgumentListImpl argumentList = new ArgumentListImpl();
		return argumentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XXAssignment createXXAssignment()
	{
		XXAssignmentImpl xxAssignment = new XXAssignmentImpl();
		return xxAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentList createAssignmentList()
	{
		AssignmentListImpl assignmentList = new AssignmentListImpl();
		return assignmentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentExpression createAssignmentExpression()
	{
		AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
		return assignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentXExpression createAssignmentXExpression()
	{
		AssignmentXExpressionImpl assignmentXExpression = new AssignmentXExpressionImpl();
		return assignmentXExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantification createQuantification()
	{
		QuantificationImpl quantification = new QuantificationImpl();
		return quantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantificationList createQuantificationList()
	{
		QuantificationListImpl quantificationList = new QuantificationListImpl();
		return quantificationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyExpression createPropertyExpression()
	{
		PropertyExpressionImpl propertyExpression = new PropertyExpressionImpl();
		return propertyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValueExpression createPropertyValueExpression()
	{
		PropertyValueExpressionImpl propertyValueExpression = new PropertyValueExpressionImpl();
		return propertyValueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyReferenceExpression createPropertyReferenceExpression()
	{
		PropertyReferenceExpressionImpl propertyReferenceExpression = new PropertyReferenceExpressionImpl();
		return propertyReferenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndExpression createAndExpression()
	{
		AndExpressionImpl andExpression = new AndExpressionImpl();
		return andExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrExpression createOrExpression()
	{
		OrExpressionImpl orExpression = new OrExpressionImpl();
		return orExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpliesExpression createImpliesExpression()
	{
		ImpliesExpressionImpl impliesExpression = new ImpliesExpressionImpl();
		return impliesExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XXPropertyExpression createXXPropertyExpression()
	{
		XXPropertyExpressionImpl xxPropertyExpression = new XXPropertyExpressionImpl();
		return xxPropertyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustHave createMustHave()
	{
		MustHaveImpl mustHave = new MustHaveImpl();
		return mustHave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustNotHave createMustNotHave()
	{
		MustNotHaveImpl mustNotHave = new MustNotHaveImpl();
		return mustNotHave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanHave createCanHave()
	{
		CanHaveImpl canHave = new CanHaveImpl();
		return canHave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public One createOne()
	{
		OneImpl one = new OneImpl();
		return one;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiple createMultiple()
	{
		MultipleImpl multiple = new MultipleImpl();
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtLeast createAtLeast()
	{
		AtLeastImpl atLeast = new AtLeastImpl();
		return atLeast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtMost createAtMost()
	{
		AtMostImpl atMost = new AtMostImpl();
		return atMost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exactly createExactly()
	{
		ExactlyImpl exactly = new ExactlyImpl();
		return exactly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parent createParent()
	{
		ParentImpl parent = new ParentImpl();
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Child createChild()
	{
		ChildImpl child = new ChildImpl();
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ancestor createAncestor()
	{
		AncestorImpl ancestor = new AncestorImpl();
		return ancestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Descendant createDescendant()
	{
		DescendantImpl descendant = new DescendantImpl();
		return descendant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorDefinition createErrorDefinition()
	{
		ErrorDefinitionImpl errorDefinition = new ErrorDefinitionImpl();
		return errorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel()
	{
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantor createQuantorFromString(EDataType eDataType, String initialValue)
	{
		Quantor result = Quantor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantorToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRelation createPropertyRelationFromString(EDataType eDataType, String initialValue)
	{
		PropertyRelation result = PropertyRelation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRelationToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationKind createRelationKindFromString(EDataType eDataType, String initialValue)
	{
		RelationKind result = RelationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslPackage getDslPackage()
	{
		return (DslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DslPackage getPackage()
	{
		return DslPackage.eINSTANCE;
	}

} //DslFactoryImpl
