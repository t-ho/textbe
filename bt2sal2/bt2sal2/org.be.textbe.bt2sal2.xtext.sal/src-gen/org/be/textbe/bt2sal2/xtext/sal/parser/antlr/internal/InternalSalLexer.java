package org.be.textbe.bt2sal2.xtext.sal.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSalLexer extends Lexer {
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
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__37=37;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_NUMERALS=5;
    public static final int T__10=10;
    public static final int RULE_WS=6;

    // delegates
    // delegators

    public InternalSalLexer() {;} 
    public InternalSalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:11:6: ( ': CONTEXT =' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:11:8: ': CONTEXT ='
            {
            match(": CONTEXT ="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:12:6: ( 'BEGIN' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:12:8: 'BEGIN'
            {
            match("BEGIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:13:7: ( 'END' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:13:9: 'END'
            {
            match("END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:14:7: ( ';' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:15:7: ( ': TYPE' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:15:9: ': TYPE'
            {
            match(": TYPE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:16:7: ( '=' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:17:7: ( 'BOOLEAN' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:17:9: 'BOOLEAN'
            {
            match("BOOLEAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:18:7: ( '{' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:18:9: '{'
            {
            match('{'); 

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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:19:7: ( '}' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:19:9: '}'
            {
            match('}'); 

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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:20:7: ( '!' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:20:9: '!'
            {
            match('!'); 

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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:21:7: ( '[' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:21:9: '['
            {
            match('['); 

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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:22:7: ( '..' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:22:9: '..'
            {
            match(".."); 


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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:23:7: ( ']' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:23:9: ']'
            {
            match(']'); 

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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:24:7: ( ',' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:24:9: ','
            {
            match(','); 

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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:25:7: ( ': MODULE =' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:25:9: ': MODULE ='
            {
            match(": MODULE ="); 


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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:26:7: ( 'INPUT' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:26:9: 'INPUT'
            {
            match("INPUT"); 


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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:27:7: ( 'OUTPUT' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:27:9: 'OUTPUT'
            {
            match("OUTPUT"); 


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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:28:7: ( 'LOCAL' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:28:9: 'LOCAL'
            {
            match("LOCAL"); 


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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:29:7: ( 'DEFINITION' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:29:9: 'DEFINITION'
            {
            match("DEFINITION"); 


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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:30:7: ( 'INITIALIZATION' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:30:9: 'INITIALIZATION'
            {
            match("INITIALIZATION"); 


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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:31:7: ( 'TRANSITION' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:31:9: 'TRANSITION'
            {
            match("TRANSITION"); 


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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:32:7: ( ': ' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:32:9: ': '
            {
            match(": "); 


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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:33:7: ( '\\'' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:33:9: '\\''
            {
            match('\''); 

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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:34:7: ( '[]' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:34:9: '[]'
            {
            match("[]"); 


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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:35:7: ( '-->' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:35:9: '-->'
            {
            match("-->"); 


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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:36:7: ( ':' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:36:9: ':'
            {
            match(':'); 

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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:37:7: ( 'ELSE -->' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:37:9: 'ELSE -->'
            {
            match("ELSE -->"); 


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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:38:7: ( '(' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:38:9: '('
            {
            match('('); 

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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:39:7: ( ')' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:39:9: ')'
            {
            match(')'); 

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
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:40:7: ( '.' )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:40:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_IDENTIFIERS"
    public final void mRULE_IDENTIFIERS() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2804:18: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '?' | '_' )* | ( '+' | '-' | '*' | '/' | '=' )+ ) )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2804:20: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '?' | '_' )* | ( '+' | '-' | '*' | '/' | '=' )+ )
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2804:20: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '?' | '_' )* | ( '+' | '-' | '*' | '/' | '=' )+ )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                alt3=1;
            }
            else if ( ((LA3_0>='*' && LA3_0<='+')||LA3_0=='-'||LA3_0=='/'||LA3_0=='=') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2804:21: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '?' | '_' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2804:41: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '?' | '_' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')||LA1_0=='?'||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2804:79: ( '+' | '-' | '*' | '/' | '=' )+
                    {
                    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2804:79: ( '+' | '-' | '*' | '/' | '=' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='*' && LA2_0<='+')||LA2_0=='-'||LA2_0=='/'||LA2_0=='=') ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:
                    	    {
                    	    if ( (input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/'||input.LA(1)=='=' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


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
    // $ANTLR end "RULE_IDENTIFIERS"

    // $ANTLR start "RULE_NUMERALS"
    public final void mRULE_NUMERALS() throws RecognitionException {
        try {
            int _type = RULE_NUMERALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2806:15: ( ( '0' .. '9' )+ )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2806:17: ( '0' .. '9' )+
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2806:17: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2806:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMERALS"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2808:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2808:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2808:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2810:16: ( . )
            // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:2810:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_IDENTIFIERS | RULE_NUMERALS | RULE_WS | RULE_ANY_OTHER )
        int alt6=34;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:110: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:116: T__26
                {
                mT__26(); 

                }
                break;
            case 20 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:122: T__27
                {
                mT__27(); 

                }
                break;
            case 21 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:128: T__28
                {
                mT__28(); 

                }
                break;
            case 22 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:134: T__29
                {
                mT__29(); 

                }
                break;
            case 23 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:140: T__30
                {
                mT__30(); 

                }
                break;
            case 24 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:146: T__31
                {
                mT__31(); 

                }
                break;
            case 25 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:152: T__32
                {
                mT__32(); 

                }
                break;
            case 26 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:158: T__33
                {
                mT__33(); 

                }
                break;
            case 27 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:164: T__34
                {
                mT__34(); 

                }
                break;
            case 28 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:170: T__35
                {
                mT__35(); 

                }
                break;
            case 29 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:176: T__36
                {
                mT__36(); 

                }
                break;
            case 30 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:182: T__37
                {
                mT__37(); 

                }
                break;
            case 31 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:188: RULE_IDENTIFIERS
                {
                mRULE_IDENTIFIERS(); 

                }
                break;
            case 32 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:205: RULE_NUMERALS
                {
                mRULE_NUMERALS(); 

                }
                break;
            case 33 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:219: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // ../org.be.textbe.bt2sal2.xtext.sal/src-gen/org/be/textbe/bt2sal2/xtext/sal/parser/antlr/internal/InternalSal.g:1:227: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\34\2\37\1\uffff\1\43\3\uffff\1\50\1\52\2\uffff\5\37"+
        "\1\uffff\1\37\7\uffff\1\73\1\uffff\2\37\1\uffff\2\37\13\uffff\5"+
        "\37\1\uffff\1\37\10\uffff\2\37\1\111\7\37\1\uffff\2\37\1\uffff\7"+
        "\37\1\132\1\37\1\uffff\1\134\2\37\1\137\2\37\1\uffff\1\37\1\uffff"+
        "\1\37\1\144\1\uffff\2\37\1\147\1\37\1\uffff\2\37\1\uffff\7\37\1"+
        "\162\1\163\1\37\2\uffff\2\37\1\167\1\uffff";
    static final String DFA6_eofS =
        "\170\uffff";
    static final String DFA6_minS =
        "\1\0\1\40\1\105\1\114\1\uffff\1\52\3\uffff\1\135\1\56\2\uffff\1"+
        "\116\1\125\1\117\1\105\1\122\1\uffff\1\55\7\uffff\1\103\1\uffff"+
        "\1\107\1\117\1\uffff\1\104\1\123\13\uffff\1\111\1\124\1\103\1\106"+
        "\1\101\1\uffff\1\76\10\uffff\1\111\1\114\1\60\1\105\1\125\1\124"+
        "\1\120\1\101\1\111\1\116\1\uffff\1\116\1\105\1\uffff\1\40\1\124"+
        "\1\111\1\125\1\114\1\116\1\123\1\60\1\101\1\uffff\1\60\1\101\1\124"+
        "\1\60\2\111\1\uffff\1\116\1\uffff\1\114\1\60\1\uffff\2\124\1\60"+
        "\1\111\1\uffff\2\111\1\uffff\1\132\2\117\1\101\2\116\1\124\2\60"+
        "\1\111\2\uffff\1\117\1\116\1\60\1\uffff";
    static final String DFA6_maxS =
        "\1\uffff\1\40\1\117\1\116\1\uffff\1\75\3\uffff\1\135\1\56\2\uffff"+
        "\1\116\1\125\1\117\1\105\1\122\1\uffff\1\55\7\uffff\1\124\1\uffff"+
        "\1\107\1\117\1\uffff\1\104\1\123\13\uffff\1\120\1\124\1\103\1\106"+
        "\1\101\1\uffff\1\76\10\uffff\1\111\1\114\1\172\1\105\1\125\1\124"+
        "\1\120\1\101\1\111\1\116\1\uffff\1\116\1\105\1\uffff\1\40\1\124"+
        "\1\111\1\125\1\114\1\116\1\123\1\172\1\101\1\uffff\1\172\1\101\1"+
        "\124\1\172\2\111\1\uffff\1\116\1\uffff\1\114\1\172\1\uffff\2\124"+
        "\1\172\1\111\1\uffff\2\111\1\uffff\1\132\2\117\1\101\2\116\1\124"+
        "\2\172\1\111\2\uffff\1\117\1\116\1\172\1\uffff";
    static final String DFA6_acceptS =
        "\4\uffff\1\4\1\uffff\1\10\1\11\1\12\2\uffff\1\15\1\16\5\uffff\1"+
        "\27\1\uffff\1\34\1\35\2\37\1\40\1\41\1\42\1\uffff\1\32\2\uffff\1"+
        "\37\2\uffff\1\4\1\6\1\10\1\11\1\12\1\30\1\13\1\14\1\36\1\15\1\16"+
        "\5\uffff\1\27\1\uffff\1\34\1\35\1\40\1\41\1\1\1\5\1\17\1\26\12\uffff"+
        "\1\31\2\uffff\1\3\11\uffff\1\33\6\uffff\1\2\1\uffff\1\20\2\uffff"+
        "\1\22\4\uffff\1\21\2\uffff\1\7\12\uffff\1\23\1\25\3\uffff\1\24";
    static final String DFA6_specialS =
        "\1\0\167\uffff}>";
    static final String[] DFA6_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\10\5\32\1\22\1\24\1\25\2"+
            "\27\1\14\1\23\1\12\1\27\12\30\1\1\1\4\1\32\1\5\3\32\1\26\1\2"+
            "\1\26\1\20\1\3\3\26\1\15\2\26\1\17\2\26\1\16\4\26\1\21\6\26"+
            "\1\11\1\32\1\13\3\32\32\26\1\6\1\32\1\7\uff82\32",
            "\1\33",
            "\1\35\11\uffff\1\36",
            "\1\41\1\uffff\1\40",
            "",
            "\2\37\1\uffff\1\37\1\uffff\1\37\15\uffff\1\37",
            "",
            "",
            "",
            "\1\47",
            "\1\51",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\70\11\uffff\1\72\6\uffff\1\71",
            "",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101\6\uffff\1\100",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "\12\37\5\uffff\1\37\1\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\37\5\uffff\1\37\1\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\133",
            "",
            "\12\37\5\uffff\1\37\1\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\135",
            "\1\136",
            "\12\37\5\uffff\1\37\1\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "",
            "\1\143",
            "\12\37\5\uffff\1\37\1\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "",
            "\1\145",
            "\1\146",
            "\12\37\5\uffff\1\37\1\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\37\5\uffff\1\37\1\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\12\37\5\uffff\1\37\1\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\164",
            "",
            "",
            "\1\165",
            "\1\166",
            "\12\37\5\uffff\1\37\1\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_IDENTIFIERS | RULE_NUMERALS | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( (LA6_0==':') ) {s = 1;}

                        else if ( (LA6_0=='B') ) {s = 2;}

                        else if ( (LA6_0=='E') ) {s = 3;}

                        else if ( (LA6_0==';') ) {s = 4;}

                        else if ( (LA6_0=='=') ) {s = 5;}

                        else if ( (LA6_0=='{') ) {s = 6;}

                        else if ( (LA6_0=='}') ) {s = 7;}

                        else if ( (LA6_0=='!') ) {s = 8;}

                        else if ( (LA6_0=='[') ) {s = 9;}

                        else if ( (LA6_0=='.') ) {s = 10;}

                        else if ( (LA6_0==']') ) {s = 11;}

                        else if ( (LA6_0==',') ) {s = 12;}

                        else if ( (LA6_0=='I') ) {s = 13;}

                        else if ( (LA6_0=='O') ) {s = 14;}

                        else if ( (LA6_0=='L') ) {s = 15;}

                        else if ( (LA6_0=='D') ) {s = 16;}

                        else if ( (LA6_0=='T') ) {s = 17;}

                        else if ( (LA6_0=='\'') ) {s = 18;}

                        else if ( (LA6_0=='-') ) {s = 19;}

                        else if ( (LA6_0=='(') ) {s = 20;}

                        else if ( (LA6_0==')') ) {s = 21;}

                        else if ( (LA6_0=='A'||LA6_0=='C'||(LA6_0>='F' && LA6_0<='H')||(LA6_0>='J' && LA6_0<='K')||(LA6_0>='M' && LA6_0<='N')||(LA6_0>='P' && LA6_0<='S')||(LA6_0>='U' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {s = 22;}

                        else if ( ((LA6_0>='*' && LA6_0<='+')||LA6_0=='/') ) {s = 23;}

                        else if ( ((LA6_0>='0' && LA6_0<='9')) ) {s = 24;}

                        else if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {s = 25;}

                        else if ( ((LA6_0>='\u0000' && LA6_0<='\b')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\u001F')||(LA6_0>='\"' && LA6_0<='&')||LA6_0=='<'||(LA6_0>='>' && LA6_0<='@')||LA6_0=='\\'||(LA6_0>='^' && LA6_0<='`')||LA6_0=='|'||(LA6_0>='~' && LA6_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}