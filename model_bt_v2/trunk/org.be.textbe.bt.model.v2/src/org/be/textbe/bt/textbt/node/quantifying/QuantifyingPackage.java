/**
 */
package org.be.textbe.bt.textbt.node.quantifying;

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
 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingFactory
 * @model kind="package"
 * @generated
 */
public interface QuantifyingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "quantifying";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.be.textbe/textbt/node/quantifying";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "quantifying";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuantifyingPackage eINSTANCE = org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingNodeImpl
	 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getQuantifyingNode()
	 * @generated
	 */
	int QUANTIFYING_NODE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFYING_NODE__LABEL = NodePackage.NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFYING_NODE__PARENT = NodePackage.NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFYING_NODE__PARENTS = NodePackage.NODE__PARENTS;

	/**
	 * The feature id for the '<em><b>Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFYING_NODE__SIBLINGS = NodePackage.NODE__SIBLINGS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFYING_NODE__CHILDREN = NodePackage.NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFYING_NODE__DESCENDANTS = NodePackage.NODE__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Sibling Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFYING_NODE__SIBLING_BRANCHES = NodePackage.NODE__SIBLING_BRANCHES;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFYING_NODE__ROOT = NodePackage.NODE__ROOT;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFYING_NODE__LEAF = NodePackage.NODE__LEAF;

	/**
	 * The feature id for the '<em><b>Traceability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFYING_NODE__TRACEABILITY = NodePackage.NODE__TRACEABILITY;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFYING_NODE__VARIABLE = NodePackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFYING_NODE__SET = NodePackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFYING_NODE__DEFINITION = NodePackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFYING_NODE_FEATURE_COUNT = NodePackage.NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.quantifying.impl.ForAllImpl <em>For All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.quantifying.impl.ForAllImpl
	 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getForAll()
	 * @generated
	 */
	int FOR_ALL = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__LABEL = QUANTIFYING_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__PARENT = QUANTIFYING_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__PARENTS = QUANTIFYING_NODE__PARENTS;

	/**
	 * The feature id for the '<em><b>Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__SIBLINGS = QUANTIFYING_NODE__SIBLINGS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__CHILDREN = QUANTIFYING_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__DESCENDANTS = QUANTIFYING_NODE__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Sibling Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__SIBLING_BRANCHES = QUANTIFYING_NODE__SIBLING_BRANCHES;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__ROOT = QUANTIFYING_NODE__ROOT;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__LEAF = QUANTIFYING_NODE__LEAF;

	/**
	 * The feature id for the '<em><b>Traceability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__TRACEABILITY = QUANTIFYING_NODE__TRACEABILITY;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__VARIABLE = QUANTIFYING_NODE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__SET = QUANTIFYING_NODE__SET;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL__DEFINITION = QUANTIFYING_NODE__DEFINITION;

	/**
	 * The number of structural features of the '<em>For All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_FEATURE_COUNT = QUANTIFYING_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.quantifying.impl.ForSomeImpl <em>For Some</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.quantifying.impl.ForSomeImpl
	 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getForSome()
	 * @generated
	 */
	int FOR_SOME = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__LABEL = QUANTIFYING_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__PARENT = QUANTIFYING_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__PARENTS = QUANTIFYING_NODE__PARENTS;

	/**
	 * The feature id for the '<em><b>Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__SIBLINGS = QUANTIFYING_NODE__SIBLINGS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__CHILDREN = QUANTIFYING_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__DESCENDANTS = QUANTIFYING_NODE__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Sibling Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__SIBLING_BRANCHES = QUANTIFYING_NODE__SIBLING_BRANCHES;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__ROOT = QUANTIFYING_NODE__ROOT;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__LEAF = QUANTIFYING_NODE__LEAF;

	/**
	 * The feature id for the '<em><b>Traceability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__TRACEABILITY = QUANTIFYING_NODE__TRACEABILITY;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__VARIABLE = QUANTIFYING_NODE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__SET = QUANTIFYING_NODE__SET;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME__DEFINITION = QUANTIFYING_NODE__DEFINITION;

	/**
	 * The number of structural features of the '<em>For Some</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_SOME_FEATURE_COUNT = QUANTIFYING_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.quantifying.impl.AtLeastOneImpl <em>At Least One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.quantifying.impl.AtLeastOneImpl
	 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getAtLeastOne()
	 * @generated
	 */
	int AT_LEAST_ONE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__LABEL = QUANTIFYING_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__PARENT = QUANTIFYING_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__PARENTS = QUANTIFYING_NODE__PARENTS;

	/**
	 * The feature id for the '<em><b>Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__SIBLINGS = QUANTIFYING_NODE__SIBLINGS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__CHILDREN = QUANTIFYING_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__DESCENDANTS = QUANTIFYING_NODE__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Sibling Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__SIBLING_BRANCHES = QUANTIFYING_NODE__SIBLING_BRANCHES;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__ROOT = QUANTIFYING_NODE__ROOT;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__LEAF = QUANTIFYING_NODE__LEAF;

	/**
	 * The feature id for the '<em><b>Traceability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__TRACEABILITY = QUANTIFYING_NODE__TRACEABILITY;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__VARIABLE = QUANTIFYING_NODE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__SET = QUANTIFYING_NODE__SET;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE__DEFINITION = QUANTIFYING_NODE__DEFINITION;

	/**
	 * The number of structural features of the '<em>At Least One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_ONE_FEATURE_COUNT = QUANTIFYING_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.quantifying.impl.ForOneArbitraryImpl <em>For One Arbitrary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.quantifying.impl.ForOneArbitraryImpl
	 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getForOneArbitrary()
	 * @generated
	 */
	int FOR_ONE_ARBITRARY = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__LABEL = QUANTIFYING_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__PARENT = QUANTIFYING_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__PARENTS = QUANTIFYING_NODE__PARENTS;

	/**
	 * The feature id for the '<em><b>Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__SIBLINGS = QUANTIFYING_NODE__SIBLINGS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__CHILDREN = QUANTIFYING_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__DESCENDANTS = QUANTIFYING_NODE__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Sibling Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__SIBLING_BRANCHES = QUANTIFYING_NODE__SIBLING_BRANCHES;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__ROOT = QUANTIFYING_NODE__ROOT;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__LEAF = QUANTIFYING_NODE__LEAF;

	/**
	 * The feature id for the '<em><b>Traceability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__TRACEABILITY = QUANTIFYING_NODE__TRACEABILITY;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__VARIABLE = QUANTIFYING_NODE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__SET = QUANTIFYING_NODE__SET;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY__DEFINITION = QUANTIFYING_NODE__DEFINITION;

	/**
	 * The number of structural features of the '<em>For One Arbitrary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ONE_ARBITRARY_FEATURE_COUNT = QUANTIFYING_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.quantifying.ComponentSetDefinition <em>Component Set Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.quantifying.ComponentSetDefinition
	 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getComponentSetDefinition()
	 * @generated
	 */
	int COMPONENT_SET_DEFINITION = 6;

	/**
	 * The number of structural features of the '<em>Component Set Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.quantifying.impl.TextualComponentSetDefinitionImpl <em>Textual Component Set Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.quantifying.impl.TextualComponentSetDefinitionImpl
	 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getTextualComponentSetDefinition()
	 * @generated
	 */
	int TEXTUAL_COMPONENT_SET_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_COMPONENT_SET_DEFINITION__EXPRESSION = COMPONENT_SET_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Textual Component Set Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_COMPONENT_SET_DEFINITION_FEATURE_COUNT = COMPONENT_SET_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Component Set Definition Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getComponentSetDefinitionExpression()
	 * @generated
	 */
	int COMPONENT_SET_DEFINITION_EXPRESSION = 7;


	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode
	 * @generated
	 */
	EClass getQuantifyingNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode#getVariable()
	 * @see #getQuantifyingNode()
	 * @generated
	 */
	EReference getQuantifyingNode_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set</em>'.
	 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode#getSet()
	 * @see #getQuantifyingNode()
	 * @generated
	 */
	EReference getQuantifyingNode_Set();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode#getDefinition()
	 * @see #getQuantifyingNode()
	 * @generated
	 */
	EReference getQuantifyingNode_Definition();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.quantifying.ForAll <em>For All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For All</em>'.
	 * @see org.be.textbe.bt.textbt.node.quantifying.ForAll
	 * @generated
	 */
	EClass getForAll();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.quantifying.ForSome <em>For Some</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Some</em>'.
	 * @see org.be.textbe.bt.textbt.node.quantifying.ForSome
	 * @generated
	 */
	EClass getForSome();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.quantifying.AtLeastOne <em>At Least One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At Least One</em>'.
	 * @see org.be.textbe.bt.textbt.node.quantifying.AtLeastOne
	 * @generated
	 */
	EClass getAtLeastOne();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.quantifying.ForOneArbitrary <em>For One Arbitrary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For One Arbitrary</em>'.
	 * @see org.be.textbe.bt.textbt.node.quantifying.ForOneArbitrary
	 * @generated
	 */
	EClass getForOneArbitrary();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.quantifying.TextualComponentSetDefinition <em>Textual Component Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Component Set Definition</em>'.
	 * @see org.be.textbe.bt.textbt.node.quantifying.TextualComponentSetDefinition
	 * @generated
	 */
	EClass getTextualComponentSetDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.node.quantifying.TextualComponentSetDefinition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.be.textbe.bt.textbt.node.quantifying.TextualComponentSetDefinition#getExpression()
	 * @see #getTextualComponentSetDefinition()
	 * @generated
	 */
	EAttribute getTextualComponentSetDefinition_Expression();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.quantifying.ComponentSetDefinition <em>Component Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Set Definition</em>'.
	 * @see org.be.textbe.bt.textbt.node.quantifying.ComponentSetDefinition
	 * @generated
	 */
	EClass getComponentSetDefinition();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Component Set Definition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Component Set Definition Expression</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
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
	QuantifyingFactory getQuantifyingFactory();

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
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingNodeImpl
		 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getQuantifyingNode()
		 * @generated
		 */
		EClass QUANTIFYING_NODE = eINSTANCE.getQuantifyingNode();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFYING_NODE__VARIABLE = eINSTANCE.getQuantifyingNode_Variable();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFYING_NODE__SET = eINSTANCE.getQuantifyingNode_Set();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFYING_NODE__DEFINITION = eINSTANCE.getQuantifyingNode_Definition();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.quantifying.impl.ForAllImpl <em>For All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.quantifying.impl.ForAllImpl
		 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getForAll()
		 * @generated
		 */
		EClass FOR_ALL = eINSTANCE.getForAll();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.quantifying.impl.ForSomeImpl <em>For Some</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.quantifying.impl.ForSomeImpl
		 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getForSome()
		 * @generated
		 */
		EClass FOR_SOME = eINSTANCE.getForSome();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.quantifying.impl.AtLeastOneImpl <em>At Least One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.quantifying.impl.AtLeastOneImpl
		 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getAtLeastOne()
		 * @generated
		 */
		EClass AT_LEAST_ONE = eINSTANCE.getAtLeastOne();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.quantifying.impl.ForOneArbitraryImpl <em>For One Arbitrary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.quantifying.impl.ForOneArbitraryImpl
		 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getForOneArbitrary()
		 * @generated
		 */
		EClass FOR_ONE_ARBITRARY = eINSTANCE.getForOneArbitrary();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.quantifying.impl.TextualComponentSetDefinitionImpl <em>Textual Component Set Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.quantifying.impl.TextualComponentSetDefinitionImpl
		 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getTextualComponentSetDefinition()
		 * @generated
		 */
		EClass TEXTUAL_COMPONENT_SET_DEFINITION = eINSTANCE.getTextualComponentSetDefinition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_COMPONENT_SET_DEFINITION__EXPRESSION = eINSTANCE.getTextualComponentSetDefinition_Expression();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.quantifying.ComponentSetDefinition <em>Component Set Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.quantifying.ComponentSetDefinition
		 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getComponentSetDefinition()
		 * @generated
		 */
		EClass COMPONENT_SET_DEFINITION = eINSTANCE.getComponentSetDefinition();

		/**
		 * The meta object literal for the '<em>Component Set Definition Expression</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl#getComponentSetDefinitionExpression()
		 * @generated
		 */
		EDataType COMPONENT_SET_DEFINITION_EXPRESSION = eINSTANCE.getComponentSetDefinitionExpression();

	}

} //QuantifyingPackage
