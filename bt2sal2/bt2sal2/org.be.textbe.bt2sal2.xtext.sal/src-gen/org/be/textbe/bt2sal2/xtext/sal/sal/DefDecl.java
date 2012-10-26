/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.DefDecl#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getDefDecl()
 * @model
 * @generated
 */
public interface DefDecl extends BaseDeclaration
{
  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference.
   * @see #setDefinitions(Definitions)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getDefDecl_Definitions()
   * @model containment="true"
   * @generated
   */
  Definitions getDefinitions();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.DefDecl#getDefinitions <em>Definitions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definitions</em>' containment reference.
   * @see #getDefinitions()
   * @generated
   */
  void setDefinitions(Definitions value);

} // DefDecl
