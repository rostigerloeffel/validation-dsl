/**
 */
package com.isax.validation.dsl.dsl.impl;

import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.DefinitionSentencePredicate;
import com.isax.validation.dsl.dsl.DslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Sentence Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.DefinitionSentencePredicateImpl#getSentence <em>Sentence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionSentencePredicateImpl extends PredicateCallImpl implements DefinitionSentencePredicate
{
  /**
   * The cached value of the '{@link #getSentence() <em>Sentence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSentence()
   * @generated
   * @ordered
   */
  protected DefinitionSentence sentence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionSentencePredicateImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslPackage.Literals.DEFINITION_SENTENCE_PREDICATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionSentence getSentence()
  {
    return sentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSentence(DefinitionSentence newSentence, NotificationChain msgs)
  {
    DefinitionSentence oldSentence = sentence;
    sentence = newSentence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.DEFINITION_SENTENCE_PREDICATE__SENTENCE, oldSentence, newSentence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSentence(DefinitionSentence newSentence)
  {
    if (newSentence != sentence)
    {
      NotificationChain msgs = null;
      if (sentence != null)
        msgs = ((InternalEObject)sentence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.DEFINITION_SENTENCE_PREDICATE__SENTENCE, null, msgs);
      if (newSentence != null)
        msgs = ((InternalEObject)newSentence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.DEFINITION_SENTENCE_PREDICATE__SENTENCE, null, msgs);
      msgs = basicSetSentence(newSentence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DEFINITION_SENTENCE_PREDICATE__SENTENCE, newSentence, newSentence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DslPackage.DEFINITION_SENTENCE_PREDICATE__SENTENCE:
        return basicSetSentence(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslPackage.DEFINITION_SENTENCE_PREDICATE__SENTENCE:
        return getSentence();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.DEFINITION_SENTENCE_PREDICATE__SENTENCE:
        setSentence((DefinitionSentence)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.DEFINITION_SENTENCE_PREDICATE__SENTENCE:
        setSentence((DefinitionSentence)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.DEFINITION_SENTENCE_PREDICATE__SENTENCE:
        return sentence != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitionSentencePredicateImpl
