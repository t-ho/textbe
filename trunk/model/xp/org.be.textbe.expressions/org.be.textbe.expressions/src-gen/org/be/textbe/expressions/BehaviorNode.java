/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.expressions.BehaviorNode#getComponent <em>Component</em>}</li>
 *   <li>{@link org.be.textbe.expressions.BehaviorNode#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.expressions.ExpressionsPackage#getBehaviorNode()
 * @model
 * @generated
 */
public interface BehaviorNode extends Node
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' attribute.
   * @see #setComponent(String)
   * @see org.be.textbe.expressions.ExpressionsPackage#getBehaviorNode_Component()
   * @model
   * @generated
   */
  String getComponent();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.BehaviorNode#getComponent <em>Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' attribute.
   * @see #getComponent()
   * @generated
   */
  void setComponent(String value);

  /**
   * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behavior</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behavior</em>' containment reference.
   * @see #setBehavior(Behavior)
   * @see org.be.textbe.expressions.ExpressionsPackage#getBehaviorNode_Behavior()
   * @model containment="true"
   * @generated
   */
  Behavior getBehavior();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.BehaviorNode#getBehavior <em>Behavior</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behavior</em>' containment reference.
   * @see #getBehavior()
   * @generated
   */
  void setBehavior(Behavior value);

} // BehaviorNode
