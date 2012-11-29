/**
 */
package org.be.textbe.bt.textbt.node;

import org.be.textbe.bt.textbt.component.Behavior;
import org.be.textbe.bt.textbt.component.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Behavior nodes have an associated behavior of a component or component set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.BehaviorNode#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.BehaviorNode#getActor <em>Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.node.NodePackage#getBehaviorNode()
 * @model
 * @generated
 */
public interface BehaviorNode extends OperationNode {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the behavior associated with this node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getBehaviorNode_Behavior()
	 * @model required="true"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.BehaviorNode#getBehavior <em>Behavior</em>}' reference.
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
	 * @see org.be.textbe.bt.textbt.node.NodePackage#getBehaviorNode_Actor()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='OclVoid'"
	 * @generated
	 */
	Component getActor();

} // BehaviorNode
