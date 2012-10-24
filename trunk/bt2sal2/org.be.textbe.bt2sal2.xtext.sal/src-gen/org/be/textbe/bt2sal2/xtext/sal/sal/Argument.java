/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.Argument#getFirstExpression <em>First Expression</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.Argument#getNextExpression <em>Next Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends EObject
{
  /**
   * Returns the value of the '<em><b>First Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Expression</em>' containment reference.
   * @see #setFirstExpression(Expression)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getArgument_FirstExpression()
   * @model containment="true"
   * @generated
   */
  Expression getFirstExpression();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Argument#getFirstExpression <em>First Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Expression</em>' containment reference.
   * @see #getFirstExpression()
   * @generated
   */
  void setFirstExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Next Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.be.textbe.bt2sal2.xtext.sal.sal.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Expression</em>' containment reference list.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getArgument_NextExpression()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getNextExpression();

} // Argument
