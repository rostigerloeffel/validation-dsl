/**
 */
package com.isax.validation.dsl.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.DefinitionSentence#getQuantification <em>Quantification</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.DefinitionSentence#getNode <em>Node</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.DefinitionSentence#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.DefinitionSentence#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see com.isax.validation.dsl.dsl.DslPackage#getDefinitionSentence()
 * @model
 * @generated
 */
public interface DefinitionSentence extends Sentence
{
  /**
   * Returns the value of the '<em><b>Quantification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantification</em>' containment reference.
   * @see #setQuantification(Quantification)
   * @see com.isax.validation.dsl.dsl.DslPackage#getDefinitionSentence_Quantification()
   * @model containment="true"
   * @generated
   */
  Quantification getQuantification();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.DefinitionSentence#getQuantification <em>Quantification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantification</em>' containment reference.
   * @see #getQuantification()
   * @generated
   */
  void setQuantification(Quantification value);

  /**
   * Returns the value of the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' reference.
   * @see #setNode(NodeDefinition)
   * @see com.isax.validation.dsl.dsl.DslPackage#getDefinitionSentence_Node()
   * @model
   * @generated
   */
  NodeDefinition getNode();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.DefinitionSentence#getNode <em>Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' reference.
   * @see #getNode()
   * @generated
   */
  void setNode(NodeDefinition value);

  /**
   * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
   * The literals are from the enumeration {@link com.isax.validation.dsl.dsl.RelationQualifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier</em>' attribute.
   * @see com.isax.validation.dsl.dsl.RelationQualifier
   * @see #setQualifier(RelationQualifier)
   * @see com.isax.validation.dsl.dsl.DslPackage#getDefinitionSentence_Qualifier()
   * @model
   * @generated
   */
  RelationQualifier getQualifier();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.DefinitionSentence#getQualifier <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' attribute.
   * @see com.isax.validation.dsl.dsl.RelationQualifier
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(RelationQualifier value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(TargetDefinition)
   * @see com.isax.validation.dsl.dsl.DslPackage#getDefinitionSentence_Target()
   * @model containment="true"
   * @generated
   */
  TargetDefinition getTarget();

  /**
   * Sets the value of the '{@link com.isax.validation.dsl.dsl.DefinitionSentence#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(TargetDefinition value);

} // DefinitionSentence
