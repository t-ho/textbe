/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv.impl;

import org.be.textbe.gv.AList;
import org.be.textbe.gv.AbstractGraph;
import org.be.textbe.gv.AssignmentStatement;
import org.be.textbe.gv.Attributable;
import org.be.textbe.gv.Attribute;
import org.be.textbe.gv.AttributeList;
import org.be.textbe.gv.AttributeStatement;
import org.be.textbe.gv.Commentable;
import org.be.textbe.gv.Compass;
import org.be.textbe.gv.Connectable;
import org.be.textbe.gv.EdgeStatement;
import org.be.textbe.gv.Graph;
import org.be.textbe.gv.GvFactory;
import org.be.textbe.gv.GvPackage;
import org.be.textbe.gv.Identifiable;
import org.be.textbe.gv.NodeID;
import org.be.textbe.gv.NodeStatement;
import org.be.textbe.gv.Port;
import org.be.textbe.gv.Statement;
import org.be.textbe.gv.StatementList;
import org.be.textbe.gv.StrictIdentifiable;
import org.be.textbe.gv.Subgraph;
import org.be.textbe.gv.Target;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GvPackageImpl extends EPackageImpl implements GvPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractGraphEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass aListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass assignmentStatementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass attributableEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass attributeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass attributeListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass attributeStatementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass commentableEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass connectableEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass edgeStatementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass graphEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass identifiableEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass nodeStatementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass nodeIDEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass portEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass statementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass statementListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass strictIdentifiableEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass subgraphEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass targetEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum compassEEnum = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.be.textbe.gv.GvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private GvPackageImpl()
  {
		super(eNS_URI, GvFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static GvPackage init()
  {
		if (isInited) return (GvPackage)EPackage.Registry.INSTANCE.getEPackage(GvPackage.eNS_URI);

		// Obtain or create and register package
		GvPackageImpl theGvPackage = (GvPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GvPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GvPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGvPackage.createPackageContents();

		// Initialize created meta-data
		theGvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGvPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GvPackage.eNS_URI, theGvPackage);
		return theGvPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractGraph()
  {
		return abstractGraphEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractGraph_Statements()
  {
		return (EReference)abstractGraphEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAList()
  {
		return aListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAList_Attribute()
  {
		return (EReference)aListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAList_Tail()
  {
		return (EReference)aListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAssignmentStatement()
  {
		return assignmentStatementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAssignmentStatement_Left()
  {
		return (EAttribute)assignmentStatementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAssignmentStatement_Right()
  {
		return (EAttribute)assignmentStatementEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAttributable()
  {
		return attributableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAttributable_Attributes()
  {
		return (EReference)attributableEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAttribute()
  {
		return attributeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAttribute_Key()
  {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAttribute_Value()
  {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAttributeList()
  {
		return attributeListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAttributeList_List()
  {
		return (EReference)attributeListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAttributeList_Next()
  {
		return (EReference)attributeListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAttributeStatement()
  {
		return attributeStatementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAttributeStatement_Context()
  {
		return (EAttribute)attributeStatementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAttributeStatement_Attributes()
  {
		return (EReference)attributeStatementEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCommentable()
  {
		return commentableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCommentable_Comments()
  {
		return (EAttribute)commentableEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getConnectable()
  {
		return connectableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEdgeStatement()
  {
		return edgeStatementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEdgeStatement_Source()
  {
		return (EReference)edgeStatementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEdgeStatement_Target()
  {
		return (EReference)edgeStatementEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getGraph()
  {
		return graphEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGraph_Type()
  {
		return (EAttribute)graphEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGraph_Strict()
  {
		return (EAttribute)graphEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIdentifiable()
  {
		return identifiableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getIdentifiable_Id()
  {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNodeStatement()
  {
		return nodeStatementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getNodeStatement_Node_id()
  {
		return (EReference)nodeStatementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNodeID()
  {
		return nodeIDEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getNodeID_Port()
  {
		return (EReference)nodeIDEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPort()
  {
		return portEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPort_Compass()
  {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStatement()
  {
		return statementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStatementList()
  {
		return statementListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getStatementList_Statement()
  {
		return (EReference)statementListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getStatementList_Tail()
  {
		return (EReference)statementListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStrictIdentifiable()
  {
		return strictIdentifiableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStrictIdentifiable_Id()
  {
		return (EAttribute)strictIdentifiableEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSubgraph()
  {
		return subgraphEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSubgraph_Type()
  {
		return (EAttribute)subgraphEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTarget()
  {
		return targetEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTarget_Operation()
  {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTarget_Next_target()
  {
		return (EReference)targetEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTarget_Target()
  {
		return (EReference)targetEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getCompass()
  {
		return compassEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GvFactory getGvFactory()
  {
		return (GvFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractGraphEClass = createEClass(ABSTRACT_GRAPH);
		createEReference(abstractGraphEClass, ABSTRACT_GRAPH__STATEMENTS);

		aListEClass = createEClass(ALIST);
		createEReference(aListEClass, ALIST__ATTRIBUTE);
		createEReference(aListEClass, ALIST__TAIL);

		assignmentStatementEClass = createEClass(ASSIGNMENT_STATEMENT);
		createEAttribute(assignmentStatementEClass, ASSIGNMENT_STATEMENT__LEFT);
		createEAttribute(assignmentStatementEClass, ASSIGNMENT_STATEMENT__RIGHT);

		attributableEClass = createEClass(ATTRIBUTABLE);
		createEReference(attributableEClass, ATTRIBUTABLE__ATTRIBUTES);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__KEY);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

		attributeListEClass = createEClass(ATTRIBUTE_LIST);
		createEReference(attributeListEClass, ATTRIBUTE_LIST__LIST);
		createEReference(attributeListEClass, ATTRIBUTE_LIST__NEXT);

		attributeStatementEClass = createEClass(ATTRIBUTE_STATEMENT);
		createEAttribute(attributeStatementEClass, ATTRIBUTE_STATEMENT__CONTEXT);
		createEReference(attributeStatementEClass, ATTRIBUTE_STATEMENT__ATTRIBUTES);

		commentableEClass = createEClass(COMMENTABLE);
		createEAttribute(commentableEClass, COMMENTABLE__COMMENTS);

		connectableEClass = createEClass(CONNECTABLE);

		edgeStatementEClass = createEClass(EDGE_STATEMENT);
		createEReference(edgeStatementEClass, EDGE_STATEMENT__SOURCE);
		createEReference(edgeStatementEClass, EDGE_STATEMENT__TARGET);

		graphEClass = createEClass(GRAPH);
		createEAttribute(graphEClass, GRAPH__TYPE);
		createEAttribute(graphEClass, GRAPH__STRICT);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ID);

		nodeStatementEClass = createEClass(NODE_STATEMENT);
		createEReference(nodeStatementEClass, NODE_STATEMENT__NODE_ID);

		nodeIDEClass = createEClass(NODE_ID);
		createEReference(nodeIDEClass, NODE_ID__PORT);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__COMPASS);

		statementEClass = createEClass(STATEMENT);

		statementListEClass = createEClass(STATEMENT_LIST);
		createEReference(statementListEClass, STATEMENT_LIST__STATEMENT);
		createEReference(statementListEClass, STATEMENT_LIST__TAIL);

		strictIdentifiableEClass = createEClass(STRICT_IDENTIFIABLE);
		createEAttribute(strictIdentifiableEClass, STRICT_IDENTIFIABLE__ID);

		subgraphEClass = createEClass(SUBGRAPH);
		createEAttribute(subgraphEClass, SUBGRAPH__TYPE);

		targetEClass = createEClass(TARGET);
		createEAttribute(targetEClass, TARGET__OPERATION);
		createEReference(targetEClass, TARGET__NEXT_TARGET);
		createEReference(targetEClass, TARGET__TARGET);

		// Create enums
		compassEEnum = createEEnum(COMPASS);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractGraphEClass.getESuperTypes().add(this.getIdentifiable());
		aListEClass.getESuperTypes().add(this.getCommentable());
		assignmentStatementEClass.getESuperTypes().add(this.getStatement());
		assignmentStatementEClass.getESuperTypes().add(this.getCommentable());
		attributeEClass.getESuperTypes().add(this.getCommentable());
		attributeListEClass.getESuperTypes().add(this.getCommentable());
		attributeStatementEClass.getESuperTypes().add(this.getStatement());
		attributeStatementEClass.getESuperTypes().add(this.getCommentable());
		edgeStatementEClass.getESuperTypes().add(this.getStatement());
		edgeStatementEClass.getESuperTypes().add(this.getAttributable());
		edgeStatementEClass.getESuperTypes().add(this.getCommentable());
		graphEClass.getESuperTypes().add(this.getAbstractGraph());
		graphEClass.getESuperTypes().add(this.getCommentable());
		nodeStatementEClass.getESuperTypes().add(this.getStatement());
		nodeStatementEClass.getESuperTypes().add(this.getAttributable());
		nodeStatementEClass.getESuperTypes().add(this.getAttribute());
		nodeIDEClass.getESuperTypes().add(this.getConnectable());
		nodeIDEClass.getESuperTypes().add(this.getStrictIdentifiable());
		nodeIDEClass.getESuperTypes().add(this.getCommentable());
		portEClass.getESuperTypes().add(this.getIdentifiable());
		portEClass.getESuperTypes().add(this.getCommentable());
		statementListEClass.getESuperTypes().add(this.getCommentable());
		subgraphEClass.getESuperTypes().add(this.getAbstractGraph());
		subgraphEClass.getESuperTypes().add(this.getConnectable());
		subgraphEClass.getESuperTypes().add(this.getCommentable());
		targetEClass.getESuperTypes().add(this.getCommentable());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractGraphEClass, AbstractGraph.class, "AbstractGraph", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractGraph_Statements(), this.getStatementList(), null, "statements", null, 0, 1, AbstractGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aListEClass, AList.class, "AList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAList_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, AList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAList_Tail(), this.getAList(), null, "tail", null, 0, 1, AList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentStatementEClass, AssignmentStatement.class, "AssignmentStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignmentStatement_Left(), ecorePackage.getEString(), "left", null, 1, 1, AssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignmentStatement_Right(), ecorePackage.getEString(), "right", null, 1, 1, AssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributableEClass, Attributable.class, "Attributable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributable_Attributes(), this.getAttributeList(), null, "attributes", null, 0, 1, Attributable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Key(), ecorePackage.getEString(), "key", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeListEClass, AttributeList.class, "AttributeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeList_List(), this.getAList(), null, "list", null, 1, 1, AttributeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeList_Next(), this.getAttributeList(), null, "next", null, 0, 1, AttributeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeStatementEClass, AttributeStatement.class, "AttributeStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeStatement_Context(), ecorePackage.getEString(), "context", null, 1, 1, AttributeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeStatement_Attributes(), this.getAttributeList(), null, "attributes", null, 1, 1, AttributeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentableEClass, Commentable.class, "Commentable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentable_Comments(), ecorePackage.getEString(), "comments", null, 0, -1, Commentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectableEClass, Connectable.class, "Connectable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeStatementEClass, EdgeStatement.class, "EdgeStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeStatement_Source(), this.getConnectable(), null, "source", null, 1, 1, EdgeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeStatement_Target(), this.getTarget(), null, "target", null, 1, 1, EdgeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraph_Type(), ecorePackage.getEString(), "type", null, 1, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraph_Strict(), ecorePackage.getEString(), "strict", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Id(), ecorePackage.getEString(), "id", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeStatementEClass, NodeStatement.class, "NodeStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeStatement_Node_id(), this.getNodeID(), null, "node_id", null, 1, 1, NodeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeIDEClass, NodeID.class, "NodeID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeID_Port(), this.getPort(), null, "port", null, 0, 1, NodeID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Compass(), this.getCompass(), "compass", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementListEClass, StatementList.class, "StatementList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatementList_Statement(), this.getStatement(), null, "statement", null, 1, 1, StatementList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatementList_Tail(), this.getStatementList(), null, "tail", null, 0, 1, StatementList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strictIdentifiableEClass, StrictIdentifiable.class, "StrictIdentifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrictIdentifiable_Id(), ecorePackage.getEString(), "id", null, 1, 1, StrictIdentifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subgraphEClass, Subgraph.class, "Subgraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubgraph_Type(), ecorePackage.getEString(), "type", null, 0, 1, Subgraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetEClass, Target.class, "Target", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTarget_Operation(), ecorePackage.getEString(), "operation", null, 1, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Next_target(), this.getTarget(), null, "next_target", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Target(), this.getConnectable(), null, "target", null, 1, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(compassEEnum, Compass.class, "Compass");
		addEEnumLiteral(compassEEnum, Compass.NORTH);
		addEEnumLiteral(compassEEnum, Compass.NORTH_EAST);
		addEEnumLiteral(compassEEnum, Compass.EAST);
		addEEnumLiteral(compassEEnum, Compass.SOUTH_EAST);
		addEEnumLiteral(compassEEnum, Compass.SOUTH);
		addEEnumLiteral(compassEEnum, Compass.SOUTH_WEST);
		addEEnumLiteral(compassEEnum, Compass.WEST);
		addEEnumLiteral(compassEEnum, Compass.NORTH_WEST);
		addEEnumLiteral(compassEEnum, Compass.CENTER);
		addEEnumLiteral(compassEEnum, Compass.APPROPRIATE);

		// Create resource
		createResource(eNS_URI);
	}

} //GvPackageImpl
