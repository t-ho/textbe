/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.gv.EdgeStatement#getSource <em>Source</em>}</li>
 *   <li>{@link org.be.textbe.gv.EdgeStatement#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.gv.GvPackage#getEdgeStatement()
 * @model
 * @generated
 */
public interface EdgeStatement extends Statement, Attributable, Commentable {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Connectable)
	 * @see org.be.textbe.gv.GvPackage#getEdgeStatement_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Connectable getSource();

	/**
	 * Sets the value of the '{@link org.be.textbe.gv.EdgeStatement#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Connectable value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Target)
	 * @see org.be.textbe.gv.GvPackage#getEdgeStatement_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link org.be.textbe.gv.EdgeStatement#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

} // EdgeStatement
