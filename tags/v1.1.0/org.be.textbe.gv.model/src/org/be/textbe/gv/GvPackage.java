/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.be.textbe.gv.GvFactory
 * @model kind="package"
 * @generated
 */
public interface GvPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "gv";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://org.be.textbe/gv";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "gv";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  GvPackage eINSTANCE = org.be.textbe.gv.impl.GvPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.IdentifiableImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getIdentifiable()
	 * @generated
	 */
  int IDENTIFIABLE = 11;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IDENTIFIABLE__ID = 0;

  /**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IDENTIFIABLE_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.AbstractGraphImpl <em>Abstract Graph</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.AbstractGraphImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getAbstractGraph()
	 * @generated
	 */
  int ABSTRACT_GRAPH = 0;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_GRAPH__ID = IDENTIFIABLE__ID;

  /**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_GRAPH__STATEMENTS = IDENTIFIABLE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Abstract Graph</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_GRAPH_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.Commentable <em>Commentable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.Commentable
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getCommentable()
	 * @generated
	 */
  int COMMENTABLE = 7;

  /**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMMENTABLE__COMMENTS = 0;

  /**
	 * The number of structural features of the '<em>Commentable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMMENTABLE_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.AListImpl <em>AList</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.AListImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getAList()
	 * @generated
	 */
  int ALIST = 1;

  /**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ALIST__COMMENTS = COMMENTABLE__COMMENTS;

  /**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ALIST__ATTRIBUTE = COMMENTABLE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ALIST__TAIL = COMMENTABLE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>AList</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ALIST_FEATURE_COUNT = COMMENTABLE_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.StatementImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getStatement()
	 * @generated
	 */
  int STATEMENT = 15;

  /**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.AssignmentStatementImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getAssignmentStatement()
	 * @generated
	 */
  int ASSIGNMENT_STATEMENT = 2;

  /**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_STATEMENT__COMMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_STATEMENT__LEFT = STATEMENT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_STATEMENT__RIGHT = STATEMENT_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.Attributable <em>Attributable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.Attributable
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getAttributable()
	 * @generated
	 */
  int ATTRIBUTABLE = 3;

  /**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTABLE__ATTRIBUTES = 0;

  /**
	 * The number of structural features of the '<em>Attributable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTABLE_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.AttributeImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getAttribute()
	 * @generated
	 */
  int ATTRIBUTE = 4;

  /**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE__COMMENTS = COMMENTABLE__COMMENTS;

  /**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE__KEY = COMMENTABLE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE__VALUE = COMMENTABLE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE_FEATURE_COUNT = COMMENTABLE_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.AttributeListImpl <em>Attribute List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.AttributeListImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getAttributeList()
	 * @generated
	 */
  int ATTRIBUTE_LIST = 5;

  /**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE_LIST__COMMENTS = COMMENTABLE__COMMENTS;

  /**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE_LIST__LIST = COMMENTABLE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE_LIST__NEXT = COMMENTABLE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Attribute List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE_LIST_FEATURE_COUNT = COMMENTABLE_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.AttributeStatementImpl <em>Attribute Statement</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.AttributeStatementImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getAttributeStatement()
	 * @generated
	 */
  int ATTRIBUTE_STATEMENT = 6;

  /**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE_STATEMENT__COMMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE_STATEMENT__CONTEXT = STATEMENT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE_STATEMENT__ATTRIBUTES = STATEMENT_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Attribute Statement</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.ConnectableImpl <em>Connectable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.ConnectableImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getConnectable()
	 * @generated
	 */
  int CONNECTABLE = 8;

  /**
	 * The number of structural features of the '<em>Connectable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONNECTABLE_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.EdgeStatementImpl <em>Edge Statement</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.EdgeStatementImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getEdgeStatement()
	 * @generated
	 */
  int EDGE_STATEMENT = 9;

  /**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EDGE_STATEMENT__ATTRIBUTES = STATEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EDGE_STATEMENT__COMMENTS = STATEMENT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EDGE_STATEMENT__SOURCE = STATEMENT_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EDGE_STATEMENT__TARGET = STATEMENT_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Edge Statement</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EDGE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.GraphImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getGraph()
	 * @generated
	 */
  int GRAPH = 10;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRAPH__ID = ABSTRACT_GRAPH__ID;

  /**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRAPH__STATEMENTS = ABSTRACT_GRAPH__STATEMENTS;

  /**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRAPH__COMMENTS = ABSTRACT_GRAPH_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRAPH__TYPE = ABSTRACT_GRAPH_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRAPH__STRICT = ABSTRACT_GRAPH_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRAPH_FEATURE_COUNT = ABSTRACT_GRAPH_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.NodeStatementImpl <em>Node Statement</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.NodeStatementImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getNodeStatement()
	 * @generated
	 */
  int NODE_STATEMENT = 12;

  /**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE_STATEMENT__ATTRIBUTES = STATEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE_STATEMENT__COMMENTS = STATEMENT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE_STATEMENT__KEY = STATEMENT_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE_STATEMENT__VALUE = STATEMENT_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Node id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE_STATEMENT__NODE_ID = STATEMENT_FEATURE_COUNT + 4;

  /**
	 * The number of structural features of the '<em>Node Statement</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.NodeIDImpl <em>Node ID</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.NodeIDImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getNodeID()
	 * @generated
	 */
  int NODE_ID = 13;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE_ID__ID = CONNECTABLE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE_ID__COMMENTS = CONNECTABLE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE_ID__PORT = CONNECTABLE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Node ID</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE_ID_FEATURE_COUNT = CONNECTABLE_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.PortImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getPort()
	 * @generated
	 */
  int PORT = 14;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT__ID = IDENTIFIABLE__ID;

  /**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT__COMMENTS = IDENTIFIABLE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Compass</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT__COMPASS = IDENTIFIABLE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.StatementListImpl <em>Statement List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.StatementListImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getStatementList()
	 * @generated
	 */
  int STATEMENT_LIST = 16;

  /**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STATEMENT_LIST__COMMENTS = COMMENTABLE__COMMENTS;

  /**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STATEMENT_LIST__STATEMENT = COMMENTABLE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STATEMENT_LIST__TAIL = COMMENTABLE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Statement List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STATEMENT_LIST_FEATURE_COUNT = COMMENTABLE_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.StrictIdentifiable <em>Strict Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.StrictIdentifiable
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getStrictIdentifiable()
	 * @generated
	 */
  int STRICT_IDENTIFIABLE = 17;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRICT_IDENTIFIABLE__ID = 0;

  /**
	 * The number of structural features of the '<em>Strict Identifiable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRICT_IDENTIFIABLE_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.SubgraphImpl <em>Subgraph</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.SubgraphImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getSubgraph()
	 * @generated
	 */
  int SUBGRAPH = 18;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBGRAPH__ID = ABSTRACT_GRAPH__ID;

  /**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBGRAPH__STATEMENTS = ABSTRACT_GRAPH__STATEMENTS;

  /**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBGRAPH__COMMENTS = ABSTRACT_GRAPH_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBGRAPH__TYPE = ABSTRACT_GRAPH_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Subgraph</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBGRAPH_FEATURE_COUNT = ABSTRACT_GRAPH_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.impl.TargetImpl
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getTarget()
	 * @generated
	 */
  int TARGET = 19;

  /**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TARGET__COMMENTS = COMMENTABLE__COMMENTS;

  /**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TARGET__OPERATION = COMMENTABLE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Next target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TARGET__NEXT_TARGET = COMMENTABLE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TARGET__TARGET = COMMENTABLE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TARGET_FEATURE_COUNT = COMMENTABLE_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.be.textbe.gv.Compass <em>Compass</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.gv.Compass
	 * @see org.be.textbe.gv.impl.GvPackageImpl#getCompass()
	 * @generated
	 */
  int COMPASS = 20;


  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.AbstractGraph <em>Abstract Graph</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Graph</em>'.
	 * @see org.be.textbe.gv.AbstractGraph
	 * @generated
	 */
  EClass getAbstractGraph();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.AbstractGraph#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statements</em>'.
	 * @see org.be.textbe.gv.AbstractGraph#getStatements()
	 * @see #getAbstractGraph()
	 * @generated
	 */
  EReference getAbstractGraph_Statements();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.AList <em>AList</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AList</em>'.
	 * @see org.be.textbe.gv.AList
	 * @generated
	 */
  EClass getAList();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.AList#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute</em>'.
	 * @see org.be.textbe.gv.AList#getAttribute()
	 * @see #getAList()
	 * @generated
	 */
  EReference getAList_Attribute();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.AList#getTail <em>Tail</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tail</em>'.
	 * @see org.be.textbe.gv.AList#getTail()
	 * @see #getAList()
	 * @generated
	 */
  EReference getAList_Tail();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.AssignmentStatement <em>Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Statement</em>'.
	 * @see org.be.textbe.gv.AssignmentStatement
	 * @generated
	 */
  EClass getAssignmentStatement();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.gv.AssignmentStatement#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see org.be.textbe.gv.AssignmentStatement#getLeft()
	 * @see #getAssignmentStatement()
	 * @generated
	 */
  EAttribute getAssignmentStatement_Left();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.gv.AssignmentStatement#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see org.be.textbe.gv.AssignmentStatement#getRight()
	 * @see #getAssignmentStatement()
	 * @generated
	 */
  EAttribute getAssignmentStatement_Right();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.Attributable <em>Attributable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributable</em>'.
	 * @see org.be.textbe.gv.Attributable
	 * @generated
	 */
  EClass getAttributable();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.Attributable#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.be.textbe.gv.Attributable#getAttributes()
	 * @see #getAttributable()
	 * @generated
	 */
  EReference getAttributable_Attributes();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.be.textbe.gv.Attribute
	 * @generated
	 */
  EClass getAttribute();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.gv.Attribute#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.be.textbe.gv.Attribute#getKey()
	 * @see #getAttribute()
	 * @generated
	 */
  EAttribute getAttribute_Key();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.gv.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.be.textbe.gv.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
  EAttribute getAttribute_Value();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.AttributeList <em>Attribute List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute List</em>'.
	 * @see org.be.textbe.gv.AttributeList
	 * @generated
	 */
  EClass getAttributeList();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.AttributeList#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see org.be.textbe.gv.AttributeList#getList()
	 * @see #getAttributeList()
	 * @generated
	 */
  EReference getAttributeList_List();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.AttributeList#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see org.be.textbe.gv.AttributeList#getNext()
	 * @see #getAttributeList()
	 * @generated
	 */
  EReference getAttributeList_Next();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.AttributeStatement <em>Attribute Statement</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Statement</em>'.
	 * @see org.be.textbe.gv.AttributeStatement
	 * @generated
	 */
  EClass getAttributeStatement();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.gv.AttributeStatement#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.be.textbe.gv.AttributeStatement#getContext()
	 * @see #getAttributeStatement()
	 * @generated
	 */
  EAttribute getAttributeStatement_Context();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.AttributeStatement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.be.textbe.gv.AttributeStatement#getAttributes()
	 * @see #getAttributeStatement()
	 * @generated
	 */
  EReference getAttributeStatement_Attributes();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.Commentable <em>Commentable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commentable</em>'.
	 * @see org.be.textbe.gv.Commentable
	 * @generated
	 */
  EClass getCommentable();

  /**
	 * Returns the meta object for the attribute list '{@link org.be.textbe.gv.Commentable#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments</em>'.
	 * @see org.be.textbe.gv.Commentable#getComments()
	 * @see #getCommentable()
	 * @generated
	 */
  EAttribute getCommentable_Comments();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.Connectable <em>Connectable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectable</em>'.
	 * @see org.be.textbe.gv.Connectable
	 * @generated
	 */
  EClass getConnectable();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.EdgeStatement <em>Edge Statement</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Statement</em>'.
	 * @see org.be.textbe.gv.EdgeStatement
	 * @generated
	 */
  EClass getEdgeStatement();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.EdgeStatement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.be.textbe.gv.EdgeStatement#getSource()
	 * @see #getEdgeStatement()
	 * @generated
	 */
  EReference getEdgeStatement_Source();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.EdgeStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.be.textbe.gv.EdgeStatement#getTarget()
	 * @see #getEdgeStatement()
	 * @generated
	 */
  EReference getEdgeStatement_Target();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see org.be.textbe.gv.Graph
	 * @generated
	 */
  EClass getGraph();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.gv.Graph#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.be.textbe.gv.Graph#getType()
	 * @see #getGraph()
	 * @generated
	 */
  EAttribute getGraph_Type();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.gv.Graph#getStrict <em>Strict</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict</em>'.
	 * @see org.be.textbe.gv.Graph#getStrict()
	 * @see #getGraph()
	 * @generated
	 */
  EAttribute getGraph_Strict();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.be.textbe.gv.Identifiable
	 * @generated
	 */
  EClass getIdentifiable();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.gv.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.be.textbe.gv.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
  EAttribute getIdentifiable_Id();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.NodeStatement <em>Node Statement</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Statement</em>'.
	 * @see org.be.textbe.gv.NodeStatement
	 * @generated
	 */
  EClass getNodeStatement();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.NodeStatement#getNode_id <em>Node id</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node id</em>'.
	 * @see org.be.textbe.gv.NodeStatement#getNode_id()
	 * @see #getNodeStatement()
	 * @generated
	 */
  EReference getNodeStatement_Node_id();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.NodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node ID</em>'.
	 * @see org.be.textbe.gv.NodeID
	 * @generated
	 */
  EClass getNodeID();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.NodeID#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port</em>'.
	 * @see org.be.textbe.gv.NodeID#getPort()
	 * @see #getNodeID()
	 * @generated
	 */
  EReference getNodeID_Port();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.be.textbe.gv.Port
	 * @generated
	 */
  EClass getPort();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.gv.Port#getCompass <em>Compass</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compass</em>'.
	 * @see org.be.textbe.gv.Port#getCompass()
	 * @see #getPort()
	 * @generated
	 */
  EAttribute getPort_Compass();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.be.textbe.gv.Statement
	 * @generated
	 */
  EClass getStatement();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.StatementList <em>Statement List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement List</em>'.
	 * @see org.be.textbe.gv.StatementList
	 * @generated
	 */
  EClass getStatementList();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.StatementList#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.be.textbe.gv.StatementList#getStatement()
	 * @see #getStatementList()
	 * @generated
	 */
  EReference getStatementList_Statement();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.StatementList#getTail <em>Tail</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tail</em>'.
	 * @see org.be.textbe.gv.StatementList#getTail()
	 * @see #getStatementList()
	 * @generated
	 */
  EReference getStatementList_Tail();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.StrictIdentifiable <em>Strict Identifiable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strict Identifiable</em>'.
	 * @see org.be.textbe.gv.StrictIdentifiable
	 * @generated
	 */
  EClass getStrictIdentifiable();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.gv.StrictIdentifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.be.textbe.gv.StrictIdentifiable#getId()
	 * @see #getStrictIdentifiable()
	 * @generated
	 */
  EAttribute getStrictIdentifiable_Id();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.Subgraph <em>Subgraph</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subgraph</em>'.
	 * @see org.be.textbe.gv.Subgraph
	 * @generated
	 */
  EClass getSubgraph();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.gv.Subgraph#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.be.textbe.gv.Subgraph#getType()
	 * @see #getSubgraph()
	 * @generated
	 */
  EAttribute getSubgraph_Type();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.gv.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see org.be.textbe.gv.Target
	 * @generated
	 */
  EClass getTarget();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.gv.Target#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.be.textbe.gv.Target#getOperation()
	 * @see #getTarget()
	 * @generated
	 */
  EAttribute getTarget_Operation();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.Target#getNext_target <em>Next target</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next target</em>'.
	 * @see org.be.textbe.gv.Target#getNext_target()
	 * @see #getTarget()
	 * @generated
	 */
  EReference getTarget_Next_target();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.gv.Target#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.be.textbe.gv.Target#getTarget()
	 * @see #getTarget()
	 * @generated
	 */
  EReference getTarget_Target();

  /**
	 * Returns the meta object for enum '{@link org.be.textbe.gv.Compass <em>Compass</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compass</em>'.
	 * @see org.be.textbe.gv.Compass
	 * @generated
	 */
  EEnum getCompass();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  GvFactory getGvFactory();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.AbstractGraphImpl <em>Abstract Graph</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.AbstractGraphImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getAbstractGraph()
		 * @generated
		 */
    EClass ABSTRACT_GRAPH = eINSTANCE.getAbstractGraph();

    /**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_GRAPH__STATEMENTS = eINSTANCE.getAbstractGraph_Statements();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.AListImpl <em>AList</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.AListImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getAList()
		 * @generated
		 */
    EClass ALIST = eINSTANCE.getAList();

    /**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ALIST__ATTRIBUTE = eINSTANCE.getAList_Attribute();

    /**
		 * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ALIST__TAIL = eINSTANCE.getAList_Tail();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.AssignmentStatementImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getAssignmentStatement()
		 * @generated
		 */
    EClass ASSIGNMENT_STATEMENT = eINSTANCE.getAssignmentStatement();

    /**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSIGNMENT_STATEMENT__LEFT = eINSTANCE.getAssignmentStatement_Left();

    /**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSIGNMENT_STATEMENT__RIGHT = eINSTANCE.getAssignmentStatement_Right();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.Attributable <em>Attributable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.Attributable
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getAttributable()
		 * @generated
		 */
    EClass ATTRIBUTABLE = eINSTANCE.getAttributable();

    /**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ATTRIBUTABLE__ATTRIBUTES = eINSTANCE.getAttributable_Attributes();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.AttributeImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getAttribute()
		 * @generated
		 */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATTRIBUTE__KEY = eINSTANCE.getAttribute_Key();

    /**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.AttributeListImpl <em>Attribute List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.AttributeListImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getAttributeList()
		 * @generated
		 */
    EClass ATTRIBUTE_LIST = eINSTANCE.getAttributeList();

    /**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ATTRIBUTE_LIST__LIST = eINSTANCE.getAttributeList_List();

    /**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ATTRIBUTE_LIST__NEXT = eINSTANCE.getAttributeList_Next();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.AttributeStatementImpl <em>Attribute Statement</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.AttributeStatementImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getAttributeStatement()
		 * @generated
		 */
    EClass ATTRIBUTE_STATEMENT = eINSTANCE.getAttributeStatement();

    /**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATTRIBUTE_STATEMENT__CONTEXT = eINSTANCE.getAttributeStatement_Context();

    /**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ATTRIBUTE_STATEMENT__ATTRIBUTES = eINSTANCE.getAttributeStatement_Attributes();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.Commentable <em>Commentable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.Commentable
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getCommentable()
		 * @generated
		 */
    EClass COMMENTABLE = eINSTANCE.getCommentable();

    /**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute COMMENTABLE__COMMENTS = eINSTANCE.getCommentable_Comments();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.ConnectableImpl <em>Connectable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.ConnectableImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getConnectable()
		 * @generated
		 */
    EClass CONNECTABLE = eINSTANCE.getConnectable();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.EdgeStatementImpl <em>Edge Statement</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.EdgeStatementImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getEdgeStatement()
		 * @generated
		 */
    EClass EDGE_STATEMENT = eINSTANCE.getEdgeStatement();

    /**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EDGE_STATEMENT__SOURCE = eINSTANCE.getEdgeStatement_Source();

    /**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EDGE_STATEMENT__TARGET = eINSTANCE.getEdgeStatement_Target();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.GraphImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getGraph()
		 * @generated
		 */
    EClass GRAPH = eINSTANCE.getGraph();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRAPH__TYPE = eINSTANCE.getGraph_Type();

    /**
		 * The meta object literal for the '<em><b>Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRAPH__STRICT = eINSTANCE.getGraph_Strict();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.IdentifiableImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getIdentifiable()
		 * @generated
		 */
    EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

    /**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.NodeStatementImpl <em>Node Statement</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.NodeStatementImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getNodeStatement()
		 * @generated
		 */
    EClass NODE_STATEMENT = eINSTANCE.getNodeStatement();

    /**
		 * The meta object literal for the '<em><b>Node id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference NODE_STATEMENT__NODE_ID = eINSTANCE.getNodeStatement_Node_id();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.NodeIDImpl <em>Node ID</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.NodeIDImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getNodeID()
		 * @generated
		 */
    EClass NODE_ID = eINSTANCE.getNodeID();

    /**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference NODE_ID__PORT = eINSTANCE.getNodeID_Port();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.PortImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getPort()
		 * @generated
		 */
    EClass PORT = eINSTANCE.getPort();

    /**
		 * The meta object literal for the '<em><b>Compass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PORT__COMPASS = eINSTANCE.getPort_Compass();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.StatementImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getStatement()
		 * @generated
		 */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.StatementListImpl <em>Statement List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.StatementListImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getStatementList()
		 * @generated
		 */
    EClass STATEMENT_LIST = eINSTANCE.getStatementList();

    /**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference STATEMENT_LIST__STATEMENT = eINSTANCE.getStatementList_Statement();

    /**
		 * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference STATEMENT_LIST__TAIL = eINSTANCE.getStatementList_Tail();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.StrictIdentifiable <em>Strict Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.StrictIdentifiable
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getStrictIdentifiable()
		 * @generated
		 */
    EClass STRICT_IDENTIFIABLE = eINSTANCE.getStrictIdentifiable();

    /**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STRICT_IDENTIFIABLE__ID = eINSTANCE.getStrictIdentifiable_Id();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.SubgraphImpl <em>Subgraph</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.SubgraphImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getSubgraph()
		 * @generated
		 */
    EClass SUBGRAPH = eINSTANCE.getSubgraph();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SUBGRAPH__TYPE = eINSTANCE.getSubgraph_Type();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.impl.TargetImpl
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getTarget()
		 * @generated
		 */
    EClass TARGET = eINSTANCE.getTarget();

    /**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TARGET__OPERATION = eINSTANCE.getTarget_Operation();

    /**
		 * The meta object literal for the '<em><b>Next target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TARGET__NEXT_TARGET = eINSTANCE.getTarget_Next_target();

    /**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TARGET__TARGET = eINSTANCE.getTarget_Target();

    /**
		 * The meta object literal for the '{@link org.be.textbe.gv.Compass <em>Compass</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.gv.Compass
		 * @see org.be.textbe.gv.impl.GvPackageImpl#getCompass()
		 * @generated
		 */
    EEnum COMPASS = eINSTANCE.getCompass();

  }

} //GvPackage
