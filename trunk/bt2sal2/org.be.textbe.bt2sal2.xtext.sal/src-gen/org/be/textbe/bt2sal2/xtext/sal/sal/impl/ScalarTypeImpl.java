/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import java.util.Collection;

import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;
import org.be.textbe.bt2sal2.xtext.sal.sal.ScalarType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scalar Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ScalarTypeImpl#getFirstType <em>First Type</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ScalarTypeImpl#getNextType <em>Next Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScalarTypeImpl extends TypeDefImpl implements ScalarType
{
  /**
   * The default value of the '{@link #getFirstType() <em>First Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstType()
   * @generated
   * @ordered
   */
  protected static final String FIRST_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstType() <em>First Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstType()
   * @generated
   * @ordered
   */
  protected String firstType = FIRST_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getNextType() <em>Next Type</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextType()
   * @generated
   * @ordered
   */
  protected EList<String> nextType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScalarTypeImpl()
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
    return SalPackage.Literals.SCALAR_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstType()
  {
    return firstType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstType(String newFirstType)
  {
    String oldFirstType = firstType;
    firstType = newFirstType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.SCALAR_TYPE__FIRST_TYPE, oldFirstType, firstType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNextType()
  {
    if (nextType == null)
    {
      nextType = new EDataTypeEList<String>(String.class, this, SalPackage.SCALAR_TYPE__NEXT_TYPE);
    }
    return nextType;
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
      case SalPackage.SCALAR_TYPE__FIRST_TYPE:
        return getFirstType();
      case SalPackage.SCALAR_TYPE__NEXT_TYPE:
        return getNextType();
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
      case SalPackage.SCALAR_TYPE__FIRST_TYPE:
        setFirstType((String)newValue);
        return;
      case SalPackage.SCALAR_TYPE__NEXT_TYPE:
        getNextType().clear();
        getNextType().addAll((Collection<? extends String>)newValue);
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
      case SalPackage.SCALAR_TYPE__FIRST_TYPE:
        setFirstType(FIRST_TYPE_EDEFAULT);
        return;
      case SalPackage.SCALAR_TYPE__NEXT_TYPE:
        getNextType().clear();
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
      case SalPackage.SCALAR_TYPE__FIRST_TYPE:
        return FIRST_TYPE_EDEFAULT == null ? firstType != null : !FIRST_TYPE_EDEFAULT.equals(firstType);
      case SalPackage.SCALAR_TYPE__NEXT_TYPE:
        return nextType != null && !nextType.isEmpty();
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
    result.append(" (firstType: ");
    result.append(firstType);
    result.append(", nextType: ");
    result.append(nextType);
    result.append(')');
    return result.toString();
  }

} //ScalarTypeImpl
