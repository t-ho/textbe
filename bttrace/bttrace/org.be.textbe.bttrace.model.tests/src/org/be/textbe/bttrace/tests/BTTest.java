/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bttrace.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.be.textbe.bttrace.BT;
import org.be.textbe.bttrace.BttraceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BT</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BTTest extends TestCase {

	/**
	 * The fixture for this BT test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BT fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BTTest.class);
	}

	/**
	 * Constructs a new BT test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this BT test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BT fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this BT test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BT getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BttraceFactory.eINSTANCE.createBT());
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

} //BTTest
