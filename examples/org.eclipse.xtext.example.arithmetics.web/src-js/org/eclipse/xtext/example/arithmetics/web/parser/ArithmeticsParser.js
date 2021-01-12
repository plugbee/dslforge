// $ANTLR 3.3 avr. 19, 2016 01:13:22 D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g 2021-01-12 14:06:59



var ArithmeticsParser = function(input, state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    ArithmeticsParser.superclass.constructor.call(this, input, state);


         

    /* @todo only create adaptor if output=AST */
    this.adaptor = new org.antlr.runtime.tree.CommonTreeAdaptor();

};

org.antlr.lang.augmentObject(ArithmeticsParser, {
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
    ID: 4,
    INT: 5,
    STRING: 6,
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
    ID= 4,
    INT= 5,
    STRING= 6,
    COMMENT= 7,
    WS= 8;

// public instance methods/vars
org.antlr.lang.extend(ArithmeticsParser, org.antlr.runtime.Parser, {
        
    setTreeAdaptor: function(adaptor) {
        this.adaptor = adaptor;
    },
    getTreeAdaptor: function() {
        return this.adaptor;
    },

    getTokenNames: function() { return ArithmeticsParser.tokenNames; },
    getGrammarFileName: function() { return "D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g"; }
});
org.antlr.lang.augmentObject(ArithmeticsParser.prototype, {

    // inline static return class
    rule_Module_return: (function() {
        ArithmeticsParser.rule_Module_return = function(){};
        org.antlr.lang.extend(ArithmeticsParser.rule_Module_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:20:1: rule_Module : 'module' name= ID (imports+= rule_Import )* (statements+= rule_Statement )* EOF ;
    // $ANTLR start "rule_Module"
    rule_Module: function() {
        var retval = new ArithmeticsParser.rule_Module_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var string_literal1 = null;
        var EOF2 = null;
        var list_imports=null;
        var list_statements=null;
        var imports = null;
        var statements = null;
        var name_tree=null;
        var string_literal1_tree=null;
        var EOF2_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:20:12: ( 'module' name= ID (imports+= rule_Import )* (statements+= rule_Statement )* EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:21:2: 'module' name= ID (imports+= rule_Import )* (statements+= rule_Statement )* EOF
            root_0 = this.adaptor.nil();

            string_literal1=this.match(this.input,9,ArithmeticsParser.FOLLOW_9_in_rule_Module67); 
            string_literal1_tree = this.adaptor.create(string_literal1);
            this.adaptor.addChild(root_0, string_literal1_tree);

            name=this.match(this.input,ID,ArithmeticsParser.FOLLOW_ID_in_rule_Module71); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:22:2: (imports+= rule_Import )*
            loop1:
            do {
                var alt1=2;
                var LA1_0 = this.input.LA(1);

                if ( (LA1_0==10) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:22:3: imports+= rule_Import
                    this.pushFollow(ArithmeticsParser.FOLLOW_rule_Import_in_rule_Module77);
                    imports=this.rule_Import();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, imports.getTree());
                    if (org.antlr.lang.isNull(list_imports)) list_imports = [];
                    list_imports.push(imports.getTree());



                    break;

                default :
                    break loop1;
                }
            } while (true);

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:23:2: (statements+= rule_Statement )*
            loop2:
            do {
                var alt2=2;
                var LA2_0 = this.input.LA(1);

                if ( ((LA2_0>=ID && LA2_0<=INT)||(LA2_0>=11 && LA2_0<=12)) ) {
                    alt2=1;
                }


                switch (alt2) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:23:3: statements+= rule_Statement
                    this.pushFollow(ArithmeticsParser.FOLLOW_rule_Statement_in_rule_Module85);
                    statements=this.rule_Statement();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, statements.getTree());
                    if (org.antlr.lang.isNull(list_statements)) list_statements = [];
                    list_statements.push(statements.getTree());



                    break;

                default :
                    break loop2;
                }
            } while (true);

            EOF2=this.match(this.input,EOF,ArithmeticsParser.FOLLOW_EOF_in_rule_Module89); 



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
    rule_Import_return: (function() {
        ArithmeticsParser.rule_Import_return = function(){};
        org.antlr.lang.extend(ArithmeticsParser.rule_Import_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:28:1: rule_Import : 'import' module= ID ;
    // $ANTLR start "rule_Import"
    rule_Import: function() {
        var retval = new ArithmeticsParser.rule_Import_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var module = null;
        var string_literal3 = null;

        var module_tree=null;
        var string_literal3_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:28:12: ( 'import' module= ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:29:2: 'import' module= ID
            root_0 = this.adaptor.nil();

            string_literal3=this.match(this.input,10,ArithmeticsParser.FOLLOW_10_in_rule_Import101); 
            string_literal3_tree = this.adaptor.create(string_literal3);
            this.adaptor.addChild(root_0, string_literal3_tree);

            module=this.match(this.input,ID,ArithmeticsParser.FOLLOW_ID_in_rule_Import105); 
            module_tree = this.adaptor.create(module);
            this.adaptor.addChild(root_0, module_tree);




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
    rule_Statement_return: (function() {
        ArithmeticsParser.rule_Statement_return = function(){};
        org.antlr.lang.extend(ArithmeticsParser.rule_Statement_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:34:1: rule_Statement : ( rule_Definition | rule_Evaluation );
    // $ANTLR start "rule_Statement"
    rule_Statement: function() {
        var retval = new ArithmeticsParser.rule_Statement_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_Definition4 = null;
         var rule_Evaluation5 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:34:15: ( rule_Definition | rule_Evaluation )
            var alt3=2;
            var LA3_0 = this.input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=ID && LA3_0<=INT)||LA3_0==12) ) {
                alt3=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 3, 0, this.input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:35:2: rule_Definition
                    root_0 = this.adaptor.nil();

                    this.pushFollow(ArithmeticsParser.FOLLOW_rule_Definition_in_rule_Statement116);
                    rule_Definition4=this.rule_Definition();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Definition4.getTree());


                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:35:20: rule_Evaluation
                    root_0 = this.adaptor.nil();

                    this.pushFollow(ArithmeticsParser.FOLLOW_rule_Evaluation_in_rule_Statement120);
                    rule_Evaluation5=this.rule_Evaluation();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Evaluation5.getTree());


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
    rule_Definition_return: (function() {
        ArithmeticsParser.rule_Definition_return = function(){};
        org.antlr.lang.extend(ArithmeticsParser.rule_Definition_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:40:1: rule_Definition : 'def' name= ID ( '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')' )? ':' expr= rule_Expression ';' ;
    // $ANTLR start "rule_Definition"
    rule_Definition: function() {
        var retval = new ArithmeticsParser.rule_Definition_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var string_literal6 = null;
        var char_literal7 = null;
        var char_literal8 = null;
        var char_literal9 = null;
        var char_literal10 = null;
        var char_literal11 = null;
        var list_args=null;
         var expr = null;
        var args = null;
        var name_tree=null;
        var string_literal6_tree=null;
        var char_literal7_tree=null;
        var char_literal8_tree=null;
        var char_literal9_tree=null;
        var char_literal10_tree=null;
        var char_literal11_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:40:16: ( 'def' name= ID ( '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')' )? ':' expr= rule_Expression ';' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:41:2: 'def' name= ID ( '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')' )? ':' expr= rule_Expression ';'
            root_0 = this.adaptor.nil();

            string_literal6=this.match(this.input,11,ArithmeticsParser.FOLLOW_11_in_rule_Definition131); 
            string_literal6_tree = this.adaptor.create(string_literal6);
            this.adaptor.addChild(root_0, string_literal6_tree);

            name=this.match(this.input,ID,ArithmeticsParser.FOLLOW_ID_in_rule_Definition135); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:41:16: ( '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')' )?
            var alt5=2;
            var LA5_0 = this.input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:41:17: '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')'
                    char_literal7=this.match(this.input,12,ArithmeticsParser.FOLLOW_12_in_rule_Definition138); 
                    char_literal7_tree = this.adaptor.create(char_literal7);
                    this.adaptor.addChild(root_0, char_literal7_tree);

                    this.pushFollow(ArithmeticsParser.FOLLOW_rule_DeclaredParameter_in_rule_Definition142);
                    args=this.rule_DeclaredParameter();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, args.getTree());
                    if (org.antlr.lang.isNull(list_args)) list_args = [];
                    list_args.push(args.getTree());

                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:41:50: ( ',' args+= rule_DeclaredParameter )*
                    loop4:
                    do {
                        var alt4=2;
                        var LA4_0 = this.input.LA(1);

                        if ( (LA4_0==13) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:41:51: ',' args+= rule_DeclaredParameter
                            char_literal8=this.match(this.input,13,ArithmeticsParser.FOLLOW_13_in_rule_Definition145); 
                            char_literal8_tree = this.adaptor.create(char_literal8);
                            this.adaptor.addChild(root_0, char_literal8_tree);

                            this.pushFollow(ArithmeticsParser.FOLLOW_rule_DeclaredParameter_in_rule_Definition149);
                            args=this.rule_DeclaredParameter();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, args.getTree());
                            if (org.antlr.lang.isNull(list_args)) list_args = [];
                            list_args.push(args.getTree());



                            break;

                        default :
                            break loop4;
                        }
                    } while (true);

                    char_literal9=this.match(this.input,14,ArithmeticsParser.FOLLOW_14_in_rule_Definition153); 
                    char_literal9_tree = this.adaptor.create(char_literal9);
                    this.adaptor.addChild(root_0, char_literal9_tree);



                    break;

            }

            char_literal10=this.match(this.input,15,ArithmeticsParser.FOLLOW_15_in_rule_Definition158); 
            char_literal10_tree = this.adaptor.create(char_literal10);
            this.adaptor.addChild(root_0, char_literal10_tree);

            this.pushFollow(ArithmeticsParser.FOLLOW_rule_Expression_in_rule_Definition162);
            expr=this.rule_Expression();

            this.state._fsp--;

            this.adaptor.addChild(root_0, expr.getTree());
            char_literal11=this.match(this.input,16,ArithmeticsParser.FOLLOW_16_in_rule_Definition164); 
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
    rule_DeclaredParameter_return: (function() {
        ArithmeticsParser.rule_DeclaredParameter_return = function(){};
        org.antlr.lang.extend(ArithmeticsParser.rule_DeclaredParameter_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:47:1: rule_DeclaredParameter : name= ID ;
    // $ANTLR start "rule_DeclaredParameter"
    rule_DeclaredParameter: function() {
        var retval = new ArithmeticsParser.rule_DeclaredParameter_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;

        var name_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:47:23: (name= ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:48:2: name= ID
            root_0 = this.adaptor.nil();

            name=this.match(this.input,ID,ArithmeticsParser.FOLLOW_ID_in_rule_DeclaredParameter177); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);




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
    rule_AbstractDefinition_return: (function() {
        ArithmeticsParser.rule_AbstractDefinition_return = function(){};
        org.antlr.lang.extend(ArithmeticsParser.rule_AbstractDefinition_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:53:1: rule_AbstractDefinition : ( rule_Definition | rule_DeclaredParameter );
    // $ANTLR start "rule_AbstractDefinition"
    rule_AbstractDefinition: function() {
        var retval = new ArithmeticsParser.rule_AbstractDefinition_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_Definition12 = null;
         var rule_DeclaredParameter13 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:53:24: ( rule_Definition | rule_DeclaredParameter )
            var alt6=2;
            var LA6_0 = this.input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==ID) ) {
                alt6=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 6, 0, this.input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:54:2: rule_Definition
                    root_0 = this.adaptor.nil();

                    this.pushFollow(ArithmeticsParser.FOLLOW_rule_Definition_in_rule_AbstractDefinition188);
                    rule_Definition12=this.rule_Definition();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Definition12.getTree());


                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:54:20: rule_DeclaredParameter
                    root_0 = this.adaptor.nil();

                    this.pushFollow(ArithmeticsParser.FOLLOW_rule_DeclaredParameter_in_rule_AbstractDefinition192);
                    rule_DeclaredParameter13=this.rule_DeclaredParameter();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_DeclaredParameter13.getTree());


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
    rule_Evaluation_return: (function() {
        ArithmeticsParser.rule_Evaluation_return = function(){};
        org.antlr.lang.extend(ArithmeticsParser.rule_Evaluation_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:59:1: rule_Evaluation : expression= rule_Expression ';' ;
    // $ANTLR start "rule_Evaluation"
    rule_Evaluation: function() {
        var retval = new ArithmeticsParser.rule_Evaluation_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal14 = null;
         var expression = null;

        var char_literal14_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:59:16: (expression= rule_Expression ';' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:60:2: expression= rule_Expression ';'
            root_0 = this.adaptor.nil();

            this.pushFollow(ArithmeticsParser.FOLLOW_rule_Expression_in_rule_Evaluation205);
            expression=this.rule_Expression();

            this.state._fsp--;

            this.adaptor.addChild(root_0, expression.getTree());
            char_literal14=this.match(this.input,16,ArithmeticsParser.FOLLOW_16_in_rule_Evaluation207); 
            char_literal14_tree = this.adaptor.create(char_literal14);
            this.adaptor.addChild(root_0, char_literal14_tree);




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
    rule_Expression_return: (function() {
        ArithmeticsParser.rule_Expression_return = function(){};
        org.antlr.lang.extend(ArithmeticsParser.rule_Expression_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:65:1: rule_Expression : rule_Addition ;
    // $ANTLR start "rule_Expression"
    rule_Expression: function() {
        var retval = new ArithmeticsParser.rule_Expression_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_Addition15 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:65:16: ( rule_Addition )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:66:2: rule_Addition
            root_0 = this.adaptor.nil();

            this.pushFollow(ArithmeticsParser.FOLLOW_rule_Addition_in_rule_Expression218);
            rule_Addition15=this.rule_Addition();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_Addition15.getTree());



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
    rule_Addition_return: (function() {
        ArithmeticsParser.rule_Addition_return = function(){};
        org.antlr.lang.extend(ArithmeticsParser.rule_Addition_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:71:1: rule_Addition : rule_Multiplication ( ( '+' | '-' ) right= rule_Multiplication )* ;
    // $ANTLR start "rule_Addition"
    rule_Addition: function() {
        var retval = new ArithmeticsParser.rule_Addition_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var set17 = null;
         var right = null;
         var rule_Multiplication16 = null;

        var set17_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:71:15: ( rule_Multiplication ( ( '+' | '-' ) right= rule_Multiplication )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:72:2: rule_Multiplication ( ( '+' | '-' ) right= rule_Multiplication )*
            root_0 = this.adaptor.nil();

            this.pushFollow(ArithmeticsParser.FOLLOW_rule_Multiplication_in_rule_Addition230);
            rule_Multiplication16=this.rule_Multiplication();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_Multiplication16.getTree());
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:72:22: ( ( '+' | '-' ) right= rule_Multiplication )*
            loop7:
            do {
                var alt7=2;
                var LA7_0 = this.input.LA(1);

                if ( ((LA7_0>=17 && LA7_0<=18)) ) {
                    alt7=1;
                }


                switch (alt7) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:72:23: ( '+' | '-' ) right= rule_Multiplication
                    set17=this.input.LT(1);
                    if ( (this.input.LA(1)>=17 && this.input.LA(1)<=18) ) {
                        this.input.consume();
                        this.adaptor.addChild(root_0, this.adaptor.create(set17));
                        this.state.errorRecovery=false;
                    }
                    else {
                        var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                        throw mse;
                    }

                    this.pushFollow(ArithmeticsParser.FOLLOW_rule_Multiplication_in_rule_Addition245);
                    right=this.rule_Multiplication();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, right.getTree());


                    break;

                default :
                    break loop7;
                }
            } while (true);




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
    rule_Multiplication_return: (function() {
        ArithmeticsParser.rule_Multiplication_return = function(){};
        org.antlr.lang.extend(ArithmeticsParser.rule_Multiplication_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:77:1: rule_Multiplication : rule_PrimaryExpression ( ( '*' | '/' ) right= rule_PrimaryExpression )* ;
    // $ANTLR start "rule_Multiplication"
    rule_Multiplication: function() {
        var retval = new ArithmeticsParser.rule_Multiplication_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var set19 = null;
         var right = null;
         var rule_PrimaryExpression18 = null;

        var set19_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:77:21: ( rule_PrimaryExpression ( ( '*' | '/' ) right= rule_PrimaryExpression )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:78:2: rule_PrimaryExpression ( ( '*' | '/' ) right= rule_PrimaryExpression )*
            root_0 = this.adaptor.nil();

            this.pushFollow(ArithmeticsParser.FOLLOW_rule_PrimaryExpression_in_rule_Multiplication259);
            rule_PrimaryExpression18=this.rule_PrimaryExpression();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_PrimaryExpression18.getTree());
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:78:25: ( ( '*' | '/' ) right= rule_PrimaryExpression )*
            loop8:
            do {
                var alt8=2;
                var LA8_0 = this.input.LA(1);

                if ( ((LA8_0>=19 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:78:26: ( '*' | '/' ) right= rule_PrimaryExpression
                    set19=this.input.LT(1);
                    if ( (this.input.LA(1)>=19 && this.input.LA(1)<=20) ) {
                        this.input.consume();
                        this.adaptor.addChild(root_0, this.adaptor.create(set19));
                        this.state.errorRecovery=false;
                    }
                    else {
                        var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                        throw mse;
                    }

                    this.pushFollow(ArithmeticsParser.FOLLOW_rule_PrimaryExpression_in_rule_Multiplication274);
                    right=this.rule_PrimaryExpression();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, right.getTree());


                    break;

                default :
                    break loop8;
                }
            } while (true);




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
    rule_PrimaryExpression_return: (function() {
        ArithmeticsParser.rule_PrimaryExpression_return = function(){};
        org.antlr.lang.extend(ArithmeticsParser.rule_PrimaryExpression_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:83:1: rule_PrimaryExpression : ( '(' rule_Expression ')' | value= INT | func= ID ( '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')' )? );
    // $ANTLR start "rule_PrimaryExpression"
    rule_PrimaryExpression: function() {
        var retval = new ArithmeticsParser.rule_PrimaryExpression_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var value = null;
        var func = null;
        var char_literal20 = null;
        var char_literal22 = null;
        var char_literal23 = null;
        var char_literal24 = null;
        var char_literal25 = null;
        var list_args=null;
         var rule_Expression21 = null;
        var args = null;
        var value_tree=null;
        var func_tree=null;
        var char_literal20_tree=null;
        var char_literal22_tree=null;
        var char_literal23_tree=null;
        var char_literal24_tree=null;
        var char_literal25_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:83:24: ( '(' rule_Expression ')' | value= INT | func= ID ( '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')' )? )
            var alt11=3;
            switch ( this.input.LA(1) ) {
            case 12:
                alt11=1;
                break;
            case INT:
                alt11=2;
                break;
            case ID:
                alt11=3;
                break;
            default:
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 11, 0, this.input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:84:2: '(' rule_Expression ')'
                    root_0 = this.adaptor.nil();

                    char_literal20=this.match(this.input,12,ArithmeticsParser.FOLLOW_12_in_rule_PrimaryExpression288); 
                    char_literal20_tree = this.adaptor.create(char_literal20);
                    this.adaptor.addChild(root_0, char_literal20_tree);

                    this.pushFollow(ArithmeticsParser.FOLLOW_rule_Expression_in_rule_PrimaryExpression290);
                    rule_Expression21=this.rule_Expression();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Expression21.getTree());
                    char_literal22=this.match(this.input,14,ArithmeticsParser.FOLLOW_14_in_rule_PrimaryExpression292); 
                    char_literal22_tree = this.adaptor.create(char_literal22);
                    this.adaptor.addChild(root_0, char_literal22_tree);



                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:85:3: value= INT
                    root_0 = this.adaptor.nil();

                    value=this.match(this.input,INT,ArithmeticsParser.FOLLOW_INT_in_rule_PrimaryExpression300); 
                    value_tree = this.adaptor.create(value);
                    this.adaptor.addChild(root_0, value_tree);



                    break;
                case 3 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:86:3: func= ID ( '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')' )?
                    root_0 = this.adaptor.nil();

                    func=this.match(this.input,ID,ArithmeticsParser.FOLLOW_ID_in_rule_PrimaryExpression308); 
                    func_tree = this.adaptor.create(func);
                    this.adaptor.addChild(root_0, func_tree);

                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:86:11: ( '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')' )?
                    var alt10=2;
                    var LA10_0 = this.input.LA(1);

                    if ( (LA10_0==12) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:86:12: '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')'
                            char_literal23=this.match(this.input,12,ArithmeticsParser.FOLLOW_12_in_rule_PrimaryExpression311); 
                            char_literal23_tree = this.adaptor.create(char_literal23);
                            this.adaptor.addChild(root_0, char_literal23_tree);

                            this.pushFollow(ArithmeticsParser.FOLLOW_rule_Expression_in_rule_PrimaryExpression315);
                            args=this.rule_Expression();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, args.getTree());
                            if (org.antlr.lang.isNull(list_args)) list_args = [];
                            list_args.push(args.getTree());

                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:86:38: ( ',' args+= rule_Expression )*
                            loop9:
                            do {
                                var alt9=2;
                                var LA9_0 = this.input.LA(1);

                                if ( (LA9_0==13) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                                case 1 :
                                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\Arithmetics.g:86:39: ',' args+= rule_Expression
                                    char_literal24=this.match(this.input,13,ArithmeticsParser.FOLLOW_13_in_rule_PrimaryExpression318); 
                                    char_literal24_tree = this.adaptor.create(char_literal24);
                                    this.adaptor.addChild(root_0, char_literal24_tree);

                                    this.pushFollow(ArithmeticsParser.FOLLOW_rule_Expression_in_rule_PrimaryExpression322);
                                    args=this.rule_Expression();

                                    this.state._fsp--;

                                    this.adaptor.addChild(root_0, args.getTree());
                                    if (org.antlr.lang.isNull(list_args)) list_args = [];
                                    list_args.push(args.getTree());



                                    break;

                                default :
                                    break loop9;
                                }
                            } while (true);

                            char_literal25=this.match(this.input,14,ArithmeticsParser.FOLLOW_14_in_rule_PrimaryExpression326); 
                            char_literal25_tree = this.adaptor.create(char_literal25);
                            this.adaptor.addChild(root_0, char_literal25_tree);



                            break;

                    }



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
    }

    // Delegated rules




}, true); // important to pass true to overwrite default implementations

 

// public class variables
org.antlr.lang.augmentObject(ArithmeticsParser, {
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "STRING", "COMMENT", "WS", "'module'", "'import'", "'def'", "'('", "','", "')'", "':'", "';'", "'+'", "'-'", "'*'", "'/'"],
    FOLLOW_9_in_rule_Module67: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Module71: new org.antlr.runtime.BitSet([0x00001C30, 0x00000000]),
    FOLLOW_rule_Import_in_rule_Module77: new org.antlr.runtime.BitSet([0x00001C30, 0x00000000]),
    FOLLOW_rule_Statement_in_rule_Module85: new org.antlr.runtime.BitSet([0x00001830, 0x00000000]),
    FOLLOW_EOF_in_rule_Module89: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_10_in_rule_Import101: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Import105: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Definition_in_rule_Statement116: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Evaluation_in_rule_Statement120: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_11_in_rule_Definition131: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Definition135: new org.antlr.runtime.BitSet([0x00009000, 0x00000000]),
    FOLLOW_12_in_rule_Definition138: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_DeclaredParameter_in_rule_Definition142: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_13_in_rule_Definition145: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_DeclaredParameter_in_rule_Definition149: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_14_in_rule_Definition153: new org.antlr.runtime.BitSet([0x00008000, 0x00000000]),
    FOLLOW_15_in_rule_Definition158: new org.antlr.runtime.BitSet([0x00001830, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_Definition162: new org.antlr.runtime.BitSet([0x00010000, 0x00000000]),
    FOLLOW_16_in_rule_Definition164: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_DeclaredParameter177: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Definition_in_rule_AbstractDefinition188: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_DeclaredParameter_in_rule_AbstractDefinition192: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_Evaluation205: new org.antlr.runtime.BitSet([0x00010000, 0x00000000]),
    FOLLOW_16_in_rule_Evaluation207: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Addition_in_rule_Expression218: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Multiplication_in_rule_Addition230: new org.antlr.runtime.BitSet([0x00060002, 0x00000000]),
    FOLLOW_set_in_rule_Addition233: new org.antlr.runtime.BitSet([0x00001830, 0x00000000]),
    FOLLOW_rule_Multiplication_in_rule_Addition245: new org.antlr.runtime.BitSet([0x00060002, 0x00000000]),
    FOLLOW_rule_PrimaryExpression_in_rule_Multiplication259: new org.antlr.runtime.BitSet([0x00180002, 0x00000000]),
    FOLLOW_set_in_rule_Multiplication262: new org.antlr.runtime.BitSet([0x00001830, 0x00000000]),
    FOLLOW_rule_PrimaryExpression_in_rule_Multiplication274: new org.antlr.runtime.BitSet([0x00180002, 0x00000000]),
    FOLLOW_12_in_rule_PrimaryExpression288: new org.antlr.runtime.BitSet([0x00001830, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_PrimaryExpression290: new org.antlr.runtime.BitSet([0x00004000, 0x00000000]),
    FOLLOW_14_in_rule_PrimaryExpression292: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_INT_in_rule_PrimaryExpression300: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_PrimaryExpression308: new org.antlr.runtime.BitSet([0x00001002, 0x00000000]),
    FOLLOW_12_in_rule_PrimaryExpression311: new org.antlr.runtime.BitSet([0x00001830, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_PrimaryExpression315: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_13_in_rule_PrimaryExpression318: new org.antlr.runtime.BitSet([0x00001830, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_PrimaryExpression322: new org.antlr.runtime.BitSet([0x00006000, 0x00000000]),
    FOLLOW_14_in_rule_PrimaryExpression326: new org.antlr.runtime.BitSet([0x00000002, 0x00000000])
});

})();