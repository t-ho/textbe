/**
 */
package org.be.textbe.bt.textbt.node.operation.impl;

import org.be.textbe.bt.textbt.node.Node;

import org.be.textbe.bt.textbt.node.operation.OperationPackage;
import org.be.textbe.bt.textbt.node.operation.StartNew;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start New</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.operation.impl.StartNewImpl#getStartNew <em>Start New</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartNewImpl extends OperationImpl implements StartNew {
	/**
	 * The cached value of the '{@link #getStartNew() <em>Start New</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartNew()
	 * @generated
	 * @ordered
	 */
	protected Node startNew;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartNewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationPackage.Literals.START_NEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getStartNew() {
		if (startNew != null && startNew.eIsProxy()) {
			InternalEObject oldStartNew = (InternalEObject)startNew;
			startNew = (Node)eResolveProxy(oldStartNew);
			if (startNew != oldStartNew) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationPackage.START_NEW__START_NEW, oldStartNew, startNew));
			}
		}
		return startNew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetStartNew() {
		return startNew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartNew(Node newStartNew) {
		Node oldStartNew = startNew;
		startNew = newStartNew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationPackage.START_NEW__START_NEW, oldStartNew, startNew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationPackage.START_NEW__START_NEW:
				if (resolve) return getStartNew();
				return basicGetStartNew();
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
			case OperationPackage.START_NEW__START_NEW:
				setStartNew((Node)newValue);
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
			case OperationPackage.START_NEW__START_NEW:
				setStartNew((Node)null);
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
			case OperationPackage.START_NEW__START_NEW:
				return startNew != null;
		}
		return super.eIsSet(featureID);
	}

} //StartNewImpl
