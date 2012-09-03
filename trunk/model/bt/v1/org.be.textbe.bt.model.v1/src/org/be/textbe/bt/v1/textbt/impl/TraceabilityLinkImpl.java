/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.v1.textbt.impl;

import java.util.Collection;

import org.be.textbe.bt.v1.textbt.Node;
import org.be.textbe.bt.v1.textbt.Requirement;
import org.be.textbe.bt.v1.textbt.TextbtPackage;
import org.be.textbe.bt.v1.textbt.TraceabilityLink;
import org.be.textbe.bt.v1.textbt.TraceabilityStatus;

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
 * An implementation of the model object '<em><b>Traceability Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.v1.textbt.impl.TraceabilityLinkImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.be.textbe.bt.v1.textbt.impl.TraceabilityLinkImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.be.textbe.bt.v1.textbt.impl.TraceabilityLinkImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceabilityLinkImpl extends EObjectImpl implements TraceabilityLink
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraceabilityLinkImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TextbtPackage.Literals.TRACEABILITY_LINK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceabilityStatus getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(TraceabilityStatus newStatus)
  {
    TraceabilityStatus oldStatus = status;
    status = newStatus == null ? STATUS_EDEFAULT : newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextbtPackage.TRACEABILITY_LINK__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Requirement> getRequirement()
  {
    if (requirement == null)
    {
      requirement = new EObjectResolvingEList<Requirement>(Requirement.class, this, TextbtPackage.TRACEABILITY_LINK__REQUIREMENT);
    }
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getNode()
  {
    if (eContainerFeatureID() != TextbtPackage.TRACEABILITY_LINK__NODE) return null;
    return (Node)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNode(Node newNode, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newNode, TextbtPackage.TRACEABILITY_LINK__NODE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNode(Node newNode)
  {
    if (newNode != eInternalContainer() || (eContainerFeatureID() != TextbtPackage.TRACEABILITY_LINK__NODE && newNode != null))
    {
      if (EcoreUtil.isAncestor(this, newNode))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newNode != null)
        msgs = ((InternalEObject)newNode).eInverseAdd(this, TextbtPackage.NODE__TRACEABILITY, Node.class, msgs);
      msgs = basicSetNode(newNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextbtPackage.TRACEABILITY_LINK__NODE, newNode, newNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TextbtPackage.TRACEABILITY_LINK__NODE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetNode((Node)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TextbtPackage.TRACEABILITY_LINK__NODE:
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
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case TextbtPackage.TRACEABILITY_LINK__NODE:
        return eInternalContainer().eInverseRemove(this, TextbtPackage.NODE__TRACEABILITY, Node.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TextbtPackage.TRACEABILITY_LINK__STATUS:
        return getStatus();
      case TextbtPackage.TRACEABILITY_LINK__REQUIREMENT:
        return getRequirement();
      case TextbtPackage.TRACEABILITY_LINK__NODE:
        return getNode();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TextbtPackage.TRACEABILITY_LINK__STATUS:
        setStatus((TraceabilityStatus)newValue);
        return;
      case TextbtPackage.TRACEABILITY_LINK__REQUIREMENT:
        getRequirement().clear();
        getRequirement().addAll((Collection<? extends Requirement>)newValue);
        return;
      case TextbtPackage.TRACEABILITY_LINK__NODE:
        setNode((Node)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TextbtPackage.TRACEABILITY_LINK__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case TextbtPackage.TRACEABILITY_LINK__REQUIREMENT:
        getRequirement().clear();
        return;
      case TextbtPackage.TRACEABILITY_LINK__NODE:
        setNode((Node)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TextbtPackage.TRACEABILITY_LINK__STATUS:
        return status != STATUS_EDEFAULT;
      case TextbtPackage.TRACEABILITY_LINK__REQUIREMENT:
        return requirement != null && !requirement.isEmpty();
      case TextbtPackage.TRACEABILITY_LINK__NODE:
        return getNode() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (status: ");
    result.append(status);
    result.append(')');
    return result.toString();
  }

} //TraceabilityLinkImpl
