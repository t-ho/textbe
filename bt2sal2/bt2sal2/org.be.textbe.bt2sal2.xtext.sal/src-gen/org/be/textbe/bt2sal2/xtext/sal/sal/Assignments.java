/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.Assignments#getFirstSimpleDefinition <em>First Simple Definition</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.Assignments#getNextSimpleDefinition <em>Next Simple Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getAssignments()
 * @model
 * @generated
 */
public interface Assignments extends EObject
{
  /**
   * Returns the value of the '<em><b>First Simple Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Simple Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Simple Definition</em>' containment reference.
   * @see #setFirstSimpleDefinition(SimpleDefinition)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getAssignments_FirstSimpleDefinition()
   * @model containment="true"
   * @generated
   */
  SimpleDefinition getFirstSimpleDefinition();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Assignments#getFirstSimpleDefinition <em>First Simple Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Simple Definition</em>' containment reference.
   * @see #getFirstSimpleDefinition()
   * @generated
   */
  void setFirstSimpleDefinition(SimpleDefinition value);

  /**
   * Returns the value of the '<em><b>Next Simple Definition</b></em>' containment reference list.
   * The list contents are of type {@link org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Simple Definition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Simple Definition</em>' containment reference list.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getAssignments_NextSimpleDefinition()
   * @model containment="true"
   * @generated
   */
  EList<SimpleDefinition> getNextSimpleDefinition();

} // Assignments
