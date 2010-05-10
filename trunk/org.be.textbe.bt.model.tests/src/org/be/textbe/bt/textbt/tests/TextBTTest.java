/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.be.textbe.bt.textbt.TextBT;
import org.be.textbe.bt.textbt.TextbtFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text BT</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextBTTest extends TestCase {

	/**
	 * The fixture for this Text BT test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextBT fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextBTTest.class);
	}

	/**
	 * Constructs a new Text BT test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBTTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Text BT test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TextBT fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Text BT test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextBT getFixture() {
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
		setFixture(TextbtFactory.eINSTANCE.createTextBT());
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

} //TextBTTest
