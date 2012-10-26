/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node;

import org.be.textbe.bt.textbt.branch.Branch;

import org.be.textbe.bt.textbt.node.operation.Operation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getLabel <em>Label</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getParent <em>Parent</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getParents <em>Parents</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getSiblings <em>Siblings</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getChildren <em>Children</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getDescendants <em>Descendants</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getSiblingBranches <em>Sibling Branches</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#isIsRoot <em>Is Root</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#isIsLeaf <em>Is Leaf</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional label for disambiguation, required in case a node with the same component and behaviour appears elsewhere in the tree
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.Node#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(Operation)
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_Operation()
	 * @model containment="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.Node#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The immediate ancestor of this node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Node)
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_Parent()
	 * @model
	 * @generated
	 */
	Node getParent();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.Node#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Node value);

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.node.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nodes which appear in a direct line between this node and the root node of the tree
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_Parents()
	 * @model
	 * @generated
	 */
	EList<Node> getParents();

	/**
	 * Returns the value of the '<em><b>Siblings</b></em>' reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.node.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nodes which share the same parent as this node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Siblings</em>' reference list.
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_Siblings()
	 * @model
	 * @generated
	 */
	EList<Node> getSiblings();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.node.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nodes immediately below this node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_Children()
	 * @model
	 * @generated
	 */
	EList<Node> getChildren();

	/**
	 * Returns the value of the '<em><b>Descendants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any node appearing anywhere below this node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descendants</em>' reference.
	 * @see #setDescendants(Node)
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_Descendants()
	 * @model
	 * @generated
	 */
	Node getDescendants();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.Node#getDescendants <em>Descendants</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descendants</em>' reference.
	 * @see #getDescendants()
	 * @generated
	 */
	void setDescendants(Node value);

	/**
	 * Returns the value of the '<em><b>Sibling Branches</b></em>' reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.branch.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trees with a sibling node as their root
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sibling Branches</em>' reference list.
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_SiblingBranches()
	 * @model
	 * @generated
	 */
	EList<Branch> getSiblingBranches();

	/**
	 * Returns the value of the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Root</em>' attribute.
	 * @see #setIsRoot(boolean)
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_IsRoot()
	 * @model
	 * @generated
	 */
	boolean isIsRoot();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.Node#isIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Root</em>' attribute.
	 * @see #isIsRoot()
	 * @generated
	 */
	void setIsRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The node is a leaf
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Leaf</em>' attribute.
	 * @see #setIsLeaf(boolean)
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_IsLeaf()
	 * @model
	 * @generated
	 */
	boolean isIsLeaf();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.Node#isIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #isIsLeaf()
	 * @generated
	 */
	void setIsLeaf(boolean value);

} // Node
