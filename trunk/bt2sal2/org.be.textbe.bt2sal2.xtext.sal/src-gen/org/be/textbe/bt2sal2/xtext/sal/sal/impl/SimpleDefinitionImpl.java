/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import org.be.textbe.bt2sal2.xtext.sal.sal.Lhs;
import org.be.textbe.bt2sal2.xtext.sal.sal.RhsDefinition;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;
import org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.SimpleDefinitionImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.SimpleDefinitionImpl#getRhsDefinition <em>Rhs Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleDefinitionImpl extends DefinitionImpl implements SimpleDefinition
{
  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected Lhs lhs;

  /**
   * The cached value of the '{@link #getRhsDefinition() <em>Rhs Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhsDefinition()
   * @generated
   * @ordered
   */
  protected RhsDefinition rhsDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleDefinitionImpl()
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
    return SalPackage.Literals.SIMPLE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lhs getLhs()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLhs(Lhs newLhs, NotificationChain msgs)
  {
    Lhs oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.SIMPLE_DEFINITION__LHS, oldLhs, newLhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLhs(Lhs newLhs)
  {
    if (newLhs != lhs)
    {
      NotificationChain msgs = null;
      if (lhs != null)
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.SIMPLE_DEFINITION__LHS, null, msgs);
      if (newLhs != null)
        msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.SIMPLE_DEFINITION__LHS, null, msgs);
      msgs = basicSetLhs(newLhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.SIMPLE_DEFINITION__LHS, newLhs, newLhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RhsDefinition getRhsDefinition()
  {
    return rhsDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRhsDefinition(RhsDefinition newRhsDefinition, NotificationChain msgs)
  {
    RhsDefinition oldRhsDefinition = rhsDefinition;
    rhsDefinition = newRhsDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.SIMPLE_DEFINITION__RHS_DEFINITION, oldRhsDefinition, newRhsDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRhsDefinition(RhsDefinition newRhsDefinition)
  {
    if (newRhsDefinition != rhsDefinition)
    {
      NotificationChain msgs = null;
      if (rhsDefinition != null)
        msgs = ((InternalEObject)rhsDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.SIMPLE_DEFINITION__RHS_DEFINITION, null, msgs);
      if (newRhsDefinition != null)
        msgs = ((InternalEObject)newRhsDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.SIMPLE_DEFINITION__RHS_DEFINITION, null, msgs);
      msgs = basicSetRhsDefinition(newRhsDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.SIMPLE_DEFINITION__RHS_DEFINITION, newRhsDefinition, newRhsDefinition));
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
      case SalPackage.SIMPLE_DEFINITION__LHS:
        return basicSetLhs(null, msgs);
      case SalPackage.SIMPLE_DEFINITION__RHS_DEFINITION:
        return basicSetRhsDefinition(null, msgs);
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
      case SalPackage.SIMPLE_DEFINITION__LHS:
        return getLhs();
      case SalPackage.SIMPLE_DEFINITION__RHS_DEFINITION:
        return getRhsDefinition();
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
      case SalPackage.SIMPLE_DEFINITION__LHS:
        setLhs((Lhs)newValue);
        return;
      case SalPackage.SIMPLE_DEFINITION__RHS_DEFINITION:
        setRhsDefinition((RhsDefinition)newValue);
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
      case SalPackage.SIMPLE_DEFINITION__LHS:
        setLhs((Lhs)null);
        return;
      case SalPackage.SIMPLE_DEFINITION__RHS_DEFINITION:
        setRhsDefinition((RhsDefinition)null);
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
      case SalPackage.SIMPLE_DEFINITION__LHS:
        return lhs != null;
      case SalPackage.SIMPLE_DEFINITION__RHS_DEFINITION:
        return rhsDefinition != null;
    }
    return super.eIsSet(featureID);
  }

} //SimpleDefinitionImpl
