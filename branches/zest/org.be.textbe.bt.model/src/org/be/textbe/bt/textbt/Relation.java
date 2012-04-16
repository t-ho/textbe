/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.Relation#isMultiLevel <em>Multi Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.TextbtPackage#getRelation()
 * @model abstract="true"
 * @generated
 */
public interface Relation extends EObject
{

  /**
   * Returns the value of the '<em><b>Multi Level</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi Level</em>' attribute.
   * @see #setMultiLevel(boolean)
   * @see org.be.textbe.bt.textbt.TextbtPackage#getRelation_MultiLevel()
   * @model default="false" required="true"
   * @generated
   */
  boolean isMultiLevel();

  /**
   * Sets the value of the '{@link org.be.textbe.bt.textbt.Relation#isMultiLevel <em>Multi Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multi Level</em>' attribute.
   * @see #isMultiLevel()
   * @generated
   */
  void setMultiLevel(boolean value);
} // Relation
