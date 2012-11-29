/**
 */
package org.be.textbe.bt.textbt.component.behavior.event;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt.textbt.component.behavior.event.EventPackage
 * @generated
 */
public interface EventFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventFactory eINSTANCE = org.be.textbe.bt.textbt.component.behavior.event.impl.EventFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Internal Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Output</em>'.
	 * @generated
	 */
	InternalOutput createInternalOutput();

	/**
	 * Returns a new object of class '<em>Internal Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Input</em>'.
	 * @generated
	 */
	InternalInput createInternalInput();

	/**
	 * Returns a new object of class '<em>External Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Input</em>'.
	 * @generated
	 */
	ExternalInput createExternalInput();

	/**
	 * Returns a new object of class '<em>External Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Output</em>'.
	 * @generated
	 */
	ExternalOutput createExternalOutput();

	/**
	 * Returns a new object of class '<em>Textual Event Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textual Event Definition</em>'.
	 * @generated
	 */
	TextualEventDefinition createTextualEventDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EventPackage getEventPackage();

} //EventFactory
