/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.util;

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
public class AbstractStInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<org.be.textbe.st.textst.resource.st.IStInterpreterListener> listeners = new java.util.ArrayList<org.be.textbe.st.textst.resource.st.IStInterpreterListener>();
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
		if (object instanceof org.be.textbe.st.textst.AlternativeBlock) {
			result = interprete_org_be_textbe_st_textst_AlternativeBlock((org.be.textbe.st.textst.AlternativeBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.ParallelBlock) {
			result = interprete_org_be_textbe_st_textst_ParallelBlock((org.be.textbe.st.textst.ParallelBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.DefinedByNode) {
			result = interprete_org_be_textbe_st_textst_DefinedByNode((org.be.textbe.st.textst.DefinedByNode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.RelatedToNode) {
			result = interprete_org_be_textbe_st_textst_RelatedToNode((org.be.textbe.st.textst.RelatedToNode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.Node) {
			result = interprete_org_be_textbe_st_textst_Node((org.be.textbe.st.textst.Node) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.AbstractNode) {
			result = interprete_org_be_textbe_st_textst_AbstractNode((org.be.textbe.st.textst.AbstractNode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.AbstractBlock) {
			result = interprete_org_be_textbe_st_textst_AbstractBlock((org.be.textbe.st.textst.AbstractBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.AbstractBlockOrNode) {
			result = interprete_org_be_textbe_st_textst_AbstractBlockOrNode((org.be.textbe.st.textst.AbstractBlockOrNode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.SecondaryRelation) {
			result = interprete_org_be_textbe_st_textst_SecondaryRelation((org.be.textbe.st.textst.SecondaryRelation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.AbstractBehavior) {
			result = interprete_org_be_textbe_st_textst_AbstractBehavior((org.be.textbe.st.textst.AbstractBehavior) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.SystemComponent) {
			result = interprete_org_be_textbe_st_textst_SystemComponent((org.be.textbe.st.textst.SystemComponent) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.Component) {
			result = interprete_org_be_textbe_st_textst_Component((org.be.textbe.st.textst.Component) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.StructureTree) {
			result = interprete_org_be_textbe_st_textst_StructureTree((org.be.textbe.st.textst.StructureTree) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.Option) {
			result = interprete_org_be_textbe_st_textst_Option((org.be.textbe.st.textst.Option) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.OptionList) {
			result = interprete_org_be_textbe_st_textst_OptionList((org.be.textbe.st.textst.OptionList) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.ComponentList) {
			result = interprete_org_be_textbe_st_textst_ComponentList((org.be.textbe.st.textst.ComponentList) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.Requirement) {
			result = interprete_org_be_textbe_st_textst_Requirement((org.be.textbe.st.textst.Requirement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.RequirementList) {
			result = interprete_org_be_textbe_st_textst_RequirementList((org.be.textbe.st.textst.RequirementList) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.be.textbe.st.textst.TextST) {
			result = interprete_org_be_textbe_st_textst_TextST((org.be.textbe.st.textst.TextST) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_TextST(org.be.textbe.st.textst.TextST object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_RequirementList(org.be.textbe.st.textst.RequirementList object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_Requirement(org.be.textbe.st.textst.Requirement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_ComponentList(org.be.textbe.st.textst.ComponentList object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_OptionList(org.be.textbe.st.textst.OptionList object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_Option(org.be.textbe.st.textst.Option object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_StructureTree(org.be.textbe.st.textst.StructureTree object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_Component(org.be.textbe.st.textst.Component object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_SystemComponent(org.be.textbe.st.textst.SystemComponent object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_AbstractBehavior(org.be.textbe.st.textst.AbstractBehavior object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_SecondaryRelation(org.be.textbe.st.textst.SecondaryRelation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_AbstractBlockOrNode(org.be.textbe.st.textst.AbstractBlockOrNode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_AbstractBlock(org.be.textbe.st.textst.AbstractBlock object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_AbstractNode(org.be.textbe.st.textst.AbstractNode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_Node(org.be.textbe.st.textst.Node object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_RelatedToNode(org.be.textbe.st.textst.RelatedToNode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_DefinedByNode(org.be.textbe.st.textst.DefinedByNode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_ParallelBlock(org.be.textbe.st.textst.ParallelBlock object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_be_textbe_st_textst_AlternativeBlock(org.be.textbe.st.textst.AlternativeBlock object, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (org.be.textbe.st.textst.resource.st.IStInterpreterListener listener : listeners) {
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
	
	public void addListener(org.be.textbe.st.textst.resource.st.IStInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.be.textbe.st.textst.resource.st.IStInterpreterListener listener) {
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
