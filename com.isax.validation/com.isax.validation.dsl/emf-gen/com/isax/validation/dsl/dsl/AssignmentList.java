/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.AssignmentList#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getAssignmentList()
 * @model
 * @generated
 */
public interface AssignmentList extends EObject
{
	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link com.isax.validation.dsl.dsl.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference list.
	 * @see com.isax.validation.dsl.dsl.DslPackage#getAssignmentList_Assignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assignment> getAssignments();

} // AssignmentList
