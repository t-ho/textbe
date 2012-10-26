/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand#getGuardedCommand <em>Guarded Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getNamedCommand()
 * @model
 * @generated
 */
public interface NamedCommand extends SomeCommand
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
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getNamedCommand_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Guarded Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guarded Command</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guarded Command</em>' containment reference.
   * @see #setGuardedCommand(GuardedCommand)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getNamedCommand_GuardedCommand()
   * @model containment="true"
   * @generated
   */
  GuardedCommand getGuardedCommand();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand#getGuardedCommand <em>Guarded Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guarded Command</em>' containment reference.
   * @see #getGuardedCommand()
   * @generated
   */
  void setGuardedCommand(GuardedCommand value);

} // NamedCommand
