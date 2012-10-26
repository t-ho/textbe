/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.Definitions#getFirstDefinition <em>First Definition</em>}</li>
 *   <li>{@link org.be.textbe.bt2sal2.xtext.sal.sal.Definitions#getNextDefinition <em>Next Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getDefinitions()
 * @model
 * @generated
 */
public interface Definitions extends EObject
{
  /**
   * Returns the value of the '<em><b>First Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Definition</em>' containment reference.
   * @see #setFirstDefinition(Definition)
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getDefinitions_FirstDefinition()
   * @model containment="true"
   * @generated
   */
  Definition getFirstDefinition();

  /**
   * Sets the value of the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Definitions#getFirstDefinition <em>First Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Definition</em>' containment reference.
   * @see #getFirstDefinition()
   * @generated
   */
  void setFirstDefinition(Definition value);

  /**
   * Returns the value of the '<em><b>Next Definition</b></em>' containment reference list.
   * The list contents are of type {@link org.be.textbe.bt2sal2.xtext.sal.sal.Definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Definition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Definition</em>' containment reference list.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#getDefinitions_NextDefinition()
   * @model containment="true"
   * @generated
   */
  EList<Definition> getNextDefinition();

} // Definitions
