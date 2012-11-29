/**
 */
package org.be.textbe.bt.textbt.component.behavior.event;

import org.be.textbe.bt.textbt.component.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Wait until event e is received
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.component.behavior.event.Event#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.component.behavior.event.EventPackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends Behavior {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definition of the event
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(EventDefinition)
	 * @see org.be.textbe.bt.textbt.component.behavior.event.EventPackage#getEvent_Definition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EventDefinition getDefinition();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.component.behavior.event.Event#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(EventDefinition value);

} // Event
