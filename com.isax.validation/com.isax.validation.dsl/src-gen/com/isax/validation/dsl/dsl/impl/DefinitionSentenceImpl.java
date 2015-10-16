/**
 */
package com.isax.validation.dsl.dsl.impl;

import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.Quantification;
import com.isax.validation.dsl.dsl.RelationQualifier;
import com.isax.validation.dsl.dsl.TargetDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Sentence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.DefinitionSentenceImpl#getQuantification <em>Quantification</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.DefinitionSentenceImpl#getNode <em>Node</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.DefinitionSentenceImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.DefinitionSentenceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionSentenceImpl extends SentenceImpl implements DefinitionSentence
{
  /**
   * The cached value of the '{@link #getQuantification() <em>Quantification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantification()
   * @generated
   * @ordered
   */
  protected Quantification quantification;

  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected NodeDefinition node;

  /**
   * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected static final RelationQualifier QUALIFIER_EDEFAULT = RelationQualifier.MUST;

  /**
   * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected RelationQualifier qualifier = QUALIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected TargetDefinition target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionSentenceImpl()
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
    return DslPackage.Literals.DEFINITION_SENTENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantification getQuantification()
  {
    return quantification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantification(Quantification newQuantification, NotificationChain msgs)
  {
    Quantification oldQuantification = quantification;
    quantification = newQuantification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.DEFINITION_SENTENCE__QUANTIFICATION, oldQuantification, newQuantification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantification(Quantification newQuantification)
  {
    if (newQuantification != quantification)
    {
      NotificationChain msgs = null;
      if (quantification != null)
        msgs = ((InternalEObject)quantification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.DEFINITION_SENTENCE__QUANTIFICATION, null, msgs);
      if (newQuantification != null)
        msgs = ((InternalEObject)newQuantification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.DEFINITION_SENTENCE__QUANTIFICATION, null, msgs);
      msgs = basicSetQuantification(newQuantification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DEFINITION_SENTENCE__QUANTIFICATION, newQuantification, newQuantification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeDefinition getNode()
  {
    if (node != null && node.eIsProxy())
    {
      InternalEObject oldNode = (InternalEObject)node;
      node = (NodeDefinition)eResolveProxy(oldNode);
      if (node != oldNode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.DEFINITION_SENTENCE__NODE, oldNode, node));
      }
    }
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeDefinition basicGetNode()
  {
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNode(NodeDefinition newNode)
  {
    NodeDefinition oldNode = node;
    node = newNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DEFINITION_SENTENCE__NODE, oldNode, node));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationQualifier getQualifier()
  {
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifier(RelationQualifier newQualifier)
  {
    RelationQualifier oldQualifier = qualifier;
    qualifier = newQualifier == null ? QUALIFIER_EDEFAULT : newQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DEFINITION_SENTENCE__QUALIFIER, oldQualifier, qualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetDefinition getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(TargetDefinition newTarget, NotificationChain msgs)
  {
    TargetDefinition oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.DEFINITION_SENTENCE__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(TargetDefinition newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.DEFINITION_SENTENCE__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.DEFINITION_SENTENCE__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DEFINITION_SENTENCE__TARGET, newTarget, newTarget));
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
      case DslPackage.DEFINITION_SENTENCE__QUANTIFICATION:
        return basicSetQuantification(null, msgs);
      case DslPackage.DEFINITION_SENTENCE__TARGET:
        return basicSetTarget(null, msgs);
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
      case DslPackage.DEFINITION_SENTENCE__QUANTIFICATION:
        return getQuantification();
      case DslPackage.DEFINITION_SENTENCE__NODE:
        if (resolve) return getNode();
        return basicGetNode();
      case DslPackage.DEFINITION_SENTENCE__QUALIFIER:
        return getQualifier();
      case DslPackage.DEFINITION_SENTENCE__TARGET:
        return getTarget();
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
      case DslPackage.DEFINITION_SENTENCE__QUANTIFICATION:
        setQuantification((Quantification)newValue);
        return;
      case DslPackage.DEFINITION_SENTENCE__NODE:
        setNode((NodeDefinition)newValue);
        return;
      case DslPackage.DEFINITION_SENTENCE__QUALIFIER:
        setQualifier((RelationQualifier)newValue);
        return;
      case DslPackage.DEFINITION_SENTENCE__TARGET:
        setTarget((TargetDefinition)newValue);
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
      case DslPackage.DEFINITION_SENTENCE__QUANTIFICATION:
        setQuantification((Quantification)null);
        return;
      case DslPackage.DEFINITION_SENTENCE__NODE:
        setNode((NodeDefinition)null);
        return;
      case DslPackage.DEFINITION_SENTENCE__QUALIFIER:
        setQualifier(QUALIFIER_EDEFAULT);
        return;
      case DslPackage.DEFINITION_SENTENCE__TARGET:
        setTarget((TargetDefinition)null);
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
      case DslPackage.DEFINITION_SENTENCE__QUANTIFICATION:
        return quantification != null;
      case DslPackage.DEFINITION_SENTENCE__NODE:
        return node != null;
      case DslPackage.DEFINITION_SENTENCE__QUALIFIER:
        return qualifier != QUALIFIER_EDEFAULT;
      case DslPackage.DEFINITION_SENTENCE__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (qualifier: ");
    result.append(qualifier);
    result.append(')');
    return result.toString();
  }

} //DefinitionSentenceImpl
