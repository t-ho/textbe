/**
 */
package org.be.textbe.bt.textbt.activity.systemStateGuard.impl;

import java.util.Collection;

import org.be.textbe.bt.textbt.BehaviorTree;

import org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuard;
import org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuardPackage;

import org.be.textbe.bt.textbt.component.behavior.state.Selection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System State Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardImpl#getSubtrees <em>Subtrees</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardImpl#getComponentSelection <em>Component Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SystemStateGuardImpl extends EObjectImpl implements SystemStateGuard {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected BehaviorTree child;

	/**
	 * The cached value of the '{@link #getComponentSelection() <em>Component Selection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSelection()
	 * @generated
	 * @ordered
	 */
	protected EList<Selection> componentSelection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemStateGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemStateGuardPackage.Literals.SYSTEM_STATE_GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorTree> getSubtrees() {
		// TODO: implement this method to return the 'Subtrees' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTree getChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(BehaviorTree newChild, NotificationChain msgs) {
		BehaviorTree oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemStateGuardPackage.SYSTEM_STATE_GUARD__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(BehaviorTree newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemStateGuardPackage.SYSTEM_STATE_GUARD__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemStateGuardPackage.SYSTEM_STATE_GUARD__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemStateGuardPackage.SYSTEM_STATE_GUARD__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selection> getComponentSelection() {
		if (componentSelection == null) {
			componentSelection = new EObjectResolvingEList<Selection>(Selection.class, this, SystemStateGuardPackage.SYSTEM_STATE_GUARD__COMPONENT_SELECTION);
		}
		return componentSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemStateGuardPackage.SYSTEM_STATE_GUARD__CHILD:
				return basicSetChild(null, msgs);
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
			case SystemStateGuardPackage.SYSTEM_STATE_GUARD__SUBTREES:
				return getSubtrees();
			case SystemStateGuardPackage.SYSTEM_STATE_GUARD__CHILD:
				return getChild();
			case SystemStateGuardPackage.SYSTEM_STATE_GUARD__COMPONENT_SELECTION:
				return getComponentSelection();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SystemStateGuardPackage.SYSTEM_STATE_GUARD__CHILD:
				setChild((BehaviorTree)newValue);
				return;
			case SystemStateGuardPackage.SYSTEM_STATE_GUARD__COMPONENT_SELECTION:
				getComponentSelection().clear();
				getComponentSelection().addAll((Collection<? extends Selection>)newValue);
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
			case SystemStateGuardPackage.SYSTEM_STATE_GUARD__CHILD:
				setChild((BehaviorTree)null);
				return;
			case SystemStateGuardPackage.SYSTEM_STATE_GUARD__COMPONENT_SELECTION:
				getComponentSelection().clear();
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
			case SystemStateGuardPackage.SYSTEM_STATE_GUARD__SUBTREES:
				return !getSubtrees().isEmpty();
			case SystemStateGuardPackage.SYSTEM_STATE_GUARD__CHILD:
				return child != null;
			case SystemStateGuardPackage.SYSTEM_STATE_GUARD__COMPONENT_SELECTION:
				return componentSelection != null && !componentSelection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemStateGuardImpl
