/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand;
import org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.NamedCommandImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.NamedCommandImpl#getGuardedCommand <em>Guarded Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedCommandImpl extends SomeCommandImpl implements NamedCommand
{
  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getGuardedCommand() <em>Guarded Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuardedCommand()
   * @generated
   * @ordered
   */
  protected GuardedCommand guardedCommand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamedCommandImpl()
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
    return SalPackage.Literals.NAMED_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.NAMED_COMMAND__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuardedCommand getGuardedCommand()
  {
    return guardedCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuardedCommand(GuardedCommand newGuardedCommand, NotificationChain msgs)
  {
    GuardedCommand oldGuardedCommand = guardedCommand;
    guardedCommand = newGuardedCommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.NAMED_COMMAND__GUARDED_COMMAND, oldGuardedCommand, newGuardedCommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuardedCommand(GuardedCommand newGuardedCommand)
  {
    if (newGuardedCommand != guardedCommand)
    {
      NotificationChain msgs = null;
      if (guardedCommand != null)
        msgs = ((InternalEObject)guardedCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.NAMED_COMMAND__GUARDED_COMMAND, null, msgs);
      if (newGuardedCommand != null)
        msgs = ((InternalEObject)newGuardedCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.NAMED_COMMAND__GUARDED_COMMAND, null, msgs);
      msgs = basicSetGuardedCommand(newGuardedCommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.NAMED_COMMAND__GUARDED_COMMAND, newGuardedCommand, newGuardedCommand));
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
      case SalPackage.NAMED_COMMAND__GUARDED_COMMAND:
        return basicSetGuardedCommand(null, msgs);
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
      case SalPackage.NAMED_COMMAND__IDENTIFIER:
        return getIdentifier();
      case SalPackage.NAMED_COMMAND__GUARDED_COMMAND:
        return getGuardedCommand();
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
      case SalPackage.NAMED_COMMAND__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case SalPackage.NAMED_COMMAND__GUARDED_COMMAND:
        setGuardedCommand((GuardedCommand)newValue);
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
      case SalPackage.NAMED_COMMAND__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case SalPackage.NAMED_COMMAND__GUARDED_COMMAND:
        setGuardedCommand((GuardedCommand)null);
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
      case SalPackage.NAMED_COMMAND__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case SalPackage.NAMED_COMMAND__GUARDED_COMMAND:
        return guardedCommand != null;
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //NamedCommandImpl
