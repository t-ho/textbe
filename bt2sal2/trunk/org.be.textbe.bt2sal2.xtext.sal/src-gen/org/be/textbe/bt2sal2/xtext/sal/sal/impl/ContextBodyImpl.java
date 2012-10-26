/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import org.be.textbe.bt2sal2.xtext.sal.sal.ContextBody;
import org.be.textbe.bt2sal2.xtext.sal.sal.Declarations;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ContextBodyImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextBodyImpl extends MinimalEObjectImpl.Container implements ContextBody
{
  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected Declarations declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextBodyImpl()
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
    return SalPackage.Literals.CONTEXT_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarations getDeclarations()
  {
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclarations(Declarations newDeclarations, NotificationChain msgs)
  {
    Declarations oldDeclarations = declarations;
    declarations = newDeclarations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.CONTEXT_BODY__DECLARATIONS, oldDeclarations, newDeclarations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclarations(Declarations newDeclarations)
  {
    if (newDeclarations != declarations)
    {
      NotificationChain msgs = null;
      if (declarations != null)
        msgs = ((InternalEObject)declarations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.CONTEXT_BODY__DECLARATIONS, null, msgs);
      if (newDeclarations != null)
        msgs = ((InternalEObject)newDeclarations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.CONTEXT_BODY__DECLARATIONS, null, msgs);
      msgs = basicSetDeclarations(newDeclarations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.CONTEXT_BODY__DECLARATIONS, newDeclarations, newDeclarations));
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
      case SalPackage.CONTEXT_BODY__DECLARATIONS:
        return basicSetDeclarations(null, msgs);
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
      case SalPackage.CONTEXT_BODY__DECLARATIONS:
        return getDeclarations();
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
      case SalPackage.CONTEXT_BODY__DECLARATIONS:
        setDeclarations((Declarations)newValue);
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
      case SalPackage.CONTEXT_BODY__DECLARATIONS:
        setDeclarations((Declarations)null);
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
      case SalPackage.CONTEXT_BODY__DECLARATIONS:
        return declarations != null;
    }
    return super.eIsSet(featureID);
  }

} //ContextBodyImpl
