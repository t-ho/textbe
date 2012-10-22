/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.behavior.impl;

import org.be.textbe.bt.textbt.component.Component;

import org.be.textbe.bt.textbt.node.behavior.Behavior;
import org.be.textbe.bt.textbt.node.behavior.BehaviorNode;
import org.be.textbe.bt.textbt.node.behavior.BehaviorPackage;

import org.be.textbe.bt.textbt.node.impl.NodeImpl;

import org.be.textbe.bt.textbt.traceability.TraceabilityLink;
import org.be.textbe.bt.textbt.traceability.TraceabilityPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.behavior.impl.BehaviorNodeImpl#getTraceability <em>Traceability</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.behavior.impl.BehaviorNodeImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.behavior.impl.BehaviorNodeImpl#getActor <em>Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorNodeImpl extends NodeImpl implements BehaviorNode {
	/**
	 * The cached value of the '{@link #getTraceability() <em>Traceability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceability()
	 * @generated
	 * @ordered
	 */
	protected TraceabilityLink traceability;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior behavior;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected Component actor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.BEHAVIOR_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityLink getTraceability() {
		return traceability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraceability(TraceabilityLink newTraceability, NotificationChain msgs) {
		TraceabilityLink oldTraceability = traceability;
		traceability = newTraceability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR_NODE__TRACEABILITY, oldTraceability, newTraceability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceability(TraceabilityLink newTraceability) {
		if (newTraceability != traceability) {
			NotificationChain msgs = null;
			if (traceability != null)
				msgs = ((InternalEObject)traceability).eInverseRemove(this, TraceabilityPackage.TRACEABILITY_LINK__NODE, TraceabilityLink.class, msgs);
			if (newTraceability != null)
				msgs = ((InternalEObject)newTraceability).eInverseAdd(this, TraceabilityPackage.TRACEABILITY_LINK__NODE, TraceabilityLink.class, msgs);
			msgs = basicSetTraceability(newTraceability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR_NODE__TRACEABILITY, newTraceability, newTraceability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject)behavior;
			behavior = (Behavior)eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.BEHAVIOR_NODE__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR_NODE__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject)actor;
			actor = (Component)eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.BEHAVIOR_NODE__ACTOR, oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Component newActor) {
		Component oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR_NODE__ACTOR, oldActor, actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.BEHAVIOR_NODE__TRACEABILITY:
				if (traceability != null)
					msgs = ((InternalEObject)traceability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.BEHAVIOR_NODE__TRACEABILITY, null, msgs);
				return basicSetTraceability((TraceabilityLink)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.BEHAVIOR_NODE__TRACEABILITY:
				return basicSetTraceability(null, msgs);
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
			case BehaviorPackage.BEHAVIOR_NODE__TRACEABILITY:
				return getTraceability();
			case BehaviorPackage.BEHAVIOR_NODE__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case BehaviorPackage.BEHAVIOR_NODE__ACTOR:
				if (resolve) return getActor();
				return basicGetActor();
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
			case BehaviorPackage.BEHAVIOR_NODE__TRACEABILITY:
				setTraceability((TraceabilityLink)newValue);
				return;
			case BehaviorPackage.BEHAVIOR_NODE__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case BehaviorPackage.BEHAVIOR_NODE__ACTOR:
				setActor((Component)newValue);
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
			case BehaviorPackage.BEHAVIOR_NODE__TRACEABILITY:
				setTraceability((TraceabilityLink)null);
				return;
			case BehaviorPackage.BEHAVIOR_NODE__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case BehaviorPackage.BEHAVIOR_NODE__ACTOR:
				setActor((Component)null);
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
			case BehaviorPackage.BEHAVIOR_NODE__TRACEABILITY:
				return traceability != null;
			case BehaviorPackage.BEHAVIOR_NODE__BEHAVIOR:
				return behavior != null;
			case BehaviorPackage.BEHAVIOR_NODE__ACTOR:
				return actor != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviorNodeImpl
