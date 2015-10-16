/**
 */
package com.isax.validation.dsl.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Definition Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.PredicateDefinitionSentence#getName <em>Name</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.PredicateDefinitionSentence#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.PredicateDefinitionSentence#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateDefinitionSentence()
 * @model
 * @generated
 */
public interface PredicateDefinitionSentence extends Sentence
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateDefinitionSentence_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.PredicateDefinitionSentence#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(ParameterList)
   * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateDefinitionSentence_Parameters()
   * @model containment="true"
   * @generated
   */
  ParameterList getParameters();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.PredicateDefinitionSentence#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParameterList value);

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
   * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateDefinitionSentence_Predicate()
   * @model containment="true"
   * @generated
   */
  PredicateExpression getPredicate();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.PredicateDefinitionSentence#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(PredicateExpression value);

} // PredicateDefinitionSentence
