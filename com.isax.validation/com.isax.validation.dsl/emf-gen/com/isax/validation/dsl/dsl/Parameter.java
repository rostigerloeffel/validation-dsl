/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.Parameter#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
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
	 * @see com.isax.validation.dsl.dsl.DslPackage#getParameter_Node()
	 * @model containment="true"
	 * @generated
	 */
	NodeDefinition getNode();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.Parameter#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(NodeDefinition value);

} // Parameter
