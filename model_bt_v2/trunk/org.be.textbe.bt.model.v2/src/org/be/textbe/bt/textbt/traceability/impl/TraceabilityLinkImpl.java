/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.traceability.impl;

import java.util.Collection;

import org.be.textbe.bt.textbt.node.behavior.BehaviorNode;
import org.be.textbe.bt.textbt.node.behavior.BehaviorPackage;

import org.be.textbe.bt.textbt.traceability.Requirement;
import org.be.textbe.bt.textbt.traceability.TraceabilityLink;
import org.be.textbe.bt.textbt.traceability.TraceabilityPackage;
import org.be.textbe.bt.textbt.traceability.TraceabilityStatus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.traceability.impl.TraceabilityLinkImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.traceability.impl.TraceabilityLinkImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.traceability.impl.TraceabilityLinkImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.traceability.impl.TraceabilityLinkImpl#getUpdatedInVersion <em>Updated In Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceabilityLinkImpl extends EObjectImpl implements TraceabilityLink {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final TraceabilityStatus STATUS_EDEFAULT = TraceabilityStatus.ORIGINAL;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected TraceabilityStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirement;

	/**
	 * The default value of the '{@link #getUpdatedInVersion() <em>Updated In Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedInVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATED_IN_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdatedInVersion() <em>Updated In Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedInVersion()
	 * @generated
	 * @ordered
	 */
	protected String updatedInVersion = UPDATED_IN_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceabilityLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.TRACEABILITY_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(TraceabilityStatus newStatus) {
		TraceabilityStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACEABILITY_LINK__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirement() {
		if (requirement == null) {
			requirement = new EObjectResolvingEList<Requirement>(Requirement.class, this, TraceabilityPackage.TRACEABILITY_LINK__REQUIREMENT);
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorNode getNode() {
		if (eContainerFeatureID() != TraceabilityPackage.TRACEABILITY_LINK__NODE) return null;
		return (BehaviorNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(BehaviorNode newNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNode, TraceabilityPackage.TRACEABILITY_LINK__NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(BehaviorNode newNode) {
		if (newNode != eInternalContainer() || (eContainerFeatureID() != TraceabilityPackage.TRACEABILITY_LINK__NODE && newNode != null)) {
			if (EcoreUtil.isAncestor(this, newNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNode != null)
				msgs = ((InternalEObject)newNode).eInverseAdd(this, BehaviorPackage.BEHAVIOR_NODE__TRACEABILITY, BehaviorNode.class, msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACEABILITY_LINK__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdatedInVersion() {
		return updatedInVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedInVersion(String newUpdatedInVersion) {
		String oldUpdatedInVersion = updatedInVersion;
		updatedInVersion = newUpdatedInVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACEABILITY_LINK__UPDATED_IN_VERSION, oldUpdatedInVersion, updatedInVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPackage.TRACEABILITY_LINK__NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNode((BehaviorNode)otherEnd, msgs);
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
			case TraceabilityPackage.TRACEABILITY_LINK__NODE:
				return basicSetNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TraceabilityPackage.TRACEABILITY_LINK__NODE:
				return eInternalContainer().eInverseRemove(this, BehaviorPackage.BEHAVIOR_NODE__TRACEABILITY, BehaviorNode.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityPackage.TRACEABILITY_LINK__STATUS:
				return getStatus();
			case TraceabilityPackage.TRACEABILITY_LINK__REQUIREMENT:
				return getRequirement();
			case TraceabilityPackage.TRACEABILITY_LINK__NODE:
				return getNode();
			case TraceabilityPackage.TRACEABILITY_LINK__UPDATED_IN_VERSION:
				return getUpdatedInVersion();
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
			case TraceabilityPackage.TRACEABILITY_LINK__STATUS:
				setStatus((TraceabilityStatus)newValue);
				return;
			case TraceabilityPackage.TRACEABILITY_LINK__REQUIREMENT:
				getRequirement().clear();
				getRequirement().addAll((Collection<? extends Requirement>)newValue);
				return;
			case TraceabilityPackage.TRACEABILITY_LINK__NODE:
				setNode((BehaviorNode)newValue);
				return;
			case TraceabilityPackage.TRACEABILITY_LINK__UPDATED_IN_VERSION:
				setUpdatedInVersion((String)newValue);
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
			case TraceabilityPackage.TRACEABILITY_LINK__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case TraceabilityPackage.TRACEABILITY_LINK__REQUIREMENT:
				getRequirement().clear();
				return;
			case TraceabilityPackage.TRACEABILITY_LINK__NODE:
				setNode((BehaviorNode)null);
				return;
			case TraceabilityPackage.TRACEABILITY_LINK__UPDATED_IN_VERSION:
				setUpdatedInVersion(UPDATED_IN_VERSION_EDEFAULT);
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
			case TraceabilityPackage.TRACEABILITY_LINK__STATUS:
				return status != STATUS_EDEFAULT;
			case TraceabilityPackage.TRACEABILITY_LINK__REQUIREMENT:
				return requirement != null && !requirement.isEmpty();
			case TraceabilityPackage.TRACEABILITY_LINK__NODE:
				return getNode() != null;
			case TraceabilityPackage.TRACEABILITY_LINK__UPDATED_IN_VERSION:
				return UPDATED_IN_VERSION_EDEFAULT == null ? updatedInVersion != null : !UPDATED_IN_VERSION_EDEFAULT.equals(updatedInVersion);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (status: ");
		result.append(status);
		result.append(", updatedInVersion: ");
		result.append(updatedInVersion);
		result.append(')');
		return result.toString();
	}

} //TraceabilityLinkImpl
