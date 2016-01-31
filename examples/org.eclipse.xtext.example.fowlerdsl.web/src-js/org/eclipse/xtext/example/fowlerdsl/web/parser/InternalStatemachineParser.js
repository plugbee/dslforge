// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g 2016-01-30 22:40:11



var InternalStatemachineParser = function(input, state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    InternalStatemachineParser.superclass.constructor.call(this, input, state);


         

    /* @todo only create adaptor if output=AST */
    this.adaptor = new org.antlr.runtime.tree.CommonTreeAdaptor();

};

org.antlr.lang.augmentObject(InternalStatemachineParser, {
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
    ID: 4,
    STRING: 5,
    COMMENT: 6,
    WS: 7,
    INT: 8
});

(function(){
// public class variables
var EOF= -1,
    T__9= 9,
    T__10= 10,
    T__11= 11,
    T__12= 12,
    T__13= 13,
    T__14= 14,
    T__15= 15,
    T__16= 16,
    T__17= 17,
    ID= 4,
    STRING= 5,
    COMMENT= 6,
    WS= 7,
    INT= 8;

// public instance methods/vars
org.antlr.lang.extend(InternalStatemachineParser, org.antlr.runtime.Parser, {
        
    setTreeAdaptor: function(adaptor) {
        this.adaptor = adaptor;
    },
    getTreeAdaptor: function() {
        return this.adaptor;
    },

    getTokenNames: function() { return InternalStatemachineParser.tokenNames; },
    getGrammarFileName: function() { return "D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g"; }
});
org.antlr.lang.augmentObject(InternalStatemachineParser.prototype, {

    // inline static return class
    rule_Statemachine_return: (function() {
        InternalStatemachineParser.rule_Statemachine_return = function(){};
        org.antlr.lang.extend(InternalStatemachineParser.rule_Statemachine_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:18:1: rule_Statemachine returns [Stemachine] : ( 'events' (events+= rule_Event )+ 'end' )? ( 'resetEvents' (resetevents+= ID )+ 'end' )? ( 'commands' (commands+= rule_Command )+ 'end' )? (states+= rule_State )* EOF ;
    // $ANTLR start "rule_Statemachine"
    rule_Statemachine: function() {
        var retval = new InternalStatemachineParser.rule_Statemachine_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var string_literal1 = null;
        var string_literal2 = null;
        var string_literal3 = null;
        var string_literal4 = null;
        var string_literal5 = null;
        var string_literal6 = null;
        var EOF7 = null;
        var resetevents = null;
        var list_resetevents=null;
        var list_events=null;
        var list_commands=null;
        var list_states=null;
        var events = null;
        var commands = null;
        var states = null;
        var string_literal1_tree=null;
        var string_literal2_tree=null;
        var string_literal3_tree=null;
        var string_literal4_tree=null;
        var string_literal5_tree=null;
        var string_literal6_tree=null;
        var EOF7_tree=null;
        var resetevents_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:18:39: ( ( 'events' (events+= rule_Event )+ 'end' )? ( 'resetEvents' (resetevents+= ID )+ 'end' )? ( 'commands' (commands+= rule_Command )+ 'end' )? (states+= rule_State )* EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:19:2: ( 'events' (events+= rule_Event )+ 'end' )? ( 'resetEvents' (resetevents+= ID )+ 'end' )? ( 'commands' (commands+= rule_Command )+ 'end' )? (states+= rule_State )* EOF
            root_0 = this.adaptor.nil();

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:19:2: ( 'events' (events+= rule_Event )+ 'end' )?
            var alt2=2;
            var LA2_0 = this.input.LA(1);

            if ( (LA2_0==9) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:19:3: 'events' (events+= rule_Event )+ 'end'
                    string_literal1=this.match(this.input,9,InternalStatemachineParser.FOLLOW_9_in_rule_Statemachine69); 
                    string_literal1_tree = this.adaptor.create(string_literal1);
                    this.adaptor.addChild(root_0, string_literal1_tree);

                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:20:9: (events+= rule_Event )+
                    var cnt1=0;
                    loop1:
                    do {
                        var alt1=2;
                        var LA1_0 = this.input.LA(1);

                        if ( (LA1_0==ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:20:9: events+= rule_Event
                            this.pushFollow(InternalStatemachineParser.FOLLOW_rule_Event_in_rule_Statemachine76);
                            events=this.rule_Event();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, events.getTree());
                            if (org.antlr.lang.isNull(list_events)) list_events = [];
                            list_events.push(events.getTree());



                            break;

                        default :
                            if ( cnt1 >= 1 ) {
                                break loop1;
                            }
                                var eee = new org.antlr.runtime.EarlyExitException(1, this.input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    string_literal2=this.match(this.input,10,InternalStatemachineParser.FOLLOW_10_in_rule_Statemachine81); 
                    string_literal2_tree = this.adaptor.create(string_literal2);
                    this.adaptor.addChild(root_0, string_literal2_tree);



                    break;

            }

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:21:10: ( 'resetEvents' (resetevents+= ID )+ 'end' )?
            var alt4=2;
            var LA4_0 = this.input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:21:11: 'resetEvents' (resetevents+= ID )+ 'end'
                    string_literal3=this.match(this.input,11,InternalStatemachineParser.FOLLOW_11_in_rule_Statemachine86); 
                    string_literal3_tree = this.adaptor.create(string_literal3);
                    this.adaptor.addChild(root_0, string_literal3_tree);

                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:22:14: (resetevents+= ID )+
                    var cnt3=0;
                    loop3:
                    do {
                        var alt3=2;
                        var LA3_0 = this.input.LA(1);

                        if ( (LA3_0==ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:22:14: resetevents+= ID
                            resetevents=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_Statemachine93); 
                            resetevents_tree = this.adaptor.create(resetevents);
                            this.adaptor.addChild(root_0, resetevents_tree);

                            if (org.antlr.lang.isNull(list_resetevents)) list_resetevents = [];
                            list_resetevents.push(resetevents);



                            break;

                        default :
                            if ( cnt3 >= 1 ) {
                                break loop3;
                            }
                                var eee = new org.antlr.runtime.EarlyExitException(3, this.input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    string_literal4=this.match(this.input,10,InternalStatemachineParser.FOLLOW_10_in_rule_Statemachine98); 
                    string_literal4_tree = this.adaptor.create(string_literal4);
                    this.adaptor.addChild(root_0, string_literal4_tree);



                    break;

            }

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:23:10: ( 'commands' (commands+= rule_Command )+ 'end' )?
            var alt6=2;
            var LA6_0 = this.input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:23:11: 'commands' (commands+= rule_Command )+ 'end'
                    string_literal5=this.match(this.input,12,InternalStatemachineParser.FOLLOW_12_in_rule_Statemachine103); 
                    string_literal5_tree = this.adaptor.create(string_literal5);
                    this.adaptor.addChild(root_0, string_literal5_tree);

                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:24:11: (commands+= rule_Command )+
                    var cnt5=0;
                    loop5:
                    do {
                        var alt5=2;
                        var LA5_0 = this.input.LA(1);

                        if ( (LA5_0==ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:24:11: commands+= rule_Command
                            this.pushFollow(InternalStatemachineParser.FOLLOW_rule_Command_in_rule_Statemachine110);
                            commands=this.rule_Command();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, commands.getTree());
                            if (org.antlr.lang.isNull(list_commands)) list_commands = [];
                            list_commands.push(commands.getTree());



                            break;

                        default :
                            if ( cnt5 >= 1 ) {
                                break loop5;
                            }
                                var eee = new org.antlr.runtime.EarlyExitException(5, this.input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    string_literal6=this.match(this.input,10,InternalStatemachineParser.FOLLOW_10_in_rule_Statemachine115); 
                    string_literal6_tree = this.adaptor.create(string_literal6);
                    this.adaptor.addChild(root_0, string_literal6_tree);



                    break;

            }

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:25:16: (states+= rule_State )*
            loop7:
            do {
                var alt7=2;
                var LA7_0 = this.input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:25:16: states+= rule_State
                    this.pushFollow(InternalStatemachineParser.FOLLOW_rule_State_in_rule_Statemachine121);
                    states=this.rule_State();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, states.getTree());
                    if (org.antlr.lang.isNull(list_states)) list_states = [];
                    list_states.push(states.getTree());



                    break;

                default :
                    break loop7;
                }
            } while (true);

            EOF7=this.match(this.input,EOF,InternalStatemachineParser.FOLLOW_EOF_in_rule_Statemachine125); 



            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    rule_Event_return: (function() {
        InternalStatemachineParser.rule_Event_return = function(){};
        org.antlr.lang.extend(InternalStatemachineParser.rule_Event_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:29:1: rule_Event returns [Event] : name= ID code= ID ;
    // $ANTLR start "rule_Event"
    rule_Event: function() {
        var retval = new InternalStatemachineParser.rule_Event_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var code = null;

        var name_tree=null;
        var code_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:29:27: (name= ID code= ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:30:2: name= ID code= ID
            root_0 = this.adaptor.nil();

            name=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_Event141); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            code=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_Event145); 
            code_tree = this.adaptor.create(code);
            this.adaptor.addChild(root_0, code_tree);




            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    rule_Command_return: (function() {
        InternalStatemachineParser.rule_Command_return = function(){};
        org.antlr.lang.extend(InternalStatemachineParser.rule_Command_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:34:1: rule_Command returns [Command] : name= ID code= ID ;
    // $ANTLR start "rule_Command"
    rule_Command: function() {
        var retval = new InternalStatemachineParser.rule_Command_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var code = null;

        var name_tree=null;
        var code_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:34:31: (name= ID code= ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:35:2: name= ID code= ID
            root_0 = this.adaptor.nil();

            name=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_Command161); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            code=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_Command165); 
            code_tree = this.adaptor.create(code);
            this.adaptor.addChild(root_0, code_tree);




            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    rule_State_return: (function() {
        InternalStatemachineParser.rule_State_return = function(){};
        org.antlr.lang.extend(InternalStatemachineParser.rule_State_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:39:1: rule_State returns [State] : 'state' name= ID ( 'actions' '{' (actions+= ID )+ '}' )? (transitions+= rule_Transition )* 'end' ;
    // $ANTLR start "rule_State"
    rule_State: function() {
        var retval = new InternalStatemachineParser.rule_State_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var string_literal8 = null;
        var string_literal9 = null;
        var char_literal10 = null;
        var char_literal11 = null;
        var string_literal12 = null;
        var actions = null;
        var list_actions=null;
        var list_transitions=null;
        var transitions = null;
        var name_tree=null;
        var string_literal8_tree=null;
        var string_literal9_tree=null;
        var char_literal10_tree=null;
        var char_literal11_tree=null;
        var string_literal12_tree=null;
        var actions_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:39:27: ( 'state' name= ID ( 'actions' '{' (actions+= ID )+ '}' )? (transitions+= rule_Transition )* 'end' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:40:2: 'state' name= ID ( 'actions' '{' (actions+= ID )+ '}' )? (transitions+= rule_Transition )* 'end'
            root_0 = this.adaptor.nil();

            string_literal8=this.match(this.input,13,InternalStatemachineParser.FOLLOW_13_in_rule_State179); 
            string_literal8_tree = this.adaptor.create(string_literal8);
            this.adaptor.addChild(root_0, string_literal8_tree);

            name=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_State183); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:40:18: ( 'actions' '{' (actions+= ID )+ '}' )?
            var alt9=2;
            var LA9_0 = this.input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:40:19: 'actions' '{' (actions+= ID )+ '}'
                    string_literal9=this.match(this.input,14,InternalStatemachineParser.FOLLOW_14_in_rule_State186); 
                    string_literal9_tree = this.adaptor.create(string_literal9);
                    this.adaptor.addChild(root_0, string_literal9_tree);

                    char_literal10=this.match(this.input,15,InternalStatemachineParser.FOLLOW_15_in_rule_State188); 
                    char_literal10_tree = this.adaptor.create(char_literal10);
                    this.adaptor.addChild(root_0, char_literal10_tree);

                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:40:40: (actions+= ID )+
                    var cnt8=0;
                    loop8:
                    do {
                        var alt8=2;
                        var LA8_0 = this.input.LA(1);

                        if ( (LA8_0==ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:40:40: actions+= ID
                            actions=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_State192); 
                            actions_tree = this.adaptor.create(actions);
                            this.adaptor.addChild(root_0, actions_tree);

                            if (org.antlr.lang.isNull(list_actions)) list_actions = [];
                            list_actions.push(actions);



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

                    char_literal11=this.match(this.input,16,InternalStatemachineParser.FOLLOW_16_in_rule_State195); 
                    char_literal11_tree = this.adaptor.create(char_literal11);
                    this.adaptor.addChild(root_0, char_literal11_tree);



                    break;

            }

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:40:63: (transitions+= rule_Transition )*
            loop10:
            do {
                var alt10=2;
                var LA10_0 = this.input.LA(1);

                if ( (LA10_0==ID) ) {
                    alt10=1;
                }


                switch (alt10) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:40:63: transitions+= rule_Transition
                    this.pushFollow(InternalStatemachineParser.FOLLOW_rule_Transition_in_rule_State201);
                    transitions=this.rule_Transition();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, transitions.getTree());
                    if (org.antlr.lang.isNull(list_transitions)) list_transitions = [];
                    list_transitions.push(transitions.getTree());



                    break;

                default :
                    break loop10;
                }
            } while (true);

            string_literal12=this.match(this.input,10,InternalStatemachineParser.FOLLOW_10_in_rule_State205); 
            string_literal12_tree = this.adaptor.create(string_literal12);
            this.adaptor.addChild(root_0, string_literal12_tree);




            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    rule_Transition_return: (function() {
        InternalStatemachineParser.rule_Transition_return = function(){};
        org.antlr.lang.extend(InternalStatemachineParser.rule_Transition_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:45:1: rule_Transition returns [Transition] : event= ID '=>' state= ID ;
    // $ANTLR start "rule_Transition"
    rule_Transition: function() {
        var retval = new InternalStatemachineParser.rule_Transition_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var event = null;
        var state = null;
        var string_literal13 = null;

        var event_tree=null;
        var state_tree=null;
        var string_literal13_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:45:37: (event= ID '=>' state= ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:46:2: event= ID '=>' state= ID
            root_0 = this.adaptor.nil();

            event=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_Transition221); 
            event_tree = this.adaptor.create(event);
            this.adaptor.addChild(root_0, event_tree);

            string_literal13=this.match(this.input,17,InternalStatemachineParser.FOLLOW_17_in_rule_Transition223); 
            string_literal13_tree = this.adaptor.create(string_literal13);
            this.adaptor.addChild(root_0, string_literal13_tree);

            state=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_Transition227); 
            state_tree = this.adaptor.create(state);
            this.adaptor.addChild(root_0, state_tree);




            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    }

    // Delegated rules




}, true); // important to pass true to overwrite default implementations

 

// public class variables
org.antlr.lang.augmentObject(InternalStatemachineParser, {
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "STRING", "COMMENT", "WS", "INT", "'events'", "'end'", "'resetEvents'", "'commands'", "'state'", "'actions'", "'{'", "'}'", "'=>'"],
    FOLLOW_9_in_rule_Statemachine69: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_Event_in_rule_Statemachine76: new org.antlr.runtime.BitSet([0x00000410, 0x00000000]),
    FOLLOW_10_in_rule_Statemachine81: new org.antlr.runtime.BitSet([0x00003800, 0x00000000]),
    FOLLOW_11_in_rule_Statemachine86: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Statemachine93: new org.antlr.runtime.BitSet([0x00000410, 0x00000000]),
    FOLLOW_10_in_rule_Statemachine98: new org.antlr.runtime.BitSet([0x00003000, 0x00000000]),
    FOLLOW_12_in_rule_Statemachine103: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_Command_in_rule_Statemachine110: new org.antlr.runtime.BitSet([0x00000410, 0x00000000]),
    FOLLOW_10_in_rule_Statemachine115: new org.antlr.runtime.BitSet([0x00002000, 0x00000000]),
    FOLLOW_rule_State_in_rule_Statemachine121: new org.antlr.runtime.BitSet([0x00002000, 0x00000000]),
    FOLLOW_EOF_in_rule_Statemachine125: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_Event141: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Event145: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_Command161: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Command165: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_13_in_rule_State179: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_State183: new org.antlr.runtime.BitSet([0x00004410, 0x00000000]),
    FOLLOW_14_in_rule_State186: new org.antlr.runtime.BitSet([0x00008000, 0x00000000]),
    FOLLOW_15_in_rule_State188: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_State192: new org.antlr.runtime.BitSet([0x00010010, 0x00000000]),
    FOLLOW_16_in_rule_State195: new org.antlr.runtime.BitSet([0x00000410, 0x00000000]),
    FOLLOW_rule_Transition_in_rule_State201: new org.antlr.runtime.BitSet([0x00000410, 0x00000000]),
    FOLLOW_10_in_rule_State205: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_Transition221: new org.antlr.runtime.BitSet([0x00020000, 0x00000000]),
    FOLLOW_17_in_rule_Transition223: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Transition227: new org.antlr.runtime.BitSet([0x00000002, 0x00000000])
});

})();