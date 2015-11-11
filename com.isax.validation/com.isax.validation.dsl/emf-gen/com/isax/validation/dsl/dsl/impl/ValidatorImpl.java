/**
 */
package com.isax.validation.dsl.dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.isax.validation.dsl.dsl.BodySentences;
import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.PredicateDefinitionSentence;
import com.isax.validation.dsl.dsl.StartOnSentence;
import com.isax.validation.dsl.dsl.Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.ValidatorImpl#getStartOn <em>Start On</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.ValidatorImpl#getBody <em>Body</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.ValidatorImpl#getPredicates <em>Predicates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidatorImpl extends MinimalEObjectImpl.Container implements Validator
{
	/**
	 * The cached value of the '{@link #getStartOn() <em>Start On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOn()
	 * @generated
	 * @ordered
	 */
	protected StartOnSentence startOn;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected BodySentences body;

	/**
	 * The cached value of the '{@link #getPredicates() <em>Predicates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<PredicateDefinitionSentence> predicates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidatorImpl()
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
		return DslPackage.Literals.VALIDATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOnSentence getStartOn()
	{
		return startOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartOn(StartOnSentence newStartOn, NotificationChain msgs)
	{
		StartOnSentence oldStartOn = startOn;
		startOn = newStartOn;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.VALIDATOR__START_ON, oldStartOn, newStartOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOn(StartOnSentence newStartOn)
	{
		if (newStartOn != startOn)
		{
			NotificationChain msgs = null;
			if (startOn != null)
				msgs = ((InternalEObject)startOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.VALIDATOR__START_ON, null, msgs);
			if (newStartOn != null)
				msgs = ((InternalEObject)newStartOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.VALIDATOR__START_ON, null, msgs);
			msgs = basicSetStartOn(newStartOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.VALIDATOR__START_ON, newStartOn, newStartOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodySentences getBody()
	{
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(BodySentences newBody, NotificationChain msgs)
	{
		BodySentences oldBody = body;
		body = newBody;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.VALIDATOR__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(BodySentences newBody)
	{
		if (newBody != body)
		{
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.VALIDATOR__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.VALIDATOR__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.VALIDATOR__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PredicateDefinitionSentence> getPredicates()
	{
		if (predicates == null)
		{
			predicates = new EObjectContainmentEList<PredicateDefinitionSentence>(PredicateDefinitionSentence.class, this, DslPackage.VALIDATOR__PREDICATES);
		}
		return predicates;
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
			case DslPackage.VALIDATOR__START_ON:
				return basicSetStartOn(null, msgs);
			case DslPackage.VALIDATOR__BODY:
				return basicSetBody(null, msgs);
			case DslPackage.VALIDATOR__PREDICATES:
				return ((InternalEList<?>)getPredicates()).basicRemove(otherEnd, msgs);
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
			case DslPackage.VALIDATOR__START_ON:
				return getStartOn();
			case DslPackage.VALIDATOR__BODY:
				return getBody();
			case DslPackage.VALIDATOR__PREDICATES:
				return getPredicates();
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
			case DslPackage.VALIDATOR__START_ON:
				setStartOn((StartOnSentence)newValue);
				return;
			case DslPackage.VALIDATOR__BODY:
				setBody((BodySentences)newValue);
				return;
			case DslPackage.VALIDATOR__PREDICATES:
				getPredicates().clear();
				getPredicates().addAll((Collection<? extends PredicateDefinitionSentence>)newValue);
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
			case DslPackage.VALIDATOR__START_ON:
				setStartOn((StartOnSentence)null);
				return;
			case DslPackage.VALIDATOR__BODY:
				setBody((BodySentences)null);
				return;
			case DslPackage.VALIDATOR__PREDICATES:
				getPredicates().clear();
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
			case DslPackage.VALIDATOR__START_ON:
				return startOn != null;
			case DslPackage.VALIDATOR__BODY:
				return body != null;
			case DslPackage.VALIDATOR__PREDICATES:
				return predicates != null && !predicates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValidatorImpl
