/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.expressions.BinaryRelation#getLeft <em>Left</em>}</li>
 *   <li>{@link org.be.textbe.expressions.BinaryRelation#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.be.textbe.expressions.BinaryRelation#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.expressions.ExpressionsPackage#getBinaryRelation()
 * @model
 * @generated
 */
public interface BinaryRelation extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(BinaryExpression)
   * @see org.be.textbe.expressions.ExpressionsPackage#getBinaryRelation_Left()
   * @model containment="true"
   * @generated
   */
  BinaryExpression getLeft();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.BinaryRelation#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BinaryExpression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.be.textbe.expressions.binarySymbol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.be.textbe.expressions.binarySymbol
   * @see #setOperator(binarySymbol)
   * @see org.be.textbe.expressions.ExpressionsPackage#getBinaryRelation_Operator()
   * @model
   * @generated
   */
  binarySymbol getOperator();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.BinaryRelation#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.be.textbe.expressions.binarySymbol
   * @see #getOperator()
   * @generated
   */
  void setOperator(binarySymbol value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(BinaryExpression)
   * @see org.be.textbe.expressions.ExpressionsPackage#getBinaryRelation_Right()
   * @model containment="true"
   * @generated
   */
  BinaryExpression getRight();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.BinaryRelation#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BinaryExpression value);

} // BinaryRelation
