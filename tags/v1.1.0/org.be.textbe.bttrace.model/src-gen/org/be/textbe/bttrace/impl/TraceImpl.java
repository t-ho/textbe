/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bttrace.impl;

import java.util.Collection;

import org.be.textbe.bttrace.BttracePackage;
import org.be.textbe.bttrace.NodeGroup;
import org.be.textbe.bttrace.Trace;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bttrace.impl.TraceImpl#getNodeGroup <em>Node Group</em>}</li>
 *   <li>{@link org.be.textbe.bttrace.impl.TraceImpl#getLoopNodeGroup <em>Loop Node Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends EObjectImpl implements Trace {
	/**
	 * The cached value of the '{@link #getNodeGroup() <em>Node Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeGroup> nodeGroup;

	/**
	 * The cached value of the '{@link #getLoopNodeGroup() <em>Loop Node Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopNodeGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeGroup> loopNodeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BttracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeGroup> getNodeGroup() {
		if (nodeGroup == null) {
			nodeGroup = new EObjectContainmentEList<NodeGroup>(NodeGroup.class, this, BttracePackage.TRACE__NODE_GROUP);
		}
		return nodeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeGroup> getLoopNodeGroup() {
		if (loopNodeGroup == null) {
			loopNodeGroup = new EObjectContainmentEList<NodeGroup>(NodeGroup.class, this, BttracePackage.TRACE__LOOP_NODE_GROUP);
		}
		return loopNodeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BttracePackage.TRACE__NODE_GROUP:
				return ((InternalEList<?>)getNodeGroup()).basicRemove(otherEnd, msgs);
			case BttracePackage.TRACE__LOOP_NODE_GROUP:
				return ((InternalEList<?>)getLoopNodeGroup()).basicRemove(otherEnd, msgs);
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
			case BttracePackage.TRACE__NODE_GROUP:
				return getNodeGroup();
			case BttracePackage.TRACE__LOOP_NODE_GROUP:
				return getLoopNodeGroup();
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
			case BttracePackage.TRACE__NODE_GROUP:
				getNodeGroup().clear();
				getNodeGroup().addAll((Collection<? extends NodeGroup>)newValue);
				return;
			case BttracePackage.TRACE__LOOP_NODE_GROUP:
				getLoopNodeGroup().clear();
				getLoopNodeGroup().addAll((Collection<? extends NodeGroup>)newValue);
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
			case BttracePackage.TRACE__NODE_GROUP:
				getNodeGroup().clear();
				return;
			case BttracePackage.TRACE__LOOP_NODE_GROUP:
				getLoopNodeGroup().clear();
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
			case BttracePackage.TRACE__NODE_GROUP:
				return nodeGroup != null && !nodeGroup.isEmpty();
			case BttracePackage.TRACE__LOOP_NODE_GROUP:
				return loopNodeGroup != null && !loopNodeGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
