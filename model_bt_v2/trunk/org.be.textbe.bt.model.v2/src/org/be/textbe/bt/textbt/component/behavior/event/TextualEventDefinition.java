/**
 */
package org.be.textbe.bt.textbt.component.behavior.event;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A definition of an event given as text
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.component.behavior.event.TextualEventDefinition#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.component.behavior.event.EventPackage#getTextualEventDefinition()
 * @model
 * @generated
 */
public interface TextualEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the string that defines the event
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.be.textbe.bt.textbt.component.behavior.event.EventPackage#getTextualEventDefinition_Expression()
	 * @model dataType="org.be.textbe.bt.textbt.component.behavior.event.EventExpression" required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.component.behavior.event.TextualEventDefinition#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // TextualEventDefinition
