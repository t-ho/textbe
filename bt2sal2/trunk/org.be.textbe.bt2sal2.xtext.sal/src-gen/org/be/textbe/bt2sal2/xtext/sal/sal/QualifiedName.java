/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName#getIdentifier1 <em>Identifier1</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName#getActualParameters <em>Actual Parameters</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName#getIdentifier2 <em>Identifier2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getQualifiedName()
 * @model
 * @generated
 */
public interface QualifiedName extends Type
{
  /**
   * Returns the value of the '<em><b>Identifier1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier1</em>' attribute.
   * @see #setIdentifier1(String)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getQualifiedName_Identifier1()
   * @model
   * @generated
   */
  String getIdentifier1();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName#getIdentifier1 <em>Identifier1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier1</em>' attribute.
   * @see #getIdentifier1()
   * @generated
   */
  void setIdentifier1(String value);

  /**
   * Returns the value of the '<em><b>Actual Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual Parameters</em>' containment reference.
   * @see #setActualParameters(ActualParameters)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getQualifiedName_ActualParameters()
   * @model containment="true"
   * @generated
   */
  ActualParameters getActualParameters();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName#getActualParameters <em>Actual Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actual Parameters</em>' containment reference.
   * @see #getActualParameters()
   * @generated
   */
  void setActualParameters(ActualParameters value);

  /**
   * Returns the value of the '<em><b>Identifier2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier2</em>' attribute.
   * @see #setIdentifier2(String)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getQualifiedName_Identifier2()
   * @model
   * @generated
   */
  String getIdentifier2();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName#getIdentifier2 <em>Identifier2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier2</em>' attribute.
   * @see #getIdentifier2()
   * @generated
   */
  void setIdentifier2(String value);

} // QualifiedName
