// $ANTLR 3.3 avr. 19, 2016 01:13:22 D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g 2016-05-13 22:38:39



var DomainmodelLexer = function(input, state) {
// alternate constructor @todo
// public DomainmodelLexer(CharStream input)
// public DomainmodelLexer(CharStream input, RecognizerSharedState state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    this.dfa9 = new DomainmodelLexer.DFA9(this);
    DomainmodelLexer.superclass.constructor.call(this, input, state);


};

org.antlr.lang.augmentObject(DomainmodelLexer, {
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
    T__22: 22,
    T__23: 23,
    T__24: 24,
    T__25: 25,
    T__26: 26,
    T__27: 27,
    ID: 4,
    STRING: 5,
    COMMENT: 6,
    WS: 7,
    INT: 8
});

(function(){
var HIDDEN = org.antlr.runtime.Token.HIDDEN_CHANNEL,
    EOF = org.antlr.runtime.Token.EOF;
org.antlr.lang.extend(DomainmodelLexer, org.antlr.runtime.Lexer, {
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
    T__22 : 22,
    T__23 : 23,
    T__24 : 24,
    T__25 : 25,
    T__26 : 26,
    T__27 : 27,
    ID : 4,
    STRING : 5,
    COMMENT : 6,
    WS : 7,
    INT : 8,
    getGrammarFileName: function() { return "D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g"; }
});
org.antlr.lang.augmentObject(DomainmodelLexer.prototype, {
    // $ANTLR start T__9
    mT__9: function()  {
        try {
            var _type = this.T__9;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:10:6: ( 'import' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:10:8: 'import'
            this.match("import"); 




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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:11:7: ( 'package' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:11:9: 'package'
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:12:7: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:12:9: '{'
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:13:7: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:13:9: '}'
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:14:7: ( 'datatype' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:14:9: 'datatype'
            this.match("datatype"); 




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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:15:7: ( 'entity' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:15:9: 'entity'
            this.match("entity"); 




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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:16:7: ( 'extends' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:16:9: 'extends'
            this.match("extends"); 




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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:17:7: ( ':' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:17:9: ':'
            this.match(':'); 



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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:18:7: ( 'ref' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:18:9: 'ref'
            this.match("ref"); 




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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:19:7: ( 'opposite' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:19:9: 'opposite'
            this.match("opposite"); 




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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:20:7: ( 'op' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:20:9: 'op'
            this.match("op"); 




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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:21:7: ( '(' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:21:9: '('
            this.match('('); 



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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:22:7: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:22:9: ','
            this.match(','); 



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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:23:7: ( ')' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:23:9: ')'
            this.match(')'); 



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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:24:7: ( '*' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:24:9: '*'
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:25:7: ( '.' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:25:9: '.'
            this.match('.'); 



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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:26:7: ( 'public' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:26:9: 'public'
            this.match("public"); 




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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:27:7: ( 'private' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:27:9: 'private'
            this.match("private"); 




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__26",

    // $ANTLR start T__27
    mT__27: function()  {
        try {
            var _type = this.T__27;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:28:7: ( 'protected' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:28:9: 'protected'
            this.match("protected"); 




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__27",

    // $ANTLR start ID
    mID: function()  {
        try {
            var _type = this.ID;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:128:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:128:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            if ( (this.input.LA(1)>='A' && this.input.LA(1)<='Z')||this.input.LA(1)=='_'||(this.input.LA(1)>='a' && this.input.LA(1)<='z') ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:128:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                var alt1=2;
                var LA1_0 = this.input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:130:8: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:130:10: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:130:10: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:130:11: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    this.match('\"'); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:130:15: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:130:16: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:130:61: ~ ( ( '\\\\' | '\"' ) )
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
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:130:81: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    this.match('\''); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:130:86: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:130:87: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:130:132: ~ ( ( '\\\\' | '\\'' ) )
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:132:9: ( ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:132:11: ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:132:11: ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* )
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
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:132:12: '/*' ( . )* '*/'
                    this.match("/*"); 

                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:132:17: ( . )*
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
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:132:17: .
                            this.matchAny(); 


                            break;

                        default :
                            break loop5;
                        }
                    } while (true);

                    this.match("*/"); 



                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:132:27: '//' (~ ( '\\r' | '\\n' ) )*
                    this.match("//"); 

                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:132:32: (~ ( '\\r' | '\\n' ) )*
                    loop6:
                    do {
                        var alt6=2;
                        var LA6_0 = this.input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:132:32: ~ ( '\\r' | '\\n' )
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:134:3: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:134:6: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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

    // $ANTLR start INT
    mINT: function()  {
        try {
            var _type = this.INT;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:138:4: ( ( '0' .. '9' )+ )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:138:6: ( '0' .. '9' )+
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:138:6: ( '0' .. '9' )+
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
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:138:7: '0' .. '9'
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




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "INT",

    mTokens: function() {
        // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | ID | STRING | COMMENT | WS | INT )
        var alt9=24;
        alt9 = this.dfa9.predict(this.input);
        switch (alt9) {
            case 1 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:10: T__9
                this.mT__9(); 


                break;
            case 2 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:15: T__10
                this.mT__10(); 


                break;
            case 3 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:21: T__11
                this.mT__11(); 


                break;
            case 4 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:27: T__12
                this.mT__12(); 


                break;
            case 5 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:33: T__13
                this.mT__13(); 


                break;
            case 6 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:39: T__14
                this.mT__14(); 


                break;
            case 7 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:45: T__15
                this.mT__15(); 


                break;
            case 8 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:51: T__16
                this.mT__16(); 


                break;
            case 9 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:57: T__17
                this.mT__17(); 


                break;
            case 10 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:63: T__18
                this.mT__18(); 


                break;
            case 11 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:69: T__19
                this.mT__19(); 


                break;
            case 12 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:75: T__20
                this.mT__20(); 


                break;
            case 13 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:81: T__21
                this.mT__21(); 


                break;
            case 14 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:87: T__22
                this.mT__22(); 


                break;
            case 15 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:93: T__23
                this.mT__23(); 


                break;
            case 16 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:99: T__24
                this.mT__24(); 


                break;
            case 17 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:105: T__25
                this.mT__25(); 


                break;
            case 18 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:111: T__26
                this.mT__26(); 


                break;
            case 19 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:117: T__27
                this.mT__27(); 


                break;
            case 20 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:123: ID
                this.mID(); 


                break;
            case 21 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:126: STRING
                this.mSTRING(); 


                break;
            case 22 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:133: COMMENT
                this.mCOMMENT(); 


                break;
            case 23 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:141: WS
                this.mWS(); 


                break;
            case 24 :
                // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:144: INT
                this.mINT(); 


                break;

        }

    }

}, true); // important to pass true to overwrite default implementations

org.antlr.lang.augmentObject(DomainmodelLexer, {
    DFA9_eotS:
        "\u0001\uffff\u0002\u000f\u0002\uffff\u0002\u000f\u0001\uffff\u0002"+
    "\u000f\u000a\uffff\u0008\u000f\u0001\u0027\u0008\u000f\u0001\u0030\u0001"+
    "\u000f\u0001\uffff\u0008\u000f\u0001\uffff\u000a\u000f\u0001\u0044\u0001"+
    "\u000f\u0001\u0046\u0003\u000f\u0001\u004a\u0002\u000f\u0001\uffff\u0001"+
    "\u004d\u0001\uffff\u0001\u004e\u0002\u000f\u0001\uffff\u0001\u0051\u0001"+
    "\u000f\u0002\uffff\u0001\u000f\u0001\u0054\u0001\uffff\u0001\u0055\u0001"+
    "\u0056\u0003\uffff",
    DFA9_eofS:
        "\u0057\uffff",
    DFA9_minS:
        "\u0001\u0009\u0001\u006d\u0001\u0061\u0002\uffff\u0001\u0061\u0001"+
    "\u006e\u0001\uffff\u0001\u0065\u0001\u0070\u000a\uffff\u0001\u0070\u0001"+
    "\u0063\u0001\u0062\u0001\u0069\u0003\u0074\u0001\u0066\u0001\u0030\u0001"+
    "\u006f\u0001\u006b\u0001\u006c\u0001\u0076\u0001\u0074\u0001\u0061\u0001"+
    "\u0069\u0001\u0065\u0001\u0030\u0001\u006f\u0001\uffff\u0001\u0072\u0001"+
    "\u0061\u0001\u0069\u0001\u0061\u0001\u0065\u0002\u0074\u0001\u006e\u0001"+
    "\uffff\u0001\u0073\u0001\u0074\u0001\u0067\u0001\u0063\u0001\u0074\u0001"+
    "\u0063\u0002\u0079\u0001\u0064\u0001\u0069\u0001\u0030\u0001\u0065\u0001"+
    "\u0030\u0001\u0065\u0001\u0074\u0001\u0070\u0001\u0030\u0001\u0073\u0001"+
    "\u0074\u0001\uffff\u0001\u0030\u0001\uffff\u0001\u0030\u0002\u0065\u0001"+
    "\uffff\u0001\u0030\u0001\u0065\u0002\uffff\u0001\u0064\u0001\u0030\u0001"+
    "\uffff\u0002\u0030\u0003\uffff",
    DFA9_maxS:
        "\u0001\u007d\u0001\u006d\u0001\u0075\u0002\uffff\u0001\u0061\u0001"+
    "\u0078\u0001\uffff\u0001\u0065\u0001\u0070\u000a\uffff\u0001\u0070\u0001"+
    "\u0063\u0001\u0062\u0001\u006f\u0003\u0074\u0001\u0066\u0001\u007a\u0001"+
    "\u006f\u0001\u006b\u0001\u006c\u0001\u0076\u0001\u0074\u0001\u0061\u0001"+
    "\u0069\u0001\u0065\u0001\u007a\u0001\u006f\u0001\uffff\u0001\u0072\u0001"+
    "\u0061\u0001\u0069\u0001\u0061\u0001\u0065\u0002\u0074\u0001\u006e\u0001"+
    "\uffff\u0001\u0073\u0001\u0074\u0001\u0067\u0001\u0063\u0001\u0074\u0001"+
    "\u0063\u0002\u0079\u0001\u0064\u0001\u0069\u0001\u007a\u0001\u0065\u0001"+
    "\u007a\u0001\u0065\u0001\u0074\u0001\u0070\u0001\u007a\u0001\u0073\u0001"+
    "\u0074\u0001\uffff\u0001\u007a\u0001\uffff\u0001\u007a\u0002\u0065\u0001"+
    "\uffff\u0001\u007a\u0001\u0065\u0002\uffff\u0001\u0064\u0001\u007a\u0001"+
    "\uffff\u0002\u007a\u0003\uffff",
    DFA9_acceptS:
        "\u0003\uffff\u0001\u0003\u0001\u0004\u0002\uffff\u0001\u0008\u0002"+
    "\uffff\u0001\u000c\u0001\u000d\u0001\u000e\u0001\u000f\u0001\u0010\u0001"+
    "\u0014\u0001\u0015\u0001\u0016\u0001\u0017\u0001\u0018\u0013\uffff\u0001"+
    "\u000b\u0008\uffff\u0001\u0009\u0013\uffff\u0001\u0001\u0001\uffff\u0001"+
    "\u0011\u0003\uffff\u0001\u0006\u0002\uffff\u0001\u0002\u0001\u0012\u0002"+
    "\uffff\u0001\u0007\u0002\uffff\u0001\u0005\u0001\u000a\u0001\u0013",
    DFA9_specialS:
        "\u0057\uffff}>",
    DFA9_transitionS: [
            "\u0002\u0012\u0001\uffff\u0002\u0012\u0012\uffff\u0001\u0012"+
            "\u0001\uffff\u0001\u0010\u0004\uffff\u0001\u0010\u0001\u000a"+
            "\u0001\u000c\u0001\u000d\u0001\uffff\u0001\u000b\u0001\uffff"+
            "\u0001\u000e\u0001\u0011\u000a\u0013\u0001\u0007\u0006\uffff"+
            "\u001a\u000f\u0004\uffff\u0001\u000f\u0001\uffff\u0003\u000f"+
            "\u0001\u0005\u0001\u0006\u0003\u000f\u0001\u0001\u0005\u000f"+
            "\u0001\u0009\u0001\u0002\u0001\u000f\u0001\u0008\u0008\u000f"+
            "\u0001\u0003\u0001\uffff\u0001\u0004",
            "\u0001\u0014",
            "\u0001\u0015\u0010\uffff\u0001\u0017\u0002\uffff\u0001\u0016",
            "",
            "",
            "\u0001\u0018",
            "\u0001\u0019\u0009\uffff\u0001\u001a",
            "",
            "\u0001\u001b",
            "\u0001\u001c",
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
            "\u0001\u001d",
            "\u0001\u001e",
            "\u0001\u001f",
            "\u0001\u0020\u0005\uffff\u0001\u0021",
            "\u0001\u0022",
            "\u0001\u0023",
            "\u0001\u0024",
            "\u0001\u0025",
            "\u000a\u000f\u0007\uffff\u001a\u000f\u0004\uffff\u0001\u000f"+
            "\u0001\uffff\u000f\u000f\u0001\u0026\u000a\u000f",
            "\u0001\u0028",
            "\u0001\u0029",
            "\u0001\u002a",
            "\u0001\u002b",
            "\u0001\u002c",
            "\u0001\u002d",
            "\u0001\u002e",
            "\u0001\u002f",
            "\u000a\u000f\u0007\uffff\u001a\u000f\u0004\uffff\u0001\u000f"+
            "\u0001\uffff\u001a\u000f",
            "\u0001\u0031",
            "",
            "\u0001\u0032",
            "\u0001\u0033",
            "\u0001\u0034",
            "\u0001\u0035",
            "\u0001\u0036",
            "\u0001\u0037",
            "\u0001\u0038",
            "\u0001\u0039",
            "",
            "\u0001\u003a",
            "\u0001\u003b",
            "\u0001\u003c",
            "\u0001\u003d",
            "\u0001\u003e",
            "\u0001\u003f",
            "\u0001\u0040",
            "\u0001\u0041",
            "\u0001\u0042",
            "\u0001\u0043",
            "\u000a\u000f\u0007\uffff\u001a\u000f\u0004\uffff\u0001\u000f"+
            "\u0001\uffff\u001a\u000f",
            "\u0001\u0045",
            "\u000a\u000f\u0007\uffff\u001a\u000f\u0004\uffff\u0001\u000f"+
            "\u0001\uffff\u001a\u000f",
            "\u0001\u0047",
            "\u0001\u0048",
            "\u0001\u0049",
            "\u000a\u000f\u0007\uffff\u001a\u000f\u0004\uffff\u0001\u000f"+
            "\u0001\uffff\u001a\u000f",
            "\u0001\u004b",
            "\u0001\u004c",
            "",
            "\u000a\u000f\u0007\uffff\u001a\u000f\u0004\uffff\u0001\u000f"+
            "\u0001\uffff\u001a\u000f",
            "",
            "\u000a\u000f\u0007\uffff\u001a\u000f\u0004\uffff\u0001\u000f"+
            "\u0001\uffff\u001a\u000f",
            "\u0001\u004f",
            "\u0001\u0050",
            "",
            "\u000a\u000f\u0007\uffff\u001a\u000f\u0004\uffff\u0001\u000f"+
            "\u0001\uffff\u001a\u000f",
            "\u0001\u0052",
            "",
            "",
            "\u0001\u0053",
            "\u000a\u000f\u0007\uffff\u001a\u000f\u0004\uffff\u0001\u000f"+
            "\u0001\uffff\u001a\u000f",
            "",
            "\u000a\u000f\u0007\uffff\u001a\u000f\u0004\uffff\u0001\u000f"+
            "\u0001\uffff\u001a\u000f",
            "\u000a\u000f\u0007\uffff\u001a\u000f\u0004\uffff\u0001\u000f"+
            "\u0001\uffff\u001a\u000f",
            "",
            "",
            ""
    ]
});

org.antlr.lang.augmentObject(DomainmodelLexer, {
    DFA9_eot:
        org.antlr.runtime.DFA.unpackEncodedString(DomainmodelLexer.DFA9_eotS),
    DFA9_eof:
        org.antlr.runtime.DFA.unpackEncodedString(DomainmodelLexer.DFA9_eofS),
    DFA9_min:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(DomainmodelLexer.DFA9_minS),
    DFA9_max:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(DomainmodelLexer.DFA9_maxS),
    DFA9_accept:
        org.antlr.runtime.DFA.unpackEncodedString(DomainmodelLexer.DFA9_acceptS),
    DFA9_special:
        org.antlr.runtime.DFA.unpackEncodedString(DomainmodelLexer.DFA9_specialS),
    DFA9_transition: (function() {
        var a = [],
            i,
            numStates = DomainmodelLexer.DFA9_transitionS.length;
        for (i=0; i<numStates; i++) {
            a.push(org.antlr.runtime.DFA.unpackEncodedString(DomainmodelLexer.DFA9_transitionS[i]));
        }
        return a;
    })()
});

DomainmodelLexer.DFA9 = function(recognizer) {
    this.recognizer = recognizer;
    this.decisionNumber = 9;
    this.eot = DomainmodelLexer.DFA9_eot;
    this.eof = DomainmodelLexer.DFA9_eof;
    this.min = DomainmodelLexer.DFA9_min;
    this.max = DomainmodelLexer.DFA9_max;
    this.accept = DomainmodelLexer.DFA9_accept;
    this.special = DomainmodelLexer.DFA9_special;
    this.transition = DomainmodelLexer.DFA9_transition;
};

org.antlr.lang.extend(DomainmodelLexer.DFA9, org.antlr.runtime.DFA, {
    getDescription: function() {
        return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | ID | STRING | COMMENT | WS | INT );";
    },
    dummy: null
});
 
})();