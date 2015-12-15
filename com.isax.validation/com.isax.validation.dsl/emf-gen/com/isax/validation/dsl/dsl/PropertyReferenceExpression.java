/**
 */
package com.isax.validation.dsl.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.PropertyReferenceExpression#getNode <em>Node</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.PropertyReferenceExpression#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getPropertyReferenceExpression()
 * @model
 * @generated
 */
public interface PropertyReferenceExpression extends PropertyExpression
{
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
	 * @see com.isax.validation.dsl.dsl.DslPackage#getPropertyReferenceExpression_Node()
	 * @model
	 * @generated
	 */
	NodeDefinition getNode();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.PropertyReferenceExpression#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(NodeDefinition value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(PropertyReference)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getPropertyReferenceExpression_Property()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PropertyReference getProperty();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.PropertyReferenceExpression#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(PropertyReference value);

} // PropertyReferenceExpression
