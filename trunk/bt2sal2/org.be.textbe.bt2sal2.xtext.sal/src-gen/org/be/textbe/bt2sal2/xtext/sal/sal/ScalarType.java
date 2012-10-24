/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scalar Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.ScalarType#getFirstType <em>First Type</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.ScalarType#getNextType <em>Next Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getScalarType()
 * @model
 * @generated
 */
public interface ScalarType extends TypeDef
{
  /**
   * Returns the value of the '<em><b>First Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Type</em>' attribute.
   * @see #setFirstType(String)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getScalarType_FirstType()
   * @model
   * @generated
   */
  String getFirstType();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ScalarType#getFirstType <em>First Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Type</em>' attribute.
   * @see #getFirstType()
   * @generated
   */
  void setFirstType(String value);

  /**
   * Returns the value of the '<em><b>Next Type</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Type</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Type</em>' attribute list.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getScalarType_NextType()
   * @model unique="false"
   * @generated
   */
  EList<String> getNextType();

} // ScalarType
