/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.traceability;

import org.be.textbe.bt.textbt.node.behavior.BehaviorNode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to the requirements document
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.traceability.TraceabilityLink#getStatus <em>Status</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.traceability.TraceabilityLink#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.traceability.TraceabilityLink#getNode <em>Node</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.traceability.TraceabilityLink#getUpdatedInVersion <em>Updated In Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.traceability.TraceabilityPackage#getTraceabilityLink()
 * @model
 * @generated
 */
public interface TraceabilityLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.be.textbe.bt.textbt.traceability.TraceabilityStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the node relates to the link
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityStatus
	 * @see #setStatus(TraceabilityStatus)
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityPackage#getTraceabilityLink_Status()
	 * @model
	 * @generated
	 */
	TraceabilityStatus getStatus();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.traceability.TraceabilityLink#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(TraceabilityStatus value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.traceability.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference list.
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityPackage#getTraceabilityLink_Requirement()
	 * @model
	 * @generated
	 */
	EList<Requirement> getRequirement();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.be.textbe.bt.textbt.node.behavior.BehaviorNode#getTraceability <em>Traceability</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(BehaviorNode)
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityPackage#getTraceabilityLink_Node()
	 * @see org.be.textbe.bt.textbt.node.behavior.BehaviorNode#getTraceability
	 * @model opposite="traceability" transient="false"
	 * @generated
	 */
	BehaviorNode getNode();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.traceability.TraceabilityLink#getNode <em>Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(BehaviorNode value);

	/**
	 * Returns the value of the '<em><b>Updated In Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Traceability Status indicates that the behavior has been added in the post-development (PD) or maintenance phase. Where there are different series of changes / upgrades we use ++V1.0, ++V2.0, etc to indicate the particular upgrade series.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Updated In Version</em>' attribute.
	 * @see #setUpdatedInVersion(String)
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityPackage#getTraceabilityLink_UpdatedInVersion()
	 * @model
	 * @generated
	 */
	String getUpdatedInVersion();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.traceability.TraceabilityLink#getUpdatedInVersion <em>Updated In Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated In Version</em>' attribute.
	 * @see #getUpdatedInVersion()
	 * @generated
	 */
	void setUpdatedInVersion(String value);

} // TraceabilityLink
