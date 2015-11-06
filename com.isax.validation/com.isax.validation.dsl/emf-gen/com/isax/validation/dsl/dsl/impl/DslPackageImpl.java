/**
 */
package com.isax.validation.dsl.dsl.impl;

import com.isax.validation.dsl.dsl.AndExpression;
import com.isax.validation.dsl.dsl.Argument;
import com.isax.validation.dsl.dsl.ArgumentList;
import com.isax.validation.dsl.dsl.Assignment;
import com.isax.validation.dsl.dsl.AssignmentExpression;
import com.isax.validation.dsl.dsl.AssignmentList;
import com.isax.validation.dsl.dsl.AssignmentXExpression;
import com.isax.validation.dsl.dsl.Axis;
import com.isax.validation.dsl.dsl.BodySentences;
import com.isax.validation.dsl.dsl.ConstraintSentence;
import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.DefinitionSentencePredicate;
import com.isax.validation.dsl.dsl.DslFactory;
import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.ImpliesExpression;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.NodeReferenceList;
import com.isax.validation.dsl.dsl.OrExpression;
import com.isax.validation.dsl.dsl.Parameter;
import com.isax.validation.dsl.dsl.ParameterList;
import com.isax.validation.dsl.dsl.PredicateCall;
import com.isax.validation.dsl.dsl.PredicateDefinitionSentence;
import com.isax.validation.dsl.dsl.PredicateExpression;
import com.isax.validation.dsl.dsl.PredicateReference;
import com.isax.validation.dsl.dsl.PredicateXExpression;
import com.isax.validation.dsl.dsl.PropertyExpression;
import com.isax.validation.dsl.dsl.PropertyReferenceExpression;
import com.isax.validation.dsl.dsl.PropertyRelation;
import com.isax.validation.dsl.dsl.PropertyRelationPredicate;
import com.isax.validation.dsl.dsl.PropertyValueExpression;
import com.isax.validation.dsl.dsl.Quantification;
import com.isax.validation.dsl.dsl.QuantificationList;
import com.isax.validation.dsl.dsl.Quantor;
import com.isax.validation.dsl.dsl.RelationQualifier;
import com.isax.validation.dsl.dsl.Selector;
import com.isax.validation.dsl.dsl.SelectorList;
import com.isax.validation.dsl.dsl.SelectorListDef;
import com.isax.validation.dsl.dsl.Sentence;
import com.isax.validation.dsl.dsl.StartOnSentence;
import com.isax.validation.dsl.dsl.TargetDefinition;
import com.isax.validation.dsl.dsl.Validator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslPackageImpl extends EPackageImpl implements DslPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodySentencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sentenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startOnSentenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionSentenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintSentenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateDefinitionSentenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeReferenceListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorListDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateXExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyRelationPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionSentencePredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentXExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantificationListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyReferenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impliesExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum axisEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyRelationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.isax.validation.dsl.dsl.DslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DslPackageImpl()
	{
		super(eNS_URI, DslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DslPackage init()
	{
		if (isInited) return (DslPackage)EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI);

		// Obtain or create and register package
		DslPackageImpl theDslPackage = (DslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DslPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XbasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDslPackage.createPackageContents();

		// Initialize created meta-data
		theDslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDslPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DslPackage.eNS_URI, theDslPackage);
		return theDslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidator()
	{
		return validatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidator_StartOn()
	{
		return (EReference)validatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidator_Body()
	{
		return (EReference)validatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidator_Predicates()
	{
		return (EReference)validatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodySentences()
	{
		return bodySentencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySentences_Definitions()
	{
		return (EReference)bodySentencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySentences_Constraints()
	{
		return (EReference)bodySentencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySentences_Sentences()
	{
		return (EReference)bodySentencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSentence()
	{
		return sentenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartOnSentence()
	{
		return startOnSentenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartOnSentence_Definition()
	{
		return (EReference)startOnSentenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionSentence()
	{
		return definitionSentenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionSentence_Quantification()
	{
		return (EReference)definitionSentenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionSentence_Node()
	{
		return (EReference)definitionSentenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitionSentence_Qualifier()
	{
		return (EAttribute)definitionSentenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionSentence_Target()
	{
		return (EReference)definitionSentenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintSentence()
	{
		return constraintSentenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintSentence_Quantifications()
	{
		return (EReference)constraintSentenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintSentence_Nodes()
	{
		return (EReference)constraintSentenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintSentence_Predicate()
	{
		return (EReference)constraintSentenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateDefinitionSentence()
	{
		return predicateDefinitionSentenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredicateDefinitionSentence_Name()
	{
		return (EAttribute)predicateDefinitionSentenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateDefinitionSentence_Parameters()
	{
		return (EReference)predicateDefinitionSentenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateDefinitionSentence_Body()
	{
		return (EReference)predicateDefinitionSentenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeDefinition()
	{
		return nodeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeDefinition_Name()
	{
		return (EAttribute)nodeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeDefinition_Collection()
	{
		return (EAttribute)nodeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeDefinition_Selectors()
	{
		return (EReference)nodeDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeReferenceList()
	{
		return nodeReferenceListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeReferenceList_Nodes()
	{
		return (EReference)nodeReferenceListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetDefinition()
	{
		return targetDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetDefinition_Axis()
	{
		return (EAttribute)targetDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetDefinition_Local()
	{
		return (EReference)targetDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetDefinition_Definition()
	{
		return (EReference)targetDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetDefinition_Body()
	{
		return (EReference)targetDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetDefinition_Assignments()
	{
		return (EReference)targetDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectorList()
	{
		return selectorListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectorList_Selectors()
	{
		return (EReference)selectorListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectorListDef()
	{
		return selectorListDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectorListDef_Selectors()
	{
		return (EReference)selectorListDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelector()
	{
		return selectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelector_Type()
	{
		return (EAttribute)selectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateExpression()
	{
		return predicateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateExpression_Lhs()
	{
		return (EReference)predicateExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredicateExpression_Negated()
	{
		return (EAttribute)predicateExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateExpression_Call()
	{
		return (EReference)predicateExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateExpression_Inner()
	{
		return (EReference)predicateExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateExpression_Rhs()
	{
		return (EReference)predicateExpressionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateCall()
	{
		return predicateCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredicateCall_Label()
	{
		return (EAttribute)predicateCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateXExpression()
	{
		return predicateXExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateXExpression_Expression()
	{
		return (EReference)predicateXExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyRelationPredicate()
	{
		return propertyRelationPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyRelationPredicate_Lhs()
	{
		return (EReference)propertyRelationPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyRelationPredicate_Relation()
	{
		return (EAttribute)propertyRelationPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyRelationPredicate_Rhs()
	{
		return (EReference)propertyRelationPredicateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionSentencePredicate()
	{
		return definitionSentencePredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionSentencePredicate_Sentence()
	{
		return (EReference)definitionSentencePredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateReference()
	{
		return predicateReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateReference_Reference()
	{
		return (EReference)predicateReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateReference_Arguments()
	{
		return (EReference)predicateReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter()
	{
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Node()
	{
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterList()
	{
		return parameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterList_Parameters()
	{
		return (EReference)parameterListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument()
	{
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_Node()
	{
		return (EReference)argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentList()
	{
		return argumentListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentList_Arguments()
	{
		return (EReference)argumentListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment()
	{
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Reference()
	{
		return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Expression()
	{
		return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentList()
	{
		return assignmentListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentList_Assignments()
	{
		return (EReference)assignmentListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentExpression()
	{
		return assignmentExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentXExpression()
	{
		return assignmentXExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentXExpression_Expression()
	{
		return (EReference)assignmentXExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantification()
	{
		return quantificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantification_Quantor()
	{
		return (EAttribute)quantificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantification_Node()
	{
		return (EReference)quantificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantification_NodeSet()
	{
		return (EReference)quantificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantificationList()
	{
		return quantificationListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantificationList_Quantifications()
	{
		return (EReference)quantificationListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyExpression()
	{
		return propertyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValueExpression()
	{
		return propertyValueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValueExpression_Value()
	{
		return (EAttribute)propertyValueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyReferenceExpression()
	{
		return propertyReferenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyReferenceExpression_Node()
	{
		return (EReference)propertyReferenceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyReferenceExpression_Property()
	{
		return (EAttribute)propertyReferenceExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndExpression()
	{
		return andExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrExpression()
	{
		return orExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpliesExpression()
	{
		return impliesExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantor()
	{
		return quantorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationQualifier()
	{
		return relationQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAxis()
	{
		return axisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyRelation()
	{
		return propertyRelationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslFactory getDslFactory()
	{
		return (DslFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		validatorEClass = createEClass(VALIDATOR);
		createEReference(validatorEClass, VALIDATOR__START_ON);
		createEReference(validatorEClass, VALIDATOR__BODY);
		createEReference(validatorEClass, VALIDATOR__PREDICATES);

		bodySentencesEClass = createEClass(BODY_SENTENCES);
		createEReference(bodySentencesEClass, BODY_SENTENCES__DEFINITIONS);
		createEReference(bodySentencesEClass, BODY_SENTENCES__CONSTRAINTS);
		createEReference(bodySentencesEClass, BODY_SENTENCES__SENTENCES);

		sentenceEClass = createEClass(SENTENCE);

		startOnSentenceEClass = createEClass(START_ON_SENTENCE);
		createEReference(startOnSentenceEClass, START_ON_SENTENCE__DEFINITION);

		definitionSentenceEClass = createEClass(DEFINITION_SENTENCE);
		createEReference(definitionSentenceEClass, DEFINITION_SENTENCE__QUANTIFICATION);
		createEReference(definitionSentenceEClass, DEFINITION_SENTENCE__NODE);
		createEAttribute(definitionSentenceEClass, DEFINITION_SENTENCE__QUALIFIER);
		createEReference(definitionSentenceEClass, DEFINITION_SENTENCE__TARGET);

		constraintSentenceEClass = createEClass(CONSTRAINT_SENTENCE);
		createEReference(constraintSentenceEClass, CONSTRAINT_SENTENCE__QUANTIFICATIONS);
		createEReference(constraintSentenceEClass, CONSTRAINT_SENTENCE__NODES);
		createEReference(constraintSentenceEClass, CONSTRAINT_SENTENCE__PREDICATE);

		predicateDefinitionSentenceEClass = createEClass(PREDICATE_DEFINITION_SENTENCE);
		createEAttribute(predicateDefinitionSentenceEClass, PREDICATE_DEFINITION_SENTENCE__NAME);
		createEReference(predicateDefinitionSentenceEClass, PREDICATE_DEFINITION_SENTENCE__PARAMETERS);
		createEReference(predicateDefinitionSentenceEClass, PREDICATE_DEFINITION_SENTENCE__BODY);

		nodeDefinitionEClass = createEClass(NODE_DEFINITION);
		createEAttribute(nodeDefinitionEClass, NODE_DEFINITION__NAME);
		createEAttribute(nodeDefinitionEClass, NODE_DEFINITION__COLLECTION);
		createEReference(nodeDefinitionEClass, NODE_DEFINITION__SELECTORS);

		nodeReferenceListEClass = createEClass(NODE_REFERENCE_LIST);
		createEReference(nodeReferenceListEClass, NODE_REFERENCE_LIST__NODES);

		targetDefinitionEClass = createEClass(TARGET_DEFINITION);
		createEAttribute(targetDefinitionEClass, TARGET_DEFINITION__AXIS);
		createEReference(targetDefinitionEClass, TARGET_DEFINITION__LOCAL);
		createEReference(targetDefinitionEClass, TARGET_DEFINITION__DEFINITION);
		createEReference(targetDefinitionEClass, TARGET_DEFINITION__BODY);
		createEReference(targetDefinitionEClass, TARGET_DEFINITION__ASSIGNMENTS);

		selectorListEClass = createEClass(SELECTOR_LIST);
		createEReference(selectorListEClass, SELECTOR_LIST__SELECTORS);

		selectorListDefEClass = createEClass(SELECTOR_LIST_DEF);
		createEReference(selectorListDefEClass, SELECTOR_LIST_DEF__SELECTORS);

		selectorEClass = createEClass(SELECTOR);
		createEAttribute(selectorEClass, SELECTOR__TYPE);

		predicateExpressionEClass = createEClass(PREDICATE_EXPRESSION);
		createEReference(predicateExpressionEClass, PREDICATE_EXPRESSION__LHS);
		createEAttribute(predicateExpressionEClass, PREDICATE_EXPRESSION__NEGATED);
		createEReference(predicateExpressionEClass, PREDICATE_EXPRESSION__CALL);
		createEReference(predicateExpressionEClass, PREDICATE_EXPRESSION__INNER);
		createEReference(predicateExpressionEClass, PREDICATE_EXPRESSION__RHS);

		predicateCallEClass = createEClass(PREDICATE_CALL);
		createEAttribute(predicateCallEClass, PREDICATE_CALL__LABEL);

		predicateXExpressionEClass = createEClass(PREDICATE_XEXPRESSION);
		createEReference(predicateXExpressionEClass, PREDICATE_XEXPRESSION__EXPRESSION);

		propertyRelationPredicateEClass = createEClass(PROPERTY_RELATION_PREDICATE);
		createEReference(propertyRelationPredicateEClass, PROPERTY_RELATION_PREDICATE__LHS);
		createEAttribute(propertyRelationPredicateEClass, PROPERTY_RELATION_PREDICATE__RELATION);
		createEReference(propertyRelationPredicateEClass, PROPERTY_RELATION_PREDICATE__RHS);

		definitionSentencePredicateEClass = createEClass(DEFINITION_SENTENCE_PREDICATE);
		createEReference(definitionSentencePredicateEClass, DEFINITION_SENTENCE_PREDICATE__SENTENCE);

		predicateReferenceEClass = createEClass(PREDICATE_REFERENCE);
		createEReference(predicateReferenceEClass, PREDICATE_REFERENCE__REFERENCE);
		createEReference(predicateReferenceEClass, PREDICATE_REFERENCE__ARGUMENTS);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__NODE);

		parameterListEClass = createEClass(PARAMETER_LIST);
		createEReference(parameterListEClass, PARAMETER_LIST__PARAMETERS);

		argumentEClass = createEClass(ARGUMENT);
		createEReference(argumentEClass, ARGUMENT__NODE);

		argumentListEClass = createEClass(ARGUMENT_LIST);
		createEReference(argumentListEClass, ARGUMENT_LIST__ARGUMENTS);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__REFERENCE);
		createEReference(assignmentEClass, ASSIGNMENT__EXPRESSION);

		assignmentListEClass = createEClass(ASSIGNMENT_LIST);
		createEReference(assignmentListEClass, ASSIGNMENT_LIST__ASSIGNMENTS);

		assignmentExpressionEClass = createEClass(ASSIGNMENT_EXPRESSION);

		assignmentXExpressionEClass = createEClass(ASSIGNMENT_XEXPRESSION);
		createEReference(assignmentXExpressionEClass, ASSIGNMENT_XEXPRESSION__EXPRESSION);

		quantificationEClass = createEClass(QUANTIFICATION);
		createEAttribute(quantificationEClass, QUANTIFICATION__QUANTOR);
		createEReference(quantificationEClass, QUANTIFICATION__NODE);
		createEReference(quantificationEClass, QUANTIFICATION__NODE_SET);

		quantificationListEClass = createEClass(QUANTIFICATION_LIST);
		createEReference(quantificationListEClass, QUANTIFICATION_LIST__QUANTIFICATIONS);

		propertyExpressionEClass = createEClass(PROPERTY_EXPRESSION);

		propertyValueExpressionEClass = createEClass(PROPERTY_VALUE_EXPRESSION);
		createEAttribute(propertyValueExpressionEClass, PROPERTY_VALUE_EXPRESSION__VALUE);

		propertyReferenceExpressionEClass = createEClass(PROPERTY_REFERENCE_EXPRESSION);
		createEReference(propertyReferenceExpressionEClass, PROPERTY_REFERENCE_EXPRESSION__NODE);
		createEAttribute(propertyReferenceExpressionEClass, PROPERTY_REFERENCE_EXPRESSION__PROPERTY);

		andExpressionEClass = createEClass(AND_EXPRESSION);

		orExpressionEClass = createEClass(OR_EXPRESSION);

		impliesExpressionEClass = createEClass(IMPLIES_EXPRESSION);

		// Create enums
		quantorEEnum = createEEnum(QUANTOR);
		relationQualifierEEnum = createEEnum(RELATION_QUALIFIER);
		axisEEnum = createEEnum(AXIS);
		propertyRelationEEnum = createEEnum(PROPERTY_RELATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		startOnSentenceEClass.getESuperTypes().add(this.getSentence());
		definitionSentenceEClass.getESuperTypes().add(this.getSentence());
		constraintSentenceEClass.getESuperTypes().add(this.getSentence());
		predicateDefinitionSentenceEClass.getESuperTypes().add(this.getSentence());
		predicateXExpressionEClass.getESuperTypes().add(this.getPredicateCall());
		propertyRelationPredicateEClass.getESuperTypes().add(this.getPredicateCall());
		definitionSentencePredicateEClass.getESuperTypes().add(this.getPredicateCall());
		predicateReferenceEClass.getESuperTypes().add(this.getPredicateCall());
		assignmentXExpressionEClass.getESuperTypes().add(this.getAssignmentExpression());
		propertyExpressionEClass.getESuperTypes().add(this.getAssignmentExpression());
		propertyValueExpressionEClass.getESuperTypes().add(this.getPropertyExpression());
		propertyReferenceExpressionEClass.getESuperTypes().add(this.getPropertyExpression());
		andExpressionEClass.getESuperTypes().add(this.getPredicateExpression());
		orExpressionEClass.getESuperTypes().add(this.getPredicateExpression());
		impliesExpressionEClass.getESuperTypes().add(this.getPredicateExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(validatorEClass, Validator.class, "Validator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidator_StartOn(), this.getStartOnSentence(), null, "startOn", null, 0, 1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidator_Body(), this.getBodySentences(), null, "body", null, 0, 1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidator_Predicates(), this.getPredicateDefinitionSentence(), null, "predicates", null, 0, -1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodySentencesEClass, BodySentences.class, "BodySentences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBodySentences_Definitions(), this.getDefinitionSentence(), null, "definitions", null, 0, -1, BodySentences.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBodySentences_Constraints(), this.getConstraintSentence(), null, "constraints", null, 0, -1, BodySentences.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBodySentences_Sentences(), this.getSentence(), null, "sentences", null, 0, -1, BodySentences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sentenceEClass, Sentence.class, "Sentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startOnSentenceEClass, StartOnSentence.class, "StartOnSentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartOnSentence_Definition(), this.getNodeDefinition(), null, "definition", null, 0, 1, StartOnSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionSentenceEClass, DefinitionSentence.class, "DefinitionSentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionSentence_Quantification(), this.getQuantification(), null, "quantification", null, 0, 1, DefinitionSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionSentence_Node(), this.getNodeDefinition(), null, "node", null, 0, 1, DefinitionSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinitionSentence_Qualifier(), this.getRelationQualifier(), "qualifier", null, 0, 1, DefinitionSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionSentence_Target(), this.getTargetDefinition(), null, "target", null, 0, 1, DefinitionSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintSentenceEClass, ConstraintSentence.class, "ConstraintSentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintSentence_Quantifications(), this.getQuantificationList(), null, "quantifications", null, 0, 1, ConstraintSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintSentence_Nodes(), this.getNodeReferenceList(), null, "nodes", null, 0, 1, ConstraintSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintSentence_Predicate(), this.getPredicateExpression(), null, "predicate", null, 0, 1, ConstraintSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateDefinitionSentenceEClass, PredicateDefinitionSentence.class, "PredicateDefinitionSentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredicateDefinitionSentence_Name(), ecorePackage.getEString(), "name", null, 0, 1, PredicateDefinitionSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateDefinitionSentence_Parameters(), this.getParameterList(), null, "parameters", null, 0, 1, PredicateDefinitionSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateDefinitionSentence_Body(), this.getBodySentences(), null, "body", null, 0, 1, PredicateDefinitionSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeDefinitionEClass, NodeDefinition.class, "NodeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, NodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDefinition_Collection(), ecorePackage.getEBoolean(), "collection", null, 0, 1, NodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeDefinition_Selectors(), this.getSelectorList(), null, "selectors", null, 0, 1, NodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeReferenceListEClass, NodeReferenceList.class, "NodeReferenceList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeReferenceList_Nodes(), this.getNodeDefinition(), null, "nodes", null, 0, -1, NodeReferenceList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetDefinitionEClass, TargetDefinition.class, "TargetDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetDefinition_Axis(), this.getAxis(), "axis", null, 0, 1, TargetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetDefinition_Local(), this.getNodeDefinition(), null, "local", null, 0, 1, TargetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetDefinition_Definition(), this.getNodeDefinition(), null, "definition", null, 0, 1, TargetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetDefinition_Body(), this.getBodySentences(), null, "body", null, 0, 1, TargetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetDefinition_Assignments(), this.getAssignmentList(), null, "assignments", null, 0, 1, TargetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorListEClass, SelectorList.class, "SelectorList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectorList_Selectors(), this.getSelectorListDef(), null, "selectors", null, 0, 1, SelectorList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorListDefEClass, SelectorListDef.class, "SelectorListDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectorListDef_Selectors(), this.getSelector(), null, "selectors", null, 0, -1, SelectorListDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorEClass, Selector.class, "Selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelector_Type(), ecorePackage.getEString(), "type", null, 0, 1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateExpressionEClass, PredicateExpression.class, "PredicateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateExpression_Lhs(), this.getPredicateExpression(), null, "lhs", null, 0, 1, PredicateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPredicateExpression_Negated(), ecorePackage.getEBoolean(), "negated", null, 0, 1, PredicateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateExpression_Call(), this.getPredicateCall(), null, "call", null, 0, 1, PredicateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateExpression_Inner(), this.getPredicateExpression(), null, "inner", null, 0, 1, PredicateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateExpression_Rhs(), this.getPredicateExpression(), null, "rhs", null, 0, 1, PredicateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateCallEClass, PredicateCall.class, "PredicateCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredicateCall_Label(), ecorePackage.getEString(), "label", null, 0, 1, PredicateCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateXExpressionEClass, PredicateXExpression.class, "PredicateXExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateXExpression_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, PredicateXExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyRelationPredicateEClass, PropertyRelationPredicate.class, "PropertyRelationPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyRelationPredicate_Lhs(), this.getPropertyExpression(), null, "lhs", null, 0, 1, PropertyRelationPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyRelationPredicate_Relation(), this.getPropertyRelation(), "relation", null, 0, 1, PropertyRelationPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyRelationPredicate_Rhs(), this.getPropertyExpression(), null, "rhs", null, 0, 1, PropertyRelationPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionSentencePredicateEClass, DefinitionSentencePredicate.class, "DefinitionSentencePredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionSentencePredicate_Sentence(), this.getDefinitionSentence(), null, "sentence", null, 0, 1, DefinitionSentencePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateReferenceEClass, PredicateReference.class, "PredicateReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateReference_Reference(), this.getPredicateDefinitionSentence(), null, "reference", null, 0, 1, PredicateReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateReference_Arguments(), this.getArgumentList(), null, "arguments", null, 0, 1, PredicateReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Node(), this.getNodeDefinition(), null, "node", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterList_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgument_Node(), this.getNodeDefinition(), null, "node", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentListEClass, ArgumentList.class, "ArgumentList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentList_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, ArgumentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_Reference(), this.getPropertyReferenceExpression(), null, "reference", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Expression(), this.getAssignmentExpression(), null, "expression", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentListEClass, AssignmentList.class, "AssignmentList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignmentList_Assignments(), this.getAssignment(), null, "assignments", null, 0, -1, AssignmentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentExpressionEClass, AssignmentExpression.class, "AssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentXExpressionEClass, AssignmentXExpression.class, "AssignmentXExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignmentXExpression_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, AssignmentXExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantificationEClass, Quantification.class, "Quantification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantification_Quantor(), this.getQuantor(), "quantor", null, 0, 1, Quantification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantification_Node(), this.getNodeDefinition(), null, "node", null, 0, 1, Quantification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantification_NodeSet(), this.getNodeDefinition(), null, "nodeSet", null, 0, 1, Quantification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantificationListEClass, QuantificationList.class, "QuantificationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantificationList_Quantifications(), this.getQuantification(), null, "quantifications", null, 0, -1, QuantificationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyExpressionEClass, PropertyExpression.class, "PropertyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyValueExpressionEClass, PropertyValueExpression.class, "PropertyValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyValueExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, PropertyValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyReferenceExpressionEClass, PropertyReferenceExpression.class, "PropertyReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyReferenceExpression_Node(), this.getNodeDefinition(), null, "node", null, 0, 1, PropertyReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyReferenceExpression_Property(), ecorePackage.getEString(), "Property", null, 0, 1, PropertyReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orExpressionEClass, OrExpression.class, "OrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(impliesExpressionEClass, ImpliesExpression.class, "ImpliesExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(quantorEEnum, Quantor.class, "Quantor");
		addEEnumLiteral(quantorEEnum, Quantor.EACH);
		addEEnumLiteral(quantorEEnum, Quantor.ANY);

		initEEnum(relationQualifierEEnum, RelationQualifier.class, "RelationQualifier");
		addEEnumLiteral(relationQualifierEEnum, RelationQualifier.MUST);
		addEEnumLiteral(relationQualifierEEnum, RelationQualifier.MUST_NOT);
		addEEnumLiteral(relationQualifierEEnum, RelationQualifier.CAN);

		initEEnum(axisEEnum, Axis.class, "Axis");
		addEEnumLiteral(axisEEnum, Axis.PARENT);
		addEEnumLiteral(axisEEnum, Axis.CHILD);
		addEEnumLiteral(axisEEnum, Axis.ANCESTOR);
		addEEnumLiteral(axisEEnum, Axis.DESCENDANT);
		addEEnumLiteral(axisEEnum, Axis.PARENTS);
		addEEnumLiteral(axisEEnum, Axis.CHILDREN);
		addEEnumLiteral(axisEEnum, Axis.ANCESTORS);
		addEEnumLiteral(axisEEnum, Axis.DESCENDANTS);

		initEEnum(propertyRelationEEnum, PropertyRelation.class, "PropertyRelation");
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.EQUALS);
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.NOT_EQUALS);
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.GREATER);
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.LESSER);
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.GREATER_EQUALS);
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.LESSER_EQUALS);

		// Create resource
		createResource(eNS_URI);
	}

} //DslPackageImpl