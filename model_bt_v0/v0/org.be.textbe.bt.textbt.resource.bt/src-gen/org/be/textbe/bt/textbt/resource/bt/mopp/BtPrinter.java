/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

public class BtPrinter implements org.be.textbe.bt.textbt.resource.bt.IBtTextPrinter {
	
	protected org.be.textbe.bt.textbt.resource.bt.IBtTokenResolverFactory tokenResolverFactory = new org.be.textbe.bt.textbt.resource.bt.mopp.BtTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.be.textbe.bt.textbt.resource.bt.IBtTextResource resource;
	
	private java.util.Map<?, ?> options;
	
	public BtPrinter(java.io.OutputStream outputStream, org.be.textbe.bt.textbt.resource.bt.IBtTextResource resource) {
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
		
		if (element instanceof org.be.textbe.bt.textbt.TextBT) {
			print_org_be_textbe_bt_textbt_TextBT((org.be.textbe.bt.textbt.TextBT) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.BehaviorTree) {
			print_org_be_textbe_bt_textbt_BehaviorTree((org.be.textbe.bt.textbt.BehaviorTree) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.AtomicNode) {
			print_org_be_textbe_bt_textbt_AtomicNode((org.be.textbe.bt.textbt.AtomicNode) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.SequentialNode) {
			print_org_be_textbe_bt_textbt_SequentialNode((org.be.textbe.bt.textbt.SequentialNode) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.ParallelBlock) {
			print_org_be_textbe_bt_textbt_ParallelBlock((org.be.textbe.bt.textbt.ParallelBlock) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.AlternativeBlock) {
			print_org_be_textbe_bt_textbt_AlternativeBlock((org.be.textbe.bt.textbt.AlternativeBlock) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.Node) {
			print_org_be_textbe_bt_textbt_Node((org.be.textbe.bt.textbt.Node) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.OptionList) {
			print_org_be_textbe_bt_textbt_OptionList((org.be.textbe.bt.textbt.OptionList) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.Option) {
			print_org_be_textbe_bt_textbt_Option((org.be.textbe.bt.textbt.Option) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.RequirementList) {
			print_org_be_textbe_bt_textbt_RequirementList((org.be.textbe.bt.textbt.RequirementList) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.Requirement) {
			print_org_be_textbe_bt_textbt_Requirement((org.be.textbe.bt.textbt.Requirement) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.ComponentList) {
			print_org_be_textbe_bt_textbt_ComponentList((org.be.textbe.bt.textbt.ComponentList) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.SystemComponent) {
			print_org_be_textbe_bt_textbt_SystemComponent((org.be.textbe.bt.textbt.SystemComponent) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.State) {
			print_org_be_textbe_bt_textbt_State((org.be.textbe.bt.textbt.State) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.Selection) {
			print_org_be_textbe_bt_textbt_Selection((org.be.textbe.bt.textbt.Selection) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.Event) {
			print_org_be_textbe_bt_textbt_Event((org.be.textbe.bt.textbt.Event) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.Guard) {
			print_org_be_textbe_bt_textbt_Guard((org.be.textbe.bt.textbt.Guard) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.InternalInput) {
			print_org_be_textbe_bt_textbt_InternalInput((org.be.textbe.bt.textbt.InternalInput) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.InternalOutput) {
			print_org_be_textbe_bt_textbt_InternalOutput((org.be.textbe.bt.textbt.InternalOutput) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.ExternalInput) {
			print_org_be_textbe_bt_textbt_ExternalInput((org.be.textbe.bt.textbt.ExternalInput) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.ExternalOutput) {
			print_org_be_textbe_bt_textbt_ExternalOutput((org.be.textbe.bt.textbt.ExternalOutput) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.Assertion) {
			print_org_be_textbe_bt_textbt_Assertion((org.be.textbe.bt.textbt.Assertion) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.Relation) {
			print_org_be_textbe_bt_textbt_Relation((org.be.textbe.bt.textbt.Relation) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.RelationalBehavior) {
			print_org_be_textbe_bt_textbt_RelationalBehavior((org.be.textbe.bt.textbt.RelationalBehavior) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.textbt.Component) {
			print_org_be_textbe_bt_textbt_Component((org.be.textbe.bt.textbt.Component) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.be.textbe.bt.textbt.resource.bt.mopp.BtReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.be.textbe.bt.textbt.resource.bt.mopp.BtReferenceResolverSwitch) new org.be.textbe.bt.textbt.resource.bt.mopp.BtMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.be.textbe.bt.textbt.resource.bt.IBtTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.be.textbe.bt.textbt.resource.bt.mopp.BtProblem(errorMessage, org.be.textbe.bt.textbt.resource.bt.BtEProblemType.PRINT_PROBLEM, org.be.textbe.bt.textbt.resource.bt.BtEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTextResource getResource() {
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
	
	public void print_org_be_textbe_bt_textbt_TextBT(org.be.textbe.bt.textbt.TextBT element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.TEXT_BT__OPTIONS));
		printCountingMap.put("options", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.TEXT_BT__REQUIREMENTS));
		printCountingMap.put("requirements", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.TEXT_BT__COMPONENTS));
		printCountingMap.put("components", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.TEXT_BT__BEHAVIOR_TREE));
		printCountingMap.put("behaviorTree", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("options");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.TEXT_BT__OPTIONS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("options", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("requirements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.TEXT_BT__REQUIREMENTS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("requirements", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("components");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.TEXT_BT__COMPONENTS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("components", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviorTree");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.TEXT_BT__BEHAVIOR_TREE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("behaviorTree", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_BehaviorTree(org.be.textbe.bt.textbt.BehaviorTree element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.BEHAVIOR_TREE__ROOT_NODE));
		printCountingMap.put("rootNode", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#T");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rootNode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.BEHAVIOR_TREE__ROOT_NODE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rootNode", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_AtomicNode(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__COMPONENT_REF));
		printCountingMap.put("componentRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__BEHAVIOR_REF));
		printCountingMap.put("behaviorRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__REQUIREMENT_REF));
		printCountingMap.put("requirementRef", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__TRACEABILITY_STATUS));
		printCountingMap.put("traceabilityStatus", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__COMPONENT_SET));
		printCountingMap.put("componentSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__MCI));
		printCountingMap.put("mci", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print(";;");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_AtomicNode_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_be_textbe_bt_textbt_AtomicNode_0(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mci"		,
		"componentRef"		,
		"componentSet"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"componentRef"		,
		"behaviorRef"		));
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
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (CompoundDefinition)
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
				print_org_be_textbe_bt_textbt_AtomicNode_0_4(element, localtab, out1, printCountingMap1);
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
				print_org_be_textbe_bt_textbt_AtomicNode_0_5(element, localtab, out1, printCountingMap1);
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__COMPONENT_REF));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__COMPONENT_REF), element));
						out.print(" ");
					}
					printCountingMap.put("componentRef", count - 1);
				}
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("label");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__LABEL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__LABEL), element));
						out.print(" ");
					}
					printCountingMap.put("label", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_AtomicNode_0_6(element, localtab, out, printCountingMap);
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("childNode");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__CHILD_NODE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("childNode", count - 1);
				}
			}
			break;
			case 2:			{
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (CompoundDefinition)
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
				print_org_be_textbe_bt_textbt_AtomicNode_0_7(element, localtab, out1, printCountingMap1);
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
				print_org_be_textbe_bt_textbt_AtomicNode_0_8(element, localtab, out1, printCountingMap1);
				if (printCountingMap.equals(printCountingMap1)) {
					out1.close();
				} else {
					out1.flush();
					out1.close();
					out.print(sWriter.toString());
					printCountingMap.putAll(printCountingMap1);
				}
				// DEFINITION PART BEGINS (CsString)
				out.print("_");
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("label");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__LABEL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__LABEL), element));
						out.print(" ");
					}
					printCountingMap.put("label", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_AtomicNode_0_9(element, localtab, out, printCountingMap);
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("childNode");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__CHILD_NODE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("childNode", count - 1);
				}
			}
			break;
			default:			java.io.StringWriter sWriter = null;
			java.io.PrintWriter out1 = null;
			java.util.Map<String, Integer> printCountingMap1 = null;
			// DEFINITION PART BEGINS (CompoundDefinition)
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_textbt_AtomicNode_0_0(element, localtab, out1, printCountingMap1);
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
			print_org_be_textbe_bt_textbt_AtomicNode_0_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_be_textbe_bt_textbt_AtomicNode_0_2(element, localtab, out, printCountingMap);
			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("componentRef");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__COMPONENT_REF));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__COMPONENT_REF), element));
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
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__COMPONENT_SET));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__COMPONENT_SET), element));
					out.print(" ");
				}
				printCountingMap.put("componentSet", count - 1);
			}
			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("behaviorRef");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__BEHAVIOR_REF));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__BEHAVIOR_REF), element));
					out.print(" ");
				}
				printCountingMap.put("behaviorRef", count - 1);
			}
			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("label");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__LABEL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__LABEL), element));
					out.print(" ");
				}
				printCountingMap.put("label", count - 1);
			}
			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_be_textbe_bt_textbt_AtomicNode_0_3(element, localtab, out, printCountingMap);
			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("childNode");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__CHILD_NODE));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("childNode", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_AtomicNode_0_0(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("requirementRef");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__REQUIREMENT_REF));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__REQUIREMENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("requirementRef", 0);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_AtomicNode_0_1(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("traceabilityStatus");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__TRACEABILITY_STATUS));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__TRACEABILITY_STATUS), element));
						out.print(" ");
					}
					printCountingMap.put("traceabilityStatus", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("traceabilityStatus");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__TRACEABILITY_STATUS));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("VALIDITY");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__TRACEABILITY_STATUS), element));
					out.print(" ");
				}
				printCountingMap.put("traceabilityStatus", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_AtomicNode_0_2(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mci"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mci"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("mci");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__MCI));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("PERCENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__MCI), element));
						out.print(" ");
					}
					printCountingMap.put("mci", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("mci");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__MCI));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("MCI");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__MCI), element));
					out.print(" ");
				}
				printCountingMap.put("mci", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_AtomicNode_0_3(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_bt_textbt_AtomicNode_0_3_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_AtomicNode_0_3_0(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATORWITHLABEL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("PERCENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQUALS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("operator");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATOR");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
					out.print(" ");
				}
				printCountingMap.put("operator", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_AtomicNode_0_4(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("requirementRef");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__REQUIREMENT_REF));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__REQUIREMENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("requirementRef", 0);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_AtomicNode_0_5(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("traceabilityStatus");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__TRACEABILITY_STATUS));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__TRACEABILITY_STATUS), element));
						out.print(" ");
					}
					printCountingMap.put("traceabilityStatus", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("traceabilityStatus");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__TRACEABILITY_STATUS));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("VALIDITY");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__TRACEABILITY_STATUS), element));
					out.print(" ");
				}
				printCountingMap.put("traceabilityStatus", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_AtomicNode_0_6(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_bt_textbt_AtomicNode_0_6_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_AtomicNode_0_6_0(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATORWITHLABEL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("PERCENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQUALS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("operator");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATOR");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
					out.print(" ");
				}
				printCountingMap.put("operator", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_AtomicNode_0_7(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("requirementRef");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__REQUIREMENT_REF));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__REQUIREMENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("requirementRef", 0);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_AtomicNode_0_8(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("traceabilityStatus");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__TRACEABILITY_STATUS));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__TRACEABILITY_STATUS), element));
						out.print(" ");
					}
					printCountingMap.put("traceabilityStatus", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("traceabilityStatus");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__TRACEABILITY_STATUS));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("VALIDITY");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__TRACEABILITY_STATUS), element));
					out.print(" ");
				}
				printCountingMap.put("traceabilityStatus", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_AtomicNode_0_9(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_bt_textbt_AtomicNode_0_9_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_AtomicNode_0_9_0(org.be.textbe.bt.textbt.AtomicNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATORWITHLABEL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("PERCENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQUALS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("operator");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATOR");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ATOMIC_NODE__OPERATOR), element));
					out.print(" ");
				}
				printCountingMap.put("operator", count - 1);
			}
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_SequentialNode(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__COMPONENT_REF));
		printCountingMap.put("componentRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__BEHAVIOR_REF));
		printCountingMap.put("behaviorRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__REQUIREMENT_REF));
		printCountingMap.put("requirementRef", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__TRACEABILITY_STATUS));
		printCountingMap.put("traceabilityStatus", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__COMPONENT_SET));
		printCountingMap.put("componentSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__MCI));
		printCountingMap.put("mci", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_SequentialNode_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_be_textbe_bt_textbt_SequentialNode_0(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mci"		,
		"componentRef"		,
		"componentSet"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"componentRef"		,
		"behaviorRef"		));
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
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (CompoundDefinition)
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
				print_org_be_textbe_bt_textbt_SequentialNode_0_4(element, localtab, out1, printCountingMap1);
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
				print_org_be_textbe_bt_textbt_SequentialNode_0_5(element, localtab, out1, printCountingMap1);
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__COMPONENT_REF));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__COMPONENT_REF), element));
						out.print(" ");
					}
					printCountingMap.put("componentRef", count - 1);
				}
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("label");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__LABEL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__LABEL), element));
						out.print(" ");
					}
					printCountingMap.put("label", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_SequentialNode_0_6(element, localtab, out, printCountingMap);
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("childNode");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__CHILD_NODE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("childNode", count - 1);
				}
			}
			break;
			case 2:			{
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (CompoundDefinition)
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
				print_org_be_textbe_bt_textbt_SequentialNode_0_7(element, localtab, out1, printCountingMap1);
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
				print_org_be_textbe_bt_textbt_SequentialNode_0_8(element, localtab, out1, printCountingMap1);
				if (printCountingMap.equals(printCountingMap1)) {
					out1.close();
				} else {
					out1.flush();
					out1.close();
					out.print(sWriter.toString());
					printCountingMap.putAll(printCountingMap1);
				}
				// DEFINITION PART BEGINS (CsString)
				out.print("_");
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("label");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__LABEL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__LABEL), element));
						out.print(" ");
					}
					printCountingMap.put("label", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_SequentialNode_0_9(element, localtab, out, printCountingMap);
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("childNode");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__CHILD_NODE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("childNode", count - 1);
				}
			}
			break;
			default:			java.io.StringWriter sWriter = null;
			java.io.PrintWriter out1 = null;
			java.util.Map<String, Integer> printCountingMap1 = null;
			// DEFINITION PART BEGINS (CompoundDefinition)
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_textbt_SequentialNode_0_0(element, localtab, out1, printCountingMap1);
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
			print_org_be_textbe_bt_textbt_SequentialNode_0_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_be_textbe_bt_textbt_SequentialNode_0_2(element, localtab, out, printCountingMap);
			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("componentRef");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__COMPONENT_REF));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__COMPONENT_REF), element));
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
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__COMPONENT_SET));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__COMPONENT_SET), element));
					out.print(" ");
				}
				printCountingMap.put("componentSet", count - 1);
			}
			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("behaviorRef");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__BEHAVIOR_REF));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__BEHAVIOR_REF), element));
					out.print(" ");
				}
				printCountingMap.put("behaviorRef", count - 1);
			}
			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("label");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__LABEL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__LABEL), element));
					out.print(" ");
				}
				printCountingMap.put("label", count - 1);
			}
			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_be_textbe_bt_textbt_SequentialNode_0_3(element, localtab, out, printCountingMap);
			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("childNode");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__CHILD_NODE));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("childNode", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SequentialNode_0_0(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("requirementRef");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__REQUIREMENT_REF));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__REQUIREMENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("requirementRef", 0);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SequentialNode_0_1(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("traceabilityStatus");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__TRACEABILITY_STATUS));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__TRACEABILITY_STATUS), element));
						out.print(" ");
					}
					printCountingMap.put("traceabilityStatus", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("traceabilityStatus");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__TRACEABILITY_STATUS));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("VALIDITY");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__TRACEABILITY_STATUS), element));
					out.print(" ");
				}
				printCountingMap.put("traceabilityStatus", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SequentialNode_0_2(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mci"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mci"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("mci");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__MCI));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("PERCENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__MCI), element));
						out.print(" ");
					}
					printCountingMap.put("mci", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("mci");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__MCI));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("MCI");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__MCI), element));
					out.print(" ");
				}
				printCountingMap.put("mci", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SequentialNode_0_3(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_bt_textbt_SequentialNode_0_3_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SequentialNode_0_3_0(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATORWITHLABEL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("PERCENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQUALS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("operator");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATOR");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
					out.print(" ");
				}
				printCountingMap.put("operator", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SequentialNode_0_4(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("requirementRef");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__REQUIREMENT_REF));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__REQUIREMENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("requirementRef", 0);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SequentialNode_0_5(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("traceabilityStatus");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__TRACEABILITY_STATUS));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__TRACEABILITY_STATUS), element));
						out.print(" ");
					}
					printCountingMap.put("traceabilityStatus", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("traceabilityStatus");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__TRACEABILITY_STATUS));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("VALIDITY");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__TRACEABILITY_STATUS), element));
					out.print(" ");
				}
				printCountingMap.put("traceabilityStatus", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SequentialNode_0_6(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_bt_textbt_SequentialNode_0_6_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SequentialNode_0_6_0(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATORWITHLABEL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("PERCENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQUALS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("operator");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATOR");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
					out.print(" ");
				}
				printCountingMap.put("operator", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SequentialNode_0_7(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("requirementRef");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__REQUIREMENT_REF));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__REQUIREMENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("requirementRef", 0);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SequentialNode_0_8(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("traceabilityStatus");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__TRACEABILITY_STATUS));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__TRACEABILITY_STATUS), element));
						out.print(" ");
					}
					printCountingMap.put("traceabilityStatus", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("traceabilityStatus");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__TRACEABILITY_STATUS));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("VALIDITY");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__TRACEABILITY_STATUS), element));
					out.print(" ");
				}
				printCountingMap.put("traceabilityStatus", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SequentialNode_0_9(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_bt_textbt_SequentialNode_0_9_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SequentialNode_0_9_0(org.be.textbe.bt.textbt.SequentialNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATORWITHLABEL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("PERCENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQUALS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("operator");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATOR");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SEQUENTIAL_NODE__OPERATOR), element));
					out.print(" ");
				}
				printCountingMap.put("operator", count - 1);
			}
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_ParallelBlock(org.be.textbe.bt.textbt.ParallelBlock element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.PARALLEL_BLOCK__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#P");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("childNode");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.PARALLEL_BLOCK__CHILD_NODE));
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
	
	
	public void print_org_be_textbe_bt_textbt_AlternativeBlock(org.be.textbe.bt.textbt.AlternativeBlock element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ALTERNATIVE_BLOCK__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#N");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("childNode");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ALTERNATIVE_BLOCK__CHILD_NODE));
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
	
	
	public void print_org_be_textbe_bt_textbt_Node(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__COMPONENT_REF));
		printCountingMap.put("componentRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__BEHAVIOR_REF));
		printCountingMap.put("behaviorRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__REQUIREMENT_REF));
		printCountingMap.put("requirementRef", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__TRACEABILITY_STATUS));
		printCountingMap.put("traceabilityStatus", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__COMPONENT_SET));
		printCountingMap.put("componentSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__MCI));
		printCountingMap.put("mci", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__CHILD_NODE));
		printCountingMap.put("childNode", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_Node_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_be_textbe_bt_textbt_Node_0(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mci"		,
		"componentRef"		,
		"componentSet"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"componentRef"		,
		"behaviorRef"		));
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
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (CompoundDefinition)
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
				print_org_be_textbe_bt_textbt_Node_0_4(element, localtab, out1, printCountingMap1);
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
				print_org_be_textbe_bt_textbt_Node_0_5(element, localtab, out1, printCountingMap1);
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__COMPONENT_REF));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__COMPONENT_REF), element));
						out.print(" ");
					}
					printCountingMap.put("componentRef", count - 1);
				}
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("behaviorRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__BEHAVIOR_REF));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__BEHAVIOR_REF), element));
						out.print(" ");
					}
					printCountingMap.put("behaviorRef", count - 1);
				}
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("label");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__LABEL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__LABEL), element));
						out.print(" ");
					}
					printCountingMap.put("label", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_Node_0_6(element, localtab, out, printCountingMap);
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("childNode");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__CHILD_NODE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("childNode", count - 1);
				}
			}
			break;
			case 2:			{
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (CompoundDefinition)
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
				print_org_be_textbe_bt_textbt_Node_0_7(element, localtab, out1, printCountingMap1);
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
				print_org_be_textbe_bt_textbt_Node_0_8(element, localtab, out1, printCountingMap1);
				if (printCountingMap.equals(printCountingMap1)) {
					out1.close();
				} else {
					out1.flush();
					out1.close();
					out.print(sWriter.toString());
					printCountingMap.putAll(printCountingMap1);
				}
				// DEFINITION PART BEGINS (CsString)
				out.print("_");
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("label");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__LABEL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__LABEL), element));
						out.print(" ");
					}
					printCountingMap.put("label", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_Node_0_9(element, localtab, out, printCountingMap);
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("childNode");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__CHILD_NODE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("childNode", count - 1);
				}
			}
			break;
			default:			java.io.StringWriter sWriter = null;
			java.io.PrintWriter out1 = null;
			java.util.Map<String, Integer> printCountingMap1 = null;
			// DEFINITION PART BEGINS (CompoundDefinition)
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_textbt_Node_0_0(element, localtab, out1, printCountingMap1);
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
			print_org_be_textbe_bt_textbt_Node_0_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_be_textbe_bt_textbt_Node_0_2(element, localtab, out, printCountingMap);
			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("componentRef");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__COMPONENT_REF));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__COMPONENT_REF), element));
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
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__COMPONENT_SET));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__COMPONENT_SET), element));
					out.print(" ");
				}
				printCountingMap.put("componentSet", count - 1);
			}
			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("behaviorRef");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__BEHAVIOR_REF));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__BEHAVIOR_REF), element));
					out.print(" ");
				}
				printCountingMap.put("behaviorRef", count - 1);
			}
			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("label");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__LABEL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__LABEL), element));
					out.print(" ");
				}
				printCountingMap.put("label", count - 1);
			}
			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_be_textbe_bt_textbt_Node_0_3(element, localtab, out, printCountingMap);
			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("childNode");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__CHILD_NODE));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("childNode", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Node_0_0(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("requirementRef");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__REQUIREMENT_REF));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__REQUIREMENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("requirementRef", 0);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Node_0_1(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("traceabilityStatus");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__TRACEABILITY_STATUS));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__TRACEABILITY_STATUS), element));
						out.print(" ");
					}
					printCountingMap.put("traceabilityStatus", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("traceabilityStatus");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__TRACEABILITY_STATUS));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("VALIDITY");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__TRACEABILITY_STATUS), element));
					out.print(" ");
				}
				printCountingMap.put("traceabilityStatus", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Node_0_2(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mci"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mci"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("mci");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__MCI));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("PERCENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__MCI), element));
						out.print(" ");
					}
					printCountingMap.put("mci", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("mci");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__MCI));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("MCI");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__MCI), element));
					out.print(" ");
				}
				printCountingMap.put("mci", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Node_0_3(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_bt_textbt_Node_0_3_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Node_0_3_0(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATORWITHLABEL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("PERCENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQUALS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("operator");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATOR");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
					out.print(" ");
				}
				printCountingMap.put("operator", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Node_0_4(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("requirementRef");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__REQUIREMENT_REF));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__REQUIREMENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("requirementRef", 0);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Node_0_5(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("traceabilityStatus");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__TRACEABILITY_STATUS));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__TRACEABILITY_STATUS), element));
						out.print(" ");
					}
					printCountingMap.put("traceabilityStatus", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("traceabilityStatus");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__TRACEABILITY_STATUS));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("VALIDITY");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__TRACEABILITY_STATUS), element));
					out.print(" ");
				}
				printCountingMap.put("traceabilityStatus", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Node_0_6(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_bt_textbt_Node_0_6_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Node_0_6_0(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATORWITHLABEL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("PERCENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQUALS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("operator");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATOR");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
					out.print(" ");
				}
				printCountingMap.put("operator", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Node_0_7(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("requirementRef");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__REQUIREMENT_REF));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__REQUIREMENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("requirementRef", 0);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Node_0_8(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceabilityStatus"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("traceabilityStatus");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__TRACEABILITY_STATUS));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__TRACEABILITY_STATUS), element));
						out.print(" ");
					}
					printCountingMap.put("traceabilityStatus", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("traceabilityStatus");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__TRACEABILITY_STATUS));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("VALIDITY");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__TRACEABILITY_STATUS), element));
					out.print(" ");
				}
				printCountingMap.put("traceabilityStatus", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Node_0_9(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_bt_textbt_Node_0_9_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Node_0_9_0(org.be.textbe.bt.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operator"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATORWITHLABEL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("PERCENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLEMINUS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQUALS");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
						out.print(" ");
					}
					printCountingMap.put("operator", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("operator");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATOR");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.NODE__OPERATOR), element));
					out.print(" ");
				}
				printCountingMap.put("operator", count - 1);
			}
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_OptionList(org.be.textbe.bt.textbt.OptionList element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.OPTION_LIST__OPTIONS));
		printCountingMap.put("options", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#OPTIONS");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("options");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.OPTION_LIST__OPTIONS));
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
	
	
	public void print_org_be_textbe_bt_textbt_Option(org.be.textbe.bt.textbt.Option element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.OPTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.OPTION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.OPTION__NAME));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.OPTION__NAME), element));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.OPTION__VALUE));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.OPTION__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_RequirementList(org.be.textbe.bt.textbt.RequirementList element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.REQUIREMENT_LIST__REQUIREMENTS));
		printCountingMap.put("requirements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#RT");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("requirements");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.REQUIREMENT_LIST__REQUIREMENTS));
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
	
	
	public void print_org_be_textbe_bt_textbt_Requirement(org.be.textbe.bt.textbt.Requirement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.REQUIREMENT__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.REQUIREMENT__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.REQUIREMENT__REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.REQUIREMENT__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_Requirement_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_be_textbe_bt_textbt_Requirement_0(org.be.textbe.bt.textbt.Requirement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.REQUIREMENT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.REQUIREMENT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.REQUIREMENT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.REQUIREMENT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.REQUIREMENT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.REQUIREMENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.REQUIREMENT__VAL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.REQUIREMENT__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_ComponentList(org.be.textbe.bt.textbt.ComponentList element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT_LIST__COMPONENTS));
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
			print_org_be_textbe_bt_textbt_ComponentList_0(element, localtab, out1, printCountingMap1);
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
		print_org_be_textbe_bt_textbt_ComponentList_1(element, localtab, out1, printCountingMap1);
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
			print_org_be_textbe_bt_textbt_ComponentList_2(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_textbt_ComponentList_0(org.be.textbe.bt.textbt.ComponentList element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#C");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("components");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT_LIST__COMPONENTS));
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
	
	public void print_org_be_textbe_bt_textbt_ComponentList_1(org.be.textbe.bt.textbt.ComponentList element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#SC");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("components");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT_LIST__COMPONENTS));
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
	
	public void print_org_be_textbe_bt_textbt_ComponentList_2(org.be.textbe.bt.textbt.ComponentList element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#C");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("components");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT_LIST__COMPONENTS));
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
	
	
	public void print_org_be_textbe_bt_textbt_Component(org.be.textbe.bt.textbt.Component element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__BEHAVIORS));
		printCountingMap.put("behaviors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__QUANTIFIER));
		printCountingMap.put("quantifier", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_Component_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_textbt_Component_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_textbt_Component_0(org.be.textbe.bt.textbt.Component element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENTNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__VAL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Component_1(org.be.textbe.bt.textbt.Component element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 7;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 8;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_Component_1_1(element, localtab, out, printCountingMap);
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_Component_1_2(element, localtab, out, printCountingMap);
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_Component_1_3(element, localtab, out, printCountingMap);
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_Component_1_4(element, localtab, out, printCountingMap);
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_Component_1_5(element, localtab, out, printCountingMap);
			}
			break;
			case 6:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_Component_1_6(element, localtab, out, printCountingMap);
			}
			break;
			case 7:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_Component_1_7(element, localtab, out, printCountingMap);
			}
			break;
			case 8:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_Component_1_8(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_be_textbe_bt_textbt_Component_1_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Component_1_0(org.be.textbe.bt.textbt.Component element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#S");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_Component_1_1(org.be.textbe.bt.textbt.Component element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#L");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_Component_1_2(org.be.textbe.bt.textbt.Component element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#E");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_Component_1_3(org.be.textbe.bt.textbt.Component element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#G");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_Component_1_4(org.be.textbe.bt.textbt.Component element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#II");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_Component_1_5(org.be.textbe.bt.textbt.Component element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#IO");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_Component_1_6(org.be.textbe.bt.textbt.Component element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#EI");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_Component_1_7(org.be.textbe.bt.textbt.Component element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#EO");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_Component_1_8(org.be.textbe.bt.textbt.Component element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#A");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.COMPONENT__BEHAVIORS));
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
	
	
	public void print_org_be_textbe_bt_textbt_SystemComponent(org.be.textbe.bt.textbt.SystemComponent element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__BEHAVIORS));
		printCountingMap.put("behaviors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__QUANTIFIER));
		printCountingMap.put("quantifier", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_SystemComponent_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_textbt_SystemComponent_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_textbt_SystemComponent_0(org.be.textbe.bt.textbt.SystemComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENTNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__VAL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SystemComponent_1(org.be.textbe.bt.textbt.SystemComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 7;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behaviors"		));
		if (tempMatchCount > matches) {
			alt = 8;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_SystemComponent_1_1(element, localtab, out, printCountingMap);
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_SystemComponent_1_2(element, localtab, out, printCountingMap);
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_SystemComponent_1_3(element, localtab, out, printCountingMap);
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_SystemComponent_1_4(element, localtab, out, printCountingMap);
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_SystemComponent_1_5(element, localtab, out, printCountingMap);
			}
			break;
			case 6:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_SystemComponent_1_6(element, localtab, out, printCountingMap);
			}
			break;
			case 7:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_SystemComponent_1_7(element, localtab, out, printCountingMap);
			}
			break;
			case 8:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_SystemComponent_1_8(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_be_textbe_bt_textbt_SystemComponent_1_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_SystemComponent_1_0(org.be.textbe.bt.textbt.SystemComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#S");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_SystemComponent_1_1(org.be.textbe.bt.textbt.SystemComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#L");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_SystemComponent_1_2(org.be.textbe.bt.textbt.SystemComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#E");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_SystemComponent_1_3(org.be.textbe.bt.textbt.SystemComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#G");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_SystemComponent_1_4(org.be.textbe.bt.textbt.SystemComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#II");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_SystemComponent_1_5(org.be.textbe.bt.textbt.SystemComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#IO");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_SystemComponent_1_6(org.be.textbe.bt.textbt.SystemComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#EI");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_SystemComponent_1_7(org.be.textbe.bt.textbt.SystemComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#EO");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__BEHAVIORS));
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
	
	public void print_org_be_textbe_bt_textbt_SystemComponent_1_8(org.be.textbe.bt.textbt.SystemComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#A");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behaviors");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SYSTEM_COMPONENT__BEHAVIORS));
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
	
	
	public void print_org_be_textbe_bt_textbt_State(org.be.textbe.bt.textbt.State element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_State_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_textbt_State_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_textbt_State_0(org.be.textbe.bt.textbt.State element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("STATE");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__VAL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_State_1(org.be.textbe.bt.textbt.State element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.STATE__RELATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("relations", 0);
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_Selection(org.be.textbe.bt.textbt.Selection element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_Selection_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_textbt_Selection_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_textbt_Selection_0(org.be.textbe.bt.textbt.Selection element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("STATE");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__VAL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Selection_1(org.be.textbe.bt.textbt.Selection element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.SELECTION__RELATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("relations", 0);
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_Event(org.be.textbe.bt.textbt.Event element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_Event_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_textbt_Event_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_textbt_Event_0(org.be.textbe.bt.textbt.Event element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("STATE");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__VAL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Event_1(org.be.textbe.bt.textbt.Event element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EVENT__RELATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("relations", 0);
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_Guard(org.be.textbe.bt.textbt.Guard element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_Guard_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_textbt_Guard_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_textbt_Guard_0(org.be.textbe.bt.textbt.Guard element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("STATE");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__VAL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Guard_1(org.be.textbe.bt.textbt.Guard element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.GUARD__RELATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("relations", 0);
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_InternalInput(org.be.textbe.bt.textbt.InternalInput element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_InternalInput_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_textbt_InternalInput_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_textbt_InternalInput_0(org.be.textbe.bt.textbt.InternalInput element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("STATE");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__VAL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_InternalInput_1(org.be.textbe.bt.textbt.InternalInput element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_INPUT__RELATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("relations", 0);
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_InternalOutput(org.be.textbe.bt.textbt.InternalOutput element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_InternalOutput_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_textbt_InternalOutput_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_textbt_InternalOutput_0(org.be.textbe.bt.textbt.InternalOutput element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("STATE");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__VAL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_InternalOutput_1(org.be.textbe.bt.textbt.InternalOutput element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.INTERNAL_OUTPUT__RELATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("relations", 0);
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_ExternalInput(org.be.textbe.bt.textbt.ExternalInput element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_ExternalInput_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_textbt_ExternalInput_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_textbt_ExternalInput_0(org.be.textbe.bt.textbt.ExternalInput element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("STATE");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__VAL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_ExternalInput_1(org.be.textbe.bt.textbt.ExternalInput element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_INPUT__RELATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("relations", 0);
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_ExternalOutput(org.be.textbe.bt.textbt.ExternalOutput element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_ExternalOutput_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_textbt_ExternalOutput_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_textbt_ExternalOutput_0(org.be.textbe.bt.textbt.ExternalOutput element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("STATE");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__VAL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_ExternalOutput_1(org.be.textbe.bt.textbt.ExternalOutput element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.EXTERNAL_OUTPUT__RELATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("relations", 0);
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_Assertion(org.be.textbe.bt.textbt.Assertion element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__REF), element));
				out.print(" ");
			}
			printCountingMap.put("ref", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_Assertion_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_textbt_Assertion_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_textbt_Assertion_0(org.be.textbe.bt.textbt.Assertion element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"val"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__VAL), element));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("STATE");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("val");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__VAL));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__VAL), element));
						out.print(" ");
					}
					printCountingMap.put("val", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("val");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__VAL));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__VAL), element));
					out.print(" ");
				}
				printCountingMap.put("val", count - 1);
			}
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Assertion_1(org.be.textbe.bt.textbt.Assertion element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.ASSERTION__RELATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("relations", 0);
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_Relation(org.be.textbe.bt.textbt.Relation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__QUESTION));
		printCountingMap.put("question", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__PREPOSITION));
		printCountingMap.put("preposition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__COMPONENT_REF));
		printCountingMap.put("componentRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__BEHAVIOR_REF));
		printCountingMap.put("behaviorRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__LEVEL));
		printCountingMap.put("level", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__COMPONENT_LEVEL));
		printCountingMap.put("componentLevel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__COMPONENT_SET));
		printCountingMap.put("componentSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__MCI));
		printCountingMap.put("mci", temp == null ? 0 : 1);
		// print collected hidden tokens
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"question"		,
		"componentRef"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"question"		,
		"mci"		,
		"componentRef"		,
		"componentSet"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_Relation_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_be_textbe_bt_textbt_Relation_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Relation_0(org.be.textbe.bt.textbt.Relation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("level");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__LEVEL));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("LEVEL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__LEVEL), element));
				out.print(" ");
			}
			printCountingMap.put("level", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("question");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__QUESTION));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__QUESTION), element));
				out.print(" ");
			}
			printCountingMap.put("question", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("preposition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__PREPOSITION));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__PREPOSITION), element));
				out.print(" ");
			}
			printCountingMap.put("preposition", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__COMPONENT_REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__COMPONENT_REF), element));
				out.print(" ");
			}
			printCountingMap.put("componentRef", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentLevel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__COMPONENT_LEVEL));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("LEVEL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__COMPONENT_LEVEL), element));
				out.print(" ");
			}
			printCountingMap.put("componentLevel", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("behaviorRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__BEHAVIOR_REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__BEHAVIOR_REF), element));
				out.print(" ");
			}
			printCountingMap.put("behaviorRef", count - 1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Relation_1(org.be.textbe.bt.textbt.Relation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("level");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__LEVEL));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("LEVEL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__LEVEL), element));
				out.print(" ");
			}
			printCountingMap.put("level", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("question");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__QUESTION));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__QUESTION), element));
				out.print(" ");
			}
			printCountingMap.put("question", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("preposition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__PREPOSITION));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__PREPOSITION), element));
				out.print(" ");
			}
			printCountingMap.put("preposition", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_Relation_1_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__COMPONENT_REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__COMPONENT_REF), element));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__COMPONENT_SET));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMPONENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__COMPONENT_SET), element));
				out.print(" ");
			}
			printCountingMap.put("componentSet", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("componentLevel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__COMPONENT_LEVEL));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("LEVEL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__COMPONENT_LEVEL), element));
				out.print(" ");
			}
			printCountingMap.put("componentLevel", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("behaviorRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__BEHAVIOR_REF));
			if (o != null) {
				org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__BEHAVIOR_REF), element));
				out.print(" ");
			}
			printCountingMap.put("behaviorRef", count - 1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_Relation_1_0(org.be.textbe.bt.textbt.Relation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mci"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mci"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("mci");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__MCI));
					if (o != null) {
						org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("PERCENT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__MCI), element));
						out.print(" ");
					}
					printCountingMap.put("mci", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("mci");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__MCI));
				if (o != null) {
					org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("MCI");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATION__MCI), element));
					out.print(" ");
				}
				printCountingMap.put("mci", count - 1);
			}
		}
	}
	
	
	public void print_org_be_textbe_bt_textbt_RelationalBehavior(org.be.textbe.bt.textbt.RelationalBehavior element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATIONAL_BEHAVIOR__BEHAVIOR));
		printCountingMap.put("behavior", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATIONAL_BEHAVIOR__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_be_textbe_bt_textbt_RelationalBehavior_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATIONAL_BEHAVIOR__RELATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("relations", 0);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_RelationalBehavior_0(org.be.textbe.bt.textbt.RelationalBehavior element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behavior"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behavior"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behavior"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behavior"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behavior"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behavior"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behavior"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behavior"		));
		if (tempMatchCount > matches) {
			alt = 7;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"behavior"		));
		if (tempMatchCount > matches) {
			alt = 8;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_RelationalBehavior_0_1(element, localtab, out, printCountingMap);
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_RelationalBehavior_0_2(element, localtab, out, printCountingMap);
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_RelationalBehavior_0_3(element, localtab, out, printCountingMap);
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_RelationalBehavior_0_4(element, localtab, out, printCountingMap);
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_RelationalBehavior_0_5(element, localtab, out, printCountingMap);
			}
			break;
			case 6:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_RelationalBehavior_0_6(element, localtab, out, printCountingMap);
			}
			break;
			case 7:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_RelationalBehavior_0_7(element, localtab, out, printCountingMap);
			}
			break;
			case 8:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_be_textbe_bt_textbt_RelationalBehavior_0_8(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_be_textbe_bt_textbt_RelationalBehavior_0_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_RelationalBehavior_0_0(org.be.textbe.bt.textbt.RelationalBehavior element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#S");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behavior");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATIONAL_BEHAVIOR__BEHAVIOR));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("behavior", count - 1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_RelationalBehavior_0_1(org.be.textbe.bt.textbt.RelationalBehavior element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#L");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behavior");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATIONAL_BEHAVIOR__BEHAVIOR));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("behavior", count - 1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_RelationalBehavior_0_2(org.be.textbe.bt.textbt.RelationalBehavior element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#E");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behavior");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATIONAL_BEHAVIOR__BEHAVIOR));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("behavior", count - 1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_RelationalBehavior_0_3(org.be.textbe.bt.textbt.RelationalBehavior element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#G");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behavior");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATIONAL_BEHAVIOR__BEHAVIOR));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("behavior", count - 1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_RelationalBehavior_0_4(org.be.textbe.bt.textbt.RelationalBehavior element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#II");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behavior");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATIONAL_BEHAVIOR__BEHAVIOR));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("behavior", count - 1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_RelationalBehavior_0_5(org.be.textbe.bt.textbt.RelationalBehavior element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#IO");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behavior");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATIONAL_BEHAVIOR__BEHAVIOR));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("behavior", count - 1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_RelationalBehavior_0_6(org.be.textbe.bt.textbt.RelationalBehavior element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#EI");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behavior");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATIONAL_BEHAVIOR__BEHAVIOR));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("behavior", count - 1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_RelationalBehavior_0_7(org.be.textbe.bt.textbt.RelationalBehavior element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#EO");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behavior");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATIONAL_BEHAVIOR__BEHAVIOR));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("behavior", count - 1);
		}
	}
	
	public void print_org_be_textbe_bt_textbt_RelationalBehavior_0_8(org.be.textbe.bt.textbt.RelationalBehavior element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#A");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behavior");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.textbt.TextbtPackage.RELATIONAL_BEHAVIOR__BEHAVIOR));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("behavior", count - 1);
		}
	}
	
	
}
