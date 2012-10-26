/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import org.be.textbe.bt2sal2.xtext.sal.sal.ActualParameters;
import org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.QualifiedNameImpl#getIdentifier1 <em>Identifier1</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.QualifiedNameImpl#getActualParameters <em>Actual Parameters</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.QualifiedNameImpl#getIdentifier2 <em>Identifier2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualifiedNameImpl extends TypeImpl implements QualifiedName
{
  /**
   * The default value of the '{@link #getIdentifier1() <em>Identifier1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier1()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier1() <em>Identifier1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier1()
   * @generated
   * @ordered
   */
  protected String identifier1 = IDENTIFIER1_EDEFAULT;

  /**
   * The cached value of the '{@link #getActualParameters() <em>Actual Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActualParameters()
   * @generated
   * @ordered
   */
  protected ActualParameters actualParameters;

  /**
   * The default value of the '{@link #getIdentifier2() <em>Identifier2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier2()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier2() <em>Identifier2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier2()
   * @generated
   * @ordered
   */
  protected String identifier2 = IDENTIFIER2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualifiedNameImpl()
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
    return SalPackage.Literals.QUALIFIED_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier1()
  {
    return identifier1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier1(String newIdentifier1)
  {
    String oldIdentifier1 = identifier1;
    identifier1 = newIdentifier1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.QUALIFIED_NAME__IDENTIFIER1, oldIdentifier1, identifier1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualParameters getActualParameters()
  {
    return actualParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActualParameters(ActualParameters newActualParameters, NotificationChain msgs)
  {
    ActualParameters oldActualParameters = actualParameters;
    actualParameters = newActualParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.QUALIFIED_NAME__ACTUAL_PARAMETERS, oldActualParameters, newActualParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActualParameters(ActualParameters newActualParameters)
  {
    if (newActualParameters != actualParameters)
    {
      NotificationChain msgs = null;
      if (actualParameters != null)
        msgs = ((InternalEObject)actualParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.QUALIFIED_NAME__ACTUAL_PARAMETERS, null, msgs);
      if (newActualParameters != null)
        msgs = ((InternalEObject)newActualParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.QUALIFIED_NAME__ACTUAL_PARAMETERS, null, msgs);
      msgs = basicSetActualParameters(newActualParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.QUALIFIED_NAME__ACTUAL_PARAMETERS, newActualParameters, newActualParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier2()
  {
    return identifier2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier2(String newIdentifier2)
  {
    String oldIdentifier2 = identifier2;
    identifier2 = newIdentifier2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.QUALIFIED_NAME__IDENTIFIER2, oldIdentifier2, identifier2));
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
      case SalPackage.QUALIFIED_NAME__ACTUAL_PARAMETERS:
        return basicSetActualParameters(null, msgs);
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
      case SalPackage.QUALIFIED_NAME__IDENTIFIER1:
        return getIdentifier1();
      case SalPackage.QUALIFIED_NAME__ACTUAL_PARAMETERS:
        return getActualParameters();
      case SalPackage.QUALIFIED_NAME__IDENTIFIER2:
        return getIdentifier2();
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
      case SalPackage.QUALIFIED_NAME__IDENTIFIER1:
        setIdentifier1((String)newValue);
        return;
      case SalPackage.QUALIFIED_NAME__ACTUAL_PARAMETERS:
        setActualParameters((ActualParameters)newValue);
        return;
      case SalPackage.QUALIFIED_NAME__IDENTIFIER2:
        setIdentifier2((String)newValue);
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
      case SalPackage.QUALIFIED_NAME__IDENTIFIER1:
        setIdentifier1(IDENTIFIER1_EDEFAULT);
        return;
      case SalPackage.QUALIFIED_NAME__ACTUAL_PARAMETERS:
        setActualParameters((ActualParameters)null);
        return;
      case SalPackage.QUALIFIED_NAME__IDENTIFIER2:
        setIdentifier2(IDENTIFIER2_EDEFAULT);
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
      case SalPackage.QUALIFIED_NAME__IDENTIFIER1:
        return IDENTIFIER1_EDEFAULT == null ? identifier1 != null : !IDENTIFIER1_EDEFAULT.equals(identifier1);
      case SalPackage.QUALIFIED_NAME__ACTUAL_PARAMETERS:
        return actualParameters != null;
      case SalPackage.QUALIFIED_NAME__IDENTIFIER2:
        return IDENTIFIER2_EDEFAULT == null ? identifier2 != null : !IDENTIFIER2_EDEFAULT.equals(identifier2);
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
    result.append(" (identifier1: ");
    result.append(identifier1);
    result.append(", identifier2: ");
    result.append(identifier2);
    result.append(')');
    return result.toString();
  }

} //QualifiedNameImpl
