/**
 */
package com.isax.validation.dsl.dsl.impl;

import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.ErrorDefinition;
import com.isax.validation.dsl.dsl.PredicateCall;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.PredicateCallImpl#getError <em>Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicateCallImpl extends MinimalEObjectImpl.Container implements PredicateCall
{
	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected ErrorDefinition error;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateCallImpl()
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
		return DslPackage.Literals.PREDICATE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorDefinition getError()
	{
		if (error != null && error.eIsProxy())
		{
			InternalEObject oldError = (InternalEObject)error;
			error = (ErrorDefinition)eResolveProxy(oldError);
			if (error != oldError)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.PREDICATE_CALL__ERROR, oldError, error));
			}
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorDefinition basicGetError()
	{
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(ErrorDefinition newError)
	{
		ErrorDefinition oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PREDICATE_CALL__ERROR, oldError, error));
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
			case DslPackage.PREDICATE_CALL__ERROR:
				if (resolve) return getError();
				return basicGetError();
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
			case DslPackage.PREDICATE_CALL__ERROR:
				setError((ErrorDefinition)newValue);
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
			case DslPackage.PREDICATE_CALL__ERROR:
				setError((ErrorDefinition)null);
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
			case DslPackage.PREDICATE_CALL__ERROR:
				return error != null;
		}
		return super.eIsSet(featureID);
	}

} //PredicateCallImpl
