/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import java.util.Collection;

import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;
import org.be.textbe.bt2sal2.xtext.sal.sal.Type;
import org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.VarDeclImpl#getFirstVar <em>First Var</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.VarDeclImpl#getNextVar <em>Next Var</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.VarDeclImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarDeclImpl extends MinimalEObjectImpl.Container implements VarDecl
{
  /**
   * The default value of the '{@link #getFirstVar() <em>First Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstVar()
   * @generated
   * @ordered
   */
  protected static final String FIRST_VAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstVar() <em>First Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstVar()
   * @generated
   * @ordered
   */
  protected String firstVar = FIRST_VAR_EDEFAULT;

  /**
   * The cached value of the '{@link #getNextVar() <em>Next Var</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextVar()
   * @generated
   * @ordered
   */
  protected EList<String> nextVar;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarDeclImpl()
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
    return SalPackage.Literals.VAR_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstVar()
  {
    return firstVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstVar(String newFirstVar)
  {
    String oldFirstVar = firstVar;
    firstVar = newFirstVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.VAR_DECL__FIRST_VAR, oldFirstVar, firstVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNextVar()
  {
    if (nextVar == null)
    {
      nextVar = new EDataTypeEList<String>(String.class, this, SalPackage.VAR_DECL__NEXT_VAR);
    }
    return nextVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.VAR_DECL__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.VAR_DECL__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.VAR_DECL__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.VAR_DECL__TYPE, newType, newType));
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
      case SalPackage.VAR_DECL__TYPE:
        return basicSetType(null, msgs);
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
      case SalPackage.VAR_DECL__FIRST_VAR:
        return getFirstVar();
      case SalPackage.VAR_DECL__NEXT_VAR:
        return getNextVar();
      case SalPackage.VAR_DECL__TYPE:
        return getType();
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
      case SalPackage.VAR_DECL__FIRST_VAR:
        setFirstVar((String)newValue);
        return;
      case SalPackage.VAR_DECL__NEXT_VAR:
        getNextVar().clear();
        getNextVar().addAll((Collection<? extends String>)newValue);
        return;
      case SalPackage.VAR_DECL__TYPE:
        setType((Type)newValue);
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
      case SalPackage.VAR_DECL__FIRST_VAR:
        setFirstVar(FIRST_VAR_EDEFAULT);
        return;
      case SalPackage.VAR_DECL__NEXT_VAR:
        getNextVar().clear();
        return;
      case SalPackage.VAR_DECL__TYPE:
        setType((Type)null);
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
      case SalPackage.VAR_DECL__FIRST_VAR:
        return FIRST_VAR_EDEFAULT == null ? firstVar != null : !FIRST_VAR_EDEFAULT.equals(firstVar);
      case SalPackage.VAR_DECL__NEXT_VAR:
        return nextVar != null && !nextVar.isEmpty();
      case SalPackage.VAR_DECL__TYPE:
        return type != null;
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
    result.append(" (firstVar: ");
    result.append(firstVar);
    result.append(", nextVar: ");
    result.append(nextVar);
    result.append(')');
    return result.toString();
  }

} //VarDeclImpl
