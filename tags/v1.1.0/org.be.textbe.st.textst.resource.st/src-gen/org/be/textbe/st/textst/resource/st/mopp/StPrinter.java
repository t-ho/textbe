/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

public class StPrinter implements org.be.textbe.st.textst.resource.st.IStTextPrinter {
	
	protected org.be.textbe.st.textst.resource.st.IStTokenResolverFactory tokenResolverFactory = new org.be.textbe.st.textst.resource.st.mopp.StTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.be.textbe.st.textst.resource.st.IStTextResource resource;
	
	private java.util.Map<?, ?> options;
	
	public StPrinter(java.io.OutputStream outputStream, org.be.textbe.st.textst.resource.st.IStTextResource resource) {
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
		
		if (element instanceof org.be.textbe.st.textst.TextST) {
			print_org_be_textbe_st_textst_TextST((org.be.textbe.st.textst.TextST) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.st.textst.StructureTree) {
			print_org_be_textbe_st_textst_StructureTree((org.be.textbe.st.textst.StructureTree) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.st.textst.ParallelBlock) {
			print_org_be_textbe_st_textst_ParallelBlock((org.be.textbe.st.textst.ParallelBlock) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.st.textst.AlternativeBlock) {
			print_org_be_textbe_st_textst_AlternativeBlock((org.be.textbe.st.textst.AlternativeBlock) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.st.textst.RelatedToNode) {
			print_org_be_textbe_st_textst_RelatedToNode((org.be.textbe.st.textst.RelatedToNode) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.st.textst.DefinedByNode) {
			print_org_be_textbe_st_textst_DefinedByNode((org.be.textbe.st.textst.DefinedByNode) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.st.textst.Node) {
			print_org_be_textbe_st_textst_Node((org.be.textbe.st.textst.Node) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.st.textst.OptionList) {
			print_org_be_textbe_st_textst_OptionList((org.be.textbe.st.textst.OptionList) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.st.textst.Option) {
			print_org_be_textbe_st_textst_Option((org.be.textbe.st.textst.Option) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.st.textst.RequirementList) {
			print_org_be_textbe_st_textst_RequirementList((org.be.textbe.st.textst.RequirementList) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.st.textst.Requirement) {
			print_org_be_textbe_st_textst_Requirement((org.be.textbe.st.textst.Requirement) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.st.textst.ComponentList) {
			print_org_be_textbe_st_textst_ComponentList((org.be.textbe.st.textst.ComponentList) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.st.textst.SystemComponent) {
			print_org_be_textbe_st_textst_SystemComponent((org.be.textbe.st.textst.SystemComponent) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.st.textst.SecondaryRelation) {
			print_org_be_textbe_st_textst_SecondaryRelation((org.be.textbe.st.textst.SecondaryRelation) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.st.textst.Component) {
			print_org_be_textbe_st_textst_Component((org.be.textbe.st.textst.Component) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.be.textbe.st.textst.resource.st.mopp.StReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.be.textbe.st.textst.resource.st.mopp.StReferenceResolverSwitch) new org.be.textbe.st.textst.resource.st.mopp.StMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.be.textbe.st.textst.resource.st.IStTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.be.textbe.st.textst.resource.st.mopp.StProblem(errorMessage, org.be.textbe.st.textst.resource.st.StEProblemType.PRINT_PROBLEM, org.be.textbe.st.textst.resource.st.StEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public org.be.textbe.st.textst.resource.st.IStTextResource getResource() {
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
	
	public void print_org_be_textbe_st_textst_TextST(org.be.textbe.st.textst.TextST element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.TEXT_ST__OPTIONS));
		printCountingMap.put("options", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.TEXT_ST__REQUIREMENTS));
		printCountingMap.put("requirements", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.TEXT_ST__COMPONENTS));
		printCountingMap.put("components", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.TEXT_ST__STRUCTURE_TREE));
		printCountingMap.put("structureTree", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("options");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.TEXT_ST__OPTIONS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("options", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("requirements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.TEXT_ST__REQUIREMENTS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("requirements", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("components");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.TEXT_ST__COMPONENTS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("components", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("structureTree");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.TEXT_ST__STRUCTURE_TREE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("structureTree", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_st_textst_StructureTree(org.be.textbe.st.textst.StructureTree element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.STRUCTURE_TREE__ROOT_NODE));
		printCountingMap.put("rootNode", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#ST");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rootNode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.STRUCTURE_TREE__ROOT_NODE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rootNode", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_st_textst_ParallelBlock(org.be.textbe.st.textst.ParallelBlock element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.PARALLEL_BLOCK__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("#P{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_st_textst_ParallelBlock_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_st_textst_ParallelBlock_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_be_textbe_st_textst_ParallelBlock_0(org.be.textbe.st.textst.ParallelBlock element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("childNode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.PARALLEL_BLOCK__CHILD_NODE));
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
			printCountingMap.put("childNode", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_st_textst_AlternativeBlock(org.be.textbe.st.textst.AlternativeBlock element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.ALTERNATIVE_BLOCK__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("#N{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_st_textst_AlternativeBlock_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_st_textst_AlternativeBlock_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_be_textbe_st_textst_AlternativeBlock_0(org.be.textbe.st.textst.AlternativeBlock element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("childNode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.ALTERNATIVE_BLOCK__CHILD_NODE));
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
			printCountingMap.put("childNode", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_st_textst_RelatedToNode(org.be.textbe.st.textst.RelatedToNode element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__COMPONENT_REF));
		printCountingMap.put("componentRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__COMPONENT_SET));
		printCountingMap.put("componentSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__MCI));
		printCountingMap.put("mci", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER));
		printCountingMap.put("qualifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__SECOND_QUALIFIER));
		printCountingMap.put("secondQualifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF));
		printCountingMap.put("behaviorRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__REQUIREMENT_REF));
		printCountingMap.put("requirementRef", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__TRACEABILITY_STATUS));
		printCountingMap.put("traceabilityStatus", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_RelatedToNode_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("traceabilityStatus");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__TRACEABILITY_STATUS));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("VALIDITY");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__TRACEABILITY_STATUS), element));
				out.print(" ");
			}
			printCountingMap.put("traceabilityStatus", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_st_textst_RelatedToNode_1(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__OPERATOR));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATOR");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__OPERATOR), element));
				out.print(" ");
			}
			printCountingMap.put("operator", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("childNode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__CHILD_NODE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("childNode", count - 1);
		}
	}
	
	public void print_org_be_textbe_st_textst_RelatedToNode_0(org.be.textbe.st.textst.RelatedToNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("requirementRef");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__REQUIREMENT_REF));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__REQUIREMENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("requirementRef", 0);
		}
	}
	
	public void print_org_be_textbe_st_textst_RelatedToNode_1(org.be.textbe.st.textst.RelatedToNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"componentRef"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mci"		,
		"componentRef"		,
		"componentSet"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_st_textst_RelatedToNode_1_1(element, localtab, out, printCountingMap);
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("_");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_be_textbe_st_textst_RelatedToNode_1_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_org_be_textbe_st_textst_RelatedToNode_1_0(org.be.textbe.st.textst.RelatedToNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__COMPONENT_REF));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__COMPONENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("componentRef", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_RelatedToNode_1_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_RelatedToNode_1_0_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_st_textst_RelatedToNode_1_0_0(org.be.textbe.st.textst.RelatedToNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("behaviorRef");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT2");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), element));
					out.print(" ");
				}
				printCountingMap.put("behaviorRef", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_RelatedToNode_1_0_1(org.be.textbe.st.textst.RelatedToNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"qualifier"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"qualifier"		,
		"secondQualifier"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_st_textst_RelatedToNode_1_0_1_0(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("qualifier");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER), element));
					out.print(" ");
				}
				printCountingMap.put("qualifier", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_RelatedToNode_1_0_1_0(org.be.textbe.st.textst.RelatedToNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("qualifier", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("secondQualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__SECOND_QUALIFIER));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__SECOND_QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("secondQualifier", count - 1);
		}
	}
	
	public void print_org_be_textbe_st_textst_RelatedToNode_1_1(org.be.textbe.st.textst.RelatedToNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("mci");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__MCI));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("MCI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__MCI), element));
				out.print(" ");
			}
			printCountingMap.put("mci", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__COMPONENT_REF));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__COMPONENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("componentRef", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentSet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__COMPONENT_SET));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__COMPONENT_SET), element));
				out.print(" ");
			}
			printCountingMap.put("componentSet", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_RelatedToNode_1_1_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_RelatedToNode_1_1_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_st_textst_RelatedToNode_1_1_0(org.be.textbe.st.textst.RelatedToNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("behaviorRef");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT2");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), element));
					out.print(" ");
				}
				printCountingMap.put("behaviorRef", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_RelatedToNode_1_1_1(org.be.textbe.st.textst.RelatedToNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"qualifier"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"qualifier"		,
		"secondQualifier"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_st_textst_RelatedToNode_1_1_1_0(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("qualifier");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER), element));
					out.print(" ");
				}
				printCountingMap.put("qualifier", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_RelatedToNode_1_1_1_0(org.be.textbe.st.textst.RelatedToNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("qualifier", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("secondQualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__SECOND_QUALIFIER));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__SECOND_QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("secondQualifier", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_st_textst_DefinedByNode(org.be.textbe.st.textst.DefinedByNode element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__COMPONENT_REF));
		printCountingMap.put("componentRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__COMPONENT_SET));
		printCountingMap.put("componentSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__MCI));
		printCountingMap.put("mci", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER));
		printCountingMap.put("qualifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER));
		printCountingMap.put("secondQualifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF));
		printCountingMap.put("behaviorRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__REQUIREMENT_REF));
		printCountingMap.put("requirementRef", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__TRACEABILITY_STATUS));
		printCountingMap.put("traceabilityStatus", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_DefinedByNode_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("traceabilityStatus");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__TRACEABILITY_STATUS));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("VALIDITY");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__TRACEABILITY_STATUS), element));
				out.print(" ");
			}
			printCountingMap.put("traceabilityStatus", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_st_textst_DefinedByNode_1(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__OPERATOR));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATOR");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__OPERATOR), element));
				out.print(" ");
			}
			printCountingMap.put("operator", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("childNode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__CHILD_NODE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("childNode", count - 1);
		}
	}
	
	public void print_org_be_textbe_st_textst_DefinedByNode_0(org.be.textbe.st.textst.DefinedByNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("requirementRef");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__REQUIREMENT_REF));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__REQUIREMENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("requirementRef", 0);
		}
	}
	
	public void print_org_be_textbe_st_textst_DefinedByNode_1(org.be.textbe.st.textst.DefinedByNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"componentRef"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mci"		,
		"componentRef"		,
		"componentSet"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_st_textst_DefinedByNode_1_1(element, localtab, out, printCountingMap);
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("_");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_be_textbe_st_textst_DefinedByNode_1_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_org_be_textbe_st_textst_DefinedByNode_1_0(org.be.textbe.st.textst.DefinedByNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__COMPONENT_REF));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__COMPONENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("componentRef", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_DefinedByNode_1_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_DefinedByNode_1_0_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_st_textst_DefinedByNode_1_0_0(org.be.textbe.st.textst.DefinedByNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("behaviorRef");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT2");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), element));
					out.print(" ");
				}
				printCountingMap.put("behaviorRef", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_DefinedByNode_1_0_1(org.be.textbe.st.textst.DefinedByNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"qualifier"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"qualifier"		,
		"secondQualifier"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_st_textst_DefinedByNode_1_0_1_0(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("qualifier");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER), element));
					out.print(" ");
				}
				printCountingMap.put("qualifier", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_DefinedByNode_1_0_1_0(org.be.textbe.st.textst.DefinedByNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("qualifier", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("secondQualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("secondQualifier", count - 1);
		}
	}
	
	public void print_org_be_textbe_st_textst_DefinedByNode_1_1(org.be.textbe.st.textst.DefinedByNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("mci");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__MCI));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("MCI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__MCI), element));
				out.print(" ");
			}
			printCountingMap.put("mci", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__COMPONENT_REF));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__COMPONENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("componentRef", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentSet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__COMPONENT_SET));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__COMPONENT_SET), element));
				out.print(" ");
			}
			printCountingMap.put("componentSet", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_DefinedByNode_1_1_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_DefinedByNode_1_1_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_st_textst_DefinedByNode_1_1_0(org.be.textbe.st.textst.DefinedByNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("behaviorRef");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT2");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), element));
					out.print(" ");
				}
				printCountingMap.put("behaviorRef", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_DefinedByNode_1_1_1(org.be.textbe.st.textst.DefinedByNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"qualifier"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"qualifier"		,
		"secondQualifier"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_st_textst_DefinedByNode_1_1_1_0(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("qualifier");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER), element));
					out.print(" ");
				}
				printCountingMap.put("qualifier", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_DefinedByNode_1_1_1_0(org.be.textbe.st.textst.DefinedByNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("qualifier", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("secondQualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("secondQualifier", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_st_textst_Node(org.be.textbe.st.textst.Node element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__COMPONENT_REF));
		printCountingMap.put("componentRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__COMPONENT_SET));
		printCountingMap.put("componentSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__MCI));
		printCountingMap.put("mci", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER));
		printCountingMap.put("qualifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__SECOND_QUALIFIER));
		printCountingMap.put("secondQualifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF));
		printCountingMap.put("behaviorRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__REQUIREMENT_REF));
		printCountingMap.put("requirementRef", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__TRACEABILITY_STATUS));
		printCountingMap.put("traceabilityStatus", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_Node_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("traceabilityStatus");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__TRACEABILITY_STATUS));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("VALIDITY");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__TRACEABILITY_STATUS), element));
				out.print(" ");
			}
			printCountingMap.put("traceabilityStatus", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_st_textst_Node_1(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__OPERATOR));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATOR");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__OPERATOR), element));
				out.print(" ");
			}
			printCountingMap.put("operator", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("childNode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__CHILD_NODE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("childNode", count - 1);
		}
	}
	
	public void print_org_be_textbe_st_textst_Node_0(org.be.textbe.st.textst.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("requirementRef");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__REQUIREMENT_REF));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__REQUIREMENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("requirementRef", 0);
		}
	}
	
	public void print_org_be_textbe_st_textst_Node_1(org.be.textbe.st.textst.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"componentRef"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mci"		,
		"componentRef"		,
		"componentSet"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_st_textst_Node_1_1(element, localtab, out, printCountingMap);
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("_");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_be_textbe_st_textst_Node_1_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_org_be_textbe_st_textst_Node_1_0(org.be.textbe.st.textst.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__COMPONENT_REF));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__COMPONENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("componentRef", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_Node_1_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_Node_1_0_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_st_textst_Node_1_0_0(org.be.textbe.st.textst.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("behaviorRef");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT2");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), element));
					out.print(" ");
				}
				printCountingMap.put("behaviorRef", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_Node_1_0_1(org.be.textbe.st.textst.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"qualifier"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"qualifier"		,
		"secondQualifier"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_st_textst_Node_1_0_1_0(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("qualifier");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER), element));
					out.print(" ");
				}
				printCountingMap.put("qualifier", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_Node_1_0_1_0(org.be.textbe.st.textst.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("qualifier", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("secondQualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__SECOND_QUALIFIER));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__SECOND_QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("secondQualifier", count - 1);
		}
	}
	
	public void print_org_be_textbe_st_textst_Node_1_1(org.be.textbe.st.textst.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("mci");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__MCI));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("MCI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__MCI), element));
				out.print(" ");
			}
			printCountingMap.put("mci", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__COMPONENT_REF));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__COMPONENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("componentRef", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentSet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__COMPONENT_SET));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__COMPONENT_SET), element));
				out.print(" ");
			}
			printCountingMap.put("componentSet", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_Node_1_1_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_Node_1_1_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_st_textst_Node_1_1_0(org.be.textbe.st.textst.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviorRef"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("behaviorRef");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT2");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), element));
					out.print(" ");
				}
				printCountingMap.put("behaviorRef", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_Node_1_1_1(org.be.textbe.st.textst.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"qualifier"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"qualifier"		,
		"secondQualifier"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_st_textst_Node_1_1_1_0(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("qualifier");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER), element));
					out.print(" ");
				}
				printCountingMap.put("qualifier", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_Node_1_1_1_0(org.be.textbe.st.textst.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("qualifier", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("secondQualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__SECOND_QUALIFIER));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__SECOND_QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("secondQualifier", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_st_textst_OptionList(org.be.textbe.st.textst.OptionList element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.OPTION_LIST__OPTIONS));
		printCountingMap.put("options", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#OPTIONS");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("options");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.OPTION_LIST__OPTIONS));
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
	
	
	public void print_org_be_textbe_st_textst_Option(org.be.textbe.st.textst.Option element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.OPTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.OPTION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.OPTION__NAME));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT2");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.OPTION__NAME), element));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.OPTION__VALUE));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT2");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.OPTION__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_st_textst_RequirementList(org.be.textbe.st.textst.RequirementList element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT_LIST__REQUIREMENTS));
		printCountingMap.put("requirements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#RT");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("requirements");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT_LIST__REQUIREMENTS));
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
	
	
	public void print_org_be_textbe_st_textst_Requirement(org.be.textbe.st.textst.Requirement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__REF));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_st_textst_Requirement_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_be_textbe_st_textst_Requirement_0(org.be.textbe.st.textst.Requirement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT2");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	
	public void print_org_be_textbe_st_textst_ComponentList(org.be.textbe.st.textst.ComponentList element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT_LIST__COMPONENTS));
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
			print_org_be_textbe_st_textst_ComponentList_0(element, localtab, out1, printCountingMap1);
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
		print_org_be_textbe_st_textst_ComponentList_1(element, localtab, out1, printCountingMap1);
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
			print_org_be_textbe_st_textst_ComponentList_2(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_st_textst_ComponentList_0(org.be.textbe.st.textst.ComponentList element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#C");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("components");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT_LIST__COMPONENTS));
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
	
	public void print_org_be_textbe_st_textst_ComponentList_1(org.be.textbe.st.textst.ComponentList element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#SC");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("components");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT_LIST__COMPONENTS));
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
	
	public void print_org_be_textbe_st_textst_ComponentList_2(org.be.textbe.st.textst.ComponentList element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#C");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("components");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT_LIST__COMPONENTS));
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
	
	
	public void print_org_be_textbe_st_textst_Component(org.be.textbe.st.textst.Component element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__BEHAVIORS));
		printCountingMap.put("behaviors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__REF));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_st_textst_Component_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_st_textst_Component_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_st_textst_Component_0(org.be.textbe.st.textst.Component element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT2");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__VAL));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_Component_1(org.be.textbe.st.textst.Component element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#SR");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__BEHAVIORS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("behaviors", 0);
		}
	}
	
	
	public void print_org_be_textbe_st_textst_SystemComponent(org.be.textbe.st.textst.SystemComponent element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__BEHAVIORS));
		printCountingMap.put("behaviors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__REF));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_st_textst_SystemComponent_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_st_textst_SystemComponent_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_st_textst_SystemComponent_0(org.be.textbe.st.textst.SystemComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT2");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__VAL));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_SystemComponent_1(org.be.textbe.st.textst.SystemComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#SR");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__BEHAVIORS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("behaviors", 0);
		}
	}
	
	
	public void print_org_be_textbe_st_textst_SecondaryRelation(org.be.textbe.st.textst.SecondaryRelation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__BEHAVIOR_REF));
		printCountingMap.put("behaviorRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_LOWER_BOUND));
		printCountingMap.put("primaryLowerBound", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_UPPER_BOUND));
		printCountingMap.put("primaryUpperBound", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_LOWER_BOUND));
		printCountingMap.put("secondaryLowerBound", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_UPPER_BOUND));
		printCountingMap.put("secondaryUpperBound", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_REF));
		printCountingMap.put("componentRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE));
		printCountingMap.put("componentAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__RELATION_NAME));
		printCountingMap.put("relationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_st_textst_SecondaryRelation_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_be_textbe_st_textst_SecondaryRelation_0(org.be.textbe.st.textst.SecondaryRelation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("behaviorRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__BEHAVIOR_REF));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__BEHAVIOR_REF), element));
				out.print(" ");
			}
			printCountingMap.put("behaviorRef", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_SecondaryRelation_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_SecondaryRelation_0_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_REF));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("componentRef", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_SecondaryRelation_0_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_SecondaryRelation_0_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_st_textst_SecondaryRelation_0_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_st_textst_SecondaryRelation_0_0(org.be.textbe.st.textst.SecondaryRelation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_st_textst_SecondaryRelation_0_0_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_be_textbe_st_textst_SecondaryRelation_0_0_0(org.be.textbe.st.textst.SecondaryRelation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"attribute"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"attribute"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"attribute"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"attribute"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("attribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE), element));
						out.print(" ");
					}
					printCountingMap.put("attribute", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("attribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE), element));
						out.print(" ");
					}
					printCountingMap.put("attribute", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("attribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE), element));
						out.print(" ");
					}
					printCountingMap.put("attribute", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("attribute");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT2");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE), element));
					out.print(" ");
				}
				printCountingMap.put("attribute", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_SecondaryRelation_0_1(org.be.textbe.st.textst.SecondaryRelation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"primaryLowerBound"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"primaryLowerBound"		,
		"primaryUpperBound"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_st_textst_SecondaryRelation_0_1_0(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("primaryLowerBound");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_LOWER_BOUND));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_LOWER_BOUND), element));
					out.print(" ");
				}
				printCountingMap.put("primaryLowerBound", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_SecondaryRelation_0_1_0(org.be.textbe.st.textst.SecondaryRelation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("primaryLowerBound");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_LOWER_BOUND));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_LOWER_BOUND), element));
				out.print(" ");
			}
			printCountingMap.put("primaryLowerBound", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_st_textst_SecondaryRelation_0_1_0_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_be_textbe_st_textst_SecondaryRelation_0_1_0_0(org.be.textbe.st.textst.SecondaryRelation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"primaryUpperBound"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"primaryUpperBound"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("primaryUpperBound");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_UPPER_BOUND));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_UPPER_BOUND), element));
						out.print(" ");
					}
					printCountingMap.put("primaryUpperBound", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("primaryUpperBound");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_UPPER_BOUND));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("UPPERBOUND");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_UPPER_BOUND), element));
					out.print(" ");
				}
				printCountingMap.put("primaryUpperBound", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_SecondaryRelation_0_2(org.be.textbe.st.textst.SecondaryRelation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_st_textst_SecondaryRelation_0_2_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_be_textbe_st_textst_SecondaryRelation_0_2_0(org.be.textbe.st.textst.SecondaryRelation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"componentAttribute"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"componentAttribute"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"componentAttribute"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"componentAttribute"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("componentAttribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE), element));
						out.print(" ");
					}
					printCountingMap.put("componentAttribute", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("componentAttribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE), element));
						out.print(" ");
					}
					printCountingMap.put("componentAttribute", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("componentAttribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE), element));
						out.print(" ");
					}
					printCountingMap.put("componentAttribute", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("componentAttribute");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT2");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE), element));
					out.print(" ");
				}
				printCountingMap.put("componentAttribute", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_SecondaryRelation_0_3(org.be.textbe.st.textst.SecondaryRelation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"secondaryLowerBound"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"secondaryLowerBound"		,
		"secondaryUpperBound"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_st_textst_SecondaryRelation_0_3_0(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("secondaryLowerBound");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_LOWER_BOUND));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_LOWER_BOUND), element));
					out.print(" ");
				}
				printCountingMap.put("secondaryLowerBound", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_SecondaryRelation_0_3_0(org.be.textbe.st.textst.SecondaryRelation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("secondaryLowerBound");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_LOWER_BOUND));
			if (o != null) {
				org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_LOWER_BOUND), element));
				out.print(" ");
			}
			printCountingMap.put("secondaryLowerBound", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_st_textst_SecondaryRelation_0_3_0_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_be_textbe_st_textst_SecondaryRelation_0_3_0_0(org.be.textbe.st.textst.SecondaryRelation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"secondaryUpperBound"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"secondaryUpperBound"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("secondaryUpperBound");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_UPPER_BOUND));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_UPPER_BOUND), element));
						out.print(" ");
					}
					printCountingMap.put("secondaryUpperBound", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("secondaryUpperBound");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_UPPER_BOUND));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("UPPERBOUND");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_UPPER_BOUND), element));
					out.print(" ");
				}
				printCountingMap.put("secondaryUpperBound", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_st_textst_SecondaryRelation_0_4(org.be.textbe.st.textst.SecondaryRelation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"relationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"relationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"relationName"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("relationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__RELATION_NAME));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__RELATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("relationName", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("relationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__RELATION_NAME));
					if (o != null) {
						org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__RELATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("relationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("relationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__RELATION_NAME));
				if (o != null) {
					org.be.textbe.st.textst.resource.st.IStTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT2");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__RELATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("relationName", count - 1);
			}
		}
	}
	
	
}
