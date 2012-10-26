/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import org.be.textbe.bt2sal2.xtext.sal.sal.DefDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.Definitions;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Def Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefDeclImpl#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefDeclImpl extends BaseDeclarationImpl implements DefDecl
{
  /**
   * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitions()
   * @generated
   * @ordered
   */
  protected Definitions definitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefDeclImpl()
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
    return SalPackage.Literals.DEF_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definitions getDefinitions()
  {
    return definitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefinitions(Definitions newDefinitions, NotificationChain msgs)
  {
    Definitions oldDefinitions = definitions;
    definitions = newDefinitions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.DEF_DECL__DEFINITIONS, oldDefinitions, newDefinitions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefinitions(Definitions newDefinitions)
  {
    if (newDefinitions != definitions)
    {
      NotificationChain msgs = null;
      if (definitions != null)
        msgs = ((InternalEObject)definitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.DEF_DECL__DEFINITIONS, null, msgs);
      if (newDefinitions != null)
        msgs = ((InternalEObject)newDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.DEF_DECL__DEFINITIONS, null, msgs);
      msgs = basicSetDefinitions(newDefinitions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.DEF_DECL__DEFINITIONS, newDefinitions, newDefinitions));
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
      case SalPackage.DEF_DECL__DEFINITIONS:
        return basicSetDefinitions(null, msgs);
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
      case SalPackage.DEF_DECL__DEFINITIONS:
        return getDefinitions();
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
      case SalPackage.DEF_DECL__DEFINITIONS:
        setDefinitions((Definitions)newValue);
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
      case SalPackage.DEF_DECL__DEFINITIONS:
        setDefinitions((Definitions)null);
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
      case SalPackage.DEF_DECL__DEFINITIONS:
        return definitions != null;
    }
    return super.eIsSet(featureID);
  }

} //DefDeclImpl
