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
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.TransDecl#getDefinitionOrCommand <em>Definition Or Command</em>}</li>
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
   * Returns the value of the '<em><b>Definition Or Command</b></em>' containment reference list.
   * The list contents are of type {@link org.be.textbe.bt2sal2.xtext.sal.sal.DefinitionOrCommand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition Or Command</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition Or Command</em>' containment reference list.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getTransDecl_DefinitionOrCommand()
   * @model containment="true"
   * @generated
   */
  EList<DefinitionOrCommand> getDefinitionOrCommand();

} // TransDecl
