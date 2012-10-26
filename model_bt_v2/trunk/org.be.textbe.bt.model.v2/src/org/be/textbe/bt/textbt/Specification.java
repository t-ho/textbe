/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt;

import org.be.textbe.bt.textbt.activity.Activity;

import org.be.textbe.bt.textbt.component.Component;

import org.be.textbe.bt.textbt.traceability.Requirement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Every textbt model contains a specification of system behavior
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.Specification#getComponents <em>Components</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.Specification#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.Specification#getRoot <em>Root</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.Specification#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.TextbtPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.component.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The components that are used in this specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.be.textbe.bt.textbt.TextbtPackage#getSpecification_Components()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.traceability.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The components that are used in this specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.be.textbe.bt.textbt.TextbtPackage#getSpecification_Requirements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Activity)
	 * @see org.be.textbe.bt.textbt.TextbtPackage#getSpecification_Root()
	 * @model containment="true"
	 * @generated
	 */
	Activity getRoot();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.Specification#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Activity value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system component that contains all other components in this specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(Component)
	 * @see org.be.textbe.bt.textbt.TextbtPackage#getSpecification_System()
	 * @model
	 * @generated
	 */
	Component getSystem();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.Specification#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Component value);

} // Specification
