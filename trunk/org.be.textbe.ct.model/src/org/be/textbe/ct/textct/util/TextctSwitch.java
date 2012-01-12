/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.ct.textct.util;

import org.be.textbe.ct.textct.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.be.textbe.ct.textct.TextctPackage
 * @generated
 */
public class TextctSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TextctPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextctSwitch() {
		if (modelPackage == null) {
			modelPackage = TextctPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TextctPackage.TEXT_CT: {
				TextCT textCT = (TextCT)theEObject;
				T result = caseTextCT(textCT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.REQUIREMENT_LIST: {
				RequirementList requirementList = (RequirementList)theEObject;
				T result = caseRequirementList(requirementList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.COMPONENT_LIST: {
				ComponentList componentList = (ComponentList)theEObject;
				T result = caseComponentList(componentList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.SYSTEM_COMPONENT: {
				SystemComponent systemComponent = (SystemComponent)theEObject;
				T result = caseSystemComponent(systemComponent);
				if (result == null) result = caseComponent(systemComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.OPTION_LIST: {
				OptionList optionList = (OptionList)theEObject;
				T result = caseOptionList(optionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.COMPOSITION_TREE: {
				CompositionTree compositionTree = (CompositionTree)theEObject;
				T result = caseCompositionTree(compositionTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.ABSTRACT_BEHAVIOR: {
				AbstractBehavior abstractBehavior = (AbstractBehavior)theEObject;
				T result = caseAbstractBehavior(abstractBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.RELATIONAL_BEHAVIOR: {
				RelationalBehavior relationalBehavior = (RelationalBehavior)theEObject;
				T result = caseRelationalBehavior(relationalBehavior);
				if (result == null) result = caseAbstractBehavior(relationalBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = caseAbstractBehavior(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseBehavior(state);
				if (result == null) result = caseAbstractBehavior(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.SELECTION: {
				Selection selection = (Selection)theEObject;
				T result = caseSelection(selection);
				if (result == null) result = caseBehavior(selection);
				if (result == null) result = caseAbstractBehavior(selection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseBehavior(event);
				if (result == null) result = caseAbstractBehavior(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.GUARD: {
				Guard guard = (Guard)theEObject;
				T result = caseGuard(guard);
				if (result == null) result = caseBehavior(guard);
				if (result == null) result = caseAbstractBehavior(guard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.INTERNAL_INPUT: {
				InternalInput internalInput = (InternalInput)theEObject;
				T result = caseInternalInput(internalInput);
				if (result == null) result = caseBehavior(internalInput);
				if (result == null) result = caseAbstractBehavior(internalInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.INTERNAL_OUTPUT: {
				InternalOutput internalOutput = (InternalOutput)theEObject;
				T result = caseInternalOutput(internalOutput);
				if (result == null) result = caseBehavior(internalOutput);
				if (result == null) result = caseAbstractBehavior(internalOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.EXTERNAL_INPUT: {
				ExternalInput externalInput = (ExternalInput)theEObject;
				T result = caseExternalInput(externalInput);
				if (result == null) result = caseBehavior(externalInput);
				if (result == null) result = caseAbstractBehavior(externalInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.EXTERNAL_OUTPUT: {
				ExternalOutput externalOutput = (ExternalOutput)theEObject;
				T result = caseExternalOutput(externalOutput);
				if (result == null) result = caseBehavior(externalOutput);
				if (result == null) result = caseAbstractBehavior(externalOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = caseBehavior(assertion);
				if (result == null) result = caseAbstractBehavior(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.ABSTRACT_BLOCK_OR_NODE: {
				AbstractBlockOrNode abstractBlockOrNode = (AbstractBlockOrNode)theEObject;
				T result = caseAbstractBlockOrNode(abstractBlockOrNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.ABSTRACT_BLOCK: {
				AbstractBlock abstractBlock = (AbstractBlock)theEObject;
				T result = caseAbstractBlock(abstractBlock);
				if (result == null) result = caseAbstractBlockOrNode(abstractBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.ABSTRACT_NODE: {
				AbstractNode abstractNode = (AbstractNode)theEObject;
				T result = caseAbstractNode(abstractNode);
				if (result == null) result = caseAbstractBlockOrNode(abstractNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseAbstractNode(node);
				if (result == null) result = caseAbstractBlockOrNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.AGGREGATED_NODE: {
				AggregatedNode aggregatedNode = (AggregatedNode)theEObject;
				T result = caseAggregatedNode(aggregatedNode);
				if (result == null) result = caseAbstractNode(aggregatedNode);
				if (result == null) result = caseAbstractBlockOrNode(aggregatedNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.INHERITED_NODE: {
				InheritedNode inheritedNode = (InheritedNode)theEObject;
				T result = caseInheritedNode(inheritedNode);
				if (result == null) result = caseAbstractNode(inheritedNode);
				if (result == null) result = caseAbstractBlockOrNode(inheritedNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.ASSOCIATED_NODE: {
				AssociatedNode associatedNode = (AssociatedNode)theEObject;
				T result = caseAssociatedNode(associatedNode);
				if (result == null) result = caseAbstractNode(associatedNode);
				if (result == null) result = caseAbstractBlockOrNode(associatedNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.ALTERNATIVE_BLOCK: {
				AlternativeBlock alternativeBlock = (AlternativeBlock)theEObject;
				T result = caseAlternativeBlock(alternativeBlock);
				if (result == null) result = caseAbstractBlock(alternativeBlock);
				if (result == null) result = caseAbstractBlockOrNode(alternativeBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.AGGREGATED_BLOCK: {
				AggregatedBlock aggregatedBlock = (AggregatedBlock)theEObject;
				T result = caseAggregatedBlock(aggregatedBlock);
				if (result == null) result = caseAbstractBlock(aggregatedBlock);
				if (result == null) result = caseAbstractBlockOrNode(aggregatedBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.ASSOCIATED_BLOCK: {
				AssociatedBlock associatedBlock = (AssociatedBlock)theEObject;
				T result = caseAssociatedBlock(associatedBlock);
				if (result == null) result = caseAbstractBlock(associatedBlock);
				if (result == null) result = caseAbstractBlockOrNode(associatedBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextctPackage.INHERITED_BLOCK: {
				InheritedBlock inheritedBlock = (InheritedBlock)theEObject;
				T result = caseInheritedBlock(inheritedBlock);
				if (result == null) result = caseAbstractBlock(inheritedBlock);
				if (result == null) result = caseAbstractBlockOrNode(inheritedBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text CT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text CT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextCT(TextCT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementList(RequirementList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentList(ComponentList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemComponent(SystemComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionList(OptionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionTree(CompositionTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractBehavior(AbstractBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalBehavior(RelationalBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelection(Selection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuard(Guard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalInput(InternalInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalOutput(InternalOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalInput(ExternalInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalOutput(ExternalOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Block Or Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Block Or Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractBlockOrNode(AbstractBlockOrNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractBlock(AbstractBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNode(AbstractNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregated Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregated Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregatedNode(AggregatedNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedNode(InheritedNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Associated Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associated Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociatedNode(AssociatedNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternativeBlock(AlternativeBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregated Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregated Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregatedBlock(AggregatedBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Associated Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associated Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociatedBlock(AssociatedBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedBlock(InheritedBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TextctSwitch
