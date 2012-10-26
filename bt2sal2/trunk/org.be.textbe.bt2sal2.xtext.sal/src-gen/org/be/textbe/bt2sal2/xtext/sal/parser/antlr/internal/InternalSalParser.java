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

                if ( (LA5_2==EOF||(LA5_2>=10 && LA5_2<=11)||LA5_2==16||LA5_2==21||(LA5_2>=23 && LA5_2<=28)) ) {
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:684:1: ruleScalarType returns [EObject current=null] : (otherlv_0= '{' ( (lv_firstType_1_0= RULE_IDENTIFIERS ) ) (otherlv_2= ',' ( (lv_nextType_3_0= RULE_IDENTIFIERS ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleScalarType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_firstType_1_0=null;
        Token otherlv_2=null;
        Token lv_nextType_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:687:28: ( (otherlv_0= '{' ( (lv_firstType_1_0= RULE_IDENTIFIERS ) ) (otherlv_2= ',' ( (lv_nextType_3_0= RULE_IDENTIFIERS ) ) )* otherlv_4= '}' ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:688:1: (otherlv_0= '{' ( (lv_firstType_1_0= RULE_IDENTIFIERS ) ) (otherlv_2= ',' ( (lv_nextType_3_0= RULE_IDENTIFIERS ) ) )* otherlv_4= '}' )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:688:1: (otherlv_0= '{' ( (lv_firstType_1_0= RULE_IDENTIFIERS ) ) (otherlv_2= ',' ( (lv_nextType_3_0= RULE_IDENTIFIERS ) ) )* otherlv_4= '}' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:688:3: otherlv_0= '{' ( (lv_firstType_1_0= RULE_IDENTIFIERS ) ) (otherlv_2= ',' ( (lv_nextType_3_0= RULE_IDENTIFIERS ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleScalarType1623); 

                	newLeafNode(otherlv_0, grammarAccess.getScalarTypeAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:692:1: ( (lv_firstType_1_0= RULE_IDENTIFIERS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:693:1: (lv_firstType_1_0= RULE_IDENTIFIERS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:693:1: (lv_firstType_1_0= RULE_IDENTIFIERS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:694:3: lv_firstType_1_0= RULE_IDENTIFIERS
            {
            lv_firstType_1_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleScalarType1640); 

            			newLeafNode(lv_firstType_1_0, grammarAccess.getScalarTypeAccess().getFirstTypeIDENTIFIERSTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScalarTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"firstType",
                    		lv_firstType_1_0, 
                    		"IDENTIFIERS");
            	    

            }


            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:710:2: (otherlv_2= ',' ( (lv_nextType_3_0= RULE_IDENTIFIERS ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:710:4: otherlv_2= ',' ( (lv_nextType_3_0= RULE_IDENTIFIERS ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleScalarType1658); 

            	        	newLeafNode(otherlv_2, grammarAccess.getScalarTypeAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:714:1: ( (lv_nextType_3_0= RULE_IDENTIFIERS ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:715:1: (lv_nextType_3_0= RULE_IDENTIFIERS )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:715:1: (lv_nextType_3_0= RULE_IDENTIFIERS )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:716:3: lv_nextType_3_0= RULE_IDENTIFIERS
            	    {
            	    lv_nextType_3_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleScalarType1675); 

            	    			newLeafNode(lv_nextType_3_0, grammarAccess.getScalarTypeAccess().getNextTypeIDENTIFIERSTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScalarTypeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"nextType",
            	            		lv_nextType_3_0, 
            	            		"IDENTIFIERS");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleScalarType1694); 

                	newLeafNode(otherlv_4, grammarAccess.getScalarTypeAccess().getRightCurlyBracketKeyword_3());
                

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:744:1: entryRuleModuleDeclaration returns [EObject current=null] : iv_ruleModuleDeclaration= ruleModuleDeclaration EOF ;
    public final EObject entryRuleModuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleDeclaration = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:745:2: (iv_ruleModuleDeclaration= ruleModuleDeclaration EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:746:2: iv_ruleModuleDeclaration= ruleModuleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getModuleDeclarationRule()); 
            pushFollow(FOLLOW_ruleModuleDeclaration_in_entryRuleModuleDeclaration1730);
            iv_ruleModuleDeclaration=ruleModuleDeclaration();

            state._fsp--;

             current =iv_ruleModuleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleDeclaration1740); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:753:1: ruleModuleDeclaration returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': MODULE =' ( (lv_module_2_0= ruleModule ) ) ) ;
    public final EObject ruleModuleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        EObject lv_module_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:756:28: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': MODULE =' ( (lv_module_2_0= ruleModule ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:757:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': MODULE =' ( (lv_module_2_0= ruleModule ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:757:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': MODULE =' ( (lv_module_2_0= ruleModule ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:757:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': MODULE =' ( (lv_module_2_0= ruleModule ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:757:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:758:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:758:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:759:3: lv_identifier_0_0= RULE_IDENTIFIERS
            {
            lv_identifier_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleModuleDeclaration1782); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleModuleDeclaration1799); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleDeclarationAccess().getMODULEKeyword_1());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:779:1: ( (lv_module_2_0= ruleModule ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:780:1: (lv_module_2_0= ruleModule )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:780:1: (lv_module_2_0= ruleModule )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:781:3: lv_module_2_0= ruleModule
            {
             
            	        newCompositeNode(grammarAccess.getModuleDeclarationAccess().getModuleModuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleModule_in_ruleModuleDeclaration1820);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:805:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:806:2: (iv_ruleModule= ruleModule EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:807:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule1856);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule1866); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:814:1: ruleModule returns [EObject current=null] : this_BaseModule_0= ruleBaseModule ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        EObject this_BaseModule_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:817:28: (this_BaseModule_0= ruleBaseModule )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:819:5: this_BaseModule_0= ruleBaseModule
            {
             
                    newCompositeNode(grammarAccess.getModuleAccess().getBaseModuleParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleBaseModule_in_ruleModule1912);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:835:1: entryRuleBaseModule returns [EObject current=null] : iv_ruleBaseModule= ruleBaseModule EOF ;
    public final EObject entryRuleBaseModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseModule = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:836:2: (iv_ruleBaseModule= ruleBaseModule EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:837:2: iv_ruleBaseModule= ruleBaseModule EOF
            {
             newCompositeNode(grammarAccess.getBaseModuleRule()); 
            pushFollow(FOLLOW_ruleBaseModule_in_entryRuleBaseModule1946);
            iv_ruleBaseModule=ruleBaseModule();

            state._fsp--;

             current =iv_ruleBaseModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseModule1956); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:844:1: ruleBaseModule returns [EObject current=null] : (otherlv_0= 'BEGIN' this_BaseDeclarations_1= ruleBaseDeclarations otherlv_2= 'END' ) ;
    public final EObject ruleBaseModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_BaseDeclarations_1 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:847:28: ( (otherlv_0= 'BEGIN' this_BaseDeclarations_1= ruleBaseDeclarations otherlv_2= 'END' ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:848:1: (otherlv_0= 'BEGIN' this_BaseDeclarations_1= ruleBaseDeclarations otherlv_2= 'END' )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:848:1: (otherlv_0= 'BEGIN' this_BaseDeclarations_1= ruleBaseDeclarations otherlv_2= 'END' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:848:3: otherlv_0= 'BEGIN' this_BaseDeclarations_1= ruleBaseDeclarations otherlv_2= 'END'
            {
            otherlv_0=(Token)match(input,9,FOLLOW_9_in_ruleBaseModule1993); 

                	newLeafNode(otherlv_0, grammarAccess.getBaseModuleAccess().getBEGINKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getBaseModuleAccess().getBaseDeclarationsParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleBaseDeclarations_in_ruleBaseModule2015);
            this_BaseDeclarations_1=ruleBaseDeclarations();

            state._fsp--;

             
                    current = this_BaseDeclarations_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,10,FOLLOW_10_in_ruleBaseModule2026); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:873:1: entryRuleBaseDeclarations returns [EObject current=null] : iv_ruleBaseDeclarations= ruleBaseDeclarations EOF ;
    public final EObject entryRuleBaseDeclarations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseDeclarations = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:874:2: (iv_ruleBaseDeclarations= ruleBaseDeclarations EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:875:2: iv_ruleBaseDeclarations= ruleBaseDeclarations EOF
            {
             newCompositeNode(grammarAccess.getBaseDeclarationsRule()); 
            pushFollow(FOLLOW_ruleBaseDeclarations_in_entryRuleBaseDeclarations2062);
            iv_ruleBaseDeclarations=ruleBaseDeclarations();

            state._fsp--;

             current =iv_ruleBaseDeclarations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseDeclarations2072); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:882:1: ruleBaseDeclarations returns [EObject current=null] : ( (lv_baseDeclaration_0_0= ruleBaseDeclaration ) )* ;
    public final EObject ruleBaseDeclarations() throws RecognitionException {
        EObject current = null;

        EObject lv_baseDeclaration_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:885:28: ( ( (lv_baseDeclaration_0_0= ruleBaseDeclaration ) )* )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:886:1: ( (lv_baseDeclaration_0_0= ruleBaseDeclaration ) )*
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:886:1: ( (lv_baseDeclaration_0_0= ruleBaseDeclaration ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=23 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:887:1: (lv_baseDeclaration_0_0= ruleBaseDeclaration )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:887:1: (lv_baseDeclaration_0_0= ruleBaseDeclaration )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:888:3: lv_baseDeclaration_0_0= ruleBaseDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBaseDeclarationsAccess().getBaseDeclarationBaseDeclarationParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBaseDeclaration_in_ruleBaseDeclarations2117);
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
            	    break loop8;
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:912:1: entryRuleBaseDeclaration returns [EObject current=null] : iv_ruleBaseDeclaration= ruleBaseDeclaration EOF ;
    public final EObject entryRuleBaseDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseDeclaration = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:913:2: (iv_ruleBaseDeclaration= ruleBaseDeclaration EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:914:2: iv_ruleBaseDeclaration= ruleBaseDeclaration EOF
            {
             newCompositeNode(grammarAccess.getBaseDeclarationRule()); 
            pushFollow(FOLLOW_ruleBaseDeclaration_in_entryRuleBaseDeclaration2153);
            iv_ruleBaseDeclaration=ruleBaseDeclaration();

            state._fsp--;

             current =iv_ruleBaseDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseDeclaration2163); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:921:1: ruleBaseDeclaration returns [EObject current=null] : (this_InputDecl_0= ruleInputDecl | this_OutputDecl_1= ruleOutputDecl | this_LocalDecl_2= ruleLocalDecl | this_DefDecl_3= ruleDefDecl | this_InitDecl_4= ruleInitDecl | this_TransDecl_5= ruleTransDecl ) ;
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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:924:28: ( (this_InputDecl_0= ruleInputDecl | this_OutputDecl_1= ruleOutputDecl | this_LocalDecl_2= ruleLocalDecl | this_DefDecl_3= ruleDefDecl | this_InitDecl_4= ruleInitDecl | this_TransDecl_5= ruleTransDecl ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:925:1: (this_InputDecl_0= ruleInputDecl | this_OutputDecl_1= ruleOutputDecl | this_LocalDecl_2= ruleLocalDecl | this_DefDecl_3= ruleDefDecl | this_InitDecl_4= ruleInitDecl | this_TransDecl_5= ruleTransDecl )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:925:1: (this_InputDecl_0= ruleInputDecl | this_OutputDecl_1= ruleOutputDecl | this_LocalDecl_2= ruleLocalDecl | this_DefDecl_3= ruleDefDecl | this_InitDecl_4= ruleInitDecl | this_TransDecl_5= ruleTransDecl )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            case 26:
                {
                alt9=4;
                }
                break;
            case 27:
                {
                alt9=5;
                }
                break;
            case 28:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:926:5: this_InputDecl_0= ruleInputDecl
                    {
                     
                            newCompositeNode(grammarAccess.getBaseDeclarationAccess().getInputDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInputDecl_in_ruleBaseDeclaration2210);
                    this_InputDecl_0=ruleInputDecl();

                    state._fsp--;

                     
                            current = this_InputDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:936:5: this_OutputDecl_1= ruleOutputDecl
                    {
                     
                            newCompositeNode(grammarAccess.getBaseDeclarationAccess().getOutputDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOutputDecl_in_ruleBaseDeclaration2237);
                    this_OutputDecl_1=ruleOutputDecl();

                    state._fsp--;

                     
                            current = this_OutputDecl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:946:5: this_LocalDecl_2= ruleLocalDecl
                    {
                     
                            newCompositeNode(grammarAccess.getBaseDeclarationAccess().getLocalDeclParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLocalDecl_in_ruleBaseDeclaration2264);
                    this_LocalDecl_2=ruleLocalDecl();

                    state._fsp--;

                     
                            current = this_LocalDecl_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:956:5: this_DefDecl_3= ruleDefDecl
                    {
                     
                            newCompositeNode(grammarAccess.getBaseDeclarationAccess().getDefDeclParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDefDecl_in_ruleBaseDeclaration2291);
                    this_DefDecl_3=ruleDefDecl();

                    state._fsp--;

                     
                            current = this_DefDecl_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:966:5: this_InitDecl_4= ruleInitDecl
                    {
                     
                            newCompositeNode(grammarAccess.getBaseDeclarationAccess().getInitDeclParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInitDecl_in_ruleBaseDeclaration2318);
                    this_InitDecl_4=ruleInitDecl();

                    state._fsp--;

                     
                            current = this_InitDecl_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:976:5: this_TransDecl_5= ruleTransDecl
                    {
                     
                            newCompositeNode(grammarAccess.getBaseDeclarationAccess().getTransDeclParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTransDecl_in_ruleBaseDeclaration2345);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:992:1: entryRuleInputDecl returns [EObject current=null] : iv_ruleInputDecl= ruleInputDecl EOF ;
    public final EObject entryRuleInputDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputDecl = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:993:2: (iv_ruleInputDecl= ruleInputDecl EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:994:2: iv_ruleInputDecl= ruleInputDecl EOF
            {
             newCompositeNode(grammarAccess.getInputDeclRule()); 
            pushFollow(FOLLOW_ruleInputDecl_in_entryRuleInputDecl2380);
            iv_ruleInputDecl=ruleInputDecl();

            state._fsp--;

             current =iv_ruleInputDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputDecl2390); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1001:1: ruleInputDecl returns [EObject current=null] : (otherlv_0= 'INPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) ) ;
    public final EObject ruleInputDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_varDecls_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1004:28: ( (otherlv_0= 'INPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1005:1: (otherlv_0= 'INPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1005:1: (otherlv_0= 'INPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1005:3: otherlv_0= 'INPUT' ( (lv_varDecls_1_0= ruleVarDecls ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleInputDecl2427); 

                	newLeafNode(otherlv_0, grammarAccess.getInputDeclAccess().getINPUTKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1009:1: ( (lv_varDecls_1_0= ruleVarDecls ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1010:1: (lv_varDecls_1_0= ruleVarDecls )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1010:1: (lv_varDecls_1_0= ruleVarDecls )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1011:3: lv_varDecls_1_0= ruleVarDecls
            {
             
            	        newCompositeNode(grammarAccess.getInputDeclAccess().getVarDeclsVarDeclsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVarDecls_in_ruleInputDecl2448);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1035:1: entryRuleOutputDecl returns [EObject current=null] : iv_ruleOutputDecl= ruleOutputDecl EOF ;
    public final EObject entryRuleOutputDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDecl = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1036:2: (iv_ruleOutputDecl= ruleOutputDecl EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1037:2: iv_ruleOutputDecl= ruleOutputDecl EOF
            {
             newCompositeNode(grammarAccess.getOutputDeclRule()); 
            pushFollow(FOLLOW_ruleOutputDecl_in_entryRuleOutputDecl2484);
            iv_ruleOutputDecl=ruleOutputDecl();

            state._fsp--;

             current =iv_ruleOutputDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputDecl2494); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1044:1: ruleOutputDecl returns [EObject current=null] : (otherlv_0= 'OUTPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) ) ;
    public final EObject ruleOutputDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_varDecls_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1047:28: ( (otherlv_0= 'OUTPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1048:1: (otherlv_0= 'OUTPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1048:1: (otherlv_0= 'OUTPUT' ( (lv_varDecls_1_0= ruleVarDecls ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1048:3: otherlv_0= 'OUTPUT' ( (lv_varDecls_1_0= ruleVarDecls ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleOutputDecl2531); 

                	newLeafNode(otherlv_0, grammarAccess.getOutputDeclAccess().getOUTPUTKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1052:1: ( (lv_varDecls_1_0= ruleVarDecls ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1053:1: (lv_varDecls_1_0= ruleVarDecls )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1053:1: (lv_varDecls_1_0= ruleVarDecls )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1054:3: lv_varDecls_1_0= ruleVarDecls
            {
             
            	        newCompositeNode(grammarAccess.getOutputDeclAccess().getVarDeclsVarDeclsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVarDecls_in_ruleOutputDecl2552);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1078:1: entryRuleLocalDecl returns [EObject current=null] : iv_ruleLocalDecl= ruleLocalDecl EOF ;
    public final EObject entryRuleLocalDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalDecl = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1079:2: (iv_ruleLocalDecl= ruleLocalDecl EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1080:2: iv_ruleLocalDecl= ruleLocalDecl EOF
            {
             newCompositeNode(grammarAccess.getLocalDeclRule()); 
            pushFollow(FOLLOW_ruleLocalDecl_in_entryRuleLocalDecl2588);
            iv_ruleLocalDecl=ruleLocalDecl();

            state._fsp--;

             current =iv_ruleLocalDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalDecl2598); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1087:1: ruleLocalDecl returns [EObject current=null] : (otherlv_0= 'LOCAL' ( (lv_varDecls_1_0= ruleVarDecls ) ) ) ;
    public final EObject ruleLocalDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_varDecls_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1090:28: ( (otherlv_0= 'LOCAL' ( (lv_varDecls_1_0= ruleVarDecls ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1091:1: (otherlv_0= 'LOCAL' ( (lv_varDecls_1_0= ruleVarDecls ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1091:1: (otherlv_0= 'LOCAL' ( (lv_varDecls_1_0= ruleVarDecls ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1091:3: otherlv_0= 'LOCAL' ( (lv_varDecls_1_0= ruleVarDecls ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleLocalDecl2635); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalDeclAccess().getLOCALKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1095:1: ( (lv_varDecls_1_0= ruleVarDecls ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1096:1: (lv_varDecls_1_0= ruleVarDecls )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1096:1: (lv_varDecls_1_0= ruleVarDecls )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1097:3: lv_varDecls_1_0= ruleVarDecls
            {
             
            	        newCompositeNode(grammarAccess.getLocalDeclAccess().getVarDeclsVarDeclsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVarDecls_in_ruleLocalDecl2656);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1121:1: entryRuleDefDecl returns [EObject current=null] : iv_ruleDefDecl= ruleDefDecl EOF ;
    public final EObject entryRuleDefDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefDecl = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1122:2: (iv_ruleDefDecl= ruleDefDecl EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1123:2: iv_ruleDefDecl= ruleDefDecl EOF
            {
             newCompositeNode(grammarAccess.getDefDeclRule()); 
            pushFollow(FOLLOW_ruleDefDecl_in_entryRuleDefDecl2692);
            iv_ruleDefDecl=ruleDefDecl();

            state._fsp--;

             current =iv_ruleDefDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefDecl2702); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1130:1: ruleDefDecl returns [EObject current=null] : (otherlv_0= 'DEFINITION' ( (lv_definitions_1_0= ruleDefinitions ) ) ) ;
    public final EObject ruleDefDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_definitions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1133:28: ( (otherlv_0= 'DEFINITION' ( (lv_definitions_1_0= ruleDefinitions ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1134:1: (otherlv_0= 'DEFINITION' ( (lv_definitions_1_0= ruleDefinitions ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1134:1: (otherlv_0= 'DEFINITION' ( (lv_definitions_1_0= ruleDefinitions ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1134:3: otherlv_0= 'DEFINITION' ( (lv_definitions_1_0= ruleDefinitions ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleDefDecl2739); 

                	newLeafNode(otherlv_0, grammarAccess.getDefDeclAccess().getDEFINITIONKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1138:1: ( (lv_definitions_1_0= ruleDefinitions ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1139:1: (lv_definitions_1_0= ruleDefinitions )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1139:1: (lv_definitions_1_0= ruleDefinitions )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1140:3: lv_definitions_1_0= ruleDefinitions
            {
             
            	        newCompositeNode(grammarAccess.getDefDeclAccess().getDefinitionsDefinitionsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDefinitions_in_ruleDefDecl2760);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1164:1: entryRuleInitDecl returns [EObject current=null] : iv_ruleInitDecl= ruleInitDecl EOF ;
    public final EObject entryRuleInitDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitDecl = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1165:2: (iv_ruleInitDecl= ruleInitDecl EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1166:2: iv_ruleInitDecl= ruleInitDecl EOF
            {
             newCompositeNode(grammarAccess.getInitDeclRule()); 
            pushFollow(FOLLOW_ruleInitDecl_in_entryRuleInitDecl2796);
            iv_ruleInitDecl=ruleInitDecl();

            state._fsp--;

             current =iv_ruleInitDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitDecl2806); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1173:1: ruleInitDecl returns [EObject current=null] : (otherlv_0= 'INITIALIZATION' ( (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) ) )* (otherlv_4= ';' )? ) ;
    public final EObject ruleInitDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_firstDefinitionOrCommand_1_0 = null;

        EObject lv_nextDefinitionOrCommand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1176:28: ( (otherlv_0= 'INITIALIZATION' ( (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) ) )* (otherlv_4= ';' )? ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1177:1: (otherlv_0= 'INITIALIZATION' ( (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) ) )* (otherlv_4= ';' )? )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1177:1: (otherlv_0= 'INITIALIZATION' ( (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) ) )* (otherlv_4= ';' )? )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1177:3: otherlv_0= 'INITIALIZATION' ( (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) ) )* (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleInitDecl2843); 

                	newLeafNode(otherlv_0, grammarAccess.getInitDeclAccess().getINITIALIZATIONKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1181:1: ( (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1182:1: (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1182:1: (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1183:3: lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand
            {
             
            	        newCompositeNode(grammarAccess.getInitDeclAccess().getFirstDefinitionOrCommandDefinitionOrCommandParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDefinitionOrCommand_in_ruleInitDecl2864);
            lv_firstDefinitionOrCommand_1_0=ruleDefinitionOrCommand();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInitDeclRule());
            	        }
                   		set(
                   			current, 
                   			"firstDefinitionOrCommand",
                    		lv_firstDefinitionOrCommand_1_0, 
                    		"DefinitionOrCommand");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1199:2: (otherlv_2= ';' ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_IDENTIFIERS||LA10_1==18) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1199:4: otherlv_2= ';' ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) )
            	    {
            	    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleInitDecl2877); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInitDeclAccess().getSemicolonKeyword_2_0());
            	        
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1203:1: ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1204:1: (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1204:1: (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1205:3: lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInitDeclAccess().getNextDefinitionOrCommandDefinitionOrCommandParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinitionOrCommand_in_ruleInitDecl2898);
            	    lv_nextDefinitionOrCommand_3_0=ruleDefinitionOrCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInitDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nextDefinitionOrCommand",
            	            		lv_nextDefinitionOrCommand_3_0, 
            	            		"DefinitionOrCommand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1221:4: (otherlv_4= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1221:6: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleInitDecl2913); 

                        	newLeafNode(otherlv_4, grammarAccess.getInitDeclAccess().getSemicolonKeyword_3());
                        

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
    // $ANTLR end "ruleInitDecl"


    // $ANTLR start "entryRuleTransDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1233:1: entryRuleTransDecl returns [EObject current=null] : iv_ruleTransDecl= ruleTransDecl EOF ;
    public final EObject entryRuleTransDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransDecl = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1234:2: (iv_ruleTransDecl= ruleTransDecl EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1235:2: iv_ruleTransDecl= ruleTransDecl EOF
            {
             newCompositeNode(grammarAccess.getTransDeclRule()); 
            pushFollow(FOLLOW_ruleTransDecl_in_entryRuleTransDecl2951);
            iv_ruleTransDecl=ruleTransDecl();

            state._fsp--;

             current =iv_ruleTransDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransDecl2961); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1242:1: ruleTransDecl returns [EObject current=null] : (otherlv_0= 'TRANSITION' ( (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) ) )* (otherlv_4= ';' )? ) ;
    public final EObject ruleTransDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_firstDefinitionOrCommand_1_0 = null;

        EObject lv_nextDefinitionOrCommand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1245:28: ( (otherlv_0= 'TRANSITION' ( (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) ) )* (otherlv_4= ';' )? ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1246:1: (otherlv_0= 'TRANSITION' ( (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) ) )* (otherlv_4= ';' )? )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1246:1: (otherlv_0= 'TRANSITION' ( (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) ) )* (otherlv_4= ';' )? )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1246:3: otherlv_0= 'TRANSITION' ( (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand ) ) (otherlv_2= ';' ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) ) )* (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleTransDecl2998); 

                	newLeafNode(otherlv_0, grammarAccess.getTransDeclAccess().getTRANSITIONKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1250:1: ( (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1251:1: (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1251:1: (lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1252:3: lv_firstDefinitionOrCommand_1_0= ruleDefinitionOrCommand
            {
             
            	        newCompositeNode(grammarAccess.getTransDeclAccess().getFirstDefinitionOrCommandDefinitionOrCommandParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDefinitionOrCommand_in_ruleTransDecl3019);
            lv_firstDefinitionOrCommand_1_0=ruleDefinitionOrCommand();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransDeclRule());
            	        }
                   		set(
                   			current, 
                   			"firstDefinitionOrCommand",
                    		lv_firstDefinitionOrCommand_1_0, 
                    		"DefinitionOrCommand");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1268:2: (otherlv_2= ';' ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==11) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==RULE_IDENTIFIERS||LA12_1==18) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1268:4: otherlv_2= ';' ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) )
            	    {
            	    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleTransDecl3032); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTransDeclAccess().getSemicolonKeyword_2_0());
            	        
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1272:1: ( (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1273:1: (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1273:1: (lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1274:3: lv_nextDefinitionOrCommand_3_0= ruleDefinitionOrCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransDeclAccess().getNextDefinitionOrCommandDefinitionOrCommandParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinitionOrCommand_in_ruleTransDecl3053);
            	    lv_nextDefinitionOrCommand_3_0=ruleDefinitionOrCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nextDefinitionOrCommand",
            	            		lv_nextDefinitionOrCommand_3_0, 
            	            		"DefinitionOrCommand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1290:4: (otherlv_4= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==11) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1290:6: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleTransDecl3068); 

                        	newLeafNode(otherlv_4, grammarAccess.getTransDeclAccess().getSemicolonKeyword_3());
                        

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
    // $ANTLR end "ruleTransDecl"


    // $ANTLR start "entryRuleVarDecls"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1302:1: entryRuleVarDecls returns [EObject current=null] : iv_ruleVarDecls= ruleVarDecls EOF ;
    public final EObject entryRuleVarDecls() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecls = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1303:2: (iv_ruleVarDecls= ruleVarDecls EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1304:2: iv_ruleVarDecls= ruleVarDecls EOF
            {
             newCompositeNode(grammarAccess.getVarDeclsRule()); 
            pushFollow(FOLLOW_ruleVarDecls_in_entryRuleVarDecls3106);
            iv_ruleVarDecls=ruleVarDecls();

            state._fsp--;

             current =iv_ruleVarDecls; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecls3116); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1311:1: ruleVarDecls returns [EObject current=null] : ( ( (lv_firstVarDecl_0_0= ruleVarDecl ) ) (otherlv_1= ',' ( (lv_nextVarDecl_2_0= ruleVarDecl ) ) )* ) ;
    public final EObject ruleVarDecls() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_firstVarDecl_0_0 = null;

        EObject lv_nextVarDecl_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1314:28: ( ( ( (lv_firstVarDecl_0_0= ruleVarDecl ) ) (otherlv_1= ',' ( (lv_nextVarDecl_2_0= ruleVarDecl ) ) )* ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1315:1: ( ( (lv_firstVarDecl_0_0= ruleVarDecl ) ) (otherlv_1= ',' ( (lv_nextVarDecl_2_0= ruleVarDecl ) ) )* )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1315:1: ( ( (lv_firstVarDecl_0_0= ruleVarDecl ) ) (otherlv_1= ',' ( (lv_nextVarDecl_2_0= ruleVarDecl ) ) )* )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1315:2: ( (lv_firstVarDecl_0_0= ruleVarDecl ) ) (otherlv_1= ',' ( (lv_nextVarDecl_2_0= ruleVarDecl ) ) )*
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1315:2: ( (lv_firstVarDecl_0_0= ruleVarDecl ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1316:1: (lv_firstVarDecl_0_0= ruleVarDecl )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1316:1: (lv_firstVarDecl_0_0= ruleVarDecl )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1317:3: lv_firstVarDecl_0_0= ruleVarDecl
            {
             
            	        newCompositeNode(grammarAccess.getVarDeclsAccess().getFirstVarDeclVarDeclParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVarDecl_in_ruleVarDecls3162);
            lv_firstVarDecl_0_0=ruleVarDecl();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVarDeclsRule());
            	        }
                   		set(
                   			current, 
                   			"firstVarDecl",
                    		lv_firstVarDecl_0_0, 
                    		"VarDecl");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1333:2: (otherlv_1= ',' ( (lv_nextVarDecl_2_0= ruleVarDecl ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1333:4: otherlv_1= ',' ( (lv_nextVarDecl_2_0= ruleVarDecl ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleVarDecls3175); 

            	        	newLeafNode(otherlv_1, grammarAccess.getVarDeclsAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1337:1: ( (lv_nextVarDecl_2_0= ruleVarDecl ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1338:1: (lv_nextVarDecl_2_0= ruleVarDecl )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1338:1: (lv_nextVarDecl_2_0= ruleVarDecl )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1339:3: lv_nextVarDecl_2_0= ruleVarDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVarDeclsAccess().getNextVarDeclVarDeclParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVarDecl_in_ruleVarDecls3196);
            	    lv_nextVarDecl_2_0=ruleVarDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVarDeclsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nextVarDecl",
            	            		lv_nextVarDecl_2_0, 
            	            		"VarDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleVarDecls"


    // $ANTLR start "entryRuleVarDecl"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1363:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1364:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1365:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl3234);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl3244); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1372:1: ruleVarDecl returns [EObject current=null] : ( ( (lv_firstVar_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= ',' ( (lv_nextVar_2_0= RULE_IDENTIFIERS ) ) )* otherlv_3= ': ' ( (lv_type_4_0= ruleType ) ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_firstVar_0_0=null;
        Token otherlv_1=null;
        Token lv_nextVar_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1375:28: ( ( ( (lv_firstVar_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= ',' ( (lv_nextVar_2_0= RULE_IDENTIFIERS ) ) )* otherlv_3= ': ' ( (lv_type_4_0= ruleType ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1376:1: ( ( (lv_firstVar_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= ',' ( (lv_nextVar_2_0= RULE_IDENTIFIERS ) ) )* otherlv_3= ': ' ( (lv_type_4_0= ruleType ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1376:1: ( ( (lv_firstVar_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= ',' ( (lv_nextVar_2_0= RULE_IDENTIFIERS ) ) )* otherlv_3= ': ' ( (lv_type_4_0= ruleType ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1376:2: ( (lv_firstVar_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= ',' ( (lv_nextVar_2_0= RULE_IDENTIFIERS ) ) )* otherlv_3= ': ' ( (lv_type_4_0= ruleType ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1376:2: ( (lv_firstVar_0_0= RULE_IDENTIFIERS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1377:1: (lv_firstVar_0_0= RULE_IDENTIFIERS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1377:1: (lv_firstVar_0_0= RULE_IDENTIFIERS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1378:3: lv_firstVar_0_0= RULE_IDENTIFIERS
            {
            lv_firstVar_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleVarDecl3286); 

            			newLeafNode(lv_firstVar_0_0, grammarAccess.getVarDeclAccess().getFirstVarIDENTIFIERSTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVarDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"firstVar",
                    		lv_firstVar_0_0, 
                    		"IDENTIFIERS");
            	    

            }


            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1394:2: (otherlv_1= ',' ( (lv_nextVar_2_0= RULE_IDENTIFIERS ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1394:4: otherlv_1= ',' ( (lv_nextVar_2_0= RULE_IDENTIFIERS ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleVarDecl3304); 

            	        	newLeafNode(otherlv_1, grammarAccess.getVarDeclAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1398:1: ( (lv_nextVar_2_0= RULE_IDENTIFIERS ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1399:1: (lv_nextVar_2_0= RULE_IDENTIFIERS )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1399:1: (lv_nextVar_2_0= RULE_IDENTIFIERS )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1400:3: lv_nextVar_2_0= RULE_IDENTIFIERS
            	    {
            	    lv_nextVar_2_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleVarDecl3321); 

            	    			newLeafNode(lv_nextVar_2_0, grammarAccess.getVarDeclAccess().getNextVarIDENTIFIERSTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVarDeclRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"nextVar",
            	            		lv_nextVar_2_0, 
            	            		"IDENTIFIERS");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleVarDecl3340); 

                	newLeafNode(otherlv_3, grammarAccess.getVarDeclAccess().getColonSpaceKeyword_2());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1420:1: ( (lv_type_4_0= ruleType ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1421:1: (lv_type_4_0= ruleType )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1421:1: (lv_type_4_0= ruleType )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1422:3: lv_type_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVarDeclAccess().getTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVarDecl3361);
            lv_type_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVarDeclRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1446:1: entryRuleDefinitions returns [EObject current=null] : iv_ruleDefinitions= ruleDefinitions EOF ;
    public final EObject entryRuleDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitions = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1447:2: (iv_ruleDefinitions= ruleDefinitions EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1448:2: iv_ruleDefinitions= ruleDefinitions EOF
            {
             newCompositeNode(grammarAccess.getDefinitionsRule()); 
            pushFollow(FOLLOW_ruleDefinitions_in_entryRuleDefinitions3397);
            iv_ruleDefinitions=ruleDefinitions();

            state._fsp--;

             current =iv_ruleDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitions3407); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1455:1: ruleDefinitions returns [EObject current=null] : ( ( (lv_firstDefinition_0_0= ruleDefinition ) ) (otherlv_1= ';' ( (lv_nextDefinition_2_0= ruleDefinition ) ) )* ) ;
    public final EObject ruleDefinitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_firstDefinition_0_0 = null;

        EObject lv_nextDefinition_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1458:28: ( ( ( (lv_firstDefinition_0_0= ruleDefinition ) ) (otherlv_1= ';' ( (lv_nextDefinition_2_0= ruleDefinition ) ) )* ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1459:1: ( ( (lv_firstDefinition_0_0= ruleDefinition ) ) (otherlv_1= ';' ( (lv_nextDefinition_2_0= ruleDefinition ) ) )* )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1459:1: ( ( (lv_firstDefinition_0_0= ruleDefinition ) ) (otherlv_1= ';' ( (lv_nextDefinition_2_0= ruleDefinition ) ) )* )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1459:2: ( (lv_firstDefinition_0_0= ruleDefinition ) ) (otherlv_1= ';' ( (lv_nextDefinition_2_0= ruleDefinition ) ) )*
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1459:2: ( (lv_firstDefinition_0_0= ruleDefinition ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1460:1: (lv_firstDefinition_0_0= ruleDefinition )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1460:1: (lv_firstDefinition_0_0= ruleDefinition )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1461:3: lv_firstDefinition_0_0= ruleDefinition
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionsAccess().getFirstDefinitionDefinitionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDefinition_in_ruleDefinitions3453);
            lv_firstDefinition_0_0=ruleDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefinitionsRule());
            	        }
                   		set(
                   			current, 
                   			"firstDefinition",
                    		lv_firstDefinition_0_0, 
                    		"Definition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1477:2: (otherlv_1= ';' ( (lv_nextDefinition_2_0= ruleDefinition ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==11) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1477:4: otherlv_1= ';' ( (lv_nextDefinition_2_0= ruleDefinition ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleDefinitions3466); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDefinitionsAccess().getSemicolonKeyword_1_0());
            	        
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1481:1: ( (lv_nextDefinition_2_0= ruleDefinition ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1482:1: (lv_nextDefinition_2_0= ruleDefinition )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1482:1: (lv_nextDefinition_2_0= ruleDefinition )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1483:3: lv_nextDefinition_2_0= ruleDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefinitionsAccess().getNextDefinitionDefinitionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinition_in_ruleDefinitions3487);
            	    lv_nextDefinition_2_0=ruleDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefinitionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nextDefinition",
            	            		lv_nextDefinition_2_0, 
            	            		"Definition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleDefinitions"


    // $ANTLR start "entryRuleDefinitionOrCommand"
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1507:1: entryRuleDefinitionOrCommand returns [EObject current=null] : iv_ruleDefinitionOrCommand= ruleDefinitionOrCommand EOF ;
    public final EObject entryRuleDefinitionOrCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionOrCommand = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1508:2: (iv_ruleDefinitionOrCommand= ruleDefinitionOrCommand EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1509:2: iv_ruleDefinitionOrCommand= ruleDefinitionOrCommand EOF
            {
             newCompositeNode(grammarAccess.getDefinitionOrCommandRule()); 
            pushFollow(FOLLOW_ruleDefinitionOrCommand_in_entryRuleDefinitionOrCommand3525);
            iv_ruleDefinitionOrCommand=ruleDefinitionOrCommand();

            state._fsp--;

             current =iv_ruleDefinitionOrCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionOrCommand3535); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1516:1: ruleDefinitionOrCommand returns [EObject current=null] : (this_Definition_0= ruleDefinition | (otherlv_1= '[' this_SomeCommands_2= ruleSomeCommands otherlv_3= ']' ) ) ;
    public final EObject ruleDefinitionOrCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Definition_0 = null;

        EObject this_SomeCommands_2 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1519:28: ( (this_Definition_0= ruleDefinition | (otherlv_1= '[' this_SomeCommands_2= ruleSomeCommands otherlv_3= ']' ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1520:1: (this_Definition_0= ruleDefinition | (otherlv_1= '[' this_SomeCommands_2= ruleSomeCommands otherlv_3= ']' ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1520:1: (this_Definition_0= ruleDefinition | (otherlv_1= '[' this_SomeCommands_2= ruleSomeCommands otherlv_3= ']' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_IDENTIFIERS) ) {
                alt17=1;
            }
            else if ( (LA17_0==18) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1521:5: this_Definition_0= ruleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDefinitionOrCommandAccess().getDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefinition_in_ruleDefinitionOrCommand3582);
                    this_Definition_0=ruleDefinition();

                    state._fsp--;

                     
                            current = this_Definition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1530:6: (otherlv_1= '[' this_SomeCommands_2= ruleSomeCommands otherlv_3= ']' )
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1530:6: (otherlv_1= '[' this_SomeCommands_2= ruleSomeCommands otherlv_3= ']' )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1530:8: otherlv_1= '[' this_SomeCommands_2= ruleSomeCommands otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleDefinitionOrCommand3600); 

                        	newLeafNode(otherlv_1, grammarAccess.getDefinitionOrCommandAccess().getLeftSquareBracketKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getDefinitionOrCommandAccess().getSomeCommandsParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleSomeCommands_in_ruleDefinitionOrCommand3622);
                    this_SomeCommands_2=ruleSomeCommands();

                    state._fsp--;

                     
                            current = this_SomeCommands_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleDefinitionOrCommand3633); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1555:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1556:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1557:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition3670);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition3680); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1564:1: ruleDefinition returns [EObject current=null] : this_SimpleDefinition_0= ruleSimpleDefinition ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1567:28: (this_SimpleDefinition_0= ruleSimpleDefinition )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1569:5: this_SimpleDefinition_0= ruleSimpleDefinition
            {
             
                    newCompositeNode(grammarAccess.getDefinitionAccess().getSimpleDefinitionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleSimpleDefinition_in_ruleDefinition3726);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1585:1: entryRuleSimpleDefinition returns [EObject current=null] : iv_ruleSimpleDefinition= ruleSimpleDefinition EOF ;
    public final EObject entryRuleSimpleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleDefinition = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1586:2: (iv_ruleSimpleDefinition= ruleSimpleDefinition EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1587:2: iv_ruleSimpleDefinition= ruleSimpleDefinition EOF
            {
             newCompositeNode(grammarAccess.getSimpleDefinitionRule()); 
            pushFollow(FOLLOW_ruleSimpleDefinition_in_entryRuleSimpleDefinition3760);
            iv_ruleSimpleDefinition=ruleSimpleDefinition();

            state._fsp--;

             current =iv_ruleSimpleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleDefinition3770); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1594:1: ruleSimpleDefinition returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleLhs ) ) ( (lv_RhsDefinition_1_0= ruleRhsDefinition ) ) ) ;
    public final EObject ruleSimpleDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_RhsDefinition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1597:28: ( ( ( (lv_lhs_0_0= ruleLhs ) ) ( (lv_RhsDefinition_1_0= ruleRhsDefinition ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1598:1: ( ( (lv_lhs_0_0= ruleLhs ) ) ( (lv_RhsDefinition_1_0= ruleRhsDefinition ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1598:1: ( ( (lv_lhs_0_0= ruleLhs ) ) ( (lv_RhsDefinition_1_0= ruleRhsDefinition ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1598:2: ( (lv_lhs_0_0= ruleLhs ) ) ( (lv_RhsDefinition_1_0= ruleRhsDefinition ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1598:2: ( (lv_lhs_0_0= ruleLhs ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1599:1: (lv_lhs_0_0= ruleLhs )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1599:1: (lv_lhs_0_0= ruleLhs )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1600:3: lv_lhs_0_0= ruleLhs
            {
             
            	        newCompositeNode(grammarAccess.getSimpleDefinitionAccess().getLhsLhsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLhs_in_ruleSimpleDefinition3816);
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

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1616:2: ( (lv_RhsDefinition_1_0= ruleRhsDefinition ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1617:1: (lv_RhsDefinition_1_0= ruleRhsDefinition )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1617:1: (lv_RhsDefinition_1_0= ruleRhsDefinition )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1618:3: lv_RhsDefinition_1_0= ruleRhsDefinition
            {
             
            	        newCompositeNode(grammarAccess.getSimpleDefinitionAccess().getRhsDefinitionRhsDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRhsDefinition_in_ruleSimpleDefinition3837);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1642:1: entryRuleLhs returns [EObject current=null] : iv_ruleLhs= ruleLhs EOF ;
    public final EObject entryRuleLhs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLhs = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1643:2: (iv_ruleLhs= ruleLhs EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1644:2: iv_ruleLhs= ruleLhs EOF
            {
             newCompositeNode(grammarAccess.getLhsRule()); 
            pushFollow(FOLLOW_ruleLhs_in_entryRuleLhs3873);
            iv_ruleLhs=ruleLhs();

            state._fsp--;

             current =iv_ruleLhs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLhs3883); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1651:1: ruleLhs returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= '\\'' )? ) ;
    public final EObject ruleLhs() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1654:28: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= '\\'' )? ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1655:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= '\\'' )? )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1655:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= '\\'' )? )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1655:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) (otherlv_1= '\\'' )?
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1655:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1656:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1656:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1657:3: lv_identifier_0_0= RULE_IDENTIFIERS
            {
            lv_identifier_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleLhs3925); 

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

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1673:2: (otherlv_1= '\\'' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1673:4: otherlv_1= '\\''
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleLhs3943); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1685:1: entryRuleRhsDefinition returns [EObject current=null] : iv_ruleRhsDefinition= ruleRhsDefinition EOF ;
    public final EObject entryRuleRhsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRhsDefinition = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1686:2: (iv_ruleRhsDefinition= ruleRhsDefinition EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1687:2: iv_ruleRhsDefinition= ruleRhsDefinition EOF
            {
             newCompositeNode(grammarAccess.getRhsDefinitionRule()); 
            pushFollow(FOLLOW_ruleRhsDefinition_in_entryRuleRhsDefinition3981);
            iv_ruleRhsDefinition=ruleRhsDefinition();

            state._fsp--;

             current =iv_ruleRhsDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRhsDefinition3991); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1694:1: ruleRhsDefinition returns [EObject current=null] : this_RhsExpression_0= ruleRhsExpression ;
    public final EObject ruleRhsDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_RhsExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1697:28: (this_RhsExpression_0= ruleRhsExpression )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1699:5: this_RhsExpression_0= ruleRhsExpression
            {
             
                    newCompositeNode(grammarAccess.getRhsDefinitionAccess().getRhsExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleRhsExpression_in_ruleRhsDefinition4037);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1715:1: entryRuleRhsExpression returns [EObject current=null] : iv_ruleRhsExpression= ruleRhsExpression EOF ;
    public final EObject entryRuleRhsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRhsExpression = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1716:2: (iv_ruleRhsExpression= ruleRhsExpression EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1717:2: iv_ruleRhsExpression= ruleRhsExpression EOF
            {
             newCompositeNode(grammarAccess.getRhsExpressionRule()); 
            pushFollow(FOLLOW_ruleRhsExpression_in_entryRuleRhsExpression4071);
            iv_ruleRhsExpression=ruleRhsExpression();

            state._fsp--;

             current =iv_ruleRhsExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRhsExpression4081); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1724:1: ruleRhsExpression returns [EObject current=null] : (otherlv_0= '=' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleRhsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1727:28: ( (otherlv_0= '=' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1728:1: (otherlv_0= '=' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1728:1: (otherlv_0= '=' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1728:3: otherlv_0= '=' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleRhsExpression4118); 

                	newLeafNode(otherlv_0, grammarAccess.getRhsExpressionAccess().getEqualsSignKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1732:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1733:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1733:1: (lv_expression_1_0= ruleExpression )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1734:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getRhsExpressionAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleRhsExpression4139);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1758:1: entryRuleSomeCommands returns [EObject current=null] : iv_ruleSomeCommands= ruleSomeCommands EOF ;
    public final EObject entryRuleSomeCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeCommands = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1759:2: (iv_ruleSomeCommands= ruleSomeCommands EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1760:2: iv_ruleSomeCommands= ruleSomeCommands EOF
            {
             newCompositeNode(grammarAccess.getSomeCommandsRule()); 
            pushFollow(FOLLOW_ruleSomeCommands_in_entryRuleSomeCommands4175);
            iv_ruleSomeCommands=ruleSomeCommands();

            state._fsp--;

             current =iv_ruleSomeCommands; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeCommands4185); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1767:1: ruleSomeCommands returns [EObject current=null] : ( ( (lv_firstSomeCommand_0_0= ruleSomeCommand ) ) (otherlv_1= '[]' ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) ) )* (otherlv_3= '[]' ( (lv_elseCommand_4_0= ruleElseCommand ) ) )? ) ;
    public final EObject ruleSomeCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_firstSomeCommand_0_0 = null;

        EObject lv_nextSomeCommand_2_0 = null;

        EObject lv_elseCommand_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1770:28: ( ( ( (lv_firstSomeCommand_0_0= ruleSomeCommand ) ) (otherlv_1= '[]' ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) ) )* (otherlv_3= '[]' ( (lv_elseCommand_4_0= ruleElseCommand ) ) )? ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1771:1: ( ( (lv_firstSomeCommand_0_0= ruleSomeCommand ) ) (otherlv_1= '[]' ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) ) )* (otherlv_3= '[]' ( (lv_elseCommand_4_0= ruleElseCommand ) ) )? )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1771:1: ( ( (lv_firstSomeCommand_0_0= ruleSomeCommand ) ) (otherlv_1= '[]' ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) ) )* (otherlv_3= '[]' ( (lv_elseCommand_4_0= ruleElseCommand ) ) )? )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1771:2: ( (lv_firstSomeCommand_0_0= ruleSomeCommand ) ) (otherlv_1= '[]' ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) ) )* (otherlv_3= '[]' ( (lv_elseCommand_4_0= ruleElseCommand ) ) )?
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1771:2: ( (lv_firstSomeCommand_0_0= ruleSomeCommand ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1772:1: (lv_firstSomeCommand_0_0= ruleSomeCommand )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1772:1: (lv_firstSomeCommand_0_0= ruleSomeCommand )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1773:3: lv_firstSomeCommand_0_0= ruleSomeCommand
            {
             
            	        newCompositeNode(grammarAccess.getSomeCommandsAccess().getFirstSomeCommandSomeCommandParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSomeCommand_in_ruleSomeCommands4231);
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

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1789:2: (otherlv_1= '[]' ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_IDENTIFIERS) ) {
                        int LA19_3 = input.LA(3);

                        if ( (LA19_3==RULE_IDENTIFIERS||LA19_3==13||LA19_3==29||LA19_3==32||LA19_3==35||LA19_3==37) ) {
                            alt19=1;
                        }


                    }
                    else if ( (LA19_1==RULE_NUMERALS||LA19_1==35) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1789:4: otherlv_1= '[]' ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleSomeCommands4244); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSomeCommandsAccess().getLeftSquareBracketRightSquareBracketKeyword_1_0());
            	        
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1793:1: ( (lv_nextSomeCommand_2_0= ruleSomeCommand ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1794:1: (lv_nextSomeCommand_2_0= ruleSomeCommand )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1794:1: (lv_nextSomeCommand_2_0= ruleSomeCommand )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1795:3: lv_nextSomeCommand_2_0= ruleSomeCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSomeCommandsAccess().getNextSomeCommandSomeCommandParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSomeCommand_in_ruleSomeCommands4265);
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
            	    break loop19;
                }
            } while (true);

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1811:4: (otherlv_3= '[]' ( (lv_elseCommand_4_0= ruleElseCommand ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1811:6: otherlv_3= '[]' ( (lv_elseCommand_4_0= ruleElseCommand ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleSomeCommands4280); 

                        	newLeafNode(otherlv_3, grammarAccess.getSomeCommandsAccess().getLeftSquareBracketRightSquareBracketKeyword_2_0());
                        
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1815:1: ( (lv_elseCommand_4_0= ruleElseCommand ) )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1816:1: (lv_elseCommand_4_0= ruleElseCommand )
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1816:1: (lv_elseCommand_4_0= ruleElseCommand )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1817:3: lv_elseCommand_4_0= ruleElseCommand
                    {
                     
                    	        newCompositeNode(grammarAccess.getSomeCommandsAccess().getElseCommandElseCommandParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElseCommand_in_ruleSomeCommands4301);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1841:1: entryRuleSomeCommand returns [EObject current=null] : iv_ruleSomeCommand= ruleSomeCommand EOF ;
    public final EObject entryRuleSomeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeCommand = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1842:2: (iv_ruleSomeCommand= ruleSomeCommand EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1843:2: iv_ruleSomeCommand= ruleSomeCommand EOF
            {
             newCompositeNode(grammarAccess.getSomeCommandRule()); 
            pushFollow(FOLLOW_ruleSomeCommand_in_entryRuleSomeCommand4339);
            iv_ruleSomeCommand=ruleSomeCommand();

            state._fsp--;

             current =iv_ruleSomeCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeCommand4349); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1850:1: ruleSomeCommand returns [EObject current=null] : this_NamedCommand_0= ruleNamedCommand ;
    public final EObject ruleSomeCommand() throws RecognitionException {
        EObject current = null;

        EObject this_NamedCommand_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1853:28: (this_NamedCommand_0= ruleNamedCommand )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1855:5: this_NamedCommand_0= ruleNamedCommand
            {
             
                    newCompositeNode(grammarAccess.getSomeCommandAccess().getNamedCommandParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleNamedCommand_in_ruleSomeCommand4395);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1871:1: entryRuleNamedCommand returns [EObject current=null] : iv_ruleNamedCommand= ruleNamedCommand EOF ;
    public final EObject entryRuleNamedCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedCommand = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1872:2: (iv_ruleNamedCommand= ruleNamedCommand EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1873:2: iv_ruleNamedCommand= ruleNamedCommand EOF
            {
             newCompositeNode(grammarAccess.getNamedCommandRule()); 
            pushFollow(FOLLOW_ruleNamedCommand_in_entryRuleNamedCommand4429);
            iv_ruleNamedCommand=ruleNamedCommand();

            state._fsp--;

             current =iv_ruleNamedCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedCommand4439); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1880:1: ruleNamedCommand returns [EObject current=null] : ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': ' )? ( (lv_guardedCommand_2_0= ruleGuardedCommand ) ) ) ;
    public final EObject ruleNamedCommand() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        EObject lv_guardedCommand_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1883:28: ( ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': ' )? ( (lv_guardedCommand_2_0= ruleGuardedCommand ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1884:1: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': ' )? ( (lv_guardedCommand_2_0= ruleGuardedCommand ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1884:1: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': ' )? ( (lv_guardedCommand_2_0= ruleGuardedCommand ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1884:2: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': ' )? ( (lv_guardedCommand_2_0= ruleGuardedCommand ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1884:2: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': ' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_IDENTIFIERS) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==29) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1884:3: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ': '
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1884:3: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1885:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1885:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1886:3: lv_identifier_0_0= RULE_IDENTIFIERS
                    {
                    lv_identifier_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleNamedCommand4482); 

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

                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleNamedCommand4499); 

                        	newLeafNode(otherlv_1, grammarAccess.getNamedCommandAccess().getColonSpaceKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1906:3: ( (lv_guardedCommand_2_0= ruleGuardedCommand ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1907:1: (lv_guardedCommand_2_0= ruleGuardedCommand )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1907:1: (lv_guardedCommand_2_0= ruleGuardedCommand )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1908:3: lv_guardedCommand_2_0= ruleGuardedCommand
            {
             
            	        newCompositeNode(grammarAccess.getNamedCommandAccess().getGuardedCommandGuardedCommandParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleGuardedCommand_in_ruleNamedCommand4522);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1932:1: entryRuleGuardedCommand returns [EObject current=null] : iv_ruleGuardedCommand= ruleGuardedCommand EOF ;
    public final EObject entryRuleGuardedCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardedCommand = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1933:2: (iv_ruleGuardedCommand= ruleGuardedCommand EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1934:2: iv_ruleGuardedCommand= ruleGuardedCommand EOF
            {
             newCompositeNode(grammarAccess.getGuardedCommandRule()); 
            pushFollow(FOLLOW_ruleGuardedCommand_in_entryRuleGuardedCommand4558);
            iv_ruleGuardedCommand=ruleGuardedCommand();

            state._fsp--;

             current =iv_ruleGuardedCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuardedCommand4568); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1941:1: ruleGuardedCommand returns [EObject current=null] : ( ( (lv_guard_0_0= ruleGuard ) ) otherlv_1= '-->' ( (lv_assignment_2_0= ruleAssignments ) ) ) ;
    public final EObject ruleGuardedCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_guard_0_0 = null;

        EObject lv_assignment_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1944:28: ( ( ( (lv_guard_0_0= ruleGuard ) ) otherlv_1= '-->' ( (lv_assignment_2_0= ruleAssignments ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1945:1: ( ( (lv_guard_0_0= ruleGuard ) ) otherlv_1= '-->' ( (lv_assignment_2_0= ruleAssignments ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1945:1: ( ( (lv_guard_0_0= ruleGuard ) ) otherlv_1= '-->' ( (lv_assignment_2_0= ruleAssignments ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1945:2: ( (lv_guard_0_0= ruleGuard ) ) otherlv_1= '-->' ( (lv_assignment_2_0= ruleAssignments ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1945:2: ( (lv_guard_0_0= ruleGuard ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1946:1: (lv_guard_0_0= ruleGuard )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1946:1: (lv_guard_0_0= ruleGuard )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1947:3: lv_guard_0_0= ruleGuard
            {
             
            	        newCompositeNode(grammarAccess.getGuardedCommandAccess().getGuardGuardParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleGuard_in_ruleGuardedCommand4614);
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

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleGuardedCommand4626); 

                	newLeafNode(otherlv_1, grammarAccess.getGuardedCommandAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1967:1: ( (lv_assignment_2_0= ruleAssignments ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1968:1: (lv_assignment_2_0= ruleAssignments )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1968:1: (lv_assignment_2_0= ruleAssignments )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1969:3: lv_assignment_2_0= ruleAssignments
            {
             
            	        newCompositeNode(grammarAccess.getGuardedCommandAccess().getAssignmentAssignmentsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAssignments_in_ruleGuardedCommand4647);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1993:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1994:2: (iv_ruleGuard= ruleGuard EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1995:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard4683);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard4693); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2002:1: ruleGuard returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2005:28: (this_Expression_0= ruleExpression )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2007:5: this_Expression_0= ruleExpression
            {
             
                    newCompositeNode(grammarAccess.getGuardAccess().getExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleGuard4739);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2023:1: entryRuleAssignments returns [EObject current=null] : iv_ruleAssignments= ruleAssignments EOF ;
    public final EObject entryRuleAssignments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignments = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2024:2: (iv_ruleAssignments= ruleAssignments EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2025:2: iv_ruleAssignments= ruleAssignments EOF
            {
             newCompositeNode(grammarAccess.getAssignmentsRule()); 
            pushFollow(FOLLOW_ruleAssignments_in_entryRuleAssignments4773);
            iv_ruleAssignments=ruleAssignments();

            state._fsp--;

             current =iv_ruleAssignments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignments4783); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2032:1: ruleAssignments returns [EObject current=null] : ( ( (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition ) )? (otherlv_1= ';' ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) ) )* (otherlv_3= ';' )? ) ;
    public final EObject ruleAssignments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_firstSimpleDefinition_0_0 = null;

        EObject lv_nextSimpleDefinition_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2035:28: ( ( ( (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition ) )? (otherlv_1= ';' ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) ) )* (otherlv_3= ';' )? ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2036:1: ( ( (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition ) )? (otherlv_1= ';' ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) ) )* (otherlv_3= ';' )? )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2036:1: ( ( (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition ) )? (otherlv_1= ';' ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) ) )* (otherlv_3= ';' )? )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2036:2: ( (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition ) )? (otherlv_1= ';' ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) ) )* (otherlv_3= ';' )?
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2036:2: ( (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_IDENTIFIERS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2037:1: (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition )
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2037:1: (lv_firstSimpleDefinition_0_0= ruleSimpleDefinition )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2038:3: lv_firstSimpleDefinition_0_0= ruleSimpleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentsAccess().getFirstSimpleDefinitionSimpleDefinitionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleDefinition_in_ruleAssignments4829);
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

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2054:3: (otherlv_1= ';' ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==11) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==RULE_IDENTIFIERS) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2054:5: otherlv_1= ';' ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleAssignments4843); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAssignmentsAccess().getSemicolonKeyword_1_0());
            	        
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2058:1: ( (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2059:1: (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2059:1: (lv_nextSimpleDefinition_2_0= ruleSimpleDefinition )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2060:3: lv_nextSimpleDefinition_2_0= ruleSimpleDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssignmentsAccess().getNextSimpleDefinitionSimpleDefinitionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleDefinition_in_ruleAssignments4864);
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
            	    break loop23;
                }
            } while (true);

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2076:4: (otherlv_3= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==11) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2076:6: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleAssignments4879); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2088:1: entryRuleElseCommand returns [EObject current=null] : iv_ruleElseCommand= ruleElseCommand EOF ;
    public final EObject entryRuleElseCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseCommand = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2089:2: (iv_ruleElseCommand= ruleElseCommand EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2090:2: iv_ruleElseCommand= ruleElseCommand EOF
            {
             newCompositeNode(grammarAccess.getElseCommandRule()); 
            pushFollow(FOLLOW_ruleElseCommand_in_entryRuleElseCommand4917);
            iv_ruleElseCommand=ruleElseCommand();

            state._fsp--;

             current =iv_ruleElseCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElseCommand4927); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2097:1: ruleElseCommand returns [EObject current=null] : ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ':' )? otherlv_2= 'ELSE -->' ( (lv_assignments_3_0= ruleAssignments ) ) ) ;
    public final EObject ruleElseCommand() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_assignments_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2100:28: ( ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ':' )? otherlv_2= 'ELSE -->' ( (lv_assignments_3_0= ruleAssignments ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2101:1: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ':' )? otherlv_2= 'ELSE -->' ( (lv_assignments_3_0= ruleAssignments ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2101:1: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ':' )? otherlv_2= 'ELSE -->' ( (lv_assignments_3_0= ruleAssignments ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2101:2: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ':' )? otherlv_2= 'ELSE -->' ( (lv_assignments_3_0= ruleAssignments ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2101:2: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ':' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_IDENTIFIERS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2101:3: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= ':'
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2101:3: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2102:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2102:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2103:3: lv_identifier_0_0= RULE_IDENTIFIERS
                    {
                    lv_identifier_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleElseCommand4970); 

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

                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleElseCommand4987); 

                        	newLeafNode(otherlv_1, grammarAccess.getElseCommandAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleElseCommand5001); 

                	newLeafNode(otherlv_2, grammarAccess.getElseCommandAccess().getELSEKeyword_1());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2127:1: ( (lv_assignments_3_0= ruleAssignments ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2128:1: (lv_assignments_3_0= ruleAssignments )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2128:1: (lv_assignments_3_0= ruleAssignments )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2129:3: lv_assignments_3_0= ruleAssignments
            {
             
            	        newCompositeNode(grammarAccess.getElseCommandAccess().getAssignmentsAssignmentsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAssignments_in_ruleElseCommand5022);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2153:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2154:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2155:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5058);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5068); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2162:1: ruleExpression returns [EObject current=null] : (this_NameExpr_0= ruleNameExpr | this_NextVariable_1= ruleNextVariable | this_Numeral_2= ruleNumeral | this_OuterInfixApplication_3= ruleOuterInfixApplication | this_BracketedExpression_4= ruleBracketedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NameExpr_0 = null;

        EObject this_NextVariable_1 = null;

        EObject this_Numeral_2 = null;

        EObject this_OuterInfixApplication_3 = null;

        EObject this_BracketedExpression_4 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2165:28: ( (this_NameExpr_0= ruleNameExpr | this_NextVariable_1= ruleNextVariable | this_Numeral_2= ruleNumeral | this_OuterInfixApplication_3= ruleOuterInfixApplication | this_BracketedExpression_4= ruleBracketedExpression ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2166:1: (this_NameExpr_0= ruleNameExpr | this_NextVariable_1= ruleNextVariable | this_Numeral_2= ruleNumeral | this_OuterInfixApplication_3= ruleOuterInfixApplication | this_BracketedExpression_4= ruleBracketedExpression )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2166:1: (this_NameExpr_0= ruleNameExpr | this_NextVariable_1= ruleNextVariable | this_Numeral_2= ruleNumeral | this_OuterInfixApplication_3= ruleOuterInfixApplication | this_BracketedExpression_4= ruleBracketedExpression )
            int alt26=5;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIERS:
                {
                switch ( input.LA(2) ) {
                case RULE_IDENTIFIERS:
                case 13:
                case 35:
                    {
                    alt26=4;
                    }
                    break;
                case 37:
                    {
                    alt26=2;
                    }
                    break;
                case EOF:
                case 10:
                case 11:
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
                    alt26=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_NUMERALS:
                {
                alt26=3;
                }
                break;
            case 35:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2167:5: this_NameExpr_0= ruleNameExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getNameExprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNameExpr_in_ruleExpression5115);
                    this_NameExpr_0=ruleNameExpr();

                    state._fsp--;

                     
                            current = this_NameExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2177:5: this_NextVariable_1= ruleNextVariable
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getNextVariableParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNextVariable_in_ruleExpression5142);
                    this_NextVariable_1=ruleNextVariable();

                    state._fsp--;

                     
                            current = this_NextVariable_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2187:5: this_Numeral_2= ruleNumeral
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getNumeralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumeral_in_ruleExpression5169);
                    this_Numeral_2=ruleNumeral();

                    state._fsp--;

                     
                            current = this_Numeral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2197:5: this_OuterInfixApplication_3= ruleOuterInfixApplication
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getOuterInfixApplicationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleOuterInfixApplication_in_ruleExpression5196);
                    this_OuterInfixApplication_3=ruleOuterInfixApplication();

                    state._fsp--;

                     
                            current = this_OuterInfixApplication_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2207:5: this_BracketedExpression_4= ruleBracketedExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getBracketedExpressionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBracketedExpression_in_ruleExpression5223);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2223:1: entryRuleBracketedExpression returns [EObject current=null] : iv_ruleBracketedExpression= ruleBracketedExpression EOF ;
    public final EObject entryRuleBracketedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracketedExpression = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2224:2: (iv_ruleBracketedExpression= ruleBracketedExpression EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2225:2: iv_ruleBracketedExpression= ruleBracketedExpression EOF
            {
             newCompositeNode(grammarAccess.getBracketedExpressionRule()); 
            pushFollow(FOLLOW_ruleBracketedExpression_in_entryRuleBracketedExpression5258);
            iv_ruleBracketedExpression=ruleBracketedExpression();

            state._fsp--;

             current =iv_ruleBracketedExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBracketedExpression5268); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2232:1: ruleBracketedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBracketedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2235:28: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2236:1: (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2236:1: (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2236:3: otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleBracketedExpression5305); 

                	newLeafNode(otherlv_0, grammarAccess.getBracketedExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2240:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2241:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2241:1: (lv_expression_1_0= ruleExpression )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2242:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBracketedExpressionAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleBracketedExpression5326);
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

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleBracketedExpression5338); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2270:1: entryRuleOuterInfixApplication returns [EObject current=null] : iv_ruleOuterInfixApplication= ruleOuterInfixApplication EOF ;
    public final EObject entryRuleOuterInfixApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOuterInfixApplication = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2271:2: (iv_ruleOuterInfixApplication= ruleOuterInfixApplication EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2272:2: iv_ruleOuterInfixApplication= ruleOuterInfixApplication EOF
            {
             newCompositeNode(grammarAccess.getOuterInfixApplicationRule()); 
            pushFollow(FOLLOW_ruleOuterInfixApplication_in_entryRuleOuterInfixApplication5374);
            iv_ruleOuterInfixApplication=ruleOuterInfixApplication();

            state._fsp--;

             current =iv_ruleOuterInfixApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOuterInfixApplication5384); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2279:1: ruleOuterInfixApplication returns [EObject current=null] : ( ( ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) ) ) (this_IDENTIFIERS_1= RULE_IDENTIFIERS ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) ) )* ) ;
    public final EObject ruleOuterInfixApplication() throws RecognitionException {
        EObject current = null;

        Token this_IDENTIFIERS_1=null;
        EObject lv_firstExpression_0_1 = null;

        EObject lv_firstExpression_0_2 = null;

        EObject lv_nextExpression_2_1 = null;

        EObject lv_nextExpression_2_2 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2282:28: ( ( ( ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) ) ) (this_IDENTIFIERS_1= RULE_IDENTIFIERS ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) ) )* ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2283:1: ( ( ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) ) ) (this_IDENTIFIERS_1= RULE_IDENTIFIERS ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) ) )* )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2283:1: ( ( ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) ) ) (this_IDENTIFIERS_1= RULE_IDENTIFIERS ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) ) )* )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2283:2: ( ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) ) ) (this_IDENTIFIERS_1= RULE_IDENTIFIERS ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) ) )*
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2283:2: ( ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2284:1: ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2284:1: ( (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2285:1: (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2285:1: (lv_firstExpression_0_1= ruleApplication | lv_firstExpression_0_2= ruleInfixApplication )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_IDENTIFIERS) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_IDENTIFIERS||LA27_1==35) ) {
                    alt27=1;
                }
                else if ( (LA27_1==13) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2286:3: lv_firstExpression_0_1= ruleApplication
                    {
                     
                    	        newCompositeNode(grammarAccess.getOuterInfixApplicationAccess().getFirstExpressionApplicationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleApplication_in_ruleOuterInfixApplication5432);
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
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2301:8: lv_firstExpression_0_2= ruleInfixApplication
                    {
                     
                    	        newCompositeNode(grammarAccess.getOuterInfixApplicationAccess().getFirstExpressionInfixApplicationParserRuleCall_0_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleInfixApplication_in_ruleOuterInfixApplication5451);
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

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2319:2: (this_IDENTIFIERS_1= RULE_IDENTIFIERS ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_IDENTIFIERS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2319:3: this_IDENTIFIERS_1= RULE_IDENTIFIERS ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) )
            	    {
            	    this_IDENTIFIERS_1=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleOuterInfixApplication5466); 
            	     
            	        newLeafNode(this_IDENTIFIERS_1, grammarAccess.getOuterInfixApplicationAccess().getIDENTIFIERSTerminalRuleCall_1_0()); 
            	        
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2323:1: ( ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2324:1: ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2324:1: ( (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2325:1: (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2325:1: (lv_nextExpression_2_1= ruleApplication | lv_nextExpression_2_2= ruleInfixApplication )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==RULE_IDENTIFIERS) ) {
            	        int LA28_1 = input.LA(2);

            	        if ( (LA28_1==13) ) {
            	            alt28=2;
            	        }
            	        else if ( (LA28_1==RULE_IDENTIFIERS||LA28_1==35) ) {
            	            alt28=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 28, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2326:3: lv_nextExpression_2_1= ruleApplication
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getOuterInfixApplicationAccess().getNextExpressionApplicationParserRuleCall_1_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleApplication_in_ruleOuterInfixApplication5488);
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
            	            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2341:8: lv_nextExpression_2_2= ruleInfixApplication
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getOuterInfixApplicationAccess().getNextExpressionInfixApplicationParserRuleCall_1_1_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleInfixApplication_in_ruleOuterInfixApplication5507);
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
            	    break loop29;
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2367:1: entryRuleNameExpr returns [EObject current=null] : iv_ruleNameExpr= ruleNameExpr EOF ;
    public final EObject entryRuleNameExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpr = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2368:2: (iv_ruleNameExpr= ruleNameExpr EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2369:2: iv_ruleNameExpr= ruleNameExpr EOF
            {
             newCompositeNode(grammarAccess.getNameExprRule()); 
            pushFollow(FOLLOW_ruleNameExpr_in_entryRuleNameExpr5548);
            iv_ruleNameExpr=ruleNameExpr();

            state._fsp--;

             current =iv_ruleNameExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameExpr5558); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2376:1: ruleNameExpr returns [EObject current=null] : this_Name_0= ruleName ;
    public final EObject ruleNameExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2379:28: (this_Name_0= ruleName )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2381:5: this_Name_0= ruleName
            {
             
                    newCompositeNode(grammarAccess.getNameExprAccess().getNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleName_in_ruleNameExpr5604);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2397:1: entryRuleNextVariable returns [EObject current=null] : iv_ruleNextVariable= ruleNextVariable EOF ;
    public final EObject entryRuleNextVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextVariable = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2398:2: (iv_ruleNextVariable= ruleNextVariable EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2399:2: iv_ruleNextVariable= ruleNextVariable EOF
            {
             newCompositeNode(grammarAccess.getNextVariableRule()); 
            pushFollow(FOLLOW_ruleNextVariable_in_entryRuleNextVariable5638);
            iv_ruleNextVariable=ruleNextVariable();

            state._fsp--;

             current =iv_ruleNextVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNextVariable5648); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2406:1: ruleNextVariable returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '.' ) ;
    public final EObject ruleNextVariable() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2409:28: ( ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '.' ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2410:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '.' )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2410:1: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '.' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2410:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) otherlv_1= '.'
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2410:2: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2411:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2411:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2412:3: lv_identifier_0_0= RULE_IDENTIFIERS
            {
            lv_identifier_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleNextVariable5690); 

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

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleNextVariable5707); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2440:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2441:2: (iv_ruleApplication= ruleApplication EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2442:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication5743);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication5753); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2449:1: ruleApplication returns [EObject current=null] : ( ( (lv_function_0_0= ruleFunction ) ) ( (lv_argument_1_0= ruleArgument ) ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        EObject lv_function_0_0 = null;

        EObject lv_argument_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2452:28: ( ( ( (lv_function_0_0= ruleFunction ) ) ( (lv_argument_1_0= ruleArgument ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2453:1: ( ( (lv_function_0_0= ruleFunction ) ) ( (lv_argument_1_0= ruleArgument ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2453:1: ( ( (lv_function_0_0= ruleFunction ) ) ( (lv_argument_1_0= ruleArgument ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2453:2: ( (lv_function_0_0= ruleFunction ) ) ( (lv_argument_1_0= ruleArgument ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2453:2: ( (lv_function_0_0= ruleFunction ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2454:1: (lv_function_0_0= ruleFunction )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2454:1: (lv_function_0_0= ruleFunction )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2455:3: lv_function_0_0= ruleFunction
            {
             
            	        newCompositeNode(grammarAccess.getApplicationAccess().getFunctionFunctionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFunction_in_ruleApplication5799);
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

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2471:2: ( (lv_argument_1_0= ruleArgument ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2472:1: (lv_argument_1_0= ruleArgument )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2472:1: (lv_argument_1_0= ruleArgument )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2473:3: lv_argument_1_0= ruleArgument
            {
             
            	        newCompositeNode(grammarAccess.getApplicationAccess().getArgumentArgumentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleApplication5820);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2497:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2498:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2499:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction5856);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction5866); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2506:1: ruleFunction returns [EObject current=null] : ( (lv_expression_0_0= ruleNameExpr ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2509:28: ( ( (lv_expression_0_0= ruleNameExpr ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2510:1: ( (lv_expression_0_0= ruleNameExpr ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2510:1: ( (lv_expression_0_0= ruleNameExpr ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2511:1: (lv_expression_0_0= ruleNameExpr )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2511:1: (lv_expression_0_0= ruleNameExpr )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2512:3: lv_expression_0_0= ruleNameExpr
            {
             
            	        newCompositeNode(grammarAccess.getFunctionAccess().getExpressionNameExprParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleNameExpr_in_ruleFunction5911);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2536:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2537:2: (iv_ruleArgument= ruleArgument EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2538:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument5946);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument5956); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2545:1: ruleArgument returns [EObject current=null] : ( ( ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) ) ) (otherlv_1= ',' ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) ) )* ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_firstExpression_0_1 = null;

        EObject lv_firstExpression_0_2 = null;

        EObject lv_nextExpression_2_1 = null;

        EObject lv_nextExpression_2_2 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2548:28: ( ( ( ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) ) ) (otherlv_1= ',' ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) ) )* ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2549:1: ( ( ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) ) ) (otherlv_1= ',' ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) ) )* )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2549:1: ( ( ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) ) ) (otherlv_1= ',' ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) ) )* )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2549:2: ( ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) ) ) (otherlv_1= ',' ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) ) )*
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2549:2: ( ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2550:1: ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2550:1: ( (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2551:1: (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2551:1: (lv_firstExpression_0_1= ruleNameExpr | lv_firstExpression_0_2= ruleBracketedExpression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_IDENTIFIERS) ) {
                alt30=1;
            }
            else if ( (LA30_0==35) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2552:3: lv_firstExpression_0_1= ruleNameExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getFirstExpressionNameExprParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNameExpr_in_ruleArgument6004);
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
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2567:8: lv_firstExpression_0_2= ruleBracketedExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getFirstExpressionBracketedExpressionParserRuleCall_0_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleBracketedExpression_in_ruleArgument6023);
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

            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2585:2: (otherlv_1= ',' ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==21) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2585:4: otherlv_1= ',' ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleArgument6039); 

            	        	newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2589:1: ( ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2590:1: ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2590:1: ( (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression ) )
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2591:1: (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression )
            	    {
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2591:1: (lv_nextExpression_2_1= ruleNameExpr | lv_nextExpression_2_2= ruleBracketedExpression )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==RULE_IDENTIFIERS) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==35) ) {
            	        alt31=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2592:3: lv_nextExpression_2_1= ruleNameExpr
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getArgumentAccess().getNextExpressionNameExprParserRuleCall_1_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleNameExpr_in_ruleArgument6062);
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
            	            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2607:8: lv_nextExpression_2_2= ruleBracketedExpression
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getArgumentAccess().getNextExpressionBracketedExpressionParserRuleCall_1_1_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleBracketedExpression_in_ruleArgument6081);
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
            	    break loop32;
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2633:1: entryRuleInfixApplication returns [EObject current=null] : iv_ruleInfixApplication= ruleInfixApplication EOF ;
    public final EObject entryRuleInfixApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixApplication = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2634:2: (iv_ruleInfixApplication= ruleInfixApplication EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2635:2: iv_ruleInfixApplication= ruleInfixApplication EOF
            {
             newCompositeNode(grammarAccess.getInfixApplicationRule()); 
            pushFollow(FOLLOW_ruleInfixApplication_in_entryRuleInfixApplication6122);
            iv_ruleInfixApplication=ruleInfixApplication();

            state._fsp--;

             current =iv_ruleInfixApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfixApplication6132); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2642:1: ruleInfixApplication returns [EObject current=null] : ( ( (lv_firstExpression_0_0= ruleNameExpr ) ) otherlv_1= '=' ( ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) ) ) ) ;
    public final EObject ruleInfixApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_firstExpression_0_0 = null;

        EObject lv_secondExpression_2_1 = null;

        EObject lv_secondExpression_2_2 = null;

        EObject lv_secondExpression_2_3 = null;


         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2645:28: ( ( ( (lv_firstExpression_0_0= ruleNameExpr ) ) otherlv_1= '=' ( ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2646:1: ( ( (lv_firstExpression_0_0= ruleNameExpr ) ) otherlv_1= '=' ( ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2646:1: ( ( (lv_firstExpression_0_0= ruleNameExpr ) ) otherlv_1= '=' ( ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2646:2: ( (lv_firstExpression_0_0= ruleNameExpr ) ) otherlv_1= '=' ( ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2646:2: ( (lv_firstExpression_0_0= ruleNameExpr ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2647:1: (lv_firstExpression_0_0= ruleNameExpr )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2647:1: (lv_firstExpression_0_0= ruleNameExpr )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2648:3: lv_firstExpression_0_0= ruleNameExpr
            {
             
            	        newCompositeNode(grammarAccess.getInfixApplicationAccess().getFirstExpressionNameExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNameExpr_in_ruleInfixApplication6178);
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

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleInfixApplication6190); 

                	newLeafNode(otherlv_1, grammarAccess.getInfixApplicationAccess().getEqualsSignKeyword_1());
                
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2668:1: ( ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2669:1: ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2669:1: ( (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2670:1: (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2670:1: (lv_secondExpression_2_1= ruleNameExpr | lv_secondExpression_2_2= ruleNumeral | lv_secondExpression_2_3= ruleBracketedExpression )
            int alt33=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIERS:
                {
                alt33=1;
                }
                break;
            case RULE_NUMERALS:
                {
                alt33=2;
                }
                break;
            case 35:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2671:3: lv_secondExpression_2_1= ruleNameExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getInfixApplicationAccess().getSecondExpressionNameExprParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNameExpr_in_ruleInfixApplication6213);
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
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2686:8: lv_secondExpression_2_2= ruleNumeral
                    {
                     
                    	        newCompositeNode(grammarAccess.getInfixApplicationAccess().getSecondExpressionNumeralParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleNumeral_in_ruleInfixApplication6232);
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
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2701:8: lv_secondExpression_2_3= ruleBracketedExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getInfixApplicationAccess().getSecondExpressionBracketedExpressionParserRuleCall_2_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleBracketedExpression_in_ruleInfixApplication6251);
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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2727:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2728:2: (iv_ruleName= ruleName EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2729:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName6290);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName6300); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2736:1: ruleName returns [EObject current=null] : ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;

         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2739:28: ( ( (lv_identifier_0_0= RULE_IDENTIFIERS ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2740:1: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2740:1: ( (lv_identifier_0_0= RULE_IDENTIFIERS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2741:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2741:1: (lv_identifier_0_0= RULE_IDENTIFIERS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2742:3: lv_identifier_0_0= RULE_IDENTIFIERS
            {
            lv_identifier_0_0=(Token)match(input,RULE_IDENTIFIERS,FOLLOW_RULE_IDENTIFIERS_in_ruleName6341); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2766:1: entryRuleNumeral returns [EObject current=null] : iv_ruleNumeral= ruleNumeral EOF ;
    public final EObject entryRuleNumeral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeral = null;


        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2767:2: (iv_ruleNumeral= ruleNumeral EOF )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2768:2: iv_ruleNumeral= ruleNumeral EOF
            {
             newCompositeNode(grammarAccess.getNumeralRule()); 
            pushFollow(FOLLOW_ruleNumeral_in_entryRuleNumeral6381);
            iv_ruleNumeral=ruleNumeral();

            state._fsp--;

             current =iv_ruleNumeral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumeral6391); 

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
    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2775:1: ruleNumeral returns [EObject current=null] : ( (lv_number_0_0= RULE_NUMERALS ) ) ;
    public final EObject ruleNumeral() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;

         enterRule(); 
            
        try {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2778:28: ( ( (lv_number_0_0= RULE_NUMERALS ) ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2779:1: ( (lv_number_0_0= RULE_NUMERALS ) )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2779:1: ( (lv_number_0_0= RULE_NUMERALS ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2780:1: (lv_number_0_0= RULE_NUMERALS )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2780:1: (lv_number_0_0= RULE_NUMERALS )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2781:3: lv_number_0_0= RULE_NUMERALS
            {
            lv_number_0_0=(Token)match(input,RULE_NUMERALS,FOLLOW_RULE_NUMERALS_in_ruleNumeral6432); 

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
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleScalarType1640 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleScalarType1658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleScalarType1675 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16_in_ruleScalarType1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleDeclaration_in_entryRuleModuleDeclaration1730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleDeclaration1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleModuleDeclaration1782 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleModuleDeclaration1799 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleModule_in_ruleModuleDeclaration1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule1856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseModule_in_ruleModule1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseModule_in_entryRuleBaseModule1946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseModule1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleBaseModule1993 = new BitSet(new long[]{0x000000001F800400L});
    public static final BitSet FOLLOW_ruleBaseDeclarations_in_ruleBaseModule2015 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleBaseModule2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseDeclarations_in_entryRuleBaseDeclarations2062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseDeclarations2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseDeclaration_in_ruleBaseDeclarations2117 = new BitSet(new long[]{0x000000001F800002L});
    public static final BitSet FOLLOW_ruleBaseDeclaration_in_entryRuleBaseDeclaration2153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseDeclaration2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDecl_in_ruleBaseDeclaration2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDecl_in_ruleBaseDeclaration2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDecl_in_ruleBaseDeclaration2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefDecl_in_ruleBaseDeclaration2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDecl_in_ruleBaseDeclaration2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransDecl_in_ruleBaseDeclaration2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDecl_in_entryRuleInputDecl2380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputDecl2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleInputDecl2427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarDecls_in_ruleInputDecl2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDecl_in_entryRuleOutputDecl2484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputDecl2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOutputDecl2531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarDecls_in_ruleOutputDecl2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDecl_in_entryRuleLocalDecl2588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalDecl2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleLocalDecl2635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarDecls_in_ruleLocalDecl2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefDecl_in_entryRuleDefDecl2692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefDecl2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDefDecl2739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefinitions_in_ruleDefDecl2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDecl_in_entryRuleInitDecl2796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitDecl2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleInitDecl2843 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleDefinitionOrCommand_in_ruleInitDecl2864 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleInitDecl2877 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleDefinitionOrCommand_in_ruleInitDecl2898 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleInitDecl2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransDecl_in_entryRuleTransDecl2951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransDecl2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTransDecl2998 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleDefinitionOrCommand_in_ruleTransDecl3019 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleTransDecl3032 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleDefinitionOrCommand_in_ruleTransDecl3053 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleTransDecl3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecls_in_entryRuleVarDecls3106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecls3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleVarDecls3162 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleVarDecls3175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleVarDecls3196 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl3234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleVarDecl3286 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_21_in_ruleVarDecl3304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleVarDecl3321 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29_in_ruleVarDecl3340 = new BitSet(new long[]{0x0000000000044010L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarDecl3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitions_in_entryRuleDefinitions3397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitions3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleDefinitions3453 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleDefinitions3466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleDefinitions3487 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleDefinitionOrCommand_in_entryRuleDefinitionOrCommand3525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionOrCommand3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleDefinitionOrCommand3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDefinitionOrCommand3600 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleSomeCommands_in_ruleDefinitionOrCommand3622 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDefinitionOrCommand3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition3670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDefinition_in_ruleDefinition3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDefinition_in_entryRuleSimpleDefinition3760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleDefinition3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLhs_in_ruleSimpleDefinition3816 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleRhsDefinition_in_ruleSimpleDefinition3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLhs_in_entryRuleLhs3873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLhs3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleLhs3925 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleLhs3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRhsDefinition_in_entryRuleRhsDefinition3981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRhsDefinition3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRhsExpression_in_ruleRhsDefinition4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRhsExpression_in_entryRuleRhsExpression4071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRhsExpression4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRhsExpression4118 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRhsExpression4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeCommands_in_entryRuleSomeCommands4175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeCommands4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeCommand_in_ruleSomeCommands4231 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleSomeCommands4244 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleSomeCommand_in_ruleSomeCommands4265 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleSomeCommands4280 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleElseCommand_in_ruleSomeCommands4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeCommand_in_entryRuleSomeCommand4339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeCommand4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedCommand_in_ruleSomeCommand4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedCommand_in_entryRuleNamedCommand4429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedCommand4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleNamedCommand4482 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleNamedCommand4499 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleGuardedCommand_in_ruleNamedCommand4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuardedCommand_in_entryRuleGuardedCommand4558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuardedCommand4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_ruleGuardedCommand4614 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleGuardedCommand4626 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleAssignments_in_ruleGuardedCommand4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard4683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleGuard4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignments_in_entryRuleAssignments4773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignments4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDefinition_in_ruleAssignments4829 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleAssignments4843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSimpleDefinition_in_ruleAssignments4864 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleAssignments4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElseCommand_in_entryRuleElseCommand4917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElseCommand4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleElseCommand4970 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleElseCommand4987 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleElseCommand5001 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleAssignments_in_ruleElseCommand5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameExpr_in_ruleExpression5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextVariable_in_ruleExpression5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleExpression5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOuterInfixApplication_in_ruleExpression5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketedExpression_in_ruleExpression5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketedExpression_in_entryRuleBracketedExpression5258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBracketedExpression5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBracketedExpression5305 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBracketedExpression5326 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleBracketedExpression5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOuterInfixApplication_in_entryRuleOuterInfixApplication5374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOuterInfixApplication5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleOuterInfixApplication5432 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInfixApplication_in_ruleOuterInfixApplication5451 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleOuterInfixApplication5466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleOuterInfixApplication5488 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInfixApplication_in_ruleOuterInfixApplication5507 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNameExpr_in_entryRuleNameExpr5548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameExpr5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleNameExpr5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextVariable_in_entryRuleNextVariable5638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNextVariable5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleNextVariable5690 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleNextVariable5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication5743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleApplication5799 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleApplication5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction5856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameExpr_in_ruleFunction5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument5946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameExpr_in_ruleArgument6004 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleBracketedExpression_in_ruleArgument6023 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleArgument6039 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleNameExpr_in_ruleArgument6062 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleBracketedExpression_in_ruleArgument6081 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleInfixApplication_in_entryRuleInfixApplication6122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfixApplication6132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameExpr_in_ruleInfixApplication6178 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInfixApplication6190 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_ruleNameExpr_in_ruleInfixApplication6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleInfixApplication6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketedExpression_in_ruleInfixApplication6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName6290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName6300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIERS_in_ruleName6341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_entryRuleNumeral6381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumeral6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMERALS_in_ruleNumeral6432 = new BitSet(new long[]{0x0000000000000002L});

}