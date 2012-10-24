/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trans Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.TransDecl#getFirstDefinitionOrCommand <em>First Definition Or Command</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.TransDecl#getNextDefinitionOrCommand <em>Next Definition Or Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getTransDecl()
 * @model
 * @generated
 */
public interface TransDecl extends BaseDeclaration
{
  /**
   * Returns the value of the '<em><b>First Definition Or Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Definition Or Command</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Definition Or Command</em>' containment reference.
   * @see #setFirstDefinitionOrCommand(DefinitionOrCommand)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getTransDecl_FirstDefinitionOrCommand()
   * @model containment="true"
   * @generated
   */
  DefinitionOrCommand getFirstDefinitionOrCommand();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.TransDecl#getFirstDefinitionOrCommand <em>First Definition Or Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Definition Or Command</em>' containment reference.
   * @see #getFirstDefinitionOrCommand()
   * @generated
   */
  void setFirstDefinitionOrCommand(DefinitionOrCommand value);

  /**
   * Returns the value of the '<em><b>Next Definition Or Command</b></em>' containment reference list.
   * The list contents are of type {@link org.be.textbe.bt2sal2.xtext.sal.sal.DefinitionOrCommand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Definition Or Command</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Definition Or Command</em>' containment reference list.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getTransDecl_NextDefinitionOrCommand()
   * @model containment="true"
   * @generated
   */
  EList<DefinitionOrCommand> getNextDefinitionOrCommand();

} // TransDecl
