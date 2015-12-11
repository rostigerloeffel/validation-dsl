/**
 */
package com.isax.validation.dsl.dsl.impl;

import com.isax.validation.dsl.dsl.Ancestor;
import com.isax.validation.dsl.dsl.AndExpression;
import com.isax.validation.dsl.dsl.Argument;
import com.isax.validation.dsl.dsl.ArgumentList;
import com.isax.validation.dsl.dsl.AssignmentExpression;
import com.isax.validation.dsl.dsl.AssignmentList;
import com.isax.validation.dsl.dsl.AssignmentXExpression;
import com.isax.validation.dsl.dsl.AtLeast;
import com.isax.validation.dsl.dsl.AtMost;
import com.isax.validation.dsl.dsl.BodySentences;
import com.isax.validation.dsl.dsl.CanHave;
import com.isax.validation.dsl.dsl.Child;
import com.isax.validation.dsl.dsl.ConstraintSentence;
import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.DefinitionSentencePredicate;
import com.isax.validation.dsl.dsl.Descendant;
import com.isax.validation.dsl.dsl.DslFactory;
import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.EClassSelector;
import com.isax.validation.dsl.dsl.ErrorDefinition;
import com.isax.validation.dsl.dsl.Exactly;
import com.isax.validation.dsl.dsl.IDSelector;
import com.isax.validation.dsl.dsl.ImpliesExpression;
import com.isax.validation.dsl.dsl.Model;
import com.isax.validation.dsl.dsl.Multiple;
import com.isax.validation.dsl.dsl.MustHave;
import com.isax.validation.dsl.dsl.MustNotHave;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.NodeReferenceList;
import com.isax.validation.dsl.dsl.One;
import com.isax.validation.dsl.dsl.OrExpression;
import com.isax.validation.dsl.dsl.Parameter;
import com.isax.validation.dsl.dsl.ParameterList;
import com.isax.validation.dsl.dsl.Parent;
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
import com.isax.validation.dsl.dsl.RelationAxis;
import com.isax.validation.dsl.dsl.RelationKind;
import com.isax.validation.dsl.dsl.RelationQualifier;
import com.isax.validation.dsl.dsl.RelationQuantifier;
import com.isax.validation.dsl.dsl.Selector;
import com.isax.validation.dsl.dsl.SelectorList;
import com.isax.validation.dsl.dsl.SelectorListDef;
import com.isax.validation.dsl.dsl.Sentence;
import com.isax.validation.dsl.dsl.StartOnSentence;
import com.isax.validation.dsl.dsl.TargetDefinition;
import com.isax.validation.dsl.dsl.Validator;
import com.isax.validation.dsl.dsl.XXAssignment;
import com.isax.validation.dsl.dsl.XXPropertyExpression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xtype.XtypePackage;

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
	private EClass xxAssignmentEClass = null;

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
	private EClass xxPropertyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationQualifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mustHaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mustNotHaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canHaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationQuantifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atLeastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atMostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exactlyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationAxisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ancestorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descendantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassSelectorEClass = null;

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
	private EEnum propertyRelationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationKindEEnum = null;

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
		XtypePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

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
	public EReference getValidator_Errors()
	{
		return (EReference)validatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidator_Name()
	{
		return (EAttribute)validatorEClass.getEStructuralFeatures().get(4);
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
	public EReference getDefinitionSentence_Target()
	{
		return (EReference)definitionSentenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionSentence_Qualifier()
	{
		return (EReference)definitionSentenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionSentence_Quantifier()
	{
		return (EReference)definitionSentenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionSentence_Axis()
	{
		return (EReference)definitionSentenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitionSentence_Kind()
	{
		return (EAttribute)definitionSentenceEClass.getEStructuralFeatures().get(6);
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
	public EReference getConstraintSentence_Predicate()
	{
		return (EReference)constraintSentenceEClass.getEStructuralFeatures().get(1);
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
	public EReference getTargetDefinition_Local()
	{
		return (EReference)targetDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetDefinition_Definition()
	{
		return (EReference)targetDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetDefinition_Body()
	{
		return (EReference)targetDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetDefinition_Then()
	{
		return (EReference)targetDefinitionEClass.getEStructuralFeatures().get(3);
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
	public EReference getPredicateCall_Error()
	{
		return (EReference)predicateCallEClass.getEStructuralFeatures().get(0);
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
	public EClass getXXAssignment()
	{
		return xxAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXXAssignment_Expression()
	{
		return (EReference)xxAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXXAssignment_Node()
	{
		return (EReference)xxAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXXAssignment_Property()
	{
		return (EAttribute)xxAssignmentEClass.getEStructuralFeatures().get(2);
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
	public EClass getXXPropertyExpression()
	{
		return xxPropertyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXXPropertyExpression_Node()
	{
		return (EReference)xxPropertyExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXXPropertyExpression_Name()
	{
		return (EAttribute)xxPropertyExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationQualifier()
	{
		return relationQualifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMustHave()
	{
		return mustHaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMustNotHave()
	{
		return mustNotHaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanHave()
	{
		return canHaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationQuantifier()
	{
		return relationQuantifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationQuantifier_Quantity()
	{
		return (EAttribute)relationQuantifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOne()
	{
		return oneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiple()
	{
		return multipleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtLeast()
	{
		return atLeastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtMost()
	{
		return atMostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExactly()
	{
		return exactlyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationAxis()
	{
		return relationAxisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParent()
	{
		return parentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChild()
	{
		return childEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAncestor()
	{
		return ancestorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescendant()
	{
		return descendantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorDefinition()
	{
		return errorDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorDefinition_Name()
	{
		return (EAttribute)errorDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorDefinition_Text()
	{
		return (EAttribute)errorDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel()
	{
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Validators()
	{
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Imports()
	{
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Referred()
	{
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDSelector()
	{
		return idSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDSelector_Id()
	{
		return (EAttribute)idSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassSelector()
	{
		return eClassSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassSelector_Class()
	{
		return (EReference)eClassSelectorEClass.getEStructuralFeatures().get(0);
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
	public EEnum getPropertyRelation()
	{
		return propertyRelationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationKind()
	{
		return relationKindEEnum;
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
		createEReference(validatorEClass, VALIDATOR__ERRORS);
		createEAttribute(validatorEClass, VALIDATOR__NAME);

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
		createEReference(definitionSentenceEClass, DEFINITION_SENTENCE__TARGET);
		createEReference(definitionSentenceEClass, DEFINITION_SENTENCE__QUALIFIER);
		createEReference(definitionSentenceEClass, DEFINITION_SENTENCE__QUANTIFIER);
		createEReference(definitionSentenceEClass, DEFINITION_SENTENCE__AXIS);
		createEAttribute(definitionSentenceEClass, DEFINITION_SENTENCE__KIND);

		constraintSentenceEClass = createEClass(CONSTRAINT_SENTENCE);
		createEReference(constraintSentenceEClass, CONSTRAINT_SENTENCE__QUANTIFICATIONS);
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
		createEReference(targetDefinitionEClass, TARGET_DEFINITION__LOCAL);
		createEReference(targetDefinitionEClass, TARGET_DEFINITION__DEFINITION);
		createEReference(targetDefinitionEClass, TARGET_DEFINITION__BODY);
		createEReference(targetDefinitionEClass, TARGET_DEFINITION__THEN);

		selectorListEClass = createEClass(SELECTOR_LIST);
		createEReference(selectorListEClass, SELECTOR_LIST__SELECTORS);

		selectorListDefEClass = createEClass(SELECTOR_LIST_DEF);
		createEReference(selectorListDefEClass, SELECTOR_LIST_DEF__SELECTORS);

		selectorEClass = createEClass(SELECTOR);

		predicateExpressionEClass = createEClass(PREDICATE_EXPRESSION);
		createEReference(predicateExpressionEClass, PREDICATE_EXPRESSION__LHS);
		createEAttribute(predicateExpressionEClass, PREDICATE_EXPRESSION__NEGATED);
		createEReference(predicateExpressionEClass, PREDICATE_EXPRESSION__CALL);
		createEReference(predicateExpressionEClass, PREDICATE_EXPRESSION__INNER);
		createEReference(predicateExpressionEClass, PREDICATE_EXPRESSION__RHS);

		predicateCallEClass = createEClass(PREDICATE_CALL);
		createEReference(predicateCallEClass, PREDICATE_CALL__ERROR);

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

		xxAssignmentEClass = createEClass(XX_ASSIGNMENT);
		createEReference(xxAssignmentEClass, XX_ASSIGNMENT__EXPRESSION);
		createEReference(xxAssignmentEClass, XX_ASSIGNMENT__NODE);
		createEAttribute(xxAssignmentEClass, XX_ASSIGNMENT__PROPERTY);

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

		xxPropertyExpressionEClass = createEClass(XX_PROPERTY_EXPRESSION);
		createEReference(xxPropertyExpressionEClass, XX_PROPERTY_EXPRESSION__NODE);
		createEAttribute(xxPropertyExpressionEClass, XX_PROPERTY_EXPRESSION__NAME);

		relationQualifierEClass = createEClass(RELATION_QUALIFIER);

		mustHaveEClass = createEClass(MUST_HAVE);

		mustNotHaveEClass = createEClass(MUST_NOT_HAVE);

		canHaveEClass = createEClass(CAN_HAVE);

		relationQuantifierEClass = createEClass(RELATION_QUANTIFIER);
		createEAttribute(relationQuantifierEClass, RELATION_QUANTIFIER__QUANTITY);

		oneEClass = createEClass(ONE);

		multipleEClass = createEClass(MULTIPLE);

		atLeastEClass = createEClass(AT_LEAST);

		atMostEClass = createEClass(AT_MOST);

		exactlyEClass = createEClass(EXACTLY);

		relationAxisEClass = createEClass(RELATION_AXIS);

		parentEClass = createEClass(PARENT);

		childEClass = createEClass(CHILD);

		ancestorEClass = createEClass(ANCESTOR);

		descendantEClass = createEClass(DESCENDANT);

		errorDefinitionEClass = createEClass(ERROR_DEFINITION);
		createEAttribute(errorDefinitionEClass, ERROR_DEFINITION__NAME);
		createEAttribute(errorDefinitionEClass, ERROR_DEFINITION__TEXT);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__VALIDATORS);
		createEReference(modelEClass, MODEL__IMPORTS);
		createEReference(modelEClass, MODEL__REFERRED);

		idSelectorEClass = createEClass(ID_SELECTOR);
		createEAttribute(idSelectorEClass, ID_SELECTOR__ID);

		eClassSelectorEClass = createEClass(ECLASS_SELECTOR);
		createEReference(eClassSelectorEClass, ECLASS_SELECTOR__CLASS);

		// Create enums
		quantorEEnum = createEEnum(QUANTOR);
		propertyRelationEEnum = createEEnum(PROPERTY_RELATION);
		relationKindEEnum = createEEnum(RELATION_KIND);
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
		XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

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
		xxAssignmentEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		assignmentXExpressionEClass.getESuperTypes().add(this.getAssignmentExpression());
		propertyExpressionEClass.getESuperTypes().add(this.getAssignmentExpression());
		propertyValueExpressionEClass.getESuperTypes().add(this.getPropertyExpression());
		propertyReferenceExpressionEClass.getESuperTypes().add(this.getPropertyExpression());
		andExpressionEClass.getESuperTypes().add(this.getPredicateExpression());
		orExpressionEClass.getESuperTypes().add(this.getPredicateExpression());
		impliesExpressionEClass.getESuperTypes().add(this.getPredicateExpression());
		xxPropertyExpressionEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		mustHaveEClass.getESuperTypes().add(this.getRelationQualifier());
		mustNotHaveEClass.getESuperTypes().add(this.getRelationQualifier());
		canHaveEClass.getESuperTypes().add(this.getRelationQualifier());
		oneEClass.getESuperTypes().add(this.getRelationQuantifier());
		multipleEClass.getESuperTypes().add(this.getRelationQuantifier());
		atLeastEClass.getESuperTypes().add(this.getRelationQuantifier());
		atMostEClass.getESuperTypes().add(this.getRelationQuantifier());
		exactlyEClass.getESuperTypes().add(this.getRelationQuantifier());
		parentEClass.getESuperTypes().add(this.getRelationAxis());
		childEClass.getESuperTypes().add(this.getRelationAxis());
		ancestorEClass.getESuperTypes().add(this.getRelationAxis());
		descendantEClass.getESuperTypes().add(this.getRelationAxis());
		idSelectorEClass.getESuperTypes().add(this.getSelector());
		eClassSelectorEClass.getESuperTypes().add(this.getSelector());

		// Initialize classes and features; add operations and parameters
		initEClass(validatorEClass, Validator.class, "Validator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidator_StartOn(), this.getStartOnSentence(), null, "startOn", null, 0, 1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidator_Body(), this.getBodySentences(), null, "body", null, 0, 1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidator_Predicates(), this.getPredicateDefinitionSentence(), null, "predicates", null, 0, -1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidator_Errors(), this.getErrorDefinition(), null, "errors", null, 0, -1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidator_Name(), ecorePackage.getEString(), "name", null, 1, 1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getDefinitionSentence_Target(), this.getTargetDefinition(), null, "target", null, 0, 1, DefinitionSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionSentence_Qualifier(), this.getRelationQualifier(), null, "qualifier", null, 1, 1, DefinitionSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionSentence_Quantifier(), this.getRelationQuantifier(), null, "quantifier", null, 1, 1, DefinitionSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionSentence_Axis(), this.getRelationAxis(), null, "axis", null, 1, 1, DefinitionSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinitionSentence_Kind(), this.getRelationKind(), "kind", null, 0, 1, DefinitionSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintSentenceEClass, ConstraintSentence.class, "ConstraintSentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintSentence_Quantifications(), this.getQuantificationList(), null, "quantifications", null, 0, 1, ConstraintSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getTargetDefinition_Local(), this.getNodeDefinition(), null, "local", null, 0, 1, TargetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetDefinition_Definition(), this.getNodeDefinition(), null, "definition", null, 0, 1, TargetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetDefinition_Body(), this.getBodySentences(), null, "body", null, 0, 1, TargetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetDefinition_Then(), theXbasePackage.getXExpression(), null, "then", null, 0, 1, TargetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorListEClass, SelectorList.class, "SelectorList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectorList_Selectors(), this.getSelectorListDef(), null, "selectors", null, 0, 1, SelectorList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorListDefEClass, SelectorListDef.class, "SelectorListDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectorListDef_Selectors(), this.getSelector(), null, "selectors", null, 0, -1, SelectorListDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorEClass, Selector.class, "Selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predicateExpressionEClass, PredicateExpression.class, "PredicateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateExpression_Lhs(), this.getPredicateExpression(), null, "lhs", null, 0, 1, PredicateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPredicateExpression_Negated(), ecorePackage.getEBoolean(), "negated", null, 0, 1, PredicateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateExpression_Call(), this.getPredicateCall(), null, "call", null, 0, 1, PredicateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateExpression_Inner(), this.getPredicateExpression(), null, "inner", null, 0, 1, PredicateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateExpression_Rhs(), this.getPredicateExpression(), null, "rhs", null, 0, 1, PredicateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateCallEClass, PredicateCall.class, "PredicateCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateCall_Error(), this.getErrorDefinition(), null, "error", null, 0, 1, PredicateCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(xxAssignmentEClass, XXAssignment.class, "XXAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXXAssignment_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 1, 1, XXAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXXAssignment_Node(), this.getNodeDefinition(), null, "node", null, 1, 1, XXAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXXAssignment_Property(), ecorePackage.getEString(), "property", null, 1, 1, XXAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentListEClass, AssignmentList.class, "AssignmentList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignmentList_Assignments(), this.getXXAssignment(), null, "assignments", null, 0, -1, AssignmentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(xxPropertyExpressionEClass, XXPropertyExpression.class, "XXPropertyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXXPropertyExpression_Node(), this.getNodeDefinition(), null, "node", null, 1, 1, XXPropertyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXXPropertyExpression_Name(), ecorePackage.getEString(), "name", null, 1, 1, XXPropertyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationQualifierEClass, RelationQualifier.class, "RelationQualifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mustHaveEClass, MustHave.class, "MustHave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mustNotHaveEClass, MustNotHave.class, "MustNotHave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(canHaveEClass, CanHave.class, "CanHave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationQuantifierEClass, RelationQuantifier.class, "RelationQuantifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationQuantifier_Quantity(), ecorePackage.getEInt(), "quantity", null, 1, 1, RelationQuantifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneEClass, One.class, "One", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleEClass, Multiple.class, "Multiple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atLeastEClass, AtLeast.class, "AtLeast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atMostEClass, AtMost.class, "AtMost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exactlyEClass, Exactly.class, "Exactly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationAxisEClass, RelationAxis.class, "RelationAxis", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parentEClass, Parent.class, "Parent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(childEClass, Child.class, "Child", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ancestorEClass, Ancestor.class, "Ancestor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descendantEClass, Descendant.class, "Descendant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorDefinitionEClass, ErrorDefinition.class, "ErrorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, ErrorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorDefinition_Text(), ecorePackage.getEString(), "text", null, 1, 1, ErrorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Validators(), this.getValidator(), null, "validators", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Imports(), theXtypePackage.getXImportSection(), null, "imports", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Referred(), theEcorePackage.getEPackage(), null, "referred", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idSelectorEClass, IDSelector.class, "IDSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDSelector_Id(), theEcorePackage.getEString(), "id", null, 1, 1, IDSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassSelectorEClass, EClassSelector.class, "EClassSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassSelector_Class(), theEcorePackage.getEClass(), null, "class", null, 1, 1, EClassSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(quantorEEnum, Quantor.class, "Quantor");
		addEEnumLiteral(quantorEEnum, Quantor.EACH);
		addEEnumLiteral(quantorEEnum, Quantor.ANY);

		initEEnum(propertyRelationEEnum, PropertyRelation.class, "PropertyRelation");
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.EQUALS);
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.NOT_EQUALS);
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.GREATER);
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.LESSER);
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.GREATER_EQUALS);
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.LESSER_EQUALS);
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.CONTAINS);
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.NOT_CONTAINS);
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.INTERSECTS);
		addEEnumLiteral(propertyRelationEEnum, PropertyRelation.SUBSET_OF);

		initEEnum(relationKindEEnum, RelationKind.class, "RelationKind");
		addEEnumLiteral(relationKindEEnum, RelationKind.BOTH);
		addEEnumLiteral(relationKindEEnum, RelationKind.SECONDARY);
		addEEnumLiteral(relationKindEEnum, RelationKind.PRIMARY);

		// Create resource
		createResource(eNS_URI);
	}

} //DslPackageImpl
