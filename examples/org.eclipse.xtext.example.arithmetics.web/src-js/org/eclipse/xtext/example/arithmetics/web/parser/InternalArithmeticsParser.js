// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g 2015-11-15 16:36:56



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
    getGrammarFileName: function() { return "D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g"; }
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

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:16:1: rule_Module : 'module' name= ID (imports+= rule_Import )* (statements+= rule_Statement )* EOF ;
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:16:12: ( 'module' name= ID (imports+= rule_Import )* (statements+= rule_Statement )* EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:17:2: 'module' name= ID (imports+= rule_Import )* (statements+= rule_Statement )* EOF
            root_0 = this.adaptor.nil();

            string_literal1=this.match(this.input,9,InternalArithmeticsParser.FOLLOW_9_in_rule_Module55); 
            string_literal1_tree = this.adaptor.create(string_literal1);
            this.adaptor.addChild(root_0, string_literal1_tree);

            name=this.match(this.input,ID,InternalArithmeticsParser.FOLLOW_ID_in_rule_Module59); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:17:26: (imports+= rule_Import )*
            loop1:
            do {
                var alt1=2;
                var LA1_0 = this.input.LA(1);

                if ( (LA1_0==10) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:17:26: imports+= rule_Import
                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Import_in_rule_Module63);
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

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:17:51: (statements+= rule_Statement )*
            loop2:
            do {
                var alt2=2;
                var LA2_0 = this.input.LA(1);

                if ( ((LA2_0>=ID && LA2_0<=NUMBER)||(LA2_0>=13 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:17:51: statements+= rule_Statement
                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Statement_in_rule_Module68);
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

            EOF2=this.match(this.input,EOF,InternalArithmeticsParser.FOLLOW_EOF_in_rule_Module71); 



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

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:20:1: rule_Import : 'import' importednamespace= rule_ImportName ;
    // $ANTLR start "rule_Import"
    rule_Import: function() {
        var retval = new InternalArithmeticsParser.rule_Import_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var string_literal3 = null;
         var importednamespace = null;

        var string_literal3_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:20:12: ( 'import' importednamespace= rule_ImportName )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:21:2: 'import' importednamespace= rule_ImportName
            root_0 = this.adaptor.nil();

            string_literal3=this.match(this.input,10,InternalArithmeticsParser.FOLLOW_10_in_rule_Import81); 
            string_literal3_tree = this.adaptor.create(string_literal3);
            this.adaptor.addChild(root_0, string_literal3_tree);

            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_ImportName_in_rule_Import85);
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

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:24:1: rule_ImportName : ID ( '.' '*' )? ;
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:24:16: ( ID ( '.' '*' )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:25:2: ID ( '.' '*' )?
            root_0 = this.adaptor.nil();

            ID4=this.match(this.input,ID,InternalArithmeticsParser.FOLLOW_ID_in_rule_ImportName94); 
            ID4_tree = this.adaptor.create(ID4);
            this.adaptor.addChild(root_0, ID4_tree);

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:25:5: ( '.' '*' )?
            var alt3=2;
            var LA3_0 = this.input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:25:6: '.' '*'
                    char_literal5=this.match(this.input,11,InternalArithmeticsParser.FOLLOW_11_in_rule_ImportName97); 
                    char_literal5_tree = this.adaptor.create(char_literal5);
                    this.adaptor.addChild(root_0, char_literal5_tree);

                    char_literal6=this.match(this.input,12,InternalArithmeticsParser.FOLLOW_12_in_rule_ImportName99); 
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

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:28:1: rule_Statement : ( rule_Definition | rule_Evaluation );
    // $ANTLR start "rule_Statement"
    rule_Statement: function() {
        var retval = new InternalArithmeticsParser.rule_Statement_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_Definition7 = null;
         var rule_Evaluation8 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:28:15: ( rule_Definition | rule_Evaluation )
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
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:29:2: rule_Definition
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Definition_in_rule_Statement110);
                    rule_Definition7=this.rule_Definition();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Definition7.getTree());


                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:29:20: rule_Evaluation
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Evaluation_in_rule_Statement114);
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

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:32:1: rule_Definition : 'def' name= ID ( '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')' )? ':' expr= rule_Expression ';' ;
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:32:16: ( 'def' name= ID ( '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')' )? ':' expr= rule_Expression ';' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:33:2: 'def' name= ID ( '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')' )? ':' expr= rule_Expression ';'
            root_0 = this.adaptor.nil();

            string_literal9=this.match(this.input,13,InternalArithmeticsParser.FOLLOW_13_in_rule_Definition123); 
            string_literal9_tree = this.adaptor.create(string_literal9);
            this.adaptor.addChild(root_0, string_literal9_tree);

            name=this.match(this.input,ID,InternalArithmeticsParser.FOLLOW_ID_in_rule_Definition127); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:33:16: ( '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')' )?
            var alt6=2;
            var LA6_0 = this.input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:33:17: '(' args+= rule_DeclaredParameter ( ',' args+= rule_DeclaredParameter )* ')'
                    char_literal10=this.match(this.input,14,InternalArithmeticsParser.FOLLOW_14_in_rule_Definition130); 
                    char_literal10_tree = this.adaptor.create(char_literal10);
                    this.adaptor.addChild(root_0, char_literal10_tree);

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_DeclaredParameter_in_rule_Definition134);
                    args=this.rule_DeclaredParameter();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, args.getTree());
                    if (org.antlr.lang.isNull(list_args)) list_args = [];
                    list_args.push(args.getTree());

                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:33:50: ( ',' args+= rule_DeclaredParameter )*
                    loop5:
                    do {
                        var alt5=2;
                        var LA5_0 = this.input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:33:51: ',' args+= rule_DeclaredParameter
                            char_literal11=this.match(this.input,15,InternalArithmeticsParser.FOLLOW_15_in_rule_Definition137); 
                            char_literal11_tree = this.adaptor.create(char_literal11);
                            this.adaptor.addChild(root_0, char_literal11_tree);

                            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_DeclaredParameter_in_rule_Definition141);
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

                    char_literal12=this.match(this.input,16,InternalArithmeticsParser.FOLLOW_16_in_rule_Definition145); 
                    char_literal12_tree = this.adaptor.create(char_literal12);
                    this.adaptor.addChild(root_0, char_literal12_tree);



                    break;

            }

            char_literal13=this.match(this.input,17,InternalArithmeticsParser.FOLLOW_17_in_rule_Definition149); 
            char_literal13_tree = this.adaptor.create(char_literal13);
            this.adaptor.addChild(root_0, char_literal13_tree);

            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Expression_in_rule_Definition153);
            expr=this.rule_Expression();

            this.state._fsp--;

            this.adaptor.addChild(root_0, expr.getTree());
            char_literal14=this.match(this.input,18,InternalArithmeticsParser.FOLLOW_18_in_rule_Definition155); 
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

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:36:1: rule_DeclaredParameter : name= ID ;
    // $ANTLR start "rule_DeclaredParameter"
    rule_DeclaredParameter: function() {
        var retval = new InternalArithmeticsParser.rule_DeclaredParameter_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;

        var name_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:36:23: (name= ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:37:2: name= ID
            root_0 = this.adaptor.nil();

            name=this.match(this.input,ID,InternalArithmeticsParser.FOLLOW_ID_in_rule_DeclaredParameter166); 
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

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:40:1: rule_AbstractDefinition : ( rule_Definition | rule_DeclaredParameter );
    // $ANTLR start "rule_AbstractDefinition"
    rule_AbstractDefinition: function() {
        var retval = new InternalArithmeticsParser.rule_AbstractDefinition_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_Definition15 = null;
         var rule_DeclaredParameter16 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:40:24: ( rule_Definition | rule_DeclaredParameter )
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
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:41:2: rule_Definition
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Definition_in_rule_AbstractDefinition175);
                    rule_Definition15=this.rule_Definition();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Definition15.getTree());


                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:41:20: rule_DeclaredParameter
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_DeclaredParameter_in_rule_AbstractDefinition179);
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

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:44:1: rule_Evaluation : expression= rule_Expression ';' ;
    // $ANTLR start "rule_Evaluation"
    rule_Evaluation: function() {
        var retval = new InternalArithmeticsParser.rule_Evaluation_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal17 = null;
         var expression = null;

        var char_literal17_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:44:16: (expression= rule_Expression ';' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:45:2: expression= rule_Expression ';'
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Expression_in_rule_Evaluation190);
            expression=this.rule_Expression();

            this.state._fsp--;

            this.adaptor.addChild(root_0, expression.getTree());
            char_literal17=this.match(this.input,18,InternalArithmeticsParser.FOLLOW_18_in_rule_Evaluation192); 
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

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:48:1: rule_Expression : rule_Addition ;
    // $ANTLR start "rule_Expression"
    rule_Expression: function() {
        var retval = new InternalArithmeticsParser.rule_Expression_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_Addition18 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:48:16: ( rule_Addition )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:49:2: rule_Addition
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Addition_in_rule_Expression201);
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

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:52:1: rule_Addition : rule_Multiplication ( ( '+' | '-' ) right= rule_Multiplication )* ;
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:52:14: ( rule_Multiplication ( ( '+' | '-' ) right= rule_Multiplication )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:53:2: rule_Multiplication ( ( '+' | '-' ) right= rule_Multiplication )*
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Multiplication_in_rule_Addition210);
            rule_Multiplication19=this.rule_Multiplication();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_Multiplication19.getTree());
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:53:22: ( ( '+' | '-' ) right= rule_Multiplication )*
            loop8:
            do {
                var alt8=2;
                var LA8_0 = this.input.LA(1);

                if ( ((LA8_0>=19 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:53:23: ( '+' | '-' ) right= rule_Multiplication
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

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Multiplication_in_rule_Addition225);
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

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:56:1: rule_Multiplication : rule_PrimaryExpression ( ( '*' | '/' ) right= rule_PrimaryExpression )* ;
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:56:20: ( rule_PrimaryExpression ( ( '*' | '/' ) right= rule_PrimaryExpression )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:57:2: rule_PrimaryExpression ( ( '*' | '/' ) right= rule_PrimaryExpression )*
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_PrimaryExpression_in_rule_Multiplication236);
            rule_PrimaryExpression21=this.rule_PrimaryExpression();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_PrimaryExpression21.getTree());
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:57:25: ( ( '*' | '/' ) right= rule_PrimaryExpression )*
            loop9:
            do {
                var alt9=2;
                var LA9_0 = this.input.LA(1);

                if ( (LA9_0==12||LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:57:26: ( '*' | '/' ) right= rule_PrimaryExpression
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

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_PrimaryExpression_in_rule_Multiplication251);
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

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:60:1: rule_PrimaryExpression : ( '(' rule_Expression ')' | value= NUMBER | func= ID ( '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')' )? );
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
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:60:23: ( '(' rule_Expression ')' | value= NUMBER | func= ID ( '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')' )? )
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
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:61:2: '(' rule_Expression ')'
                    root_0 = this.adaptor.nil();

                    char_literal23=this.match(this.input,14,InternalArithmeticsParser.FOLLOW_14_in_rule_PrimaryExpression262); 
                    char_literal23_tree = this.adaptor.create(char_literal23);
                    this.adaptor.addChild(root_0, char_literal23_tree);

                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Expression_in_rule_PrimaryExpression264);
                    rule_Expression24=this.rule_Expression();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Expression24.getTree());
                    char_literal25=this.match(this.input,16,InternalArithmeticsParser.FOLLOW_16_in_rule_PrimaryExpression266); 
                    char_literal25_tree = this.adaptor.create(char_literal25);
                    this.adaptor.addChild(root_0, char_literal25_tree);



                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:62:3: value= NUMBER
                    root_0 = this.adaptor.nil();

                    value=this.match(this.input,NUMBER,InternalArithmeticsParser.FOLLOW_NUMBER_in_rule_PrimaryExpression274); 
                    value_tree = this.adaptor.create(value);
                    this.adaptor.addChild(root_0, value_tree);



                    break;
                case 3 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:63:3: func= ID ( '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')' )?
                    root_0 = this.adaptor.nil();

                    func=this.match(this.input,ID,InternalArithmeticsParser.FOLLOW_ID_in_rule_PrimaryExpression282); 
                    func_tree = this.adaptor.create(func);
                    this.adaptor.addChild(root_0, func_tree);

                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:63:11: ( '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')' )?
                    var alt11=2;
                    var LA11_0 = this.input.LA(1);

                    if ( (LA11_0==14) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:63:12: '(' args+= rule_Expression ( ',' args+= rule_Expression )* ')'
                            char_literal26=this.match(this.input,14,InternalArithmeticsParser.FOLLOW_14_in_rule_PrimaryExpression285); 
                            char_literal26_tree = this.adaptor.create(char_literal26);
                            this.adaptor.addChild(root_0, char_literal26_tree);

                            this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Expression_in_rule_PrimaryExpression289);
                            args=this.rule_Expression();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, args.getTree());
                            if (org.antlr.lang.isNull(list_args)) list_args = [];
                            list_args.push(args.getTree());

                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:63:38: ( ',' args+= rule_Expression )*
                            loop10:
                            do {
                                var alt10=2;
                                var LA10_0 = this.input.LA(1);

                                if ( (LA10_0==15) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                                case 1 :
                                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-js\\org\\eclipse\\xtext\\example\\arithmetics\\web\\parser\\InternalArithmetics.g:63:39: ',' args+= rule_Expression
                                    char_literal27=this.match(this.input,15,InternalArithmeticsParser.FOLLOW_15_in_rule_PrimaryExpression292); 
                                    char_literal27_tree = this.adaptor.create(char_literal27);
                                    this.adaptor.addChild(root_0, char_literal27_tree);

                                    this.pushFollow(InternalArithmeticsParser.FOLLOW_rule_Expression_in_rule_PrimaryExpression296);
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

                            char_literal28=this.match(this.input,16,InternalArithmeticsParser.FOLLOW_16_in_rule_PrimaryExpression300); 
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
    FOLLOW_9_in_rule_Module55: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Module59: new org.antlr.runtime.BitSet([0x00006430, 0x00000000]),
    FOLLOW_rule_Import_in_rule_Module63: new org.antlr.runtime.BitSet([0x00006430, 0x00000000]),
    FOLLOW_rule_Statement_in_rule_Module68: new org.antlr.runtime.BitSet([0x00006030, 0x00000000]),
    FOLLOW_EOF_in_rule_Module71: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_10_in_rule_Import81: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_ImportName_in_rule_Import85: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_ImportName94: new org.antlr.runtime.BitSet([0x00000802, 0x00000000]),
    FOLLOW_11_in_rule_ImportName97: new org.antlr.runtime.BitSet([0x00001000, 0x00000000]),
    FOLLOW_12_in_rule_ImportName99: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Definition_in_rule_Statement110: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Evaluation_in_rule_Statement114: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_13_in_rule_Definition123: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Definition127: new org.antlr.runtime.BitSet([0x00024000, 0x00000000]),
    FOLLOW_14_in_rule_Definition130: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_DeclaredParameter_in_rule_Definition134: new org.antlr.runtime.BitSet([0x00018000, 0x00000000]),
    FOLLOW_15_in_rule_Definition137: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_DeclaredParameter_in_rule_Definition141: new org.antlr.runtime.BitSet([0x00018000, 0x00000000]),
    FOLLOW_16_in_rule_Definition145: new org.antlr.runtime.BitSet([0x00020000, 0x00000000]),
    FOLLOW_17_in_rule_Definition149: new org.antlr.runtime.BitSet([0x00006030, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_Definition153: new org.antlr.runtime.BitSet([0x00040000, 0x00000000]),
    FOLLOW_18_in_rule_Definition155: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_DeclaredParameter166: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Definition_in_rule_AbstractDefinition175: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_DeclaredParameter_in_rule_AbstractDefinition179: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_Evaluation190: new org.antlr.runtime.BitSet([0x00040000, 0x00000000]),
    FOLLOW_18_in_rule_Evaluation192: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Addition_in_rule_Expression201: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Multiplication_in_rule_Addition210: new org.antlr.runtime.BitSet([0x00180002, 0x00000000]),
    FOLLOW_set_in_rule_Addition213: new org.antlr.runtime.BitSet([0x00006030, 0x00000000]),
    FOLLOW_rule_Multiplication_in_rule_Addition225: new org.antlr.runtime.BitSet([0x00180002, 0x00000000]),
    FOLLOW_rule_PrimaryExpression_in_rule_Multiplication236: new org.antlr.runtime.BitSet([0x00201002, 0x00000000]),
    FOLLOW_set_in_rule_Multiplication239: new org.antlr.runtime.BitSet([0x00006030, 0x00000000]),
    FOLLOW_rule_PrimaryExpression_in_rule_Multiplication251: new org.antlr.runtime.BitSet([0x00201002, 0x00000000]),
    FOLLOW_14_in_rule_PrimaryExpression262: new org.antlr.runtime.BitSet([0x00006030, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_PrimaryExpression264: new org.antlr.runtime.BitSet([0x00010000, 0x00000000]),
    FOLLOW_16_in_rule_PrimaryExpression266: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_NUMBER_in_rule_PrimaryExpression274: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_PrimaryExpression282: new org.antlr.runtime.BitSet([0x00004002, 0x00000000]),
    FOLLOW_14_in_rule_PrimaryExpression285: new org.antlr.runtime.BitSet([0x00006030, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_PrimaryExpression289: new org.antlr.runtime.BitSet([0x00018000, 0x00000000]),
    FOLLOW_15_in_rule_PrimaryExpression292: new org.antlr.runtime.BitSet([0x00006030, 0x00000000]),
    FOLLOW_rule_Expression_in_rule_PrimaryExpression296: new org.antlr.runtime.BitSet([0x00018000, 0x00000000]),
    FOLLOW_16_in_rule_PrimaryExpression300: new org.antlr.runtime.BitSet([0x00000002, 0x00000000])
});

})();