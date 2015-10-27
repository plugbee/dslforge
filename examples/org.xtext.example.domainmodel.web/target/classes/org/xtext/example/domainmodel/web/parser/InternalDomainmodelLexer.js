// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g 2015-10-27 14:47:27




var InternalDomainmodelLexer = function(input, state) {
// alternate constructor @todo
// public InternalDomainmodelLexer(CharStream input)
// public InternalDomainmodelLexer(CharStream input, RecognizerSharedState state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    this.dfa12 = new InternalDomainmodelLexer.DFA12(this);
    InternalDomainmodelLexer.superclass.constructor.call(this, input, state);


};

org.antlr.lang.augmentObject(InternalDomainmodelLexer, {
    EOF: -1,
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
    T__22: 22,
    T__23: 23,
    T__24: 24,
    T__25: 25,
    T__26: 26,
    ID: 4,
    NUMBER: 5,
    INT: 6,
    STRING: 7,
    COMMENT: 8,
    WS: 9
});

(function(){
var HIDDEN = org.antlr.runtime.Token.HIDDEN_CHANNEL,
    EOF = org.antlr.runtime.Token.EOF;
org.antlr.lang.extend(InternalDomainmodelLexer, org.antlr.runtime.Lexer, {
    EOF : -1,
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
    T__22 : 22,
    T__23 : 23,
    T__24 : 24,
    T__25 : 25,
    T__26 : 26,
    ID : 4,
    NUMBER : 5,
    INT : 6,
    STRING : 7,
    COMMENT : 8,
    WS : 9,
    getGrammarFileName: function() { return "D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g"; }
});
org.antlr.lang.augmentObject(InternalDomainmodelLexer.prototype, {
    // $ANTLR start T__10
    mT__10: function()  {
        try {
            var _type = this.T__10;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:11:7: ( 'package' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:11:9: 'package'
            this.match("package"); 




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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:12:7: ( '{' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:12:9: '{'
            this.match('{'); 



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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:13:7: ( '}' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:13:9: '}'
            this.match('}'); 



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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:14:7: ( 'entity' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:14:9: 'entity'
            this.match("entity"); 




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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:15:7: ( 'extends' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:15:9: 'extends'
            this.match("extends"); 




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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:16:7: ( ':' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:16:9: ':'
            this.match(':'); 



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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:17:7: ( 'op' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:17:9: 'op'
            this.match("op"); 




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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:18:7: ( '(' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:18:9: '('
            this.match('('); 



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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:19:7: ( ',' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:19:9: ','
            this.match(','); 



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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:20:7: ( ')' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:20:9: ')'
            this.match(')'); 



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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:21:7: ( ';' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:21:9: ';'
            this.match(';'); 



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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:22:7: ( '+' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:22:9: '+'
            this.match('+'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__21",

    // $ANTLR start T__22
    mT__22: function()  {
        try {
            var _type = this.T__22;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:23:7: ( '-' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:23:9: '-'
            this.match('-'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__22",

    // $ANTLR start T__23
    mT__23: function()  {
        try {
            var _type = this.T__23;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:24:7: ( '*' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:24:9: '*'
            this.match('*'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__23",

    // $ANTLR start T__24
    mT__24: function()  {
        try {
            var _type = this.T__24;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:25:7: ( '/' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:25:9: '/'
            this.match('/'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__24",

    // $ANTLR start T__25
    mT__25: function()  {
        try {
            var _type = this.T__25;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:26:7: ( 'import' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:26:9: 'import'
            this.match("import"); 




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__25",

    // $ANTLR start T__26
    mT__26: function()  {
        try {
            var _type = this.T__26;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:27:7: ( '.' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:27:9: '.'
            this.match('.'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__26",

    // $ANTLR start ID
    mID: function()  {
        try {
            var _type = this.ID;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:128:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:129:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            if ( (this.input.LA(1)>='A' && this.input.LA(1)<='Z')||this.input.LA(1)=='_'||(this.input.LA(1)>='a' && this.input.LA(1)<='z') ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:134:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                var alt1=2;
                var LA1_0 = this.input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:
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

    // $ANTLR start INT
    mINT: function()  {
        try {
            var _type = this.INT;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:143:3: ( ( '0' .. '9' )+ )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:144:3: ( '0' .. '9' )+
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:144:3: ( '0' .. '9' )+
            var cnt2=0;
            loop2:
            do {
                var alt2=2;
                var LA2_0 = this.input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:144:4: '0' .. '9'
                    this.matchRange('0','9'); 


                    break;

                default :
                    if ( cnt2 >= 1 ) {
                        break loop2;
                    }
                        var eee = new org.antlr.runtime.EarlyExitException(2, this.input);
                        throw eee;
                }
                cnt2++;
            } while (true);




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "INT",

    // $ANTLR start STRING
    mSTRING: function()  {
        try {
            var _type = this.STRING;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:148:3: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:149:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:149:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            var alt5=2;
            var LA5_0 = this.input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 5, 0, this.input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:150:5: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    this.match('\"'); 
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:151:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        var alt3=3;
                        var LA3_0 = this.input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:152:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:165:7: ~ ( ( '\\\\' | '\"' ) )
                            if ( (this.input.LA(1)>='\u0000' && this.input.LA(1)<='!')||(this.input.LA(1)>='#' && this.input.LA(1)<='[')||(this.input.LA(1)>=']' && this.input.LA(1)<='\uFFFF') ) {
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

                    this.match('\"'); 


                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:173:7: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    this.match('\''); 
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:174:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        var alt4=3;
                        var LA4_0 = this.input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:175:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:188:7: ~ ( ( '\\\\' | '\\'' ) )
                            if ( (this.input.LA(1)>='\u0000' && this.input.LA(1)<='&')||(this.input.LA(1)>='(' && this.input.LA(1)<='[')||(this.input.LA(1)>=']' && this.input.LA(1)<='\uFFFF') ) {
                                this.input.consume();

                            }
                            else {
                                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                                this.recover(mse);
                                throw mse;}



                            break;

                        default :
                            break loop4;
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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:200:3: ( ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* ) )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:201:3: ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:201:3: ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* )
            var alt8=2;
            var LA8_0 = this.input.LA(1);

            if ( (LA8_0=='/') ) {
                var LA8_1 = this.input.LA(2);

                if ( (LA8_1=='*') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='/') ) {
                    alt8=2;
                }
                else {
                    var nvae =
                        new org.antlr.runtime.NoViableAltException("", 8, 1, this.input);

                    throw nvae;
                }
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 8, 0, this.input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:202:5: '/*' ( . )* '*/'
                    this.match("/*"); 

                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:202:10: ( . )*
                    loop6:
                    do {
                        var alt6=2;
                        var LA6_0 = this.input.LA(1);

                        if ( (LA6_0=='*') ) {
                            var LA6_1 = this.input.LA(2);

                            if ( (LA6_1=='/') ) {
                                alt6=2;
                            }
                            else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                                alt6=1;
                            }


                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:202:10: .
                            this.matchAny(); 


                            break;

                        default :
                            break loop6;
                        }
                    } while (true);

                    this.match("*/"); 



                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:203:7: '//' (~ ( '\\r' | '\\n' ) )*
                    this.match("//"); 

                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:204:5: (~ ( '\\r' | '\\n' ) )*
                    loop7:
                    do {
                        var alt7=2;
                        var LA7_0 = this.input.LA(1);

                        if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:204:5: ~ ( '\\r' | '\\n' )
                            if ( (this.input.LA(1)>='\u0000' && this.input.LA(1)<='\t')||(this.input.LA(1)>='\u000B' && this.input.LA(1)<='\f')||(this.input.LA(1)>='\u000E' && this.input.LA(1)<='\uFFFF') ) {
                                this.input.consume();

                            }
                            else {
                                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                                this.recover(mse);
                                throw mse;}



                            break;

                        default :
                            break loop7;
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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:216:3: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:217:3: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:230:7: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:230:9: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:230:9: ( '0' .. '9' )+
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
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:230:10: '0' .. '9'
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

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:230:21: ( '.' ( '0' .. '9' )+ )?
            var alt11=2;
            var LA11_0 = this.input.LA(1);

            if ( (LA11_0=='.') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:230:22: '.' ( '0' .. '9' )+
                    this.match('.'); 
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:230:26: ( '0' .. '9' )+
                    var cnt10=0;
                    loop10:
                    do {
                        var alt10=2;
                        var LA10_0 = this.input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:230:27: '0' .. '9'
                            this.matchRange('0','9'); 


                            break;

                        default :
                            if ( cnt10 >= 1 ) {
                                break loop10;
                            }
                                var eee = new org.antlr.runtime.EarlyExitException(10, this.input);
                                throw eee;
                        }
                        cnt10++;
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
        // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | INT | STRING | COMMENT | WS | NUMBER )
        var alt12=23;
        alt12 = this.dfa12.predict(this.input);
        switch (alt12) {
            case 1 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:10: T__10
                this.mT__10(); 


                break;
            case 2 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:16: T__11
                this.mT__11(); 


                break;
            case 3 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:22: T__12
                this.mT__12(); 


                break;
            case 4 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:28: T__13
                this.mT__13(); 


                break;
            case 5 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:34: T__14
                this.mT__14(); 


                break;
            case 6 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:40: T__15
                this.mT__15(); 


                break;
            case 7 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:46: T__16
                this.mT__16(); 


                break;
            case 8 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:52: T__17
                this.mT__17(); 


                break;
            case 9 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:58: T__18
                this.mT__18(); 


                break;
            case 10 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:64: T__19
                this.mT__19(); 


                break;
            case 11 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:70: T__20
                this.mT__20(); 


                break;
            case 12 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:76: T__21
                this.mT__21(); 


                break;
            case 13 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:82: T__22
                this.mT__22(); 


                break;
            case 14 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:88: T__23
                this.mT__23(); 


                break;
            case 15 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:94: T__24
                this.mT__24(); 


                break;
            case 16 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:100: T__25
                this.mT__25(); 


                break;
            case 17 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:106: T__26
                this.mT__26(); 


                break;
            case 18 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:112: ID
                this.mID(); 


                break;
            case 19 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:115: INT
                this.mINT(); 


                break;
            case 20 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:119: STRING
                this.mSTRING(); 


                break;
            case 21 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:126: COMMENT
                this.mCOMMENT(); 


                break;
            case 22 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:134: WS
                this.mWS(); 


                break;
            case 23 :
                // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:1:137: NUMBER
                this.mNUMBER(); 


                break;

        }

    }

}, true); // important to pass true to overwrite default implementations

org.antlr.lang.augmentObject(InternalDomainmodelLexer, {
    DFA12_eotS:
        "\u0001\uffff\u0001\u0011\u0002\uffff\u0001\u0011\u0001\uffff\u0001"+
    "\u0011\u0007\uffff\u0001\u001a\u0001\u0011\u0002\uffff\u0001\u001c\u0002"+
    "\uffff\u0003\u0011\u0001\u0021\u0002\uffff\u0001\u0011\u0002\uffff\u0003"+
    "\u0011\u0001\uffff\u000a\u0011\u0001\u0030\u0001\u0011\u0001\u0032\u0001"+
    "\u0033\u0001\uffff\u0001\u0034\u0003\uffff",
    DFA12_eofS:
        "\u0035\uffff",
    DFA12_minS:
        "\u0001\u0009\u0001\u0061\u0002\uffff\u0001\u006e\u0001\uffff\u0001"+
    "\u0070\u0007\uffff\u0001\u002a\u0001\u006d\u0002\uffff\u0001\u002e\u0002"+
    "\uffff\u0001\u0063\u0002\u0074\u0001\u0030\u0002\uffff\u0001\u0070\u0002"+
    "\uffff\u0001\u006b\u0001\u0069\u0001\u0065\u0001\uffff\u0001\u006f\u0001"+
    "\u0061\u0001\u0074\u0001\u006e\u0001\u0072\u0001\u0067\u0001\u0079\u0001"+
    "\u0064\u0001\u0074\u0001\u0065\u0001\u0030\u0001\u0073\u0002\u0030\u0001"+
    "\uffff\u0001\u0030\u0003\uffff",
    DFA12_maxS:
        "\u0001\u007d\u0001\u0061\u0002\uffff\u0001\u0078\u0001\uffff\u0001"+
    "\u0070\u0007\uffff\u0001\u002f\u0001\u006d\u0002\uffff\u0001\u0039\u0002"+
    "\uffff\u0001\u0063\u0002\u0074\u0001\u007a\u0002\uffff\u0001\u0070\u0002"+
    "\uffff\u0001\u006b\u0001\u0069\u0001\u0065\u0001\uffff\u0001\u006f\u0001"+
    "\u0061\u0001\u0074\u0001\u006e\u0001\u0072\u0001\u0067\u0001\u0079\u0001"+
    "\u0064\u0001\u0074\u0001\u0065\u0001\u007a\u0001\u0073\u0002\u007a\u0001"+
    "\uffff\u0001\u007a\u0003\uffff",
    DFA12_acceptS:
        "\u0002\uffff\u0001\u0002\u0001\u0003\u0001\uffff\u0001\u0006\u0001"+
    "\uffff\u0001\u0008\u0001\u0009\u0001\u000a\u0001\u000b\u0001\u000c\u0001"+
    "\u000d\u0001\u000e\u0002\uffff\u0001\u0011\u0001\u0012\u0001\uffff\u0001"+
    "\u0014\u0001\u0016\u0004\uffff\u0001\u0015\u0001\u000f\u0001\uffff\u0001"+
    "\u0013\u0001\u0017\u0003\uffff\u0001\u0007\u000e\uffff\u0001\u0004\u0001"+
    "\uffff\u0001\u0010\u0001\u0001\u0001\u0005",
    DFA12_specialS:
        "\u0035\uffff}>",
    DFA12_transitionS: [
            "\u0002\u0014\u0001\uffff\u0002\u0014\u0012\uffff\u0001\u0014"+
            "\u0001\uffff\u0001\u0013\u0004\uffff\u0001\u0013\u0001\u0007"+
            "\u0001\u0009\u0001\u000d\u0001\u000b\u0001\u0008\u0001\u000c"+
            "\u0001\u0010\u0001\u000e\u000a\u0012\u0001\u0005\u0001\u000a"+
            "\u0005\uffff\u001a\u0011\u0004\uffff\u0001\u0011\u0001\uffff"+
            "\u0004\u0011\u0001\u0004\u0003\u0011\u0001\u000f\u0005\u0011"+
            "\u0001\u0006\u0001\u0001\u000a\u0011\u0001\u0002\u0001\uffff"+
            "\u0001\u0003",
            "\u0001\u0015",
            "",
            "",
            "\u0001\u0016\u0009\uffff\u0001\u0017",
            "",
            "\u0001\u0018",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\u0001\u0019\u0004\uffff\u0001\u0019",
            "\u0001\u001b",
            "",
            "",
            "\u0001\u001d\u0001\uffff\u000a\u0012",
            "",
            "",
            "\u0001\u001e",
            "\u0001\u001f",
            "\u0001\u0020",
            "\u000a\u0011\u0007\uffff\u001a\u0011\u0004\uffff\u0001\u0011"+
            "\u0001\uffff\u001a\u0011",
            "",
            "",
            "\u0001\u0022",
            "",
            "",
            "\u0001\u0023",
            "\u0001\u0024",
            "\u0001\u0025",
            "",
            "\u0001\u0026",
            "\u0001\u0027",
            "\u0001\u0028",
            "\u0001\u0029",
            "\u0001\u002a",
            "\u0001\u002b",
            "\u0001\u002c",
            "\u0001\u002d",
            "\u0001\u002e",
            "\u0001\u002f",
            "\u000a\u0011\u0007\uffff\u001a\u0011\u0004\uffff\u0001\u0011"+
            "\u0001\uffff\u001a\u0011",
            "\u0001\u0031",
            "\u000a\u0011\u0007\uffff\u001a\u0011\u0004\uffff\u0001\u0011"+
            "\u0001\uffff\u001a\u0011",
            "\u000a\u0011\u0007\uffff\u001a\u0011\u0004\uffff\u0001\u0011"+
            "\u0001\uffff\u001a\u0011",
            "",
            "\u000a\u0011\u0007\uffff\u001a\u0011\u0004\uffff\u0001\u0011"+
            "\u0001\uffff\u001a\u0011",
            "",
            "",
            ""
    ]
});

org.antlr.lang.augmentObject(InternalDomainmodelLexer, {
    DFA12_eot:
        org.antlr.runtime.DFA.unpackEncodedString(InternalDomainmodelLexer.DFA12_eotS),
    DFA12_eof:
        org.antlr.runtime.DFA.unpackEncodedString(InternalDomainmodelLexer.DFA12_eofS),
    DFA12_min:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(InternalDomainmodelLexer.DFA12_minS),
    DFA12_max:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(InternalDomainmodelLexer.DFA12_maxS),
    DFA12_accept:
        org.antlr.runtime.DFA.unpackEncodedString(InternalDomainmodelLexer.DFA12_acceptS),
    DFA12_special:
        org.antlr.runtime.DFA.unpackEncodedString(InternalDomainmodelLexer.DFA12_specialS),
    DFA12_transition: (function() {
        var a = [],
            i,
            numStates = InternalDomainmodelLexer.DFA12_transitionS.length;
        for (i=0; i<numStates; i++) {
            a.push(org.antlr.runtime.DFA.unpackEncodedString(InternalDomainmodelLexer.DFA12_transitionS[i]));
        }
        return a;
    })()
});

InternalDomainmodelLexer.DFA12 = function(recognizer) {
    this.recognizer = recognizer;
    this.decisionNumber = 12;
    this.eot = InternalDomainmodelLexer.DFA12_eot;
    this.eof = InternalDomainmodelLexer.DFA12_eof;
    this.min = InternalDomainmodelLexer.DFA12_min;
    this.max = InternalDomainmodelLexer.DFA12_max;
    this.accept = InternalDomainmodelLexer.DFA12_accept;
    this.special = InternalDomainmodelLexer.DFA12_special;
    this.transition = InternalDomainmodelLexer.DFA12_transition;
};

org.antlr.lang.extend(InternalDomainmodelLexer.DFA12, org.antlr.runtime.DFA, {
    getDescription: function() {
        return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | INT | STRING | COMMENT | WS | NUMBER );";
    },
    dummy: null
});
 
})();