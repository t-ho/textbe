/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.ContextBody#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getContextBody()
 * @model
 * @generated
 */
public interface ContextBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference.
   * @see #setDeclarations(Declarations)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getContextBody_Declarations()
   * @model containment="true"
   * @generated
   */
  Declarations getDeclarations();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ContextBody#getDeclarations <em>Declarations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declarations</em>' containment reference.
   * @see #getDeclarations()
   * @generated
   */
  void setDeclarations(Declarations value);

} // ContextBody
