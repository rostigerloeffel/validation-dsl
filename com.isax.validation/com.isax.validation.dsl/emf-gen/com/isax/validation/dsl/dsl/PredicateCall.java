/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.PredicateCall#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateCall()
 * @model
 * @generated
 */
public interface PredicateCall extends EObject
{
	/**
	 * Returns the value of the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' reference.
	 * @see #setError(ErrorDefinition)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateCall_Error()
	 * @model
	 * @generated
	 */
	ErrorDefinition getError();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.PredicateCall#getError <em>Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(ErrorDefinition value);

} // PredicateCall
