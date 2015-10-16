/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantification List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.QuantificationList#getQuantifications <em>Quantifications</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getQuantificationList()
 * @model
 * @generated
 */
public interface QuantificationList extends EObject
{
  /**
   * Returns the value of the '<em><b>Quantifications</b></em>' containment reference list.
   * The list contents are of type {@link com.isax.validation.dsl.dsl.Quantification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantifications</em>' containment reference list.
   * @see com.isax.validation.dsl.dsl.DslPackage#getQuantificationList_Quantifications()
   * @model containment="true"
   * @generated
   */
  EList<Quantification> getQuantifications();

} // QuantificationList
