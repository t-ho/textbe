/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.componentInstantiation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationPackage
 * @generated
 */
public interface ComponentInstantiationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentInstantiationFactory eINSTANCE = org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>For All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For All</em>'.
	 * @generated
	 */
	ForAll createForAll();

	/**
	 * Returns a new object of class '<em>For Some</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Some</em>'.
	 * @generated
	 */
	ForSome createForSome();

	/**
	 * Returns a new object of class '<em>At Least One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>At Least One</em>'.
	 * @generated
	 */
	AtLeastOne createAtLeastOne();

	/**
	 * Returns a new object of class '<em>For One Arbitrary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For One Arbitrary</em>'.
	 * @generated
	 */
	ForOneArbitrary createForOneArbitrary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentInstantiationPackage getComponentInstantiationPackage();

} //ComponentInstantiationFactory
