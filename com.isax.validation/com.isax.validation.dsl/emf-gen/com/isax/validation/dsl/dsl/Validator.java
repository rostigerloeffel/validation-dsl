/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.Validator#getStartOn <em>Start On</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.Validator#getBody <em>Body</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.Validator#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.Validator#getImports <em>Imports</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.Validator#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getValidator()
 * @model
 * @generated
 */
public interface Validator extends EObject
{
	/**
	 * Returns the value of the '<em><b>Start On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start On</em>' containment reference.
	 * @see #setStartOn(StartOnSentence)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getValidator_StartOn()
	 * @model containment="true"
	 * @generated
	 */
	StartOnSentence getStartOn();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.Validator#getStartOn <em>Start On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start On</em>' containment reference.
	 * @see #getStartOn()
	 * @generated
	 */
	void setStartOn(StartOnSentence value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BodySentences)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getValidator_Body()
	 * @model containment="true"
	 * @generated
	 */
	BodySentences getBody();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.Validator#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BodySentences value);

	/**
	 * Returns the value of the '<em><b>Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link com.isax.validation.dsl.dsl.PredicateDefinitionSentence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates</em>' containment reference list.
	 * @see com.isax.validation.dsl.dsl.DslPackage#getValidator_Predicates()
	 * @model containment="true"
	 * @generated
	 */
	EList<PredicateDefinitionSentence> getPredicates();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference.
	 * @see #setImports(XImportSection)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getValidator_Imports()
	 * @model containment="true"
	 * @generated
	 */
	XImportSection getImports();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.Validator#getImports <em>Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports</em>' containment reference.
	 * @see #getImports()
	 * @generated
	 */
	void setImports(XImportSection value);

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' containment reference list.
	 * The list contents are of type {@link com.isax.validation.dsl.dsl.ErrorDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' containment reference list.
	 * @see com.isax.validation.dsl.dsl.DslPackage#getValidator_Errors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorDefinition> getErrors();

} // Validator
