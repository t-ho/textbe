/**
 */
package org.be.textbe.bt.textbt.node.impl;

import org.be.textbe.bt.textbt.branch.Branch;

import org.be.textbe.bt.textbt.node.Node;
import org.be.textbe.bt.textbt.node.NodePackage;

import org.be.textbe.bt.textbt.traceability.TraceabilityLink;
import org.be.textbe.bt.textbt.traceability.TraceabilityPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getSiblings <em>Siblings</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getDescendants <em>Descendants</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getSiblingBranches <em>Sibling Branches</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#isRoot <em>Root</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#isLeaf <em>Leaf</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getTraceability <em>Traceability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROOT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isLeaf() <em>Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getTraceability() <em>Traceability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceability()
	 * @generated
	 * @ordered
	 */
	protected TraceabilityLink traceability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodePackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.NODE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getParent() {
		Node parent = basicGetParent();
		return parent != null && parent.eIsProxy() ? (Node)eResolveProxy((InternalEObject)parent) : parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetParent() {
		// TODO: implement this method to return the 'Parent' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getParents() {
		Node parents = basicGetParents();
		return parents != null && parents.eIsProxy() ? (Node)eResolveProxy((InternalEObject)parents) : parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetParents() {
		// TODO: implement this method to return the 'Parents' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getSiblings() {
		// TODO: implement this method to return the 'Siblings' reference list
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
	public EList<Node> getChildren() {
		// TODO: implement this method to return the 'Children' reference list
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
	public Node getDescendants() {
		Node descendants = basicGetDescendants();
		return descendants != null && descendants.eIsProxy() ? (Node)eResolveProxy((InternalEObject)descendants) : descendants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetDescendants() {
		// TODO: implement this method to return the 'Descendants' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Branch> getSiblingBranches() {
		// TODO: implement this method to return the 'Sibling Branches' reference list
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
	public boolean isRoot() {
		// TODO: implement this method to return the 'Root' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeaf() {
		// TODO: implement this method to return the 'Leaf' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityLink getTraceability() {
		return traceability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraceability(TraceabilityLink newTraceability, NotificationChain msgs) {
		TraceabilityLink oldTraceability = traceability;
		traceability = newTraceability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodePackage.NODE__TRACEABILITY, oldTraceability, newTraceability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceability(TraceabilityLink newTraceability) {
		if (newTraceability != traceability) {
			NotificationChain msgs = null;
			if (traceability != null)
				msgs = ((InternalEObject)traceability).eInverseRemove(this, TraceabilityPackage.TRACEABILITY_LINK__NODE, TraceabilityLink.class, msgs);
			if (newTraceability != null)
				msgs = ((InternalEObject)newTraceability).eInverseAdd(this, TraceabilityPackage.TRACEABILITY_LINK__NODE, TraceabilityLink.class, msgs);
			msgs = basicSetTraceability(newTraceability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.NODE__TRACEABILITY, newTraceability, newTraceability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NodePackage.NODE__TRACEABILITY:
				if (traceability != null)
					msgs = ((InternalEObject)traceability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodePackage.NODE__TRACEABILITY, null, msgs);
				return basicSetTraceability((TraceabilityLink)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NodePackage.NODE__TRACEABILITY:
				return basicSetTraceability(null, msgs);
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
			case NodePackage.NODE__LABEL:
				return getLabel();
			case NodePackage.NODE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case NodePackage.NODE__PARENTS:
				if (resolve) return getParents();
				return basicGetParents();
			case NodePackage.NODE__SIBLINGS:
				return getSiblings();
			case NodePackage.NODE__CHILDREN:
				return getChildren();
			case NodePackage.NODE__DESCENDANTS:
				if (resolve) return getDescendants();
				return basicGetDescendants();
			case NodePackage.NODE__SIBLING_BRANCHES:
				return getSiblingBranches();
			case NodePackage.NODE__ROOT:
				return isRoot();
			case NodePackage.NODE__LEAF:
				return isLeaf();
			case NodePackage.NODE__TRACEABILITY:
				return getTraceability();
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
			case NodePackage.NODE__LABEL:
				setLabel((String)newValue);
				return;
			case NodePackage.NODE__TRACEABILITY:
				setTraceability((TraceabilityLink)newValue);
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
			case NodePackage.NODE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case NodePackage.NODE__TRACEABILITY:
				setTraceability((TraceabilityLink)null);
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
			case NodePackage.NODE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case NodePackage.NODE__PARENT:
				return basicGetParent() != null;
			case NodePackage.NODE__PARENTS:
				return basicGetParents() != null;
			case NodePackage.NODE__SIBLINGS:
				return !getSiblings().isEmpty();
			case NodePackage.NODE__CHILDREN:
				return !getChildren().isEmpty();
			case NodePackage.NODE__DESCENDANTS:
				return basicGetDescendants() != null;
			case NodePackage.NODE__SIBLING_BRANCHES:
				return !getSiblingBranches().isEmpty();
			case NodePackage.NODE__ROOT:
				return isRoot() != ROOT_EDEFAULT;
			case NodePackage.NODE__LEAF:
				return isLeaf() != LEAF_EDEFAULT;
			case NodePackage.NODE__TRACEABILITY:
				return traceability != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
