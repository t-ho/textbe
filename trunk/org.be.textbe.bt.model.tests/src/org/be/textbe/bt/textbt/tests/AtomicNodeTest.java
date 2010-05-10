/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.tests;

import junit.textui.TestRunner;

import org.be.textbe.bt.textbt.AtomicNode;
import org.be.textbe.bt.textbt.TextbtFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atomic Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicNodeTest extends AbstractNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtomicNodeTest.class);
	}

	/**
	 * Constructs a new Atomic Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Atomic Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AtomicNode getFixture() {
		return (AtomicNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TextbtFactory.eINSTANCE.createAtomicNode());
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

} //AtomicNodeTest
