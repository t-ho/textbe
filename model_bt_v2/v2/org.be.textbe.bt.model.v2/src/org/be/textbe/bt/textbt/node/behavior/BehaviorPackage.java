/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.behavior;

import org.be.textbe.bt.textbt.node.NodePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt.textbt.node.behavior.BehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.be.textbe/textbt/component/behavior";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorPackage eINSTANCE = org.be.textbe.bt.textbt.node.behavior.impl.BehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.behavior.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.behavior.impl.BehaviorImpl
	 * @see org.be.textbe.bt.textbt.node.behavior.impl.BehaviorPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__ID = 0;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.behavior.impl.BehaviorNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.behavior.impl.BehaviorNodeImpl
	 * @see org.be.textbe.bt.textbt.node.behavior.impl.BehaviorPackageImpl#getBehaviorNode()
	 * @generated
	 */
	int BEHAVIOR_NODE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_NODE__LABEL = NodePackage.NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_NODE__OPERATION = NodePackage.NODE__OPERATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_NODE__PARENT = NodePackage.NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_NODE__PARENTS = NodePackage.NODE__PARENTS;

	/**
	 * The feature id for the '<em><b>Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_NODE__SIBLINGS = NodePackage.NODE__SIBLINGS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_NODE__CHILDREN = NodePackage.NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_NODE__DESCENDANTS = NodePackage.NODE__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Sibling Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_NODE__SIBLING_BRANCHES = NodePackage.NODE__SIBLING_BRANCHES;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_NODE__IS_ROOT = NodePackage.NODE__IS_ROOT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_NODE__IS_LEAF = NodePackage.NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Traceability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_NODE__TRACEABILITY = NodePackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_NODE__BEHAVIOR = NodePackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_NODE__ACTOR = NodePackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_NODE_FEATURE_COUNT = NodePackage.NODE_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.behavior.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.node.behavior.Behavior#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.Behavior#getId()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Id();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.behavior.BehaviorNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.BehaviorNode
	 * @generated
	 */
	EClass getBehaviorNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.bt.textbt.node.behavior.BehaviorNode#getTraceability <em>Traceability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Traceability</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.BehaviorNode#getTraceability()
	 * @see #getBehaviorNode()
	 * @generated
	 */
	EReference getBehaviorNode_Traceability();

	/**
	 * Returns the meta object for the reference '{@link org.be.textbe.bt.textbt.node.behavior.BehaviorNode#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.BehaviorNode#getBehavior()
	 * @see #getBehaviorNode()
	 * @generated
	 */
	EReference getBehaviorNode_Behavior();

	/**
	 * Returns the meta object for the reference '{@link org.be.textbe.bt.textbt.node.behavior.BehaviorNode#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.BehaviorNode#getActor()
	 * @see #getBehaviorNode()
	 * @generated
	 */
	EReference getBehaviorNode_Actor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviorFactory getBehaviorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.behavior.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.behavior.impl.BehaviorImpl
		 * @see org.be.textbe.bt.textbt.node.behavior.impl.BehaviorPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__ID = eINSTANCE.getBehavior_Id();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.behavior.impl.BehaviorNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.behavior.impl.BehaviorNodeImpl
		 * @see org.be.textbe.bt.textbt.node.behavior.impl.BehaviorPackageImpl#getBehaviorNode()
		 * @generated
		 */
		EClass BEHAVIOR_NODE = eINSTANCE.getBehaviorNode();

		/**
		 * The meta object literal for the '<em><b>Traceability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_NODE__TRACEABILITY = eINSTANCE.getBehaviorNode_Traceability();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_NODE__BEHAVIOR = eINSTANCE.getBehaviorNode_Behavior();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_NODE__ACTOR = eINSTANCE.getBehaviorNode_Actor();

	}

} //BehaviorPackage
