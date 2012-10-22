/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.operation;

import org.be.textbe.bt.textbt.node.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Behave as the destination tree. The destination node must be an ancestor. All sibling behaviour is terminated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.operation.Reversion#getRevertTo <em>Revert To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.node.operation.OperationPackage#getReversion()
 * @model
 * @generated
 */
public interface Reversion extends Operation {
	/**
	 * Returns the value of the '<em><b>Revert To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revert To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revert To</em>' reference.
	 * @see #setRevertTo(Node)
	 * @see org.be.textbe.bt.textbt.node.operation.OperationPackage#getReversion_RevertTo()
	 * @model required="true"
	 * @generated
	 */
	Node getRevertTo();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.operation.Reversion#getRevertTo <em>Revert To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revert To</em>' reference.
	 * @see #getRevertTo()
	 * @generated
	 */
	void setRevertTo(Node value);

} // Reversion
