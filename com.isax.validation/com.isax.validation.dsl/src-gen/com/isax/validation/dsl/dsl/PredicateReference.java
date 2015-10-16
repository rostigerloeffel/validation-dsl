/**
 */
package com.isax.validation.dsl.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.PredicateReference#getReference <em>Reference</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.PredicateReference#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateReference()
 * @model
 * @generated
 */
public interface PredicateReference extends PredicateCall
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(PredicateDefinitionSentence)
   * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateReference_Reference()
   * @model
   * @generated
   */
  PredicateDefinitionSentence getReference();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.PredicateReference#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(PredicateDefinitionSentence value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference.
   * @see #setArguments(ArgumentList)
   * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateReference_Arguments()
   * @model containment="true"
   * @generated
   */
  ArgumentList getArguments();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.PredicateReference#getArguments <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arguments</em>' containment reference.
   * @see #getArguments()
   * @generated
   */
  void setArguments(ArgumentList value);

} // PredicateReference
