/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.SelectorList#getSelectors <em>Selectors</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getSelectorList()
 * @model
 * @generated
 */
public interface SelectorList extends EObject
{
	/**
	 * Returns the value of the '<em><b>Selectors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectors</em>' containment reference.
	 * @see #setSelectors(SelectorListDef)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getSelectorList_Selectors()
	 * @model containment="true"
	 * @generated
	 */
	SelectorListDef getSelectors();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.SelectorList#getSelectors <em>Selectors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectors</em>' containment reference.
	 * @see #getSelectors()
	 * @generated
	 */
	void setSelectors(SelectorListDef value);

} // SelectorList
