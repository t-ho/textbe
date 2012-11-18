/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.ct.textct.impl;

import java.util.Collection;

import org.be.textbe.ct.textct.AbstractBlockOrNode;
import org.be.textbe.ct.textct.AbstractNode;
import org.be.textbe.ct.textct.TextctPackage;
import org.be.textbe.ct.textct.Validity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.ct.textct.impl.AbstractNodeImpl#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.impl.AbstractNodeImpl#getRequirementRef <em>Requirement Ref</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.impl.AbstractNodeImpl#getTraceabilityStatus <em>Traceability Status</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.impl.AbstractNodeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.impl.AbstractNodeImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.impl.AbstractNodeImpl#getComponentSet <em>Component Set</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.impl.AbstractNodeImpl#getMci <em>Mci</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.impl.AbstractNodeImpl#getChildNode <em>Child Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractNodeImpl extends AbstractBlockOrNodeImpl implements AbstractNode {
	/**
   * The default value of the '{@link #getComponentRef() <em>Component Ref</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getComponentRef()
   * @generated
   * @ordered
   */
	protected static final String COMPONENT_REF_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getComponentRef() <em>Component Ref</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getComponentRef()
   * @generated
   * @ordered
   */
	protected String componentRef = COMPONENT_REF_EDEFAULT;

	/**
   * The cached value of the '{@link #getRequirementRef() <em>Requirement Ref</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRequirementRef()
   * @generated
   * @ordered
   */
	protected EList<String> requirementRef;

	/**
   * The default value of the '{@link #getTraceabilityStatus() <em>Traceability Status</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTraceabilityStatus()
   * @generated
   * @ordered
   */
	protected static final Validity TRACEABILITY_STATUS_EDEFAULT = Validity.VALID;

	/**
   * The cached value of the '{@link #getTraceabilityStatus() <em>Traceability Status</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTraceabilityStatus()
   * @generated
   * @ordered
   */
	protected Validity traceabilityStatus = TRACEABILITY_STATUS_EDEFAULT;

	/**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
	protected static final String LABEL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
	protected String label = LABEL_EDEFAULT;

	/**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
	protected String operator = OPERATOR_EDEFAULT;

	/**
   * The default value of the '{@link #getComponentSet() <em>Component Set</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getComponentSet()
   * @generated
   * @ordered
   */
	protected static final String COMPONENT_SET_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getComponentSet() <em>Component Set</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getComponentSet()
   * @generated
   * @ordered
   */
	protected String componentSet = COMPONENT_SET_EDEFAULT;

	/**
   * The default value of the '{@link #getMci() <em>Mci</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMci()
   * @generated
   * @ordered
   */
	protected static final String MCI_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getMci() <em>Mci</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMci()
   * @generated
   * @ordered
   */
	protected String mci = MCI_EDEFAULT;

	/**
   * The cached value of the '{@link #getChildNode() <em>Child Node</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChildNode()
   * @generated
   * @ordered
   */
	protected EList<AbstractBlockOrNode> childNode;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AbstractNodeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return TextctPackage.Literals.ABSTRACT_NODE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getComponentRef() {
    return componentRef;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setComponentRef(String newComponentRef) {
    String oldComponentRef = componentRef;
    componentRef = newComponentRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextctPackage.ABSTRACT_NODE__COMPONENT_REF, oldComponentRef, componentRef));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<String> getRequirementRef() {
    if (requirementRef == null)
    {
      requirementRef = new EDataTypeUniqueEList<String>(String.class, this, TextctPackage.ABSTRACT_NODE__REQUIREMENT_REF);
    }
    return requirementRef;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Validity getTraceabilityStatus() {
    return traceabilityStatus;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTraceabilityStatus(Validity newTraceabilityStatus) {
    Validity oldTraceabilityStatus = traceabilityStatus;
    traceabilityStatus = newTraceabilityStatus == null ? TRACEABILITY_STATUS_EDEFAULT : newTraceabilityStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextctPackage.ABSTRACT_NODE__TRACEABILITY_STATUS, oldTraceabilityStatus, traceabilityStatus));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getLabel() {
    return label;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLabel(String newLabel) {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextctPackage.ABSTRACT_NODE__LABEL, oldLabel, label));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getOperator() {
    return operator;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setOperator(String newOperator) {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextctPackage.ABSTRACT_NODE__OPERATOR, oldOperator, operator));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getComponentSet() {
    return componentSet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setComponentSet(String newComponentSet) {
    String oldComponentSet = componentSet;
    componentSet = newComponentSet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextctPackage.ABSTRACT_NODE__COMPONENT_SET, oldComponentSet, componentSet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getMci() {
    return mci;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMci(String newMci) {
    String oldMci = mci;
    mci = newMci;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextctPackage.ABSTRACT_NODE__MCI, oldMci, mci));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<AbstractBlockOrNode> getChildNode() {
    if (childNode == null)
    {
      childNode = new EObjectContainmentEList<AbstractBlockOrNode>(AbstractBlockOrNode.class, this, TextctPackage.ABSTRACT_NODE__CHILD_NODE);
    }
    return childNode;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case TextctPackage.ABSTRACT_NODE__CHILD_NODE:
        return ((InternalEList<?>)getChildNode()).basicRemove(otherEnd, msgs);
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
    switch (featureID)
    {
      case TextctPackage.ABSTRACT_NODE__COMPONENT_REF:
        return getComponentRef();
      case TextctPackage.ABSTRACT_NODE__REQUIREMENT_REF:
        return getRequirementRef();
      case TextctPackage.ABSTRACT_NODE__TRACEABILITY_STATUS:
        return getTraceabilityStatus();
      case TextctPackage.ABSTRACT_NODE__LABEL:
        return getLabel();
      case TextctPackage.ABSTRACT_NODE__OPERATOR:
        return getOperator();
      case TextctPackage.ABSTRACT_NODE__COMPONENT_SET:
        return getComponentSet();
      case TextctPackage.ABSTRACT_NODE__MCI:
        return getMci();
      case TextctPackage.ABSTRACT_NODE__CHILD_NODE:
        return getChildNode();
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
    switch (featureID)
    {
      case TextctPackage.ABSTRACT_NODE__COMPONENT_REF:
        setComponentRef((String)newValue);
        return;
      case TextctPackage.ABSTRACT_NODE__REQUIREMENT_REF:
        getRequirementRef().clear();
        getRequirementRef().addAll((Collection<? extends String>)newValue);
        return;
      case TextctPackage.ABSTRACT_NODE__TRACEABILITY_STATUS:
        setTraceabilityStatus((Validity)newValue);
        return;
      case TextctPackage.ABSTRACT_NODE__LABEL:
        setLabel((String)newValue);
        return;
      case TextctPackage.ABSTRACT_NODE__OPERATOR:
        setOperator((String)newValue);
        return;
      case TextctPackage.ABSTRACT_NODE__COMPONENT_SET:
        setComponentSet((String)newValue);
        return;
      case TextctPackage.ABSTRACT_NODE__MCI:
        setMci((String)newValue);
        return;
      case TextctPackage.ABSTRACT_NODE__CHILD_NODE:
        getChildNode().clear();
        getChildNode().addAll((Collection<? extends AbstractBlockOrNode>)newValue);
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
    switch (featureID)
    {
      case TextctPackage.ABSTRACT_NODE__COMPONENT_REF:
        setComponentRef(COMPONENT_REF_EDEFAULT);
        return;
      case TextctPackage.ABSTRACT_NODE__REQUIREMENT_REF:
        getRequirementRef().clear();
        return;
      case TextctPackage.ABSTRACT_NODE__TRACEABILITY_STATUS:
        setTraceabilityStatus(TRACEABILITY_STATUS_EDEFAULT);
        return;
      case TextctPackage.ABSTRACT_NODE__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case TextctPackage.ABSTRACT_NODE__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case TextctPackage.ABSTRACT_NODE__COMPONENT_SET:
        setComponentSet(COMPONENT_SET_EDEFAULT);
        return;
      case TextctPackage.ABSTRACT_NODE__MCI:
        setMci(MCI_EDEFAULT);
        return;
      case TextctPackage.ABSTRACT_NODE__CHILD_NODE:
        getChildNode().clear();
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
    switch (featureID)
    {
      case TextctPackage.ABSTRACT_NODE__COMPONENT_REF:
        return COMPONENT_REF_EDEFAULT == null ? componentRef != null : !COMPONENT_REF_EDEFAULT.equals(componentRef);
      case TextctPackage.ABSTRACT_NODE__REQUIREMENT_REF:
        return requirementRef != null && !requirementRef.isEmpty();
      case TextctPackage.ABSTRACT_NODE__TRACEABILITY_STATUS:
        return traceabilityStatus != TRACEABILITY_STATUS_EDEFAULT;
      case TextctPackage.ABSTRACT_NODE__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case TextctPackage.ABSTRACT_NODE__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case TextctPackage.ABSTRACT_NODE__COMPONENT_SET:
        return COMPONENT_SET_EDEFAULT == null ? componentSet != null : !COMPONENT_SET_EDEFAULT.equals(componentSet);
      case TextctPackage.ABSTRACT_NODE__MCI:
        return MCI_EDEFAULT == null ? mci != null : !MCI_EDEFAULT.equals(mci);
      case TextctPackage.ABSTRACT_NODE__CHILD_NODE:
        return childNode != null && !childNode.isEmpty();
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
    result.append(" (componentRef: ");
    result.append(componentRef);
    result.append(", requirementRef: ");
    result.append(requirementRef);
    result.append(", traceabilityStatus: ");
    result.append(traceabilityStatus);
    result.append(", label: ");
    result.append(label);
    result.append(", operator: ");
    result.append(operator);
    result.append(", componentSet: ");
    result.append(componentSet);
    result.append(", mci: ");
    result.append(mci);
    result.append(')');
    return result.toString();
  }

} //AbstractNodeImpl
