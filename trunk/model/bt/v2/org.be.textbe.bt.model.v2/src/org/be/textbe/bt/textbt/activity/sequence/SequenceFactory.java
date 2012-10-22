/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.activity.sequence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt.textbt.activity.sequence.SequencePackage
 * @generated
 */
public interface SequenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SequenceFactory eINSTANCE = org.be.textbe.bt.textbt.activity.sequence.impl.SequenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic</em>'.
	 * @generated
	 */
	Atomic createAtomic();

	/**
	 * Returns a new object of class '<em>Interleaving</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interleaving</em>'.
	 * @generated
	 */
	Interleaving createInterleaving();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SequencePackage getSequencePackage();

} //SequenceFactory
