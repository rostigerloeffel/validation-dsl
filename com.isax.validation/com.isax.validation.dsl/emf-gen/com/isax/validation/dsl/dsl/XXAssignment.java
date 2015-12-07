/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XX Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.XXAssignment#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.XXAssignment#getNode <em>Node</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.XXAssignment#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getXXAssignment()
 * @model
 * @generated
 */
public interface XXAssignment extends XExpression
{
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(XExpression)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getXXAssignment_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	XExpression getExpression();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.XXAssignment#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(XExpression value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(NodeDefinition)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getXXAssignment_Node()
	 * @model required="true"
	 * @generated
	 */
	NodeDefinition getNode();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.XXAssignment#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(NodeDefinition value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getXXAssignment_Property()
	 * @model required="true"
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.XXAssignment#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

} // XXAssignment
