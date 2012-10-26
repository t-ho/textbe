/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import java.util.Collection;

import org.be.textbe.bt2sal2.xtext.sal.sal.Argument;
import org.be.textbe.bt2sal2.xtext.sal.sal.Expression;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;

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
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ArgumentImpl#getFirstExpression <em>First Expression</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ArgumentImpl#getNextExpression <em>Next Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends MinimalEObjectImpl.Container implements Argument
{
  /**
   * The cached value of the '{@link #getFirstExpression() <em>First Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstExpression()
   * @generated
   * @ordered
   */
  protected Expression firstExpression;

  /**
   * The cached value of the '{@link #getNextExpression() <em>Next Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextExpression()
   * @generated
   * @ordered
   */
  protected EList<Expression> nextExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArgumentImpl()
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
    return SalPackage.Literals.ARGUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getFirstExpression()
  {
    return firstExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstExpression(Expression newFirstExpression, NotificationChain msgs)
  {
    Expression oldFirstExpression = firstExpression;
    firstExpression = newFirstExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.ARGUMENT__FIRST_EXPRESSION, oldFirstExpression, newFirstExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstExpression(Expression newFirstExpression)
  {
    if (newFirstExpression != firstExpression)
    {
      NotificationChain msgs = null;
      if (firstExpression != null)
        msgs = ((InternalEObject)firstExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.ARGUMENT__FIRST_EXPRESSION, null, msgs);
      if (newFirstExpression != null)
        msgs = ((InternalEObject)newFirstExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.ARGUMENT__FIRST_EXPRESSION, null, msgs);
      msgs = basicSetFirstExpression(newFirstExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.ARGUMENT__FIRST_EXPRESSION, newFirstExpression, newFirstExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getNextExpression()
  {
    if (nextExpression == null)
    {
      nextExpression = new EObjectContainmentEList<Expression>(Expression.class, this, SalPackage.ARGUMENT__NEXT_EXPRESSION);
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
      case SalPackage.ARGUMENT__FIRST_EXPRESSION:
        return basicSetFirstExpression(null, msgs);
      case SalPackage.ARGUMENT__NEXT_EXPRESSION:
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
      case SalPackage.ARGUMENT__FIRST_EXPRESSION:
        return getFirstExpression();
      case SalPackage.ARGUMENT__NEXT_EXPRESSION:
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
      case SalPackage.ARGUMENT__FIRST_EXPRESSION:
        setFirstExpression((Expression)newValue);
        return;
      case SalPackage.ARGUMENT__NEXT_EXPRESSION:
        getNextExpression().clear();
        getNextExpression().addAll((Collection<? extends Expression>)newValue);
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
      case SalPackage.ARGUMENT__FIRST_EXPRESSION:
        setFirstExpression((Expression)null);
        return;
      case SalPackage.ARGUMENT__NEXT_EXPRESSION:
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
      case SalPackage.ARGUMENT__FIRST_EXPRESSION:
        return firstExpression != null;
      case SalPackage.ARGUMENT__NEXT_EXPRESSION:
        return nextExpression != null && !nextExpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArgumentImpl
