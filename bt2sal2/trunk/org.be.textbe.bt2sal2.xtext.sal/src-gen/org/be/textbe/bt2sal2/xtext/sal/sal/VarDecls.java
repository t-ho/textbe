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
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecls#getFirstVarDecl <em>First Var Decl</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecls#getNextVarDecl <em>Next Var Decl</em>}</li>
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
   * Returns the value of the '<em><b>First Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Var Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Var Decl</em>' containment reference.
   * @see #setFirstVarDecl(VarDecl)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getVarDecls_FirstVarDecl()
   * @model containment="true"
   * @generated
   */
  VarDecl getFirstVarDecl();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecls#getFirstVarDecl <em>First Var Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Var Decl</em>' containment reference.
   * @see #getFirstVarDecl()
   * @generated
   */
  void setFirstVarDecl(VarDecl value);

  /**
   * Returns the value of the '<em><b>Next Var Decl</b></em>' containment reference list.
   * The list contents are of type {@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Var Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Var Decl</em>' containment reference list.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getVarDecls_NextVarDecl()
   * @model containment="true"
   * @generated
   */
  EList<VarDecl> getNextVarDecl();

} // VarDecls
