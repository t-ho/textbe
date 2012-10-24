/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getElseCommand()
 * @model
 * @generated
 */
public interface ElseCommand extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getElseCommand_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Assignments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignments</em>' containment reference.
   * @see #setAssignments(Assignments)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getElseCommand_Assignments()
   * @model containment="true"
   * @generated
   */
  Assignments getAssignments();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand#getAssignments <em>Assignments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignments</em>' containment reference.
   * @see #getAssignments()
   * @generated
   */
  void setAssignments(Assignments value);

} // ElseCommand
