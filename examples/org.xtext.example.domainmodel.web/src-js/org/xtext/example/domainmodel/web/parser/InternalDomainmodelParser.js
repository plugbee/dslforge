// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g 2015-11-15 16:37:03



var InternalDomainmodelParser = function(input, state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    InternalDomainmodelParser.superclass.constructor.call(this, input, state);


         

    /* @todo only create adaptor if output=AST */
    this.adaptor = new org.antlr.runtime.tree.CommonTreeAdaptor();

};

org.antlr.lang.augmentObject(InternalDomainmodelParser, {
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
    ID= 4,
    STRING= 5,
    COMMENT= 6,
    WS= 7,
    INT= 8;

// public instance methods/vars
org.antlr.lang.extend(InternalDomainmodelParser, org.antlr.runtime.Parser, {
        
    setTreeAdaptor: function(adaptor) {
        this.adaptor = adaptor;
    },
    getTreeAdaptor: function() {
        return this.adaptor;
    },

    getTokenNames: function() { return InternalDomainmodelParser.tokenNames; },
    getGrammarFileName: function() { return "D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g"; }
});
org.antlr.lang.augmentObject(InternalDomainmodelParser.prototype, {

    // inline static return class
    rule_DomainModel_return: (function() {
        InternalDomainmodelParser.rule_DomainModel_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_DomainModel_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:16:1: rule_DomainModel : (importsection= rule_ImportSection )? (elements+= rule_AbstractElement )* EOF ;
    // $ANTLR start "rule_DomainModel"
    rule_DomainModel: function() {
        var retval = new InternalDomainmodelParser.rule_DomainModel_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var EOF1 = null;
        var list_elements=null;
         var importsection = null;
        var elements = null;
        var EOF1_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:16:17: ( (importsection= rule_ImportSection )? (elements+= rule_AbstractElement )* EOF )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:17:2: (importsection= rule_ImportSection )? (elements+= rule_AbstractElement )* EOF
            root_0 = this.adaptor.nil();

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:17:15: (importsection= rule_ImportSection )?
            var alt1=2;
            var LA1_0 = this.input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:17:15: importsection= rule_ImportSection
                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_ImportSection_in_rule_DomainModel57);
                    importsection=this.rule_ImportSection();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, importsection.getTree());


                    break;

            }

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:18:10: (elements+= rule_AbstractElement )*
            loop2:
            do {
                var alt2=2;
                var LA2_0 = this.input.LA(1);

                if ( (LA2_0==9||LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:18:10: elements+= rule_AbstractElement
                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_AbstractElement_in_rule_DomainModel63);
                    elements=this.rule_AbstractElement();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, elements.getTree());
                    if (org.antlr.lang.isNull(list_elements)) list_elements = [];
                    list_elements.push(elements.getTree());



                    break;

                default :
                    break loop2;
                }
            } while (true);

            EOF1=this.match(this.input,EOF,InternalDomainmodelParser.FOLLOW_EOF_in_rule_DomainModel66); 



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
        InternalDomainmodelParser.rule_AbstractElement_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_AbstractElement_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:21:1: rule_AbstractElement : ( rule_PackageDeclaration | rule_Entity );
    // $ANTLR start "rule_AbstractElement"
    rule_AbstractElement: function() {
        var retval = new InternalDomainmodelParser.rule_AbstractElement_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_PackageDeclaration2 = null;
         var rule_Entity3 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:21:21: ( rule_PackageDeclaration | rule_Entity )
            var alt3=2;
            var LA3_0 = this.input.LA(1);

            if ( (LA3_0==9) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 3, 0, this.input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:22:2: rule_PackageDeclaration
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_PackageDeclaration_in_rule_AbstractElement76);
                    rule_PackageDeclaration2=this.rule_PackageDeclaration();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_PackageDeclaration2.getTree());


                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:22:28: rule_Entity
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_Entity_in_rule_AbstractElement80);
                    rule_Entity3=this.rule_Entity();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Entity3.getTree());


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
    rule_PackageDeclaration_return: (function() {
        InternalDomainmodelParser.rule_PackageDeclaration_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_PackageDeclaration_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:25:1: rule_PackageDeclaration : 'package' name= rule_QualifiedName '{' (elements+= rule_AbstractElement )* '}' ;
    // $ANTLR start "rule_PackageDeclaration"
    rule_PackageDeclaration: function() {
        var retval = new InternalDomainmodelParser.rule_PackageDeclaration_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var string_literal4 = null;
        var char_literal5 = null;
        var char_literal6 = null;
        var list_elements=null;
         var name = null;
        var elements = null;
        var string_literal4_tree=null;
        var char_literal5_tree=null;
        var char_literal6_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:25:24: ( 'package' name= rule_QualifiedName '{' (elements+= rule_AbstractElement )* '}' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:26:2: 'package' name= rule_QualifiedName '{' (elements+= rule_AbstractElement )* '}'
            root_0 = this.adaptor.nil();

            string_literal4=this.match(this.input,9,InternalDomainmodelParser.FOLLOW_9_in_rule_PackageDeclaration89); 
            string_literal4_tree = this.adaptor.create(string_literal4);
            this.adaptor.addChild(root_0, string_literal4_tree);

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_QualifiedName_in_rule_PackageDeclaration93);
            name=this.rule_QualifiedName();

            this.state._fsp--;

            this.adaptor.addChild(root_0, name.getTree());
            char_literal5=this.match(this.input,10,InternalDomainmodelParser.FOLLOW_10_in_rule_PackageDeclaration95); 
            char_literal5_tree = this.adaptor.create(char_literal5);
            this.adaptor.addChild(root_0, char_literal5_tree);

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:27:11: (elements+= rule_AbstractElement )*
            loop4:
            do {
                var alt4=2;
                var LA4_0 = this.input.LA(1);

                if ( (LA4_0==9||LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:27:11: elements+= rule_AbstractElement
                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_AbstractElement_in_rule_PackageDeclaration101);
                    elements=this.rule_AbstractElement();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, elements.getTree());
                    if (org.antlr.lang.isNull(list_elements)) list_elements = [];
                    list_elements.push(elements.getTree());



                    break;

                default :
                    break loop4;
                }
            } while (true);

            char_literal6=this.match(this.input,11,InternalDomainmodelParser.FOLLOW_11_in_rule_PackageDeclaration105); 
            char_literal6_tree = this.adaptor.create(char_literal6);
            this.adaptor.addChild(root_0, char_literal6_tree);




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
        InternalDomainmodelParser.rule_Entity_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_Entity_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:31:1: rule_Entity : 'entity' name= rule_ValidID ( 'extends' supertype= ID )? '{' (features+= rule_Feature )* '}' ;
    // $ANTLR start "rule_Entity"
    rule_Entity: function() {
        var retval = new InternalDomainmodelParser.rule_Entity_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var supertype = null;
        var string_literal7 = null;
        var string_literal8 = null;
        var char_literal9 = null;
        var char_literal10 = null;
        var list_features=null;
         var name = null;
        var features = null;
        var supertype_tree=null;
        var string_literal7_tree=null;
        var string_literal8_tree=null;
        var char_literal9_tree=null;
        var char_literal10_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:31:12: ( 'entity' name= rule_ValidID ( 'extends' supertype= ID )? '{' (features+= rule_Feature )* '}' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:32:2: 'entity' name= rule_ValidID ( 'extends' supertype= ID )? '{' (features+= rule_Feature )* '}'
            root_0 = this.adaptor.nil();

            string_literal7=this.match(this.input,12,InternalDomainmodelParser.FOLLOW_12_in_rule_Entity114); 
            string_literal7_tree = this.adaptor.create(string_literal7);
            this.adaptor.addChild(root_0, string_literal7_tree);

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_ValidID_in_rule_Entity118);
            name=this.rule_ValidID();

            this.state._fsp--;

            this.adaptor.addChild(root_0, name.getTree());
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:32:29: ( 'extends' supertype= ID )?
            var alt5=2;
            var LA5_0 = this.input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:32:30: 'extends' supertype= ID
                    string_literal8=this.match(this.input,13,InternalDomainmodelParser.FOLLOW_13_in_rule_Entity121); 
                    string_literal8_tree = this.adaptor.create(string_literal8);
                    this.adaptor.addChild(root_0, string_literal8_tree);

                    supertype=this.match(this.input,ID,InternalDomainmodelParser.FOLLOW_ID_in_rule_Entity125); 
                    supertype_tree = this.adaptor.create(supertype);
                    this.adaptor.addChild(root_0, supertype_tree);



                    break;

            }

            char_literal9=this.match(this.input,10,InternalDomainmodelParser.FOLLOW_10_in_rule_Entity129); 
            char_literal9_tree = this.adaptor.create(char_literal9);
            this.adaptor.addChild(root_0, char_literal9_tree);

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:33:11: (features+= rule_Feature )*
            loop6:
            do {
                var alt6=2;
                var LA6_0 = this.input.LA(1);

                if ( (LA6_0==ID||LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:33:11: features+= rule_Feature
                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_Feature_in_rule_Entity135);
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

            char_literal10=this.match(this.input,11,InternalDomainmodelParser.FOLLOW_11_in_rule_Entity139); 
            char_literal10_tree = this.adaptor.create(char_literal10);
            this.adaptor.addChild(root_0, char_literal10_tree);




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
        InternalDomainmodelParser.rule_Feature_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_Feature_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:37:1: rule_Feature : ( rule_Property | rule_Operation );
    // $ANTLR start "rule_Feature"
    rule_Feature: function() {
        var retval = new InternalDomainmodelParser.rule_Feature_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_Property11 = null;
         var rule_Operation12 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:37:13: ( rule_Property | rule_Operation )
            var alt7=2;
            var LA7_0 = this.input.LA(1);

            if ( (LA7_0==ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 7, 0, this.input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:38:2: rule_Property
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_Property_in_rule_Feature148);
                    rule_Property11=this.rule_Property();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Property11.getTree());


                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:38:18: rule_Operation
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_Operation_in_rule_Feature152);
                    rule_Operation12=this.rule_Operation();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_Operation12.getTree());


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
    rule_Property_return: (function() {
        InternalDomainmodelParser.rule_Property_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_Property_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:41:1: rule_Property : name= rule_ValidID ':' type= ID ;
    // $ANTLR start "rule_Property"
    rule_Property: function() {
        var retval = new InternalDomainmodelParser.rule_Property_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var type = null;
        var char_literal13 = null;
         var name = null;

        var type_tree=null;
        var char_literal13_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:41:14: (name= rule_ValidID ':' type= ID )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:42:2: name= rule_ValidID ':' type= ID
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_ValidID_in_rule_Property163);
            name=this.rule_ValidID();

            this.state._fsp--;

            this.adaptor.addChild(root_0, name.getTree());
            char_literal13=this.match(this.input,14,InternalDomainmodelParser.FOLLOW_14_in_rule_Property165); 
            char_literal13_tree = this.adaptor.create(char_literal13);
            this.adaptor.addChild(root_0, char_literal13_tree);

            type=this.match(this.input,ID,InternalDomainmodelParser.FOLLOW_ID_in_rule_Property169); 
            type_tree = this.adaptor.create(type);
            this.adaptor.addChild(root_0, type_tree);




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
        InternalDomainmodelParser.rule_Operation_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_Operation_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:45:1: rule_Operation : 'op' name= rule_ValidID '(' (params+= ID ( ',' params+= ID )* )? ')' ( ':' type= ID )? ;
    // $ANTLR start "rule_Operation"
    rule_Operation: function() {
        var retval = new InternalDomainmodelParser.rule_Operation_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var type = null;
        var string_literal14 = null;
        var char_literal15 = null;
        var char_literal16 = null;
        var char_literal17 = null;
        var char_literal18 = null;
        var params = null;
        var list_params=null;
         var name = null;

        var type_tree=null;
        var string_literal14_tree=null;
        var char_literal15_tree=null;
        var char_literal16_tree=null;
        var char_literal17_tree=null;
        var char_literal18_tree=null;
        var params_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:45:15: ( 'op' name= rule_ValidID '(' (params+= ID ( ',' params+= ID )* )? ')' ( ':' type= ID )? )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:46:2: 'op' name= rule_ValidID '(' (params+= ID ( ',' params+= ID )* )? ')' ( ':' type= ID )?
            root_0 = this.adaptor.nil();

            string_literal14=this.match(this.input,15,InternalDomainmodelParser.FOLLOW_15_in_rule_Operation178); 
            string_literal14_tree = this.adaptor.create(string_literal14);
            this.adaptor.addChild(root_0, string_literal14_tree);

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_ValidID_in_rule_Operation182);
            name=this.rule_ValidID();

            this.state._fsp--;

            this.adaptor.addChild(root_0, name.getTree());
            char_literal15=this.match(this.input,16,InternalDomainmodelParser.FOLLOW_16_in_rule_Operation184); 
            char_literal15_tree = this.adaptor.create(char_literal15);
            this.adaptor.addChild(root_0, char_literal15_tree);

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:46:29: (params+= ID ( ',' params+= ID )* )?
            var alt9=2;
            var LA9_0 = this.input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:46:30: params+= ID ( ',' params+= ID )*
                    params=this.match(this.input,ID,InternalDomainmodelParser.FOLLOW_ID_in_rule_Operation189); 
                    params_tree = this.adaptor.create(params);
                    this.adaptor.addChild(root_0, params_tree);

                    if (org.antlr.lang.isNull(list_params)) list_params = [];
                    list_params.push(params);

                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:46:41: ( ',' params+= ID )*
                    loop8:
                    do {
                        var alt8=2;
                        var LA8_0 = this.input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:46:42: ',' params+= ID
                            char_literal16=this.match(this.input,17,InternalDomainmodelParser.FOLLOW_17_in_rule_Operation192); 
                            char_literal16_tree = this.adaptor.create(char_literal16);
                            this.adaptor.addChild(root_0, char_literal16_tree);

                            params=this.match(this.input,ID,InternalDomainmodelParser.FOLLOW_ID_in_rule_Operation196); 
                            params_tree = this.adaptor.create(params);
                            this.adaptor.addChild(root_0, params_tree);

                            if (org.antlr.lang.isNull(list_params)) list_params = [];
                            list_params.push(params);



                            break;

                        default :
                            break loop8;
                        }
                    } while (true);



                    break;

            }

            char_literal17=this.match(this.input,18,InternalDomainmodelParser.FOLLOW_18_in_rule_Operation202); 
            char_literal17_tree = this.adaptor.create(char_literal17);
            this.adaptor.addChild(root_0, char_literal17_tree);

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:46:65: ( ':' type= ID )?
            var alt10=2;
            var LA10_0 = this.input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:46:66: ':' type= ID
                    char_literal18=this.match(this.input,14,InternalDomainmodelParser.FOLLOW_14_in_rule_Operation205); 
                    char_literal18_tree = this.adaptor.create(char_literal18);
                    this.adaptor.addChild(root_0, char_literal18_tree);

                    type=this.match(this.input,ID,InternalDomainmodelParser.FOLLOW_ID_in_rule_Operation209); 
                    type_tree = this.adaptor.create(type);
                    this.adaptor.addChild(root_0, type_tree);



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
    rule_BlockExpression_return: (function() {
        InternalDomainmodelParser.rule_BlockExpression_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_BlockExpression_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:50:1: rule_BlockExpression : '{' 'code' '}' ;
    // $ANTLR start "rule_BlockExpression"
    rule_BlockExpression: function() {
        var retval = new InternalDomainmodelParser.rule_BlockExpression_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal19 = null;
        var string_literal20 = null;
        var char_literal21 = null;

        var char_literal19_tree=null;
        var string_literal20_tree=null;
        var char_literal21_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:50:21: ( '{' 'code' '}' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:51:2: '{' 'code' '}'
            root_0 = this.adaptor.nil();

            char_literal19=this.match(this.input,10,InternalDomainmodelParser.FOLLOW_10_in_rule_BlockExpression222); 
            char_literal19_tree = this.adaptor.create(char_literal19);
            this.adaptor.addChild(root_0, char_literal19_tree);

            string_literal20=this.match(this.input,19,InternalDomainmodelParser.FOLLOW_19_in_rule_BlockExpression224); 
            string_literal20_tree = this.adaptor.create(string_literal20);
            this.adaptor.addChild(root_0, string_literal20_tree);

            char_literal21=this.match(this.input,11,InternalDomainmodelParser.FOLLOW_11_in_rule_BlockExpression226); 
            char_literal21_tree = this.adaptor.create(char_literal21);
            this.adaptor.addChild(root_0, char_literal21_tree);




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
    rule_ImportSection_return: (function() {
        InternalDomainmodelParser.rule_ImportSection_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_ImportSection_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:55:1: rule_ImportSection : (importdeclarations+= rule_ImportDeclaration )+ ;
    // $ANTLR start "rule_ImportSection"
    rule_ImportSection: function() {
        var retval = new InternalDomainmodelParser.rule_ImportSection_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var list_importdeclarations=null;
        var importdeclarations = null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:55:19: ( (importdeclarations+= rule_ImportDeclaration )+ )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:56:2: (importdeclarations+= rule_ImportDeclaration )+
            root_0 = this.adaptor.nil();

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:56:20: (importdeclarations+= rule_ImportDeclaration )+
            var cnt11=0;
            loop11:
            do {
                var alt11=2;
                var LA11_0 = this.input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:56:20: importdeclarations+= rule_ImportDeclaration
                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_ImportDeclaration_in_rule_ImportSection238);
                    importdeclarations=this.rule_ImportDeclaration();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, importdeclarations.getTree());
                    if (org.antlr.lang.isNull(list_importdeclarations)) list_importdeclarations = [];
                    list_importdeclarations.push(importdeclarations.getTree());



                    break;

                default :
                    if ( cnt11 >= 1 ) {
                        break loop11;
                    }
                        var eee = new org.antlr.runtime.EarlyExitException(11, this.input);
                        throw eee;
                }
                cnt11++;
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
    rule_ImportDeclaration_return: (function() {
        InternalDomainmodelParser.rule_ImportDeclaration_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_ImportDeclaration_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:59:1: rule_ImportDeclaration : 'import' importednamespace= rule_QualifiedNameWithWildcard ( ';' )? ;
    // $ANTLR start "rule_ImportDeclaration"
    rule_ImportDeclaration: function() {
        var retval = new InternalDomainmodelParser.rule_ImportDeclaration_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var string_literal22 = null;
        var char_literal23 = null;
         var importednamespace = null;

        var string_literal22_tree=null;
        var char_literal23_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:59:23: ( 'import' importednamespace= rule_QualifiedNameWithWildcard ( ';' )? )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:60:2: 'import' importednamespace= rule_QualifiedNameWithWildcard ( ';' )?
            root_0 = this.adaptor.nil();

            string_literal22=this.match(this.input,20,InternalDomainmodelParser.FOLLOW_20_in_rule_ImportDeclaration248); 
            string_literal22_tree = this.adaptor.create(string_literal22);
            this.adaptor.addChild(root_0, string_literal22_tree);

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_QualifiedNameWithWildcard_in_rule_ImportDeclaration252);
            importednamespace=this.rule_QualifiedNameWithWildcard();

            this.state._fsp--;

            this.adaptor.addChild(root_0, importednamespace.getTree());
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:60:60: ( ';' )?
            var alt12=2;
            var LA12_0 = this.input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:60:60: ';'
                    char_literal23=this.match(this.input,21,InternalDomainmodelParser.FOLLOW_21_in_rule_ImportDeclaration254); 
                    char_literal23_tree = this.adaptor.create(char_literal23);
                    this.adaptor.addChild(root_0, char_literal23_tree);



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
        InternalDomainmodelParser.rule_QualifiedName_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_QualifiedName_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:63:1: rule_QualifiedName : rule_ValidID ( '.' rule_ValidID )* ;
    // $ANTLR start "rule_QualifiedName"
    rule_QualifiedName: function() {
        var retval = new InternalDomainmodelParser.rule_QualifiedName_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal25 = null;
         var rule_ValidID24 = null;
         var rule_ValidID26 = null;

        var char_literal25_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:63:19: ( rule_ValidID ( '.' rule_ValidID )* )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:64:3: rule_ValidID ( '.' rule_ValidID )*
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_ValidID_in_rule_QualifiedName265);
            rule_ValidID24=this.rule_ValidID();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_ValidID24.getTree());
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:64:16: ( '.' rule_ValidID )*
            loop13:
            do {
                var alt13=2;
                var LA13_0 = this.input.LA(1);

                if ( (LA13_0==22) ) {
                    var LA13_2 = this.input.LA(2);

                    if ( (LA13_2==ID) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:64:17: '.' rule_ValidID
                    char_literal25=this.match(this.input,22,InternalDomainmodelParser.FOLLOW_22_in_rule_QualifiedName268); 
                    char_literal25_tree = this.adaptor.create(char_literal25);
                    this.adaptor.addChild(root_0, char_literal25_tree);

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_ValidID_in_rule_QualifiedName270);
                    rule_ValidID26=this.rule_ValidID();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_ValidID26.getTree());


                    break;

                default :
                    break loop13;
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
        InternalDomainmodelParser.rule_QualifiedNameWithWildcard_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_QualifiedNameWithWildcard_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:67:1: rule_QualifiedNameWithWildcard : rule_QualifiedName '.' '*' ;
    // $ANTLR start "rule_QualifiedNameWithWildcard"
    rule_QualifiedNameWithWildcard: function() {
        var retval = new InternalDomainmodelParser.rule_QualifiedNameWithWildcard_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal28 = null;
        var char_literal29 = null;
         var rule_QualifiedName27 = null;

        var char_literal28_tree=null;
        var char_literal29_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:67:32: ( rule_QualifiedName '.' '*' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:68:2: rule_QualifiedName '.' '*'
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_QualifiedName_in_rule_QualifiedNameWithWildcard282);
            rule_QualifiedName27=this.rule_QualifiedName();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_QualifiedName27.getTree());
            char_literal28=this.match(this.input,22,InternalDomainmodelParser.FOLLOW_22_in_rule_QualifiedNameWithWildcard285); 
            char_literal28_tree = this.adaptor.create(char_literal28);
            this.adaptor.addChild(root_0, char_literal28_tree);

            char_literal29=this.match(this.input,23,InternalDomainmodelParser.FOLLOW_23_in_rule_QualifiedNameWithWildcard287); 
            char_literal29_tree = this.adaptor.create(char_literal29);
            this.adaptor.addChild(root_0, char_literal29_tree);




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
        InternalDomainmodelParser.rule_ValidID_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_ValidID_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:71:1: rule_ValidID : ID ;
    // $ANTLR start "rule_ValidID"
    rule_ValidID: function() {
        var retval = new InternalDomainmodelParser.rule_ValidID_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var ID30 = null;

        var ID30_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:71:13: ( ID )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\src-js\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:72:2: ID
            root_0 = this.adaptor.nil();

            ID30=this.match(this.input,ID,InternalDomainmodelParser.FOLLOW_ID_in_rule_ValidID296); 
            ID30_tree = this.adaptor.create(ID30);
            this.adaptor.addChild(root_0, ID30_tree);




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
org.antlr.lang.augmentObject(InternalDomainmodelParser, {
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "STRING", "COMMENT", "WS", "INT", "'package'", "'{'", "'}'", "'entity'", "'extends'", "':'", "'op'", "'('", "','", "')'", "'code'", "'import'", "';'", "'.'", "'*'"],
    FOLLOW_rule_ImportSection_in_rule_DomainModel57: new org.antlr.runtime.BitSet([0x00001200, 0x00000000]),
    FOLLOW_rule_AbstractElement_in_rule_DomainModel63: new org.antlr.runtime.BitSet([0x00001200, 0x00000000]),
    FOLLOW_EOF_in_rule_DomainModel66: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_PackageDeclaration_in_rule_AbstractElement76: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Entity_in_rule_AbstractElement80: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_9_in_rule_PackageDeclaration89: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_QualifiedName_in_rule_PackageDeclaration93: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_PackageDeclaration95: new org.antlr.runtime.BitSet([0x00001A00, 0x00000000]),
    FOLLOW_rule_AbstractElement_in_rule_PackageDeclaration101: new org.antlr.runtime.BitSet([0x00001A00, 0x00000000]),
    FOLLOW_11_in_rule_PackageDeclaration105: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_12_in_rule_Entity114: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_ValidID_in_rule_Entity118: new org.antlr.runtime.BitSet([0x00002400, 0x00000000]),
    FOLLOW_13_in_rule_Entity121: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Entity125: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_Entity129: new org.antlr.runtime.BitSet([0x00008810, 0x00000000]),
    FOLLOW_rule_Feature_in_rule_Entity135: new org.antlr.runtime.BitSet([0x00008810, 0x00000000]),
    FOLLOW_11_in_rule_Entity139: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Property_in_rule_Feature148: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_Operation_in_rule_Feature152: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_ValidID_in_rule_Property163: new org.antlr.runtime.BitSet([0x00004000, 0x00000000]),
    FOLLOW_14_in_rule_Property165: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Property169: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_15_in_rule_Operation178: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_ValidID_in_rule_Operation182: new org.antlr.runtime.BitSet([0x00010000, 0x00000000]),
    FOLLOW_16_in_rule_Operation184: new org.antlr.runtime.BitSet([0x00040010, 0x00000000]),
    FOLLOW_ID_in_rule_Operation189: new org.antlr.runtime.BitSet([0x00060000, 0x00000000]),
    FOLLOW_17_in_rule_Operation192: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Operation196: new org.antlr.runtime.BitSet([0x00060000, 0x00000000]),
    FOLLOW_18_in_rule_Operation202: new org.antlr.runtime.BitSet([0x00004002, 0x00000000]),
    FOLLOW_14_in_rule_Operation205: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Operation209: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_10_in_rule_BlockExpression222: new org.antlr.runtime.BitSet([0x00080000, 0x00000000]),
    FOLLOW_19_in_rule_BlockExpression224: new org.antlr.runtime.BitSet([0x00000800, 0x00000000]),
    FOLLOW_11_in_rule_BlockExpression226: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_ImportDeclaration_in_rule_ImportSection238: new org.antlr.runtime.BitSet([0x00100002, 0x00000000]),
    FOLLOW_20_in_rule_ImportDeclaration248: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_QualifiedNameWithWildcard_in_rule_ImportDeclaration252: new org.antlr.runtime.BitSet([0x00200002, 0x00000000]),
    FOLLOW_21_in_rule_ImportDeclaration254: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_ValidID_in_rule_QualifiedName265: new org.antlr.runtime.BitSet([0x00400002, 0x00000000]),
    FOLLOW_22_in_rule_QualifiedName268: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_ValidID_in_rule_QualifiedName270: new org.antlr.runtime.BitSet([0x00400002, 0x00000000]),
    FOLLOW_rule_QualifiedName_in_rule_QualifiedNameWithWildcard282: new org.antlr.runtime.BitSet([0x00400000, 0x00000000]),
    FOLLOW_22_in_rule_QualifiedNameWithWildcard285: new org.antlr.runtime.BitSet([0x00800000, 0x00000000]),
    FOLLOW_23_in_rule_QualifiedNameWithWildcard287: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_ValidID296: new org.antlr.runtime.BitSet([0x00000002, 0x00000000])
});

})();