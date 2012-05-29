/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.v1.textbt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceability Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.v1.textbt.TraceabilityLink#getStatus <em>Status</em>}</li>
 *   <li>{@link org.be.textbe.bt.v1.textbt.TraceabilityLink#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.be.textbe.bt.v1.textbt.TraceabilityLink#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.v1.textbt.TextbtPackage#getTraceabilityLink()
 * @model
 * @generated
 */
public interface TraceabilityLink extends EObject
{
  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * The literals are from the enumeration {@link org.be.textbe.bt.v1.textbt.TraceabilityStatus}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see org.be.textbe.bt.v1.textbt.TraceabilityStatus
   * @see #setStatus(TraceabilityStatus)
   * @see org.be.textbe.bt.v1.textbt.TextbtPackage#getTraceabilityLink_Status()
   * @model
   * @generated
   */
  TraceabilityStatus getStatus();

  /**
   * Sets the value of the '{@link org.be.textbe.bt.v1.textbt.TraceabilityLink#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see org.be.textbe.bt.v1.textbt.TraceabilityStatus
   * @see #getStatus()
   * @generated
   */
  void setStatus(TraceabilityStatus value);

  /**
   * Returns the value of the '<em><b>Requirement</b></em>' reference list.
   * The list contents are of type {@link org.be.textbe.bt.v1.textbt.Requirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirement</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirement</em>' reference list.
   * @see org.be.textbe.bt.v1.textbt.TextbtPackage#getTraceabilityLink_Requirement()
   * @model
   * @generated
   */
  EList<Requirement> getRequirement();

  /**
   * Returns the value of the '<em><b>Node</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.be.textbe.bt.v1.textbt.Node#getTraceability <em>Traceability</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' container reference.
   * @see #setNode(Node)
   * @see org.be.textbe.bt.v1.textbt.TextbtPackage#getTraceabilityLink_Node()
   * @see org.be.textbe.bt.v1.textbt.Node#getTraceability
   * @model opposite="traceability" transient="false"
   * @generated
   */
  Node getNode();

  /**
   * Sets the value of the '{@link org.be.textbe.bt.v1.textbt.TraceabilityLink#getNode <em>Node</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' container reference.
   * @see #getNode()
   * @generated
   */
  void setNode(Node value);

} // TraceabilityLink
