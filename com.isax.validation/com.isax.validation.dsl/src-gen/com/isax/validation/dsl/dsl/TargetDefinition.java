/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

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
 *   <li>{@link com.isax.validation.dsl.dsl.TargetDefinition#getDefinition <em>Definition</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.TargetDefinition#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.TargetDefinition#getXblock <em>Xblock</em>}</li>
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
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(PredicateExpression)
   * @see com.isax.validation.dsl.dsl.DslPackage#getTargetDefinition_Predicate()
   * @model containment="true"
   * @generated
   */
  PredicateExpression getPredicate();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.TargetDefinition#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(PredicateExpression value);

  /**
   * Returns the value of the '<em><b>Xblock</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xblock</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xblock</em>' containment reference.
   * @see #setXblock(XExpression)
   * @see com.isax.validation.dsl.dsl.DslPackage#getTargetDefinition_Xblock()
   * @model containment="true"
   * @generated
   */
  XExpression getXblock();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.TargetDefinition#getXblock <em>Xblock</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xblock</em>' containment reference.
   * @see #getXblock()
   * @generated
   */
  void setXblock(XExpression value);

} // TargetDefinition
