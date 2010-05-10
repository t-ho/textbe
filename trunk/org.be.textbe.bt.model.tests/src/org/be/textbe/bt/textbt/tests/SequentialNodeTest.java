/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.tests;

import junit.textui.TestRunner;

import org.be.textbe.bt.textbt.SequentialNode;
import org.be.textbe.bt.textbt.TextbtFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sequential Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequentialNodeTest extends AbstractNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SequentialNodeTest.class);
	}

	/**
	 * Constructs a new Sequential Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sequential Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SequentialNode getFixture() {
		return (SequentialNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TextbtFactory.eINSTANCE.createSequentialNode());
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

} //SequentialNodeTest
