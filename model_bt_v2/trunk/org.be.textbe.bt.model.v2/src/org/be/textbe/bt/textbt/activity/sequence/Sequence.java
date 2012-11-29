/**
 */
package org.be.textbe.bt.textbt.activity.sequence;

import org.be.textbe.bt.textbt.activity.Activity;

import org.be.textbe.bt.textbt.node.OperationNode;

import org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Sequence executes behavior of components in order.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.activity.sequence.Sequence#getStep <em>Step</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.activity.sequence.Sequence#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.activity.sequence.SequencePackage#getSequence()
 * @model abstract="true"
 * @generated
 */
public interface Sequence extends Activity {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.node.OperationNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the steps of the sequence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see org.be.textbe.bt.textbt.activity.sequence.SequencePackage#getSequence_Step()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OperationNode> getStep();

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the quantifier that applies in the tree started by this sequence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantifier</em>' containment reference.
	 * @see #setQuantifier(QuantifyingNode)
	 * @see org.be.textbe.bt.textbt.activity.sequence.SequencePackage#getSequence_Quantifier()
	 * @model containment="true"
	 * @generated
	 */
	QuantifyingNode getQuantifier();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.activity.sequence.Sequence#getQuantifier <em>Quantifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' containment reference.
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(QuantifyingNode value);

} // Sequence
