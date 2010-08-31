/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.ct.textct;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.ct.textct.RelationalBehavior#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.RelationalBehavior#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.ct.textct.TextctPackage#getRelationalBehavior()
 * @model
 * @generated
 */
public interface RelationalBehavior extends AbstractBehavior
{
  /**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behavior</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference.
	 * @see #setBehavior(Behavior)
	 * @see org.be.textbe.ct.textct.TextctPackage#getRelationalBehavior_Behavior()
	 * @model containment="true" required="true"
	 * @generated
	 */
  Behavior getBehavior();

  /**
	 * Sets the value of the '{@link org.be.textbe.ct.textct.RelationalBehavior#getBehavior <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' containment reference.
	 * @see #getBehavior()
	 * @generated
	 */
  void setBehavior(Behavior value);

  /**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.be.textbe.ct.textct.Relation}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see org.be.textbe.ct.textct.TextctPackage#getRelationalBehavior_Relations()
	 * @model containment="true" required="true"
	 * @generated
	 */
  EList<Relation> getRelations();

} // RelationalBehavior
