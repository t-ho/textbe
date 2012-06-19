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
import org.be.textbe.bttrace.TextBTTrace;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text BT Trace</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextBTTraceTest extends TestCase {

	/**
	 * The fixture for this Text BT Trace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextBTTrace fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextBTTraceTest.class);
	}

	/**
	 * Constructs a new Text BT Trace test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBTTraceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Text BT Trace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TextBTTrace fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Text BT Trace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextBTTrace getFixture() {
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
		setFixture(BttraceFactory.eINSTANCE.createTextBTTrace());
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

} //TextBTTraceTest
