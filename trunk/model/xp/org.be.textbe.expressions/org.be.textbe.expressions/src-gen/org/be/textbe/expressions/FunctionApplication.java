/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.expressions.FunctionApplication#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link org.be.textbe.expressions.FunctionApplication#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.expressions.ExpressionsPackage#getFunctionApplication()
 * @model
 * @generated
 */
public interface FunctionApplication extends Selection, Event, InternalOutputEvent, InternalInputEvent, ExternalOutputEvent, ExternalInputEvent, Value
{
  /**
   * Returns the value of the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Name</em>' attribute.
   * @see #setFunctionName(String)
   * @see org.be.textbe.expressions.ExpressionsPackage#getFunctionApplication_FunctionName()
   * @model
   * @generated
   */
  String getFunctionName();

  /**
   * Sets the value of the '{@link org.be.textbe.expressions.FunctionApplication#getFunctionName <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Name</em>' attribute.
   * @see #getFunctionName()
   * @generated
   */
  void setFunctionName(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link org.be.textbe.expressions.BinaryExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see org.be.textbe.expressions.ExpressionsPackage#getFunctionApplication_Parameter()
   * @model containment="true"
   * @generated
   */
  EList<BinaryExpression> getParameter();

} // FunctionApplication
