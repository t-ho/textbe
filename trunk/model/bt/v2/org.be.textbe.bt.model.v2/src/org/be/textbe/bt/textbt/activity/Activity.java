/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.activity;

import org.be.textbe.bt.textbt.BehaviorTree;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An activity groups the behavior of nodes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.activity.Activity#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.activity.ActivityPackage#getActivity()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Activity extends BehaviorTree {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(BehaviorTree)
	 * @see org.be.textbe.bt.textbt.activity.ActivityPackage#getActivity_Child()
	 * @model containment="true"
	 * @generated
	 */
	BehaviorTree getChild();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.activity.Activity#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(BehaviorTree value);

} // Activity
