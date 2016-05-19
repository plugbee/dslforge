// $ANTLR 3.3 avr. 19, 2016 01:13:22 D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g 2016-05-18 22:02:11



var DomainmodelParser = function(input, state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    DomainmodelParser.superclass.constructor.call(this, input, state);


         

    /* @todo only create adaptor if output=AST */
    this.adaptor = new org.antlr.runtime.tree.CommonTreeAdaptor();

};

org.antlr.lang.augmentObject(DomainmodelParser, {
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
    ID= 4,
    STRING= 5,
    COMMENT= 6,
    WS= 7,
    INT= 8;

// public instance methods/vars
org.antlr.lang.extend(DomainmodelParser, org.antlr.runtime.Parser, {
        
    setTreeAdaptor: function(adaptor) {
        this.adaptor = adaptor;
    },
    getTreeAdaptor: function() {
        return this.adaptor;
    },

    getTokenNames: function() { return DomainmodelParser.tokenNames; },
    getGrammarFileName: function() { return "D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g"; }
});
org.antlr.lang.augmentObject(DomainmodelParser.prototype, {

    // inline static return class
    rule_DomainModel_return: (function() {
        DomainmodelParser.rule_DomainModel_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_DomainModel_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:20:1: rule_DomainModel : (elements+= rule_AbstractElement )* EOF ;
    // $ANTLR start "rule_DomainModel"
    rule_DomainModel: function() {
        var retval = new DomainmodelParser.rule_DomainModel_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var EOF1 = null;
        var list_elements=null;
        var elements = null;
        var EOF1_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:20:17: ( (elements+= rule_AbstractElement )* EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:21:2: (elements+= rule_AbstractElement )* EOF
            root_0 = this.adaptor.nil();

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:21:10: (elements+= rule_AbstractElement )*
            loop1:
            do {
                var alt1=2;
                var LA1_0 = this.input.LA(1);

                if ( ((LA1_0>=9 && LA1_0<=10)||(LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:21:10: elements+= rule_AbstractElement
                    this.pushFollow(DomainmodelParser.FOLLOW_rule_AbstractElement_in_rule_DomainModel62);
                    elements=this.rule_AbstractElement();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, elements.getTree());
                    if (org.antlr.lang.isNull(list_elements)) list_elements = [];
                    list_elements.push(elements.getTree());



                    break;

                default :
                    break loop1;
                }
            } while (true);

            EOF1=this.match(this.input,EOF,DomainmodelParser.FOLLOW_EOF_in_rule_DomainModel65); 



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
    rule_AbstractElement_return: (function() {
        DomainmodelParser.rule_AbstractElement_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_AbstractElement_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:26:1: rule_AbstractElement : ( rule_PackageDeclaration | rule_Type | rule_Import );
    // $ANTLR start "rule_AbstractElement"
    rule_AbstractElement: function() {
        var retval = new DomainmodelParser.rule_AbstractElement_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_PackageDeclaration2 = null;
         var rule_Type3 = null;
         var rule_Import4 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:26:21: ( rule_PackageDeclaration | rule_Type | rule_Import )
            var alt2=3;
            switch ( this.input.LA(1) ) {
            case 10:
                alt2=1;
                break;
            case 13:
            case 14:
                alt2=2;
                break;
            case 9:
                alt2=3;
                break;
            default:
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 2, 0, this.input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:27:2: rule_PackageDeclaration
                    root_0 = this.adaptor.nil();

                    this.pushFollow(DomainmodelParser.FOLLOW_rule_PackageDeclaration_in_rule_AbstractElement77);
                    rule_PackageDeclaration2=this.rule_PackageDeclaration();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_PackageDeclaration2.getTree());


                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:27:28: rule_Type
                    root_0 = this.adaptor.nil();

                    this.pushFollow(DomainmodelParser.FOLLOW_rule_Type_in_rule_AbstractElement81);
                    rule_Type3=this.rule_Type();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Type3.getTree());


                    break;
                case 3 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:27:40: rule_Import
                    root_0 = this.adaptor.nil();

                    this.pushFollow(DomainmodelParser.FOLLOW_rule_Import_in_rule_AbstractElement85);
                    rule_Import4=this.rule_Import();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Import4.getTree());


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
    rule_Import_return: (function() {
        DomainmodelParser.rule_Import_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_Import_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:32:1: rule_Import : 'import' importednamespace= rule_QualifiedNameWithWildcard ;
    // $ANTLR start "rule_Import"
    rule_Import: function() {
        var retval = new DomainmodelParser.rule_Import_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var string_literal5 = null;
         var importednamespace = null;

        var string_literal5_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:32:12: ( 'import' importednamespace= rule_QualifiedNameWithWildcard )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:33:2: 'import' importednamespace= rule_QualifiedNameWithWildcard
            root_0 = this.adaptor.nil();

            string_literal5=this.match(this.input,9,DomainmodelParser.FOLLOW_9_in_rule_Import96); 
            string_literal5_tree = this.adaptor.create(string_literal5);
            this.adaptor.addChild(root_0, string_literal5_tree);

            this.pushFollow(DomainmodelParser.FOLLOW_rule_QualifiedNameWithWildcard_in_rule_Import100);
            importednamespace=this.rule_QualifiedNameWithWildcard();

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
    rule_PackageDeclaration_return: (function() {
        DomainmodelParser.rule_PackageDeclaration_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_PackageDeclaration_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:38:1: rule_PackageDeclaration : 'package' name= rule_QualifiedName '{' (elements+= rule_AbstractElement )* '}' ;
    // $ANTLR start "rule_PackageDeclaration"
    rule_PackageDeclaration: function() {
        var retval = new DomainmodelParser.rule_PackageDeclaration_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var string_literal6 = null;
        var char_literal7 = null;
        var char_literal8 = null;
        var list_elements=null;
         var name = null;
        var elements = null;
        var string_literal6_tree=null;
        var char_literal7_tree=null;
        var char_literal8_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:38:24: ( 'package' name= rule_QualifiedName '{' (elements+= rule_AbstractElement )* '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:39:2: 'package' name= rule_QualifiedName '{' (elements+= rule_AbstractElement )* '}'
            root_0 = this.adaptor.nil();

            string_literal6=this.match(this.input,10,DomainmodelParser.FOLLOW_10_in_rule_PackageDeclaration111); 
            string_literal6_tree = this.adaptor.create(string_literal6);
            this.adaptor.addChild(root_0, string_literal6_tree);

            this.pushFollow(DomainmodelParser.FOLLOW_rule_QualifiedName_in_rule_PackageDeclaration115);
            name=this.rule_QualifiedName();

            this.state._fsp--;

            this.adaptor.addChild(root_0, name.getTree());
            char_literal7=this.match(this.input,11,DomainmodelParser.FOLLOW_11_in_rule_PackageDeclaration117); 
            char_literal7_tree = this.adaptor.create(char_literal7);
            this.adaptor.addChild(root_0, char_literal7_tree);

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:40:11: (elements+= rule_AbstractElement )*
            loop3:
            do {
                var alt3=2;
                var LA3_0 = this.input.LA(1);

                if ( ((LA3_0>=9 && LA3_0<=10)||(LA3_0>=13 && LA3_0<=14)) ) {
                    alt3=1;
                }


                switch (alt3) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:40:11: elements+= rule_AbstractElement
                    this.pushFollow(DomainmodelParser.FOLLOW_rule_AbstractElement_in_rule_PackageDeclaration123);
                    elements=this.rule_AbstractElement();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, elements.getTree());
                    if (org.antlr.lang.isNull(list_elements)) list_elements = [];
                    list_elements.push(elements.getTree());



                    break;

                default :
                    break loop3;
                }
            } while (true);

            char_literal8=this.match(this.input,12,DomainmodelParser.FOLLOW_12_in_rule_PackageDeclaration127); 
            char_literal8_tree = this.adaptor.create(char_literal8);
            this.adaptor.addChild(root_0, char_literal8_tree);




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
    rule_Type_return: (function() {
        DomainmodelParser.rule_Type_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_Type_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:46:1: rule_Type : ( rule_Entity | rule_DataType );
    // $ANTLR start "rule_Type"
    rule_Type: function() {
        var retval = new DomainmodelParser.rule_Type_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_Entity9 = null;
         var rule_DataType10 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:46:10: ( rule_Entity | rule_DataType )
            var alt4=2;
            var LA4_0 = this.input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 4, 0, this.input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:47:2: rule_Entity
                    root_0 = this.adaptor.nil();

                    this.pushFollow(DomainmodelParser.FOLLOW_rule_Entity_in_rule_Type138);
                    rule_Entity9=this.rule_Entity();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Entity9.getTree());


                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:47:16: rule_DataType
                    root_0 = this.adaptor.nil();

                    this.pushFollow(DomainmodelParser.FOLLOW_rule_DataType_in_rule_Type142);
                    rule_DataType10=this.rule_DataType();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_DataType10.getTree());


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
    rule_DataType_return: (function() {
        DomainmodelParser.rule_DataType_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_DataType_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:52:1: rule_DataType : 'datatype' name= ID ;
    // $ANTLR start "rule_DataType"
    rule_DataType: function() {
        var retval = new DomainmodelParser.rule_DataType_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var string_literal11 = null;

        var name_tree=null;
        var string_literal11_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:52:14: ( 'datatype' name= ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:53:2: 'datatype' name= ID
            root_0 = this.adaptor.nil();

            string_literal11=this.match(this.input,13,DomainmodelParser.FOLLOW_13_in_rule_DataType153); 
            string_literal11_tree = this.adaptor.create(string_literal11);
            this.adaptor.addChild(root_0, string_literal11_tree);

            name=this.match(this.input,ID,DomainmodelParser.FOLLOW_ID_in_rule_DataType157); 
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
    rule_Entity_return: (function() {
        DomainmodelParser.rule_Entity_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_Entity_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:58:1: rule_Entity : 'entity' name= ID ( 'extends' supertype= ID )? '{' (features+= rule_Feature )* '}' ;
    // $ANTLR start "rule_Entity"
    rule_Entity: function() {
        var retval = new DomainmodelParser.rule_Entity_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var supertype = null;
        var string_literal12 = null;
        var string_literal13 = null;
        var char_literal14 = null;
        var char_literal15 = null;
        var list_features=null;
        var features = null;
        var name_tree=null;
        var supertype_tree=null;
        var string_literal12_tree=null;
        var string_literal13_tree=null;
        var char_literal14_tree=null;
        var char_literal15_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:58:12: ( 'entity' name= ID ( 'extends' supertype= ID )? '{' (features+= rule_Feature )* '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:59:2: 'entity' name= ID ( 'extends' supertype= ID )? '{' (features+= rule_Feature )* '}'
            root_0 = this.adaptor.nil();

            string_literal12=this.match(this.input,14,DomainmodelParser.FOLLOW_14_in_rule_Entity168); 
            string_literal12_tree = this.adaptor.create(string_literal12);
            this.adaptor.addChild(root_0, string_literal12_tree);

            name=this.match(this.input,ID,DomainmodelParser.FOLLOW_ID_in_rule_Entity172); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:59:19: ( 'extends' supertype= ID )?
            var alt5=2;
            var LA5_0 = this.input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:59:20: 'extends' supertype= ID
                    string_literal13=this.match(this.input,15,DomainmodelParser.FOLLOW_15_in_rule_Entity175); 
                    string_literal13_tree = this.adaptor.create(string_literal13);
                    this.adaptor.addChild(root_0, string_literal13_tree);

                    supertype=this.match(this.input,ID,DomainmodelParser.FOLLOW_ID_in_rule_Entity179); 
                    supertype_tree = this.adaptor.create(supertype);
                    this.adaptor.addChild(root_0, supertype_tree);



                    break;

            }

            char_literal14=this.match(this.input,11,DomainmodelParser.FOLLOW_11_in_rule_Entity183); 
            char_literal14_tree = this.adaptor.create(char_literal14);
            this.adaptor.addChild(root_0, char_literal14_tree);

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:60:11: (features+= rule_Feature )*
            loop6:
            do {
                var alt6=2;
                var LA6_0 = this.input.LA(1);

                if ( (LA6_0==ID||LA6_0==17||LA6_0==19||(LA6_0>=25 && LA6_0<=27)) ) {
                    alt6=1;
                }


                switch (alt6) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:60:11: features+= rule_Feature
                    this.pushFollow(DomainmodelParser.FOLLOW_rule_Feature_in_rule_Entity189);
                    features=this.rule_Feature();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, features.getTree());
                    if (org.antlr.lang.isNull(list_features)) list_features = [];
                    list_features.push(features.getTree());



                    break;

                default :
                    break loop6;
                }
            } while (true);

            char_literal15=this.match(this.input,12,DomainmodelParser.FOLLOW_12_in_rule_Entity193); 
            char_literal15_tree = this.adaptor.create(char_literal15);
            this.adaptor.addChild(root_0, char_literal15_tree);




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
    rule_Feature_return: (function() {
        DomainmodelParser.rule_Feature_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_Feature_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:66:1: rule_Feature : ( rule_StructuralFeature | rule_Operation );
    // $ANTLR start "rule_Feature"
    rule_Feature: function() {
        var retval = new DomainmodelParser.rule_Feature_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_StructuralFeature16 = null;
         var rule_Operation17 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:66:13: ( rule_StructuralFeature | rule_Operation )
            var alt7=2;
            var LA7_0 = this.input.LA(1);

            if ( (LA7_0==ID||LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==19||(LA7_0>=25 && LA7_0<=27)) ) {
                alt7=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 7, 0, this.input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:67:2: rule_StructuralFeature
                    root_0 = this.adaptor.nil();

                    this.pushFollow(DomainmodelParser.FOLLOW_rule_StructuralFeature_in_rule_Feature204);
                    rule_StructuralFeature16=this.rule_StructuralFeature();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_StructuralFeature16.getTree());


                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:67:27: rule_Operation
                    root_0 = this.adaptor.nil();

                    this.pushFollow(DomainmodelParser.FOLLOW_rule_Operation_in_rule_Feature208);
                    rule_Operation17=this.rule_Operation();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Operation17.getTree());


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
    rule_StructuralFeature_return: (function() {
        DomainmodelParser.rule_StructuralFeature_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_StructuralFeature_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:72:1: rule_StructuralFeature : ( rule_Attribute | rule_Reference );
    // $ANTLR start "rule_StructuralFeature"
    rule_StructuralFeature: function() {
        var retval = new DomainmodelParser.rule_StructuralFeature_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_Attribute18 = null;
         var rule_Reference19 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:72:23: ( rule_Attribute | rule_Reference )
            var alt8=2;
            var LA8_0 = this.input.LA(1);

            if ( (LA8_0==ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 8, 0, this.input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:73:2: rule_Attribute
                    root_0 = this.adaptor.nil();

                    this.pushFollow(DomainmodelParser.FOLLOW_rule_Attribute_in_rule_StructuralFeature219);
                    rule_Attribute18=this.rule_Attribute();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Attribute18.getTree());


                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:73:19: rule_Reference
                    root_0 = this.adaptor.nil();

                    this.pushFollow(DomainmodelParser.FOLLOW_rule_Reference_in_rule_StructuralFeature223);
                    rule_Reference19=this.rule_Reference();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Reference19.getTree());


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
    rule_Attribute_return: (function() {
        DomainmodelParser.rule_Attribute_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_Attribute_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:78:1: rule_Attribute : name= ID ':' type= rule_TypeRef ;
    // $ANTLR start "rule_Attribute"
    rule_Attribute: function() {
        var retval = new DomainmodelParser.rule_Attribute_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var char_literal20 = null;
         var type = null;

        var name_tree=null;
        var char_literal20_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:78:15: (name= ID ':' type= rule_TypeRef )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:79:2: name= ID ':' type= rule_TypeRef
            root_0 = this.adaptor.nil();

            name=this.match(this.input,ID,DomainmodelParser.FOLLOW_ID_in_rule_Attribute236); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            char_literal20=this.match(this.input,16,DomainmodelParser.FOLLOW_16_in_rule_Attribute238); 
            char_literal20_tree = this.adaptor.create(char_literal20);
            this.adaptor.addChild(root_0, char_literal20_tree);

            this.pushFollow(DomainmodelParser.FOLLOW_rule_TypeRef_in_rule_Attribute242);
            type=this.rule_TypeRef();

            this.state._fsp--;

            this.adaptor.addChild(root_0, type.getTree());



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
    rule_Reference_return: (function() {
        DomainmodelParser.rule_Reference_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_Reference_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:84:1: rule_Reference : 'ref' name= ID ':' type= rule_TypeRef ( 'opposite' opposite= ID )? ;
    // $ANTLR start "rule_Reference"
    rule_Reference: function() {
        var retval = new DomainmodelParser.rule_Reference_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var opposite = null;
        var string_literal21 = null;
        var char_literal22 = null;
        var string_literal23 = null;
         var type = null;

        var name_tree=null;
        var opposite_tree=null;
        var string_literal21_tree=null;
        var char_literal22_tree=null;
        var string_literal23_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:84:15: ( 'ref' name= ID ':' type= rule_TypeRef ( 'opposite' opposite= ID )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:85:2: 'ref' name= ID ':' type= rule_TypeRef ( 'opposite' opposite= ID )?
            root_0 = this.adaptor.nil();

            string_literal21=this.match(this.input,17,DomainmodelParser.FOLLOW_17_in_rule_Reference253); 
            string_literal21_tree = this.adaptor.create(string_literal21);
            this.adaptor.addChild(root_0, string_literal21_tree);

            name=this.match(this.input,ID,DomainmodelParser.FOLLOW_ID_in_rule_Reference257); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            char_literal22=this.match(this.input,16,DomainmodelParser.FOLLOW_16_in_rule_Reference259); 
            char_literal22_tree = this.adaptor.create(char_literal22);
            this.adaptor.addChild(root_0, char_literal22_tree);

            this.pushFollow(DomainmodelParser.FOLLOW_rule_TypeRef_in_rule_Reference263);
            type=this.rule_TypeRef();

            this.state._fsp--;

            this.adaptor.addChild(root_0, type.getTree());
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:85:38: ( 'opposite' opposite= ID )?
            var alt9=2;
            var LA9_0 = this.input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:85:39: 'opposite' opposite= ID
                    string_literal23=this.match(this.input,18,DomainmodelParser.FOLLOW_18_in_rule_Reference266); 
                    string_literal23_tree = this.adaptor.create(string_literal23);
                    this.adaptor.addChild(root_0, string_literal23_tree);

                    opposite=this.match(this.input,ID,DomainmodelParser.FOLLOW_ID_in_rule_Reference270); 
                    opposite_tree = this.adaptor.create(opposite);
                    this.adaptor.addChild(root_0, opposite_tree);



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
    rule_Operation_return: (function() {
        DomainmodelParser.rule_Operation_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_Operation_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:90:1: rule_Operation : (visibility= rule_Visibility )? 'op' name= ID '(' (params+= rule_Parameter ( ',' params+= rule_Parameter )* )? ')' ':' type= rule_TypeRef ;
    // $ANTLR start "rule_Operation"
    rule_Operation: function() {
        var retval = new DomainmodelParser.rule_Operation_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var string_literal24 = null;
        var char_literal25 = null;
        var char_literal26 = null;
        var char_literal27 = null;
        var char_literal28 = null;
        var list_params=null;
         var visibility = null;
         var type = null;
        var params = null;
        var name_tree=null;
        var string_literal24_tree=null;
        var char_literal25_tree=null;
        var char_literal26_tree=null;
        var char_literal27_tree=null;
        var char_literal28_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:90:15: ( (visibility= rule_Visibility )? 'op' name= ID '(' (params+= rule_Parameter ( ',' params+= rule_Parameter )* )? ')' ':' type= rule_TypeRef )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:91:2: (visibility= rule_Visibility )? 'op' name= ID '(' (params+= rule_Parameter ( ',' params+= rule_Parameter )* )? ')' ':' type= rule_TypeRef
            root_0 = this.adaptor.nil();

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:91:12: (visibility= rule_Visibility )?
            var alt10=2;
            var LA10_0 = this.input.LA(1);

            if ( ((LA10_0>=25 && LA10_0<=27)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:91:12: visibility= rule_Visibility
                    this.pushFollow(DomainmodelParser.FOLLOW_rule_Visibility_in_rule_Operation285);
                    visibility=this.rule_Visibility();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, visibility.getTree());


                    break;

            }

            string_literal24=this.match(this.input,19,DomainmodelParser.FOLLOW_19_in_rule_Operation288); 
            string_literal24_tree = this.adaptor.create(string_literal24);
            this.adaptor.addChild(root_0, string_literal24_tree);

            name=this.match(this.input,ID,DomainmodelParser.FOLLOW_ID_in_rule_Operation292); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            char_literal25=this.match(this.input,20,DomainmodelParser.FOLLOW_20_in_rule_Operation294); 
            char_literal25_tree = this.adaptor.create(char_literal25);
            this.adaptor.addChild(root_0, char_literal25_tree);

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:91:47: (params+= rule_Parameter ( ',' params+= rule_Parameter )* )?
            var alt12=2;
            var LA12_0 = this.input.LA(1);

            if ( (LA12_0==ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:91:48: params+= rule_Parameter ( ',' params+= rule_Parameter )*
                    this.pushFollow(DomainmodelParser.FOLLOW_rule_Parameter_in_rule_Operation299);
                    params=this.rule_Parameter();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, params.getTree());
                    if (org.antlr.lang.isNull(list_params)) list_params = [];
                    list_params.push(params.getTree());

                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:91:71: ( ',' params+= rule_Parameter )*
                    loop11:
                    do {
                        var alt11=2;
                        var LA11_0 = this.input.LA(1);

                        if ( (LA11_0==21) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:91:72: ',' params+= rule_Parameter
                            char_literal26=this.match(this.input,21,DomainmodelParser.FOLLOW_21_in_rule_Operation302); 
                            char_literal26_tree = this.adaptor.create(char_literal26);
                            this.adaptor.addChild(root_0, char_literal26_tree);

                            this.pushFollow(DomainmodelParser.FOLLOW_rule_Parameter_in_rule_Operation306);
                            params=this.rule_Parameter();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, params.getTree());
                            if (org.antlr.lang.isNull(list_params)) list_params = [];
                            list_params.push(params.getTree());



                            break;

                        default :
                            break loop11;
                        }
                    } while (true);



                    break;

            }

            char_literal27=this.match(this.input,22,DomainmodelParser.FOLLOW_22_in_rule_Operation312); 
            char_literal27_tree = this.adaptor.create(char_literal27);
            this.adaptor.addChild(root_0, char_literal27_tree);

            char_literal28=this.match(this.input,16,DomainmodelParser.FOLLOW_16_in_rule_Operation314); 
            char_literal28_tree = this.adaptor.create(char_literal28);
            this.adaptor.addChild(root_0, char_literal28_tree);

            this.pushFollow(DomainmodelParser.FOLLOW_rule_TypeRef_in_rule_Operation318);
            type=this.rule_TypeRef();

            this.state._fsp--;

            this.adaptor.addChild(root_0, type.getTree());



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
        DomainmodelParser.rule_Parameter_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_Parameter_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:96:1: rule_Parameter : name= ID type= rule_TypeRef ;
    // $ANTLR start "rule_Parameter"
    rule_Parameter: function() {
        var retval = new DomainmodelParser.rule_Parameter_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
         var type = null;

        var name_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:96:15: (name= ID type= rule_TypeRef )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:97:2: name= ID type= rule_TypeRef
            root_0 = this.adaptor.nil();

            name=this.match(this.input,ID,DomainmodelParser.FOLLOW_ID_in_rule_Parameter331); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            this.pushFollow(DomainmodelParser.FOLLOW_rule_TypeRef_in_rule_Parameter335);
            type=this.rule_TypeRef();

            this.state._fsp--;

            this.adaptor.addChild(root_0, type.getTree());



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
    rule_TypeRef_return: (function() {
        DomainmodelParser.rule_TypeRef_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_TypeRef_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:102:1: rule_TypeRef : referenced= ID (multi= '*' )? ;
    // $ANTLR start "rule_TypeRef"
    rule_TypeRef: function() {
        var retval = new DomainmodelParser.rule_TypeRef_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var referenced = null;
        var multi = null;

        var referenced_tree=null;
        var multi_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:102:13: (referenced= ID (multi= '*' )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:103:2: referenced= ID (multi= '*' )?
            root_0 = this.adaptor.nil();

            referenced=this.match(this.input,ID,DomainmodelParser.FOLLOW_ID_in_rule_TypeRef348); 
            referenced_tree = this.adaptor.create(referenced);
            this.adaptor.addChild(root_0, referenced_tree);

            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:103:21: (multi= '*' )?
            var alt13=2;
            var LA13_0 = this.input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:103:21: multi= '*'
                    multi=this.match(this.input,23,DomainmodelParser.FOLLOW_23_in_rule_TypeRef352); 
                    multi_tree = this.adaptor.create(multi);
                    this.adaptor.addChild(root_0, multi_tree);



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
    rule_QualifiedName_return: (function() {
        DomainmodelParser.rule_QualifiedName_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_QualifiedName_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:108:1: rule_QualifiedName : rule_ValidID ( '.' rule_ValidID )* ;
    // $ANTLR start "rule_QualifiedName"
    rule_QualifiedName: function() {
        var retval = new DomainmodelParser.rule_QualifiedName_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal30 = null;
         var rule_ValidID29 = null;
         var rule_ValidID31 = null;

        var char_literal30_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:108:19: ( rule_ValidID ( '.' rule_ValidID )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:109:3: rule_ValidID ( '.' rule_ValidID )*
            root_0 = this.adaptor.nil();

            this.pushFollow(DomainmodelParser.FOLLOW_rule_ValidID_in_rule_QualifiedName366);
            rule_ValidID29=this.rule_ValidID();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_ValidID29.getTree());
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:109:16: ( '.' rule_ValidID )*
            loop14:
            do {
                var alt14=2;
                var LA14_0 = this.input.LA(1);

                if ( (LA14_0==24) ) {
                    var LA14_2 = this.input.LA(2);

                    if ( (LA14_2==ID) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:109:17: '.' rule_ValidID
                    char_literal30=this.match(this.input,24,DomainmodelParser.FOLLOW_24_in_rule_QualifiedName369); 
                    char_literal30_tree = this.adaptor.create(char_literal30);
                    this.adaptor.addChild(root_0, char_literal30_tree);

                    this.pushFollow(DomainmodelParser.FOLLOW_rule_ValidID_in_rule_QualifiedName371);
                    rule_ValidID31=this.rule_ValidID();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_ValidID31.getTree());


                    break;

                default :
                    break loop14;
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
    rule_QualifiedNameWithWildcard_return: (function() {
        DomainmodelParser.rule_QualifiedNameWithWildcard_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_QualifiedNameWithWildcard_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:114:1: rule_QualifiedNameWithWildcard : rule_QualifiedName '.' '*' ;
    // $ANTLR start "rule_QualifiedNameWithWildcard"
    rule_QualifiedNameWithWildcard: function() {
        var retval = new DomainmodelParser.rule_QualifiedNameWithWildcard_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal33 = null;
        var char_literal34 = null;
         var rule_QualifiedName32 = null;

        var char_literal33_tree=null;
        var char_literal34_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:114:32: ( rule_QualifiedName '.' '*' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:115:2: rule_QualifiedName '.' '*'
            root_0 = this.adaptor.nil();

            this.pushFollow(DomainmodelParser.FOLLOW_rule_QualifiedName_in_rule_QualifiedNameWithWildcard385);
            rule_QualifiedName32=this.rule_QualifiedName();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_QualifiedName32.getTree());
            char_literal33=this.match(this.input,24,DomainmodelParser.FOLLOW_24_in_rule_QualifiedNameWithWildcard388); 
            char_literal33_tree = this.adaptor.create(char_literal33);
            this.adaptor.addChild(root_0, char_literal33_tree);

            char_literal34=this.match(this.input,23,DomainmodelParser.FOLLOW_23_in_rule_QualifiedNameWithWildcard390); 
            char_literal34_tree = this.adaptor.create(char_literal34);
            this.adaptor.addChild(root_0, char_literal34_tree);




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
    rule_ValidID_return: (function() {
        DomainmodelParser.rule_ValidID_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_ValidID_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:120:1: rule_ValidID : ID ;
    // $ANTLR start "rule_ValidID"
    rule_ValidID: function() {
        var retval = new DomainmodelParser.rule_ValidID_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var ID35 = null;

        var ID35_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:120:13: ( ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:121:2: ID
            root_0 = this.adaptor.nil();

            ID35=this.match(this.input,ID,DomainmodelParser.FOLLOW_ID_in_rule_ValidID401); 
            ID35_tree = this.adaptor.create(ID35);
            this.adaptor.addChild(root_0, ID35_tree);




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
    rule_Visibility_return: (function() {
        DomainmodelParser.rule_Visibility_return = function(){};
        org.antlr.lang.extend(DomainmodelParser.rule_Visibility_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:124:1: rule_Visibility : (public_= 'public' | private_= 'private' | protected_= 'protected' );
    // $ANTLR start "rule_Visibility"
    rule_Visibility: function() {
        var retval = new DomainmodelParser.rule_Visibility_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var public_ = null;
        var private_ = null;
        var protected_ = null;

        var public__tree=null;
        var private__tree=null;
        var protected__tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:124:16: (public_= 'public' | private_= 'private' | protected_= 'protected' )
            var alt15=3;
            switch ( this.input.LA(1) ) {
            case 25:
                alt15=1;
                break;
            case 26:
                alt15=2;
                break;
            case 27:
                alt15=3;
                break;
            default:
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 15, 0, this.input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:125:2: public_= 'public'
                    root_0 = this.adaptor.nil();

                    public_=this.match(this.input,25,DomainmodelParser.FOLLOW_25_in_rule_Visibility413); 
                    public__tree = this.adaptor.create(public_);
                    this.adaptor.addChild(root_0, public__tree);



                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:125:21: private_= 'private'
                    root_0 = this.adaptor.nil();

                    private_=this.match(this.input,26,DomainmodelParser.FOLLOW_26_in_rule_Visibility419); 
                    private__tree = this.adaptor.create(private_);
                    this.adaptor.addChild(root_0, private__tree);



                    break;
                case 3 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-js\\org\\eclipse\\xtext\\example\\domainmodel\\web\\parser\\Domainmodel.g:125:42: protected_= 'protected'
                    root_0 = this.adaptor.nil();

                    protected_=this.match(this.input,27,DomainmodelParser.FOLLOW_27_in_rule_Visibility425); 
                    protected__tree = this.adaptor.create(protected_);
                    this.adaptor.addChild(root_0, protected__tree);



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
org.antlr.lang.augmentObject(DomainmodelParser, {
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "STRING", "COMMENT", "WS", "INT", "'import'", "'package'", "'{'", "'}'", "'datatype'", "'entity'", "'extends'", "':'", "'ref'", "'opposite'", "'op'", "'('", "','", "')'", "'*'", "'.'", "'public'", "'private'", "'protected'"],
    FOLLOW_rule_AbstractElement_in_rule_DomainModel62: new org.antlr.runtime.BitSet([0x00006600, 0x00000000]),
    FOLLOW_EOF_in_rule_DomainModel65: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_PackageDeclaration_in_rule_AbstractElement77: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Type_in_rule_AbstractElement81: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Import_in_rule_AbstractElement85: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_9_in_rule_Import96: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_QualifiedNameWithWildcard_in_rule_Import100: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_10_in_rule_PackageDeclaration111: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_QualifiedName_in_rule_PackageDeclaration115: new org.antlr.runtime.BitSet([0x00000800, 0x00000000]),
    FOLLOW_11_in_rule_PackageDeclaration117: new org.antlr.runtime.BitSet([0x00007600, 0x00000000]),
    FOLLOW_rule_AbstractElement_in_rule_PackageDeclaration123: new org.antlr.runtime.BitSet([0x00007600, 0x00000000]),
    FOLLOW_12_in_rule_PackageDeclaration127: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Entity_in_rule_Type138: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_DataType_in_rule_Type142: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_13_in_rule_DataType153: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_DataType157: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_14_in_rule_Entity168: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Entity172: new org.antlr.runtime.BitSet([0x00008800, 0x00000000]),
    FOLLOW_15_in_rule_Entity175: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Entity179: new org.antlr.runtime.BitSet([0x00000800, 0x00000000]),
    FOLLOW_11_in_rule_Entity183: new org.antlr.runtime.BitSet([0x0E0A1010, 0x00000000]),
    FOLLOW_rule_Feature_in_rule_Entity189: new org.antlr.runtime.BitSet([0x0E0A1010, 0x00000000]),
    FOLLOW_12_in_rule_Entity193: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_StructuralFeature_in_rule_Feature204: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Operation_in_rule_Feature208: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Attribute_in_rule_StructuralFeature219: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Reference_in_rule_StructuralFeature223: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_Attribute236: new org.antlr.runtime.BitSet([0x00010000, 0x00000000]),
    FOLLOW_16_in_rule_Attribute238: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_TypeRef_in_rule_Attribute242: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_17_in_rule_Reference253: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Reference257: new org.antlr.runtime.BitSet([0x00010000, 0x00000000]),
    FOLLOW_16_in_rule_Reference259: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_TypeRef_in_rule_Reference263: new org.antlr.runtime.BitSet([0x00040002, 0x00000000]),
    FOLLOW_18_in_rule_Reference266: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Reference270: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Visibility_in_rule_Operation285: new org.antlr.runtime.BitSet([0x00080000, 0x00000000]),
    FOLLOW_19_in_rule_Operation288: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Operation292: new org.antlr.runtime.BitSet([0x00100000, 0x00000000]),
    FOLLOW_20_in_rule_Operation294: new org.antlr.runtime.BitSet([0x00400010, 0x00000000]),
    FOLLOW_rule_Parameter_in_rule_Operation299: new org.antlr.runtime.BitSet([0x00600000, 0x00000000]),
    FOLLOW_21_in_rule_Operation302: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_Parameter_in_rule_Operation306: new org.antlr.runtime.BitSet([0x00600000, 0x00000000]),
    FOLLOW_22_in_rule_Operation312: new org.antlr.runtime.BitSet([0x00010000, 0x00000000]),
    FOLLOW_16_in_rule_Operation314: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_TypeRef_in_rule_Operation318: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_Parameter331: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_TypeRef_in_rule_Parameter335: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_TypeRef348: new org.antlr.runtime.BitSet([0x00800002, 0x00000000]),
    FOLLOW_23_in_rule_TypeRef352: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_ValidID_in_rule_QualifiedName366: new org.antlr.runtime.BitSet([0x01000002, 0x00000000]),
    FOLLOW_24_in_rule_QualifiedName369: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_ValidID_in_rule_QualifiedName371: new org.antlr.runtime.BitSet([0x01000002, 0x00000000]),
    FOLLOW_rule_QualifiedName_in_rule_QualifiedNameWithWildcard385: new org.antlr.runtime.BitSet([0x01000000, 0x00000000]),
    FOLLOW_24_in_rule_QualifiedNameWithWildcard388: new org.antlr.runtime.BitSet([0x00800000, 0x00000000]),
    FOLLOW_23_in_rule_QualifiedNameWithWildcard390: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_ValidID401: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_25_in_rule_Visibility413: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_26_in_rule_Visibility419: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_27_in_rule_Visibility425: new org.antlr.runtime.BitSet([0x00000002, 0x00000000])
});

})();