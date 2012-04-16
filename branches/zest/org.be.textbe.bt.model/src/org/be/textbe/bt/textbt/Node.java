/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.Node#getTraceability <em>Traceability</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.Node#getLabel <em>Label</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.Node#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.Node#isShowTag <em>Show Tag</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.Node#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.TextbtPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject
{
  /**
   * Returns the value of the '<em><b>Traceability</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Traceability</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Traceability</em>' containment reference.
   * @see #setTraceability(TraceabilityLink)
   * @see org.be.textbe.bt.textbt.TextbtPackage#getNode_Traceability()
   * @model containment="true" required="true"
   * @generated
   */
  TraceabilityLink getTraceability();

  /**
   * Sets the value of the '{@link org.be.textbe.bt.textbt.Node#getTraceability <em>Traceability</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Traceability</em>' containment reference.
   * @see #getTraceability()
   * @generated
   */
  void setTraceability(TraceabilityLink value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.be.textbe.bt.textbt.TextbtPackage#getNode_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.be.textbe.bt.textbt.Node#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Behavior</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behavior</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behavior</em>' reference.
   * @see #setBehavior(Behavior)
   * @see org.be.textbe.bt.textbt.TextbtPackage#getNode_Behavior()
   * @model required="true"
   * @generated
   */
  Behavior getBehavior();

  /**
   * Sets the value of the '{@link org.be.textbe.bt.textbt.Node#getBehavior <em>Behavior</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behavior</em>' reference.
   * @see #getBehavior()
   * @generated
   */
  void setBehavior(Behavior value);

  /**
   * Returns the value of the '<em><b>Show Tag</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Show Tag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show Tag</em>' attribute.
   * @see #setShowTag(boolean)
   * @see org.be.textbe.bt.textbt.TextbtPackage#getNode_ShowTag()
   * @model default="true"
   * @generated
   */
  boolean isShowTag();

  /**
   * Sets the value of the '{@link org.be.textbe.bt.textbt.Node#isShowTag <em>Show Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Show Tag</em>' attribute.
   * @see #isShowTag()
   * @generated
   */
  void setShowTag(boolean value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.be.textbe.bt.textbt.NodeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.be.textbe.bt.textbt.NodeType
   * @see #setOperator(NodeType)
   * @see org.be.textbe.bt.textbt.TextbtPackage#getNode_Operator()
   * @model
   * @generated
   */
  NodeType getOperator();

  /**
   * Sets the value of the '{@link org.be.textbe.bt.textbt.Node#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.be.textbe.bt.textbt.NodeType
   * @see #getOperator()
   * @generated
   */
  void setOperator(NodeType value);

} // Node
