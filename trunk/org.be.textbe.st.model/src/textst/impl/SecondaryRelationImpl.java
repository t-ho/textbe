/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textst.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import textst.SecondaryRelation;
import textst.TextstPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secondary Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link textst.impl.SecondaryRelationImpl#getBehaviorRef <em>Behavior Ref</em>}</li>
 *   <li>{@link textst.impl.SecondaryRelationImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link textst.impl.SecondaryRelationImpl#getPrimaryLowerBound <em>Primary Lower Bound</em>}</li>
 *   <li>{@link textst.impl.SecondaryRelationImpl#getPrimaryUpperBound <em>Primary Upper Bound</em>}</li>
 *   <li>{@link textst.impl.SecondaryRelationImpl#getSecondaryLowerBound <em>Secondary Lower Bound</em>}</li>
 *   <li>{@link textst.impl.SecondaryRelationImpl#getSecondaryUpperBound <em>Secondary Upper Bound</em>}</li>
 *   <li>{@link textst.impl.SecondaryRelationImpl#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link textst.impl.SecondaryRelationImpl#getComponentAttribute <em>Component Attribute</em>}</li>
 *   <li>{@link textst.impl.SecondaryRelationImpl#getRelationName <em>Relation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecondaryRelationImpl extends AbstractBehaviorImpl implements SecondaryRelation
{
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
   * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected String attribute = ATTRIBUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getPrimaryLowerBound() <em>Primary Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryLowerBound()
   * @generated
   * @ordered
   */
  protected static final String PRIMARY_LOWER_BOUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimaryLowerBound() <em>Primary Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryLowerBound()
   * @generated
   * @ordered
   */
  protected String primaryLowerBound = PRIMARY_LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getPrimaryUpperBound() <em>Primary Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryUpperBound()
   * @generated
   * @ordered
   */
  protected static final String PRIMARY_UPPER_BOUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimaryUpperBound() <em>Primary Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryUpperBound()
   * @generated
   * @ordered
   */
  protected String primaryUpperBound = PRIMARY_UPPER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getSecondaryLowerBound() <em>Secondary Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondaryLowerBound()
   * @generated
   * @ordered
   */
  protected static final String SECONDARY_LOWER_BOUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecondaryLowerBound() <em>Secondary Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondaryLowerBound()
   * @generated
   * @ordered
   */
  protected String secondaryLowerBound = SECONDARY_LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getSecondaryUpperBound() <em>Secondary Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondaryUpperBound()
   * @generated
   * @ordered
   */
  protected static final String SECONDARY_UPPER_BOUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecondaryUpperBound() <em>Secondary Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondaryUpperBound()
   * @generated
   * @ordered
   */
  protected String secondaryUpperBound = SECONDARY_UPPER_BOUND_EDEFAULT;

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
   * The default value of the '{@link #getComponentAttribute() <em>Component Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentAttribute()
   * @generated
   * @ordered
   */
  protected static final String COMPONENT_ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComponentAttribute() <em>Component Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentAttribute()
   * @generated
   * @ordered
   */
  protected String componentAttribute = COMPONENT_ATTRIBUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getRelationName() <em>Relation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationName()
   * @generated
   * @ordered
   */
  protected static final String RELATION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelationName() <em>Relation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationName()
   * @generated
   * @ordered
   */
  protected String relationName = RELATION_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SecondaryRelationImpl()
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
    return TextstPackage.Literals.SECONDARY_RELATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.SECONDARY_RELATION__BEHAVIOR_REF, oldBehaviorRef, behaviorRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(String newAttribute)
  {
    String oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.SECONDARY_RELATION__ATTRIBUTE, oldAttribute, attribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrimaryLowerBound()
  {
    return primaryLowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryLowerBound(String newPrimaryLowerBound)
  {
    String oldPrimaryLowerBound = primaryLowerBound;
    primaryLowerBound = newPrimaryLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.SECONDARY_RELATION__PRIMARY_LOWER_BOUND, oldPrimaryLowerBound, primaryLowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrimaryUpperBound()
  {
    return primaryUpperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryUpperBound(String newPrimaryUpperBound)
  {
    String oldPrimaryUpperBound = primaryUpperBound;
    primaryUpperBound = newPrimaryUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.SECONDARY_RELATION__PRIMARY_UPPER_BOUND, oldPrimaryUpperBound, primaryUpperBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSecondaryLowerBound()
  {
    return secondaryLowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondaryLowerBound(String newSecondaryLowerBound)
  {
    String oldSecondaryLowerBound = secondaryLowerBound;
    secondaryLowerBound = newSecondaryLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.SECONDARY_RELATION__SECONDARY_LOWER_BOUND, oldSecondaryLowerBound, secondaryLowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSecondaryUpperBound()
  {
    return secondaryUpperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondaryUpperBound(String newSecondaryUpperBound)
  {
    String oldSecondaryUpperBound = secondaryUpperBound;
    secondaryUpperBound = newSecondaryUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.SECONDARY_RELATION__SECONDARY_UPPER_BOUND, oldSecondaryUpperBound, secondaryUpperBound));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.SECONDARY_RELATION__COMPONENT_REF, oldComponentRef, componentRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComponentAttribute()
  {
    return componentAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentAttribute(String newComponentAttribute)
  {
    String oldComponentAttribute = componentAttribute;
    componentAttribute = newComponentAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE, oldComponentAttribute, componentAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelationName()
  {
    return relationName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationName(String newRelationName)
  {
    String oldRelationName = relationName;
    relationName = newRelationName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextstPackage.SECONDARY_RELATION__RELATION_NAME, oldRelationName, relationName));
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
      case TextstPackage.SECONDARY_RELATION__BEHAVIOR_REF:
        return getBehaviorRef();
      case TextstPackage.SECONDARY_RELATION__ATTRIBUTE:
        return getAttribute();
      case TextstPackage.SECONDARY_RELATION__PRIMARY_LOWER_BOUND:
        return getPrimaryLowerBound();
      case TextstPackage.SECONDARY_RELATION__PRIMARY_UPPER_BOUND:
        return getPrimaryUpperBound();
      case TextstPackage.SECONDARY_RELATION__SECONDARY_LOWER_BOUND:
        return getSecondaryLowerBound();
      case TextstPackage.SECONDARY_RELATION__SECONDARY_UPPER_BOUND:
        return getSecondaryUpperBound();
      case TextstPackage.SECONDARY_RELATION__COMPONENT_REF:
        return getComponentRef();
      case TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE:
        return getComponentAttribute();
      case TextstPackage.SECONDARY_RELATION__RELATION_NAME:
        return getRelationName();
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
      case TextstPackage.SECONDARY_RELATION__BEHAVIOR_REF:
        setBehaviorRef((String)newValue);
        return;
      case TextstPackage.SECONDARY_RELATION__ATTRIBUTE:
        setAttribute((String)newValue);
        return;
      case TextstPackage.SECONDARY_RELATION__PRIMARY_LOWER_BOUND:
        setPrimaryLowerBound((String)newValue);
        return;
      case TextstPackage.SECONDARY_RELATION__PRIMARY_UPPER_BOUND:
        setPrimaryUpperBound((String)newValue);
        return;
      case TextstPackage.SECONDARY_RELATION__SECONDARY_LOWER_BOUND:
        setSecondaryLowerBound((String)newValue);
        return;
      case TextstPackage.SECONDARY_RELATION__SECONDARY_UPPER_BOUND:
        setSecondaryUpperBound((String)newValue);
        return;
      case TextstPackage.SECONDARY_RELATION__COMPONENT_REF:
        setComponentRef((String)newValue);
        return;
      case TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE:
        setComponentAttribute((String)newValue);
        return;
      case TextstPackage.SECONDARY_RELATION__RELATION_NAME:
        setRelationName((String)newValue);
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
      case TextstPackage.SECONDARY_RELATION__BEHAVIOR_REF:
        setBehaviorRef(BEHAVIOR_REF_EDEFAULT);
        return;
      case TextstPackage.SECONDARY_RELATION__ATTRIBUTE:
        setAttribute(ATTRIBUTE_EDEFAULT);
        return;
      case TextstPackage.SECONDARY_RELATION__PRIMARY_LOWER_BOUND:
        setPrimaryLowerBound(PRIMARY_LOWER_BOUND_EDEFAULT);
        return;
      case TextstPackage.SECONDARY_RELATION__PRIMARY_UPPER_BOUND:
        setPrimaryUpperBound(PRIMARY_UPPER_BOUND_EDEFAULT);
        return;
      case TextstPackage.SECONDARY_RELATION__SECONDARY_LOWER_BOUND:
        setSecondaryLowerBound(SECONDARY_LOWER_BOUND_EDEFAULT);
        return;
      case TextstPackage.SECONDARY_RELATION__SECONDARY_UPPER_BOUND:
        setSecondaryUpperBound(SECONDARY_UPPER_BOUND_EDEFAULT);
        return;
      case TextstPackage.SECONDARY_RELATION__COMPONENT_REF:
        setComponentRef(COMPONENT_REF_EDEFAULT);
        return;
      case TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE:
        setComponentAttribute(COMPONENT_ATTRIBUTE_EDEFAULT);
        return;
      case TextstPackage.SECONDARY_RELATION__RELATION_NAME:
        setRelationName(RELATION_NAME_EDEFAULT);
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
      case TextstPackage.SECONDARY_RELATION__BEHAVIOR_REF:
        return BEHAVIOR_REF_EDEFAULT == null ? behaviorRef != null : !BEHAVIOR_REF_EDEFAULT.equals(behaviorRef);
      case TextstPackage.SECONDARY_RELATION__ATTRIBUTE:
        return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
      case TextstPackage.SECONDARY_RELATION__PRIMARY_LOWER_BOUND:
        return PRIMARY_LOWER_BOUND_EDEFAULT == null ? primaryLowerBound != null : !PRIMARY_LOWER_BOUND_EDEFAULT.equals(primaryLowerBound);
      case TextstPackage.SECONDARY_RELATION__PRIMARY_UPPER_BOUND:
        return PRIMARY_UPPER_BOUND_EDEFAULT == null ? primaryUpperBound != null : !PRIMARY_UPPER_BOUND_EDEFAULT.equals(primaryUpperBound);
      case TextstPackage.SECONDARY_RELATION__SECONDARY_LOWER_BOUND:
        return SECONDARY_LOWER_BOUND_EDEFAULT == null ? secondaryLowerBound != null : !SECONDARY_LOWER_BOUND_EDEFAULT.equals(secondaryLowerBound);
      case TextstPackage.SECONDARY_RELATION__SECONDARY_UPPER_BOUND:
        return SECONDARY_UPPER_BOUND_EDEFAULT == null ? secondaryUpperBound != null : !SECONDARY_UPPER_BOUND_EDEFAULT.equals(secondaryUpperBound);
      case TextstPackage.SECONDARY_RELATION__COMPONENT_REF:
        return COMPONENT_REF_EDEFAULT == null ? componentRef != null : !COMPONENT_REF_EDEFAULT.equals(componentRef);
      case TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE:
        return COMPONENT_ATTRIBUTE_EDEFAULT == null ? componentAttribute != null : !COMPONENT_ATTRIBUTE_EDEFAULT.equals(componentAttribute);
      case TextstPackage.SECONDARY_RELATION__RELATION_NAME:
        return RELATION_NAME_EDEFAULT == null ? relationName != null : !RELATION_NAME_EDEFAULT.equals(relationName);
    }
    return super.eIsSet(featureID);
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
    result.append(" (behaviorRef: ");
    result.append(behaviorRef);
    result.append(", attribute: ");
    result.append(attribute);
    result.append(", primaryLowerBound: ");
    result.append(primaryLowerBound);
    result.append(", primaryUpperBound: ");
    result.append(primaryUpperBound);
    result.append(", secondaryLowerBound: ");
    result.append(secondaryLowerBound);
    result.append(", secondaryUpperBound: ");
    result.append(secondaryUpperBound);
    result.append(", componentRef: ");
    result.append(componentRef);
    result.append(", componentAttribute: ");
    result.append(componentAttribute);
    result.append(", relationName: ");
    result.append(relationName);
    result.append(')');
    return result.toString();
  }

} //SecondaryRelationImpl
