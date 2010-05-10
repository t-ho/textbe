/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.gv.Target#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.be.textbe.gv.Target#getNext_target <em>Next target</em>}</li>
 *   <li>{@link org.be.textbe.gv.Target#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.gv.GvPackage#getTarget()
 * @model
 * @generated
 */
public interface Target extends Commentable {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see org.be.textbe.gv.GvPackage#getTarget_Operation()
	 * @model required="true"
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link org.be.textbe.gv.Target#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

	/**
	 * Returns the value of the '<em><b>Next target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next target</em>' containment reference.
	 * @see #setNext_target(Target)
	 * @see org.be.textbe.gv.GvPackage#getTarget_Next_target()
	 * @model containment="true"
	 * @generated
	 */
	Target getNext_target();

	/**
	 * Sets the value of the '{@link org.be.textbe.gv.Target#getNext_target <em>Next target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next target</em>' containment reference.
	 * @see #getNext_target()
	 * @generated
	 */
	void setNext_target(Target value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Connectable)
	 * @see org.be.textbe.gv.GvPackage#getTarget_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Connectable getTarget();

	/**
	 * Sets the value of the '{@link org.be.textbe.gv.Target#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Connectable value);

} // Target
