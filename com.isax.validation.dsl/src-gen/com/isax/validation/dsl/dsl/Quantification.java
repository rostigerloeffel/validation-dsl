/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.Quantification#getQuantor <em>Quantor</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.Quantification#getNode <em>Node</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.Quantification#getNodeSet <em>Node Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getQuantification()
 * @model
 * @generated
 */
public interface Quantification extends EObject
{
  /**
   * Returns the value of the '<em><b>Quantor</b></em>' attribute.
   * The literals are from the enumeration {@link com.isax.validation.dsl.dsl.Quantor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantor</em>' attribute.
   * @see com.isax.validation.dsl.dsl.Quantor
   * @see #setQuantor(Quantor)
   * @see com.isax.validation.dsl.dsl.DslPackage#getQuantification_Quantor()
   * @model
   * @generated
   */
  Quantor getQuantor();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.Quantification#getQuantor <em>Quantor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantor</em>' attribute.
   * @see com.isax.validation.dsl.dsl.Quantor
   * @see #getQuantor()
   * @generated
   */
  void setQuantor(Quantor value);

  /**
   * Returns the value of the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' containment reference.
   * @see #setNode(NodeDefinition)
   * @see com.isax.validation.dsl.dsl.DslPackage#getQuantification_Node()
   * @model containment="true"
   * @generated
   */
  NodeDefinition getNode();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.Quantification#getNode <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' containment reference.
   * @see #getNode()
   * @generated
   */
  void setNode(NodeDefinition value);

  /**
   * Returns the value of the '<em><b>Node Set</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Set</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Set</em>' reference.
   * @see #setNodeSet(NodeDefinition)
   * @see com.isax.validation.dsl.dsl.DslPackage#getQuantification_NodeSet()
   * @model
   * @generated
   */
  NodeDefinition getNodeSet();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.Quantification#getNodeSet <em>Node Set</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Set</em>' reference.
   * @see #getNodeSet()
   * @generated
   */
  void setNodeSet(NodeDefinition value);

} // Quantification
