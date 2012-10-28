package org.be.textbe.bt2sal2.xtext.sal.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.be.textbe.bt2sal2.xtext.sal.services.SalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIERS", "RULE_NUMERALS", "RULE_WS", "RULE_ANY_OTHER", "': CONTEXT ='", "'BEGIN'", "'END'", "';'", "': TYPE'", "'='", "'BOOLEAN'", "'{'", "'}'", "'!'", "'['", "'..'", "']'", "','", "': MODULE ='", "'INPUT'", "'OUTPUT'", "'LOCAL'", "'DEFINITION'", "'INITIALIZATION'", "'TRANSITION'", "': '", "'\\''", "'[]'", "'-->'", "':'", "'ELSE -->'", "'('", "')'", "'.'"
    };
    public static final int RULE_IDENTIFIERS=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
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
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int RULE_NUMERALS=5;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int RULE_WS=6;

    // delegates
    // delegators


        public InternalSalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSalParser.tokenNames; }
    public String getGrammarFileName() { return "../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g"; }



     	private SalGrammarAccess grammarAccess;
     	
        public InternalSalParser(TokenStream input, SalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Context";	
       	}
       	
       	@Override
       	protected SalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleContext"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:67:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:68:2: (iv_ruleContext= ruleContext EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:69:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext75);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext85); 

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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:76:1: ruleContext returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': CONTEXT =' ( (lv_contextBody_2_0= ruleContextBody ) ) ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        EObject lv_contextBody_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:79:28: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': CONTEXT =' ( (lv_contextBody_2_0= ruleContextBody ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:80:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': CONTEXT =' ( (lv_contextBody_2_0= ruleContextBody ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:80:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': CONTEXT =' ( (lv_contextBody_2_0= ruleContextBody ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:80:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': CONTEXT =' ( (lv_contextBody_2_0= ruleContextBody ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:80:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:81:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:81:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:82:3: lv_identifier_0_0= RULE_IDENTIFIERS
            {
            lv_identifier_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleContext127); 

            			newLeafNode(lv_identifier_0_0, grammarAccess.getContextAccess().getIdentifierIDENTIFIERSTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"identifier",
                    		lv_identifier_0_0, 
                    		"IDENTIFIERS");
            	    

            }


            }

            otherlv_1=(Token)match(input,8,FOLLOW_8_in_ruleContext144); 

                	newLeafNode(otherlv_1, grammarAccess.getContextAccess().getCONTEXTKeyword_1());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:102:1: ( (lv_contextBody_2_0= ruleContextBody ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:103:1: (lv_contextBody_2_0= ruleContextBody )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:103:1: (lv_contextBody_2_0= ruleContextBody )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:104:3: lv_contextBody_2_0= ruleContextBody
            {
             
            	        newCompositeNode(grammarAccess.getContextAccess().getContextBodyContextBodyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleContextBody_in_ruleContext165);
            lv_contextBody_2_0=ruleContextBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextRule());
            	        }
                   		set(
                   			current, 
                   			"contextBody",
                    		lv_contextBody_2_0, 
                    		"ContextBody");
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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleContextBody"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:128:1: entryRuleContextBody returns [EObject current=null] : iv_ruleContextBody= ruleContextBody EOF ;
    public final EObject entryRuleContextBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextBody = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:129:2: (iv_ruleContextBody= ruleContextBody EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:130:2: iv_ruleContextBody= ruleContextBody EOF
            {
             newCompositeNode(grammarAccess.getContextBodyRule()); 
            pushFollow(FOLLOW_ruleContextBody_in_entryRuleContextBody201);
            iv_ruleContextBody=ruleContextBody();

            state._fsp--;

             current =iv_ruleContextBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextBody211); 

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
    // $ANTLR end "entryRuleContextBody"


    // $ANTLR start "ruleContextBody"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:137:1: ruleContextBody returns [EObject current=null] : (otherlv_0= 'BEGIN' ( (lv_declarations_1_0= ruleDeclarations ) ) otherlv_2= 'END' ) ;
    public final EObject ruleContextBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_declarations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:140:28: ( (otherlv_0= 'BEGIN' ( (lv_declarations_1_0= ruleDeclarations ) ) otherlv_2= 'END' ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:141:1: (otherlv_0= 'BEGIN' ( (lv_declarations_1_0= ruleDeclarations ) ) otherlv_2= 'END' )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:141:1: (otherlv_0= 'BEGIN' ( (lv_declarations_1_0= ruleDeclarations ) ) otherlv_2= 'END' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:141:3: otherlv_0= 'BEGIN' ( (lv_declarations_1_0= ruleDeclarations ) ) otherlv_2= 'END'
            {
            otherlv_0=(Token)match(input,9,FOLLOW_9_in_ruleContextBody248); 

                	newLeafNode(otherlv_0, grammarAccess.getContextBodyAccess().getBEGINKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:145:1: ( (lv_declarations_1_0= ruleDeclarations ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:146:1: (lv_declarations_1_0= ruleDeclarations )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:146:1: (lv_declarations_1_0= ruleDeclarations )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:147:3: lv_declarations_1_0= ruleDeclarations
            {
             
            	        newCompositeNode(grammarAccess.getContextBodyAccess().getDeclarationsDeclarationsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDeclarations_in_ruleContextBody269);
            lv_declarations_1_0=ruleDeclarations();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextBodyRule());
            	        }
                   		set(
                   			current, 
                   			"declarations",
                    		lv_declarations_1_0, 
                    		"Declarations");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_10_in_ruleContextBody281); 

                	newLeafNode(otherlv_2, grammarAccess.getContextBodyAccess().getENDKeyword_2());
                

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
    // $ANTLR end "ruleContextBody"


    // $ANTLR start "entryRuleDeclarations"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:175:1: entryRuleDeclarations returns [EObject current=null] : iv_ruleDeclarations= ruleDeclarations EOF ;
    public final EObject entryRuleDeclarations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarations = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:176:2: (iv_ruleDeclarations= ruleDeclarations EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:177:2: iv_ruleDeclarations= ruleDeclarations EOF
            {
             newCompositeNode(grammarAccess.getDeclarationsRule()); 
            pushFollow(FOLLOW_ruleDeclarations_in_entryRuleDeclarations317);
            iv_ruleDeclarations=ruleDeclarations();

            state._fsp--;

             current =iv_ruleDeclarations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarations327); 

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
    // $ANTLR end "entryRuleDeclarations"


    // $ANTLR start "ruleDeclarations"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:184:1: ruleDeclarations returns [EObject current=null] : ( ( (lv_declaration_0_0= ruleDeclaration ) ) otherlv_1= ';' )+ ;
    public final EObject ruleDeclarations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_declaration_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:187:28: ( ( ( (lv_declaration_0_0= ruleDeclaration ) ) otherlv_1= ';' )+ )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:188:1: ( ( (lv_declaration_0_0= ruleDeclaration ) ) otherlv_1= ';' )+
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:188:1: ( ( (lv_declaration_0_0= ruleDeclaration ) ) otherlv_1= ';' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_IDENTIFIERS) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:188:2: ( (lv_declaration_0_0= ruleDeclaration ) ) otherlv_1= ';'
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:188:2: ( (lv_declaration_0_0= ruleDeclaration ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:189:1: (lv_declaration_0_0= ruleDeclaration )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:189:1: (lv_declaration_0_0= ruleDeclaration )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:190:3: lv_declaration_0_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getDeclarationDeclarationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleDeclarations373);
            	    lv_declaration_0_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaration",
            	            		lv_declaration_0_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleDeclarations385); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDeclarationsAccess().getSemicolonKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "ruleDeclarations"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:218:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:219:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:220:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration422);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration432); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:227:1: ruleDeclaration returns [EObject current=null] : (this_TypeDeclaration_0= ruleTypeDeclaration | this_ModuleDeclaration_1= ruleModuleDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDeclaration_0 = null;

        EObject this_ModuleDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:230:28: ( (this_TypeDeclaration_0= ruleTypeDeclaration | this_ModuleDeclaration_1= ruleModuleDeclaration ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:231:1: (this_TypeDeclaration_0= ruleTypeDeclaration | this_ModuleDeclaration_1= ruleModuleDeclaration )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:231:1: (this_TypeDeclaration_0= ruleTypeDeclaration | this_ModuleDeclaration_1= ruleModuleDeclaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_IDENTIFIERS) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==12) ) {
                    alt2=1;
                }
                else if ( (LA2_1==22) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:232:5: this_TypeDeclaration_0= ruleTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getTypeDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeDeclaration_in_ruleDeclaration479);
                    this_TypeDeclaration_0=ruleTypeDeclaration();

                    state._fsp--;

                     
                            current = this_TypeDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:242:5: this_ModuleDeclaration_1= ruleModuleDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getModuleDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleModuleDeclaration_in_ruleDeclaration506);
                    this_ModuleDeclaration_1=ruleModuleDeclaration();

                    state._fsp--;

                     
                            current = this_ModuleDeclaration_1; 
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleTypeDeclaration"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:258:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:259:2: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:260:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration541);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;

             current =iv_ruleTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDeclaration551); 

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
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:267:1: ruleTypeDeclaration returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': TYPE' (otherlv_2= '=' ( (lv_typeDef_3_0= ruleTypeDef ) ) )? ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_typeDef_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:270:28: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': TYPE' (otherlv_2= '=' ( (lv_typeDef_3_0= ruleTypeDef ) ) )? ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:271:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': TYPE' (otherlv_2= '=' ( (lv_typeDef_3_0= ruleTypeDef ) ) )? )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:271:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': TYPE' (otherlv_2= '=' ( (lv_typeDef_3_0= ruleTypeDef ) ) )? )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:271:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': TYPE' (otherlv_2= '=' ( (lv_typeDef_3_0= ruleTypeDef ) ) )?
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:271:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:272:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:272:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:273:3: lv_identifier_0_0= RULE_IDENTIFIERS
            {
            lv_identifier_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleTypeDeclaration593); 

            			newLeafNode(lv_identifier_0_0, grammarAccess.getTypeDeclarationAccess().getIdentifierIDENTIFIERSTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"identifier",
                    		lv_identifier_0_0, 
                    		"IDENTIFIERS");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleTypeDeclaration610); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeDeclarationAccess().getTYPEKeyword_1());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:293:1: (otherlv_2= '=' ( (lv_typeDef_3_0= ruleTypeDef ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:293:3: otherlv_2= '=' ( (lv_typeDef_3_0= ruleTypeDef ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleTypeDeclaration623); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeDeclarationAccess().getEqualsSignKeyword_2_0());
                        
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:297:1: ( (lv_typeDef_3_0= ruleTypeDef ) )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:298:1: (lv_typeDef_3_0= ruleTypeDef )
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:298:1: (lv_typeDef_3_0= ruleTypeDef )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:299:3: lv_typeDef_3_0= ruleTypeDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeDeclarationAccess().getTypeDefTypeDefParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeDef_in_ruleTypeDeclaration644);
                    lv_typeDef_3_0=ruleTypeDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"typeDef",
                            		lv_typeDef_3_0, 
                            		"TypeDef");
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
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleTypeDef"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:323:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:324:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:325:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
             newCompositeNode(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef682);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;

             current =iv_ruleTypeDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef692); 

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
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:332:1: ruleTypeDef returns [EObject current=null] : (this_Type_0= ruleType | this_ScalarType_1= ruleScalarType ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_ScalarType_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:335:28: ( (this_Type_0= ruleType | this_ScalarType_1= ruleScalarType ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:336:1: (this_Type_0= ruleType | this_ScalarType_1= ruleScalarType )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:336:1: (this_Type_0= ruleType | this_ScalarType_1= ruleScalarType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_IDENTIFIERS||LA4_0==14||LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:337:5: this_Type_0= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeDefAccess().getTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleTypeDef739);
                    this_Type_0=ruleType();

                    state._fsp--;

                     
                            current = this_Type_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:347:5: this_ScalarType_1= ruleScalarType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeDefAccess().getScalarTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleScalarType_in_ruleTypeDef766);
                    this_ScalarType_1=ruleScalarType();

                    state._fsp--;

                     
                            current = this_ScalarType_1; 
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
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleType"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:363:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:364:2: (iv_ruleType= ruleType EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:365:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType801);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType811); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:372:1: ruleType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_Name_1= ruleName | this_QualifiedName_2= ruleQualifiedName | this_Subrange_3= ruleSubrange ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_Name_1 = null;

        EObject this_QualifiedName_2 = null;

        EObject this_Subrange_3 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:375:28: ( (this_BasicType_0= ruleBasicType | this_Name_1= ruleName | this_QualifiedName_2= ruleQualifiedName | this_Subrange_3= ruleSubrange ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:376:1: (this_BasicType_0= ruleBasicType | this_Name_1= ruleName | this_QualifiedName_2= ruleQualifiedName | this_Subrange_3= ruleSubrange )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:376:1: (this_BasicType_0= ruleBasicType | this_Name_1= ruleName | this_QualifiedName_2= ruleQualifiedName | this_Subrange_3= ruleSubrange )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case RULE_IDENTIFIERS:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF||LA5_2==RULE_IDENTIFIERS||(LA5_2>=10 && LA5_2<=11)||LA5_2==16||LA5_2==21||(LA5_2>=23 && LA5_2<=28)) ) {
                    alt5=2;
                }
                else if ( (LA5_2==15) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:377:5: this_BasicType_0= ruleBasicType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBasicTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_ruleType858);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;

                     
                            current = this_BasicType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:387:5: this_Name_1= ruleName
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getNameParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleName_in_ruleType885);
                    this_Name_1=ruleName();

                    state._fsp--;

                     
                            current = this_Name_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:397:5: this_QualifiedName_2= ruleQualifiedName
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getQualifiedNameParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleType912);
                    this_QualifiedName_2=ruleQualifiedName();

                    state._fsp--;

                     
                            current = this_QualifiedName_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:407:5: this_Subrange_3= ruleSubrange
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSubrangeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSubrange_in_ruleType939);
                    this_Subrange_3=ruleSubrange();

                    state._fsp--;

                     
                            current = this_Subrange_3; 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBasicType"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:423:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:424:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:425:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType974);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType984); 

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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:432:1: ruleBasicType returns [EObject current=null] : ( (lv_type_0_0= 'BOOLEAN' ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:435:28: ( ( (lv_type_0_0= 'BOOLEAN' ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:436:1: ( (lv_type_0_0= 'BOOLEAN' ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:436:1: ( (lv_type_0_0= 'BOOLEAN' ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:437:1: (lv_type_0_0= 'BOOLEAN' )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:437:1: (lv_type_0_0= 'BOOLEAN' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:438:3: lv_type_0_0= 'BOOLEAN'
            {
            lv_type_0_0=(Token)match(input,14,FOLLOW_14_in_ruleBasicType1026); 

                    newLeafNode(lv_type_0_0, grammarAccess.getBasicTypeAccess().getTypeBOOLEANKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBasicTypeRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "BOOLEAN");
            	    

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:459:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:460:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:461:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1074);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1084); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:468:1: ruleQualifiedName returns [EObject current=null] : ( ( (lv_identifier1_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '{' ( (lv_actualParameters_2_0= ruleActualParameters ) )? otherlv_3= '}' otherlv_4= '!' ( (lv_identifier2_5_0= RULE_IDENTIFIERS ) ) ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier1_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_identifier2_5_0=null;
        EObject lv_actualParameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:471:28: ( ( ( (lv_identifier1_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '{' ( (lv_actualParameters_2_0= ruleActualParameters ) )? otherlv_3= '}' otherlv_4= '!' ( (lv_identifier2_5_0= RULE_IDENTIFIERS ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:472:1: ( ( (lv_identifier1_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '{' ( (lv_actualParameters_2_0= ruleActualParameters ) )? otherlv_3= '}' otherlv_4= '!' ( (lv_identifier2_5_0= RULE_IDENTIFIERS ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:472:1: ( ( (lv_identifier1_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '{' ( (lv_actualParameters_2_0= ruleActualParameters ) )? otherlv_3= '}' otherlv_4= '!' ( (lv_identifier2_5_0= RULE_IDENTIFIERS ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:472:2: ( (lv_identifier1_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '{' ( (lv_actualParameters_2_0= ruleActualParameters ) )? otherlv_3= '}' otherlv_4= '!' ( (lv_identifier2_5_0= RULE_IDENTIFIERS ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:472:2: ( (lv_identifier1_0_0= RULE_IDENTIFIERS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:473:1: (lv_identifier1_0_0= RULE_IDENTIFIERS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:473:1: (lv_identifier1_0_0= RULE_IDENTIFIERS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:474:3: lv_identifier1_0_0= RULE_IDENTIFIERS
            {
            lv_identifier1_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleQualifiedName1126); 

            			newLeafNode(lv_identifier1_0_0, grammarAccess.getQualifiedNameAccess().getIdentifier1IDENTIFIERSTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQualifiedNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"identifier1",
                    		lv_identifier1_0_0, 
                    		"IDENTIFIERS");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName1143); 

                	newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:494:1: ( (lv_actualParameters_2_0= ruleActualParameters ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_IDENTIFIERS||LA6_0==14||LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:495:1: (lv_actualParameters_2_0= ruleActualParameters )
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:495:1: (lv_actualParameters_2_0= ruleActualParameters )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:496:3: lv_actualParameters_2_0= ruleActualParameters
                    {
                     
                    	        newCompositeNode(grammarAccess.getQualifiedNameAccess().getActualParametersActualParametersParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActualParameters_in_ruleQualifiedName1164);
                    lv_actualParameters_2_0=ruleActualParameters();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQualifiedNameRule());
                    	        }
                           		set(
                           			current, 
                           			"actualParameters",
                            		lv_actualParameters_2_0, 
                            		"ActualParameters");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName1177); 

                	newLeafNode(otherlv_3, grammarAccess.getQualifiedNameAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedName1189); 

                	newLeafNode(otherlv_4, grammarAccess.getQualifiedNameAccess().getExclamationMarkKeyword_4());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:520:1: ( (lv_identifier2_5_0= RULE_IDENTIFIERS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:521:1: (lv_identifier2_5_0= RULE_IDENTIFIERS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:521:1: (lv_identifier2_5_0= RULE_IDENTIFIERS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:522:3: lv_identifier2_5_0= RULE_IDENTIFIERS
            {
            lv_identifier2_5_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleQualifiedName1206); 

            			newLeafNode(lv_identifier2_5_0, grammarAccess.getQualifiedNameAccess().getIdentifier2IDENTIFIERSTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQualifiedNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"identifier2",
                    		lv_identifier2_5_0, 
                    		"IDENTIFIERS");
            	    

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleActualParameters"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:546:1: entryRuleActualParameters returns [EObject current=null] : iv_ruleActualParameters= ruleActualParameters EOF ;
    public final EObject entryRuleActualParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualParameters = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:547:2: (iv_ruleActualParameters= ruleActualParameters EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:548:2: iv_ruleActualParameters= ruleActualParameters EOF
            {
             newCompositeNode(grammarAccess.getActualParametersRule()); 
            pushFollow(FOLLOW_ruleActualParameters_in_entryRuleActualParameters1247);
            iv_ruleActualParameters=ruleActualParameters();

            state._fsp--;

             current =iv_ruleActualParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualParameters1257); 

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
    // $ANTLR end "entryRuleActualParameters"


    // $ANTLR start "ruleActualParameters"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:555:1: ruleActualParameters returns [EObject current=null] : this_Type_0= ruleType ;
    public final EObject ruleActualParameters() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:558:28: (this_Type_0= ruleType )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:560:5: this_Type_0= ruleType
            {
             
                    newCompositeNode(grammarAccess.getActualParametersAccess().getTypeParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleType_in_ruleActualParameters1303);
            this_Type_0=ruleType();

            state._fsp--;

             
                    current = this_Type_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleActualParameters"


    // $ANTLR start "entryRuleSubrange"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:576:1: entryRuleSubrange returns [EObject current=null] : iv_ruleSubrange= ruleSubrange EOF ;
    public final EObject entryRuleSubrange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrange = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:577:2: (iv_ruleSubrange= ruleSubrange EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:578:2: iv_ruleSubrange= ruleSubrange EOF
            {
             newCompositeNode(grammarAccess.getSubrangeRule()); 
            pushFollow(FOLLOW_ruleSubrange_in_entryRuleSubrange1337);
            iv_ruleSubrange=ruleSubrange();

            state._fsp--;

             current =iv_ruleSubrange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubrange1347); 

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
    // $ANTLR end "entryRuleSubrange"


    // $ANTLR start "ruleSubrange"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:585:1: ruleSubrange returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleBound ) ) otherlv_4= ']' ) ;
    public final EObject ruleSubrange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lowerBound_1_0 = null;

        EObject lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:588:28: ( (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleBound ) ) otherlv_4= ']' ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:589:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleBound ) ) otherlv_4= ']' )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:589:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleBound ) ) otherlv_4= ']' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:589:3: otherlv_0= '[' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleBound ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleSubrange1384); 

                	newLeafNode(otherlv_0, grammarAccess.getSubrangeAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:593:1: ( (lv_lowerBound_1_0= ruleBound ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:594:1: (lv_lowerBound_1_0= ruleBound )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:594:1: (lv_lowerBound_1_0= ruleBound )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:595:3: lv_lowerBound_1_0= ruleBound
            {
             
            	        newCompositeNode(grammarAccess.getSubrangeAccess().getLowerBoundBoundParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBound_in_ruleSubrange1405);
            lv_lowerBound_1_0=ruleBound();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangeRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_1_0, 
                    		"Bound");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleSubrange1417); 

                	newLeafNode(otherlv_2, grammarAccess.getSubrangeAccess().getFullStopFullStopKeyword_2());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:615:1: ( (lv_upperBound_3_0= ruleBound ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:616:1: (lv_upperBound_3_0= ruleBound )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:616:1: (lv_upperBound_3_0= ruleBound )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:617:3: lv_upperBound_3_0= ruleBound
            {
             
            	        newCompositeNode(grammarAccess.getSubrangeAccess().getUpperBoundBoundParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBound_in_ruleSubrange1438);
            lv_upperBound_3_0=ruleBound();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangeRule());
            	        }
                   		set(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_3_0, 
                    		"Bound");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleSubrange1450); 

                	newLeafNode(otherlv_4, grammarAccess.getSubrangeAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleSubrange"


    // $ANTLR start "entryRuleBound"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:645:1: entryRuleBound returns [EObject current=null] : iv_ruleBound= ruleBound EOF ;
    public final EObject entryRuleBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:646:2: (iv_ruleBound= ruleBound EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:647:2: iv_ruleBound= ruleBound EOF
            {
             newCompositeNode(grammarAccess.getBoundRule()); 
            pushFollow(FOLLOW_ruleBound_in_entryRuleBound1486);
            iv_ruleBound=ruleBound();

            state._fsp--;

             current =iv_ruleBound; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBound1496); 

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
    // $ANTLR end "entryRuleBound"


    // $ANTLR start "ruleBound"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:654:1: ruleBound returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleBound() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:657:28: (this_Expression_0= ruleExpression )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:659:5: this_Expression_0= ruleExpression
            {
             
                    newCompositeNode(grammarAccess.getBoundAccess().getExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleBound1542);
            this_Expression_0=ruleExpression();

            state._fsp--;

             
                    current = this_Expression_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleBound"


    // $ANTLR start "entryRuleScalarType"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:675:1: entryRuleScalarType returns [EObject current=null] : iv_ruleScalarType= ruleScalarType EOF ;
    public final EObject entryRuleScalarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarType = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:676:2: (iv_ruleScalarType= ruleScalarType EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:677:2: iv_ruleScalarType= ruleScalarType EOF
            {
             newCompositeNode(grammarAccess.getScalarTypeRule()); 
            pushFollow(FOLLOW_ruleScalarType_in_entryRuleScalarType1576);
            iv_ruleScalarType=ruleScalarType();

            state._fsp--;

             current =iv_ruleScalarType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarType1586); 

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
    // $ANTLR end "entryRuleScalarType"


    // $ANTLR start "ruleScalarType"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:684:1: ruleScalarType returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_nextType_1_0= RULE_IDENTIFIERS ) ) (otherlv_2= ',' )? )+ otherlv_3= '}' ) ;
    public final EObject ruleScalarType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nextType_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:687:28: ( (otherlv_0= '{' ( ( (lv_nextType_1_0= RULE_IDENTIFIERS ) ) (otherlv_2= ',' )? )+ otherlv_3= '}' ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:688:1: (otherlv_0= '{' ( ( (lv_nextType_1_0= RULE_IDENTIFIERS ) ) (otherlv_2= ',' )? )+ otherlv_3= '}' )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:688:1: (otherlv_0= '{' ( ( (lv_nextType_1_0= RULE_IDENTIFIERS ) ) (otherlv_2= ',' )? )+ otherlv_3= '}' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:688:3: otherlv_0= '{' ( ( (lv_nextType_1_0= RULE_IDENTIFIERS ) ) (otherlv_2= ',' )? )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleScalarType1623); 

                	newLeafNode(otherlv_0, grammarAccess.getScalarTypeAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:692:1: ( ( (lv_nextType_1_0= RULE_IDENTIFIERS ) ) (otherlv_2= ',' )? )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_IDENTIFIERS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:692:2: ( (lv_nextType_1_0= RULE_IDENTIFIERS ) ) (otherlv_2= ',' )?
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:692:2: ( (lv_nextType_1_0= RULE_IDENTIFIERS ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:693:1: (lv_nextType_1_0= RULE_IDENTIFIERS )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:693:1: (lv_nextType_1_0= RULE_IDENTIFIERS )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:694:3: lv_nextType_1_0= RULE_IDENTIFIERS
            	    {
            	    lv_nextType_1_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleScalarType1641); 

            	    			newLeafNode(lv_nextType_1_0, grammarAccess.getScalarTypeAccess().getNextTypeIDENTIFIERSTerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScalarTypeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"nextType",
            	            		lv_nextType_1_0, 
            	            		"IDENTIFIERS");
            	    	    

            	    }


            	    }

            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:710:2: (otherlv_2= ',' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==21) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:710:4: otherlv_2= ','
            	            {
            	            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleScalarType1659); 

            	                	newLeafNode(otherlv_2, grammarAccess.getScalarTypeAccess().getCommaKeyword_1_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleScalarType1675); 

                	newLeafNode(otherlv_3, grammarAccess.getScalarTypeAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleScalarType"


    // $ANTLR start "entryRuleModuleDeclaration"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:726:1: entryRuleModuleDeclaration returns [EObject current=null] : iv_ruleModuleDeclaration= ruleModuleDeclaration EOF ;
    public final EObject entryRuleModuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleDeclaration = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:727:2: (iv_ruleModuleDeclaration= ruleModuleDeclaration EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:728:2: iv_ruleModuleDeclaration= ruleModuleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getModuleDeclarationRule()); 
            pushFollow(FOLLOW_ruleModuleDeclaration_in_entryRuleModuleDeclaration1711);
            iv_ruleModuleDeclaration=ruleModuleDeclaration();

            state._fsp--;

             current =iv_ruleModuleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleDeclaration1721); 

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
    // $ANTLR end "entryRuleModuleDeclaration"


    // $ANTLR start "ruleModuleDeclaration"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:735:1: ruleModuleDeclaration returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': MODULE =' ( (lv_module_2_0= ruleModule ) ) ) ;
    public final EObject ruleModuleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        EObject lv_module_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:738:28: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': MODULE =' ( (lv_module_2_0= ruleModule ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:739:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': MODULE =' ( (lv_module_2_0= ruleModule ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:739:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': MODULE =' ( (lv_module_2_0= ruleModule ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:739:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': MODULE =' ( (lv_module_2_0= ruleModule ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:739:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:740:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:740:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:741:3: lv_identifier_0_0= RULE_IDENTIFIERS
            {
            lv_identifier_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleModuleDeclaration1763); 

            			newLeafNode(lv_identifier_0_0, grammarAccess.getModuleDeclarationAccess().getIdentifierIDENTIFIERSTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModuleDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"identifier",
                    		lv_identifier_0_0, 
                    		"IDENTIFIERS");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleModuleDeclaration1780); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleDeclarationAccess().getMODULEKeyword_1());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:761:1: ( (lv_module_2_0= ruleModule ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:762:1: (lv_module_2_0= ruleModule )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:762:1: (lv_module_2_0= ruleModule )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:763:3: lv_module_2_0= ruleModule
            {
             
            	        newCompositeNode(grammarAccess.getModuleDeclarationAccess().getModuleModuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleModule_in_ruleModuleDeclaration1801);
            lv_module_2_0=ruleModule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuleDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"module",
                    		lv_module_2_0, 
                    		"Module");
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
    // $ANTLR end "ruleModuleDeclaration"


    // $ANTLR start "entryRuleModule"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:787:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:788:2: (iv_ruleModule= ruleModule EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:789:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule1837);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule1847); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:796:1: ruleModule returns [EObject current=null] : this_BaseModule_0= ruleBaseModule ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        EObject this_BaseModule_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:799:28: (this_BaseModule_0= ruleBaseModule )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:801:5: this_BaseModule_0= ruleBaseModule
            {
             
                    newCompositeNode(grammarAccess.getModuleAccess().getBaseModuleParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleBaseModule_in_ruleModule1893);
            this_BaseModule_0=ruleBaseModule();

            state._fsp--;

             
                    current = this_BaseModule_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleBaseModule"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:817:1: entryRuleBaseModule returns [EObject current=null] : iv_ruleBaseModule= ruleBaseModule EOF ;
    public final EObject entryRuleBaseModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseModule = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:818:2: (iv_ruleBaseModule= ruleBaseModule EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:819:2: iv_ruleBaseModule= ruleBaseModule EOF
            {
             newCompositeNode(grammarAccess.getBaseModuleRule()); 
            pushFollow(FOLLOW_ruleBaseModule_in_entryRuleBaseModule1927);
            iv_ruleBaseModule=ruleBaseModule();

            state._fsp--;

             current =iv_ruleBaseModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseModule1937); 

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
    // $ANTLR end "entryRuleBaseModule"


    // $ANTLR start "ruleBaseModule"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:826:1: ruleBaseModule returns [EObject current=null] : (otherlv_0= 'BEGIN' this_BaseDeclarations_1= ruleBaseDeclarations otherlv_2= 'END' ) ;
    public final EObject ruleBaseModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_BaseDeclarations_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:829:28: ( (otherlv_0= 'BEGIN' this_BaseDeclarations_1= ruleBaseDeclarations otherlv_2= 'END' ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:830:1: (otherlv_0= 'BEGIN' this_BaseDeclarations_1= ruleBaseDeclarations otherlv_2= 'END' )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:830:1: (otherlv_0= 'BEGIN' this_BaseDeclarations_1= ruleBaseDeclarations otherlv_2= 'END' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:830:3: otherlv_0= 'BEGIN' this_BaseDeclarations_1= ruleBaseDeclarations otherlv_2= 'END'
            {
            otherlv_0=(Token)match(input,9,FOLLOW_9_in_ruleBaseModule1974); 

                	newLeafNode(otherlv_0, grammarAccess.getBaseModuleAccess().getBEGINKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getBaseModuleAccess().getBaseDeclarationsParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleBaseDeclarations_in_ruleBaseModule1996);
            this_BaseDeclarations_1=ruleBaseDeclarations();

            state._fsp--;

             
                    current = this_BaseDeclarations_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,10,FOLLOW_10_in_ruleBaseModule2007); 

                	newLeafNode(otherlv_2, grammarAccess.getBaseModuleAccess().getENDKeyword_2());
                

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
    // $ANTLR end "ruleBaseModule"


    // $ANTLR start "entryRuleBaseDeclarations"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:855:1: entryRuleBaseDeclarations returns [EObject current=null] : iv_ruleBaseDeclarations= ruleBaseDeclarations EOF ;
    public final EObject entryRuleBaseDeclarations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseDeclarations = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:856:2: (iv_ruleBaseDeclarations= ruleBaseDeclarations EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:857:2: iv_ruleBaseDeclarations= ruleBaseDeclarations EOF
            {
             newCompositeNode(grammarAccess.getBaseDeclarationsRule()); 
            pushFollow(FOLLOW_ruleBaseDeclarations_in_entryRuleBaseDeclarations2043);
            iv_ruleBaseDeclarations=ruleBaseDeclarations();

            state._fsp--;

             current =iv_ruleBaseDeclarations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseDeclarations2053); 

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
    // $ANTLR end "entryRuleBaseDeclarations"


    // $ANTLR start "ruleBaseDeclarations"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:864:1: ruleBaseDeclarations returns [EObject current=null] : ( (lv_baseDeclaration_0_0= ruleBaseDeclaration ) )* ;
    public final EObject ruleBaseDeclarations() throws RecognitionException {
        EObject current = null;

        EObject lv_baseDeclaration_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:867:28: ( ( (lv_baseDeclaration_0_0= ruleBaseDeclaration ) )* )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:868:1: ( (lv_baseDeclaration_0_0= ruleBaseDeclaration ) )*
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:868:1: ( (lv_baseDeclaration_0_0= ruleBaseDeclaration ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=23 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:869:1: (lv_baseDeclaration_0_0= ruleBaseDeclaration )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:869:1: (lv_baseDeclaration_0_0= ruleBaseDeclaration )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:870:3: lv_baseDeclaration_0_0= ruleBaseDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBaseDeclarationsAccess().getBaseDeclarationBaseDeclarationParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBaseDeclaration_in_ruleBaseDeclarations2098);
            	    lv_baseDeclaration_0_0=ruleBaseDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBaseDeclarationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"baseDeclaration",
            	            		lv_baseDeclaration_0_0, 
            	            		"BaseDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end "ruleBaseDeclarations"


    // $ANTLR start "entryRuleBaseDeclaration"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:894:1: entryRuleBaseDeclaration returns [EObject current=null] : iv_ruleBaseDeclaration= ruleBaseDeclaration EOF ;
    public final EObject entryRuleBaseDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseDeclaration = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:895:2: (iv_ruleBaseDeclaration= ruleBaseDeclaration EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:896:2: iv_ruleBaseDeclaration= ruleBaseDeclaration EOF
            {
             newCompositeNode(grammarAccess.getBaseDeclarationRule()); 
            pushFollow(FOLLOW_ruleBaseDeclaration_in_entryRuleBaseDeclaration2134);
            iv_ruleBaseDeclaration=ruleBaseDeclaration();

            state._fsp--;

             current =iv_ruleBaseDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseDeclaration2144); 

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
    // $ANTLR end "entryRuleBaseDeclaration"


    // $ANTLR start "ruleBaseDeclaration"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:903:1: ruleBaseDeclaration returns [EObject current=null] : (this_InputDecl_0= ruleInputDecl | this_OutputDecl_1= ruleOutputDecl | this_LocalDecl_2= ruleLocalDecl | this_DefDecl_3= ruleDefDecl | this_InitDecl_4= ruleInitDecl | this_TransDecl_5= ruleTransDecl ) ;
    public final EObject ruleBaseDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_InputDecl_0 = null;

        EObject this_OutputDecl_1 = null;

        EObject this_LocalDecl_2 = null;

        EObject this_DefDecl_3 = null;

        EObject this_InitDecl_4 = null;

        EObject this_TransDecl_5 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:906:28: ( (this_InputDecl_0= ruleInputDecl | this_OutputDecl_1= ruleOutputDecl | this_LocalDecl_2= ruleLocalDecl | this_DefDecl_3= ruleDefDecl | this_InitDecl_4= ruleInitDecl | this_TransDecl_5= ruleTransDecl ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:907:1: (this_InputDecl_0= ruleInputDecl | this_OutputDecl_1= ruleOutputDecl | this_LocalDecl_2= ruleLocalDecl | this_DefDecl_3= ruleDefDecl | this_InitDecl_4= ruleInitDecl | this_TransDecl_5= ruleTransDecl )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:907:1: (this_InputDecl_0= ruleInputDecl | this_OutputDecl_1= ruleOutputDecl | this_LocalDecl_2= ruleLocalDecl | this_DefDecl_3= ruleDefDecl | this_InitDecl_4= ruleInitDecl | this_TransDecl_5= ruleTransDecl )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            case 26:
                {
                alt10=4;
                }
                break;
            case 27:
                {
                alt10=5;
                }
                break;
            case 28:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:908:5: this_InputDecl_0= ruleInputDecl
                    {
                     
                            newCompositeNode(grammarAccess.getBaseDeclarationAccess().getInputDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInputDecl_in_ruleBaseDeclaration2191);
                    this_InputDecl_0=ruleInputDecl();

                    state._fsp--;

                     
                            current = this_InputDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:918:5: this_OutputDecl_1= ruleOutputDecl
                    {
                     
                            newCompositeNode(grammarAccess.getBaseDeclarationAccess().getOutputDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOutputDecl_in_ruleBaseDeclaration2218);
                    this_OutputDecl_1=ruleOutputDecl();

                    state._fsp--;

                     
                            current = this_OutputDecl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:928:5: this_LocalDecl_2= ruleLocalDecl
                    {
                     
                            newCompositeNode(grammarAccess.getBaseDeclarationAccess().getLocalDeclParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLocalDecl_in_ruleBaseDeclaration2245);
                    this_LocalDecl_2=ruleLocalDecl();

                    state._fsp--;

                     
                            current = this_LocalDecl_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:938:5: this_DefDecl_3= ruleDefDecl
                    {
                     
                            newCompositeNode(grammarAccess.getBaseDeclarationAccess().getDefDeclParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDefDecl_in_ruleBaseDeclaration2272);
                    this_DefDecl_3=ruleDefDecl();

                    state._fsp--;

                     
                            current = this_DefDecl_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:948:5: this_InitDecl_4= ruleInitDecl
                    {
                     
                            newCompositeNode(grammarAccess.getBaseDeclarationAccess().getInitDeclParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInitDecl_in_ruleBaseDeclaration2299);
                    this_InitDecl_4=ruleInitDecl();

                    state._fsp--;

                     
                            current = this_InitDecl_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:958:5: this_TransDecl_5= ruleTransDecl
                    {
                     
                            newCompositeNode(grammarAccess.getBaseDeclarationAccess().getTransDeclParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTransDecl_in_ruleBaseDeclaration2326);
                    this_TransDecl_5=ruleTransDecl();

                    state._fsp--;

                     
                            current = this_TransDecl_5; 
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
    // $ANTLR end "ruleBaseDeclaration"


    // $ANTLR start "entryRuleInputDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:974:1: entryRuleInputDecl returns [EObject current=null] : iv_ruleInputDecl= ruleInputDecl EOF ;
    public final EObject entryRuleInputDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputDecl = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:975:2: (iv_ruleInputDecl= ruleInputDecl EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:976:2: iv_ruleInputDecl= ruleInputDecl EOF
            {
             newCompositeNode(grammarAccess.getInputDeclRule()); 
            pushFollow(FOLLOW_ruleInputDecl_in_entryRuleInputDecl2361);
            iv_ruleInputDecl=ruleInputDecl();

            state._fsp--;

             current =iv_ruleInputDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputDecl2371); 

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
    // $ANTLR end "entryRuleInputDecl"


    // $ANTLR start "ruleInputDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:983:1: ruleInputDecl returns [EObject current=null] : (otherlv_0= 'INPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) ) ;
    public final EObject ruleInputDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_varDecls_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:986:28: ( (otherlv_0= 'INPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:987:1: (otherlv_0= 'INPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:987:1: (otherlv_0= 'INPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:987:3: otherlv_0= 'INPUT' ( (lv_varDecls_1_0= ruleVarDecls ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleInputDecl2408); 

                	newLeafNode(otherlv_0, grammarAccess.getInputDeclAccess().getINPUTKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:991:1: ( (lv_varDecls_1_0= ruleVarDecls ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:992:1: (lv_varDecls_1_0= ruleVarDecls )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:992:1: (lv_varDecls_1_0= ruleVarDecls )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:993:3: lv_varDecls_1_0= ruleVarDecls
            {
             
            	        newCompositeNode(grammarAccess.getInputDeclAccess().getVarDeclsVarDeclsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVarDecls_in_ruleInputDecl2429);
            lv_varDecls_1_0=ruleVarDecls();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputDeclRule());
            	        }
                   		set(
                   			current, 
                   			"varDecls",
                    		lv_varDecls_1_0, 
                    		"VarDecls");
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
    // $ANTLR end "ruleInputDecl"


    // $ANTLR start "entryRuleOutputDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1017:1: entryRuleOutputDecl returns [EObject current=null] : iv_ruleOutputDecl= ruleOutputDecl EOF ;
    public final EObject entryRuleOutputDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDecl = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1018:2: (iv_ruleOutputDecl= ruleOutputDecl EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1019:2: iv_ruleOutputDecl= ruleOutputDecl EOF
            {
             newCompositeNode(grammarAccess.getOutputDeclRule()); 
            pushFollow(FOLLOW_ruleOutputDecl_in_entryRuleOutputDecl2465);
            iv_ruleOutputDecl=ruleOutputDecl();

            state._fsp--;

             current =iv_ruleOutputDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputDecl2475); 

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
    // $ANTLR end "entryRuleOutputDecl"


    // $ANTLR start "ruleOutputDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1026:1: ruleOutputDecl returns [EObject current=null] : (otherlv_0= 'OUTPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) ) ;
    public final EObject ruleOutputDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_varDecls_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1029:28: ( (otherlv_0= 'OUTPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1030:1: (otherlv_0= 'OUTPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1030:1: (otherlv_0= 'OUTPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1030:3: otherlv_0= 'OUTPUT' ( (lv_varDecls_1_0= ruleVarDecls ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleOutputDecl2512); 

                	newLeafNode(otherlv_0, grammarAccess.getOutputDeclAccess().getOUTPUTKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1034:1: ( (lv_varDecls_1_0= ruleVarDecls ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1035:1: (lv_varDecls_1_0= ruleVarDecls )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1035:1: (lv_varDecls_1_0= ruleVarDecls )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1036:3: lv_varDecls_1_0= ruleVarDecls
            {
             
            	        newCompositeNode(grammarAccess.getOutputDeclAccess().getVarDeclsVarDeclsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVarDecls_in_ruleOutputDecl2533);
            lv_varDecls_1_0=ruleVarDecls();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutputDeclRule());
            	        }
                   		set(
                   			current, 
                   			"varDecls",
                    		lv_varDecls_1_0, 
                    		"VarDecls");
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
    // $ANTLR end "ruleOutputDecl"


    // $ANTLR start "entryRuleLocalDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1060:1: entryRuleLocalDecl returns [EObject current=null] : iv_ruleLocalDecl= ruleLocalDecl EOF ;
    public final EObject entryRuleLocalDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalDecl = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1061:2: (iv_ruleLocalDecl= ruleLocalDecl EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1062:2: iv_ruleLocalDecl= ruleLocalDecl EOF
            {
             newCompositeNode(grammarAccess.getLocalDeclRule()); 
            pushFollow(FOLLOW_ruleLocalDecl_in_entryRuleLocalDecl2569);
            iv_ruleLocalDecl=ruleLocalDecl();

            state._fsp--;

             current =iv_ruleLocalDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalDecl2579); 

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
    // $ANTLR end "entryRuleLocalDecl"


    // $ANTLR start "ruleLocalDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1069:1: ruleLocalDecl returns [EObject current=null] : (otherlv_0= 'LOCAL' ( (lv_varDecls_1_0= ruleVarDecls ) ) ) ;
    public final EObject ruleLocalDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_varDecls_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1072:28: ( (otherlv_0= 'LOCAL' ( (lv_varDecls_1_0= ruleVarDecls ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1073:1: (otherlv_0= 'LOCAL' ( (lv_varDecls_1_0= ruleVarDecls ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1073:1: (otherlv_0= 'LOCAL' ( (lv_varDecls_1_0= ruleVarDecls ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1073:3: otherlv_0= 'LOCAL' ( (lv_varDecls_1_0= ruleVarDecls ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleLocalDecl2616); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalDeclAccess().getLOCALKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1077:1: ( (lv_varDecls_1_0= ruleVarDecls ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1078:1: (lv_varDecls_1_0= ruleVarDecls )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1078:1: (lv_varDecls_1_0= ruleVarDecls )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1079:3: lv_varDecls_1_0= ruleVarDecls
            {
             
            	        newCompositeNode(grammarAccess.getLocalDeclAccess().getVarDeclsVarDeclsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVarDecls_in_ruleLocalDecl2637);
            lv_varDecls_1_0=ruleVarDecls();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocalDeclRule());
            	        }
                   		set(
                   			current, 
                   			"varDecls",
                    		lv_varDecls_1_0, 
                    		"VarDecls");
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
    // $ANTLR end "ruleLocalDecl"


    // $ANTLR start "entryRuleDefDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1103:1: entryRuleDefDecl returns [EObject current=null] : iv_ruleDefDecl= ruleDefDecl EOF ;
    public final EObject entryRuleDefDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefDecl = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1104:2: (iv_ruleDefDecl= ruleDefDecl EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1105:2: iv_ruleDefDecl= ruleDefDecl EOF
            {
             newCompositeNode(grammarAccess.getDefDeclRule()); 
            pushFollow(FOLLOW_ruleDefDecl_in_entryRuleDefDecl2673);
            iv_ruleDefDecl=ruleDefDecl();

            state._fsp--;

             current =iv_ruleDefDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefDecl2683); 

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
    // $ANTLR end "entryRuleDefDecl"


    // $ANTLR start "ruleDefDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1112:1: ruleDefDecl returns [EObject current=null] : (otherlv_0= 'DEFINITION' ( (lv_definitions_1_0= ruleDefinitions ) ) ) ;
    public final EObject ruleDefDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_definitions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1115:28: ( (otherlv_0= 'DEFINITION' ( (lv_definitions_1_0= ruleDefinitions ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1116:1: (otherlv_0= 'DEFINITION' ( (lv_definitions_1_0= ruleDefinitions ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1116:1: (otherlv_0= 'DEFINITION' ( (lv_definitions_1_0= ruleDefinitions ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1116:3: otherlv_0= 'DEFINITION' ( (lv_definitions_1_0= ruleDefinitions ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleDefDecl2720); 

                	newLeafNode(otherlv_0, grammarAccess.getDefDeclAccess().getDEFINITIONKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1120:1: ( (lv_definitions_1_0= ruleDefinitions ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1121:1: (lv_definitions_1_0= ruleDefinitions )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1121:1: (lv_definitions_1_0= ruleDefinitions )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1122:3: lv_definitions_1_0= ruleDefinitions
            {
             
            	        newCompositeNode(grammarAccess.getDefDeclAccess().getDefinitionsDefinitionsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDefinitions_in_ruleDefDecl2741);
            lv_definitions_1_0=ruleDefinitions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefDeclRule());
            	        }
                   		set(
                   			current, 
                   			"definitions",
                    		lv_definitions_1_0, 
                    		"Definitions");
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
    // $ANTLR end "ruleDefDecl"


    // $ANTLR start "entryRuleInitDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1146:1: entryRuleInitDecl returns [EObject current=null] : iv_ruleInitDecl= ruleInitDecl EOF ;
    public final EObject entryRuleInitDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitDecl = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1147:2: (iv_ruleInitDecl= ruleInitDecl EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1148:2: iv_ruleInitDecl= ruleInitDecl EOF
            {
             newCompositeNode(grammarAccess.getInitDeclRule()); 
            pushFollow(FOLLOW_ruleInitDecl_in_entryRuleInitDecl2777);
            iv_ruleInitDecl=ruleInitDecl();

            state._fsp--;

             current =iv_ruleInitDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitDecl2787); 

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
    // $ANTLR end "entryRuleInitDecl"


    // $ANTLR start "ruleInitDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1155:1: ruleInitDecl returns [EObject current=null] : (otherlv_0= 'INITIALIZATION' ( ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' )? )+ ) ;
    public final EObject ruleInitDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_definitionOrCommand_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1158:28: ( (otherlv_0= 'INITIALIZATION' ( ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' )? )+ ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1159:1: (otherlv_0= 'INITIALIZATION' ( ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' )? )+ )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1159:1: (otherlv_0= 'INITIALIZATION' ( ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' )? )+ )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1159:3: otherlv_0= 'INITIALIZATION' ( ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' )? )+
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleInitDecl2824); 

                	newLeafNode(otherlv_0, grammarAccess.getInitDeclAccess().getINITIALIZATIONKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1163:1: ( ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' )? )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_IDENTIFIERS||LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1163:2: ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1163:2: ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1164:1: (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1164:1: (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1165:3: lv_definitionOrCommand_1_0= ruleDefinitionOrCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInitDeclAccess().getDefinitionOrCommandDefinitionOrCommandParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinitionOrCommand_in_ruleInitDecl2846);
            	    lv_definitionOrCommand_1_0=ruleDefinitionOrCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInitDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitionOrCommand",
            	            		lv_definitionOrCommand_1_0, 
            	            		"DefinitionOrCommand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1181:2: (otherlv_2= ';' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==11) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1181:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleInitDecl2859); 

            	                	newLeafNode(otherlv_2, grammarAccess.getInitDeclAccess().getSemicolonKeyword_1_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruleInitDecl"


    // $ANTLR start "entryRuleTransDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1193:1: entryRuleTransDecl returns [EObject current=null] : iv_ruleTransDecl= ruleTransDecl EOF ;
    public final EObject entryRuleTransDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransDecl = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1194:2: (iv_ruleTransDecl= ruleTransDecl EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1195:2: iv_ruleTransDecl= ruleTransDecl EOF
            {
             newCompositeNode(grammarAccess.getTransDeclRule()); 
            pushFollow(FOLLOW_ruleTransDecl_in_entryRuleTransDecl2899);
            iv_ruleTransDecl=ruleTransDecl();

            state._fsp--;

             current =iv_ruleTransDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransDecl2909); 

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
    // $ANTLR end "entryRuleTransDecl"


    // $ANTLR start "ruleTransDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1202:1: ruleTransDecl returns [EObject current=null] : (otherlv_0= 'TRANSITION' ( ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' )? )+ ) ;
    public final EObject ruleTransDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_definitionOrCommand_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1205:28: ( (otherlv_0= 'TRANSITION' ( ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' )? )+ ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1206:1: (otherlv_0= 'TRANSITION' ( ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' )? )+ )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1206:1: (otherlv_0= 'TRANSITION' ( ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' )? )+ )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1206:3: otherlv_0= 'TRANSITION' ( ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' )? )+
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleTransDecl2946); 

                	newLeafNode(otherlv_0, grammarAccess.getTransDeclAccess().getTRANSITIONKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1210:1: ( ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' )? )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_IDENTIFIERS||LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1210:2: ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1210:2: ( (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1211:1: (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1211:1: (lv_definitionOrCommand_1_0= ruleDefinitionOrCommand )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1212:3: lv_definitionOrCommand_1_0= ruleDefinitionOrCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransDeclAccess().getDefinitionOrCommandDefinitionOrCommandParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinitionOrCommand_in_ruleTransDecl2968);
            	    lv_definitionOrCommand_1_0=ruleDefinitionOrCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitionOrCommand",
            	            		lv_definitionOrCommand_1_0, 
            	            		"DefinitionOrCommand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1228:2: (otherlv_2= ';' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==11) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1228:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleTransDecl2981); 

            	                	newLeafNode(otherlv_2, grammarAccess.getTransDeclAccess().getSemicolonKeyword_1_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
    // $ANTLR end "ruleTransDecl"


    // $ANTLR start "entryRuleVarDecls"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1240:1: entryRuleVarDecls returns [EObject current=null] : iv_ruleVarDecls= ruleVarDecls EOF ;
    public final EObject entryRuleVarDecls() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecls = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1241:2: (iv_ruleVarDecls= ruleVarDecls EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1242:2: iv_ruleVarDecls= ruleVarDecls EOF
            {
             newCompositeNode(grammarAccess.getVarDeclsRule()); 
            pushFollow(FOLLOW_ruleVarDecls_in_entryRuleVarDecls3021);
            iv_ruleVarDecls=ruleVarDecls();

            state._fsp--;

             current =iv_ruleVarDecls; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecls3031); 

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
    // $ANTLR end "entryRuleVarDecls"


    // $ANTLR start "ruleVarDecls"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1249:1: ruleVarDecls returns [EObject current=null] : ( ( (lv_varDecl_0_0= ruleVarDecl ) ) (otherlv_1= ',' )? )+ ;
    public final EObject ruleVarDecls() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varDecl_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1252:28: ( ( ( (lv_varDecl_0_0= ruleVarDecl ) ) (otherlv_1= ',' )? )+ )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1253:1: ( ( (lv_varDecl_0_0= ruleVarDecl ) ) (otherlv_1= ',' )? )+
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1253:1: ( ( (lv_varDecl_0_0= ruleVarDecl ) ) (otherlv_1= ',' )? )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_IDENTIFIERS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1253:2: ( (lv_varDecl_0_0= ruleVarDecl ) ) (otherlv_1= ',' )?
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1253:2: ( (lv_varDecl_0_0= ruleVarDecl ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1254:1: (lv_varDecl_0_0= ruleVarDecl )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1254:1: (lv_varDecl_0_0= ruleVarDecl )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1255:3: lv_varDecl_0_0= ruleVarDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVarDeclsAccess().getVarDeclVarDeclParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVarDecl_in_ruleVarDecls3077);
            	    lv_varDecl_0_0=ruleVarDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVarDeclsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"varDecl",
            	            		lv_varDecl_0_0, 
            	            		"VarDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1271:2: (otherlv_1= ',' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==21) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1271:4: otherlv_1= ','
            	            {
            	            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleVarDecls3090); 

            	                	newLeafNode(otherlv_1, grammarAccess.getVarDeclsAccess().getCommaKeyword_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


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
    // $ANTLR end "ruleVarDecls"


    // $ANTLR start "entryRuleVarDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1283:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1284:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1285:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl3129);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl3139); 

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1292:1: ruleVarDecl returns [EObject current=null] : ( ( ( (lv_var_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= ',' )? )+ otherlv_2= ': ' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1295:28: ( ( ( ( (lv_var_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= ',' )? )+ otherlv_2= ': ' ( (lv_type_3_0= ruleType ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1296:1: ( ( ( (lv_var_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= ',' )? )+ otherlv_2= ': ' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1296:1: ( ( ( (lv_var_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= ',' )? )+ otherlv_2= ': ' ( (lv_type_3_0= ruleType ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1296:2: ( ( (lv_var_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= ',' )? )+ otherlv_2= ': ' ( (lv_type_3_0= ruleType ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1296:2: ( ( (lv_var_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= ',' )? )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_IDENTIFIERS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1296:3: ( (lv_var_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= ',' )?
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1296:3: ( (lv_var_0_0= RULE_IDENTIFIERS ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1297:1: (lv_var_0_0= RULE_IDENTIFIERS )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1297:1: (lv_var_0_0= RULE_IDENTIFIERS )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1298:3: lv_var_0_0= RULE_IDENTIFIERS
            	    {
            	    lv_var_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleVarDecl3182); 

            	    			newLeafNode(lv_var_0_0, grammarAccess.getVarDeclAccess().getVarIDENTIFIERSTerminalRuleCall_0_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVarDeclRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"var",
            	            		lv_var_0_0, 
            	            		"IDENTIFIERS");
            	    	    

            	    }


            	    }

            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1314:2: (otherlv_1= ',' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==21) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1314:4: otherlv_1= ','
            	            {
            	            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleVarDecl3200); 

            	                	newLeafNode(otherlv_1, grammarAccess.getVarDeclAccess().getCommaKeyword_0_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleVarDecl3216); 

                	newLeafNode(otherlv_2, grammarAccess.getVarDeclAccess().getColonSpaceKeyword_1());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1322:1: ( (lv_type_3_0= ruleType ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1323:1: (lv_type_3_0= ruleType )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1323:1: (lv_type_3_0= ruleType )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1324:3: lv_type_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVarDeclAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVarDecl3237);
            lv_type_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVarDeclRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"Type");
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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleDefinitions"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1348:1: entryRuleDefinitions returns [EObject current=null] : iv_ruleDefinitions= ruleDefinitions EOF ;
    public final EObject entryRuleDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitions = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1349:2: (iv_ruleDefinitions= ruleDefinitions EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1350:2: iv_ruleDefinitions= ruleDefinitions EOF
            {
             newCompositeNode(grammarAccess.getDefinitionsRule()); 
            pushFollow(FOLLOW_ruleDefinitions_in_entryRuleDefinitions3273);
            iv_ruleDefinitions=ruleDefinitions();

            state._fsp--;

             current =iv_ruleDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitions3283); 

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
    // $ANTLR end "entryRuleDefinitions"


    // $ANTLR start "ruleDefinitions"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1357:1: ruleDefinitions returns [EObject current=null] : ( ( (lv_definition_0_0= ruleDefinition ) ) (otherlv_1= ';' )? )+ ;
    public final EObject ruleDefinitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_definition_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1360:28: ( ( ( (lv_definition_0_0= ruleDefinition ) ) (otherlv_1= ';' )? )+ )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1361:1: ( ( (lv_definition_0_0= ruleDefinition ) ) (otherlv_1= ';' )? )+
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1361:1: ( ( (lv_definition_0_0= ruleDefinition ) ) (otherlv_1= ';' )? )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_IDENTIFIERS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1361:2: ( (lv_definition_0_0= ruleDefinition ) ) (otherlv_1= ';' )?
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1361:2: ( (lv_definition_0_0= ruleDefinition ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1362:1: (lv_definition_0_0= ruleDefinition )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1362:1: (lv_definition_0_0= ruleDefinition )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1363:3: lv_definition_0_0= ruleDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefinitionsAccess().getDefinitionDefinitionParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinition_in_ruleDefinitions3329);
            	    lv_definition_0_0=ruleDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefinitionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definition",
            	            		lv_definition_0_0, 
            	            		"Definition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1379:2: (otherlv_1= ';' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==11) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1379:4: otherlv_1= ';'
            	            {
            	            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleDefinitions3342); 

            	                	newLeafNode(otherlv_1, grammarAccess.getDefinitionsAccess().getSemicolonKeyword_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


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
    // $ANTLR end "ruleDefinitions"


    // $ANTLR start "entryRuleDefinitionOrCommand"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1391:1: entryRuleDefinitionOrCommand returns [EObject current=null] : iv_ruleDefinitionOrCommand= ruleDefinitionOrCommand EOF ;
    public final EObject entryRuleDefinitionOrCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionOrCommand = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1392:2: (iv_ruleDefinitionOrCommand= ruleDefinitionOrCommand EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1393:2: iv_ruleDefinitionOrCommand= ruleDefinitionOrCommand EOF
            {
             newCompositeNode(grammarAccess.getDefinitionOrCommandRule()); 
            pushFollow(FOLLOW_ruleDefinitionOrCommand_in_entryRuleDefinitionOrCommand3381);
            iv_ruleDefinitionOrCommand=ruleDefinitionOrCommand();

            state._fsp--;

             current =iv_ruleDefinitionOrCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionOrCommand3391); 

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
    // $ANTLR end "entryRuleDefinitionOrCommand"


    // $ANTLR start "ruleDefinitionOrCommand"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1400:1: ruleDefinitionOrCommand returns [EObject current=null] : (this_Definition_0= ruleDefinition | (otherlv_1= '[' this_SomeCommands_2= ruleSomeCommands otherlv_3= ']' ) ) ;
    public final EObject ruleDefinitionOrCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Definition_0 = null;

        EObject this_SomeCommands_2 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1403:28: ( (this_Definition_0= ruleDefinition | (otherlv_1= '[' this_SomeCommands_2= ruleSomeCommands otherlv_3= ']' ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1404:1: (this_Definition_0= ruleDefinition | (otherlv_1= '[' this_SomeCommands_2= ruleSomeCommands otherlv_3= ']' ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1404:1: (this_Definition_0= ruleDefinition | (otherlv_1= '[' this_SomeCommands_2= ruleSomeCommands otherlv_3= ']' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_IDENTIFIERS) ) {
                alt21=1;
            }
            else if ( (LA21_0==18) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1405:5: this_Definition_0= ruleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDefinitionOrCommandAccess().getDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefinition_in_ruleDefinitionOrCommand3438);
                    this_Definition_0=ruleDefinition();

                    state._fsp--;

                     
                            current = this_Definition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1414:6: (otherlv_1= '[' this_SomeCommands_2= ruleSomeCommands otherlv_3= ']' )
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1414:6: (otherlv_1= '[' this_SomeCommands_2= ruleSomeCommands otherlv_3= ']' )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1414:8: otherlv_1= '[' this_SomeCommands_2= ruleSomeCommands otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleDefinitionOrCommand3456); 

                        	newLeafNode(otherlv_1, grammarAccess.getDefinitionOrCommandAccess().getLeftSquareBracketKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getDefinitionOrCommandAccess().getSomeCommandsParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleSomeCommands_in_ruleDefinitionOrCommand3478);
                    this_SomeCommands_2=ruleSomeCommands();

                    state._fsp--;

                     
                            current = this_SomeCommands_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleDefinitionOrCommand3489); 

                        	newLeafNode(otherlv_3, grammarAccess.getDefinitionOrCommandAccess().getRightSquareBracketKeyword_1_2());
                        

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
    // $ANTLR end "ruleDefinitionOrCommand"


    // $ANTLR start "entryRuleDefinition"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1439:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1440:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1441:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition3526);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition3536); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1448:1: ruleDefinition returns [EObject current=null] : this_SimpleDefinition_0= ruleSimpleDefinition ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1451:28: (this_SimpleDefinition_0= ruleSimpleDefinition )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1453:5: this_SimpleDefinition_0= ruleSimpleDefinition
            {
             
                    newCompositeNode(grammarAccess.getDefinitionAccess().getSimpleDefinitionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleSimpleDefinition_in_ruleDefinition3582);
            this_SimpleDefinition_0=ruleSimpleDefinition();

            state._fsp--;

             
                    current = this_SimpleDefinition_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleSimpleDefinition"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1469:1: entryRuleSimpleDefinition returns [EObject current=null] : iv_ruleSimpleDefinition= ruleSimpleDefinition EOF ;
    public final EObject entryRuleSimpleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleDefinition = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1470:2: (iv_ruleSimpleDefinition= ruleSimpleDefinition EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1471:2: iv_ruleSimpleDefinition= ruleSimpleDefinition EOF
            {
             newCompositeNode(grammarAccess.getSimpleDefinitionRule()); 
            pushFollow(FOLLOW_ruleSimpleDefinition_in_entryRuleSimpleDefinition3616);
            iv_ruleSimpleDefinition=ruleSimpleDefinition();

            state._fsp--;

             current =iv_ruleSimpleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleDefinition3626); 

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
    // $ANTLR end "entryRuleSimpleDefinition"


    // $ANTLR start "ruleSimpleDefinition"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1478:1: ruleSimpleDefinition returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleLhs ) ) ( (lv_RhsDefinition_1_0= ruleRhsDefinition ) ) ) ;
    public final EObject ruleSimpleDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_RhsDefinition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1481:28: ( ( ( (lv_lhs_0_0= ruleLhs ) ) ( (lv_RhsDefinition_1_0= ruleRhsDefinition ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1482:1: ( ( (lv_lhs_0_0= ruleLhs ) ) ( (lv_RhsDefinition_1_0= ruleRhsDefinition ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1482:1: ( ( (lv_lhs_0_0= ruleLhs ) ) ( (lv_RhsDefinition_1_0= ruleRhsDefinition ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1482:2: ( (lv_lhs_0_0= ruleLhs ) ) ( (lv_RhsDefinition_1_0= ruleRhsDefinition ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1482:2: ( (lv_lhs_0_0= ruleLhs ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1483:1: (lv_lhs_0_0= ruleLhs )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1483:1: (lv_lhs_0_0= ruleLhs )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1484:3: lv_lhs_0_0= ruleLhs
            {
             
            	        newCompositeNode(grammarAccess.getSimpleDefinitionAccess().getLhsLhsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLhs_in_ruleSimpleDefinition3672);
            lv_lhs_0_0=ruleLhs();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_0_0, 
                    		"Lhs");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1500:2: ( (lv_RhsDefinition_1_0= ruleRhsDefinition ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1501:1: (lv_RhsDefinition_1_0= ruleRhsDefinition )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1501:1: (lv_RhsDefinition_1_0= ruleRhsDefinition )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1502:3: lv_RhsDefinition_1_0= ruleRhsDefinition
            {
             
            	        newCompositeNode(grammarAccess.getSimpleDefinitionAccess().getRhsDefinitionRhsDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRhsDefinition_in_ruleSimpleDefinition3693);
            lv_RhsDefinition_1_0=ruleRhsDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"RhsDefinition",
                    		lv_RhsDefinition_1_0, 
                    		"RhsDefinition");
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
    // $ANTLR end "ruleSimpleDefinition"


    // $ANTLR start "entryRuleLhs"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1526:1: entryRuleLhs returns [EObject current=null] : iv_ruleLhs= ruleLhs EOF ;
    public final EObject entryRuleLhs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLhs = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1527:2: (iv_ruleLhs= ruleLhs EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1528:2: iv_ruleLhs= ruleLhs EOF
            {
             newCompositeNode(grammarAccess.getLhsRule()); 
            pushFollow(FOLLOW_ruleLhs_in_entryRuleLhs3729);
            iv_ruleLhs=ruleLhs();

            state._fsp--;

             current =iv_ruleLhs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLhs3739); 

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
    // $ANTLR end "entryRuleLhs"


    // $ANTLR start "ruleLhs"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1535:1: ruleLhs returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= '\\'' )? ) ;
    public final EObject ruleLhs() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1538:28: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= '\\'' )? ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1539:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= '\\'' )? )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1539:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= '\\'' )? )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1539:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= '\\'' )?
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1539:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1540:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1540:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1541:3: lv_identifier_0_0= RULE_IDENTIFIERS
            {
            lv_identifier_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleLhs3781); 

            			newLeafNode(lv_identifier_0_0, grammarAccess.getLhsAccess().getIdentifierIDENTIFIERSTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLhsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"identifier",
                    		lv_identifier_0_0, 
                    		"IDENTIFIERS");
            	    

            }


            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1557:2: (otherlv_1= '\\'' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1557:4: otherlv_1= '\\''
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleLhs3799); 

                        	newLeafNode(otherlv_1, grammarAccess.getLhsAccess().getApostropheKeyword_1());
                        

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
    // $ANTLR end "ruleLhs"


    // $ANTLR start "entryRuleRhsDefinition"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1569:1: entryRuleRhsDefinition returns [EObject current=null] : iv_ruleRhsDefinition= ruleRhsDefinition EOF ;
    public final EObject entryRuleRhsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRhsDefinition = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1570:2: (iv_ruleRhsDefinition= ruleRhsDefinition EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1571:2: iv_ruleRhsDefinition= ruleRhsDefinition EOF
            {
             newCompositeNode(grammarAccess.getRhsDefinitionRule()); 
            pushFollow(FOLLOW_ruleRhsDefinition_in_entryRuleRhsDefinition3837);
            iv_ruleRhsDefinition=ruleRhsDefinition();

            state._fsp--;

             current =iv_ruleRhsDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRhsDefinition3847); 

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
    // $ANTLR end "entryRuleRhsDefinition"


    // $ANTLR start "ruleRhsDefinition"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1578:1: ruleRhsDefinition returns [EObject current=null] : this_RhsExpression_0= ruleRhsExpression ;
    public final EObject ruleRhsDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_RhsExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1581:28: (this_RhsExpression_0= ruleRhsExpression )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1583:5: this_RhsExpression_0= ruleRhsExpression
            {
             
                    newCompositeNode(grammarAccess.getRhsDefinitionAccess().getRhsExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleRhsExpression_in_ruleRhsDefinition3893);
            this_RhsExpression_0=ruleRhsExpression();

            state._fsp--;

             
                    current = this_RhsExpression_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleRhsDefinition"


    // $ANTLR start "entryRuleRhsExpression"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1599:1: entryRuleRhsExpression returns [EObject current=null] : iv_ruleRhsExpression= ruleRhsExpression EOF ;
    public final EObject entryRuleRhsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRhsExpression = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1600:2: (iv_ruleRhsExpression= ruleRhsExpression EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1601:2: iv_ruleRhsExpression= ruleRhsExpression EOF
            {
             newCompositeNode(grammarAccess.getRhsExpressionRule()); 
            pushFollow(FOLLOW_ruleRhsExpression_in_entryRuleRhsExpression3927);
            iv_ruleRhsExpression=ruleRhsExpression();

            state._fsp--;

             current =iv_ruleRhsExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRhsExpression3937); 

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
    // $ANTLR end "entryRuleRhsExpression"


    // $ANTLR start "ruleRhsExpression"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1608:1: ruleRhsExpression returns [EObject current=null] : (otherlv_0= '=' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleRhsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1611:28: ( (otherlv_0= '=' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1612:1: (otherlv_0= '=' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1612:1: (otherlv_0= '=' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1612:3: otherlv_0= '=' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleRhsExpression3974); 

                	newLeafNode(otherlv_0, grammarAccess.getRhsExpressionAccess().getEqualsSignKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1616:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1617:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1617:1: (lv_expression_1_0= ruleExpression )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1618:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getRhsExpressionAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleRhsExpression3995);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRhsExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"Expression");
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
    // $ANTLR end "ruleRhsExpression"


    // $ANTLR start "entryRuleSomeCommands"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1642:1: entryRuleSomeCommands returns [EObject current=null] : iv_ruleSomeCommands= ruleSomeCommands EOF ;
    public final EObject entryRuleSomeCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeCommands = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1643:2: (iv_ruleSomeCommands= ruleSomeCommands EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1644:2: iv_ruleSomeCommands= ruleSomeCommands EOF
            {
             newCompositeNode(grammarAccess.getSomeCommandsRule()); 
            pushFollow(FOLLOW_ruleSomeCommands_in_entryRuleSomeCommands4031);
            iv_ruleSomeCommands=ruleSomeCommands();

            state._fsp--;

             current =iv_ruleSomeCommands; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeCommands4041); 

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
    // $ANTLR end "entryRuleSomeCommands"


    // $ANTLR start "ruleSomeCommands"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1651:1: ruleSomeCommands returns [EObject current=null] : ( ( (lv_firstSomeCommand_0_0= ruleSomeCommand ) ) (otherlv_1= '[]' ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) ) )* (otherlv_3= '[]' ( (lv_elseCommand_4_0= ruleElseCommand ) ) )? ) ;
    public final EObject ruleSomeCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_firstSomeCommand_0_0 = null;

        EObject lv_nextSomeCommand_2_0 = null;

        EObject lv_elseCommand_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1654:28: ( ( ( (lv_firstSomeCommand_0_0= ruleSomeCommand ) ) (otherlv_1= '[]' ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) ) )* (otherlv_3= '[]' ( (lv_elseCommand_4_0= ruleElseCommand ) ) )? ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1655:1: ( ( (lv_firstSomeCommand_0_0= ruleSomeCommand ) ) (otherlv_1= '[]' ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) ) )* (otherlv_3= '[]' ( (lv_elseCommand_4_0= ruleElseCommand ) ) )? )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1655:1: ( ( (lv_firstSomeCommand_0_0= ruleSomeCommand ) ) (otherlv_1= '[]' ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) ) )* (otherlv_3= '[]' ( (lv_elseCommand_4_0= ruleElseCommand ) ) )? )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1655:2: ( (lv_firstSomeCommand_0_0= ruleSomeCommand ) ) (otherlv_1= '[]' ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) ) )* (otherlv_3= '[]' ( (lv_elseCommand_4_0= ruleElseCommand ) ) )?
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1655:2: ( (lv_firstSomeCommand_0_0= ruleSomeCommand ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1656:1: (lv_firstSomeCommand_0_0= ruleSomeCommand )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1656:1: (lv_firstSomeCommand_0_0= ruleSomeCommand )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1657:3: lv_firstSomeCommand_0_0= ruleSomeCommand
            {
             
            	        newCompositeNode(grammarAccess.getSomeCommandsAccess().getFirstSomeCommandSomeCommandParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSomeCommand_in_ruleSomeCommands4087);
            lv_firstSomeCommand_0_0=ruleSomeCommand();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSomeCommandsRule());
            	        }
                   		set(
                   			current, 
                   			"firstSomeCommand",
                    		lv_firstSomeCommand_0_0, 
                    		"SomeCommand");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1673:2: (otherlv_1= '[]' ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==RULE_IDENTIFIERS) ) {
                        int LA23_3 = input.LA(3);

                        if ( (LA23_3==RULE_IDENTIFIERS||LA23_3==13||LA23_3==29||LA23_3==32||LA23_3==35||LA23_3==37) ) {
                            alt23=1;
                        }


                    }
                    else if ( (LA23_1==RULE_NUMERALS||LA23_1==35) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1673:4: otherlv_1= '[]' ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleSomeCommands4100); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSomeCommandsAccess().getLeftSquareBracketRightSquareBracketKeyword_1_0());
            	        
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1677:1: ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1678:1: (lv_nextSomeCommand_2_0= ruleSomeCommand )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1678:1: (lv_nextSomeCommand_2_0= ruleSomeCommand )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1679:3: lv_nextSomeCommand_2_0= ruleSomeCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSomeCommandsAccess().getNextSomeCommandSomeCommandParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSomeCommand_in_ruleSomeCommands4121);
            	    lv_nextSomeCommand_2_0=ruleSomeCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSomeCommandsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nextSomeCommand",
            	            		lv_nextSomeCommand_2_0, 
            	            		"SomeCommand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1695:4: (otherlv_3= '[]' ( (lv_elseCommand_4_0= ruleElseCommand ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1695:6: otherlv_3= '[]' ( (lv_elseCommand_4_0= ruleElseCommand ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleSomeCommands4136); 

                        	newLeafNode(otherlv_3, grammarAccess.getSomeCommandsAccess().getLeftSquareBracketRightSquareBracketKeyword_2_0());
                        
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1699:1: ( (lv_elseCommand_4_0= ruleElseCommand ) )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1700:1: (lv_elseCommand_4_0= ruleElseCommand )
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1700:1: (lv_elseCommand_4_0= ruleElseCommand )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1701:3: lv_elseCommand_4_0= ruleElseCommand
                    {
                     
                    	        newCompositeNode(grammarAccess.getSomeCommandsAccess().getElseCommandElseCommandParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElseCommand_in_ruleSomeCommands4157);
                    lv_elseCommand_4_0=ruleElseCommand();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSomeCommandsRule());
                    	        }
                           		set(
                           			current, 
                           			"elseCommand",
                            		lv_elseCommand_4_0, 
                            		"ElseCommand");
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
    // $ANTLR end "ruleSomeCommands"


    // $ANTLR start "entryRuleSomeCommand"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1725:1: entryRuleSomeCommand returns [EObject current=null] : iv_ruleSomeCommand= ruleSomeCommand EOF ;
    public final EObject entryRuleSomeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeCommand = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1726:2: (iv_ruleSomeCommand= ruleSomeCommand EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1727:2: iv_ruleSomeCommand= ruleSomeCommand EOF
            {
             newCompositeNode(grammarAccess.getSomeCommandRule()); 
            pushFollow(FOLLOW_ruleSomeCommand_in_entryRuleSomeCommand4195);
            iv_ruleSomeCommand=ruleSomeCommand();

            state._fsp--;

             current =iv_ruleSomeCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeCommand4205); 

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
    // $ANTLR end "entryRuleSomeCommand"


    // $ANTLR start "ruleSomeCommand"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1734:1: ruleSomeCommand returns [EObject current=null] : this_NamedCommand_0= ruleNamedCommand ;
    public final EObject ruleSomeCommand() throws RecognitionException {
        EObject current = null;

        EObject this_NamedCommand_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1737:28: (this_NamedCommand_0= ruleNamedCommand )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1739:5: this_NamedCommand_0= ruleNamedCommand
            {
             
                    newCompositeNode(grammarAccess.getSomeCommandAccess().getNamedCommandParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleNamedCommand_in_ruleSomeCommand4251);
            this_NamedCommand_0=ruleNamedCommand();

            state._fsp--;

             
                    current = this_NamedCommand_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleSomeCommand"


    // $ANTLR start "entryRuleNamedCommand"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1755:1: entryRuleNamedCommand returns [EObject current=null] : iv_ruleNamedCommand= ruleNamedCommand EOF ;
    public final EObject entryRuleNamedCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedCommand = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1756:2: (iv_ruleNamedCommand= ruleNamedCommand EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1757:2: iv_ruleNamedCommand= ruleNamedCommand EOF
            {
             newCompositeNode(grammarAccess.getNamedCommandRule()); 
            pushFollow(FOLLOW_ruleNamedCommand_in_entryRuleNamedCommand4285);
            iv_ruleNamedCommand=ruleNamedCommand();

            state._fsp--;

             current =iv_ruleNamedCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedCommand4295); 

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
    // $ANTLR end "entryRuleNamedCommand"


    // $ANTLR start "ruleNamedCommand"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1764:1: ruleNamedCommand returns [EObject current=null] : ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': ' )? ( (lv_guardedCommand_2_0= ruleGuardedCommand ) ) ) ;
    public final EObject ruleNamedCommand() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        EObject lv_guardedCommand_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1767:28: ( ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': ' )? ( (lv_guardedCommand_2_0= ruleGuardedCommand ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1768:1: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': ' )? ( (lv_guardedCommand_2_0= ruleGuardedCommand ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1768:1: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': ' )? ( (lv_guardedCommand_2_0= ruleGuardedCommand ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1768:2: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': ' )? ( (lv_guardedCommand_2_0= ruleGuardedCommand ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1768:2: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': ' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_IDENTIFIERS) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==29) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1768:3: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': '
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1768:3: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1769:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1769:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1770:3: lv_identifier_0_0= RULE_IDENTIFIERS
                    {
                    lv_identifier_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleNamedCommand4338); 

                    			newLeafNode(lv_identifier_0_0, grammarAccess.getNamedCommandAccess().getIdentifierIDENTIFIERSTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamedCommandRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"identifier",
                            		lv_identifier_0_0, 
                            		"IDENTIFIERS");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleNamedCommand4355); 

                        	newLeafNode(otherlv_1, grammarAccess.getNamedCommandAccess().getColonSpaceKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1790:3: ( (lv_guardedCommand_2_0= ruleGuardedCommand ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1791:1: (lv_guardedCommand_2_0= ruleGuardedCommand )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1791:1: (lv_guardedCommand_2_0= ruleGuardedCommand )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1792:3: lv_guardedCommand_2_0= ruleGuardedCommand
            {
             
            	        newCompositeNode(grammarAccess.getNamedCommandAccess().getGuardedCommandGuardedCommandParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleGuardedCommand_in_ruleNamedCommand4378);
            lv_guardedCommand_2_0=ruleGuardedCommand();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamedCommandRule());
            	        }
                   		set(
                   			current, 
                   			"guardedCommand",
                    		lv_guardedCommand_2_0, 
                    		"GuardedCommand");
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
    // $ANTLR end "ruleNamedCommand"


    // $ANTLR start "entryRuleGuardedCommand"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1816:1: entryRuleGuardedCommand returns [EObject current=null] : iv_ruleGuardedCommand= ruleGuardedCommand EOF ;
    public final EObject entryRuleGuardedCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardedCommand = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1817:2: (iv_ruleGuardedCommand= ruleGuardedCommand EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1818:2: iv_ruleGuardedCommand= ruleGuardedCommand EOF
            {
             newCompositeNode(grammarAccess.getGuardedCommandRule()); 
            pushFollow(FOLLOW_ruleGuardedCommand_in_entryRuleGuardedCommand4414);
            iv_ruleGuardedCommand=ruleGuardedCommand();

            state._fsp--;

             current =iv_ruleGuardedCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuardedCommand4424); 

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
    // $ANTLR end "entryRuleGuardedCommand"


    // $ANTLR start "ruleGuardedCommand"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1825:1: ruleGuardedCommand returns [EObject current=null] : ( ( (lv_guard_0_0= ruleGuard ) ) otherlv_1= '-->' ( (lv_assignment_2_0= ruleAssignments ) ) ) ;
    public final EObject ruleGuardedCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_guard_0_0 = null;

        EObject lv_assignment_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1828:28: ( ( ( (lv_guard_0_0= ruleGuard ) ) otherlv_1= '-->' ( (lv_assignment_2_0= ruleAssignments ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1829:1: ( ( (lv_guard_0_0= ruleGuard ) ) otherlv_1= '-->' ( (lv_assignment_2_0= ruleAssignments ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1829:1: ( ( (lv_guard_0_0= ruleGuard ) ) otherlv_1= '-->' ( (lv_assignment_2_0= ruleAssignments ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1829:2: ( (lv_guard_0_0= ruleGuard ) ) otherlv_1= '-->' ( (lv_assignment_2_0= ruleAssignments ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1829:2: ( (lv_guard_0_0= ruleGuard ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1830:1: (lv_guard_0_0= ruleGuard )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1830:1: (lv_guard_0_0= ruleGuard )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1831:3: lv_guard_0_0= ruleGuard
            {
             
            	        newCompositeNode(grammarAccess.getGuardedCommandAccess().getGuardGuardParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleGuard_in_ruleGuardedCommand4470);
            lv_guard_0_0=ruleGuard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGuardedCommandRule());
            	        }
                   		set(
                   			current, 
                   			"guard",
                    		lv_guard_0_0, 
                    		"Guard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleGuardedCommand4482); 

                	newLeafNode(otherlv_1, grammarAccess.getGuardedCommandAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1851:1: ( (lv_assignment_2_0= ruleAssignments ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1852:1: (lv_assignment_2_0= ruleAssignments )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1852:1: (lv_assignment_2_0= ruleAssignments )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1853:3: lv_assignment_2_0= ruleAssignments
            {
             
            	        newCompositeNode(grammarAccess.getGuardedCommandAccess().getAssignmentAssignmentsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAssignments_in_ruleGuardedCommand4503);
            lv_assignment_2_0=ruleAssignments();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGuardedCommandRule());
            	        }
                   		set(
                   			current, 
                   			"assignment",
                    		lv_assignment_2_0, 
                    		"Assignments");
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
    // $ANTLR end "ruleGuardedCommand"


    // $ANTLR start "entryRuleGuard"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1877:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1878:2: (iv_ruleGuard= ruleGuard EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1879:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard4539);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard4549); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1886:1: ruleGuard returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1889:28: (this_Expression_0= ruleExpression )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1891:5: this_Expression_0= ruleExpression
            {
             
                    newCompositeNode(grammarAccess.getGuardAccess().getExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleGuard4595);
            this_Expression_0=ruleExpression();

            state._fsp--;

             
                    current = this_Expression_0; 
                    afterParserOrEnumRuleCall();
                

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


    // $ANTLR start "entryRuleAssignments"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1907:1: entryRuleAssignments returns [EObject current=null] : iv_ruleAssignments= ruleAssignments EOF ;
    public final EObject entryRuleAssignments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignments = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1908:2: (iv_ruleAssignments= ruleAssignments EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1909:2: iv_ruleAssignments= ruleAssignments EOF
            {
             newCompositeNode(grammarAccess.getAssignmentsRule()); 
            pushFollow(FOLLOW_ruleAssignments_in_entryRuleAssignments4629);
            iv_ruleAssignments=ruleAssignments();

            state._fsp--;

             current =iv_ruleAssignments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignments4639); 

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
    // $ANTLR end "entryRuleAssignments"


    // $ANTLR start "ruleAssignments"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1916:1: ruleAssignments returns [EObject current=null] : ( ( (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition ) )? (otherlv_1= ';' ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) ) )* (otherlv_3= ';' )? ) ;
    public final EObject ruleAssignments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_firstSimpleDefinition_0_0 = null;

        EObject lv_nextSimpleDefinition_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1919:28: ( ( ( (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition ) )? (otherlv_1= ';' ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) ) )* (otherlv_3= ';' )? ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1920:1: ( ( (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition ) )? (otherlv_1= ';' ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) ) )* (otherlv_3= ';' )? )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1920:1: ( ( (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition ) )? (otherlv_1= ';' ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) ) )* (otherlv_3= ';' )? )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1920:2: ( (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition ) )? (otherlv_1= ';' ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) ) )* (otherlv_3= ';' )?
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1920:2: ( (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_IDENTIFIERS) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1921:1: (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition )
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1921:1: (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1922:3: lv_firstSimpleDefinition_0_0= ruleSimpleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentsAccess().getFirstSimpleDefinitionSimpleDefinitionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleDefinition_in_ruleAssignments4685);
                    lv_firstSimpleDefinition_0_0=ruleSimpleDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"firstSimpleDefinition",
                            		lv_firstSimpleDefinition_0_0, 
                            		"SimpleDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1938:3: (otherlv_1= ';' ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==11) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_IDENTIFIERS) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1938:5: otherlv_1= ';' ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleAssignments4699); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAssignmentsAccess().getSemicolonKeyword_1_0());
            	        
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1942:1: ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1943:1: (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1943:1: (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1944:3: lv_nextSimpleDefinition_2_0= ruleSimpleDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssignmentsAccess().getNextSimpleDefinitionSimpleDefinitionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleDefinition_in_ruleAssignments4720);
            	    lv_nextSimpleDefinition_2_0=ruleSimpleDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssignmentsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nextSimpleDefinition",
            	            		lv_nextSimpleDefinition_2_0, 
            	            		"SimpleDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1960:4: (otherlv_3= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==11) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1960:6: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleAssignments4735); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssignmentsAccess().getSemicolonKeyword_2());
                        

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
    // $ANTLR end "ruleAssignments"


    // $ANTLR start "entryRuleElseCommand"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1972:1: entryRuleElseCommand returns [EObject current=null] : iv_ruleElseCommand= ruleElseCommand EOF ;
    public final EObject entryRuleElseCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseCommand = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1973:2: (iv_ruleElseCommand= ruleElseCommand EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1974:2: iv_ruleElseCommand= ruleElseCommand EOF
            {
             newCompositeNode(grammarAccess.getElseCommandRule()); 
            pushFollow(FOLLOW_ruleElseCommand_in_entryRuleElseCommand4773);
            iv_ruleElseCommand=ruleElseCommand();

            state._fsp--;

             current =iv_ruleElseCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElseCommand4783); 

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
    // $ANTLR end "entryRuleElseCommand"


    // $ANTLR start "ruleElseCommand"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1981:1: ruleElseCommand returns [EObject current=null] : ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ':' )? otherlv_2= 'ELSE -->' ( (lv_assignments_3_0= ruleAssignments ) ) ) ;
    public final EObject ruleElseCommand() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_assignments_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1984:28: ( ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ':' )? otherlv_2= 'ELSE -->' ( (lv_assignments_3_0= ruleAssignments ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1985:1: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ':' )? otherlv_2= 'ELSE -->' ( (lv_assignments_3_0= ruleAssignments ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1985:1: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ':' )? otherlv_2= 'ELSE -->' ( (lv_assignments_3_0= ruleAssignments ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1985:2: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ':' )? otherlv_2= 'ELSE -->' ( (lv_assignments_3_0= ruleAssignments ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1985:2: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ':' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_IDENTIFIERS) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1985:3: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ':'
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1985:3: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1986:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1986:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1987:3: lv_identifier_0_0= RULE_IDENTIFIERS
                    {
                    lv_identifier_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleElseCommand4826); 

                    			newLeafNode(lv_identifier_0_0, grammarAccess.getElseCommandAccess().getIdentifierIDENTIFIERSTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getElseCommandRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"identifier",
                            		lv_identifier_0_0, 
                            		"IDENTIFIERS");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleElseCommand4843); 

                        	newLeafNode(otherlv_1, grammarAccess.getElseCommandAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleElseCommand4857); 

                	newLeafNode(otherlv_2, grammarAccess.getElseCommandAccess().getELSEKeyword_1());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2011:1: ( (lv_assignments_3_0= ruleAssignments ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2012:1: (lv_assignments_3_0= ruleAssignments )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2012:1: (lv_assignments_3_0= ruleAssignments )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2013:3: lv_assignments_3_0= ruleAssignments
            {
             
            	        newCompositeNode(grammarAccess.getElseCommandAccess().getAssignmentsAssignmentsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAssignments_in_ruleElseCommand4878);
            lv_assignments_3_0=ruleAssignments();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElseCommandRule());
            	        }
                   		set(
                   			current, 
                   			"assignments",
                    		lv_assignments_3_0, 
                    		"Assignments");
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
    // $ANTLR end "ruleElseCommand"


    // $ANTLR start "entryRuleExpression"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2037:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2038:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2039:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4914);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4924); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2046:1: ruleExpression returns [EObject current=null] : (this_NameExpr_0= ruleNameExpr | this_NextVariable_1= ruleNextVariable | this_Numeral_2= ruleNumeral | this_OuterInfixApplication_3= ruleOuterInfixApplication | this_BracketedExpression_4= ruleBracketedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NameExpr_0 = null;

        EObject this_NextVariable_1 = null;

        EObject this_Numeral_2 = null;

        EObject this_OuterInfixApplication_3 = null;

        EObject this_BracketedExpression_4 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2049:28: ( (this_NameExpr_0= ruleNameExpr | this_NextVariable_1= ruleNextVariable | this_Numeral_2= ruleNumeral | this_OuterInfixApplication_3= ruleOuterInfixApplication | this_BracketedExpression_4= ruleBracketedExpression ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2050:1: (this_NameExpr_0= ruleNameExpr | this_NextVariable_1= ruleNextVariable | this_Numeral_2= ruleNumeral | this_OuterInfixApplication_3= ruleOuterInfixApplication | this_BracketedExpression_4= ruleBracketedExpression )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2050:1: (this_NameExpr_0= ruleNameExpr | this_NextVariable_1= ruleNextVariable | this_Numeral_2= ruleNumeral | this_OuterInfixApplication_3= ruleOuterInfixApplication | this_BracketedExpression_4= ruleBracketedExpression )
            int alt30=5;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIERS:
                {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt30=2;
                    }
                    break;
                case 13:
                case 35:
                    {
                    alt30=4;
                    }
                    break;
                case RULE_IDENTIFIERS:
                    {
                    int LA30_6 = input.LA(3);

                    if ( (LA30_6==13||LA30_6==30) ) {
                        alt30=1;
                    }
                    else if ( (LA30_6==EOF||LA30_6==RULE_IDENTIFIERS||(LA30_6>=10 && LA30_6<=11)||(LA30_6>=18 && LA30_6<=21)||(LA30_6>=23 && LA30_6<=28)||(LA30_6>=31 && LA30_6<=32)||LA30_6==36) ) {
                        alt30=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 10:
                case 11:
                case 18:
                case 19:
                case 20:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 31:
                case 32:
                case 36:
                    {
                    alt30=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_NUMERALS:
                {
                alt30=3;
                }
                break;
            case 35:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2051:5: this_NameExpr_0= ruleNameExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getNameExprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNameExpr_in_ruleExpression4971);
                    this_NameExpr_0=ruleNameExpr();

                    state._fsp--;

                     
                            current = this_NameExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2061:5: this_NextVariable_1= ruleNextVariable
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getNextVariableParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNextVariable_in_ruleExpression4998);
                    this_NextVariable_1=ruleNextVariable();

                    state._fsp--;

                     
                            current = this_NextVariable_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2071:5: this_Numeral_2= ruleNumeral
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getNumeralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumeral_in_ruleExpression5025);
                    this_Numeral_2=ruleNumeral();

                    state._fsp--;

                     
                            current = this_Numeral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2081:5: this_OuterInfixApplication_3= ruleOuterInfixApplication
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getOuterInfixApplicationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleOuterInfixApplication_in_ruleExpression5052);
                    this_OuterInfixApplication_3=ruleOuterInfixApplication();

                    state._fsp--;

                     
                            current = this_OuterInfixApplication_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2091:5: this_BracketedExpression_4= ruleBracketedExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getBracketedExpressionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBracketedExpression_in_ruleExpression5079);
                    this_BracketedExpression_4=ruleBracketedExpression();

                    state._fsp--;

                     
                            current = this_BracketedExpression_4; 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBracketedExpression"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2107:1: entryRuleBracketedExpression returns [EObject current=null] : iv_ruleBracketedExpression= ruleBracketedExpression EOF ;
    public final EObject entryRuleBracketedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracketedExpression = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2108:2: (iv_ruleBracketedExpression= ruleBracketedExpression EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2109:2: iv_ruleBracketedExpression= ruleBracketedExpression EOF
            {
             newCompositeNode(grammarAccess.getBracketedExpressionRule()); 
            pushFollow(FOLLOW_ruleBracketedExpression_in_entryRuleBracketedExpression5114);
            iv_ruleBracketedExpression=ruleBracketedExpression();

            state._fsp--;

             current =iv_ruleBracketedExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBracketedExpression5124); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2116:1: ruleBracketedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBracketedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2119:28: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2120:1: (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2120:1: (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2120:3: otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleBracketedExpression5161); 

                	newLeafNode(otherlv_0, grammarAccess.getBracketedExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2124:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2125:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2125:1: (lv_expression_1_0= ruleExpression )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2126:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBracketedExpressionAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleBracketedExpression5182);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBracketedExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleBracketedExpression5194); 

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


    // $ANTLR start "entryRuleOuterInfixApplication"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2154:1: entryRuleOuterInfixApplication returns [EObject current=null] : iv_ruleOuterInfixApplication= ruleOuterInfixApplication EOF ;
    public final EObject entryRuleOuterInfixApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOuterInfixApplication = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2155:2: (iv_ruleOuterInfixApplication= ruleOuterInfixApplication EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2156:2: iv_ruleOuterInfixApplication= ruleOuterInfixApplication EOF
            {
             newCompositeNode(grammarAccess.getOuterInfixApplicationRule()); 
            pushFollow(FOLLOW_ruleOuterInfixApplication_in_entryRuleOuterInfixApplication5230);
            iv_ruleOuterInfixApplication=ruleOuterInfixApplication();

            state._fsp--;

             current =iv_ruleOuterInfixApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOuterInfixApplication5240); 

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
    // $ANTLR end "entryRuleOuterInfixApplication"


    // $ANTLR start "ruleOuterInfixApplication"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2163:1: ruleOuterInfixApplication returns [EObject current=null] : ( ( ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) ) ) (this_IDENTIFIERS_1= RULE_IDENTIFIERS ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) ) )* ) ;
    public final EObject ruleOuterInfixApplication() throws RecognitionException {
        EObject current = null;

        Token this_IDENTIFIERS_1=null;
        EObject lv_firstExpression_0_1 = null;

        EObject lv_firstExpression_0_2 = null;

        EObject lv_nextExpression_2_1 = null;

        EObject lv_nextExpression_2_2 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2166:28: ( ( ( ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) ) ) (this_IDENTIFIERS_1= RULE_IDENTIFIERS ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) ) )* ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2167:1: ( ( ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) ) ) (this_IDENTIFIERS_1= RULE_IDENTIFIERS ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) ) )* )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2167:1: ( ( ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) ) ) (this_IDENTIFIERS_1= RULE_IDENTIFIERS ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) ) )* )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2167:2: ( ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) ) ) (this_IDENTIFIERS_1= RULE_IDENTIFIERS ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) ) )*
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2167:2: ( ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2168:1: ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2168:1: ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2169:1: (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2169:1: (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_IDENTIFIERS) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==RULE_IDENTIFIERS||LA31_1==35) ) {
                    alt31=1;
                }
                else if ( (LA31_1==13) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2170:3: lv_firstExpression_0_1= ruleApplication
                    {
                     
                    	        newCompositeNode(grammarAccess.getOuterInfixApplicationAccess().getFirstExpressionApplicationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleApplication_in_ruleOuterInfixApplication5288);
                    lv_firstExpression_0_1=ruleApplication();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOuterInfixApplicationRule());
                    	        }
                           		set(
                           			current, 
                           			"firstExpression",
                            		lv_firstExpression_0_1, 
                            		"Application");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2185:8: lv_firstExpression_0_2= ruleInfixApplication
                    {
                     
                    	        newCompositeNode(grammarAccess.getOuterInfixApplicationAccess().getFirstExpressionInfixApplicationParserRuleCall_0_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleInfixApplication_in_ruleOuterInfixApplication5307);
                    lv_firstExpression_0_2=ruleInfixApplication();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOuterInfixApplicationRule());
                    	        }
                           		set(
                           			current, 
                           			"firstExpression",
                            		lv_firstExpression_0_2, 
                            		"InfixApplication");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2203:2: (this_IDENTIFIERS_1= RULE_IDENTIFIERS ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_IDENTIFIERS) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==RULE_IDENTIFIERS) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2203:3: this_IDENTIFIERS_1= RULE_IDENTIFIERS ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) )
            	    {
            	    this_IDENTIFIERS_1=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleOuterInfixApplication5322); 
            	     
            	        newLeafNode(this_IDENTIFIERS_1, grammarAccess.getOuterInfixApplicationAccess().getIDENTIFIERSTerminalRuleCall_1_0()); 
            	        
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2207:1: ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2208:1: ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2208:1: ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2209:1: (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2209:1: (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==RULE_IDENTIFIERS) ) {
            	        int LA32_1 = input.LA(2);

            	        if ( (LA32_1==13) ) {
            	            alt32=2;
            	        }
            	        else if ( (LA32_1==RULE_IDENTIFIERS||LA32_1==35) ) {
            	            alt32=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 32, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2210:3: lv_nextExpression_2_1= ruleApplication
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getOuterInfixApplicationAccess().getNextExpressionApplicationParserRuleCall_1_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleApplication_in_ruleOuterInfixApplication5344);
            	            lv_nextExpression_2_1=ruleApplication();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getOuterInfixApplicationRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"nextExpression",
            	                    		lv_nextExpression_2_1, 
            	                    		"Application");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2225:8: lv_nextExpression_2_2= ruleInfixApplication
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getOuterInfixApplicationAccess().getNextExpressionInfixApplicationParserRuleCall_1_1_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleInfixApplication_in_ruleOuterInfixApplication5363);
            	            lv_nextExpression_2_2=ruleInfixApplication();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getOuterInfixApplicationRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"nextExpression",
            	                    		lv_nextExpression_2_2, 
            	                    		"InfixApplication");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end "ruleOuterInfixApplication"


    // $ANTLR start "entryRuleNameExpr"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2251:1: entryRuleNameExpr returns [EObject current=null] : iv_ruleNameExpr= ruleNameExpr EOF ;
    public final EObject entryRuleNameExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpr = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2252:2: (iv_ruleNameExpr= ruleNameExpr EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2253:2: iv_ruleNameExpr= ruleNameExpr EOF
            {
             newCompositeNode(grammarAccess.getNameExprRule()); 
            pushFollow(FOLLOW_ruleNameExpr_in_entryRuleNameExpr5404);
            iv_ruleNameExpr=ruleNameExpr();

            state._fsp--;

             current =iv_ruleNameExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameExpr5414); 

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
    // $ANTLR end "entryRuleNameExpr"


    // $ANTLR start "ruleNameExpr"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2260:1: ruleNameExpr returns [EObject current=null] : this_Name_0= ruleName ;
    public final EObject ruleNameExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2263:28: (this_Name_0= ruleName )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2265:5: this_Name_0= ruleName
            {
             
                    newCompositeNode(grammarAccess.getNameExprAccess().getNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleName_in_ruleNameExpr5460);
            this_Name_0=ruleName();

            state._fsp--;

             
                    current = this_Name_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleNameExpr"


    // $ANTLR start "entryRuleNextVariable"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2281:1: entryRuleNextVariable returns [EObject current=null] : iv_ruleNextVariable= ruleNextVariable EOF ;
    public final EObject entryRuleNextVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextVariable = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2282:2: (iv_ruleNextVariable= ruleNextVariable EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2283:2: iv_ruleNextVariable= ruleNextVariable EOF
            {
             newCompositeNode(grammarAccess.getNextVariableRule()); 
            pushFollow(FOLLOW_ruleNextVariable_in_entryRuleNextVariable5494);
            iv_ruleNextVariable=ruleNextVariable();

            state._fsp--;

             current =iv_ruleNextVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNextVariable5504); 

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
    // $ANTLR end "entryRuleNextVariable"


    // $ANTLR start "ruleNextVariable"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2290:1: ruleNextVariable returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '.' ) ;
    public final EObject ruleNextVariable() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2293:28: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '.' ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2294:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '.' )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2294:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '.' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2294:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '.'
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2294:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2295:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2295:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2296:3: lv_identifier_0_0= RULE_IDENTIFIERS
            {
            lv_identifier_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleNextVariable5546); 

            			newLeafNode(lv_identifier_0_0, grammarAccess.getNextVariableAccess().getIdentifierIDENTIFIERSTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNextVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"identifier",
                    		lv_identifier_0_0, 
                    		"IDENTIFIERS");
            	    

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleNextVariable5563); 

                	newLeafNode(otherlv_1, grammarAccess.getNextVariableAccess().getFullStopKeyword_1());
                

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
    // $ANTLR end "ruleNextVariable"


    // $ANTLR start "entryRuleApplication"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2324:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2325:2: (iv_ruleApplication= ruleApplication EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2326:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication5599);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication5609); 

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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2333:1: ruleApplication returns [EObject current=null] : ( ( (lv_function_0_0= ruleFunction ) ) ( (lv_argument_1_0= ruleArgument ) ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        EObject lv_function_0_0 = null;

        EObject lv_argument_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2336:28: ( ( ( (lv_function_0_0= ruleFunction ) ) ( (lv_argument_1_0= ruleArgument ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2337:1: ( ( (lv_function_0_0= ruleFunction ) ) ( (lv_argument_1_0= ruleArgument ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2337:1: ( ( (lv_function_0_0= ruleFunction ) ) ( (lv_argument_1_0= ruleArgument ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2337:2: ( (lv_function_0_0= ruleFunction ) ) ( (lv_argument_1_0= ruleArgument ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2337:2: ( (lv_function_0_0= ruleFunction ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2338:1: (lv_function_0_0= ruleFunction )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2338:1: (lv_function_0_0= ruleFunction )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2339:3: lv_function_0_0= ruleFunction
            {
             
            	        newCompositeNode(grammarAccess.getApplicationAccess().getFunctionFunctionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFunction_in_ruleApplication5655);
            lv_function_0_0=ruleFunction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"function",
                    		lv_function_0_0, 
                    		"Function");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2355:2: ( (lv_argument_1_0= ruleArgument ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2356:1: (lv_argument_1_0= ruleArgument )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2356:1: (lv_argument_1_0= ruleArgument )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2357:3: lv_argument_1_0= ruleArgument
            {
             
            	        newCompositeNode(grammarAccess.getApplicationAccess().getArgumentArgumentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleApplication5676);
            lv_argument_1_0=ruleArgument();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"argument",
                    		lv_argument_1_0, 
                    		"Argument");
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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleFunction"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2381:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2382:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2383:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction5712);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction5722); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2390:1: ruleFunction returns [EObject current=null] : ( (lv_expression_0_0= ruleNameExpr ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2393:28: ( ( (lv_expression_0_0= ruleNameExpr ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2394:1: ( (lv_expression_0_0= ruleNameExpr ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2394:1: ( (lv_expression_0_0= ruleNameExpr ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2395:1: (lv_expression_0_0= ruleNameExpr )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2395:1: (lv_expression_0_0= ruleNameExpr )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2396:3: lv_expression_0_0= ruleNameExpr
            {
             
            	        newCompositeNode(grammarAccess.getFunctionAccess().getExpressionNameExprParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleNameExpr_in_ruleFunction5767);
            lv_expression_0_0=ruleNameExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"NameExpr");
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleArgument"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2420:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2421:2: (iv_ruleArgument= ruleArgument EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2422:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument5802);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument5812); 

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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2429:1: ruleArgument returns [EObject current=null] : ( ( ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) ) ) (otherlv_1= ',' ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) ) )* ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_firstExpression_0_1 = null;

        EObject lv_firstExpression_0_2 = null;

        EObject lv_nextExpression_2_1 = null;

        EObject lv_nextExpression_2_2 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2432:28: ( ( ( ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) ) ) (otherlv_1= ',' ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) ) )* ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2433:1: ( ( ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) ) ) (otherlv_1= ',' ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) ) )* )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2433:1: ( ( ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) ) ) (otherlv_1= ',' ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) ) )* )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2433:2: ( ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) ) ) (otherlv_1= ',' ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) ) )*
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2433:2: ( ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2434:1: ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2434:1: ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2435:1: (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2435:1: (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_IDENTIFIERS) ) {
                alt34=1;
            }
            else if ( (LA34_0==35) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2436:3: lv_firstExpression_0_1= ruleNameExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getFirstExpressionNameExprParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNameExpr_in_ruleArgument5860);
                    lv_firstExpression_0_1=ruleNameExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		set(
                           			current, 
                           			"firstExpression",
                            		lv_firstExpression_0_1, 
                            		"NameExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2451:8: lv_firstExpression_0_2= ruleBracketedExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getFirstExpressionBracketedExpressionParserRuleCall_0_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleBracketedExpression_in_ruleArgument5879);
                    lv_firstExpression_0_2=ruleBracketedExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		set(
                           			current, 
                           			"firstExpression",
                            		lv_firstExpression_0_2, 
                            		"BracketedExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2469:2: (otherlv_1= ',' ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==21) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2469:4: otherlv_1= ',' ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleArgument5895); 

            	        	newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2473:1: ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2474:1: ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2474:1: ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2475:1: (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2475:1: (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==RULE_IDENTIFIERS) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==35) ) {
            	        alt35=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2476:3: lv_nextExpression_2_1= ruleNameExpr
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getArgumentAccess().getNextExpressionNameExprParserRuleCall_1_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleNameExpr_in_ruleArgument5918);
            	            lv_nextExpression_2_1=ruleNameExpr();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getArgumentRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"nextExpression",
            	                    		lv_nextExpression_2_1, 
            	                    		"NameExpr");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2491:8: lv_nextExpression_2_2= ruleBracketedExpression
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getArgumentAccess().getNextExpressionBracketedExpressionParserRuleCall_1_1_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleBracketedExpression_in_ruleArgument5937);
            	            lv_nextExpression_2_2=ruleBracketedExpression();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getArgumentRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"nextExpression",
            	                    		lv_nextExpression_2_2, 
            	                    		"BracketedExpression");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleInfixApplication"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2517:1: entryRuleInfixApplication returns [EObject current=null] : iv_ruleInfixApplication= ruleInfixApplication EOF ;
    public final EObject entryRuleInfixApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixApplication = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2518:2: (iv_ruleInfixApplication= ruleInfixApplication EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2519:2: iv_ruleInfixApplication= ruleInfixApplication EOF
            {
             newCompositeNode(grammarAccess.getInfixApplicationRule()); 
            pushFollow(FOLLOW_ruleInfixApplication_in_entryRuleInfixApplication5978);
            iv_ruleInfixApplication=ruleInfixApplication();

            state._fsp--;

             current =iv_ruleInfixApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfixApplication5988); 

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
    // $ANTLR end "entryRuleInfixApplication"


    // $ANTLR start "ruleInfixApplication"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2526:1: ruleInfixApplication returns [EObject current=null] : ( ( (lv_firstExpression_0_0= ruleNameExpr ) ) otherlv_1= '=' ( ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) ) ) ) ;
    public final EObject ruleInfixApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_firstExpression_0_0 = null;

        EObject lv_secondExpression_2_1 = null;

        EObject lv_secondExpression_2_2 = null;

        EObject lv_secondExpression_2_3 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2529:28: ( ( ( (lv_firstExpression_0_0= ruleNameExpr ) ) otherlv_1= '=' ( ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2530:1: ( ( (lv_firstExpression_0_0= ruleNameExpr ) ) otherlv_1= '=' ( ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2530:1: ( ( (lv_firstExpression_0_0= ruleNameExpr ) ) otherlv_1= '=' ( ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2530:2: ( (lv_firstExpression_0_0= ruleNameExpr ) ) otherlv_1= '=' ( ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2530:2: ( (lv_firstExpression_0_0= ruleNameExpr ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2531:1: (lv_firstExpression_0_0= ruleNameExpr )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2531:1: (lv_firstExpression_0_0= ruleNameExpr )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2532:3: lv_firstExpression_0_0= ruleNameExpr
            {
             
            	        newCompositeNode(grammarAccess.getInfixApplicationAccess().getFirstExpressionNameExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNameExpr_in_ruleInfixApplication6034);
            lv_firstExpression_0_0=ruleNameExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInfixApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"firstExpression",
                    		lv_firstExpression_0_0, 
                    		"NameExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleInfixApplication6046); 

                	newLeafNode(otherlv_1, grammarAccess.getInfixApplicationAccess().getEqualsSignKeyword_1());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2552:1: ( ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2553:1: ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2553:1: ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2554:1: (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2554:1: (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression )
            int alt37=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIERS:
                {
                alt37=1;
                }
                break;
            case RULE_NUMERALS:
                {
                alt37=2;
                }
                break;
            case 35:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2555:3: lv_secondExpression_2_1= ruleNameExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getInfixApplicationAccess().getSecondExpressionNameExprParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNameExpr_in_ruleInfixApplication6069);
                    lv_secondExpression_2_1=ruleNameExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInfixApplicationRule());
                    	        }
                           		set(
                           			current, 
                           			"secondExpression",
                            		lv_secondExpression_2_1, 
                            		"NameExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2570:8: lv_secondExpression_2_2= ruleNumeral
                    {
                     
                    	        newCompositeNode(grammarAccess.getInfixApplicationAccess().getSecondExpressionNumeralParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleNumeral_in_ruleInfixApplication6088);
                    lv_secondExpression_2_2=ruleNumeral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInfixApplicationRule());
                    	        }
                           		set(
                           			current, 
                           			"secondExpression",
                            		lv_secondExpression_2_2, 
                            		"Numeral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2585:8: lv_secondExpression_2_3= ruleBracketedExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getInfixApplicationAccess().getSecondExpressionBracketedExpressionParserRuleCall_2_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleBracketedExpression_in_ruleInfixApplication6107);
                    lv_secondExpression_2_3=ruleBracketedExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInfixApplicationRule());
                    	        }
                           		set(
                           			current, 
                           			"secondExpression",
                            		lv_secondExpression_2_3, 
                            		"BracketedExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleInfixApplication"


    // $ANTLR start "entryRuleName"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2611:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2612:2: (iv_ruleName= ruleName EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2613:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName6146);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName6156); 

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2620:1: ruleName returns [EObject current=null] : ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;

         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2623:28: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2624:1: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2624:1: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2625:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2625:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2626:3: lv_identifier_0_0= RULE_IDENTIFIERS
            {
            lv_identifier_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleName6197); 

            			newLeafNode(lv_identifier_0_0, grammarAccess.getNameAccess().getIdentifierIDENTIFIERSTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"identifier",
                    		lv_identifier_0_0, 
                    		"IDENTIFIERS");
            	    

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleNumeral"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2650:1: entryRuleNumeral returns [EObject current=null] : iv_ruleNumeral= ruleNumeral EOF ;
    public final EObject entryRuleNumeral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeral = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2651:2: (iv_ruleNumeral= ruleNumeral EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2652:2: iv_ruleNumeral= ruleNumeral EOF
            {
             newCompositeNode(grammarAccess.getNumeralRule()); 
            pushFollow(FOLLOW_ruleNumeral_in_entryRuleNumeral6237);
            iv_ruleNumeral=ruleNumeral();

            state._fsp--;

             current =iv_ruleNumeral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumeral6247); 

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
    // $ANTLR end "entryRuleNumeral"


    // $ANTLR start "ruleNumeral"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2659:1: ruleNumeral returns [EObject current=null] : ( (lv_number_0_0= RULE_NUMERALS ) ) ;
    public final EObject ruleNumeral() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;

         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2662:28: ( ( (lv_number_0_0= RULE_NUMERALS ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2663:1: ( (lv_number_0_0= RULE_NUMERALS ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2663:1: ( (lv_number_0_0= RULE_NUMERALS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2664:1: (lv_number_0_0= RULE_NUMERALS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2664:1: (lv_number_0_0= RULE_NUMERALS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2665:3: lv_number_0_0= RULE_NUMERALS
            {
            lv_number_0_0=(Token)match(input,RULE_NUMERALS,FOLLOW_RULE_NUMERALS_in_ruleNumeral6288); 

            			newLeafNode(lv_number_0_0, grammarAccess.getNumeralAccess().getNumberNUMERALSTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumeralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"number",
                    		lv_number_0_0, 
                    		"NUMERALS");
            	    

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
    // $ANTLR end "ruleNumeral"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleContext127 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_ruleContext144 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleContextBody_in_ruleContext165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextBody_in_entryRuleContextBody201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextBody211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleContextBody248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDeclarations_in_ruleContextBody269 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleContextBody281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarations_in_entryRuleDeclarations317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarations327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleDeclarations373 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDeclarations385 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_ruleDeclaration479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleDeclaration_in_ruleDeclaration506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDeclaration551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleTypeDeclaration593 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTypeDeclaration610 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleTypeDeclaration623 = new BitSet(new long[]{0x000000000004C010L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleTypeDeclaration644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDef739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarType_in_ruleTypeDef766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleType858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleType885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleType912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubrange_in_ruleType939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBasicType1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleQualifiedName1126 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName1143 = new BitSet(new long[]{0x0000000000054010L});
    public static final BitSet FOLLOW_ruleActualParameters_in_ruleQualifiedName1164 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName1177 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedName1189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleQualifiedName1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParameters_in_entryRuleActualParameters1247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualParameters1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleActualParameters1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubrange_in_entryRuleSubrange1337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubrange1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSubrange1384 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleBound_in_ruleSubrange1405 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSubrange1417 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleBound_in_ruleSubrange1438 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSubrange1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_entryRuleBound1486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBound1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBound1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarType_in_entryRuleScalarType1576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarType1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleScalarType1623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleScalarType1641 = new BitSet(new long[]{0x0000000000210010L});
    public static final BitSet FOLLOW_21_in_ruleScalarType1659 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleScalarType1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleDeclaration_in_entryRuleModuleDeclaration1711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleDeclaration1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleModuleDeclaration1763 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleModuleDeclaration1780 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleModule_in_ruleModuleDeclaration1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule1837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseModule_in_ruleModule1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseModule_in_entryRuleBaseModule1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseModule1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleBaseModule1974 = new BitSet(new long[]{0x000000001F800400L});
    public static final BitSet FOLLOW_ruleBaseDeclarations_in_ruleBaseModule1996 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleBaseModule2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseDeclarations_in_entryRuleBaseDeclarations2043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseDeclarations2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseDeclaration_in_ruleBaseDeclarations2098 = new BitSet(new long[]{0x000000001F800002L});
    public static final BitSet FOLLOW_ruleBaseDeclaration_in_entryRuleBaseDeclaration2134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseDeclaration2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDecl_in_ruleBaseDeclaration2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDecl_in_ruleBaseDeclaration2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDecl_in_ruleBaseDeclaration2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefDecl_in_ruleBaseDeclaration2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDecl_in_ruleBaseDeclaration2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransDecl_in_ruleBaseDeclaration2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDecl_in_entryRuleInputDecl2361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputDecl2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleInputDecl2408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarDecls_in_ruleInputDecl2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDecl_in_entryRuleOutputDecl2465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputDecl2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOutputDecl2512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarDecls_in_ruleOutputDecl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDecl_in_entryRuleLocalDecl2569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalDecl2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleLocalDecl2616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarDecls_in_ruleLocalDecl2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefDecl_in_entryRuleDefDecl2673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefDecl2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDefDecl2720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefinitions_in_ruleDefDecl2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDecl_in_entryRuleInitDecl2777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitDecl2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleInitDecl2824 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleDefinitionOrCommand_in_ruleInitDecl2846 = new BitSet(new long[]{0x0000000000040812L});
    public static final BitSet FOLLOW_11_in_ruleInitDecl2859 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_ruleTransDecl_in_entryRuleTransDecl2899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransDecl2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTransDecl2946 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleDefinitionOrCommand_in_ruleTransDecl2968 = new BitSet(new long[]{0x0000000000040812L});
    public static final BitSet FOLLOW_11_in_ruleTransDecl2981 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_ruleVarDecls_in_entryRuleVarDecls3021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecls3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleVarDecls3077 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_21_in_ruleVarDecls3090 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl3129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleVarDecl3182 = new BitSet(new long[]{0x0000000020200010L});
    public static final BitSet FOLLOW_21_in_ruleVarDecl3200 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_29_in_ruleVarDecl3216 = new BitSet(new long[]{0x0000000000044010L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarDecl3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitions_in_entryRuleDefinitions3273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitions3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleDefinitions3329 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_11_in_ruleDefinitions3342 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDefinitionOrCommand_in_entryRuleDefinitionOrCommand3381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionOrCommand3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleDefinitionOrCommand3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDefinitionOrCommand3456 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleSomeCommands_in_ruleDefinitionOrCommand3478 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDefinitionOrCommand3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition3526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDefinition_in_ruleDefinition3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDefinition_in_entryRuleSimpleDefinition3616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleDefinition3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLhs_in_ruleSimpleDefinition3672 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleRhsDefinition_in_ruleSimpleDefinition3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLhs_in_entryRuleLhs3729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLhs3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleLhs3781 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleLhs3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRhsDefinition_in_entryRuleRhsDefinition3837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRhsDefinition3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRhsExpression_in_ruleRhsDefinition3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRhsExpression_in_entryRuleRhsExpression3927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRhsExpression3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRhsExpression3974 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRhsExpression3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeCommands_in_entryRuleSomeCommands4031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeCommands4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeCommand_in_ruleSomeCommands4087 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleSomeCommands4100 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleSomeCommand_in_ruleSomeCommands4121 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleSomeCommands4136 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleElseCommand_in_ruleSomeCommands4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeCommand_in_entryRuleSomeCommand4195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeCommand4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedCommand_in_ruleSomeCommand4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedCommand_in_entryRuleNamedCommand4285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedCommand4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleNamedCommand4338 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleNamedCommand4355 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleGuardedCommand_in_ruleNamedCommand4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuardedCommand_in_entryRuleGuardedCommand4414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuardedCommand4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_ruleGuardedCommand4470 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleGuardedCommand4482 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleAssignments_in_ruleGuardedCommand4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard4539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleGuard4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignments_in_entryRuleAssignments4629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignments4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDefinition_in_ruleAssignments4685 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleAssignments4699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSimpleDefinition_in_ruleAssignments4720 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleAssignments4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElseCommand_in_entryRuleElseCommand4773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElseCommand4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleElseCommand4826 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleElseCommand4843 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleElseCommand4857 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleAssignments_in_ruleElseCommand4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameExpr_in_ruleExpression4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextVariable_in_ruleExpression4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleExpression5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOuterInfixApplication_in_ruleExpression5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketedExpression_in_ruleExpression5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketedExpression_in_entryRuleBracketedExpression5114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBracketedExpression5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBracketedExpression5161 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBracketedExpression5182 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleBracketedExpression5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOuterInfixApplication_in_entryRuleOuterInfixApplication5230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOuterInfixApplication5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleOuterInfixApplication5288 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInfixApplication_in_ruleOuterInfixApplication5307 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleOuterInfixApplication5322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleOuterInfixApplication5344 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInfixApplication_in_ruleOuterInfixApplication5363 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNameExpr_in_entryRuleNameExpr5404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameExpr5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleNameExpr5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextVariable_in_entryRuleNextVariable5494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNextVariable5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleNextVariable5546 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleNextVariable5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication5599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleApplication5655 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleApplication5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction5712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameExpr_in_ruleFunction5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument5802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument5812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameExpr_in_ruleArgument5860 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleBracketedExpression_in_ruleArgument5879 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleArgument5895 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleNameExpr_in_ruleArgument5918 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleBracketedExpression_in_ruleArgument5937 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleInfixApplication_in_entryRuleInfixApplication5978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfixApplication5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameExpr_in_ruleInfixApplication6034 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInfixApplication6046 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleNameExpr_in_ruleInfixApplication6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleInfixApplication6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketedExpression_in_ruleInfixApplication6107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName6146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName6156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleName6197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_entryRuleNumeral6237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumeral6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMERALS_in_ruleNumeral6288 = new BitSet(new long[]{0x0000000000000002L});

}