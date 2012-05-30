/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.expressions.ComponentInstantiation#getComponent <em>Component</em>}</li>
 *   <li>{@link org.be.textbe.expressions.ComponentInstantiation#getComponentSet <em>Component Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.expressions.ExpressionsPackage#getComponentInstantiation()
 * @model
 * @generated
 */
public interface ComponentInstantiation extends ForAll, ForSome, AtLeastOne, ForOneArbitrary
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
   * @see org.be.textbe.expressions.ExpressionsPackage#getComponentInstantiation_Component()
   * @model
   * @generated
   */
  String getComponent();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.ComponentInstantiation#getComponent <em>Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' attribute.
   * @see #getComponent()
   * @generated
   */
  void setComponent(String value);

  /**
   * Returns the value of the '<em><b>Component Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Set</em>' containment reference.
   * @see #setComponentSet(BinaryExpression)
   * @see org.be.textbe.expressions.ExpressionsPackage#getComponentInstantiation_ComponentSet()
   * @model containment="true"
   * @generated
   */
  BinaryExpression getComponentSet();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.ComponentInstantiation#getComponentSet <em>Component Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Set</em>' containment reference.
   * @see #getComponentSet()
   * @generated
   */
  void setComponentSet(BinaryExpression value);

} // ComponentInstantiation
