/**
 */
package com.isax.validation.dsl.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start On Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.StartOnSentence#getDefinition <em>Definition</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.StartOnSentence#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getStartOnSentence()
 * @model
 * @generated
 */
public interface StartOnSentence extends Sentence
{
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
	 * @see com.isax.validation.dsl.dsl.DslPackage#getStartOnSentence_Definition()
	 * @model containment="true"
	 * @generated
	 */
	NodeDefinition getDefinition();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.StartOnSentence#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(NodeDefinition value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(BodySentences)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getStartOnSentence_Where()
	 * @model containment="true"
	 * @generated
	 */
	BodySentences getWhere();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.StartOnSentence#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(BodySentences value);

} // StartOnSentence
