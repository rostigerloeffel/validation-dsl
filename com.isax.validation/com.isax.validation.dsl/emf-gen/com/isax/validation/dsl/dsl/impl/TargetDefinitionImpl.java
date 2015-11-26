/**
 */
package com.isax.validation.dsl.dsl.impl;

import com.isax.validation.dsl.dsl.AssignmentList;
import com.isax.validation.dsl.dsl.Axis;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.TargetDefinitionImpl#getAssignments <em>Assignments</em>}</li>
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
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected AssignmentList assignments;

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
	public AssignmentList getAssignments()
	{
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignments(AssignmentList newAssignments, NotificationChain msgs)
	{
		AssignmentList oldAssignments = assignments;
		assignments = newAssignments;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__ASSIGNMENTS, oldAssignments, newAssignments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignments(AssignmentList newAssignments)
	{
		if (newAssignments != assignments)
		{
			NotificationChain msgs = null;
			if (assignments != null)
				msgs = ((InternalEObject)assignments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.TARGET_DEFINITION__ASSIGNMENTS, null, msgs);
			if (newAssignments != null)
				msgs = ((InternalEObject)newAssignments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.TARGET_DEFINITION__ASSIGNMENTS, null, msgs);
			msgs = basicSetAssignments(newAssignments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TARGET_DEFINITION__ASSIGNMENTS, newAssignments, newAssignments));
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
			case DslPackage.TARGET_DEFINITION__ASSIGNMENTS:
				return basicSetAssignments(null, msgs);
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
			case DslPackage.TARGET_DEFINITION__LOCAL:
				return getLocal();
			case DslPackage.TARGET_DEFINITION__DEFINITION:
				return getDefinition();
			case DslPackage.TARGET_DEFINITION__BODY:
				return getBody();
			case DslPackage.TARGET_DEFINITION__ASSIGNMENTS:
				return getAssignments();
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
			case DslPackage.TARGET_DEFINITION__LOCAL:
				setLocal((NodeDefinition)newValue);
				return;
			case DslPackage.TARGET_DEFINITION__DEFINITION:
				setDefinition((NodeDefinition)newValue);
				return;
			case DslPackage.TARGET_DEFINITION__BODY:
				setBody((BodySentences)newValue);
				return;
			case DslPackage.TARGET_DEFINITION__ASSIGNMENTS:
				setAssignments((AssignmentList)newValue);
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
			case DslPackage.TARGET_DEFINITION__LOCAL:
				setLocal((NodeDefinition)null);
				return;
			case DslPackage.TARGET_DEFINITION__DEFINITION:
				setDefinition((NodeDefinition)null);
				return;
			case DslPackage.TARGET_DEFINITION__BODY:
				setBody((BodySentences)null);
				return;
			case DslPackage.TARGET_DEFINITION__ASSIGNMENTS:
				setAssignments((AssignmentList)null);
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
			case DslPackage.TARGET_DEFINITION__LOCAL:
				return local != null;
			case DslPackage.TARGET_DEFINITION__DEFINITION:
				return definition != null;
			case DslPackage.TARGET_DEFINITION__BODY:
				return body != null;
			case DslPackage.TARGET_DEFINITION__ASSIGNMENTS:
				return assignments != null;
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
