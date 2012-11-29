/**
 */
package org.be.textbe.bt.textbt.component.behavior.state;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual State Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition of a state by means of a textual language. This may be a formal language.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.component.behavior.state.TextualStateDefinition#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.component.behavior.state.StatePackage#getTextualStateDefinition()
 * @model
 * @generated
 */
public interface TextualStateDefinition extends StateDefinition {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string expression that defines the state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.be.textbe.bt.textbt.component.behavior.state.StatePackage#getTextualStateDefinition_Expression()
	 * @model dataType="org.be.textbe.bt.textbt.component.behavior.state.StateExpression" required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.component.behavior.state.TextualStateDefinition#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // TextualStateDefinition
