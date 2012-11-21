/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.v1.textbt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.v1.textbt.Behavior#getNumber <em>Number</em>}</li>
 *   <li>{@link org.be.textbe.bt.v1.textbt.Behavior#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.be.textbe.bt.v1.textbt.Behavior#getId <em>Id</em>}</li>
 *   <li>{@link org.be.textbe.bt.v1.textbt.Behavior#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.v1.textbt.TextbtPackage#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior extends EObject
{
  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see org.be.textbe.bt.v1.textbt.TextbtPackage#getBehavior_Number()
   * @model required="true" transient="true"
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link org.be.textbe.bt.v1.textbt.Behavior#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link org.be.textbe.bt.v1.textbt.Relation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see org.be.textbe.bt.v1.textbt.TextbtPackage#getBehavior_Relations()
   * @model containment="true"
   * @generated
   */
  EList<Relation> getRelations();

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.be.textbe.bt.v1.textbt.TextbtPackage#getBehavior_Id()
   * @model default="" id="true" required="true" transient="true" volatile="true" derived="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.be.textbe.bt.v1.textbt.Behavior#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Component</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.be.textbe.bt.v1.textbt.Component#getBehavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' container reference.
   * @see #setComponent(Component)
   * @see org.be.textbe.bt.v1.textbt.TextbtPackage#getBehavior_Component()
   * @see org.be.textbe.bt.v1.textbt.Component#getBehavior
   * @model opposite="behavior" required="true" transient="false"
   * @generated
   */
  Component getComponent();

  /**
   * Sets the value of the '{@link org.be.textbe.bt.v1.textbt.Behavior#getComponent <em>Component</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' container reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(Component value);

} // Behavior
