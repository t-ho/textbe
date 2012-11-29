/**
 */
package org.be.textbe.bt.textbt.node.operation;

import org.be.textbe.bt.textbt.node.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start New</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Behave as the destination tree. The destination node must be an ancestor, as with reversion. But in 'Start New' sibling behaviour is not terminated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.operation.StartNew#getStartNew <em>Start New</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.node.operation.OperationPackage#getStartNew()
 * @model
 * @generated
 */
public interface StartNew extends Operation {
	/**
	 * Returns the value of the '<em><b>Start New</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the destination node whose behavior should be started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start New</em>' reference.
	 * @see #setStartNew(Node)
	 * @see org.be.textbe.bt.textbt.node.operation.OperationPackage#getStartNew_StartNew()
	 * @model required="true"
	 * @generated
	 */
	Node getStartNew();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.operation.StartNew#getStartNew <em>Start New</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start New</em>' reference.
	 * @see #getStartNew()
	 * @generated
	 */
	void setStartNew(Node value);

} // StartNew
