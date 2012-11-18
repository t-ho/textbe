/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bttrace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interleave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bttrace.Interleave#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bttrace.BttracePackage#getInterleave()
 * @model
 * @generated
 */
public interface Interleave extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.be.textbe.bttrace.BttracePackage#getInterleave_Color()
	 * @model required="true"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.be.textbe.bttrace.Interleave#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // Interleave
