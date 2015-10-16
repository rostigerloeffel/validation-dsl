/**
 */
package com.isax.validation.dsl.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Sentence Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.DefinitionSentencePredicate#getSentence <em>Sentence</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getDefinitionSentencePredicate()
 * @model
 * @generated
 */
public interface DefinitionSentencePredicate extends PredicateCall
{
  /**
   * Returns the value of the '<em><b>Sentence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sentence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sentence</em>' containment reference.
   * @see #setSentence(DefinitionSentence)
   * @see com.isax.validation.dsl.dsl.DslPackage#getDefinitionSentencePredicate_Sentence()
   * @model containment="true"
   * @generated
   */
  DefinitionSentence getSentence();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.DefinitionSentencePredicate#getSentence <em>Sentence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sentence</em>' containment reference.
   * @see #getSentence()
   * @generated
   */
  void setSentence(DefinitionSentence value);

} // DefinitionSentencePredicate
