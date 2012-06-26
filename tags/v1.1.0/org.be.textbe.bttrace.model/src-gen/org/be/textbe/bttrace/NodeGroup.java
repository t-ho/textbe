/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bttrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bttrace.NodeGroup#getActiveNode <em>Active Node</em>}</li>
 *   <li>{@link org.be.textbe.bttrace.NodeGroup#getInterleaveNode <em>Interleave Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bttrace.BttracePackage#getNodeGroup()
 * @model
 * @generated
 */
public interface NodeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Active Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Node</em>' containment reference.
	 * @see #setActiveNode(Node)
	 * @see org.be.textbe.bttrace.BttracePackage#getNodeGroup_ActiveNode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Node getActiveNode();

	/**
	 * Sets the value of the '{@link org.be.textbe.bttrace.NodeGroup#getActiveNode <em>Active Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Node</em>' containment reference.
	 * @see #getActiveNode()
	 * @generated
	 */
	void setActiveNode(Node value);

	/**
	 * Returns the value of the '<em><b>Interleave Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.be.textbe.bttrace.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interleave Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interleave Node</em>' containment reference list.
	 * @see org.be.textbe.bttrace.BttracePackage#getNodeGroup_InterleaveNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getInterleaveNode();

} // NodeGroup
