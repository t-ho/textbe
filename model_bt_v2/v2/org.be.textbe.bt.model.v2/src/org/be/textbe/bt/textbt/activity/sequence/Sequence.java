/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.activity.sequence;

import org.be.textbe.bt.textbt.activity.Activity;

import org.be.textbe.bt.textbt.node.behavior.BehaviorNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Sequence executes behavior of components in order.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.activity.sequence.Sequence#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.activity.sequence.SequencePackage#getSequence()
 * @model abstract="true"
 * @generated
 */
public interface Sequence extends Activity {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.node.behavior.BehaviorNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see org.be.textbe.bt.textbt.activity.sequence.SequencePackage#getSequence_Step()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BehaviorNode> getStep();

} // Sequence
