/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.grammar;

public class CtGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static CtGrammarInformationProvider INSTANCE = new CtGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_0_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getTextCT().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__OPTIONS), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.QUESTIONMARK, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_0_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getTextCT().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__REQUIREMENTS), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.QUESTIONMARK, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_0_0_0_2 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getTextCT().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__COMPONENTS), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.QUESTIONMARK, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_0_0_0_3 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getTextCT().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__COMPOSITION_TREE), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_0_0_0_0, CT_0_0_0_1, CT_0_0_0_2, CT_0_0_0_3);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_0_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getTextCT(), CT_0_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_1_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("#T", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_1_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getCompositionTree().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPOSITION_TREE__ROOT_NODE), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_1_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_1_0_0_0, CT_1_0_0_1);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_1_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_1_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getCompositionTree(), CT_1_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_2_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("<", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_2_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getAggregatedNode().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__COMPONENT_REF), "COMPONENT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_2_0_0_2_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getAggregatedNode().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__CHILD_NODE), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.PLUS, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_2_0_0_2_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_2_0_0_2_0_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_2_0_0_2_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_2_0_0_2_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtCompound CT_2_0_0_2 = new org.be.textbe.ct.textct.resource.ct.grammar.CtCompound(CT_2_0_0_2_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.QUESTIONMARK);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_2_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_2_0_0_0, CT_2_0_0_1, CT_2_0_0_2);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_2_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_2_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_2 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getAggregatedNode(), CT_2_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_3_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword(">", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_3_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getAssociatedNode().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__COMPONENT_REF), "COMPONENT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_3_0_0_2_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getAssociatedNode().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__CHILD_NODE), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.PLUS, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_3_0_0_2_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_3_0_0_2_0_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_3_0_0_2_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_3_0_0_2_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtCompound CT_3_0_0_2 = new org.be.textbe.ct.textct.resource.ct.grammar.CtCompound(CT_3_0_0_2_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.QUESTIONMARK);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_3_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_3_0_0_0, CT_3_0_0_1, CT_3_0_0_2);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_3_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_3_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_3 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getAssociatedNode(), CT_3_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_4_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("<=", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_4_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getInheritedNode().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__COMPONENT_REF), "COMPONENT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_4_0_0_2_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getInheritedNode().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__CHILD_NODE), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.PLUS, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_4_0_0_2_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_4_0_0_2_0_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_4_0_0_2_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_4_0_0_2_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtCompound CT_4_0_0_2 = new org.be.textbe.ct.textct.resource.ct.grammar.CtCompound(CT_4_0_0_2_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.QUESTIONMARK);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_4_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_4_0_0_0, CT_4_0_0_1, CT_4_0_0_2);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_4_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_4_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_4 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getInheritedNode(), CT_4_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_5_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("<", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_5_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("{", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_5_0_0_2 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getAggregatedBlock().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_BLOCK__CHILD_NODE), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.PLUS, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_5_0_0_3 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("}", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_5_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_5_0_0_0, CT_5_0_0_1, CT_5_0_0_2, CT_5_0_0_3);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_5_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_5_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_5 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getAggregatedBlock(), CT_5_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_6_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword(">", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_6_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("{", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_6_0_0_2 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getAssociatedBlock().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_BLOCK__CHILD_NODE), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.PLUS, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_6_0_0_3 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("}", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_6_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_6_0_0_0, CT_6_0_0_1, CT_6_0_0_2, CT_6_0_0_3);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_6_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_6_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_6 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getAssociatedBlock(), CT_6_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_7_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("<=", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_7_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("{", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_7_0_0_2 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getInheritedBlock().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_BLOCK__CHILD_NODE), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.PLUS, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_7_0_0_3 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("}", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_7_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_7_0_0_0, CT_7_0_0_1, CT_7_0_0_2, CT_7_0_0_3);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_7_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_7_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_7 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getInheritedBlock(), CT_7_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_8_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getNode().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__COMPONENT_REF), "COMPONENT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_8_0_0_1_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getNode().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__CHILD_NODE), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.PLUS, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_8_0_0_1_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_8_0_0_1_0_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_8_0_0_1_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_8_0_0_1_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtCompound CT_8_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtCompound(CT_8_0_0_1_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.QUESTIONMARK);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_8_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_8_0_0_0, CT_8_0_0_1);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_8_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_8_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_8 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getNode(), CT_8_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_9_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("#OPTIONS", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_9_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getOptionList().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION_LIST__OPTIONS), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.PLUS, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_9_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_9_0_0_0, CT_9_0_0_1);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_9_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_9_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_9 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getOptionList(), CT_9_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_10_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getOption().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION__NAME), "TEXT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_10_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("=", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_10_0_0_2 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getOption().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION__VALUE), "TEXT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_10_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_10_0_0_0, CT_10_0_0_1, CT_10_0_0_2);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_10_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_10_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_10 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getOption(), CT_10_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_11_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("#RT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_11_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getRequirementList().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT_LIST__REQUIREMENTS), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.PLUS, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_11_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_11_0_0_0, CT_11_0_0_1);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_11_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_11_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_11 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getRequirementList(), CT_11_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_12_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getRequirement().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__REF), "REQUIREMENT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_12_0_0_1_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getRequirement().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), "BEHAVIOR", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_12_0_0_1_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_12_0_0_1_0_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_12_0_0_1_0_1_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getRequirement().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), "REQUIREMENT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_12_0_0_1_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_12_0_0_1_0_1_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_12_0_0_1_0_2_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getRequirement().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), "TEXT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_12_0_0_1_0_2 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_12_0_0_1_0_2_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_12_0_0_1_0_3_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getRequirement().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), "COMPONENT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_12_0_0_1_0_3 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_12_0_0_1_0_3_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_12_0_0_1_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_12_0_0_1_0_0, CT_12_0_0_1_0_1, CT_12_0_0_1_0_2, CT_12_0_0_1_0_3);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtCompound CT_12_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtCompound(CT_12_0_0_1_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_12_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_12_0_0_0, CT_12_0_0_1);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_12_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_12_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_12 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getRequirement(), CT_12_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_13_0_0_0_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("#C", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_13_0_0_0_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getComponentList().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT_LIST__COMPONENTS), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_13_0_0_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_13_0_0_0_0_0_0, CT_13_0_0_0_0_0_1);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_13_0_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_13_0_0_0_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtCompound CT_13_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtCompound(CT_13_0_0_0_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.STAR);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_13_0_0_1_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("#SC", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_13_0_0_1_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getComponentList().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT_LIST__COMPONENTS), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_13_0_0_1_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_13_0_0_1_0_0_0, CT_13_0_0_1_0_0_1);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_13_0_0_1_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_13_0_0_1_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtCompound CT_13_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtCompound(CT_13_0_0_1_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.QUESTIONMARK);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword CT_13_0_0_2_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword("#C", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtContainment CT_13_0_0_2_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtContainment(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getComponentList().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT_LIST__COMPONENTS), org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_13_0_0_2_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_13_0_0_2_0_0_0, CT_13_0_0_2_0_0_1);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_13_0_0_2_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_13_0_0_2_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtCompound CT_13_0_0_2 = new org.be.textbe.ct.textct.resource.ct.grammar.CtCompound(CT_13_0_0_2_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.STAR);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_13_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_13_0_0_0, CT_13_0_0_1, CT_13_0_0_2);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_13_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_13_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_13 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getComponentList(), CT_13_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_14_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getComponent().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__REF), "COMPONENT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_14_0_0_1_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getComponent().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), "TEXT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_14_0_0_1_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_14_0_0_1_0_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_14_0_0_1_0_1_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getComponent().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), "COMPONENT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_14_0_0_1_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_14_0_0_1_0_1_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_14_0_0_1_0_2_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getComponent().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), "COMPONENTNAME", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_14_0_0_1_0_2 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_14_0_0_1_0_2_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_14_0_0_1_0_3_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getComponent().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), "REQUIREMENT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_14_0_0_1_0_3 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_14_0_0_1_0_3_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_14_0_0_1_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_14_0_0_1_0_0, CT_14_0_0_1_0_1, CT_14_0_0_1_0_2, CT_14_0_0_1_0_3);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtCompound CT_14_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtCompound(CT_14_0_0_1_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_14_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_14_0_0_0, CT_14_0_0_1);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_14_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_14_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_14 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getComponent(), CT_14_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_15_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getSystemComponent().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__REF), "COMPONENT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_15_0_0_1_0_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getSystemComponent().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), "TEXT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_15_0_0_1_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_15_0_0_1_0_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_15_0_0_1_0_1_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getSystemComponent().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), "COMPONENT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_15_0_0_1_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_15_0_0_1_0_1_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_15_0_0_1_0_2_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getSystemComponent().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), "COMPONENTNAME", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_15_0_0_1_0_2 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_15_0_0_1_0_2_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder CT_15_0_0_1_0_3_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getSystemComponent().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), "REQUIREMENT", org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, 0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_15_0_0_1_0_3 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_15_0_0_1_0_3_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_15_0_0_1_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_15_0_0_1_0_0, CT_15_0_0_1_0_1, CT_15_0_0_1_0_2, CT_15_0_0_1_0_3);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtCompound CT_15_0_0_1 = new org.be.textbe.ct.textct.resource.ct.grammar.CtCompound(CT_15_0_0_1_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtSequence CT_15_0_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_15_0_0_0, CT_15_0_0_1);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtChoice CT_15_0 = new org.be.textbe.ct.textct.resource.ct.grammar.CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE, CT_15_0_0);
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule CT_15 = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule(org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getSystemComponent(), CT_15_0, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality.ONE);
	
	public final static org.be.textbe.ct.textct.resource.ct.grammar.CtRule[] RULES = new org.be.textbe.ct.textct.resource.ct.grammar.CtRule[] {
		CT_0,
		CT_1,
		CT_2,
		CT_3,
		CT_4,
		CT_5,
		CT_6,
		CT_7,
		CT_8,
		CT_9,
		CT_10,
		CT_11,
		CT_12,
		CT_13,
		CT_14,
		CT_15,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (org.be.textbe.ct.textct.resource.ct.grammar.CtRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(org.be.textbe.ct.textct.resource.ct.grammar.CtSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword) {
			keywords.add(((org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword) element).getValue());
		} else if (element instanceof org.be.textbe.ct.textct.resource.ct.grammar.CtBooleanTerminal) {
			keywords.add(((org.be.textbe.ct.textct.resource.ct.grammar.CtBooleanTerminal) element).getTrueLiteral());
			keywords.add(((org.be.textbe.ct.textct.resource.ct.grammar.CtBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof org.be.textbe.ct.textct.resource.ct.grammar.CtEnumerationTerminal) {
			org.be.textbe.ct.textct.resource.ct.grammar.CtEnumerationTerminal terminal = (org.be.textbe.ct.textct.resource.ct.grammar.CtEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (org.be.textbe.ct.textct.resource.ct.grammar.CtSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
