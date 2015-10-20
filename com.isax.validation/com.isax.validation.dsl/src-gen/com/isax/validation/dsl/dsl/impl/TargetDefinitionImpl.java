/**
 */
package com.isax.validation.dsl.dsl.impl;

import com.isax.validation.dsl.dsl.Axis;
import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.PredicateExpression;
import com.isax.validation.dsl.dsl.TargetDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl#getXblock <em>Xblock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetDefinitionImpl extends MinimalEObjectImpl.Container implements TargetDefinition
{
  /**
   * The default value of the '{@link #getAxis() <em>Axis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxis()
   * @generated
   * @ordered
   */
  protected static final Axis AXIS_EDEFAULT = Axis.PARENT;

  /**
   * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxis()
   * @generated
   * @ordered
   */
  protected Axis axis = AXIS_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinition()
   * @generated
   * @ordered
   */
  protected NodeDefinition definition;

  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected PredicateExpression predicate;

  /**
   * The cached value of the '{@link #getXblock() <em>Xblock</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXblock()
   * @generated
   * @ordered
   */
  protected XExpression xblock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TargetDefinitionImpl()
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
    return DslPackage.Literals.TARGET_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Axis getAxis()
  {
    return axis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAxis(Axis newAxis)
  {
    Axis oldAxis = axis;
    axis = newAxis == null ? AXIS_EDEFAULT : newAxis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__AXIS, oldAxis, axis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeDefinition getDefinition()
  {
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefinition(NodeDefinition newDefinition, NotificationChain msgs)
  {
    NodeDefinition oldDefinition = definition;
    definition = newDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__DEFINITION, oldDefinition, newDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefinition(NodeDefinition newDefinition)
  {
    if (newDefinition != definition)
    {
      NotificationChain msgs = null;
      if (definition != null)
        msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.TARGET_DEFINITION__DEFINITION, null, msgs);
      if (newDefinition != null)
        msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.TARGET_DEFINITION__DEFINITION, null, msgs);
      msgs = basicSetDefinition(newDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__DEFINITION, newDefinition, newDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateExpression getPredicate()
  {
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredicate(PredicateExpression newPredicate, NotificationChain msgs)
  {
    PredicateExpression oldPredicate = predicate;
    predicate = newPredicate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__PREDICATE, oldPredicate, newPredicate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredicate(PredicateExpression newPredicate)
  {
    if (newPredicate != predicate)
    {
      NotificationChain msgs = null;
      if (predicate != null)
        msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.TARGET_DEFINITION__PREDICATE, null, msgs);
      if (newPredicate != null)
        msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.TARGET_DEFINITION__PREDICATE, null, msgs);
      msgs = basicSetPredicate(newPredicate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__PREDICATE, newPredicate, newPredicate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getXblock()
  {
    return xblock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXblock(XExpression newXblock, NotificationChain msgs)
  {
    XExpression oldXblock = xblock;
    xblock = newXblock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__XBLOCK, oldXblock, newXblock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXblock(XExpression newXblock)
  {
    if (newXblock != xblock)
    {
      NotificationChain msgs = null;
      if (xblock != null)
        msgs = ((InternalEObject)xblock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.TARGET_DEFINITION__XBLOCK, null, msgs);
      if (newXblock != null)
        msgs = ((InternalEObject)newXblock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.TARGET_DEFINITION__XBLOCK, null, msgs);
      msgs = basicSetXblock(newXblock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__XBLOCK, newXblock, newXblock));
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
      case DslPackage.TARGET_DEFINITION__DEFINITION:
        return basicSetDefinition(null, msgs);
      case DslPackage.TARGET_DEFINITION__PREDICATE:
        return basicSetPredicate(null, msgs);
      case DslPackage.TARGET_DEFINITION__XBLOCK:
        return basicSetXblock(null, msgs);
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
      case DslPackage.TARGET_DEFINITION__AXIS:
        return getAxis();
      case DslPackage.TARGET_DEFINITION__DEFINITION:
        return getDefinition();
      case DslPackage.TARGET_DEFINITION__PREDICATE:
        return getPredicate();
      case DslPackage.TARGET_DEFINITION__XBLOCK:
        return getXblock();
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
      case DslPackage.TARGET_DEFINITION__AXIS:
        setAxis((Axis)newValue);
        return;
      case DslPackage.TARGET_DEFINITION__DEFINITION:
        setDefinition((NodeDefinition)newValue);
        return;
      case DslPackage.TARGET_DEFINITION__PREDICATE:
        setPredicate((PredicateExpression)newValue);
        return;
      case DslPackage.TARGET_DEFINITION__XBLOCK:
        setXblock((XExpression)newValue);
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
      case DslPackage.TARGET_DEFINITION__AXIS:
        setAxis(AXIS_EDEFAULT);
        return;
      case DslPackage.TARGET_DEFINITION__DEFINITION:
        setDefinition((NodeDefinition)null);
        return;
      case DslPackage.TARGET_DEFINITION__PREDICATE:
        setPredicate((PredicateExpression)null);
        return;
      case DslPackage.TARGET_DEFINITION__XBLOCK:
        setXblock((XExpression)null);
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
      case DslPackage.TARGET_DEFINITION__AXIS:
        return axis != AXIS_EDEFAULT;
      case DslPackage.TARGET_DEFINITION__DEFINITION:
        return definition != null;
      case DslPackage.TARGET_DEFINITION__PREDICATE:
        return predicate != null;
      case DslPackage.TARGET_DEFINITION__XBLOCK:
        return xblock != null;
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
    result.append(" (axis: ");
    result.append(axis);
    result.append(')');
    return result.toString();
  }

} //TargetDefinitionImpl
