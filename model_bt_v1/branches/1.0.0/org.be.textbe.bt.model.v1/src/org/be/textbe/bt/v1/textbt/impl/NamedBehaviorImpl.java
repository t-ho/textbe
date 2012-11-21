/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.v1.textbt.impl;

import java.util.Collection;

import org.be.textbe.bt.v1.textbt.Behavior;
import org.be.textbe.bt.v1.textbt.Component;
import org.be.textbe.bt.v1.textbt.NamedBehavior;
import org.be.textbe.bt.v1.textbt.Relation;
import org.be.textbe.bt.v1.textbt.TextbtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.v1.textbt.impl.NamedBehaviorImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.be.textbe.bt.v1.textbt.impl.NamedBehaviorImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.be.textbe.bt.v1.textbt.impl.NamedBehaviorImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.be.textbe.bt.v1.textbt.impl.NamedBehaviorImpl#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamedBehaviorImpl extends NamedElementImpl implements NamedBehavior
{
  /**
   * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected int number = NUMBER_EDEFAULT;

  /**
   * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelations()
   * @generated
   * @ordered
   */
  protected EList<Relation> relations;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = "";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamedBehaviorImpl()
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
    return TextbtPackage.Literals.NAMED_BEHAVIOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(int newNumber)
  {
    int oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextbtPackage.NAMED_BEHAVIOR__NUMBER, oldNumber, number));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relation> getRelations()
  {
    if (relations == null)
    {
      relations = new EObjectContainmentEList<Relation>(Relation.class, this, TextbtPackage.NAMED_BEHAVIOR__RELATIONS);
    }
    return relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String getId()
  {
    // TODO: implement this method to return the 'Id' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    return getComponent().getId()+"_"+getNumber();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    // TODO: implement this method to set the 'Id' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getComponent()
  {
    if (eContainerFeatureID() != TextbtPackage.NAMED_BEHAVIOR__COMPONENT) return null;
    return (Component)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newComponent, TextbtPackage.NAMED_BEHAVIOR__COMPONENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(Component newComponent)
  {
    if (newComponent != eInternalContainer() || (eContainerFeatureID() != TextbtPackage.NAMED_BEHAVIOR__COMPONENT && newComponent != null))
    {
      if (EcoreUtil.isAncestor(this, newComponent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newComponent != null)
        msgs = ((InternalEObject)newComponent).eInverseAdd(this, TextbtPackage.COMPONENT__BEHAVIOR, Component.class, msgs);
      msgs = basicSetComponent(newComponent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextbtPackage.NAMED_BEHAVIOR__COMPONENT, newComponent, newComponent));
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
      case TextbtPackage.NAMED_BEHAVIOR__COMPONENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetComponent((Component)otherEnd, msgs);
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
      case TextbtPackage.NAMED_BEHAVIOR__RELATIONS:
        return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
      case TextbtPackage.NAMED_BEHAVIOR__COMPONENT:
        return basicSetComponent(null, msgs);
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
      case TextbtPackage.NAMED_BEHAVIOR__COMPONENT:
        return eInternalContainer().eInverseRemove(this, TextbtPackage.COMPONENT__BEHAVIOR, Component.class, msgs);
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
      case TextbtPackage.NAMED_BEHAVIOR__NUMBER:
        return getNumber();
      case TextbtPackage.NAMED_BEHAVIOR__RELATIONS:
        return getRelations();
      case TextbtPackage.NAMED_BEHAVIOR__ID:
        return getId();
      case TextbtPackage.NAMED_BEHAVIOR__COMPONENT:
        return getComponent();
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
      case TextbtPackage.NAMED_BEHAVIOR__NUMBER:
        setNumber((Integer)newValue);
        return;
      case TextbtPackage.NAMED_BEHAVIOR__RELATIONS:
        getRelations().clear();
        getRelations().addAll((Collection<? extends Relation>)newValue);
        return;
      case TextbtPackage.NAMED_BEHAVIOR__ID:
        setId((String)newValue);
        return;
      case TextbtPackage.NAMED_BEHAVIOR__COMPONENT:
        setComponent((Component)newValue);
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
      case TextbtPackage.NAMED_BEHAVIOR__NUMBER:
        setNumber(NUMBER_EDEFAULT);
        return;
      case TextbtPackage.NAMED_BEHAVIOR__RELATIONS:
        getRelations().clear();
        return;
      case TextbtPackage.NAMED_BEHAVIOR__ID:
        setId(ID_EDEFAULT);
        return;
      case TextbtPackage.NAMED_BEHAVIOR__COMPONENT:
        setComponent((Component)null);
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
      case TextbtPackage.NAMED_BEHAVIOR__NUMBER:
        return number != NUMBER_EDEFAULT;
      case TextbtPackage.NAMED_BEHAVIOR__RELATIONS:
        return relations != null && !relations.isEmpty();
      case TextbtPackage.NAMED_BEHAVIOR__ID:
        return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
      case TextbtPackage.NAMED_BEHAVIOR__COMPONENT:
        return getComponent() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Behavior.class)
    {
      switch (derivedFeatureID)
      {
        case TextbtPackage.NAMED_BEHAVIOR__NUMBER: return TextbtPackage.BEHAVIOR__NUMBER;
        case TextbtPackage.NAMED_BEHAVIOR__RELATIONS: return TextbtPackage.BEHAVIOR__RELATIONS;
        case TextbtPackage.NAMED_BEHAVIOR__ID: return TextbtPackage.BEHAVIOR__ID;
        case TextbtPackage.NAMED_BEHAVIOR__COMPONENT: return TextbtPackage.BEHAVIOR__COMPONENT;
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
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Behavior.class)
    {
      switch (baseFeatureID)
      {
        case TextbtPackage.BEHAVIOR__NUMBER: return TextbtPackage.NAMED_BEHAVIOR__NUMBER;
        case TextbtPackage.BEHAVIOR__RELATIONS: return TextbtPackage.NAMED_BEHAVIOR__RELATIONS;
        case TextbtPackage.BEHAVIOR__ID: return TextbtPackage.NAMED_BEHAVIOR__ID;
        case TextbtPackage.BEHAVIOR__COMPONENT: return TextbtPackage.NAMED_BEHAVIOR__COMPONENT;
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
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (number: ");
    result.append(number);
    result.append(')');
    return result.toString();
  }

} //NamedBehaviorImpl
