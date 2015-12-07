/**
 */
package com.isax.validation.dsl.dsl.impl;

import com.isax.validation.dsl.dsl.ConstraintSentence;
import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.PredicateExpression;
import com.isax.validation.dsl.dsl.QuantificationList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Sentence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.ConstraintSentenceImpl#getQuantifications <em>Quantifications</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.ConstraintSentenceImpl#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintSentenceImpl extends SentenceImpl implements ConstraintSentence
{
	/**
	 * The cached value of the '{@link #getQuantifications() <em>Quantifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifications()
	 * @generated
	 * @ordered
	 */
	protected QuantificationList quantifications;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintSentenceImpl()
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
		return DslPackage.Literals.CONSTRAINT_SENTENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantificationList getQuantifications()
	{
		return quantifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantifications(QuantificationList newQuantifications, NotificationChain msgs)
	{
		QuantificationList oldQuantifications = quantifications;
		quantifications = newQuantifications;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.CONSTRAINT_SENTENCE__QUANTIFICATIONS, oldQuantifications, newQuantifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantifications(QuantificationList newQuantifications)
	{
		if (newQuantifications != quantifications)
		{
			NotificationChain msgs = null;
			if (quantifications != null)
				msgs = ((InternalEObject)quantifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.CONSTRAINT_SENTENCE__QUANTIFICATIONS, null, msgs);
			if (newQuantifications != null)
				msgs = ((InternalEObject)newQuantifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.CONSTRAINT_SENTENCE__QUANTIFICATIONS, null, msgs);
			msgs = basicSetQuantifications(newQuantifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CONSTRAINT_SENTENCE__QUANTIFICATIONS, newQuantifications, newQuantifications));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.CONSTRAINT_SENTENCE__PREDICATE, oldPredicate, newPredicate);
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
				msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.CONSTRAINT_SENTENCE__PREDICATE, null, msgs);
			if (newPredicate != null)
				msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.CONSTRAINT_SENTENCE__PREDICATE, null, msgs);
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CONSTRAINT_SENTENCE__PREDICATE, newPredicate, newPredicate));
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
			case DslPackage.CONSTRAINT_SENTENCE__QUANTIFICATIONS:
				return basicSetQuantifications(null, msgs);
			case DslPackage.CONSTRAINT_SENTENCE__PREDICATE:
				return basicSetPredicate(null, msgs);
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
			case DslPackage.CONSTRAINT_SENTENCE__QUANTIFICATIONS:
				return getQuantifications();
			case DslPackage.CONSTRAINT_SENTENCE__PREDICATE:
				return getPredicate();
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
			case DslPackage.CONSTRAINT_SENTENCE__QUANTIFICATIONS:
				setQuantifications((QuantificationList)newValue);
				return;
			case DslPackage.CONSTRAINT_SENTENCE__PREDICATE:
				setPredicate((PredicateExpression)newValue);
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
			case DslPackage.CONSTRAINT_SENTENCE__QUANTIFICATIONS:
				setQuantifications((QuantificationList)null);
				return;
			case DslPackage.CONSTRAINT_SENTENCE__PREDICATE:
				setPredicate((PredicateExpression)null);
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
			case DslPackage.CONSTRAINT_SENTENCE__QUANTIFICATIONS:
				return quantifications != null;
			case DslPackage.CONSTRAINT_SENTENCE__PREDICATE:
				return predicate != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstraintSentenceImpl
