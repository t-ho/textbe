/**
 */
package org.be.textbe.bt.textbt.node.operation;

import org.be.textbe.bt.textbt.node.BehaviorNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Wait for destination node (or nodes)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.operation.Synchronisation#getWaitFor <em>Wait For</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.node.operation.OperationPackage#getSynchronisation()
 * @model
 * @generated
 */
public interface Synchronisation extends Operation {
	/**
	 * Returns the value of the '<em><b>Wait For</b></em>' reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.node.BehaviorNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the destination node or nodes whose execution this node should wait for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wait For</em>' reference list.
	 * @see org.be.textbe.bt.textbt.node.operation.OperationPackage#getSynchronisation_WaitFor()
	 * @model required="true"
	 * @generated
	 */
	EList<BehaviorNode> getWaitFor();

} // Synchronisation
