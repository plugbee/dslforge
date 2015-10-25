// $ANTLR 3.3 Nov 30, 2010 12:50:56 E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g 2014-11-06 15:25:53

var InternalConfLexer = function(input, state) {
// alternate constructor @todo
// public InternalConfLexer(CharStream input)
// public InternalConfLexer(CharStream input, RecognizerSharedState state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    this.dfa10 = new InternalConfLexer.DFA10(this);
    InternalConfLexer.superclass.constructor.call(this, input, state);


};

org.antlr.lang.augmentObject(InternalConfLexer, {
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
    T__27: 27,
    T__28: 28,
    T__29: 29,
    T__30: 30,
    TEXT: 4,
    ID: 5,
    INT: 6,
    WS: 7,
    COMMENT: 8,
    STRING: 9
});

(function(){
var HIDDEN = org.antlr.runtime.Token.HIDDEN_CHANNEL,
    EOF = org.antlr.runtime.Token.EOF;
org.antlr.lang.extend(InternalConfLexer, org.antlr.runtime.Lexer, {
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
    T__27 : 27,
    T__28 : 28,
    T__29 : 29,
    T__30 : 30,
    TEXT : 4,
    ID : 5,
    INT : 6,
    WS : 7,
    COMMENT : 8,
    STRING : 9,
    getGrammarFileName: function() { return "E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g"; }
});
org.antlr.lang.augmentObject(InternalConfLexer.prototype, {
    // $ANTLR start T__10
    mT__10: function()  {
        try {
            var _type = this.T__10;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:9:7: ( 'Dates' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:9:9: 'Dates'
            this.match("Dates"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:10:7: ( '[' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:10:9: '['
            this.match('['); 



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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:11:7: ( ']' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:11:9: ']'
            this.match(']'); 



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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:12:7: ( 'Description' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:12:9: 'Description'
            this.match("Description"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:13:7: ( 'Topics' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:13:9: 'Topics'
            this.match("Topics"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:14:7: ( 'ProgramCommittee' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:14:9: 'ProgramCommittee'
            this.match("ProgramCommittee"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:15:7: ( 'Organizers' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:15:9: 'Organizers'
            this.match("Organizers"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:16:7: ( 'SubmissionDetails' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:16:9: 'SubmissionDetails'
            this.match("SubmissionDetails"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:17:7: ( 'PreviousEditions' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:17:9: 'PreviousEditions'
            this.match("PreviousEditions"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:18:7: ( 'Name' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:18:9: 'Name'
            this.match("Name"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:19:7: ( 'Acronym' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:19:9: 'Acronym'
            this.match("Acronym"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:20:7: ( 'Year' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:20:9: 'Year'
            this.match("Year"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:21:7: ( 'HeldInConjuctionWith' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:21:9: 'HeldInConjuctionWith'
            this.match("HeldInConjuctionWith"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:22:7: ( 'Location' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:22:9: 'Location'
            this.match("Location"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:23:7: ( 'Web' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:23:9: 'Web'
            this.match("Web"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:24:7: ( 'Conference' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:24:9: 'Conference'
            this.match("Conference"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:25:7: ( 'Submissions' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:25:9: 'Submissions'
            this.match("Submissions"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:26:7: ( 'ExtendedSubmissions' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:26:9: 'ExtendedSubmissions'
            this.match("ExtendedSubmissions"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:27:7: ( 'Notifications' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:27:9: 'Notifications'
            this.match("Notifications"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:28:7: ( 'ExtendedNotifications' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:28:9: 'ExtendedNotifications'
            this.match("ExtendedNotifications"); 




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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:29:7: ( 'CameraReady' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:29:9: 'CameraReady'
            this.match("CameraReady"); 




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T__30",

    // $ANTLR start ID
    mID: function()  {
        try {
            var _type = this.ID;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:41:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:41:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            if ( (this.input.LA(1)>='A' && this.input.LA(1)<='Z')||this.input.LA(1)=='_'||(this.input.LA(1)>='a' && this.input.LA(1)<='z') ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}

            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:41:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                var alt1=2;
                var LA1_0 = this.input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:
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
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:43:5: ( ( '0' .. '9' )+ )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:43:7: ( '0' .. '9' )+
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:43:7: ( '0' .. '9' )+
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
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:43:8: '0' .. '9'
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

    // $ANTLR start TEXT
    mTEXT: function()  {
        try {
            var _type = this.TEXT;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:45:6: ( '{' (~ ( '{' | '}' | '[' | ']' ) )* '}' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:45:9: '{' (~ ( '{' | '}' | '[' | ']' ) )* '}'
            this.match('{'); 
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:45:13: (~ ( '{' | '}' | '[' | ']' ) )*
            loop3:
            do {
                var alt3=2;
                var LA3_0 = this.input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='Z')||LA3_0=='\\'||(LA3_0>='^' && LA3_0<='z')||LA3_0=='|'||(LA3_0>='~' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
                case 1 :
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:45:14: ~ ( '{' | '}' | '[' | ']' )
                    if ( (this.input.LA(1)>='\u0000' && this.input.LA(1)<='Z')||this.input.LA(1)=='\\'||(this.input.LA(1)>='^' && this.input.LA(1)<='z')||this.input.LA(1)=='|'||(this.input.LA(1)>='~' && this.input.LA(1)<='\uFFFF') ) {
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

            this.match('}'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "TEXT",

    // $ANTLR start WS
    mWS: function()  {
        try {
            var _type = this.WS;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:47:3: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:47:6: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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

    // $ANTLR start COMMENT
    mCOMMENT: function()  {
        try {
            var _type = this.COMMENT;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:49:9: ( ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* ) )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:49:11: ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:49:11: ( '/*' ( . )* '*/' | '//' (~ ( '\\r' | '\\n' ) )* )
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
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:49:12: '/*' ( . )* '*/'
                    this.match("/*"); 

                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:49:17: ( . )*
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
                            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:49:17: .
                            this.matchAny(); 


                            break;

                        default :
                            break loop4;
                        }
                    } while (true);

                    this.match("*/"); 



                    break;
                case 2 :
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:49:27: '//' (~ ( '\\r' | '\\n' ) )*
                    this.match("//"); 

                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:49:32: (~ ( '\\r' | '\\n' ) )*
                    loop5:
                    do {
                        var alt5=2;
                        var LA5_0 = this.input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                        case 1 :
                            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:49:32: ~ ( '\\r' | '\\n' )
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

    // $ANTLR start STRING
    mSTRING: function()  {
        try {
            var _type = this.STRING;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:51:8: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:51:10: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:51:10: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            var alt9=2;
            var LA9_0 = this.input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 9, 0, this.input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:51:11: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    this.match('\"'); 
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:51:15: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        var alt7=3;
                        var LA7_0 = this.input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                        case 1 :
                            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:51:16: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:51:61: ~ ( ( '\\\\' | '\"' ) )
                            if ( (this.input.LA(1)>='\u0000' && this.input.LA(1)<='!')||(this.input.LA(1)>='#' && this.input.LA(1)<='[')||(this.input.LA(1)>=']' && this.input.LA(1)<='\uFFFF') ) {
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

                    this.match('\"'); 


                    break;
                case 2 :
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:51:81: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    this.match('\''); 
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:51:86: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        var alt8=3;
                        var LA8_0 = this.input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                        case 1 :
                            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:51:87: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:51:132: ~ ( ( '\\\\' | '\\'' ) )
                            if ( (this.input.LA(1)>='\u0000' && this.input.LA(1)<='&')||(this.input.LA(1)>='(' && this.input.LA(1)<='[')||(this.input.LA(1)>=']' && this.input.LA(1)<='\uFFFF') ) {
                                this.input.consume();

                            }
                            else {
                                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                                this.recover(mse);
                                throw mse;}



                            break;

                        default :
                            break loop8;
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

    mTokens: function() {
        // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | ID | INT | TEXT | WS | COMMENT | STRING )
        var alt10=27;
        alt10 = this.dfa10.predict(this.input);
        switch (alt10) {
            case 1 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:10: T__10
                this.mT__10(); 


                break;
            case 2 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:16: T__11
                this.mT__11(); 


                break;
            case 3 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:22: T__12
                this.mT__12(); 


                break;
            case 4 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:28: T__13
                this.mT__13(); 


                break;
            case 5 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:34: T__14
                this.mT__14(); 


                break;
            case 6 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:40: T__15
                this.mT__15(); 


                break;
            case 7 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:46: T__16
                this.mT__16(); 


                break;
            case 8 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:52: T__17
                this.mT__17(); 


                break;
            case 9 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:58: T__18
                this.mT__18(); 


                break;
            case 10 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:64: T__19
                this.mT__19(); 


                break;
            case 11 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:70: T__20
                this.mT__20(); 


                break;
            case 12 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:76: T__21
                this.mT__21(); 


                break;
            case 13 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:82: T__22
                this.mT__22(); 


                break;
            case 14 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:88: T__23
                this.mT__23(); 


                break;
            case 15 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:94: T__24
                this.mT__24(); 


                break;
            case 16 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:100: T__25
                this.mT__25(); 


                break;
            case 17 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:106: T__26
                this.mT__26(); 


                break;
            case 18 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:112: T__27
                this.mT__27(); 


                break;
            case 19 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:118: T__28
                this.mT__28(); 


                break;
            case 20 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:124: T__29
                this.mT__29(); 


                break;
            case 21 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:130: T__30
                this.mT__30(); 


                break;
            case 22 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:136: ID
                this.mID(); 


                break;
            case 23 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:139: INT
                this.mINT(); 


                break;
            case 24 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:143: TEXT
                this.mTEXT(); 


                break;
            case 25 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:148: WS
                this.mWS(); 


                break;
            case 26 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:151: COMMENT
                this.mCOMMENT(); 


                break;
            case 27 :
                // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:1:159: STRING
                this.mSTRING(); 


                break;

        }

    }

}, true); // important to pass true to overwrite default implementations

org.antlr.lang.augmentObject(InternalConfLexer, {
    DFA10_eotS:
        "\u0001\uffff\u0001\u0010\u0002\uffff\u000c\u0010\u0006\uffff\u001d"+
    "\u0010\u0001\u0044\u000a\u0010\u0001\u004f\u0002\u0010\u0001\u0052\u0002"+
    "\u0010\u0001\uffff\u0003\u0010\u0001\u0058\u0006\u0010\u0001\uffff\u0002"+
    "\u0010\u0001\uffff\u0005\u0010\u0001\uffff\u0001\u0010\u0001\u0067\u000c"+
    "\u0010\u0001\uffff\u0005\u0010\u0001\u0079\u000b\u0010\u0001\uffff\u0001"+
    "\u0010\u0001\u0086\u000a\u0010\u0001\uffff\u0007\u0010\u0001\u0099\u0003"+
    "\u0010\u0001\u009e\u0003\u0010\u0001\u00a2\u0002\u0010\u0001\uffff\u0001"+
    "\u0010\u0001\u00a6\u0002\u0010\u0001\uffff\u0001\u00a9\u0002\u0010\u0001"+
    "\uffff\u0003\u0010\u0001\uffff\u0002\u0010\u0001\uffff\u0005\u0010\u0001"+
    "\u00b6\u0006\u0010\u0001\uffff\u0009\u0010\u0001\u00c6\u0001\u00c7\u0004"+
    "\u0010\u0002\uffff\u0001\u00cc\u0003\u0010\u0001\uffff\u0004\u0010\u0001"+
    "\u00d4\u0001\u0010\u0001\u00d6\u0001\uffff\u0001\u0010\u0001\uffff\u0001"+
    "\u00d8\u0001\uffff",
    DFA10_eofS:
        "\u00d9\uffff",
    DFA10_minS:
        "\u0001\u0009\u0001\u0061\u0002\uffff\u0001\u006f\u0002\u0072\u0001"+
    "\u0075\u0001\u0061\u0001\u0063\u0002\u0065\u0001\u006f\u0001\u0065\u0001"+
    "\u0061\u0001\u0078\u0006\uffff\u0001\u0074\u0001\u0073\u0001\u0070\u0001"+
    "\u0065\u0001\u0067\u0001\u0062\u0001\u006d\u0001\u0074\u0001\u0072\u0001"+
    "\u0061\u0001\u006c\u0001\u0063\u0001\u0062\u0001\u006e\u0001\u006d\u0001"+
    "\u0074\u0001\u0065\u0001\u0063\u0001\u0069\u0001\u0067\u0001\u0076\u0001"+
    "\u0061\u0001\u006d\u0001\u0065\u0001\u0069\u0001\u006f\u0001\u0072\u0001"+
    "\u0064\u0001\u0061\u0001\u0030\u0001\u0066\u0002\u0065\u0001\u0073\u0001"+
    "\u0072\u0001\u0063\u0001\u0072\u0001\u0069\u0001\u006e\u0001\u0069\u0001"+
    "\u0030\u0001\u0066\u0001\u006e\u0001\u0030\u0001\u0049\u0001\u0074\u0001"+
    "\uffff\u0001\u0065\u0001\u0072\u0001\u006e\u0001\u0030\u0001\u0069\u0001"+
    "\u0073\u0001\u0061\u0001\u006f\u0001\u0069\u0001\u0073\u0001\uffff\u0001"+
    "\u0069\u0001\u0079\u0001\uffff\u0001\u006e\u0001\u0069\u0001\u0072\u0001"+
    "\u0061\u0001\u0064\u0001\uffff\u0001\u0070\u0001\u0030\u0001\u006d\u0001"+
    "\u0075\u0001\u007a\u0001\u0073\u0001\u0063\u0001\u006d\u0001\u0043\u0001"+
    "\u006f\u0001\u0065\u0001\u0052\u0001\u0065\u0001\u0074\u0001\uffff\u0001"+
    "\u0043\u0001\u0073\u0001\u0065\u0001\u0069\u0001\u0061\u0001\u0030\u0001"+
    "\u006f\u0002\u006e\u0001\u0065\u0001\u0064\u0001\u0069\u0001\u006f\u0001"+
    "\u0045\u0001\u0072\u0001\u006f\u0001\u0074\u0001\uffff\u0001\u006e\u0001"+
    "\u0030\u0001\u0063\u0001\u0061\u0001\u004e\u0001\u006f\u0001\u006d\u0001"+
    "\u0064\u0001\u0073\u0001\u006e\u0001\u0069\u0001\u006a\u0001\uffff\u0001"+
    "\u0065\u0001\u0064\u0001\u0075\u0001\u006f\u0001\u006e\u0001\u006d\u0001"+
    "\u0069\u0001\u0030\u0001\u0044\u0001\u006f\u0001\u0075\u0001\u0030\u0001"+
    "\u0079\u0001\u0062\u0001\u0074\u0001\u0030\u0001\u0069\u0001\u0074\u0001"+
    "\uffff\u0001\u0065\u0001\u0030\u0001\u006e\u0001\u0063\u0001\uffff\u0001"+
    "\u0030\u0001\u006d\u0001\u0069\u0001\uffff\u0001\u0074\u0001\u0069\u0001"+
    "\u0074\u0001\uffff\u0001\u0073\u0001\u0074\u0001\uffff\u0001\u0069\u0001"+
    "\u0066\u0001\u0074\u0001\u006f\u0001\u0061\u0001\u0030\u0001\u0069\u0001"+
    "\u0073\u0001\u0069\u0001\u0065\u0001\u006e\u0001\u0069\u0001\uffff\u0001"+
    "\u006f\u0001\u0073\u0001\u0063\u0001\u0065\u0001\u0073\u0001\u006c\u0001"+
    "\u006e\u0001\u0069\u0001\u0061\u0002\u0030\u0001\u0073\u0001\u0057\u0001"+
    "\u006f\u0001\u0074\u0002\uffff\u0001\u0030\u0001\u0069\u0001\u006e\u0001"+
    "\u0069\u0001\uffff\u0001\u0074\u0001\u0073\u0001\u006f\u0001\u0068\u0001"+
    "\u0030\u0001\u006e\u0001\u0030\u0001\uffff\u0001\u0073\u0001\uffff\u0001"+
    "\u0030\u0001\uffff",
    DFA10_maxS:
        "\u0001\u007b\u0001\u0065\u0002\uffff\u0001\u006f\u0002\u0072\u0001"+
    "\u0075\u0001\u006f\u0001\u0063\u0002\u0065\u0001\u006f\u0001\u0065\u0001"+
    "\u006f\u0001\u0078\u0006\uffff\u0001\u0074\u0001\u0073\u0001\u0070\u0001"+
    "\u006f\u0001\u0067\u0001\u0062\u0001\u006d\u0001\u0074\u0001\u0072\u0001"+
    "\u0061\u0001\u006c\u0001\u0063\u0001\u0062\u0001\u006e\u0001\u006d\u0001"+
    "\u0074\u0001\u0065\u0001\u0063\u0001\u0069\u0001\u0067\u0001\u0076\u0001"+
    "\u0061\u0001\u006d\u0001\u0065\u0001\u0069\u0001\u006f\u0001\u0072\u0001"+
    "\u0064\u0001\u0061\u0001\u007a\u0001\u0066\u0002\u0065\u0001\u0073\u0001"+
    "\u0072\u0001\u0063\u0001\u0072\u0001\u0069\u0001\u006e\u0001\u0069\u0001"+
    "\u007a\u0001\u0066\u0001\u006e\u0001\u007a\u0001\u0049\u0001\u0074\u0001"+
    "\uffff\u0001\u0065\u0001\u0072\u0001\u006e\u0001\u007a\u0001\u0069\u0001"+
    "\u0073\u0001\u0061\u0001\u006f\u0001\u0069\u0001\u0073\u0001\uffff\u0001"+
    "\u0069\u0001\u0079\u0001\uffff\u0001\u006e\u0001\u0069\u0001\u0072\u0001"+
    "\u0061\u0001\u0064\u0001\uffff\u0001\u0070\u0001\u007a\u0001\u006d\u0001"+
    "\u0075\u0001\u007a\u0001\u0073\u0001\u0063\u0001\u006d\u0001\u0043\u0001"+
    "\u006f\u0001\u0065\u0001\u0052\u0001\u0065\u0001\u0074\u0001\uffff\u0001"+
    "\u0043\u0001\u0073\u0001\u0065\u0001\u0069\u0001\u0061\u0001\u007a\u0001"+
    "\u006f\u0002\u006e\u0001\u0065\u0001\u0064\u0001\u0069\u0001\u006f\u0001"+
    "\u0045\u0001\u0072\u0001\u006f\u0001\u0074\u0001\uffff\u0001\u006e\u0001"+
    "\u007a\u0001\u0063\u0001\u0061\u0001\u0053\u0001\u006f\u0001\u006d\u0001"+
    "\u0064\u0001\u0073\u0001\u006e\u0001\u0069\u0001\u006a\u0001\uffff\u0001"+
    "\u0065\u0001\u0064\u0001\u0075\u0001\u006f\u0001\u006e\u0001\u006d\u0001"+
    "\u0069\u0001\u007a\u0001\u0073\u0001\u006f\u0001\u0075\u0001\u007a\u0001"+
    "\u0079\u0001\u0062\u0001\u0074\u0001\u007a\u0001\u0069\u0001\u0074\u0001"+
    "\uffff\u0001\u0065\u0001\u007a\u0001\u006e\u0001\u0063\u0001\uffff\u0001"+
    "\u007a\u0001\u006d\u0001\u0069\u0001\uffff\u0001\u0074\u0001\u0069\u0001"+
    "\u0074\u0001\uffff\u0001\u0073\u0001\u0074\u0001\uffff\u0001\u0069\u0001"+
    "\u0066\u0001\u0074\u0001\u006f\u0001\u0061\u0001\u007a\u0001\u0069\u0001"+
    "\u0073\u0001\u0069\u0001\u0065\u0001\u006e\u0001\u0069\u0001\uffff\u0001"+
    "\u006f\u0001\u0073\u0001\u0063\u0001\u0065\u0001\u0073\u0001\u006c\u0001"+
    "\u006e\u0001\u0069\u0001\u0061\u0002\u007a\u0001\u0073\u0001\u0057\u0001"+
    "\u006f\u0001\u0074\u0002\uffff\u0001\u007a\u0001\u0069\u0001\u006e\u0001"+
    "\u0069\u0001\uffff\u0001\u0074\u0001\u0073\u0001\u006f\u0001\u0068\u0001"+
    "\u007a\u0001\u006e\u0001\u007a\u0001\uffff\u0001\u0073\u0001\uffff\u0001"+
    "\u007a\u0001\uffff",
    DFA10_acceptS:
        "\u0002\uffff\u0001\u0002\u0001\u0003\u000c\uffff\u0001\u0016\u0001"+
    "\u0017\u0001\u0018\u0001\u0019\u0001\u001a\u0001\u001b\u002e\uffff\u0001"+
    "\u000f\u000a\uffff\u0001\u000a\u0002\uffff\u0001\u000c\u0005\uffff\u0001"+
    "\u0001\u000e\uffff\u0001\u0005\u0011\uffff\u0001\u000b\u000c\uffff\u0001"+
    "\u000e\u0012\uffff\u0001\u0007\u0004\uffff\u0001\u0010\u0003\uffff\u0001"+
    "\u0004\u0003\uffff\u0001\u0011\u0002\uffff\u0001\u0015\u000c\uffff\u0001"+
    "\u0013\u000f\uffff\u0001\u0006\u0001\u0009\u0004\uffff\u0001\u0008\u0007"+
    "\uffff\u0001\u0012\u0001\uffff\u0001\u000d\u0001\uffff\u0001\u0014",
    DFA10_specialS:
        "\u00d9\uffff}>",
    DFA10_transitionS: [
            "\u0002\u0013\u0001\uffff\u0002\u0013\u0012\uffff\u0001\u0013"+
            "\u0001\uffff\u0001\u0015\u0004\uffff\u0001\u0015\u0007\uffff"+
            "\u0001\u0014\u000a\u0011\u0007\uffff\u0001\u0009\u0001\u0010"+
            "\u0001\u000e\u0001\u0001\u0001\u000f\u0002\u0010\u0001\u000b"+
            "\u0003\u0010\u0001\u000c\u0001\u0010\u0001\u0008\u0001\u0006"+
            "\u0001\u0005\u0002\u0010\u0001\u0007\u0001\u0004\u0002\u0010"+
            "\u0001\u000d\u0001\u0010\u0001\u000a\u0001\u0010\u0001\u0002"+
            "\u0001\uffff\u0001\u0003\u0001\uffff\u0001\u0010\u0001\uffff"+
            "\u001a\u0010\u0001\u0012",
            "\u0001\u0016\u0003\uffff\u0001\u0017",
            "",
            "",
            "\u0001\u0018",
            "\u0001\u0019",
            "\u0001\u001a",
            "\u0001\u001b",
            "\u0001\u001c\u000d\uffff\u0001\u001d",
            "\u0001\u001e",
            "\u0001\u001f",
            "\u0001\u0020",
            "\u0001\u0021",
            "\u0001\u0022",
            "\u0001\u0024\u000d\uffff\u0001\u0023",
            "\u0001\u0025",
            "",
            "",
            "",
            "",
            "",
            "",
            "\u0001\u0026",
            "\u0001\u0027",
            "\u0001\u0028",
            "\u0001\u002a\u0009\uffff\u0001\u0029",
            "\u0001\u002b",
            "\u0001\u002c",
            "\u0001\u002d",
            "\u0001\u002e",
            "\u0001\u002f",
            "\u0001\u0030",
            "\u0001\u0031",
            "\u0001\u0032",
            "\u0001\u0033",
            "\u0001\u0034",
            "\u0001\u0035",
            "\u0001\u0036",
            "\u0001\u0037",
            "\u0001\u0038",
            "\u0001\u0039",
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
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u0045",
            "\u0001\u0046",
            "\u0001\u0047",
            "\u0001\u0048",
            "\u0001\u0049",
            "\u0001\u004a",
            "\u0001\u004b",
            "\u0001\u004c",
            "\u0001\u004d",
            "\u0001\u004e",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u0050",
            "\u0001\u0051",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u0053",
            "\u0001\u0054",
            "",
            "\u0001\u0055",
            "\u0001\u0056",
            "\u0001\u0057",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u0059",
            "\u0001\u005a",
            "\u0001\u005b",
            "\u0001\u005c",
            "\u0001\u005d",
            "\u0001\u005e",
            "",
            "\u0001\u005f",
            "\u0001\u0060",
            "",
            "\u0001\u0061",
            "\u0001\u0062",
            "\u0001\u0063",
            "\u0001\u0064",
            "\u0001\u0065",
            "",
            "\u0001\u0066",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u0068",
            "\u0001\u0069",
            "\u0001\u006a",
            "\u0001\u006b",
            "\u0001\u006c",
            "\u0001\u006d",
            "\u0001\u006e",
            "\u0001\u006f",
            "\u0001\u0070",
            "\u0001\u0071",
            "\u0001\u0072",
            "\u0001\u0073",
            "",
            "\u0001\u0074",
            "\u0001\u0075",
            "\u0001\u0076",
            "\u0001\u0077",
            "\u0001\u0078",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u007a",
            "\u0001\u007b",
            "\u0001\u007c",
            "\u0001\u007d",
            "\u0001\u007e",
            "\u0001\u007f",
            "\u0001\u0080",
            "\u0001\u0081",
            "\u0001\u0082",
            "\u0001\u0083",
            "\u0001\u0084",
            "",
            "\u0001\u0085",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u0087",
            "\u0001\u0088",
            "\u0001\u008a\u0004\uffff\u0001\u0089",
            "\u0001\u008b",
            "\u0001\u008c",
            "\u0001\u008d",
            "\u0001\u008e",
            "\u0001\u008f",
            "\u0001\u0090",
            "\u0001\u0091",
            "",
            "\u0001\u0092",
            "\u0001\u0093",
            "\u0001\u0094",
            "\u0001\u0095",
            "\u0001\u0096",
            "\u0001\u0097",
            "\u0001\u0098",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u009a\u002e\uffff\u0001\u009b",
            "\u0001\u009c",
            "\u0001\u009d",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u009f",
            "\u0001\u00a0",
            "\u0001\u00a1",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u00a3",
            "\u0001\u00a4",
            "",
            "\u0001\u00a5",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u00a7",
            "\u0001\u00a8",
            "",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u00aa",
            "\u0001\u00ab",
            "",
            "\u0001\u00ac",
            "\u0001\u00ad",
            "\u0001\u00ae",
            "",
            "\u0001\u00af",
            "\u0001\u00b0",
            "",
            "\u0001\u00b1",
            "\u0001\u00b2",
            "\u0001\u00b3",
            "\u0001\u00b4",
            "\u0001\u00b5",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u00b7",
            "\u0001\u00b8",
            "\u0001\u00b9",
            "\u0001\u00ba",
            "\u0001\u00bb",
            "\u0001\u00bc",
            "",
            "\u0001\u00bd",
            "\u0001\u00be",
            "\u0001\u00bf",
            "\u0001\u00c0",
            "\u0001\u00c1",
            "\u0001\u00c2",
            "\u0001\u00c3",
            "\u0001\u00c4",
            "\u0001\u00c5",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u00c8",
            "\u0001\u00c9",
            "\u0001\u00ca",
            "\u0001\u00cb",
            "",
            "",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u00cd",
            "\u0001\u00ce",
            "\u0001\u00cf",
            "",
            "\u0001\u00d0",
            "\u0001\u00d1",
            "\u0001\u00d2",
            "\u0001\u00d3",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "\u0001\u00d5",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            "",
            "\u0001\u00d7",
            "",
            "\u000a\u0010\u0007\uffff\u001a\u0010\u0004\uffff\u0001\u0010"+
            "\u0001\uffff\u001a\u0010",
            ""
    ]
});

org.antlr.lang.augmentObject(InternalConfLexer, {
    DFA10_eot:
        org.antlr.runtime.DFA.unpackEncodedString(InternalConfLexer.DFA10_eotS),
    DFA10_eof:
        org.antlr.runtime.DFA.unpackEncodedString(InternalConfLexer.DFA10_eofS),
    DFA10_min:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(InternalConfLexer.DFA10_minS),
    DFA10_max:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(InternalConfLexer.DFA10_maxS),
    DFA10_accept:
        org.antlr.runtime.DFA.unpackEncodedString(InternalConfLexer.DFA10_acceptS),
    DFA10_special:
        org.antlr.runtime.DFA.unpackEncodedString(InternalConfLexer.DFA10_specialS),
    DFA10_transition: (function() {
        var a = [],
            i,
            numStates = InternalConfLexer.DFA10_transitionS.length;
        for (i=0; i<numStates; i++) {
            a.push(org.antlr.runtime.DFA.unpackEncodedString(InternalConfLexer.DFA10_transitionS[i]));
        }
        return a;
    })()
});

InternalConfLexer.DFA10 = function(recognizer) {
    this.recognizer = recognizer;
    this.decisionNumber = 10;
    this.eot = InternalConfLexer.DFA10_eot;
    this.eof = InternalConfLexer.DFA10_eof;
    this.min = InternalConfLexer.DFA10_min;
    this.max = InternalConfLexer.DFA10_max;
    this.accept = InternalConfLexer.DFA10_accept;
    this.special = InternalConfLexer.DFA10_special;
    this.transition = InternalConfLexer.DFA10_transition;
};

org.antlr.lang.extend(InternalConfLexer.DFA10, org.antlr.runtime.DFA, {
    getDescription: function() {
        return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | ID | INT | TEXT | WS | COMMENT | STRING );";
    },
    dummy: null
});
 
})();