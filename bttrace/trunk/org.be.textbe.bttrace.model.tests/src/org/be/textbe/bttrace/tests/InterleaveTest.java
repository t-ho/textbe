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
import org.be.textbe.bttrace.Interleave;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interleave</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterleaveTest extends TestCase {

	/**
	 * The fixture for this Interleave test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interleave fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterleaveTest.class);
	}

	/**
	 * Constructs a new Interleave test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterleaveTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Interleave test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Interleave fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Interleave test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interleave getFixture() {
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
		setFixture(BttraceFactory.eINSTANCE.createInterleave());
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

} //InterleaveTest
