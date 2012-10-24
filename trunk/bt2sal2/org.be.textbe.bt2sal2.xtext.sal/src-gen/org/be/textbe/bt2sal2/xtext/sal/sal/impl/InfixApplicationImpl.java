/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import org.be.textbe.bt2sal2.xtext.sal.sal.Expression;
import org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication;
import org.be.textbe.bt2sal2.xtext.sal.sal.NameExpr;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infix Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.InfixApplicationImpl#getFirstExpression <em>First Expression</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.InfixApplicationImpl#getSecondExpression <em>Second Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfixApplicationImpl extends MinimalEObjectImpl.Container implements InfixApplication
{
  /**
   * The cached value of the '{@link #getFirstExpression() <em>First Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstExpression()
   * @generated
   * @ordered
   */
  protected NameExpr firstExpression;

  /**
   * The cached value of the '{@link #getSecondExpression() <em>Second Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondExpression()
   * @generated
   * @ordered
   */
  protected Expression secondExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InfixApplicationImpl()
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
    return SalPackage.Literals.INFIX_APPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameExpr getFirstExpression()
  {
    return firstExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstExpression(NameExpr newFirstExpression, NotificationChain msgs)
  {
    NameExpr oldFirstExpression = firstExpression;
    firstExpression = newFirstExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.INFIX_APPLICATION__FIRST_EXPRESSION, oldFirstExpression, newFirstExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstExpression(NameExpr newFirstExpression)
  {
    if (newFirstExpression != firstExpression)
    {
      NotificationChain msgs = null;
      if (firstExpression != null)
        msgs = ((InternalEObject)firstExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.INFIX_APPLICATION__FIRST_EXPRESSION, null, msgs);
      if (newFirstExpression != null)
        msgs = ((InternalEObject)newFirstExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.INFIX_APPLICATION__FIRST_EXPRESSION, null, msgs);
      msgs = basicSetFirstExpression(newFirstExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.INFIX_APPLICATION__FIRST_EXPRESSION, newFirstExpression, newFirstExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSecondExpression()
  {
    return secondExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondExpression(Expression newSecondExpression, NotificationChain msgs)
  {
    Expression oldSecondExpression = secondExpression;
    secondExpression = newSecondExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.INFIX_APPLICATION__SECOND_EXPRESSION, oldSecondExpression, newSecondExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondExpression(Expression newSecondExpression)
  {
    if (newSecondExpression != secondExpression)
    {
      NotificationChain msgs = null;
      if (secondExpression != null)
        msgs = ((InternalEObject)secondExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.INFIX_APPLICATION__SECOND_EXPRESSION, null, msgs);
      if (newSecondExpression != null)
        msgs = ((InternalEObject)newSecondExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.INFIX_APPLICATION__SECOND_EXPRESSION, null, msgs);
      msgs = basicSetSecondExpression(newSecondExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.INFIX_APPLICATION__SECOND_EXPRESSION, newSecondExpression, newSecondExpression));
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
      case SalPackage.INFIX_APPLICATION__FIRST_EXPRESSION:
        return basicSetFirstExpression(null, msgs);
      case SalPackage.INFIX_APPLICATION__SECOND_EXPRESSION:
        return basicSetSecondExpression(null, msgs);
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
      case SalPackage.INFIX_APPLICATION__FIRST_EXPRESSION:
        return getFirstExpression();
      case SalPackage.INFIX_APPLICATION__SECOND_EXPRESSION:
        return getSecondExpression();
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
      case SalPackage.INFIX_APPLICATION__FIRST_EXPRESSION:
        setFirstExpression((NameExpr)newValue);
        return;
      case SalPackage.INFIX_APPLICATION__SECOND_EXPRESSION:
        setSecondExpression((Expression)newValue);
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
      case SalPackage.INFIX_APPLICATION__FIRST_EXPRESSION:
        setFirstExpression((NameExpr)null);
        return;
      case SalPackage.INFIX_APPLICATION__SECOND_EXPRESSION:
        setSecondExpression((Expression)null);
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
      case SalPackage.INFIX_APPLICATION__FIRST_EXPRESSION:
        return firstExpression != null;
      case SalPackage.INFIX_APPLICATION__SECOND_EXPRESSION:
        return secondExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //InfixApplicationImpl
