/**
 */
package com.isax.validation.dsl.dsl.impl;

import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.PropertyReference;
import com.isax.validation.dsl.dsl.PropertyReferenceExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.PropertyReferenceExpressionImpl#getNode <em>Node</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.PropertyReferenceExpressionImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyReferenceExpressionImpl extends PropertyExpressionImpl implements PropertyReferenceExpression
{
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
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected PropertyReference property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyReferenceExpressionImpl()
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
		return DslPackage.Literals.PROPERTY_REFERENCE_EXPRESSION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.PROPERTY_REFERENCE_EXPRESSION__NODE, oldNode, node));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PROPERTY_REFERENCE_EXPRESSION__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyReference getProperty()
	{
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(PropertyReference newProperty, NotificationChain msgs)
	{
		PropertyReference oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.PROPERTY_REFERENCE_EXPRESSION__PROPERTY, oldProperty, newProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(PropertyReference newProperty)
	{
		if (newProperty != property)
		{
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.PROPERTY_REFERENCE_EXPRESSION__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.PROPERTY_REFERENCE_EXPRESSION__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PROPERTY_REFERENCE_EXPRESSION__PROPERTY, newProperty, newProperty));
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
			case DslPackage.PROPERTY_REFERENCE_EXPRESSION__PROPERTY:
				return basicSetProperty(null, msgs);
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
			case DslPackage.PROPERTY_REFERENCE_EXPRESSION__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case DslPackage.PROPERTY_REFERENCE_EXPRESSION__PROPERTY:
				return getProperty();
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
			case DslPackage.PROPERTY_REFERENCE_EXPRESSION__NODE:
				setNode((NodeDefinition)newValue);
				return;
			case DslPackage.PROPERTY_REFERENCE_EXPRESSION__PROPERTY:
				setProperty((PropertyReference)newValue);
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
			case DslPackage.PROPERTY_REFERENCE_EXPRESSION__NODE:
				setNode((NodeDefinition)null);
				return;
			case DslPackage.PROPERTY_REFERENCE_EXPRESSION__PROPERTY:
				setProperty((PropertyReference)null);
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
			case DslPackage.PROPERTY_REFERENCE_EXPRESSION__NODE:
				return node != null;
			case DslPackage.PROPERTY_REFERENCE_EXPRESSION__PROPERTY:
				return property != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyReferenceExpressionImpl
