/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guarded Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getGuardedCommand()
 * @model
 * @generated
 */
public interface GuardedCommand extends EObject
{
  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Guard)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getGuardedCommand_Guard()
   * @model containment="true"
   * @generated
   */
  Guard getGuard();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Guard value);

  /**
   * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' containment reference.
   * @see #setAssignment(Assignments)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getGuardedCommand_Assignment()
   * @model containment="true"
   * @generated
   */
  Assignments getAssignment();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand#getAssignment <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment</em>' containment reference.
   * @see #getAssignment()
   * @generated
   */
  void setAssignment(Assignments value);

} // GuardedCommand
