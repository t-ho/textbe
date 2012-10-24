/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import java.util.Collection;

import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;
import org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.VarDecls;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Decls</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.VarDeclsImpl#getFirstVarDecl <em>First Var Decl</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.VarDeclsImpl#getNextVarDecl <em>Next Var Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarDeclsImpl extends MinimalEObjectImpl.Container implements VarDecls
{
  /**
   * The cached value of the '{@link #getFirstVarDecl() <em>First Var Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstVarDecl()
   * @generated
   * @ordered
   */
  protected VarDecl firstVarDecl;

  /**
   * The cached value of the '{@link #getNextVarDecl() <em>Next Var Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextVarDecl()
   * @generated
   * @ordered
   */
  protected EList<VarDecl> nextVarDecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarDeclsImpl()
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
    return SalPackage.Literals.VAR_DECLS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl getFirstVarDecl()
  {
    return firstVarDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstVarDecl(VarDecl newFirstVarDecl, NotificationChain msgs)
  {
    VarDecl oldFirstVarDecl = firstVarDecl;
    firstVarDecl = newFirstVarDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.VAR_DECLS__FIRST_VAR_DECL, oldFirstVarDecl, newFirstVarDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstVarDecl(VarDecl newFirstVarDecl)
  {
    if (newFirstVarDecl != firstVarDecl)
    {
      NotificationChain msgs = null;
      if (firstVarDecl != null)
        msgs = ((InternalEObject)firstVarDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.VAR_DECLS__FIRST_VAR_DECL, null, msgs);
      if (newFirstVarDecl != null)
        msgs = ((InternalEObject)newFirstVarDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.VAR_DECLS__FIRST_VAR_DECL, null, msgs);
      msgs = basicSetFirstVarDecl(newFirstVarDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.VAR_DECLS__FIRST_VAR_DECL, newFirstVarDecl, newFirstVarDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarDecl> getNextVarDecl()
  {
    if (nextVarDecl == null)
    {
      nextVarDecl = new EObjectContainmentEList<VarDecl>(VarDecl.class, this, SalPackage.VAR_DECLS__NEXT_VAR_DECL);
    }
    return nextVarDecl;
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
      case SalPackage.VAR_DECLS__FIRST_VAR_DECL:
        return basicSetFirstVarDecl(null, msgs);
      case SalPackage.VAR_DECLS__NEXT_VAR_DECL:
        return ((InternalEList<?>)getNextVarDecl()).basicRemove(otherEnd, msgs);
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
      case SalPackage.VAR_DECLS__FIRST_VAR_DECL:
        return getFirstVarDecl();
      case SalPackage.VAR_DECLS__NEXT_VAR_DECL:
        return getNextVarDecl();
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
      case SalPackage.VAR_DECLS__FIRST_VAR_DECL:
        setFirstVarDecl((VarDecl)newValue);
        return;
      case SalPackage.VAR_DECLS__NEXT_VAR_DECL:
        getNextVarDecl().clear();
        getNextVarDecl().addAll((Collection<? extends VarDecl>)newValue);
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
      case SalPackage.VAR_DECLS__FIRST_VAR_DECL:
        setFirstVarDecl((VarDecl)null);
        return;
      case SalPackage.VAR_DECLS__NEXT_VAR_DECL:
        getNextVarDecl().clear();
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
      case SalPackage.VAR_DECLS__FIRST_VAR_DECL:
        return firstVarDecl != null;
      case SalPackage.VAR_DECLS__NEXT_VAR_DECL:
        return nextVarDecl != null && !nextVarDecl.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VarDeclsImpl
