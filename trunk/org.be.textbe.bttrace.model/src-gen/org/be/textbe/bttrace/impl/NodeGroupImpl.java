/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bttrace.impl;

import java.util.Collection;

import org.be.textbe.bttrace.BttracePackage;
import org.be.textbe.bttrace.Node;
import org.be.textbe.bttrace.NodeGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bttrace.impl.NodeGroupImpl#getActiveNode <em>Active Node</em>}</li>
 *   <li>{@link org.be.textbe.bttrace.impl.NodeGroupImpl#getInterleaveNode <em>Interleave Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeGroupImpl extends EObjectImpl implements NodeGroup {
	/**
	 * The cached value of the '{@link #getActiveNode() <em>Active Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveNode()
	 * @generated
	 * @ordered
	 */
	protected Node activeNode;

	/**
	 * The cached value of the '{@link #getInterleaveNode() <em>Interleave Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterleaveNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> interleaveNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BttracePackage.Literals.NODE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getActiveNode() {
		return activeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActiveNode(Node newActiveNode, NotificationChain msgs) {
		Node oldActiveNode = activeNode;
		activeNode = newActiveNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BttracePackage.NODE_GROUP__ACTIVE_NODE, oldActiveNode, newActiveNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveNode(Node newActiveNode) {
		if (newActiveNode != activeNode) {
			NotificationChain msgs = null;
			if (activeNode != null)
				msgs = ((InternalEObject)activeNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BttracePackage.NODE_GROUP__ACTIVE_NODE, null, msgs);
			if (newActiveNode != null)
				msgs = ((InternalEObject)newActiveNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BttracePackage.NODE_GROUP__ACTIVE_NODE, null, msgs);
			msgs = basicSetActiveNode(newActiveNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BttracePackage.NODE_GROUP__ACTIVE_NODE, newActiveNode, newActiveNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getInterleaveNode() {
		if (interleaveNode == null) {
			interleaveNode = new EObjectContainmentEList<Node>(Node.class, this, BttracePackage.NODE_GROUP__INTERLEAVE_NODE);
		}
		return interleaveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BttracePackage.NODE_GROUP__ACTIVE_NODE:
				return basicSetActiveNode(null, msgs);
			case BttracePackage.NODE_GROUP__INTERLEAVE_NODE:
				return ((InternalEList<?>)getInterleaveNode()).basicRemove(otherEnd, msgs);
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
			case BttracePackage.NODE_GROUP__ACTIVE_NODE:
				return getActiveNode();
			case BttracePackage.NODE_GROUP__INTERLEAVE_NODE:
				return getInterleaveNode();
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
			case BttracePackage.NODE_GROUP__ACTIVE_NODE:
				setActiveNode((Node)newValue);
				return;
			case BttracePackage.NODE_GROUP__INTERLEAVE_NODE:
				getInterleaveNode().clear();
				getInterleaveNode().addAll((Collection<? extends Node>)newValue);
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
			case BttracePackage.NODE_GROUP__ACTIVE_NODE:
				setActiveNode((Node)null);
				return;
			case BttracePackage.NODE_GROUP__INTERLEAVE_NODE:
				getInterleaveNode().clear();
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
			case BttracePackage.NODE_GROUP__ACTIVE_NODE:
				return activeNode != null;
			case BttracePackage.NODE_GROUP__INTERLEAVE_NODE:
				return interleaveNode != null && !interleaveNode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeGroupImpl
