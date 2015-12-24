// $ANTLR 3.3 Nov 30, 2010 12:50:56 E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g 2014-03-06 23:11:50



var InternalDomainModelParser = function(input, state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    InternalDomainModelParser.superclass.constructor.call(this, input, state);


         

    /* @todo only create adaptor if output=AST */
    this.adaptor = new org.antlr.runtime.tree.CommonTreeAdaptor();

};

org.antlr.lang.augmentObject(InternalDomainModelParser, {
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
    RULE_INT: 5,
    RULE_STRING: 6,
    RULE_COMMENT: 7,
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
    ID= 4,
    RULE_INT= 5,
    RULE_STRING= 6,
    RULE_COMMENT= 7,
    WS= 8;

// public instance methods/vars
org.antlr.lang.extend(InternalDomainModelParser, org.antlr.runtime.Parser, {
        
    setTreeAdaptor: function(adaptor) {
        this.adaptor = adaptor;
    },
    getTreeAdaptor: function() {
        return this.adaptor;
    },

    getTokenNames: function() { return InternalDomainModelParser.tokenNames; },
    getGrammarFileName: function() { return "E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g"; }
});
org.antlr.lang.augmentObject(InternalDomainModelParser.prototype, {

    // inline static return class
    domainModel_return: (function() {
        InternalDomainModelParser.domainModel_return = function(){};
        org.antlr.lang.extend(InternalDomainModelParser.domainModel_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:15:1: domainModel : (imports= importSection )? (elements+= abstractElement )* EOF ;
    // $ANTLR start "domainModel"
    domainModel: function() {
        var retval = new InternalDomainModelParser.domainModel_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var EOF1 = null;
        var list_elements=null;
         var imports = null;
        var elements = null;
        var EOF1_tree=null;

        try {
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:15:12: ( (imports= importSection )? (elements+= abstractElement )* EOF )
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:16:3: (imports= importSection )? (elements+= abstractElement )* EOF
            root_0 = this.adaptor.nil();

            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:16:10: (imports= importSection )?
            var alt1=2;
            var LA1_0 = this.input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:16:10: imports= importSection
                    this.pushFollow(InternalDomainModelParser.FOLLOW_importSection_in_domainModel57);
                    imports=this.importSection();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, imports.getTree());


                    break;

            }

            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:17:3: (elements+= abstractElement )*
            loop2:
            do {
                var alt2=2;
                var LA2_0 = this.input.LA(1);

                if ( (LA2_0==9||LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
                case 1 :
                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:17:4: elements+= abstractElement
                    this.pushFollow(InternalDomainModelParser.FOLLOW_abstractElement_in_domainModel65);
                    elements=this.abstractElement();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, elements.getTree());
                    if (org.antlr.lang.isNull(list_elements)) list_elements = [];
                    list_elements.push(elements.getTree());



                    break;

                default :
                    break loop2;
                }
            } while (true);

            EOF1=this.match(this.input,EOF,InternalDomainModelParser.FOLLOW_EOF_in_domainModel72); 



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
    abstractElement_return: (function() {
        InternalDomainModelParser.abstractElement_return = function(){};
        org.antlr.lang.extend(InternalDomainModelParser.abstractElement_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:20:1: abstractElement : ( packageDeclaration | entity );
    // $ANTLR start "abstractElement"
    abstractElement: function() {
        var retval = new InternalDomainModelParser.abstractElement_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var packageDeclaration2 = null;
         var entity3 = null;


        try {
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:20:16: ( packageDeclaration | entity )
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
                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:21:3: packageDeclaration
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalDomainModelParser.FOLLOW_packageDeclaration_in_abstractElement86);
                    packageDeclaration2=this.packageDeclaration();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, packageDeclaration2.getTree());


                    break;
                case 2 :
                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:21:24: entity
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalDomainModelParser.FOLLOW_entity_in_abstractElement90);
                    entity3=this.entity();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, entity3.getTree());


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
    packageDeclaration_return: (function() {
        InternalDomainModelParser.packageDeclaration_return = function(){};
        org.antlr.lang.extend(InternalDomainModelParser.packageDeclaration_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:23:1: packageDeclaration : 'package' name= qualifiedName '{' (elements+= abstractElement )* '}' ;
    // $ANTLR start "packageDeclaration"
    packageDeclaration: function() {
        var retval = new InternalDomainModelParser.packageDeclaration_return();
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
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:23:19: ( 'package' name= qualifiedName '{' (elements+= abstractElement )* '}' )
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:24:3: 'package' name= qualifiedName '{' (elements+= abstractElement )* '}'
            root_0 = this.adaptor.nil();

            string_literal4=this.match(this.input,9,InternalDomainModelParser.FOLLOW_9_in_packageDeclaration99); 
            string_literal4_tree = this.adaptor.create(string_literal4);
            this.adaptor.addChild(root_0, string_literal4_tree);

            this.pushFollow(InternalDomainModelParser.FOLLOW_qualifiedName_in_packageDeclaration103);
            name=this.qualifiedName();

            this.state._fsp--;

            this.adaptor.addChild(root_0, name.getTree());
            char_literal5=this.match(this.input,10,InternalDomainModelParser.FOLLOW_10_in_packageDeclaration105); 
            char_literal5_tree = this.adaptor.create(char_literal5);
            this.adaptor.addChild(root_0, char_literal5_tree);

            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:25:13: (elements+= abstractElement )*
            loop4:
            do {
                var alt4=2;
                var LA4_0 = this.input.LA(1);

                if ( (LA4_0==9||LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
                case 1 :
                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:25:13: elements+= abstractElement
                    this.pushFollow(InternalDomainModelParser.FOLLOW_abstractElement_in_packageDeclaration113);
                    elements=this.abstractElement();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, elements.getTree());
                    if (org.antlr.lang.isNull(list_elements)) list_elements = [];
                    list_elements.push(elements.getTree());



                    break;

                default :
                    break loop4;
                }
            } while (true);

            char_literal6=this.match(this.input,11,InternalDomainModelParser.FOLLOW_11_in_packageDeclaration118); 
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
    entity_return: (function() {
        InternalDomainModelParser.entity_return = function(){};
        org.antlr.lang.extend(InternalDomainModelParser.entity_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:28:1: entity : 'entity' name= validID ( 'extends' superType= validID )? '{' (features+= feature )* '}' ;
    // $ANTLR start "entity"
    entity: function() {
        var retval = new InternalDomainModelParser.entity_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var string_literal7 = null;
        var string_literal8 = null;
        var char_literal9 = null;
        var char_literal10 = null;
        var list_features=null;
         var name = null;
         var superType = null;
        var features = null;
        var string_literal7_tree=null;
        var string_literal8_tree=null;
        var char_literal9_tree=null;
        var char_literal10_tree=null;

        try {
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:28:7: ( 'entity' name= validID ( 'extends' superType= validID )? '{' (features+= feature )* '}' )
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:29:3: 'entity' name= validID ( 'extends' superType= validID )? '{' (features+= feature )* '}'
            root_0 = this.adaptor.nil();

            string_literal7=this.match(this.input,12,InternalDomainModelParser.FOLLOW_12_in_entity127); 
            string_literal7_tree = this.adaptor.create(string_literal7);
            this.adaptor.addChild(root_0, string_literal7_tree);

            this.pushFollow(InternalDomainModelParser.FOLLOW_validID_in_entity131);
            name=this.validID();

            this.state._fsp--;

            this.adaptor.addChild(root_0, name.getTree());
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:29:25: ( 'extends' superType= validID )?
            var alt5=2;
            var LA5_0 = this.input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:29:26: 'extends' superType= validID
                    string_literal8=this.match(this.input,13,InternalDomainModelParser.FOLLOW_13_in_entity134); 
                    string_literal8_tree = this.adaptor.create(string_literal8);
                    this.adaptor.addChild(root_0, string_literal8_tree);

                    this.pushFollow(InternalDomainModelParser.FOLLOW_validID_in_entity138);
                    superType=this.validID();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, superType.getTree());


                    break;

            }

            char_literal9=this.match(this.input,10,InternalDomainModelParser.FOLLOW_10_in_entity142); 
            char_literal9_tree = this.adaptor.create(char_literal9);
            this.adaptor.addChild(root_0, char_literal9_tree);

            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:30:13: (features+= feature )*
            loop6:
            do {
                var alt6=2;
                var LA6_0 = this.input.LA(1);

                if ( (LA6_0==ID||LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
                case 1 :
                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:30:13: features+= feature
                    this.pushFollow(InternalDomainModelParser.FOLLOW_feature_in_entity150);
                    features=this.feature();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, features.getTree());
                    if (org.antlr.lang.isNull(list_features)) list_features = [];
                    list_features.push(features.getTree());



                    break;

                default :
                    break loop6;
                }
            } while (true);

            char_literal10=this.match(this.input,11,InternalDomainModelParser.FOLLOW_11_in_entity155); 
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
    feature_return: (function() {
        InternalDomainModelParser.feature_return = function(){};
        org.antlr.lang.extend(InternalDomainModelParser.feature_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:33:1: feature : ( property | operation );
    // $ANTLR start "feature"
    feature: function() {
        var retval = new InternalDomainModelParser.feature_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var property11 = null;
         var operation12 = null;


        try {
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:33:8: ( property | operation )
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
                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:34:3: property
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalDomainModelParser.FOLLOW_property_in_feature164);
                    property11=this.property();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, property11.getTree());


                    break;
                case 2 :
                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:34:14: operation
                    root_0 = this.adaptor.nil();

                    this.pushFollow(InternalDomainModelParser.FOLLOW_operation_in_feature168);
                    operation12=this.operation();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, operation12.getTree());


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
    property_return: (function() {
        InternalDomainModelParser.property_return = function(){};
        org.antlr.lang.extend(InternalDomainModelParser.property_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:36:1: property : name= validID ':' type= validID ;
    // $ANTLR start "property"
    property: function() {
        var retval = new InternalDomainModelParser.property_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal13 = null;
         var name = null;
         var type = null;

        var char_literal13_tree=null;

        try {
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:36:9: (name= validID ':' type= validID )
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:37:3: name= validID ':' type= validID
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalDomainModelParser.FOLLOW_validID_in_property179);
            name=this.validID();

            this.state._fsp--;

            this.adaptor.addChild(root_0, name.getTree());
            char_literal13=this.match(this.input,14,InternalDomainModelParser.FOLLOW_14_in_property181); 
            char_literal13_tree = this.adaptor.create(char_literal13);
            this.adaptor.addChild(root_0, char_literal13_tree);

            this.pushFollow(InternalDomainModelParser.FOLLOW_validID_in_property185);
            type=this.validID();

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
    operation_return: (function() {
        InternalDomainModelParser.operation_return = function(){};
        org.antlr.lang.extend(InternalDomainModelParser.operation_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:39:1: operation : 'op' name= validID '(' (params+= ID ( ',' params+= ID )* )? ')' ( ':' type= validID )? body= blockExpression ;
    // $ANTLR start "operation"
    operation: function() {
        var retval = new InternalDomainModelParser.operation_return();
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
         var body = null;

        var string_literal14_tree=null;
        var char_literal15_tree=null;
        var char_literal16_tree=null;
        var char_literal17_tree=null;
        var char_literal18_tree=null;
        var params_tree=null;

        try {
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:39:10: ( 'op' name= validID '(' (params+= ID ( ',' params+= ID )* )? ')' ( ':' type= validID )? body= blockExpression )
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:40:3: 'op' name= validID '(' (params+= ID ( ',' params+= ID )* )? ')' ( ':' type= validID )? body= blockExpression
            root_0 = this.adaptor.nil();

            string_literal14=this.match(this.input,15,InternalDomainModelParser.FOLLOW_15_in_operation194); 
            string_literal14_tree = this.adaptor.create(string_literal14);
            this.adaptor.addChild(root_0, string_literal14_tree);

            this.pushFollow(InternalDomainModelParser.FOLLOW_validID_in_operation198);
            name=this.validID();

            this.state._fsp--;

            this.adaptor.addChild(root_0, name.getTree());
            char_literal15=this.match(this.input,16,InternalDomainModelParser.FOLLOW_16_in_operation200); 
            char_literal15_tree = this.adaptor.create(char_literal15);
            this.adaptor.addChild(root_0, char_literal15_tree);

            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:40:25: (params+= ID ( ',' params+= ID )* )?
            var alt9=2;
            var LA9_0 = this.input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:40:26: params+= ID ( ',' params+= ID )*
                    params=this.match(this.input,ID,InternalDomainModelParser.FOLLOW_ID_in_operation205); 
                    params_tree = this.adaptor.create(params);
                    this.adaptor.addChild(root_0, params_tree);

                    if (org.antlr.lang.isNull(list_params)) list_params = [];
                    list_params.push(params);

                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:40:37: ( ',' params+= ID )*
                    loop8:
                    do {
                        var alt8=2;
                        var LA8_0 = this.input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                        case 1 :
                            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:40:38: ',' params+= ID
                            char_literal16=this.match(this.input,17,InternalDomainModelParser.FOLLOW_17_in_operation208); 
                            char_literal16_tree = this.adaptor.create(char_literal16);
                            this.adaptor.addChild(root_0, char_literal16_tree);

                            params=this.match(this.input,ID,InternalDomainModelParser.FOLLOW_ID_in_operation212); 
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

            char_literal17=this.match(this.input,18,InternalDomainModelParser.FOLLOW_18_in_operation218); 
            char_literal17_tree = this.adaptor.create(char_literal17);
            this.adaptor.addChild(root_0, char_literal17_tree);

            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:40:61: ( ':' type= validID )?
            var alt10=2;
            var LA10_0 = this.input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:40:62: ':' type= validID
                    char_literal18=this.match(this.input,14,InternalDomainModelParser.FOLLOW_14_in_operation221); 
                    char_literal18_tree = this.adaptor.create(char_literal18);
                    this.adaptor.addChild(root_0, char_literal18_tree);

                    this.pushFollow(InternalDomainModelParser.FOLLOW_validID_in_operation225);
                    type=this.validID();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, type.getTree());


                    break;

            }

            this.pushFollow(InternalDomainModelParser.FOLLOW_blockExpression_in_operation236);
            body=this.blockExpression();

            this.state._fsp--;

            this.adaptor.addChild(root_0, body.getTree());



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
    blockExpression_return: (function() {
        InternalDomainModelParser.blockExpression_return = function(){};
        org.antlr.lang.extend(InternalDomainModelParser.blockExpression_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:43:1: blockExpression : '{' 'code' '}' ;
    // $ANTLR start "blockExpression"
    blockExpression: function() {
        var retval = new InternalDomainModelParser.blockExpression_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal19 = null;
        var string_literal20 = null;
        var char_literal21 = null;

        var char_literal19_tree=null;
        var string_literal20_tree=null;
        var char_literal21_tree=null;

        try {
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:43:16: ( '{' 'code' '}' )
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:44:3: '{' 'code' '}'
            root_0 = this.adaptor.nil();

            char_literal19=this.match(this.input,10,InternalDomainModelParser.FOLLOW_10_in_blockExpression245); 
            char_literal19_tree = this.adaptor.create(char_literal19);
            this.adaptor.addChild(root_0, char_literal19_tree);

            string_literal20=this.match(this.input,19,InternalDomainModelParser.FOLLOW_19_in_blockExpression247); 
            string_literal20_tree = this.adaptor.create(string_literal20);
            this.adaptor.addChild(root_0, string_literal20_tree);

            char_literal21=this.match(this.input,11,InternalDomainModelParser.FOLLOW_11_in_blockExpression249); 
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
    importSection_return: (function() {
        InternalDomainModelParser.importSection_return = function(){};
        org.antlr.lang.extend(InternalDomainModelParser.importSection_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:47:1: importSection : (importDeclarations+= importDeclaration )+ ;
    // $ANTLR start "importSection"
    importSection: function() {
        var retval = new InternalDomainModelParser.importSection_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var list_importDeclarations=null;
        var importDeclarations = null;

        try {
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:47:14: ( (importDeclarations+= importDeclaration )+ )
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:48:3: (importDeclarations+= importDeclaration )+
            root_0 = this.adaptor.nil();

            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:48:21: (importDeclarations+= importDeclaration )+
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
                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:48:21: importDeclarations+= importDeclaration
                    this.pushFollow(InternalDomainModelParser.FOLLOW_importDeclaration_in_importSection263);
                    importDeclarations=this.importDeclaration();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, importDeclarations.getTree());
                    if (org.antlr.lang.isNull(list_importDeclarations)) list_importDeclarations = [];
                    list_importDeclarations.push(importDeclarations.getTree());



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
    importDeclaration_return: (function() {
        InternalDomainModelParser.importDeclaration_return = function(){};
        org.antlr.lang.extend(InternalDomainModelParser.importDeclaration_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:50:1: importDeclaration : 'import' importedNamespace= qualifiedNameWithWildcard ( ';' )? ;
    // $ANTLR start "importDeclaration"
    importDeclaration: function() {
        var retval = new InternalDomainModelParser.importDeclaration_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var string_literal22 = null;
        var char_literal23 = null;
         var importedNamespace = null;

        var string_literal22_tree=null;
        var char_literal23_tree=null;

        try {
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:50:18: ( 'import' importedNamespace= qualifiedNameWithWildcard ( ';' )? )
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:51:3: 'import' importedNamespace= qualifiedNameWithWildcard ( ';' )?
            root_0 = this.adaptor.nil();

            string_literal22=this.match(this.input,20,InternalDomainModelParser.FOLLOW_20_in_importDeclaration273); 
            string_literal22_tree = this.adaptor.create(string_literal22);
            this.adaptor.addChild(root_0, string_literal22_tree);

            this.pushFollow(InternalDomainModelParser.FOLLOW_qualifiedNameWithWildcard_in_importDeclaration277);
            importedNamespace=this.qualifiedNameWithWildcard();

            this.state._fsp--;

            this.adaptor.addChild(root_0, importedNamespace.getTree());
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:51:56: ( ';' )?
            var alt12=2;
            var LA12_0 = this.input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:51:56: ';'
                    char_literal23=this.match(this.input,21,InternalDomainModelParser.FOLLOW_21_in_importDeclaration279); 
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
    qualifiedName_return: (function() {
        InternalDomainModelParser.qualifiedName_return = function(){};
        org.antlr.lang.extend(InternalDomainModelParser.qualifiedName_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:54:1: qualifiedName : validID ( '.' validID )* ;
    // $ANTLR start "qualifiedName"
    qualifiedName: function() {
        var retval = new InternalDomainModelParser.qualifiedName_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal25 = null;
         var validID24 = null;
         var validID26 = null;

        var char_literal25_tree=null;

        try {
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:54:14: ( validID ( '.' validID )* )
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:55:3: validID ( '.' validID )*
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalDomainModelParser.FOLLOW_validID_in_qualifiedName290);
            validID24=this.validID();

            this.state._fsp--;

            this.adaptor.addChild(root_0, validID24.getTree());
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:55:11: ( '.' validID )*
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
                    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:55:12: '.' validID
                    char_literal25=this.match(this.input,22,InternalDomainModelParser.FOLLOW_22_in_qualifiedName293); 
                    char_literal25_tree = this.adaptor.create(char_literal25);
                    this.adaptor.addChild(root_0, char_literal25_tree);

                    this.pushFollow(InternalDomainModelParser.FOLLOW_validID_in_qualifiedName295);
                    validID26=this.validID();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, validID26.getTree());


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
    qualifiedNameWithWildcard_return: (function() {
        InternalDomainModelParser.qualifiedNameWithWildcard_return = function(){};
        org.antlr.lang.extend(InternalDomainModelParser.qualifiedNameWithWildcard_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:57:1: qualifiedNameWithWildcard : qualifiedName '.' '*' ;
    // $ANTLR start "qualifiedNameWithWildcard"
    qualifiedNameWithWildcard: function() {
        var retval = new InternalDomainModelParser.qualifiedNameWithWildcard_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var char_literal28 = null;
        var char_literal29 = null;
         var qualifiedName27 = null;

        var char_literal28_tree=null;
        var char_literal29_tree=null;

        try {
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:57:27: ( qualifiedName '.' '*' )
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:58:3: qualifiedName '.' '*'
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalDomainModelParser.FOLLOW_qualifiedName_in_qualifiedNameWithWildcard307);
            qualifiedName27=this.qualifiedName();

            this.state._fsp--;

            this.adaptor.addChild(root_0, qualifiedName27.getTree());
            char_literal28=this.match(this.input,22,InternalDomainModelParser.FOLLOW_22_in_qualifiedNameWithWildcard310); 
            char_literal28_tree = this.adaptor.create(char_literal28);
            this.adaptor.addChild(root_0, char_literal28_tree);

            char_literal29=this.match(this.input,23,InternalDomainModelParser.FOLLOW_23_in_qualifiedNameWithWildcard312); 
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
    validID_return: (function() {
        InternalDomainModelParser.validID_return = function(){};
        org.antlr.lang.extend(InternalDomainModelParser.validID_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:60:1: validID : ID ;
    // $ANTLR start "validID"
    validID: function() {
        var retval = new InternalDomainModelParser.validID_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var ID30 = null;

        var ID30_tree=null;

        try {
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:60:8: ( ID )
            // E:\\dev\\www\\workspace\\org.xtext.example.domainmodel.light\\src-js\\antlr\\InternalDomainModel.g:61:3: ID
            root_0 = this.adaptor.nil();

            ID30=this.match(this.input,ID,InternalDomainModelParser.FOLLOW_ID_in_validID323); 
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
org.antlr.lang.augmentObject(InternalDomainModelParser, {
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "RULE_INT", "RULE_STRING", "RULE_COMMENT", "WS", "'package'", "'{'", "'}'", "'entity'", "'extends'", "':'", "'op'", "'('", "','", "')'", "'code'", "'import'", "';'", "'.'", "'*'"],
    FOLLOW_importSection_in_domainModel57: new org.antlr.runtime.BitSet([0x00001200, 0x00000000]),
    FOLLOW_abstractElement_in_domainModel65: new org.antlr.runtime.BitSet([0x00001200, 0x00000000]),
    FOLLOW_EOF_in_domainModel72: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_packageDeclaration_in_abstractElement86: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_entity_in_abstractElement90: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_9_in_packageDeclaration99: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_qualifiedName_in_packageDeclaration103: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_packageDeclaration105: new org.antlr.runtime.BitSet([0x00001A00, 0x00000000]),
    FOLLOW_abstractElement_in_packageDeclaration113: new org.antlr.runtime.BitSet([0x00001A00, 0x00000000]),
    FOLLOW_11_in_packageDeclaration118: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_12_in_entity127: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_validID_in_entity131: new org.antlr.runtime.BitSet([0x00002400, 0x00000000]),
    FOLLOW_13_in_entity134: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_validID_in_entity138: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_entity142: new org.antlr.runtime.BitSet([0x00008810, 0x00000000]),
    FOLLOW_feature_in_entity150: new org.antlr.runtime.BitSet([0x00008810, 0x00000000]),
    FOLLOW_11_in_entity155: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_property_in_feature164: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_operation_in_feature168: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_validID_in_property179: new org.antlr.runtime.BitSet([0x00004000, 0x00000000]),
    FOLLOW_14_in_property181: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_validID_in_property185: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_15_in_operation194: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_validID_in_operation198: new org.antlr.runtime.BitSet([0x00010000, 0x00000000]),
    FOLLOW_16_in_operation200: new org.antlr.runtime.BitSet([0x00040010, 0x00000000]),
    FOLLOW_ID_in_operation205: new org.antlr.runtime.BitSet([0x00060000, 0x00000000]),
    FOLLOW_17_in_operation208: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_operation212: new org.antlr.runtime.BitSet([0x00060000, 0x00000000]),
    FOLLOW_18_in_operation218: new org.antlr.runtime.BitSet([0x00004400, 0x00000000]),
    FOLLOW_14_in_operation221: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_validID_in_operation225: new org.antlr.runtime.BitSet([0x00004400, 0x00000000]),
    FOLLOW_blockExpression_in_operation236: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_10_in_blockExpression245: new org.antlr.runtime.BitSet([0x00080000, 0x00000000]),
    FOLLOW_19_in_blockExpression247: new org.antlr.runtime.BitSet([0x00000800, 0x00000000]),
    FOLLOW_11_in_blockExpression249: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_importDeclaration_in_importSection263: new org.antlr.runtime.BitSet([0x00100002, 0x00000000]),
    FOLLOW_20_in_importDeclaration273: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_qualifiedNameWithWildcard_in_importDeclaration277: new org.antlr.runtime.BitSet([0x00200002, 0x00000000]),
    FOLLOW_21_in_importDeclaration279: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_validID_in_qualifiedName290: new org.antlr.runtime.BitSet([0x00400002, 0x00000000]),
    FOLLOW_22_in_qualifiedName293: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_validID_in_qualifiedName295: new org.antlr.runtime.BitSet([0x00400002, 0x00000000]),
    FOLLOW_qualifiedName_in_qualifiedNameWithWildcard307: new org.antlr.runtime.BitSet([0x00400000, 0x00000000]),
    FOLLOW_22_in_qualifiedNameWithWildcard310: new org.antlr.runtime.BitSet([0x00800000, 0x00000000]),
    FOLLOW_23_in_qualifiedNameWithWildcard312: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ID_in_validID323: new org.antlr.runtime.BitSet([0x00000002, 0x00000000])
});

})();