/**
 */
package org.be.textbe.bt.textbt.branch;

import org.be.textbe.bt.textbt.activity.sequence.Sequence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Choice Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A nondeterministic choice is made between T1 and T2, depending on which is ready to execute (not blocked)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.branch.RandomChoiceBranch#getChoices <em>Choices</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.branch.BranchPackage#getRandomChoiceBranch()
 * @model
 * @generated
 */
public interface RandomChoiceBranch extends Branch {
	/**
	 * Returns the value of the '<em><b>Choices</b></em>' containment reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.activity.sequence.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the behavior trees that form the branches of this choice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Choices</em>' containment reference list.
	 * @see org.be.textbe.bt.textbt.branch.BranchPackage#getRandomChoiceBranch_Choices()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Sequence> getChoices();

} // RandomChoiceBranch
