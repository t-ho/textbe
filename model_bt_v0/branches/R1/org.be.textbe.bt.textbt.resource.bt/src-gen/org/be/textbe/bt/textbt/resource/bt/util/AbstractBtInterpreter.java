/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.util;

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
public class AbstractBtInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<org.be.textbe.bt.textbt.resource.bt.IBtInterpreterListener> listeners = new java.util.ArrayList<org.be.textbe.bt.textbt.resource.bt.IBtInterpreterListener>();
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
		if (object instanceof org.be.textbe.bt.textbt.AlternativeBlock) {
			result = interprete_org_be_textbe_bt_textbt_AlternativeBlock((org.be.textbe.bt.textbt.AlternativeBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.ParallelBlock) {
			result = interprete_org_be_textbe_bt_textbt_ParallelBlock((org.be.textbe.bt.textbt.ParallelBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.AtomicNode) {
			result = interprete_org_be_textbe_bt_textbt_AtomicNode((org.be.textbe.bt.textbt.AtomicNode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.SequentialNode) {
			result = interprete_org_be_textbe_bt_textbt_SequentialNode((org.be.textbe.bt.textbt.SequentialNode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.Node) {
			result = interprete_org_be_textbe_bt_textbt_Node((org.be.textbe.bt.textbt.Node) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.AbstractNode) {
			result = interprete_org_be_textbe_bt_textbt_AbstractNode((org.be.textbe.bt.textbt.AbstractNode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.AbstractBlock) {
			result = interprete_org_be_textbe_bt_textbt_AbstractBlock((org.be.textbe.bt.textbt.AbstractBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.AbstractBlockOrNode) {
			result = interprete_org_be_textbe_bt_textbt_AbstractBlockOrNode((org.be.textbe.bt.textbt.AbstractBlockOrNode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.Assertion) {
			result = interprete_org_be_textbe_bt_textbt_Assertion((org.be.textbe.bt.textbt.Assertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.ExternalOutput) {
			result = interprete_org_be_textbe_bt_textbt_ExternalOutput((org.be.textbe.bt.textbt.ExternalOutput) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.ExternalInput) {
			result = interprete_org_be_textbe_bt_textbt_ExternalInput((org.be.textbe.bt.textbt.ExternalInput) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.InternalOutput) {
			result = interprete_org_be_textbe_bt_textbt_InternalOutput((org.be.textbe.bt.textbt.InternalOutput) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.InternalInput) {
			result = interprete_org_be_textbe_bt_textbt_InternalInput((org.be.textbe.bt.textbt.InternalInput) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.Guard) {
			result = interprete_org_be_textbe_bt_textbt_Guard((org.be.textbe.bt.textbt.Guard) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.Event) {
			result = interprete_org_be_textbe_bt_textbt_Event((org.be.textbe.bt.textbt.Event) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.Selection) {
			result = interprete_org_be_textbe_bt_textbt_Selection((org.be.textbe.bt.textbt.Selection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.State) {
			result = interprete_org_be_textbe_bt_textbt_State((org.be.textbe.bt.textbt.State) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.Behavior) {
			result = interprete_org_be_textbe_bt_textbt_Behavior((org.be.textbe.bt.textbt.Behavior) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.Relation) {
			result = interprete_org_be_textbe_bt_textbt_Relation((org.be.textbe.bt.textbt.Relation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.RelationalBehavior) {
			result = interprete_org_be_textbe_bt_textbt_RelationalBehavior((org.be.textbe.bt.textbt.RelationalBehavior) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.AbstractBehavior) {
			result = interprete_org_be_textbe_bt_textbt_AbstractBehavior((org.be.textbe.bt.textbt.AbstractBehavior) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.BehaviorTree) {
			result = interprete_org_be_textbe_bt_textbt_BehaviorTree((org.be.textbe.bt.textbt.BehaviorTree) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.Option) {
			result = interprete_org_be_textbe_bt_textbt_Option((org.be.textbe.bt.textbt.Option) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.OptionList) {
			result = interprete_org_be_textbe_bt_textbt_OptionList((org.be.textbe.bt.textbt.OptionList) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.SystemComponent) {
			result = interprete_org_be_textbe_bt_textbt_SystemComponent((org.be.textbe.bt.textbt.SystemComponent) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.Component) {
			result = interprete_org_be_textbe_bt_textbt_Component((org.be.textbe.bt.textbt.Component) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.ComponentList) {
			result = interprete_org_be_textbe_bt_textbt_ComponentList((org.be.textbe.bt.textbt.ComponentList) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.Requirement) {
			result = interprete_org_be_textbe_bt_textbt_Requirement((org.be.textbe.bt.textbt.Requirement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.RequirementList) {
			result = interprete_org_be_textbe_bt_textbt_RequirementList((org.be.textbe.bt.textbt.RequirementList) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.textbt.TextBT) {
			result = interprete_org_be_textbe_bt_textbt_TextBT((org.be.textbe.bt.textbt.TextBT) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_TextBT(org.be.textbe.bt.textbt.TextBT object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_RequirementList(org.be.textbe.bt.textbt.RequirementList object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_Requirement(org.be.textbe.bt.textbt.Requirement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_ComponentList(org.be.textbe.bt.textbt.ComponentList object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_Component(org.be.textbe.bt.textbt.Component object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_SystemComponent(org.be.textbe.bt.textbt.SystemComponent object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_OptionList(org.be.textbe.bt.textbt.OptionList object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_Option(org.be.textbe.bt.textbt.Option object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_BehaviorTree(org.be.textbe.bt.textbt.BehaviorTree object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_AbstractBehavior(org.be.textbe.bt.textbt.AbstractBehavior object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_RelationalBehavior(org.be.textbe.bt.textbt.RelationalBehavior object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_Relation(org.be.textbe.bt.textbt.Relation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_Behavior(org.be.textbe.bt.textbt.Behavior object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_State(org.be.textbe.bt.textbt.State object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_Selection(org.be.textbe.bt.textbt.Selection object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_Event(org.be.textbe.bt.textbt.Event object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_Guard(org.be.textbe.bt.textbt.Guard object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_InternalInput(org.be.textbe.bt.textbt.InternalInput object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_InternalOutput(org.be.textbe.bt.textbt.InternalOutput object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_ExternalInput(org.be.textbe.bt.textbt.ExternalInput object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_ExternalOutput(org.be.textbe.bt.textbt.ExternalOutput object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_Assertion(org.be.textbe.bt.textbt.Assertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_AbstractBlockOrNode(org.be.textbe.bt.textbt.AbstractBlockOrNode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_AbstractBlock(org.be.textbe.bt.textbt.AbstractBlock object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_AbstractNode(org.be.textbe.bt.textbt.AbstractNode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_Node(org.be.textbe.bt.textbt.Node object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_SequentialNode(org.be.textbe.bt.textbt.SequentialNode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_AtomicNode(org.be.textbe.bt.textbt.AtomicNode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_ParallelBlock(org.be.textbe.bt.textbt.ParallelBlock object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_textbt_AlternativeBlock(org.be.textbe.bt.textbt.AlternativeBlock object, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (org.be.textbe.bt.textbt.resource.bt.IBtInterpreterListener listener : listeners) {
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
	
	public void addListener(org.be.textbe.bt.textbt.resource.bt.IBtInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.be.textbe.bt.textbt.resource.bt.IBtInterpreterListener listener) {
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
