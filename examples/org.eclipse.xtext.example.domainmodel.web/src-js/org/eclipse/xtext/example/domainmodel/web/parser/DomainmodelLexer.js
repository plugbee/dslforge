// $ANTLR 3.3 avr. 19, 2016 01:13:22 D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g 2016-05-07 19:39:48



var DomainmodelLexer = function(input, state) {
// alternate constructor @todo
// public DomainmodelLexer(CharStream input)
// public DomainmodelLexer(CharStream input, RecognizerSharedState state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    this.dfa8 = new DomainmodelLexer.DFA8(this);
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
    T__28: 28,
    T__29: 29,
    T__30: 30,
    T__31: 31,
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
    T__28 : 28,
    T__29 : 29,
    T__30 : 30,
    T__31 : 31,
    ID : 4,
    STRING : 5,
    COMMENT : 6,
    WS : 7,
    INT : 8,
    getGrammarFileName: function() { return "D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g"; }
});
org.antlr.lang.augmentObject(DomainmodelLexer.prototype, {
    // $ANTLR start T__9
    mT__9: function()  {
        try {
            var _type = this.T__9;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:10:6: ( 'import' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:10:8: 'import'
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:11:7: ( 'package' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:11:9: 'package'
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:12:7: ( '{' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:12:9: '{'
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:13:7: ( '}' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:13:9: '}'
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:14:7: ( 'datatype' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:14:9: 'datatype'
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:15:7: ( 'entity' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:15:9: 'entity'
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:16:7: ( 'extends' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:16:9: 'extends'
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:17:7: ( ':' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:17:9: ':'
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:18:7: ( 'ref' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:18:9: 'ref'
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:19:7: ( 'opposite' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:19:9: 'opposite'
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:20:7: ( 'op' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:20:9: 'op'
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:21:7: ( '(' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:21:9: '('
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:22:7: ( ',' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:22:9: ','
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:23:7: ( ')' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:23:9: ')'
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:24:7: ( '*' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:24:9: '*'
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:25:7: ( '.' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:25:9: '.'
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:26:7: ( 'a' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:26:9: 'a'
            this.match('a'); 



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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:27:7: ( 'z' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:27:9: 'z'
            this.match('z'); 



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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:28:7: ( 'A' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:28:9: 'A'
            this.match('A'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__27",

    // $ANTLR start T__28
    mT__28: function()  {
        try {
            var _type = this.T__28;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:29:7: ( 'Z' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:29:9: 'Z'
            this.match('Z'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__28",

    // $ANTLR start T__29
    mT__29: function()  {
        try {
            var _type = this.T__29;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:30:7: ( '_' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:30:9: '_'
            this.match('_'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__29",

    // $ANTLR start T__30
    mT__30: function()  {
        try {
            var _type = this.T__30;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:31:7: ( '0' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:31:9: '0'
            this.match('0'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__30",

    // $ANTLR start T__31
    mT__31: function()  {
        try {
            var _type = this.T__31;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:32:7: ( '9' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:32:9: '9'
            this.match('9'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__31",

    // $ANTLR start STRING
    mSTRING: function()  {
        try {
            var _type = this.STRING;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:136:8: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:136:10: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:136:10: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            var alt3=2;
            var LA3_0 = this.input.LA(1);

            if ( (LA3_0=='\"') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\'') ) {
                alt3=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 3, 0, this.input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:136:11: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    this.match('\"'); 
                    // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:136:15: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop1:
                    do {
                        var alt1=3;
                        var LA1_0 = this.input.LA(1);

                        if ( (LA1_0=='\\') ) {
                            alt1=1;
                        }
                        else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                        case 1 :
                            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:136:16: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:136:61: ~ ( ( '\\\\' | '\"' ) )
                            if ( (this.input.LA(1)>='\u0000' && this.input.LA(1)<='!')||(this.input.LA(1)>='#' && this.input.LA(1)<='[')||(this.input.LA(1)>=']' && this.input.LA(1)<='\uFFFF') ) {
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

                    this.match('\"'); 


                    break;
                case 2 :
                    // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:136:81: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    this.match('\''); 
                    // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:136:86: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop2:
                    do {
                        var alt2=3;
                        var LA2_0 = this.input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                        case 1 :
                            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:136:87: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:136:132: ~ ( ( '\\\\' | '\\'' ) )
                            if ( (this.input.LA(1)>='\u0000' && this.input.LA(1)<='&')||(this.input.LA(1)>='(' && this.input.LA(1)<='[')||(this.input.LA(1)>=']' && this.input.LA(1)<='\uFFFF') ) {
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:138:9: ( ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* ) )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:138:11: ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:138:11: ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* )
            var alt6=2;
            var LA6_0 = this.input.LA(1);

            if ( (LA6_0=='/') ) {
                var LA6_1 = this.input.LA(2);

                if ( (LA6_1=='*') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='/') ) {
                    alt6=2;
                }
                else {
                    var nvae =
                        new org.antlr.runtime.NoViableAltException("", 6, 1, this.input);

                    throw nvae;
                }
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 6, 0, this.input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:138:12: '/*' ( . )* '*/'
                    this.match("/*"); 

                    // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:138:17: ( . )*
                    loop4:
                    do {
                        var alt4=2;
                        var LA4_0 = this.input.LA(1);

                        if ( (LA4_0=='*') ) {
                            var LA4_1 = this.input.LA(2);

                            if ( (LA4_1=='/') ) {
                                alt4=2;
                            }
                            else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                                alt4=1;
                            }


                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                        case 1 :
                            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:138:17: .
                            this.matchAny(); 


                            break;

                        default :
                            break loop4;
                        }
                    } while (true);

                    this.match("*/"); 



                    break;
                case 2 :
                    // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:138:27: '//' (~ ( '\\r' | '\\n' ) )*
                    this.match("//"); 

                    // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:138:32: (~ ( '\\r' | '\\n' ) )*
                    loop5:
                    do {
                        var alt5=2;
                        var LA5_0 = this.input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                        case 1 :
                            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:138:32: ~ ( '\\r' | '\\n' )
                            if ( (this.input.LA(1)>='\u0000' && this.input.LA(1)<='\t')||(this.input.LA(1)>='\u000B' && this.input.LA(1)<='\f')||(this.input.LA(1)>='\u000E' && this.input.LA(1)<='\uFFFF') ) {
                                this.input.consume();

                            }
                            else {
                                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                                this.recover(mse);
                                throw mse;}



                            break;

                        default :
                            break loop5;
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:140:3: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:140:6: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:144:4: ( ( '0' .. '9' )+ )
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:144:6: ( '0' .. '9' )+
            // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:144:6: ( '0' .. '9' )+
            var cnt7=0;
            loop7:
            do {
                var alt7=2;
                var LA7_0 = this.input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
                case 1 :
                    // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:144:7: '0' .. '9'
                    this.matchRange('0','9'); 


                    break;

                default :
                    if ( cnt7 >= 1 ) {
                        break loop7;
                    }
                        var eee = new org.antlr.runtime.EarlyExitException(7, this.input);
                        throw eee;
                }
                cnt7++;
            } while (true);




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "INT",

    mTokens: function() {
        // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | STRING | COMMENT | WS | INT )
        var alt8=27;
        alt8 = this.dfa8.predict(this.input);
        switch (alt8) {
            case 1 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:10: T__9
                this.mT__9(); 


                break;
            case 2 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:15: T__10
                this.mT__10(); 


                break;
            case 3 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:21: T__11
                this.mT__11(); 


                break;
            case 4 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:27: T__12
                this.mT__12(); 


                break;
            case 5 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:33: T__13
                this.mT__13(); 


                break;
            case 6 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:39: T__14
                this.mT__14(); 


                break;
            case 7 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:45: T__15
                this.mT__15(); 


                break;
            case 8 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:51: T__16
                this.mT__16(); 


                break;
            case 9 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:57: T__17
                this.mT__17(); 


                break;
            case 10 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:63: T__18
                this.mT__18(); 


                break;
            case 11 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:69: T__19
                this.mT__19(); 


                break;
            case 12 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:75: T__20
                this.mT__20(); 


                break;
            case 13 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:81: T__21
                this.mT__21(); 


                break;
            case 14 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:87: T__22
                this.mT__22(); 


                break;
            case 15 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:93: T__23
                this.mT__23(); 


                break;
            case 16 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:99: T__24
                this.mT__24(); 


                break;
            case 17 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:105: T__25
                this.mT__25(); 


                break;
            case 18 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:111: T__26
                this.mT__26(); 


                break;
            case 19 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:117: T__27
                this.mT__27(); 


                break;
            case 20 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:123: T__28
                this.mT__28(); 


                break;
            case 21 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:129: T__29
                this.mT__29(); 


                break;
            case 22 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:135: T__30
                this.mT__30(); 


                break;
            case 23 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:141: T__31
                this.mT__31(); 


                break;
            case 24 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:147: STRING
                this.mSTRING(); 


                break;
            case 25 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:154: COMMENT
                this.mCOMMENT(); 


                break;
            case 26 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:162: WS
                this.mWS(); 


                break;
            case 27 :
                // D:\\dev\\www\\Neon\\win32-x86_64\\runtime\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:1:165: INT
                this.mINT(); 


                break;

        }

    }

}, true); // important to pass true to overwrite default implementations

org.antlr.lang.augmentObject(DomainmodelLexer, {
    DFA8_eotS:
        "\u0014\uffff\u0001\u001d\u0001\u001e\u0006\uffff\u0001\u0020\u0004"+
    "\uffff",
    DFA8_eofS:
        "\u0021\uffff",
    DFA8_minS:
        "\u0001\u0009\u0005\uffff\u0001\u006e\u0002\uffff\u0001\u0070\u000a"+
    "\uffff\u0002\u0030\u0006\uffff\u0001\u0070\u0004\uffff",
    DFA8_maxS:
        "\u0001\u007d\u0005\uffff\u0001\u0078\u0002\uffff\u0001\u0070\u000a"+
    "\uffff\u0002\u0039\u0006\uffff\u0001\u0070\u0004\uffff",
    DFA8_acceptS:
        "\u0001\uffff\u0001\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0001"+
    "\u0005\u0001\uffff\u0001\u0008\u0001\u0009\u0001\uffff\u0001\u000c\u0001"+
    "\u000d\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001"+
    "\u0013\u0001\u0014\u0001\u0015\u0002\uffff\u0001\u0018\u0001\u0019\u0001"+
    "\u001a\u0001\u001b\u0001\u0006\u0001\u0007\u0001\uffff\u0001\u0016\u0001"+
    "\u0017\u0001\u000a\u0001\u000b",
    DFA8_specialS:
        "\u0021\uffff}>",
    DFA8_transitionS: [
            "\u0002\u0018\u0001\uffff\u0002\u0018\u0012\uffff\u0001\u0018"+
            "\u0001\uffff\u0001\u0016\u0004\uffff\u0001\u0016\u0001\u000a"+
            "\u0001\u000c\u0001\u000d\u0001\uffff\u0001\u000b\u0001\uffff"+
            "\u0001\u000e\u0001\u0017\u0001\u0014\u0008\u0019\u0001\u0015"+
            "\u0001\u0007\u0006\uffff\u0001\u0011\u0018\uffff\u0001\u0012"+
            "\u0004\uffff\u0001\u0013\u0001\uffff\u0001\u000f\u0002\uffff"+
            "\u0001\u0005\u0001\u0006\u0003\uffff\u0001\u0001\u0005\uffff"+
            "\u0001\u0009\u0001\u0002\u0001\uffff\u0001\u0008\u0007\uffff"+
            "\u0001\u0010\u0001\u0003\u0001\uffff\u0001\u0004",
            "",
            "",
            "",
            "",
            "",
            "\u0001\u001a\u0009\uffff\u0001\u001b",
            "",
            "",
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
            "\u000a\u0019",
            "\u000a\u0019",
            "",
            "",
            "",
            "",
            "",
            "",
            "\u0001\u001f",
            "",
            "",
            "",
            ""
    ]
});

org.antlr.lang.augmentObject(DomainmodelLexer, {
    DFA8_eot:
        org.antlr.runtime.DFA.unpackEncodedString(DomainmodelLexer.DFA8_eotS),
    DFA8_eof:
        org.antlr.runtime.DFA.unpackEncodedString(DomainmodelLexer.DFA8_eofS),
    DFA8_min:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(DomainmodelLexer.DFA8_minS),
    DFA8_max:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(DomainmodelLexer.DFA8_maxS),
    DFA8_accept:
        org.antlr.runtime.DFA.unpackEncodedString(DomainmodelLexer.DFA8_acceptS),
    DFA8_special:
        org.antlr.runtime.DFA.unpackEncodedString(DomainmodelLexer.DFA8_specialS),
    DFA8_transition: (function() {
        var a = [],
            i,
            numStates = DomainmodelLexer.DFA8_transitionS.length;
        for (i=0; i<numStates; i++) {
            a.push(org.antlr.runtime.DFA.unpackEncodedString(DomainmodelLexer.DFA8_transitionS[i]));
        }
        return a;
    })()
});

DomainmodelLexer.DFA8 = function(recognizer) {
    this.recognizer = recognizer;
    this.decisionNumber = 8;
    this.eot = DomainmodelLexer.DFA8_eot;
    this.eof = DomainmodelLexer.DFA8_eof;
    this.min = DomainmodelLexer.DFA8_min;
    this.max = DomainmodelLexer.DFA8_max;
    this.accept = DomainmodelLexer.DFA8_accept;
    this.special = DomainmodelLexer.DFA8_special;
    this.transition = DomainmodelLexer.DFA8_transition;
};

org.antlr.lang.extend(DomainmodelLexer.DFA8, org.antlr.runtime.DFA, {
    getDescription: function() {
        return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | STRING | COMMENT | WS | INT );";
    },
    dummy: null
});
 
})();