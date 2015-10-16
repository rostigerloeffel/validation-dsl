/**
 */
package com.isax.validation.dsl.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Relation Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.PropertyRelationPredicate#getLhs <em>Lhs</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.PropertyRelationPredicate#getRelation <em>Relation</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.PropertyRelationPredicate#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getPropertyRelationPredicate()
 * @model
 * @generated
 */
public interface PropertyRelationPredicate extends PredicateCall
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
   * @see #setLhs(PropertyExpression)
   * @see com.isax.validation.dsl.dsl.DslPackage#getPropertyRelationPredicate_Lhs()
   * @model containment="true"
   * @generated
   */
  PropertyExpression getLhs();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.PropertyRelationPredicate#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(PropertyExpression value);

  /**
   * Returns the value of the '<em><b>Relation</b></em>' attribute.
   * The literals are from the enumeration {@link com.isax.validation.dsl.dsl.PropertyRelation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' attribute.
   * @see com.isax.validation.dsl.dsl.PropertyRelation
   * @see #setRelation(PropertyRelation)
   * @see com.isax.validation.dsl.dsl.DslPackage#getPropertyRelationPredicate_Relation()
   * @model
   * @generated
   */
  PropertyRelation getRelation();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.PropertyRelationPredicate#getRelation <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' attribute.
   * @see com.isax.validation.dsl.dsl.PropertyRelation
   * @see #getRelation()
   * @generated
   */
  void setRelation(PropertyRelation value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(PropertyExpression)
   * @see com.isax.validation.dsl.dsl.DslPackage#getPropertyRelationPredicate_Rhs()
   * @model containment="true"
   * @generated
   */
  PropertyExpression getRhs();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.PropertyRelationPredicate#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(PropertyExpression value);

} // PropertyRelationPredicate
