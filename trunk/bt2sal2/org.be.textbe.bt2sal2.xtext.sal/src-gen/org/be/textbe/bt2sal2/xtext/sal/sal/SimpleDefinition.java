/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition#getRhsDefinition <em>Rhs Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getSimpleDefinition()
 * @model
 * @generated
 */
public interface SimpleDefinition extends Definition
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(Lhs)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getSimpleDefinition_Lhs()
   * @model containment="true"
   * @generated
   */
  Lhs getLhs();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Lhs value);

  /**
   * Returns the value of the '<em><b>Rhs Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs Definition</em>' containment reference.
   * @see #setRhsDefinition(RhsDefinition)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getSimpleDefinition_RhsDefinition()
   * @model containment="true"
   * @generated
   */
  RhsDefinition getRhsDefinition();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition#getRhsDefinition <em>Rhs Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs Definition</em>' containment reference.
   * @see #getRhsDefinition()
   * @generated
   */
  void setRhsDefinition(RhsDefinition value);

} // SimpleDefinition
