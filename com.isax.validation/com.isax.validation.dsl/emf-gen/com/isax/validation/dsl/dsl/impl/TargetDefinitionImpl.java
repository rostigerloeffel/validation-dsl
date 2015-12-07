/**
 */
package com.isax.validation.dsl.dsl.impl;

import com.isax.validation.dsl.dsl.BodySentences;
import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.NodeDefinition;
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
 *   <li>{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl#getThen <em>Then</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetDefinitionImpl extends MinimalEObjectImpl.Container implements TargetDefinition
{
	/**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected NodeDefinition local;

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
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected BodySentences body;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected XExpression then;

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
	public NodeDefinition getLocal()
	{
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocal(NodeDefinition newLocal, NotificationChain msgs)
	{
		NodeDefinition oldLocal = local;
		local = newLocal;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__LOCAL, oldLocal, newLocal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(NodeDefinition newLocal)
	{
		if (newLocal != local)
		{
			NotificationChain msgs = null;
			if (local != null)
				msgs = ((InternalEObject)local).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.TARGET_DEFINITION__LOCAL, null, msgs);
			if (newLocal != null)
				msgs = ((InternalEObject)newLocal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.TARGET_DEFINITION__LOCAL, null, msgs);
			msgs = basicSetLocal(newLocal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__LOCAL, newLocal, newLocal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__BODY, oldBody, newBody);
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
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.TARGET_DEFINITION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.TARGET_DEFINITION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getThen()
	{
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen(XExpression newThen, NotificationChain msgs)
	{
		XExpression oldThen = then;
		then = newThen;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__THEN, oldThen, newThen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen(XExpression newThen)
	{
		if (newThen != then)
		{
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.TARGET_DEFINITION__THEN, null, msgs);
			if (newThen != null)
				msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.TARGET_DEFINITION__THEN, null, msgs);
			msgs = basicSetThen(newThen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__THEN, newThen, newThen));
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
			case DslPackage.TARGET_DEFINITION__LOCAL:
				return basicSetLocal(null, msgs);
			case DslPackage.TARGET_DEFINITION__DEFINITION:
				return basicSetDefinition(null, msgs);
			case DslPackage.TARGET_DEFINITION__BODY:
				return basicSetBody(null, msgs);
			case DslPackage.TARGET_DEFINITION__THEN:
				return basicSetThen(null, msgs);
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
			case DslPackage.TARGET_DEFINITION__LOCAL:
				return getLocal();
			case DslPackage.TARGET_DEFINITION__DEFINITION:
				return getDefinition();
			case DslPackage.TARGET_DEFINITION__BODY:
				return getBody();
			case DslPackage.TARGET_DEFINITION__THEN:
				return getThen();
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
			case DslPackage.TARGET_DEFINITION__LOCAL:
				setLocal((NodeDefinition)newValue);
				return;
			case DslPackage.TARGET_DEFINITION__DEFINITION:
				setDefinition((NodeDefinition)newValue);
				return;
			case DslPackage.TARGET_DEFINITION__BODY:
				setBody((BodySentences)newValue);
				return;
			case DslPackage.TARGET_DEFINITION__THEN:
				setThen((XExpression)newValue);
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
			case DslPackage.TARGET_DEFINITION__LOCAL:
				setLocal((NodeDefinition)null);
				return;
			case DslPackage.TARGET_DEFINITION__DEFINITION:
				setDefinition((NodeDefinition)null);
				return;
			case DslPackage.TARGET_DEFINITION__BODY:
				setBody((BodySentences)null);
				return;
			case DslPackage.TARGET_DEFINITION__THEN:
				setThen((XExpression)null);
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
			case DslPackage.TARGET_DEFINITION__LOCAL:
				return local != null;
			case DslPackage.TARGET_DEFINITION__DEFINITION:
				return definition != null;
			case DslPackage.TARGET_DEFINITION__BODY:
				return body != null;
			case DslPackage.TARGET_DEFINITION__THEN:
				return then != null;
		}
		return super.eIsSet(featureID);
	}

} //TargetDefinitionImpl
