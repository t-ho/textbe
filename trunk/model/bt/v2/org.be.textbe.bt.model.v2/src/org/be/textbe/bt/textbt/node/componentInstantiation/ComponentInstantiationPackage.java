/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.componentInstantiation;

import org.be.textbe.bt.textbt.node.NodePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentInstantiationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentInstantiation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.be.textbe/textbt/node/componentInstantiation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentInstantiation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentInstantiationPackage eINSTANCE = org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationNodeImpl
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationPackageImpl#getComponentInstantiationNode()
	 * @generated
	 */
	int COMPONENT_INSTANTIATION_NODE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_NODE__LABEL = NodePackage.NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_NODE__OPERATION = NodePackage.NODE__OPERATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_NODE__PARENT = NodePackage.NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_NODE__PARENTS = NodePackage.NODE__PARENTS;

	/**
	 * The feature id for the '<em><b>Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_NODE__SIBLINGS = NodePackage.NODE__SIBLINGS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_NODE__CHILDREN = NodePackage.NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_NODE__DESCENDANTS = NodePackage.NODE__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Sibling Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_NODE__SIBLING_BRANCHES = NodePackage.NODE__SIBLING_BRANCHES;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_NODE__IS_ROOT = NodePackage.NODE__IS_ROOT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_NODE__IS_LEAF = NodePackage.NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_NODE__MEMBER = NodePackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_NODE__EXPRESSION = NodePackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_NODE_FEATURE_COUNT = NodePackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.componentInstantiation.impl.ForAllImpl <em>For All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ForAllImpl
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationPackageImpl#getForAll()
	 * @generated
	 */
	int FOR_ALL = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__LABEL = COMPONENT_INSTANTIATION_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__OPERATION = COMPONENT_INSTANTIATION_NODE__OPERATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__PARENT = COMPONENT_INSTANTIATION_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__PARENTS = COMPONENT_INSTANTIATION_NODE__PARENTS;

	/**
	 * The feature id for the '<em><b>Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__SIBLINGS = COMPONENT_INSTANTIATION_NODE__SIBLINGS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__CHILDREN = COMPONENT_INSTANTIATION_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__DESCENDANTS = COMPONENT_INSTANTIATION_NODE__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Sibling Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__SIBLING_BRANCHES = COMPONENT_INSTANTIATION_NODE__SIBLING_BRANCHES;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__IS_ROOT = COMPONENT_INSTANTIATION_NODE__IS_ROOT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__IS_LEAF = COMPONENT_INSTANTIATION_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__MEMBER = COMPONENT_INSTANTIATION_NODE__MEMBER;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__EXPRESSION = COMPONENT_INSTANTIATION_NODE__EXPRESSION;

	/**
	 * The number of structural features of the '<em>For All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_FEATURE_COUNT = COMPONENT_INSTANTIATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.componentInstantiation.impl.ForSomeImpl <em>For Some</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ForSomeImpl
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationPackageImpl#getForSome()
	 * @generated
	 */
	int FOR_SOME = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__LABEL = COMPONENT_INSTANTIATION_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__OPERATION = COMPONENT_INSTANTIATION_NODE__OPERATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__PARENT = COMPONENT_INSTANTIATION_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__PARENTS = COMPONENT_INSTANTIATION_NODE__PARENTS;

	/**
	 * The feature id for the '<em><b>Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__SIBLINGS = COMPONENT_INSTANTIATION_NODE__SIBLINGS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__CHILDREN = COMPONENT_INSTANTIATION_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__DESCENDANTS = COMPONENT_INSTANTIATION_NODE__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Sibling Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__SIBLING_BRANCHES = COMPONENT_INSTANTIATION_NODE__SIBLING_BRANCHES;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__IS_ROOT = COMPONENT_INSTANTIATION_NODE__IS_ROOT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__IS_LEAF = COMPONENT_INSTANTIATION_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__MEMBER = COMPONENT_INSTANTIATION_NODE__MEMBER;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__EXPRESSION = COMPONENT_INSTANTIATION_NODE__EXPRESSION;

	/**
	 * The number of structural features of the '<em>For Some</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME_FEATURE_COUNT = COMPONENT_INSTANTIATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.componentInstantiation.impl.AtLeastOneImpl <em>At Least One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.AtLeastOneImpl
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationPackageImpl#getAtLeastOne()
	 * @generated
	 */
	int AT_LEAST_ONE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__LABEL = COMPONENT_INSTANTIATION_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__OPERATION = COMPONENT_INSTANTIATION_NODE__OPERATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__PARENT = COMPONENT_INSTANTIATION_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__PARENTS = COMPONENT_INSTANTIATION_NODE__PARENTS;

	/**
	 * The feature id for the '<em><b>Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__SIBLINGS = COMPONENT_INSTANTIATION_NODE__SIBLINGS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__CHILDREN = COMPONENT_INSTANTIATION_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__DESCENDANTS = COMPONENT_INSTANTIATION_NODE__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Sibling Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__SIBLING_BRANCHES = COMPONENT_INSTANTIATION_NODE__SIBLING_BRANCHES;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__IS_ROOT = COMPONENT_INSTANTIATION_NODE__IS_ROOT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__IS_LEAF = COMPONENT_INSTANTIATION_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__MEMBER = COMPONENT_INSTANTIATION_NODE__MEMBER;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__EXPRESSION = COMPONENT_INSTANTIATION_NODE__EXPRESSION;

	/**
	 * The number of structural features of the '<em>At Least One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE_FEATURE_COUNT = COMPONENT_INSTANTIATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.componentInstantiation.impl.ForOneArbitraryImpl <em>For One Arbitrary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ForOneArbitraryImpl
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationPackageImpl#getForOneArbitrary()
	 * @generated
	 */
	int FOR_ONE_ARBITRARY = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__LABEL = COMPONENT_INSTANTIATION_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__OPERATION = COMPONENT_INSTANTIATION_NODE__OPERATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__PARENT = COMPONENT_INSTANTIATION_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__PARENTS = COMPONENT_INSTANTIATION_NODE__PARENTS;

	/**
	 * The feature id for the '<em><b>Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__SIBLINGS = COMPONENT_INSTANTIATION_NODE__SIBLINGS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__CHILDREN = COMPONENT_INSTANTIATION_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__DESCENDANTS = COMPONENT_INSTANTIATION_NODE__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Sibling Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__SIBLING_BRANCHES = COMPONENT_INSTANTIATION_NODE__SIBLING_BRANCHES;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__IS_ROOT = COMPONENT_INSTANTIATION_NODE__IS_ROOT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__IS_LEAF = COMPONENT_INSTANTIATION_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__MEMBER = COMPONENT_INSTANTIATION_NODE__MEMBER;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__EXPRESSION = COMPONENT_INSTANTIATION_NODE__EXPRESSION;

	/**
	 * The number of structural features of the '<em>For One Arbitrary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY_FEATURE_COUNT = COMPONENT_INSTANTIATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Component Set Definition Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationPackageImpl#getComponentSetDefinitionExpression()
	 * @generated
	 */
	int COMPONENT_SET_DEFINITION_EXPRESSION = 5;


	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.componentInstantiation.ForAll <em>For All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For All</em>'.
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.ForAll
	 * @generated
	 */
	EClass getForAll();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.componentInstantiation.ForSome <em>For Some</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Some</em>'.
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.ForSome
	 * @generated
	 */
	EClass getForSome();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.componentInstantiation.AtLeastOne <em>At Least One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At Least One</em>'.
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.AtLeastOne
	 * @generated
	 */
	EClass getAtLeastOne();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.componentInstantiation.ForOneArbitrary <em>For One Arbitrary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For One Arbitrary</em>'.
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.ForOneArbitrary
	 * @generated
	 */
	EClass getForOneArbitrary();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationNode
	 * @generated
	 */
	EClass getComponentInstantiationNode();

	/**
	 * Returns the meta object for the reference '{@link org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationNode#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationNode#getMember()
	 * @see #getComponentInstantiationNode()
	 * @generated
	 */
	EReference getComponentInstantiationNode_Member();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationNode#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationNode#getExpression()
	 * @see #getComponentInstantiationNode()
	 * @generated
	 */
	EAttribute getComponentInstantiationNode_Expression();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Component Set Definition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Component Set Definition Expression</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getComponentSetDefinitionExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentInstantiationFactory getComponentInstantiationFactory();

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
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.componentInstantiation.impl.ForAllImpl <em>For All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ForAllImpl
		 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationPackageImpl#getForAll()
		 * @generated
		 */
		EClass FOR_ALL = eINSTANCE.getForAll();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.componentInstantiation.impl.ForSomeImpl <em>For Some</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ForSomeImpl
		 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationPackageImpl#getForSome()
		 * @generated
		 */
		EClass FOR_SOME = eINSTANCE.getForSome();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.componentInstantiation.impl.AtLeastOneImpl <em>At Least One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.AtLeastOneImpl
		 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationPackageImpl#getAtLeastOne()
		 * @generated
		 */
		EClass AT_LEAST_ONE = eINSTANCE.getAtLeastOne();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.componentInstantiation.impl.ForOneArbitraryImpl <em>For One Arbitrary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ForOneArbitraryImpl
		 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationPackageImpl#getForOneArbitrary()
		 * @generated
		 */
		EClass FOR_ONE_ARBITRARY = eINSTANCE.getForOneArbitrary();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationNodeImpl
		 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationPackageImpl#getComponentInstantiationNode()
		 * @generated
		 */
		EClass COMPONENT_INSTANTIATION_NODE = eINSTANCE.getComponentInstantiationNode();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANTIATION_NODE__MEMBER = eINSTANCE.getComponentInstantiationNode_Member();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANTIATION_NODE__EXPRESSION = eINSTANCE.getComponentInstantiationNode_Expression();

		/**
		 * The meta object literal for the '<em>Component Set Definition Expression</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationPackageImpl#getComponentSetDefinitionExpression()
		 * @generated
		 */
		EDataType COMPONENT_SET_DEFINITION_EXPRESSION = eINSTANCE.getComponentSetDefinitionExpression();

	}

} //ComponentInstantiationPackage
