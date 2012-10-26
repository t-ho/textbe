package org.be.textbe.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.be.textbe.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "'='", "'=<'", "'>='", "':'", "'<:'", "'+'", "'-'", "'><'", "'['", "']'", "':='", "'?'", "'??'", "'???'", "'<<'", "'>>'", "'||'", "'%'", "'%+'", "'[]'", "'#'", "'NOT'", "'.'", "'('", "')'", "'|'", "'{'", "'}'"
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
    public String getGrammarFileName() { return "../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g"; }


     
     	private ExpressionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleNode"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:60:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:61:1: ( ruleNode EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:62:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode61);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:69:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:73:2: ( ( ( rule__Node__Alternatives ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:74:1: ( ( rule__Node__Alternatives ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:74:1: ( ( rule__Node__Alternatives ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:75:1: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:76:1: ( rule__Node__Alternatives )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:76:2: rule__Node__Alternatives
            {
            pushFollow(FOLLOW_rule__Node__Alternatives_in_ruleNode94);
            rule__Node__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleBehaviorNode"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:88:1: entryRuleBehaviorNode : ruleBehaviorNode EOF ;
    public final void entryRuleBehaviorNode() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:89:1: ( ruleBehaviorNode EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:90:1: ruleBehaviorNode EOF
            {
             before(grammarAccess.getBehaviorNodeRule()); 
            pushFollow(FOLLOW_ruleBehaviorNode_in_entryRuleBehaviorNode121);
            ruleBehaviorNode();

            state._fsp--;

             after(grammarAccess.getBehaviorNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehaviorNode128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehaviorNode"


    // $ANTLR start "ruleBehaviorNode"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:97:1: ruleBehaviorNode : ( ( rule__BehaviorNode__Group__0 ) ) ;
    public final void ruleBehaviorNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:101:2: ( ( ( rule__BehaviorNode__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:102:1: ( ( rule__BehaviorNode__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:102:1: ( ( rule__BehaviorNode__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:103:1: ( rule__BehaviorNode__Group__0 )
            {
             before(grammarAccess.getBehaviorNodeAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:104:1: ( rule__BehaviorNode__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:104:2: rule__BehaviorNode__Group__0
            {
            pushFollow(FOLLOW_rule__BehaviorNode__Group__0_in_ruleBehaviorNode154);
            rule__BehaviorNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviorNode"


    // $ANTLR start "entryRuleBehavior"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:116:1: entryRuleBehavior : ruleBehavior EOF ;
    public final void entryRuleBehavior() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:117:1: ( ruleBehavior EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:118:1: ruleBehavior EOF
            {
             before(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_ruleBehavior_in_entryRuleBehavior181);
            ruleBehavior();

            state._fsp--;

             after(grammarAccess.getBehaviorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehavior188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:125:1: ruleBehavior : ( ( rule__Behavior__Alternatives ) ) ;
    public final void ruleBehavior() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:129:2: ( ( ( rule__Behavior__Alternatives ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:130:1: ( ( rule__Behavior__Alternatives ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:130:1: ( ( rule__Behavior__Alternatives ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:131:1: ( rule__Behavior__Alternatives )
            {
             before(grammarAccess.getBehaviorAccess().getAlternatives()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:132:1: ( rule__Behavior__Alternatives )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:132:2: rule__Behavior__Alternatives
            {
            pushFollow(FOLLOW_rule__Behavior__Alternatives_in_ruleBehavior214);
            rule__Behavior__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleStateRealisation"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:144:1: entryRuleStateRealisation : ruleStateRealisation EOF ;
    public final void entryRuleStateRealisation() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:145:1: ( ruleStateRealisation EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:146:1: ruleStateRealisation EOF
            {
             before(grammarAccess.getStateRealisationRule()); 
            pushFollow(FOLLOW_ruleStateRealisation_in_entryRuleStateRealisation241);
            ruleStateRealisation();

            state._fsp--;

             after(grammarAccess.getStateRealisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRealisation248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateRealisation"


    // $ANTLR start "ruleStateRealisation"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:153:1: ruleStateRealisation : ( ( rule__StateRealisation__Group__0 ) ) ;
    public final void ruleStateRealisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:157:2: ( ( ( rule__StateRealisation__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:158:1: ( ( rule__StateRealisation__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:158:1: ( ( rule__StateRealisation__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: ( rule__StateRealisation__Group__0 )
            {
             before(grammarAccess.getStateRealisationAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:160:1: ( rule__StateRealisation__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:160:2: rule__StateRealisation__Group__0
            {
            pushFollow(FOLLOW_rule__StateRealisation__Group__0_in_ruleStateRealisation274);
            rule__StateRealisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateRealisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateRealisation"


    // $ANTLR start "entryRuleAttributeRealisation"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:172:1: entryRuleAttributeRealisation : ruleAttributeRealisation EOF ;
    public final void entryRuleAttributeRealisation() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:173:1: ( ruleAttributeRealisation EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:174:1: ruleAttributeRealisation EOF
            {
             before(grammarAccess.getAttributeRealisationRule()); 
            pushFollow(FOLLOW_ruleAttributeRealisation_in_entryRuleAttributeRealisation301);
            ruleAttributeRealisation();

            state._fsp--;

             after(grammarAccess.getAttributeRealisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeRealisation308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeRealisation"


    // $ANTLR start "ruleAttributeRealisation"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:181:1: ruleAttributeRealisation : ( ( rule__AttributeRealisation__Group__0 ) ) ;
    public final void ruleAttributeRealisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:185:2: ( ( ( rule__AttributeRealisation__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:186:1: ( ( rule__AttributeRealisation__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:186:1: ( ( rule__AttributeRealisation__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:187:1: ( rule__AttributeRealisation__Group__0 )
            {
             before(grammarAccess.getAttributeRealisationAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:188:1: ( rule__AttributeRealisation__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:188:2: rule__AttributeRealisation__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeRealisation__Group__0_in_ruleAttributeRealisation334);
            rule__AttributeRealisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeRealisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeRealisation"


    // $ANTLR start "entryRuleSelection"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:200:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:201:1: ( ruleSelection EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:202:1: ruleSelection EOF
            {
             before(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_ruleSelection_in_entryRuleSelection361);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSelectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelection368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:209:1: ruleSelection : ( ( rule__Selection__Group__0 ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:213:2: ( ( ( rule__Selection__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:214:1: ( ( rule__Selection__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:214:1: ( ( rule__Selection__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:215:1: ( rule__Selection__Group__0 )
            {
             before(grammarAccess.getSelectionAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:216:1: ( rule__Selection__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:216:2: rule__Selection__Group__0
            {
            pushFollow(FOLLOW_rule__Selection__Group__0_in_ruleSelection394);
            rule__Selection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleEvent"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:228:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:229:1: ( ruleEvent EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:230:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent421);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:237:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:241:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:242:1: ( ( rule__Event__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:242:1: ( ( rule__Event__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:243:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:244:1: ( rule__Event__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:244:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent454);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleGuard"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:256:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:257:1: ( ruleGuard EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:258:1: ruleGuard EOF
            {
             before(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard481);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getGuardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:265:1: ruleGuard : ( ( rule__Guard__Group__0 ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:269:2: ( ( ( rule__Guard__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:270:1: ( ( rule__Guard__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:270:1: ( ( rule__Guard__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:271:1: ( rule__Guard__Group__0 )
            {
             before(grammarAccess.getGuardAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:272:1: ( rule__Guard__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:272:2: rule__Guard__Group__0
            {
            pushFollow(FOLLOW_rule__Guard__Group__0_in_ruleGuard514);
            rule__Guard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleInternalOutputEvent"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:284:1: entryRuleInternalOutputEvent : ruleInternalOutputEvent EOF ;
    public final void entryRuleInternalOutputEvent() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:285:1: ( ruleInternalOutputEvent EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:286:1: ruleInternalOutputEvent EOF
            {
             before(grammarAccess.getInternalOutputEventRule()); 
            pushFollow(FOLLOW_ruleInternalOutputEvent_in_entryRuleInternalOutputEvent541);
            ruleInternalOutputEvent();

            state._fsp--;

             after(grammarAccess.getInternalOutputEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalOutputEvent548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInternalOutputEvent"


    // $ANTLR start "ruleInternalOutputEvent"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:293:1: ruleInternalOutputEvent : ( ( rule__InternalOutputEvent__Group__0 ) ) ;
    public final void ruleInternalOutputEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:297:2: ( ( ( rule__InternalOutputEvent__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:298:1: ( ( rule__InternalOutputEvent__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:298:1: ( ( rule__InternalOutputEvent__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:299:1: ( rule__InternalOutputEvent__Group__0 )
            {
             before(grammarAccess.getInternalOutputEventAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:300:1: ( rule__InternalOutputEvent__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:300:2: rule__InternalOutputEvent__Group__0
            {
            pushFollow(FOLLOW_rule__InternalOutputEvent__Group__0_in_ruleInternalOutputEvent574);
            rule__InternalOutputEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalOutputEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternalOutputEvent"


    // $ANTLR start "entryRuleInternalInputEvent"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:312:1: entryRuleInternalInputEvent : ruleInternalInputEvent EOF ;
    public final void entryRuleInternalInputEvent() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:313:1: ( ruleInternalInputEvent EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:314:1: ruleInternalInputEvent EOF
            {
             before(grammarAccess.getInternalInputEventRule()); 
            pushFollow(FOLLOW_ruleInternalInputEvent_in_entryRuleInternalInputEvent601);
            ruleInternalInputEvent();

            state._fsp--;

             after(grammarAccess.getInternalInputEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalInputEvent608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInternalInputEvent"


    // $ANTLR start "ruleInternalInputEvent"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:321:1: ruleInternalInputEvent : ( ( rule__InternalInputEvent__Group__0 ) ) ;
    public final void ruleInternalInputEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:325:2: ( ( ( rule__InternalInputEvent__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:326:1: ( ( rule__InternalInputEvent__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:326:1: ( ( rule__InternalInputEvent__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:327:1: ( rule__InternalInputEvent__Group__0 )
            {
             before(grammarAccess.getInternalInputEventAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:328:1: ( rule__InternalInputEvent__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:328:2: rule__InternalInputEvent__Group__0
            {
            pushFollow(FOLLOW_rule__InternalInputEvent__Group__0_in_ruleInternalInputEvent634);
            rule__InternalInputEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalInputEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternalInputEvent"


    // $ANTLR start "entryRuleExternalOutputEvent"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:340:1: entryRuleExternalOutputEvent : ruleExternalOutputEvent EOF ;
    public final void entryRuleExternalOutputEvent() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:341:1: ( ruleExternalOutputEvent EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:342:1: ruleExternalOutputEvent EOF
            {
             before(grammarAccess.getExternalOutputEventRule()); 
            pushFollow(FOLLOW_ruleExternalOutputEvent_in_entryRuleExternalOutputEvent661);
            ruleExternalOutputEvent();

            state._fsp--;

             after(grammarAccess.getExternalOutputEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalOutputEvent668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalOutputEvent"


    // $ANTLR start "ruleExternalOutputEvent"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:349:1: ruleExternalOutputEvent : ( ( rule__ExternalOutputEvent__Group__0 ) ) ;
    public final void ruleExternalOutputEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:353:2: ( ( ( rule__ExternalOutputEvent__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:354:1: ( ( rule__ExternalOutputEvent__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:354:1: ( ( rule__ExternalOutputEvent__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:355:1: ( rule__ExternalOutputEvent__Group__0 )
            {
             before(grammarAccess.getExternalOutputEventAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:356:1: ( rule__ExternalOutputEvent__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:356:2: rule__ExternalOutputEvent__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalOutputEvent__Group__0_in_ruleExternalOutputEvent694);
            rule__ExternalOutputEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalOutputEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalOutputEvent"


    // $ANTLR start "entryRuleExternalInputEvent"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:368:1: entryRuleExternalInputEvent : ruleExternalInputEvent EOF ;
    public final void entryRuleExternalInputEvent() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:369:1: ( ruleExternalInputEvent EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:370:1: ruleExternalInputEvent EOF
            {
             before(grammarAccess.getExternalInputEventRule()); 
            pushFollow(FOLLOW_ruleExternalInputEvent_in_entryRuleExternalInputEvent721);
            ruleExternalInputEvent();

            state._fsp--;

             after(grammarAccess.getExternalInputEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalInputEvent728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalInputEvent"


    // $ANTLR start "ruleExternalInputEvent"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:377:1: ruleExternalInputEvent : ( ( rule__ExternalInputEvent__Group__0 ) ) ;
    public final void ruleExternalInputEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:381:2: ( ( ( rule__ExternalInputEvent__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:382:1: ( ( rule__ExternalInputEvent__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:382:1: ( ( rule__ExternalInputEvent__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:383:1: ( rule__ExternalInputEvent__Group__0 )
            {
             before(grammarAccess.getExternalInputEventAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:384:1: ( rule__ExternalInputEvent__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:384:2: rule__ExternalInputEvent__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalInputEvent__Group__0_in_ruleExternalInputEvent754);
            rule__ExternalInputEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalInputEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalInputEvent"


    // $ANTLR start "entryRuleComponentInstantiationNode"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:396:1: entryRuleComponentInstantiationNode : ruleComponentInstantiationNode EOF ;
    public final void entryRuleComponentInstantiationNode() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:397:1: ( ruleComponentInstantiationNode EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:398:1: ruleComponentInstantiationNode EOF
            {
             before(grammarAccess.getComponentInstantiationNodeRule()); 
            pushFollow(FOLLOW_ruleComponentInstantiationNode_in_entryRuleComponentInstantiationNode781);
            ruleComponentInstantiationNode();

            state._fsp--;

             after(grammarAccess.getComponentInstantiationNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentInstantiationNode788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentInstantiationNode"


    // $ANTLR start "ruleComponentInstantiationNode"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:405:1: ruleComponentInstantiationNode : ( ( rule__ComponentInstantiationNode__Alternatives ) ) ;
    public final void ruleComponentInstantiationNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:409:2: ( ( ( rule__ComponentInstantiationNode__Alternatives ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:410:1: ( ( rule__ComponentInstantiationNode__Alternatives ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:410:1: ( ( rule__ComponentInstantiationNode__Alternatives ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:411:1: ( rule__ComponentInstantiationNode__Alternatives )
            {
             before(grammarAccess.getComponentInstantiationNodeAccess().getAlternatives()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:412:1: ( rule__ComponentInstantiationNode__Alternatives )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:412:2: rule__ComponentInstantiationNode__Alternatives
            {
            pushFollow(FOLLOW_rule__ComponentInstantiationNode__Alternatives_in_ruleComponentInstantiationNode814);
            rule__ComponentInstantiationNode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstantiationNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentInstantiationNode"


    // $ANTLR start "entryRuleForAll"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:424:1: entryRuleForAll : ruleForAll EOF ;
    public final void entryRuleForAll() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:425:1: ( ruleForAll EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:426:1: ruleForAll EOF
            {
             before(grammarAccess.getForAllRule()); 
            pushFollow(FOLLOW_ruleForAll_in_entryRuleForAll841);
            ruleForAll();

            state._fsp--;

             after(grammarAccess.getForAllRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForAll848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForAll"


    // $ANTLR start "ruleForAll"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:433:1: ruleForAll : ( ( rule__ForAll__Group__0 ) ) ;
    public final void ruleForAll() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:437:2: ( ( ( rule__ForAll__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:438:1: ( ( rule__ForAll__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:438:1: ( ( rule__ForAll__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:439:1: ( rule__ForAll__Group__0 )
            {
             before(grammarAccess.getForAllAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:440:1: ( rule__ForAll__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:440:2: rule__ForAll__Group__0
            {
            pushFollow(FOLLOW_rule__ForAll__Group__0_in_ruleForAll874);
            rule__ForAll__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForAllAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForAll"


    // $ANTLR start "entryRuleForSome"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:452:1: entryRuleForSome : ruleForSome EOF ;
    public final void entryRuleForSome() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:453:1: ( ruleForSome EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:454:1: ruleForSome EOF
            {
             before(grammarAccess.getForSomeRule()); 
            pushFollow(FOLLOW_ruleForSome_in_entryRuleForSome901);
            ruleForSome();

            state._fsp--;

             after(grammarAccess.getForSomeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForSome908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForSome"


    // $ANTLR start "ruleForSome"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:461:1: ruleForSome : ( ( rule__ForSome__Group__0 ) ) ;
    public final void ruleForSome() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:465:2: ( ( ( rule__ForSome__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:466:1: ( ( rule__ForSome__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:466:1: ( ( rule__ForSome__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:467:1: ( rule__ForSome__Group__0 )
            {
             before(grammarAccess.getForSomeAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:468:1: ( rule__ForSome__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:468:2: rule__ForSome__Group__0
            {
            pushFollow(FOLLOW_rule__ForSome__Group__0_in_ruleForSome934);
            rule__ForSome__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForSomeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForSome"


    // $ANTLR start "entryRuleAtLeastOne"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:480:1: entryRuleAtLeastOne : ruleAtLeastOne EOF ;
    public final void entryRuleAtLeastOne() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:481:1: ( ruleAtLeastOne EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:482:1: ruleAtLeastOne EOF
            {
             before(grammarAccess.getAtLeastOneRule()); 
            pushFollow(FOLLOW_ruleAtLeastOne_in_entryRuleAtLeastOne961);
            ruleAtLeastOne();

            state._fsp--;

             after(grammarAccess.getAtLeastOneRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtLeastOne968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtLeastOne"


    // $ANTLR start "ruleAtLeastOne"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:489:1: ruleAtLeastOne : ( ( rule__AtLeastOne__Group__0 ) ) ;
    public final void ruleAtLeastOne() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:493:2: ( ( ( rule__AtLeastOne__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:494:1: ( ( rule__AtLeastOne__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:494:1: ( ( rule__AtLeastOne__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:495:1: ( rule__AtLeastOne__Group__0 )
            {
             before(grammarAccess.getAtLeastOneAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:496:1: ( rule__AtLeastOne__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:496:2: rule__AtLeastOne__Group__0
            {
            pushFollow(FOLLOW_rule__AtLeastOne__Group__0_in_ruleAtLeastOne994);
            rule__AtLeastOne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtLeastOneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtLeastOne"


    // $ANTLR start "entryRuleForOneArbitrary"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:508:1: entryRuleForOneArbitrary : ruleForOneArbitrary EOF ;
    public final void entryRuleForOneArbitrary() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:509:1: ( ruleForOneArbitrary EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:510:1: ruleForOneArbitrary EOF
            {
             before(grammarAccess.getForOneArbitraryRule()); 
            pushFollow(FOLLOW_ruleForOneArbitrary_in_entryRuleForOneArbitrary1021);
            ruleForOneArbitrary();

            state._fsp--;

             after(grammarAccess.getForOneArbitraryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForOneArbitrary1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForOneArbitrary"


    // $ANTLR start "ruleForOneArbitrary"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:517:1: ruleForOneArbitrary : ( ( rule__ForOneArbitrary__Group__0 ) ) ;
    public final void ruleForOneArbitrary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:521:2: ( ( ( rule__ForOneArbitrary__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:522:1: ( ( rule__ForOneArbitrary__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:522:1: ( ( rule__ForOneArbitrary__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:523:1: ( rule__ForOneArbitrary__Group__0 )
            {
             before(grammarAccess.getForOneArbitraryAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:524:1: ( rule__ForOneArbitrary__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:524:2: rule__ForOneArbitrary__Group__0
            {
            pushFollow(FOLLOW_rule__ForOneArbitrary__Group__0_in_ruleForOneArbitrary1054);
            rule__ForOneArbitrary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForOneArbitraryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForOneArbitrary"


    // $ANTLR start "entryRuleComponentInstantiation"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:536:1: entryRuleComponentInstantiation : ruleComponentInstantiation EOF ;
    public final void entryRuleComponentInstantiation() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:537:1: ( ruleComponentInstantiation EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:538:1: ruleComponentInstantiation EOF
            {
             before(grammarAccess.getComponentInstantiationRule()); 
            pushFollow(FOLLOW_ruleComponentInstantiation_in_entryRuleComponentInstantiation1081);
            ruleComponentInstantiation();

            state._fsp--;

             after(grammarAccess.getComponentInstantiationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentInstantiation1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentInstantiation"


    // $ANTLR start "ruleComponentInstantiation"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:545:1: ruleComponentInstantiation : ( ( rule__ComponentInstantiation__Group__0 ) ) ;
    public final void ruleComponentInstantiation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:549:2: ( ( ( rule__ComponentInstantiation__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:550:1: ( ( rule__ComponentInstantiation__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:550:1: ( ( rule__ComponentInstantiation__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:551:1: ( rule__ComponentInstantiation__Group__0 )
            {
             before(grammarAccess.getComponentInstantiationAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:552:1: ( rule__ComponentInstantiation__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:552:2: rule__ComponentInstantiation__Group__0
            {
            pushFollow(FOLLOW_rule__ComponentInstantiation__Group__0_in_ruleComponentInstantiation1114);
            rule__ComponentInstantiation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstantiationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentInstantiation"


    // $ANTLR start "entryRuleBinaryRelation"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:564:1: entryRuleBinaryRelation : ruleBinaryRelation EOF ;
    public final void entryRuleBinaryRelation() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:565:1: ( ruleBinaryRelation EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:566:1: ruleBinaryRelation EOF
            {
             before(grammarAccess.getBinaryRelationRule()); 
            pushFollow(FOLLOW_ruleBinaryRelation_in_entryRuleBinaryRelation1141);
            ruleBinaryRelation();

            state._fsp--;

             after(grammarAccess.getBinaryRelationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryRelation1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryRelation"


    // $ANTLR start "ruleBinaryRelation"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:573:1: ruleBinaryRelation : ( ( rule__BinaryRelation__Group__0 ) ) ;
    public final void ruleBinaryRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:577:2: ( ( ( rule__BinaryRelation__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:578:1: ( ( rule__BinaryRelation__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:578:1: ( ( rule__BinaryRelation__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:579:1: ( rule__BinaryRelation__Group__0 )
            {
             before(grammarAccess.getBinaryRelationAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:580:1: ( rule__BinaryRelation__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:580:2: rule__BinaryRelation__Group__0
            {
            pushFollow(FOLLOW_rule__BinaryRelation__Group__0_in_ruleBinaryRelation1174);
            rule__BinaryRelation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryRelation"


    // $ANTLR start "entryRuleBinaryExpression"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:592:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:593:1: ( ruleBinaryExpression EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:594:1: ruleBinaryExpression EOF
            {
             before(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_ruleBinaryExpression_in_entryRuleBinaryExpression1201);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryExpression1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:601:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:605:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:606:1: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:606:1: ( ( rule__BinaryExpression__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:607:1: ( rule__BinaryExpression__Group__0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:608:1: ( rule__BinaryExpression__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:608:2: rule__BinaryExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BinaryExpression__Group__0_in_ruleBinaryExpression1234);
            rule__BinaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleValue"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:620:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:621:1: ( ruleValue EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:622:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1261);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:629:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:633:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:634:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:634:1: ( ( rule__Value__Alternatives ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:635:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:636:1: ( rule__Value__Alternatives )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:636:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue1294);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleReference"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:648:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:649:1: ( ruleReference EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:650:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1321);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:657:1: ruleReference : ( ( rule__Reference__ObjectAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:661:2: ( ( ( rule__Reference__ObjectAssignment ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:662:1: ( ( rule__Reference__ObjectAssignment ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:662:1: ( ( rule__Reference__ObjectAssignment ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:663:1: ( rule__Reference__ObjectAssignment )
            {
             before(grammarAccess.getReferenceAccess().getObjectAssignment()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:664:1: ( rule__Reference__ObjectAssignment )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:664:2: rule__Reference__ObjectAssignment
            {
            pushFollow(FOLLOW_rule__Reference__ObjectAssignment_in_ruleReference1354);
            rule__Reference__ObjectAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getObjectAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleIdentifier"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:676:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:677:1: ( ruleIdentifier EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:678:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier1381);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:685:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:689:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:690:1: ( ( rule__Identifier__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:690:1: ( ( rule__Identifier__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:691:1: ( rule__Identifier__Group__0 )
            {
             before(grammarAccess.getIdentifierAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:692:1: ( rule__Identifier__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:692:2: rule__Identifier__Group__0
            {
            pushFollow(FOLLOW_rule__Identifier__Group__0_in_ruleIdentifier1414);
            rule__Identifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleNumber"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:704:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:705:1: ( ruleNumber EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:706:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1441);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1448); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:713:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:717:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:718:1: ( ( rule__Number__ValueAssignment ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:718:1: ( ( rule__Number__ValueAssignment ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:719:1: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:720:1: ( rule__Number__ValueAssignment )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:720:2: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1474);
            rule__Number__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleFunctionApplication"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:732:1: entryRuleFunctionApplication : ruleFunctionApplication EOF ;
    public final void entryRuleFunctionApplication() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:733:1: ( ruleFunctionApplication EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:734:1: ruleFunctionApplication EOF
            {
             before(grammarAccess.getFunctionApplicationRule()); 
            pushFollow(FOLLOW_ruleFunctionApplication_in_entryRuleFunctionApplication1501);
            ruleFunctionApplication();

            state._fsp--;

             after(grammarAccess.getFunctionApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionApplication1508); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionApplication"


    // $ANTLR start "ruleFunctionApplication"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:741:1: ruleFunctionApplication : ( ( rule__FunctionApplication__Group__0 ) ) ;
    public final void ruleFunctionApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:745:2: ( ( ( rule__FunctionApplication__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:746:1: ( ( rule__FunctionApplication__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:746:1: ( ( rule__FunctionApplication__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:747:1: ( rule__FunctionApplication__Group__0 )
            {
             before(grammarAccess.getFunctionApplicationAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:748:1: ( rule__FunctionApplication__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:748:2: rule__FunctionApplication__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionApplication__Group__0_in_ruleFunctionApplication1534);
            rule__FunctionApplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionApplication"


    // $ANTLR start "entryRuleBracketedExpression"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:760:1: entryRuleBracketedExpression : ruleBracketedExpression EOF ;
    public final void entryRuleBracketedExpression() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:761:1: ( ruleBracketedExpression EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:762:1: ruleBracketedExpression EOF
            {
             before(grammarAccess.getBracketedExpressionRule()); 
            pushFollow(FOLLOW_ruleBracketedExpression_in_entryRuleBracketedExpression1561);
            ruleBracketedExpression();

            state._fsp--;

             after(grammarAccess.getBracketedExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBracketedExpression1568); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBracketedExpression"


    // $ANTLR start "ruleBracketedExpression"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:769:1: ruleBracketedExpression : ( ( rule__BracketedExpression__Group__0 ) ) ;
    public final void ruleBracketedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:773:2: ( ( ( rule__BracketedExpression__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:774:1: ( ( rule__BracketedExpression__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:774:1: ( ( rule__BracketedExpression__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:775:1: ( rule__BracketedExpression__Group__0 )
            {
             before(grammarAccess.getBracketedExpressionAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:776:1: ( rule__BracketedExpression__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:776:2: rule__BracketedExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BracketedExpression__Group__0_in_ruleBracketedExpression1594);
            rule__BracketedExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBracketedExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBracketedExpression"


    // $ANTLR start "entryRuleCardinality"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:788:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:789:1: ( ruleCardinality EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:790:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality1621);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality1628); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:797:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:801:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:802:1: ( ( rule__Cardinality__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:802:1: ( ( rule__Cardinality__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:803:1: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:804:1: ( rule__Cardinality__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:804:2: rule__Cardinality__Group__0
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__0_in_ruleCardinality1654);
            rule__Cardinality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleEnumeratedSet"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:816:1: entryRuleEnumeratedSet : ruleEnumeratedSet EOF ;
    public final void entryRuleEnumeratedSet() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:817:1: ( ruleEnumeratedSet EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:818:1: ruleEnumeratedSet EOF
            {
             before(grammarAccess.getEnumeratedSetRule()); 
            pushFollow(FOLLOW_ruleEnumeratedSet_in_entryRuleEnumeratedSet1681);
            ruleEnumeratedSet();

            state._fsp--;

             after(grammarAccess.getEnumeratedSetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeratedSet1688); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumeratedSet"


    // $ANTLR start "ruleEnumeratedSet"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:825:1: ruleEnumeratedSet : ( ( rule__EnumeratedSet__Group__0 ) ) ;
    public final void ruleEnumeratedSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:829:2: ( ( ( rule__EnumeratedSet__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:830:1: ( ( rule__EnumeratedSet__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:830:1: ( ( rule__EnumeratedSet__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:831:1: ( rule__EnumeratedSet__Group__0 )
            {
             before(grammarAccess.getEnumeratedSetAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:832:1: ( rule__EnumeratedSet__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:832:2: rule__EnumeratedSet__Group__0
            {
            pushFollow(FOLLOW_rule__EnumeratedSet__Group__0_in_ruleEnumeratedSet1714);
            rule__EnumeratedSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumeratedSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeratedSet"


    // $ANTLR start "entryRuleFuzzyExp"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:844:1: entryRuleFuzzyExp : ruleFuzzyExp EOF ;
    public final void entryRuleFuzzyExp() throws RecognitionException {
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:845:1: ( ruleFuzzyExp EOF )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:846:1: ruleFuzzyExp EOF
            {
             before(grammarAccess.getFuzzyExpRule()); 
            pushFollow(FOLLOW_ruleFuzzyExp_in_entryRuleFuzzyExp1741);
            ruleFuzzyExp();

            state._fsp--;

             after(grammarAccess.getFuzzyExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuzzyExp1748); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFuzzyExp"


    // $ANTLR start "ruleFuzzyExp"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:853:1: ruleFuzzyExp : ( ( rule__FuzzyExp__Group__0 ) ) ;
    public final void ruleFuzzyExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:857:2: ( ( ( rule__FuzzyExp__Group__0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:858:1: ( ( rule__FuzzyExp__Group__0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:858:1: ( ( rule__FuzzyExp__Group__0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:859:1: ( rule__FuzzyExp__Group__0 )
            {
             before(grammarAccess.getFuzzyExpAccess().getGroup()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:860:1: ( rule__FuzzyExp__Group__0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:860:2: rule__FuzzyExp__Group__0
            {
            pushFollow(FOLLOW_rule__FuzzyExp__Group__0_in_ruleFuzzyExp1774);
            rule__FuzzyExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuzzyExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFuzzyExp"


    // $ANTLR start "rulebinarySymbol"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:873:1: rulebinarySymbol : ( ( rule__BinarySymbol__Alternatives ) ) ;
    public final void rulebinarySymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:877:1: ( ( ( rule__BinarySymbol__Alternatives ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:878:1: ( ( rule__BinarySymbol__Alternatives ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:878:1: ( ( rule__BinarySymbol__Alternatives ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:879:1: ( rule__BinarySymbol__Alternatives )
            {
             before(grammarAccess.getBinarySymbolAccess().getAlternatives()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:880:1: ( rule__BinarySymbol__Alternatives )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:880:2: rule__BinarySymbol__Alternatives
            {
            pushFollow(FOLLOW_rule__BinarySymbol__Alternatives_in_rulebinarySymbol1811);
            rule__BinarySymbol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinarySymbolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebinarySymbol"


    // $ANTLR start "ruleBinaryOperator"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:892:1: ruleBinaryOperator : ( ( rule__BinaryOperator__Alternatives ) ) ;
    public final void ruleBinaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:896:1: ( ( ( rule__BinaryOperator__Alternatives ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:897:1: ( ( rule__BinaryOperator__Alternatives ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:897:1: ( ( rule__BinaryOperator__Alternatives ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:898:1: ( rule__BinaryOperator__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:899:1: ( rule__BinaryOperator__Alternatives )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:899:2: rule__BinaryOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryOperator__Alternatives_in_ruleBinaryOperator1847);
            rule__BinaryOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "rule__Node__Alternatives"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:910:1: rule__Node__Alternatives : ( ( ruleBehaviorNode ) | ( ruleComponentInstantiationNode ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:914:1: ( ( ruleBehaviorNode ) | ( ruleComponentInstantiationNode ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=29 && LA1_0<=32)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:915:1: ( ruleBehaviorNode )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:915:1: ( ruleBehaviorNode )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:916:1: ruleBehaviorNode
                    {
                     before(grammarAccess.getNodeAccess().getBehaviorNodeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBehaviorNode_in_rule__Node__Alternatives1882);
                    ruleBehaviorNode();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getBehaviorNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:921:6: ( ruleComponentInstantiationNode )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:921:6: ( ruleComponentInstantiationNode )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:922:1: ruleComponentInstantiationNode
                    {
                     before(grammarAccess.getNodeAccess().getComponentInstantiationNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComponentInstantiationNode_in_rule__Node__Alternatives1899);
                    ruleComponentInstantiationNode();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getComponentInstantiationNodeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Alternatives"


    // $ANTLR start "rule__Behavior__Alternatives"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:932:1: rule__Behavior__Alternatives : ( ( ruleStateRealisation ) | ( ruleAttributeRealisation ) | ( ruleEvent ) | ( ruleSelection ) | ( ruleGuard ) | ( ruleInternalOutputEvent ) | ( ruleInternalInputEvent ) | ( ruleExternalOutputEvent ) | ( ruleExternalInputEvent ) );
    public final void rule__Behavior__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:936:1: ( ( ruleStateRealisation ) | ( ruleAttributeRealisation ) | ( ruleEvent ) | ( ruleSelection ) | ( ruleGuard ) | ( ruleInternalOutputEvent ) | ( ruleInternalInputEvent ) | ( ruleExternalOutputEvent ) | ( ruleExternalInputEvent ) )
            int alt2=9;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:937:1: ( ruleStateRealisation )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:937:1: ( ruleStateRealisation )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:938:1: ruleStateRealisation
                    {
                     before(grammarAccess.getBehaviorAccess().getStateRealisationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStateRealisation_in_rule__Behavior__Alternatives1931);
                    ruleStateRealisation();

                    state._fsp--;

                     after(grammarAccess.getBehaviorAccess().getStateRealisationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:943:6: ( ruleAttributeRealisation )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:943:6: ( ruleAttributeRealisation )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:944:1: ruleAttributeRealisation
                    {
                     before(grammarAccess.getBehaviorAccess().getAttributeRealisationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttributeRealisation_in_rule__Behavior__Alternatives1948);
                    ruleAttributeRealisation();

                    state._fsp--;

                     after(grammarAccess.getBehaviorAccess().getAttributeRealisationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:949:6: ( ruleEvent )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:949:6: ( ruleEvent )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:950:1: ruleEvent
                    {
                     before(grammarAccess.getBehaviorAccess().getEventParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEvent_in_rule__Behavior__Alternatives1965);
                    ruleEvent();

                    state._fsp--;

                     after(grammarAccess.getBehaviorAccess().getEventParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:955:6: ( ruleSelection )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:955:6: ( ruleSelection )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:956:1: ruleSelection
                    {
                     before(grammarAccess.getBehaviorAccess().getSelectionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSelection_in_rule__Behavior__Alternatives1982);
                    ruleSelection();

                    state._fsp--;

                     after(grammarAccess.getBehaviorAccess().getSelectionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:961:6: ( ruleGuard )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:961:6: ( ruleGuard )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:962:1: ruleGuard
                    {
                     before(grammarAccess.getBehaviorAccess().getGuardParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleGuard_in_rule__Behavior__Alternatives1999);
                    ruleGuard();

                    state._fsp--;

                     after(grammarAccess.getBehaviorAccess().getGuardParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:967:6: ( ruleInternalOutputEvent )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:967:6: ( ruleInternalOutputEvent )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:968:1: ruleInternalOutputEvent
                    {
                     before(grammarAccess.getBehaviorAccess().getInternalOutputEventParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleInternalOutputEvent_in_rule__Behavior__Alternatives2016);
                    ruleInternalOutputEvent();

                    state._fsp--;

                     after(grammarAccess.getBehaviorAccess().getInternalOutputEventParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:973:6: ( ruleInternalInputEvent )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:973:6: ( ruleInternalInputEvent )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:974:1: ruleInternalInputEvent
                    {
                     before(grammarAccess.getBehaviorAccess().getInternalInputEventParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleInternalInputEvent_in_rule__Behavior__Alternatives2033);
                    ruleInternalInputEvent();

                    state._fsp--;

                     after(grammarAccess.getBehaviorAccess().getInternalInputEventParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:979:6: ( ruleExternalOutputEvent )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:979:6: ( ruleExternalOutputEvent )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:980:1: ruleExternalOutputEvent
                    {
                     before(grammarAccess.getBehaviorAccess().getExternalOutputEventParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleExternalOutputEvent_in_rule__Behavior__Alternatives2050);
                    ruleExternalOutputEvent();

                    state._fsp--;

                     after(grammarAccess.getBehaviorAccess().getExternalOutputEventParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:985:6: ( ruleExternalInputEvent )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:985:6: ( ruleExternalInputEvent )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:986:1: ruleExternalInputEvent
                    {
                     before(grammarAccess.getBehaviorAccess().getExternalInputEventParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleExternalInputEvent_in_rule__Behavior__Alternatives2067);
                    ruleExternalInputEvent();

                    state._fsp--;

                     after(grammarAccess.getBehaviorAccess().getExternalInputEventParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Alternatives"


    // $ANTLR start "rule__ComponentInstantiationNode__Alternatives"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:996:1: rule__ComponentInstantiationNode__Alternatives : ( ( ruleForAll ) | ( ruleForSome ) | ( ruleAtLeastOne ) | ( ruleForOneArbitrary ) );
    public final void rule__ComponentInstantiationNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1000:1: ( ( ruleForAll ) | ( ruleForSome ) | ( ruleAtLeastOne ) | ( ruleForOneArbitrary ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case 31:
                {
                alt3=3;
                }
                break;
            case 32:
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
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1001:1: ( ruleForAll )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1001:1: ( ruleForAll )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1002:1: ruleForAll
                    {
                     before(grammarAccess.getComponentInstantiationNodeAccess().getForAllParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleForAll_in_rule__ComponentInstantiationNode__Alternatives2099);
                    ruleForAll();

                    state._fsp--;

                     after(grammarAccess.getComponentInstantiationNodeAccess().getForAllParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1007:6: ( ruleForSome )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1007:6: ( ruleForSome )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1008:1: ruleForSome
                    {
                     before(grammarAccess.getComponentInstantiationNodeAccess().getForSomeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleForSome_in_rule__ComponentInstantiationNode__Alternatives2116);
                    ruleForSome();

                    state._fsp--;

                     after(grammarAccess.getComponentInstantiationNodeAccess().getForSomeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1013:6: ( ruleAtLeastOne )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1013:6: ( ruleAtLeastOne )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1014:1: ruleAtLeastOne
                    {
                     before(grammarAccess.getComponentInstantiationNodeAccess().getAtLeastOneParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAtLeastOne_in_rule__ComponentInstantiationNode__Alternatives2133);
                    ruleAtLeastOne();

                    state._fsp--;

                     after(grammarAccess.getComponentInstantiationNodeAccess().getAtLeastOneParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1019:6: ( ruleForOneArbitrary )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1019:6: ( ruleForOneArbitrary )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1020:1: ruleForOneArbitrary
                    {
                     before(grammarAccess.getComponentInstantiationNodeAccess().getForOneArbitraryParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleForOneArbitrary_in_rule__ComponentInstantiationNode__Alternatives2150);
                    ruleForOneArbitrary();

                    state._fsp--;

                     after(grammarAccess.getComponentInstantiationNodeAccess().getForOneArbitraryParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstantiationNode__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1030:1: rule__Value__Alternatives : ( ( ruleReference ) | ( ruleNumber ) | ( ruleFunctionApplication ) | ( ruleBracketedExpression ) | ( ruleCardinality ) | ( ruleEnumeratedSet ) | ( ruleFuzzyExp ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1034:1: ( ( ruleReference ) | ( ruleNumber ) | ( ruleFunctionApplication ) | ( ruleBracketedExpression ) | ( ruleCardinality ) | ( ruleEnumeratedSet ) | ( ruleFuzzyExp ) )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1035:1: ( ruleReference )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1035:1: ( ruleReference )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1036:1: ruleReference
                    {
                     before(grammarAccess.getValueAccess().getReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__Value__Alternatives2182);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1041:6: ( ruleNumber )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1041:6: ( ruleNumber )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1042:1: ruleNumber
                    {
                     before(grammarAccess.getValueAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNumber_in_rule__Value__Alternatives2199);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNumberParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1047:6: ( ruleFunctionApplication )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1047:6: ( ruleFunctionApplication )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1048:1: ruleFunctionApplication
                    {
                     before(grammarAccess.getValueAccess().getFunctionApplicationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFunctionApplication_in_rule__Value__Alternatives2216);
                    ruleFunctionApplication();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getFunctionApplicationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1053:6: ( ruleBracketedExpression )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1053:6: ( ruleBracketedExpression )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1054:1: ruleBracketedExpression
                    {
                     before(grammarAccess.getValueAccess().getBracketedExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleBracketedExpression_in_rule__Value__Alternatives2233);
                    ruleBracketedExpression();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBracketedExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1059:6: ( ruleCardinality )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1059:6: ( ruleCardinality )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1060:1: ruleCardinality
                    {
                     before(grammarAccess.getValueAccess().getCardinalityParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCardinality_in_rule__Value__Alternatives2250);
                    ruleCardinality();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getCardinalityParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1065:6: ( ruleEnumeratedSet )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1065:6: ( ruleEnumeratedSet )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1066:1: ruleEnumeratedSet
                    {
                     before(grammarAccess.getValueAccess().getEnumeratedSetParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEnumeratedSet_in_rule__Value__Alternatives2267);
                    ruleEnumeratedSet();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getEnumeratedSetParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1071:6: ( ruleFuzzyExp )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1071:6: ( ruleFuzzyExp )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1072:1: ruleFuzzyExp
                    {
                     before(grammarAccess.getValueAccess().getFuzzyExpParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleFuzzyExp_in_rule__Value__Alternatives2284);
                    ruleFuzzyExp();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getFuzzyExpParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__BinarySymbol__Alternatives"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1082:1: rule__BinarySymbol__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '=' ) ) | ( ( '=<' ) ) | ( ( '>=' ) ) | ( ( ':' ) ) | ( ( '<:' ) ) );
    public final void rule__BinarySymbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1086:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '=' ) ) | ( ( '=<' ) ) | ( ( '>=' ) ) | ( ( ':' ) ) | ( ( '<:' ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            case 17:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1087:1: ( ( '<' ) )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1087:1: ( ( '<' ) )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1088:1: ( '<' )
                    {
                     before(grammarAccess.getBinarySymbolAccess().getLESS_THANEnumLiteralDeclaration_0()); 
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1089:1: ( '<' )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1089:3: '<'
                    {
                    match(input,11,FOLLOW_11_in_rule__BinarySymbol__Alternatives2317); 

                    }

                     after(grammarAccess.getBinarySymbolAccess().getLESS_THANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1094:6: ( ( '>' ) )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1094:6: ( ( '>' ) )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1095:1: ( '>' )
                    {
                     before(grammarAccess.getBinarySymbolAccess().getGREATER_THANEnumLiteralDeclaration_1()); 
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1096:1: ( '>' )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1096:3: '>'
                    {
                    match(input,12,FOLLOW_12_in_rule__BinarySymbol__Alternatives2338); 

                    }

                     after(grammarAccess.getBinarySymbolAccess().getGREATER_THANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1101:6: ( ( '=' ) )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1101:6: ( ( '=' ) )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1102:1: ( '=' )
                    {
                     before(grammarAccess.getBinarySymbolAccess().getEQUAL_TOEnumLiteralDeclaration_2()); 
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1103:1: ( '=' )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1103:3: '='
                    {
                    match(input,13,FOLLOW_13_in_rule__BinarySymbol__Alternatives2359); 

                    }

                     after(grammarAccess.getBinarySymbolAccess().getEQUAL_TOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1108:6: ( ( '=<' ) )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1108:6: ( ( '=<' ) )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1109:1: ( '=<' )
                    {
                     before(grammarAccess.getBinarySymbolAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_3()); 
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1110:1: ( '=<' )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1110:3: '=<'
                    {
                    match(input,14,FOLLOW_14_in_rule__BinarySymbol__Alternatives2380); 

                    }

                     after(grammarAccess.getBinarySymbolAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1115:6: ( ( '>=' ) )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1115:6: ( ( '>=' ) )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1116:1: ( '>=' )
                    {
                     before(grammarAccess.getBinarySymbolAccess().getGREATER_THAN_OR_EQUALEnumLiteralDeclaration_4()); 
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1117:1: ( '>=' )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1117:3: '>='
                    {
                    match(input,15,FOLLOW_15_in_rule__BinarySymbol__Alternatives2401); 

                    }

                     after(grammarAccess.getBinarySymbolAccess().getGREATER_THAN_OR_EQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1122:6: ( ( ':' ) )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1122:6: ( ( ':' ) )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1123:1: ( ':' )
                    {
                     before(grammarAccess.getBinarySymbolAccess().getCOLONEnumLiteralDeclaration_5()); 
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1124:1: ( ':' )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1124:3: ':'
                    {
                    match(input,16,FOLLOW_16_in_rule__BinarySymbol__Alternatives2422); 

                    }

                     after(grammarAccess.getBinarySymbolAccess().getCOLONEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1129:6: ( ( '<:' ) )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1129:6: ( ( '<:' ) )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1130:1: ( '<:' )
                    {
                     before(grammarAccess.getBinarySymbolAccess().getSUBSET_EXPEnumLiteralDeclaration_6()); 
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1131:1: ( '<:' )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1131:3: '<:'
                    {
                    match(input,17,FOLLOW_17_in_rule__BinarySymbol__Alternatives2443); 

                    }

                     after(grammarAccess.getBinarySymbolAccess().getSUBSET_EXPEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinarySymbol__Alternatives"


    // $ANTLR start "rule__BinaryOperator__Alternatives"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1141:1: rule__BinaryOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '><' ) ) );
    public final void rule__BinaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1145:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '><' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1146:1: ( ( '+' ) )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1146:1: ( ( '+' ) )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1147:1: ( '+' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1148:1: ( '+' )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1148:3: '+'
                    {
                    match(input,18,FOLLOW_18_in_rule__BinaryOperator__Alternatives2479); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1153:6: ( ( '-' ) )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1153:6: ( ( '-' ) )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1154:1: ( '-' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1155:1: ( '-' )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1155:3: '-'
                    {
                    match(input,19,FOLLOW_19_in_rule__BinaryOperator__Alternatives2500); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1160:6: ( ( '><' ) )
                    {
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1160:6: ( ( '><' ) )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1161:1: ( '><' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getINTERSECTEnumLiteralDeclaration_2()); 
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1162:1: ( '><' )
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1162:3: '><'
                    {
                    match(input,20,FOLLOW_20_in_rule__BinaryOperator__Alternatives2521); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getINTERSECTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperator__Alternatives"


    // $ANTLR start "rule__BehaviorNode__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1174:1: rule__BehaviorNode__Group__0 : rule__BehaviorNode__Group__0__Impl rule__BehaviorNode__Group__1 ;
    public final void rule__BehaviorNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1178:1: ( rule__BehaviorNode__Group__0__Impl rule__BehaviorNode__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1179:2: rule__BehaviorNode__Group__0__Impl rule__BehaviorNode__Group__1
            {
            pushFollow(FOLLOW_rule__BehaviorNode__Group__0__Impl_in_rule__BehaviorNode__Group__02554);
            rule__BehaviorNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BehaviorNode__Group__1_in_rule__BehaviorNode__Group__02557);
            rule__BehaviorNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorNode__Group__0"


    // $ANTLR start "rule__BehaviorNode__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1186:1: rule__BehaviorNode__Group__0__Impl : ( ( rule__BehaviorNode__ComponentAssignment_0 ) ) ;
    public final void rule__BehaviorNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1190:1: ( ( ( rule__BehaviorNode__ComponentAssignment_0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1191:1: ( ( rule__BehaviorNode__ComponentAssignment_0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1191:1: ( ( rule__BehaviorNode__ComponentAssignment_0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1192:1: ( rule__BehaviorNode__ComponentAssignment_0 )
            {
             before(grammarAccess.getBehaviorNodeAccess().getComponentAssignment_0()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1193:1: ( rule__BehaviorNode__ComponentAssignment_0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1193:2: rule__BehaviorNode__ComponentAssignment_0
            {
            pushFollow(FOLLOW_rule__BehaviorNode__ComponentAssignment_0_in_rule__BehaviorNode__Group__0__Impl2584);
            rule__BehaviorNode__ComponentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorNodeAccess().getComponentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorNode__Group__0__Impl"


    // $ANTLR start "rule__BehaviorNode__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1203:1: rule__BehaviorNode__Group__1 : rule__BehaviorNode__Group__1__Impl ;
    public final void rule__BehaviorNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1207:1: ( rule__BehaviorNode__Group__1__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1208:2: rule__BehaviorNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BehaviorNode__Group__1__Impl_in_rule__BehaviorNode__Group__12614);
            rule__BehaviorNode__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorNode__Group__1"


    // $ANTLR start "rule__BehaviorNode__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1214:1: rule__BehaviorNode__Group__1__Impl : ( ( rule__BehaviorNode__BehaviorAssignment_1 ) ) ;
    public final void rule__BehaviorNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1218:1: ( ( ( rule__BehaviorNode__BehaviorAssignment_1 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1219:1: ( ( rule__BehaviorNode__BehaviorAssignment_1 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1219:1: ( ( rule__BehaviorNode__BehaviorAssignment_1 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1220:1: ( rule__BehaviorNode__BehaviorAssignment_1 )
            {
             before(grammarAccess.getBehaviorNodeAccess().getBehaviorAssignment_1()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1221:1: ( rule__BehaviorNode__BehaviorAssignment_1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1221:2: rule__BehaviorNode__BehaviorAssignment_1
            {
            pushFollow(FOLLOW_rule__BehaviorNode__BehaviorAssignment_1_in_rule__BehaviorNode__Group__1__Impl2641);
            rule__BehaviorNode__BehaviorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorNodeAccess().getBehaviorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorNode__Group__1__Impl"


    // $ANTLR start "rule__StateRealisation__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1235:1: rule__StateRealisation__Group__0 : rule__StateRealisation__Group__0__Impl rule__StateRealisation__Group__1 ;
    public final void rule__StateRealisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1239:1: ( rule__StateRealisation__Group__0__Impl rule__StateRealisation__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1240:2: rule__StateRealisation__Group__0__Impl rule__StateRealisation__Group__1
            {
            pushFollow(FOLLOW_rule__StateRealisation__Group__0__Impl_in_rule__StateRealisation__Group__02675);
            rule__StateRealisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateRealisation__Group__1_in_rule__StateRealisation__Group__02678);
            rule__StateRealisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateRealisation__Group__0"


    // $ANTLR start "rule__StateRealisation__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1247:1: rule__StateRealisation__Group__0__Impl : ( '[' ) ;
    public final void rule__StateRealisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1251:1: ( ( '[' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1252:1: ( '[' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1252:1: ( '[' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1253:1: '['
            {
             before(grammarAccess.getStateRealisationAccess().getLeftSquareBracketKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__StateRealisation__Group__0__Impl2706); 
             after(grammarAccess.getStateRealisationAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateRealisation__Group__0__Impl"


    // $ANTLR start "rule__StateRealisation__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1266:1: rule__StateRealisation__Group__1 : rule__StateRealisation__Group__1__Impl rule__StateRealisation__Group__2 ;
    public final void rule__StateRealisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1270:1: ( rule__StateRealisation__Group__1__Impl rule__StateRealisation__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1271:2: rule__StateRealisation__Group__1__Impl rule__StateRealisation__Group__2
            {
            pushFollow(FOLLOW_rule__StateRealisation__Group__1__Impl_in_rule__StateRealisation__Group__12737);
            rule__StateRealisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateRealisation__Group__2_in_rule__StateRealisation__Group__12740);
            rule__StateRealisation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateRealisation__Group__1"


    // $ANTLR start "rule__StateRealisation__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1278:1: rule__StateRealisation__Group__1__Impl : ( ( rule__StateRealisation__StateAssignment_1 ) ) ;
    public final void rule__StateRealisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1282:1: ( ( ( rule__StateRealisation__StateAssignment_1 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1283:1: ( ( rule__StateRealisation__StateAssignment_1 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1283:1: ( ( rule__StateRealisation__StateAssignment_1 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1284:1: ( rule__StateRealisation__StateAssignment_1 )
            {
             before(grammarAccess.getStateRealisationAccess().getStateAssignment_1()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1285:1: ( rule__StateRealisation__StateAssignment_1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1285:2: rule__StateRealisation__StateAssignment_1
            {
            pushFollow(FOLLOW_rule__StateRealisation__StateAssignment_1_in_rule__StateRealisation__Group__1__Impl2767);
            rule__StateRealisation__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateRealisationAccess().getStateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateRealisation__Group__1__Impl"


    // $ANTLR start "rule__StateRealisation__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1295:1: rule__StateRealisation__Group__2 : rule__StateRealisation__Group__2__Impl ;
    public final void rule__StateRealisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1299:1: ( rule__StateRealisation__Group__2__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1300:2: rule__StateRealisation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StateRealisation__Group__2__Impl_in_rule__StateRealisation__Group__22797);
            rule__StateRealisation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateRealisation__Group__2"


    // $ANTLR start "rule__StateRealisation__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1306:1: rule__StateRealisation__Group__2__Impl : ( ']' ) ;
    public final void rule__StateRealisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1310:1: ( ( ']' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1311:1: ( ']' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1311:1: ( ']' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1312:1: ']'
            {
             before(grammarAccess.getStateRealisationAccess().getRightSquareBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__StateRealisation__Group__2__Impl2825); 
             after(grammarAccess.getStateRealisationAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateRealisation__Group__2__Impl"


    // $ANTLR start "rule__AttributeRealisation__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1331:1: rule__AttributeRealisation__Group__0 : rule__AttributeRealisation__Group__0__Impl rule__AttributeRealisation__Group__1 ;
    public final void rule__AttributeRealisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1335:1: ( rule__AttributeRealisation__Group__0__Impl rule__AttributeRealisation__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1336:2: rule__AttributeRealisation__Group__0__Impl rule__AttributeRealisation__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeRealisation__Group__0__Impl_in_rule__AttributeRealisation__Group__02862);
            rule__AttributeRealisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeRealisation__Group__1_in_rule__AttributeRealisation__Group__02865);
            rule__AttributeRealisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRealisation__Group__0"


    // $ANTLR start "rule__AttributeRealisation__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1343:1: rule__AttributeRealisation__Group__0__Impl : ( '[' ) ;
    public final void rule__AttributeRealisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1347:1: ( ( '[' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1348:1: ( '[' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1348:1: ( '[' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1349:1: '['
            {
             before(grammarAccess.getAttributeRealisationAccess().getLeftSquareBracketKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__AttributeRealisation__Group__0__Impl2893); 
             after(grammarAccess.getAttributeRealisationAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRealisation__Group__0__Impl"


    // $ANTLR start "rule__AttributeRealisation__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1362:1: rule__AttributeRealisation__Group__1 : rule__AttributeRealisation__Group__1__Impl rule__AttributeRealisation__Group__2 ;
    public final void rule__AttributeRealisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1366:1: ( rule__AttributeRealisation__Group__1__Impl rule__AttributeRealisation__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1367:2: rule__AttributeRealisation__Group__1__Impl rule__AttributeRealisation__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeRealisation__Group__1__Impl_in_rule__AttributeRealisation__Group__12924);
            rule__AttributeRealisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeRealisation__Group__2_in_rule__AttributeRealisation__Group__12927);
            rule__AttributeRealisation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRealisation__Group__1"


    // $ANTLR start "rule__AttributeRealisation__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1374:1: rule__AttributeRealisation__Group__1__Impl : ( ( rule__AttributeRealisation__AttributeAssignment_1 ) ) ;
    public final void rule__AttributeRealisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1378:1: ( ( ( rule__AttributeRealisation__AttributeAssignment_1 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1379:1: ( ( rule__AttributeRealisation__AttributeAssignment_1 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1379:1: ( ( rule__AttributeRealisation__AttributeAssignment_1 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1380:1: ( rule__AttributeRealisation__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributeRealisationAccess().getAttributeAssignment_1()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1381:1: ( rule__AttributeRealisation__AttributeAssignment_1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1381:2: rule__AttributeRealisation__AttributeAssignment_1
            {
            pushFollow(FOLLOW_rule__AttributeRealisation__AttributeAssignment_1_in_rule__AttributeRealisation__Group__1__Impl2954);
            rule__AttributeRealisation__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeRealisationAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRealisation__Group__1__Impl"


    // $ANTLR start "rule__AttributeRealisation__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1391:1: rule__AttributeRealisation__Group__2 : rule__AttributeRealisation__Group__2__Impl rule__AttributeRealisation__Group__3 ;
    public final void rule__AttributeRealisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1395:1: ( rule__AttributeRealisation__Group__2__Impl rule__AttributeRealisation__Group__3 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1396:2: rule__AttributeRealisation__Group__2__Impl rule__AttributeRealisation__Group__3
            {
            pushFollow(FOLLOW_rule__AttributeRealisation__Group__2__Impl_in_rule__AttributeRealisation__Group__22984);
            rule__AttributeRealisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeRealisation__Group__3_in_rule__AttributeRealisation__Group__22987);
            rule__AttributeRealisation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRealisation__Group__2"


    // $ANTLR start "rule__AttributeRealisation__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1403:1: rule__AttributeRealisation__Group__2__Impl : ( ':=' ) ;
    public final void rule__AttributeRealisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1407:1: ( ( ':=' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1408:1: ( ':=' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1408:1: ( ':=' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1409:1: ':='
            {
             before(grammarAccess.getAttributeRealisationAccess().getColonEqualsSignKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__AttributeRealisation__Group__2__Impl3015); 
             after(grammarAccess.getAttributeRealisationAccess().getColonEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRealisation__Group__2__Impl"


    // $ANTLR start "rule__AttributeRealisation__Group__3"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1422:1: rule__AttributeRealisation__Group__3 : rule__AttributeRealisation__Group__3__Impl rule__AttributeRealisation__Group__4 ;
    public final void rule__AttributeRealisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1426:1: ( rule__AttributeRealisation__Group__3__Impl rule__AttributeRealisation__Group__4 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1427:2: rule__AttributeRealisation__Group__3__Impl rule__AttributeRealisation__Group__4
            {
            pushFollow(FOLLOW_rule__AttributeRealisation__Group__3__Impl_in_rule__AttributeRealisation__Group__33046);
            rule__AttributeRealisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeRealisation__Group__4_in_rule__AttributeRealisation__Group__33049);
            rule__AttributeRealisation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRealisation__Group__3"


    // $ANTLR start "rule__AttributeRealisation__Group__3__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1434:1: rule__AttributeRealisation__Group__3__Impl : ( ( rule__AttributeRealisation__ValueAssignment_3 ) ) ;
    public final void rule__AttributeRealisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1438:1: ( ( ( rule__AttributeRealisation__ValueAssignment_3 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1439:1: ( ( rule__AttributeRealisation__ValueAssignment_3 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1439:1: ( ( rule__AttributeRealisation__ValueAssignment_3 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1440:1: ( rule__AttributeRealisation__ValueAssignment_3 )
            {
             before(grammarAccess.getAttributeRealisationAccess().getValueAssignment_3()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1441:1: ( rule__AttributeRealisation__ValueAssignment_3 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1441:2: rule__AttributeRealisation__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__AttributeRealisation__ValueAssignment_3_in_rule__AttributeRealisation__Group__3__Impl3076);
            rule__AttributeRealisation__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeRealisationAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRealisation__Group__3__Impl"


    // $ANTLR start "rule__AttributeRealisation__Group__4"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1451:1: rule__AttributeRealisation__Group__4 : rule__AttributeRealisation__Group__4__Impl ;
    public final void rule__AttributeRealisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1455:1: ( rule__AttributeRealisation__Group__4__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1456:2: rule__AttributeRealisation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttributeRealisation__Group__4__Impl_in_rule__AttributeRealisation__Group__43106);
            rule__AttributeRealisation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRealisation__Group__4"


    // $ANTLR start "rule__AttributeRealisation__Group__4__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1462:1: rule__AttributeRealisation__Group__4__Impl : ( ']' ) ;
    public final void rule__AttributeRealisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1466:1: ( ( ']' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1467:1: ( ']' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1467:1: ( ']' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1468:1: ']'
            {
             before(grammarAccess.getAttributeRealisationAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__AttributeRealisation__Group__4__Impl3134); 
             after(grammarAccess.getAttributeRealisationAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRealisation__Group__4__Impl"


    // $ANTLR start "rule__Selection__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1491:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1495:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1496:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__03175);
            rule__Selection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__03178);
            rule__Selection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__0"


    // $ANTLR start "rule__Selection__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1503:1: rule__Selection__Group__0__Impl : ( '?' ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1507:1: ( ( '?' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1508:1: ( '?' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1508:1: ( '?' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1509:1: '?'
            {
             before(grammarAccess.getSelectionAccess().getQuestionMarkKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Selection__Group__0__Impl3206); 
             after(grammarAccess.getSelectionAccess().getQuestionMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__0__Impl"


    // $ANTLR start "rule__Selection__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1522:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1526:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1527:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__13237);
            rule__Selection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__13240);
            rule__Selection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__1"


    // $ANTLR start "rule__Selection__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1534:1: rule__Selection__Group__1__Impl : ( ruleFunctionApplication ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1538:1: ( ( ruleFunctionApplication ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1539:1: ( ruleFunctionApplication )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1539:1: ( ruleFunctionApplication )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1540:1: ruleFunctionApplication
            {
             before(grammarAccess.getSelectionAccess().getFunctionApplicationParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleFunctionApplication_in_rule__Selection__Group__1__Impl3267);
            ruleFunctionApplication();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getFunctionApplicationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__1__Impl"


    // $ANTLR start "rule__Selection__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1551:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1555:1: ( rule__Selection__Group__2__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1556:2: rule__Selection__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__23296);
            rule__Selection__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__2"


    // $ANTLR start "rule__Selection__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1562:1: rule__Selection__Group__2__Impl : ( '?' ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1566:1: ( ( '?' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1567:1: ( '?' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1567:1: ( '?' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1568:1: '?'
            {
             before(grammarAccess.getSelectionAccess().getQuestionMarkKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Selection__Group__2__Impl3324); 
             after(grammarAccess.getSelectionAccess().getQuestionMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1587:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1591:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1592:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03361);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03364);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1599:1: rule__Event__Group__0__Impl : ( '??' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1603:1: ( ( '??' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1604:1: ( '??' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1604:1: ( '??' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1605:1: '??'
            {
             before(grammarAccess.getEventAccess().getQuestionMarkQuestionMarkKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Event__Group__0__Impl3392); 
             after(grammarAccess.getEventAccess().getQuestionMarkQuestionMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1618:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1622:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1623:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13423);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__2_in_rule__Event__Group__13426);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1630:1: rule__Event__Group__1__Impl : ( ruleFunctionApplication ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1634:1: ( ( ruleFunctionApplication ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1635:1: ( ruleFunctionApplication )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1635:1: ( ruleFunctionApplication )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1636:1: ruleFunctionApplication
            {
             before(grammarAccess.getEventAccess().getFunctionApplicationParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleFunctionApplication_in_rule__Event__Group__1__Impl3453);
            ruleFunctionApplication();

            state._fsp--;

             after(grammarAccess.getEventAccess().getFunctionApplicationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1647:1: rule__Event__Group__2 : rule__Event__Group__2__Impl ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1651:1: ( rule__Event__Group__2__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1652:2: rule__Event__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__23482);
            rule__Event__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1658:1: rule__Event__Group__2__Impl : ( '??' ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1662:1: ( ( '??' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1663:1: ( '??' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1663:1: ( '??' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1664:1: '??'
            {
             before(grammarAccess.getEventAccess().getQuestionMarkQuestionMarkKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Event__Group__2__Impl3510); 
             after(grammarAccess.getEventAccess().getQuestionMarkQuestionMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Guard__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1683:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1687:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1688:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__03547);
            rule__Guard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__03550);
            rule__Guard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__0"


    // $ANTLR start "rule__Guard__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1695:1: rule__Guard__Group__0__Impl : ( '???' ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1699:1: ( ( '???' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1700:1: ( '???' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1700:1: ( '???' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1701:1: '???'
            {
             before(grammarAccess.getGuardAccess().getQuestionMarkQuestionMarkQuestionMarkKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Guard__Group__0__Impl3578); 
             after(grammarAccess.getGuardAccess().getQuestionMarkQuestionMarkQuestionMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__0__Impl"


    // $ANTLR start "rule__Guard__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1714:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl rule__Guard__Group__2 ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1718:1: ( rule__Guard__Group__1__Impl rule__Guard__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1719:2: rule__Guard__Group__1__Impl rule__Guard__Group__2
            {
            pushFollow(FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__13609);
            rule__Guard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__13612);
            rule__Guard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__1"


    // $ANTLR start "rule__Guard__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1726:1: rule__Guard__Group__1__Impl : ( ( rule__Guard__StateAssignment_1 ) ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1730:1: ( ( ( rule__Guard__StateAssignment_1 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1731:1: ( ( rule__Guard__StateAssignment_1 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1731:1: ( ( rule__Guard__StateAssignment_1 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1732:1: ( rule__Guard__StateAssignment_1 )
            {
             before(grammarAccess.getGuardAccess().getStateAssignment_1()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1733:1: ( rule__Guard__StateAssignment_1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1733:2: rule__Guard__StateAssignment_1
            {
            pushFollow(FOLLOW_rule__Guard__StateAssignment_1_in_rule__Guard__Group__1__Impl3639);
            rule__Guard__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getStateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__1__Impl"


    // $ANTLR start "rule__Guard__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1743:1: rule__Guard__Group__2 : rule__Guard__Group__2__Impl ;
    public final void rule__Guard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1747:1: ( rule__Guard__Group__2__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1748:2: rule__Guard__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__23669);
            rule__Guard__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__2"


    // $ANTLR start "rule__Guard__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1754:1: rule__Guard__Group__2__Impl : ( '???' ) ;
    public final void rule__Guard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1758:1: ( ( '???' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1759:1: ( '???' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1759:1: ( '???' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1760:1: '???'
            {
             before(grammarAccess.getGuardAccess().getQuestionMarkQuestionMarkQuestionMarkKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Guard__Group__2__Impl3697); 
             after(grammarAccess.getGuardAccess().getQuestionMarkQuestionMarkQuestionMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__2__Impl"


    // $ANTLR start "rule__InternalOutputEvent__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1779:1: rule__InternalOutputEvent__Group__0 : rule__InternalOutputEvent__Group__0__Impl rule__InternalOutputEvent__Group__1 ;
    public final void rule__InternalOutputEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1783:1: ( rule__InternalOutputEvent__Group__0__Impl rule__InternalOutputEvent__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1784:2: rule__InternalOutputEvent__Group__0__Impl rule__InternalOutputEvent__Group__1
            {
            pushFollow(FOLLOW_rule__InternalOutputEvent__Group__0__Impl_in_rule__InternalOutputEvent__Group__03734);
            rule__InternalOutputEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalOutputEvent__Group__1_in_rule__InternalOutputEvent__Group__03737);
            rule__InternalOutputEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalOutputEvent__Group__0"


    // $ANTLR start "rule__InternalOutputEvent__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1791:1: rule__InternalOutputEvent__Group__0__Impl : ( '<' ) ;
    public final void rule__InternalOutputEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1795:1: ( ( '<' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1796:1: ( '<' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1796:1: ( '<' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1797:1: '<'
            {
             before(grammarAccess.getInternalOutputEventAccess().getLessThanSignKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__InternalOutputEvent__Group__0__Impl3765); 
             after(grammarAccess.getInternalOutputEventAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalOutputEvent__Group__0__Impl"


    // $ANTLR start "rule__InternalOutputEvent__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1810:1: rule__InternalOutputEvent__Group__1 : rule__InternalOutputEvent__Group__1__Impl rule__InternalOutputEvent__Group__2 ;
    public final void rule__InternalOutputEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1814:1: ( rule__InternalOutputEvent__Group__1__Impl rule__InternalOutputEvent__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1815:2: rule__InternalOutputEvent__Group__1__Impl rule__InternalOutputEvent__Group__2
            {
            pushFollow(FOLLOW_rule__InternalOutputEvent__Group__1__Impl_in_rule__InternalOutputEvent__Group__13796);
            rule__InternalOutputEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalOutputEvent__Group__2_in_rule__InternalOutputEvent__Group__13799);
            rule__InternalOutputEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalOutputEvent__Group__1"


    // $ANTLR start "rule__InternalOutputEvent__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1822:1: rule__InternalOutputEvent__Group__1__Impl : ( ruleFunctionApplication ) ;
    public final void rule__InternalOutputEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1826:1: ( ( ruleFunctionApplication ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1827:1: ( ruleFunctionApplication )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1827:1: ( ruleFunctionApplication )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1828:1: ruleFunctionApplication
            {
             before(grammarAccess.getInternalOutputEventAccess().getFunctionApplicationParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleFunctionApplication_in_rule__InternalOutputEvent__Group__1__Impl3826);
            ruleFunctionApplication();

            state._fsp--;

             after(grammarAccess.getInternalOutputEventAccess().getFunctionApplicationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalOutputEvent__Group__1__Impl"


    // $ANTLR start "rule__InternalOutputEvent__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1839:1: rule__InternalOutputEvent__Group__2 : rule__InternalOutputEvent__Group__2__Impl ;
    public final void rule__InternalOutputEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1843:1: ( rule__InternalOutputEvent__Group__2__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1844:2: rule__InternalOutputEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__InternalOutputEvent__Group__2__Impl_in_rule__InternalOutputEvent__Group__23855);
            rule__InternalOutputEvent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalOutputEvent__Group__2"


    // $ANTLR start "rule__InternalOutputEvent__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1850:1: rule__InternalOutputEvent__Group__2__Impl : ( '>' ) ;
    public final void rule__InternalOutputEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1854:1: ( ( '>' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1855:1: ( '>' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1855:1: ( '>' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1856:1: '>'
            {
             before(grammarAccess.getInternalOutputEventAccess().getGreaterThanSignKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__InternalOutputEvent__Group__2__Impl3883); 
             after(grammarAccess.getInternalOutputEventAccess().getGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalOutputEvent__Group__2__Impl"


    // $ANTLR start "rule__InternalInputEvent__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1875:1: rule__InternalInputEvent__Group__0 : rule__InternalInputEvent__Group__0__Impl rule__InternalInputEvent__Group__1 ;
    public final void rule__InternalInputEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1879:1: ( rule__InternalInputEvent__Group__0__Impl rule__InternalInputEvent__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1880:2: rule__InternalInputEvent__Group__0__Impl rule__InternalInputEvent__Group__1
            {
            pushFollow(FOLLOW_rule__InternalInputEvent__Group__0__Impl_in_rule__InternalInputEvent__Group__03920);
            rule__InternalInputEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalInputEvent__Group__1_in_rule__InternalInputEvent__Group__03923);
            rule__InternalInputEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInputEvent__Group__0"


    // $ANTLR start "rule__InternalInputEvent__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1887:1: rule__InternalInputEvent__Group__0__Impl : ( '>' ) ;
    public final void rule__InternalInputEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1891:1: ( ( '>' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1892:1: ( '>' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1892:1: ( '>' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1893:1: '>'
            {
             before(grammarAccess.getInternalInputEventAccess().getGreaterThanSignKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__InternalInputEvent__Group__0__Impl3951); 
             after(grammarAccess.getInternalInputEventAccess().getGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInputEvent__Group__0__Impl"


    // $ANTLR start "rule__InternalInputEvent__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1906:1: rule__InternalInputEvent__Group__1 : rule__InternalInputEvent__Group__1__Impl rule__InternalInputEvent__Group__2 ;
    public final void rule__InternalInputEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1910:1: ( rule__InternalInputEvent__Group__1__Impl rule__InternalInputEvent__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1911:2: rule__InternalInputEvent__Group__1__Impl rule__InternalInputEvent__Group__2
            {
            pushFollow(FOLLOW_rule__InternalInputEvent__Group__1__Impl_in_rule__InternalInputEvent__Group__13982);
            rule__InternalInputEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalInputEvent__Group__2_in_rule__InternalInputEvent__Group__13985);
            rule__InternalInputEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInputEvent__Group__1"


    // $ANTLR start "rule__InternalInputEvent__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1918:1: rule__InternalInputEvent__Group__1__Impl : ( ruleFunctionApplication ) ;
    public final void rule__InternalInputEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1922:1: ( ( ruleFunctionApplication ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1923:1: ( ruleFunctionApplication )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1923:1: ( ruleFunctionApplication )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1924:1: ruleFunctionApplication
            {
             before(grammarAccess.getInternalInputEventAccess().getFunctionApplicationParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleFunctionApplication_in_rule__InternalInputEvent__Group__1__Impl4012);
            ruleFunctionApplication();

            state._fsp--;

             after(grammarAccess.getInternalInputEventAccess().getFunctionApplicationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInputEvent__Group__1__Impl"


    // $ANTLR start "rule__InternalInputEvent__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1935:1: rule__InternalInputEvent__Group__2 : rule__InternalInputEvent__Group__2__Impl ;
    public final void rule__InternalInputEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1939:1: ( rule__InternalInputEvent__Group__2__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1940:2: rule__InternalInputEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__InternalInputEvent__Group__2__Impl_in_rule__InternalInputEvent__Group__24041);
            rule__InternalInputEvent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInputEvent__Group__2"


    // $ANTLR start "rule__InternalInputEvent__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1946:1: rule__InternalInputEvent__Group__2__Impl : ( '<' ) ;
    public final void rule__InternalInputEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1950:1: ( ( '<' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1951:1: ( '<' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1951:1: ( '<' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1952:1: '<'
            {
             before(grammarAccess.getInternalInputEventAccess().getLessThanSignKeyword_2()); 
            match(input,11,FOLLOW_11_in_rule__InternalInputEvent__Group__2__Impl4069); 
             after(grammarAccess.getInternalInputEventAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalInputEvent__Group__2__Impl"


    // $ANTLR start "rule__ExternalOutputEvent__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1971:1: rule__ExternalOutputEvent__Group__0 : rule__ExternalOutputEvent__Group__0__Impl rule__ExternalOutputEvent__Group__1 ;
    public final void rule__ExternalOutputEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1975:1: ( rule__ExternalOutputEvent__Group__0__Impl rule__ExternalOutputEvent__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1976:2: rule__ExternalOutputEvent__Group__0__Impl rule__ExternalOutputEvent__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalOutputEvent__Group__0__Impl_in_rule__ExternalOutputEvent__Group__04106);
            rule__ExternalOutputEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalOutputEvent__Group__1_in_rule__ExternalOutputEvent__Group__04109);
            rule__ExternalOutputEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalOutputEvent__Group__0"


    // $ANTLR start "rule__ExternalOutputEvent__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1983:1: rule__ExternalOutputEvent__Group__0__Impl : ( '<<' ) ;
    public final void rule__ExternalOutputEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1987:1: ( ( '<<' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1988:1: ( '<<' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1988:1: ( '<<' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:1989:1: '<<'
            {
             before(grammarAccess.getExternalOutputEventAccess().getLessThanSignLessThanSignKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ExternalOutputEvent__Group__0__Impl4137); 
             after(grammarAccess.getExternalOutputEventAccess().getLessThanSignLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalOutputEvent__Group__0__Impl"


    // $ANTLR start "rule__ExternalOutputEvent__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2002:1: rule__ExternalOutputEvent__Group__1 : rule__ExternalOutputEvent__Group__1__Impl rule__ExternalOutputEvent__Group__2 ;
    public final void rule__ExternalOutputEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2006:1: ( rule__ExternalOutputEvent__Group__1__Impl rule__ExternalOutputEvent__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2007:2: rule__ExternalOutputEvent__Group__1__Impl rule__ExternalOutputEvent__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalOutputEvent__Group__1__Impl_in_rule__ExternalOutputEvent__Group__14168);
            rule__ExternalOutputEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalOutputEvent__Group__2_in_rule__ExternalOutputEvent__Group__14171);
            rule__ExternalOutputEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalOutputEvent__Group__1"


    // $ANTLR start "rule__ExternalOutputEvent__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2014:1: rule__ExternalOutputEvent__Group__1__Impl : ( ruleFunctionApplication ) ;
    public final void rule__ExternalOutputEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2018:1: ( ( ruleFunctionApplication ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2019:1: ( ruleFunctionApplication )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2019:1: ( ruleFunctionApplication )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2020:1: ruleFunctionApplication
            {
             before(grammarAccess.getExternalOutputEventAccess().getFunctionApplicationParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleFunctionApplication_in_rule__ExternalOutputEvent__Group__1__Impl4198);
            ruleFunctionApplication();

            state._fsp--;

             after(grammarAccess.getExternalOutputEventAccess().getFunctionApplicationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalOutputEvent__Group__1__Impl"


    // $ANTLR start "rule__ExternalOutputEvent__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2031:1: rule__ExternalOutputEvent__Group__2 : rule__ExternalOutputEvent__Group__2__Impl ;
    public final void rule__ExternalOutputEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2035:1: ( rule__ExternalOutputEvent__Group__2__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2036:2: rule__ExternalOutputEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExternalOutputEvent__Group__2__Impl_in_rule__ExternalOutputEvent__Group__24227);
            rule__ExternalOutputEvent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalOutputEvent__Group__2"


    // $ANTLR start "rule__ExternalOutputEvent__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2042:1: rule__ExternalOutputEvent__Group__2__Impl : ( '>>' ) ;
    public final void rule__ExternalOutputEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2046:1: ( ( '>>' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2047:1: ( '>>' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2047:1: ( '>>' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2048:1: '>>'
            {
             before(grammarAccess.getExternalOutputEventAccess().getGreaterThanSignGreaterThanSignKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__ExternalOutputEvent__Group__2__Impl4255); 
             after(grammarAccess.getExternalOutputEventAccess().getGreaterThanSignGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalOutputEvent__Group__2__Impl"


    // $ANTLR start "rule__ExternalInputEvent__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2067:1: rule__ExternalInputEvent__Group__0 : rule__ExternalInputEvent__Group__0__Impl rule__ExternalInputEvent__Group__1 ;
    public final void rule__ExternalInputEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2071:1: ( rule__ExternalInputEvent__Group__0__Impl rule__ExternalInputEvent__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2072:2: rule__ExternalInputEvent__Group__0__Impl rule__ExternalInputEvent__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalInputEvent__Group__0__Impl_in_rule__ExternalInputEvent__Group__04292);
            rule__ExternalInputEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalInputEvent__Group__1_in_rule__ExternalInputEvent__Group__04295);
            rule__ExternalInputEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalInputEvent__Group__0"


    // $ANTLR start "rule__ExternalInputEvent__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2079:1: rule__ExternalInputEvent__Group__0__Impl : ( '>>' ) ;
    public final void rule__ExternalInputEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2083:1: ( ( '>>' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2084:1: ( '>>' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2084:1: ( '>>' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2085:1: '>>'
            {
             before(grammarAccess.getExternalInputEventAccess().getGreaterThanSignGreaterThanSignKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ExternalInputEvent__Group__0__Impl4323); 
             after(grammarAccess.getExternalInputEventAccess().getGreaterThanSignGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalInputEvent__Group__0__Impl"


    // $ANTLR start "rule__ExternalInputEvent__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2098:1: rule__ExternalInputEvent__Group__1 : rule__ExternalInputEvent__Group__1__Impl rule__ExternalInputEvent__Group__2 ;
    public final void rule__ExternalInputEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2102:1: ( rule__ExternalInputEvent__Group__1__Impl rule__ExternalInputEvent__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2103:2: rule__ExternalInputEvent__Group__1__Impl rule__ExternalInputEvent__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalInputEvent__Group__1__Impl_in_rule__ExternalInputEvent__Group__14354);
            rule__ExternalInputEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalInputEvent__Group__2_in_rule__ExternalInputEvent__Group__14357);
            rule__ExternalInputEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalInputEvent__Group__1"


    // $ANTLR start "rule__ExternalInputEvent__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2110:1: rule__ExternalInputEvent__Group__1__Impl : ( ruleFunctionApplication ) ;
    public final void rule__ExternalInputEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2114:1: ( ( ruleFunctionApplication ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2115:1: ( ruleFunctionApplication )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2115:1: ( ruleFunctionApplication )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2116:1: ruleFunctionApplication
            {
             before(grammarAccess.getExternalInputEventAccess().getFunctionApplicationParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleFunctionApplication_in_rule__ExternalInputEvent__Group__1__Impl4384);
            ruleFunctionApplication();

            state._fsp--;

             after(grammarAccess.getExternalInputEventAccess().getFunctionApplicationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalInputEvent__Group__1__Impl"


    // $ANTLR start "rule__ExternalInputEvent__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2127:1: rule__ExternalInputEvent__Group__2 : rule__ExternalInputEvent__Group__2__Impl ;
    public final void rule__ExternalInputEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2131:1: ( rule__ExternalInputEvent__Group__2__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2132:2: rule__ExternalInputEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExternalInputEvent__Group__2__Impl_in_rule__ExternalInputEvent__Group__24413);
            rule__ExternalInputEvent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalInputEvent__Group__2"


    // $ANTLR start "rule__ExternalInputEvent__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2138:1: rule__ExternalInputEvent__Group__2__Impl : ( '<<' ) ;
    public final void rule__ExternalInputEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2142:1: ( ( '<<' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2143:1: ( '<<' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2143:1: ( '<<' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2144:1: '<<'
            {
             before(grammarAccess.getExternalInputEventAccess().getLessThanSignLessThanSignKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ExternalInputEvent__Group__2__Impl4441); 
             after(grammarAccess.getExternalInputEventAccess().getLessThanSignLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalInputEvent__Group__2__Impl"


    // $ANTLR start "rule__ForAll__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2163:1: rule__ForAll__Group__0 : rule__ForAll__Group__0__Impl rule__ForAll__Group__1 ;
    public final void rule__ForAll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2167:1: ( rule__ForAll__Group__0__Impl rule__ForAll__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2168:2: rule__ForAll__Group__0__Impl rule__ForAll__Group__1
            {
            pushFollow(FOLLOW_rule__ForAll__Group__0__Impl_in_rule__ForAll__Group__04478);
            rule__ForAll__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAll__Group__1_in_rule__ForAll__Group__04481);
            rule__ForAll__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__0"


    // $ANTLR start "rule__ForAll__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2175:1: rule__ForAll__Group__0__Impl : ( '||' ) ;
    public final void rule__ForAll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2179:1: ( ( '||' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2180:1: ( '||' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2180:1: ( '||' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2181:1: '||'
            {
             before(grammarAccess.getForAllAccess().getVerticalLineVerticalLineKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ForAll__Group__0__Impl4509); 
             after(grammarAccess.getForAllAccess().getVerticalLineVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__0__Impl"


    // $ANTLR start "rule__ForAll__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2194:1: rule__ForAll__Group__1 : rule__ForAll__Group__1__Impl ;
    public final void rule__ForAll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2198:1: ( rule__ForAll__Group__1__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2199:2: rule__ForAll__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ForAll__Group__1__Impl_in_rule__ForAll__Group__14540);
            rule__ForAll__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__1"


    // $ANTLR start "rule__ForAll__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2205:1: rule__ForAll__Group__1__Impl : ( ruleComponentInstantiation ) ;
    public final void rule__ForAll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2209:1: ( ( ruleComponentInstantiation ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2210:1: ( ruleComponentInstantiation )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2210:1: ( ruleComponentInstantiation )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2211:1: ruleComponentInstantiation
            {
             before(grammarAccess.getForAllAccess().getComponentInstantiationParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleComponentInstantiation_in_rule__ForAll__Group__1__Impl4567);
            ruleComponentInstantiation();

            state._fsp--;

             after(grammarAccess.getForAllAccess().getComponentInstantiationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__1__Impl"


    // $ANTLR start "rule__ForSome__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2226:1: rule__ForSome__Group__0 : rule__ForSome__Group__0__Impl rule__ForSome__Group__1 ;
    public final void rule__ForSome__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2230:1: ( rule__ForSome__Group__0__Impl rule__ForSome__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2231:2: rule__ForSome__Group__0__Impl rule__ForSome__Group__1
            {
            pushFollow(FOLLOW_rule__ForSome__Group__0__Impl_in_rule__ForSome__Group__04600);
            rule__ForSome__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForSome__Group__1_in_rule__ForSome__Group__04603);
            rule__ForSome__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForSome__Group__0"


    // $ANTLR start "rule__ForSome__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2238:1: rule__ForSome__Group__0__Impl : ( '%' ) ;
    public final void rule__ForSome__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2242:1: ( ( '%' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2243:1: ( '%' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2243:1: ( '%' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2244:1: '%'
            {
             before(grammarAccess.getForSomeAccess().getPercentSignKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ForSome__Group__0__Impl4631); 
             after(grammarAccess.getForSomeAccess().getPercentSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForSome__Group__0__Impl"


    // $ANTLR start "rule__ForSome__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2257:1: rule__ForSome__Group__1 : rule__ForSome__Group__1__Impl ;
    public final void rule__ForSome__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2261:1: ( rule__ForSome__Group__1__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2262:2: rule__ForSome__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ForSome__Group__1__Impl_in_rule__ForSome__Group__14662);
            rule__ForSome__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForSome__Group__1"


    // $ANTLR start "rule__ForSome__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2268:1: rule__ForSome__Group__1__Impl : ( ruleComponentInstantiation ) ;
    public final void rule__ForSome__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2272:1: ( ( ruleComponentInstantiation ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2273:1: ( ruleComponentInstantiation )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2273:1: ( ruleComponentInstantiation )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2274:1: ruleComponentInstantiation
            {
             before(grammarAccess.getForSomeAccess().getComponentInstantiationParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleComponentInstantiation_in_rule__ForSome__Group__1__Impl4689);
            ruleComponentInstantiation();

            state._fsp--;

             after(grammarAccess.getForSomeAccess().getComponentInstantiationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForSome__Group__1__Impl"


    // $ANTLR start "rule__AtLeastOne__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2289:1: rule__AtLeastOne__Group__0 : rule__AtLeastOne__Group__0__Impl rule__AtLeastOne__Group__1 ;
    public final void rule__AtLeastOne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2293:1: ( rule__AtLeastOne__Group__0__Impl rule__AtLeastOne__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2294:2: rule__AtLeastOne__Group__0__Impl rule__AtLeastOne__Group__1
            {
            pushFollow(FOLLOW_rule__AtLeastOne__Group__0__Impl_in_rule__AtLeastOne__Group__04722);
            rule__AtLeastOne__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtLeastOne__Group__1_in_rule__AtLeastOne__Group__04725);
            rule__AtLeastOne__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtLeastOne__Group__0"


    // $ANTLR start "rule__AtLeastOne__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2301:1: rule__AtLeastOne__Group__0__Impl : ( '%+' ) ;
    public final void rule__AtLeastOne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2305:1: ( ( '%+' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2306:1: ( '%+' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2306:1: ( '%+' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2307:1: '%+'
            {
             before(grammarAccess.getAtLeastOneAccess().getPercentSignPlusSignKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__AtLeastOne__Group__0__Impl4753); 
             after(grammarAccess.getAtLeastOneAccess().getPercentSignPlusSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtLeastOne__Group__0__Impl"


    // $ANTLR start "rule__AtLeastOne__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2320:1: rule__AtLeastOne__Group__1 : rule__AtLeastOne__Group__1__Impl ;
    public final void rule__AtLeastOne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2324:1: ( rule__AtLeastOne__Group__1__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2325:2: rule__AtLeastOne__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AtLeastOne__Group__1__Impl_in_rule__AtLeastOne__Group__14784);
            rule__AtLeastOne__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtLeastOne__Group__1"


    // $ANTLR start "rule__AtLeastOne__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2331:1: rule__AtLeastOne__Group__1__Impl : ( ruleComponentInstantiation ) ;
    public final void rule__AtLeastOne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2335:1: ( ( ruleComponentInstantiation ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2336:1: ( ruleComponentInstantiation )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2336:1: ( ruleComponentInstantiation )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2337:1: ruleComponentInstantiation
            {
             before(grammarAccess.getAtLeastOneAccess().getComponentInstantiationParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleComponentInstantiation_in_rule__AtLeastOne__Group__1__Impl4811);
            ruleComponentInstantiation();

            state._fsp--;

             after(grammarAccess.getAtLeastOneAccess().getComponentInstantiationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtLeastOne__Group__1__Impl"


    // $ANTLR start "rule__ForOneArbitrary__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2352:1: rule__ForOneArbitrary__Group__0 : rule__ForOneArbitrary__Group__0__Impl rule__ForOneArbitrary__Group__1 ;
    public final void rule__ForOneArbitrary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2356:1: ( rule__ForOneArbitrary__Group__0__Impl rule__ForOneArbitrary__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2357:2: rule__ForOneArbitrary__Group__0__Impl rule__ForOneArbitrary__Group__1
            {
            pushFollow(FOLLOW_rule__ForOneArbitrary__Group__0__Impl_in_rule__ForOneArbitrary__Group__04844);
            rule__ForOneArbitrary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForOneArbitrary__Group__1_in_rule__ForOneArbitrary__Group__04847);
            rule__ForOneArbitrary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForOneArbitrary__Group__0"


    // $ANTLR start "rule__ForOneArbitrary__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2364:1: rule__ForOneArbitrary__Group__0__Impl : ( '[]' ) ;
    public final void rule__ForOneArbitrary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2368:1: ( ( '[]' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2369:1: ( '[]' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2369:1: ( '[]' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2370:1: '[]'
            {
             before(grammarAccess.getForOneArbitraryAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ForOneArbitrary__Group__0__Impl4875); 
             after(grammarAccess.getForOneArbitraryAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForOneArbitrary__Group__0__Impl"


    // $ANTLR start "rule__ForOneArbitrary__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2383:1: rule__ForOneArbitrary__Group__1 : rule__ForOneArbitrary__Group__1__Impl ;
    public final void rule__ForOneArbitrary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2387:1: ( rule__ForOneArbitrary__Group__1__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2388:2: rule__ForOneArbitrary__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ForOneArbitrary__Group__1__Impl_in_rule__ForOneArbitrary__Group__14906);
            rule__ForOneArbitrary__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForOneArbitrary__Group__1"


    // $ANTLR start "rule__ForOneArbitrary__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2394:1: rule__ForOneArbitrary__Group__1__Impl : ( ruleComponentInstantiation ) ;
    public final void rule__ForOneArbitrary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2398:1: ( ( ruleComponentInstantiation ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2399:1: ( ruleComponentInstantiation )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2399:1: ( ruleComponentInstantiation )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2400:1: ruleComponentInstantiation
            {
             before(grammarAccess.getForOneArbitraryAccess().getComponentInstantiationParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleComponentInstantiation_in_rule__ForOneArbitrary__Group__1__Impl4933);
            ruleComponentInstantiation();

            state._fsp--;

             after(grammarAccess.getForOneArbitraryAccess().getComponentInstantiationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForOneArbitrary__Group__1__Impl"


    // $ANTLR start "rule__ComponentInstantiation__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2415:1: rule__ComponentInstantiation__Group__0 : rule__ComponentInstantiation__Group__0__Impl rule__ComponentInstantiation__Group__1 ;
    public final void rule__ComponentInstantiation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2419:1: ( rule__ComponentInstantiation__Group__0__Impl rule__ComponentInstantiation__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2420:2: rule__ComponentInstantiation__Group__0__Impl rule__ComponentInstantiation__Group__1
            {
            pushFollow(FOLLOW_rule__ComponentInstantiation__Group__0__Impl_in_rule__ComponentInstantiation__Group__04966);
            rule__ComponentInstantiation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentInstantiation__Group__1_in_rule__ComponentInstantiation__Group__04969);
            rule__ComponentInstantiation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstantiation__Group__0"


    // $ANTLR start "rule__ComponentInstantiation__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2427:1: rule__ComponentInstantiation__Group__0__Impl : ( ( rule__ComponentInstantiation__ComponentAssignment_0 ) ) ;
    public final void rule__ComponentInstantiation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2431:1: ( ( ( rule__ComponentInstantiation__ComponentAssignment_0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2432:1: ( ( rule__ComponentInstantiation__ComponentAssignment_0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2432:1: ( ( rule__ComponentInstantiation__ComponentAssignment_0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2433:1: ( rule__ComponentInstantiation__ComponentAssignment_0 )
            {
             before(grammarAccess.getComponentInstantiationAccess().getComponentAssignment_0()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2434:1: ( rule__ComponentInstantiation__ComponentAssignment_0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2434:2: rule__ComponentInstantiation__ComponentAssignment_0
            {
            pushFollow(FOLLOW_rule__ComponentInstantiation__ComponentAssignment_0_in_rule__ComponentInstantiation__Group__0__Impl4996);
            rule__ComponentInstantiation__ComponentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstantiationAccess().getComponentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstantiation__Group__0__Impl"


    // $ANTLR start "rule__ComponentInstantiation__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2444:1: rule__ComponentInstantiation__Group__1 : rule__ComponentInstantiation__Group__1__Impl rule__ComponentInstantiation__Group__2 ;
    public final void rule__ComponentInstantiation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2448:1: ( rule__ComponentInstantiation__Group__1__Impl rule__ComponentInstantiation__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2449:2: rule__ComponentInstantiation__Group__1__Impl rule__ComponentInstantiation__Group__2
            {
            pushFollow(FOLLOW_rule__ComponentInstantiation__Group__1__Impl_in_rule__ComponentInstantiation__Group__15026);
            rule__ComponentInstantiation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentInstantiation__Group__2_in_rule__ComponentInstantiation__Group__15029);
            rule__ComponentInstantiation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstantiation__Group__1"


    // $ANTLR start "rule__ComponentInstantiation__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2456:1: rule__ComponentInstantiation__Group__1__Impl : ( '#' ) ;
    public final void rule__ComponentInstantiation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2460:1: ( ( '#' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2461:1: ( '#' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2461:1: ( '#' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2462:1: '#'
            {
             before(grammarAccess.getComponentInstantiationAccess().getNumberSignKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__ComponentInstantiation__Group__1__Impl5057); 
             after(grammarAccess.getComponentInstantiationAccess().getNumberSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstantiation__Group__1__Impl"


    // $ANTLR start "rule__ComponentInstantiation__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2475:1: rule__ComponentInstantiation__Group__2 : rule__ComponentInstantiation__Group__2__Impl rule__ComponentInstantiation__Group__3 ;
    public final void rule__ComponentInstantiation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2479:1: ( rule__ComponentInstantiation__Group__2__Impl rule__ComponentInstantiation__Group__3 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2480:2: rule__ComponentInstantiation__Group__2__Impl rule__ComponentInstantiation__Group__3
            {
            pushFollow(FOLLOW_rule__ComponentInstantiation__Group__2__Impl_in_rule__ComponentInstantiation__Group__25088);
            rule__ComponentInstantiation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentInstantiation__Group__3_in_rule__ComponentInstantiation__Group__25091);
            rule__ComponentInstantiation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstantiation__Group__2"


    // $ANTLR start "rule__ComponentInstantiation__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2487:1: rule__ComponentInstantiation__Group__2__Impl : ( ':' ) ;
    public final void rule__ComponentInstantiation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2491:1: ( ( ':' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2492:1: ( ':' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2492:1: ( ':' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2493:1: ':'
            {
             before(grammarAccess.getComponentInstantiationAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__ComponentInstantiation__Group__2__Impl5119); 
             after(grammarAccess.getComponentInstantiationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstantiation__Group__2__Impl"


    // $ANTLR start "rule__ComponentInstantiation__Group__3"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2506:1: rule__ComponentInstantiation__Group__3 : rule__ComponentInstantiation__Group__3__Impl ;
    public final void rule__ComponentInstantiation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2510:1: ( rule__ComponentInstantiation__Group__3__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2511:2: rule__ComponentInstantiation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComponentInstantiation__Group__3__Impl_in_rule__ComponentInstantiation__Group__35150);
            rule__ComponentInstantiation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstantiation__Group__3"


    // $ANTLR start "rule__ComponentInstantiation__Group__3__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2517:1: rule__ComponentInstantiation__Group__3__Impl : ( ( rule__ComponentInstantiation__ComponentSetAssignment_3 ) ) ;
    public final void rule__ComponentInstantiation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2521:1: ( ( ( rule__ComponentInstantiation__ComponentSetAssignment_3 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2522:1: ( ( rule__ComponentInstantiation__ComponentSetAssignment_3 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2522:1: ( ( rule__ComponentInstantiation__ComponentSetAssignment_3 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2523:1: ( rule__ComponentInstantiation__ComponentSetAssignment_3 )
            {
             before(grammarAccess.getComponentInstantiationAccess().getComponentSetAssignment_3()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2524:1: ( rule__ComponentInstantiation__ComponentSetAssignment_3 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2524:2: rule__ComponentInstantiation__ComponentSetAssignment_3
            {
            pushFollow(FOLLOW_rule__ComponentInstantiation__ComponentSetAssignment_3_in_rule__ComponentInstantiation__Group__3__Impl5177);
            rule__ComponentInstantiation__ComponentSetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstantiationAccess().getComponentSetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstantiation__Group__3__Impl"


    // $ANTLR start "rule__BinaryRelation__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2542:1: rule__BinaryRelation__Group__0 : rule__BinaryRelation__Group__0__Impl rule__BinaryRelation__Group__1 ;
    public final void rule__BinaryRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2546:1: ( rule__BinaryRelation__Group__0__Impl rule__BinaryRelation__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2547:2: rule__BinaryRelation__Group__0__Impl rule__BinaryRelation__Group__1
            {
            pushFollow(FOLLOW_rule__BinaryRelation__Group__0__Impl_in_rule__BinaryRelation__Group__05215);
            rule__BinaryRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinaryRelation__Group__1_in_rule__BinaryRelation__Group__05218);
            rule__BinaryRelation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryRelation__Group__0"


    // $ANTLR start "rule__BinaryRelation__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2554:1: rule__BinaryRelation__Group__0__Impl : ( ( 'NOT' )? ) ;
    public final void rule__BinaryRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2558:1: ( ( ( 'NOT' )? ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2559:1: ( ( 'NOT' )? )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2559:1: ( ( 'NOT' )? )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2560:1: ( 'NOT' )?
            {
             before(grammarAccess.getBinaryRelationAccess().getNOTKeyword_0()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2561:1: ( 'NOT' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2562:2: 'NOT'
                    {
                    match(input,34,FOLLOW_34_in_rule__BinaryRelation__Group__0__Impl5247); 

                    }
                    break;

            }

             after(grammarAccess.getBinaryRelationAccess().getNOTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryRelation__Group__0__Impl"


    // $ANTLR start "rule__BinaryRelation__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2573:1: rule__BinaryRelation__Group__1 : rule__BinaryRelation__Group__1__Impl rule__BinaryRelation__Group__2 ;
    public final void rule__BinaryRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2577:1: ( rule__BinaryRelation__Group__1__Impl rule__BinaryRelation__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2578:2: rule__BinaryRelation__Group__1__Impl rule__BinaryRelation__Group__2
            {
            pushFollow(FOLLOW_rule__BinaryRelation__Group__1__Impl_in_rule__BinaryRelation__Group__15280);
            rule__BinaryRelation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinaryRelation__Group__2_in_rule__BinaryRelation__Group__15283);
            rule__BinaryRelation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryRelation__Group__1"


    // $ANTLR start "rule__BinaryRelation__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2585:1: rule__BinaryRelation__Group__1__Impl : ( ( rule__BinaryRelation__LeftAssignment_1 ) ) ;
    public final void rule__BinaryRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2589:1: ( ( ( rule__BinaryRelation__LeftAssignment_1 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2590:1: ( ( rule__BinaryRelation__LeftAssignment_1 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2590:1: ( ( rule__BinaryRelation__LeftAssignment_1 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2591:1: ( rule__BinaryRelation__LeftAssignment_1 )
            {
             before(grammarAccess.getBinaryRelationAccess().getLeftAssignment_1()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2592:1: ( rule__BinaryRelation__LeftAssignment_1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2592:2: rule__BinaryRelation__LeftAssignment_1
            {
            pushFollow(FOLLOW_rule__BinaryRelation__LeftAssignment_1_in_rule__BinaryRelation__Group__1__Impl5310);
            rule__BinaryRelation__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryRelationAccess().getLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryRelation__Group__1__Impl"


    // $ANTLR start "rule__BinaryRelation__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2602:1: rule__BinaryRelation__Group__2 : rule__BinaryRelation__Group__2__Impl ;
    public final void rule__BinaryRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2606:1: ( rule__BinaryRelation__Group__2__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2607:2: rule__BinaryRelation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BinaryRelation__Group__2__Impl_in_rule__BinaryRelation__Group__25340);
            rule__BinaryRelation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryRelation__Group__2"


    // $ANTLR start "rule__BinaryRelation__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2613:1: rule__BinaryRelation__Group__2__Impl : ( ( rule__BinaryRelation__Group_2__0 )? ) ;
    public final void rule__BinaryRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2617:1: ( ( ( rule__BinaryRelation__Group_2__0 )? ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2618:1: ( ( rule__BinaryRelation__Group_2__0 )? )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2618:1: ( ( rule__BinaryRelation__Group_2__0 )? )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2619:1: ( rule__BinaryRelation__Group_2__0 )?
            {
             before(grammarAccess.getBinaryRelationAccess().getGroup_2()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2620:1: ( rule__BinaryRelation__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=17)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2620:2: rule__BinaryRelation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BinaryRelation__Group_2__0_in_rule__BinaryRelation__Group__2__Impl5367);
                    rule__BinaryRelation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinaryRelationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryRelation__Group__2__Impl"


    // $ANTLR start "rule__BinaryRelation__Group_2__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2636:1: rule__BinaryRelation__Group_2__0 : rule__BinaryRelation__Group_2__0__Impl rule__BinaryRelation__Group_2__1 ;
    public final void rule__BinaryRelation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2640:1: ( rule__BinaryRelation__Group_2__0__Impl rule__BinaryRelation__Group_2__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2641:2: rule__BinaryRelation__Group_2__0__Impl rule__BinaryRelation__Group_2__1
            {
            pushFollow(FOLLOW_rule__BinaryRelation__Group_2__0__Impl_in_rule__BinaryRelation__Group_2__05404);
            rule__BinaryRelation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinaryRelation__Group_2__1_in_rule__BinaryRelation__Group_2__05407);
            rule__BinaryRelation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryRelation__Group_2__0"


    // $ANTLR start "rule__BinaryRelation__Group_2__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2648:1: rule__BinaryRelation__Group_2__0__Impl : ( ( rule__BinaryRelation__OperatorAssignment_2_0 ) ) ;
    public final void rule__BinaryRelation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2652:1: ( ( ( rule__BinaryRelation__OperatorAssignment_2_0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2653:1: ( ( rule__BinaryRelation__OperatorAssignment_2_0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2653:1: ( ( rule__BinaryRelation__OperatorAssignment_2_0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2654:1: ( rule__BinaryRelation__OperatorAssignment_2_0 )
            {
             before(grammarAccess.getBinaryRelationAccess().getOperatorAssignment_2_0()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2655:1: ( rule__BinaryRelation__OperatorAssignment_2_0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2655:2: rule__BinaryRelation__OperatorAssignment_2_0
            {
            pushFollow(FOLLOW_rule__BinaryRelation__OperatorAssignment_2_0_in_rule__BinaryRelation__Group_2__0__Impl5434);
            rule__BinaryRelation__OperatorAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryRelationAccess().getOperatorAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryRelation__Group_2__0__Impl"


    // $ANTLR start "rule__BinaryRelation__Group_2__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2665:1: rule__BinaryRelation__Group_2__1 : rule__BinaryRelation__Group_2__1__Impl ;
    public final void rule__BinaryRelation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2669:1: ( rule__BinaryRelation__Group_2__1__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2670:2: rule__BinaryRelation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BinaryRelation__Group_2__1__Impl_in_rule__BinaryRelation__Group_2__15464);
            rule__BinaryRelation__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryRelation__Group_2__1"


    // $ANTLR start "rule__BinaryRelation__Group_2__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2676:1: rule__BinaryRelation__Group_2__1__Impl : ( ( rule__BinaryRelation__RightAssignment_2_1 ) ) ;
    public final void rule__BinaryRelation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2680:1: ( ( ( rule__BinaryRelation__RightAssignment_2_1 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2681:1: ( ( rule__BinaryRelation__RightAssignment_2_1 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2681:1: ( ( rule__BinaryRelation__RightAssignment_2_1 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2682:1: ( rule__BinaryRelation__RightAssignment_2_1 )
            {
             before(grammarAccess.getBinaryRelationAccess().getRightAssignment_2_1()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2683:1: ( rule__BinaryRelation__RightAssignment_2_1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2683:2: rule__BinaryRelation__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BinaryRelation__RightAssignment_2_1_in_rule__BinaryRelation__Group_2__1__Impl5491);
            rule__BinaryRelation__RightAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryRelationAccess().getRightAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryRelation__Group_2__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2697:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2701:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2702:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BinaryExpression__Group__0__Impl_in_rule__BinaryExpression__Group__05525);
            rule__BinaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinaryExpression__Group__1_in_rule__BinaryExpression__Group__05528);
            rule__BinaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0"


    // $ANTLR start "rule__BinaryExpression__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2709:1: rule__BinaryExpression__Group__0__Impl : ( ( rule__BinaryExpression__LeftExpressionAssignment_0 ) ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2713:1: ( ( ( rule__BinaryExpression__LeftExpressionAssignment_0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2714:1: ( ( rule__BinaryExpression__LeftExpressionAssignment_0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2714:1: ( ( rule__BinaryExpression__LeftExpressionAssignment_0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2715:1: ( rule__BinaryExpression__LeftExpressionAssignment_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftExpressionAssignment_0()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2716:1: ( rule__BinaryExpression__LeftExpressionAssignment_0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2716:2: rule__BinaryExpression__LeftExpressionAssignment_0
            {
            pushFollow(FOLLOW_rule__BinaryExpression__LeftExpressionAssignment_0_in_rule__BinaryExpression__Group__0__Impl5555);
            rule__BinaryExpression__LeftExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getLeftExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2726:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2730:1: ( rule__BinaryExpression__Group__1__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2731:2: rule__BinaryExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BinaryExpression__Group__1__Impl_in_rule__BinaryExpression__Group__15585);
            rule__BinaryExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1"


    // $ANTLR start "rule__BinaryExpression__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2737:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__Group_1__0 )? ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2741:1: ( ( ( rule__BinaryExpression__Group_1__0 )? ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2742:1: ( ( rule__BinaryExpression__Group_1__0 )? )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2742:1: ( ( rule__BinaryExpression__Group_1__0 )? )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2743:1: ( rule__BinaryExpression__Group_1__0 )?
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup_1()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2744:1: ( rule__BinaryExpression__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=18 && LA9_0<=20)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2744:2: rule__BinaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BinaryExpression__Group_1__0_in_rule__BinaryExpression__Group__1__Impl5612);
                    rule__BinaryExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinaryExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group_1__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2758:1: rule__BinaryExpression__Group_1__0 : rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1 ;
    public final void rule__BinaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2762:1: ( rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2763:2: rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BinaryExpression__Group_1__0__Impl_in_rule__BinaryExpression__Group_1__05647);
            rule__BinaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinaryExpression__Group_1__1_in_rule__BinaryExpression__Group_1__05650);
            rule__BinaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1__0"


    // $ANTLR start "rule__BinaryExpression__Group_1__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2770:1: rule__BinaryExpression__Group_1__0__Impl : ( ( rule__BinaryExpression__OperatorAssignment_1_0 ) ) ;
    public final void rule__BinaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2774:1: ( ( ( rule__BinaryExpression__OperatorAssignment_1_0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2775:1: ( ( rule__BinaryExpression__OperatorAssignment_1_0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2775:1: ( ( rule__BinaryExpression__OperatorAssignment_1_0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2776:1: ( rule__BinaryExpression__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_1_0()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2777:1: ( rule__BinaryExpression__OperatorAssignment_1_0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2777:2: rule__BinaryExpression__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_rule__BinaryExpression__OperatorAssignment_1_0_in_rule__BinaryExpression__Group_1__0__Impl5677);
            rule__BinaryExpression__OperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BinaryExpression__Group_1__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2787:1: rule__BinaryExpression__Group_1__1 : rule__BinaryExpression__Group_1__1__Impl ;
    public final void rule__BinaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2791:1: ( rule__BinaryExpression__Group_1__1__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2792:2: rule__BinaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BinaryExpression__Group_1__1__Impl_in_rule__BinaryExpression__Group_1__15707);
            rule__BinaryExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1__1"


    // $ANTLR start "rule__BinaryExpression__Group_1__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2798:1: rule__BinaryExpression__Group_1__1__Impl : ( ( rule__BinaryExpression__RightExpressionAssignment_1_1 ) ) ;
    public final void rule__BinaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2802:1: ( ( ( rule__BinaryExpression__RightExpressionAssignment_1_1 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2803:1: ( ( rule__BinaryExpression__RightExpressionAssignment_1_1 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2803:1: ( ( rule__BinaryExpression__RightExpressionAssignment_1_1 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2804:1: ( rule__BinaryExpression__RightExpressionAssignment_1_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightExpressionAssignment_1_1()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2805:1: ( rule__BinaryExpression__RightExpressionAssignment_1_1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2805:2: rule__BinaryExpression__RightExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BinaryExpression__RightExpressionAssignment_1_1_in_rule__BinaryExpression__Group_1__1__Impl5734);
            rule__BinaryExpression__RightExpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getRightExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__Identifier__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2819:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2823:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2824:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__05768);
            rule__Identifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__05771);
            rule__Identifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__0"


    // $ANTLR start "rule__Identifier__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2831:1: rule__Identifier__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2835:1: ( ( RULE_ID ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2836:1: ( RULE_ID )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2836:1: ( RULE_ID )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2837:1: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Identifier__Group__0__Impl5798); 
             after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__0__Impl"


    // $ANTLR start "rule__Identifier__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2848:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2852:1: ( rule__Identifier__Group__1__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2853:2: rule__Identifier__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__15827);
            rule__Identifier__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__1"


    // $ANTLR start "rule__Identifier__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2859:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__Group_1__0 )* ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2863:1: ( ( ( rule__Identifier__Group_1__0 )* ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2864:1: ( ( rule__Identifier__Group_1__0 )* )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2864:1: ( ( rule__Identifier__Group_1__0 )* )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2865:1: ( rule__Identifier__Group_1__0 )*
            {
             before(grammarAccess.getIdentifierAccess().getGroup_1()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2866:1: ( rule__Identifier__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2866:2: rule__Identifier__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Identifier__Group_1__0_in_rule__Identifier__Group__1__Impl5854);
            	    rule__Identifier__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getIdentifierAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__1__Impl"


    // $ANTLR start "rule__Identifier__Group_1__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2880:1: rule__Identifier__Group_1__0 : rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1 ;
    public final void rule__Identifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2884:1: ( rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2885:2: rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1
            {
            pushFollow(FOLLOW_rule__Identifier__Group_1__0__Impl_in_rule__Identifier__Group_1__05889);
            rule__Identifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier__Group_1__1_in_rule__Identifier__Group_1__05892);
            rule__Identifier__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group_1__0"


    // $ANTLR start "rule__Identifier__Group_1__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2892:1: rule__Identifier__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Identifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2896:1: ( ( '.' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2897:1: ( '.' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2897:1: ( '.' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2898:1: '.'
            {
             before(grammarAccess.getIdentifierAccess().getFullStopKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Identifier__Group_1__0__Impl5920); 
             after(grammarAccess.getIdentifierAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group_1__0__Impl"


    // $ANTLR start "rule__Identifier__Group_1__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2911:1: rule__Identifier__Group_1__1 : rule__Identifier__Group_1__1__Impl ;
    public final void rule__Identifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2915:1: ( rule__Identifier__Group_1__1__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2916:2: rule__Identifier__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier__Group_1__1__Impl_in_rule__Identifier__Group_1__15951);
            rule__Identifier__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group_1__1"


    // $ANTLR start "rule__Identifier__Group_1__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2922:1: rule__Identifier__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Identifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2926:1: ( ( RULE_ID ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2927:1: ( RULE_ID )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2927:1: ( RULE_ID )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2928:1: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Identifier__Group_1__1__Impl5978); 
             after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group_1__1__Impl"


    // $ANTLR start "rule__FunctionApplication__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2943:1: rule__FunctionApplication__Group__0 : rule__FunctionApplication__Group__0__Impl rule__FunctionApplication__Group__1 ;
    public final void rule__FunctionApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2947:1: ( rule__FunctionApplication__Group__0__Impl rule__FunctionApplication__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2948:2: rule__FunctionApplication__Group__0__Impl rule__FunctionApplication__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionApplication__Group__0__Impl_in_rule__FunctionApplication__Group__06011);
            rule__FunctionApplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionApplication__Group__1_in_rule__FunctionApplication__Group__06014);
            rule__FunctionApplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__0"


    // $ANTLR start "rule__FunctionApplication__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2955:1: rule__FunctionApplication__Group__0__Impl : ( ( rule__FunctionApplication__FunctionNameAssignment_0 ) ) ;
    public final void rule__FunctionApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2959:1: ( ( ( rule__FunctionApplication__FunctionNameAssignment_0 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2960:1: ( ( rule__FunctionApplication__FunctionNameAssignment_0 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2960:1: ( ( rule__FunctionApplication__FunctionNameAssignment_0 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2961:1: ( rule__FunctionApplication__FunctionNameAssignment_0 )
            {
             before(grammarAccess.getFunctionApplicationAccess().getFunctionNameAssignment_0()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2962:1: ( rule__FunctionApplication__FunctionNameAssignment_0 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2962:2: rule__FunctionApplication__FunctionNameAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionApplication__FunctionNameAssignment_0_in_rule__FunctionApplication__Group__0__Impl6041);
            rule__FunctionApplication__FunctionNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionApplicationAccess().getFunctionNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__0__Impl"


    // $ANTLR start "rule__FunctionApplication__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2972:1: rule__FunctionApplication__Group__1 : rule__FunctionApplication__Group__1__Impl rule__FunctionApplication__Group__2 ;
    public final void rule__FunctionApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2976:1: ( rule__FunctionApplication__Group__1__Impl rule__FunctionApplication__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2977:2: rule__FunctionApplication__Group__1__Impl rule__FunctionApplication__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionApplication__Group__1__Impl_in_rule__FunctionApplication__Group__16071);
            rule__FunctionApplication__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionApplication__Group__2_in_rule__FunctionApplication__Group__16074);
            rule__FunctionApplication__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__1"


    // $ANTLR start "rule__FunctionApplication__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2984:1: rule__FunctionApplication__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2988:1: ( ( '(' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2989:1: ( '(' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2989:1: ( '(' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:2990:1: '('
            {
             before(grammarAccess.getFunctionApplicationAccess().getLeftParenthesisKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__FunctionApplication__Group__1__Impl6102); 
             after(grammarAccess.getFunctionApplicationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__1__Impl"


    // $ANTLR start "rule__FunctionApplication__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3003:1: rule__FunctionApplication__Group__2 : rule__FunctionApplication__Group__2__Impl rule__FunctionApplication__Group__3 ;
    public final void rule__FunctionApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3007:1: ( rule__FunctionApplication__Group__2__Impl rule__FunctionApplication__Group__3 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3008:2: rule__FunctionApplication__Group__2__Impl rule__FunctionApplication__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionApplication__Group__2__Impl_in_rule__FunctionApplication__Group__26133);
            rule__FunctionApplication__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionApplication__Group__3_in_rule__FunctionApplication__Group__26136);
            rule__FunctionApplication__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__2"


    // $ANTLR start "rule__FunctionApplication__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3015:1: rule__FunctionApplication__Group__2__Impl : ( ( rule__FunctionApplication__ParameterAssignment_2 ) ) ;
    public final void rule__FunctionApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3019:1: ( ( ( rule__FunctionApplication__ParameterAssignment_2 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3020:1: ( ( rule__FunctionApplication__ParameterAssignment_2 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3020:1: ( ( rule__FunctionApplication__ParameterAssignment_2 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3021:1: ( rule__FunctionApplication__ParameterAssignment_2 )
            {
             before(grammarAccess.getFunctionApplicationAccess().getParameterAssignment_2()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3022:1: ( rule__FunctionApplication__ParameterAssignment_2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3022:2: rule__FunctionApplication__ParameterAssignment_2
            {
            pushFollow(FOLLOW_rule__FunctionApplication__ParameterAssignment_2_in_rule__FunctionApplication__Group__2__Impl6163);
            rule__FunctionApplication__ParameterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionApplicationAccess().getParameterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__2__Impl"


    // $ANTLR start "rule__FunctionApplication__Group__3"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3032:1: rule__FunctionApplication__Group__3 : rule__FunctionApplication__Group__3__Impl ;
    public final void rule__FunctionApplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3036:1: ( rule__FunctionApplication__Group__3__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3037:2: rule__FunctionApplication__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FunctionApplication__Group__3__Impl_in_rule__FunctionApplication__Group__36193);
            rule__FunctionApplication__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__3"


    // $ANTLR start "rule__FunctionApplication__Group__3__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3043:1: rule__FunctionApplication__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionApplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3047:1: ( ( ')' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3048:1: ( ')' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3048:1: ( ')' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3049:1: ')'
            {
             before(grammarAccess.getFunctionApplicationAccess().getRightParenthesisKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__FunctionApplication__Group__3__Impl6221); 
             after(grammarAccess.getFunctionApplicationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__Group__3__Impl"


    // $ANTLR start "rule__BracketedExpression__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3070:1: rule__BracketedExpression__Group__0 : rule__BracketedExpression__Group__0__Impl rule__BracketedExpression__Group__1 ;
    public final void rule__BracketedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3074:1: ( rule__BracketedExpression__Group__0__Impl rule__BracketedExpression__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3075:2: rule__BracketedExpression__Group__0__Impl rule__BracketedExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BracketedExpression__Group__0__Impl_in_rule__BracketedExpression__Group__06260);
            rule__BracketedExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BracketedExpression__Group__1_in_rule__BracketedExpression__Group__06263);
            rule__BracketedExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedExpression__Group__0"


    // $ANTLR start "rule__BracketedExpression__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3082:1: rule__BracketedExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__BracketedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3086:1: ( ( '(' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3087:1: ( '(' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3087:1: ( '(' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3088:1: '('
            {
             before(grammarAccess.getBracketedExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__BracketedExpression__Group__0__Impl6291); 
             after(grammarAccess.getBracketedExpressionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedExpression__Group__0__Impl"


    // $ANTLR start "rule__BracketedExpression__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3101:1: rule__BracketedExpression__Group__1 : rule__BracketedExpression__Group__1__Impl rule__BracketedExpression__Group__2 ;
    public final void rule__BracketedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3105:1: ( rule__BracketedExpression__Group__1__Impl rule__BracketedExpression__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3106:2: rule__BracketedExpression__Group__1__Impl rule__BracketedExpression__Group__2
            {
            pushFollow(FOLLOW_rule__BracketedExpression__Group__1__Impl_in_rule__BracketedExpression__Group__16322);
            rule__BracketedExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BracketedExpression__Group__2_in_rule__BracketedExpression__Group__16325);
            rule__BracketedExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedExpression__Group__1"


    // $ANTLR start "rule__BracketedExpression__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3113:1: rule__BracketedExpression__Group__1__Impl : ( ( rule__BracketedExpression__ExpressionAssignment_1 ) ) ;
    public final void rule__BracketedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3117:1: ( ( ( rule__BracketedExpression__ExpressionAssignment_1 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3118:1: ( ( rule__BracketedExpression__ExpressionAssignment_1 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3118:1: ( ( rule__BracketedExpression__ExpressionAssignment_1 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3119:1: ( rule__BracketedExpression__ExpressionAssignment_1 )
            {
             before(grammarAccess.getBracketedExpressionAccess().getExpressionAssignment_1()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3120:1: ( rule__BracketedExpression__ExpressionAssignment_1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3120:2: rule__BracketedExpression__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__BracketedExpression__ExpressionAssignment_1_in_rule__BracketedExpression__Group__1__Impl6352);
            rule__BracketedExpression__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBracketedExpressionAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedExpression__Group__1__Impl"


    // $ANTLR start "rule__BracketedExpression__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3130:1: rule__BracketedExpression__Group__2 : rule__BracketedExpression__Group__2__Impl ;
    public final void rule__BracketedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3134:1: ( rule__BracketedExpression__Group__2__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3135:2: rule__BracketedExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BracketedExpression__Group__2__Impl_in_rule__BracketedExpression__Group__26382);
            rule__BracketedExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedExpression__Group__2"


    // $ANTLR start "rule__BracketedExpression__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3141:1: rule__BracketedExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__BracketedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3145:1: ( ( ')' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3146:1: ( ')' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3146:1: ( ')' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3147:1: ')'
            {
             before(grammarAccess.getBracketedExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__BracketedExpression__Group__2__Impl6410); 
             after(grammarAccess.getBracketedExpressionAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedExpression__Group__2__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3166:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3170:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3171:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__0__Impl_in_rule__Cardinality__Group__06447);
            rule__Cardinality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group__1_in_rule__Cardinality__Group__06450);
            rule__Cardinality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0"


    // $ANTLR start "rule__Cardinality__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3178:1: rule__Cardinality__Group__0__Impl : ( '|' ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3182:1: ( ( '|' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3183:1: ( '|' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3183:1: ( '|' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3184:1: '|'
            {
             before(grammarAccess.getCardinalityAccess().getVerticalLineKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Cardinality__Group__0__Impl6478); 
             after(grammarAccess.getCardinalityAccess().getVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0__Impl"


    // $ANTLR start "rule__Cardinality__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3197:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3201:1: ( rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3202:2: rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__1__Impl_in_rule__Cardinality__Group__16509);
            rule__Cardinality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group__2_in_rule__Cardinality__Group__16512);
            rule__Cardinality__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1"


    // $ANTLR start "rule__Cardinality__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3209:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__ExpressionAssignment_1 ) ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3213:1: ( ( ( rule__Cardinality__ExpressionAssignment_1 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3214:1: ( ( rule__Cardinality__ExpressionAssignment_1 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3214:1: ( ( rule__Cardinality__ExpressionAssignment_1 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3215:1: ( rule__Cardinality__ExpressionAssignment_1 )
            {
             before(grammarAccess.getCardinalityAccess().getExpressionAssignment_1()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3216:1: ( rule__Cardinality__ExpressionAssignment_1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3216:2: rule__Cardinality__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__Cardinality__ExpressionAssignment_1_in_rule__Cardinality__Group__1__Impl6539);
            rule__Cardinality__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3226:1: rule__Cardinality__Group__2 : rule__Cardinality__Group__2__Impl ;
    public final void rule__Cardinality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3230:1: ( rule__Cardinality__Group__2__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3231:2: rule__Cardinality__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__2__Impl_in_rule__Cardinality__Group__26569);
            rule__Cardinality__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__2"


    // $ANTLR start "rule__Cardinality__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3237:1: rule__Cardinality__Group__2__Impl : ( '|' ) ;
    public final void rule__Cardinality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3241:1: ( ( '|' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3242:1: ( '|' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3242:1: ( '|' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3243:1: '|'
            {
             before(grammarAccess.getCardinalityAccess().getVerticalLineKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Cardinality__Group__2__Impl6597); 
             after(grammarAccess.getCardinalityAccess().getVerticalLineKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__2__Impl"


    // $ANTLR start "rule__EnumeratedSet__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3262:1: rule__EnumeratedSet__Group__0 : rule__EnumeratedSet__Group__0__Impl rule__EnumeratedSet__Group__1 ;
    public final void rule__EnumeratedSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3266:1: ( rule__EnumeratedSet__Group__0__Impl rule__EnumeratedSet__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3267:2: rule__EnumeratedSet__Group__0__Impl rule__EnumeratedSet__Group__1
            {
            pushFollow(FOLLOW_rule__EnumeratedSet__Group__0__Impl_in_rule__EnumeratedSet__Group__06634);
            rule__EnumeratedSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumeratedSet__Group__1_in_rule__EnumeratedSet__Group__06637);
            rule__EnumeratedSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedSet__Group__0"


    // $ANTLR start "rule__EnumeratedSet__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3274:1: rule__EnumeratedSet__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumeratedSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3278:1: ( ( '{' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3279:1: ( '{' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3279:1: ( '{' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3280:1: '{'
            {
             before(grammarAccess.getEnumeratedSetAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__EnumeratedSet__Group__0__Impl6665); 
             after(grammarAccess.getEnumeratedSetAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedSet__Group__0__Impl"


    // $ANTLR start "rule__EnumeratedSet__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3293:1: rule__EnumeratedSet__Group__1 : rule__EnumeratedSet__Group__1__Impl rule__EnumeratedSet__Group__2 ;
    public final void rule__EnumeratedSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3297:1: ( rule__EnumeratedSet__Group__1__Impl rule__EnumeratedSet__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3298:2: rule__EnumeratedSet__Group__1__Impl rule__EnumeratedSet__Group__2
            {
            pushFollow(FOLLOW_rule__EnumeratedSet__Group__1__Impl_in_rule__EnumeratedSet__Group__16696);
            rule__EnumeratedSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumeratedSet__Group__2_in_rule__EnumeratedSet__Group__16699);
            rule__EnumeratedSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedSet__Group__1"


    // $ANTLR start "rule__EnumeratedSet__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3305:1: rule__EnumeratedSet__Group__1__Impl : ( ( rule__EnumeratedSet__ExpressionsAssignment_1 ) ) ;
    public final void rule__EnumeratedSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3309:1: ( ( ( rule__EnumeratedSet__ExpressionsAssignment_1 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3310:1: ( ( rule__EnumeratedSet__ExpressionsAssignment_1 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3310:1: ( ( rule__EnumeratedSet__ExpressionsAssignment_1 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3311:1: ( rule__EnumeratedSet__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getEnumeratedSetAccess().getExpressionsAssignment_1()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3312:1: ( rule__EnumeratedSet__ExpressionsAssignment_1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3312:2: rule__EnumeratedSet__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumeratedSet__ExpressionsAssignment_1_in_rule__EnumeratedSet__Group__1__Impl6726);
            rule__EnumeratedSet__ExpressionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumeratedSetAccess().getExpressionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedSet__Group__1__Impl"


    // $ANTLR start "rule__EnumeratedSet__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3322:1: rule__EnumeratedSet__Group__2 : rule__EnumeratedSet__Group__2__Impl ;
    public final void rule__EnumeratedSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3326:1: ( rule__EnumeratedSet__Group__2__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3327:2: rule__EnumeratedSet__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumeratedSet__Group__2__Impl_in_rule__EnumeratedSet__Group__26756);
            rule__EnumeratedSet__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedSet__Group__2"


    // $ANTLR start "rule__EnumeratedSet__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3333:1: rule__EnumeratedSet__Group__2__Impl : ( '}' ) ;
    public final void rule__EnumeratedSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3337:1: ( ( '}' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3338:1: ( '}' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3338:1: ( '}' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3339:1: '}'
            {
             before(grammarAccess.getEnumeratedSetAccess().getRightCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__EnumeratedSet__Group__2__Impl6784); 
             after(grammarAccess.getEnumeratedSetAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedSet__Group__2__Impl"


    // $ANTLR start "rule__FuzzyExp__Group__0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3358:1: rule__FuzzyExp__Group__0 : rule__FuzzyExp__Group__0__Impl rule__FuzzyExp__Group__1 ;
    public final void rule__FuzzyExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3362:1: ( rule__FuzzyExp__Group__0__Impl rule__FuzzyExp__Group__1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3363:2: rule__FuzzyExp__Group__0__Impl rule__FuzzyExp__Group__1
            {
            pushFollow(FOLLOW_rule__FuzzyExp__Group__0__Impl_in_rule__FuzzyExp__Group__06821);
            rule__FuzzyExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuzzyExp__Group__1_in_rule__FuzzyExp__Group__06824);
            rule__FuzzyExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuzzyExp__Group__0"


    // $ANTLR start "rule__FuzzyExp__Group__0__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3370:1: rule__FuzzyExp__Group__0__Impl : ( '[' ) ;
    public final void rule__FuzzyExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3374:1: ( ( '[' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3375:1: ( '[' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3375:1: ( '[' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3376:1: '['
            {
             before(grammarAccess.getFuzzyExpAccess().getLeftSquareBracketKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__FuzzyExp__Group__0__Impl6852); 
             after(grammarAccess.getFuzzyExpAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuzzyExp__Group__0__Impl"


    // $ANTLR start "rule__FuzzyExp__Group__1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3389:1: rule__FuzzyExp__Group__1 : rule__FuzzyExp__Group__1__Impl rule__FuzzyExp__Group__2 ;
    public final void rule__FuzzyExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3393:1: ( rule__FuzzyExp__Group__1__Impl rule__FuzzyExp__Group__2 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3394:2: rule__FuzzyExp__Group__1__Impl rule__FuzzyExp__Group__2
            {
            pushFollow(FOLLOW_rule__FuzzyExp__Group__1__Impl_in_rule__FuzzyExp__Group__16883);
            rule__FuzzyExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuzzyExp__Group__2_in_rule__FuzzyExp__Group__16886);
            rule__FuzzyExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuzzyExp__Group__1"


    // $ANTLR start "rule__FuzzyExp__Group__1__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3401:1: rule__FuzzyExp__Group__1__Impl : ( ( rule__FuzzyExp__ExpressionAssignment_1 ) ) ;
    public final void rule__FuzzyExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3405:1: ( ( ( rule__FuzzyExp__ExpressionAssignment_1 ) ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3406:1: ( ( rule__FuzzyExp__ExpressionAssignment_1 ) )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3406:1: ( ( rule__FuzzyExp__ExpressionAssignment_1 ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3407:1: ( rule__FuzzyExp__ExpressionAssignment_1 )
            {
             before(grammarAccess.getFuzzyExpAccess().getExpressionAssignment_1()); 
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3408:1: ( rule__FuzzyExp__ExpressionAssignment_1 )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3408:2: rule__FuzzyExp__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__FuzzyExp__ExpressionAssignment_1_in_rule__FuzzyExp__Group__1__Impl6913);
            rule__FuzzyExp__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuzzyExpAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuzzyExp__Group__1__Impl"


    // $ANTLR start "rule__FuzzyExp__Group__2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3418:1: rule__FuzzyExp__Group__2 : rule__FuzzyExp__Group__2__Impl ;
    public final void rule__FuzzyExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3422:1: ( rule__FuzzyExp__Group__2__Impl )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3423:2: rule__FuzzyExp__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FuzzyExp__Group__2__Impl_in_rule__FuzzyExp__Group__26943);
            rule__FuzzyExp__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuzzyExp__Group__2"


    // $ANTLR start "rule__FuzzyExp__Group__2__Impl"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3429:1: rule__FuzzyExp__Group__2__Impl : ( ']' ) ;
    public final void rule__FuzzyExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3433:1: ( ( ']' ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3434:1: ( ']' )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3434:1: ( ']' )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3435:1: ']'
            {
             before(grammarAccess.getFuzzyExpAccess().getRightSquareBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__FuzzyExp__Group__2__Impl6971); 
             after(grammarAccess.getFuzzyExpAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuzzyExp__Group__2__Impl"


    // $ANTLR start "rule__BehaviorNode__ComponentAssignment_0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3455:1: rule__BehaviorNode__ComponentAssignment_0 : ( ruleIdentifier ) ;
    public final void rule__BehaviorNode__ComponentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3459:1: ( ( ruleIdentifier ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3460:1: ( ruleIdentifier )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3460:1: ( ruleIdentifier )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3461:1: ruleIdentifier
            {
             before(grammarAccess.getBehaviorNodeAccess().getComponentIdentifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__BehaviorNode__ComponentAssignment_07013);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getBehaviorNodeAccess().getComponentIdentifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorNode__ComponentAssignment_0"


    // $ANTLR start "rule__BehaviorNode__BehaviorAssignment_1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3470:1: rule__BehaviorNode__BehaviorAssignment_1 : ( ruleBehavior ) ;
    public final void rule__BehaviorNode__BehaviorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3474:1: ( ( ruleBehavior ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3475:1: ( ruleBehavior )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3475:1: ( ruleBehavior )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3476:1: ruleBehavior
            {
             before(grammarAccess.getBehaviorNodeAccess().getBehaviorBehaviorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBehavior_in_rule__BehaviorNode__BehaviorAssignment_17044);
            ruleBehavior();

            state._fsp--;

             after(grammarAccess.getBehaviorNodeAccess().getBehaviorBehaviorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorNode__BehaviorAssignment_1"


    // $ANTLR start "rule__StateRealisation__StateAssignment_1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3485:1: rule__StateRealisation__StateAssignment_1 : ( ruleBinaryExpression ) ;
    public final void rule__StateRealisation__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3489:1: ( ( ruleBinaryExpression ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3490:1: ( ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3490:1: ( ruleBinaryExpression )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3491:1: ruleBinaryExpression
            {
             before(grammarAccess.getStateRealisationAccess().getStateBinaryExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryExpression_in_rule__StateRealisation__StateAssignment_17075);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getStateRealisationAccess().getStateBinaryExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateRealisation__StateAssignment_1"


    // $ANTLR start "rule__AttributeRealisation__AttributeAssignment_1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3500:1: rule__AttributeRealisation__AttributeAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__AttributeRealisation__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3504:1: ( ( ruleIdentifier ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3505:1: ( ruleIdentifier )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3505:1: ( ruleIdentifier )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3506:1: ruleIdentifier
            {
             before(grammarAccess.getAttributeRealisationAccess().getAttributeIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__AttributeRealisation__AttributeAssignment_17106);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getAttributeRealisationAccess().getAttributeIdentifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRealisation__AttributeAssignment_1"


    // $ANTLR start "rule__AttributeRealisation__ValueAssignment_3"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3515:1: rule__AttributeRealisation__ValueAssignment_3 : ( ruleBinaryExpression ) ;
    public final void rule__AttributeRealisation__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3519:1: ( ( ruleBinaryExpression ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3520:1: ( ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3520:1: ( ruleBinaryExpression )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3521:1: ruleBinaryExpression
            {
             before(grammarAccess.getAttributeRealisationAccess().getValueBinaryExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBinaryExpression_in_rule__AttributeRealisation__ValueAssignment_37137);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getAttributeRealisationAccess().getValueBinaryExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRealisation__ValueAssignment_3"


    // $ANTLR start "rule__Guard__StateAssignment_1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3530:1: rule__Guard__StateAssignment_1 : ( ruleBinaryExpression ) ;
    public final void rule__Guard__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3534:1: ( ( ruleBinaryExpression ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3535:1: ( ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3535:1: ( ruleBinaryExpression )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3536:1: ruleBinaryExpression
            {
             before(grammarAccess.getGuardAccess().getStateBinaryExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryExpression_in_rule__Guard__StateAssignment_17168);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getStateBinaryExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__StateAssignment_1"


    // $ANTLR start "rule__ComponentInstantiation__ComponentAssignment_0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3545:1: rule__ComponentInstantiation__ComponentAssignment_0 : ( ruleIdentifier ) ;
    public final void rule__ComponentInstantiation__ComponentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3549:1: ( ( ruleIdentifier ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3550:1: ( ruleIdentifier )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3550:1: ( ruleIdentifier )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3551:1: ruleIdentifier
            {
             before(grammarAccess.getComponentInstantiationAccess().getComponentIdentifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__ComponentInstantiation__ComponentAssignment_07199);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getComponentInstantiationAccess().getComponentIdentifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstantiation__ComponentAssignment_0"


    // $ANTLR start "rule__ComponentInstantiation__ComponentSetAssignment_3"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3560:1: rule__ComponentInstantiation__ComponentSetAssignment_3 : ( ruleBinaryExpression ) ;
    public final void rule__ComponentInstantiation__ComponentSetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3564:1: ( ( ruleBinaryExpression ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3565:1: ( ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3565:1: ( ruleBinaryExpression )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3566:1: ruleBinaryExpression
            {
             before(grammarAccess.getComponentInstantiationAccess().getComponentSetBinaryExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBinaryExpression_in_rule__ComponentInstantiation__ComponentSetAssignment_37230);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getComponentInstantiationAccess().getComponentSetBinaryExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstantiation__ComponentSetAssignment_3"


    // $ANTLR start "rule__BinaryRelation__LeftAssignment_1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3575:1: rule__BinaryRelation__LeftAssignment_1 : ( ruleBinaryExpression ) ;
    public final void rule__BinaryRelation__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3579:1: ( ( ruleBinaryExpression ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3580:1: ( ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3580:1: ( ruleBinaryExpression )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3581:1: ruleBinaryExpression
            {
             before(grammarAccess.getBinaryRelationAccess().getLeftBinaryExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryExpression_in_rule__BinaryRelation__LeftAssignment_17261);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getBinaryRelationAccess().getLeftBinaryExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryRelation__LeftAssignment_1"


    // $ANTLR start "rule__BinaryRelation__OperatorAssignment_2_0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3590:1: rule__BinaryRelation__OperatorAssignment_2_0 : ( rulebinarySymbol ) ;
    public final void rule__BinaryRelation__OperatorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3594:1: ( ( rulebinarySymbol ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3595:1: ( rulebinarySymbol )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3595:1: ( rulebinarySymbol )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3596:1: rulebinarySymbol
            {
             before(grammarAccess.getBinaryRelationAccess().getOperatorBinarySymbolEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_rulebinarySymbol_in_rule__BinaryRelation__OperatorAssignment_2_07292);
            rulebinarySymbol();

            state._fsp--;

             after(grammarAccess.getBinaryRelationAccess().getOperatorBinarySymbolEnumRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryRelation__OperatorAssignment_2_0"


    // $ANTLR start "rule__BinaryRelation__RightAssignment_2_1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3605:1: rule__BinaryRelation__RightAssignment_2_1 : ( ruleBinaryExpression ) ;
    public final void rule__BinaryRelation__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3609:1: ( ( ruleBinaryExpression ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3610:1: ( ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3610:1: ( ruleBinaryExpression )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3611:1: ruleBinaryExpression
            {
             before(grammarAccess.getBinaryRelationAccess().getRightBinaryExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBinaryExpression_in_rule__BinaryRelation__RightAssignment_2_17323);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getBinaryRelationAccess().getRightBinaryExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryRelation__RightAssignment_2_1"


    // $ANTLR start "rule__BinaryExpression__LeftExpressionAssignment_0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3620:1: rule__BinaryExpression__LeftExpressionAssignment_0 : ( ruleValue ) ;
    public final void rule__BinaryExpression__LeftExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3624:1: ( ( ruleValue ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3625:1: ( ruleValue )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3625:1: ( ruleValue )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3626:1: ruleValue
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftExpressionValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__BinaryExpression__LeftExpressionAssignment_07354);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getLeftExpressionValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__LeftExpressionAssignment_0"


    // $ANTLR start "rule__BinaryExpression__OperatorAssignment_1_0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3635:1: rule__BinaryExpression__OperatorAssignment_1_0 : ( ruleBinaryOperator ) ;
    public final void rule__BinaryExpression__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3639:1: ( ( ruleBinaryOperator ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3640:1: ( ruleBinaryOperator )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3640:1: ( ruleBinaryOperator )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3641:1: ruleBinaryOperator
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleBinaryOperator_in_rule__BinaryExpression__OperatorAssignment_1_07385);
            ruleBinaryOperator();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__OperatorAssignment_1_0"


    // $ANTLR start "rule__BinaryExpression__RightExpressionAssignment_1_1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3650:1: rule__BinaryExpression__RightExpressionAssignment_1_1 : ( ruleBinaryExpression ) ;
    public final void rule__BinaryExpression__RightExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3654:1: ( ( ruleBinaryExpression ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3655:1: ( ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3655:1: ( ruleBinaryExpression )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3656:1: ruleBinaryExpression
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightExpressionBinaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBinaryExpression_in_rule__BinaryExpression__RightExpressionAssignment_1_17416);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getRightExpressionBinaryExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__RightExpressionAssignment_1_1"


    // $ANTLR start "rule__Reference__ObjectAssignment"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3665:1: rule__Reference__ObjectAssignment : ( ruleIdentifier ) ;
    public final void rule__Reference__ObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3669:1: ( ( ruleIdentifier ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3670:1: ( ruleIdentifier )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3670:1: ( ruleIdentifier )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3671:1: ruleIdentifier
            {
             before(grammarAccess.getReferenceAccess().getObjectIdentifierParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Reference__ObjectAssignment7447);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getObjectIdentifierParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ObjectAssignment"


    // $ANTLR start "rule__Number__ValueAssignment"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3680:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3684:1: ( ( RULE_INT ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3685:1: ( RULE_INT )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3685:1: ( RULE_INT )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3686:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__ValueAssignment7478); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValueAssignment"


    // $ANTLR start "rule__FunctionApplication__FunctionNameAssignment_0"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3695:1: rule__FunctionApplication__FunctionNameAssignment_0 : ( ruleIdentifier ) ;
    public final void rule__FunctionApplication__FunctionNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3699:1: ( ( ruleIdentifier ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3700:1: ( ruleIdentifier )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3700:1: ( ruleIdentifier )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3701:1: ruleIdentifier
            {
             before(grammarAccess.getFunctionApplicationAccess().getFunctionNameIdentifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__FunctionApplication__FunctionNameAssignment_07509);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getFunctionApplicationAccess().getFunctionNameIdentifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__FunctionNameAssignment_0"


    // $ANTLR start "rule__FunctionApplication__ParameterAssignment_2"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3710:1: rule__FunctionApplication__ParameterAssignment_2 : ( ruleBinaryExpression ) ;
    public final void rule__FunctionApplication__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3714:1: ( ( ruleBinaryExpression ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3715:1: ( ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3715:1: ( ruleBinaryExpression )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3716:1: ruleBinaryExpression
            {
             before(grammarAccess.getFunctionApplicationAccess().getParameterBinaryExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBinaryExpression_in_rule__FunctionApplication__ParameterAssignment_27540);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getFunctionApplicationAccess().getParameterBinaryExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionApplication__ParameterAssignment_2"


    // $ANTLR start "rule__BracketedExpression__ExpressionAssignment_1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3725:1: rule__BracketedExpression__ExpressionAssignment_1 : ( ruleBinaryRelation ) ;
    public final void rule__BracketedExpression__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3729:1: ( ( ruleBinaryRelation ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3730:1: ( ruleBinaryRelation )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3730:1: ( ruleBinaryRelation )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3731:1: ruleBinaryRelation
            {
             before(grammarAccess.getBracketedExpressionAccess().getExpressionBinaryRelationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryRelation_in_rule__BracketedExpression__ExpressionAssignment_17571);
            ruleBinaryRelation();

            state._fsp--;

             after(grammarAccess.getBracketedExpressionAccess().getExpressionBinaryRelationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedExpression__ExpressionAssignment_1"


    // $ANTLR start "rule__Cardinality__ExpressionAssignment_1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3740:1: rule__Cardinality__ExpressionAssignment_1 : ( ruleBinaryExpression ) ;
    public final void rule__Cardinality__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3744:1: ( ( ruleBinaryExpression ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3745:1: ( ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3745:1: ( ruleBinaryExpression )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3746:1: ruleBinaryExpression
            {
             before(grammarAccess.getCardinalityAccess().getExpressionBinaryExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryExpression_in_rule__Cardinality__ExpressionAssignment_17602);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getCardinalityAccess().getExpressionBinaryExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__ExpressionAssignment_1"


    // $ANTLR start "rule__EnumeratedSet__ExpressionsAssignment_1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3755:1: rule__EnumeratedSet__ExpressionsAssignment_1 : ( ruleBinaryExpression ) ;
    public final void rule__EnumeratedSet__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3759:1: ( ( ruleBinaryExpression ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3760:1: ( ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3760:1: ( ruleBinaryExpression )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3761:1: ruleBinaryExpression
            {
             before(grammarAccess.getEnumeratedSetAccess().getExpressionsBinaryExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryExpression_in_rule__EnumeratedSet__ExpressionsAssignment_17633);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getEnumeratedSetAccess().getExpressionsBinaryExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedSet__ExpressionsAssignment_1"


    // $ANTLR start "rule__FuzzyExp__ExpressionAssignment_1"
    // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3770:1: rule__FuzzyExp__ExpressionAssignment_1 : ( ruleBinaryExpression ) ;
    public final void rule__FuzzyExp__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3774:1: ( ( ruleBinaryExpression ) )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3775:1: ( ruleBinaryExpression )
            {
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3775:1: ( ruleBinaryExpression )
            // ../org.be.textbe.expressions.ui/src-gen/org/be/textbe/ui/contentassist/antlr/internal/InternalExpressions.g:3776:1: ruleBinaryExpression
            {
             before(grammarAccess.getFuzzyExpAccess().getExpressionBinaryExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryExpression_in_rule__FuzzyExp__ExpressionAssignment_17664);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getFuzzyExpAccess().getExpressionBinaryExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuzzyExp__ExpressionAssignment_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA2_eotS =
        "\16\uffff";
    static final String DFA2_eofS =
        "\16\uffff";
    static final String DFA2_minS =
        "\1\13\1\4\7\uffff\1\22\1\uffff\1\4\1\uffff\1\22";
    static final String DFA2_maxS =
        "\1\34\1\47\7\uffff\1\44\1\uffff\1\4\1\uffff\1\44";
    static final String DFA2_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\1\1\uffff\1\2"+
        "\1\uffff";
    static final String DFA2_specialS =
        "\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\5\1\6\10\uffff\1\1\2\uffff\1\3\1\2\1\4\1\7\1\10",
            "\1\11\1\12\17\uffff\1\12\16\uffff\1\12\1\uffff\2\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\12\1\uffff\1\12\1\14\13\uffff\1\13\1\12",
            "",
            "\1\15",
            "",
            "\3\12\1\uffff\1\12\1\14\13\uffff\1\13\1\12"
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
            return "932:1: rule__Behavior__Alternatives : ( ( ruleStateRealisation ) | ( ruleAttributeRealisation ) | ( ruleEvent ) | ( ruleSelection ) | ( ruleGuard ) | ( ruleInternalOutputEvent ) | ( ruleInternalInputEvent ) | ( ruleExternalOutputEvent ) | ( ruleExternalInputEvent ) );";
        }
    }
    static final String DFA4_eotS =
        "\13\uffff";
    static final String DFA4_eofS =
        "\1\uffff\1\10\10\uffff\1\10";
    static final String DFA4_minS =
        "\1\4\1\13\5\uffff\1\4\2\uffff\1\13";
    static final String DFA4_maxS =
        "\1\47\1\50\5\uffff\1\4\2\uffff\1\50";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\6\1\7\1\uffff\1\1\1\3\1\uffff";
    static final String DFA4_specialS =
        "\13\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\17\uffff\1\6\16\uffff\1\3\1\uffff\1\4\1\5",
            "\12\10\1\uffff\1\10\3\uffff\1\10\10\uffff\1\7\1\11\2\10\1"+
            "\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\12",
            "",
            "",
            "\12\10\1\uffff\1\10\3\uffff\1\10\10\uffff\1\7\1\11\2\10\1"+
            "\uffff\1\10"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1030:1: rule__Value__Alternatives : ( ( ruleReference ) | ( ruleNumber ) | ( ruleFunctionApplication ) | ( ruleBracketedExpression ) | ( ruleCardinality ) | ( ruleEnumeratedSet ) | ( ruleFuzzyExp ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_in_ruleNode94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehaviorNode_in_entryRuleBehaviorNode121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehaviorNode128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BehaviorNode__Group__0_in_ruleBehaviorNode154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehavior_in_entryRuleBehavior181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehavior188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Alternatives_in_ruleBehavior214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRealisation_in_entryRuleStateRealisation241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRealisation248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateRealisation__Group__0_in_ruleStateRealisation274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeRealisation_in_entryRuleAttributeRealisation301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeRealisation308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeRealisation__Group__0_in_ruleAttributeRealisation334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelection368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__0_in_ruleSelection394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0_in_ruleGuard514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalOutputEvent_in_entryRuleInternalOutputEvent541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalOutputEvent548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalOutputEvent__Group__0_in_ruleInternalOutputEvent574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalInputEvent_in_entryRuleInternalInputEvent601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalInputEvent608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalInputEvent__Group__0_in_ruleInternalInputEvent634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOutputEvent_in_entryRuleExternalOutputEvent661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalOutputEvent668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalOutputEvent__Group__0_in_ruleExternalOutputEvent694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalInputEvent_in_entryRuleExternalInputEvent721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalInputEvent728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalInputEvent__Group__0_in_ruleExternalInputEvent754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentInstantiationNode_in_entryRuleComponentInstantiationNode781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentInstantiationNode788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentInstantiationNode__Alternatives_in_ruleComponentInstantiationNode814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAll_in_entryRuleForAll841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForAll848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__Group__0_in_ruleForAll874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForSome_in_entryRuleForSome901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForSome908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForSome__Group__0_in_ruleForSome934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtLeastOne_in_entryRuleAtLeastOne961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtLeastOne968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtLeastOne__Group__0_in_ruleAtLeastOne994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForOneArbitrary_in_entryRuleForOneArbitrary1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForOneArbitrary1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForOneArbitrary__Group__0_in_ruleForOneArbitrary1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentInstantiation_in_entryRuleComponentInstantiation1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentInstantiation1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentInstantiation__Group__0_in_ruleComponentInstantiation1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryRelation_in_entryRuleBinaryRelation1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryRelation1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryRelation__Group__0_in_ruleBinaryRelation1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_entryRuleBinaryExpression1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryExpression1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpression__Group__0_in_ruleBinaryExpression1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ObjectAssignment_in_ruleReference1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group__0_in_ruleIdentifier1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_entryRuleFunctionApplication1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionApplication1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionApplication__Group__0_in_ruleFunctionApplication1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketedExpression_in_entryRuleBracketedExpression1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBracketedExpression1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BracketedExpression__Group__0_in_ruleBracketedExpression1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__0_in_ruleCardinality1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeratedSet_in_entryRuleEnumeratedSet1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeratedSet1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumeratedSet__Group__0_in_ruleEnumeratedSet1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuzzyExp_in_entryRuleFuzzyExp1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuzzyExp1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuzzyExp__Group__0_in_ruleFuzzyExp1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinarySymbol__Alternatives_in_rulebinarySymbol1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryOperator__Alternatives_in_ruleBinaryOperator1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehaviorNode_in_rule__Node__Alternatives1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentInstantiationNode_in_rule__Node__Alternatives1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRealisation_in_rule__Behavior__Alternatives1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeRealisation_in_rule__Behavior__Alternatives1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Behavior__Alternatives1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_rule__Behavior__Alternatives1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_rule__Behavior__Alternatives1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalOutputEvent_in_rule__Behavior__Alternatives2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalInputEvent_in_rule__Behavior__Alternatives2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOutputEvent_in_rule__Behavior__Alternatives2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalInputEvent_in_rule__Behavior__Alternatives2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAll_in_rule__ComponentInstantiationNode__Alternatives2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForSome_in_rule__ComponentInstantiationNode__Alternatives2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtLeastOne_in_rule__ComponentInstantiationNode__Alternatives2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForOneArbitrary_in_rule__ComponentInstantiationNode__Alternatives2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Value__Alternatives2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Value__Alternatives2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_rule__Value__Alternatives2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketedExpression_in_rule__Value__Alternatives2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Value__Alternatives2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeratedSet_in_rule__Value__Alternatives2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuzzyExp_in_rule__Value__Alternatives2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BinarySymbol__Alternatives2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BinarySymbol__Alternatives2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BinarySymbol__Alternatives2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BinarySymbol__Alternatives2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BinarySymbol__Alternatives2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BinarySymbol__Alternatives2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BinarySymbol__Alternatives2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BinaryOperator__Alternatives2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BinaryOperator__Alternatives2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BinaryOperator__Alternatives2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BehaviorNode__Group__0__Impl_in_rule__BehaviorNode__Group__02554 = new BitSet(new long[]{0x000000001F201800L});
    public static final BitSet FOLLOW_rule__BehaviorNode__Group__1_in_rule__BehaviorNode__Group__02557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BehaviorNode__ComponentAssignment_0_in_rule__BehaviorNode__Group__0__Impl2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BehaviorNode__Group__1__Impl_in_rule__BehaviorNode__Group__12614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BehaviorNode__BehaviorAssignment_1_in_rule__BehaviorNode__Group__1__Impl2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateRealisation__Group__0__Impl_in_rule__StateRealisation__Group__02675 = new BitSet(new long[]{0x000000D000200030L});
    public static final BitSet FOLLOW_rule__StateRealisation__Group__1_in_rule__StateRealisation__Group__02678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StateRealisation__Group__0__Impl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateRealisation__Group__1__Impl_in_rule__StateRealisation__Group__12737 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__StateRealisation__Group__2_in_rule__StateRealisation__Group__12740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateRealisation__StateAssignment_1_in_rule__StateRealisation__Group__1__Impl2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateRealisation__Group__2__Impl_in_rule__StateRealisation__Group__22797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StateRealisation__Group__2__Impl2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeRealisation__Group__0__Impl_in_rule__AttributeRealisation__Group__02862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttributeRealisation__Group__1_in_rule__AttributeRealisation__Group__02865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AttributeRealisation__Group__0__Impl2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeRealisation__Group__1__Impl_in_rule__AttributeRealisation__Group__12924 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__AttributeRealisation__Group__2_in_rule__AttributeRealisation__Group__12927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeRealisation__AttributeAssignment_1_in_rule__AttributeRealisation__Group__1__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeRealisation__Group__2__Impl_in_rule__AttributeRealisation__Group__22984 = new BitSet(new long[]{0x000000D000200030L});
    public static final BitSet FOLLOW_rule__AttributeRealisation__Group__3_in_rule__AttributeRealisation__Group__22987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AttributeRealisation__Group__2__Impl3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeRealisation__Group__3__Impl_in_rule__AttributeRealisation__Group__33046 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__AttributeRealisation__Group__4_in_rule__AttributeRealisation__Group__33049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeRealisation__ValueAssignment_3_in_rule__AttributeRealisation__Group__3__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeRealisation__Group__4__Impl_in_rule__AttributeRealisation__Group__43106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AttributeRealisation__Group__4__Impl3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__03175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__03178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Selection__Group__0__Impl3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__13237 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__13240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_rule__Selection__Group__1__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__23296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Selection__Group__2__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Event__Group__0__Impl3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13423 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__13426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_rule__Event__Group__1__Impl3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__23482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Event__Group__2__Impl3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__03547 = new BitSet(new long[]{0x000000D000200030L});
    public static final BitSet FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__03550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Guard__Group__0__Impl3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__13609 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__13612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__StateAssignment_1_in_rule__Guard__Group__1__Impl3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__23669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Guard__Group__2__Impl3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalOutputEvent__Group__0__Impl_in_rule__InternalOutputEvent__Group__03734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InternalOutputEvent__Group__1_in_rule__InternalOutputEvent__Group__03737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__InternalOutputEvent__Group__0__Impl3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalOutputEvent__Group__1__Impl_in_rule__InternalOutputEvent__Group__13796 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__InternalOutputEvent__Group__2_in_rule__InternalOutputEvent__Group__13799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_rule__InternalOutputEvent__Group__1__Impl3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalOutputEvent__Group__2__Impl_in_rule__InternalOutputEvent__Group__23855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__InternalOutputEvent__Group__2__Impl3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalInputEvent__Group__0__Impl_in_rule__InternalInputEvent__Group__03920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InternalInputEvent__Group__1_in_rule__InternalInputEvent__Group__03923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__InternalInputEvent__Group__0__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalInputEvent__Group__1__Impl_in_rule__InternalInputEvent__Group__13982 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__InternalInputEvent__Group__2_in_rule__InternalInputEvent__Group__13985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_rule__InternalInputEvent__Group__1__Impl4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalInputEvent__Group__2__Impl_in_rule__InternalInputEvent__Group__24041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__InternalInputEvent__Group__2__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalOutputEvent__Group__0__Impl_in_rule__ExternalOutputEvent__Group__04106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalOutputEvent__Group__1_in_rule__ExternalOutputEvent__Group__04109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ExternalOutputEvent__Group__0__Impl4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalOutputEvent__Group__1__Impl_in_rule__ExternalOutputEvent__Group__14168 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ExternalOutputEvent__Group__2_in_rule__ExternalOutputEvent__Group__14171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_rule__ExternalOutputEvent__Group__1__Impl4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalOutputEvent__Group__2__Impl_in_rule__ExternalOutputEvent__Group__24227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ExternalOutputEvent__Group__2__Impl4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalInputEvent__Group__0__Impl_in_rule__ExternalInputEvent__Group__04292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalInputEvent__Group__1_in_rule__ExternalInputEvent__Group__04295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ExternalInputEvent__Group__0__Impl4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalInputEvent__Group__1__Impl_in_rule__ExternalInputEvent__Group__14354 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ExternalInputEvent__Group__2_in_rule__ExternalInputEvent__Group__14357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionApplication_in_rule__ExternalInputEvent__Group__1__Impl4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalInputEvent__Group__2__Impl_in_rule__ExternalInputEvent__Group__24413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ExternalInputEvent__Group__2__Impl4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__Group__0__Impl_in_rule__ForAll__Group__04478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForAll__Group__1_in_rule__ForAll__Group__04481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ForAll__Group__0__Impl4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__Group__1__Impl_in_rule__ForAll__Group__14540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentInstantiation_in_rule__ForAll__Group__1__Impl4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForSome__Group__0__Impl_in_rule__ForSome__Group__04600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForSome__Group__1_in_rule__ForSome__Group__04603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ForSome__Group__0__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForSome__Group__1__Impl_in_rule__ForSome__Group__14662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentInstantiation_in_rule__ForSome__Group__1__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtLeastOne__Group__0__Impl_in_rule__AtLeastOne__Group__04722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AtLeastOne__Group__1_in_rule__AtLeastOne__Group__04725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AtLeastOne__Group__0__Impl4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtLeastOne__Group__1__Impl_in_rule__AtLeastOne__Group__14784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentInstantiation_in_rule__AtLeastOne__Group__1__Impl4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForOneArbitrary__Group__0__Impl_in_rule__ForOneArbitrary__Group__04844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForOneArbitrary__Group__1_in_rule__ForOneArbitrary__Group__04847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ForOneArbitrary__Group__0__Impl4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForOneArbitrary__Group__1__Impl_in_rule__ForOneArbitrary__Group__14906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentInstantiation_in_rule__ForOneArbitrary__Group__1__Impl4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentInstantiation__Group__0__Impl_in_rule__ComponentInstantiation__Group__04966 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ComponentInstantiation__Group__1_in_rule__ComponentInstantiation__Group__04969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentInstantiation__ComponentAssignment_0_in_rule__ComponentInstantiation__Group__0__Impl4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentInstantiation__Group__1__Impl_in_rule__ComponentInstantiation__Group__15026 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ComponentInstantiation__Group__2_in_rule__ComponentInstantiation__Group__15029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ComponentInstantiation__Group__1__Impl5057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentInstantiation__Group__2__Impl_in_rule__ComponentInstantiation__Group__25088 = new BitSet(new long[]{0x000000D000200030L});
    public static final BitSet FOLLOW_rule__ComponentInstantiation__Group__3_in_rule__ComponentInstantiation__Group__25091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComponentInstantiation__Group__2__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentInstantiation__Group__3__Impl_in_rule__ComponentInstantiation__Group__35150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentInstantiation__ComponentSetAssignment_3_in_rule__ComponentInstantiation__Group__3__Impl5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryRelation__Group__0__Impl_in_rule__BinaryRelation__Group__05215 = new BitSet(new long[]{0x000000D000200030L});
    public static final BitSet FOLLOW_rule__BinaryRelation__Group__1_in_rule__BinaryRelation__Group__05218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__BinaryRelation__Group__0__Impl5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryRelation__Group__1__Impl_in_rule__BinaryRelation__Group__15280 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_rule__BinaryRelation__Group__2_in_rule__BinaryRelation__Group__15283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryRelation__LeftAssignment_1_in_rule__BinaryRelation__Group__1__Impl5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryRelation__Group__2__Impl_in_rule__BinaryRelation__Group__25340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryRelation__Group_2__0_in_rule__BinaryRelation__Group__2__Impl5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryRelation__Group_2__0__Impl_in_rule__BinaryRelation__Group_2__05404 = new BitSet(new long[]{0x000000D000200030L});
    public static final BitSet FOLLOW_rule__BinaryRelation__Group_2__1_in_rule__BinaryRelation__Group_2__05407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryRelation__OperatorAssignment_2_0_in_rule__BinaryRelation__Group_2__0__Impl5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryRelation__Group_2__1__Impl_in_rule__BinaryRelation__Group_2__15464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryRelation__RightAssignment_2_1_in_rule__BinaryRelation__Group_2__1__Impl5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpression__Group__0__Impl_in_rule__BinaryExpression__Group__05525 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__BinaryExpression__Group__1_in_rule__BinaryExpression__Group__05528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpression__LeftExpressionAssignment_0_in_rule__BinaryExpression__Group__0__Impl5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpression__Group__1__Impl_in_rule__BinaryExpression__Group__15585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpression__Group_1__0_in_rule__BinaryExpression__Group__1__Impl5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpression__Group_1__0__Impl_in_rule__BinaryExpression__Group_1__05647 = new BitSet(new long[]{0x000000D000200030L});
    public static final BitSet FOLLOW_rule__BinaryExpression__Group_1__1_in_rule__BinaryExpression__Group_1__05650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpression__OperatorAssignment_1_0_in_rule__BinaryExpression__Group_1__0__Impl5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpression__Group_1__1__Impl_in_rule__BinaryExpression__Group_1__15707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpression__RightExpressionAssignment_1_1_in_rule__BinaryExpression__Group_1__1__Impl5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__05768 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__05771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__Group__0__Impl5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__15827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group_1__0_in_rule__Identifier__Group__1__Impl5854 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group_1__0__Impl_in_rule__Identifier__Group_1__05889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Identifier__Group_1__1_in_rule__Identifier__Group_1__05892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Identifier__Group_1__0__Impl5920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group_1__1__Impl_in_rule__Identifier__Group_1__15951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__Group_1__1__Impl5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionApplication__Group__0__Impl_in_rule__FunctionApplication__Group__06011 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FunctionApplication__Group__1_in_rule__FunctionApplication__Group__06014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionApplication__FunctionNameAssignment_0_in_rule__FunctionApplication__Group__0__Impl6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionApplication__Group__1__Impl_in_rule__FunctionApplication__Group__16071 = new BitSet(new long[]{0x000000D000200030L});
    public static final BitSet FOLLOW_rule__FunctionApplication__Group__2_in_rule__FunctionApplication__Group__16074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FunctionApplication__Group__1__Impl6102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionApplication__Group__2__Impl_in_rule__FunctionApplication__Group__26133 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__FunctionApplication__Group__3_in_rule__FunctionApplication__Group__26136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionApplication__ParameterAssignment_2_in_rule__FunctionApplication__Group__2__Impl6163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionApplication__Group__3__Impl_in_rule__FunctionApplication__Group__36193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FunctionApplication__Group__3__Impl6221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BracketedExpression__Group__0__Impl_in_rule__BracketedExpression__Group__06260 = new BitSet(new long[]{0x000000D400200030L});
    public static final BitSet FOLLOW_rule__BracketedExpression__Group__1_in_rule__BracketedExpression__Group__06263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__BracketedExpression__Group__0__Impl6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BracketedExpression__Group__1__Impl_in_rule__BracketedExpression__Group__16322 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__BracketedExpression__Group__2_in_rule__BracketedExpression__Group__16325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BracketedExpression__ExpressionAssignment_1_in_rule__BracketedExpression__Group__1__Impl6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BracketedExpression__Group__2__Impl_in_rule__BracketedExpression__Group__26382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__BracketedExpression__Group__2__Impl6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__0__Impl_in_rule__Cardinality__Group__06447 = new BitSet(new long[]{0x000000D000200030L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__1_in_rule__Cardinality__Group__06450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Cardinality__Group__0__Impl6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__1__Impl_in_rule__Cardinality__Group__16509 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__2_in_rule__Cardinality__Group__16512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__ExpressionAssignment_1_in_rule__Cardinality__Group__1__Impl6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__2__Impl_in_rule__Cardinality__Group__26569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Cardinality__Group__2__Impl6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumeratedSet__Group__0__Impl_in_rule__EnumeratedSet__Group__06634 = new BitSet(new long[]{0x000000D000200030L});
    public static final BitSet FOLLOW_rule__EnumeratedSet__Group__1_in_rule__EnumeratedSet__Group__06637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EnumeratedSet__Group__0__Impl6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumeratedSet__Group__1__Impl_in_rule__EnumeratedSet__Group__16696 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EnumeratedSet__Group__2_in_rule__EnumeratedSet__Group__16699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumeratedSet__ExpressionsAssignment_1_in_rule__EnumeratedSet__Group__1__Impl6726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumeratedSet__Group__2__Impl_in_rule__EnumeratedSet__Group__26756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EnumeratedSet__Group__2__Impl6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuzzyExp__Group__0__Impl_in_rule__FuzzyExp__Group__06821 = new BitSet(new long[]{0x000000D000200030L});
    public static final BitSet FOLLOW_rule__FuzzyExp__Group__1_in_rule__FuzzyExp__Group__06824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FuzzyExp__Group__0__Impl6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuzzyExp__Group__1__Impl_in_rule__FuzzyExp__Group__16883 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FuzzyExp__Group__2_in_rule__FuzzyExp__Group__16886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuzzyExp__ExpressionAssignment_1_in_rule__FuzzyExp__Group__1__Impl6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuzzyExp__Group__2__Impl_in_rule__FuzzyExp__Group__26943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FuzzyExp__Group__2__Impl6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__BehaviorNode__ComponentAssignment_07013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehavior_in_rule__BehaviorNode__BehaviorAssignment_17044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_rule__StateRealisation__StateAssignment_17075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__AttributeRealisation__AttributeAssignment_17106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_rule__AttributeRealisation__ValueAssignment_37137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_rule__Guard__StateAssignment_17168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__ComponentInstantiation__ComponentAssignment_07199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_rule__ComponentInstantiation__ComponentSetAssignment_37230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_rule__BinaryRelation__LeftAssignment_17261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebinarySymbol_in_rule__BinaryRelation__OperatorAssignment_2_07292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_rule__BinaryRelation__RightAssignment_2_17323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__BinaryExpression__LeftExpressionAssignment_07354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperator_in_rule__BinaryExpression__OperatorAssignment_1_07385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_rule__BinaryExpression__RightExpressionAssignment_1_17416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Reference__ObjectAssignment7447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__ValueAssignment7478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__FunctionApplication__FunctionNameAssignment_07509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_rule__FunctionApplication__ParameterAssignment_27540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryRelation_in_rule__BracketedExpression__ExpressionAssignment_17571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_rule__Cardinality__ExpressionAssignment_17602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_rule__EnumeratedSet__ExpressionsAssignment_17633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpression_in_rule__FuzzyExp__ExpressionAssignment_17664 = new BitSet(new long[]{0x0000000000000002L});

}