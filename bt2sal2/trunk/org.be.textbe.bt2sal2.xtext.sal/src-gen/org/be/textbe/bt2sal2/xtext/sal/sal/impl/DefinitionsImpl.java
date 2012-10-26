/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import java.util.Collection;

import org.be.textbe.bt2sal2.xtext.sal.sal.Definition;
import org.be.textbe.bt2sal2.xtext.sal.sal.Definitions;
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
 * An implementation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefinitionsImpl#getFirstDefinition <em>First Definition</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefinitionsImpl#getNextDefinition <em>Next Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionsImpl extends MinimalEObjectImpl.Container implements Definitions
{
  /**
   * The cached value of the '{@link #getFirstDefinition() <em>First Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstDefinition()
   * @generated
   * @ordered
   */
  protected Definition firstDefinition;

  /**
   * The cached value of the '{@link #getNextDefinition() <em>Next Definition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextDefinition()
   * @generated
   * @ordered
   */
  protected EList<Definition> nextDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionsImpl()
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
    return SalPackage.Literals.DEFINITIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition getFirstDefinition()
  {
    return firstDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstDefinition(Definition newFirstDefinition, NotificationChain msgs)
  {
    Definition oldFirstDefinition = firstDefinition;
    firstDefinition = newFirstDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SalPackage.DEFINITIONS__FIRST_DEFINITION, oldFirstDefinition, newFirstDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstDefinition(Definition newFirstDefinition)
  {
    if (newFirstDefinition != firstDefinition)
    {
      NotificationChain msgs = null;
      if (firstDefinition != null)
        msgs = ((InternalEObject)firstDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SalPackage.DEFINITIONS__FIRST_DEFINITION, null, msgs);
      if (newFirstDefinition != null)
        msgs = ((InternalEObject)newFirstDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SalPackage.DEFINITIONS__FIRST_DEFINITION, null, msgs);
      msgs = basicSetFirstDefinition(newFirstDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SalPackage.DEFINITIONS__FIRST_DEFINITION, newFirstDefinition, newFirstDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Definition> getNextDefinition()
  {
    if (nextDefinition == null)
    {
      nextDefinition = new EObjectContainmentEList<Definition>(Definition.class, this, SalPackage.DEFINITIONS__NEXT_DEFINITION);
    }
    return nextDefinition;
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
      case SalPackage.DEFINITIONS__FIRST_DEFINITION:
        return basicSetFirstDefinition(null, msgs);
      case SalPackage.DEFINITIONS__NEXT_DEFINITION:
        return ((InternalEList<?>)getNextDefinition()).basicRemove(otherEnd, msgs);
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
      case SalPackage.DEFINITIONS__FIRST_DEFINITION:
        return getFirstDefinition();
      case SalPackage.DEFINITIONS__NEXT_DEFINITION:
        return getNextDefinition();
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
      case SalPackage.DEFINITIONS__FIRST_DEFINITION:
        setFirstDefinition((Definition)newValue);
        return;
      case SalPackage.DEFINITIONS__NEXT_DEFINITION:
        getNextDefinition().clear();
        getNextDefinition().addAll((Collection<? extends Definition>)newValue);
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
      case SalPackage.DEFINITIONS__FIRST_DEFINITION:
        setFirstDefinition((Definition)null);
        return;
      case SalPackage.DEFINITIONS__NEXT_DEFINITION:
        getNextDefinition().clear();
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
      case SalPackage.DEFINITIONS__FIRST_DEFINITION:
        return firstDefinition != null;
      case SalPackage.DEFINITIONS__NEXT_DEFINITION:
        return nextDefinition != null && !nextDefinition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DefinitionsImpl
