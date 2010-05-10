/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.gv.AttributeList#getList <em>List</em>}</li>
 *   <li>{@link org.be.textbe.gv.AttributeList#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.gv.GvPackage#getAttributeList()
 * @model
 * @generated
 */
public interface AttributeList extends Commentable {
	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(AList)
	 * @see org.be.textbe.gv.GvPackage#getAttributeList_List()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AList getList();

	/**
	 * Sets the value of the '{@link org.be.textbe.gv.AttributeList#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(AList value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(AttributeList)
	 * @see org.be.textbe.gv.GvPackage#getAttributeList_Next()
	 * @model containment="true"
	 * @generated
	 */
	AttributeList getNext();

	/**
	 * Sets the value of the '{@link org.be.textbe.gv.AttributeList#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(AttributeList value);

} // AttributeList
