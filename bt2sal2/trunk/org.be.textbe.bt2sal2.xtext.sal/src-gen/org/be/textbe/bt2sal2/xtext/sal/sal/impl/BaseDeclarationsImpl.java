/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import java.util.Collection;

import org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclaration;
import org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclarations;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Declarations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.BaseDeclarationsImpl#getBaseDeclaration <em>Base Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseDeclarationsImpl extends BaseModuleImpl implements BaseDeclarations
{
  /**
   * The cached value of the '{@link #getBaseDeclaration() <em>Base Declaration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseDeclaration()
   * @generated
   * @ordered
   */
  protected EList<BaseDeclaration> baseDeclaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BaseDeclarationsImpl()
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
    return SalPackage.Literals.BASE_DECLARATIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BaseDeclaration> getBaseDeclaration()
  {
    if (baseDeclaration == null)
    {
      baseDeclaration = new EObjectContainmentEList<BaseDeclaration>(BaseDeclaration.class, this, SalPackage.BASE_DECLARATIONS__BASE_DECLARATION);
    }
    return baseDeclaration;
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
      case SalPackage.BASE_DECLARATIONS__BASE_DECLARATION:
        return ((InternalEList<?>)getBaseDeclaration()).basicRemove(otherEnd, msgs);
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
      case SalPackage.BASE_DECLARATIONS__BASE_DECLARATION:
        return getBaseDeclaration();
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
      case SalPackage.BASE_DECLARATIONS__BASE_DECLARATION:
        getBaseDeclaration().clear();
        getBaseDeclaration().addAll((Collection<? extends BaseDeclaration>)newValue);
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
      case SalPackage.BASE_DECLARATIONS__BASE_DECLARATION:
        getBaseDeclaration().clear();
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
      case SalPackage.BASE_DECLARATIONS__BASE_DECLARATION:
        return baseDeclaration != null && !baseDeclaration.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BaseDeclarationsImpl
