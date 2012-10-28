/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.InitDecl#getDefinitionOrCommand <em>Definition Or Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getInitDecl()
 * @model
 * @generated
 */
public interface InitDecl extends BaseDeclaration
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
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getInitDecl_DefinitionOrCommand()
   * @model containment="true"
   * @generated
   */
  EList<DefinitionOrCommand> getDefinitionOrCommand();

} // InitDecl
