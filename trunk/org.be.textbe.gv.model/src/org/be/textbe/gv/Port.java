/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.gv.Port#getCompass <em>Compass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.gv.GvPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends Identifiable, Commentable {
	/**
	 * Returns the value of the '<em><b>Compass</b></em>' attribute.
	 * The literals are from the enumeration {@link org.be.textbe.gv.Compass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compass</em>' attribute.
	 * @see org.be.textbe.gv.Compass
	 * @see #setCompass(Compass)
	 * @see org.be.textbe.gv.GvPackage#getPort_Compass()
	 * @model
	 * @generated
	 */
	Compass getCompass();

	/**
	 * Sets the value of the '{@link org.be.textbe.gv.Port#getCompass <em>Compass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compass</em>' attribute.
	 * @see org.be.textbe.gv.Compass
	 * @see #getCompass()
	 * @generated
	 */
	void setCompass(Compass value);

} // Port
