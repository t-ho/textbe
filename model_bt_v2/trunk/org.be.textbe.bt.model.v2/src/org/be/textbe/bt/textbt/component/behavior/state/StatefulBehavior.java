/**
 */
package org.be.textbe.bt.textbt.component.behavior.state;

import org.be.textbe.bt.textbt.component.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stateful Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A behavior that pertains to the state of a single component in the system
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.component.behavior.state.StatefulBehavior#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.component.behavior.state.StatePackage#getStatefulBehavior()
 * @model abstract="true"
 * @generated
 */
public interface StatefulBehavior extends Behavior {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definition of the state that this behavior pertains to
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(StateDefinition)
	 * @see org.be.textbe.bt.textbt.component.behavior.state.StatePackage#getStatefulBehavior_Definition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StateDefinition getDefinition();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.component.behavior.state.StatefulBehavior#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(StateDefinition value);

} // StatefulBehavior
