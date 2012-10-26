/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.branch;

import org.be.textbe.bt.textbt.BehaviorTree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A nondeterministic choice is made between T1 and T2, depending on which is ready to execute (not blocked)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.branch.Alternative#getChoices <em>Choices</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.branch.BranchPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends Branch {
	/**
	 * Returns the value of the '<em><b>Choices</b></em>' containment reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.BehaviorTree}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' containment reference list.
	 * @see org.be.textbe.bt.textbt.branch.BranchPackage#getAlternative_Choices()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<BehaviorTree> getChoices();

} // Alternative
