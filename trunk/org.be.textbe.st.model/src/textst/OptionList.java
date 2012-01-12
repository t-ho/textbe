/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textst;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textst.OptionList#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see textst.TextstPackage#getOptionList()
 * @model
 * @generated
 */
public interface OptionList extends EObject
{
  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link textst.Option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see textst.TextstPackage#getOptionList_Options()
   * @model type="textst.Option" containment="true" required="true"
   * @generated
   */
  EList getOptions();

} // OptionList
