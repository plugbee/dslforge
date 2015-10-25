// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g 2015-04-22 16:59:05




var InternalMyDslLexer = function(input, state) {
// alternate constructor @todo
// public InternalMyDslLexer(CharStream input)
// public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    this.dfa11 = new InternalMyDslLexer.DFA11(this);
    InternalMyDslLexer.superclass.constructor.call(this, input, state);


};

org.antlr.lang.augmentObject(InternalMyDslLexer, {
    EOF: -1,
    T__9: 9,
    T__10: 10,
    ID: 4,
    STRING: 5,
    COMMENT: 6,
    WS: 7,
    NUMBER: 8
});

(function(){
var HIDDEN = org.antlr.runtime.Token.HIDDEN_CHANNEL,
    EOF = org.antlr.runtime.Token.EOF;
org.antlr.lang.extend(InternalMyDslLexer, org.antlr.runtime.Lexer, {
    EOF : -1,
    T__9 : 9,
    T__10 : 10,
    ID : 4,
    STRING : 5,
    COMMENT : 6,
    WS : 7,
    NUMBER : 8,
    getGrammarFileName: function() { return "C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g"; }
});
org.antlr.lang.augmentObject(InternalMyDslLexer.prototype, {
    // $ANTLR start T__9
    mT__9: function()  {
        try {
            var _type = this.T__9;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:11:6: ( 'Hello' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:11:8: 'Hello'
            this.match("Hello"); 




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__9",

    // $ANTLR start T__10
    mT__10: function()  {
        try {
            var _type = this.T__10;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:12:7: ( '!' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:12:9: '!'
            this.match('!'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__10",

    // $ANTLR start ID
    mID: function()  {
        try {
            var _type = this.ID;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:28:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:29:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            if ( (this.input.LA(1)>='A' && this.input.LA(1)<='Z')||this.input.LA(1)=='_'||(this.input.LA(1)>='a' && this.input.LA(1)<='z') ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:34:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                var alt1=2;
                var LA1_0 = this.input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:
                    if ( (this.input.LA(1)>='0' && this.input.LA(1)<='9')||(this.input.LA(1)>='A' && this.input.LA(1)<='Z')||this.input.LA(1)=='_'||(this.input.LA(1)>='a' && this.input.LA(1)<='z') ) {
                        this.input.consume();

                    }
                    else {
                        var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                        this.recover(mse);
                        throw mse;}



                    break;

                default :
                    break loop1;
                }
            } while (true);




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "ID",

    // $ANTLR start STRING
    mSTRING: function()  {
        try {
            var _type = this.STRING;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:43:3: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:44:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:44:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            var alt4=2;
            var LA4_0 = this.input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\'') ) {
                alt4=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 4, 0, this.input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:45:5: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    this.match('\"'); 
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:46:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop2:
                    do {
                        var alt2=3;
                        var LA2_0 = this.input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:47:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                            this.match('\\'); 
                            if ( this.input.LA(1)=='\"'||this.input.LA(1)=='\''||this.input.LA(1)=='\\'||this.input.LA(1)=='b'||this.input.LA(1)=='f'||this.input.LA(1)=='n'||this.input.LA(1)=='r'||(this.input.LA(1)>='t' && this.input.LA(1)<='u') ) {
                                this.input.consume();

                            }
                            else {
                                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                                this.recover(mse);
                                throw mse;}



                            break;
                        case 2 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:60:7: ~ ( ( '\\\\' | '\"' ) )
                            if ( (this.input.LA(1)>='\u0000' && this.input.LA(1)<='!')||(this.input.LA(1)>='#' && this.input.LA(1)<='[')||(this.input.LA(1)>=']' && this.input.LA(1)<='\uFFFF') ) {
                                this.input.consume();

                            }
                            else {
                                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                                this.recover(mse);
                                throw mse;}



                            break;

                        default :
                            break loop2;
                        }
                    } while (true);

                    this.match('\"'); 


                    break;
                case 2 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:68:7: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    this.match('\''); 
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:69:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop3:
                    do {
                        var alt3=3;
                        var LA3_0 = this.input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:70:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                            this.match('\\'); 
                            if ( this.input.LA(1)=='\"'||this.input.LA(1)=='\''||this.input.LA(1)=='\\'||this.input.LA(1)=='b'||this.input.LA(1)=='f'||this.input.LA(1)=='n'||this.input.LA(1)=='r'||(this.input.LA(1)>='t' && this.input.LA(1)<='u') ) {
                                this.input.consume();

                            }
                            else {
                                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                                this.recover(mse);
                                throw mse;}



                            break;
                        case 2 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:83:7: ~ ( ( '\\\\' | '\\'' ) )
                            if ( (this.input.LA(1)>='\u0000' && this.input.LA(1)<='&')||(this.input.LA(1)>='(' && this.input.LA(1)<='[')||(this.input.LA(1)>=']' && this.input.LA(1)<='\uFFFF') ) {
                                this.input.consume();

                            }
                            else {
                                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                                this.recover(mse);
                                throw mse;}



                            break;

                        default :
                            break loop3;
                        }
                    } while (true);

                    this.match('\''); 


                    break;

            }




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "STRING",

    // $ANTLR start COMMENT
    mCOMMENT: function()  {
        try {
            var _type = this.COMMENT;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:95:3: ( ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* ) )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:96:3: ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:96:3: ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* )
            var alt7=2;
            var LA7_0 = this.input.LA(1);

            if ( (LA7_0=='/') ) {
                var LA7_1 = this.input.LA(2);

                if ( (LA7_1=='*') ) {
                    alt7=1;
                }
                else if ( (LA7_1=='/') ) {
                    alt7=2;
                }
                else {
                    var nvae =
                        new org.antlr.runtime.NoViableAltException("", 7, 1, this.input);

                    throw nvae;
                }
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 7, 0, this.input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:97:5: '/*' ( . )* '*/'
                    this.match("/*"); 

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:97:10: ( . )*
                    loop5:
                    do {
                        var alt5=2;
                        var LA5_0 = this.input.LA(1);

                        if ( (LA5_0=='*') ) {
                            var LA5_1 = this.input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:97:10: .
                            this.matchAny(); 


                            break;

                        default :
                            break loop5;
                        }
                    } while (true);

                    this.match("*/"); 



                    break;
                case 2 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:98:7: '//' (~ ( '\\r' | '\\n' ) )*
                    this.match("//"); 

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:99:5: (~ ( '\\r' | '\\n' ) )*
                    loop6:
                    do {
                        var alt6=2;
                        var LA6_0 = this.input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:99:5: ~ ( '\\r' | '\\n' )
                            if ( (this.input.LA(1)>='\u0000' && this.input.LA(1)<='\t')||(this.input.LA(1)>='\u000B' && this.input.LA(1)<='\f')||(this.input.LA(1)>='\u000E' && this.input.LA(1)<='\uFFFF') ) {
                                this.input.consume();

                            }
                            else {
                                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                                this.recover(mse);
                                throw mse;}



                            break;

                        default :
                            break loop6;
                        }
                    } while (true);



                    break;

            }


                _channel = HIDDEN;
               



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "COMMENT",

    // $ANTLR start WS
    mWS: function()  {
        try {
            var _type = this.WS;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:111:3: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:112:3: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            if ( (this.input.LA(1)>='\t' && this.input.LA(1)<='\n')||(this.input.LA(1)>='\f' && this.input.LA(1)<='\r')||this.input.LA(1)==' ' ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}


                _channel=HIDDEN;
               



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "WS",

    // $ANTLR start NUMBER
    mNUMBER: function()  {
        try {
            var _type = this.NUMBER;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:126:3: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:127:3: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:127:3: ( '0' .. '9' )+
            var cnt8=0;
            loop8:
            do {
                var alt8=2;
                var LA8_0 = this.input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:127:4: '0' .. '9'
                    this.matchRange('0','9'); 


                    break;

                default :
                    if ( cnt8 >= 1 ) {
                        break loop8;
                    }
                        var eee = new org.antlr.runtime.EarlyExitException(8, this.input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:127:15: ( '.' ( '0' .. '9' )+ )?
            var alt10=2;
            var LA10_0 = this.input.LA(1);

            if ( (LA10_0=='.') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:127:16: '.' ( '0' .. '9' )+
                    this.match('.'); 
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:127:20: ( '0' .. '9' )+
                    var cnt9=0;
                    loop9:
                    do {
                        var alt9=2;
                        var LA9_0 = this.input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:127:21: '0' .. '9'
                            this.matchRange('0','9'); 


                            break;

                        default :
                            if ( cnt9 >= 1 ) {
                                break loop9;
                            }
                                var eee = new org.antlr.runtime.EarlyExitException(9, this.input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);



                    break;

            }




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "NUMBER",

    mTokens: function() {
        // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:1:8: ( T__9 | T__10 | ID | STRING | COMMENT | WS | NUMBER )
        var alt11=7;
        alt11 = this.dfa11.predict(this.input);
        switch (alt11) {
            case 1 :
                // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:1:10: T__9
                this.mT__9(); 


                break;
            case 2 :
                // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:1:15: T__10
                this.mT__10(); 


                break;
            case 3 :
                // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:1:21: ID
                this.mID(); 


                break;
            case 4 :
                // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:1:24: STRING
                this.mSTRING(); 


                break;
            case 5 :
                // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:1:31: COMMENT
                this.mCOMMENT(); 


                break;
            case 6 :
                // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:1:39: WS
                this.mWS(); 


                break;
            case 7 :
                // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:1:42: NUMBER
                this.mNUMBER(); 


                break;

        }

    }

}, true); // important to pass true to overwrite default implementations

org.antlr.lang.augmentObject(InternalMyDslLexer, {
    DFA11_eotS:
        "\u0001\uffff\u0001\u0003\u0006\uffff\u0003\u0003\u0001\u000c\u0001"+
    "\uffff",
    DFA11_eofS:
        "\u000d\uffff",
    DFA11_minS:
        "\u0001\u0009\u0001\u0065\u0006\uffff\u0002\u006c\u0001\u006f\u0001"+
    "\u0030\u0001\uffff",
    DFA11_maxS:
        "\u0001\u007a\u0001\u0065\u0006\uffff\u0002\u006c\u0001\u006f\u0001"+
    "\u007a\u0001\uffff",
    DFA11_acceptS:
        "\u0002\uffff\u0001\u0002\u0001\u0003\u0001\u0004\u0001\u0005\u0001"+
    "\u0006\u0001\u0007\u0004\uffff\u0001\u0001",
    DFA11_specialS:
        "\u000d\uffff}>",
    DFA11_transitionS: [
            "\u0002\u0006\u0001\uffff\u0002\u0006\u0012\uffff\u0001\u0006"+
            "\u0001\u0002\u0001\u0004\u0004\uffff\u0001\u0004\u0007\uffff"+
            "\u0001\u0005\u000a\u0007\u0007\uffff\u0007\u0003\u0001\u0001"+
            "\u0012\u0003\u0004\uffff\u0001\u0003\u0001\uffff\u001a\u0003",
            "\u0001\u0008",
            "",
            "",
            "",
            "",
            "",
            "",
            "\u0001\u0009",
            "\u0001\u000a",
            "\u0001\u000b",
            "\u000a\u0003\u0007\uffff\u001a\u0003\u0004\uffff\u0001\u0003"+
            "\u0001\uffff\u001a\u0003",
            ""
    ]
});

org.antlr.lang.augmentObject(InternalMyDslLexer, {
    DFA11_eot:
        org.antlr.runtime.DFA.unpackEncodedString(InternalMyDslLexer.DFA11_eotS),
    DFA11_eof:
        org.antlr.runtime.DFA.unpackEncodedString(InternalMyDslLexer.DFA11_eofS),
    DFA11_min:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(InternalMyDslLexer.DFA11_minS),
    DFA11_max:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(InternalMyDslLexer.DFA11_maxS),
    DFA11_accept:
        org.antlr.runtime.DFA.unpackEncodedString(InternalMyDslLexer.DFA11_acceptS),
    DFA11_special:
        org.antlr.runtime.DFA.unpackEncodedString(InternalMyDslLexer.DFA11_specialS),
    DFA11_transition: (function() {
        var a = [],
            i,
            numStates = InternalMyDslLexer.DFA11_transitionS.length;
        for (i=0; i<numStates; i++) {
            a.push(org.antlr.runtime.DFA.unpackEncodedString(InternalMyDslLexer.DFA11_transitionS[i]));
        }
        return a;
    })()
});

InternalMyDslLexer.DFA11 = function(recognizer) {
    this.recognizer = recognizer;
    this.decisionNumber = 11;
    this.eot = InternalMyDslLexer.DFA11_eot;
    this.eof = InternalMyDslLexer.DFA11_eof;
    this.min = InternalMyDslLexer.DFA11_min;
    this.max = InternalMyDslLexer.DFA11_max;
    this.accept = InternalMyDslLexer.DFA11_accept;
    this.special = InternalMyDslLexer.DFA11_special;
    this.transition = InternalMyDslLexer.DFA11_transition;
};

org.antlr.lang.extend(InternalMyDslLexer.DFA11, org.antlr.runtime.DFA, {
    getDescription: function() {
        return "1:1: Tokens : ( T__9 | T__10 | ID | STRING | COMMENT | WS | NUMBER );";
    },
    dummy: null
});
 
})();