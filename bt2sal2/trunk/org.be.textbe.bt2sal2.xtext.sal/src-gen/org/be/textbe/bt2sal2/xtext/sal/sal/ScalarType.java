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
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.ScalarType#getTypeValue <em>Type Value</em>}</li>
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
   * Returns the value of the '<em><b>Type Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Value</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Value</em>' attribute list.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getScalarType_TypeValue()
   * @model unique="false"
   * @generated
   */
  EList<String> getTypeValue();

} // ScalarType
