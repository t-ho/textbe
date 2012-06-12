/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bttrace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bttrace.Node#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bttrace.BttracePackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see org.be.textbe.bttrace.BttracePackage#getNode_Value()
	 * @model required="true"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link org.be.textbe.bttrace.Node#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

} // Node
