/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.Validator#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getValidator()
 * @model
 * @generated
 */
public interface Validator extends EObject
{
  /**
   * Returns the value of the '<em><b>Sentences</b></em>' containment reference list.
   * The list contents are of type {@link com.isax.validation.dsl.dsl.Sentence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sentences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sentences</em>' containment reference list.
   * @see com.isax.validation.dsl.dsl.DslPackage#getValidator_Sentences()
   * @model containment="true"
   * @generated
   */
  EList<Sentence> getSentences();

} // Validator
