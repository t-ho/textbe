/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.behavior.event;

import org.be.textbe.bt.textbt.node.behavior.Behavior;

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
 *   <li>{@link org.be.textbe.bt.textbt.node.behavior.event.Event#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.node.behavior.event.EventPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Behavior {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(Object)
	 * @see org.be.textbe.bt.textbt.node.behavior.event.EventPackage#getEvent_Expression()
	 * @model dataType="org.be.textbe.bt.textbt.node.behavior.event.EventExpression"
	 * @generated
	 */
	Object getExpression();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.behavior.event.Event#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Object value);

} // Event
