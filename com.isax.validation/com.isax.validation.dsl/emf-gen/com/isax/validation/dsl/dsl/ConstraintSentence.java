/**
 */
package com.isax.validation.dsl.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.ConstraintSentence#getQuantifications <em>Quantifications</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.ConstraintSentence#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.ConstraintSentence#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getConstraintSentence()
 * @model
 * @generated
 */
public interface ConstraintSentence extends Sentence
{
	/**
	 * Returns the value of the '<em><b>Quantifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantifications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifications</em>' containment reference.
	 * @see #setQuantifications(QuantificationList)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getConstraintSentence_Quantifications()
	 * @model containment="true"
	 * @generated
	 */
	QuantificationList getQuantifications();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.ConstraintSentence#getQuantifications <em>Quantifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifications</em>' containment reference.
	 * @see #getQuantifications()
	 * @generated
	 */
	void setQuantifications(QuantificationList value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference.
	 * @see #setNodes(NodeReferenceList)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getConstraintSentence_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	NodeReferenceList getNodes();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.ConstraintSentence#getNodes <em>Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes</em>' containment reference.
	 * @see #getNodes()
	 * @generated
	 */
	void setNodes(NodeReferenceList value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(PredicateExpression)
	 * @see com.isax.validation.dsl.dsl.DslPackage#getConstraintSentence_Predicate()
	 * @model containment="true"
	 * @generated
	 */
	PredicateExpression getPredicate();

	/**
	 * Sets the value of the '{@link com.isax.validation.dsl.dsl.ConstraintSentence#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(PredicateExpression value);

} // ConstraintSentence
