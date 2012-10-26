/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.impl;

import java.util.Collection;

import org.be.textbe.bt.textbt.branch.Branch;

import org.be.textbe.bt.textbt.node.Node;
import org.be.textbe.bt.textbt.node.NodePackage;

import org.be.textbe.bt.textbt.node.operation.Operation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getSiblings <em>Siblings</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getDescendants <em>Descendants</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#getSiblingBranches <em>Sibling Branches</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#isIsRoot <em>Is Root</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.impl.NodeImpl#isIsLeaf <em>Is Leaf</em>}</li>
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
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Node parent;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> parents;

	/**
	 * The cached value of the '{@link #getSiblings() <em>Siblings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiblings()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> siblings;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> children;

	/**
	 * The cached value of the '{@link #getDescendants() <em>Descendants</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescendants()
	 * @generated
	 * @ordered
	 */
	protected Node descendants;

	/**
	 * The cached value of the '{@link #getSiblingBranches() <em>Sibling Branches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiblingBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<Branch> siblingBranches;

	/**
	 * The default value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean isRoot = IS_ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

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
	public Operation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodePackage.NODE__OPERATION, oldOperation, newOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodePackage.NODE__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodePackage.NODE__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.NODE__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Node)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodePackage.NODE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Node newParent) {
		Node oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.NODE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getParents() {
		if (parents == null) {
			parents = new EObjectResolvingEList<Node>(Node.class, this, NodePackage.NODE__PARENTS);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getSiblings() {
		if (siblings == null) {
			siblings = new EObjectResolvingEList<Node>(Node.class, this, NodePackage.NODE__SIBLINGS);
		}
		return siblings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<Node>(Node.class, this, NodePackage.NODE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getDescendants() {
		if (descendants != null && descendants.eIsProxy()) {
			InternalEObject oldDescendants = (InternalEObject)descendants;
			descendants = (Node)eResolveProxy(oldDescendants);
			if (descendants != oldDescendants) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodePackage.NODE__DESCENDANTS, oldDescendants, descendants));
			}
		}
		return descendants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetDescendants() {
		return descendants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescendants(Node newDescendants) {
		Node oldDescendants = descendants;
		descendants = newDescendants;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.NODE__DESCENDANTS, oldDescendants, descendants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Branch> getSiblingBranches() {
		if (siblingBranches == null) {
			siblingBranches = new EObjectResolvingEList<Branch>(Branch.class, this, NodePackage.NODE__SIBLING_BRANCHES);
		}
		return siblingBranches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRoot() {
		return isRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRoot(boolean newIsRoot) {
		boolean oldIsRoot = isRoot;
		isRoot = newIsRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.NODE__IS_ROOT, oldIsRoot, isRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.NODE__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NodePackage.NODE__OPERATION:
				return basicSetOperation(null, msgs);
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
			case NodePackage.NODE__OPERATION:
				return getOperation();
			case NodePackage.NODE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case NodePackage.NODE__PARENTS:
				return getParents();
			case NodePackage.NODE__SIBLINGS:
				return getSiblings();
			case NodePackage.NODE__CHILDREN:
				return getChildren();
			case NodePackage.NODE__DESCENDANTS:
				if (resolve) return getDescendants();
				return basicGetDescendants();
			case NodePackage.NODE__SIBLING_BRANCHES:
				return getSiblingBranches();
			case NodePackage.NODE__IS_ROOT:
				return isIsRoot();
			case NodePackage.NODE__IS_LEAF:
				return isIsLeaf();
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
			case NodePackage.NODE__LABEL:
				setLabel((String)newValue);
				return;
			case NodePackage.NODE__OPERATION:
				setOperation((Operation)newValue);
				return;
			case NodePackage.NODE__PARENT:
				setParent((Node)newValue);
				return;
			case NodePackage.NODE__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends Node>)newValue);
				return;
			case NodePackage.NODE__SIBLINGS:
				getSiblings().clear();
				getSiblings().addAll((Collection<? extends Node>)newValue);
				return;
			case NodePackage.NODE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Node>)newValue);
				return;
			case NodePackage.NODE__DESCENDANTS:
				setDescendants((Node)newValue);
				return;
			case NodePackage.NODE__SIBLING_BRANCHES:
				getSiblingBranches().clear();
				getSiblingBranches().addAll((Collection<? extends Branch>)newValue);
				return;
			case NodePackage.NODE__IS_ROOT:
				setIsRoot((Boolean)newValue);
				return;
			case NodePackage.NODE__IS_LEAF:
				setIsLeaf((Boolean)newValue);
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
			case NodePackage.NODE__OPERATION:
				setOperation((Operation)null);
				return;
			case NodePackage.NODE__PARENT:
				setParent((Node)null);
				return;
			case NodePackage.NODE__PARENTS:
				getParents().clear();
				return;
			case NodePackage.NODE__SIBLINGS:
				getSiblings().clear();
				return;
			case NodePackage.NODE__CHILDREN:
				getChildren().clear();
				return;
			case NodePackage.NODE__DESCENDANTS:
				setDescendants((Node)null);
				return;
			case NodePackage.NODE__SIBLING_BRANCHES:
				getSiblingBranches().clear();
				return;
			case NodePackage.NODE__IS_ROOT:
				setIsRoot(IS_ROOT_EDEFAULT);
				return;
			case NodePackage.NODE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
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
			case NodePackage.NODE__OPERATION:
				return operation != null;
			case NodePackage.NODE__PARENT:
				return parent != null;
			case NodePackage.NODE__PARENTS:
				return parents != null && !parents.isEmpty();
			case NodePackage.NODE__SIBLINGS:
				return siblings != null && !siblings.isEmpty();
			case NodePackage.NODE__CHILDREN:
				return children != null && !children.isEmpty();
			case NodePackage.NODE__DESCENDANTS:
				return descendants != null;
			case NodePackage.NODE__SIBLING_BRANCHES:
				return siblingBranches != null && !siblingBranches.isEmpty();
			case NodePackage.NODE__IS_ROOT:
				return isRoot != IS_ROOT_EDEFAULT;
			case NodePackage.NODE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
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
		result.append(", isRoot: ");
		result.append(isRoot);
		result.append(", isLeaf: ");
		result.append(isLeaf);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
