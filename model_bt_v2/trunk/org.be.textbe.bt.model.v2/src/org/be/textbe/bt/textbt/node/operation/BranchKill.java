/**
 */
package org.be.textbe.bt.textbt.node.operation;

import org.be.textbe.bt.textbt.node.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Kill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Terminate all behaviour associated with destination tree.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.operation.BranchKill#getStop <em>Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.node.operation.OperationPackage#getBranchKill()
 * @model
 * @generated
 */
public interface BranchKill extends Operation {
	/**
	 * Returns the value of the '<em><b>Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the destination node whose behavior should be terminated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop</em>' reference.
	 * @see #setStop(Node)
	 * @see org.be.textbe.bt.textbt.node.operation.OperationPackage#getBranchKill_Stop()
	 * @model required="true"
	 * @generated
	 */
	Node getStop();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.operation.BranchKill#getStop <em>Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' reference.
	 * @see #getStop()
	 * @generated
	 */
	void setStop(Node value);

} // BranchKill
