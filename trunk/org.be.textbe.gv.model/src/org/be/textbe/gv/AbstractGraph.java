/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.gv.AbstractGraph#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.gv.GvPackage#getAbstractGraph()
 * @model abstract="true"
 * @generated
 */
public interface AbstractGraph extends Identifiable
{
  /**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference.
	 * @see #setStatements(StatementList)
	 * @see org.be.textbe.gv.GvPackage#getAbstractGraph_Statements()
	 * @model containment="true"
	 * @generated
	 */
  StatementList getStatements();

  /**
	 * Sets the value of the '{@link org.be.textbe.gv.AbstractGraph#getStatements <em>Statements</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statements</em>' containment reference.
	 * @see #getStatements()
	 * @generated
	 */
  void setStatements(StatementList value);

} // AbstractGraph
