/**
 */
package org.be.textbe.bt.textbt.node.operation.impl;

import java.util.Collection;

import org.be.textbe.bt.textbt.node.BehaviorNode;

import org.be.textbe.bt.textbt.node.operation.OperationPackage;
import org.be.textbe.bt.textbt.node.operation.Synchronisation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.operation.impl.SynchronisationImpl#getWaitFor <em>Wait For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronisationImpl extends OperationImpl implements Synchronisation {
	/**
	 * The cached value of the '{@link #getWaitFor() <em>Wait For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitFor()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorNode> waitFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationPackage.Literals.SYNCHRONISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorNode> getWaitFor() {
		if (waitFor == null) {
			waitFor = new EObjectResolvingEList<BehaviorNode>(BehaviorNode.class, this, OperationPackage.SYNCHRONISATION__WAIT_FOR);
		}
		return waitFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationPackage.SYNCHRONISATION__WAIT_FOR:
				return getWaitFor();
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
			case OperationPackage.SYNCHRONISATION__WAIT_FOR:
				getWaitFor().clear();
				getWaitFor().addAll((Collection<? extends BehaviorNode>)newValue);
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
			case OperationPackage.SYNCHRONISATION__WAIT_FOR:
				getWaitFor().clear();
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
			case OperationPackage.SYNCHRONISATION__WAIT_FOR:
				return waitFor != null && !waitFor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SynchronisationImpl
