/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Some Commands</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands#getFirstSomeCommand <em>First Some Command</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands#getNextSomeCommand <em>Next Some Command</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands#getElseCommand <em>Else Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getSomeCommands()
 * @model
 * @generated
 */
public interface SomeCommands extends DefinitionOrCommand
{
  /**
   * Returns the value of the '<em><b>First Some Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Some Command</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Some Command</em>' containment reference.
   * @see #setFirstSomeCommand(SomeCommand)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getSomeCommands_FirstSomeCommand()
   * @model containment="true"
   * @generated
   */
  SomeCommand getFirstSomeCommand();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands#getFirstSomeCommand <em>First Some Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Some Command</em>' containment reference.
   * @see #getFirstSomeCommand()
   * @generated
   */
  void setFirstSomeCommand(SomeCommand value);

  /**
   * Returns the value of the '<em><b>Next Some Command</b></em>' containment reference list.
   * The list contents are of type {@link org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Some Command</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Some Command</em>' containment reference list.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getSomeCommands_NextSomeCommand()
   * @model containment="true"
   * @generated
   */
  EList<SomeCommand> getNextSomeCommand();

  /**
   * Returns the value of the '<em><b>Else Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Command</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Command</em>' containment reference.
   * @see #setElseCommand(ElseCommand)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getSomeCommands_ElseCommand()
   * @model containment="true"
   * @generated
   */
  ElseCommand getElseCommand();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands#getElseCommand <em>Else Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Command</em>' containment reference.
   * @see #getElseCommand()
   * @generated
   */
  void setElseCommand(ElseCommand value);

} // SomeCommands
