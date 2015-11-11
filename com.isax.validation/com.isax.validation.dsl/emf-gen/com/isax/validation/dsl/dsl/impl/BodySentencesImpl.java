/**
 */
package com.isax.validation.dsl.dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.isax.validation.dsl.dsl.BodySentences;
import com.isax.validation.dsl.dsl.ConstraintSentence;
import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.Sentence;

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
 *   <li>{@link com.isax.validation.dsl.dsl.impl.BodySentencesImpl#getSentences <em>Sentences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodySentencesImpl extends MinimalEObjectImpl.Container implements BodySentences
{
	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinitionSentence> definitions;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintSentence> constraints;

	/**
	 * The cached value of the '{@link #getSentences() <em>Sentences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentences()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentence> sentences;

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
			definitions = new EObjectResolvingEList<DefinitionSentence>(DefinitionSentence.class, this, DslPackage.BODY_SENTENCES__DEFINITIONS);
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
			constraints = new EObjectResolvingEList<ConstraintSentence>(ConstraintSentence.class, this, DslPackage.BODY_SENTENCES__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentence> getSentences()
	{
		if (sentences == null)
		{
			sentences = new EObjectContainmentEList<Sentence>(Sentence.class, this, DslPackage.BODY_SENTENCES__SENTENCES);
		}
		return sentences;
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
			case DslPackage.BODY_SENTENCES__SENTENCES:
				return ((InternalEList<?>)getSentences()).basicRemove(otherEnd, msgs);
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
			case DslPackage.BODY_SENTENCES__SENTENCES:
				return getSentences();
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
			case DslPackage.BODY_SENTENCES__SENTENCES:
				getSentences().clear();
				getSentences().addAll((Collection<? extends Sentence>)newValue);
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
			case DslPackage.BODY_SENTENCES__SENTENCES:
				getSentences().clear();
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
			case DslPackage.BODY_SENTENCES__SENTENCES:
				return sentences != null && !sentences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodySentencesImpl
