/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.ct.textct.impl;

import org.be.textbe.ct.textct.ComponentList;
import org.be.textbe.ct.textct.CompositionTree;
import org.be.textbe.ct.textct.OptionList;
import org.be.textbe.ct.textct.RequirementList;
import org.be.textbe.ct.textct.TextCT;
import org.be.textbe.ct.textct.TextctPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text CT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.ct.textct.impl.TextCTImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.impl.TextCTImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.impl.TextCTImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.impl.TextCTImpl#getCompositionTree <em>Composition Tree</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextCTImpl extends EObjectImpl implements TextCT {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected OptionList options;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected RequirementList requirements;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected ComponentList components;

	/**
	 * The cached value of the '{@link #getCompositionTree() <em>Composition Tree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionTree()
	 * @generated
	 * @ordered
	 */
	protected CompositionTree compositionTree;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextCTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextctPackage.Literals.TEXT_CT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionList getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(OptionList newOptions, NotificationChain msgs) {
		OptionList oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextctPackage.TEXT_CT__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(OptionList newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextctPackage.TEXT_CT__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextctPackage.TEXT_CT__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextctPackage.TEXT_CT__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementList getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(RequirementList newRequirements, NotificationChain msgs) {
		RequirementList oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextctPackage.TEXT_CT__REQUIREMENTS, oldRequirements, newRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(RequirementList newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextctPackage.TEXT_CT__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextctPackage.TEXT_CT__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextctPackage.TEXT_CT__REQUIREMENTS, newRequirements, newRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentList getComponents() {
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponents(ComponentList newComponents, NotificationChain msgs) {
		ComponentList oldComponents = components;
		components = newComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextctPackage.TEXT_CT__COMPONENTS, oldComponents, newComponents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponents(ComponentList newComponents) {
		if (newComponents != components) {
			NotificationChain msgs = null;
			if (components != null)
				msgs = ((InternalEObject)components).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextctPackage.TEXT_CT__COMPONENTS, null, msgs);
			if (newComponents != null)
				msgs = ((InternalEObject)newComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextctPackage.TEXT_CT__COMPONENTS, null, msgs);
			msgs = basicSetComponents(newComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextctPackage.TEXT_CT__COMPONENTS, newComponents, newComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionTree getCompositionTree() {
		return compositionTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositionTree(CompositionTree newCompositionTree, NotificationChain msgs) {
		CompositionTree oldCompositionTree = compositionTree;
		compositionTree = newCompositionTree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextctPackage.TEXT_CT__COMPOSITION_TREE, oldCompositionTree, newCompositionTree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositionTree(CompositionTree newCompositionTree) {
		if (newCompositionTree != compositionTree) {
			NotificationChain msgs = null;
			if (compositionTree != null)
				msgs = ((InternalEObject)compositionTree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextctPackage.TEXT_CT__COMPOSITION_TREE, null, msgs);
			if (newCompositionTree != null)
				msgs = ((InternalEObject)newCompositionTree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextctPackage.TEXT_CT__COMPOSITION_TREE, null, msgs);
			msgs = basicSetCompositionTree(newCompositionTree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextctPackage.TEXT_CT__COMPOSITION_TREE, newCompositionTree, newCompositionTree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextctPackage.TEXT_CT__OPTIONS:
				return basicSetOptions(null, msgs);
			case TextctPackage.TEXT_CT__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case TextctPackage.TEXT_CT__COMPONENTS:
				return basicSetComponents(null, msgs);
			case TextctPackage.TEXT_CT__COMPOSITION_TREE:
				return basicSetCompositionTree(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextctPackage.TEXT_CT__OPTIONS:
				return getOptions();
			case TextctPackage.TEXT_CT__REQUIREMENTS:
				return getRequirements();
			case TextctPackage.TEXT_CT__COMPONENTS:
				return getComponents();
			case TextctPackage.TEXT_CT__COMPOSITION_TREE:
				return getCompositionTree();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TextctPackage.TEXT_CT__OPTIONS:
				setOptions((OptionList)newValue);
				return;
			case TextctPackage.TEXT_CT__REQUIREMENTS:
				setRequirements((RequirementList)newValue);
				return;
			case TextctPackage.TEXT_CT__COMPONENTS:
				setComponents((ComponentList)newValue);
				return;
			case TextctPackage.TEXT_CT__COMPOSITION_TREE:
				setCompositionTree((CompositionTree)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case TextctPackage.TEXT_CT__OPTIONS:
				setOptions((OptionList)null);
				return;
			case TextctPackage.TEXT_CT__REQUIREMENTS:
				setRequirements((RequirementList)null);
				return;
			case TextctPackage.TEXT_CT__COMPONENTS:
				setComponents((ComponentList)null);
				return;
			case TextctPackage.TEXT_CT__COMPOSITION_TREE:
				setCompositionTree((CompositionTree)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TextctPackage.TEXT_CT__OPTIONS:
				return options != null;
			case TextctPackage.TEXT_CT__REQUIREMENTS:
				return requirements != null;
			case TextctPackage.TEXT_CT__COMPONENTS:
				return components != null;
			case TextctPackage.TEXT_CT__COMPOSITION_TREE:
				return compositionTree != null;
		}
		return super.eIsSet(featureID);
	}

} //TextCTImpl
