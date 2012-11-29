/**
 */
package org.be.textbe.bt.textbt.activity.sequence.impl;

import java.util.Collection;

import org.be.textbe.bt.textbt.BehaviorTree;

import org.be.textbe.bt.textbt.activity.sequence.Sequence;
import org.be.textbe.bt.textbt.activity.sequence.SequencePackage;

import org.be.textbe.bt.textbt.node.OperationNode;

import org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode;

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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.activity.sequence.impl.SequenceImpl#getSubtrees <em>Subtrees</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.activity.sequence.impl.SequenceImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.activity.sequence.impl.SequenceImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.activity.sequence.impl.SequenceImpl#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SequenceImpl extends EObjectImpl implements Sequence {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected BehaviorTree child;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationNode> step;

	/**
	 * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected QuantifyingNode quantifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequencePackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorTree> getSubtrees() {
		// TODO: implement this method to return the 'Subtrees' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTree getChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(BehaviorTree newChild, NotificationChain msgs) {
		BehaviorTree oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SequencePackage.SEQUENCE__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(BehaviorTree newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SequencePackage.SEQUENCE__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SequencePackage.SEQUENCE__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.SEQUENCE__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationNode> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<OperationNode>(OperationNode.class, this, SequencePackage.SEQUENCE__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifyingNode getQuantifier() {
		return quantifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantifier(QuantifyingNode newQuantifier, NotificationChain msgs) {
		QuantifyingNode oldQuantifier = quantifier;
		quantifier = newQuantifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SequencePackage.SEQUENCE__QUANTIFIER, oldQuantifier, newQuantifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantifier(QuantifyingNode newQuantifier) {
		if (newQuantifier != quantifier) {
			NotificationChain msgs = null;
			if (quantifier != null)
				msgs = ((InternalEObject)quantifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SequencePackage.SEQUENCE__QUANTIFIER, null, msgs);
			if (newQuantifier != null)
				msgs = ((InternalEObject)newQuantifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SequencePackage.SEQUENCE__QUANTIFIER, null, msgs);
			msgs = basicSetQuantifier(newQuantifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.SEQUENCE__QUANTIFIER, newQuantifier, newQuantifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequencePackage.SEQUENCE__CHILD:
				return basicSetChild(null, msgs);
			case SequencePackage.SEQUENCE__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case SequencePackage.SEQUENCE__QUANTIFIER:
				return basicSetQuantifier(null, msgs);
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
			case SequencePackage.SEQUENCE__SUBTREES:
				return getSubtrees();
			case SequencePackage.SEQUENCE__CHILD:
				return getChild();
			case SequencePackage.SEQUENCE__STEP:
				return getStep();
			case SequencePackage.SEQUENCE__QUANTIFIER:
				return getQuantifier();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SequencePackage.SEQUENCE__CHILD:
				setChild((BehaviorTree)newValue);
				return;
			case SequencePackage.SEQUENCE__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends OperationNode>)newValue);
				return;
			case SequencePackage.SEQUENCE__QUANTIFIER:
				setQuantifier((QuantifyingNode)newValue);
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
			case SequencePackage.SEQUENCE__CHILD:
				setChild((BehaviorTree)null);
				return;
			case SequencePackage.SEQUENCE__STEP:
				getStep().clear();
				return;
			case SequencePackage.SEQUENCE__QUANTIFIER:
				setQuantifier((QuantifyingNode)null);
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
			case SequencePackage.SEQUENCE__SUBTREES:
				return !getSubtrees().isEmpty();
			case SequencePackage.SEQUENCE__CHILD:
				return child != null;
			case SequencePackage.SEQUENCE__STEP:
				return step != null && !step.isEmpty();
			case SequencePackage.SEQUENCE__QUANTIFIER:
				return quantifier != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceImpl
