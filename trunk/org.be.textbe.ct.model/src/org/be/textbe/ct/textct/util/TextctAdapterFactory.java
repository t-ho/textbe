/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.ct.textct.util;

import org.be.textbe.ct.textct.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.ct.textct.TextctPackage
 * @generated
 */
public class TextctAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static TextctPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TextctAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = TextctPackage.eINSTANCE;
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
  protected TextctSwitch<Adapter> modelSwitch =
    new TextctSwitch<Adapter>() {
			@Override
			public Adapter caseTextCT(TextCT object) {
				return createTextCTAdapter();
			}
			@Override
			public Adapter caseRequirementList(RequirementList object) {
				return createRequirementListAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseComponentList(ComponentList object) {
				return createComponentListAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseSystemComponent(SystemComponent object) {
				return createSystemComponentAdapter();
			}
			@Override
			public Adapter caseOptionList(OptionList object) {
				return createOptionListAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseCompositionTree(CompositionTree object) {
				return createCompositionTreeAdapter();
			}
			@Override
			public Adapter caseAbstractBehavior(AbstractBehavior object) {
				return createAbstractBehaviorAdapter();
			}
			@Override
			public Adapter caseRelationalBehavior(RelationalBehavior object) {
				return createRelationalBehaviorAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseBehavior(Behavior object) {
				return createBehaviorAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseSelection(Selection object) {
				return createSelectionAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseGuard(Guard object) {
				return createGuardAdapter();
			}
			@Override
			public Adapter caseInternalInput(InternalInput object) {
				return createInternalInputAdapter();
			}
			@Override
			public Adapter caseInternalOutput(InternalOutput object) {
				return createInternalOutputAdapter();
			}
			@Override
			public Adapter caseExternalInput(ExternalInput object) {
				return createExternalInputAdapter();
			}
			@Override
			public Adapter caseExternalOutput(ExternalOutput object) {
				return createExternalOutputAdapter();
			}
			@Override
			public Adapter caseAssertion(Assertion object) {
				return createAssertionAdapter();
			}
			@Override
			public Adapter caseAbstractBlockOrNode(AbstractBlockOrNode object) {
				return createAbstractBlockOrNodeAdapter();
			}
			@Override
			public Adapter caseAbstractBlock(AbstractBlock object) {
				return createAbstractBlockAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseAggregatedNode(AggregatedNode object) {
				return createAggregatedNodeAdapter();
			}
			@Override
			public Adapter caseInheritedNode(InheritedNode object) {
				return createInheritedNodeAdapter();
			}
			@Override
			public Adapter caseAssociatedNode(AssociatedNode object) {
				return createAssociatedNodeAdapter();
			}
			@Override
			public Adapter caseAlternativeBlock(AlternativeBlock object) {
				return createAlternativeBlockAdapter();
			}
			@Override
			public Adapter caseAggregatedBlock(AggregatedBlock object) {
				return createAggregatedBlockAdapter();
			}
			@Override
			public Adapter caseAssociatedBlock(AssociatedBlock object) {
				return createAssociatedBlockAdapter();
			}
			@Override
			public Adapter caseInheritedBlock(InheritedBlock object) {
				return createInheritedBlockAdapter();
			}
			@Override
			public Adapter caseAbstractNode(AbstractNode object) {
				return createAbstractNodeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.TextCT <em>Text CT</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.TextCT
	 * @generated
	 */
  public Adapter createTextCTAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.RequirementList <em>Requirement List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.RequirementList
	 * @generated
	 */
  public Adapter createRequirementListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.Requirement
	 * @generated
	 */
  public Adapter createRequirementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.ComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.ComponentList
	 * @generated
	 */
  public Adapter createComponentListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.Component
	 * @generated
	 */
  public Adapter createComponentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.SystemComponent <em>System Component</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.SystemComponent
	 * @generated
	 */
  public Adapter createSystemComponentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.OptionList <em>Option List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.OptionList
	 * @generated
	 */
  public Adapter createOptionListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.Option
	 * @generated
	 */
  public Adapter createOptionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.CompositionTree <em>Composition Tree</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.CompositionTree
	 * @generated
	 */
  public Adapter createCompositionTreeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.AbstractBehavior <em>Abstract Behavior</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.AbstractBehavior
	 * @generated
	 */
  public Adapter createAbstractBehaviorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.RelationalBehavior <em>Relational Behavior</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.RelationalBehavior
	 * @generated
	 */
  public Adapter createRelationalBehaviorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.Relation
	 * @generated
	 */
  public Adapter createRelationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.Behavior
	 * @generated
	 */
  public Adapter createBehaviorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.State
	 * @generated
	 */
  public Adapter createStateAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.Selection
	 * @generated
	 */
  public Adapter createSelectionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.Event
	 * @generated
	 */
  public Adapter createEventAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.Guard
	 * @generated
	 */
  public Adapter createGuardAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.InternalInput <em>Internal Input</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.InternalInput
	 * @generated
	 */
  public Adapter createInternalInputAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.InternalOutput <em>Internal Output</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.InternalOutput
	 * @generated
	 */
  public Adapter createInternalOutputAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.ExternalInput <em>External Input</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.ExternalInput
	 * @generated
	 */
  public Adapter createExternalInputAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.ExternalOutput <em>External Output</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.ExternalOutput
	 * @generated
	 */
  public Adapter createExternalOutputAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.Assertion
	 * @generated
	 */
  public Adapter createAssertionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.AbstractBlockOrNode <em>Abstract Block Or Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.AbstractBlockOrNode
	 * @generated
	 */
  public Adapter createAbstractBlockOrNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.AbstractBlock <em>Abstract Block</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.AbstractBlock
	 * @generated
	 */
  public Adapter createAbstractBlockAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.Node
	 * @generated
	 */
  public Adapter createNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.AggregatedNode <em>Aggregated Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.AggregatedNode
	 * @generated
	 */
  public Adapter createAggregatedNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.InheritedNode <em>Inherited Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.InheritedNode
	 * @generated
	 */
  public Adapter createInheritedNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.AssociatedNode <em>Associated Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.AssociatedNode
	 * @generated
	 */
  public Adapter createAssociatedNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.AlternativeBlock <em>Alternative Block</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.AlternativeBlock
	 * @generated
	 */
  public Adapter createAlternativeBlockAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.AggregatedBlock <em>Aggregated Block</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.AggregatedBlock
	 * @generated
	 */
  public Adapter createAggregatedBlockAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.AssociatedBlock <em>Associated Block</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.AssociatedBlock
	 * @generated
	 */
  public Adapter createAssociatedBlockAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.InheritedBlock <em>Inherited Block</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.InheritedBlock
	 * @generated
	 */
  public Adapter createInheritedBlockAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.ct.textct.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.ct.textct.AbstractNode
	 * @generated
	 */
	public Adapter createAbstractNodeAdapter() {
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

} //TextctAdapterFactory
