/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.impl;

import java.util.Collection;

import org.be.textbe.bt.textbt.Behavior;
import org.be.textbe.bt.textbt.Component;
import org.be.textbe.bt.textbt.Relation;
import org.be.textbe.bt.textbt.TextbtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Behavior</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.impl.BehaviorImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.impl.BehaviorImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.impl.BehaviorImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaviorImpl extends EObjectImpl implements Behavior {
	/**
   * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
	protected int number = NUMBER_EDEFAULT;

	/**
   * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getRelations()
   * @generated
   * @ordered
   */
	protected EList<Relation> relations;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected BehaviorImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return TextbtPackage.Literals.BEHAVIOR;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public int getNumber() {
    return number;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public void setNumber(int newNumber) {
    int oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextbtPackage.BEHAVIOR__NUMBER, oldNumber, number));
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EList<Relation> getRelations() {
    if (relations == null)
    {
      relations = new EObjectContainmentEList<Relation>(Relation.class, this, TextbtPackage.BEHAVIOR__RELATIONS);
    }
    return relations;
  }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getId() {
		return ((Component) eContainer()).getId() + "_" + getNumber();
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case TextbtPackage.BEHAVIOR__RELATIONS:
        return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case TextbtPackage.BEHAVIOR__NUMBER:
        return getNumber();
      case TextbtPackage.BEHAVIOR__RELATIONS:
        return getRelations();
      case TextbtPackage.BEHAVIOR__ID:
        return getId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case TextbtPackage.BEHAVIOR__NUMBER:
        setNumber((Integer)newValue);
        return;
      case TextbtPackage.BEHAVIOR__RELATIONS:
        getRelations().clear();
        getRelations().addAll((Collection<? extends Relation>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case TextbtPackage.BEHAVIOR__NUMBER:
        setNumber(NUMBER_EDEFAULT);
        return;
      case TextbtPackage.BEHAVIOR__RELATIONS:
        getRelations().clear();
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case TextbtPackage.BEHAVIOR__NUMBER:
        return number != NUMBER_EDEFAULT;
      case TextbtPackage.BEHAVIOR__RELATIONS:
        return relations != null && !relations.isEmpty();
      case TextbtPackage.BEHAVIOR__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (number: ");
    result.append(number);
    result.append(", id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} // BehaviorImpl
