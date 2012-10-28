/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import java.util.Collection;

import org.be.textbe.bt2sal2.xtext.sal.sal.DefinitionOrCommand;
import org.be.textbe.bt2sal2.xtext.sal.sal.InitDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.InitDeclImpl#getDefinitionOrCommand <em>Definition Or Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitDeclImpl extends BaseDeclarationImpl implements InitDecl
{
  /**
   * The cached value of the '{@link #getDefinitionOrCommand() <em>Definition Or Command</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitionOrCommand()
   * @generated
   * @ordered
   */
  protected EList<DefinitionOrCommand> definitionOrCommand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitDeclImpl()
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
    return SalPackage.Literals.INIT_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefinitionOrCommand> getDefinitionOrCommand()
  {
    if (definitionOrCommand == null)
    {
      definitionOrCommand = new EObjectContainmentEList<DefinitionOrCommand>(DefinitionOrCommand.class, this, SalPackage.INIT_DECL__DEFINITION_OR_COMMAND);
    }
    return definitionOrCommand;
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
      case SalPackage.INIT_DECL__DEFINITION_OR_COMMAND:
        return ((InternalEList<?>)getDefinitionOrCommand()).basicRemove(otherEnd, msgs);
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
      case SalPackage.INIT_DECL__DEFINITION_OR_COMMAND:
        return getDefinitionOrCommand();
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
      case SalPackage.INIT_DECL__DEFINITION_OR_COMMAND:
        getDefinitionOrCommand().clear();
        getDefinitionOrCommand().addAll((Collection<? extends DefinitionOrCommand>)newValue);
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
      case SalPackage.INIT_DECL__DEFINITION_OR_COMMAND:
        getDefinitionOrCommand().clear();
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
      case SalPackage.INIT_DECL__DEFINITION_OR_COMMAND:
        return definitionOrCommand != null && !definitionOrCommand.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InitDeclImpl
