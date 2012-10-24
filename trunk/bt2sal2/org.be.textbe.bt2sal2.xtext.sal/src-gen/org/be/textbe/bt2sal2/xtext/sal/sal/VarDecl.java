/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl#getFirstVar <em>First Var</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl#getNextVar <em>Next Var</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getVarDecl()
 * @model
 * @generated
 */
public interface VarDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>First Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Var</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Var</em>' attribute.
   * @see #setFirstVar(String)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getVarDecl_FirstVar()
   * @model
   * @generated
   */
  String getFirstVar();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl#getFirstVar <em>First Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Var</em>' attribute.
   * @see #getFirstVar()
   * @generated
   */
  void setFirstVar(String value);

  /**
   * Returns the value of the '<em><b>Next Var</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Var</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Var</em>' attribute list.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getVarDecl_NextVar()
   * @model unique="false"
   * @generated
   */
  EList<String> getNextVar();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getVarDecl_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // VarDecl
