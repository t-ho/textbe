/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textst.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import textst.AbstractBlockOrNode;
import textst.AbstractNode;
import textst.DefinedByNode;
import textst.Qualifier;
import textst.TextstPackage;
import textst.Validity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defined By Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link textst.impl.DefinedByNodeImpl#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link textst.impl.DefinedByNodeImpl#getComponentSet <em>Component Set</em>}</li>
 *   <li>{@link textst.impl.DefinedByNodeImpl#getMci <em>Mci</em>}</li>
 *   <li>{@link textst.impl.DefinedByNodeImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link textst.impl.DefinedByNodeImpl#getSecondQualifier <em>Second Qualifier</em>}</li>
 *   <li>{@link textst.impl.DefinedByNodeImpl#getBehaviorRef <em>Behavior Ref</em>}</li>
 *   <li>{@link textst.impl.DefinedByNodeImpl#getRequirementRef <em>Requirement Ref</em>}</li>
 *   <li>{@link textst.impl.DefinedByNodeImpl#getTraceabilityStatus <em>Traceability Status</em>}</li>
 *   <li>{@link textst.impl.DefinedByNodeImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link textst.impl.DefinedByNodeImpl#getChildNode <em>Child Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinedByNodeImpl extends AbstractBlockOrNodeImpl implements DefinedByNode
{
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
   * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected static final Qualifier QUALIFIER_EDEFAULT = Qualifier.NULL_LITERAL;

  /**
   * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected Qualifier qualifier = QUALIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getSecondQualifier() <em>Second Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondQualifier()
   * @generated
   * @ordered
   */
  protected static final Qualifier SECOND_QUALIFIER_EDEFAULT = Qualifier.NULL_LITERAL;

  /**
   * The cached value of the '{@link #getSecondQualifier() <em>Second Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondQualifier()
   * @generated
   * @ordered
   */
  protected Qualifier secondQualifier = SECOND_QUALIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getBehaviorRef() <em>Behavior Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviorRef()
   * @generated
   * @ordered
   */
  protected static final String BEHAVIOR_REF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBehaviorRef() <em>Behavior Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviorRef()
   * @generated
   * @ordered
   */
  protected String behaviorRef = BEHAVIOR_REF_EDEFAULT;

  /**
   * The cached value of the '{@link #getRequirementRef() <em>Requirement Ref</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirementRef()
   * @generated
   * @ordered
   */
  protected EList requirementRef;

  /**
   * The default value of the '{@link #getTraceabilityStatus() <em>Traceability Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraceabilityStatus()
   * @generated
   * @ordered
   */
  protected static final Validity TRACEABILITY_STATUS_EDEFAULT = Validity.VALID_LITERAL;

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
   * The cached value of the '{@link #getChildNode() <em>Child Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildNode()
   * @generated
   * @ordered
   */
  protected AbstractBlockOrNode childNode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinedByNodeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return TextstPackage.Literals.DEFINED_BY_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComponentRef()
  {
    return componentRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentRef(String newComponentRef)
  {
    String oldComponentRef = componentRef;
    componentRef = newComponentRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.DEFINED_BY_NODE__COMPONENT_REF, oldComponentRef, componentRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComponentSet()
  {
    return componentSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentSet(String newComponentSet)
  {
    String oldComponentSet = componentSet;
    componentSet = newComponentSet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.DEFINED_BY_NODE__COMPONENT_SET, oldComponentSet, componentSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMci()
  {
    return mci;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMci(String newMci)
  {
    String oldMci = mci;
    mci = newMci;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.DEFINED_BY_NODE__MCI, oldMci, mci));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Qualifier getQualifier()
  {
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifier(Qualifier newQualifier)
  {
    Qualifier oldQualifier = qualifier;
    qualifier = newQualifier == null ? QUALIFIER_EDEFAULT : newQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.DEFINED_BY_NODE__QUALIFIER, oldQualifier, qualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Qualifier getSecondQualifier()
  {
    return secondQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondQualifier(Qualifier newSecondQualifier)
  {
    Qualifier oldSecondQualifier = secondQualifier;
    secondQualifier = newSecondQualifier == null ? SECOND_QUALIFIER_EDEFAULT : newSecondQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER, oldSecondQualifier, secondQualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBehaviorRef()
  {
    return behaviorRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBehaviorRef(String newBehaviorRef)
  {
    String oldBehaviorRef = behaviorRef;
    behaviorRef = newBehaviorRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF, oldBehaviorRef, behaviorRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getRequirementRef()
  {
    if (requirementRef == null)
    {
      requirementRef = new EDataTypeUniqueEList(String.class, this, TextstPackage.DEFINED_BY_NODE__REQUIREMENT_REF);
    }
    return requirementRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Validity getTraceabilityStatus()
  {
    return traceabilityStatus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTraceabilityStatus(Validity newTraceabilityStatus)
  {
    Validity oldTraceabilityStatus = traceabilityStatus;
    traceabilityStatus = newTraceabilityStatus == null ? TRACEABILITY_STATUS_EDEFAULT : newTraceabilityStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.DEFINED_BY_NODE__TRACEABILITY_STATUS, oldTraceabilityStatus, traceabilityStatus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.DEFINED_BY_NODE__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractBlockOrNode getChildNode()
  {
    return childNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChildNode(AbstractBlockOrNode newChildNode, NotificationChain msgs)
  {
    AbstractBlockOrNode oldChildNode = childNode;
    childNode = newChildNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextstPackage.DEFINED_BY_NODE__CHILD_NODE, oldChildNode, newChildNode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChildNode(AbstractBlockOrNode newChildNode)
  {
    if (newChildNode != childNode)
    {
      NotificationChain msgs = null;
      if (childNode != null)
        msgs = ((InternalEObject)childNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextstPackage.DEFINED_BY_NODE__CHILD_NODE, null, msgs);
      if (newChildNode != null)
        msgs = ((InternalEObject)newChildNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextstPackage.DEFINED_BY_NODE__CHILD_NODE, null, msgs);
      msgs = basicSetChildNode(newChildNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.DEFINED_BY_NODE__CHILD_NODE, newChildNode, newChildNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TextstPackage.DEFINED_BY_NODE__CHILD_NODE:
        return basicSetChildNode(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TextstPackage.DEFINED_BY_NODE__COMPONENT_REF:
        return getComponentRef();
      case TextstPackage.DEFINED_BY_NODE__COMPONENT_SET:
        return getComponentSet();
      case TextstPackage.DEFINED_BY_NODE__MCI:
        return getMci();
      case TextstPackage.DEFINED_BY_NODE__QUALIFIER:
        return getQualifier();
      case TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER:
        return getSecondQualifier();
      case TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF:
        return getBehaviorRef();
      case TextstPackage.DEFINED_BY_NODE__REQUIREMENT_REF:
        return getRequirementRef();
      case TextstPackage.DEFINED_BY_NODE__TRACEABILITY_STATUS:
        return getTraceabilityStatus();
      case TextstPackage.DEFINED_BY_NODE__OPERATOR:
        return getOperator();
      case TextstPackage.DEFINED_BY_NODE__CHILD_NODE:
        return getChildNode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TextstPackage.DEFINED_BY_NODE__COMPONENT_REF:
        setComponentRef((String)newValue);
        return;
      case TextstPackage.DEFINED_BY_NODE__COMPONENT_SET:
        setComponentSet((String)newValue);
        return;
      case TextstPackage.DEFINED_BY_NODE__MCI:
        setMci((String)newValue);
        return;
      case TextstPackage.DEFINED_BY_NODE__QUALIFIER:
        setQualifier((Qualifier)newValue);
        return;
      case TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER:
        setSecondQualifier((Qualifier)newValue);
        return;
      case TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF:
        setBehaviorRef((String)newValue);
        return;
      case TextstPackage.DEFINED_BY_NODE__REQUIREMENT_REF:
        getRequirementRef().clear();
        getRequirementRef().addAll((Collection)newValue);
        return;
      case TextstPackage.DEFINED_BY_NODE__TRACEABILITY_STATUS:
        setTraceabilityStatus((Validity)newValue);
        return;
      case TextstPackage.DEFINED_BY_NODE__OPERATOR:
        setOperator((String)newValue);
        return;
      case TextstPackage.DEFINED_BY_NODE__CHILD_NODE:
        setChildNode((AbstractBlockOrNode)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TextstPackage.DEFINED_BY_NODE__COMPONENT_REF:
        setComponentRef(COMPONENT_REF_EDEFAULT);
        return;
      case TextstPackage.DEFINED_BY_NODE__COMPONENT_SET:
        setComponentSet(COMPONENT_SET_EDEFAULT);
        return;
      case TextstPackage.DEFINED_BY_NODE__MCI:
        setMci(MCI_EDEFAULT);
        return;
      case TextstPackage.DEFINED_BY_NODE__QUALIFIER:
        setQualifier(QUALIFIER_EDEFAULT);
        return;
      case TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER:
        setSecondQualifier(SECOND_QUALIFIER_EDEFAULT);
        return;
      case TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF:
        setBehaviorRef(BEHAVIOR_REF_EDEFAULT);
        return;
      case TextstPackage.DEFINED_BY_NODE__REQUIREMENT_REF:
        getRequirementRef().clear();
        return;
      case TextstPackage.DEFINED_BY_NODE__TRACEABILITY_STATUS:
        setTraceabilityStatus(TRACEABILITY_STATUS_EDEFAULT);
        return;
      case TextstPackage.DEFINED_BY_NODE__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case TextstPackage.DEFINED_BY_NODE__CHILD_NODE:
        setChildNode((AbstractBlockOrNode)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TextstPackage.DEFINED_BY_NODE__COMPONENT_REF:
        return COMPONENT_REF_EDEFAULT == null ? componentRef != null : !COMPONENT_REF_EDEFAULT.equals(componentRef);
      case TextstPackage.DEFINED_BY_NODE__COMPONENT_SET:
        return COMPONENT_SET_EDEFAULT == null ? componentSet != null : !COMPONENT_SET_EDEFAULT.equals(componentSet);
      case TextstPackage.DEFINED_BY_NODE__MCI:
        return MCI_EDEFAULT == null ? mci != null : !MCI_EDEFAULT.equals(mci);
      case TextstPackage.DEFINED_BY_NODE__QUALIFIER:
        return qualifier != QUALIFIER_EDEFAULT;
      case TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER:
        return secondQualifier != SECOND_QUALIFIER_EDEFAULT;
      case TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF:
        return BEHAVIOR_REF_EDEFAULT == null ? behaviorRef != null : !BEHAVIOR_REF_EDEFAULT.equals(behaviorRef);
      case TextstPackage.DEFINED_BY_NODE__REQUIREMENT_REF:
        return requirementRef != null && !requirementRef.isEmpty();
      case TextstPackage.DEFINED_BY_NODE__TRACEABILITY_STATUS:
        return traceabilityStatus != TRACEABILITY_STATUS_EDEFAULT;
      case TextstPackage.DEFINED_BY_NODE__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case TextstPackage.DEFINED_BY_NODE__CHILD_NODE:
        return childNode != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass)
  {
    if (baseClass == AbstractNode.class)
    {
      switch (derivedFeatureID)
      {
        case TextstPackage.DEFINED_BY_NODE__COMPONENT_REF: return TextstPackage.ABSTRACT_NODE__COMPONENT_REF;
        case TextstPackage.DEFINED_BY_NODE__COMPONENT_SET: return TextstPackage.ABSTRACT_NODE__COMPONENT_SET;
        case TextstPackage.DEFINED_BY_NODE__MCI: return TextstPackage.ABSTRACT_NODE__MCI;
        case TextstPackage.DEFINED_BY_NODE__QUALIFIER: return TextstPackage.ABSTRACT_NODE__QUALIFIER;
        case TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER: return TextstPackage.ABSTRACT_NODE__SECOND_QUALIFIER;
        case TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF: return TextstPackage.ABSTRACT_NODE__BEHAVIOR_REF;
        case TextstPackage.DEFINED_BY_NODE__REQUIREMENT_REF: return TextstPackage.ABSTRACT_NODE__REQUIREMENT_REF;
        case TextstPackage.DEFINED_BY_NODE__TRACEABILITY_STATUS: return TextstPackage.ABSTRACT_NODE__TRACEABILITY_STATUS;
        case TextstPackage.DEFINED_BY_NODE__OPERATOR: return TextstPackage.ABSTRACT_NODE__OPERATOR;
        case TextstPackage.DEFINED_BY_NODE__CHILD_NODE: return TextstPackage.ABSTRACT_NODE__CHILD_NODE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass)
  {
    if (baseClass == AbstractNode.class)
    {
      switch (baseFeatureID)
      {
        case TextstPackage.ABSTRACT_NODE__COMPONENT_REF: return TextstPackage.DEFINED_BY_NODE__COMPONENT_REF;
        case TextstPackage.ABSTRACT_NODE__COMPONENT_SET: return TextstPackage.DEFINED_BY_NODE__COMPONENT_SET;
        case TextstPackage.ABSTRACT_NODE__MCI: return TextstPackage.DEFINED_BY_NODE__MCI;
        case TextstPackage.ABSTRACT_NODE__QUALIFIER: return TextstPackage.DEFINED_BY_NODE__QUALIFIER;
        case TextstPackage.ABSTRACT_NODE__SECOND_QUALIFIER: return TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER;
        case TextstPackage.ABSTRACT_NODE__BEHAVIOR_REF: return TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF;
        case TextstPackage.ABSTRACT_NODE__REQUIREMENT_REF: return TextstPackage.DEFINED_BY_NODE__REQUIREMENT_REF;
        case TextstPackage.ABSTRACT_NODE__TRACEABILITY_STATUS: return TextstPackage.DEFINED_BY_NODE__TRACEABILITY_STATUS;
        case TextstPackage.ABSTRACT_NODE__OPERATOR: return TextstPackage.DEFINED_BY_NODE__OPERATOR;
        case TextstPackage.ABSTRACT_NODE__CHILD_NODE: return TextstPackage.DEFINED_BY_NODE__CHILD_NODE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (componentRef: ");
    result.append(componentRef);
    result.append(", componentSet: ");
    result.append(componentSet);
    result.append(", mci: ");
    result.append(mci);
    result.append(", qualifier: ");
    result.append(qualifier);
    result.append(", secondQualifier: ");
    result.append(secondQualifier);
    result.append(", behaviorRef: ");
    result.append(behaviorRef);
    result.append(", requirementRef: ");
    result.append(requirementRef);
    result.append(", traceabilityStatus: ");
    result.append(traceabilityStatus);
    result.append(", operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //DefinedByNodeImpl
