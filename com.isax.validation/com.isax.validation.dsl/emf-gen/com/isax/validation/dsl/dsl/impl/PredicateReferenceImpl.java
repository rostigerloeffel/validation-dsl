/**
 */
package com.isax.validation.dsl.dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.isax.validation.dsl.dsl.ArgumentList;
import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.PredicateDefinitionSentence;
import com.isax.validation.dsl.dsl.PredicateReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.PredicateReferenceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.PredicateReferenceImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicateReferenceImpl extends PredicateCallImpl implements PredicateReference
{
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected PredicateDefinitionSentence reference;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected ArgumentList arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateReferenceImpl()
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
		return DslPackage.Literals.PREDICATE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateDefinitionSentence getReference()
	{
		if (reference != null && reference.eIsProxy())
		{
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (PredicateDefinitionSentence)eResolveProxy(oldReference);
			if (reference != oldReference)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.PREDICATE_REFERENCE__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateDefinitionSentence basicGetReference()
	{
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(PredicateDefinitionSentence newReference)
	{
		PredicateDefinitionSentence oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PREDICATE_REFERENCE__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentList getArguments()
	{
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArguments(ArgumentList newArguments, NotificationChain msgs)
	{
		ArgumentList oldArguments = arguments;
		arguments = newArguments;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.PREDICATE_REFERENCE__ARGUMENTS, oldArguments, newArguments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArguments(ArgumentList newArguments)
	{
		if (newArguments != arguments)
		{
			NotificationChain msgs = null;
			if (arguments != null)
				msgs = ((InternalEObject)arguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.PREDICATE_REFERENCE__ARGUMENTS, null, msgs);
			if (newArguments != null)
				msgs = ((InternalEObject)newArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.PREDICATE_REFERENCE__ARGUMENTS, null, msgs);
			msgs = basicSetArguments(newArguments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PREDICATE_REFERENCE__ARGUMENTS, newArguments, newArguments));
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
			case DslPackage.PREDICATE_REFERENCE__ARGUMENTS:
				return basicSetArguments(null, msgs);
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
			case DslPackage.PREDICATE_REFERENCE__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case DslPackage.PREDICATE_REFERENCE__ARGUMENTS:
				return getArguments();
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
			case DslPackage.PREDICATE_REFERENCE__REFERENCE:
				setReference((PredicateDefinitionSentence)newValue);
				return;
			case DslPackage.PREDICATE_REFERENCE__ARGUMENTS:
				setArguments((ArgumentList)newValue);
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
			case DslPackage.PREDICATE_REFERENCE__REFERENCE:
				setReference((PredicateDefinitionSentence)null);
				return;
			case DslPackage.PREDICATE_REFERENCE__ARGUMENTS:
				setArguments((ArgumentList)null);
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
			case DslPackage.PREDICATE_REFERENCE__REFERENCE:
				return reference != null;
			case DslPackage.PREDICATE_REFERENCE__ARGUMENTS:
				return arguments != null;
		}
		return super.eIsSet(featureID);
	}

} //PredicateReferenceImpl
