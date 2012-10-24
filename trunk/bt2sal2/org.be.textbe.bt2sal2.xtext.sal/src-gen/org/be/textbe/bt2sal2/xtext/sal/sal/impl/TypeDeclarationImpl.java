/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;
import org.be.textbe.bt2sal2.xtext.sal.sal.TypeDeclaration;
import org.be.textbe.bt2sal2.xtext.sal.sal.TypeDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.TypeDeclarationImpl#getTypeDef <em>Type Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDeclarationImpl extends DeclarationImpl implements TypeDeclaration
{
  /**
   * The cached value of the '{@link #getTypeDef() <em>Type Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDef()
   * @generated
   * @ordered
   */
  protected TypeDef typeDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeDeclarationImpl()
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
    return SalPackage.Literals.TYPE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef getTypeDef()
  {
    return typeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeDef(TypeDef newTypeDef, NotificationChain msgs)
  {
    TypeDef oldTypeDef = typeDef;
    typeDef = newTypeDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.TYPE_DECLARATION__TYPE_DEF, oldTypeDef, newTypeDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeDef(TypeDef newTypeDef)
  {
    if (newTypeDef != typeDef)
    {
      NotificationChain msgs = null;
      if (typeDef != null)
        msgs = ((InternalEObject)typeDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.TYPE_DECLARATION__TYPE_DEF, null, msgs);
      if (newTypeDef != null)
        msgs = ((InternalEObject)newTypeDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.TYPE_DECLARATION__TYPE_DEF, null, msgs);
      msgs = basicSetTypeDef(newTypeDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.TYPE_DECLARATION__TYPE_DEF, newTypeDef, newTypeDef));
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
      case SalPackage.TYPE_DECLARATION__TYPE_DEF:
        return basicSetTypeDef(null, msgs);
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
      case SalPackage.TYPE_DECLARATION__TYPE_DEF:
        return getTypeDef();
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
      case SalPackage.TYPE_DECLARATION__TYPE_DEF:
        setTypeDef((TypeDef)newValue);
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
      case SalPackage.TYPE_DECLARATION__TYPE_DEF:
        setTypeDef((TypeDef)null);
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
      case SalPackage.TYPE_DECLARATION__TYPE_DEF:
        return typeDef != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeDeclarationImpl
