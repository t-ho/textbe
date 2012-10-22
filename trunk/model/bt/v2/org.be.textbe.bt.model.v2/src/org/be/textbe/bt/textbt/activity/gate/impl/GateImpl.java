/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.activity.gate.impl;

import java.util.Collection;

import org.be.textbe.bt.textbt.BehaviorTree;

import org.be.textbe.bt.textbt.activity.gate.Gate;
import org.be.textbe.bt.textbt.activity.gate.GatePackage;

import org.be.textbe.bt.textbt.node.behavior.BehaviorNode;

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
 * An implementation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.activity.gate.impl.GateImpl#getSubtrees <em>Subtrees</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.activity.gate.impl.GateImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.activity.gate.impl.GateImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GateImpl extends EObjectImpl implements Gate {
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
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected BehaviorTree child;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorNode> triggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GatePackage.Literals.GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorTree> getSubtrees() {
		if (subtrees == null) {
			subtrees = new EObjectResolvingEList<BehaviorTree>(BehaviorTree.class, this, GatePackage.GATE__SUBTREES);
		}
		return subtrees;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GatePackage.GATE__CHILD, oldChild, newChild);
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
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GatePackage.GATE__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GatePackage.GATE__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GatePackage.GATE__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorNode> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<BehaviorNode>(BehaviorNode.class, this, GatePackage.GATE__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GatePackage.GATE__CHILD:
				return basicSetChild(null, msgs);
			case GatePackage.GATE__TRIGGERS:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
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
			case GatePackage.GATE__SUBTREES:
				return getSubtrees();
			case GatePackage.GATE__CHILD:
				return getChild();
			case GatePackage.GATE__TRIGGERS:
				return getTriggers();
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
			case GatePackage.GATE__SUBTREES:
				getSubtrees().clear();
				getSubtrees().addAll((Collection<? extends BehaviorTree>)newValue);
				return;
			case GatePackage.GATE__CHILD:
				setChild((BehaviorTree)newValue);
				return;
			case GatePackage.GATE__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends BehaviorNode>)newValue);
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
			case GatePackage.GATE__SUBTREES:
				getSubtrees().clear();
				return;
			case GatePackage.GATE__CHILD:
				setChild((BehaviorTree)null);
				return;
			case GatePackage.GATE__TRIGGERS:
				getTriggers().clear();
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
			case GatePackage.GATE__SUBTREES:
				return subtrees != null && !subtrees.isEmpty();
			case GatePackage.GATE__CHILD:
				return child != null;
			case GatePackage.GATE__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GateImpl
