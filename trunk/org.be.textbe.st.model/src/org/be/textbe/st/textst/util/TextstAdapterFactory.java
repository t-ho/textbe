/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.st.textst.util;

import org.be.textbe.st.textst.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.st.textst.TextstPackage
 * @generated
 */
public class TextstAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static TextstPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TextstAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = TextstPackage.eINSTANCE;
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
  protected TextstSwitch<Adapter> modelSwitch =
    new TextstSwitch<Adapter>() {
			@Override
			public Adapter caseTextST(TextST object) {
				return createTextSTAdapter();
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
			public Adapter caseOptionList(OptionList object) {
				return createOptionListAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseStructureTree(StructureTree object) {
				return createStructureTreeAdapter();
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
			public Adapter caseAbstractBehavior(AbstractBehavior object) {
				return createAbstractBehaviorAdapter();
			}
			@Override
			public Adapter caseSecondaryRelation(SecondaryRelation object) {
				return createSecondaryRelationAdapter();
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
			public Adapter caseAbstractNode(AbstractNode object) {
				return createAbstractNodeAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseRelatedToNode(RelatedToNode object) {
				return createRelatedToNodeAdapter();
			}
			@Override
			public Adapter caseDefinedByNode(DefinedByNode object) {
				return createDefinedByNodeAdapter();
			}
			@Override
			public Adapter caseParallelBlock(ParallelBlock object) {
				return createParallelBlockAdapter();
			}
			@Override
			public Adapter caseAlternativeBlock(AlternativeBlock object) {
				return createAlternativeBlockAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.TextST <em>Text ST</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.TextST
	 * @generated
	 */
  public Adapter createTextSTAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.RequirementList <em>Requirement List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.RequirementList
	 * @generated
	 */
  public Adapter createRequirementListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.Requirement
	 * @generated
	 */
  public Adapter createRequirementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.ComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.ComponentList
	 * @generated
	 */
  public Adapter createComponentListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.OptionList <em>Option List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.OptionList
	 * @generated
	 */
  public Adapter createOptionListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.Option
	 * @generated
	 */
  public Adapter createOptionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.StructureTree <em>Structure Tree</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.StructureTree
	 * @generated
	 */
  public Adapter createStructureTreeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.Component
	 * @generated
	 */
  public Adapter createComponentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.SystemComponent <em>System Component</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.SystemComponent
	 * @generated
	 */
  public Adapter createSystemComponentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.AbstractBehavior <em>Abstract Behavior</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.AbstractBehavior
	 * @generated
	 */
  public Adapter createAbstractBehaviorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.SecondaryRelation <em>Secondary Relation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.SecondaryRelation
	 * @generated
	 */
  public Adapter createSecondaryRelationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.AbstractBlockOrNode <em>Abstract Block Or Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.AbstractBlockOrNode
	 * @generated
	 */
  public Adapter createAbstractBlockOrNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.AbstractBlock <em>Abstract Block</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.AbstractBlock
	 * @generated
	 */
  public Adapter createAbstractBlockAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.AbstractNode
	 * @generated
	 */
  public Adapter createAbstractNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.Node
	 * @generated
	 */
  public Adapter createNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.RelatedToNode <em>Related To Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.RelatedToNode
	 * @generated
	 */
  public Adapter createRelatedToNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.DefinedByNode <em>Defined By Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.DefinedByNode
	 * @generated
	 */
  public Adapter createDefinedByNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.ParallelBlock <em>Parallel Block</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.ParallelBlock
	 * @generated
	 */
  public Adapter createParallelBlockAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.st.textst.AlternativeBlock <em>Alternative Block</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.st.textst.AlternativeBlock
	 * @generated
	 */
  public Adapter createAlternativeBlockAdapter()
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

} //TextstAdapterFactory
