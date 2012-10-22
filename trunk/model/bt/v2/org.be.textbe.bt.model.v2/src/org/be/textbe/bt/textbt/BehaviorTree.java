/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A tree-shaped analysis of a systems' components behavior and related requirements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.BehaviorTree#getSubtrees <em>Subtrees</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.TextbtPackage#getBehaviorTree()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BehaviorTree extends EObject {
	/**
	 * Returns the value of the '<em><b>Subtrees</b></em>' reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.BehaviorTree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * trees contained within the tree rooted at the node of interest. "Branch" is a synonym for "subtree".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtrees</em>' reference list.
	 * @see org.be.textbe.bt.textbt.TextbtPackage#getBehaviorTree_Subtrees()
	 * @model derived="true"
	 * @generated
	 */
	EList<BehaviorTree> getSubtrees();

} // BehaviorTree
