/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Declarations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclarations#getBaseDeclaration <em>Base Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getBaseDeclarations()
 * @model
 * @generated
 */
public interface BaseDeclarations extends BaseModule
{
  /**
   * Returns the value of the '<em><b>Base Declaration</b></em>' containment reference list.
   * The list contents are of type {@link org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Declaration</em>' containment reference list.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getBaseDeclarations_BaseDeclaration()
   * @model containment="true"
   * @generated
   */
  EList<BaseDeclaration> getBaseDeclaration();

} // BaseDeclarations
