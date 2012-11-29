/**
 */
package org.be.textbe.bt.textbt.node.operation;

import org.be.textbe.bt.textbt.node.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Behave as the destination tree. The destination node must appear in an alternative branch to the origin.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.operation.Reference#getContinueLike <em>Continue Like</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.node.operation.OperationPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Operation {
	/**
	 * Returns the value of the '<em><b>Continue Like</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the destination node whose behavior this tree should follow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Continue Like</em>' reference.
	 * @see #setContinueLike(Node)
	 * @see org.be.textbe.bt.textbt.node.operation.OperationPackage#getReference_ContinueLike()
	 * @model required="true"
	 * @generated
	 */
	Node getContinueLike();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.operation.Reference#getContinueLike <em>Continue Like</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue Like</em>' reference.
	 * @see #getContinueLike()
	 * @generated
	 */
	void setContinueLike(Node value);

} // Reference
