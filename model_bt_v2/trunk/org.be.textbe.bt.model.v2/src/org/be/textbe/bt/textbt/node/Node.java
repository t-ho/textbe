/**
 */
package org.be.textbe.bt.textbt.node;

import org.be.textbe.bt.textbt.branch.Branch;

import org.be.textbe.bt.textbt.traceability.TraceabilityLink;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A location in a behavior tree, represented by a box with two compartments.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getLabel <em>Label</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getParent <em>Parent</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getParents <em>Parents</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getSiblings <em>Siblings</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getChildren <em>Children</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getDescendants <em>Descendants</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getSiblingBranches <em>Sibling Branches</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#isRoot <em>Root</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#isLeaf <em>Leaf</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.Node#getTraceability <em>Traceability</em>}</li>
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
	 * An optional label for disambiguation, required in case a node with the same component and behavior appears elsewhere in the tree.
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
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The immediate ancestor of this node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_Parent()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Node getParent();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nodes which appear in a direct line between this node and the root node of the tree
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parents</em>' reference.
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_Parents()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Node getParents();

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
	 * @model changeable="false" volatile="true" derived="true"
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
	 * @model changeable="false" volatile="true" derived="true"
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
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_Descendants()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Node getDescendants();

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
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Branch> getSiblingBranches();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The node is the specification root
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_Root()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isRoot();

	/**
	 * Returns the value of the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The node is a leaf
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leaf</em>' attribute.
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_Leaf()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isLeaf();

	/**
	 * Returns the value of the '<em><b>Traceability</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.be.textbe.bt.textbt.traceability.TraceabilityLink#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The link of this node to its defining requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traceability</em>' containment reference.
	 * @see #setTraceability(TraceabilityLink)
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getNode_Traceability()
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityLink#getNode
	 * @model opposite="node" containment="true" required="true"
	 * @generated
	 */
	TraceabilityLink getTraceability();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.Node#getTraceability <em>Traceability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traceability</em>' containment reference.
	 * @see #getTraceability()
	 * @generated
	 */
	void setTraceability(TraceabilityLink value);

} // Node
