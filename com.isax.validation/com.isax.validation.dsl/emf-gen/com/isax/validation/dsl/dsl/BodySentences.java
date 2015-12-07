/**
 */
package com.isax.validation.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Sentences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.BodySentences#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.BodySentences#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.BodySentences#getSentences <em>Sentences</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getBodySentences()
 * @model
 * @generated
 */
public interface BodySentences extends EObject
{
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' reference list.
	 * The list contents are of type {@link com.isax.validation.dsl.dsl.DefinitionSentence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' reference list.
	 * @see com.isax.validation.dsl.dsl.DslPackage#getBodySentences_Definitions()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<DefinitionSentence> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference list.
	 * The list contents are of type {@link com.isax.validation.dsl.dsl.ConstraintSentence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference list.
	 * @see com.isax.validation.dsl.dsl.DslPackage#getBodySentences_Constraints()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<ConstraintSentence> getConstraints();

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
	 * @see com.isax.validation.dsl.dsl.DslPackage#getBodySentences_Sentences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentence> getSentences();

} // BodySentences
