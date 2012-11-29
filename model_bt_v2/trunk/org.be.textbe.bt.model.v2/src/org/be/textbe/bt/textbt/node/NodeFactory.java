/**
 */
package org.be.textbe.bt.textbt.node;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt.textbt.node.NodePackage
 * @generated
 */
public interface NodeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodeFactory eINSTANCE = org.be.textbe.bt.textbt.node.impl.NodeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behavior Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Node</em>'.
	 * @generated
	 */
	BehaviorNode createBehaviorNode();

	/**
	 * Returns a new object of class '<em>Label Only Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Only Node</em>'.
	 * @generated
	 */
	LabelOnlyNode createLabelOnlyNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NodePackage getNodePackage();

} //NodeFactory
