/**
 */
package com.isax.validation.dsl.dsl.impl;

import com.isax.validation.dsl.dsl.BodySentences;
import com.isax.validation.dsl.dsl.ConstraintSentence;
import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.DslPackage;

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
 * An implementation of the model object '<em><b>Body Sentences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.BodySentencesImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link com.isax.validation.dsl.dsl.impl.BodySentencesImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodySentencesImpl extends MinimalEObjectImpl.Container implements BodySentences
{
	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinitionSentence> definitions;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintSentence> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodySentencesImpl()
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
		return DslPackage.Literals.BODY_SENTENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefinitionSentence> getDefinitions()
	{
		if (definitions == null)
		{
			definitions = new EObjectContainmentEList<DefinitionSentence>(DefinitionSentence.class, this, DslPackage.BODY_SENTENCES__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintSentence> getConstraints()
	{
		if (constraints == null)
		{
			constraints = new EObjectContainmentEList<ConstraintSentence>(ConstraintSentence.class, this, DslPackage.BODY_SENTENCES__CONSTRAINTS);
		}
		return constraints;
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
			case DslPackage.BODY_SENTENCES__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
			case DslPackage.BODY_SENTENCES__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case DslPackage.BODY_SENTENCES__DEFINITIONS:
				return getDefinitions();
			case DslPackage.BODY_SENTENCES__CONSTRAINTS:
				return getConstraints();
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
			case DslPackage.BODY_SENTENCES__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends DefinitionSentence>)newValue);
				return;
			case DslPackage.BODY_SENTENCES__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends ConstraintSentence>)newValue);
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
			case DslPackage.BODY_SENTENCES__DEFINITIONS:
				getDefinitions().clear();
				return;
			case DslPackage.BODY_SENTENCES__CONSTRAINTS:
				getConstraints().clear();
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
			case DslPackage.BODY_SENTENCES__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case DslPackage.BODY_SENTENCES__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodySentencesImpl
