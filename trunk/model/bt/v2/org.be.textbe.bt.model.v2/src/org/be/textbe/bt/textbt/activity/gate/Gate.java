/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.activity.gate;

import org.be.textbe.bt.textbt.activity.Activity;

import org.be.textbe.bt.textbt.node.behavior.BehaviorNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Gate triggers, as soon as the condition is true. The operator op may be one of &, |, or XOR, corresponding to logical conjunction, disjunction and exclusive or. Called 'Conditional Operator' in the original documentation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.activity.gate.Gate#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.activity.gate.GatePackage#getGate()
 * @model abstract="true"
 * @generated
 */
public interface Gate extends Activity {
	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.node.behavior.BehaviorNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see org.be.textbe.bt.textbt.activity.gate.GatePackage#getGate_Triggers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BehaviorNode> getTriggers();

} // Gate
