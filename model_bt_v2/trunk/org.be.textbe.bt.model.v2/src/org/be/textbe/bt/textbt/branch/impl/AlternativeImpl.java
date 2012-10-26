/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.branch.impl;

import java.util.Collection;

import org.be.textbe.bt.textbt.BehaviorTree;

import org.be.textbe.bt.textbt.branch.Alternative;
import org.be.textbe.bt.textbt.branch.BranchPackage;

import org.be.textbe.bt.textbt.node.LabelOnlyNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.branch.impl.AlternativeImpl#getSubtrees <em>Subtrees</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.branch.impl.AlternativeImpl#getGotoDestination <em>Goto Destination</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.branch.impl.AlternativeImpl#getChoices <em>Choices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlternativeImpl extends EObjectImpl implements Alternative {
	/**
	 * The cached value of the '{@link #getSubtrees() <em>Subtrees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtrees()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorTree> subtrees;

	/**
	 * The cached value of the '{@link #getGotoDestination() <em>Goto Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGotoDestination()
	 * @generated
	 * @ordered
	 */
	protected LabelOnlyNode gotoDestination;

	/**
	 * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoices()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorTree> choices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BranchPackage.Literals.ALTERNATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorTree> getSubtrees() {
		if (subtrees == null) {
			subtrees = new EObjectResolvingEList<BehaviorTree>(BehaviorTree.class, this, BranchPackage.ALTERNATIVE__SUBTREES);
		}
		return subtrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelOnlyNode getGotoDestination() {
		if (gotoDestination != null && gotoDestination.eIsProxy()) {
			InternalEObject oldGotoDestination = (InternalEObject)gotoDestination;
			gotoDestination = (LabelOnlyNode)eResolveProxy(oldGotoDestination);
			if (gotoDestination != oldGotoDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BranchPackage.ALTERNATIVE__GOTO_DESTINATION, oldGotoDestination, gotoDestination));
			}
		}
		return gotoDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelOnlyNode basicGetGotoDestination() {
		return gotoDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGotoDestination(LabelOnlyNode newGotoDestination) {
		LabelOnlyNode oldGotoDestination = gotoDestination;
		gotoDestination = newGotoDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BranchPackage.ALTERNATIVE__GOTO_DESTINATION, oldGotoDestination, gotoDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorTree> getChoices() {
		if (choices == null) {
			choices = new EObjectContainmentEList<BehaviorTree>(BehaviorTree.class, this, BranchPackage.ALTERNATIVE__CHOICES);
		}
		return choices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BranchPackage.ALTERNATIVE__CHOICES:
				return ((InternalEList<?>)getChoices()).basicRemove(otherEnd, msgs);
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
			case BranchPackage.ALTERNATIVE__SUBTREES:
				return getSubtrees();
			case BranchPackage.ALTERNATIVE__GOTO_DESTINATION:
				if (resolve) return getGotoDestination();
				return basicGetGotoDestination();
			case BranchPackage.ALTERNATIVE__CHOICES:
				return getChoices();
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
			case BranchPackage.ALTERNATIVE__SUBTREES:
				getSubtrees().clear();
				getSubtrees().addAll((Collection<? extends BehaviorTree>)newValue);
				return;
			case BranchPackage.ALTERNATIVE__GOTO_DESTINATION:
				setGotoDestination((LabelOnlyNode)newValue);
				return;
			case BranchPackage.ALTERNATIVE__CHOICES:
				getChoices().clear();
				getChoices().addAll((Collection<? extends BehaviorTree>)newValue);
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
			case BranchPackage.ALTERNATIVE__SUBTREES:
				getSubtrees().clear();
				return;
			case BranchPackage.ALTERNATIVE__GOTO_DESTINATION:
				setGotoDestination((LabelOnlyNode)null);
				return;
			case BranchPackage.ALTERNATIVE__CHOICES:
				getChoices().clear();
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
			case BranchPackage.ALTERNATIVE__SUBTREES:
				return subtrees != null && !subtrees.isEmpty();
			case BranchPackage.ALTERNATIVE__GOTO_DESTINATION:
				return gotoDestination != null;
			case BranchPackage.ALTERNATIVE__CHOICES:
				return choices != null && !choices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlternativeImpl
