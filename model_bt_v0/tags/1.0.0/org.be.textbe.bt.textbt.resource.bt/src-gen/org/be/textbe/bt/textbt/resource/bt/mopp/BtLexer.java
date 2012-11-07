// $ANTLR ${project.version} ${buildNumber}

	package org.be.textbe.bt.textbt.resource.bt.mopp;


import org.antlr.runtime3_3_0.*;

public class BtLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int REQUIREMENT=4;
    public static final int VALIDITY=5;
    public static final int DOUBLEMINUS=6;
    public static final int MCI=7;
    public static final int PERCENT=8;
    public static final int COMPONENT=9;
    public static final int TEXT=10;
    public static final int OPERATOR=11;
    public static final int OPERATORWITHLABEL=12;
    public static final int EQUALS=13;
    public static final int BEHAVIOR=14;
    public static final int COMPONENTNAME=15;
    public static final int STATE=16;
    public static final int LEVEL=17;
    public static final int QUALIFIER=18;
    public static final int WHITESPACE=19;
    public static final int LINEBREAK=20;

    	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public BtLexer() {;} 
    public BtLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BtLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Bt.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16:7: ( '#T' )
            // Bt.g:16:9: '#T'
            {
            match("#T"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:17:7: ( ';;' )
            // Bt.g:17:9: ';;'
            {
            match(";;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:18:7: ( ':' )
            // Bt.g:18:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:19:7: ( '_' )
            // Bt.g:19:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:20:7: ( ';' )
            // Bt.g:20:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:21:7: ( '#P' )
            // Bt.g:21:9: '#P'
            {
            match("#P"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:22:7: ( '{' )
            // Bt.g:22:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:23:7: ( '}' )
            // Bt.g:23:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:24:7: ( '#N' )
            // Bt.g:24:9: '#N'
            {
            match("#N"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:25:7: ( '#OPTIONS' )
            // Bt.g:25:9: '#OPTIONS'
            {
            match("#OPTIONS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:26:7: ( '#RT' )
            // Bt.g:26:9: '#RT'
            {
            match("#RT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:27:7: ( '#C' )
            // Bt.g:27:9: '#C'
            {
            match("#C"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:28:7: ( '#SC' )
            // Bt.g:28:9: '#SC'
            {
            match("#SC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:29:7: ( '#S' )
            // Bt.g:29:9: '#S'
            {
            match("#S"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:30:7: ( '#L' )
            // Bt.g:30:9: '#L'
            {
            match("#L"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:31:7: ( '#E' )
            // Bt.g:31:9: '#E'
            {
            match("#E"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:32:7: ( '#G' )
            // Bt.g:32:9: '#G'
            {
            match("#G"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:33:7: ( '#II' )
            // Bt.g:33:9: '#II'
            {
            match("#II"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:34:7: ( '#IO' )
            // Bt.g:34:9: '#IO'
            {
            match("#IO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:35:7: ( '#EI' )
            // Bt.g:35:9: '#EI'
            {
            match("#EI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:36:7: ( '#EO' )
            // Bt.g:36:9: '#EO'
            {
            match("#EO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:37:7: ( '#A' )
            // Bt.g:37:9: '#A'
            {
            match("#A"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:38:7: ( '#R' )
            // Bt.g:38:9: '#R'
            {
            match("#R"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16354:8: ( ( '%' ) )
            // Bt.g:16355:2: ( '%' )
            {
            // Bt.g:16355:2: ( '%' )
            // Bt.g:16355:3: '%'
            {
            match('%'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "DOUBLEMINUS"
    public final void mDOUBLEMINUS() throws RecognitionException {
        try {
            int _type = DOUBLEMINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16357:12: ( ( '--' ) )
            // Bt.g:16358:2: ( '--' )
            {
            // Bt.g:16358:2: ( '--' )
            // Bt.g:16358:3: '--'
            {
            match("--"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEMINUS"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16360:7: ( '=' )
            // Bt.g:16361:2: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "VALIDITY"
    public final void mVALIDITY() throws RecognitionException {
        try {
            int _type = VALIDITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16362:9: ( ( '+' | '-' | '+-' | '++' ) )
            // Bt.g:16363:2: ( '+' | '-' | '+-' | '++' )
            {
            // Bt.g:16363:2: ( '+' | '-' | '+-' | '++' )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+') ) {
                switch ( input.LA(2) ) {
                case '-':
                    {
                    alt1=3;
                    }
                    break;
                case '+':
                    {
                    alt1=4;
                    }
                    break;
                default:
                    alt1=1;}

            }
            else if ( (LA1_0=='-') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // Bt.g:16363:3: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // Bt.g:16363:7: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // Bt.g:16363:11: '+-'
                    {
                    match("+-"); 


                    }
                    break;
                case 4 :
                    // Bt.g:16363:16: '++'
                    {
                    match("++"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALIDITY"

    // $ANTLR start "MCI"
    public final void mMCI() throws RecognitionException {
        try {
            int _type = MCI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16365:4: ( ( '\\u007C\\u007C' | '[]' | '%+' ) )
            // Bt.g:16366:2: ( '\\u007C\\u007C' | '[]' | '%+' )
            {
            // Bt.g:16366:2: ( '\\u007C\\u007C' | '[]' | '%+' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case '|':
                {
                alt2=1;
                }
                break;
            case '[':
                {
                alt2=2;
                }
                break;
            case '%':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // Bt.g:16366:3: '\\u007C\\u007C'
                    {
                    match("\u007C\u007C"); 


                    }
                    break;
                case 2 :
                    // Bt.g:16366:18: '[]'
                    {
                    match("[]"); 


                    }
                    break;
                case 3 :
                    // Bt.g:16366:23: '%+'
                    {
                    match("%+"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MCI"

    // $ANTLR start "COMPONENT"
    public final void mCOMPONENT() throws RecognitionException {
        try {
            int _type = COMPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16368:10: ( ( 'C' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* ) )
            // Bt.g:16369:2: ( 'C' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* )
            {
            // Bt.g:16369:2: ( 'C' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* )
            // Bt.g:16369:3: 'C' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )*
            {
            match('C'); 
            // Bt.g:16369:6: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Bt.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // Bt.g:16369:35: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Bt.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPONENT"

    // $ANTLR start "REQUIREMENT"
    public final void mREQUIREMENT() throws RecognitionException {
        try {
            int _type = REQUIREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16371:12: ( ( 'R' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' )* ) )
            // Bt.g:16372:2: ( 'R' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' )* )
            {
            // Bt.g:16372:2: ( 'R' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' )* )
            // Bt.g:16372:3: 'R' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' )*
            {
            match('R'); 
            // Bt.g:16372:6: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Bt.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // Bt.g:16372:35: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='-' && LA6_0<='.')||(LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Bt.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REQUIREMENT"

    // $ANTLR start "OPERATORWITHLABEL"
    public final void mOPERATORWITHLABEL() throws RecognitionException {
        try {
            int _type = OPERATORWITHLABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16374:18: ( ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* '.' ( '^' | '=>' | '--' | '=' | '^^' | '%' | '&' | '\\u007C' | 'XOR' ) ) )
            // Bt.g:16375:2: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* '.' ( '^' | '=>' | '--' | '=' | '^^' | '%' | '&' | '\\u007C' | 'XOR' ) )
            {
            // Bt.g:16375:2: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* '.' ( '^' | '=>' | '--' | '=' | '^^' | '%' | '&' | '\\u007C' | 'XOR' ) )
            // Bt.g:16375:3: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* '.' ( '^' | '=>' | '--' | '=' | '^^' | '%' | '&' | '\\u007C' | 'XOR' )
            {
            // Bt.g:16375:3: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Bt.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // Bt.g:16375:32: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='-'||(LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Bt.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('.'); 
            // Bt.g:16375:72: ( '^' | '=>' | '--' | '=' | '^^' | '%' | '&' | '\\u007C' | 'XOR' )
            int alt9=9;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // Bt.g:16375:73: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 2 :
                    // Bt.g:16375:77: '=>'
                    {
                    match("=>"); 


                    }
                    break;
                case 3 :
                    // Bt.g:16375:82: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 4 :
                    // Bt.g:16375:87: '='
                    {
                    match('='); 

                    }
                    break;
                case 5 :
                    // Bt.g:16375:91: '^^'
                    {
                    match("^^"); 


                    }
                    break;
                case 6 :
                    // Bt.g:16375:96: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 7 :
                    // Bt.g:16375:100: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 8 :
                    // Bt.g:16375:104: '\\u007C'
                    {
                    match('|'); 

                    }
                    break;
                case 9 :
                    // Bt.g:16375:113: 'XOR'
                    {
                    match("XOR"); 


                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPERATORWITHLABEL"

    // $ANTLR start "STATE"
    public final void mSTATE() throws RecognitionException {
        try {
            int _type = STATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16377:6: ( ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )+ '[' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )+ ']' ) )
            // Bt.g:16378:2: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )+ '[' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )+ ']' )
            {
            // Bt.g:16378:2: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )+ '[' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )+ ']' )
            // Bt.g:16378:3: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )+ '[' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )+ ']'
            {
            // Bt.g:16378:3: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='-'||(LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Bt.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            match('['); 
            // Bt.g:16378:43: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='-'||(LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Bt.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            match(']'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STATE"

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16380:9: ( ( ( '^' | '=>' | '^^' | '&' | '\\u007C' | 'XOR' ) ) )
            // Bt.g:16381:2: ( ( '^' | '=>' | '^^' | '&' | '\\u007C' | 'XOR' ) )
            {
            // Bt.g:16381:2: ( ( '^' | '=>' | '^^' | '&' | '\\u007C' | 'XOR' ) )
            // Bt.g:16381:3: ( '^' | '=>' | '^^' | '&' | '\\u007C' | 'XOR' )
            {
            // Bt.g:16381:3: ( '^' | '=>' | '^^' | '&' | '\\u007C' | 'XOR' )
            int alt12=6;
            switch ( input.LA(1) ) {
            case '^':
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='^') ) {
                    alt12=3;
                }
                else {
                    alt12=1;}
                }
                break;
            case '=':
                {
                alt12=2;
                }
                break;
            case '&':
                {
                alt12=4;
                }
                break;
            case '|':
                {
                alt12=5;
                }
                break;
            case 'X':
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // Bt.g:16381:4: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 2 :
                    // Bt.g:16381:8: '=>'
                    {
                    match("=>"); 


                    }
                    break;
                case 3 :
                    // Bt.g:16381:13: '^^'
                    {
                    match("^^"); 


                    }
                    break;
                case 4 :
                    // Bt.g:16381:18: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 5 :
                    // Bt.g:16381:22: '\\u007C'
                    {
                    match('|'); 

                    }
                    break;
                case 6 :
                    // Bt.g:16381:31: 'XOR'
                    {
                    match("XOR"); 


                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPERATOR"

    // $ANTLR start "QUALIFIER"
    public final void mQUALIFIER() throws RecognitionException {
        try {
            int _type = QUALIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16383:10: ( ( ( 'Who' | 'What' | 'Where' | 'When' | 'Why' | 'How' ) ) )
            // Bt.g:16384:2: ( ( 'Who' | 'What' | 'Where' | 'When' | 'Why' | 'How' ) )
            {
            // Bt.g:16384:2: ( ( 'Who' | 'What' | 'Where' | 'When' | 'Why' | 'How' ) )
            // Bt.g:16384:3: ( 'Who' | 'What' | 'Where' | 'When' | 'Why' | 'How' )
            {
            // Bt.g:16384:3: ( 'Who' | 'What' | 'Where' | 'When' | 'Why' | 'How' )
            int alt13=6;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // Bt.g:16384:4: 'Who'
                    {
                    match("Who"); 


                    }
                    break;
                case 2 :
                    // Bt.g:16384:10: 'What'
                    {
                    match("What"); 


                    }
                    break;
                case 3 :
                    // Bt.g:16384:17: 'Where'
                    {
                    match("Where"); 


                    }
                    break;
                case 4 :
                    // Bt.g:16384:25: 'When'
                    {
                    match("When"); 


                    }
                    break;
                case 5 :
                    // Bt.g:16384:32: 'Why'
                    {
                    match("Why"); 


                    }
                    break;
                case 6 :
                    // Bt.g:16384:38: 'How'
                    {
                    match("How"); 


                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUALIFIER"

    // $ANTLR start "LEVEL"
    public final void mLEVEL() throws RecognitionException {
        try {
            int _type = LEVEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16386:6: ( ( ( '/' )+ ) )
            // Bt.g:16387:2: ( ( '/' )+ )
            {
            // Bt.g:16387:2: ( ( '/' )+ )
            // Bt.g:16387:3: ( '/' )+
            {
            // Bt.g:16387:3: ( '/' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='/') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Bt.g:16387:4: '/'
            	    {
            	    match('/'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEVEL"

    // $ANTLR start "COMPONENTNAME"
    public final void mCOMPONENTNAME() throws RecognitionException {
        try {
            int _type = COMPONENTNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16389:14: ( ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* ( '#' | '*' | '+' ) ( '0' .. '9' )* ) )
            // Bt.g:16390:2: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* ( '#' | '*' | '+' ) ( '0' .. '9' )* )
            {
            // Bt.g:16390:2: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* ( '#' | '*' | '+' ) ( '0' .. '9' )* )
            // Bt.g:16390:3: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* ( '#' | '*' | '+' ) ( '0' .. '9' )*
            {
            // Bt.g:16390:3: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Bt.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // Bt.g:16390:32: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='-'||(LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Bt.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( input.LA(1)=='#'||(input.LA(1)>='*' && input.LA(1)<='+') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Bt.g:16390:82: ( '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Bt.g:16390:83: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPONENTNAME"

    // $ANTLR start "BEHAVIOR"
    public final void mBEHAVIOR() throws RecognitionException {
        try {
            int _type = BEHAVIOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16392:9: ( ( ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* ( '+' | '#' | '<' | '>' | '=' | ':' | '.' | '\\u007C' | '(' | ')' | ',' | '/' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* )+ ) )
            // Bt.g:16393:2: ( ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* ( '+' | '#' | '<' | '>' | '=' | ':' | '.' | '\\u007C' | '(' | ')' | ',' | '/' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* )+ )
            {
            // Bt.g:16393:2: ( ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* ( '+' | '#' | '<' | '>' | '=' | ':' | '.' | '\\u007C' | '(' | ')' | ',' | '/' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* )+ )
            // Bt.g:16393:3: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* ( '+' | '#' | '<' | '>' | '=' | ':' | '.' | '\\u007C' | '(' | ')' | ',' | '/' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* )+
            {
            // Bt.g:16393:3: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* ( '+' | '#' | '<' | '>' | '=' | ':' | '.' | '\\u007C' | '(' | ')' | ',' | '/' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='#'||(LA21_0>='(' && LA21_0<=')')||(LA21_0>='+' && LA21_0<=':')||(LA21_0>='<' && LA21_0<='>')||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')||LA21_0=='|') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Bt.g:16393:4: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* ( '+' | '#' | '<' | '>' | '=' | ':' | '.' | '\\u007C' | '(' | ')' | ',' | '/' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )*
            	    {
            	    // Bt.g:16393:4: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0=='-'||(LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // Bt.g:
            	    	    {
            	    	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);

            	    // Bt.g:16393:41: ( '+' | '#' | '<' | '>' | '=' | ':' | '.' | '\\u007C' | '(' | ')' | ',' | '/' )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0=='#'||(LA19_0>='(' && LA19_0<=')')||(LA19_0>='+' && LA19_0<=',')||(LA19_0>='.' && LA19_0<='/')||LA19_0==':'||(LA19_0>='<' && LA19_0<='>')||LA19_0=='|') ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // Bt.g:
            	    	    {
            	    	    if ( input.LA(1)=='#'||(input.LA(1)>='(' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='/')||input.LA(1)==':'||(input.LA(1)>='<' && input.LA(1)<='>')||input.LA(1)=='|' ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt19 >= 1 ) break loop19;
            	                EarlyExitException eee =
            	                    new EarlyExitException(19, input);
            	                throw eee;
            	        }
            	        cnt19++;
            	    } while (true);

            	    // Bt.g:16393:96: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0=='-'||(LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='a' && LA20_0<='z')) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // Bt.g:
            	    	    {
            	    	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEHAVIOR"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16395:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Bt.g:16396:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Bt.g:16396:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Bt.g:16396:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Bt.g:16396:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='-'||(LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Bt.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16398:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Bt.g:16399:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // Bt.g:16399:2: ( ( ' ' | '\\t' | '\\f' ) )
            // Bt.g:16399:3: ( ' ' | '\\t' | '\\f' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bt.g:16402:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Bt.g:16403:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Bt.g:16403:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Bt.g:16403:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Bt.g:16403:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\r') ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1=='\n') ) {
                    alt23=1;
                }
                else {
                    alt23=2;}
            }
            else if ( (LA23_0=='\n') ) {
                alt23=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // Bt.g:16403:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Bt.g:16403:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Bt.g:16403:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINEBREAK"

    public void mTokens() throws RecognitionException {
        // Bt.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | PERCENT | DOUBLEMINUS | EQUALS | VALIDITY | MCI | COMPONENT | REQUIREMENT | OPERATORWITHLABEL | STATE | OPERATOR | QUALIFIER | LEVEL | COMPONENTNAME | BEHAVIOR | TEXT | WHITESPACE | LINEBREAK )
        int alt24=40;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // Bt.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // Bt.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // Bt.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // Bt.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // Bt.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // Bt.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // Bt.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // Bt.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // Bt.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // Bt.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // Bt.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // Bt.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // Bt.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // Bt.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // Bt.g:1:94: T__35
                {
                mT__35(); 

                }
                break;
            case 16 :
                // Bt.g:1:100: T__36
                {
                mT__36(); 

                }
                break;
            case 17 :
                // Bt.g:1:106: T__37
                {
                mT__37(); 

                }
                break;
            case 18 :
                // Bt.g:1:112: T__38
                {
                mT__38(); 

                }
                break;
            case 19 :
                // Bt.g:1:118: T__39
                {
                mT__39(); 

                }
                break;
            case 20 :
                // Bt.g:1:124: T__40
                {
                mT__40(); 

                }
                break;
            case 21 :
                // Bt.g:1:130: T__41
                {
                mT__41(); 

                }
                break;
            case 22 :
                // Bt.g:1:136: T__42
                {
                mT__42(); 

                }
                break;
            case 23 :
                // Bt.g:1:142: T__43
                {
                mT__43(); 

                }
                break;
            case 24 :
                // Bt.g:1:148: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 25 :
                // Bt.g:1:156: DOUBLEMINUS
                {
                mDOUBLEMINUS(); 

                }
                break;
            case 26 :
                // Bt.g:1:168: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 27 :
                // Bt.g:1:175: VALIDITY
                {
                mVALIDITY(); 

                }
                break;
            case 28 :
                // Bt.g:1:184: MCI
                {
                mMCI(); 

                }
                break;
            case 29 :
                // Bt.g:1:188: COMPONENT
                {
                mCOMPONENT(); 

                }
                break;
            case 30 :
                // Bt.g:1:198: REQUIREMENT
                {
                mREQUIREMENT(); 

                }
                break;
            case 31 :
                // Bt.g:1:210: OPERATORWITHLABEL
                {
                mOPERATORWITHLABEL(); 

                }
                break;
            case 32 :
                // Bt.g:1:228: STATE
                {
                mSTATE(); 

                }
                break;
            case 33 :
                // Bt.g:1:234: OPERATOR
                {
                mOPERATOR(); 

                }
                break;
            case 34 :
                // Bt.g:1:243: QUALIFIER
                {
                mQUALIFIER(); 

                }
                break;
            case 35 :
                // Bt.g:1:253: LEVEL
                {
                mLEVEL(); 

                }
                break;
            case 36 :
                // Bt.g:1:259: COMPONENTNAME
                {
                mCOMPONENTNAME(); 

                }
                break;
            case 37 :
                // Bt.g:1:273: BEHAVIOR
                {
                mBEHAVIOR(); 

                }
                break;
            case 38 :
                // Bt.g:1:282: TEXT
                {
                mTEXT(); 

                }
                break;
            case 39 :
                // Bt.g:1:287: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 40 :
                // Bt.g:1:298: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA9_eotS =
        "\1\uffff\1\11\1\13\11\uffff";
    static final String DFA9_eofS =
        "\14\uffff";
    static final String DFA9_minS =
        "\1\45\1\136\1\76\11\uffff";
    static final String DFA9_maxS =
        "\1\174\1\136\1\76\11\uffff";
    static final String DFA9_acceptS =
        "\3\uffff\1\3\1\6\1\7\1\10\1\11\1\5\1\1\1\2\1\4";
    static final String DFA9_specialS =
        "\14\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\4\1\5\6\uffff\1\3\17\uffff\1\2\32\uffff\1\7\5\uffff\1\1"+
            "\35\uffff\1\6",
            "\1\10",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "16375:72: ( '^' | '=>' | '--' | '=' | '^^' | '%' | '&' | '\\u007C' | 'XOR' )";
        }
    }
    static final String DFA13_eotS =
        "\12\uffff";
    static final String DFA13_eofS =
        "\12\uffff";
    static final String DFA13_minS =
        "\1\110\1\150\1\uffff\1\141\2\uffff\1\156\3\uffff";
    static final String DFA13_maxS =
        "\1\127\1\150\1\uffff\1\171\2\uffff\1\162\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\6\1\uffff\1\1\1\2\1\uffff\1\5\1\3\1\4";
    static final String DFA13_specialS =
        "\12\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\16\uffff\1\1",
            "\1\3",
            "",
            "\1\5\3\uffff\1\6\11\uffff\1\4\11\uffff\1\7",
            "",
            "",
            "\1\11\3\uffff\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "16384:3: ( 'Who' | 'What' | 'Where' | 'When' | 'Why' | 'How' )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\1\25\1\45\1\46\1\47\2\uffff\1\52\1\54\1\56\1\54\1\20\1"+
        "\uffff\3\67\1\uffff\3\67\1\75\3\uffff\1\76\1\77\1\100\1\25\1\103"+
        "\1\104\1\106\1\107\1\112\1\113\1\25\1\116\5\uffff\1\67\1\uffff\1"+
        "\117\1\uffff\1\20\1\uffff\2\54\1\14\1\121\1\67\1\25\1\66\2\uffff"+
        "\1\132\4\67\4\uffff\1\25\1\144\2\uffff\1\145\2\uffff\1\146\1\147"+
        "\2\uffff\1\150\1\151\2\uffff\1\121\1\uffff\1\121\1\uffff\1\123\1"+
        "\25\1\123\1\25\1\66\1\132\1\uffff\2\132\1\20\1\161\2\67\2\161\1"+
        "\25\6\uffff\2\123\1\25\4\132\1\uffff\1\161\1\67\1\161\1\25\1\123"+
        "\2\132\1\161\1\25\1\132\1\25\1\176\1\uffff";
    static final String DFA24_eofS =
        "\177\uffff";
    static final String DFA24_minS =
        "\1\11\1\101\1\73\2\43\2\uffff\1\53\4\43\1\uffff\3\43\1\uffff\4"+
        "\43\3\uffff\3\43\1\120\6\43\1\111\1\43\5\uffff\1\43\1\uffff\1\43"+
        "\1\uffff\1\43\1\uffff\5\43\1\45\1\43\2\uffff\5\43\4\uffff\1\124"+
        "\1\43\2\uffff\1\43\2\uffff\2\43\2\uffff\2\43\2\uffff\1\43\1\uffff"+
        "\1\43\1\uffff\1\43\1\55\1\43\1\117\2\43\1\uffff\10\43\1\111\6\uffff"+
        "\2\43\1\122\4\43\1\uffff\3\43\1\117\4\43\1\116\1\43\1\123\1\43\1"+
        "\uffff";
    static final String DFA24_maxS =
        "\1\175\1\124\1\73\2\174\2\uffff\1\53\4\174\1\uffff\3\174\1\uffff"+
        "\4\174\3\uffff\3\174\1\120\6\174\1\117\1\174\5\uffff\1\174\1\uffff"+
        "\1\174\1\uffff\1\174\1\uffff\7\174\2\uffff\5\174\4\uffff\1\124\1"+
        "\174\2\uffff\1\174\2\uffff\2\174\2\uffff\2\174\2\uffff\1\174\1\uffff"+
        "\1\174\1\uffff\1\174\1\55\1\174\1\117\2\174\1\uffff\10\174\1\111"+
        "\6\uffff\2\174\1\122\4\174\1\uffff\3\174\1\117\4\174\1\116\1\174"+
        "\1\123\1\174\1\uffff";
    static final String DFA24_acceptS =
        "\5\uffff\1\7\1\10\5\uffff\1\34\3\uffff\1\41\4\uffff\1\45\1\47\1"+
        "\50\14\uffff\1\2\1\5\1\3\1\4\1\40\1\uffff\1\30\1\uffff\1\33\1\uffff"+
        "\1\32\7\uffff\1\44\1\46\5\uffff\1\43\1\1\1\6\1\11\2\uffff\1\27\1"+
        "\14\1\uffff\1\16\1\17\2\uffff\1\20\1\21\2\uffff\1\26\1\31\1\uffff"+
        "\1\35\1\uffff\1\37\6\uffff\1\36\11\uffff\1\13\1\15\1\24\1\25\1\22"+
        "\1\23\7\uffff\1\42\14\uffff\1\12";
    static final String DFA24_specialS =
        "\177\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\26\1\27\1\uffff\1\26\1\27\22\uffff\1\26\2\uffff\1\1\1\uffff"+
            "\1\7\1\20\1\uffff\2\25\1\uffff\1\12\1\25\1\10\1\25\1\24\12\23"+
            "\1\3\1\2\1\25\1\11\1\25\2\uffff\2\23\1\15\4\23\1\22\11\23\1"+
            "\16\4\23\1\21\1\17\2\23\1\14\2\uffff\1\20\1\4\1\uffff\32\23"+
            "\1\5\1\13\1\6",
            "\1\43\1\uffff\1\35\1\uffff\1\40\1\uffff\1\41\1\uffff\1\42"+
            "\2\uffff\1\37\1\uffff\1\32\1\33\1\31\1\uffff\1\34\1\36\1\30",
            "\1\44",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\2\25\1\51\2\25\12\51\1\25\1\uffff"+
            "\3\25\2\uffff\32\51\1\50\3\uffff\1\51\1\uffff\32\51\1\uffff"+
            "\1\25",
            "",
            "",
            "\1\14",
            "\1\25\4\uffff\2\25\1\uffff\2\25\1\53\2\25\12\51\1\25\1\uffff"+
            "\3\25\2\uffff\32\51\1\50\3\uffff\1\51\1\uffff\32\51\1\uffff"+
            "\1\25",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\2\25\1\55\2\uffff"+
            "\32\25\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\1\60\1\25\1\57\15\25\1\uffff\3"+
            "\25\2\uffff\32\25\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\61",
            "",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\62\1\25"+
            "\1\uffff\3\25\2\uffff\32\62\1\50\3\uffff\1\63\1\uffff\32\62"+
            "\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\70\1\25"+
            "\1\uffff\3\25\2\uffff\32\70\1\50\3\uffff\1\63\1\uffff\32\70"+
            "\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\16\72\1\71\13\72\1\50\3\uffff\1\63\1\uffff"+
            "\32\72\1\uffff\1\25",
            "",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\7\72\1"+
            "\73\22\72\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\16\72"+
            "\1\74\13\72\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\32\72"+
            "\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\4\25\1\24\13\25\1\uffff\3\25\2"+
            "\uffff\32\25\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "",
            "",
            "",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\101",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\23\25"+
            "\1\102\6\25\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\2\25"+
            "\1\105\27\25\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\10\25"+
            "\1\110\5\25\1\111\13\25\4\uffff\1\25\1\uffff\32\25\1\uffff\1"+
            "\25",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\114\5\uffff\1\115",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "",
            "",
            "",
            "",
            "",
            "\1\25\4\uffff\2\25\1\uffff\2\25\1\51\2\25\12\51\1\25\1\uffff"+
            "\3\25\2\uffff\32\51\1\50\3\uffff\1\51\1\uffff\32\51\1\uffff"+
            "\1\25",
            "",
            "\1\25\4\uffff\2\25\1\uffff\2\25\1\51\2\25\12\51\1\25\1\uffff"+
            "\3\25\2\uffff\32\51\1\50\3\uffff\1\51\1\uffff\32\51\1\uffff"+
            "\1\25",
            "",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\122\1\64\1\25\12\120\1"+
            "\25\1\uffff\3\25\2\uffff\32\120\1\50\3\uffff\1\122\1\uffff\32"+
            "\120\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\63\1\25"+
            "\1\uffff\3\25\2\uffff\32\63\1\50\3\uffff\1\63\1\uffff\32\63"+
            "\1\uffff\1\25",
            "\2\123\6\uffff\1\125\17\uffff\1\124\32\uffff\1\127\5\uffff"+
            "\1\123\35\uffff\1\126",
            "\1\25\4\uffff\2\25\1\uffff\5\25\12\130\1\25\1\uffff\3\25\2"+
            "\uffff\32\25\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "",
            "",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\134\1\133\1\25\12\131"+
            "\1\25\1\uffff\3\25\2\uffff\32\131\1\50\3\uffff\1\134\1\uffff"+
            "\32\131\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\21\72\1\135\10\72\1\50\3\uffff\1\63\1"+
            "\uffff\32\72\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\32\72"+
            "\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\1\137"+
            "\3\72\1\140\11\72\1\136\11\72\1\141\1\72\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\26\72"+
            "\1\142\3\72\1\uffff\1\25",
            "",
            "",
            "",
            "",
            "\1\143",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "",
            "",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "",
            "",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "",
            "",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "",
            "",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\122\1\64\1\25\12\120\1"+
            "\25\1\uffff\3\25\2\uffff\32\120\1\50\3\uffff\1\122\1\uffff\32"+
            "\120\1\uffff\1\25",
            "",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\122\1\64\1\25\12\122\1"+
            "\25\1\uffff\3\25\2\uffff\32\122\1\50\3\uffff\1\122\1\uffff\32"+
            "\122\1\uffff\1\25",
            "",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\2\25\1\152\2\uffff"+
            "\32\25\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\153",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\154",
            "\1\25\4\uffff\2\25\1\uffff\5\25\12\130\1\25\1\uffff\3\25\2"+
            "\uffff\32\25\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\134\1\133\1\25\12\131"+
            "\1\25\1\uffff\3\25\2\uffff\32\131\1\50\3\uffff\1\134\1\uffff"+
            "\32\131\1\uffff\1\25",
            "",
            "\1\25\1\uffff\2\123\1\uffff\2\25\1\uffff\2\25\1\155\1\160"+
            "\1\25\12\157\1\25\1\uffff\1\25\1\124\1\25\2\uffff\27\157\1\156"+
            "\2\157\3\uffff\1\123\1\157\1\uffff\32\157\1\uffff\1\126",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\134\1\133\1\25\12\134"+
            "\1\25\1\uffff\3\25\2\uffff\32\134\1\50\3\uffff\1\134\1\uffff"+
            "\32\134\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\32\72"+
            "\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\32\72"+
            "\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\23\72"+
            "\1\162\6\72\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\15\72"+
            "\1\164\3\72\1\163\10\72\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\32\72"+
            "\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\32\72"+
            "\1\uffff\1\25",
            "\1\165",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\166",
            "\1\25\4\uffff\2\25\1\uffff\2\25\1\167\1\160\1\25\12\157\1"+
            "\25\1\uffff\3\25\2\uffff\32\157\4\uffff\1\157\1\uffff\32\157"+
            "\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\2\25\1\157\1\160\1\25\12\157\1"+
            "\25\1\uffff\3\25\2\uffff\16\157\1\170\13\157\4\uffff\1\157\1"+
            "\uffff\32\157\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\2\25\1\157\1\160\1\25\12\157\1"+
            "\25\1\uffff\3\25\2\uffff\32\157\4\uffff\1\157\1\uffff\32\157"+
            "\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\2\25\1\157\1\160\1\25\12\157\1"+
            "\25\1\uffff\3\25\2\uffff\32\157\4\uffff\1\157\1\uffff\32\157"+
            "\1\uffff\1\25",
            "",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\32\72"+
            "\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\4\72\1"+
            "\171\25\72\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\32\72"+
            "\1\uffff\1\25",
            "\1\172",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\2\25\1\157\1\160\1\25\12\157\1"+
            "\25\1\uffff\3\25\2\uffff\32\157\4\uffff\1\157\1\uffff\32\157"+
            "\1\uffff\1\25",
            "\1\25\4\uffff\2\25\1\uffff\2\25\1\157\1\160\1\25\12\157\1"+
            "\25\1\uffff\3\25\2\uffff\21\157\1\173\10\157\4\uffff\1\157\1"+
            "\uffff\32\157\1\uffff\1\25",
            "\1\65\4\uffff\2\25\1\66\1\65\1\25\1\63\1\64\1\25\12\72\1\25"+
            "\1\uffff\3\25\2\uffff\32\72\1\50\3\uffff\1\63\1\uffff\32\72"+
            "\1\uffff\1\25",
            "\1\174",
            "\1\25\4\uffff\2\25\1\uffff\2\25\1\157\1\160\1\25\12\157\1"+
            "\25\1\uffff\3\25\2\uffff\32\157\4\uffff\1\157\1\uffff\32\157"+
            "\1\uffff\1\25",
            "\1\175",
            "\1\25\4\uffff\2\25\1\uffff\20\25\1\uffff\3\25\2\uffff\32\25"+
            "\4\uffff\1\25\1\uffff\32\25\1\uffff\1\25",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | PERCENT | DOUBLEMINUS | EQUALS | VALIDITY | MCI | COMPONENT | REQUIREMENT | OPERATORWITHLABEL | STATE | OPERATOR | QUALIFIER | LEVEL | COMPONENTNAME | BEHAVIOR | TEXT | WHITESPACE | LINEBREAK );";
        }
    }
 

}