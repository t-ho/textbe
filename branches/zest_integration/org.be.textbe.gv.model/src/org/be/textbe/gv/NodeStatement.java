/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.gv.NodeStatement#getNode_id <em>Node id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.gv.GvPackage#getNodeStatement()
 * @model
 * @generated
 */
public interface NodeStatement extends Statement, Attributable, Attribute
{
  /**
	 * Returns the value of the '<em><b>Node id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Node id</em>' containment reference.
	 * @see #setNode_id(NodeID)
	 * @see org.be.textbe.gv.GvPackage#getNodeStatement_Node_id()
	 * @model containment="true" required="true"
	 * @generated
	 */
  NodeID getNode_id();

  /**
	 * Sets the value of the '{@link org.be.textbe.gv.NodeStatement#getNode_id <em>Node id</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node id</em>' containment reference.
	 * @see #getNode_id()
	 * @generated
	 */
  void setNode_id(NodeID value);

} // NodeStatement
