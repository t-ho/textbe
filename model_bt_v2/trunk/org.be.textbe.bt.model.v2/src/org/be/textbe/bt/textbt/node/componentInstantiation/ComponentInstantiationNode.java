/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.componentInstantiation;

import org.be.textbe.bt.textbt.component.Member;

import org.be.textbe.bt.textbt.node.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Component Set Node binds a variable to a component type. The variable can then be used in the descendant tree to refer to the behavior specified by the type of the component set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationNode#getMember <em>Member</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationNode#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationPackage#getComponentInstantiationNode()
 * @model abstract="true"
 * @generated
 */
public interface ComponentInstantiationNode extends Node {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(Member)
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationPackage#getComponentInstantiationNode_Member()
	 * @model required="true"
	 * @generated
	 */
	Member getMember();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationNode#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(Member value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(Object)
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationPackage#getComponentInstantiationNode_Expression()
	 * @model dataType="org.be.textbe.bt.textbt.node.componentInstantiation.ComponentSetDefinitionExpression"
	 * @generated
	 */
	Object getExpression();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationNode#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Object value);

} // ComponentInstantiationNode
