// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g 2015-04-19 23:38:27

var InternalArithmeticsParser = function(input, state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    InternalArithmeticsParser.superclass.constructor.call(this, input, state);


         

    /* @todo only create adaptor if output=AST */
    this.adaptor = new org.antlr.runtime.tree.CommonTreeAdaptor();

};

org.antlr.lang.augmentObject(InternalArithmeticsParser, {
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
    ID= 4,
    NUMBER= 5,
    STRING= 6,
    COMMENT= 7,
    WS= 8;

// public instance methods/vars
org.antlr.lang.extend(InternalArithmeticsParser, org.antlr.runtime.Parser, {
        
    setTreeAdaptor: function(adaptor) {
        this.adaptor = adaptor;
    },
    getTreeAdaptor: function() {
        return this.adaptor;
    },

    getTokenNames: function() { return InternalArithmeticsParser.tokenNames; },
    getGrammarFileName: function() { return "C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g"; }
});
org.antlr.lang.augmentObject(InternalArithmeticsParser.prototype, {

    // inline static return class
    rule_Module_return: (function() {
        InternalArithmeticsParser.rule_Module_return = function(){};
        org.antlr.lang.extend(InternalArithmeticsParser.rule_Module_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:1: rule_Module : 'module' name= ID (imports+= rule_Import )* (statements+= rule_Statement )* EOF ;
    // $ANTLR start "rule_Module"
    rule_Module: function() {
        var retval = new InternalArithmeticsParser.rule_Module_return();
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
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:12: ( 'module' name= ID (imports+= rule_Import )* (statements+= rule_Statement )* EOF )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:14: 'module' name= ID (imports+= rule_Import )* (statements+= rule_Statement )* EOF
            root_0 = this.adaptor.nil();

            string_literal1=this.match(this.input,9,InternalArithmeticsParser.FOLLOW_9_in_rule_Module42); 
            string_literal1_tree = this.adaptor.create(string_literal1);
            this.adaptor.addChild(root_0, string_literal1_tree);

            name=this.match(this.input,ID,InternalArithmeticsParser.FOLLOW_ID_in_rule_Module46); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:38: (imports+= rule_Import )*
            loop1:
            do {
                var alt1=2;
                var LA1_0 = this.input.LA(1);

                if ( (LA1_0==10) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:38: imports+= rule_Import
                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Import_in_rule_Module50);
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

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:63: (statements+= rule_Statement )*
            loop2:
            do {
                var alt2=2;
                var LA2_0 = this.input.LA(1);

                if ( ((LA2_0>=ID && LA2_0<=NUMBER)||(LA2_0>=13 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:63: statements+= rule_Statement
                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Statement_in_rule_Module55);
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

            EOF2=this.match(this.input,EOF,InternalArithmeticsParser.FOLLOW_EOF_in_rule_Module57); 



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
        InternalArithmeticsParser.rule_Import_return = function(){};
        org.antlr.lang.extend(InternalArithmeticsParser.rule_Import_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:85: rule_Import : 'import' importednamespace= rule_ImportName ;
    // $ANTLR start "rule_Import"
    rule_Import: function() {
        var retval = new InternalArithmeticsParser.rule_Import_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var string_literal3 = null;
         var importednamespace = null;

        var string_literal3_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:96: ( 'import' importednamespace= rule_ImportName )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:98: 'import' importednamespace= rule_ImportName
            root_0 = this.adaptor.nil();

            string_literal3=this.match(this.input,10,InternalArithmeticsParser.FOLLOW_10_in_rule_Import63); 
            string_literal3_tree = this.adaptor.create(string_literal3);
            this.adaptor.addChild(root_0, string_literal3_tree);

            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_ImportName_in_rule_Import67);
            importednamespace=this.rule_ImportName();

            this.state._fsp--;

            this.adaptor.addChild(root_0, importednamespace.getTree());



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
    rule_ImportName_return: (function() {
        InternalArithmeticsParser.rule_ImportName_return = function(){};
        org.antlr.lang.extend(InternalArithmeticsParser.rule_ImportName_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:141: rule_ImportName : ID ( '.' '*' )? ;
    // $ANTLR start "rule_ImportName"
    rule_ImportName: function() {
        var retval = new InternalArithmeticsParser.rule_ImportName_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var ID4 = null;
        var char_literal5 = null;
        var char_literal6 = null;

        var ID4_tree=null;
        var char_literal5_tree=null;
        var char_literal6_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:156: ( ID ( '.' '*' )? )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:158: ID ( '.' '*' )?
            root_0 = this.adaptor.nil();

            ID4=this.match(this.input,ID,InternalArithmeticsParser.FOLLOW_ID_in_rule_ImportName72); 
            ID4_tree = this.adaptor.create(ID4);
            this.adaptor.addChild(root_0, ID4_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:161: ( '.' '*' )?
            var alt3=2;
            var LA3_0 = this.input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:162: '.' '*'
                    char_literal5=this.match(this.input,11,InternalArithmeticsParser.FOLLOW_11_in_rule_ImportName75); 
                    char_literal5_tree = this.adaptor.create(char_literal5);
                    this.adaptor.addChild(root_0, char_literal5_tree);

                    char_literal6=this.match(this.input,12,InternalArithmeticsParser.FOLLOW_12_in_rule_ImportName77); 
                    char_literal6_tree = this.adaptor.create(char_literal6);
                    this.adaptor.addChild(root_0, char_literal6_tree);



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
    rule_Statement_return: (function() {
        InternalArithmeticsParser.rule_Statement_return = function(){};
        org.antlr.lang.extend(InternalArithmeticsParser.rule_Statement_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:172: rule_Statement : ( rule_Definition | rule_Evaluation );
    // $ANTLR start "rule_Statement"
    rule_Statement: function() {
        var retval = new InternalArithmeticsParser.rule_Statement_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_Definition7 = null;
         var rule_Evaluation8 = null;


        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:186: ( rule_Definition | rule_Evaluation )
            var alt4=2;
            var LA4_0 = this.input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=ID && LA4_0<=NUMBER)||LA4_0==14) ) {
                alt4=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 4, 0, this.input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:188: rule_Definition
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Definition_in_rule_Statement84);
                    rule_Definition7=this.rule_Definition();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Definition7.getTree());


                    break;
                case 2 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:206: rule_Evaluation
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Evaluation_in_rule_Statement88);
                    rule_Evaluation8=this.rule_Evaluation();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Evaluation8.getTree());


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
        InternalArithmeticsParser.rule_Definition_return = function(){};
        org.antlr.lang.extend(InternalArithmeticsParser.rule_Definition_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:222: rule_Definition : 'def' name= ID ( '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')' )? ':' expr= rule_Expression ';' ;
    // $ANTLR start "rule_Definition"
    rule_Definition: function() {
        var retval = new InternalArithmeticsParser.rule_Definition_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var string_literal9 = null;
        var char_literal10 = null;
        var char_literal11 = null;
        var char_literal12 = null;
        var char_literal13 = null;
        var char_literal14 = null;
        var list_args=null;
         var expr = null;
        var args = null;
        var name_tree=null;
        var string_literal9_tree=null;
        var char_literal10_tree=null;
        var char_literal11_tree=null;
        var char_literal12_tree=null;
        var char_literal13_tree=null;
        var char_literal14_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:237: ( 'def' name= ID ( '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')' )? ':' expr= rule_Expression ';' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:239: 'def' name= ID ( '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')' )? ':' expr= rule_Expression ';'
            root_0 = this.adaptor.nil();

            string_literal9=this.match(this.input,13,InternalArithmeticsParser.FOLLOW_13_in_rule_Definition93); 
            string_literal9_tree = this.adaptor.create(string_literal9);
            this.adaptor.addChild(root_0, string_literal9_tree);

            name=this.match(this.input,ID,InternalArithmeticsParser.FOLLOW_ID_in_rule_Definition97); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:253: ( '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')' )?
            var alt6=2;
            var LA6_0 = this.input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:254: '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')'
                    char_literal10=this.match(this.input,14,InternalArithmeticsParser.FOLLOW_14_in_rule_Definition100); 
                    char_literal10_tree = this.adaptor.create(char_literal10);
                    this.adaptor.addChild(root_0, char_literal10_tree);

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_DeclaredParameter_in_rule_Definition104);
                    args=this.rule_DeclaredParameter();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, args.getTree());
                    if (org.antlr.lang.isNull(list_args)) list_args = [];
                    list_args.push(args.getTree());

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:287: ( ',' args+= rule_DeclaredParameter )*
                    loop5:
                    do {
                        var alt5=2;
                        var LA5_0 = this.input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:288: ',' args+= rule_DeclaredParameter
                            char_literal11=this.match(this.input,15,InternalArithmeticsParser.FOLLOW_15_in_rule_Definition107); 
                            char_literal11_tree = this.adaptor.create(char_literal11);
                            this.adaptor.addChild(root_0, char_literal11_tree);

                            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_DeclaredParameter_in_rule_Definition111);
                            args=this.rule_DeclaredParameter();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, args.getTree());
                            if (org.antlr.lang.isNull(list_args)) list_args = [];
                            list_args.push(args.getTree());



                            break;

                        default :
                            break loop5;
                        }
                    } while (true);

                    char_literal12=this.match(this.input,16,InternalArithmeticsParser.FOLLOW_16_in_rule_Definition115); 
                    char_literal12_tree = this.adaptor.create(char_literal12);
                    this.adaptor.addChild(root_0, char_literal12_tree);



                    break;

            }

            char_literal13=this.match(this.input,17,InternalArithmeticsParser.FOLLOW_17_in_rule_Definition119); 
            char_literal13_tree = this.adaptor.create(char_literal13);
            this.adaptor.addChild(root_0, char_literal13_tree);

            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Expression_in_rule_Definition123);
            expr=this.rule_Expression();

            this.state._fsp--;

            this.adaptor.addChild(root_0, expr.getTree());
            char_literal14=this.match(this.input,18,InternalArithmeticsParser.FOLLOW_18_in_rule_Definition125); 
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
    rule_DeclaredParameter_return: (function() {
        InternalArithmeticsParser.rule_DeclaredParameter_return = function(){};
        org.antlr.lang.extend(InternalArithmeticsParser.rule_DeclaredParameter_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:358: rule_DeclaredParameter : name= ID ;
    // $ANTLR start "rule_DeclaredParameter"
    rule_DeclaredParameter: function() {
        var retval = new InternalArithmeticsParser.rule_DeclaredParameter_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;

        var name_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:380: (name= ID )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:382: name= ID
            root_0 = this.adaptor.nil();

            name=this.match(this.input,ID,InternalArithmeticsParser.FOLLOW_ID_in_rule_DeclaredParameter132); 
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
        InternalArithmeticsParser.rule_AbstractDefinition_return = function(){};
        org.antlr.lang.extend(InternalArithmeticsParser.rule_AbstractDefinition_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:390: rule_AbstractDefinition : ( rule_Definition | rule_DeclaredParameter );
    // $ANTLR start "rule_AbstractDefinition"
    rule_AbstractDefinition: function() {
        var retval = new InternalArithmeticsParser.rule_AbstractDefinition_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_Definition15 = null;
         var rule_DeclaredParameter16 = null;


        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:413: ( rule_Definition | rule_DeclaredParameter )
            var alt7=2;
            var LA7_0 = this.input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==ID) ) {
                alt7=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 7, 0, this.input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:415: rule_Definition
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Definition_in_rule_AbstractDefinition137);
                    rule_Definition15=this.rule_Definition();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Definition15.getTree());


                    break;
                case 2 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:433: rule_DeclaredParameter
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_DeclaredParameter_in_rule_AbstractDefinition141);
                    rule_DeclaredParameter16=this.rule_DeclaredParameter();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_DeclaredParameter16.getTree());


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
        InternalArithmeticsParser.rule_Evaluation_return = function(){};
        org.antlr.lang.extend(InternalArithmeticsParser.rule_Evaluation_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:456: rule_Evaluation : expression= rule_Expression ';' ;
    // $ANTLR start "rule_Evaluation"
    rule_Evaluation: function() {
        var retval = new InternalArithmeticsParser.rule_Evaluation_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal17 = null;
         var expression = null;

        var char_literal17_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:471: (expression= rule_Expression ';' )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:473: expression= rule_Expression ';'
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Expression_in_rule_Evaluation148);
            expression=this.rule_Expression();

            this.state._fsp--;

            this.adaptor.addChild(root_0, expression.getTree());
            char_literal17=this.match(this.input,18,InternalArithmeticsParser.FOLLOW_18_in_rule_Evaluation150); 
            char_literal17_tree = this.adaptor.create(char_literal17);
            this.adaptor.addChild(root_0, char_literal17_tree);




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
        InternalArithmeticsParser.rule_Expression_return = function(){};
        org.antlr.lang.extend(InternalArithmeticsParser.rule_Expression_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:504: rule_Expression : rule_Addition ;
    // $ANTLR start "rule_Expression"
    rule_Expression: function() {
        var retval = new InternalArithmeticsParser.rule_Expression_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_Addition18 = null;


        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:519: ( rule_Addition )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:521: rule_Addition
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Addition_in_rule_Expression155);
            rule_Addition18=this.rule_Addition();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_Addition18.getTree());



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
        InternalArithmeticsParser.rule_Addition_return = function(){};
        org.antlr.lang.extend(InternalArithmeticsParser.rule_Addition_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:535: rule_Addition : rule_Multiplication ( ( '+' | '-' ) right= rule_Multiplication )* ;
    // $ANTLR start "rule_Addition"
    rule_Addition: function() {
        var retval = new InternalArithmeticsParser.rule_Addition_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var set20 = null;
         var right = null;
         var rule_Multiplication19 = null;

        var set20_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:548: ( rule_Multiplication ( ( '+' | '-' ) right= rule_Multiplication )* )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:550: rule_Multiplication ( ( '+' | '-' ) right= rule_Multiplication )*
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Multiplication_in_rule_Addition160);
            rule_Multiplication19=this.rule_Multiplication();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_Multiplication19.getTree());
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:570: ( ( '+' | '-' ) right= rule_Multiplication )*
            loop8:
            do {
                var alt8=2;
                var LA8_0 = this.input.LA(1);

                if ( ((LA8_0>=19 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:571: ( '+' | '-' ) right= rule_Multiplication
                    set20=this.input.LT(1);
                    if ( (this.input.LA(1)>=19 && this.input.LA(1)<=20) ) {
                        this.input.consume();
                        this.adaptor.addChild(root_0, this.adaptor.create(set20));
                        this.state.errorRecovery=false;
                    }
                    else {
                        var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                        throw mse;
                    }

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Multiplication_in_rule_Addition175);
                    right=this.rule_Multiplication();

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
    rule_Multiplication_return: (function() {
        InternalArithmeticsParser.rule_Multiplication_return = function(){};
        org.antlr.lang.extend(InternalArithmeticsParser.rule_Multiplication_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:613: rule_Multiplication : rule_PrimaryExpression ( ( '*' | '/' ) right= rule_PrimaryExpression )* ;
    // $ANTLR start "rule_Multiplication"
    rule_Multiplication: function() {
        var retval = new InternalArithmeticsParser.rule_Multiplication_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var set22 = null;
         var right = null;
         var rule_PrimaryExpression21 = null;

        var set22_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:632: ( rule_PrimaryExpression ( ( '*' | '/' ) right= rule_PrimaryExpression )* )
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:634: rule_PrimaryExpression ( ( '*' | '/' ) right= rule_PrimaryExpression )*
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_PrimaryExpression_in_rule_Multiplication182);
            rule_PrimaryExpression21=this.rule_PrimaryExpression();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_PrimaryExpression21.getTree());
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:657: ( ( '*' | '/' ) right= rule_PrimaryExpression )*
            loop9:
            do {
                var alt9=2;
                var LA9_0 = this.input.LA(1);

                if ( (LA9_0==12||LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:658: ( '*' | '/' ) right= rule_PrimaryExpression
                    set22=this.input.LT(1);
                    if ( this.input.LA(1)==12||this.input.LA(1)==21 ) {
                        this.input.consume();
                        this.adaptor.addChild(root_0, this.adaptor.create(set22));
                        this.state.errorRecovery=false;
                    }
                    else {
                        var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                        throw mse;
                    }

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_PrimaryExpression_in_rule_Multiplication197);
                    right=this.rule_PrimaryExpression();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, right.getTree());


                    break;

                default :
                    break loop9;
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
        InternalArithmeticsParser.rule_PrimaryExpression_return = function(){};
        org.antlr.lang.extend(InternalArithmeticsParser.rule_PrimaryExpression_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:703: rule_PrimaryExpression : ( '(' rule_Expression ')' | value= NUMBER | func= ID ( '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')' )? );
    // $ANTLR start "rule_PrimaryExpression"
    rule_PrimaryExpression: function() {
        var retval = new InternalArithmeticsParser.rule_PrimaryExpression_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var value = null;
        var func = null;
        var char_literal23 = null;
        var char_literal25 = null;
        var char_literal26 = null;
        var char_literal27 = null;
        var char_literal28 = null;
        var list_args=null;
         var rule_Expression24 = null;
        var args = null;
        var value_tree=null;
        var func_tree=null;
        var char_literal23_tree=null;
        var char_literal25_tree=null;
        var char_literal26_tree=null;
        var char_literal27_tree=null;
        var char_literal28_tree=null;

        try {
            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:725: ( '(' rule_Expression ')' | value= NUMBER | func= ID ( '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')' )? )
            var alt12=3;
            switch ( this.input.LA(1) ) {
            case 14:
                alt12=1;
                break;
            case NUMBER:
                alt12=2;
                break;
            case ID:
                alt12=3;
                break;
            default:
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 12, 0, this.input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:727: '(' rule_Expression ')'
                    root_0 = this.adaptor.nil();

                    char_literal23=this.match(this.input,14,InternalArithmeticsParser.FOLLOW_14_in_rule_PrimaryExpression204); 
                    char_literal23_tree = this.adaptor.create(char_literal23);
                    this.adaptor.addChild(root_0, char_literal23_tree);

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Expression_in_rule_PrimaryExpression206);
                    rule_Expression24=this.rule_Expression();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Expression24.getTree());
                    char_literal25=this.match(this.input,16,InternalArithmeticsParser.FOLLOW_16_in_rule_PrimaryExpression208); 
                    char_literal25_tree = this.adaptor.create(char_literal25);
                    this.adaptor.addChild(root_0, char_literal25_tree);



                    break;
                case 2 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:754: value= NUMBER
                    root_0 = this.adaptor.nil();

                    value=this.match(this.input,NUMBER,InternalArithmeticsParser.FOLLOW_NUMBER_in_rule_PrimaryExpression215); 
                    value_tree = this.adaptor.create(value);
                    this.adaptor.addChild(root_0, value_tree);



                    break;
                case 3 :
                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:770: func= ID ( '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')' )?
                    root_0 = this.adaptor.nil();

                    func=this.match(this.input,ID,InternalArithmeticsParser.FOLLOW_ID_in_rule_PrimaryExpression222); 
                    func_tree = this.adaptor.create(func);
                    this.adaptor.addChild(root_0, func_tree);

                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:778: ( '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')' )?
                    var alt11=2;
                    var LA11_0 = this.input.LA(1);

                    if ( (LA11_0==14) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:779: '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')'
                            char_literal26=this.match(this.input,14,InternalArithmeticsParser.FOLLOW_14_in_rule_PrimaryExpression225); 
                            char_literal26_tree = this.adaptor.create(char_literal26);
                            this.adaptor.addChild(root_0, char_literal26_tree);

                            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Expression_in_rule_PrimaryExpression229);
                            args=this.rule_Expression();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, args.getTree());
                            if (org.antlr.lang.isNull(list_args)) list_args = [];
                            list_args.push(args.getTree());

                            // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:805: ( ',' args+= rule_Expression )*
                            loop10:
                            do {
                                var alt10=2;
                                var LA10_0 = this.input.LA(1);

                                if ( (LA10_0==15) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                                case 1 :
                                    // C:\\Users\\lajmi\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:2:806: ',' args+= rule_Expression
                                    char_literal27=this.match(this.input,15,InternalArithmeticsParser.FOLLOW_15_in_rule_PrimaryExpression232); 
                                    char_literal27_tree = this.adaptor.create(char_literal27);
                                    this.adaptor.addChild(root_0, char_literal27_tree);

                                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Expression_in_rule_PrimaryExpression236);
                                    args=this.rule_Expression();

                                    this.state._fsp--;

                                    this.adaptor.addChild(root_0, args.getTree());
                                    if (org.antlr.lang.isNull(list_args)) list_args = [];
                                    list_args.push(args.getTree());



                                    break;

                                default :
                                    break loop10;
                                }
                            } while (true);

                            char_literal28=this.match(this.input,16,InternalArithmeticsParser.FOLLOW_16_in_rule_PrimaryExpression240); 
                            char_literal28_tree = this.adaptor.create(char_literal28);
                            this.adaptor.addChild(root_0, char_literal28_tree);



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
org.antlr.lang.augmentObject(InternalArithmeticsParser, {
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUMBER", "STRING", "COMMENT", "WS", "'module'", "'import'", "'.'", "'*'", "'def'", "'('", "','", "')'", "':'", "';'", "'+'", "'-'", "'/'"],
    FOLLOW_9_in_rule_Module42: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Module46: new org.antlr.runtime.BitSet([0x00006430, 0x00000000]),
    FOLLOW_rule_Import_in_rule_Module50: new org.antlr.runtime.BitSet([0x00006430, 0x00000000]),
    FOLLOW_rule_Statement_in_rule_Module55: new org.antlr.runtime.BitSet([0x00006030, 0x00000000]),
    FOLLOW_EOF_in_rule_Module57: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_10_in_rule_Import63: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_ImportName_in_rule_Import67: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_ImportName72: new org.antlr.runtime.BitSet([0x00000802, 0x00000000]),
    FOLLOW_11_in_rule_ImportName75: new org.antlr.runtime.BitSet([0x00001000, 0x00000000]),
    FOLLOW_12_in_rule_ImportName77: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Definition_in_rule_Statement84: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Evaluation_in_rule_Statement88: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_13_in_rule_Definition93: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Definition97: new org.antlr.runtime.BitSet([0x00024000, 0x00000000]),
    FOLLOW_14_in_rule_Definition100: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_DeclaredParameter_in_rule_Definition104: new org.antlr.runtime.BitSet([0x00018000, 0x00000000]),
    FOLLOW_15_in_rule_Definition107: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_DeclaredParameter_in_rule_Definition111: new org.antlr.runtime.BitSet([0x00018000, 0x00000000]),
    FOLLOW_16_in_rule_Definition115: new org.antlr.runtime.BitSet([0x00020000, 0x00000000]),
    FOLLOW_17_in_rule_Definition119: new org.antlr.runtime.BitSet([0x00006030, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_Definition123: new org.antlr.runtime.BitSet([0x00040000, 0x00000000]),
    FOLLOW_18_in_rule_Definition125: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_DeclaredParameter132: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Definition_in_rule_AbstractDefinition137: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_DeclaredParameter_in_rule_AbstractDefinition141: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_Evaluation148: new org.antlr.runtime.BitSet([0x00040000, 0x00000000]),
    FOLLOW_18_in_rule_Evaluation150: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Addition_in_rule_Expression155: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Multiplication_in_rule_Addition160: new org.antlr.runtime.BitSet([0x00180002, 0x00000000]),
    FOLLOW_set_in_rule_Addition163: new org.antlr.runtime.BitSet([0x00006030, 0x00000000]),
    FOLLOW_rule_Multiplication_in_rule_Addition175: new org.antlr.runtime.BitSet([0x00180002, 0x00000000]),
    FOLLOW_rule_PrimaryExpression_in_rule_Multiplication182: new org.antlr.runtime.BitSet([0x00201002, 0x00000000]),
    FOLLOW_set_in_rule_Multiplication185: new org.antlr.runtime.BitSet([0x00006030, 0x00000000]),
    FOLLOW_rule_PrimaryExpression_in_rule_Multiplication197: new org.antlr.runtime.BitSet([0x00201002, 0x00000000]),
    FOLLOW_14_in_rule_PrimaryExpression204: new org.antlr.runtime.BitSet([0x00006030, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_PrimaryExpression206: new org.antlr.runtime.BitSet([0x00010000, 0x00000000]),
    FOLLOW_16_in_rule_PrimaryExpression208: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_NUMBER_in_rule_PrimaryExpression215: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_PrimaryExpression222: new org.antlr.runtime.BitSet([0x00004002, 0x00000000]),
    FOLLOW_14_in_rule_PrimaryExpression225: new org.antlr.runtime.BitSet([0x00006030, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_PrimaryExpression229: new org.antlr.runtime.BitSet([0x00018000, 0x00000000]),
    FOLLOW_15_in_rule_PrimaryExpression232: new org.antlr.runtime.BitSet([0x00006030, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_PrimaryExpression236: new org.antlr.runtime.BitSet([0x00018000, 0x00000000]),
    FOLLOW_16_in_rule_PrimaryExpression240: new org.antlr.runtime.BitSet([0x00000002, 0x00000000])
});

})();