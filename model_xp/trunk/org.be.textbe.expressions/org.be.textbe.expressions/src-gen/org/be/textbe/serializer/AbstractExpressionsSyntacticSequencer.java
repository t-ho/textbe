package org.be.textbe.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.be.textbe.services.ExpressionsGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractExpressionsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ExpressionsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AtLeastOne_ForAll_ForOneArbitrary_ForSome_LeftSquareBracketRightSquareBracketKeyword_0_or_PercentSignKeyword_0_or_PercentSignPlusSignKeyword_0_or_VerticalLineVerticalLineKeyword_0;
	protected AbstractElementAlias match_BinaryRelation_NOTKeyword_0_q;
	protected AbstractElementAlias match_Event_ExternalInputEvent_ExternalOutputEvent_InternalInputEvent_InternalOutputEvent_Selection_GreaterThanSignGreaterThanSignKeyword_0_or_GreaterThanSignKeyword_0_or_LessThanSignKeyword_0_or_LessThanSignLessThanSignKeyword_0_or_QuestionMarkKeyword_0_or_QuestionMarkQuestionMarkKeyword_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ExpressionsGrammarAccess) access;
		match_AtLeastOne_ForAll_ForOneArbitrary_ForSome_LeftSquareBracketRightSquareBracketKeyword_0_or_PercentSignKeyword_0_or_PercentSignPlusSignKeyword_0_or_VerticalLineVerticalLineKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAtLeastOneAccess().getPercentSignPlusSignKeyword_0()), new TokenAlias(false, false, grammarAccess.getForAllAccess().getVerticalLineVerticalLineKeyword_0()), new TokenAlias(false, false, grammarAccess.getForOneArbitraryAccess().getLeftSquareBracketRightSquareBracketKeyword_0()), new TokenAlias(false, false, grammarAccess.getForSomeAccess().getPercentSignKeyword_0()));
		match_BinaryRelation_NOTKeyword_0_q = new TokenAlias(true, false, grammarAccess.getBinaryRelationAccess().getNOTKeyword_0());
		match_Event_ExternalInputEvent_ExternalOutputEvent_InternalInputEvent_InternalOutputEvent_Selection_GreaterThanSignGreaterThanSignKeyword_0_or_GreaterThanSignKeyword_0_or_LessThanSignKeyword_0_or_LessThanSignLessThanSignKeyword_0_or_QuestionMarkKeyword_0_or_QuestionMarkQuestionMarkKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getEventAccess().getQuestionMarkQuestionMarkKeyword_0()), new TokenAlias(false, false, grammarAccess.getExternalInputEventAccess().getGreaterThanSignGreaterThanSignKeyword_0()), new TokenAlias(false, false, grammarAccess.getExternalOutputEventAccess().getLessThanSignLessThanSignKeyword_0()), new TokenAlias(false, false, grammarAccess.getInternalInputEventAccess().getGreaterThanSignKeyword_0()), new TokenAlias(false, false, grammarAccess.getInternalOutputEventAccess().getLessThanSignKeyword_0()), new TokenAlias(false, false, grammarAccess.getSelectionAccess().getQuestionMarkKeyword_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AtLeastOne_ForAll_ForOneArbitrary_ForSome_LeftSquareBracketRightSquareBracketKeyword_0_or_PercentSignKeyword_0_or_PercentSignPlusSignKeyword_0_or_VerticalLineVerticalLineKeyword_0.equals(syntax))
				emit_AtLeastOne_ForAll_ForOneArbitrary_ForSome_LeftSquareBracketRightSquareBracketKeyword_0_or_PercentSignKeyword_0_or_PercentSignPlusSignKeyword_0_or_VerticalLineVerticalLineKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BinaryRelation_NOTKeyword_0_q.equals(syntax))
				emit_BinaryRelation_NOTKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Event_ExternalInputEvent_ExternalOutputEvent_InternalInputEvent_InternalOutputEvent_Selection_GreaterThanSignGreaterThanSignKeyword_0_or_GreaterThanSignKeyword_0_or_LessThanSignKeyword_0_or_LessThanSignLessThanSignKeyword_0_or_QuestionMarkKeyword_0_or_QuestionMarkQuestionMarkKeyword_0.equals(syntax))
				emit_Event_ExternalInputEvent_ExternalOutputEvent_InternalInputEvent_InternalOutputEvent_Selection_GreaterThanSignGreaterThanSignKeyword_0_or_GreaterThanSignKeyword_0_or_LessThanSignKeyword_0_or_LessThanSignLessThanSignKeyword_0_or_QuestionMarkKeyword_0_or_QuestionMarkQuestionMarkKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '%' | '%+' | '[]' | '||'
	 */
	protected void emit_AtLeastOne_ForAll_ForOneArbitrary_ForSome_LeftSquareBracketRightSquareBracketKeyword_0_or_PercentSignKeyword_0_or_PercentSignPlusSignKeyword_0_or_VerticalLineVerticalLineKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'NOT'?
	 */
	protected void emit_BinaryRelation_NOTKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '>>' | 
	     '<<' | 
	     '>' | 
	     '<' | 
	     '??' | 
	     '?'
	 )
	 */
	protected void emit_Event_ExternalInputEvent_ExternalOutputEvent_InternalInputEvent_InternalOutputEvent_Selection_GreaterThanSignGreaterThanSignKeyword_0_or_GreaterThanSignKeyword_0_or_LessThanSignKeyword_0_or_LessThanSignLessThanSignKeyword_0_or_QuestionMarkKeyword_0_or_QuestionMarkQuestionMarkKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
