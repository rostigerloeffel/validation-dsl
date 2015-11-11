/**
 */
package com.isax.validation.dsl.dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.isax.validation.dsl.dsl.BodySentences;
import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.ParameterList;
import com.isax.validation.dsl.dsl.PredicateDefinitionSentence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate Definition Sentence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.PredicateDefinitionSentenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.PredicateDefinitionSentenceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.PredicateDefinitionSentenceImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicateDefinitionSentenceImpl extends SentenceImpl implements PredicateDefinitionSentence
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected ParameterList parameters;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateDefinitionSentenceImpl()
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
		return DslPackage.Literals.PREDICATE_DEFINITION_SENTENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PREDICATE_DEFINITION_SENTENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterList getParameters()
	{
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(ParameterList newParameters, NotificationChain msgs)
	{
		ParameterList oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.PREDICATE_DEFINITION_SENTENCE__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(ParameterList newParameters)
	{
		if (newParameters != parameters)
		{
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.PREDICATE_DEFINITION_SENTENCE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.PREDICATE_DEFINITION_SENTENCE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PREDICATE_DEFINITION_SENTENCE__PARAMETERS, newParameters, newParameters));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.PREDICATE_DEFINITION_SENTENCE__BODY, oldBody, newBody);
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
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.PREDICATE_DEFINITION_SENTENCE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.PREDICATE_DEFINITION_SENTENCE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PREDICATE_DEFINITION_SENTENCE__BODY, newBody, newBody));
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
			case DslPackage.PREDICATE_DEFINITION_SENTENCE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case DslPackage.PREDICATE_DEFINITION_SENTENCE__BODY:
				return basicSetBody(null, msgs);
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
			case DslPackage.PREDICATE_DEFINITION_SENTENCE__NAME:
				return getName();
			case DslPackage.PREDICATE_DEFINITION_SENTENCE__PARAMETERS:
				return getParameters();
			case DslPackage.PREDICATE_DEFINITION_SENTENCE__BODY:
				return getBody();
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
			case DslPackage.PREDICATE_DEFINITION_SENTENCE__NAME:
				setName((String)newValue);
				return;
			case DslPackage.PREDICATE_DEFINITION_SENTENCE__PARAMETERS:
				setParameters((ParameterList)newValue);
				return;
			case DslPackage.PREDICATE_DEFINITION_SENTENCE__BODY:
				setBody((BodySentences)newValue);
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
			case DslPackage.PREDICATE_DEFINITION_SENTENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DslPackage.PREDICATE_DEFINITION_SENTENCE__PARAMETERS:
				setParameters((ParameterList)null);
				return;
			case DslPackage.PREDICATE_DEFINITION_SENTENCE__BODY:
				setBody((BodySentences)null);
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
			case DslPackage.PREDICATE_DEFINITION_SENTENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DslPackage.PREDICATE_DEFINITION_SENTENCE__PARAMETERS:
				return parameters != null;
			case DslPackage.PREDICATE_DEFINITION_SENTENCE__BODY:
				return body != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PredicateDefinitionSentenceImpl
