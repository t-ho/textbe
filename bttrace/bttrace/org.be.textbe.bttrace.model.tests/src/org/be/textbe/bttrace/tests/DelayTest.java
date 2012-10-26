/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bttrace.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.be.textbe.bttrace.BttraceFactory;
import org.be.textbe.bttrace.Delay;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DelayTest extends TestCase {

	/**
	 * The fixture for this Delay test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Delay fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DelayTest.class);
	}

	/**
	 * Constructs a new Delay test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Delay test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Delay fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Delay test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Delay getFixture() {
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
		setFixture(BttraceFactory.eINSTANCE.createDelay());
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

} //DelayTest
