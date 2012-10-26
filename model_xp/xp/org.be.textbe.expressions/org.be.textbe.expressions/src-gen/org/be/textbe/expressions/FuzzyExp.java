/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuzzy Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.expressions.FuzzyExp#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.expressions.ExpressionsPackage#getFuzzyExp()
 * @model
 * @generated
 */
public interface FuzzyExp extends Value
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
   * @see #setExpression(BinaryExpression)
   * @see org.be.textbe.expressions.ExpressionsPackage#getFuzzyExp_Expression()
   * @model containment="true"
   * @generated
   */
  BinaryExpression getExpression();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.FuzzyExp#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(BinaryExpression value);

} // FuzzyExp
