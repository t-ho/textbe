/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.mopp;

public class BtPrinter implements org.be.textbe.bt.v1.textbt.resource.bt.IBtTextPrinter {
	
	protected org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolverFactory tokenResolverFactory = new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource resource;
	
	private java.util.Map<?, ?> options;
	
	public BtPrinter(java.io.OutputStream outputStream, org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource resource) {
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
		
		if (element instanceof org.be.textbe.bt.v1.textbt.Specification) {
			print_org_be_textbe_bt_v1_textbt_Specification((org.be.textbe.bt.v1.textbt.Specification) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.Requirement) {
			print_org_be_textbe_bt_v1_textbt_Requirement((org.be.textbe.bt.v1.textbt.Requirement) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.SystemComponent) {
			print_org_be_textbe_bt_v1_textbt_SystemComponent((org.be.textbe.bt.v1.textbt.SystemComponent) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.InternalInput) {
			print_org_be_textbe_bt_v1_textbt_InternalInput((org.be.textbe.bt.v1.textbt.InternalInput) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.ExternalInput) {
			print_org_be_textbe_bt_v1_textbt_ExternalInput((org.be.textbe.bt.v1.textbt.ExternalInput) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.InternalOutput) {
			print_org_be_textbe_bt_v1_textbt_InternalOutput((org.be.textbe.bt.v1.textbt.InternalOutput) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.ExternalOutput) {
			print_org_be_textbe_bt_v1_textbt_ExternalOutput((org.be.textbe.bt.v1.textbt.ExternalOutput) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.StateRealization) {
			print_org_be_textbe_bt_v1_textbt_StateRealization((org.be.textbe.bt.v1.textbt.StateRealization) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.AttributeRealization) {
			print_org_be_textbe_bt_v1_textbt_AttributeRealization((org.be.textbe.bt.v1.textbt.AttributeRealization) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.Selection) {
			print_org_be_textbe_bt_v1_textbt_Selection((org.be.textbe.bt.v1.textbt.Selection) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.Guard) {
			print_org_be_textbe_bt_v1_textbt_Guard((org.be.textbe.bt.v1.textbt.Guard) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.Assertion) {
			print_org_be_textbe_bt_v1_textbt_Assertion((org.be.textbe.bt.v1.textbt.Assertion) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.What) {
			print_org_be_textbe_bt_v1_textbt_What((org.be.textbe.bt.v1.textbt.What) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.Who) {
			print_org_be_textbe_bt_v1_textbt_Who((org.be.textbe.bt.v1.textbt.Who) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.Why) {
			print_org_be_textbe_bt_v1_textbt_Why((org.be.textbe.bt.v1.textbt.Why) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.How) {
			print_org_be_textbe_bt_v1_textbt_How((org.be.textbe.bt.v1.textbt.How) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.Where) {
			print_org_be_textbe_bt_v1_textbt_Where((org.be.textbe.bt.v1.textbt.Where) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.When) {
			print_org_be_textbe_bt_v1_textbt_When((org.be.textbe.bt.v1.textbt.When) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.Atomic) {
			print_org_be_textbe_bt_v1_textbt_Atomic((org.be.textbe.bt.v1.textbt.Atomic) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.Interleaving) {
			print_org_be_textbe_bt_v1_textbt_Interleaving((org.be.textbe.bt.v1.textbt.Interleaving) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.Alternative) {
			print_org_be_textbe_bt_v1_textbt_Alternative((org.be.textbe.bt.v1.textbt.Alternative) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.Parallel) {
			print_org_be_textbe_bt_v1_textbt_Parallel((org.be.textbe.bt.v1.textbt.Parallel) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.Node) {
			print_org_be_textbe_bt_v1_textbt_Node((org.be.textbe.bt.v1.textbt.Node) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.TraceabilityLink) {
			print_org_be_textbe_bt_v1_textbt_TraceabilityLink((org.be.textbe.bt.v1.textbt.TraceabilityLink) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.Component) {
			print_org_be_textbe_bt_v1_textbt_Component((org.be.textbe.bt.v1.textbt.Component) element, globaltab, out);
			return;
		}
		if (element instanceof org.be.textbe.bt.v1.textbt.Event) {
			print_org_be_textbe_bt_v1_textbt_Event((org.be.textbe.bt.v1.textbt.Event) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtReferenceResolverSwitch) new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtProblem(errorMessage, org.be.textbe.bt.v1.textbt.resource.bt.BtEProblemType.PRINT_PROBLEM, org.be.textbe.bt.v1.textbt.resource.bt.BtEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource getResource() {
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
	
	public void print_org_be_textbe_bt_v1_textbt_Specification(org.be.textbe.bt.v1.textbt.Specification element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SPECIFICATION__COMPONENTS));
		printCountingMap.put("components", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SPECIFICATION__REQUIREMENTS));
		printCountingMap.put("requirements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SPECIFICATION__ROOT));
		printCountingMap.put("root", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("#RT");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("requirements");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SPECIFICATION__REQUIREMENTS));
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
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("components");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SPECIFICATION__COMPONENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("components", 0);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_bt_v1_textbt_Specification_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_be_textbe_bt_v1_textbt_Specification_0(org.be.textbe.bt.v1.textbt.Specification element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#T");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("root");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SPECIFICATION__ROOT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("root", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_Requirement(org.be.textbe.bt.v1.textbt.Requirement element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.REQUIREMENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.REQUIREMENT__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.REQUIREMENT__ID));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.REQUIREMENT__ID), element));
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.REQUIREMENT__NAME));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.REQUIREMENT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_Component(org.be.textbe.bt.v1.textbt.Component element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.COMPONENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.COMPONENT__BEHAVIOR));
		printCountingMap.put("behavior", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.COMPONENT__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#C");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.COMPONENT__ID));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.COMPONENT__ID), element));
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.COMPONENT__NAME));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.COMPONENT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behavior");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.COMPONENT__BEHAVIOR));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("behavior", 0);
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_SystemComponent(org.be.textbe.bt.v1.textbt.SystemComponent element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SYSTEM_COMPONENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SYSTEM_COMPONENT__BEHAVIOR));
		printCountingMap.put("behavior", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SYSTEM_COMPONENT__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#SC");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SYSTEM_COMPONENT__ID));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SYSTEM_COMPONENT__ID), element));
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SYSTEM_COMPONENT__NAME));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SYSTEM_COMPONENT__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("behavior");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SYSTEM_COMPONENT__BEHAVIOR));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("behavior", 0);
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_Event(org.be.textbe.bt.v1.textbt.Event element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EVENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EVENT__NUMBER));
		printCountingMap.put("number", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EVENT__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EVENT__COMPONENT));
		printCountingMap.put("component", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#E");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("number");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EVENT__NUMBER));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EVENT__NUMBER), element));
			}
			printCountingMap.put("number", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EVENT__NAME));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EVENT__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EVENT__RELATIONS));
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
	
	
	public void print_org_be_textbe_bt_v1_textbt_InternalInput(org.be.textbe.bt.v1.textbt.InternalInput element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_INPUT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_INPUT__NUMBER));
		printCountingMap.put("number", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_INPUT__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_INPUT__COMPONENT));
		printCountingMap.put("component", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#II");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("number");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_INPUT__NUMBER));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_INPUT__NUMBER), element));
			}
			printCountingMap.put("number", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_INPUT__NAME));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_INPUT__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_INPUT__RELATIONS));
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
	
	
	public void print_org_be_textbe_bt_v1_textbt_ExternalInput(org.be.textbe.bt.v1.textbt.ExternalInput element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_INPUT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_INPUT__NUMBER));
		printCountingMap.put("number", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_INPUT__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_INPUT__COMPONENT));
		printCountingMap.put("component", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#EI");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("number");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_INPUT__NUMBER));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_INPUT__NUMBER), element));
			}
			printCountingMap.put("number", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_INPUT__NAME));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_INPUT__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_INPUT__RELATIONS));
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
	
	
	public void print_org_be_textbe_bt_v1_textbt_InternalOutput(org.be.textbe.bt.v1.textbt.InternalOutput element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_OUTPUT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_OUTPUT__NUMBER));
		printCountingMap.put("number", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_OUTPUT__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_OUTPUT__COMPONENT));
		printCountingMap.put("component", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#IO");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("number");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_OUTPUT__NUMBER));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_OUTPUT__NUMBER), element));
			}
			printCountingMap.put("number", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_OUTPUT__NAME));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_OUTPUT__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_OUTPUT__RELATIONS));
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
	
	
	public void print_org_be_textbe_bt_v1_textbt_ExternalOutput(org.be.textbe.bt.v1.textbt.ExternalOutput element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_OUTPUT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_OUTPUT__NUMBER));
		printCountingMap.put("number", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_OUTPUT__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_OUTPUT__COMPONENT));
		printCountingMap.put("component", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#EO");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("number");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_OUTPUT__NUMBER));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_OUTPUT__NUMBER), element));
			}
			printCountingMap.put("number", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_OUTPUT__NAME));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_OUTPUT__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_OUTPUT__RELATIONS));
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
	
	
	public void print_org_be_textbe_bt_v1_textbt_StateRealization(org.be.textbe.bt.v1.textbt.StateRealization element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__NUMBER));
		printCountingMap.put("number", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__COMPONENT));
		printCountingMap.put("component", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__QUALIFIER));
		printCountingMap.put("qualifier", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("#S");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("number");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__NUMBER));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__NUMBER), element));
			}
			printCountingMap.put("number", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__NAME));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_be_textbe_bt_v1_textbt_StateRealization_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__RELATIONS));
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
	
	public void print_org_be_textbe_bt_v1_textbt_StateRealization_0(org.be.textbe.bt.v1.textbt.StateRealization element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__QUALIFIER));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("qualifier", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		out.print(" ");
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_AttributeRealization(org.be.textbe.bt.v1.textbt.AttributeRealization element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATTRIBUTE_REALIZATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATTRIBUTE_REALIZATION__NUMBER));
		printCountingMap.put("number", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATTRIBUTE_REALIZATION__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATTRIBUTE_REALIZATION__COMPONENT));
		printCountingMap.put("component", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#AR");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("number");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATTRIBUTE_REALIZATION__NUMBER));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATTRIBUTE_REALIZATION__NUMBER), element));
			}
			printCountingMap.put("number", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATTRIBUTE_REALIZATION__NAME));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATTRIBUTE_REALIZATION__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATTRIBUTE_REALIZATION__RELATIONS));
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
	
	
	public void print_org_be_textbe_bt_v1_textbt_Selection(org.be.textbe.bt.v1.textbt.Selection element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SELECTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SELECTION__NUMBER));
		printCountingMap.put("number", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SELECTION__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SELECTION__COMPONENT));
		printCountingMap.put("component", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#L");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("number");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SELECTION__NUMBER));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SELECTION__NUMBER), element));
			}
			printCountingMap.put("number", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SELECTION__NAME));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SELECTION__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SELECTION__RELATIONS));
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
	
	
	public void print_org_be_textbe_bt_v1_textbt_Guard(org.be.textbe.bt.v1.textbt.Guard element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.GUARD__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.GUARD__NUMBER));
		printCountingMap.put("number", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.GUARD__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.GUARD__COMPONENT));
		printCountingMap.put("component", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#G");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("number");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.GUARD__NUMBER));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.GUARD__NUMBER), element));
			}
			printCountingMap.put("number", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.GUARD__NAME));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.GUARD__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.GUARD__RELATIONS));
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
	
	
	public void print_org_be_textbe_bt_v1_textbt_Assertion(org.be.textbe.bt.v1.textbt.Assertion element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ASSERTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ASSERTION__NUMBER));
		printCountingMap.put("number", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ASSERTION__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ASSERTION__COMPONENT));
		printCountingMap.put("component", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("#A");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("number");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ASSERTION__NUMBER));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ASSERTION__NUMBER), element));
			}
			printCountingMap.put("number", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ASSERTION__NAME));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ASSERTION__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ASSERTION__RELATIONS));
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
	
	
	public void print_org_be_textbe_bt_v1_textbt_What(org.be.textbe.bt.v1.textbt.What element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__MULTI_LEVEL));
		printCountingMap.put("multiLevel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__OBSERVATION));
		printCountingMap.put("observation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("multiLevel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__MULTI_LEVEL));
			if (o != null) {
			}
			printCountingMap.put("multiLevel", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_What_0(element, localtab, out1, printCountingMap1);
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
		out.print("What");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("observation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__OBSERVATION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__OBSERVATION), element));
				out.print(" ");
			}
			printCountingMap.put("observation", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_What_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_v1_textbt_What_0(org.be.textbe.bt.v1.textbt.What element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
	}
	
	public void print_org_be_textbe_bt_v1_textbt_What_1(org.be.textbe.bt.v1.textbt.What element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"observation"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("/");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("observation");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__OBSERVATION));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__OBSERVATION), element));
					out.print(" ");
				}
				printCountingMap.put("observation", count - 1);
			}
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_Who(org.be.textbe.bt.v1.textbt.Who element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__MULTI_LEVEL));
		printCountingMap.put("multiLevel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__PERSON));
		printCountingMap.put("person", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("multiLevel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__MULTI_LEVEL));
			if (o != null) {
			}
			printCountingMap.put("multiLevel", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_Who_0(element, localtab, out1, printCountingMap1);
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
		out.print("Who");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("person");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__PERSON));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__PERSON), element));
				out.print(" ");
			}
			printCountingMap.put("person", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_Who_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_v1_textbt_Who_0(org.be.textbe.bt.v1.textbt.Who element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
	}
	
	public void print_org_be_textbe_bt_v1_textbt_Who_1(org.be.textbe.bt.v1.textbt.Who element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"person"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("/");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("person");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__PERSON));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__PERSON), element));
					out.print(" ");
				}
				printCountingMap.put("person", count - 1);
			}
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_Why(org.be.textbe.bt.v1.textbt.Why element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__MULTI_LEVEL));
		printCountingMap.put("multiLevel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__REASON));
		printCountingMap.put("reason", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("multiLevel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__MULTI_LEVEL));
			if (o != null) {
			}
			printCountingMap.put("multiLevel", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_Why_0(element, localtab, out1, printCountingMap1);
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
		out.print("Why");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("reason");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__REASON));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__REASON), element));
				out.print(" ");
			}
			printCountingMap.put("reason", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_Why_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_v1_textbt_Why_0(org.be.textbe.bt.v1.textbt.Why element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
	}
	
	public void print_org_be_textbe_bt_v1_textbt_Why_1(org.be.textbe.bt.v1.textbt.Why element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"reason"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("/");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("reason");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__REASON));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__REASON), element));
					out.print(" ");
				}
				printCountingMap.put("reason", count - 1);
			}
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_How(org.be.textbe.bt.v1.textbt.How element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MULTI_LEVEL));
		printCountingMap.put("multiLevel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MEANS));
		printCountingMap.put("means", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("multiLevel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MULTI_LEVEL));
			if (o != null) {
			}
			printCountingMap.put("multiLevel", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_How_0(element, localtab, out1, printCountingMap1);
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
		out.print("How");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("means");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MEANS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MEANS), element));
				out.print(" ");
			}
			printCountingMap.put("means", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_How_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_v1_textbt_How_0(org.be.textbe.bt.v1.textbt.How element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
	}
	
	public void print_org_be_textbe_bt_v1_textbt_How_1(org.be.textbe.bt.v1.textbt.How element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"means"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("/");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("means");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MEANS));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MEANS), element));
					out.print(" ");
				}
				printCountingMap.put("means", count - 1);
			}
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_Where(org.be.textbe.bt.v1.textbt.Where element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__MULTI_LEVEL));
		printCountingMap.put("multiLevel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__PLACE));
		printCountingMap.put("place", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("multiLevel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__MULTI_LEVEL));
			if (o != null) {
			}
			printCountingMap.put("multiLevel", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_Where_0(element, localtab, out1, printCountingMap1);
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
		out.print("Where");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("place");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__PLACE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__PLACE), element));
				out.print(" ");
			}
			printCountingMap.put("place", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_Where_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_v1_textbt_Where_0(org.be.textbe.bt.v1.textbt.Where element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
	}
	
	public void print_org_be_textbe_bt_v1_textbt_Where_1(org.be.textbe.bt.v1.textbt.Where element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"place"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("/");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("place");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__PLACE));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__PLACE), element));
					out.print(" ");
				}
				printCountingMap.put("place", count - 1);
			}
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_When(org.be.textbe.bt.v1.textbt.When element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__MULTI_LEVEL));
		printCountingMap.put("multiLevel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__TIME));
		printCountingMap.put("time", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("#R");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("multiLevel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__MULTI_LEVEL));
			if (o != null) {
			}
			printCountingMap.put("multiLevel", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_When_0(element, localtab, out1, printCountingMap1);
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
		out.print("When");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("time");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__TIME));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__TIME), element));
				out.print(" ");
			}
			printCountingMap.put("time", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_When_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_v1_textbt_When_0(org.be.textbe.bt.v1.textbt.When element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
	}
	
	public void print_org_be_textbe_bt_v1_textbt_When_1(org.be.textbe.bt.v1.textbt.When element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"time"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("/");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("time");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__TIME));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__TIME), element));
					out.print(" ");
				}
				printCountingMap.put("time", count - 1);
			}
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_Atomic(org.be.textbe.bt.v1.textbt.Atomic element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATOMIC__STEPS));
		printCountingMap.put("steps", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATOMIC__CHILD));
		printCountingMap.put("child", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("steps");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATOMIC__STEPS));
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
			printCountingMap.put("steps", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_Atomic_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("child");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATOMIC__CHILD));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("child", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_be_textbe_bt_v1_textbt_Atomic_0(org.be.textbe.bt.v1.textbt.Atomic element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(";;");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("steps");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATOMIC__STEPS));
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
			printCountingMap.put("steps", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_Interleaving(org.be.textbe.bt.v1.textbt.Interleaving element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERLEAVING__STEPS));
		printCountingMap.put("steps", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERLEAVING__CHILD));
		printCountingMap.put("child", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("steps");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERLEAVING__STEPS));
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
			printCountingMap.put("steps", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_Interleaving_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("child");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERLEAVING__CHILD));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("child", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_be_textbe_bt_v1_textbt_Interleaving_0(org.be.textbe.bt.v1.textbt.Interleaving element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("steps");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERLEAVING__STEPS));
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
			printCountingMap.put("steps", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_Alternative(org.be.textbe.bt.v1.textbt.Alternative element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ALTERNATIVE__CHOICES));
		printCountingMap.put("choices", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("#N");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("choices");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ALTERNATIVE__CHOICES));
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
			printCountingMap.put("choices", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_Alternative_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_v1_textbt_Alternative_0(org.be.textbe.bt.v1.textbt.Alternative element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("choices");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ALTERNATIVE__CHOICES));
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
			printCountingMap.put("choices", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_Parallel(org.be.textbe.bt.v1.textbt.Parallel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.PARALLEL__PROCESSES));
		printCountingMap.put("processes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("#P");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("processes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.PARALLEL__PROCESSES));
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
			printCountingMap.put("processes", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_be_textbe_bt_v1_textbt_Parallel_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_be_textbe_bt_v1_textbt_Parallel_0(org.be.textbe.bt.v1.textbt.Parallel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("processes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.PARALLEL__PROCESSES));
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
			printCountingMap.put("processes", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_Node(org.be.textbe.bt.v1.textbt.Node element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__TRACEABILITY));
		printCountingMap.put("traceability", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__BEHAVIOR));
		printCountingMap.put("behavior", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__SHOW_TAG));
		printCountingMap.put("showTag", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"traceability"		,
		"behavior"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("_");
				out.print(" ");
				// DEFINITION PART BEGINS (EnumTerminal)
				count = printCountingMap.get("operator");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR));
					if (o != null) {
					}
					printCountingMap.put("operator", count - 1);
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
			print_org_be_textbe_bt_v1_textbt_Node_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
			// DEFINITION PART BEGINS (BooleanTerminal)
			count = printCountingMap.get("showTag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__SHOW_TAG));
				if (o != null) {
				}
				printCountingMap.put("showTag", count - 1);
			}
			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_be_textbe_bt_v1_textbt_Node_1(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_org_be_textbe_bt_v1_textbt_Node_0(org.be.textbe.bt.v1.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("'");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__LABEL));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("'");
		out.print(" ");
	}
	
	public void print_org_be_textbe_bt_v1_textbt_Node_1(org.be.textbe.bt.v1.textbt.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("traceability");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__TRACEABILITY));
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
			printCountingMap.put("traceability", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("behavior");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__BEHAVIOR));
			if (o != null) {
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getNodeBehaviorReferenceResolver().deResolve((org.be.textbe.bt.v1.textbt.Behavior) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__BEHAVIOR)), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__BEHAVIOR), element));
				out.print(" ");
			}
			printCountingMap.put("behavior", count - 1);
		}
	}
	
	
	public void print_org_be_textbe_bt_v1_textbt_TraceabilityLink(org.be.textbe.bt.v1.textbt.TraceabilityLink element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__STATUS));
		printCountingMap.put("status", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__REQUIREMENT));
		printCountingMap.put("requirement", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__NODE));
		printCountingMap.put("node", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("requirement");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__REQUIREMENT));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTraceabilityLinkRequirementReferenceResolver().deResolve((org.be.textbe.bt.v1.textbt.Requirement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__REQUIREMENT)), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__REQUIREMENT), element));
				out.print(" ");
			}
			printCountingMap.put("requirement", 0);
		}
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("status");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__STATUS));
			if (o != null) {
			}
			printCountingMap.put("status", count - 1);
		}
	}
	
	
}
