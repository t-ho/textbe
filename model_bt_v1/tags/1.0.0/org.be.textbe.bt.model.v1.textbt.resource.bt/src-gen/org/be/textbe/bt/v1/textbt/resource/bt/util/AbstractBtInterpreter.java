/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.util;

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
	private java.util.List<org.be.textbe.bt.v1.textbt.resource.bt.IBtInterpreterListener> listeners = new java.util.ArrayList<org.be.textbe.bt.v1.textbt.resource.bt.IBtInterpreterListener>();
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
		if (object instanceof org.be.textbe.bt.v1.textbt.SystemComponent) {
			result = interprete_org_be_textbe_bt_v1_textbt_SystemComponent((org.be.textbe.bt.v1.textbt.SystemComponent) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.AttributeRealization) {
			result = interprete_org_be_textbe_bt_v1_textbt_AttributeRealization((org.be.textbe.bt.v1.textbt.AttributeRealization) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.NamedBehavior) {
			result = interprete_org_be_textbe_bt_v1_textbt_NamedBehavior((org.be.textbe.bt.v1.textbt.NamedBehavior) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.How) {
			result = interprete_org_be_textbe_bt_v1_textbt_How((org.be.textbe.bt.v1.textbt.How) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Why) {
			result = interprete_org_be_textbe_bt_v1_textbt_Why((org.be.textbe.bt.v1.textbt.Why) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.When) {
			result = interprete_org_be_textbe_bt_v1_textbt_When((org.be.textbe.bt.v1.textbt.When) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Where) {
			result = interprete_org_be_textbe_bt_v1_textbt_Where((org.be.textbe.bt.v1.textbt.Where) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.What) {
			result = interprete_org_be_textbe_bt_v1_textbt_What((org.be.textbe.bt.v1.textbt.What) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Who) {
			result = interprete_org_be_textbe_bt_v1_textbt_Who((org.be.textbe.bt.v1.textbt.Who) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.FreeTextRelation) {
			result = interprete_org_be_textbe_bt_v1_textbt_FreeTextRelation((org.be.textbe.bt.v1.textbt.FreeTextRelation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Relation) {
			result = interprete_org_be_textbe_bt_v1_textbt_Relation((org.be.textbe.bt.v1.textbt.Relation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Assertion) {
			result = interprete_org_be_textbe_bt_v1_textbt_Assertion((org.be.textbe.bt.v1.textbt.Assertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.NamedElement) {
			result = interprete_org_be_textbe_bt_v1_textbt_NamedElement((org.be.textbe.bt.v1.textbt.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Interleaving) {
			result = interprete_org_be_textbe_bt_v1_textbt_Interleaving((org.be.textbe.bt.v1.textbt.Interleaving) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Atomic) {
			result = interprete_org_be_textbe_bt_v1_textbt_Atomic((org.be.textbe.bt.v1.textbt.Atomic) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Alternative) {
			result = interprete_org_be_textbe_bt_v1_textbt_Alternative((org.be.textbe.bt.v1.textbt.Alternative) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Parallel) {
			result = interprete_org_be_textbe_bt_v1_textbt_Parallel((org.be.textbe.bt.v1.textbt.Parallel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Branch) {
			result = interprete_org_be_textbe_bt_v1_textbt_Branch((org.be.textbe.bt.v1.textbt.Branch) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Sequence) {
			result = interprete_org_be_textbe_bt_v1_textbt_Sequence((org.be.textbe.bt.v1.textbt.Sequence) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.BehaviorTree) {
			result = interprete_org_be_textbe_bt_v1_textbt_BehaviorTree((org.be.textbe.bt.v1.textbt.BehaviorTree) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.TraceabilityLink) {
			result = interprete_org_be_textbe_bt_v1_textbt_TraceabilityLink((org.be.textbe.bt.v1.textbt.TraceabilityLink) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Output) {
			result = interprete_org_be_textbe_bt_v1_textbt_Output((org.be.textbe.bt.v1.textbt.Output) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.InternalInput) {
			result = interprete_org_be_textbe_bt_v1_textbt_InternalInput((org.be.textbe.bt.v1.textbt.InternalInput) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Input) {
			result = interprete_org_be_textbe_bt_v1_textbt_Input((org.be.textbe.bt.v1.textbt.Input) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Node) {
			result = interprete_org_be_textbe_bt_v1_textbt_Node((org.be.textbe.bt.v1.textbt.Node) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.ExternalOutput) {
			result = interprete_org_be_textbe_bt_v1_textbt_ExternalOutput((org.be.textbe.bt.v1.textbt.ExternalOutput) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.ExternalInput) {
			result = interprete_org_be_textbe_bt_v1_textbt_ExternalInput((org.be.textbe.bt.v1.textbt.ExternalInput) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.InternalOutput) {
			result = interprete_org_be_textbe_bt_v1_textbt_InternalOutput((org.be.textbe.bt.v1.textbt.InternalOutput) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Guard) {
			result = interprete_org_be_textbe_bt_v1_textbt_Guard((org.be.textbe.bt.v1.textbt.Guard) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Event) {
			result = interprete_org_be_textbe_bt_v1_textbt_Event((org.be.textbe.bt.v1.textbt.Event) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Selection) {
			result = interprete_org_be_textbe_bt_v1_textbt_Selection((org.be.textbe.bt.v1.textbt.Selection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.StateRealization) {
			result = interprete_org_be_textbe_bt_v1_textbt_StateRealization((org.be.textbe.bt.v1.textbt.StateRealization) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Behavior) {
			result = interprete_org_be_textbe_bt_v1_textbt_Behavior((org.be.textbe.bt.v1.textbt.Behavior) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Component) {
			result = interprete_org_be_textbe_bt_v1_textbt_Component((org.be.textbe.bt.v1.textbt.Component) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Requirement) {
			result = interprete_org_be_textbe_bt_v1_textbt_Requirement((org.be.textbe.bt.v1.textbt.Requirement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.bt.v1.textbt.Specification) {
			result = interprete_org_be_textbe_bt_v1_textbt_Specification((org.be.textbe.bt.v1.textbt.Specification) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Specification(org.be.textbe.bt.v1.textbt.Specification object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Requirement(org.be.textbe.bt.v1.textbt.Requirement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Component(org.be.textbe.bt.v1.textbt.Component object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Behavior(org.be.textbe.bt.v1.textbt.Behavior object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_StateRealization(org.be.textbe.bt.v1.textbt.StateRealization object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Selection(org.be.textbe.bt.v1.textbt.Selection object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Event(org.be.textbe.bt.v1.textbt.Event object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Guard(org.be.textbe.bt.v1.textbt.Guard object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_InternalInput(org.be.textbe.bt.v1.textbt.InternalInput object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_InternalOutput(org.be.textbe.bt.v1.textbt.InternalOutput object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_ExternalInput(org.be.textbe.bt.v1.textbt.ExternalInput object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_ExternalOutput(org.be.textbe.bt.v1.textbt.ExternalOutput object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Node(org.be.textbe.bt.v1.textbt.Node object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Input(org.be.textbe.bt.v1.textbt.Input object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Output(org.be.textbe.bt.v1.textbt.Output object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_TraceabilityLink(org.be.textbe.bt.v1.textbt.TraceabilityLink object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_BehaviorTree(org.be.textbe.bt.v1.textbt.BehaviorTree object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Sequence(org.be.textbe.bt.v1.textbt.Sequence object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Branch(org.be.textbe.bt.v1.textbt.Branch object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Parallel(org.be.textbe.bt.v1.textbt.Parallel object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Alternative(org.be.textbe.bt.v1.textbt.Alternative object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Atomic(org.be.textbe.bt.v1.textbt.Atomic object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Interleaving(org.be.textbe.bt.v1.textbt.Interleaving object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_NamedElement(org.be.textbe.bt.v1.textbt.NamedElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Assertion(org.be.textbe.bt.v1.textbt.Assertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Relation(org.be.textbe.bt.v1.textbt.Relation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Who(org.be.textbe.bt.v1.textbt.Who object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_What(org.be.textbe.bt.v1.textbt.What object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Where(org.be.textbe.bt.v1.textbt.Where object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_When(org.be.textbe.bt.v1.textbt.When object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_Why(org.be.textbe.bt.v1.textbt.Why object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_FreeTextRelation(org.be.textbe.bt.v1.textbt.FreeTextRelation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_How(org.be.textbe.bt.v1.textbt.How object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_AttributeRealization(org.be.textbe.bt.v1.textbt.AttributeRealization object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_NamedBehavior(org.be.textbe.bt.v1.textbt.NamedBehavior object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_bt_v1_textbt_SystemComponent(org.be.textbe.bt.v1.textbt.SystemComponent object, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (org.be.textbe.bt.v1.textbt.resource.bt.IBtInterpreterListener listener : listeners) {
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
	
	public void addListener(org.be.textbe.bt.v1.textbt.resource.bt.IBtInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.be.textbe.bt.v1.textbt.resource.bt.IBtInterpreterListener listener) {
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
