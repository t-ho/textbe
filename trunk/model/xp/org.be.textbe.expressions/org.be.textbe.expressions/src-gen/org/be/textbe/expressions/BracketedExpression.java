/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bracketed Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.expressions.BracketedExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.expressions.ExpressionsPackage#getBracketedExpression()
 * @model
 * @generated
 */
public interface BracketedExpression extends Value
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(BinaryRelation)
   * @see org.be.textbe.expressions.ExpressionsPackage#getBracketedExpression_Expression()
   * @model containment="true"
   * @generated
   */
  BinaryRelation getExpression();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.BracketedExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(BinaryRelation value);

} // BracketedExpression
