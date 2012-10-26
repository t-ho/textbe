// $ANTLR ${project.version} ${buildNumber}

	package org.be.textbe.st.textst.resource.st.mopp;


import org.antlr.runtime3_3_0.*;

public class StLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
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
    public static final int REQUIREMENT=4;
    public static final int VALIDITY=5;
    public static final int COMPONENT=6;
    public static final int TEXT2=7;
    public static final int NUMBER=8;
    public static final int QUALIFIER=9;
    public static final int MCI=10;
    public static final int OPERATOR=11;
    public static final int UPPERBOUND=12;
    public static final int LINEBREAK=13;
    public static final int WHITESPACE=14;

    	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public StLexer() {;} 
    public StLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public StLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "St.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:16:7: ( '#ST' )
            // St.g:16:9: '#ST'
            {
            match("#ST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:17:7: ( '#P{' )
            // St.g:17:9: '#P{'
            {
            match("#P{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:18:7: ( '#' )
            // St.g:18:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:19:7: ( '}' )
            // St.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:20:7: ( '#N{' )
            // St.g:20:9: '#N{'
            {
            match("#N{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:21:7: ( '>' )
            // St.g:21:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:22:7: ( ':' )
            // St.g:22:9: ':'
            {
            match(':'); 

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
            // St.g:23:7: ( '_' )
            // St.g:23:9: '_'
            {
            match('_'); 

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
            // St.g:24:7: ( '<' )
            // St.g:24:9: '<'
            {
            match('<'); 

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
            // St.g:25:7: ( '#OPTIONS' )
            // St.g:25:9: '#OPTIONS'
            {
            match("#OPTIONS"); 


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
            // St.g:26:7: ( '=' )
            // St.g:26:9: '='
            {
            match('='); 

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
            // St.g:27:7: ( '#RT' )
            // St.g:27:9: '#RT'
            {
            match("#RT"); 


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
            // St.g:28:7: ( '#C' )
            // St.g:28:9: '#C'
            {
            match("#C"); 


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
            // St.g:29:7: ( '#SC' )
            // St.g:29:9: '#SC'
            {
            match("#SC"); 


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
            // St.g:30:7: ( '#SR' )
            // St.g:30:9: '#SR'
            {
            match("#SR"); 


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
            // St.g:31:7: ( '.' )
            // St.g:31:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:6930:9: ( ( ( '^' | '=>' | '^^' ) ) )
            // St.g:6931:2: ( ( '^' | '=>' | '^^' ) )
            {
            // St.g:6931:2: ( ( '^' | '=>' | '^^' ) )
            // St.g:6931:3: ( '^' | '=>' | '^^' )
            {
            // St.g:6931:3: ( '^' | '=>' | '^^' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='^') ) {
                    alt1=3;
                }
                else {
                    alt1=1;}
            }
            else if ( (LA1_0=='=') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // St.g:6931:4: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 2 :
                    // St.g:6931:8: '=>'
                    {
                    match("=>"); 


                    }
                    break;
                case 3 :
                    // St.g:6931:13: '^^'
                    {
                    match("^^"); 


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

    // $ANTLR start "VALIDITY"
    public final void mVALIDITY() throws RecognitionException {
        try {
            int _type = VALIDITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:6933:9: ( ( '+' | '-' | '+-' | '++' | '--' ) )
            // St.g:6934:2: ( '+' | '-' | '+-' | '++' | '--' )
            {
            // St.g:6934:2: ( '+' | '-' | '+-' | '++' | '--' )
            int alt2=5;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+') ) {
                switch ( input.LA(2) ) {
                case '-':
                    {
                    alt2=3;
                    }
                    break;
                case '+':
                    {
                    alt2=4;
                    }
                    break;
                default:
                    alt2=1;}

            }
            else if ( (LA2_0=='-') ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='-') ) {
                    alt2=5;
                }
                else {
                    alt2=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // St.g:6934:3: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // St.g:6934:7: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // St.g:6934:11: '+-'
                    {
                    match("+-"); 


                    }
                    break;
                case 4 :
                    // St.g:6934:16: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 5 :
                    // St.g:6934:21: '--'
                    {
                    match("--"); 


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

    // $ANTLR start "QUALIFIER"
    public final void mQUALIFIER() throws RecognitionException {
        try {
            int _type = QUALIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:6936:10: ( ( '?' | '\\u0021' | '\\u007E' ) )
            // St.g:6937:2: ( '?' | '\\u0021' | '\\u007E' )
            {
            if ( input.LA(1)=='!'||input.LA(1)=='?'||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUALIFIER"

    // $ANTLR start "MCI"
    public final void mMCI() throws RecognitionException {
        try {
            int _type = MCI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:6939:4: ( ( '\\u007C\\u007C' | '[]' | '%+' | '%' ) )
            // St.g:6940:2: ( '\\u007C\\u007C' | '[]' | '%+' | '%' )
            {
            // St.g:6940:2: ( '\\u007C\\u007C' | '[]' | '%+' | '%' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case '|':
                {
                alt3=1;
                }
                break;
            case '[':
                {
                alt3=2;
                }
                break;
            case '%':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='+') ) {
                    alt3=3;
                }
                else {
                    alt3=4;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // St.g:6940:3: '\\u007C\\u007C'
                    {
                    match("\u007C\u007C"); 


                    }
                    break;
                case 2 :
                    // St.g:6940:18: '[]'
                    {
                    match("[]"); 


                    }
                    break;
                case 3 :
                    // St.g:6940:23: '%+'
                    {
                    match("%+"); 


                    }
                    break;
                case 4 :
                    // St.g:6940:28: '%'
                    {
                    match('%'); 

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
            // St.g:6942:10: ( ( 'C' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* ) )
            // St.g:6943:2: ( 'C' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* )
            {
            // St.g:6943:2: ( 'C' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )* )
            // St.g:6943:3: 'C' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )*
            {
            match('C'); 
            // St.g:6943:6: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // St.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // St.g:6943:35: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-'||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // St.g:
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
            	    break loop5;
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
            // St.g:6945:12: ( ( 'R' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' )* ) )
            // St.g:6946:2: ( 'R' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' )* )
            {
            // St.g:6946:2: ( 'R' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' )* )
            // St.g:6946:3: 'R' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' )*
            {
            match('R'); 
            // St.g:6946:6: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // St.g:
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // St.g:6946:35: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='-' && LA7_0<='.')||(LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // St.g:
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
            	    break loop7;
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

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:6948:7: ( ( ( '0' .. '9' )+ ) )
            // St.g:6949:2: ( ( '0' .. '9' )+ )
            {
            // St.g:6949:2: ( ( '0' .. '9' )+ )
            // St.g:6949:3: ( '0' .. '9' )+
            {
            // St.g:6949:3: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // St.g:6949:4: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "UPPERBOUND"
    public final void mUPPERBOUND() throws RecognitionException {
        try {
            int _type = UPPERBOUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:6951:11: ( ( ( ( '0' .. '9' )+ | '*' )+ ) )
            // St.g:6952:2: ( ( ( '0' .. '9' )+ | '*' )+ )
            {
            // St.g:6952:2: ( ( ( '0' .. '9' )+ | '*' )+ )
            // St.g:6952:3: ( ( '0' .. '9' )+ | '*' )+
            {
            // St.g:6952:3: ( ( '0' .. '9' )+ | '*' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }
                else if ( (LA10_0=='*') ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // St.g:6952:4: ( '0' .. '9' )+
            	    {
            	    // St.g:6952:4: ( '0' .. '9' )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // St.g:6952:5: '0' .. '9'
            	    	    {
            	    	    matchRange('0','9'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);


            	    }
            	    break;
            	case 2 :
            	    // St.g:6952:16: '*'
            	    {
            	    match('*'); 

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


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPPERBOUND"

    // $ANTLR start "TEXT2"
    public final void mTEXT2() throws RecognitionException {
        try {
            int _type = TEXT2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:6954:6: ( ( ( '\\u0024' )? ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ( '#' | '+' | '.' | '/' | '(' | ')' )* )+ ) )
            // St.g:6955:2: ( ( '\\u0024' )? ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ( '#' | '+' | '.' | '/' | '(' | ')' )* )+ )
            {
            // St.g:6955:2: ( ( '\\u0024' )? ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ( '#' | '+' | '.' | '/' | '(' | ')' )* )+ )
            // St.g:6955:3: ( '\\u0024' )? ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ( '#' | '+' | '.' | '/' | '(' | ')' )* )+
            {
            // St.g:6955:3: ( '\\u0024' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='$') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // St.g:6955:4: '\\u0024'
                    {
                    match('$'); 

                    }
                    break;

            }

            // St.g:6955:14: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ( '#' | '+' | '.' | '/' | '(' | ')' )* )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='-'||(LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // St.g:6955:15: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ( '#' | '+' | '.' | '/' | '(' | ')' )*
            	    {
            	    // St.g:6955:15: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0=='-'||(LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // St.g:
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
            	    	    if ( cnt12 >= 1 ) break loop12;
            	                EarlyExitException eee =
            	                    new EarlyExitException(12, input);
            	                throw eee;
            	        }
            	        cnt12++;
            	    } while (true);

            	    // St.g:6955:53: ( '#' | '+' | '.' | '/' | '(' | ')' )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0=='#'||(LA13_0>='(' && LA13_0<=')')||LA13_0=='+'||(LA13_0>='.' && LA13_0<='/')) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // St.g:
            	    	    {
            	    	    if ( input.LA(1)=='#'||(input.LA(1)>='(' && input.LA(1)<=')')||input.LA(1)=='+'||(input.LA(1)>='.' && input.LA(1)<='/') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);


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
    // $ANTLR end "TEXT2"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:6957:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // St.g:6958:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // St.g:6958:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // St.g:6958:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // St.g:6958:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\r') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='\n') ) {
                    alt15=1;
                }
                else {
                    alt15=2;}
            }
            else if ( (LA15_0=='\n') ) {
                alt15=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // St.g:6958:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // St.g:6958:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // St.g:6958:16: '\\n'
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // St.g:6961:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // St.g:6962:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // St.g:6962:2: ( ( ' ' | '\\t' | '\\f' ) )
            // St.g:6962:3: ( ' ' | '\\t' | '\\f' )
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

    public void mTokens() throws RecognitionException {
        // St.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | OPERATOR | VALIDITY | QUALIFIER | MCI | COMPONENT | REQUIREMENT | NUMBER | UPPERBOUND | TEXT2 | LINEBREAK | WHITESPACE )
        int alt16=27;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // St.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // St.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // St.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // St.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // St.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // St.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // St.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // St.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // St.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // St.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // St.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // St.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // St.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // St.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // St.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // St.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // St.g:1:106: OPERATOR
                {
                mOPERATOR(); 

                }
                break;
            case 18 :
                // St.g:1:115: VALIDITY
                {
                mVALIDITY(); 

                }
                break;
            case 19 :
                // St.g:1:124: QUALIFIER
                {
                mQUALIFIER(); 

                }
                break;
            case 20 :
                // St.g:1:134: MCI
                {
                mMCI(); 

                }
                break;
            case 21 :
                // St.g:1:138: COMPONENT
                {
                mCOMPONENT(); 

                }
                break;
            case 22 :
                // St.g:1:148: REQUIREMENT
                {
                mREQUIREMENT(); 

                }
                break;
            case 23 :
                // St.g:1:160: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 24 :
                // St.g:1:167: UPPERBOUND
                {
                mUPPERBOUND(); 

                }
                break;
            case 25 :
                // St.g:1:178: TEXT2
                {
                mTEXT2(); 

                }
                break;
            case 26 :
                // St.g:1:184: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 27 :
                // St.g:1:194: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\33\3\uffff\1\34\1\uffff\1\35\3\uffff\1\12\2\uffff\2"+
        "\22\1\41\15\uffff\1\12\1\46\1\51\4\uffff\1\46\1\uffff\1\46\1\51"+
        "\1\uffff\2\51";
    static final String DFA16_eofS =
        "\54\uffff";
    static final String DFA16_minS =
        "\1\11\1\103\3\uffff\1\43\1\uffff\1\76\3\uffff\1\43\2\uffff\2\60"+
        "\1\43\4\uffff\1\103\10\uffff\3\43\4\uffff\1\43\1\uffff\2\43\1\uffff"+
        "\2\43";
    static final String DFA16_maxS =
        "\1\176\1\123\3\uffff\1\172\1\uffff\1\76\3\uffff\1\172\2\uffff\3"+
        "\172\4\uffff\1\124\10\uffff\3\172\4\uffff\1\172\1\uffff\2\172\1"+
        "\uffff\2\172";
    static final String DFA16_acceptS =
        "\2\uffff\1\4\1\6\1\7\1\uffff\1\11\1\uffff\1\20\1\21\1\22\1\uffff"+
        "\1\23\1\24\3\uffff\1\30\1\31\1\32\1\33\1\uffff\1\2\1\5\1\12\1\14"+
        "\1\15\1\3\1\10\1\13\3\uffff\1\27\1\1\1\16\1\17\1\uffff\1\25\2\uffff"+
        "\1\26\2\uffff";
    static final String DFA16_specialS =
        "\54\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\24\1\23\1\uffff\1\24\1\23\22\uffff\1\24\1\14\1\uffff\1\1"+
            "\1\22\1\15\4\uffff\1\21\1\12\1\uffff\1\13\1\10\1\uffff\12\20"+
            "\1\4\1\uffff\1\6\1\7\1\3\1\14\1\uffff\2\22\1\16\16\22\1\17\10"+
            "\22\1\15\2\uffff\1\11\1\5\1\uffff\32\22\1\uffff\1\15\1\2\1\14",
            "\1\32\12\uffff\1\27\1\30\1\26\1\uffff\1\31\1\25",
            "",
            "",
            "",
            "\1\22\4\uffff\2\22\1\uffff\1\22\1\uffff\15\22\7\uffff\32\22"+
            "\4\uffff\1\22\1\uffff\32\22",
            "",
            "\1\11",
            "",
            "",
            "",
            "\1\22\4\uffff\2\22\1\uffff\1\22\1\uffff\1\36\14\22\7\uffff"+
            "\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\22\4\uffff\2\22\1\21\1\22\1\uffff\3\22\12\20\7\uffff\32"+
            "\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "",
            "",
            "",
            "\1\43\16\uffff\1\44\1\uffff\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22\4\uffff\2\22\1\uffff\1\22\1\uffff\15\22\7\uffff\32\22"+
            "\4\uffff\1\22\1\uffff\32\22",
            "\1\22\4\uffff\2\22\1\uffff\1\22\1\uffff\1\47\2\22\12\45\7"+
            "\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\1\22\4\uffff\2\22\1\uffff\1\22\1\uffff\1\53\1\52\1\22\12"+
            "\50\7\uffff\32\50\4\uffff\1\53\1\uffff\32\50",
            "",
            "",
            "",
            "",
            "\1\22\4\uffff\2\22\1\uffff\1\22\1\uffff\1\47\2\22\12\45\7"+
            "\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "",
            "\1\22\4\uffff\2\22\1\uffff\1\22\1\uffff\1\47\2\22\12\47\7"+
            "\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\22\4\uffff\2\22\1\uffff\1\22\1\uffff\1\53\1\52\1\22\12"+
            "\50\7\uffff\32\50\4\uffff\1\53\1\uffff\32\50",
            "",
            "\1\22\4\uffff\2\22\1\uffff\1\22\1\uffff\1\53\1\52\1\22\12"+
            "\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\22\4\uffff\2\22\1\uffff\1\22\1\uffff\1\53\1\52\1\22\12"+
            "\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | OPERATOR | VALIDITY | QUALIFIER | MCI | COMPONENT | REQUIREMENT | NUMBER | UPPERBOUND | TEXT2 | LINEBREAK | WHITESPACE );";
        }
    }
 

}