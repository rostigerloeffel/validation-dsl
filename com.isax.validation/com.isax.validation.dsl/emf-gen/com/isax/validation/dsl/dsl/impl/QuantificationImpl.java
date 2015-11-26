/**
 */
package com.isax.validation.dsl.dsl.impl;

import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.Quantification;
import com.isax.validation.dsl.dsl.Quantor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.QuantificationImpl#getQuantor <em>Quantor</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.QuantificationImpl#getNode <em>Node</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.QuantificationImpl#getNodeSet <em>Node Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantificationImpl extends MinimalEObjectImpl.Container implements Quantification
{
	/**
	 * The default value of the '{@link #getQuantor() <em>Quantor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantor()
	 * @generated
	 * @ordered
	 */
	protected static final Quantor QUANTOR_EDEFAULT = Quantor.EACH;

	/**
	 * The cached value of the '{@link #getQuantor() <em>Quantor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantor()
	 * @generated
	 * @ordered
	 */
	protected Quantor quantor = QUANTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected NodeDefinition node;

	/**
	 * The cached value of the '{@link #getNodeSet() <em>Node Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeSet()
	 * @generated
	 * @ordered
	 */
	protected NodeDefinition nodeSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantificationImpl()
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
		return DslPackage.Literals.QUANTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantor getQuantor()
	{
		return quantor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantor(Quantor newQuantor)
	{
		Quantor oldQuantor = quantor;
		quantor = newQuantor == null ? QUANTOR_EDEFAULT : newQuantor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.QUANTIFICATION__QUANTOR, oldQuantor, quantor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeDefinition getNode()
	{
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(NodeDefinition newNode, NotificationChain msgs)
	{
		NodeDefinition oldNode = node;
		node = newNode;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.QUANTIFICATION__NODE, oldNode, newNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(NodeDefinition newNode)
	{
		if (newNode != node)
		{
			NotificationChain msgs = null;
			if (node != null)
				msgs = ((InternalEObject)node).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.QUANTIFICATION__NODE, null, msgs);
			if (newNode != null)
				msgs = ((InternalEObject)newNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.QUANTIFICATION__NODE, null, msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.QUANTIFICATION__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeDefinition getNodeSet()
	{
		if (nodeSet != null && nodeSet.eIsProxy())
		{
			InternalEObject oldNodeSet = (InternalEObject)nodeSet;
			nodeSet = (NodeDefinition)eResolveProxy(oldNodeSet);
			if (nodeSet != oldNodeSet)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.QUANTIFICATION__NODE_SET, oldNodeSet, nodeSet));
			}
		}
		return nodeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeDefinition basicGetNodeSet()
	{
		return nodeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeSet(NodeDefinition newNodeSet)
	{
		NodeDefinition oldNodeSet = nodeSet;
		nodeSet = newNodeSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.QUANTIFICATION__NODE_SET, oldNodeSet, nodeSet));
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
			case DslPackage.QUANTIFICATION__NODE:
				return basicSetNode(null, msgs);
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
			case DslPackage.QUANTIFICATION__QUANTOR:
				return getQuantor();
			case DslPackage.QUANTIFICATION__NODE:
				return getNode();
			case DslPackage.QUANTIFICATION__NODE_SET:
				if (resolve) return getNodeSet();
				return basicGetNodeSet();
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
			case DslPackage.QUANTIFICATION__QUANTOR:
				setQuantor((Quantor)newValue);
				return;
			case DslPackage.QUANTIFICATION__NODE:
				setNode((NodeDefinition)newValue);
				return;
			case DslPackage.QUANTIFICATION__NODE_SET:
				setNodeSet((NodeDefinition)newValue);
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
			case DslPackage.QUANTIFICATION__QUANTOR:
				setQuantor(QUANTOR_EDEFAULT);
				return;
			case DslPackage.QUANTIFICATION__NODE:
				setNode((NodeDefinition)null);
				return;
			case DslPackage.QUANTIFICATION__NODE_SET:
				setNodeSet((NodeDefinition)null);
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
			case DslPackage.QUANTIFICATION__QUANTOR:
				return quantor != QUANTOR_EDEFAULT;
			case DslPackage.QUANTIFICATION__NODE:
				return node != null;
			case DslPackage.QUANTIFICATION__NODE_SET:
				return nodeSet != null;
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
		result.append(" (quantor: ");
		result.append(quantor);
		result.append(')');
		return result.toString();
	}

} //QuantificationImpl
