/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.expressions.BinaryExpression#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link org.be.textbe.expressions.BinaryExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.be.textbe.expressions.BinaryExpression#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.expressions.ExpressionsPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Expression</em>' containment reference.
   * @see #setLeftExpression(Value)
   * @see org.be.textbe.expressions.ExpressionsPackage#getBinaryExpression_LeftExpression()
   * @model containment="true"
   * @generated
   */
  Value getLeftExpression();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.BinaryExpression#getLeftExpression <em>Left Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Expression</em>' containment reference.
   * @see #getLeftExpression()
   * @generated
   */
  void setLeftExpression(Value value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.be.textbe.expressions.BinaryOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.be.textbe.expressions.BinaryOperator
   * @see #setOperator(BinaryOperator)
   * @see org.be.textbe.expressions.ExpressionsPackage#getBinaryExpression_Operator()
   * @model
   * @generated
   */
  BinaryOperator getOperator();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.BinaryExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.be.textbe.expressions.BinaryOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(BinaryOperator value);

  /**
   * Returns the value of the '<em><b>Right Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Expression</em>' containment reference.
   * @see #setRightExpression(BinaryExpression)
   * @see org.be.textbe.expressions.ExpressionsPackage#getBinaryExpression_RightExpression()
   * @model containment="true"
   * @generated
   */
  BinaryExpression getRightExpression();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.BinaryExpression#getRightExpression <em>Right Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Expression</em>' containment reference.
   * @see #getRightExpression()
   * @generated
   */
  void setRightExpression(BinaryExpression value);

} // BinaryExpression
