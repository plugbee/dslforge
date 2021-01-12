// $ANTLR 3.3 avr. 19, 2016 01:13:22 D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g 2021-01-12 14:06:59

package org.eclipse.xtext.example.arithmetics.web.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalArithmeticsLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int RULE_ID=4;
    public static final int RULE_NUMBER=5;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=7;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;

    // delegates
    // delegators

    public InternalArithmeticsLexer() {;} 
    public InternalArithmeticsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalArithmeticsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:11:7: ( 'module' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:11:9: 'module'
            {
            match("module"); 


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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:12:7: ( 'import' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:12:9: 'import'
            {
            match("import"); 


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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:13:7: ( 'def' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:13:9: 'def'
            {
            match("def"); 


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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:14:7: ( ':' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:14:9: ':'
            {
            match(':'); 

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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:15:7: ( ';' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:15:9: ';'
            {
            match(';'); 

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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:16:7: ( '(' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:16:9: '('
            {
            match('('); 

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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:17:7: ( ')' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:17:9: ')'
            {
            match(')'); 

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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:18:7: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:18:9: ','
            {
            match(','); 

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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:19:7: ( '+' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:19:9: '+'
            {
            match('+'); 

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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:20:7: ( '-' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:20:9: '-'
            {
            match('-'); 

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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:21:7: ( '*' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:21:9: '*'
            {
            match('*'); 

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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:22:7: ( '/' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:22:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2266:13: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2266:15: ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2266:15: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2266:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2266:27: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2266:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2266:32: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2266:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2268:10: ( 'this one has been deactivated' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2268:12: 'this one has been deactivated'
            {
            match("this one has been deactivated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2270:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2270:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2270:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2270:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2270:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2272:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2272:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2272:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2272:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2272:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2272:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2272:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
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

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2272:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2272:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2272:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2272:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
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

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2274:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2274:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2274:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2274:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2276:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2276:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2276:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2276:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2276:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2276:41: ( '\\r' )? '\\n'
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2276:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2276:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2278:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2278:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2278:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2280:16: ( . )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2280:18: .
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
        // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_NUMBER | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=20;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:82: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 14 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:94: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 15 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:103: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:111: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:123: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:139: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:155: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 20 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1:163: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\17\3\30\10\uffff\1\45\1\uffff\1\26\1\uffff\1\30\1\26\1\uffff"+
        "\2\26\2\uffff\1\30\1\uffff\2\30\13\uffff\1\30\2\uffff\2\30\1\57"+
        "\3\30\1\uffff\3\30\1\uffff\1\66\1\67\2\uffff";
    static final String DFA14_eofS =
        "\70\uffff";
    static final String DFA14_minS =
        "\1\0\1\157\1\155\1\145\10\uffff\1\52\1\uffff\1\60\1\uffff\1\150"+
        "\1\101\1\uffff\2\0\2\uffff\1\144\1\uffff\1\160\1\146\13\uffff\1"+
        "\151\2\uffff\1\165\1\157\1\60\1\163\1\154\1\162\1\uffff\1\40\1\145"+
        "\1\164\1\uffff\2\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\157\1\155\1\145\10\uffff\1\57\1\uffff\1\71\1\uffff\1"+
        "\150\1\172\1\uffff\2\uffff\2\uffff\1\144\1\uffff\1\160\1\146\13"+
        "\uffff\1\151\2\uffff\1\165\1\157\1\172\1\163\1\154\1\162\1\uffff"+
        "\1\40\1\145\1\164\1\uffff\2\172\2\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff\1\15\1\uffff"+
        "\1\15\2\uffff\1\17\2\uffff\1\23\1\24\1\uffff\1\17\2\uffff\1\4\1"+
        "\5\1\6\1\7\1\10\1\11\1\12\1\13\1\21\1\22\1\14\1\uffff\1\20\1\23"+
        "\6\uffff\1\3\3\uffff\1\16\2\uffff\1\1\1\2";
    static final String DFA14_specialS =
        "\1\1\22\uffff\1\2\1\0\43\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\23\4\26\1\24\1\6\1"+
            "\7\1\13\1\11\1\10\1\12\1\16\1\14\12\15\1\4\1\5\5\26\32\22\3"+
            "\26\1\21\1\22\1\26\3\22\1\3\4\22\1\2\3\22\1\1\6\22\1\20\6\22"+
            "\uff85\26",
            "\1\27",
            "\1\31",
            "\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\4\uffff\1\44",
            "",
            "\12\17",
            "",
            "\1\46",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\0\47",
            "\0\47",
            "",
            "",
            "\1\51",
            "",
            "\1\52",
            "\1\53",
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
            "\1\54",
            "",
            "",
            "\1\55",
            "\1\56",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_NUMBER | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_20 = input.LA(1);

                        s = -1;
                        if ( ((LA14_20>='\u0000' && LA14_20<='\uFFFF')) ) {s = 39;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='m') ) {s = 1;}

                        else if ( (LA14_0=='i') ) {s = 2;}

                        else if ( (LA14_0=='d') ) {s = 3;}

                        else if ( (LA14_0==':') ) {s = 4;}

                        else if ( (LA14_0==';') ) {s = 5;}

                        else if ( (LA14_0=='(') ) {s = 6;}

                        else if ( (LA14_0==')') ) {s = 7;}

                        else if ( (LA14_0==',') ) {s = 8;}

                        else if ( (LA14_0=='+') ) {s = 9;}

                        else if ( (LA14_0=='-') ) {s = 10;}

                        else if ( (LA14_0=='*') ) {s = 11;}

                        else if ( (LA14_0=='/') ) {s = 12;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 13;}

                        else if ( (LA14_0=='.') ) {s = 14;}

                        else if ( (LA14_0=='t') ) {s = 16;}

                        else if ( (LA14_0=='^') ) {s = 17;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='c')||(LA14_0>='e' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='l')||(LA14_0>='n' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='z')) ) {s = 18;}

                        else if ( (LA14_0=='\"') ) {s = 19;}

                        else if ( (LA14_0=='\'') ) {s = 20;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 21;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='<' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 22;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_19 = input.LA(1);

                        s = -1;
                        if ( ((LA14_19>='\u0000' && LA14_19<='\uFFFF')) ) {s = 39;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}