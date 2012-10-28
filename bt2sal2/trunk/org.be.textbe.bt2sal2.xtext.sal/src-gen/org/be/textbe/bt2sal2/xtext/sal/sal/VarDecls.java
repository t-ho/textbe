/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Decls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecls#getVarDecl <em>Var Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getVarDecls()
 * @model
 * @generated
 */
public interface VarDecls extends EObject
{
  /**
   * Returns the value of the '<em><b>Var Decl</b></em>' containment reference list.
   * The list contents are of type {@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Decl</em>' containment reference list.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getVarDecls_VarDecl()
   * @model containment="true"
   * @generated
   */
  EList<VarDecl> getVarDecl();

} // VarDecls
