/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import java.util.Collection;

import org.be.textbe.bt2sal2.xtext.sal.sal.OuterInfixApplication;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outer Infix Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.OuterInfixApplicationImpl#getFirstExpression <em>First Expression</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.OuterInfixApplicationImpl#getNextExpression <em>Next Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OuterInfixApplicationImpl extends ExpressionImpl implements OuterInfixApplication
{
  /**
   * The cached value of the '{@link #getFirstExpression() <em>First Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstExpression()
   * @generated
   * @ordered
   */
  protected EObject firstExpression;

  /**
   * The cached value of the '{@link #getNextExpression() <em>Next Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextExpression()
   * @generated
   * @ordered
   */
  protected EList<EObject> nextExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OuterInfixApplicationImpl()
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
    return SalPackage.Literals.OUTER_INFIX_APPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getFirstExpression()
  {
    return firstExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstExpression(EObject newFirstExpression, NotificationChain msgs)
  {
    EObject oldFirstExpression = firstExpression;
    firstExpression = newFirstExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.OUTER_INFIX_APPLICATION__FIRST_EXPRESSION, oldFirstExpression, newFirstExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstExpression(EObject newFirstExpression)
  {
    if (newFirstExpression != firstExpression)
    {
      NotificationChain msgs = null;
      if (firstExpression != null)
        msgs = ((InternalEObject)firstExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.OUTER_INFIX_APPLICATION__FIRST_EXPRESSION, null, msgs);
      if (newFirstExpression != null)
        msgs = ((InternalEObject)newFirstExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.OUTER_INFIX_APPLICATION__FIRST_EXPRESSION, null, msgs);
      msgs = basicSetFirstExpression(newFirstExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.OUTER_INFIX_APPLICATION__FIRST_EXPRESSION, newFirstExpression, newFirstExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getNextExpression()
  {
    if (nextExpression == null)
    {
      nextExpression = new EObjectContainmentEList<EObject>(EObject.class, this, SalPackage.OUTER_INFIX_APPLICATION__NEXT_EXPRESSION);
    }
    return nextExpression;
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
      case SalPackage.OUTER_INFIX_APPLICATION__FIRST_EXPRESSION:
        return basicSetFirstExpression(null, msgs);
      case SalPackage.OUTER_INFIX_APPLICATION__NEXT_EXPRESSION:
        return ((InternalEList<?>)getNextExpression()).basicRemove(otherEnd, msgs);
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
      case SalPackage.OUTER_INFIX_APPLICATION__FIRST_EXPRESSION:
        return getFirstExpression();
      case SalPackage.OUTER_INFIX_APPLICATION__NEXT_EXPRESSION:
        return getNextExpression();
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
      case SalPackage.OUTER_INFIX_APPLICATION__FIRST_EXPRESSION:
        setFirstExpression((EObject)newValue);
        return;
      case SalPackage.OUTER_INFIX_APPLICATION__NEXT_EXPRESSION:
        getNextExpression().clear();
        getNextExpression().addAll((Collection<? extends EObject>)newValue);
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
      case SalPackage.OUTER_INFIX_APPLICATION__FIRST_EXPRESSION:
        setFirstExpression((EObject)null);
        return;
      case SalPackage.OUTER_INFIX_APPLICATION__NEXT_EXPRESSION:
        getNextExpression().clear();
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
      case SalPackage.OUTER_INFIX_APPLICATION__FIRST_EXPRESSION:
        return firstExpression != null;
      case SalPackage.OUTER_INFIX_APPLICATION__NEXT_EXPRESSION:
        return nextExpression != null && !nextExpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OuterInfixApplicationImpl
