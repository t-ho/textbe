/**
 */
package org.be.textbe.bt.textbt.activity.systemStateGuard;

import org.be.textbe.bt.textbt.activity.Activity;

import org.be.textbe.bt.textbt.component.behavior.state.Selection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System State Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SystemStateGuard will let behavior progress, as soon as the condition is true. The operator op may be one of &, |, or XOR, corresponding to logical conjunction, disjunction and exclusive or. Called 'Conditional Operator' in the original documentation. The nodes must be atomically connected selection nodes which all have the AND operator (or OR or XOR), and then it means 'if the conjunction (or disjunction etc.) of the selections hold'. 'Condition Operators define a composite node that acts as a guard. The node executes only if the joint condition over components holds. This is in contrast to simple selection, that can only query the state of one component at a time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuard#getComponentSelection <em>Component Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuardPackage#getSystemStateGuard()
 * @model abstract="true"
 * @generated
 */
public interface SystemStateGuard extends Activity {
	/**
	 * Returns the value of the '<em><b>Component Selection</b></em>' reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.component.behavior.state.Selection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component selection nodes that make up this guard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Selection</em>' reference list.
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuardPackage#getSystemStateGuard_ComponentSelection()
	 * @model required="true"
	 * @generated
	 */
	EList<Selection> getComponentSelection();

} // SystemStateGuard
