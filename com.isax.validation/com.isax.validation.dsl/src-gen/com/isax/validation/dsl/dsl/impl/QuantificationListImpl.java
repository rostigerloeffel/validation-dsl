/**
 */
package com.isax.validation.dsl.dsl.impl;

import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.Quantification;
import com.isax.validation.dsl.dsl.QuantificationList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantification List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.QuantificationListImpl#getQuantifications <em>Quantifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantificationListImpl extends MinimalEObjectImpl.Container implements QuantificationList
{
  /**
   * The cached value of the '{@link #getQuantifications() <em>Quantifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifications()
   * @generated
   * @ordered
   */
  protected EList<Quantification> quantifications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuantificationListImpl()
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
    return DslPackage.Literals.QUANTIFICATION_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Quantification> getQuantifications()
  {
    if (quantifications == null)
    {
      quantifications = new EObjectContainmentEList<Quantification>(Quantification.class, this, DslPackage.QUANTIFICATION_LIST__QUANTIFICATIONS);
    }
    return quantifications;
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
      case DslPackage.QUANTIFICATION_LIST__QUANTIFICATIONS:
        return ((InternalEList<?>)getQuantifications()).basicRemove(otherEnd, msgs);
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
      case DslPackage.QUANTIFICATION_LIST__QUANTIFICATIONS:
        return getQuantifications();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.QUANTIFICATION_LIST__QUANTIFICATIONS:
        getQuantifications().clear();
        getQuantifications().addAll((Collection<? extends Quantification>)newValue);
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
      case DslPackage.QUANTIFICATION_LIST__QUANTIFICATIONS:
        getQuantifications().clear();
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
      case DslPackage.QUANTIFICATION_LIST__QUANTIFICATIONS:
        return quantifications != null && !quantifications.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QuantificationListImpl
