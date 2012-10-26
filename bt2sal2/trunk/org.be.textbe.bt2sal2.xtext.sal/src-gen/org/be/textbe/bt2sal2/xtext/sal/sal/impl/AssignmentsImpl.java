/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import java.util.Collection;

import org.be.textbe.bt2sal2.xtext.sal.sal.Assignments;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;
import org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition;

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
 * An implementation of the model object '<em><b>Assignments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.AssignmentsImpl#getFirstSimpleDefinition <em>First Simple Definition</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.AssignmentsImpl#getNextSimpleDefinition <em>Next Simple Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentsImpl extends MinimalEObjectImpl.Container implements Assignments
{
  /**
   * The cached value of the '{@link #getFirstSimpleDefinition() <em>First Simple Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstSimpleDefinition()
   * @generated
   * @ordered
   */
  protected SimpleDefinition firstSimpleDefinition;

  /**
   * The cached value of the '{@link #getNextSimpleDefinition() <em>Next Simple Definition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextSimpleDefinition()
   * @generated
   * @ordered
   */
  protected EList<SimpleDefinition> nextSimpleDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentsImpl()
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
    return SalPackage.Literals.ASSIGNMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleDefinition getFirstSimpleDefinition()
  {
    return firstSimpleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstSimpleDefinition(SimpleDefinition newFirstSimpleDefinition, NotificationChain msgs)
  {
    SimpleDefinition oldFirstSimpleDefinition = firstSimpleDefinition;
    firstSimpleDefinition = newFirstSimpleDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.ASSIGNMENTS__FIRST_SIMPLE_DEFINITION, oldFirstSimpleDefinition, newFirstSimpleDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstSimpleDefinition(SimpleDefinition newFirstSimpleDefinition)
  {
    if (newFirstSimpleDefinition != firstSimpleDefinition)
    {
      NotificationChain msgs = null;
      if (firstSimpleDefinition != null)
        msgs = ((InternalEObject)firstSimpleDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.ASSIGNMENTS__FIRST_SIMPLE_DEFINITION, null, msgs);
      if (newFirstSimpleDefinition != null)
        msgs = ((InternalEObject)newFirstSimpleDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.ASSIGNMENTS__FIRST_SIMPLE_DEFINITION, null, msgs);
      msgs = basicSetFirstSimpleDefinition(newFirstSimpleDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.ASSIGNMENTS__FIRST_SIMPLE_DEFINITION, newFirstSimpleDefinition, newFirstSimpleDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SimpleDefinition> getNextSimpleDefinition()
  {
    if (nextSimpleDefinition == null)
    {
      nextSimpleDefinition = new EObjectContainmentEList<SimpleDefinition>(SimpleDefinition.class, this, SalPackage.ASSIGNMENTS__NEXT_SIMPLE_DEFINITION);
    }
    return nextSimpleDefinition;
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
      case SalPackage.ASSIGNMENTS__FIRST_SIMPLE_DEFINITION:
        return basicSetFirstSimpleDefinition(null, msgs);
      case SalPackage.ASSIGNMENTS__NEXT_SIMPLE_DEFINITION:
        return ((InternalEList<?>)getNextSimpleDefinition()).basicRemove(otherEnd, msgs);
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
      case SalPackage.ASSIGNMENTS__FIRST_SIMPLE_DEFINITION:
        return getFirstSimpleDefinition();
      case SalPackage.ASSIGNMENTS__NEXT_SIMPLE_DEFINITION:
        return getNextSimpleDefinition();
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
      case SalPackage.ASSIGNMENTS__FIRST_SIMPLE_DEFINITION:
        setFirstSimpleDefinition((SimpleDefinition)newValue);
        return;
      case SalPackage.ASSIGNMENTS__NEXT_SIMPLE_DEFINITION:
        getNextSimpleDefinition().clear();
        getNextSimpleDefinition().addAll((Collection<? extends SimpleDefinition>)newValue);
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
      case SalPackage.ASSIGNMENTS__FIRST_SIMPLE_DEFINITION:
        setFirstSimpleDefinition((SimpleDefinition)null);
        return;
      case SalPackage.ASSIGNMENTS__NEXT_SIMPLE_DEFINITION:
        getNextSimpleDefinition().clear();
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
      case SalPackage.ASSIGNMENTS__FIRST_SIMPLE_DEFINITION:
        return firstSimpleDefinition != null;
      case SalPackage.ASSIGNMENTS__NEXT_SIMPLE_DEFINITION:
        return nextSimpleDefinition != null && !nextSimpleDefinition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AssignmentsImpl
