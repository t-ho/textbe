/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import java.util.Collection;

import org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;
import org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommand;
import org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Some Commands</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.SomeCommandsImpl#getFirstSomeCommand <em>First Some Command</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.SomeCommandsImpl#getNextSomeCommand <em>Next Some Command</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.SomeCommandsImpl#getElseCommand <em>Else Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SomeCommandsImpl extends DefinitionOrCommandImpl implements SomeCommands
{
  /**
   * The cached value of the '{@link #getFirstSomeCommand() <em>First Some Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstSomeCommand()
   * @generated
   * @ordered
   */
  protected SomeCommand firstSomeCommand;

  /**
   * The cached value of the '{@link #getNextSomeCommand() <em>Next Some Command</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextSomeCommand()
   * @generated
   * @ordered
   */
  protected EList<SomeCommand> nextSomeCommand;

  /**
   * The cached value of the '{@link #getElseCommand() <em>Else Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseCommand()
   * @generated
   * @ordered
   */
  protected ElseCommand elseCommand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SomeCommandsImpl()
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
    return SalPackage.Literals.SOME_COMMANDS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomeCommand getFirstSomeCommand()
  {
    return firstSomeCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstSomeCommand(SomeCommand newFirstSomeCommand, NotificationChain msgs)
  {
    SomeCommand oldFirstSomeCommand = firstSomeCommand;
    firstSomeCommand = newFirstSomeCommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.SOME_COMMANDS__FIRST_SOME_COMMAND, oldFirstSomeCommand, newFirstSomeCommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstSomeCommand(SomeCommand newFirstSomeCommand)
  {
    if (newFirstSomeCommand != firstSomeCommand)
    {
      NotificationChain msgs = null;
      if (firstSomeCommand != null)
        msgs = ((InternalEObject)firstSomeCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.SOME_COMMANDS__FIRST_SOME_COMMAND, null, msgs);
      if (newFirstSomeCommand != null)
        msgs = ((InternalEObject)newFirstSomeCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.SOME_COMMANDS__FIRST_SOME_COMMAND, null, msgs);
      msgs = basicSetFirstSomeCommand(newFirstSomeCommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.SOME_COMMANDS__FIRST_SOME_COMMAND, newFirstSomeCommand, newFirstSomeCommand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SomeCommand> getNextSomeCommand()
  {
    if (nextSomeCommand == null)
    {
      nextSomeCommand = new EObjectContainmentEList<SomeCommand>(SomeCommand.class, this, SalPackage.SOME_COMMANDS__NEXT_SOME_COMMAND);
    }
    return nextSomeCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseCommand getElseCommand()
  {
    return elseCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseCommand(ElseCommand newElseCommand, NotificationChain msgs)
  {
    ElseCommand oldElseCommand = elseCommand;
    elseCommand = newElseCommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.SOME_COMMANDS__ELSE_COMMAND, oldElseCommand, newElseCommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseCommand(ElseCommand newElseCommand)
  {
    if (newElseCommand != elseCommand)
    {
      NotificationChain msgs = null;
      if (elseCommand != null)
        msgs = ((InternalEObject)elseCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.SOME_COMMANDS__ELSE_COMMAND, null, msgs);
      if (newElseCommand != null)
        msgs = ((InternalEObject)newElseCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.SOME_COMMANDS__ELSE_COMMAND, null, msgs);
      msgs = basicSetElseCommand(newElseCommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.SOME_COMMANDS__ELSE_COMMAND, newElseCommand, newElseCommand));
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
      case SalPackage.SOME_COMMANDS__FIRST_SOME_COMMAND:
        return basicSetFirstSomeCommand(null, msgs);
      case SalPackage.SOME_COMMANDS__NEXT_SOME_COMMAND:
        return ((InternalEList<?>)getNextSomeCommand()).basicRemove(otherEnd, msgs);
      case SalPackage.SOME_COMMANDS__ELSE_COMMAND:
        return basicSetElseCommand(null, msgs);
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
      case SalPackage.SOME_COMMANDS__FIRST_SOME_COMMAND:
        return getFirstSomeCommand();
      case SalPackage.SOME_COMMANDS__NEXT_SOME_COMMAND:
        return getNextSomeCommand();
      case SalPackage.SOME_COMMANDS__ELSE_COMMAND:
        return getElseCommand();
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
      case SalPackage.SOME_COMMANDS__FIRST_SOME_COMMAND:
        setFirstSomeCommand((SomeCommand)newValue);
        return;
      case SalPackage.SOME_COMMANDS__NEXT_SOME_COMMAND:
        getNextSomeCommand().clear();
        getNextSomeCommand().addAll((Collection<? extends SomeCommand>)newValue);
        return;
      case SalPackage.SOME_COMMANDS__ELSE_COMMAND:
        setElseCommand((ElseCommand)newValue);
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
      case SalPackage.SOME_COMMANDS__FIRST_SOME_COMMAND:
        setFirstSomeCommand((SomeCommand)null);
        return;
      case SalPackage.SOME_COMMANDS__NEXT_SOME_COMMAND:
        getNextSomeCommand().clear();
        return;
      case SalPackage.SOME_COMMANDS__ELSE_COMMAND:
        setElseCommand((ElseCommand)null);
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
      case SalPackage.SOME_COMMANDS__FIRST_SOME_COMMAND:
        return firstSomeCommand != null;
      case SalPackage.SOME_COMMANDS__NEXT_SOME_COMMAND:
        return nextSomeCommand != null && !nextSomeCommand.isEmpty();
      case SalPackage.SOME_COMMANDS__ELSE_COMMAND:
        return elseCommand != null;
    }
    return super.eIsSet(featureID);
  }

} //SomeCommandsImpl
