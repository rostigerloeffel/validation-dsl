/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.PredicateExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.PredicateExpression#getRhs <em>Rhs</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.PredicateExpression#isNegated <em>Negated</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.PredicateExpression#getCall <em>Call</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.PredicateExpression#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateExpression()
 * @model
 * @generated
 */
public interface PredicateExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(PredicateExpression)
   * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateExpression_Lhs()
   * @model containment="true"
   * @generated
   */
  PredicateExpression getLhs();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.PredicateExpression#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(PredicateExpression value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(PredicateExpression)
   * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateExpression_Rhs()
   * @model containment="true"
   * @generated
   */
  PredicateExpression getRhs();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.PredicateExpression#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(PredicateExpression value);

  /**
   * Returns the value of the '<em><b>Negated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negated</em>' attribute.
   * @see #setNegated(boolean)
   * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateExpression_Negated()
   * @model
   * @generated
   */
  boolean isNegated();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.PredicateExpression#isNegated <em>Negated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negated</em>' attribute.
   * @see #isNegated()
   * @generated
   */
  void setNegated(boolean value);

  /**
   * Returns the value of the '<em><b>Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call</em>' containment reference.
   * @see #setCall(PredicateCall)
   * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateExpression_Call()
   * @model containment="true"
   * @generated
   */
  PredicateCall getCall();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.PredicateExpression#getCall <em>Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call</em>' containment reference.
   * @see #getCall()
   * @generated
   */
  void setCall(PredicateCall value);

  /**
   * Returns the value of the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner</em>' containment reference.
   * @see #setInner(PredicateExpression)
   * @see com.isax.validation.dsl.dsl.DslPackage#getPredicateExpression_Inner()
   * @model containment="true"
   * @generated
   */
  PredicateExpression getInner();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.PredicateExpression#getInner <em>Inner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inner</em>' containment reference.
   * @see #getInner()
   * @generated
   */
  void setInner(PredicateExpression value);

} // PredicateExpression
