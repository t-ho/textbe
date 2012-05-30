/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Realisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.expressions.AttributeRealisation#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.be.textbe.expressions.AttributeRealisation#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.expressions.ExpressionsPackage#getAttributeRealisation()
 * @model
 * @generated
 */
public interface AttributeRealisation extends Behavior
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute.
   * @see #setAttribute(String)
   * @see org.be.textbe.expressions.ExpressionsPackage#getAttributeRealisation_Attribute()
   * @model
   * @generated
   */
  String getAttribute();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.AttributeRealisation#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(BinaryExpression)
   * @see org.be.textbe.expressions.ExpressionsPackage#getAttributeRealisation_Value()
   * @model containment="true"
   * @generated
   */
  BinaryExpression getValue();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.AttributeRealisation#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(BinaryExpression value);

} // AttributeRealisation
