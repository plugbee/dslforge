// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g 2016-03-16 22:53:39



var InternalMyDslParser = function(input, state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    InternalMyDslParser.superclass.constructor.call(this, input, state);


         

    /* @todo only create adaptor if output=AST */
    this.adaptor = new org.antlr.runtime.tree.CommonTreeAdaptor();

};

org.antlr.lang.augmentObject(InternalMyDslParser, {
    EOF: -1,
    T__9: 9,
    T__10: 10,
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
    ID= 4,
    STRING= 5,
    COMMENT= 6,
    WS= 7,
    INT= 8;

// public instance methods/vars
org.antlr.lang.extend(InternalMyDslParser, org.antlr.runtime.Parser, {
        
    setTreeAdaptor: function(adaptor) {
        this.adaptor = adaptor;
    },
    getTreeAdaptor: function() {
        return this.adaptor;
    },

    getTokenNames: function() { return InternalMyDslParser.tokenNames; },
    getGrammarFileName: function() { return "D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g"; }
});
org.antlr.lang.augmentObject(InternalMyDslParser.prototype, {

    // inline static return class
    rule_Model_return: (function() {
        InternalMyDslParser.rule_Model_return = function(){};
        org.antlr.lang.extend(InternalMyDslParser.rule_Model_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:18:1: rule_Model : (greetings+= rule_Greeting )* EOF ;
    // $ANTLR start "rule_Model"
    rule_Model: function() {
        var retval = new InternalMyDslParser.rule_Model_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var EOF1 = null;
        var list_greetings=null;
        var greetings = null;
        var EOF1_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:18:11: ( (greetings+= rule_Greeting )* EOF )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:19:2: (greetings+= rule_Greeting )* EOF
            root_0 = this.adaptor.nil();

            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:19:11: (greetings+= rule_Greeting )*
            loop1:
            do {
                var alt1=2;
                var LA1_0 = this.input.LA(1);

                if ( (LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:19:11: greetings+= rule_Greeting
                    this.pushFollow(InternalMyDslParser.FOLLOW_rule_Greeting_in_rule_Model60);
                    greetings=this.rule_Greeting();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, greetings.getTree());
                    if (org.antlr.lang.isNull(list_greetings)) list_greetings = [];
                    list_greetings.push(greetings.getTree());



                    break;

                default :
                    break loop1;
                }
            } while (true);

            EOF1=this.match(this.input,EOF,InternalMyDslParser.FOLLOW_EOF_in_rule_Model63); 



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
    rule_Greeting_return: (function() {
        InternalMyDslParser.rule_Greeting_return = function(){};
        org.antlr.lang.extend(InternalMyDslParser.rule_Greeting_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:22:1: rule_Greeting : 'Hello' name= ID '!' ;
    // $ANTLR start "rule_Greeting"
    rule_Greeting: function() {
        var retval = new InternalMyDslParser.rule_Greeting_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var string_literal2 = null;
        var char_literal3 = null;

        var name_tree=null;
        var string_literal2_tree=null;
        var char_literal3_tree=null;

        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:22:14: ( 'Hello' name= ID '!' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-js\\org\\xtext\\example\\mydsl\\web\\parser\\InternalMyDsl.g:23:2: 'Hello' name= ID '!'
            root_0 = this.adaptor.nil();

            string_literal2=this.match(this.input,9,InternalMyDslParser.FOLLOW_9_in_rule_Greeting73); 
            string_literal2_tree = this.adaptor.create(string_literal2);
            this.adaptor.addChild(root_0, string_literal2_tree);

            name=this.match(this.input,ID,InternalMyDslParser.FOLLOW_ID_in_rule_Greeting77); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            char_literal3=this.match(this.input,10,InternalMyDslParser.FOLLOW_10_in_rule_Greeting79); 
            char_literal3_tree = this.adaptor.create(char_literal3);
            this.adaptor.addChild(root_0, char_literal3_tree);




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
org.antlr.lang.augmentObject(InternalMyDslParser, {
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "STRING", "COMMENT", "WS", "INT", "'Hello'", "'!'"],
    FOLLOW_rule_Greeting_in_rule_Model60: new org.antlr.runtime.BitSet([0x00000200, 0x00000000]),
    FOLLOW_EOF_in_rule_Model63: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_9_in_rule_Greeting73: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_ID_in_rule_Greeting77: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_rule_Greeting79: new org.antlr.runtime.BitSet([0x00000002, 0x00000000])
});

})();