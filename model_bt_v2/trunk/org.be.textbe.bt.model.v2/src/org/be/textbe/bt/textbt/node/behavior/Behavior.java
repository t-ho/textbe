/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.behavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * the behaviour associated with the component
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.behavior.Behavior#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.node.behavior.BehaviorPackage#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior extends EObject {
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
	 * @see org.be.textbe.bt.textbt.node.behavior.BehaviorPackage#getBehavior_Id()
	 * @model default="" id="true" required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	String getId();

} // Behavior
