/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.ecore.EFactory;

import com.isax.validation.dsl.dsl.impl.custom.DslFactoryImplCustom;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.isax.validation.dsl.dsl.DslPackage
 * @generated
 */
public interface DslFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	DslFactory eINSTANCE = new DslFactoryImplCustom();
//	DslFactory eINSTANCE = com.isax.validation.dsl.dsl.impl.DslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validator</em>'.
	 * @generated
	 */
	Validator createValidator();

	/**
	 * Returns a new object of class '<em>Body Sentences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body Sentences</em>'.
	 * @generated
	 */
	BodySentences createBodySentences();

	/**
	 * Returns a new object of class '<em>Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sentence</em>'.
	 * @generated
	 */
	Sentence createSentence();

	/**
	 * Returns a new object of class '<em>Start On Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start On Sentence</em>'.
	 * @generated
	 */
	StartOnSentence createStartOnSentence();

	/**
	 * Returns a new object of class '<em>Definition Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Sentence</em>'.
	 * @generated
	 */
	DefinitionSentence createDefinitionSentence();

	/**
	 * Returns a new object of class '<em>Constraint Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Sentence</em>'.
	 * @generated
	 */
	ConstraintSentence createConstraintSentence();

	/**
	 * Returns a new object of class '<em>Predicate Definition Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Definition Sentence</em>'.
	 * @generated
	 */
	PredicateDefinitionSentence createPredicateDefinitionSentence();

	/**
	 * Returns a new object of class '<em>Node Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Definition</em>'.
	 * @generated
	 */
	NodeDefinition createNodeDefinition();

	/**
	 * Returns a new object of class '<em>Node Reference List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Reference List</em>'.
	 * @generated
	 */
	NodeReferenceList createNodeReferenceList();

	/**
	 * Returns a new object of class '<em>Target Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Definition</em>'.
	 * @generated
	 */
	TargetDefinition createTargetDefinition();

	/**
	 * Returns a new object of class '<em>Selector List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selector List</em>'.
	 * @generated
	 */
	SelectorList createSelectorList();

	/**
	 * Returns a new object of class '<em>Selector List Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selector List Def</em>'.
	 * @generated
	 */
	SelectorListDef createSelectorListDef();

	/**
	 * Returns a new object of class '<em>Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selector</em>'.
	 * @generated
	 */
	Selector createSelector();

	/**
	 * Returns a new object of class '<em>Predicate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Expression</em>'.
	 * @generated
	 */
	PredicateExpression createPredicateExpression();

	/**
	 * Returns a new object of class '<em>Predicate Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Call</em>'.
	 * @generated
	 */
	PredicateCall createPredicateCall();

	/**
	 * Returns a new object of class '<em>Predicate XExpression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate XExpression</em>'.
	 * @generated
	 */
	PredicateXExpression createPredicateXExpression();

	/**
	 * Returns a new object of class '<em>Property Relation Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Relation Predicate</em>'.
	 * @generated
	 */
	PropertyRelationPredicate createPropertyRelationPredicate();

	/**
	 * Returns a new object of class '<em>Definition Sentence Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Sentence Predicate</em>'.
	 * @generated
	 */
	DefinitionSentencePredicate createDefinitionSentencePredicate();

	/**
	 * Returns a new object of class '<em>Predicate Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Reference</em>'.
	 * @generated
	 */
	PredicateReference createPredicateReference();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter List</em>'.
	 * @generated
	 */
	ParameterList createParameterList();

	/**
	 * Returns a new object of class '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument</em>'.
	 * @generated
	 */
	Argument createArgument();

	/**
	 * Returns a new object of class '<em>Argument List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument List</em>'.
	 * @generated
	 */
	ArgumentList createArgumentList();

	/**
	 * Returns a new object of class '<em>XX Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XX Assignment</em>'.
	 * @generated
	 */
	XXAssignment createXXAssignment();

	/**
	 * Returns a new object of class '<em>Assignment List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment List</em>'.
	 * @generated
	 */
	AssignmentList createAssignmentList();

	/**
	 * Returns a new object of class '<em>Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Expression</em>'.
	 * @generated
	 */
	AssignmentExpression createAssignmentExpression();

	/**
	 * Returns a new object of class '<em>Assignment XExpression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment XExpression</em>'.
	 * @generated
	 */
	AssignmentXExpression createAssignmentXExpression();

	/**
	 * Returns a new object of class '<em>Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantification</em>'.
	 * @generated
	 */
	Quantification createQuantification();

	/**
	 * Returns a new object of class '<em>Quantification List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantification List</em>'.
	 * @generated
	 */
	QuantificationList createQuantificationList();

	/**
	 * Returns a new object of class '<em>Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Expression</em>'.
	 * @generated
	 */
	PropertyExpression createPropertyExpression();

	/**
	 * Returns a new object of class '<em>Property Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Value Expression</em>'.
	 * @generated
	 */
	PropertyValueExpression createPropertyValueExpression();

	/**
	 * Returns a new object of class '<em>Property Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Reference Expression</em>'.
	 * @generated
	 */
	PropertyReferenceExpression createPropertyReferenceExpression();

	/**
	 * Returns a new object of class '<em>And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Expression</em>'.
	 * @generated
	 */
	AndExpression createAndExpression();

	/**
	 * Returns a new object of class '<em>Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Expression</em>'.
	 * @generated
	 */
	OrExpression createOrExpression();

	/**
	 * Returns a new object of class '<em>Implies Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implies Expression</em>'.
	 * @generated
	 */
	ImpliesExpression createImpliesExpression();

	/**
	 * Returns a new object of class '<em>XX Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XX Property Expression</em>'.
	 * @generated
	 */
	XXPropertyExpression createXXPropertyExpression();

	/**
	 * Returns a new object of class '<em>Must Have</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Must Have</em>'.
	 * @generated
	 */
	MustHave createMustHave();

	/**
	 * Returns a new object of class '<em>Must Not Have</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Must Not Have</em>'.
	 * @generated
	 */
	MustNotHave createMustNotHave();

	/**
	 * Returns a new object of class '<em>Can Have</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Can Have</em>'.
	 * @generated
	 */
	CanHave createCanHave();

	/**
	 * Returns a new object of class '<em>One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One</em>'.
	 * @generated
	 */
	One createOne();

	/**
	 * Returns a new object of class '<em>Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple</em>'.
	 * @generated
	 */
	Multiple createMultiple();

	/**
	 * Returns a new object of class '<em>At Least</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>At Least</em>'.
	 * @generated
	 */
	AtLeast createAtLeast();

	/**
	 * Returns a new object of class '<em>At Most</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>At Most</em>'.
	 * @generated
	 */
	AtMost createAtMost();

	/**
	 * Returns a new object of class '<em>Exactly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exactly</em>'.
	 * @generated
	 */
	Exactly createExactly();

	/**
	 * Returns a new object of class '<em>Parent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parent</em>'.
	 * @generated
	 */
	Parent createParent();

	/**
	 * Returns a new object of class '<em>Child</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child</em>'.
	 * @generated
	 */
	Child createChild();

	/**
	 * Returns a new object of class '<em>Ancestor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ancestor</em>'.
	 * @generated
	 */
	Ancestor createAncestor();

	/**
	 * Returns a new object of class '<em>Descendant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descendant</em>'.
	 * @generated
	 */
	Descendant createDescendant();

	/**
	 * Returns a new object of class '<em>Error Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Definition</em>'.
	 * @generated
	 */
	ErrorDefinition createErrorDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DslPackage getDslPackage();

} //DslFactory
