/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions.impl;

import org.be.textbe.expressions.BinaryExpression;
import org.be.textbe.expressions.ComponentInstantiation;
import org.be.textbe.expressions.ExpressionsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.expressions.impl.ComponentInstantiationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.be.textbe.expressions.impl.ComponentInstantiationImpl#getComponentSet <em>Component Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstantiationImpl extends ForAllImpl implements ComponentInstantiation
{
  /**
   * The default value of the '{@link #getComponent() <em>Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected static final String COMPONENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected String component = COMPONENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getComponentSet() <em>Component Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentSet()
   * @generated
   * @ordered
   */
  protected BinaryExpression componentSet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentInstantiationImpl()
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
    return ExpressionsPackage.Literals.COMPONENT_INSTANTIATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(String newComponent)
  {
    String oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.COMPONENT_INSTANTIATION__COMPONENT, oldComponent, component));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpression getComponentSet()
  {
    return componentSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponentSet(BinaryExpression newComponentSet, NotificationChain msgs)
  {
    BinaryExpression oldComponentSet = componentSet;
    componentSet = newComponentSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.COMPONENT_INSTANTIATION__COMPONENT_SET, oldComponentSet, newComponentSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentSet(BinaryExpression newComponentSet)
  {
    if (newComponentSet != componentSet)
    {
      NotificationChain msgs = null;
      if (componentSet != null)
        msgs = ((InternalEObject)componentSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.COMPONENT_INSTANTIATION__COMPONENT_SET, null, msgs);
      if (newComponentSet != null)
        msgs = ((InternalEObject)newComponentSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.COMPONENT_INSTANTIATION__COMPONENT_SET, null, msgs);
      msgs = basicSetComponentSet(newComponentSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.COMPONENT_INSTANTIATION__COMPONENT_SET, newComponentSet, newComponentSet));
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
      case ExpressionsPackage.COMPONENT_INSTANTIATION__COMPONENT_SET:
        return basicSetComponentSet(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ExpressionsPackage.COMPONENT_INSTANTIATION__COMPONENT:
        return getComponent();
      case ExpressionsPackage.COMPONENT_INSTANTIATION__COMPONENT_SET:
        return getComponentSet();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExpressionsPackage.COMPONENT_INSTANTIATION__COMPONENT:
        setComponent((String)newValue);
        return;
      case ExpressionsPackage.COMPONENT_INSTANTIATION__COMPONENT_SET:
        setComponentSet((BinaryExpression)newValue);
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
      case ExpressionsPackage.COMPONENT_INSTANTIATION__COMPONENT:
        setComponent(COMPONENT_EDEFAULT);
        return;
      case ExpressionsPackage.COMPONENT_INSTANTIATION__COMPONENT_SET:
        setComponentSet((BinaryExpression)null);
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
      case ExpressionsPackage.COMPONENT_INSTANTIATION__COMPONENT:
        return COMPONENT_EDEFAULT == null ? component != null : !COMPONENT_EDEFAULT.equals(component);
      case ExpressionsPackage.COMPONENT_INSTANTIATION__COMPONENT_SET:
        return componentSet != null;
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
    result.append(" (component: ");
    result.append(component);
    result.append(')');
    return result.toString();
  }

} //ComponentInstantiationImpl
