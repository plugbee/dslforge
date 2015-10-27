// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g 2015-10-27 15:24:10




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
    ID: 4,
    NUMBER: 5,
    INT: 6,
    STRING: 7,
    COMMENT: 8,
    WS: 9
});

(function(){
// public class variables
var EOF= -1,
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
    ID= 4,
    NUMBER= 5,
    INT= 6,
    STRING= 7,
    COMMENT= 8,
    WS= 9;

// public instance methods/vars
org.antlr.lang.extend(InternalDomainmodelParser, org.antlr.runtime.Parser, {
        
    setTreeAdaptor: function(adaptor) {
        this.adaptor = adaptor;
    },
    getTreeAdaptor: function() {
        return this.adaptor;
    },

    getTokenNames: function() { return InternalDomainmodelParser.tokenNames; },
    getGrammarFileName: function() { return "D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g"; }
});
org.antlr.lang.augmentObject(InternalDomainmodelParser.prototype, {

    // inline static return class
    rule_domainModel_return: (function() {
        InternalDomainmodelParser.rule_domainModel_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_domainModel_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:17:1: rule_domainModel : (importsection= rule_importSection )? (elements+= rule_abstractElement )* EOF ;
    // $ANTLR start "rule_domainModel"
    rule_domainModel: function() {
        var retval = new InternalDomainmodelParser.rule_domainModel_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var EOF1 = null;
        var list_elements=null;
         var importsection = null;
        var elements = null;
        var EOF1_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:18:3: ( (importsection= rule_importSection )? (elements+= rule_abstractElement )* EOF )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:19:3: (importsection= rule_importSection )? (elements+= rule_abstractElement )* EOF
            root_0 = this.adaptor.nil();

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:19:16: (importsection= rule_importSection )?
            var alt1=2;
            var LA1_0 = this.input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:19:16: importsection= rule_importSection
                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_importSection_in_rule_domainModel76);
                    importsection=this.rule_importSection();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, importsection.getTree());


                    break;

            }

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:19:45: (elements+= rule_abstractElement )*
            loop2:
            do {
                var alt2=2;
                var LA2_0 = this.input.LA(1);

                if ( (LA2_0==10||LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:19:45: elements+= rule_abstractElement
                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_abstractElement_in_rule_domainModel81);
                    elements=this.rule_abstractElement();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, elements.getTree());
                    if (org.antlr.lang.isNull(list_elements)) list_elements = [];
                    list_elements.push(elements.getTree());



                    break;

                default :
                    break loop2;
                }
            } while (true);

            EOF1=this.match(this.input,EOF,InternalDomainmodelParser.FOLLOW_EOF_in_rule_domainModel84); 



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
    rule_abstractElement_return: (function() {
        InternalDomainmodelParser.rule_abstractElement_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_abstractElement_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:22:1: rule_abstractElement : ( rule_packageDeclaration | rule_entity );
    // $ANTLR start "rule_abstractElement"
    rule_abstractElement: function() {
        var retval = new InternalDomainmodelParser.rule_abstractElement_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_packageDeclaration2 = null;
         var rule_entity3 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:23:3: ( rule_packageDeclaration | rule_entity )
            var alt3=2;
            var LA3_0 = this.input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 3, 0, this.input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:24:3: rule_packageDeclaration
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_packageDeclaration_in_rule_abstractElement100);
                    rule_packageDeclaration2=this.rule_packageDeclaration();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_packageDeclaration2.getTree());


                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:25:5: rule_entity
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_entity_in_rule_abstractElement106);
                    rule_entity3=this.rule_entity();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_entity3.getTree());


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
    rule_packageDeclaration_return: (function() {
        InternalDomainmodelParser.rule_packageDeclaration_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_packageDeclaration_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:28:1: rule_packageDeclaration : 'package' name= rule_qualifiedName '{' (elements+= rule_abstractElement )* '}' ;
    // $ANTLR start "rule_packageDeclaration"
    rule_packageDeclaration: function() {
        var retval = new InternalDomainmodelParser.rule_packageDeclaration_return();
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
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:29:3: ( 'package' name= rule_qualifiedName '{' (elements+= rule_abstractElement )* '}' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:30:3: 'package' name= rule_qualifiedName '{' (elements+= rule_abstractElement )* '}'
            root_0 = this.adaptor.nil();

            string_literal4=this.match(this.input,10,InternalDomainmodelParser.FOLLOW_10_in_rule_packageDeclaration121); 
            string_literal4_tree = this.adaptor.create(string_literal4);
            this.adaptor.addChild(root_0, string_literal4_tree);

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_qualifiedName_in_rule_packageDeclaration125);
            name=this.rule_qualifiedName();

            this.state._fsp--;

            this.adaptor.addChild(root_0, name.getTree());
            char_literal5=this.match(this.input,11,InternalDomainmodelParser.FOLLOW_11_in_rule_packageDeclaration127); 
            char_literal5_tree = this.adaptor.create(char_literal5);
            this.adaptor.addChild(root_0, char_literal5_tree);

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:30:49: (elements+= rule_abstractElement )*
            loop4:
            do {
                var alt4=2;
                var LA4_0 = this.input.LA(1);

                if ( (LA4_0==10||LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:30:49: elements+= rule_abstractElement
                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_abstractElement_in_rule_packageDeclaration131);
                    elements=this.rule_abstractElement();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, elements.getTree());
                    if (org.antlr.lang.isNull(list_elements)) list_elements = [];
                    list_elements.push(elements.getTree());



                    break;

                default :
                    break loop4;
                }
            } while (true);

            char_literal6=this.match(this.input,12,InternalDomainmodelParser.FOLLOW_12_in_rule_packageDeclaration134); 
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
    rule_entity_return: (function() {
        InternalDomainmodelParser.rule_entity_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_entity_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:33:1: rule_entity : 'entity' name= rule_validID ( 'extends' supertype= rule_qualifiedName )? '{' (features+= rule_feature )* '}' ;
    // $ANTLR start "rule_entity"
    rule_entity: function() {
        var retval = new InternalDomainmodelParser.rule_entity_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var string_literal7 = null;
        var string_literal8 = null;
        var char_literal9 = null;
        var char_literal10 = null;
        var list_features=null;
         var name = null;
         var supertype = null;
        var features = null;
        var string_literal7_tree=null;
        var string_literal8_tree=null;
        var char_literal9_tree=null;
        var char_literal10_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:34:3: ( 'entity' name= rule_validID ( 'extends' supertype= rule_qualifiedName )? '{' (features+= rule_feature )* '}' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:35:3: 'entity' name= rule_validID ( 'extends' supertype= rule_qualifiedName )? '{' (features+= rule_feature )* '}'
            root_0 = this.adaptor.nil();

            string_literal7=this.match(this.input,13,InternalDomainmodelParser.FOLLOW_13_in_rule_entity149); 
            string_literal7_tree = this.adaptor.create(string_literal7);
            this.adaptor.addChild(root_0, string_literal7_tree);

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_validID_in_rule_entity153);
            name=this.rule_validID();

            this.state._fsp--;

            this.adaptor.addChild(root_0, name.getTree());
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:35:30: ( 'extends' supertype= rule_qualifiedName )?
            var alt5=2;
            var LA5_0 = this.input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:35:31: 'extends' supertype= rule_qualifiedName
                    string_literal8=this.match(this.input,14,InternalDomainmodelParser.FOLLOW_14_in_rule_entity156); 
                    string_literal8_tree = this.adaptor.create(string_literal8);
                    this.adaptor.addChild(root_0, string_literal8_tree);

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_qualifiedName_in_rule_entity160);
                    supertype=this.rule_qualifiedName();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, supertype.getTree());


                    break;

            }

            char_literal9=this.match(this.input,11,InternalDomainmodelParser.FOLLOW_11_in_rule_entity164); 
            char_literal9_tree = this.adaptor.create(char_literal9);
            this.adaptor.addChild(root_0, char_literal9_tree);

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:35:84: (features+= rule_feature )*
            loop6:
            do {
                var alt6=2;
                var LA6_0 = this.input.LA(1);

                if ( (LA6_0==ID||LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:35:84: features+= rule_feature
                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_feature_in_rule_entity168);
                    features=this.rule_feature();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, features.getTree());
                    if (org.antlr.lang.isNull(list_features)) list_features = [];
                    list_features.push(features.getTree());



                    break;

                default :
                    break loop6;
                }
            } while (true);

            char_literal10=this.match(this.input,12,InternalDomainmodelParser.FOLLOW_12_in_rule_entity171); 
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
    rule_feature_return: (function() {
        InternalDomainmodelParser.rule_feature_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_feature_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:38:1: rule_feature : ( rule_property | rule_operation );
    // $ANTLR start "rule_feature"
    rule_feature: function() {
        var retval = new InternalDomainmodelParser.rule_feature_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_property11 = null;
         var rule_operation12 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:39:3: ( rule_property | rule_operation )
            var alt7=2;
            var LA7_0 = this.input.LA(1);

            if ( (LA7_0==ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 7, 0, this.input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:40:3: rule_property
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_property_in_rule_feature186);
                    rule_property11=this.rule_property();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_property11.getTree());


                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:41:5: rule_operation
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_operation_in_rule_feature192);
                    rule_operation12=this.rule_operation();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_operation12.getTree());


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
    rule_property_return: (function() {
        InternalDomainmodelParser.rule_property_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_property_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:44:1: rule_property : name= rule_validID ':' type= rule_qualifiedName ;
    // $ANTLR start "rule_property"
    rule_property: function() {
        var retval = new InternalDomainmodelParser.rule_property_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal13 = null;
         var name = null;
         var type = null;

        var char_literal13_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:45:3: (name= rule_validID ':' type= rule_qualifiedName )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:46:3: name= rule_validID ':' type= rule_qualifiedName
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_validID_in_rule_property209);
            name=this.rule_validID();

            this.state._fsp--;

            this.adaptor.addChild(root_0, name.getTree());
            char_literal13=this.match(this.input,15,InternalDomainmodelParser.FOLLOW_15_in_rule_property211); 
            char_literal13_tree = this.adaptor.create(char_literal13);
            this.adaptor.addChild(root_0, char_literal13_tree);

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_qualifiedName_in_rule_property215);
            type=this.rule_qualifiedName();

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
    rule_operation_return: (function() {
        InternalDomainmodelParser.rule_operation_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_operation_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:49:1: rule_operation : 'op' name= rule_validID '(' (params+= ID ( ',' params+= ID )* )? ')' ( ':' type= rule_qualifiedName )? ;
    // $ANTLR start "rule_operation"
    rule_operation: function() {
        var retval = new InternalDomainmodelParser.rule_operation_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var string_literal14 = null;
        var char_literal15 = null;
        var char_literal16 = null;
        var char_literal17 = null;
        var char_literal18 = null;
        var params = null;
        var list_params=null;
         var name = null;
         var type = null;

        var string_literal14_tree=null;
        var char_literal15_tree=null;
        var char_literal16_tree=null;
        var char_literal17_tree=null;
        var char_literal18_tree=null;
        var params_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:50:3: ( 'op' name= rule_validID '(' (params+= ID ( ',' params+= ID )* )? ')' ( ':' type= rule_qualifiedName )? )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:51:3: 'op' name= rule_validID '(' (params+= ID ( ',' params+= ID )* )? ')' ( ':' type= rule_qualifiedName )?
            root_0 = this.adaptor.nil();

            string_literal14=this.match(this.input,16,InternalDomainmodelParser.FOLLOW_16_in_rule_operation230); 
            string_literal14_tree = this.adaptor.create(string_literal14);
            this.adaptor.addChild(root_0, string_literal14_tree);

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_validID_in_rule_operation234);
            name=this.rule_validID();

            this.state._fsp--;

            this.adaptor.addChild(root_0, name.getTree());
            char_literal15=this.match(this.input,17,InternalDomainmodelParser.FOLLOW_17_in_rule_operation236); 
            char_literal15_tree = this.adaptor.create(char_literal15);
            this.adaptor.addChild(root_0, char_literal15_tree);

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:51:30: (params+= ID ( ',' params+= ID )* )?
            var alt9=2;
            var LA9_0 = this.input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:51:31: params+= ID ( ',' params+= ID )*
                    params=this.match(this.input,ID,InternalDomainmodelParser.FOLLOW_ID_in_rule_operation241); 
                    params_tree = this.adaptor.create(params);
                    this.adaptor.addChild(root_0, params_tree);

                    if (org.antlr.lang.isNull(list_params)) list_params = [];
                    list_params.push(params);

                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:51:42: ( ',' params+= ID )*
                    loop8:
                    do {
                        var alt8=2;
                        var LA8_0 = this.input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:51:43: ',' params+= ID
                            char_literal16=this.match(this.input,18,InternalDomainmodelParser.FOLLOW_18_in_rule_operation244); 
                            char_literal16_tree = this.adaptor.create(char_literal16);
                            this.adaptor.addChild(root_0, char_literal16_tree);

                            params=this.match(this.input,ID,InternalDomainmodelParser.FOLLOW_ID_in_rule_operation248); 
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

            char_literal17=this.match(this.input,19,InternalDomainmodelParser.FOLLOW_19_in_rule_operation254); 
            char_literal17_tree = this.adaptor.create(char_literal17);
            this.adaptor.addChild(root_0, char_literal17_tree);

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:51:66: ( ':' type= rule_qualifiedName )?
            var alt10=2;
            var LA10_0 = this.input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:51:67: ':' type= rule_qualifiedName
                    char_literal18=this.match(this.input,15,InternalDomainmodelParser.FOLLOW_15_in_rule_operation257); 
                    char_literal18_tree = this.adaptor.create(char_literal18);
                    this.adaptor.addChild(root_0, char_literal18_tree);

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_qualifiedName_in_rule_operation261);
                    type=this.rule_qualifiedName();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, type.getTree());


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
    rule_blockExpression_return: (function() {
        InternalDomainmodelParser.rule_blockExpression_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_blockExpression_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:54:1: rule_blockExpression : '{' (expresison+= rule_expression ';' )* '}' ;
    // $ANTLR start "rule_blockExpression"
    rule_blockExpression: function() {
        var retval = new InternalDomainmodelParser.rule_blockExpression_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal19 = null;
        var char_literal20 = null;
        var char_literal21 = null;
        var list_expresison=null;
        var expresison = null;
        var char_literal19_tree=null;
        var char_literal20_tree=null;
        var char_literal21_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:55:3: ( '{' (expresison+= rule_expression ';' )* '}' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:56:3: '{' (expresison+= rule_expression ';' )* '}'
            root_0 = this.adaptor.nil();

            char_literal19=this.match(this.input,11,InternalDomainmodelParser.FOLLOW_11_in_rule_blockExpression280); 
            char_literal19_tree = this.adaptor.create(char_literal19);
            this.adaptor.addChild(root_0, char_literal19_tree);

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:56:7: (expresison+= rule_expression ';' )*
            loop11:
            do {
                var alt11=2;
                var LA11_0 = this.input.LA(1);

                if ( ((LA11_0>=ID && LA11_0<=NUMBER)||LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:56:8: expresison+= rule_expression ';'
                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_expression_in_rule_blockExpression285);
                    expresison=this.rule_expression();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, expresison.getTree());
                    if (org.antlr.lang.isNull(list_expresison)) list_expresison = [];
                    list_expresison.push(expresison.getTree());

                    char_literal20=this.match(this.input,20,InternalDomainmodelParser.FOLLOW_20_in_rule_blockExpression286); 
                    char_literal20_tree = this.adaptor.create(char_literal20);
                    this.adaptor.addChild(root_0, char_literal20_tree);



                    break;

                default :
                    break loop11;
                }
            } while (true);

            char_literal21=this.match(this.input,12,InternalDomainmodelParser.FOLLOW_12_in_rule_blockExpression290); 
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
    rule_expression_return: (function() {
        InternalDomainmodelParser.rule_expression_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_expression_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:59:1: rule_expression : rule_addition ;
    // $ANTLR start "rule_expression"
    rule_expression: function() {
        var retval = new InternalDomainmodelParser.rule_expression_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var rule_addition22 = null;


        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:60:3: ( rule_addition )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:61:3: rule_addition
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_addition_in_rule_expression305);
            rule_addition22=this.rule_addition();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_addition22.getTree());



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
    rule_addition_return: (function() {
        InternalDomainmodelParser.rule_addition_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_addition_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:64:1: rule_addition : rule_multiplication ( ( '+' | '-' ) right= rule_multiplication )* ;
    // $ANTLR start "rule_addition"
    rule_addition: function() {
        var retval = new InternalDomainmodelParser.rule_addition_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var set24 = null;
         var right = null;
         var rule_multiplication23 = null;

        var set24_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:65:3: ( rule_multiplication ( ( '+' | '-' ) right= rule_multiplication )* )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:66:3: rule_multiplication ( ( '+' | '-' ) right= rule_multiplication )*
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_multiplication_in_rule_addition320);
            rule_multiplication23=this.rule_multiplication();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_multiplication23.getTree());
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:67:3: ( ( '+' | '-' ) right= rule_multiplication )*
            loop12:
            do {
                var alt12=2;
                var LA12_0 = this.input.LA(1);

                if ( ((LA12_0>=21 && LA12_0<=22)) ) {
                    alt12=1;
                }


                switch (alt12) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:68:5: ( '+' | '-' ) right= rule_multiplication
                    set24=this.input.LT(1);
                    if ( (this.input.LA(1)>=21 && this.input.LA(1)<=22) ) {
                        this.input.consume();
                        this.adaptor.addChild(root_0, this.adaptor.create(set24));
                        this.state.errorRecovery=false;
                    }
                    else {
                        var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                        throw mse;
                    }

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_multiplication_in_rule_addition370);
                    right=this.rule_multiplication();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, right.getTree());


                    break;

                default :
                    break loop12;
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
    rule_multiplication_return: (function() {
        InternalDomainmodelParser.rule_multiplication_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_multiplication_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:78:1: rule_multiplication : rule_primaryExpression ( ( '*' | '/' ) right= rule_primaryExpression )* ;
    // $ANTLR start "rule_multiplication"
    rule_multiplication: function() {
        var retval = new InternalDomainmodelParser.rule_multiplication_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var set26 = null;
         var right = null;
         var rule_primaryExpression25 = null;

        var set26_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:79:3: ( rule_primaryExpression ( ( '*' | '/' ) right= rule_primaryExpression )* )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:80:3: rule_primaryExpression ( ( '*' | '/' ) right= rule_primaryExpression )*
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_primaryExpression_in_rule_multiplication390);
            rule_primaryExpression25=this.rule_primaryExpression();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_primaryExpression25.getTree());
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:81:3: ( ( '*' | '/' ) right= rule_primaryExpression )*
            loop13:
            do {
                var alt13=2;
                var LA13_0 = this.input.LA(1);

                if ( ((LA13_0>=23 && LA13_0<=24)) ) {
                    alt13=1;
                }


                switch (alt13) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:82:5: ( '*' | '/' ) right= rule_primaryExpression
                    set26=this.input.LT(1);
                    if ( (this.input.LA(1)>=23 && this.input.LA(1)<=24) ) {
                        this.input.consume();
                        this.adaptor.addChild(root_0, this.adaptor.create(set26));
                        this.state.errorRecovery=false;
                    }
                    else {
                        var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                        throw mse;
                    }

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_primaryExpression_in_rule_multiplication439);
                    right=this.rule_primaryExpression();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, right.getTree());


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
    rule_primaryExpression_return: (function() {
        InternalDomainmodelParser.rule_primaryExpression_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_primaryExpression_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:91:1: rule_primaryExpression : ( '(' rule_expression ')' | value= NUMBER | func= ID ( '(' args+= rule_expression ( ',' args+= rule_expression )* ')' )? );
    // $ANTLR start "rule_primaryExpression"
    rule_primaryExpression: function() {
        var retval = new InternalDomainmodelParser.rule_primaryExpression_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var value = null;
        var func = null;
        var char_literal27 = null;
        var char_literal29 = null;
        var char_literal30 = null;
        var char_literal31 = null;
        var char_literal32 = null;
        var list_args=null;
         var rule_expression28 = null;
        var args = null;
        var value_tree=null;
        var func_tree=null;
        var char_literal27_tree=null;
        var char_literal29_tree=null;
        var char_literal30_tree=null;
        var char_literal31_tree=null;
        var char_literal32_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:92:3: ( '(' rule_expression ')' | value= NUMBER | func= ID ( '(' args+= rule_expression ( ',' args+= rule_expression )* ')' )? )
            var alt16=3;
            switch ( this.input.LA(1) ) {
            case 17:
                alt16=1;
                break;
            case NUMBER:
                alt16=2;
                break;
            case ID:
                alt16=3;
                break;
            default:
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 16, 0, this.input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:93:3: '(' rule_expression ')'
                    root_0 = this.adaptor.nil();

                    char_literal27=this.match(this.input,17,InternalDomainmodelParser.FOLLOW_17_in_rule_primaryExpression459); 
                    char_literal27_tree = this.adaptor.create(char_literal27);
                    this.adaptor.addChild(root_0, char_literal27_tree);

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_expression_in_rule_primaryExpression461);
                    rule_expression28=this.rule_expression();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_expression28.getTree());
                    char_literal29=this.match(this.input,19,InternalDomainmodelParser.FOLLOW_19_in_rule_primaryExpression463); 
                    char_literal29_tree = this.adaptor.create(char_literal29);
                    this.adaptor.addChild(root_0, char_literal29_tree);



                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:95:3: value= NUMBER
                    root_0 = this.adaptor.nil();

                    value=this.match(this.input,NUMBER,InternalDomainmodelParser.FOLLOW_NUMBER_in_rule_primaryExpression474); 
                    value_tree = this.adaptor.create(value);
                    this.adaptor.addChild(root_0, value_tree);



                    break;
                case 3 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:97:3: func= ID ( '(' args+= rule_expression ( ',' args+= rule_expression )* ')' )?
                    root_0 = this.adaptor.nil();

                    func=this.match(this.input,ID,InternalDomainmodelParser.FOLLOW_ID_in_rule_primaryExpression485); 
                    func_tree = this.adaptor.create(func);
                    this.adaptor.addChild(root_0, func_tree);

                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:97:11: ( '(' args+= rule_expression ( ',' args+= rule_expression )* ')' )?
                    var alt15=2;
                    var LA15_0 = this.input.LA(1);

                    if ( (LA15_0==17) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:97:12: '(' args+= rule_expression ( ',' args+= rule_expression )* ')'
                            char_literal30=this.match(this.input,17,InternalDomainmodelParser.FOLLOW_17_in_rule_primaryExpression488); 
                            char_literal30_tree = this.adaptor.create(char_literal30);
                            this.adaptor.addChild(root_0, char_literal30_tree);

                            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_expression_in_rule_primaryExpression492);
                            args=this.rule_expression();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, args.getTree());
                            if (org.antlr.lang.isNull(list_args)) list_args = [];
                            list_args.push(args.getTree());

                            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:97:38: ( ',' args+= rule_expression )*
                            loop14:
                            do {
                                var alt14=2;
                                var LA14_0 = this.input.LA(1);

                                if ( (LA14_0==18) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                                case 1 :
                                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:97:39: ',' args+= rule_expression
                                    char_literal31=this.match(this.input,18,InternalDomainmodelParser.FOLLOW_18_in_rule_primaryExpression495); 
                                    char_literal31_tree = this.adaptor.create(char_literal31);
                                    this.adaptor.addChild(root_0, char_literal31_tree);

                                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_expression_in_rule_primaryExpression499);
                                    args=this.rule_expression();

                                    this.state._fsp--;

                                    this.adaptor.addChild(root_0, args.getTree());
                                    if (org.antlr.lang.isNull(list_args)) list_args = [];
                                    list_args.push(args.getTree());



                                    break;

                                default :
                                    break loop14;
                                }
                            } while (true);

                            char_literal32=this.match(this.input,19,InternalDomainmodelParser.FOLLOW_19_in_rule_primaryExpression503); 
                            char_literal32_tree = this.adaptor.create(char_literal32);
                            this.adaptor.addChild(root_0, char_literal32_tree);



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
    },

    // inline static return class
    rule_importSection_return: (function() {
        InternalDomainmodelParser.rule_importSection_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_importSection_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:102:1: rule_importSection : (importdeclarations+= rule_importDeclaration )+ ;
    // $ANTLR start "rule_importSection"
    rule_importSection: function() {
        var retval = new InternalDomainmodelParser.rule_importSection_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var list_importdeclarations=null;
        var importdeclarations = null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:103:3: ( (importdeclarations+= rule_importDeclaration )+ )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:104:3: (importdeclarations+= rule_importDeclaration )+
            root_0 = this.adaptor.nil();

            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:104:21: (importdeclarations+= rule_importDeclaration )+
            var cnt17=0;
            loop17:
            do {
                var alt17=2;
                var LA17_0 = this.input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:104:21: importdeclarations+= rule_importDeclaration
                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_importDeclaration_in_rule_importSection524);
                    importdeclarations=this.rule_importDeclaration();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, importdeclarations.getTree());
                    if (org.antlr.lang.isNull(list_importdeclarations)) list_importdeclarations = [];
                    list_importdeclarations.push(importdeclarations.getTree());



                    break;

                default :
                    if ( cnt17 >= 1 ) {
                        break loop17;
                    }
                        var eee = new org.antlr.runtime.EarlyExitException(17, this.input);
                        throw eee;
                }
                cnt17++;
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
    rule_importDeclaration_return: (function() {
        InternalDomainmodelParser.rule_importDeclaration_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_importDeclaration_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:107:1: rule_importDeclaration : 'import' importednamespace= rule_qualifiedNameWithWildcard ( ';' )? ;
    // $ANTLR start "rule_importDeclaration"
    rule_importDeclaration: function() {
        var retval = new InternalDomainmodelParser.rule_importDeclaration_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var string_literal33 = null;
        var char_literal34 = null;
         var importednamespace = null;

        var string_literal33_tree=null;
        var char_literal34_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:108:3: ( 'import' importednamespace= rule_qualifiedNameWithWildcard ( ';' )? )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:109:3: 'import' importednamespace= rule_qualifiedNameWithWildcard ( ';' )?
            root_0 = this.adaptor.nil();

            string_literal33=this.match(this.input,25,InternalDomainmodelParser.FOLLOW_25_in_rule_importDeclaration540); 
            string_literal33_tree = this.adaptor.create(string_literal33);
            this.adaptor.addChild(root_0, string_literal33_tree);

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_qualifiedNameWithWildcard_in_rule_importDeclaration544);
            importednamespace=this.rule_qualifiedNameWithWildcard();

            this.state._fsp--;

            this.adaptor.addChild(root_0, importednamespace.getTree());
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:109:61: ( ';' )?
            var alt18=2;
            var LA18_0 = this.input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:109:61: ';'
                    char_literal34=this.match(this.input,20,InternalDomainmodelParser.FOLLOW_20_in_rule_importDeclaration546); 
                    char_literal34_tree = this.adaptor.create(char_literal34);
                    this.adaptor.addChild(root_0, char_literal34_tree);



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
    rule_qualifiedName_return: (function() {
        InternalDomainmodelParser.rule_qualifiedName_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_qualifiedName_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:112:1: rule_qualifiedName : rule_validID ( '.' rule_validID )* ;
    // $ANTLR start "rule_qualifiedName"
    rule_qualifiedName: function() {
        var retval = new InternalDomainmodelParser.rule_qualifiedName_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal36 = null;
         var rule_validID35 = null;
         var rule_validID37 = null;

        var char_literal36_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:113:3: ( rule_validID ( '.' rule_validID )* )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:114:3: rule_validID ( '.' rule_validID )*
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_validID_in_rule_qualifiedName562);
            rule_validID35=this.rule_validID();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_validID35.getTree());
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:114:16: ( '.' rule_validID )*
            loop19:
            do {
                var alt19=2;
                var LA19_0 = this.input.LA(1);

                if ( (LA19_0==26) ) {
                    var LA19_2 = this.input.LA(2);

                    if ( (LA19_2==ID) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:114:17: '.' rule_validID
                    char_literal36=this.match(this.input,26,InternalDomainmodelParser.FOLLOW_26_in_rule_qualifiedName565); 
                    char_literal36_tree = this.adaptor.create(char_literal36);
                    this.adaptor.addChild(root_0, char_literal36_tree);

                    this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_validID_in_rule_qualifiedName567);
                    rule_validID37=this.rule_validID();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, rule_validID37.getTree());


                    break;

                default :
                    break loop19;
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
    rule_qualifiedNameWithWildcard_return: (function() {
        InternalDomainmodelParser.rule_qualifiedNameWithWildcard_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_qualifiedNameWithWildcard_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:117:1: rule_qualifiedNameWithWildcard : rule_qualifiedName '.' '*' ;
    // $ANTLR start "rule_qualifiedNameWithWildcard"
    rule_qualifiedNameWithWildcard: function() {
        var retval = new InternalDomainmodelParser.rule_qualifiedNameWithWildcard_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal39 = null;
        var char_literal40 = null;
         var rule_qualifiedName38 = null;

        var char_literal39_tree=null;
        var char_literal40_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:118:3: ( rule_qualifiedName '.' '*' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:119:3: rule_qualifiedName '.' '*'
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalDomainmodelParser.FOLLOW_rule_qualifiedName_in_rule_qualifiedNameWithWildcard584);
            rule_qualifiedName38=this.rule_qualifiedName();

            this.state._fsp--;

            this.adaptor.addChild(root_0, rule_qualifiedName38.getTree());
            char_literal39=this.match(this.input,26,InternalDomainmodelParser.FOLLOW_26_in_rule_qualifiedNameWithWildcard586); 
            char_literal39_tree = this.adaptor.create(char_literal39);
            this.adaptor.addChild(root_0, char_literal39_tree);

            char_literal40=this.match(this.input,23,InternalDomainmodelParser.FOLLOW_23_in_rule_qualifiedNameWithWildcard588); 
            char_literal40_tree = this.adaptor.create(char_literal40);
            this.adaptor.addChild(root_0, char_literal40_tree);




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
    rule_validID_return: (function() {
        InternalDomainmodelParser.rule_validID_return = function(){};
        org.antlr.lang.extend(InternalDomainmodelParser.rule_validID_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:122:1: rule_validID : ID ;
    // $ANTLR start "rule_validID"
    rule_validID: function() {
        var retval = new InternalDomainmodelParser.rule_validID_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var ID41 = null;

        var ID41_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:123:3: ( ID )
            // D:\\git\\dslforge\\examples\\org.xtext.example.domainmodel.web\\target\\classes\\org\\xtext\\example\\domainmodel\\web\\parser\\InternalDomainmodel.g:124:3: ID
            root_0 = this.adaptor.nil();

            ID41=this.match(this.input,ID,InternalDomainmodelParser.FOLLOW_ID_in_rule_validID603); 
            ID41_tree = this.adaptor.create(ID41);
            this.adaptor.addChild(root_0, ID41_tree);




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
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUMBER", "INT", "STRING", "COMMENT", "WS", "'package'", "'{'", "'}'", "'entity'", "'extends'", "':'", "'op'", "'('", "','", "')'", "';'", "'+'", "'-'", "'*'", "'/'", "'import'", "'.'"],
    FOLLOW_rule_importSection_in_rule_domainModel76: new org.antlr.runtime.BitSet([0x00002400, 0x00000000]),
    FOLLOW_rule_abstractElement_in_rule_domainModel81: new org.antlr.runtime.BitSet([0x00002400, 0x00000000]),
    FOLLOW_EOF_in_rule_domainModel84: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_packageDeclaration_in_rule_abstractElement100: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_entity_in_rule_abstractElement106: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_10_in_rule_packageDeclaration121: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_qualifiedName_in_rule_packageDeclaration125: new org.antlr.runtime.BitSet([0x00000800, 0x00000000]),
    FOLLOW_11_in_rule_packageDeclaration127: new org.antlr.runtime.BitSet([0x00003400, 0x00000000]),
    FOLLOW_rule_abstractElement_in_rule_packageDeclaration131: new org.antlr.runtime.BitSet([0x00003400, 0x00000000]),
    FOLLOW_12_in_rule_packageDeclaration134: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_13_in_rule_entity149: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_validID_in_rule_entity153: new org.antlr.runtime.BitSet([0x00004800, 0x00000000]),
    FOLLOW_14_in_rule_entity156: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_qualifiedName_in_rule_entity160: new org.antlr.runtime.BitSet([0x00000800, 0x00000000]),
    FOLLOW_11_in_rule_entity164: new org.antlr.runtime.BitSet([0x00011010, 0x00000000]),
    FOLLOW_rule_feature_in_rule_entity168: new org.antlr.runtime.BitSet([0x00011010, 0x00000000]),
    FOLLOW_12_in_rule_entity171: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_property_in_rule_feature186: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_operation_in_rule_feature192: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_validID_in_rule_property209: new org.antlr.runtime.BitSet([0x00008000, 0x00000000]),
    FOLLOW_15_in_rule_property211: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_qualifiedName_in_rule_property215: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_16_in_rule_operation230: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_validID_in_rule_operation234: new org.antlr.runtime.BitSet([0x00020000, 0x00000000]),
    FOLLOW_17_in_rule_operation236: new org.antlr.runtime.BitSet([0x00080010, 0x00000000]),
    FOLLOW_ID_in_rule_operation241: new org.antlr.runtime.BitSet([0x000C0000, 0x00000000]),
    FOLLOW_18_in_rule_operation244: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_operation248: new org.antlr.runtime.BitSet([0x000C0000, 0x00000000]),
    FOLLOW_19_in_rule_operation254: new org.antlr.runtime.BitSet([0x00008002, 0x00000000]),
    FOLLOW_15_in_rule_operation257: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_qualifiedName_in_rule_operation261: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_11_in_rule_blockExpression280: new org.antlr.runtime.BitSet([0x00021030, 0x00000000]),
    FOLLOW_rule_expression_in_rule_blockExpression285: new org.antlr.runtime.BitSet([0x00100000, 0x00000000]),
    FOLLOW_20_in_rule_blockExpression286: new org.antlr.runtime.BitSet([0x00021030, 0x00000000]),
    FOLLOW_12_in_rule_blockExpression290: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_addition_in_rule_expression305: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_multiplication_in_rule_addition320: new org.antlr.runtime.BitSet([0x00600002, 0x00000000]),
    FOLLOW_set_in_rule_addition330: new org.antlr.runtime.BitSet([0x00020030, 0x00000000]),
    FOLLOW_rule_multiplication_in_rule_addition370: new org.antlr.runtime.BitSet([0x00600002, 0x00000000]),
    FOLLOW_rule_primaryExpression_in_rule_multiplication390: new org.antlr.runtime.BitSet([0x01800002, 0x00000000]),
    FOLLOW_set_in_rule_multiplication400: new org.antlr.runtime.BitSet([0x00020030, 0x00000000]),
    FOLLOW_rule_primaryExpression_in_rule_multiplication439: new org.antlr.runtime.BitSet([0x01800002, 0x00000000]),
    FOLLOW_17_in_rule_primaryExpression459: new org.antlr.runtime.BitSet([0x00020030, 0x00000000]),
    FOLLOW_rule_expression_in_rule_primaryExpression461: new org.antlr.runtime.BitSet([0x00080000, 0x00000000]),
    FOLLOW_19_in_rule_primaryExpression463: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_NUMBER_in_rule_primaryExpression474: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_primaryExpression485: new org.antlr.runtime.BitSet([0x00020002, 0x00000000]),
    FOLLOW_17_in_rule_primaryExpression488: new org.antlr.runtime.BitSet([0x00020030, 0x00000000]),
    FOLLOW_rule_expression_in_rule_primaryExpression492: new org.antlr.runtime.BitSet([0x000C0000, 0x00000000]),
    FOLLOW_18_in_rule_primaryExpression495: new org.antlr.runtime.BitSet([0x00020030, 0x00000000]),
    FOLLOW_rule_expression_in_rule_primaryExpression499: new org.antlr.runtime.BitSet([0x000C0000, 0x00000000]),
    FOLLOW_19_in_rule_primaryExpression503: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_importDeclaration_in_rule_importSection524: new org.antlr.runtime.BitSet([0x02000002, 0x00000000]),
    FOLLOW_25_in_rule_importDeclaration540: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_qualifiedNameWithWildcard_in_rule_importDeclaration544: new org.antlr.runtime.BitSet([0x00100002, 0x00000000]),
    FOLLOW_20_in_rule_importDeclaration546: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_rule_validID_in_rule_qualifiedName562: new org.antlr.runtime.BitSet([0x04000002, 0x00000000]),
    FOLLOW_26_in_rule_qualifiedName565: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_rule_validID_in_rule_qualifiedName567: new org.antlr.runtime.BitSet([0x04000002, 0x00000000]),
    FOLLOW_rule_qualifiedName_in_rule_qualifiedNameWithWildcard584: new org.antlr.runtime.BitSet([0x04000000, 0x00000000]),
    FOLLOW_26_in_rule_qualifiedNameWithWildcard586: new org.antlr.runtime.BitSet([0x00800000, 0x00000000]),
    FOLLOW_23_in_rule_qualifiedNameWithWildcard588: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_rule_validID603: new org.antlr.runtime.BitSet([0x00000002, 0x00000000])
});

})();