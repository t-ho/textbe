/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.TypeDeclaration#getTypeDef <em>Type Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getTypeDeclaration()
 * @model
 * @generated
 */
public interface TypeDeclaration extends Declaration
{
  /**
   * Returns the value of the '<em><b>Type Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Def</em>' containment reference.
   * @see #setTypeDef(TypeDef)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getTypeDeclaration_TypeDef()
   * @model containment="true"
   * @generated
   */
  TypeDef getTypeDef();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.TypeDeclaration#getTypeDef <em>Type Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Def</em>' containment reference.
   * @see #getTypeDef()
   * @generated
   */
  void setTypeDef(TypeDef value);

} // TypeDeclaration
