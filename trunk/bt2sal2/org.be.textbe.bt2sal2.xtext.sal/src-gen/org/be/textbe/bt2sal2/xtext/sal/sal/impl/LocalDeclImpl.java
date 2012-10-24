/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import org.be.textbe.bt2sal2.xtext.sal.sal.LocalDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;
import org.be.textbe.bt2sal2.xtext.sal.sal.VarDecls;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.LocalDeclImpl#getVarDecls <em>Var Decls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalDeclImpl extends BaseDeclarationImpl implements LocalDecl
{
  /**
   * The cached value of the '{@link #getVarDecls() <em>Var Decls</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarDecls()
   * @generated
   * @ordered
   */
  protected VarDecls varDecls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalDeclImpl()
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
    return SalPackage.Literals.LOCAL_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecls getVarDecls()
  {
    return varDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarDecls(VarDecls newVarDecls, NotificationChain msgs)
  {
    VarDecls oldVarDecls = varDecls;
    varDecls = newVarDecls;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.LOCAL_DECL__VAR_DECLS, oldVarDecls, newVarDecls);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarDecls(VarDecls newVarDecls)
  {
    if (newVarDecls != varDecls)
    {
      NotificationChain msgs = null;
      if (varDecls != null)
        msgs = ((InternalEObject)varDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.LOCAL_DECL__VAR_DECLS, null, msgs);
      if (newVarDecls != null)
        msgs = ((InternalEObject)newVarDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.LOCAL_DECL__VAR_DECLS, null, msgs);
      msgs = basicSetVarDecls(newVarDecls, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.LOCAL_DECL__VAR_DECLS, newVarDecls, newVarDecls));
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
      case SalPackage.LOCAL_DECL__VAR_DECLS:
        return basicSetVarDecls(null, msgs);
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
      case SalPackage.LOCAL_DECL__VAR_DECLS:
        return getVarDecls();
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
      case SalPackage.LOCAL_DECL__VAR_DECLS:
        setVarDecls((VarDecls)newValue);
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
      case SalPackage.LOCAL_DECL__VAR_DECLS:
        setVarDecls((VarDecls)null);
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
      case SalPackage.LOCAL_DECL__VAR_DECLS:
        return varDecls != null;
    }
    return super.eIsSet(featureID);
  }

} //LocalDeclImpl
