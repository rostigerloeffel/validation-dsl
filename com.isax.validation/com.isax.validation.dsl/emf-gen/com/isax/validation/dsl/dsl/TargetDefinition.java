/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.TargetDefinition#getAxis <em>Axis</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.TargetDefinition#getLocal <em>Local</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.TargetDefinition#getDefinition <em>Definition</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.TargetDefinition#getBody <em>Body</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.TargetDefinition#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getTargetDefinition()
 * @model
 * @generated
 */
public interface TargetDefinition extends EObject
{
	/**
	 * Returns the value of the '<em><b>Axis</b></em>' attribute.
	 * The literals are from the enumeration {@link com.isax.validation.dsl.dsl.Axis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' attribute.
	 * @see com.isax.validation.dsl.dsl.Axis
	 * @see #setAxis(Axis)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getTargetDefinition_Axis()
	 * @model
	 * @generated
	 */
	Axis getAxis();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.TargetDefinition#getAxis <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' attribute.
	 * @see com.isax.validation.dsl.dsl.Axis
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(Axis value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' containment reference.
	 * @see #setLocal(NodeDefinition)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getTargetDefinition_Local()
	 * @model containment="true"
	 * @generated
	 */
	NodeDefinition getLocal();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.TargetDefinition#getLocal <em>Local</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' containment reference.
	 * @see #getLocal()
	 * @generated
	 */
	void setLocal(NodeDefinition value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(NodeDefinition)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getTargetDefinition_Definition()
	 * @model containment="true"
	 * @generated
	 */
	NodeDefinition getDefinition();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.TargetDefinition#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(NodeDefinition value);

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
	 * @see com.isax.validation.dsl.dsl.DslPackage#getTargetDefinition_Body()
	 * @model containment="true"
	 * @generated
	 */
	BodySentences getBody();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.TargetDefinition#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BodySentences value);

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference.
	 * @see #setAssignments(AssignmentList)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getTargetDefinition_Assignments()
	 * @model containment="true"
	 * @generated
	 */
	AssignmentList getAssignments();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.TargetDefinition#getAssignments <em>Assignments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignments</em>' containment reference.
	 * @see #getAssignments()
	 * @generated
	 */
	void setAssignments(AssignmentList value);

} // TargetDefinition
