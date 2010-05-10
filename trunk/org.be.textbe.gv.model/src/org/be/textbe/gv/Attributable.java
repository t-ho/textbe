/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.gv.Attributable#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.gv.GvPackage#getAttributable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Attributable extends EObject {
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
	 * @see org.be.textbe.gv.GvPackage#getAttributable_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	AttributeList getAttributes();

	/**
	 * Sets the value of the '{@link org.be.textbe.gv.Attributable#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(AttributeList value);

} // Attributable
