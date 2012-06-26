/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractCtInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<org.be.textbe.ct.textct.resource.ct.ICtInterpreterListener> listeners = new java.util.ArrayList<org.be.textbe.ct.textct.resource.ct.ICtInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof org.be.textbe.ct.textct.InheritedBlock) {
			result = interprete_org_be_textbe_ct_textct_InheritedBlock((org.be.textbe.ct.textct.InheritedBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.AssociatedBlock) {
			result = interprete_org_be_textbe_ct_textct_AssociatedBlock((org.be.textbe.ct.textct.AssociatedBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.AggregatedBlock) {
			result = interprete_org_be_textbe_ct_textct_AggregatedBlock((org.be.textbe.ct.textct.AggregatedBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.AlternativeBlock) {
			result = interprete_org_be_textbe_ct_textct_AlternativeBlock((org.be.textbe.ct.textct.AlternativeBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.AssociatedNode) {
			result = interprete_org_be_textbe_ct_textct_AssociatedNode((org.be.textbe.ct.textct.AssociatedNode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.InheritedNode) {
			result = interprete_org_be_textbe_ct_textct_InheritedNode((org.be.textbe.ct.textct.InheritedNode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.AggregatedNode) {
			result = interprete_org_be_textbe_ct_textct_AggregatedNode((org.be.textbe.ct.textct.AggregatedNode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.Node) {
			result = interprete_org_be_textbe_ct_textct_Node((org.be.textbe.ct.textct.Node) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.AbstractNode) {
			result = interprete_org_be_textbe_ct_textct_AbstractNode((org.be.textbe.ct.textct.AbstractNode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.AbstractBlock) {
			result = interprete_org_be_textbe_ct_textct_AbstractBlock((org.be.textbe.ct.textct.AbstractBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.AbstractBlockOrNode) {
			result = interprete_org_be_textbe_ct_textct_AbstractBlockOrNode((org.be.textbe.ct.textct.AbstractBlockOrNode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.Assertion) {
			result = interprete_org_be_textbe_ct_textct_Assertion((org.be.textbe.ct.textct.Assertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.ExternalOutput) {
			result = interprete_org_be_textbe_ct_textct_ExternalOutput((org.be.textbe.ct.textct.ExternalOutput) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.ExternalInput) {
			result = interprete_org_be_textbe_ct_textct_ExternalInput((org.be.textbe.ct.textct.ExternalInput) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.InternalOutput) {
			result = interprete_org_be_textbe_ct_textct_InternalOutput((org.be.textbe.ct.textct.InternalOutput) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.InternalInput) {
			result = interprete_org_be_textbe_ct_textct_InternalInput((org.be.textbe.ct.textct.InternalInput) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.Guard) {
			result = interprete_org_be_textbe_ct_textct_Guard((org.be.textbe.ct.textct.Guard) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.Event) {
			result = interprete_org_be_textbe_ct_textct_Event((org.be.textbe.ct.textct.Event) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.Selection) {
			result = interprete_org_be_textbe_ct_textct_Selection((org.be.textbe.ct.textct.Selection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.State) {
			result = interprete_org_be_textbe_ct_textct_State((org.be.textbe.ct.textct.State) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.Behavior) {
			result = interprete_org_be_textbe_ct_textct_Behavior((org.be.textbe.ct.textct.Behavior) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.Relation) {
			result = interprete_org_be_textbe_ct_textct_Relation((org.be.textbe.ct.textct.Relation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.RelationalBehavior) {
			result = interprete_org_be_textbe_ct_textct_RelationalBehavior((org.be.textbe.ct.textct.RelationalBehavior) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.AbstractBehavior) {
			result = interprete_org_be_textbe_ct_textct_AbstractBehavior((org.be.textbe.ct.textct.AbstractBehavior) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.CompositionTree) {
			result = interprete_org_be_textbe_ct_textct_CompositionTree((org.be.textbe.ct.textct.CompositionTree) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.Option) {
			result = interprete_org_be_textbe_ct_textct_Option((org.be.textbe.ct.textct.Option) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.OptionList) {
			result = interprete_org_be_textbe_ct_textct_OptionList((org.be.textbe.ct.textct.OptionList) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.SystemComponent) {
			result = interprete_org_be_textbe_ct_textct_SystemComponent((org.be.textbe.ct.textct.SystemComponent) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.Component) {
			result = interprete_org_be_textbe_ct_textct_Component((org.be.textbe.ct.textct.Component) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.ComponentList) {
			result = interprete_org_be_textbe_ct_textct_ComponentList((org.be.textbe.ct.textct.ComponentList) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.Requirement) {
			result = interprete_org_be_textbe_ct_textct_Requirement((org.be.textbe.ct.textct.Requirement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.RequirementList) {
			result = interprete_org_be_textbe_ct_textct_RequirementList((org.be.textbe.ct.textct.RequirementList) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.ct.textct.TextCT) {
			result = interprete_org_be_textbe_ct_textct_TextCT((org.be.textbe.ct.textct.TextCT) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_TextCT(org.be.textbe.ct.textct.TextCT object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_RequirementList(org.be.textbe.ct.textct.RequirementList object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_Requirement(org.be.textbe.ct.textct.Requirement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_ComponentList(org.be.textbe.ct.textct.ComponentList object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_Component(org.be.textbe.ct.textct.Component object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_SystemComponent(org.be.textbe.ct.textct.SystemComponent object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_OptionList(org.be.textbe.ct.textct.OptionList object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_Option(org.be.textbe.ct.textct.Option object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_CompositionTree(org.be.textbe.ct.textct.CompositionTree object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_AbstractBehavior(org.be.textbe.ct.textct.AbstractBehavior object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_RelationalBehavior(org.be.textbe.ct.textct.RelationalBehavior object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_Relation(org.be.textbe.ct.textct.Relation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_Behavior(org.be.textbe.ct.textct.Behavior object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_State(org.be.textbe.ct.textct.State object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_Selection(org.be.textbe.ct.textct.Selection object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_Event(org.be.textbe.ct.textct.Event object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_Guard(org.be.textbe.ct.textct.Guard object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_InternalInput(org.be.textbe.ct.textct.InternalInput object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_InternalOutput(org.be.textbe.ct.textct.InternalOutput object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_ExternalInput(org.be.textbe.ct.textct.ExternalInput object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_ExternalOutput(org.be.textbe.ct.textct.ExternalOutput object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_Assertion(org.be.textbe.ct.textct.Assertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_AbstractBlockOrNode(org.be.textbe.ct.textct.AbstractBlockOrNode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_AbstractBlock(org.be.textbe.ct.textct.AbstractBlock object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_AbstractNode(org.be.textbe.ct.textct.AbstractNode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_Node(org.be.textbe.ct.textct.Node object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_AggregatedNode(org.be.textbe.ct.textct.AggregatedNode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_InheritedNode(org.be.textbe.ct.textct.InheritedNode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_AssociatedNode(org.be.textbe.ct.textct.AssociatedNode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_AlternativeBlock(org.be.textbe.ct.textct.AlternativeBlock object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_AggregatedBlock(org.be.textbe.ct.textct.AggregatedBlock object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_AssociatedBlock(org.be.textbe.ct.textct.AssociatedBlock object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_ct_textct_InheritedBlock(org.be.textbe.ct.textct.InheritedBlock object, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (org.be.textbe.ct.textct.resource.ct.ICtInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(org.be.textbe.ct.textct.resource.ct.ICtInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.be.textbe.ct.textct.resource.ct.ICtInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
