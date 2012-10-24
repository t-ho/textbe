/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.Application#getFunction <em>Function</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.Application#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(Function)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getApplication_Function()
   * @model containment="true"
   * @generated
   */
  Function getFunction();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Application#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(Function value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(Argument)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getApplication_Argument()
   * @model containment="true"
   * @generated
   */
  Argument getArgument();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Application#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(Argument value);

} // Application
