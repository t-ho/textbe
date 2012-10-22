/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.behavior;

import org.be.textbe.bt.textbt.component.Component;

import org.be.textbe.bt.textbt.node.Node;

import org.be.textbe.bt.textbt.traceability.TraceabilityLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Behavior nodes have an associated behavior of a component or component set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.behavior.BehaviorNode#getTraceability <em>Traceability</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.behavior.BehaviorNode#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.behavior.BehaviorNode#getActor <em>Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.node.behavior.BehaviorPackage#getBehaviorNode()
 * @model
 * @generated
 */
public interface BehaviorNode extends Node {
	/**
	 * Returns the value of the '<em><b>Traceability</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.be.textbe.bt.textbt.traceability.TraceabilityLink#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traceability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traceability</em>' containment reference.
	 * @see #setTraceability(TraceabilityLink)
	 * @see org.be.textbe.bt.textbt.node.behavior.BehaviorPackage#getBehaviorNode_Traceability()
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityLink#getNode
	 * @model opposite="node" containment="true" required="true"
	 * @generated
	 */
	TraceabilityLink getTraceability();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.behavior.BehaviorNode#getTraceability <em>Traceability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traceability</em>' containment reference.
	 * @see #getTraceability()
	 * @generated
	 */
	void setTraceability(TraceabilityLink value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see org.be.textbe.bt.textbt.node.behavior.BehaviorPackage#getBehaviorNode_Behavior()
	 * @model required="true"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.behavior.BehaviorNode#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Component)
	 * @see org.be.textbe.bt.textbt.node.behavior.BehaviorPackage#getBehaviorNode_Actor()
	 * @model required="true"
	 * @generated
	 */
	Component getActor();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.behavior.BehaviorNode#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Component value);

} // BehaviorNode
