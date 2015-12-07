/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Quantifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.RelationQuantifier#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getRelationQuantifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RelationQuantifier extends EObject
{
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getRelationQuantifier_Quantity()
	 * @model required="true"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.RelationQuantifier#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

} // RelationQuantifier
