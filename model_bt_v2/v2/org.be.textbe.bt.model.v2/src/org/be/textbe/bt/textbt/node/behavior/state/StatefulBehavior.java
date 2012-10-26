/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.behavior.state;

import org.be.textbe.bt.textbt.node.behavior.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stateful Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.behavior.state.StatefulBehavior#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.node.behavior.state.StatePackage#getStatefulBehavior()
 * @model abstract="true"
 * @generated
 */
public interface StatefulBehavior extends Behavior {
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
	 * @see org.be.textbe.bt.textbt.node.behavior.state.StatePackage#getStatefulBehavior_Expression()
	 * @model dataType="org.be.textbe.bt.textbt.node.behavior.state.StateExpression"
	 * @generated
	 */
	Object getExpression();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.behavior.state.StatefulBehavior#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Object value);

} // StatefulBehavior
