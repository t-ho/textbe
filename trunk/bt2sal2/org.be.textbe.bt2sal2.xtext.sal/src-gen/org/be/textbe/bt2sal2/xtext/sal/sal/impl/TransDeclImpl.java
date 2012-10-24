/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import java.util.Collection;

import org.be.textbe.bt2sal2.xtext.sal.sal.DefinitionOrCommand;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;
import org.be.textbe.bt2sal2.xtext.sal.sal.TransDecl;

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
 * An implementation of the model object '<em><b>Trans Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.TransDeclImpl#getFirstDefinitionOrCommand <em>First Definition Or Command</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.TransDeclImpl#getNextDefinitionOrCommand <em>Next Definition Or Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransDeclImpl extends BaseDeclarationImpl implements TransDecl
{
  /**
   * The cached value of the '{@link #getFirstDefinitionOrCommand() <em>First Definition Or Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstDefinitionOrCommand()
   * @generated
   * @ordered
   */
  protected DefinitionOrCommand firstDefinitionOrCommand;

  /**
   * The cached value of the '{@link #getNextDefinitionOrCommand() <em>Next Definition Or Command</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextDefinitionOrCommand()
   * @generated
   * @ordered
   */
  protected EList<DefinitionOrCommand> nextDefinitionOrCommand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransDeclImpl()
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
    return SalPackage.Literals.TRANS_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionOrCommand getFirstDefinitionOrCommand()
  {
    return firstDefinitionOrCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstDefinitionOrCommand(DefinitionOrCommand newFirstDefinitionOrCommand, NotificationChain msgs)
  {
    DefinitionOrCommand oldFirstDefinitionOrCommand = firstDefinitionOrCommand;
    firstDefinitionOrCommand = newFirstDefinitionOrCommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.TRANS_DECL__FIRST_DEFINITION_OR_COMMAND, oldFirstDefinitionOrCommand, newFirstDefinitionOrCommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstDefinitionOrCommand(DefinitionOrCommand newFirstDefinitionOrCommand)
  {
    if (newFirstDefinitionOrCommand != firstDefinitionOrCommand)
    {
      NotificationChain msgs = null;
      if (firstDefinitionOrCommand != null)
        msgs = ((InternalEObject)firstDefinitionOrCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.TRANS_DECL__FIRST_DEFINITION_OR_COMMAND, null, msgs);
      if (newFirstDefinitionOrCommand != null)
        msgs = ((InternalEObject)newFirstDefinitionOrCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.TRANS_DECL__FIRST_DEFINITION_OR_COMMAND, null, msgs);
      msgs = basicSetFirstDefinitionOrCommand(newFirstDefinitionOrCommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.TRANS_DECL__FIRST_DEFINITION_OR_COMMAND, newFirstDefinitionOrCommand, newFirstDefinitionOrCommand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefinitionOrCommand> getNextDefinitionOrCommand()
  {
    if (nextDefinitionOrCommand == null)
    {
      nextDefinitionOrCommand = new EObjectContainmentEList<DefinitionOrCommand>(DefinitionOrCommand.class, this, SalPackage.TRANS_DECL__NEXT_DEFINITION_OR_COMMAND);
    }
    return nextDefinitionOrCommand;
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
      case SalPackage.TRANS_DECL__FIRST_DEFINITION_OR_COMMAND:
        return basicSetFirstDefinitionOrCommand(null, msgs);
      case SalPackage.TRANS_DECL__NEXT_DEFINITION_OR_COMMAND:
        return ((InternalEList<?>)getNextDefinitionOrCommand()).basicRemove(otherEnd, msgs);
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
      case SalPackage.TRANS_DECL__FIRST_DEFINITION_OR_COMMAND:
        return getFirstDefinitionOrCommand();
      case SalPackage.TRANS_DECL__NEXT_DEFINITION_OR_COMMAND:
        return getNextDefinitionOrCommand();
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
      case SalPackage.TRANS_DECL__FIRST_DEFINITION_OR_COMMAND:
        setFirstDefinitionOrCommand((DefinitionOrCommand)newValue);
        return;
      case SalPackage.TRANS_DECL__NEXT_DEFINITION_OR_COMMAND:
        getNextDefinitionOrCommand().clear();
        getNextDefinitionOrCommand().addAll((Collection<? extends DefinitionOrCommand>)newValue);
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
      case SalPackage.TRANS_DECL__FIRST_DEFINITION_OR_COMMAND:
        setFirstDefinitionOrCommand((DefinitionOrCommand)null);
        return;
      case SalPackage.TRANS_DECL__NEXT_DEFINITION_OR_COMMAND:
        getNextDefinitionOrCommand().clear();
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
      case SalPackage.TRANS_DECL__FIRST_DEFINITION_OR_COMMAND:
        return firstDefinitionOrCommand != null;
      case SalPackage.TRANS_DECL__NEXT_DEFINITION_OR_COMMAND:
        return nextDefinitionOrCommand != null && !nextDefinitionOrCommand.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TransDeclImpl
