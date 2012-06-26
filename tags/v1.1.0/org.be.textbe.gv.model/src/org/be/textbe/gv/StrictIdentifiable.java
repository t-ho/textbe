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
 * A representation of the model object '<em><b>Strict Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.gv.StrictIdentifiable#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.gv.GvPackage#getStrictIdentifiable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StrictIdentifiable extends EObject
{
  /**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.be.textbe.gv.GvPackage#getStrictIdentifiable_Id()
	 * @model required="true"
	 * @generated
	 */
  String getId();

  /**
	 * Sets the value of the '{@link org.be.textbe.gv.StrictIdentifiable#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
  void setId(String value);

} // StrictIdentifiable
