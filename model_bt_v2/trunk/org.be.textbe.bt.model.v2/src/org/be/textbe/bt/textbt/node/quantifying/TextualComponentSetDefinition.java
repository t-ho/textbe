/**
 */
package org.be.textbe.bt.textbt.node.quantifying;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Component Set Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A definition of a set of components given as text.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.node.quantifying.TextualComponentSetDefinition#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingPackage#getTextualComponentSetDefinition()
 * @model
 * @generated
 */
public interface TextualComponentSetDefinition extends ComponentSetDefinition {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An expression that defines how to create the node set at this time. The expression selects a subset of all components contained in the system and binds this set to member variables that can be addressed in the subtree.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingPackage#getTextualComponentSetDefinition_Expression()
	 * @model dataType="org.be.textbe.bt.textbt.node.quantifying.ComponentSetDefinitionExpression" required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.node.quantifying.TextualComponentSetDefinition#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // TextualComponentSetDefinition
