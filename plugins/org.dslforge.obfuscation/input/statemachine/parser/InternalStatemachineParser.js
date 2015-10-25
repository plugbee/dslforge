// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g 2015-04-19 23:38:29

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
    NUMBER: 8
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
    NUMBER= 8;

// public instance methods/vars
org.antlr.lang.extend(InternalStatemachineParser, org.antlr.runtime.Parser, {
        
    setTreeAdaptor: function(adaptor) {
        this.adaptor = adaptor;
    },
    getTreeAdaptor: function() {
        return this.adaptor;
    },

    getTokenNames: function() { return InternalStatemachineParser.tokenNames; },
    getGrammarFileName: function() { return "C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g"; }
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

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:1: rule_Statemachine : ( 'events' (events+= rule_Event )+ 'end' )? ( 'resetEvents' (resetevents+= ID )+ 'end' )? ( 'commands' (commands+= rule_Command )+ 'end' )? (states+= rule_State )* EOF ;
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
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:19: ( ( 'events' (events+= rule_Event )+ 'end' )? ( 'resetEvents' (resetevents+= ID )+ 'end' )? ( 'commands' (commands+= rule_Command )+ 'end' )? (states+= rule_State )* EOF )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:21: ( 'events' (events+= rule_Event )+ 'end' )? ( 'resetEvents' (resetevents+= ID )+ 'end' )? ( 'commands' (commands+= rule_Command )+ 'end' )? (states+= rule_State )* EOF
            root_0 = this.adaptor.nil();

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:21: ( 'events' (events+= rule_Event )+ 'end' )?
            var alt2=2;
            var LA2_0 = this.input.LA(1);

            if ( (LA2_0==9) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:22: 'events' (events+= rule_Event )+ 'end'
                    string_literal1=this.match(this.input,9,InternalStatemachineParser.FOLLOW_9_in_rule_Statemachine44); 
                    string_literal1_tree = this.adaptor.create(string_literal1);
                    this.adaptor.addChild(root_0, string_literal1_tree);

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:39: (events+= rule_Event )+
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
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:39: events+= rule_Event
                            this.pushFollow(InternalStatemachineParser.FOLLOW_rule_Event_in_rule_Statemachine50);
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

                    string_literal2=this.match(this.input,10,InternalStatemachineParser.FOLLOW_10_in_rule_Statemachine54); 
                    string_literal2_tree = this.adaptor.create(string_literal2);
                    this.adaptor.addChild(root_0, string_literal2_tree);



                    break;

            }

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:62: ( 'resetEvents' (resetevents+= ID )+ 'end' )?
            var alt4=2;
            var LA4_0 = this.input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:63: 'resetEvents' (resetevents+= ID )+ 'end'
                    string_literal3=this.match(this.input,11,InternalStatemachineParser.FOLLOW_11_in_rule_Statemachine59); 
                    string_literal3_tree = this.adaptor.create(string_literal3);
                    this.adaptor.addChild(root_0, string_literal3_tree);

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:90: (resetevents+= ID )+
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
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:90: resetevents+= ID
                            resetevents=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_Statemachine65); 
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

                    string_literal4=this.match(this.input,10,InternalStatemachineParser.FOLLOW_10_in_rule_Statemachine69); 
                    string_literal4_tree = this.adaptor.create(string_literal4);
                    this.adaptor.addChild(root_0, string_literal4_tree);



                    break;

            }

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:105: ( 'commands' (commands+= rule_Command )+ 'end' )?
            var alt6=2;
            var LA6_0 = this.input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:106: 'commands' (commands+= rule_Command )+ 'end'
                    string_literal5=this.match(this.input,12,InternalStatemachineParser.FOLLOW_12_in_rule_Statemachine74); 
                    string_literal5_tree = this.adaptor.create(string_literal5);
                    this.adaptor.addChild(root_0, string_literal5_tree);

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:127: (commands+= rule_Command )+
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
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:127: commands+= rule_Command
                            this.pushFollow(InternalStatemachineParser.FOLLOW_rule_Command_in_rule_Statemachine80);
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

                    string_literal6=this.match(this.input,10,InternalStatemachineParser.FOLLOW_10_in_rule_Statemachine84); 
                    string_literal6_tree = this.adaptor.create(string_literal6);
                    this.adaptor.addChild(root_0, string_literal6_tree);



                    break;

            }

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:158: (states+= rule_State )*
            loop7:
            do {
                var alt7=2;
                var LA7_0 = this.input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:158: states+= rule_State
                    this.pushFollow(InternalStatemachineParser.FOLLOW_rule_State_in_rule_Statemachine90);
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

            EOF7=this.match(this.input,EOF,InternalStatemachineParser.FOLLOW_EOF_in_rule_Statemachine92); 



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

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:176: rule_Event : name= ID code= ID ;
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
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:186: (name= ID code= ID )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:188: name= ID code= ID
            root_0 = this.adaptor.nil();

            name=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_Event100); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            code=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_Event104); 
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

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:204: rule_Command : name= ID code= ID ;
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
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:216: (name= ID code= ID )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:218: name= ID code= ID
            root_0 = this.adaptor.nil();

            name=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_Command111); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            code=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_Command115); 
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

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:234: rule_State : 'state' name= ID ( 'actions' '{' (actions+= ID )+ '}' )? (transitions+= rule_Transition )* 'end' ;
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
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:244: ( 'state' name= ID ( 'actions' '{' (actions+= ID )+ '}' )? (transitions+= rule_Transition )* 'end' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:246: 'state' name= ID ( 'actions' '{' (actions+= ID )+ '}' )? (transitions+= rule_Transition )* 'end'
            root_0 = this.adaptor.nil();

            string_literal8=this.match(this.input,13,InternalStatemachineParser.FOLLOW_13_in_rule_State120); 
            string_literal8_tree = this.adaptor.create(string_literal8);
            this.adaptor.addChild(root_0, string_literal8_tree);

            name=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_State124); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:262: ( 'actions' '{' (actions+= ID )+ '}' )?
            var alt9=2;
            var LA9_0 = this.input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:263: 'actions' '{' (actions+= ID )+ '}'
                    string_literal9=this.match(this.input,14,InternalStatemachineParser.FOLLOW_14_in_rule_State127); 
                    string_literal9_tree = this.adaptor.create(string_literal9);
                    this.adaptor.addChild(root_0, string_literal9_tree);

                    char_literal10=this.match(this.input,15,InternalStatemachineParser.FOLLOW_15_in_rule_State129); 
                    char_literal10_tree = this.adaptor.create(char_literal10);
                    this.adaptor.addChild(root_0, char_literal10_tree);

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:284: (actions+= ID )+
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
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:284: actions+= ID
                            actions=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_State133); 
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

                    char_literal11=this.match(this.input,16,InternalStatemachineParser.FOLLOW_16_in_rule_State136); 
                    char_literal11_tree = this.adaptor.create(char_literal11);
                    this.adaptor.addChild(root_0, char_literal11_tree);



                    break;

            }

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:307: (transitions+= rule_Transition )*
            loop10:
            do {
                var alt10=2;
                var LA10_0 = this.input.LA(1);

                if ( (LA10_0==ID) ) {
                    alt10=1;
                }


                switch (alt10) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:307: transitions+= rule_Transition
                    this.pushFollow(InternalStatemachineParser.FOLLOW_rule_Transition_in_rule_State142);
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

            string_literal12=this.match(this.input,10,InternalStatemachineParser.FOLLOW_10_in_rule_State145); 
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

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:332: rule_Transition : event= ID '=>' state= ID ;
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
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:347: (event= ID '=>' state= ID )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.fowlerdsl.web\\src-js\\org\\eclipse\\xtext\\example\\fowlerdsl\\web\\parser\\InternalStatemachine.g:2:349: event= ID '=>' state= ID
            root_0 = this.adaptor.nil();

            event=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_Transition152); 
            event_tree = this.adaptor.create(event);
            this.adaptor.addChild(root_0, event_tree);

            string_literal13=this.match(this.input,17,InternalStatemachineParser.FOLLOW_17_in_rule_Transition154); 
            string_literal13_tree = this.adaptor.create(string_literal13);
            this.adaptor.addChild(root_0, string_literal13_tree);

            state=this.match(this.input,ID,InternalStatemachineParser.FOLLOW_ID_in_rule_Transition158); 
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
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "STRING", "COMMENT", "WS", "NUMBER", "'events'", "'end'", "'resetEvents'", "'commands'", "'state'", "'actions'", "'{'", "'}'", "'=>'"],
    FOLLOW_9_in_rule_Statemachine44: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_Event_in_rule_Statemachine50: new org.antlr.runtime.BitSet([0x00000410, 0x00000000]),
    FOLLOW_10_in_rule_Statemachine54: new org.antlr.runtime.BitSet([0x00003800, 0x00000000]),
    FOLLOW_11_in_rule_Statemachine59: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Statemachine65: new org.antlr.runtime.BitSet([0x00000410, 0x00000000]),
    FOLLOW_10_in_rule_Statemachine69: new org.antlr.runtime.BitSet([0x00003000, 0x00000000]),
    FOLLOW_12_in_rule_Statemachine74: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_Command_in_rule_Statemachine80: new org.antlr.runtime.BitSet([0x00000410, 0x00000000]),
    FOLLOW_10_in_rule_Statemachine84: new org.antlr.runtime.BitSet([0x00002000, 0x00000000]),
    FOLLOW_rule_State_in_rule_Statemachine90: new org.antlr.runtime.BitSet([0x00002000, 0x00000000]),
    FOLLOW_EOF_in_rule_Statemachine92: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_Event100: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Event104: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_Command111: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Command115: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_13_in_rule_State120: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_State124: new org.antlr.runtime.BitSet([0x00004410, 0x00000000]),
    FOLLOW_14_in_rule_State127: new org.antlr.runtime.BitSet([0x00008000, 0x00000000]),
    FOLLOW_15_in_rule_State129: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_State133: new org.antlr.runtime.BitSet([0x00010010, 0x00000000]),
    FOLLOW_16_in_rule_State136: new org.antlr.runtime.BitSet([0x00000410, 0x00000000]),
    FOLLOW_rule_Transition_in_rule_State142: new org.antlr.runtime.BitSet([0x00000410, 0x00000000]),
    FOLLOW_10_in_rule_State145: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_Transition152: new org.antlr.runtime.BitSet([0x00020000, 0x00000000]),
    FOLLOW_17_in_rule_Transition154: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Transition158: new org.antlr.runtime.BitSet([0x00000002, 0x00000000])
});

})();