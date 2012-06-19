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
import org.be.textbe.bttrace.NodeGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeGroupTest extends TestCase {

	/**
	 * The fixture for this Node Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeGroup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeGroupTest.class);
	}

	/**
	 * Constructs a new Node Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeGroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Node Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NodeGroup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Node Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeGroup getFixture() {
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
		setFixture(BttraceFactory.eINSTANCE.createNodeGroup());
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

} //NodeGroupTest
