/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.branch;

import org.be.textbe.bt.textbt.BehaviorTree;

import org.be.textbe.bt.textbt.node.LabelOnlyNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.branch.Branch#getGotoDestination <em>Goto Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.branch.BranchPackage#getBranch()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Branch extends BehaviorTree {
	/**
	 * Returns the value of the '<em><b>Goto Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goto Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goto Destination</em>' reference.
	 * @see #setGotoDestination(LabelOnlyNode)
	 * @see org.be.textbe.bt.textbt.branch.BranchPackage#getBranch_GotoDestination()
	 * @model
	 * @generated
	 */
	LabelOnlyNode getGotoDestination();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.branch.Branch#getGotoDestination <em>Goto Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goto Destination</em>' reference.
	 * @see #getGotoDestination()
	 * @generated
	 */
	void setGotoDestination(LabelOnlyNode value);

} // Branch
