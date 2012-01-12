/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.st.textst.impl;

import org.be.textbe.st.textst.ComponentList;
import org.be.textbe.st.textst.OptionList;
import org.be.textbe.st.textst.RequirementList;
import org.be.textbe.st.textst.StructureTree;
import org.be.textbe.st.textst.TextST;
import org.be.textbe.st.textst.TextstPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text ST</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.st.textst.impl.TextSTImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.be.textbe.st.textst.impl.TextSTImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.be.textbe.st.textst.impl.TextSTImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.be.textbe.st.textst.impl.TextSTImpl#getStructureTree <em>Structure Tree</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextSTImpl extends EObjectImpl implements TextST
{
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
	 * The cached value of the '{@link #getStructureTree() <em>Structure Tree</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStructureTree()
	 * @generated
	 * @ordered
	 */
  protected StructureTree structureTree;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TextSTImpl()
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
		return TextstPackage.Literals.TEXT_ST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OptionList getOptions()
  {
		return options;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOptions(OptionList newOptions, NotificationChain msgs)
  {
		OptionList oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextstPackage.TEXT_ST__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOptions(OptionList newOptions)
  {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextstPackage.TEXT_ST__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextstPackage.TEXT_ST__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.TEXT_ST__OPTIONS, newOptions, newOptions));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RequirementList getRequirements()
  {
		return requirements;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRequirements(RequirementList newRequirements, NotificationChain msgs)
  {
		RequirementList oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextstPackage.TEXT_ST__REQUIREMENTS, oldRequirements, newRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRequirements(RequirementList newRequirements)
  {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextstPackage.TEXT_ST__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextstPackage.TEXT_ST__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.TEXT_ST__REQUIREMENTS, newRequirements, newRequirements));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ComponentList getComponents()
  {
		return components;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetComponents(ComponentList newComponents, NotificationChain msgs)
  {
		ComponentList oldComponents = components;
		components = newComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextstPackage.TEXT_ST__COMPONENTS, oldComponents, newComponents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setComponents(ComponentList newComponents)
  {
		if (newComponents != components) {
			NotificationChain msgs = null;
			if (components != null)
				msgs = ((InternalEObject)components).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextstPackage.TEXT_ST__COMPONENTS, null, msgs);
			if (newComponents != null)
				msgs = ((InternalEObject)newComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextstPackage.TEXT_ST__COMPONENTS, null, msgs);
			msgs = basicSetComponents(newComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.TEXT_ST__COMPONENTS, newComponents, newComponents));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StructureTree getStructureTree()
  {
		return structureTree;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetStructureTree(StructureTree newStructureTree, NotificationChain msgs)
  {
		StructureTree oldStructureTree = structureTree;
		structureTree = newStructureTree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextstPackage.TEXT_ST__STRUCTURE_TREE, oldStructureTree, newStructureTree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setStructureTree(StructureTree newStructureTree)
  {
		if (newStructureTree != structureTree) {
			NotificationChain msgs = null;
			if (structureTree != null)
				msgs = ((InternalEObject)structureTree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextstPackage.TEXT_ST__STRUCTURE_TREE, null, msgs);
			if (newStructureTree != null)
				msgs = ((InternalEObject)newStructureTree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextstPackage.TEXT_ST__STRUCTURE_TREE, null, msgs);
			msgs = basicSetStructureTree(newStructureTree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.TEXT_ST__STRUCTURE_TREE, newStructureTree, newStructureTree));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case TextstPackage.TEXT_ST__OPTIONS:
				return basicSetOptions(null, msgs);
			case TextstPackage.TEXT_ST__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case TextstPackage.TEXT_ST__COMPONENTS:
				return basicSetComponents(null, msgs);
			case TextstPackage.TEXT_ST__STRUCTURE_TREE:
				return basicSetStructureTree(null, msgs);
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
		switch (featureID) {
			case TextstPackage.TEXT_ST__OPTIONS:
				return getOptions();
			case TextstPackage.TEXT_ST__REQUIREMENTS:
				return getRequirements();
			case TextstPackage.TEXT_ST__COMPONENTS:
				return getComponents();
			case TextstPackage.TEXT_ST__STRUCTURE_TREE:
				return getStructureTree();
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
		switch (featureID) {
			case TextstPackage.TEXT_ST__OPTIONS:
				setOptions((OptionList)newValue);
				return;
			case TextstPackage.TEXT_ST__REQUIREMENTS:
				setRequirements((RequirementList)newValue);
				return;
			case TextstPackage.TEXT_ST__COMPONENTS:
				setComponents((ComponentList)newValue);
				return;
			case TextstPackage.TEXT_ST__STRUCTURE_TREE:
				setStructureTree((StructureTree)newValue);
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
		switch (featureID) {
			case TextstPackage.TEXT_ST__OPTIONS:
				setOptions((OptionList)null);
				return;
			case TextstPackage.TEXT_ST__REQUIREMENTS:
				setRequirements((RequirementList)null);
				return;
			case TextstPackage.TEXT_ST__COMPONENTS:
				setComponents((ComponentList)null);
				return;
			case TextstPackage.TEXT_ST__STRUCTURE_TREE:
				setStructureTree((StructureTree)null);
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
		switch (featureID) {
			case TextstPackage.TEXT_ST__OPTIONS:
				return options != null;
			case TextstPackage.TEXT_ST__REQUIREMENTS:
				return requirements != null;
			case TextstPackage.TEXT_ST__COMPONENTS:
				return components != null;
			case TextstPackage.TEXT_ST__STRUCTURE_TREE:
				return structureTree != null;
		}
		return super.eIsSet(featureID);
	}

} //TextSTImpl
