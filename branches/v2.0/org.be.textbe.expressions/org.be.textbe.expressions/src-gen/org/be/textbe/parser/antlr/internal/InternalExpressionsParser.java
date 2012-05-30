package org.be.textbe.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.be.textbe.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "':='", "'?'", "'??'", "'???'", "'<'", "'>'", "'<<'", "'>>'", "'||'", "'%'", "'%+'", "'[]'", "'#'", "':'", "'NOT'", "'.'", "'('", "')'", "'|'", "'{'", "'}'", "'='", "'=<'", "'>='", "'<:'", "'+'", "'-'", "'><'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g"; }



     	private ExpressionsGrammarAccess grammarAccess;
     	
        public InternalExpressionsParser(TokenStream input, ExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Node";	
       	}
       	
       	@Override
       	protected ExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNode"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:68:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:69:2: (iv_ruleNode= ruleNode EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:70:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode75);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:77:1: ruleNode returns [EObject current=null] : (this_BehaviorNode_0= ruleBehaviorNode | this_ComponentInstantiationNode_1= ruleComponentInstantiationNode ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_BehaviorNode_0 = null;

        EObject this_ComponentInstantiationNode_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:80:28: ( (this_BehaviorNode_0= ruleBehaviorNode | this_ComponentInstantiationNode_1= ruleComponentInstantiationNode ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:81:1: (this_BehaviorNode_0= ruleBehaviorNode | this_ComponentInstantiationNode_1= ruleComponentInstantiationNode )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:81:1: (this_BehaviorNode_0= ruleBehaviorNode | this_ComponentInstantiationNode_1= ruleComponentInstantiationNode )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=21 && LA1_0<=24)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:82:5: this_BehaviorNode_0= ruleBehaviorNode
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getBehaviorNodeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBehaviorNode_in_ruleNode132);
                    this_BehaviorNode_0=ruleBehaviorNode();

                    state._fsp--;

                     
                            current = this_BehaviorNode_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:92:5: this_ComponentInstantiationNode_1= ruleComponentInstantiationNode
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getComponentInstantiationNodeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComponentInstantiationNode_in_ruleNode159);
                    this_ComponentInstantiationNode_1=ruleComponentInstantiationNode();

                    state._fsp--;

                     
                            current = this_ComponentInstantiationNode_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleBehaviorNode"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:108:1: entryRuleBehaviorNode returns [EObject current=null] : iv_ruleBehaviorNode= ruleBehaviorNode EOF ;
    public final EObject entryRuleBehaviorNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorNode = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:109:2: (iv_ruleBehaviorNode= ruleBehaviorNode EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:110:2: iv_ruleBehaviorNode= ruleBehaviorNode EOF
            {
             newCompositeNode(grammarAccess.getBehaviorNodeRule()); 
            pushFollow(FOLLOW_ruleBehaviorNode_in_entryRuleBehaviorNode194);
            iv_ruleBehaviorNode=ruleBehaviorNode();

            state._fsp--;

             current =iv_ruleBehaviorNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehaviorNode204); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviorNode"


    // $ANTLR start "ruleBehaviorNode"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:117:1: ruleBehaviorNode returns [EObject current=null] : ( ( (lv_component_0_0= ruleIdentifier ) ) ( (lv_behavior_1_0= ruleBehavior ) ) ) ;
    public final EObject ruleBehaviorNode() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_component_0_0 = null;

        EObject lv_behavior_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:120:28: ( ( ( (lv_component_0_0= ruleIdentifier ) ) ( (lv_behavior_1_0= ruleBehavior ) ) ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:121:1: ( ( (lv_component_0_0= ruleIdentifier ) ) ( (lv_behavior_1_0= ruleBehavior ) ) )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:121:1: ( ( (lv_component_0_0= ruleIdentifier ) ) ( (lv_behavior_1_0= ruleBehavior ) ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:121:2: ( (lv_component_0_0= ruleIdentifier ) ) ( (lv_behavior_1_0= ruleBehavior ) )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:121:2: ( (lv_component_0_0= ruleIdentifier ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:122:1: (lv_component_0_0= ruleIdentifier )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:122:1: (lv_component_0_0= ruleIdentifier )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:123:3: lv_component_0_0= ruleIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getBehaviorNodeAccess().getComponentIdentifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleBehaviorNode250);
            lv_component_0_0=ruleIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBehaviorNodeRule());
            	        }
                   		set(
                   			current, 
                   			"component",
                    		lv_component_0_0, 
                    		"Identifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:139:2: ( (lv_behavior_1_0= ruleBehavior ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:140:1: (lv_behavior_1_0= ruleBehavior )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:140:1: (lv_behavior_1_0= ruleBehavior )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:141:3: lv_behavior_1_0= ruleBehavior
            {
             
            	        newCompositeNode(grammarAccess.getBehaviorNodeAccess().getBehaviorBehaviorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBehavior_in_ruleBehaviorNode271);
            lv_behavior_1_0=ruleBehavior();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBehaviorNodeRule());
            	        }
                   		set(
                   			current, 
                   			"behavior",
                    		lv_behavior_1_0, 
                    		"Behavior");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviorNode"


    // $ANTLR start "entryRuleBehavior"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:165:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:166:2: (iv_ruleBehavior= ruleBehavior EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:167:2: iv_ruleBehavior= ruleBehavior EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_ruleBehavior_in_entryRuleBehavior307);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;

             current =iv_ruleBehavior; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehavior317); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:174:1: ruleBehavior returns [EObject current=null] : (this_StateRealisation_0= ruleStateRealisation | this_AttributeRealisation_1= ruleAttributeRealisation | this_Event_2= ruleEvent | this_Selection_3= ruleSelection | this_Guard_4= ruleGuard | this_InternalOutputEvent_5= ruleInternalOutputEvent | this_InternalInputEvent_6= ruleInternalInputEvent | this_ExternalOutputEvent_7= ruleExternalOutputEvent | this_ExternalInputEvent_8= ruleExternalInputEvent ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        EObject this_StateRealisation_0 = null;

        EObject this_AttributeRealisation_1 = null;

        EObject this_Event_2 = null;

        EObject this_Selection_3 = null;

        EObject this_Guard_4 = null;

        EObject this_InternalOutputEvent_5 = null;

        EObject this_InternalInputEvent_6 = null;

        EObject this_ExternalOutputEvent_7 = null;

        EObject this_ExternalInputEvent_8 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:177:28: ( (this_StateRealisation_0= ruleStateRealisation | this_AttributeRealisation_1= ruleAttributeRealisation | this_Event_2= ruleEvent | this_Selection_3= ruleSelection | this_Guard_4= ruleGuard | this_InternalOutputEvent_5= ruleInternalOutputEvent | this_InternalInputEvent_6= ruleInternalInputEvent | this_ExternalOutputEvent_7= ruleExternalOutputEvent | this_ExternalInputEvent_8= ruleExternalInputEvent ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:178:1: (this_StateRealisation_0= ruleStateRealisation | this_AttributeRealisation_1= ruleAttributeRealisation | this_Event_2= ruleEvent | this_Selection_3= ruleSelection | this_Guard_4= ruleGuard | this_InternalOutputEvent_5= ruleInternalOutputEvent | this_InternalInputEvent_6= ruleInternalInputEvent | this_ExternalOutputEvent_7= ruleExternalOutputEvent | this_ExternalInputEvent_8= ruleExternalInputEvent )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:178:1: (this_StateRealisation_0= ruleStateRealisation | this_AttributeRealisation_1= ruleAttributeRealisation | this_Event_2= ruleEvent | this_Selection_3= ruleSelection | this_Guard_4= ruleGuard | this_InternalOutputEvent_5= ruleInternalOutputEvent | this_InternalInputEvent_6= ruleInternalInputEvent | this_ExternalOutputEvent_7= ruleExternalOutputEvent | this_ExternalInputEvent_8= ruleExternalInputEvent )
            int alt2=9;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:179:5: this_StateRealisation_0= ruleStateRealisation
                    {
                     
                            newCompositeNode(grammarAccess.getBehaviorAccess().getStateRealisationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStateRealisation_in_ruleBehavior364);
                    this_StateRealisation_0=ruleStateRealisation();

                    state._fsp--;

                     
                            current = this_StateRealisation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:189:5: this_AttributeRealisation_1= ruleAttributeRealisation
                    {
                     
                            newCompositeNode(grammarAccess.getBehaviorAccess().getAttributeRealisationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAttributeRealisation_in_ruleBehavior391);
                    this_AttributeRealisation_1=ruleAttributeRealisation();

                    state._fsp--;

                     
                            current = this_AttributeRealisation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:199:5: this_Event_2= ruleEvent
                    {
                     
                            newCompositeNode(grammarAccess.getBehaviorAccess().getEventParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEvent_in_ruleBehavior418);
                    this_Event_2=ruleEvent();

                    state._fsp--;

                     
                            current = this_Event_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:209:5: this_Selection_3= ruleSelection
                    {
                     
                            newCompositeNode(grammarAccess.getBehaviorAccess().getSelectionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSelection_in_ruleBehavior445);
                    this_Selection_3=ruleSelection();

                    state._fsp--;

                     
                            current = this_Selection_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:219:5: this_Guard_4= ruleGuard
                    {
                     
                            newCompositeNode(grammarAccess.getBehaviorAccess().getGuardParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleGuard_in_ruleBehavior472);
                    this_Guard_4=ruleGuard();

                    state._fsp--;

                     
                            current = this_Guard_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:229:5: this_InternalOutputEvent_5= ruleInternalOutputEvent
                    {
                     
                            newCompositeNode(grammarAccess.getBehaviorAccess().getInternalOutputEventParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleInternalOutputEvent_in_ruleBehavior499);
                    this_InternalOutputEvent_5=ruleInternalOutputEvent();

                    state._fsp--;

                     
                            current = this_InternalOutputEvent_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:239:5: this_InternalInputEvent_6= ruleInternalInputEvent
                    {
                     
                            newCompositeNode(grammarAccess.getBehaviorAccess().getInternalInputEventParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleInternalInputEvent_in_ruleBehavior526);
                    this_InternalInputEvent_6=ruleInternalInputEvent();

                    state._fsp--;

                     
                            current = this_InternalInputEvent_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:249:5: this_ExternalOutputEvent_7= ruleExternalOutputEvent
                    {
                     
                            newCompositeNode(grammarAccess.getBehaviorAccess().getExternalOutputEventParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleExternalOutputEvent_in_ruleBehavior553);
                    this_ExternalOutputEvent_7=ruleExternalOutputEvent();

                    state._fsp--;

                     
                            current = this_ExternalOutputEvent_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:259:5: this_ExternalInputEvent_8= ruleExternalInputEvent
                    {
                     
                            newCompositeNode(grammarAccess.getBehaviorAccess().getExternalInputEventParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleExternalInputEvent_in_ruleBehavior580);
                    this_ExternalInputEvent_8=ruleExternalInputEvent();

                    state._fsp--;

                     
                            current = this_ExternalInputEvent_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleStateRealisation"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:275:1: entryRuleStateRealisation returns [EObject current=null] : iv_ruleStateRealisation= ruleStateRealisation EOF ;
    public final EObject entryRuleStateRealisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRealisation = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:276:2: (iv_ruleStateRealisation= ruleStateRealisation EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:277:2: iv_ruleStateRealisation= ruleStateRealisation EOF
            {
             newCompositeNode(grammarAccess.getStateRealisationRule()); 
            pushFollow(FOLLOW_ruleStateRealisation_in_entryRuleStateRealisation615);
            iv_ruleStateRealisation=ruleStateRealisation();

            state._fsp--;

             current =iv_ruleStateRealisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRealisation625); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateRealisation"


    // $ANTLR start "ruleStateRealisation"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:284:1: ruleStateRealisation returns [EObject current=null] : (otherlv_0= '[' ( (lv_state_1_0= ruleBinaryExpression ) ) otherlv_2= ']' ) ;
    public final EObject ruleStateRealisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_state_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:287:28: ( (otherlv_0= '[' ( (lv_state_1_0= ruleBinaryExpression ) ) otherlv_2= ']' ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:288:1: (otherlv_0= '[' ( (lv_state_1_0= ruleBinaryExpression ) ) otherlv_2= ']' )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:288:1: (otherlv_0= '[' ( (lv_state_1_0= ruleBinaryExpression ) ) otherlv_2= ']' )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:288:3: otherlv_0= '[' ( (lv_state_1_0= ruleBinaryExpression ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleStateRealisation662); 

                	newLeafNode(otherlv_0, grammarAccess.getStateRealisationAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:292:1: ( (lv_state_1_0= ruleBinaryExpression ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:293:1: (lv_state_1_0= ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:293:1: (lv_state_1_0= ruleBinaryExpression )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:294:3: lv_state_1_0= ruleBinaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getStateRealisationAccess().getStateBinaryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryExpression_in_ruleStateRealisation683);
            lv_state_1_0=ruleBinaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRealisationRule());
            	        }
                   		set(
                   			current, 
                   			"state",
                    		lv_state_1_0, 
                    		"BinaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStateRealisation695); 

                	newLeafNode(otherlv_2, grammarAccess.getStateRealisationAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateRealisation"


    // $ANTLR start "entryRuleAttributeRealisation"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:322:1: entryRuleAttributeRealisation returns [EObject current=null] : iv_ruleAttributeRealisation= ruleAttributeRealisation EOF ;
    public final EObject entryRuleAttributeRealisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeRealisation = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:323:2: (iv_ruleAttributeRealisation= ruleAttributeRealisation EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:324:2: iv_ruleAttributeRealisation= ruleAttributeRealisation EOF
            {
             newCompositeNode(grammarAccess.getAttributeRealisationRule()); 
            pushFollow(FOLLOW_ruleAttributeRealisation_in_entryRuleAttributeRealisation731);
            iv_ruleAttributeRealisation=ruleAttributeRealisation();

            state._fsp--;

             current =iv_ruleAttributeRealisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeRealisation741); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeRealisation"


    // $ANTLR start "ruleAttributeRealisation"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:331:1: ruleAttributeRealisation returns [EObject current=null] : (otherlv_0= '[' ( (lv_attribute_1_0= ruleIdentifier ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleBinaryExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleAttributeRealisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_attribute_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:334:28: ( (otherlv_0= '[' ( (lv_attribute_1_0= ruleIdentifier ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleBinaryExpression ) ) otherlv_4= ']' ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:335:1: (otherlv_0= '[' ( (lv_attribute_1_0= ruleIdentifier ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleBinaryExpression ) ) otherlv_4= ']' )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:335:1: (otherlv_0= '[' ( (lv_attribute_1_0= ruleIdentifier ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleBinaryExpression ) ) otherlv_4= ']' )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:335:3: otherlv_0= '[' ( (lv_attribute_1_0= ruleIdentifier ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleBinaryExpression ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAttributeRealisation778); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeRealisationAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:339:1: ( (lv_attribute_1_0= ruleIdentifier ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:340:1: (lv_attribute_1_0= ruleIdentifier )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:340:1: (lv_attribute_1_0= ruleIdentifier )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:341:3: lv_attribute_1_0= ruleIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getAttributeRealisationAccess().getAttributeIdentifierParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleAttributeRealisation799);
            lv_attribute_1_0=ruleIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRealisationRule());
            	        }
                   		set(
                   			current, 
                   			"attribute",
                    		lv_attribute_1_0, 
                    		"Identifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAttributeRealisation811); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeRealisationAccess().getColonEqualsSignKeyword_2());
                
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:361:1: ( (lv_value_3_0= ruleBinaryExpression ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:362:1: (lv_value_3_0= ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:362:1: (lv_value_3_0= ruleBinaryExpression )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:363:3: lv_value_3_0= ruleBinaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getAttributeRealisationAccess().getValueBinaryExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryExpression_in_ruleAttributeRealisation832);
            lv_value_3_0=ruleBinaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRealisationRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"BinaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleAttributeRealisation844); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeRealisationAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeRealisation"


    // $ANTLR start "entryRuleSelection"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:391:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:392:2: (iv_ruleSelection= ruleSelection EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:393:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_ruleSelection_in_entryRuleSelection880);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelection890); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:400:1: ruleSelection returns [EObject current=null] : (otherlv_0= '?' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '?' ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_FunctionApplication_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:403:28: ( (otherlv_0= '?' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '?' ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:404:1: (otherlv_0= '?' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '?' )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:404:1: (otherlv_0= '?' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '?' )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:404:3: otherlv_0= '?' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '?'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSelection927); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getQuestionMarkKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getSelectionAccess().getFunctionApplicationParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFunctionApplication_in_ruleSelection949);
            this_FunctionApplication_1=ruleFunctionApplication();

            state._fsp--;

             
                    current = this_FunctionApplication_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSelection960); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectionAccess().getQuestionMarkKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleEvent"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:429:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:430:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:431:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent996);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent1006); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:438:1: ruleEvent returns [EObject current=null] : (otherlv_0= '??' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '??' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_FunctionApplication_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:441:28: ( (otherlv_0= '??' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '??' ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:442:1: (otherlv_0= '??' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '??' )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:442:1: (otherlv_0= '??' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '??' )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:442:3: otherlv_0= '??' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '??'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleEvent1043); 

                	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getQuestionMarkQuestionMarkKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getEventAccess().getFunctionApplicationParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFunctionApplication_in_ruleEvent1065);
            this_FunctionApplication_1=ruleFunctionApplication();

            state._fsp--;

             
                    current = this_FunctionApplication_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEvent1076); 

                	newLeafNode(otherlv_2, grammarAccess.getEventAccess().getQuestionMarkQuestionMarkKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleGuard"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:467:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:468:2: (iv_ruleGuard= ruleGuard EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:469:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard1112);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard1122); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:476:1: ruleGuard returns [EObject current=null] : (otherlv_0= '???' ( (lv_state_1_0= ruleBinaryExpression ) ) otherlv_2= '???' ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_state_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:479:28: ( (otherlv_0= '???' ( (lv_state_1_0= ruleBinaryExpression ) ) otherlv_2= '???' ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:480:1: (otherlv_0= '???' ( (lv_state_1_0= ruleBinaryExpression ) ) otherlv_2= '???' )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:480:1: (otherlv_0= '???' ( (lv_state_1_0= ruleBinaryExpression ) ) otherlv_2= '???' )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:480:3: otherlv_0= '???' ( (lv_state_1_0= ruleBinaryExpression ) ) otherlv_2= '???'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleGuard1159); 

                	newLeafNode(otherlv_0, grammarAccess.getGuardAccess().getQuestionMarkQuestionMarkQuestionMarkKeyword_0());
                
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:484:1: ( (lv_state_1_0= ruleBinaryExpression ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:485:1: (lv_state_1_0= ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:485:1: (lv_state_1_0= ruleBinaryExpression )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:486:3: lv_state_1_0= ruleBinaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getStateBinaryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryExpression_in_ruleGuard1180);
            lv_state_1_0=ruleBinaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGuardRule());
            	        }
                   		set(
                   			current, 
                   			"state",
                    		lv_state_1_0, 
                    		"BinaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleGuard1192); 

                	newLeafNode(otherlv_2, grammarAccess.getGuardAccess().getQuestionMarkQuestionMarkQuestionMarkKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleInternalOutputEvent"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:514:1: entryRuleInternalOutputEvent returns [EObject current=null] : iv_ruleInternalOutputEvent= ruleInternalOutputEvent EOF ;
    public final EObject entryRuleInternalOutputEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalOutputEvent = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:515:2: (iv_ruleInternalOutputEvent= ruleInternalOutputEvent EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:516:2: iv_ruleInternalOutputEvent= ruleInternalOutputEvent EOF
            {
             newCompositeNode(grammarAccess.getInternalOutputEventRule()); 
            pushFollow(FOLLOW_ruleInternalOutputEvent_in_entryRuleInternalOutputEvent1228);
            iv_ruleInternalOutputEvent=ruleInternalOutputEvent();

            state._fsp--;

             current =iv_ruleInternalOutputEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalOutputEvent1238); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternalOutputEvent"


    // $ANTLR start "ruleInternalOutputEvent"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:523:1: ruleInternalOutputEvent returns [EObject current=null] : (otherlv_0= '<' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '>' ) ;
    public final EObject ruleInternalOutputEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_FunctionApplication_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:526:28: ( (otherlv_0= '<' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '>' ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:527:1: (otherlv_0= '<' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '>' )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:527:1: (otherlv_0= '<' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '>' )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:527:3: otherlv_0= '<' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleInternalOutputEvent1275); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalOutputEventAccess().getLessThanSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getInternalOutputEventAccess().getFunctionApplicationParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFunctionApplication_in_ruleInternalOutputEvent1297);
            this_FunctionApplication_1=ruleFunctionApplication();

            state._fsp--;

             
                    current = this_FunctionApplication_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleInternalOutputEvent1308); 

                	newLeafNode(otherlv_2, grammarAccess.getInternalOutputEventAccess().getGreaterThanSignKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternalOutputEvent"


    // $ANTLR start "entryRuleInternalInputEvent"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:552:1: entryRuleInternalInputEvent returns [EObject current=null] : iv_ruleInternalInputEvent= ruleInternalInputEvent EOF ;
    public final EObject entryRuleInternalInputEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalInputEvent = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:553:2: (iv_ruleInternalInputEvent= ruleInternalInputEvent EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:554:2: iv_ruleInternalInputEvent= ruleInternalInputEvent EOF
            {
             newCompositeNode(grammarAccess.getInternalInputEventRule()); 
            pushFollow(FOLLOW_ruleInternalInputEvent_in_entryRuleInternalInputEvent1344);
            iv_ruleInternalInputEvent=ruleInternalInputEvent();

            state._fsp--;

             current =iv_ruleInternalInputEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalInputEvent1354); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternalInputEvent"


    // $ANTLR start "ruleInternalInputEvent"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:561:1: ruleInternalInputEvent returns [EObject current=null] : (otherlv_0= '>' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '<' ) ;
    public final EObject ruleInternalInputEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_FunctionApplication_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:564:28: ( (otherlv_0= '>' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '<' ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:565:1: (otherlv_0= '>' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '<' )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:565:1: (otherlv_0= '>' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '<' )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:565:3: otherlv_0= '>' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '<'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleInternalInputEvent1391); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalInputEventAccess().getGreaterThanSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getInternalInputEventAccess().getFunctionApplicationParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFunctionApplication_in_ruleInternalInputEvent1413);
            this_FunctionApplication_1=ruleFunctionApplication();

            state._fsp--;

             
                    current = this_FunctionApplication_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleInternalInputEvent1424); 

                	newLeafNode(otherlv_2, grammarAccess.getInternalInputEventAccess().getLessThanSignKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternalInputEvent"


    // $ANTLR start "entryRuleExternalOutputEvent"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:590:1: entryRuleExternalOutputEvent returns [EObject current=null] : iv_ruleExternalOutputEvent= ruleExternalOutputEvent EOF ;
    public final EObject entryRuleExternalOutputEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalOutputEvent = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:591:2: (iv_ruleExternalOutputEvent= ruleExternalOutputEvent EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:592:2: iv_ruleExternalOutputEvent= ruleExternalOutputEvent EOF
            {
             newCompositeNode(grammarAccess.getExternalOutputEventRule()); 
            pushFollow(FOLLOW_ruleExternalOutputEvent_in_entryRuleExternalOutputEvent1460);
            iv_ruleExternalOutputEvent=ruleExternalOutputEvent();

            state._fsp--;

             current =iv_ruleExternalOutputEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalOutputEvent1470); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalOutputEvent"


    // $ANTLR start "ruleExternalOutputEvent"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:599:1: ruleExternalOutputEvent returns [EObject current=null] : (otherlv_0= '<<' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '>>' ) ;
    public final EObject ruleExternalOutputEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_FunctionApplication_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:602:28: ( (otherlv_0= '<<' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '>>' ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:603:1: (otherlv_0= '<<' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '>>' )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:603:1: (otherlv_0= '<<' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '>>' )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:603:3: otherlv_0= '<<' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '>>'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleExternalOutputEvent1507); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalOutputEventAccess().getLessThanSignLessThanSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getExternalOutputEventAccess().getFunctionApplicationParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFunctionApplication_in_ruleExternalOutputEvent1529);
            this_FunctionApplication_1=ruleFunctionApplication();

            state._fsp--;

             
                    current = this_FunctionApplication_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleExternalOutputEvent1540); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalOutputEventAccess().getGreaterThanSignGreaterThanSignKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalOutputEvent"


    // $ANTLR start "entryRuleExternalInputEvent"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:628:1: entryRuleExternalInputEvent returns [EObject current=null] : iv_ruleExternalInputEvent= ruleExternalInputEvent EOF ;
    public final EObject entryRuleExternalInputEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalInputEvent = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:629:2: (iv_ruleExternalInputEvent= ruleExternalInputEvent EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:630:2: iv_ruleExternalInputEvent= ruleExternalInputEvent EOF
            {
             newCompositeNode(grammarAccess.getExternalInputEventRule()); 
            pushFollow(FOLLOW_ruleExternalInputEvent_in_entryRuleExternalInputEvent1576);
            iv_ruleExternalInputEvent=ruleExternalInputEvent();

            state._fsp--;

             current =iv_ruleExternalInputEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalInputEvent1586); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalInputEvent"


    // $ANTLR start "ruleExternalInputEvent"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:637:1: ruleExternalInputEvent returns [EObject current=null] : (otherlv_0= '>>' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '<<' ) ;
    public final EObject ruleExternalInputEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_FunctionApplication_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:640:28: ( (otherlv_0= '>>' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '<<' ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:641:1: (otherlv_0= '>>' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '<<' )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:641:1: (otherlv_0= '>>' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '<<' )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:641:3: otherlv_0= '>>' this_FunctionApplication_1= ruleFunctionApplication otherlv_2= '<<'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleExternalInputEvent1623); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalInputEventAccess().getGreaterThanSignGreaterThanSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getExternalInputEventAccess().getFunctionApplicationParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFunctionApplication_in_ruleExternalInputEvent1645);
            this_FunctionApplication_1=ruleFunctionApplication();

            state._fsp--;

             
                    current = this_FunctionApplication_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleExternalInputEvent1656); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalInputEventAccess().getLessThanSignLessThanSignKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalInputEvent"


    // $ANTLR start "entryRuleComponentInstantiationNode"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:666:1: entryRuleComponentInstantiationNode returns [EObject current=null] : iv_ruleComponentInstantiationNode= ruleComponentInstantiationNode EOF ;
    public final EObject entryRuleComponentInstantiationNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstantiationNode = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:667:2: (iv_ruleComponentInstantiationNode= ruleComponentInstantiationNode EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:668:2: iv_ruleComponentInstantiationNode= ruleComponentInstantiationNode EOF
            {
             newCompositeNode(grammarAccess.getComponentInstantiationNodeRule()); 
            pushFollow(FOLLOW_ruleComponentInstantiationNode_in_entryRuleComponentInstantiationNode1692);
            iv_ruleComponentInstantiationNode=ruleComponentInstantiationNode();

            state._fsp--;

             current =iv_ruleComponentInstantiationNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentInstantiationNode1702); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentInstantiationNode"


    // $ANTLR start "ruleComponentInstantiationNode"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:675:1: ruleComponentInstantiationNode returns [EObject current=null] : (this_ForAll_0= ruleForAll | this_ForSome_1= ruleForSome | this_AtLeastOne_2= ruleAtLeastOne | this_ForOneArbitrary_3= ruleForOneArbitrary ) ;
    public final EObject ruleComponentInstantiationNode() throws RecognitionException {
        EObject current = null;

        EObject this_ForAll_0 = null;

        EObject this_ForSome_1 = null;

        EObject this_AtLeastOne_2 = null;

        EObject this_ForOneArbitrary_3 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:678:28: ( (this_ForAll_0= ruleForAll | this_ForSome_1= ruleForSome | this_AtLeastOne_2= ruleAtLeastOne | this_ForOneArbitrary_3= ruleForOneArbitrary ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:679:1: (this_ForAll_0= ruleForAll | this_ForSome_1= ruleForSome | this_AtLeastOne_2= ruleAtLeastOne | this_ForOneArbitrary_3= ruleForOneArbitrary )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:679:1: (this_ForAll_0= ruleForAll | this_ForSome_1= ruleForSome | this_AtLeastOne_2= ruleAtLeastOne | this_ForOneArbitrary_3= ruleForOneArbitrary )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:680:5: this_ForAll_0= ruleForAll
                    {
                     
                            newCompositeNode(grammarAccess.getComponentInstantiationNodeAccess().getForAllParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleForAll_in_ruleComponentInstantiationNode1749);
                    this_ForAll_0=ruleForAll();

                    state._fsp--;

                     
                            current = this_ForAll_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:690:5: this_ForSome_1= ruleForSome
                    {
                     
                            newCompositeNode(grammarAccess.getComponentInstantiationNodeAccess().getForSomeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleForSome_in_ruleComponentInstantiationNode1776);
                    this_ForSome_1=ruleForSome();

                    state._fsp--;

                     
                            current = this_ForSome_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:700:5: this_AtLeastOne_2= ruleAtLeastOne
                    {
                     
                            newCompositeNode(grammarAccess.getComponentInstantiationNodeAccess().getAtLeastOneParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAtLeastOne_in_ruleComponentInstantiationNode1803);
                    this_AtLeastOne_2=ruleAtLeastOne();

                    state._fsp--;

                     
                            current = this_AtLeastOne_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:710:5: this_ForOneArbitrary_3= ruleForOneArbitrary
                    {
                     
                            newCompositeNode(grammarAccess.getComponentInstantiationNodeAccess().getForOneArbitraryParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleForOneArbitrary_in_ruleComponentInstantiationNode1830);
                    this_ForOneArbitrary_3=ruleForOneArbitrary();

                    state._fsp--;

                     
                            current = this_ForOneArbitrary_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentInstantiationNode"


    // $ANTLR start "entryRuleForAll"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:726:1: entryRuleForAll returns [EObject current=null] : iv_ruleForAll= ruleForAll EOF ;
    public final EObject entryRuleForAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForAll = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:727:2: (iv_ruleForAll= ruleForAll EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:728:2: iv_ruleForAll= ruleForAll EOF
            {
             newCompositeNode(grammarAccess.getForAllRule()); 
            pushFollow(FOLLOW_ruleForAll_in_entryRuleForAll1865);
            iv_ruleForAll=ruleForAll();

            state._fsp--;

             current =iv_ruleForAll; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForAll1875); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForAll"


    // $ANTLR start "ruleForAll"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:735:1: ruleForAll returns [EObject current=null] : (otherlv_0= '||' this_ComponentInstantiation_1= ruleComponentInstantiation ) ;
    public final EObject ruleForAll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ComponentInstantiation_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:738:28: ( (otherlv_0= '||' this_ComponentInstantiation_1= ruleComponentInstantiation ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:739:1: (otherlv_0= '||' this_ComponentInstantiation_1= ruleComponentInstantiation )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:739:1: (otherlv_0= '||' this_ComponentInstantiation_1= ruleComponentInstantiation )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:739:3: otherlv_0= '||' this_ComponentInstantiation_1= ruleComponentInstantiation
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleForAll1912); 

                	newLeafNode(otherlv_0, grammarAccess.getForAllAccess().getVerticalLineVerticalLineKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getForAllAccess().getComponentInstantiationParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleComponentInstantiation_in_ruleForAll1934);
            this_ComponentInstantiation_1=ruleComponentInstantiation();

            state._fsp--;

             
                    current = this_ComponentInstantiation_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForAll"


    // $ANTLR start "entryRuleForSome"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:760:1: entryRuleForSome returns [EObject current=null] : iv_ruleForSome= ruleForSome EOF ;
    public final EObject entryRuleForSome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForSome = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:761:2: (iv_ruleForSome= ruleForSome EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:762:2: iv_ruleForSome= ruleForSome EOF
            {
             newCompositeNode(grammarAccess.getForSomeRule()); 
            pushFollow(FOLLOW_ruleForSome_in_entryRuleForSome1969);
            iv_ruleForSome=ruleForSome();

            state._fsp--;

             current =iv_ruleForSome; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForSome1979); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForSome"


    // $ANTLR start "ruleForSome"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:769:1: ruleForSome returns [EObject current=null] : (otherlv_0= '%' this_ComponentInstantiation_1= ruleComponentInstantiation ) ;
    public final EObject ruleForSome() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ComponentInstantiation_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:772:28: ( (otherlv_0= '%' this_ComponentInstantiation_1= ruleComponentInstantiation ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:773:1: (otherlv_0= '%' this_ComponentInstantiation_1= ruleComponentInstantiation )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:773:1: (otherlv_0= '%' this_ComponentInstantiation_1= ruleComponentInstantiation )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:773:3: otherlv_0= '%' this_ComponentInstantiation_1= ruleComponentInstantiation
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleForSome2016); 

                	newLeafNode(otherlv_0, grammarAccess.getForSomeAccess().getPercentSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getForSomeAccess().getComponentInstantiationParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleComponentInstantiation_in_ruleForSome2038);
            this_ComponentInstantiation_1=ruleComponentInstantiation();

            state._fsp--;

             
                    current = this_ComponentInstantiation_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForSome"


    // $ANTLR start "entryRuleAtLeastOne"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:794:1: entryRuleAtLeastOne returns [EObject current=null] : iv_ruleAtLeastOne= ruleAtLeastOne EOF ;
    public final EObject entryRuleAtLeastOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtLeastOne = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:795:2: (iv_ruleAtLeastOne= ruleAtLeastOne EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:796:2: iv_ruleAtLeastOne= ruleAtLeastOne EOF
            {
             newCompositeNode(grammarAccess.getAtLeastOneRule()); 
            pushFollow(FOLLOW_ruleAtLeastOne_in_entryRuleAtLeastOne2073);
            iv_ruleAtLeastOne=ruleAtLeastOne();

            state._fsp--;

             current =iv_ruleAtLeastOne; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtLeastOne2083); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtLeastOne"


    // $ANTLR start "ruleAtLeastOne"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:803:1: ruleAtLeastOne returns [EObject current=null] : (otherlv_0= '%+' this_ComponentInstantiation_1= ruleComponentInstantiation ) ;
    public final EObject ruleAtLeastOne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ComponentInstantiation_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:806:28: ( (otherlv_0= '%+' this_ComponentInstantiation_1= ruleComponentInstantiation ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:807:1: (otherlv_0= '%+' this_ComponentInstantiation_1= ruleComponentInstantiation )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:807:1: (otherlv_0= '%+' this_ComponentInstantiation_1= ruleComponentInstantiation )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:807:3: otherlv_0= '%+' this_ComponentInstantiation_1= ruleComponentInstantiation
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleAtLeastOne2120); 

                	newLeafNode(otherlv_0, grammarAccess.getAtLeastOneAccess().getPercentSignPlusSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getAtLeastOneAccess().getComponentInstantiationParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleComponentInstantiation_in_ruleAtLeastOne2142);
            this_ComponentInstantiation_1=ruleComponentInstantiation();

            state._fsp--;

             
                    current = this_ComponentInstantiation_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtLeastOne"


    // $ANTLR start "entryRuleForOneArbitrary"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:828:1: entryRuleForOneArbitrary returns [EObject current=null] : iv_ruleForOneArbitrary= ruleForOneArbitrary EOF ;
    public final EObject entryRuleForOneArbitrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForOneArbitrary = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:829:2: (iv_ruleForOneArbitrary= ruleForOneArbitrary EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:830:2: iv_ruleForOneArbitrary= ruleForOneArbitrary EOF
            {
             newCompositeNode(grammarAccess.getForOneArbitraryRule()); 
            pushFollow(FOLLOW_ruleForOneArbitrary_in_entryRuleForOneArbitrary2177);
            iv_ruleForOneArbitrary=ruleForOneArbitrary();

            state._fsp--;

             current =iv_ruleForOneArbitrary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForOneArbitrary2187); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForOneArbitrary"


    // $ANTLR start "ruleForOneArbitrary"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:837:1: ruleForOneArbitrary returns [EObject current=null] : (otherlv_0= '[]' this_ComponentInstantiation_1= ruleComponentInstantiation ) ;
    public final EObject ruleForOneArbitrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ComponentInstantiation_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:840:28: ( (otherlv_0= '[]' this_ComponentInstantiation_1= ruleComponentInstantiation ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:841:1: (otherlv_0= '[]' this_ComponentInstantiation_1= ruleComponentInstantiation )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:841:1: (otherlv_0= '[]' this_ComponentInstantiation_1= ruleComponentInstantiation )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:841:3: otherlv_0= '[]' this_ComponentInstantiation_1= ruleComponentInstantiation
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleForOneArbitrary2224); 

                	newLeafNode(otherlv_0, grammarAccess.getForOneArbitraryAccess().getLeftSquareBracketRightSquareBracketKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getForOneArbitraryAccess().getComponentInstantiationParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleComponentInstantiation_in_ruleForOneArbitrary2246);
            this_ComponentInstantiation_1=ruleComponentInstantiation();

            state._fsp--;

             
                    current = this_ComponentInstantiation_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForOneArbitrary"


    // $ANTLR start "entryRuleComponentInstantiation"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:862:1: entryRuleComponentInstantiation returns [EObject current=null] : iv_ruleComponentInstantiation= ruleComponentInstantiation EOF ;
    public final EObject entryRuleComponentInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstantiation = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:863:2: (iv_ruleComponentInstantiation= ruleComponentInstantiation EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:864:2: iv_ruleComponentInstantiation= ruleComponentInstantiation EOF
            {
             newCompositeNode(grammarAccess.getComponentInstantiationRule()); 
            pushFollow(FOLLOW_ruleComponentInstantiation_in_entryRuleComponentInstantiation2281);
            iv_ruleComponentInstantiation=ruleComponentInstantiation();

            state._fsp--;

             current =iv_ruleComponentInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentInstantiation2291); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentInstantiation"


    // $ANTLR start "ruleComponentInstantiation"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:871:1: ruleComponentInstantiation returns [EObject current=null] : ( ( (lv_component_0_0= ruleIdentifier ) ) otherlv_1= '#' otherlv_2= ':' ( (lv_componentSet_3_0= ruleBinaryExpression ) ) ) ;
    public final EObject ruleComponentInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_component_0_0 = null;

        EObject lv_componentSet_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:874:28: ( ( ( (lv_component_0_0= ruleIdentifier ) ) otherlv_1= '#' otherlv_2= ':' ( (lv_componentSet_3_0= ruleBinaryExpression ) ) ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:875:1: ( ( (lv_component_0_0= ruleIdentifier ) ) otherlv_1= '#' otherlv_2= ':' ( (lv_componentSet_3_0= ruleBinaryExpression ) ) )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:875:1: ( ( (lv_component_0_0= ruleIdentifier ) ) otherlv_1= '#' otherlv_2= ':' ( (lv_componentSet_3_0= ruleBinaryExpression ) ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:875:2: ( (lv_component_0_0= ruleIdentifier ) ) otherlv_1= '#' otherlv_2= ':' ( (lv_componentSet_3_0= ruleBinaryExpression ) )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:875:2: ( (lv_component_0_0= ruleIdentifier ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:876:1: (lv_component_0_0= ruleIdentifier )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:876:1: (lv_component_0_0= ruleIdentifier )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:877:3: lv_component_0_0= ruleIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getComponentInstantiationAccess().getComponentIdentifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleComponentInstantiation2337);
            lv_component_0_0=ruleIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentInstantiationRule());
            	        }
                   		set(
                   			current, 
                   			"component",
                    		lv_component_0_0, 
                    		"Identifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleComponentInstantiation2349); 

                	newLeafNode(otherlv_1, grammarAccess.getComponentInstantiationAccess().getNumberSignKeyword_1());
                
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleComponentInstantiation2361); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentInstantiationAccess().getColonKeyword_2());
                
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:901:1: ( (lv_componentSet_3_0= ruleBinaryExpression ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:902:1: (lv_componentSet_3_0= ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:902:1: (lv_componentSet_3_0= ruleBinaryExpression )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:903:3: lv_componentSet_3_0= ruleBinaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getComponentInstantiationAccess().getComponentSetBinaryExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryExpression_in_ruleComponentInstantiation2382);
            lv_componentSet_3_0=ruleBinaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentInstantiationRule());
            	        }
                   		set(
                   			current, 
                   			"componentSet",
                    		lv_componentSet_3_0, 
                    		"BinaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentInstantiation"


    // $ANTLR start "entryRuleBinaryRelation"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:927:1: entryRuleBinaryRelation returns [EObject current=null] : iv_ruleBinaryRelation= ruleBinaryRelation EOF ;
    public final EObject entryRuleBinaryRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryRelation = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:928:2: (iv_ruleBinaryRelation= ruleBinaryRelation EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:929:2: iv_ruleBinaryRelation= ruleBinaryRelation EOF
            {
             newCompositeNode(grammarAccess.getBinaryRelationRule()); 
            pushFollow(FOLLOW_ruleBinaryRelation_in_entryRuleBinaryRelation2418);
            iv_ruleBinaryRelation=ruleBinaryRelation();

            state._fsp--;

             current =iv_ruleBinaryRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryRelation2428); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryRelation"


    // $ANTLR start "ruleBinaryRelation"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:936:1: ruleBinaryRelation returns [EObject current=null] : ( (otherlv_0= 'NOT' )? ( (lv_left_1_0= ruleBinaryExpression ) ) ( ( (lv_operator_2_0= rulebinarySymbol ) ) ( (lv_right_3_0= ruleBinaryExpression ) ) )? ) ;
    public final EObject ruleBinaryRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:939:28: ( ( (otherlv_0= 'NOT' )? ( (lv_left_1_0= ruleBinaryExpression ) ) ( ( (lv_operator_2_0= rulebinarySymbol ) ) ( (lv_right_3_0= ruleBinaryExpression ) ) )? ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:940:1: ( (otherlv_0= 'NOT' )? ( (lv_left_1_0= ruleBinaryExpression ) ) ( ( (lv_operator_2_0= rulebinarySymbol ) ) ( (lv_right_3_0= ruleBinaryExpression ) ) )? )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:940:1: ( (otherlv_0= 'NOT' )? ( (lv_left_1_0= ruleBinaryExpression ) ) ( ( (lv_operator_2_0= rulebinarySymbol ) ) ( (lv_right_3_0= ruleBinaryExpression ) ) )? )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:940:2: (otherlv_0= 'NOT' )? ( (lv_left_1_0= ruleBinaryExpression ) ) ( ( (lv_operator_2_0= rulebinarySymbol ) ) ( (lv_right_3_0= ruleBinaryExpression ) ) )?
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:940:2: (otherlv_0= 'NOT' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:940:4: otherlv_0= 'NOT'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleBinaryRelation2466); 

                        	newLeafNode(otherlv_0, grammarAccess.getBinaryRelationAccess().getNOTKeyword_0());
                        

                    }
                    break;

            }

            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:944:3: ( (lv_left_1_0= ruleBinaryExpression ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:945:1: (lv_left_1_0= ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:945:1: (lv_left_1_0= ruleBinaryExpression )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:946:3: lv_left_1_0= ruleBinaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getBinaryRelationAccess().getLeftBinaryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryExpression_in_ruleBinaryRelation2489);
            lv_left_1_0=ruleBinaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryRelationRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_1_0, 
                    		"BinaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:962:2: ( ( (lv_operator_2_0= rulebinarySymbol ) ) ( (lv_right_3_0= ruleBinaryExpression ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=17 && LA5_0<=18)||LA5_0==26||(LA5_0>=34 && LA5_0<=37)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:962:3: ( (lv_operator_2_0= rulebinarySymbol ) ) ( (lv_right_3_0= ruleBinaryExpression ) )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:962:3: ( (lv_operator_2_0= rulebinarySymbol ) )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:963:1: (lv_operator_2_0= rulebinarySymbol )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:963:1: (lv_operator_2_0= rulebinarySymbol )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:964:3: lv_operator_2_0= rulebinarySymbol
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryRelationAccess().getOperatorBinarySymbolEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulebinarySymbol_in_ruleBinaryRelation2511);
                    lv_operator_2_0=rulebinarySymbol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"binarySymbol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:980:2: ( (lv_right_3_0= ruleBinaryExpression ) )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:981:1: (lv_right_3_0= ruleBinaryExpression )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:981:1: (lv_right_3_0= ruleBinaryExpression )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:982:3: lv_right_3_0= ruleBinaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryRelationAccess().getRightBinaryExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBinaryExpression_in_ruleBinaryRelation2532);
                    lv_right_3_0=ruleBinaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"BinaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryRelation"


    // $ANTLR start "entryRuleBinaryExpression"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1006:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1007:2: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1008:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_ruleBinaryExpression_in_entryRuleBinaryExpression2570);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;

             current =iv_ruleBinaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryExpression2580); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1015:1: ruleBinaryExpression returns [EObject current=null] : ( ( (lv_leftExpression_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleBinaryOperator ) ) ( (lv_rightExpression_2_0= ruleBinaryExpression ) ) )? ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpression_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_rightExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1018:28: ( ( ( (lv_leftExpression_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleBinaryOperator ) ) ( (lv_rightExpression_2_0= ruleBinaryExpression ) ) )? ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1019:1: ( ( (lv_leftExpression_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleBinaryOperator ) ) ( (lv_rightExpression_2_0= ruleBinaryExpression ) ) )? )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1019:1: ( ( (lv_leftExpression_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleBinaryOperator ) ) ( (lv_rightExpression_2_0= ruleBinaryExpression ) ) )? )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1019:2: ( (lv_leftExpression_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleBinaryOperator ) ) ( (lv_rightExpression_2_0= ruleBinaryExpression ) ) )?
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1019:2: ( (lv_leftExpression_0_0= ruleValue ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1020:1: (lv_leftExpression_0_0= ruleValue )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1020:1: (lv_leftExpression_0_0= ruleValue )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1021:3: lv_leftExpression_0_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftExpressionValueParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleBinaryExpression2626);
            lv_leftExpression_0_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"leftExpression",
                    		lv_leftExpression_0_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1037:2: ( ( (lv_operator_1_0= ruleBinaryOperator ) ) ( (lv_rightExpression_2_0= ruleBinaryExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=38 && LA6_0<=40)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1037:3: ( (lv_operator_1_0= ruleBinaryOperator ) ) ( (lv_rightExpression_2_0= ruleBinaryExpression ) )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1037:3: ( (lv_operator_1_0= ruleBinaryOperator ) )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1038:1: (lv_operator_1_0= ruleBinaryOperator )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1038:1: (lv_operator_1_0= ruleBinaryOperator )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1039:3: lv_operator_1_0= ruleBinaryOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorEnumRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBinaryOperator_in_ruleBinaryExpression2648);
                    lv_operator_1_0=ruleBinaryOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_1_0, 
                            		"BinaryOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1055:2: ( (lv_rightExpression_2_0= ruleBinaryExpression ) )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1056:1: (lv_rightExpression_2_0= ruleBinaryExpression )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1056:1: (lv_rightExpression_2_0= ruleBinaryExpression )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1057:3: lv_rightExpression_2_0= ruleBinaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightExpressionBinaryExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBinaryExpression_in_ruleBinaryExpression2669);
                    lv_rightExpression_2_0=ruleBinaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rightExpression",
                            		lv_rightExpression_2_0, 
                            		"BinaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleValue"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1081:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1082:2: (iv_ruleValue= ruleValue EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1083:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue2707);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue2717); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1090:1: ruleValue returns [EObject current=null] : (this_Reference_0= ruleReference | this_Number_1= ruleNumber | this_FunctionApplication_2= ruleFunctionApplication | this_BracketedExpression_3= ruleBracketedExpression | this_Cardinality_4= ruleCardinality | this_EnumeratedSet_5= ruleEnumeratedSet | this_FuzzyExp_6= ruleFuzzyExp ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Number_1 = null;

        EObject this_FunctionApplication_2 = null;

        EObject this_BracketedExpression_3 = null;

        EObject this_Cardinality_4 = null;

        EObject this_EnumeratedSet_5 = null;

        EObject this_FuzzyExp_6 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1093:28: ( (this_Reference_0= ruleReference | this_Number_1= ruleNumber | this_FunctionApplication_2= ruleFunctionApplication | this_BracketedExpression_3= ruleBracketedExpression | this_Cardinality_4= ruleCardinality | this_EnumeratedSet_5= ruleEnumeratedSet | this_FuzzyExp_6= ruleFuzzyExp ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1094:1: (this_Reference_0= ruleReference | this_Number_1= ruleNumber | this_FunctionApplication_2= ruleFunctionApplication | this_BracketedExpression_3= ruleBracketedExpression | this_Cardinality_4= ruleCardinality | this_EnumeratedSet_5= ruleEnumeratedSet | this_FuzzyExp_6= ruleFuzzyExp )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1094:1: (this_Reference_0= ruleReference | this_Number_1= ruleNumber | this_FunctionApplication_2= ruleFunctionApplication | this_BracketedExpression_3= ruleBracketedExpression | this_Cardinality_4= ruleCardinality | this_EnumeratedSet_5= ruleEnumeratedSet | this_FuzzyExp_6= ruleFuzzyExp )
            int alt7=7;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1095:5: this_Reference_0= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleValue2764);
                    this_Reference_0=ruleReference();

                    state._fsp--;

                     
                            current = this_Reference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1105:5: this_Number_1= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumber_in_ruleValue2791);
                    this_Number_1=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1115:5: this_FunctionApplication_2= ruleFunctionApplication
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getFunctionApplicationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFunctionApplication_in_ruleValue2818);
                    this_FunctionApplication_2=ruleFunctionApplication();

                    state._fsp--;

                     
                            current = this_FunctionApplication_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1125:5: this_BracketedExpression_3= ruleBracketedExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBracketedExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBracketedExpression_in_ruleValue2845);
                    this_BracketedExpression_3=ruleBracketedExpression();

                    state._fsp--;

                     
                            current = this_BracketedExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1135:5: this_Cardinality_4= ruleCardinality
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getCardinalityParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCardinality_in_ruleValue2872);
                    this_Cardinality_4=ruleCardinality();

                    state._fsp--;

                     
                            current = this_Cardinality_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1145:5: this_EnumeratedSet_5= ruleEnumeratedSet
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getEnumeratedSetParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleEnumeratedSet_in_ruleValue2899);
                    this_EnumeratedSet_5=ruleEnumeratedSet();

                    state._fsp--;

                     
                            current = this_EnumeratedSet_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1155:5: this_FuzzyExp_6= ruleFuzzyExp
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getFuzzyExpParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFuzzyExp_in_ruleValue2926);
                    this_FuzzyExp_6=ruleFuzzyExp();

                    state._fsp--;

                     
                            current = this_FuzzyExp_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleReference"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1171:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1172:2: (iv_ruleReference= ruleReference EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1173:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference2961);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference2971); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1180:1: ruleReference returns [EObject current=null] : ( (lv_object_0_0= ruleIdentifier ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_object_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1183:28: ( ( (lv_object_0_0= ruleIdentifier ) ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1184:1: ( (lv_object_0_0= ruleIdentifier ) )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1184:1: ( (lv_object_0_0= ruleIdentifier ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1185:1: (lv_object_0_0= ruleIdentifier )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1185:1: (lv_object_0_0= ruleIdentifier )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1186:3: lv_object_0_0= ruleIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getReferenceAccess().getObjectIdentifierParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleReference3016);
            lv_object_0_0=ruleIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"object",
                    		lv_object_0_0, 
                    		"Identifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleIdentifier"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1210:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1211:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1212:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier3052);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier3063); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1219:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1222:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1223:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1223:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1223:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdentifier3103); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1230:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1231:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_ruleIdentifier3122); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getIdentifierAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdentifier3137); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleNumber"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1251:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1252:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1253:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber3184);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber3194); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1260:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1263:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1264:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1264:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1265:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1265:1: (lv_value_0_0= RULE_INT )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1266:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber3235); 

            			newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleFunctionApplication"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1290:1: entryRuleFunctionApplication returns [EObject current=null] : iv_ruleFunctionApplication= ruleFunctionApplication EOF ;
    public final EObject entryRuleFunctionApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionApplication = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1291:2: (iv_ruleFunctionApplication= ruleFunctionApplication EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1292:2: iv_ruleFunctionApplication= ruleFunctionApplication EOF
            {
             newCompositeNode(grammarAccess.getFunctionApplicationRule()); 
            pushFollow(FOLLOW_ruleFunctionApplication_in_entryRuleFunctionApplication3275);
            iv_ruleFunctionApplication=ruleFunctionApplication();

            state._fsp--;

             current =iv_ruleFunctionApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionApplication3285); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionApplication"


    // $ANTLR start "ruleFunctionApplication"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1299:1: ruleFunctionApplication returns [EObject current=null] : ( ( (lv_functionName_0_0= ruleIdentifier ) ) otherlv_1= '(' ( (lv_parameter_2_0= ruleBinaryExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleFunctionApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_functionName_0_0 = null;

        EObject lv_parameter_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1302:28: ( ( ( (lv_functionName_0_0= ruleIdentifier ) ) otherlv_1= '(' ( (lv_parameter_2_0= ruleBinaryExpression ) ) otherlv_3= ')' ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1303:1: ( ( (lv_functionName_0_0= ruleIdentifier ) ) otherlv_1= '(' ( (lv_parameter_2_0= ruleBinaryExpression ) ) otherlv_3= ')' )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1303:1: ( ( (lv_functionName_0_0= ruleIdentifier ) ) otherlv_1= '(' ( (lv_parameter_2_0= ruleBinaryExpression ) ) otherlv_3= ')' )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1303:2: ( (lv_functionName_0_0= ruleIdentifier ) ) otherlv_1= '(' ( (lv_parameter_2_0= ruleBinaryExpression ) ) otherlv_3= ')'
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1303:2: ( (lv_functionName_0_0= ruleIdentifier ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1304:1: (lv_functionName_0_0= ruleIdentifier )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1304:1: (lv_functionName_0_0= ruleIdentifier )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1305:3: lv_functionName_0_0= ruleIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getFunctionApplicationAccess().getFunctionNameIdentifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleFunctionApplication3331);
            lv_functionName_0_0=ruleIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"functionName",
                    		lv_functionName_0_0, 
                    		"Identifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleFunctionApplication3343); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionApplicationAccess().getLeftParenthesisKeyword_1());
                
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1325:1: ( (lv_parameter_2_0= ruleBinaryExpression ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1326:1: (lv_parameter_2_0= ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1326:1: (lv_parameter_2_0= ruleBinaryExpression )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1327:3: lv_parameter_2_0= ruleBinaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getFunctionApplicationAccess().getParameterBinaryExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryExpression_in_ruleFunctionApplication3364);
            lv_parameter_2_0=ruleBinaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionApplicationRule());
            	        }
                   		add(
                   			current, 
                   			"parameter",
                    		lv_parameter_2_0, 
                    		"BinaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleFunctionApplication3376); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionApplicationAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionApplication"


    // $ANTLR start "entryRuleBracketedExpression"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1355:1: entryRuleBracketedExpression returns [EObject current=null] : iv_ruleBracketedExpression= ruleBracketedExpression EOF ;
    public final EObject entryRuleBracketedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracketedExpression = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1356:2: (iv_ruleBracketedExpression= ruleBracketedExpression EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1357:2: iv_ruleBracketedExpression= ruleBracketedExpression EOF
            {
             newCompositeNode(grammarAccess.getBracketedExpressionRule()); 
            pushFollow(FOLLOW_ruleBracketedExpression_in_entryRuleBracketedExpression3412);
            iv_ruleBracketedExpression=ruleBracketedExpression();

            state._fsp--;

             current =iv_ruleBracketedExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBracketedExpression3422); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBracketedExpression"


    // $ANTLR start "ruleBracketedExpression"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1364:1: ruleBracketedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_expression_1_0= ruleBinaryRelation ) ) otherlv_2= ')' ) ;
    public final EObject ruleBracketedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1367:28: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleBinaryRelation ) ) otherlv_2= ')' ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1368:1: (otherlv_0= '(' ( (lv_expression_1_0= ruleBinaryRelation ) ) otherlv_2= ')' )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1368:1: (otherlv_0= '(' ( (lv_expression_1_0= ruleBinaryRelation ) ) otherlv_2= ')' )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1368:3: otherlv_0= '(' ( (lv_expression_1_0= ruleBinaryRelation ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleBracketedExpression3459); 

                	newLeafNode(otherlv_0, grammarAccess.getBracketedExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1372:1: ( (lv_expression_1_0= ruleBinaryRelation ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1373:1: (lv_expression_1_0= ruleBinaryRelation )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1373:1: (lv_expression_1_0= ruleBinaryRelation )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1374:3: lv_expression_1_0= ruleBinaryRelation
            {
             
            	        newCompositeNode(grammarAccess.getBracketedExpressionAccess().getExpressionBinaryRelationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryRelation_in_ruleBracketedExpression3480);
            lv_expression_1_0=ruleBinaryRelation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBracketedExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"BinaryRelation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleBracketedExpression3492); 

                	newLeafNode(otherlv_2, grammarAccess.getBracketedExpressionAccess().getRightParenthesisKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBracketedExpression"


    // $ANTLR start "entryRuleCardinality"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1402:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1403:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1404:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality3528);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality3538); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1411:1: ruleCardinality returns [EObject current=null] : (otherlv_0= '|' ( (lv_expression_1_0= ruleBinaryExpression ) ) otherlv_2= '|' ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1414:28: ( (otherlv_0= '|' ( (lv_expression_1_0= ruleBinaryExpression ) ) otherlv_2= '|' ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1415:1: (otherlv_0= '|' ( (lv_expression_1_0= ruleBinaryExpression ) ) otherlv_2= '|' )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1415:1: (otherlv_0= '|' ( (lv_expression_1_0= ruleBinaryExpression ) ) otherlv_2= '|' )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1415:3: otherlv_0= '|' ( (lv_expression_1_0= ruleBinaryExpression ) ) otherlv_2= '|'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleCardinality3575); 

                	newLeafNode(otherlv_0, grammarAccess.getCardinalityAccess().getVerticalLineKeyword_0());
                
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1419:1: ( (lv_expression_1_0= ruleBinaryExpression ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1420:1: (lv_expression_1_0= ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1420:1: (lv_expression_1_0= ruleBinaryExpression )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1421:3: lv_expression_1_0= ruleBinaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getCardinalityAccess().getExpressionBinaryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryExpression_in_ruleCardinality3596);
            lv_expression_1_0=ruleBinaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCardinalityRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"BinaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleCardinality3608); 

                	newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getVerticalLineKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleEnumeratedSet"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1449:1: entryRuleEnumeratedSet returns [EObject current=null] : iv_ruleEnumeratedSet= ruleEnumeratedSet EOF ;
    public final EObject entryRuleEnumeratedSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeratedSet = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1450:2: (iv_ruleEnumeratedSet= ruleEnumeratedSet EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1451:2: iv_ruleEnumeratedSet= ruleEnumeratedSet EOF
            {
             newCompositeNode(grammarAccess.getEnumeratedSetRule()); 
            pushFollow(FOLLOW_ruleEnumeratedSet_in_entryRuleEnumeratedSet3644);
            iv_ruleEnumeratedSet=ruleEnumeratedSet();

            state._fsp--;

             current =iv_ruleEnumeratedSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeratedSet3654); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeratedSet"


    // $ANTLR start "ruleEnumeratedSet"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1458:1: ruleEnumeratedSet returns [EObject current=null] : (otherlv_0= '{' ( (lv_expressions_1_0= ruleBinaryExpression ) ) otherlv_2= '}' ) ;
    public final EObject ruleEnumeratedSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1461:28: ( (otherlv_0= '{' ( (lv_expressions_1_0= ruleBinaryExpression ) ) otherlv_2= '}' ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1462:1: (otherlv_0= '{' ( (lv_expressions_1_0= ruleBinaryExpression ) ) otherlv_2= '}' )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1462:1: (otherlv_0= '{' ( (lv_expressions_1_0= ruleBinaryExpression ) ) otherlv_2= '}' )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1462:3: otherlv_0= '{' ( (lv_expressions_1_0= ruleBinaryExpression ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleEnumeratedSet3691); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumeratedSetAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1466:1: ( (lv_expressions_1_0= ruleBinaryExpression ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1467:1: (lv_expressions_1_0= ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1467:1: (lv_expressions_1_0= ruleBinaryExpression )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1468:3: lv_expressions_1_0= ruleBinaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getEnumeratedSetAccess().getExpressionsBinaryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryExpression_in_ruleEnumeratedSet3712);
            lv_expressions_1_0=ruleBinaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumeratedSetRule());
            	        }
                   		add(
                   			current, 
                   			"expressions",
                    		lv_expressions_1_0, 
                    		"BinaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleEnumeratedSet3724); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumeratedSetAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeratedSet"


    // $ANTLR start "entryRuleFuzzyExp"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1496:1: entryRuleFuzzyExp returns [EObject current=null] : iv_ruleFuzzyExp= ruleFuzzyExp EOF ;
    public final EObject entryRuleFuzzyExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyExp = null;


        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1497:2: (iv_ruleFuzzyExp= ruleFuzzyExp EOF )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1498:2: iv_ruleFuzzyExp= ruleFuzzyExp EOF
            {
             newCompositeNode(grammarAccess.getFuzzyExpRule()); 
            pushFollow(FOLLOW_ruleFuzzyExp_in_entryRuleFuzzyExp3760);
            iv_ruleFuzzyExp=ruleFuzzyExp();

            state._fsp--;

             current =iv_ruleFuzzyExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuzzyExp3770); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuzzyExp"


    // $ANTLR start "ruleFuzzyExp"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1505:1: ruleFuzzyExp returns [EObject current=null] : (otherlv_0= '[' ( (lv_expression_1_0= ruleBinaryExpression ) ) otherlv_2= ']' ) ;
    public final EObject ruleFuzzyExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1508:28: ( (otherlv_0= '[' ( (lv_expression_1_0= ruleBinaryExpression ) ) otherlv_2= ']' ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1509:1: (otherlv_0= '[' ( (lv_expression_1_0= ruleBinaryExpression ) ) otherlv_2= ']' )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1509:1: (otherlv_0= '[' ( (lv_expression_1_0= ruleBinaryExpression ) ) otherlv_2= ']' )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1509:3: otherlv_0= '[' ( (lv_expression_1_0= ruleBinaryExpression ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleFuzzyExp3807); 

                	newLeafNode(otherlv_0, grammarAccess.getFuzzyExpAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1513:1: ( (lv_expression_1_0= ruleBinaryExpression ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1514:1: (lv_expression_1_0= ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1514:1: (lv_expression_1_0= ruleBinaryExpression )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1515:3: lv_expression_1_0= ruleBinaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getFuzzyExpAccess().getExpressionBinaryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryExpression_in_ruleFuzzyExp3828);
            lv_expression_1_0=ruleBinaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuzzyExpRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"BinaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFuzzyExp3840); 

                	newLeafNode(otherlv_2, grammarAccess.getFuzzyExpAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuzzyExp"


    // $ANTLR start "rulebinarySymbol"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1543:1: rulebinarySymbol returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '=<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= ':' ) | (enumLiteral_6= '<:' ) ) ;
    public final Enumerator rulebinarySymbol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1545:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '=<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= ':' ) | (enumLiteral_6= '<:' ) ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1546:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '=<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= ':' ) | (enumLiteral_6= '<:' ) )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1546:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '=<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= ':' ) | (enumLiteral_6= '<:' ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            case 36:
                {
                alt9=5;
                }
                break;
            case 26:
                {
                alt9=6;
                }
                break;
            case 37:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1546:2: (enumLiteral_0= '<' )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1546:2: (enumLiteral_0= '<' )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1546:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_17_in_rulebinarySymbol3890); 

                            current = grammarAccess.getBinarySymbolAccess().getLESS_THANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinarySymbolAccess().getLESS_THANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1552:6: (enumLiteral_1= '>' )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1552:6: (enumLiteral_1= '>' )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1552:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_18_in_rulebinarySymbol3907); 

                            current = grammarAccess.getBinarySymbolAccess().getGREATER_THANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinarySymbolAccess().getGREATER_THANEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1558:6: (enumLiteral_2= '=' )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1558:6: (enumLiteral_2= '=' )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1558:8: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_34_in_rulebinarySymbol3924); 

                            current = grammarAccess.getBinarySymbolAccess().getEQUAL_TOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBinarySymbolAccess().getEQUAL_TOEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1564:6: (enumLiteral_3= '=<' )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1564:6: (enumLiteral_3= '=<' )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1564:8: enumLiteral_3= '=<'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_35_in_rulebinarySymbol3941); 

                            current = grammarAccess.getBinarySymbolAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBinarySymbolAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1570:6: (enumLiteral_4= '>=' )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1570:6: (enumLiteral_4= '>=' )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1570:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_36_in_rulebinarySymbol3958); 

                            current = grammarAccess.getBinarySymbolAccess().getGREATER_THAN_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getBinarySymbolAccess().getGREATER_THAN_OR_EQUALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1576:6: (enumLiteral_5= ':' )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1576:6: (enumLiteral_5= ':' )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1576:8: enumLiteral_5= ':'
                    {
                    enumLiteral_5=(Token)match(input,26,FOLLOW_26_in_rulebinarySymbol3975); 

                            current = grammarAccess.getBinarySymbolAccess().getCOLONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getBinarySymbolAccess().getCOLONEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1582:6: (enumLiteral_6= '<:' )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1582:6: (enumLiteral_6= '<:' )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1582:8: enumLiteral_6= '<:'
                    {
                    enumLiteral_6=(Token)match(input,37,FOLLOW_37_in_rulebinarySymbol3992); 

                            current = grammarAccess.getBinarySymbolAccess().getSUBSET_EXPEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getBinarySymbolAccess().getSUBSET_EXPEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebinarySymbol"


    // $ANTLR start "ruleBinaryOperator"
    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1592:1: ruleBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '><' ) ) ;
    public final Enumerator ruleBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1594:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '><' ) ) )
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1595:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '><' ) )
            {
            // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1595:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '><' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt10=1;
                }
                break;
            case 39:
                {
                alt10=2;
                }
                break;
            case 40:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1595:2: (enumLiteral_0= '+' )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1595:2: (enumLiteral_0= '+' )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1595:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleBinaryOperator4037); 

                            current = grammarAccess.getBinaryOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1601:6: (enumLiteral_1= '-' )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1601:6: (enumLiteral_1= '-' )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1601:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_39_in_ruleBinaryOperator4054); 

                            current = grammarAccess.getBinaryOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1607:6: (enumLiteral_2= '><' )
                    {
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1607:6: (enumLiteral_2= '><' )
                    // ../org.be.textbe.expressions/src-gen/org/be/textbe/parser/antlr/internal/InternalExpressions.g:1607:8: enumLiteral_2= '><'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_40_in_ruleBinaryOperator4071); 

                            current = grammarAccess.getBinaryOperatorAccess().getINTERSECTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorAccess().getINTERSECTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperator"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA2_eotS =
        "\16\uffff";
    static final String DFA2_eofS =
        "\16\uffff";
    static final String DFA2_minS =
        "\1\13\1\4\7\uffff\1\14\1\uffff\1\4\1\uffff\1\14";
    static final String DFA2_maxS =
        "\1\24\1\40\7\uffff\1\50\1\uffff\1\4\1\uffff\1\50";
    static final String DFA2_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\1\1\uffff\1\2"+
        "\1\uffff";
    static final String DFA2_specialS =
        "\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\2\uffff\1\3\1\2\1\4\1\5\1\6\1\7\1\10",
            "\1\11\1\12\5\uffff\1\12\21\uffff\1\12\1\uffff\2\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\14\16\uffff\1\13\1\12\10\uffff\3\12",
            "",
            "\1\15",
            "",
            "\1\12\1\14\16\uffff\1\13\1\12\10\uffff\3\12"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "178:1: (this_StateRealisation_0= ruleStateRealisation | this_AttributeRealisation_1= ruleAttributeRealisation | this_Event_2= ruleEvent | this_Selection_3= ruleSelection | this_Guard_4= ruleGuard | this_InternalOutputEvent_5= ruleInternalOutputEvent | this_InternalInputEvent_6= ruleInternalInputEvent | this_ExternalOutputEvent_7= ruleExternalOutputEvent | this_ExternalInputEvent_8= ruleExternalInputEvent )";
        }
    }
    static final String DFA7_eotS =
        "\13\uffff";
    static final String DFA7_eofS =
        "\1\uffff\1\11\10\uffff\1\11";
    static final String DFA7_minS =
        "\1\4\1\14\5\uffff\1\4\2\uffff\1\14";
    static final String DFA7_maxS =
        "\1\40\1\50\5\uffff\1\4\2\uffff\1\50";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\6\1\7\1\uffff\1\3\1\1\1\uffff";
    static final String DFA7_specialS =
        "\13\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\2\5\uffff\1\6\21\uffff\1\3\1\uffff\1\4\1\5",
            "\1\11\3\uffff\3\11\7\uffff\1\11\1\uffff\1\7\1\10\2\11\1\uffff"+
            "\10\11",
            "",
            "",
            "",
            "",
            "",
            "\1\12",
            "",
            "",
            "\1\11\3\uffff\3\11\7\uffff\1\11\1\uffff\1\7\1\10\2\11\1\uffff"+
            "\10\11"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1094:1: (this_Reference_0= ruleReference | this_Number_1= ruleNumber | this_FunctionApplication_2= ruleFunctionApplication | this_BracketedExpression_3= ruleBracketedExpression | this_Cardinality_4= ruleCardinality | this_EnumeratedSet_5= ruleEnumeratedSet | this_FuzzyExp_6= ruleFuzzyExp )";
        }
    }
 

    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehaviorNode_in_ruleNode132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentInstantiationNode_in_ruleNode159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehaviorNode_in_entryRuleBehaviorNode194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehaviorNode204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleBehaviorNode250 = new BitSet(new long[]{0x00000000001FC800L});
    public static final BitSet FOLLOW_ruleBehavior_in_ruleBehaviorNode271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehavior_in_entryRuleBehavior307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehavior317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRealisation_in_ruleBehavior364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeRealisation_in_ruleBehavior391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleBehavior418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_ruleBehavior445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_ruleBehavior472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalOutputEvent_in_ruleBehavior499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalInputEvent_in_ruleBehavior526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOutputEvent_in_ruleBehavior553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalInputEvent_in_ruleBehavior580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRealisation_in_entryRuleStateRealisation615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRealisation625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStateRealisation662 = new BitSet(new long[]{0x00000001A0000830L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_ruleStateRealisation683 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStateRealisation695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeRealisation_in_entryRuleAttributeRealisation731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeRealisation741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAttributeRealisation778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleAttributeRealisation799 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttributeRealisation811 = new BitSet(new long[]{0x00000001A0000830L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_ruleAttributeRealisation832 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttributeRealisation844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelection890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSelection927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_ruleSelection949 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSelection960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEvent1043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_ruleEvent1065 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvent1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard1112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleGuard1159 = new BitSet(new long[]{0x00000001A0000830L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_ruleGuard1180 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleGuard1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalOutputEvent_in_entryRuleInternalOutputEvent1228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalOutputEvent1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleInternalOutputEvent1275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_ruleInternalOutputEvent1297 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInternalOutputEvent1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalInputEvent_in_entryRuleInternalInputEvent1344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalInputEvent1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleInternalInputEvent1391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_ruleInternalInputEvent1413 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInternalInputEvent1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOutputEvent_in_entryRuleExternalOutputEvent1460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalOutputEvent1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleExternalOutputEvent1507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_ruleExternalOutputEvent1529 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExternalOutputEvent1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalInputEvent_in_entryRuleExternalInputEvent1576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalInputEvent1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleExternalInputEvent1623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_ruleExternalInputEvent1645 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExternalInputEvent1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentInstantiationNode_in_entryRuleComponentInstantiationNode1692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentInstantiationNode1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAll_in_ruleComponentInstantiationNode1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForSome_in_ruleComponentInstantiationNode1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtLeastOne_in_ruleComponentInstantiationNode1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForOneArbitrary_in_ruleComponentInstantiationNode1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAll_in_entryRuleForAll1865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForAll1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleForAll1912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComponentInstantiation_in_ruleForAll1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForSome_in_entryRuleForSome1969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForSome1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleForSome2016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComponentInstantiation_in_ruleForSome2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtLeastOne_in_entryRuleAtLeastOne2073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtLeastOne2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAtLeastOne2120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComponentInstantiation_in_ruleAtLeastOne2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForOneArbitrary_in_entryRuleForOneArbitrary2177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForOneArbitrary2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleForOneArbitrary2224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComponentInstantiation_in_ruleForOneArbitrary2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentInstantiation_in_entryRuleComponentInstantiation2281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentInstantiation2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleComponentInstantiation2337 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleComponentInstantiation2349 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleComponentInstantiation2361 = new BitSet(new long[]{0x00000001A0000830L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_ruleComponentInstantiation2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryRelation_in_entryRuleBinaryRelation2418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryRelation2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBinaryRelation2466 = new BitSet(new long[]{0x00000001A0000830L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_ruleBinaryRelation2489 = new BitSet(new long[]{0x0000003C04060002L});
    public static final BitSet FOLLOW_rulebinarySymbol_in_ruleBinaryRelation2511 = new BitSet(new long[]{0x00000001A0000830L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_ruleBinaryRelation2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_entryRuleBinaryExpression2570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryExpression2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBinaryExpression2626 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperator_in_ruleBinaryExpression2648 = new BitSet(new long[]{0x00000001A0000830L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_ruleBinaryExpression2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue2707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleValue2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleValue2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_ruleValue2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketedExpression_in_ruleValue2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleValue2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeratedSet_in_ruleValue2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuzzyExp_in_ruleValue2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference2961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleReference3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier3052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier3103 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleIdentifier3122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier3137 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber3184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_entryRuleFunctionApplication3275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionApplication3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleFunctionApplication3331 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionApplication3343 = new BitSet(new long[]{0x00000001A0000830L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_ruleFunctionApplication3364 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionApplication3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketedExpression_in_entryRuleBracketedExpression3412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBracketedExpression3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBracketedExpression3459 = new BitSet(new long[]{0x00000001A8000830L});
    public static final BitSet FOLLOW_ruleBinaryRelation_in_ruleBracketedExpression3480 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleBracketedExpression3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality3528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCardinality3575 = new BitSet(new long[]{0x00000001A0000830L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_ruleCardinality3596 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCardinality3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeratedSet_in_entryRuleEnumeratedSet3644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeratedSet3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEnumeratedSet3691 = new BitSet(new long[]{0x00000001A0000830L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_ruleEnumeratedSet3712 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEnumeratedSet3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuzzyExp_in_entryRuleFuzzyExp3760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuzzyExp3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFuzzyExp3807 = new BitSet(new long[]{0x00000001A0000830L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_ruleFuzzyExp3828 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFuzzyExp3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulebinarySymbol3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulebinarySymbol3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulebinarySymbol3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulebinarySymbol3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulebinarySymbol3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulebinarySymbol3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulebinarySymbol3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBinaryOperator4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBinaryOperator4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBinaryOperator4071 = new BitSet(new long[]{0x0000000000000002L});

}