/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.ct.textct;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.ct.textct.RequirementList#getRequirements <em>Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.ct.textct.TextctPackage#getRequirementList()
 * @model
 * @generated
 */
public interface RequirementList extends EObject
{
  /**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.be.textbe.ct.textct.Requirement}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.be.textbe.ct.textct.TextctPackage#getRequirementList_Requirements()
	 * @model containment="true" required="true"
	 * @generated
	 */
  EList<Requirement> getRequirements();

} // RequirementList
