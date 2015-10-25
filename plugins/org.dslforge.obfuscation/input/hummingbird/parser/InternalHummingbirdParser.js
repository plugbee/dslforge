// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g 2015-04-19 23:38:24




var InternalHummingbirdParser = function(input, state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    InternalHummingbirdParser.superclass.constructor.call(this, input, state);


         

    /* @todo only create adaptor if output=AST */
    this.adaptor = new org.antlr.runtime.tree.CommonTreeAdaptor();

};

org.antlr.lang.augmentObject(InternalHummingbirdParser, {
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
    T__32: 32,
    T__33: 33,
    T__34: 34,
    T__35: 35,
    T__36: 36,
    T__37: 37,
    T__38: 38,
    T__39: 39,
    T__40: 40,
    T__41: 41,
    T__42: 42,
    T__43: 43,
    T__44: 44,
    T__45: 45,
    T__46: 46,
    ID: 4,
    STRING: 5,
    INT: 6,
    COMMENT: 7,
    WS: 8
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
    T__18= 18,
    T__19= 19,
    T__20= 20,
    T__21= 21,
    T__22= 22,
    T__23= 23,
    T__24= 24,
    T__25= 25,
    T__26= 26,
    T__27= 27,
    T__28= 28,
    T__29= 29,
    T__30= 30,
    T__31= 31,
    T__32= 32,
    T__33= 33,
    T__34= 34,
    T__35= 35,
    T__36= 36,
    T__37= 37,
    T__38= 38,
    T__39= 39,
    T__40= 40,
    T__41= 41,
    T__42= 42,
    T__43= 43,
    T__44= 44,
    T__45= 45,
    T__46= 46,
    ID= 4,
    STRING= 5,
    INT= 6,
    COMMENT= 7,
    WS= 8;

// public instance methods/vars
org.antlr.lang.extend(InternalHummingbirdParser, org.antlr.runtime.Parser, {
        
    setTreeAdaptor: function(adaptor) {
        this.adaptor = adaptor;
    },
    getTreeAdaptor: function() {
        return this.adaptor;
    },

    getTokenNames: function() { return InternalHummingbirdParser.tokenNames; },
    getGrammarFileName: function() { return "C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g"; }
});
org.antlr.lang.augmentObject(InternalHummingbirdParser.prototype, {

    // inline static return class
    rule_EntryPoint_return: (function() {
        InternalHummingbirdParser.rule_EntryPoint_return = function(){};
        org.antlr.lang.extend(InternalHummingbirdParser.rule_EntryPoint_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:17:1: rule_EntryPoint : ( rule_Application | rule_Platform EOF );
    // $ANTLR start "rule_EntryPoint"
    rule_EntryPoint: function() {
        var retval = new InternalHummingbirdParser.rule_EntryPoint_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var EOF3 = null;
         var rule_Application1 = null;
         var rule_Platform2 = null;

        var EOF3_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:18:3: ( rule_Application | rule_Platform EOF )
            var alt1=2;
            var LA1_0 = this.input.LA(1);

            if ( (LA1_0==9) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 1, 0, this.input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:19:3: rule_Application
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Application_in_rule_EntryPoint75);
                    rule_Application1=this.rule_Application();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Application1.getTree());


                    break;
                case 2 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:20:5: rule_Platform EOF
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Platform_in_rule_EntryPoint81);
                    rule_Platform2=this.rule_Platform();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Platform2.getTree());
                    EOF3=this.match(this.input,EOF,InternalHummingbirdParser.FOLLOW_EOF_in_rule_EntryPoint83); 


                    break;

            }
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
    rule_Application_return: (function() {
        InternalHummingbirdParser.rule_Application_return = function(){};
        org.antlr.lang.extend(InternalHummingbirdParser.rule_Application_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:23:1: rule_Application : 'Application' name= ID '{' ( 'description' description= rule_Description )? 'components' '{' components+= rule_Component ( ',' components+= rule_Component )* '}' '}' ;
    // $ANTLR start "rule_Application"
    rule_Application: function() {
        var retval = new InternalHummingbirdParser.rule_Application_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var string_literal4 = null;
        var char_literal5 = null;
        var string_literal6 = null;
        var string_literal7 = null;
        var char_literal8 = null;
        var char_literal9 = null;
        var char_literal10 = null;
        var char_literal11 = null;
        var list_components=null;
         var description = null;
        var components = null;
        var name_tree=null;
        var string_literal4_tree=null;
        var char_literal5_tree=null;
        var string_literal6_tree=null;
        var string_literal7_tree=null;
        var char_literal8_tree=null;
        var char_literal9_tree=null;
        var char_literal10_tree=null;
        var char_literal11_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:24:3: ( 'Application' name= ID '{' ( 'description' description= rule_Description )? 'components' '{' components+= rule_Component ( ',' components+= rule_Component )* '}' '}' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:25:3: 'Application' name= ID '{' ( 'description' description= rule_Description )? 'components' '{' components+= rule_Component ( ',' components+= rule_Component )* '}' '}'
            root_0 = this.adaptor.nil();

            string_literal4=this.match(this.input,9,InternalHummingbirdParser.FOLLOW_9_in_rule_Application99); 
            string_literal4_tree = this.adaptor.create(string_literal4);
            this.adaptor.addChild(root_0, string_literal4_tree);

            name=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Application103); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            char_literal5=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_Application105); 
            char_literal5_tree = this.adaptor.create(char_literal5);
            this.adaptor.addChild(root_0, char_literal5_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:25:29: ( 'description' description= rule_Description )?
            var alt2=2;
            var LA2_0 = this.input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:25:30: 'description' description= rule_Description
                    string_literal6=this.match(this.input,11,InternalHummingbirdParser.FOLLOW_11_in_rule_Application108); 
                    string_literal6_tree = this.adaptor.create(string_literal6);
                    this.adaptor.addChild(root_0, string_literal6_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Description_in_rule_Application112);
                    description=this.rule_Description();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, description.getTree());


                    break;

            }

            string_literal7=this.match(this.input,12,InternalHummingbirdParser.FOLLOW_12_in_rule_Application116); 
            string_literal7_tree = this.adaptor.create(string_literal7);
            this.adaptor.addChild(root_0, string_literal7_tree);

            char_literal8=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_Application118); 
            char_literal8_tree = this.adaptor.create(char_literal8);
            this.adaptor.addChild(root_0, char_literal8_tree);

            this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Component_in_rule_Application122);
            components=this.rule_Component();

            this.state._fsp--;

            this.adaptor.addChild(root_0, components.getTree());
            if (org.antlr.lang.isNull(list_components)) list_components = [];
            list_components.push(components.getTree());

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:25:119: ( ',' components+= rule_Component )*
            loop3:
            do {
                var alt3=2;
                var LA3_0 = this.input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:25:120: ',' components+= rule_Component
                    char_literal9=this.match(this.input,13,InternalHummingbirdParser.FOLLOW_13_in_rule_Application125); 
                    char_literal9_tree = this.adaptor.create(char_literal9);
                    this.adaptor.addChild(root_0, char_literal9_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Component_in_rule_Application129);
                    components=this.rule_Component();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, components.getTree());
                    if (org.antlr.lang.isNull(list_components)) list_components = [];
                    list_components.push(components.getTree());



                    break;

                default :
                    break loop3;
                }
            } while (true);

            char_literal10=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_Application133); 
            char_literal10_tree = this.adaptor.create(char_literal10);
            this.adaptor.addChild(root_0, char_literal10_tree);

            char_literal11=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_Application135); 
            char_literal11_tree = this.adaptor.create(char_literal11);
            this.adaptor.addChild(root_0, char_literal11_tree);




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
    rule_Component_return: (function() {
        InternalHummingbirdParser.rule_Component_return = function(){};
        org.antlr.lang.extend(InternalHummingbirdParser.rule_Component_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:28:1: rule_Component : 'Component' name= ID '{' ( 'type' type= ID )? ( 'incomingConnections' incomingconnections= ID )? ( 'description' description= rule_Description )? ( 'outgoingConnections' '{' outgoingconnections+= rule_Connection ( ',' outgoingconnections+= rule_Connection )* '}' )? ( 'parameterValues' '{' parametervalues+= rule_ParameterValue ( ',' parametervalues+= rule_ParameterValue )* '}' )? '}' ;
    // $ANTLR start "rule_Component"
    rule_Component: function() {
        var retval = new InternalHummingbirdParser.rule_Component_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var type = null;
        var incomingconnections = null;
        var string_literal12 = null;
        var char_literal13 = null;
        var string_literal14 = null;
        var string_literal15 = null;
        var string_literal16 = null;
        var string_literal17 = null;
        var char_literal18 = null;
        var char_literal19 = null;
        var char_literal20 = null;
        var string_literal21 = null;
        var char_literal22 = null;
        var char_literal23 = null;
        var char_literal24 = null;
        var char_literal25 = null;
        var list_outgoingconnections=null;
        var list_parametervalues=null;
         var description = null;
        var outgoingconnections = null;
        var parametervalues = null;
        var name_tree=null;
        var type_tree=null;
        var incomingconnections_tree=null;
        var string_literal12_tree=null;
        var char_literal13_tree=null;
        var string_literal14_tree=null;
        var string_literal15_tree=null;
        var string_literal16_tree=null;
        var string_literal17_tree=null;
        var char_literal18_tree=null;
        var char_literal19_tree=null;
        var char_literal20_tree=null;
        var string_literal21_tree=null;
        var char_literal22_tree=null;
        var char_literal23_tree=null;
        var char_literal24_tree=null;
        var char_literal25_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:29:3: ( 'Component' name= ID '{' ( 'type' type= ID )? ( 'incomingConnections' incomingconnections= ID )? ( 'description' description= rule_Description )? ( 'outgoingConnections' '{' outgoingconnections+= rule_Connection ( ',' outgoingconnections+= rule_Connection )* '}' )? ( 'parameterValues' '{' parametervalues+= rule_ParameterValue ( ',' parametervalues+= rule_ParameterValue )* '}' )? '}' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:3: 'Component' name= ID '{' ( 'type' type= ID )? ( 'incomingConnections' incomingconnections= ID )? ( 'description' description= rule_Description )? ( 'outgoingConnections' '{' outgoingconnections+= rule_Connection ( ',' outgoingconnections+= rule_Connection )* '}' )? ( 'parameterValues' '{' parametervalues+= rule_ParameterValue ( ',' parametervalues+= rule_ParameterValue )* '}' )? '}'
            root_0 = this.adaptor.nil();

            string_literal12=this.match(this.input,15,InternalHummingbirdParser.FOLLOW_15_in_rule_Component150); 
            string_literal12_tree = this.adaptor.create(string_literal12);
            this.adaptor.addChild(root_0, string_literal12_tree);

            name=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Component154); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            char_literal13=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_Component156); 
            char_literal13_tree = this.adaptor.create(char_literal13);
            this.adaptor.addChild(root_0, char_literal13_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:27: ( 'type' type= ID )?
            var alt4=2;
            var LA4_0 = this.input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:28: 'type' type= ID
                    string_literal14=this.match(this.input,16,InternalHummingbirdParser.FOLLOW_16_in_rule_Component159); 
                    string_literal14_tree = this.adaptor.create(string_literal14);
                    this.adaptor.addChild(root_0, string_literal14_tree);

                    type=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Component163); 
                    type_tree = this.adaptor.create(type);
                    this.adaptor.addChild(root_0, type_tree);



                    break;

            }

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:45: ( 'incomingConnections' incomingconnections= ID )?
            var alt5=2;
            var LA5_0 = this.input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:46: 'incomingConnections' incomingconnections= ID
                    string_literal15=this.match(this.input,17,InternalHummingbirdParser.FOLLOW_17_in_rule_Component168); 
                    string_literal15_tree = this.adaptor.create(string_literal15);
                    this.adaptor.addChild(root_0, string_literal15_tree);

                    incomingconnections=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Component172); 
                    incomingconnections_tree = this.adaptor.create(incomingconnections);
                    this.adaptor.addChild(root_0, incomingconnections_tree);



                    break;

            }

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:93: ( 'description' description= rule_Description )?
            var alt6=2;
            var LA6_0 = this.input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:94: 'description' description= rule_Description
                    string_literal16=this.match(this.input,11,InternalHummingbirdParser.FOLLOW_11_in_rule_Component177); 
                    string_literal16_tree = this.adaptor.create(string_literal16);
                    this.adaptor.addChild(root_0, string_literal16_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Description_in_rule_Component181);
                    description=this.rule_Description();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, description.getTree());


                    break;

            }

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:139: ( 'outgoingConnections' '{' outgoingconnections+= rule_Connection ( ',' outgoingconnections+= rule_Connection )* '}' )?
            var alt8=2;
            var LA8_0 = this.input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:140: 'outgoingConnections' '{' outgoingconnections+= rule_Connection ( ',' outgoingconnections+= rule_Connection )* '}'
                    string_literal17=this.match(this.input,18,InternalHummingbirdParser.FOLLOW_18_in_rule_Component186); 
                    string_literal17_tree = this.adaptor.create(string_literal17);
                    this.adaptor.addChild(root_0, string_literal17_tree);

                    char_literal18=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_Component188); 
                    char_literal18_tree = this.adaptor.create(char_literal18);
                    this.adaptor.addChild(root_0, char_literal18_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Connection_in_rule_Component192);
                    outgoingconnections=this.rule_Connection();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, outgoingconnections.getTree());
                    if (org.antlr.lang.isNull(list_outgoingconnections)) list_outgoingconnections = [];
                    list_outgoingconnections.push(outgoingconnections.getTree());

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:203: ( ',' outgoingconnections+= rule_Connection )*
                    loop7:
                    do {
                        var alt7=2;
                        var LA7_0 = this.input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:204: ',' outgoingconnections+= rule_Connection
                            char_literal19=this.match(this.input,13,InternalHummingbirdParser.FOLLOW_13_in_rule_Component195); 
                            char_literal19_tree = this.adaptor.create(char_literal19);
                            this.adaptor.addChild(root_0, char_literal19_tree);

                            this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Connection_in_rule_Component199);
                            outgoingconnections=this.rule_Connection();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, outgoingconnections.getTree());
                            if (org.antlr.lang.isNull(list_outgoingconnections)) list_outgoingconnections = [];
                            list_outgoingconnections.push(outgoingconnections.getTree());



                            break;

                        default :
                            break loop7;
                        }
                    } while (true);

                    char_literal20=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_Component203); 
                    char_literal20_tree = this.adaptor.create(char_literal20);
                    this.adaptor.addChild(root_0, char_literal20_tree);



                    break;

            }

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:253: ( 'parameterValues' '{' parametervalues+= rule_ParameterValue ( ',' parametervalues+= rule_ParameterValue )* '}' )?
            var alt10=2;
            var LA10_0 = this.input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:254: 'parameterValues' '{' parametervalues+= rule_ParameterValue ( ',' parametervalues+= rule_ParameterValue )* '}'
                    string_literal21=this.match(this.input,19,InternalHummingbirdParser.FOLLOW_19_in_rule_Component208); 
                    string_literal21_tree = this.adaptor.create(string_literal21);
                    this.adaptor.addChild(root_0, string_literal21_tree);

                    char_literal22=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_Component210); 
                    char_literal22_tree = this.adaptor.create(char_literal22);
                    this.adaptor.addChild(root_0, char_literal22_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_ParameterValue_in_rule_Component214);
                    parametervalues=this.rule_ParameterValue();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, parametervalues.getTree());
                    if (org.antlr.lang.isNull(list_parametervalues)) list_parametervalues = [];
                    list_parametervalues.push(parametervalues.getTree());

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:313: ( ',' parametervalues+= rule_ParameterValue )*
                    loop9:
                    do {
                        var alt9=2;
                        var LA9_0 = this.input.LA(1);

                        if ( (LA9_0==13) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:30:314: ',' parametervalues+= rule_ParameterValue
                            char_literal23=this.match(this.input,13,InternalHummingbirdParser.FOLLOW_13_in_rule_Component217); 
                            char_literal23_tree = this.adaptor.create(char_literal23);
                            this.adaptor.addChild(root_0, char_literal23_tree);

                            this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_ParameterValue_in_rule_Component221);
                            parametervalues=this.rule_ParameterValue();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, parametervalues.getTree());
                            if (org.antlr.lang.isNull(list_parametervalues)) list_parametervalues = [];
                            list_parametervalues.push(parametervalues.getTree());



                            break;

                        default :
                            break loop9;
                        }
                    } while (true);

                    char_literal24=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_Component225); 
                    char_literal24_tree = this.adaptor.create(char_literal24);
                    this.adaptor.addChild(root_0, char_literal24_tree);



                    break;

            }

            char_literal25=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_Component229); 
            char_literal25_tree = this.adaptor.create(char_literal25);
            this.adaptor.addChild(root_0, char_literal25_tree);




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
    rule_Connection_return: (function() {
        InternalHummingbirdParser.rule_Connection_return = function(){};
        org.antlr.lang.extend(InternalHummingbirdParser.rule_Connection_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:33:1: rule_Connection : 'Connection' name= ID '{' 'sourcePort' sourceport= ID 'targetComponent' targetcomponent= ID ( 'description' description= rule_Description )? '}' ;
    // $ANTLR start "rule_Connection"
    rule_Connection: function() {
        var retval = new InternalHummingbirdParser.rule_Connection_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var sourceport = null;
        var targetcomponent = null;
        var string_literal26 = null;
        var char_literal27 = null;
        var string_literal28 = null;
        var string_literal29 = null;
        var string_literal30 = null;
        var char_literal31 = null;
         var description = null;

        var name_tree=null;
        var sourceport_tree=null;
        var targetcomponent_tree=null;
        var string_literal26_tree=null;
        var char_literal27_tree=null;
        var string_literal28_tree=null;
        var string_literal29_tree=null;
        var string_literal30_tree=null;
        var char_literal31_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:34:3: ( 'Connection' name= ID '{' 'sourcePort' sourceport= ID 'targetComponent' targetcomponent= ID ( 'description' description= rule_Description )? '}' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:35:3: 'Connection' name= ID '{' 'sourcePort' sourceport= ID 'targetComponent' targetcomponent= ID ( 'description' description= rule_Description )? '}'
            root_0 = this.adaptor.nil();

            string_literal26=this.match(this.input,20,InternalHummingbirdParser.FOLLOW_20_in_rule_Connection244); 
            string_literal26_tree = this.adaptor.create(string_literal26);
            this.adaptor.addChild(root_0, string_literal26_tree);

            name=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Connection248); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            char_literal27=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_Connection250); 
            char_literal27_tree = this.adaptor.create(char_literal27);
            this.adaptor.addChild(root_0, char_literal27_tree);

            string_literal28=this.match(this.input,21,InternalHummingbirdParser.FOLLOW_21_in_rule_Connection252); 
            string_literal28_tree = this.adaptor.create(string_literal28);
            this.adaptor.addChild(root_0, string_literal28_tree);

            sourceport=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Connection256); 
            sourceport_tree = this.adaptor.create(sourceport);
            this.adaptor.addChild(root_0, sourceport_tree);

            string_literal29=this.match(this.input,22,InternalHummingbirdParser.FOLLOW_22_in_rule_Connection258); 
            string_literal29_tree = this.adaptor.create(string_literal29);
            this.adaptor.addChild(root_0, string_literal29_tree);

            targetcomponent=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Connection262); 
            targetcomponent_tree = this.adaptor.create(targetcomponent);
            this.adaptor.addChild(root_0, targetcomponent_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:35:92: ( 'description' description= rule_Description )?
            var alt11=2;
            var LA11_0 = this.input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:35:93: 'description' description= rule_Description
                    string_literal30=this.match(this.input,11,InternalHummingbirdParser.FOLLOW_11_in_rule_Connection265); 
                    string_literal30_tree = this.adaptor.create(string_literal30);
                    this.adaptor.addChild(root_0, string_literal30_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Description_in_rule_Connection269);
                    description=this.rule_Description();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, description.getTree());


                    break;

            }

            char_literal31=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_Connection273); 
            char_literal31_tree = this.adaptor.create(char_literal31);
            this.adaptor.addChild(root_0, char_literal31_tree);




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
    rule_ParameterValue_return: (function() {
        InternalHummingbirdParser.rule_ParameterValue_return = function(){};
        org.antlr.lang.extend(InternalHummingbirdParser.rule_ParameterValue_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:38:1: rule_ParameterValue : 'ParameterValue' name= ID '{' ( 'value' value= STRING )? 'type' type= ID ( 'description' description= rule_Description )? '}' ;
    // $ANTLR start "rule_ParameterValue"
    rule_ParameterValue: function() {
        var retval = new InternalHummingbirdParser.rule_ParameterValue_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var value = null;
        var type = null;
        var string_literal32 = null;
        var char_literal33 = null;
        var string_literal34 = null;
        var string_literal35 = null;
        var string_literal36 = null;
        var char_literal37 = null;
         var description = null;

        var name_tree=null;
        var value_tree=null;
        var type_tree=null;
        var string_literal32_tree=null;
        var char_literal33_tree=null;
        var string_literal34_tree=null;
        var string_literal35_tree=null;
        var string_literal36_tree=null;
        var char_literal37_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:39:3: ( 'ParameterValue' name= ID '{' ( 'value' value= STRING )? 'type' type= ID ( 'description' description= rule_Description )? '}' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:40:3: 'ParameterValue' name= ID '{' ( 'value' value= STRING )? 'type' type= ID ( 'description' description= rule_Description )? '}'
            root_0 = this.adaptor.nil();

            string_literal32=this.match(this.input,23,InternalHummingbirdParser.FOLLOW_23_in_rule_ParameterValue288); 
            string_literal32_tree = this.adaptor.create(string_literal32);
            this.adaptor.addChild(root_0, string_literal32_tree);

            name=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_ParameterValue292); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            char_literal33=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_ParameterValue294); 
            char_literal33_tree = this.adaptor.create(char_literal33);
            this.adaptor.addChild(root_0, char_literal33_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:40:32: ( 'value' value= STRING )?
            var alt12=2;
            var LA12_0 = this.input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:40:33: 'value' value= STRING
                    string_literal34=this.match(this.input,24,InternalHummingbirdParser.FOLLOW_24_in_rule_ParameterValue297); 
                    string_literal34_tree = this.adaptor.create(string_literal34);
                    this.adaptor.addChild(root_0, string_literal34_tree);

                    value=this.match(this.input,STRING,InternalHummingbirdParser.FOLLOW_STRING_in_rule_ParameterValue301); 
                    value_tree = this.adaptor.create(value);
                    this.adaptor.addChild(root_0, value_tree);



                    break;

            }

            string_literal35=this.match(this.input,16,InternalHummingbirdParser.FOLLOW_16_in_rule_ParameterValue305); 
            string_literal35_tree = this.adaptor.create(string_literal35);
            this.adaptor.addChild(root_0, string_literal35_tree);

            type=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_ParameterValue309); 
            type_tree = this.adaptor.create(type);
            this.adaptor.addChild(root_0, type_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:40:71: ( 'description' description= rule_Description )?
            var alt13=2;
            var LA13_0 = this.input.LA(1);

            if ( (LA13_0==11) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:40:72: 'description' description= rule_Description
                    string_literal36=this.match(this.input,11,InternalHummingbirdParser.FOLLOW_11_in_rule_ParameterValue312); 
                    string_literal36_tree = this.adaptor.create(string_literal36);
                    this.adaptor.addChild(root_0, string_literal36_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Description_in_rule_ParameterValue316);
                    description=this.rule_Description();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, description.getTree());


                    break;

            }

            char_literal37=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_ParameterValue320); 
            char_literal37_tree = this.adaptor.create(char_literal37);
            this.adaptor.addChild(root_0, char_literal37_tree);




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
    rule_Platform_return: (function() {
        InternalHummingbirdParser.rule_Platform_return = function(){};
        org.antlr.lang.extend(InternalHummingbirdParser.rule_Platform_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:43:1: rule_Platform : 'Platform' name= ID '{' ( 'description' description= rule_Description )? 'componentTypes' '{' componenttypes+= rule_ComponentType ( ',' componenttypes+= rule_ComponentType )* '}' ( 'interfaces' '{' interfaces+= rule_Interface ( ',' interfaces+= rule_Interface )* '}' )? '}' ;
    // $ANTLR start "rule_Platform"
    rule_Platform: function() {
        var retval = new InternalHummingbirdParser.rule_Platform_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var string_literal38 = null;
        var char_literal39 = null;
        var string_literal40 = null;
        var string_literal41 = null;
        var char_literal42 = null;
        var char_literal43 = null;
        var char_literal44 = null;
        var string_literal45 = null;
        var char_literal46 = null;
        var char_literal47 = null;
        var char_literal48 = null;
        var char_literal49 = null;
        var list_componenttypes=null;
        var list_interfaces=null;
         var description = null;
        var componenttypes = null;
        var interfaces = null;
        var name_tree=null;
        var string_literal38_tree=null;
        var char_literal39_tree=null;
        var string_literal40_tree=null;
        var string_literal41_tree=null;
        var char_literal42_tree=null;
        var char_literal43_tree=null;
        var char_literal44_tree=null;
        var string_literal45_tree=null;
        var char_literal46_tree=null;
        var char_literal47_tree=null;
        var char_literal48_tree=null;
        var char_literal49_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:44:3: ( 'Platform' name= ID '{' ( 'description' description= rule_Description )? 'componentTypes' '{' componenttypes+= rule_ComponentType ( ',' componenttypes+= rule_ComponentType )* '}' ( 'interfaces' '{' interfaces+= rule_Interface ( ',' interfaces+= rule_Interface )* '}' )? '}' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:45:3: 'Platform' name= ID '{' ( 'description' description= rule_Description )? 'componentTypes' '{' componenttypes+= rule_ComponentType ( ',' componenttypes+= rule_ComponentType )* '}' ( 'interfaces' '{' interfaces+= rule_Interface ( ',' interfaces+= rule_Interface )* '}' )? '}'
            root_0 = this.adaptor.nil();

            string_literal38=this.match(this.input,25,InternalHummingbirdParser.FOLLOW_25_in_rule_Platform335); 
            string_literal38_tree = this.adaptor.create(string_literal38);
            this.adaptor.addChild(root_0, string_literal38_tree);

            name=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Platform339); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            char_literal39=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_Platform341); 
            char_literal39_tree = this.adaptor.create(char_literal39);
            this.adaptor.addChild(root_0, char_literal39_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:45:26: ( 'description' description= rule_Description )?
            var alt14=2;
            var LA14_0 = this.input.LA(1);

            if ( (LA14_0==11) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:45:27: 'description' description= rule_Description
                    string_literal40=this.match(this.input,11,InternalHummingbirdParser.FOLLOW_11_in_rule_Platform344); 
                    string_literal40_tree = this.adaptor.create(string_literal40);
                    this.adaptor.addChild(root_0, string_literal40_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Description_in_rule_Platform348);
                    description=this.rule_Description();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, description.getTree());


                    break;

            }

            string_literal41=this.match(this.input,26,InternalHummingbirdParser.FOLLOW_26_in_rule_Platform352); 
            string_literal41_tree = this.adaptor.create(string_literal41);
            this.adaptor.addChild(root_0, string_literal41_tree);

            char_literal42=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_Platform354); 
            char_literal42_tree = this.adaptor.create(char_literal42);
            this.adaptor.addChild(root_0, char_literal42_tree);

            this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_ComponentType_in_rule_Platform358);
            componenttypes=this.rule_ComponentType();

            this.state._fsp--;

            this.adaptor.addChild(root_0, componenttypes.getTree());
            if (org.antlr.lang.isNull(list_componenttypes)) list_componenttypes = [];
            list_componenttypes.push(componenttypes.getTree());

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:45:128: ( ',' componenttypes+= rule_ComponentType )*
            loop15:
            do {
                var alt15=2;
                var LA15_0 = this.input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:45:129: ',' componenttypes+= rule_ComponentType
                    char_literal43=this.match(this.input,13,InternalHummingbirdParser.FOLLOW_13_in_rule_Platform361); 
                    char_literal43_tree = this.adaptor.create(char_literal43);
                    this.adaptor.addChild(root_0, char_literal43_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_ComponentType_in_rule_Platform365);
                    componenttypes=this.rule_ComponentType();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, componenttypes.getTree());
                    if (org.antlr.lang.isNull(list_componenttypes)) list_componenttypes = [];
                    list_componenttypes.push(componenttypes.getTree());



                    break;

                default :
                    break loop15;
                }
            } while (true);

            char_literal44=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_Platform369); 
            char_literal44_tree = this.adaptor.create(char_literal44);
            this.adaptor.addChild(root_0, char_literal44_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:45:174: ( 'interfaces' '{' interfaces+= rule_Interface ( ',' interfaces+= rule_Interface )* '}' )?
            var alt17=2;
            var LA17_0 = this.input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:45:175: 'interfaces' '{' interfaces+= rule_Interface ( ',' interfaces+= rule_Interface )* '}'
                    string_literal45=this.match(this.input,27,InternalHummingbirdParser.FOLLOW_27_in_rule_Platform372); 
                    string_literal45_tree = this.adaptor.create(string_literal45);
                    this.adaptor.addChild(root_0, string_literal45_tree);

                    char_literal46=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_Platform374); 
                    char_literal46_tree = this.adaptor.create(char_literal46);
                    this.adaptor.addChild(root_0, char_literal46_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Interface_in_rule_Platform378);
                    interfaces=this.rule_Interface();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, interfaces.getTree());
                    if (org.antlr.lang.isNull(list_interfaces)) list_interfaces = [];
                    list_interfaces.push(interfaces.getTree());

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:45:219: ( ',' interfaces+= rule_Interface )*
                    loop16:
                    do {
                        var alt16=2;
                        var LA16_0 = this.input.LA(1);

                        if ( (LA16_0==13) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:45:220: ',' interfaces+= rule_Interface
                            char_literal47=this.match(this.input,13,InternalHummingbirdParser.FOLLOW_13_in_rule_Platform381); 
                            char_literal47_tree = this.adaptor.create(char_literal47);
                            this.adaptor.addChild(root_0, char_literal47_tree);

                            this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Interface_in_rule_Platform385);
                            interfaces=this.rule_Interface();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, interfaces.getTree());
                            if (org.antlr.lang.isNull(list_interfaces)) list_interfaces = [];
                            list_interfaces.push(interfaces.getTree());



                            break;

                        default :
                            break loop16;
                        }
                    } while (true);

                    char_literal48=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_Platform389); 
                    char_literal48_tree = this.adaptor.create(char_literal48);
                    this.adaptor.addChild(root_0, char_literal48_tree);



                    break;

            }

            char_literal49=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_Platform393); 
            char_literal49_tree = this.adaptor.create(char_literal49);
            this.adaptor.addChild(root_0, char_literal49_tree);




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
    rule_ComponentType_return: (function() {
        InternalHummingbirdParser.rule_ComponentType_return = function(){};
        org.antlr.lang.extend(InternalHummingbirdParser.rule_ComponentType_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:48:1: rule_ComponentType : 'ComponentType' name= ID '{' ( 'providedInterfaces' '(' providedinterfaces+= ID ( ',' providedinterfaces+= ID )* ')' )? ( 'description' description= rule_Description )? ( 'ports' '{' ports+= rule_Port ( ',' ports+= rule_Port )* '}' )? ( 'parameters' '{' parameters+= rule_Parameter ( ',' parameters+= rule_Parameter )* '}' )? '}' ;
    // $ANTLR start "rule_ComponentType"
    rule_ComponentType: function() {
        var retval = new InternalHummingbirdParser.rule_ComponentType_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var string_literal50 = null;
        var char_literal51 = null;
        var string_literal52 = null;
        var char_literal53 = null;
        var char_literal54 = null;
        var char_literal55 = null;
        var string_literal56 = null;
        var string_literal57 = null;
        var char_literal58 = null;
        var char_literal59 = null;
        var char_literal60 = null;
        var string_literal61 = null;
        var char_literal62 = null;
        var char_literal63 = null;
        var char_literal64 = null;
        var char_literal65 = null;
        var providedinterfaces = null;
        var list_providedinterfaces=null;
        var list_ports=null;
        var list_parameters=null;
         var description = null;
        var ports = null;
        var parameters = null;
        var name_tree=null;
        var string_literal50_tree=null;
        var char_literal51_tree=null;
        var string_literal52_tree=null;
        var char_literal53_tree=null;
        var char_literal54_tree=null;
        var char_literal55_tree=null;
        var string_literal56_tree=null;
        var string_literal57_tree=null;
        var char_literal58_tree=null;
        var char_literal59_tree=null;
        var char_literal60_tree=null;
        var string_literal61_tree=null;
        var char_literal62_tree=null;
        var char_literal63_tree=null;
        var char_literal64_tree=null;
        var char_literal65_tree=null;
        var providedinterfaces_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:49:3: ( 'ComponentType' name= ID '{' ( 'providedInterfaces' '(' providedinterfaces+= ID ( ',' providedinterfaces+= ID )* ')' )? ( 'description' description= rule_Description )? ( 'ports' '{' ports+= rule_Port ( ',' ports+= rule_Port )* '}' )? ( 'parameters' '{' parameters+= rule_Parameter ( ',' parameters+= rule_Parameter )* '}' )? '}' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:3: 'ComponentType' name= ID '{' ( 'providedInterfaces' '(' providedinterfaces+= ID ( ',' providedinterfaces+= ID )* ')' )? ( 'description' description= rule_Description )? ( 'ports' '{' ports+= rule_Port ( ',' ports+= rule_Port )* '}' )? ( 'parameters' '{' parameters+= rule_Parameter ( ',' parameters+= rule_Parameter )* '}' )? '}'
            root_0 = this.adaptor.nil();

            string_literal50=this.match(this.input,28,InternalHummingbirdParser.FOLLOW_28_in_rule_ComponentType408); 
            string_literal50_tree = this.adaptor.create(string_literal50);
            this.adaptor.addChild(root_0, string_literal50_tree);

            name=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_ComponentType412); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            char_literal51=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_ComponentType414); 
            char_literal51_tree = this.adaptor.create(char_literal51);
            this.adaptor.addChild(root_0, char_literal51_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:31: ( 'providedInterfaces' '(' providedinterfaces+= ID ( ',' providedinterfaces+= ID )* ')' )?
            var alt19=2;
            var LA19_0 = this.input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:32: 'providedInterfaces' '(' providedinterfaces+= ID ( ',' providedinterfaces+= ID )* ')'
                    string_literal52=this.match(this.input,29,InternalHummingbirdParser.FOLLOW_29_in_rule_ComponentType417); 
                    string_literal52_tree = this.adaptor.create(string_literal52);
                    this.adaptor.addChild(root_0, string_literal52_tree);

                    char_literal53=this.match(this.input,30,InternalHummingbirdParser.FOLLOW_30_in_rule_ComponentType419); 
                    char_literal53_tree = this.adaptor.create(char_literal53);
                    this.adaptor.addChild(root_0, char_literal53_tree);

                    providedinterfaces=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_ComponentType423); 
                    providedinterfaces_tree = this.adaptor.create(providedinterfaces);
                    this.adaptor.addChild(root_0, providedinterfaces_tree);

                    if (org.antlr.lang.isNull(list_providedinterfaces)) list_providedinterfaces = [];
                    list_providedinterfaces.push(providedinterfaces);

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:80: ( ',' providedinterfaces+= ID )*
                    loop18:
                    do {
                        var alt18=2;
                        var LA18_0 = this.input.LA(1);

                        if ( (LA18_0==13) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:81: ',' providedinterfaces+= ID
                            char_literal54=this.match(this.input,13,InternalHummingbirdParser.FOLLOW_13_in_rule_ComponentType426); 
                            char_literal54_tree = this.adaptor.create(char_literal54);
                            this.adaptor.addChild(root_0, char_literal54_tree);

                            providedinterfaces=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_ComponentType430); 
                            providedinterfaces_tree = this.adaptor.create(providedinterfaces);
                            this.adaptor.addChild(root_0, providedinterfaces_tree);

                            if (org.antlr.lang.isNull(list_providedinterfaces)) list_providedinterfaces = [];
                            list_providedinterfaces.push(providedinterfaces);



                            break;

                        default :
                            break loop18;
                        }
                    } while (true);

                    char_literal55=this.match(this.input,31,InternalHummingbirdParser.FOLLOW_31_in_rule_ComponentType434); 
                    char_literal55_tree = this.adaptor.create(char_literal55);
                    this.adaptor.addChild(root_0, char_literal55_tree);



                    break;

            }

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:116: ( 'description' description= rule_Description )?
            var alt20=2;
            var LA20_0 = this.input.LA(1);

            if ( (LA20_0==11) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:117: 'description' description= rule_Description
                    string_literal56=this.match(this.input,11,InternalHummingbirdParser.FOLLOW_11_in_rule_ComponentType439); 
                    string_literal56_tree = this.adaptor.create(string_literal56);
                    this.adaptor.addChild(root_0, string_literal56_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Description_in_rule_ComponentType443);
                    description=this.rule_Description();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, description.getTree());


                    break;

            }

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:162: ( 'ports' '{' ports+= rule_Port ( ',' ports+= rule_Port )* '}' )?
            var alt22=2;
            var LA22_0 = this.input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:163: 'ports' '{' ports+= rule_Port ( ',' ports+= rule_Port )* '}'
                    string_literal57=this.match(this.input,32,InternalHummingbirdParser.FOLLOW_32_in_rule_ComponentType448); 
                    string_literal57_tree = this.adaptor.create(string_literal57);
                    this.adaptor.addChild(root_0, string_literal57_tree);

                    char_literal58=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_ComponentType450); 
                    char_literal58_tree = this.adaptor.create(char_literal58);
                    this.adaptor.addChild(root_0, char_literal58_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Port_in_rule_ComponentType454);
                    ports=this.rule_Port();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, ports.getTree());
                    if (org.antlr.lang.isNull(list_ports)) list_ports = [];
                    list_ports.push(ports.getTree());

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:192: ( ',' ports+= rule_Port )*
                    loop21:
                    do {
                        var alt21=2;
                        var LA21_0 = this.input.LA(1);

                        if ( (LA21_0==13) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:193: ',' ports+= rule_Port
                            char_literal59=this.match(this.input,13,InternalHummingbirdParser.FOLLOW_13_in_rule_ComponentType457); 
                            char_literal59_tree = this.adaptor.create(char_literal59);
                            this.adaptor.addChild(root_0, char_literal59_tree);

                            this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Port_in_rule_ComponentType461);
                            ports=this.rule_Port();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, ports.getTree());
                            if (org.antlr.lang.isNull(list_ports)) list_ports = [];
                            list_ports.push(ports.getTree());



                            break;

                        default :
                            break loop21;
                        }
                    } while (true);

                    char_literal60=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_ComponentType465); 
                    char_literal60_tree = this.adaptor.create(char_literal60);
                    this.adaptor.addChild(root_0, char_literal60_tree);



                    break;

            }

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:222: ( 'parameters' '{' parameters+= rule_Parameter ( ',' parameters+= rule_Parameter )* '}' )?
            var alt24=2;
            var LA24_0 = this.input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:223: 'parameters' '{' parameters+= rule_Parameter ( ',' parameters+= rule_Parameter )* '}'
                    string_literal61=this.match(this.input,33,InternalHummingbirdParser.FOLLOW_33_in_rule_ComponentType470); 
                    string_literal61_tree = this.adaptor.create(string_literal61);
                    this.adaptor.addChild(root_0, string_literal61_tree);

                    char_literal62=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_ComponentType472); 
                    char_literal62_tree = this.adaptor.create(char_literal62);
                    this.adaptor.addChild(root_0, char_literal62_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Parameter_in_rule_ComponentType476);
                    parameters=this.rule_Parameter();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, parameters.getTree());
                    if (org.antlr.lang.isNull(list_parameters)) list_parameters = [];
                    list_parameters.push(parameters.getTree());

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:267: ( ',' parameters+= rule_Parameter )*
                    loop23:
                    do {
                        var alt23=2;
                        var LA23_0 = this.input.LA(1);

                        if ( (LA23_0==13) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:50:268: ',' parameters+= rule_Parameter
                            char_literal63=this.match(this.input,13,InternalHummingbirdParser.FOLLOW_13_in_rule_ComponentType479); 
                            char_literal63_tree = this.adaptor.create(char_literal63);
                            this.adaptor.addChild(root_0, char_literal63_tree);

                            this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Parameter_in_rule_ComponentType483);
                            parameters=this.rule_Parameter();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, parameters.getTree());
                            if (org.antlr.lang.isNull(list_parameters)) list_parameters = [];
                            list_parameters.push(parameters.getTree());



                            break;

                        default :
                            break loop23;
                        }
                    } while (true);

                    char_literal64=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_ComponentType487); 
                    char_literal64_tree = this.adaptor.create(char_literal64);
                    this.adaptor.addChild(root_0, char_literal64_tree);



                    break;

            }

            char_literal65=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_ComponentType491); 
            char_literal65_tree = this.adaptor.create(char_literal65);
            this.adaptor.addChild(root_0, char_literal65_tree);




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
    rule_Interface_return: (function() {
        InternalHummingbirdParser.rule_Interface_return = function(){};
        org.antlr.lang.extend(InternalHummingbirdParser.rule_Interface_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:53:1: rule_Interface : 'Interface' name= ID '{' ( 'providingComponentTypes' '(' providingcomponenttypes+= ID ( ',' providingcomponenttypes+= ID )* ')' )? ( 'requiringPorts' '(' requiringports+= ID ( ',' requiringports+= ID )* ')' )? ( 'description' description= rule_Description )? '}' ;
    // $ANTLR start "rule_Interface"
    rule_Interface: function() {
        var retval = new InternalHummingbirdParser.rule_Interface_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var string_literal66 = null;
        var char_literal67 = null;
        var string_literal68 = null;
        var char_literal69 = null;
        var char_literal70 = null;
        var char_literal71 = null;
        var string_literal72 = null;
        var char_literal73 = null;
        var char_literal74 = null;
        var char_literal75 = null;
        var string_literal76 = null;
        var char_literal77 = null;
        var providingcomponenttypes = null;
        var requiringports = null;
        var list_providingcomponenttypes=null;
        var list_requiringports=null;
         var description = null;

        var name_tree=null;
        var string_literal66_tree=null;
        var char_literal67_tree=null;
        var string_literal68_tree=null;
        var char_literal69_tree=null;
        var char_literal70_tree=null;
        var char_literal71_tree=null;
        var string_literal72_tree=null;
        var char_literal73_tree=null;
        var char_literal74_tree=null;
        var char_literal75_tree=null;
        var string_literal76_tree=null;
        var char_literal77_tree=null;
        var providingcomponenttypes_tree=null;
        var requiringports_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:54:3: ( 'Interface' name= ID '{' ( 'providingComponentTypes' '(' providingcomponenttypes+= ID ( ',' providingcomponenttypes+= ID )* ')' )? ( 'requiringPorts' '(' requiringports+= ID ( ',' requiringports+= ID )* ')' )? ( 'description' description= rule_Description )? '}' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:55:3: 'Interface' name= ID '{' ( 'providingComponentTypes' '(' providingcomponenttypes+= ID ( ',' providingcomponenttypes+= ID )* ')' )? ( 'requiringPorts' '(' requiringports+= ID ( ',' requiringports+= ID )* ')' )? ( 'description' description= rule_Description )? '}'
            root_0 = this.adaptor.nil();

            string_literal66=this.match(this.input,34,InternalHummingbirdParser.FOLLOW_34_in_rule_Interface506); 
            string_literal66_tree = this.adaptor.create(string_literal66);
            this.adaptor.addChild(root_0, string_literal66_tree);

            name=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Interface510); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            char_literal67=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_Interface512); 
            char_literal67_tree = this.adaptor.create(char_literal67);
            this.adaptor.addChild(root_0, char_literal67_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:55:27: ( 'providingComponentTypes' '(' providingcomponenttypes+= ID ( ',' providingcomponenttypes+= ID )* ')' )?
            var alt26=2;
            var LA26_0 = this.input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:55:28: 'providingComponentTypes' '(' providingcomponenttypes+= ID ( ',' providingcomponenttypes+= ID )* ')'
                    string_literal68=this.match(this.input,35,InternalHummingbirdParser.FOLLOW_35_in_rule_Interface515); 
                    string_literal68_tree = this.adaptor.create(string_literal68);
                    this.adaptor.addChild(root_0, string_literal68_tree);

                    char_literal69=this.match(this.input,30,InternalHummingbirdParser.FOLLOW_30_in_rule_Interface517); 
                    char_literal69_tree = this.adaptor.create(char_literal69);
                    this.adaptor.addChild(root_0, char_literal69_tree);

                    providingcomponenttypes=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Interface521); 
                    providingcomponenttypes_tree = this.adaptor.create(providingcomponenttypes);
                    this.adaptor.addChild(root_0, providingcomponenttypes_tree);

                    if (org.antlr.lang.isNull(list_providingcomponenttypes)) list_providingcomponenttypes = [];
                    list_providingcomponenttypes.push(providingcomponenttypes);

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:55:86: ( ',' providingcomponenttypes+= ID )*
                    loop25:
                    do {
                        var alt25=2;
                        var LA25_0 = this.input.LA(1);

                        if ( (LA25_0==13) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:55:87: ',' providingcomponenttypes+= ID
                            char_literal70=this.match(this.input,13,InternalHummingbirdParser.FOLLOW_13_in_rule_Interface524); 
                            char_literal70_tree = this.adaptor.create(char_literal70);
                            this.adaptor.addChild(root_0, char_literal70_tree);

                            providingcomponenttypes=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Interface528); 
                            providingcomponenttypes_tree = this.adaptor.create(providingcomponenttypes);
                            this.adaptor.addChild(root_0, providingcomponenttypes_tree);

                            if (org.antlr.lang.isNull(list_providingcomponenttypes)) list_providingcomponenttypes = [];
                            list_providingcomponenttypes.push(providingcomponenttypes);



                            break;

                        default :
                            break loop25;
                        }
                    } while (true);

                    char_literal71=this.match(this.input,31,InternalHummingbirdParser.FOLLOW_31_in_rule_Interface532); 
                    char_literal71_tree = this.adaptor.create(char_literal71);
                    this.adaptor.addChild(root_0, char_literal71_tree);



                    break;

            }

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:55:127: ( 'requiringPorts' '(' requiringports+= ID ( ',' requiringports+= ID )* ')' )?
            var alt28=2;
            var LA28_0 = this.input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:55:128: 'requiringPorts' '(' requiringports+= ID ( ',' requiringports+= ID )* ')'
                    string_literal72=this.match(this.input,36,InternalHummingbirdParser.FOLLOW_36_in_rule_Interface537); 
                    string_literal72_tree = this.adaptor.create(string_literal72);
                    this.adaptor.addChild(root_0, string_literal72_tree);

                    char_literal73=this.match(this.input,30,InternalHummingbirdParser.FOLLOW_30_in_rule_Interface539); 
                    char_literal73_tree = this.adaptor.create(char_literal73);
                    this.adaptor.addChild(root_0, char_literal73_tree);

                    requiringports=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Interface543); 
                    requiringports_tree = this.adaptor.create(requiringports);
                    this.adaptor.addChild(root_0, requiringports_tree);

                    if (org.antlr.lang.isNull(list_requiringports)) list_requiringports = [];
                    list_requiringports.push(requiringports);

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:55:168: ( ',' requiringports+= ID )*
                    loop27:
                    do {
                        var alt27=2;
                        var LA27_0 = this.input.LA(1);

                        if ( (LA27_0==13) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:55:169: ',' requiringports+= ID
                            char_literal74=this.match(this.input,13,InternalHummingbirdParser.FOLLOW_13_in_rule_Interface546); 
                            char_literal74_tree = this.adaptor.create(char_literal74);
                            this.adaptor.addChild(root_0, char_literal74_tree);

                            requiringports=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Interface550); 
                            requiringports_tree = this.adaptor.create(requiringports);
                            this.adaptor.addChild(root_0, requiringports_tree);

                            if (org.antlr.lang.isNull(list_requiringports)) list_requiringports = [];
                            list_requiringports.push(requiringports);



                            break;

                        default :
                            break loop27;
                        }
                    } while (true);

                    char_literal75=this.match(this.input,31,InternalHummingbirdParser.FOLLOW_31_in_rule_Interface554); 
                    char_literal75_tree = this.adaptor.create(char_literal75);
                    this.adaptor.addChild(root_0, char_literal75_tree);



                    break;

            }

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:55:200: ( 'description' description= rule_Description )?
            var alt29=2;
            var LA29_0 = this.input.LA(1);

            if ( (LA29_0==11) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:55:201: 'description' description= rule_Description
                    string_literal76=this.match(this.input,11,InternalHummingbirdParser.FOLLOW_11_in_rule_Interface559); 
                    string_literal76_tree = this.adaptor.create(string_literal76);
                    this.adaptor.addChild(root_0, string_literal76_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Description_in_rule_Interface563);
                    description=this.rule_Description();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, description.getTree());


                    break;

            }

            char_literal77=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_Interface567); 
            char_literal77_tree = this.adaptor.create(char_literal77);
            this.adaptor.addChild(root_0, char_literal77_tree);




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
    rule_Port_return: (function() {
        InternalHummingbirdParser.rule_Port_return = function(){};
        org.antlr.lang.extend(InternalHummingbirdParser.rule_Port_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:58:1: rule_Port : 'Port' name= ID '{' 'minProviderCount' minprovidercount= rule_Integer 'maxProviderCount' maxprovidercount= rule_Integer 'requiredInterface' requiredinterface= ID ( 'description' description= rule_Description )? '}' ;
    // $ANTLR start "rule_Port"
    rule_Port: function() {
        var retval = new InternalHummingbirdParser.rule_Port_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var requiredinterface = null;
        var string_literal78 = null;
        var char_literal79 = null;
        var string_literal80 = null;
        var string_literal81 = null;
        var string_literal82 = null;
        var string_literal83 = null;
        var char_literal84 = null;
         var minprovidercount = null;
         var maxprovidercount = null;
         var description = null;

        var name_tree=null;
        var requiredinterface_tree=null;
        var string_literal78_tree=null;
        var char_literal79_tree=null;
        var string_literal80_tree=null;
        var string_literal81_tree=null;
        var string_literal82_tree=null;
        var string_literal83_tree=null;
        var char_literal84_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:59:3: ( 'Port' name= ID '{' 'minProviderCount' minprovidercount= rule_Integer 'maxProviderCount' maxprovidercount= rule_Integer 'requiredInterface' requiredinterface= ID ( 'description' description= rule_Description )? '}' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:60:3: 'Port' name= ID '{' 'minProviderCount' minprovidercount= rule_Integer 'maxProviderCount' maxprovidercount= rule_Integer 'requiredInterface' requiredinterface= ID ( 'description' description= rule_Description )? '}'
            root_0 = this.adaptor.nil();

            string_literal78=this.match(this.input,37,InternalHummingbirdParser.FOLLOW_37_in_rule_Port582); 
            string_literal78_tree = this.adaptor.create(string_literal78);
            this.adaptor.addChild(root_0, string_literal78_tree);

            name=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Port586); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            char_literal79=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_Port588); 
            char_literal79_tree = this.adaptor.create(char_literal79);
            this.adaptor.addChild(root_0, char_literal79_tree);

            string_literal80=this.match(this.input,38,InternalHummingbirdParser.FOLLOW_38_in_rule_Port590); 
            string_literal80_tree = this.adaptor.create(string_literal80);
            this.adaptor.addChild(root_0, string_literal80_tree);

            this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Integer_in_rule_Port594);
            minprovidercount=this.rule_Integer();

            this.state._fsp--;

            this.adaptor.addChild(root_0, minprovidercount.getTree());
            string_literal81=this.match(this.input,39,InternalHummingbirdParser.FOLLOW_39_in_rule_Port596); 
            string_literal81_tree = this.adaptor.create(string_literal81);
            this.adaptor.addChild(root_0, string_literal81_tree);

            this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Integer_in_rule_Port600);
            maxprovidercount=this.rule_Integer();

            this.state._fsp--;

            this.adaptor.addChild(root_0, maxprovidercount.getTree());
            string_literal82=this.match(this.input,40,InternalHummingbirdParser.FOLLOW_40_in_rule_Port602); 
            string_literal82_tree = this.adaptor.create(string_literal82);
            this.adaptor.addChild(root_0, string_literal82_tree);

            requiredinterface=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Port606); 
            requiredinterface_tree = this.adaptor.create(requiredinterface);
            this.adaptor.addChild(root_0, requiredinterface_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:60:161: ( 'description' description= rule_Description )?
            var alt30=2;
            var LA30_0 = this.input.LA(1);

            if ( (LA30_0==11) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:60:162: 'description' description= rule_Description
                    string_literal83=this.match(this.input,11,InternalHummingbirdParser.FOLLOW_11_in_rule_Port609); 
                    string_literal83_tree = this.adaptor.create(string_literal83);
                    this.adaptor.addChild(root_0, string_literal83_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Description_in_rule_Port613);
                    description=this.rule_Description();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, description.getTree());


                    break;

            }

            char_literal84=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_Port617); 
            char_literal84_tree = this.adaptor.create(char_literal84);
            this.adaptor.addChild(root_0, char_literal84_tree);




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
    rule_Parameter_return: (function() {
        InternalHummingbirdParser.rule_Parameter_return = function(){};
        org.antlr.lang.extend(InternalHummingbirdParser.rule_Parameter_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:63:1: rule_Parameter : (optional= 'optional' )? 'Parameter' name= ID '{' ( 'dataType' datatype= STRING )? ( 'description' description= rule_Description )? '}' ;
    // $ANTLR start "rule_Parameter"
    rule_Parameter: function() {
        var retval = new InternalHummingbirdParser.rule_Parameter_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var optional = null;
        var name = null;
        var datatype = null;
        var string_literal85 = null;
        var char_literal86 = null;
        var string_literal87 = null;
        var string_literal88 = null;
        var char_literal89 = null;
         var description = null;

        var optional_tree=null;
        var name_tree=null;
        var datatype_tree=null;
        var string_literal85_tree=null;
        var char_literal86_tree=null;
        var string_literal87_tree=null;
        var string_literal88_tree=null;
        var char_literal89_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:64:3: ( (optional= 'optional' )? 'Parameter' name= ID '{' ( 'dataType' datatype= STRING )? ( 'description' description= rule_Description )? '}' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:65:3: (optional= 'optional' )? 'Parameter' name= ID '{' ( 'dataType' datatype= STRING )? ( 'description' description= rule_Description )? '}'
            root_0 = this.adaptor.nil();

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:65:11: (optional= 'optional' )?
            var alt31=2;
            var LA31_0 = this.input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:65:11: optional= 'optional'
                    optional=this.match(this.input,41,InternalHummingbirdParser.FOLLOW_41_in_rule_Parameter634); 
                    optional_tree = this.adaptor.create(optional);
                    this.adaptor.addChild(root_0, optional_tree);



                    break;

            }

            string_literal85=this.match(this.input,42,InternalHummingbirdParser.FOLLOW_42_in_rule_Parameter637); 
            string_literal85_tree = this.adaptor.create(string_literal85);
            this.adaptor.addChild(root_0, string_literal85_tree);

            name=this.match(this.input,ID,InternalHummingbirdParser.FOLLOW_ID_in_rule_Parameter641); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            char_literal86=this.match(this.input,10,InternalHummingbirdParser.FOLLOW_10_in_rule_Parameter643); 
            char_literal86_tree = this.adaptor.create(char_literal86);
            this.adaptor.addChild(root_0, char_literal86_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:65:48: ( 'dataType' datatype= STRING )?
            var alt32=2;
            var LA32_0 = this.input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:65:49: 'dataType' datatype= STRING
                    string_literal87=this.match(this.input,43,InternalHummingbirdParser.FOLLOW_43_in_rule_Parameter646); 
                    string_literal87_tree = this.adaptor.create(string_literal87);
                    this.adaptor.addChild(root_0, string_literal87_tree);

                    datatype=this.match(this.input,STRING,InternalHummingbirdParser.FOLLOW_STRING_in_rule_Parameter650); 
                    datatype_tree = this.adaptor.create(datatype);
                    this.adaptor.addChild(root_0, datatype_tree);



                    break;

            }

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:65:78: ( 'description' description= rule_Description )?
            var alt33=2;
            var LA33_0 = this.input.LA(1);

            if ( (LA33_0==11) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:65:79: 'description' description= rule_Description
                    string_literal88=this.match(this.input,11,InternalHummingbirdParser.FOLLOW_11_in_rule_Parameter655); 
                    string_literal88_tree = this.adaptor.create(string_literal88);
                    this.adaptor.addChild(root_0, string_literal88_tree);

                    this.pushFollow(InternalHummingbirdParser.FOLLOW_rule_Description_in_rule_Parameter659);
                    description=this.rule_Description();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, description.getTree());


                    break;

            }

            char_literal89=this.match(this.input,14,InternalHummingbirdParser.FOLLOW_14_in_rule_Parameter663); 
            char_literal89_tree = this.adaptor.create(char_literal89);
            this.adaptor.addChild(root_0, char_literal89_tree);




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
    rule_Integer_return: (function() {
        InternalHummingbirdParser.rule_Integer_return = function(){};
        org.antlr.lang.extend(InternalHummingbirdParser.rule_Integer_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:68:1: rule_Integer : ( '-' )? INT ;
    // $ANTLR start "rule_Integer"
    rule_Integer: function() {
        var retval = new InternalHummingbirdParser.rule_Integer_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal90 = null;
        var INT91 = null;

        var char_literal90_tree=null;
        var INT91_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:69:3: ( ( '-' )? INT )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:70:3: ( '-' )? INT
            root_0 = this.adaptor.nil();

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:70:3: ( '-' )?
            var alt34=2;
            var LA34_0 = this.input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:70:3: '-'
                    char_literal90=this.match(this.input,44,InternalHummingbirdParser.FOLLOW_44_in_rule_Integer678); 
                    char_literal90_tree = this.adaptor.create(char_literal90);
                    this.adaptor.addChild(root_0, char_literal90_tree);



                    break;

            }

            INT91=this.match(this.input,INT,InternalHummingbirdParser.FOLLOW_INT_in_rule_Integer681); 
            INT91_tree = this.adaptor.create(INT91);
            this.adaptor.addChild(root_0, INT91_tree);




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
    rule_Boolean_return: (function() {
        InternalHummingbirdParser.rule_Boolean_return = function(){};
        org.antlr.lang.extend(InternalHummingbirdParser.rule_Boolean_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:73:1: rule_Boolean : ( 'true' | 'false' );
    // $ANTLR start "rule_Boolean"
    rule_Boolean: function() {
        var retval = new InternalHummingbirdParser.rule_Boolean_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var set92 = null;

        var set92_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:74:3: ( 'true' | 'false' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:
            root_0 = this.adaptor.nil();

            set92=this.input.LT(1);
            if ( (this.input.LA(1)>=45 && this.input.LA(1)<=46) ) {
                this.input.consume();
                this.adaptor.addChild(root_0, this.adaptor.create(set92));
                this.state.errorRecovery=false;
            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                throw mse;
            }




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
    rule_Identifiable_return: (function() {
        InternalHummingbirdParser.rule_Identifiable_return = function(){};
        org.antlr.lang.extend(InternalHummingbirdParser.rule_Identifiable_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:79:1: rule_Identifiable : idantifiable= ( STRING | ID ) ;
    // $ANTLR start "rule_Identifiable"
    rule_Identifiable: function() {
        var retval = new InternalHummingbirdParser.rule_Identifiable_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var idantifiable = null;

        var idantifiable_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:80:3: (idantifiable= ( STRING | ID ) )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:81:3: idantifiable= ( STRING | ID )
            root_0 = this.adaptor.nil();

            idantifiable=this.input.LT(1);
            if ( (this.input.LA(1)>=ID && this.input.LA(1)<=STRING) ) {
                this.input.consume();
                this.adaptor.addChild(root_0, this.adaptor.create(idantifiable));
                this.state.errorRecovery=false;
            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                throw mse;
            }




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
    rule_Description_return: (function() {
        InternalHummingbirdParser.rule_Description_return = function(){};
        org.antlr.lang.extend(InternalHummingbirdParser.rule_Description_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:88:1: rule_Description : description= STRING ;
    // $ANTLR start "rule_Description"
    rule_Description: function() {
        var retval = new InternalHummingbirdParser.rule_Description_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var description = null;

        var description_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:89:3: (description= STRING )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-js\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\parser\\InternalHummingbird.g:90:3: description= STRING
            root_0 = this.adaptor.nil();

            description=this.match(this.input,STRING,InternalHummingbirdParser.FOLLOW_STRING_in_rule_Description757); 
            description_tree = this.adaptor.create(description);
            this.adaptor.addChild(root_0, description_tree);




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
org.antlr.lang.augmentObject(InternalHummingbirdParser, {
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "STRING", "INT", "COMMENT", "WS", "'Application'", "'{'", "'description'", "'components'", "','", "'}'", "'Component'", "'type'", "'incomingConnections'", "'outgoingConnections'", "'parameterValues'", "'Connection'", "'sourcePort'", "'targetComponent'", "'ParameterValue'", "'value'", "'Platform'", "'componentTypes'", "'interfaces'", "'ComponentType'", "'providedInterfaces'", "'('", "')'", "'ports'", "'parameters'", "'Interface'", "'providingComponentTypes'", "'requiringPorts'", "'Port'", "'minProviderCount'", "'maxProviderCount'", "'requiredInterface'", "'optional'", "'Parameter'", "'dataType'", "'-'", "'true'", "'false'"],
    FOLLOW_rule_Application_in_rule_EntryPoint75: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Platform_in_rule_EntryPoint81: new org.antlr.runtime.BitSet([0x00000000, 0x00000000]),
    FOLLOW_EOF_in_rule_EntryPoint83: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_9_in_rule_Application99: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Application103: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_Application105: new org.antlr.runtime.BitSet([0x00001800, 0x00000000]),
    FOLLOW_11_in_rule_Application108: new org.antlr.runtime.BitSet([0x00000020, 0x00000000]),
    FOLLOW_rule_Description_in_rule_Application112: new org.antlr.runtime.BitSet([0x00001000, 0x00000000]),
    FOLLOW_12_in_rule_Application116: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_Application118: new org.antlr.runtime.BitSet([0x00008000, 0x00000000]),
    FOLLOW_rule_Component_in_rule_Application122: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_13_in_rule_Application125: new org.antlr.runtime.BitSet([0x00008000, 0x00000000]),
    FOLLOW_rule_Component_in_rule_Application129: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_14_in_rule_Application133: new org.antlr.runtime.BitSet([0x00004000, 0x00000000]),
    FOLLOW_14_in_rule_Application135: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_15_in_rule_Component150: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Component154: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_Component156: new org.antlr.runtime.BitSet([0x000F4800, 0x00000000]),
    FOLLOW_16_in_rule_Component159: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Component163: new org.antlr.runtime.BitSet([0x000E4800, 0x00000000]),
    FOLLOW_17_in_rule_Component168: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Component172: new org.antlr.runtime.BitSet([0x000C4800, 0x00000000]),
    FOLLOW_11_in_rule_Component177: new org.antlr.runtime.BitSet([0x00000020, 0x00000000]),
    FOLLOW_rule_Description_in_rule_Component181: new org.antlr.runtime.BitSet([0x000C4000, 0x00000000]),
    FOLLOW_18_in_rule_Component186: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_Component188: new org.antlr.runtime.BitSet([0x00100000, 0x00000000]),
    FOLLOW_rule_Connection_in_rule_Component192: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_13_in_rule_Component195: new org.antlr.runtime.BitSet([0x00100000, 0x00000000]),
    FOLLOW_rule_Connection_in_rule_Component199: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_14_in_rule_Component203: new org.antlr.runtime.BitSet([0x00084000, 0x00000000]),
    FOLLOW_19_in_rule_Component208: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_Component210: new org.antlr.runtime.BitSet([0x00800000, 0x00000000]),
    FOLLOW_rule_ParameterValue_in_rule_Component214: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_13_in_rule_Component217: new org.antlr.runtime.BitSet([0x00800000, 0x00000000]),
    FOLLOW_rule_ParameterValue_in_rule_Component221: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_14_in_rule_Component225: new org.antlr.runtime.BitSet([0x00004000, 0x00000000]),
    FOLLOW_14_in_rule_Component229: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_20_in_rule_Connection244: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Connection248: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_Connection250: new org.antlr.runtime.BitSet([0x00200000, 0x00000000]),
    FOLLOW_21_in_rule_Connection252: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Connection256: new org.antlr.runtime.BitSet([0x00400000, 0x00000000]),
    FOLLOW_22_in_rule_Connection258: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Connection262: new org.antlr.runtime.BitSet([0x00004800, 0x00000000]),
    FOLLOW_11_in_rule_Connection265: new org.antlr.runtime.BitSet([0x00000020, 0x00000000]),
    FOLLOW_rule_Description_in_rule_Connection269: new org.antlr.runtime.BitSet([0x00004000, 0x00000000]),
    FOLLOW_14_in_rule_Connection273: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_23_in_rule_ParameterValue288: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_ParameterValue292: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_ParameterValue294: new org.antlr.runtime.BitSet([0x01010000, 0x00000000]),
    FOLLOW_24_in_rule_ParameterValue297: new org.antlr.runtime.BitSet([0x00000020, 0x00000000]),
    FOLLOW_STRING_in_rule_ParameterValue301: new org.antlr.runtime.BitSet([0x00010000, 0x00000000]),
    FOLLOW_16_in_rule_ParameterValue305: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_ParameterValue309: new org.antlr.runtime.BitSet([0x00004800, 0x00000000]),
    FOLLOW_11_in_rule_ParameterValue312: new org.antlr.runtime.BitSet([0x00000020, 0x00000000]),
    FOLLOW_rule_Description_in_rule_ParameterValue316: new org.antlr.runtime.BitSet([0x00004000, 0x00000000]),
    FOLLOW_14_in_rule_ParameterValue320: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_25_in_rule_Platform335: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Platform339: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_Platform341: new org.antlr.runtime.BitSet([0x04000800, 0x00000000]),
    FOLLOW_11_in_rule_Platform344: new org.antlr.runtime.BitSet([0x00000020, 0x00000000]),
    FOLLOW_rule_Description_in_rule_Platform348: new org.antlr.runtime.BitSet([0x04000000, 0x00000000]),
    FOLLOW_26_in_rule_Platform352: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_Platform354: new org.antlr.runtime.BitSet([0x10000000, 0x00000000]),
    FOLLOW_rule_ComponentType_in_rule_Platform358: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_13_in_rule_Platform361: new org.antlr.runtime.BitSet([0x10000000, 0x00000000]),
    FOLLOW_rule_ComponentType_in_rule_Platform365: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_14_in_rule_Platform369: new org.antlr.runtime.BitSet([0x08004000, 0x00000000]),
    FOLLOW_27_in_rule_Platform372: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_Platform374: new org.antlr.runtime.BitSet([0x00000000, 0x00000004]),
    FOLLOW_rule_Interface_in_rule_Platform378: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_13_in_rule_Platform381: new org.antlr.runtime.BitSet([0x00000000, 0x00000004]),
    FOLLOW_rule_Interface_in_rule_Platform385: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_14_in_rule_Platform389: new org.antlr.runtime.BitSet([0x00004000, 0x00000000]),
    FOLLOW_14_in_rule_Platform393: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_28_in_rule_ComponentType408: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_ComponentType412: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_ComponentType414: new org.antlr.runtime.BitSet([0x20004800, 0x00000003]),
    FOLLOW_29_in_rule_ComponentType417: new org.antlr.runtime.BitSet([0x40000000, 0x00000000]),
    FOLLOW_30_in_rule_ComponentType419: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_ComponentType423: new org.antlr.runtime.BitSet([0x80002000, 0x00000000]),
    FOLLOW_13_in_rule_ComponentType426: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_ComponentType430: new org.antlr.runtime.BitSet([0x80002000, 0x00000000]),
    FOLLOW_31_in_rule_ComponentType434: new org.antlr.runtime.BitSet([0x00004800, 0x00000003]),
    FOLLOW_11_in_rule_ComponentType439: new org.antlr.runtime.BitSet([0x00000020, 0x00000000]),
    FOLLOW_rule_Description_in_rule_ComponentType443: new org.antlr.runtime.BitSet([0x00004000, 0x00000003]),
    FOLLOW_32_in_rule_ComponentType448: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_ComponentType450: new org.antlr.runtime.BitSet([0x00000000, 0x00000020]),
    FOLLOW_rule_Port_in_rule_ComponentType454: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_13_in_rule_ComponentType457: new org.antlr.runtime.BitSet([0x00000000, 0x00000020]),
    FOLLOW_rule_Port_in_rule_ComponentType461: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_14_in_rule_ComponentType465: new org.antlr.runtime.BitSet([0x00004000, 0x00000002]),
    FOLLOW_33_in_rule_ComponentType470: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_ComponentType472: new org.antlr.runtime.BitSet([0x00000000, 0x00000600]),
    FOLLOW_rule_Parameter_in_rule_ComponentType476: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_13_in_rule_ComponentType479: new org.antlr.runtime.BitSet([0x00000000, 0x00000600]),
    FOLLOW_rule_Parameter_in_rule_ComponentType483: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_14_in_rule_ComponentType487: new org.antlr.runtime.BitSet([0x00004000, 0x00000000]),
    FOLLOW_14_in_rule_ComponentType491: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_34_in_rule_Interface506: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Interface510: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_Interface512: new org.antlr.runtime.BitSet([0x00004800, 0x00000018]),
    FOLLOW_35_in_rule_Interface515: new org.antlr.runtime.BitSet([0x40000000, 0x00000000]),
    FOLLOW_30_in_rule_Interface517: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Interface521: new org.antlr.runtime.BitSet([0x80002000, 0x00000000]),
    FOLLOW_13_in_rule_Interface524: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Interface528: new org.antlr.runtime.BitSet([0x80002000, 0x00000000]),
    FOLLOW_31_in_rule_Interface532: new org.antlr.runtime.BitSet([0x00004800, 0x00000010]),
    FOLLOW_36_in_rule_Interface537: new org.antlr.runtime.BitSet([0x40000000, 0x00000000]),
    FOLLOW_30_in_rule_Interface539: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Interface543: new org.antlr.runtime.BitSet([0x80002000, 0x00000000]),
    FOLLOW_13_in_rule_Interface546: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Interface550: new org.antlr.runtime.BitSet([0x80002000, 0x00000000]),
    FOLLOW_31_in_rule_Interface554: new org.antlr.runtime.BitSet([0x00004800, 0x00000000]),
    FOLLOW_11_in_rule_Interface559: new org.antlr.runtime.BitSet([0x00000020, 0x00000000]),
    FOLLOW_rule_Description_in_rule_Interface563: new org.antlr.runtime.BitSet([0x00004000, 0x00000000]),
    FOLLOW_14_in_rule_Interface567: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_37_in_rule_Port582: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Port586: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_Port588: new org.antlr.runtime.BitSet([0x00000000, 0x00000040]),
    FOLLOW_38_in_rule_Port590: new org.antlr.runtime.BitSet([0x00000040, 0x00001000]),
    FOLLOW_rule_Integer_in_rule_Port594: new org.antlr.runtime.BitSet([0x00000000, 0x00000080]),
    FOLLOW_39_in_rule_Port596: new org.antlr.runtime.BitSet([0x00000040, 0x00001000]),
    FOLLOW_rule_Integer_in_rule_Port600: new org.antlr.runtime.BitSet([0x00000000, 0x00000100]),
    FOLLOW_40_in_rule_Port602: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Port606: new org.antlr.runtime.BitSet([0x00004800, 0x00000000]),
    FOLLOW_11_in_rule_Port609: new org.antlr.runtime.BitSet([0x00000020, 0x00000000]),
    FOLLOW_rule_Description_in_rule_Port613: new org.antlr.runtime.BitSet([0x00004000, 0x00000000]),
    FOLLOW_14_in_rule_Port617: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_41_in_rule_Parameter634: new org.antlr.runtime.BitSet([0x00000000, 0x00000400]),
    FOLLOW_42_in_rule_Parameter637: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Parameter641: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_Parameter643: new org.antlr.runtime.BitSet([0x00004800, 0x00000800]),
    FOLLOW_43_in_rule_Parameter646: new org.antlr.runtime.BitSet([0x00000020, 0x00000000]),
    FOLLOW_STRING_in_rule_Parameter650: new org.antlr.runtime.BitSet([0x00004800, 0x00000000]),
    FOLLOW_11_in_rule_Parameter655: new org.antlr.runtime.BitSet([0x00000020, 0x00000000]),
    FOLLOW_rule_Description_in_rule_Parameter659: new org.antlr.runtime.BitSet([0x00004000, 0x00000000]),
    FOLLOW_14_in_rule_Parameter663: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_44_in_rule_Integer678: new org.antlr.runtime.BitSet([0x00000040, 0x00000000]),
    FOLLOW_INT_in_rule_Integer681: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_set_in_rule_Boolean0: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_set_in_rule_Identifiable722: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_STRING_in_rule_Description757: new org.antlr.runtime.BitSet([0x00000002, 0x00000000])
});

})();