/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.operation.impl;

import org.be.textbe.bt.textbt.node.Node;

import org.be.textbe.bt.textbt.node.operation.OperationPackage;
import org.be.textbe.bt.textbt.node.operation.Reversion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.operation.impl.ReversionImpl#getRevertTo <em>Revert To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReversionImpl extends OperationImpl implements Reversion {
	/**
	 * The cached value of the '{@link #getRevertTo() <em>Revert To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevertTo()
	 * @generated
	 * @ordered
	 */
	protected Node revertTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationPackage.Literals.REVERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getRevertTo() {
		if (revertTo != null && revertTo.eIsProxy()) {
			InternalEObject oldRevertTo = (InternalEObject)revertTo;
			revertTo = (Node)eResolveProxy(oldRevertTo);
			if (revertTo != oldRevertTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationPackage.REVERSION__REVERT_TO, oldRevertTo, revertTo));
			}
		}
		return revertTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetRevertTo() {
		return revertTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevertTo(Node newRevertTo) {
		Node oldRevertTo = revertTo;
		revertTo = newRevertTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationPackage.REVERSION__REVERT_TO, oldRevertTo, revertTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationPackage.REVERSION__REVERT_TO:
				if (resolve) return getRevertTo();
				return basicGetRevertTo();
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
			case OperationPackage.REVERSION__REVERT_TO:
				setRevertTo((Node)newValue);
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
			case OperationPackage.REVERSION__REVERT_TO:
				setRevertTo((Node)null);
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
			case OperationPackage.REVERSION__REVERT_TO:
				return revertTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ReversionImpl
