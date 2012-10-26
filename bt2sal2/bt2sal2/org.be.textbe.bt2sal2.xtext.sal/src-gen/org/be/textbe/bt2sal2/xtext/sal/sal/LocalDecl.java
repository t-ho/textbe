/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.LocalDecl#getVarDecls <em>Var Decls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getLocalDecl()
 * @model
 * @generated
 */
public interface LocalDecl extends BaseDeclaration
{
  /**
   * Returns the value of the '<em><b>Var Decls</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Decls</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Decls</em>' containment reference.
   * @see #setVarDecls(VarDecls)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getLocalDecl_VarDecls()
   * @model containment="true"
   * @generated
   */
  VarDecls getVarDecls();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.LocalDecl#getVarDecls <em>Var Decls</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Decls</em>' containment reference.
   * @see #getVarDecls()
   * @generated
   */
  void setVarDecls(VarDecls value);

} // LocalDecl
