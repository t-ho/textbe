/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.tests;

import junit.textui.TestRunner;

import org.be.textbe.bt.textbt.InternalInput;
import org.be.textbe.bt.textbt.TextbtFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Internal Input</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalInputTest extends BehaviorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InternalInputTest.class);
	}

	/**
	 * Constructs a new Internal Input test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalInputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Internal Input test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InternalInput getFixture() {
		return (InternalInput)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TextbtFactory.eINSTANCE.createInternalInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //InternalInputTest
