/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.v1.textbt.impl;

import java.util.Collection;

import org.be.textbe.bt.v1.textbt.TextbtPackage;
import org.be.textbe.bt.v1.textbt.Why;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Why</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.v1.textbt.impl.WhyImpl#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhyImpl extends FreeTextRelationImpl implements Why
{
  /**
   * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReason()
   * @generated
   * @ordered
   */
  protected EList<String> reason;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhyImpl()
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
    return TextbtPackage.Literals.WHY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getReason()
  {
    if (reason == null)
    {
      reason = new EDataTypeUniqueEList<String>(String.class, this, TextbtPackage.WHY__REASON);
    }
    return reason;
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
      case TextbtPackage.WHY__REASON:
        return getReason();
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
      case TextbtPackage.WHY__REASON:
        getReason().clear();
        getReason().addAll((Collection<? extends String>)newValue);
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
      case TextbtPackage.WHY__REASON:
        getReason().clear();
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
      case TextbtPackage.WHY__REASON:
        return reason != null && !reason.isEmpty();
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
    result.append(" (reason: ");
    result.append(reason);
    result.append(')');
    return result.toString();
  }

} //WhyImpl
