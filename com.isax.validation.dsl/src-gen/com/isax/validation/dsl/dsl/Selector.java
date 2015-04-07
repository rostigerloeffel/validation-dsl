/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.Selector#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getSelector()
 * @model
 * @generated
 */
public interface Selector extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see com.isax.validation.dsl.dsl.DslPackage#getSelector_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.Selector#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // Selector
