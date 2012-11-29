/**
 */
package org.be.textbe.bt.textbt.node.quantifying.util;

import org.be.textbe.bt.textbt.node.Node;

import org.be.textbe.bt.textbt.node.quantifying.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingPackage
 * @generated
 */
public class QuantifyingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuantifyingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifyingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QuantifyingPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
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
	protected QuantifyingSwitch<Adapter> modelSwitch =
		new QuantifyingSwitch<Adapter>() {
			@Override
			public Adapter caseQuantifyingNode(QuantifyingNode object) {
				return createQuantifyingNodeAdapter();
			}
			@Override
			public Adapter caseForAll(ForAll object) {
				return createForAllAdapter();
			}
			@Override
			public Adapter caseForSome(ForSome object) {
				return createForSomeAdapter();
			}
			@Override
			public Adapter caseAtLeastOne(AtLeastOne object) {
				return createAtLeastOneAdapter();
			}
			@Override
			public Adapter caseForOneArbitrary(ForOneArbitrary object) {
				return createForOneArbitraryAdapter();
			}
			@Override
			public Adapter caseTextualComponentSetDefinition(TextualComponentSetDefinition object) {
				return createTextualComponentSetDefinitionAdapter();
			}
			@Override
			public Adapter caseComponentSetDefinition(ComponentSetDefinition object) {
				return createComponentSetDefinitionAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode
	 * @generated
	 */
	public Adapter createQuantifyingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.bt.textbt.node.quantifying.ForAll <em>For All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.bt.textbt.node.quantifying.ForAll
	 * @generated
	 */
	public Adapter createForAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.bt.textbt.node.quantifying.ForSome <em>For Some</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.bt.textbt.node.quantifying.ForSome
	 * @generated
	 */
	public Adapter createForSomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.bt.textbt.node.quantifying.AtLeastOne <em>At Least One</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.bt.textbt.node.quantifying.AtLeastOne
	 * @generated
	 */
	public Adapter createAtLeastOneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.bt.textbt.node.quantifying.ForOneArbitrary <em>For One Arbitrary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.bt.textbt.node.quantifying.ForOneArbitrary
	 * @generated
	 */
	public Adapter createForOneArbitraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.bt.textbt.node.quantifying.TextualComponentSetDefinition <em>Textual Component Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.bt.textbt.node.quantifying.TextualComponentSetDefinition
	 * @generated
	 */
	public Adapter createTextualComponentSetDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.bt.textbt.node.quantifying.ComponentSetDefinition <em>Component Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.bt.textbt.node.quantifying.ComponentSetDefinition
	 * @generated
	 */
	public Adapter createComponentSetDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.be.textbe.bt.textbt.node.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.be.textbe.bt.textbt.node.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QuantifyingAdapterFactory
