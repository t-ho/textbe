/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import org.be.textbe.bt2sal2.xtext.sal.sal.Context;
import org.be.textbe.bt2sal2.xtext.sal.sal.ContextBody;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ContextImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ContextImpl#getContextBody <em>Context Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context
{
  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getContextBody() <em>Context Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextBody()
   * @generated
   * @ordered
   */
  protected ContextBody contextBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextImpl()
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
    return SalPackage.Literals.CONTEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.CONTEXT__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextBody getContextBody()
  {
    return contextBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContextBody(ContextBody newContextBody, NotificationChain msgs)
  {
    ContextBody oldContextBody = contextBody;
    contextBody = newContextBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.CONTEXT__CONTEXT_BODY, oldContextBody, newContextBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContextBody(ContextBody newContextBody)
  {
    if (newContextBody != contextBody)
    {
      NotificationChain msgs = null;
      if (contextBody != null)
        msgs = ((InternalEObject)contextBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.CONTEXT__CONTEXT_BODY, null, msgs);
      if (newContextBody != null)
        msgs = ((InternalEObject)newContextBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.CONTEXT__CONTEXT_BODY, null, msgs);
      msgs = basicSetContextBody(newContextBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.CONTEXT__CONTEXT_BODY, newContextBody, newContextBody));
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
      case SalPackage.CONTEXT__CONTEXT_BODY:
        return basicSetContextBody(null, msgs);
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
      case SalPackage.CONTEXT__IDENTIFIER:
        return getIdentifier();
      case SalPackage.CONTEXT__CONTEXT_BODY:
        return getContextBody();
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
      case SalPackage.CONTEXT__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case SalPackage.CONTEXT__CONTEXT_BODY:
        setContextBody((ContextBody)newValue);
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
      case SalPackage.CONTEXT__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case SalPackage.CONTEXT__CONTEXT_BODY:
        setContextBody((ContextBody)null);
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
      case SalPackage.CONTEXT__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case SalPackage.CONTEXT__CONTEXT_BODY:
        return contextBody != null;
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //ContextImpl
