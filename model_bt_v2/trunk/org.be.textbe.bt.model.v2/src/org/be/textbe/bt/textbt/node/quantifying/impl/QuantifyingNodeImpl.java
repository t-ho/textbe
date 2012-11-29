/**
 */
package org.be.textbe.bt.textbt.node.quantifying.impl;

import org.be.textbe.bt.textbt.component.Component;

import org.be.textbe.bt.textbt.node.impl.NodeImpl;

import org.be.textbe.bt.textbt.node.quantifying.ComponentSetDefinition;
import org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode;
import org.be.textbe.bt.textbt.node.quantifying.QuantifyingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingNodeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingNodeImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingNodeImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class QuantifyingNodeImpl extends NodeImpl implements QuantifyingNode {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Component variable;

	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected ComponentSetDefinition set;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected ComponentSetDefinition definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantifyingNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuantifyingPackage.Literals.QUANTIFYING_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Component newVariable, NotificationChain msgs) {
		Component oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuantifyingPackage.QUANTIFYING_NODE__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Component newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuantifyingPackage.QUANTIFYING_NODE__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuantifyingPackage.QUANTIFYING_NODE__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuantifyingPackage.QUANTIFYING_NODE__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSetDefinition getSet() {
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSet(ComponentSetDefinition newSet, NotificationChain msgs) {
		ComponentSetDefinition oldSet = set;
		set = newSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuantifyingPackage.QUANTIFYING_NODE__SET, oldSet, newSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(ComponentSetDefinition newSet) {
		if (newSet != set) {
			NotificationChain msgs = null;
			if (set != null)
				msgs = ((InternalEObject)set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuantifyingPackage.QUANTIFYING_NODE__SET, null, msgs);
			if (newSet != null)
				msgs = ((InternalEObject)newSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuantifyingPackage.QUANTIFYING_NODE__SET, null, msgs);
			msgs = basicSetSet(newSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuantifyingPackage.QUANTIFYING_NODE__SET, newSet, newSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSetDefinition getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(ComponentSetDefinition newDefinition, NotificationChain msgs) {
		ComponentSetDefinition oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuantifyingPackage.QUANTIFYING_NODE__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(ComponentSetDefinition newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuantifyingPackage.QUANTIFYING_NODE__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuantifyingPackage.QUANTIFYING_NODE__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuantifyingPackage.QUANTIFYING_NODE__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuantifyingPackage.QUANTIFYING_NODE__VARIABLE:
				return basicSetVariable(null, msgs);
			case QuantifyingPackage.QUANTIFYING_NODE__SET:
				return basicSetSet(null, msgs);
			case QuantifyingPackage.QUANTIFYING_NODE__DEFINITION:
				return basicSetDefinition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuantifyingPackage.QUANTIFYING_NODE__VARIABLE:
				return getVariable();
			case QuantifyingPackage.QUANTIFYING_NODE__SET:
				return getSet();
			case QuantifyingPackage.QUANTIFYING_NODE__DEFINITION:
				return getDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuantifyingPackage.QUANTIFYING_NODE__VARIABLE:
				setVariable((Component)newValue);
				return;
			case QuantifyingPackage.QUANTIFYING_NODE__SET:
				setSet((ComponentSetDefinition)newValue);
				return;
			case QuantifyingPackage.QUANTIFYING_NODE__DEFINITION:
				setDefinition((ComponentSetDefinition)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case QuantifyingPackage.QUANTIFYING_NODE__VARIABLE:
				setVariable((Component)null);
				return;
			case QuantifyingPackage.QUANTIFYING_NODE__SET:
				setSet((ComponentSetDefinition)null);
				return;
			case QuantifyingPackage.QUANTIFYING_NODE__DEFINITION:
				setDefinition((ComponentSetDefinition)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QuantifyingPackage.QUANTIFYING_NODE__VARIABLE:
				return variable != null;
			case QuantifyingPackage.QUANTIFYING_NODE__SET:
				return set != null;
			case QuantifyingPackage.QUANTIFYING_NODE__DEFINITION:
				return definition != null;
		}
		return super.eIsSet(featureID);
	}

} //QuantifyingNodeImpl
