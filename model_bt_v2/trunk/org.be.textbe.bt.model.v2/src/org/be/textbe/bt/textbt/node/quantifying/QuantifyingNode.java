/**
 */
package org.be.textbe.bt.textbt.node.quantifying;

import org.be.textbe.bt.textbt.component.Component;

import org.be.textbe.bt.textbt.node.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Component Set Node binds a member variable to a component type. The variable can then be used in the descendant tree to refer to the behavior specified by the type of the component set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode#getSet <em>Set</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingPackage#getQuantifyingNode()
 * @model abstract="true"
 * @generated
 */
public interface QuantifyingNode extends Node {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The member of the set defined by the expression that is being bound.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Component)
	 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingPackage#getQuantifyingNode_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Component getVariable();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Component value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of components that this node uses as base for Quantification
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set</em>' containment reference.
	 * @see #setSet(ComponentSetDefinition)
	 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingPackage#getQuantifyingNode_Set()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentSetDefinition getSet();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode#getSet <em>Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' containment reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(ComponentSetDefinition value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definition of the set of components that this quantifier pertains to
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(ComponentSetDefinition)
	 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingPackage#getQuantifyingNode_Definition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentSetDefinition getDefinition();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ComponentSetDefinition value);

} // QuantifyingNode
