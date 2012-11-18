/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv.util;

import org.be.textbe.gv.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.gv.GvPackage
 * @generated
 */
public class GvAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static GvPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GvAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = GvPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected GvSwitch<Adapter> modelSwitch =
    new GvSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractGraph(AbstractGraph object) {
				return createAbstractGraphAdapter();
			}
			@Override
			public Adapter caseAList(AList object) {
				return createAListAdapter();
			}
			@Override
			public Adapter caseAssignmentStatement(AssignmentStatement object) {
				return createAssignmentStatementAdapter();
			}
			@Override
			public Adapter caseAttributable(Attributable object) {
				return createAttributableAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAttributeList(AttributeList object) {
				return createAttributeListAdapter();
			}
			@Override
			public Adapter caseAttributeStatement(AttributeStatement object) {
				return createAttributeStatementAdapter();
			}
			@Override
			public Adapter caseCommentable(Commentable object) {
				return createCommentableAdapter();
			}
			@Override
			public Adapter caseConnectable(Connectable object) {
				return createConnectableAdapter();
			}
			@Override
			public Adapter caseEdgeStatement(EdgeStatement object) {
				return createEdgeStatementAdapter();
			}
			@Override
			public Adapter caseGraph(Graph object) {
				return createGraphAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseNodeStatement(NodeStatement object) {
				return createNodeStatementAdapter();
			}
			@Override
			public Adapter caseNodeID(NodeID object) {
				return createNodeIDAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseStatementList(StatementList object) {
				return createStatementListAdapter();
			}
			@Override
			public Adapter caseStrictIdentifiable(StrictIdentifiable object) {
				return createStrictIdentifiableAdapter();
			}
			@Override
			public Adapter caseSubgraph(Subgraph object) {
				return createSubgraphAdapter();
			}
			@Override
			public Adapter caseTarget(Target object) {
				return createTargetAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.AbstractGraph <em>Abstract Graph</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.AbstractGraph
	 * @generated
	 */
  public Adapter createAbstractGraphAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.AList <em>AList</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.AList
	 * @generated
	 */
  public Adapter createAListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.AssignmentStatement <em>Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.AssignmentStatement
	 * @generated
	 */
  public Adapter createAssignmentStatementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.Attributable <em>Attributable</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.Attributable
	 * @generated
	 */
  public Adapter createAttributableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.Attribute
	 * @generated
	 */
  public Adapter createAttributeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.AttributeList <em>Attribute List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.AttributeList
	 * @generated
	 */
  public Adapter createAttributeListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.AttributeStatement <em>Attribute Statement</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.AttributeStatement
	 * @generated
	 */
  public Adapter createAttributeStatementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.Commentable <em>Commentable</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.Commentable
	 * @generated
	 */
  public Adapter createCommentableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.Connectable <em>Connectable</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.Connectable
	 * @generated
	 */
  public Adapter createConnectableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.EdgeStatement <em>Edge Statement</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.EdgeStatement
	 * @generated
	 */
  public Adapter createEdgeStatementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.Graph
	 * @generated
	 */
  public Adapter createGraphAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.Identifiable
	 * @generated
	 */
  public Adapter createIdentifiableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.NodeStatement <em>Node Statement</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.NodeStatement
	 * @generated
	 */
  public Adapter createNodeStatementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.NodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.NodeID
	 * @generated
	 */
  public Adapter createNodeIDAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.Port
	 * @generated
	 */
  public Adapter createPortAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.Statement
	 * @generated
	 */
  public Adapter createStatementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.StatementList <em>Statement List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.StatementList
	 * @generated
	 */
  public Adapter createStatementListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.StrictIdentifiable <em>Strict Identifiable</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.StrictIdentifiable
	 * @generated
	 */
  public Adapter createStrictIdentifiableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.Subgraph <em>Subgraph</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.Subgraph
	 * @generated
	 */
  public Adapter createSubgraphAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.gv.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.gv.Target
	 * @generated
	 */
  public Adapter createTargetAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //GvAdapterFactory
