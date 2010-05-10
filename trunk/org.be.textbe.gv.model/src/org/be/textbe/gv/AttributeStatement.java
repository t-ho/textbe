/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.gv.AttributeStatement#getContext <em>Context</em>}</li>
 *   <li>{@link org.be.textbe.gv.AttributeStatement#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.gv.GvPackage#getAttributeStatement()
 * @model
 * @generated
 */
public interface AttributeStatement extends Statement, Commentable {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.be.textbe.gv.GvPackage#getAttributeStatement_Context()
	 * @model required="true"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.be.textbe.gv.AttributeStatement#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(AttributeList)
	 * @see org.be.textbe.gv.GvPackage#getAttributeStatement_Attributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeList getAttributes();

	/**
	 * Sets the value of the '{@link org.be.textbe.gv.AttributeStatement#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(AttributeList value);

} // AttributeStatement
