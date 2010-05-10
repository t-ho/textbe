/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.tests;

import junit.textui.TestRunner;

import org.be.textbe.bt.textbt.ExternalInput;
import org.be.textbe.bt.textbt.TextbtFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Input</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalInputTest extends BehaviorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalInputTest.class);
	}

	/**
	 * Constructs a new External Input test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalInputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this External Input test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExternalInput getFixture() {
		return (ExternalInput)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TextbtFactory.eINSTANCE.createExternalInput());
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

} //ExternalInputTest
