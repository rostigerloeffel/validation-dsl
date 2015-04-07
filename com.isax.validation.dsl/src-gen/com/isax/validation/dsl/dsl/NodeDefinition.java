/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.NodeDefinition#getName <em>Name</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.NodeDefinition#isCollection <em>Collection</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.NodeDefinition#getSelectors <em>Selectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getNodeDefinition()
 * @model
 * @generated
 */
public interface NodeDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.isax.validation.dsl.dsl.DslPackage#getNodeDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.NodeDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' attribute.
   * @see #setCollection(boolean)
   * @see com.isax.validation.dsl.dsl.DslPackage#getNodeDefinition_Collection()
   * @model
   * @generated
   */
  boolean isCollection();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.NodeDefinition#isCollection <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' attribute.
   * @see #isCollection()
   * @generated
   */
  void setCollection(boolean value);

  /**
   * Returns the value of the '<em><b>Selectors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selectors</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selectors</em>' containment reference.
   * @see #setSelectors(SelectorList)
   * @see com.isax.validation.dsl.dsl.DslPackage#getNodeDefinition_Selectors()
   * @model containment="true"
   * @generated
   */
  SelectorList getSelectors();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.NodeDefinition#getSelectors <em>Selectors</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selectors</em>' containment reference.
   * @see #getSelectors()
   * @generated
   */
  void setSelectors(SelectorList value);

} // NodeDefinition
