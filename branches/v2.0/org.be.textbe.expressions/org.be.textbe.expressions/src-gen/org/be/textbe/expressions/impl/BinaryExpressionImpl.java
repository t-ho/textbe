/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions.impl;

import org.be.textbe.expressions.BinaryExpression;
import org.be.textbe.expressions.BinaryOperator;
import org.be.textbe.expressions.ExpressionsPackage;
import org.be.textbe.expressions.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.expressions.impl.BinaryExpressionImpl#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link org.be.textbe.expressions.impl.BinaryExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.be.textbe.expressions.impl.BinaryExpressionImpl#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryExpressionImpl extends MinimalEObjectImpl.Container implements BinaryExpression
{
  /**
   * The cached value of the '{@link #getLeftExpression() <em>Left Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftExpression()
   * @generated
   * @ordered
   */
  protected Value leftExpression;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final BinaryOperator OPERATOR_EDEFAULT = BinaryOperator.PLUS;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected BinaryOperator operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightExpression() <em>Right Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightExpression()
   * @generated
   * @ordered
   */
  protected BinaryExpression rightExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BinaryExpressionImpl()
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
    return ExpressionsPackage.Literals.BINARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getLeftExpression()
  {
    return leftExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftExpression(Value newLeftExpression, NotificationChain msgs)
  {
    Value oldLeftExpression = leftExpression;
    leftExpression = newLeftExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.BINARY_EXPRESSION__LEFT_EXPRESSION, oldLeftExpression, newLeftExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftExpression(Value newLeftExpression)
  {
    if (newLeftExpression != leftExpression)
    {
      NotificationChain msgs = null;
      if (leftExpression != null)
        msgs = ((InternalEObject)leftExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.BINARY_EXPRESSION__LEFT_EXPRESSION, null, msgs);
      if (newLeftExpression != null)
        msgs = ((InternalEObject)newLeftExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.BINARY_EXPRESSION__LEFT_EXPRESSION, null, msgs);
      msgs = basicSetLeftExpression(newLeftExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.BINARY_EXPRESSION__LEFT_EXPRESSION, newLeftExpression, newLeftExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(BinaryOperator newOperator)
  {
    BinaryOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.BINARY_EXPRESSION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpression getRightExpression()
  {
    return rightExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightExpression(BinaryExpression newRightExpression, NotificationChain msgs)
  {
    BinaryExpression oldRightExpression = rightExpression;
    rightExpression = newRightExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION, oldRightExpression, newRightExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightExpression(BinaryExpression newRightExpression)
  {
    if (newRightExpression != rightExpression)
    {
      NotificationChain msgs = null;
      if (rightExpression != null)
        msgs = ((InternalEObject)rightExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION, null, msgs);
      if (newRightExpression != null)
        msgs = ((InternalEObject)newRightExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION, null, msgs);
      msgs = basicSetRightExpression(newRightExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION, newRightExpression, newRightExpression));
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
      case ExpressionsPackage.BINARY_EXPRESSION__LEFT_EXPRESSION:
        return basicSetLeftExpression(null, msgs);
      case ExpressionsPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION:
        return basicSetRightExpression(null, msgs);
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
      case ExpressionsPackage.BINARY_EXPRESSION__LEFT_EXPRESSION:
        return getLeftExpression();
      case ExpressionsPackage.BINARY_EXPRESSION__OPERATOR:
        return getOperator();
      case ExpressionsPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION:
        return getRightExpression();
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
      case ExpressionsPackage.BINARY_EXPRESSION__LEFT_EXPRESSION:
        setLeftExpression((Value)newValue);
        return;
      case ExpressionsPackage.BINARY_EXPRESSION__OPERATOR:
        setOperator((BinaryOperator)newValue);
        return;
      case ExpressionsPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION:
        setRightExpression((BinaryExpression)newValue);
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
      case ExpressionsPackage.BINARY_EXPRESSION__LEFT_EXPRESSION:
        setLeftExpression((Value)null);
        return;
      case ExpressionsPackage.BINARY_EXPRESSION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case ExpressionsPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION:
        setRightExpression((BinaryExpression)null);
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
      case ExpressionsPackage.BINARY_EXPRESSION__LEFT_EXPRESSION:
        return leftExpression != null;
      case ExpressionsPackage.BINARY_EXPRESSION__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case ExpressionsPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION:
        return rightExpression != null;
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //BinaryExpressionImpl
