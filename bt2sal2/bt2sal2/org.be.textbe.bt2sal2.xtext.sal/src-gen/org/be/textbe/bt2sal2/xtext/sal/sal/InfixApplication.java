/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infix Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication#getFirstExpression <em>First Expression</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication#getSecondExpression <em>Second Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getInfixApplication()
 * @model
 * @generated
 */
public interface InfixApplication extends EObject
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
   * @see #setFirstExpression(NameExpr)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getInfixApplication_FirstExpression()
   * @model containment="true"
   * @generated
   */
  NameExpr getFirstExpression();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication#getFirstExpression <em>First Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Expression</em>' containment reference.
   * @see #getFirstExpression()
   * @generated
   */
  void setFirstExpression(NameExpr value);

  /**
   * Returns the value of the '<em><b>Second Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Expression</em>' containment reference.
   * @see #setSecondExpression(Expression)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getInfixApplication_SecondExpression()
   * @model containment="true"
   * @generated
   */
  Expression getSecondExpression();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication#getSecondExpression <em>Second Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Expression</em>' containment reference.
   * @see #getSecondExpression()
   * @generated
   */
  void setSecondExpression(Expression value);

} // InfixApplication
