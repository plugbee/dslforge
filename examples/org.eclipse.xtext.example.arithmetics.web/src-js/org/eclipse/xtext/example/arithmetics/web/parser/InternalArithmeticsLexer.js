// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g 2015-11-02 22:06:27



var InternalArithmeticsLexer = function(input, state) {
// alternate constructor @todo
// public InternalArithmeticsLexer(CharStream input)
// public InternalArithmeticsLexer(CharStream input, RecognizerSharedState state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    this.dfa11 = new InternalArithmeticsLexer.DFA11(this);
    InternalArithmeticsLexer.superclass.constructor.call(this, input, state);


};

org.antlr.lang.augmentObject(InternalArithmeticsLexer, {
    EOF: -1,
    T__9: 9,
    T__10: 10,
    T__11: 11,
    T__12: 12,
    T__13: 13,
    T__14: 14,
    T__15: 15,
    T__16: 16,
    T__17: 17,
    T__18: 18,
    T__19: 19,
    T__20: 20,
    T__21: 21,
    ID: 4,
    NUMBER: 5,
    STRING: 6,
    COMMENT: 7,
    WS: 8
});

(function(){
var HIDDEN = org.antlr.runtime.Token.HIDDEN_CHANNEL,
    EOF = org.antlr.runtime.Token.EOF;
org.antlr.lang.extend(InternalArithmeticsLexer, org.antlr.runtime.Lexer, {
    EOF : -1,
    T__9 : 9,
    T__10 : 10,
    T__11 : 11,
    T__12 : 12,
    T__13 : 13,
    T__14 : 14,
    T__15 : 15,
    T__16 : 16,
    T__17 : 17,
    T__18 : 18,
    T__19 : 19,
    T__20 : 20,
    T__21 : 21,
    ID : 4,
    NUMBER : 5,
    STRING : 6,
    COMMENT : 7,
    WS : 8,
    getGrammarFileName: function() { return "D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g"; }
});
org.antlr.lang.augmentObject(InternalArithmeticsLexer.prototype, {
    // $ANTLR start T__9
    mT__9: function()  {
        try {
            var _type = this.T__9;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:10:6: ( 'module' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:10:8: 'module'
            this.match("module"); 




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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:11:7: ( 'import' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:11:9: 'import'
            this.match("import"); 




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__10",

    // $ANTLR start T__11
    mT__11: function()  {
        try {
            var _type = this.T__11;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:12:7: ( '.' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:12:9: '.'
            this.match('.'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__11",

    // $ANTLR start T__12
    mT__12: function()  {
        try {
            var _type = this.T__12;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:13:7: ( '*' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:13:9: '*'
            this.match('*'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__12",

    // $ANTLR start T__13
    mT__13: function()  {
        try {
            var _type = this.T__13;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:14:7: ( 'def' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:14:9: 'def'
            this.match("def"); 




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__13",

    // $ANTLR start T__14
    mT__14: function()  {
        try {
            var _type = this.T__14;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:15:7: ( '(' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:15:9: '('
            this.match('('); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__14",

    // $ANTLR start T__15
    mT__15: function()  {
        try {
            var _type = this.T__15;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:16:7: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:16:9: ','
            this.match(','); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__15",

    // $ANTLR start T__16
    mT__16: function()  {
        try {
            var _type = this.T__16;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:17:7: ( ')' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:17:9: ')'
            this.match(')'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__16",

    // $ANTLR start T__17
    mT__17: function()  {
        try {
            var _type = this.T__17;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:18:7: ( ':' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:18:9: ':'
            this.match(':'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__17",

    // $ANTLR start T__18
    mT__18: function()  {
        try {
            var _type = this.T__18;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:19:7: ( ';' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:19:9: ';'
            this.match(';'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__18",

    // $ANTLR start T__19
    mT__19: function()  {
        try {
            var _type = this.T__19;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:20:7: ( '+' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:20:9: '+'
            this.match('+'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__19",

    // $ANTLR start T__20
    mT__20: function()  {
        try {
            var _type = this.T__20;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:21:7: ( '-' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:21:9: '-'
            this.match('-'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__20",

    // $ANTLR start T__21
    mT__21: function()  {
        try {
            var _type = this.T__21;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:22:7: ( '/' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:22:9: '/'
            this.match('/'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__21",

    // $ANTLR start ID
    mID: function()  {
        try {
            var _type = this.ID;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:66:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:66:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            if ( (this.input.LA(1)>='A' && this.input.LA(1)<='Z')||this.input.LA(1)=='_'||(this.input.LA(1)>='a' && this.input.LA(1)<='z') ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:66:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                var alt1=2;
                var LA1_0 = this.input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:68:8: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:68:10: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:68:10: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:68:11: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    this.match('\"'); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:68:15: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:68:16: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:68:61: ~ ( ( '\\\\' | '\"' ) )
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
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:68:81: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    this.match('\''); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:68:86: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:68:87: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:68:132: ~ ( ( '\\\\' | '\\'' ) )
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:70:9: ( ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:70:11: ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:70:11: ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* )
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
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:70:12: '/*' ( . )* '*/'
                    this.match("/*"); 

                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:70:17: ( . )*
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
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:70:17: .
                            this.matchAny(); 


                            break;

                        default :
                            break loop5;
                        }
                    } while (true);

                    this.match("*/"); 



                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:70:27: '//' (~ ( '\\r' | '\\n' ) )*
                    this.match("//"); 

                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:70:32: (~ ( '\\r' | '\\n' ) )*
                    loop6:
                    do {
                        var alt6=2;
                        var LA6_0 = this.input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:70:32: ~ ( '\\r' | '\\n' )
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:72:3: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:72:6: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:74:7: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:74:9: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:74:9: ( '0' .. '9' )+
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
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:74:10: '0' .. '9'
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

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:74:21: ( '.' ( '0' .. '9' )+ )?
            var alt10=2;
            var LA10_0 = this.input.LA(1);

            if ( (LA10_0=='.') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:74:22: '.' ( '0' .. '9' )+
                    this.match('.'); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:74:26: ( '0' .. '9' )+
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
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:74:27: '0' .. '9'
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
        // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | ID | STRING | COMMENT | WS | NUMBER )
        var alt11=18;
        alt11 = this.dfa11.predict(this.input);
        switch (alt11) {
            case 1 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:10: T__9
                this.mT__9(); 


                break;
            case 2 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:15: T__10
                this.mT__10(); 


                break;
            case 3 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:21: T__11
                this.mT__11(); 


                break;
            case 4 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:27: T__12
                this.mT__12(); 


                break;
            case 5 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:33: T__13
                this.mT__13(); 


                break;
            case 6 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:39: T__14
                this.mT__14(); 


                break;
            case 7 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:45: T__15
                this.mT__15(); 


                break;
            case 8 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:51: T__16
                this.mT__16(); 


                break;
            case 9 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:57: T__17
                this.mT__17(); 


                break;
            case 10 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:63: T__18
                this.mT__18(); 


                break;
            case 11 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:69: T__19
                this.mT__19(); 


                break;
            case 12 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:75: T__20
                this.mT__20(); 


                break;
            case 13 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:81: T__21
                this.mT__21(); 


                break;
            case 14 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:87: ID
                this.mID(); 


                break;
            case 15 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:90: STRING
                this.mSTRING(); 


                break;
            case 16 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:97: COMMENT
                this.mCOMMENT(); 


                break;
            case 17 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:105: WS
                this.mWS(); 


                break;
            case 18 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:1:108: NUMBER
                this.mNUMBER(); 


                break;

        }

    }

}, true); // important to pass true to overwrite default implementations

org.antlr.lang.augmentObject(InternalArithmeticsLexer, {
    DFA11_eotS:
        "\u0001\uffff\u0002\u000e\u0002\uffff\u0001\u000e\u0007\uffff\u0001"+
    "\u0016\u0004\uffff\u0003\u000e\u0002\uffff\u0002\u000e\u0001\u001c\u0002"+
    "\u000e\u0001\uffff\u0002\u000e\u0001\u0021\u0001\u0022\u0002\uffff",
    DFA11_eofS:
        "\u0023\uffff",
    DFA11_minS:
        "\u0001\u0009\u0001\u006f\u0001\u006d\u0002\uffff\u0001\u0065\u0007"+
    "\uffff\u0001\u002a\u0004\uffff\u0001\u0064\u0001\u0070\u0001\u0066\u0002"+
    "\uffff\u0001\u0075\u0001\u006f\u0001\u0030\u0001\u006c\u0001\u0072\u0001"+
    "\uffff\u0001\u0065\u0001\u0074\u0002\u0030\u0002\uffff",
    DFA11_maxS:
        "\u0001\u007a\u0001\u006f\u0001\u006d\u0002\uffff\u0001\u0065\u0007"+
    "\uffff\u0001\u002f\u0004\uffff\u0001\u0064\u0001\u0070\u0001\u0066\u0002"+
    "\uffff\u0001\u0075\u0001\u006f\u0001\u007a\u0001\u006c\u0001\u0072\u0001"+
    "\uffff\u0001\u0065\u0001\u0074\u0002\u007a\u0002\uffff",
    DFA11_acceptS:
        "\u0003\uffff\u0001\u0003\u0001\u0004\u0001\uffff\u0001\u0006\u0001"+
    "\u0007\u0001\u0008\u0001\u0009\u0001\u000a\u0001\u000b\u0001\u000c\u0001"+
    "\uffff\u0001\u000e\u0001\u000f\u0001\u0011\u0001\u0012\u0003\uffff\u0001"+
    "\u0010\u0001\u000d\u0005\uffff\u0001\u0005\u0004\uffff\u0001\u0001\u0001"+
    "\u0002",
    DFA11_specialS:
        "\u0023\uffff}>",
    DFA11_transitionS: [
            "\u0002\u0010\u0001\uffff\u0002\u0010\u0012\uffff\u0001\u0010"+
            "\u0001\uffff\u0001\u000f\u0004\uffff\u0001\u000f\u0001\u0006"+
            "\u0001\u0008\u0001\u0004\u0001\u000b\u0001\u0007\u0001\u000c"+
            "\u0001\u0003\u0001\u000d\u000a\u0011\u0001\u0009\u0001\u000a"+
            "\u0005\uffff\u001a\u000e\u0004\uffff\u0001\u000e\u0001\uffff"+
            "\u0003\u000e\u0001\u0005\u0004\u000e\u0001\u0002\u0003\u000e"+
            "\u0001\u0001\u000d\u000e",
            "\u0001\u0012",
            "\u0001\u0013",
            "",
            "",
            "\u0001\u0014",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\u0001\u0015\u0004\uffff\u0001\u0015",
            "",
            "",
            "",
            "",
            "\u0001\u0017",
            "\u0001\u0018",
            "\u0001\u0019",
            "",
            "",
            "\u0001\u001a",
            "\u0001\u001b",
            "\u000a\u000e\u0007\uffff\u001a\u000e\u0004\uffff\u0001\u000e"+
            "\u0001\uffff\u001a\u000e",
            "\u0001\u001d",
            "\u0001\u001e",
            "",
            "\u0001\u001f",
            "\u0001\u0020",
            "\u000a\u000e\u0007\uffff\u001a\u000e\u0004\uffff\u0001\u000e"+
            "\u0001\uffff\u001a\u000e",
            "\u000a\u000e\u0007\uffff\u001a\u000e\u0004\uffff\u0001\u000e"+
            "\u0001\uffff\u001a\u000e",
            "",
            ""
    ]
});

org.antlr.lang.augmentObject(InternalArithmeticsLexer, {
    DFA11_eot:
        org.antlr.runtime.DFA.unpackEncodedString(InternalArithmeticsLexer.DFA11_eotS),
    DFA11_eof:
        org.antlr.runtime.DFA.unpackEncodedString(InternalArithmeticsLexer.DFA11_eofS),
    DFA11_min:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(InternalArithmeticsLexer.DFA11_minS),
    DFA11_max:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(InternalArithmeticsLexer.DFA11_maxS),
    DFA11_accept:
        org.antlr.runtime.DFA.unpackEncodedString(InternalArithmeticsLexer.DFA11_acceptS),
    DFA11_special:
        org.antlr.runtime.DFA.unpackEncodedString(InternalArithmeticsLexer.DFA11_specialS),
    DFA11_transition: (function() {
        var a = [],
            i,
            numStates = InternalArithmeticsLexer.DFA11_transitionS.length;
        for (i=0; i<numStates; i++) {
            a.push(org.antlr.runtime.DFA.unpackEncodedString(InternalArithmeticsLexer.DFA11_transitionS[i]));
        }
        return a;
    })()
});

InternalArithmeticsLexer.DFA11 = function(recognizer) {
    this.recognizer = recognizer;
    this.decisionNumber = 11;
    this.eot = InternalArithmeticsLexer.DFA11_eot;
    this.eof = InternalArithmeticsLexer.DFA11_eof;
    this.min = InternalArithmeticsLexer.DFA11_min;
    this.max = InternalArithmeticsLexer.DFA11_max;
    this.accept = InternalArithmeticsLexer.DFA11_accept;
    this.special = InternalArithmeticsLexer.DFA11_special;
    this.transition = InternalArithmeticsLexer.DFA11_transition;
};

org.antlr.lang.extend(InternalArithmeticsLexer.DFA11, org.antlr.runtime.DFA, {
    getDescription: function() {
        return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | ID | STRING | COMMENT | WS | NUMBER );";
    },
    dummy: null
});
 
})();