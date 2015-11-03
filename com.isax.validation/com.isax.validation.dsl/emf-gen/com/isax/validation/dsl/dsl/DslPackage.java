/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.isax.validation.dsl.dsl.DslFactory
 * @model kind="package"
 * @generated
 */
public interface DslPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.isax.com/validation/dsl/Dsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslPackage eINSTANCE = com.isax.validation.dsl.dsl.impl.DslPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.ValidatorImpl <em>Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.ValidatorImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getValidator()
	 * @generated
	 */
	int VALIDATOR = 0;

	/**
	 * The feature id for the '<em><b>Start On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR__START_ON = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR__BODY = 1;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR__PREDICATES = 2;

	/**
	 * The number of structural features of the '<em>Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.BodySentencesImpl <em>Body Sentences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.BodySentencesImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getBodySentences()
	 * @generated
	 */
	int BODY_SENTENCES = 1;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_SENTENCES__DEFINITIONS = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_SENTENCES__CONSTRAINTS = 1;

	/**
	 * The number of structural features of the '<em>Body Sentences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_SENTENCES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.SentenceImpl <em>Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.SentenceImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getSentence()
	 * @generated
	 */
	int SENTENCE = 2;

	/**
	 * The number of structural features of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.StartOnSentenceImpl <em>Start On Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.StartOnSentenceImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getStartOnSentence()
	 * @generated
	 */
	int START_ON_SENTENCE = 3;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ON_SENTENCE__DEFINITION = SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start On Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ON_SENTENCE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.DefinitionSentenceImpl <em>Definition Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.DefinitionSentenceImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getDefinitionSentence()
	 * @generated
	 */
	int DEFINITION_SENTENCE = 4;

	/**
	 * The feature id for the '<em><b>Quantification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SENTENCE__QUANTIFICATION = SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SENTENCE__NODE = SENTENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SENTENCE__QUALIFIER = SENTENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SENTENCE__TARGET = SENTENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Definition Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SENTENCE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.ConstraintSentenceImpl <em>Constraint Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.ConstraintSentenceImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getConstraintSentence()
	 * @generated
	 */
	int CONSTRAINT_SENTENCE = 5;

	/**
	 * The feature id for the '<em><b>Quantifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SENTENCE__QUANTIFICATIONS = SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SENTENCE__NODES = SENTENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SENTENCE__PREDICATE = SENTENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SENTENCE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.PredicateDefinitionSentenceImpl <em>Predicate Definition Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.PredicateDefinitionSentenceImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPredicateDefinitionSentence()
	 * @generated
	 */
	int PREDICATE_DEFINITION_SENTENCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION_SENTENCE__NAME = SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION_SENTENCE__PARAMETERS = SENTENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION_SENTENCE__BODY = SENTENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Predicate Definition Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION_SENTENCE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.NodeDefinitionImpl <em>Node Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.NodeDefinitionImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getNodeDefinition()
	 * @generated
	 */
	int NODE_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION__COLLECTION = 1;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION__SELECTORS = 2;

	/**
	 * The number of structural features of the '<em>Node Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.NodeReferenceListImpl <em>Node Reference List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.NodeReferenceListImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getNodeReferenceList()
	 * @generated
	 */
	int NODE_REFERENCE_LIST = 8;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REFERENCE_LIST__NODES = 0;

	/**
	 * The number of structural features of the '<em>Node Reference List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REFERENCE_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl <em>Target Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getTargetDefinition()
	 * @generated
	 */
	int TARGET_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DEFINITION__AXIS = 0;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DEFINITION__LOCAL = 1;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DEFINITION__DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DEFINITION__BODY = 3;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DEFINITION__ASSIGNMENTS = 4;

	/**
	 * The number of structural features of the '<em>Target Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.SelectorListImpl <em>Selector List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.SelectorListImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getSelectorList()
	 * @generated
	 */
	int SELECTOR_LIST = 10;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_LIST__SELECTORS = 0;

	/**
	 * The number of structural features of the '<em>Selector List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.SelectorListDefImpl <em>Selector List Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.SelectorListDefImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getSelectorListDef()
	 * @generated
	 */
	int SELECTOR_LIST_DEF = 11;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_LIST_DEF__SELECTORS = 0;

	/**
	 * The number of structural features of the '<em>Selector List Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_LIST_DEF_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.SelectorImpl <em>Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.SelectorImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getSelector()
	 * @generated
	 */
	int SELECTOR = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.PredicateExpressionImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPredicateExpression()
	 * @generated
	 */
	int PREDICATE_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPRESSION__LHS = 0;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPRESSION__NEGATED = 1;

	/**
	 * The feature id for the '<em><b>Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPRESSION__CALL = 2;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPRESSION__INNER = 3;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPRESSION__RHS = 4;

	/**
	 * The number of structural features of the '<em>Predicate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPRESSION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.PredicateCallImpl <em>Predicate Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.PredicateCallImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPredicateCall()
	 * @generated
	 */
	int PREDICATE_CALL = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_CALL__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Predicate Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_CALL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.PredicateXExpressionImpl <em>Predicate XExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.PredicateXExpressionImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPredicateXExpression()
	 * @generated
	 */
	int PREDICATE_XEXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_XEXPRESSION__LABEL = PREDICATE_CALL__LABEL;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_XEXPRESSION__EXPRESSION = PREDICATE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicate XExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_XEXPRESSION_FEATURE_COUNT = PREDICATE_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.PropertyRelationPredicateImpl <em>Property Relation Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.PropertyRelationPredicateImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPropertyRelationPredicate()
	 * @generated
	 */
	int PROPERTY_RELATION_PREDICATE = 16;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_RELATION_PREDICATE__LABEL = PREDICATE_CALL__LABEL;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_RELATION_PREDICATE__LHS = PREDICATE_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_RELATION_PREDICATE__RELATION = PREDICATE_CALL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_RELATION_PREDICATE__RHS = PREDICATE_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Relation Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_RELATION_PREDICATE_FEATURE_COUNT = PREDICATE_CALL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.DefinitionSentencePredicateImpl <em>Definition Sentence Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.DefinitionSentencePredicateImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getDefinitionSentencePredicate()
	 * @generated
	 */
	int DEFINITION_SENTENCE_PREDICATE = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SENTENCE_PREDICATE__LABEL = PREDICATE_CALL__LABEL;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SENTENCE_PREDICATE__SENTENCE = PREDICATE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definition Sentence Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SENTENCE_PREDICATE_FEATURE_COUNT = PREDICATE_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.PredicateReferenceImpl <em>Predicate Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.PredicateReferenceImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPredicateReference()
	 * @generated
	 */
	int PREDICATE_REFERENCE = 18;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_REFERENCE__LABEL = PREDICATE_CALL__LABEL;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_REFERENCE__REFERENCE = PREDICATE_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_REFERENCE__ARGUMENTS = PREDICATE_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_REFERENCE_FEATURE_COUNT = PREDICATE_CALL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.ParameterImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 19;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NODE = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.ParameterListImpl <em>Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.ParameterListImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getParameterList()
	 * @generated
	 */
	int PARAMETER_LIST = 20;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.ArgumentImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 21;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NODE = 0;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.ArgumentListImpl <em>Argument List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.ArgumentListImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getArgumentList()
	 * @generated
	 */
	int ARGUMENT_LIST = 22;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LIST__ARGUMENTS = 0;

	/**
	 * The number of structural features of the '<em>Argument List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.AssignmentImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 23;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.AssignmentListImpl <em>Assignment List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.AssignmentListImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getAssignmentList()
	 * @generated
	 */
	int ASSIGNMENT_LIST = 24;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LIST__ASSIGNMENTS = 0;

	/**
	 * The number of structural features of the '<em>Assignment List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.AssignmentExpressionImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getAssignmentExpression()
	 * @generated
	 */
	int ASSIGNMENT_EXPRESSION = 25;

	/**
	 * The number of structural features of the '<em>Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.AssignmentXExpressionImpl <em>Assignment XExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.AssignmentXExpressionImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getAssignmentXExpression()
	 * @generated
	 */
	int ASSIGNMENT_XEXPRESSION = 26;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_XEXPRESSION__EXPRESSION = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assignment XExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_XEXPRESSION_FEATURE_COUNT = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.QuantificationImpl <em>Quantification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.QuantificationImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getQuantification()
	 * @generated
	 */
	int QUANTIFICATION = 27;

	/**
	 * The feature id for the '<em><b>Quantor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__QUANTOR = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__NODE = 1;

	/**
	 * The feature id for the '<em><b>Node Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__NODE_SET = 2;

	/**
	 * The number of structural features of the '<em>Quantification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.QuantificationListImpl <em>Quantification List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.QuantificationListImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getQuantificationList()
	 * @generated
	 */
	int QUANTIFICATION_LIST = 28;

	/**
	 * The feature id for the '<em><b>Quantifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION_LIST__QUANTIFICATIONS = 0;

	/**
	 * The number of structural features of the '<em>Quantification List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.PropertyExpressionImpl <em>Property Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.PropertyExpressionImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPropertyExpression()
	 * @generated
	 */
	int PROPERTY_EXPRESSION = 29;

	/**
	 * The number of structural features of the '<em>Property Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EXPRESSION_FEATURE_COUNT = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.PropertyValueExpressionImpl <em>Property Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.PropertyValueExpressionImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPropertyValueExpression()
	 * @generated
	 */
	int PROPERTY_VALUE_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_EXPRESSION__VALUE = PROPERTY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_EXPRESSION_FEATURE_COUNT = PROPERTY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.PropertyReferenceExpressionImpl <em>Property Reference Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.PropertyReferenceExpressionImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPropertyReferenceExpression()
	 * @generated
	 */
	int PROPERTY_REFERENCE_EXPRESSION = 31;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE_EXPRESSION__NODE = PROPERTY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE_EXPRESSION__PROPERTY = PROPERTY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE_EXPRESSION_FEATURE_COUNT = PROPERTY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.AndExpressionImpl <em>And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.AndExpressionImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getAndExpression()
	 * @generated
	 */
	int AND_EXPRESSION = 32;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__LHS = PREDICATE_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__NEGATED = PREDICATE_EXPRESSION__NEGATED;

	/**
	 * The feature id for the '<em><b>Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__CALL = PREDICATE_EXPRESSION__CALL;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__INNER = PREDICATE_EXPRESSION__INNER;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__RHS = PREDICATE_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.OrExpressionImpl <em>Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.OrExpressionImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getOrExpression()
	 * @generated
	 */
	int OR_EXPRESSION = 33;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__LHS = PREDICATE_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__NEGATED = PREDICATE_EXPRESSION__NEGATED;

	/**
	 * The feature id for the '<em><b>Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__CALL = PREDICATE_EXPRESSION__CALL;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__INNER = PREDICATE_EXPRESSION__INNER;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__RHS = PREDICATE_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.impl.ImpliesExpressionImpl <em>Implies Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.impl.ImpliesExpressionImpl
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getImpliesExpression()
	 * @generated
	 */
	int IMPLIES_EXPRESSION = 34;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION__LHS = PREDICATE_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION__NEGATED = PREDICATE_EXPRESSION__NEGATED;

	/**
	 * The feature id for the '<em><b>Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION__CALL = PREDICATE_EXPRESSION__CALL;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION__INNER = PREDICATE_EXPRESSION__INNER;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION__RHS = PREDICATE_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Implies Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.Quantor <em>Quantor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.Quantor
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getQuantor()
	 * @generated
	 */
	int QUANTOR = 35;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.RelationQualifier <em>Relation Qualifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.RelationQualifier
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getRelationQualifier()
	 * @generated
	 */
	int RELATION_QUALIFIER = 36;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.Axis <em>Axis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.Axis
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 37;

	/**
	 * The meta object id for the '{@link com.isax.validation.dsl.dsl.PropertyRelation <em>Property Relation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.isax.validation.dsl.dsl.PropertyRelation
	 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPropertyRelation()
	 * @generated
	 */
	int PROPERTY_RELATION = 38;


	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.Validator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validator</em>'.
	 * @see com.isax.validation.dsl.dsl.Validator
	 * @generated
	 */
	EClass getValidator();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.Validator#getStartOn <em>Start On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start On</em>'.
	 * @see com.isax.validation.dsl.dsl.Validator#getStartOn()
	 * @see #getValidator()
	 * @generated
	 */
	EReference getValidator_StartOn();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.Validator#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see com.isax.validation.dsl.dsl.Validator#getBody()
	 * @see #getValidator()
	 * @generated
	 */
	EReference getValidator_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link com.isax.validation.dsl.dsl.Validator#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicates</em>'.
	 * @see com.isax.validation.dsl.dsl.Validator#getPredicates()
	 * @see #getValidator()
	 * @generated
	 */
	EReference getValidator_Predicates();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.BodySentences <em>Body Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Sentences</em>'.
	 * @see com.isax.validation.dsl.dsl.BodySentences
	 * @generated
	 */
	EClass getBodySentences();

	/**
	 * Returns the meta object for the containment reference list '{@link com.isax.validation.dsl.dsl.BodySentences#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see com.isax.validation.dsl.dsl.BodySentences#getDefinitions()
	 * @see #getBodySentences()
	 * @generated
	 */
	EReference getBodySentences_Definitions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.isax.validation.dsl.dsl.BodySentences#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see com.isax.validation.dsl.dsl.BodySentences#getConstraints()
	 * @see #getBodySentences()
	 * @generated
	 */
	EReference getBodySentences_Constraints();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.Sentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentence</em>'.
	 * @see com.isax.validation.dsl.dsl.Sentence
	 * @generated
	 */
	EClass getSentence();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.StartOnSentence <em>Start On Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start On Sentence</em>'.
	 * @see com.isax.validation.dsl.dsl.StartOnSentence
	 * @generated
	 */
	EClass getStartOnSentence();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.StartOnSentence#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see com.isax.validation.dsl.dsl.StartOnSentence#getDefinition()
	 * @see #getStartOnSentence()
	 * @generated
	 */
	EReference getStartOnSentence_Definition();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.DefinitionSentence <em>Definition Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Sentence</em>'.
	 * @see com.isax.validation.dsl.dsl.DefinitionSentence
	 * @generated
	 */
	EClass getDefinitionSentence();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.DefinitionSentence#getQuantification <em>Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantification</em>'.
	 * @see com.isax.validation.dsl.dsl.DefinitionSentence#getQuantification()
	 * @see #getDefinitionSentence()
	 * @generated
	 */
	EReference getDefinitionSentence_Quantification();

	/**
	 * Returns the meta object for the reference '{@link com.isax.validation.dsl.dsl.DefinitionSentence#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see com.isax.validation.dsl.dsl.DefinitionSentence#getNode()
	 * @see #getDefinitionSentence()
	 * @generated
	 */
	EReference getDefinitionSentence_Node();

	/**
	 * Returns the meta object for the attribute '{@link com.isax.validation.dsl.dsl.DefinitionSentence#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see com.isax.validation.dsl.dsl.DefinitionSentence#getQualifier()
	 * @see #getDefinitionSentence()
	 * @generated
	 */
	EAttribute getDefinitionSentence_Qualifier();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.DefinitionSentence#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see com.isax.validation.dsl.dsl.DefinitionSentence#getTarget()
	 * @see #getDefinitionSentence()
	 * @generated
	 */
	EReference getDefinitionSentence_Target();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.ConstraintSentence <em>Constraint Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Sentence</em>'.
	 * @see com.isax.validation.dsl.dsl.ConstraintSentence
	 * @generated
	 */
	EClass getConstraintSentence();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.ConstraintSentence#getQuantifications <em>Quantifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantifications</em>'.
	 * @see com.isax.validation.dsl.dsl.ConstraintSentence#getQuantifications()
	 * @see #getConstraintSentence()
	 * @generated
	 */
	EReference getConstraintSentence_Quantifications();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.ConstraintSentence#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nodes</em>'.
	 * @see com.isax.validation.dsl.dsl.ConstraintSentence#getNodes()
	 * @see #getConstraintSentence()
	 * @generated
	 */
	EReference getConstraintSentence_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.ConstraintSentence#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see com.isax.validation.dsl.dsl.ConstraintSentence#getPredicate()
	 * @see #getConstraintSentence()
	 * @generated
	 */
	EReference getConstraintSentence_Predicate();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.PredicateDefinitionSentence <em>Predicate Definition Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Definition Sentence</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateDefinitionSentence
	 * @generated
	 */
	EClass getPredicateDefinitionSentence();

	/**
	 * Returns the meta object for the attribute '{@link com.isax.validation.dsl.dsl.PredicateDefinitionSentence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateDefinitionSentence#getName()
	 * @see #getPredicateDefinitionSentence()
	 * @generated
	 */
	EAttribute getPredicateDefinitionSentence_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.PredicateDefinitionSentence#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateDefinitionSentence#getParameters()
	 * @see #getPredicateDefinitionSentence()
	 * @generated
	 */
	EReference getPredicateDefinitionSentence_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.PredicateDefinitionSentence#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateDefinitionSentence#getBody()
	 * @see #getPredicateDefinitionSentence()
	 * @generated
	 */
	EReference getPredicateDefinitionSentence_Body();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.NodeDefinition <em>Node Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Definition</em>'.
	 * @see com.isax.validation.dsl.dsl.NodeDefinition
	 * @generated
	 */
	EClass getNodeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link com.isax.validation.dsl.dsl.NodeDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.isax.validation.dsl.dsl.NodeDefinition#getName()
	 * @see #getNodeDefinition()
	 * @generated
	 */
	EAttribute getNodeDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.isax.validation.dsl.dsl.NodeDefinition#isCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection</em>'.
	 * @see com.isax.validation.dsl.dsl.NodeDefinition#isCollection()
	 * @see #getNodeDefinition()
	 * @generated
	 */
	EAttribute getNodeDefinition_Collection();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.NodeDefinition#getSelectors <em>Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selectors</em>'.
	 * @see com.isax.validation.dsl.dsl.NodeDefinition#getSelectors()
	 * @see #getNodeDefinition()
	 * @generated
	 */
	EReference getNodeDefinition_Selectors();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.NodeReferenceList <em>Node Reference List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Reference List</em>'.
	 * @see com.isax.validation.dsl.dsl.NodeReferenceList
	 * @generated
	 */
	EClass getNodeReferenceList();

	/**
	 * Returns the meta object for the reference list '{@link com.isax.validation.dsl.dsl.NodeReferenceList#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see com.isax.validation.dsl.dsl.NodeReferenceList#getNodes()
	 * @see #getNodeReferenceList()
	 * @generated
	 */
	EReference getNodeReferenceList_Nodes();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.TargetDefinition <em>Target Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Definition</em>'.
	 * @see com.isax.validation.dsl.dsl.TargetDefinition
	 * @generated
	 */
	EClass getTargetDefinition();

	/**
	 * Returns the meta object for the attribute '{@link com.isax.validation.dsl.dsl.TargetDefinition#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see com.isax.validation.dsl.dsl.TargetDefinition#getAxis()
	 * @see #getTargetDefinition()
	 * @generated
	 */
	EAttribute getTargetDefinition_Axis();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.TargetDefinition#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see com.isax.validation.dsl.dsl.TargetDefinition#getLocal()
	 * @see #getTargetDefinition()
	 * @generated
	 */
	EReference getTargetDefinition_Local();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.TargetDefinition#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see com.isax.validation.dsl.dsl.TargetDefinition#getDefinition()
	 * @see #getTargetDefinition()
	 * @generated
	 */
	EReference getTargetDefinition_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.TargetDefinition#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see com.isax.validation.dsl.dsl.TargetDefinition#getBody()
	 * @see #getTargetDefinition()
	 * @generated
	 */
	EReference getTargetDefinition_Body();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.TargetDefinition#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignments</em>'.
	 * @see com.isax.validation.dsl.dsl.TargetDefinition#getAssignments()
	 * @see #getTargetDefinition()
	 * @generated
	 */
	EReference getTargetDefinition_Assignments();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.SelectorList <em>Selector List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector List</em>'.
	 * @see com.isax.validation.dsl.dsl.SelectorList
	 * @generated
	 */
	EClass getSelectorList();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.SelectorList#getSelectors <em>Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selectors</em>'.
	 * @see com.isax.validation.dsl.dsl.SelectorList#getSelectors()
	 * @see #getSelectorList()
	 * @generated
	 */
	EReference getSelectorList_Selectors();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.SelectorListDef <em>Selector List Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector List Def</em>'.
	 * @see com.isax.validation.dsl.dsl.SelectorListDef
	 * @generated
	 */
	EClass getSelectorListDef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.isax.validation.dsl.dsl.SelectorListDef#getSelectors <em>Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selectors</em>'.
	 * @see com.isax.validation.dsl.dsl.SelectorListDef#getSelectors()
	 * @see #getSelectorListDef()
	 * @generated
	 */
	EReference getSelectorListDef_Selectors();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector</em>'.
	 * @see com.isax.validation.dsl.dsl.Selector
	 * @generated
	 */
	EClass getSelector();

	/**
	 * Returns the meta object for the attribute '{@link com.isax.validation.dsl.dsl.Selector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.isax.validation.dsl.dsl.Selector#getType()
	 * @see #getSelector()
	 * @generated
	 */
	EAttribute getSelector_Type();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.PredicateExpression <em>Predicate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Expression</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateExpression
	 * @generated
	 */
	EClass getPredicateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.PredicateExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateExpression#getLhs()
	 * @see #getPredicateExpression()
	 * @generated
	 */
	EReference getPredicateExpression_Lhs();

	/**
	 * Returns the meta object for the attribute '{@link com.isax.validation.dsl.dsl.PredicateExpression#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateExpression#isNegated()
	 * @see #getPredicateExpression()
	 * @generated
	 */
	EAttribute getPredicateExpression_Negated();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.PredicateExpression#getCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Call</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateExpression#getCall()
	 * @see #getPredicateExpression()
	 * @generated
	 */
	EReference getPredicateExpression_Call();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.PredicateExpression#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateExpression#getInner()
	 * @see #getPredicateExpression()
	 * @generated
	 */
	EReference getPredicateExpression_Inner();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.PredicateExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateExpression#getRhs()
	 * @see #getPredicateExpression()
	 * @generated
	 */
	EReference getPredicateExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.PredicateCall <em>Predicate Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Call</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateCall
	 * @generated
	 */
	EClass getPredicateCall();

	/**
	 * Returns the meta object for the attribute '{@link com.isax.validation.dsl.dsl.PredicateCall#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateCall#getLabel()
	 * @see #getPredicateCall()
	 * @generated
	 */
	EAttribute getPredicateCall_Label();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.PredicateXExpression <em>Predicate XExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate XExpression</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateXExpression
	 * @generated
	 */
	EClass getPredicateXExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.PredicateXExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateXExpression#getExpression()
	 * @see #getPredicateXExpression()
	 * @generated
	 */
	EReference getPredicateXExpression_Expression();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.PropertyRelationPredicate <em>Property Relation Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Relation Predicate</em>'.
	 * @see com.isax.validation.dsl.dsl.PropertyRelationPredicate
	 * @generated
	 */
	EClass getPropertyRelationPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.PropertyRelationPredicate#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see com.isax.validation.dsl.dsl.PropertyRelationPredicate#getLhs()
	 * @see #getPropertyRelationPredicate()
	 * @generated
	 */
	EReference getPropertyRelationPredicate_Lhs();

	/**
	 * Returns the meta object for the attribute '{@link com.isax.validation.dsl.dsl.PropertyRelationPredicate#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation</em>'.
	 * @see com.isax.validation.dsl.dsl.PropertyRelationPredicate#getRelation()
	 * @see #getPropertyRelationPredicate()
	 * @generated
	 */
	EAttribute getPropertyRelationPredicate_Relation();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.PropertyRelationPredicate#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see com.isax.validation.dsl.dsl.PropertyRelationPredicate#getRhs()
	 * @see #getPropertyRelationPredicate()
	 * @generated
	 */
	EReference getPropertyRelationPredicate_Rhs();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.DefinitionSentencePredicate <em>Definition Sentence Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Sentence Predicate</em>'.
	 * @see com.isax.validation.dsl.dsl.DefinitionSentencePredicate
	 * @generated
	 */
	EClass getDefinitionSentencePredicate();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.DefinitionSentencePredicate#getSentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sentence</em>'.
	 * @see com.isax.validation.dsl.dsl.DefinitionSentencePredicate#getSentence()
	 * @see #getDefinitionSentencePredicate()
	 * @generated
	 */
	EReference getDefinitionSentencePredicate_Sentence();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.PredicateReference <em>Predicate Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Reference</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateReference
	 * @generated
	 */
	EClass getPredicateReference();

	/**
	 * Returns the meta object for the reference '{@link com.isax.validation.dsl.dsl.PredicateReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateReference#getReference()
	 * @see #getPredicateReference()
	 * @generated
	 */
	EReference getPredicateReference_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.PredicateReference#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see com.isax.validation.dsl.dsl.PredicateReference#getArguments()
	 * @see #getPredicateReference()
	 * @generated
	 */
	EReference getPredicateReference_Arguments();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.isax.validation.dsl.dsl.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.Parameter#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see com.isax.validation.dsl.dsl.Parameter#getNode()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Node();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.ParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter List</em>'.
	 * @see com.isax.validation.dsl.dsl.ParameterList
	 * @generated
	 */
	EClass getParameterList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.isax.validation.dsl.dsl.ParameterList#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.isax.validation.dsl.dsl.ParameterList#getParameters()
	 * @see #getParameterList()
	 * @generated
	 */
	EReference getParameterList_Parameters();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see com.isax.validation.dsl.dsl.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the reference '{@link com.isax.validation.dsl.dsl.Argument#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see com.isax.validation.dsl.dsl.Argument#getNode()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Node();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.ArgumentList <em>Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument List</em>'.
	 * @see com.isax.validation.dsl.dsl.ArgumentList
	 * @generated
	 */
	EClass getArgumentList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.isax.validation.dsl.dsl.ArgumentList#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see com.isax.validation.dsl.dsl.ArgumentList#getArguments()
	 * @see #getArgumentList()
	 * @generated
	 */
	EReference getArgumentList_Arguments();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see com.isax.validation.dsl.dsl.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.Assignment#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see com.isax.validation.dsl.dsl.Assignment#getReference()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.Assignment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.isax.validation.dsl.dsl.Assignment#getExpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Expression();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.AssignmentList <em>Assignment List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment List</em>'.
	 * @see com.isax.validation.dsl.dsl.AssignmentList
	 * @generated
	 */
	EClass getAssignmentList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.isax.validation.dsl.dsl.AssignmentList#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see com.isax.validation.dsl.dsl.AssignmentList#getAssignments()
	 * @see #getAssignmentList()
	 * @generated
	 */
	EReference getAssignmentList_Assignments();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.AssignmentExpression <em>Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Expression</em>'.
	 * @see com.isax.validation.dsl.dsl.AssignmentExpression
	 * @generated
	 */
	EClass getAssignmentExpression();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.AssignmentXExpression <em>Assignment XExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment XExpression</em>'.
	 * @see com.isax.validation.dsl.dsl.AssignmentXExpression
	 * @generated
	 */
	EClass getAssignmentXExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.AssignmentXExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.isax.validation.dsl.dsl.AssignmentXExpression#getExpression()
	 * @see #getAssignmentXExpression()
	 * @generated
	 */
	EReference getAssignmentXExpression_Expression();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.Quantification <em>Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantification</em>'.
	 * @see com.isax.validation.dsl.dsl.Quantification
	 * @generated
	 */
	EClass getQuantification();

	/**
	 * Returns the meta object for the attribute '{@link com.isax.validation.dsl.dsl.Quantification#getQuantor <em>Quantor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantor</em>'.
	 * @see com.isax.validation.dsl.dsl.Quantification#getQuantor()
	 * @see #getQuantification()
	 * @generated
	 */
	EAttribute getQuantification_Quantor();

	/**
	 * Returns the meta object for the containment reference '{@link com.isax.validation.dsl.dsl.Quantification#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see com.isax.validation.dsl.dsl.Quantification#getNode()
	 * @see #getQuantification()
	 * @generated
	 */
	EReference getQuantification_Node();

	/**
	 * Returns the meta object for the reference '{@link com.isax.validation.dsl.dsl.Quantification#getNodeSet <em>Node Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Set</em>'.
	 * @see com.isax.validation.dsl.dsl.Quantification#getNodeSet()
	 * @see #getQuantification()
	 * @generated
	 */
	EReference getQuantification_NodeSet();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.QuantificationList <em>Quantification List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantification List</em>'.
	 * @see com.isax.validation.dsl.dsl.QuantificationList
	 * @generated
	 */
	EClass getQuantificationList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.isax.validation.dsl.dsl.QuantificationList#getQuantifications <em>Quantifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantifications</em>'.
	 * @see com.isax.validation.dsl.dsl.QuantificationList#getQuantifications()
	 * @see #getQuantificationList()
	 * @generated
	 */
	EReference getQuantificationList_Quantifications();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.PropertyExpression <em>Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Expression</em>'.
	 * @see com.isax.validation.dsl.dsl.PropertyExpression
	 * @generated
	 */
	EClass getPropertyExpression();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.PropertyValueExpression <em>Property Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value Expression</em>'.
	 * @see com.isax.validation.dsl.dsl.PropertyValueExpression
	 * @generated
	 */
	EClass getPropertyValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.isax.validation.dsl.dsl.PropertyValueExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.isax.validation.dsl.dsl.PropertyValueExpression#getValue()
	 * @see #getPropertyValueExpression()
	 * @generated
	 */
	EAttribute getPropertyValueExpression_Value();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.PropertyReferenceExpression <em>Property Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Reference Expression</em>'.
	 * @see com.isax.validation.dsl.dsl.PropertyReferenceExpression
	 * @generated
	 */
	EClass getPropertyReferenceExpression();

	/**
	 * Returns the meta object for the reference '{@link com.isax.validation.dsl.dsl.PropertyReferenceExpression#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see com.isax.validation.dsl.dsl.PropertyReferenceExpression#getNode()
	 * @see #getPropertyReferenceExpression()
	 * @generated
	 */
	EReference getPropertyReferenceExpression_Node();

	/**
	 * Returns the meta object for the attribute '{@link com.isax.validation.dsl.dsl.PropertyReferenceExpression#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see com.isax.validation.dsl.dsl.PropertyReferenceExpression#getProperty()
	 * @see #getPropertyReferenceExpression()
	 * @generated
	 */
	EAttribute getPropertyReferenceExpression_Property();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expression</em>'.
	 * @see com.isax.validation.dsl.dsl.AndExpression
	 * @generated
	 */
	EClass getAndExpression();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Expression</em>'.
	 * @see com.isax.validation.dsl.dsl.OrExpression
	 * @generated
	 */
	EClass getOrExpression();

	/**
	 * Returns the meta object for class '{@link com.isax.validation.dsl.dsl.ImpliesExpression <em>Implies Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies Expression</em>'.
	 * @see com.isax.validation.dsl.dsl.ImpliesExpression
	 * @generated
	 */
	EClass getImpliesExpression();

	/**
	 * Returns the meta object for enum '{@link com.isax.validation.dsl.dsl.Quantor <em>Quantor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantor</em>'.
	 * @see com.isax.validation.dsl.dsl.Quantor
	 * @generated
	 */
	EEnum getQuantor();

	/**
	 * Returns the meta object for enum '{@link com.isax.validation.dsl.dsl.RelationQualifier <em>Relation Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Qualifier</em>'.
	 * @see com.isax.validation.dsl.dsl.RelationQualifier
	 * @generated
	 */
	EEnum getRelationQualifier();

	/**
	 * Returns the meta object for enum '{@link com.isax.validation.dsl.dsl.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Axis</em>'.
	 * @see com.isax.validation.dsl.dsl.Axis
	 * @generated
	 */
	EEnum getAxis();

	/**
	 * Returns the meta object for enum '{@link com.isax.validation.dsl.dsl.PropertyRelation <em>Property Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Relation</em>'.
	 * @see com.isax.validation.dsl.dsl.PropertyRelation
	 * @generated
	 */
	EEnum getPropertyRelation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DslFactory getDslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.ValidatorImpl <em>Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.ValidatorImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getValidator()
		 * @generated
		 */
		EClass VALIDATOR = eINSTANCE.getValidator();

		/**
		 * The meta object literal for the '<em><b>Start On</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATOR__START_ON = eINSTANCE.getValidator_StartOn();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATOR__BODY = eINSTANCE.getValidator_Body();

		/**
		 * The meta object literal for the '<em><b>Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATOR__PREDICATES = eINSTANCE.getValidator_Predicates();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.BodySentencesImpl <em>Body Sentences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.BodySentencesImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getBodySentences()
		 * @generated
		 */
		EClass BODY_SENTENCES = eINSTANCE.getBodySentences();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_SENTENCES__DEFINITIONS = eINSTANCE.getBodySentences_Definitions();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_SENTENCES__CONSTRAINTS = eINSTANCE.getBodySentences_Constraints();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.SentenceImpl <em>Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.SentenceImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getSentence()
		 * @generated
		 */
		EClass SENTENCE = eINSTANCE.getSentence();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.StartOnSentenceImpl <em>Start On Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.StartOnSentenceImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getStartOnSentence()
		 * @generated
		 */
		EClass START_ON_SENTENCE = eINSTANCE.getStartOnSentence();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_ON_SENTENCE__DEFINITION = eINSTANCE.getStartOnSentence_Definition();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.DefinitionSentenceImpl <em>Definition Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.DefinitionSentenceImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getDefinitionSentence()
		 * @generated
		 */
		EClass DEFINITION_SENTENCE = eINSTANCE.getDefinitionSentence();

		/**
		 * The meta object literal for the '<em><b>Quantification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_SENTENCE__QUANTIFICATION = eINSTANCE.getDefinitionSentence_Quantification();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_SENTENCE__NODE = eINSTANCE.getDefinitionSentence_Node();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_SENTENCE__QUALIFIER = eINSTANCE.getDefinitionSentence_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_SENTENCE__TARGET = eINSTANCE.getDefinitionSentence_Target();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.ConstraintSentenceImpl <em>Constraint Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.ConstraintSentenceImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getConstraintSentence()
		 * @generated
		 */
		EClass CONSTRAINT_SENTENCE = eINSTANCE.getConstraintSentence();

		/**
		 * The meta object literal for the '<em><b>Quantifications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_SENTENCE__QUANTIFICATIONS = eINSTANCE.getConstraintSentence_Quantifications();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_SENTENCE__NODES = eINSTANCE.getConstraintSentence_Nodes();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_SENTENCE__PREDICATE = eINSTANCE.getConstraintSentence_Predicate();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.PredicateDefinitionSentenceImpl <em>Predicate Definition Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.PredicateDefinitionSentenceImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPredicateDefinitionSentence()
		 * @generated
		 */
		EClass PREDICATE_DEFINITION_SENTENCE = eINSTANCE.getPredicateDefinitionSentence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE_DEFINITION_SENTENCE__NAME = eINSTANCE.getPredicateDefinitionSentence_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_DEFINITION_SENTENCE__PARAMETERS = eINSTANCE.getPredicateDefinitionSentence_Parameters();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_DEFINITION_SENTENCE__BODY = eINSTANCE.getPredicateDefinitionSentence_Body();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.NodeDefinitionImpl <em>Node Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.NodeDefinitionImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getNodeDefinition()
		 * @generated
		 */
		EClass NODE_DEFINITION = eINSTANCE.getNodeDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEFINITION__NAME = eINSTANCE.getNodeDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEFINITION__COLLECTION = eINSTANCE.getNodeDefinition_Collection();

		/**
		 * The meta object literal for the '<em><b>Selectors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_DEFINITION__SELECTORS = eINSTANCE.getNodeDefinition_Selectors();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.NodeReferenceListImpl <em>Node Reference List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.NodeReferenceListImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getNodeReferenceList()
		 * @generated
		 */
		EClass NODE_REFERENCE_LIST = eINSTANCE.getNodeReferenceList();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_REFERENCE_LIST__NODES = eINSTANCE.getNodeReferenceList_Nodes();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl <em>Target Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getTargetDefinition()
		 * @generated
		 */
		EClass TARGET_DEFINITION = eINSTANCE.getTargetDefinition();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_DEFINITION__AXIS = eINSTANCE.getTargetDefinition_Axis();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_DEFINITION__LOCAL = eINSTANCE.getTargetDefinition_Local();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_DEFINITION__DEFINITION = eINSTANCE.getTargetDefinition_Definition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_DEFINITION__BODY = eINSTANCE.getTargetDefinition_Body();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_DEFINITION__ASSIGNMENTS = eINSTANCE.getTargetDefinition_Assignments();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.SelectorListImpl <em>Selector List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.SelectorListImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getSelectorList()
		 * @generated
		 */
		EClass SELECTOR_LIST = eINSTANCE.getSelectorList();

		/**
		 * The meta object literal for the '<em><b>Selectors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTOR_LIST__SELECTORS = eINSTANCE.getSelectorList_Selectors();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.SelectorListDefImpl <em>Selector List Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.SelectorListDefImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getSelectorListDef()
		 * @generated
		 */
		EClass SELECTOR_LIST_DEF = eINSTANCE.getSelectorListDef();

		/**
		 * The meta object literal for the '<em><b>Selectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTOR_LIST_DEF__SELECTORS = eINSTANCE.getSelectorListDef_Selectors();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.SelectorImpl <em>Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.SelectorImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getSelector()
		 * @generated
		 */
		EClass SELECTOR = eINSTANCE.getSelector();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTOR__TYPE = eINSTANCE.getSelector_Type();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.PredicateExpressionImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPredicateExpression()
		 * @generated
		 */
		EClass PREDICATE_EXPRESSION = eINSTANCE.getPredicateExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_EXPRESSION__LHS = eINSTANCE.getPredicateExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE_EXPRESSION__NEGATED = eINSTANCE.getPredicateExpression_Negated();

		/**
		 * The meta object literal for the '<em><b>Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_EXPRESSION__CALL = eINSTANCE.getPredicateExpression_Call();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_EXPRESSION__INNER = eINSTANCE.getPredicateExpression_Inner();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_EXPRESSION__RHS = eINSTANCE.getPredicateExpression_Rhs();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.PredicateCallImpl <em>Predicate Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.PredicateCallImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPredicateCall()
		 * @generated
		 */
		EClass PREDICATE_CALL = eINSTANCE.getPredicateCall();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE_CALL__LABEL = eINSTANCE.getPredicateCall_Label();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.PredicateXExpressionImpl <em>Predicate XExpression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.PredicateXExpressionImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPredicateXExpression()
		 * @generated
		 */
		EClass PREDICATE_XEXPRESSION = eINSTANCE.getPredicateXExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_XEXPRESSION__EXPRESSION = eINSTANCE.getPredicateXExpression_Expression();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.PropertyRelationPredicateImpl <em>Property Relation Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.PropertyRelationPredicateImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPropertyRelationPredicate()
		 * @generated
		 */
		EClass PROPERTY_RELATION_PREDICATE = eINSTANCE.getPropertyRelationPredicate();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_RELATION_PREDICATE__LHS = eINSTANCE.getPropertyRelationPredicate_Lhs();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_RELATION_PREDICATE__RELATION = eINSTANCE.getPropertyRelationPredicate_Relation();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_RELATION_PREDICATE__RHS = eINSTANCE.getPropertyRelationPredicate_Rhs();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.DefinitionSentencePredicateImpl <em>Definition Sentence Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.DefinitionSentencePredicateImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getDefinitionSentencePredicate()
		 * @generated
		 */
		EClass DEFINITION_SENTENCE_PREDICATE = eINSTANCE.getDefinitionSentencePredicate();

		/**
		 * The meta object literal for the '<em><b>Sentence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_SENTENCE_PREDICATE__SENTENCE = eINSTANCE.getDefinitionSentencePredicate_Sentence();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.PredicateReferenceImpl <em>Predicate Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.PredicateReferenceImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPredicateReference()
		 * @generated
		 */
		EClass PREDICATE_REFERENCE = eINSTANCE.getPredicateReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_REFERENCE__REFERENCE = eINSTANCE.getPredicateReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_REFERENCE__ARGUMENTS = eINSTANCE.getPredicateReference_Arguments();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.ParameterImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__NODE = eINSTANCE.getParameter_Node();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.ParameterListImpl <em>Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.ParameterListImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getParameterList()
		 * @generated
		 */
		EClass PARAMETER_LIST = eINSTANCE.getParameterList();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LIST__PARAMETERS = eINSTANCE.getParameterList_Parameters();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.ArgumentImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__NODE = eINSTANCE.getArgument_Node();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.ArgumentListImpl <em>Argument List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.ArgumentListImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getArgumentList()
		 * @generated
		 */
		EClass ARGUMENT_LIST = eINSTANCE.getArgumentList();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_LIST__ARGUMENTS = eINSTANCE.getArgumentList_Arguments();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.AssignmentImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__REFERENCE = eINSTANCE.getAssignment_Reference();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.AssignmentListImpl <em>Assignment List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.AssignmentListImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getAssignmentList()
		 * @generated
		 */
		EClass ASSIGNMENT_LIST = eINSTANCE.getAssignmentList();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_LIST__ASSIGNMENTS = eINSTANCE.getAssignmentList_Assignments();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.AssignmentExpressionImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getAssignmentExpression()
		 * @generated
		 */
		EClass ASSIGNMENT_EXPRESSION = eINSTANCE.getAssignmentExpression();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.AssignmentXExpressionImpl <em>Assignment XExpression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.AssignmentXExpressionImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getAssignmentXExpression()
		 * @generated
		 */
		EClass ASSIGNMENT_XEXPRESSION = eINSTANCE.getAssignmentXExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_XEXPRESSION__EXPRESSION = eINSTANCE.getAssignmentXExpression_Expression();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.QuantificationImpl <em>Quantification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.QuantificationImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getQuantification()
		 * @generated
		 */
		EClass QUANTIFICATION = eINSTANCE.getQuantification();

		/**
		 * The meta object literal for the '<em><b>Quantor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFICATION__QUANTOR = eINSTANCE.getQuantification_Quantor();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFICATION__NODE = eINSTANCE.getQuantification_Node();

		/**
		 * The meta object literal for the '<em><b>Node Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFICATION__NODE_SET = eINSTANCE.getQuantification_NodeSet();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.QuantificationListImpl <em>Quantification List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.QuantificationListImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getQuantificationList()
		 * @generated
		 */
		EClass QUANTIFICATION_LIST = eINSTANCE.getQuantificationList();

		/**
		 * The meta object literal for the '<em><b>Quantifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFICATION_LIST__QUANTIFICATIONS = eINSTANCE.getQuantificationList_Quantifications();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.PropertyExpressionImpl <em>Property Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.PropertyExpressionImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPropertyExpression()
		 * @generated
		 */
		EClass PROPERTY_EXPRESSION = eINSTANCE.getPropertyExpression();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.PropertyValueExpressionImpl <em>Property Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.PropertyValueExpressionImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPropertyValueExpression()
		 * @generated
		 */
		EClass PROPERTY_VALUE_EXPRESSION = eINSTANCE.getPropertyValueExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE_EXPRESSION__VALUE = eINSTANCE.getPropertyValueExpression_Value();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.PropertyReferenceExpressionImpl <em>Property Reference Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.PropertyReferenceExpressionImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPropertyReferenceExpression()
		 * @generated
		 */
		EClass PROPERTY_REFERENCE_EXPRESSION = eINSTANCE.getPropertyReferenceExpression();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REFERENCE_EXPRESSION__NODE = eINSTANCE.getPropertyReferenceExpression_Node();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_REFERENCE_EXPRESSION__PROPERTY = eINSTANCE.getPropertyReferenceExpression_Property();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.AndExpressionImpl <em>And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.AndExpressionImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getAndExpression()
		 * @generated
		 */
		EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.OrExpressionImpl <em>Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.OrExpressionImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getOrExpression()
		 * @generated
		 */
		EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.impl.ImpliesExpressionImpl <em>Implies Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.impl.ImpliesExpressionImpl
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getImpliesExpression()
		 * @generated
		 */
		EClass IMPLIES_EXPRESSION = eINSTANCE.getImpliesExpression();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.Quantor <em>Quantor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.Quantor
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getQuantor()
		 * @generated
		 */
		EEnum QUANTOR = eINSTANCE.getQuantor();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.RelationQualifier <em>Relation Qualifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.RelationQualifier
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getRelationQualifier()
		 * @generated
		 */
		EEnum RELATION_QUALIFIER = eINSTANCE.getRelationQualifier();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.Axis <em>Axis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.Axis
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getAxis()
		 * @generated
		 */
		EEnum AXIS = eINSTANCE.getAxis();

		/**
		 * The meta object literal for the '{@link com.isax.validation.dsl.dsl.PropertyRelation <em>Property Relation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.isax.validation.dsl.dsl.PropertyRelation
		 * @see com.isax.validation.dsl.dsl.impl.DslPackageImpl#getPropertyRelation()
		 * @generated
		 */
		EEnum PROPERTY_RELATION = eINSTANCE.getPropertyRelation();

	}

} //DslPackage
