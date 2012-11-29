/**
 */
package org.be.textbe.bt.textbt.branch;

import org.be.textbe.bt.textbt.activity.sequence.Sequence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Execute N, passing control to both T1 and T2.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.branch.ForkBranch#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.branch.BranchPackage#getForkBranch()
 * @model
 * @generated
 */
public interface ForkBranch extends Branch {
	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.activity.sequence.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the behavior trees that form the processes initiated by this fork.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see org.be.textbe.bt.textbt.branch.BranchPackage#getForkBranch_Processes()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Sequence> getProcesses();

} // ForkBranch
