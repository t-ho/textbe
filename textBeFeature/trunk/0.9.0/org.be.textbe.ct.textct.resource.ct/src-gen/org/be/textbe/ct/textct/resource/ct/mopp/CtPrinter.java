/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

public class CtPrinter implements org.be.textbe.ct.textct.resource.ct.ICtTextPrinter {
	
	protected org.be.textbe.ct.textct.resource.ct.ICtTokenResolverFactory tokenResolverFactory = new org.be.textbe.ct.textct.resource.ct.mopp.CtTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.be.textbe.ct.textct.resource.ct.ICtTextResource resource;
	
	private java.util.Map<?, ?> options;
	
	public CtPrinter(java.io.OutputStream outputStream, org.be.textbe.ct.textct.resource.ct.ICtTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.be.textbe.ct.textct.TextCT) {
			print_org_be_textbe_ct_textct_TextCT((org.be.textbe.ct.textct.TextCT) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.CompositionTree) {
			print_org_be_textbe_ct_textct_CompositionTree((org.be.textbe.ct.textct.CompositionTree) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.AggregatedNode) {
			print_org_be_textbe_ct_textct_AggregatedNode((org.be.textbe.ct.textct.AggregatedNode) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.AssociatedNode) {
			print_org_be_textbe_ct_textct_AssociatedNode((org.be.textbe.ct.textct.AssociatedNode) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.InheritedNode) {
			print_org_be_textbe_ct_textct_InheritedNode((org.be.textbe.ct.textct.InheritedNode) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.AggregatedBlock) {
			print_org_be_textbe_ct_textct_AggregatedBlock((org.be.textbe.ct.textct.AggregatedBlock) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.AssociatedBlock) {
			print_org_be_textbe_ct_textct_AssociatedBlock((org.be.textbe.ct.textct.AssociatedBlock) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.InheritedBlock) {
			print_org_be_textbe_ct_textct_InheritedBlock((org.be.textbe.ct.textct.InheritedBlock) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.Node) {
			print_org_be_textbe_ct_textct_Node((org.be.textbe.ct.textct.Node) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.OptionList) {
			print_org_be_textbe_ct_textct_OptionList((org.be.textbe.ct.textct.OptionList) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.Option) {
			print_org_be_textbe_ct_textct_Option((org.be.textbe.ct.textct.Option) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.RequirementList) {
			print_org_be_textbe_ct_textct_RequirementList((org.be.textbe.ct.textct.RequirementList) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.Requirement) {
			print_org_be_textbe_ct_textct_Requirement((org.be.textbe.ct.textct.Requirement) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.ComponentList) {
			print_org_be_textbe_ct_textct_ComponentList((org.be.textbe.ct.textct.ComponentList) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.SystemComponent) {
			print_org_be_textbe_ct_textct_SystemComponent((org.be.textbe.ct.textct.SystemComponent) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.ct.textct.Component) {
			print_org_be_textbe_ct_textct_Component((org.be.textbe.ct.textct.Component) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.be.textbe.ct.textct.resource.ct.mopp.CtReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.be.textbe.ct.textct.resource.ct.mopp.CtReferenceResolverSwitch) new org.be.textbe.ct.textct.resource.ct.mopp.CtMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.be.textbe.ct.textct.resource.ct.ICtTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.be.textbe.ct.textct.resource.ct.mopp.CtProblem(errorMessage, org.be.textbe.ct.textct.resource.ct.CtEProblemType.PRINT_PROBLEM, org.be.textbe.ct.textct.resource.ct.CtEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public org.be.textbe.ct.textct.resource.ct.ICtTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_org_be_textbe_ct_textct_TextCT(org.be.textbe.ct.textct.TextCT element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__OPTIONS));
		printCountingMap.put("options", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__REQUIREMENTS));
		printCountingMap.put("requirements", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__COMPONENTS));
		printCountingMap.put("components", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__COMPOSITION_TREE));
		printCountingMap.put("compositionTree", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("options");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__OPTIONS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("options", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("requirements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__REQUIREMENTS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("requirements", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("components");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__COMPONENTS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("components", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compositionTree");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__COMPOSITION_TREE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compositionTree", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_ct_textct_CompositionTree(org.be.textbe.ct.textct.CompositionTree element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPOSITION_TREE__ROOT_NODE));
		printCountingMap.put("rootNode", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#T");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rootNode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPOSITION_TREE__ROOT_NODE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rootNode", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_ct_textct_AggregatedNode(org.be.textbe.ct.textct.AggregatedNode element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__COMPONENT_REF));
		printCountingMap.put("componentRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__REQUIREMENT_REF));
		printCountingMap.put("requirementRef", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__TRACEABILITY_STATUS));
		printCountingMap.put("traceabilityStatus", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__COMPONENT_SET));
		printCountingMap.put("componentSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__MCI));
		printCountingMap.put("mci", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__COMPONENT_REF));
			if (o != null) {
				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__COMPONENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("componentRef", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_ct_textct_AggregatedNode_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_ct_textct_AggregatedNode_0(org.be.textbe.ct.textct.AggregatedNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("childNode");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__CHILD_NODE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("childNode", 0);
		}
	}
	
	
	public void print_org_be_textbe_ct_textct_AssociatedNode(org.be.textbe.ct.textct.AssociatedNode element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__COMPONENT_REF));
		printCountingMap.put("componentRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__REQUIREMENT_REF));
		printCountingMap.put("requirementRef", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__TRACEABILITY_STATUS));
		printCountingMap.put("traceabilityStatus", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__COMPONENT_SET));
		printCountingMap.put("componentSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__MCI));
		printCountingMap.put("mci", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__COMPONENT_REF));
			if (o != null) {
				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__COMPONENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("componentRef", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_ct_textct_AssociatedNode_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_ct_textct_AssociatedNode_0(org.be.textbe.ct.textct.AssociatedNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("childNode");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__CHILD_NODE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("childNode", 0);
		}
	}
	
	
	public void print_org_be_textbe_ct_textct_InheritedNode(org.be.textbe.ct.textct.InheritedNode element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__COMPONENT_REF));
		printCountingMap.put("componentRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__REQUIREMENT_REF));
		printCountingMap.put("requirementRef", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__TRACEABILITY_STATUS));
		printCountingMap.put("traceabilityStatus", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__COMPONENT_SET));
		printCountingMap.put("componentSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__MCI));
		printCountingMap.put("mci", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("<=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__COMPONENT_REF));
			if (o != null) {
				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__COMPONENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("componentRef", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_ct_textct_InheritedNode_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_ct_textct_InheritedNode_0(org.be.textbe.ct.textct.InheritedNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("childNode");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__CHILD_NODE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("childNode", 0);
		}
	}
	
	
	public void print_org_be_textbe_ct_textct_AggregatedBlock(org.be.textbe.ct.textct.AggregatedBlock element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_BLOCK__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("childNode");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_BLOCK__CHILD_NODE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("childNode", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_org_be_textbe_ct_textct_AssociatedBlock(org.be.textbe.ct.textct.AssociatedBlock element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_BLOCK__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("childNode");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_BLOCK__CHILD_NODE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("childNode", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_org_be_textbe_ct_textct_InheritedBlock(org.be.textbe.ct.textct.InheritedBlock element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_BLOCK__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("<=");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("childNode");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_BLOCK__CHILD_NODE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("childNode", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_org_be_textbe_ct_textct_Node(org.be.textbe.ct.textct.Node element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__COMPONENT_REF));
		printCountingMap.put("componentRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__REQUIREMENT_REF));
		printCountingMap.put("requirementRef", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__TRACEABILITY_STATUS));
		printCountingMap.put("traceabilityStatus", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__COMPONENT_SET));
		printCountingMap.put("componentSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__MCI));
		printCountingMap.put("mci", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__COMPONENT_REF));
			if (o != null) {
				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__COMPONENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("componentRef", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_ct_textct_Node_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_ct_textct_Node_0(org.be.textbe.ct.textct.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("childNode");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__CHILD_NODE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("childNode", 0);
		}
	}
	
	
	public void print_org_be_textbe_ct_textct_OptionList(org.be.textbe.ct.textct.OptionList element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION_LIST__OPTIONS));
		printCountingMap.put("options", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#OPTIONS");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("options");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION_LIST__OPTIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("options", 0);
		}
	}
	
	
	public void print_org_be_textbe_ct_textct_Option(org.be.textbe.ct.textct.Option element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION__NAME));
			if (o != null) {
				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION__VALUE));
			if (o != null) {
				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_ct_textct_RequirementList(org.be.textbe.ct.textct.RequirementList element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT_LIST__REQUIREMENTS));
		printCountingMap.put("requirements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#RT");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("requirements");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT_LIST__REQUIREMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("requirements", 0);
		}
	}
	
	
	public void print_org_be_textbe_ct_textct_Requirement(org.be.textbe.ct.textct.Requirement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__REF));
			if (o != null) {
				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_ct_textct_Requirement_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_be_textbe_ct_textct_Requirement_0(org.be.textbe.ct.textct.Requirement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL));
					if (o != null) {
						org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL));
					if (o != null) {
						org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL));
					if (o != null) {
						org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL));
				if (o != null) {
					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	
	public void print_org_be_textbe_ct_textct_ComponentList(org.be.textbe.ct.textct.ComponentList element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT_LIST__COMPONENTS));
		printCountingMap.put("components", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_ct_textct_ComponentList_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_ct_textct_ComponentList_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_ct_textct_ComponentList_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_be_textbe_ct_textct_ComponentList_0(org.be.textbe.ct.textct.ComponentList element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#C");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("components");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT_LIST__COMPONENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("components", count - 1);
		}
	}
	
	public void print_org_be_textbe_ct_textct_ComponentList_1(org.be.textbe.ct.textct.ComponentList element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#SC");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("components");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT_LIST__COMPONENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("components", count - 1);
		}
	}
	
	public void print_org_be_textbe_ct_textct_ComponentList_2(org.be.textbe.ct.textct.ComponentList element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#C");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("components");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT_LIST__COMPONENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("components", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_ct_textct_Component(org.be.textbe.ct.textct.Component element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__BEHAVIORS));
		printCountingMap.put("behaviors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__QUANTIFIER));
		printCountingMap.put("quantifier", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__REF));
			if (o != null) {
				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_ct_textct_Component_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_be_textbe_ct_textct_Component_0(org.be.textbe.ct.textct.Component element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENTNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL));
				if (o != null) {
					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	
	public void print_org_be_textbe_ct_textct_SystemComponent(org.be.textbe.ct.textct.SystemComponent element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__BEHAVIORS));
		printCountingMap.put("behaviors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__QUANTIFIER));
		printCountingMap.put("quantifier", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__REF));
			if (o != null) {
				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_ct_textct_SystemComponent_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_be_textbe_ct_textct_SystemComponent_0(org.be.textbe.ct.textct.SystemComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENTNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL));
				if (o != null) {
					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	
}
