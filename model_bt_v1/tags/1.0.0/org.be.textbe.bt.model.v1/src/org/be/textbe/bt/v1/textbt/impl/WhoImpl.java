/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.v1.textbt.impl;

import java.util.Collection;

import org.be.textbe.bt.v1.textbt.TextbtPackage;
import org.be.textbe.bt.v1.textbt.Who;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Who</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.v1.textbt.impl.WhoImpl#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhoImpl extends FreeTextRelationImpl implements Who
{
  /**
   * The cached value of the '{@link #getPerson() <em>Person</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerson()
   * @generated
   * @ordered
   */
  protected EList<String> person;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhoImpl()
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
    return TextbtPackage.Literals.WHO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPerson()
  {
    if (person == null)
    {
      person = new EDataTypeUniqueEList<String>(String.class, this, TextbtPackage.WHO__PERSON);
    }
    return person;
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
      case TextbtPackage.WHO__PERSON:
        return getPerson();
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
      case TextbtPackage.WHO__PERSON:
        getPerson().clear();
        getPerson().addAll((Collection<? extends String>)newValue);
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
      case TextbtPackage.WHO__PERSON:
        getPerson().clear();
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
      case TextbtPackage.WHO__PERSON:
        return person != null && !person.isEmpty();
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
    result.append(" (person: ");
    result.append(person);
    result.append(')');
    return result.toString();
  }

} //WhoImpl
