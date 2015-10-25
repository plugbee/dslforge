// $ANTLR 3.3 Nov 30, 2010 12:50:56 E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g 2014-11-06 15:25:52

var InternalConfParser = function(input, state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    InternalConfParser.superclass.constructor.call(this, input, state);


         

    /* @todo only create adaptor if output=AST */
    this.adaptor = new org.antlr.runtime.tree.CommonTreeAdaptor();

};

org.antlr.lang.augmentObject(InternalConfParser, {
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
    T__27: 27,
    T__28: 28,
    T__29: 29,
    T__30: 30,
    TEXT: 4,
    ID: 5,
    INT: 6,
    WS: 7,
    COMMENT: 8,
    STRING: 9
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
    T__27= 27,
    T__28= 28,
    T__29= 29,
    T__30= 30,
    TEXT= 4,
    ID= 5,
    INT= 6,
    WS= 7,
    COMMENT= 8,
    STRING= 9;

// public instance methods/vars
org.antlr.lang.extend(InternalConfParser, org.antlr.runtime.Parser, {
        
    setTreeAdaptor: function(adaptor) {
        this.adaptor = adaptor;
    },
    getTreeAdaptor: function() {
        return this.adaptor;
    },

    getTokenNames: function() { return InternalConfParser.tokenNames; },
    getGrammarFileName: function() { return "E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g"; }
});
org.antlr.lang.augmentObject(InternalConfParser.prototype, {

    // inline static return class
    model_return: (function() {
        InternalConfParser.model_return = function(){};
        org.antlr.lang.extend(InternalConfParser.model_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:13:1: model : info= basicConfInfo 'Dates' '[' date= dates ']' 'Description' description= TEXT 'Topics' topics= TEXT 'ProgramCommittee' committee= TEXT 'Organizers' organizers= TEXT 'SubmissionDetails' submdetails= TEXT 'PreviousEditions' ( '[' previous+= basicConfInfo ']' )+ EOF ;
    // $ANTLR start "model"
    model: function() {
        var retval = new InternalConfParser.model_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var description = null;
        var topics = null;
        var committee = null;
        var organizers = null;
        var submdetails = null;
        var string_literal1 = null;
        var char_literal2 = null;
        var char_literal3 = null;
        var string_literal4 = null;
        var string_literal5 = null;
        var string_literal6 = null;
        var string_literal7 = null;
        var string_literal8 = null;
        var string_literal9 = null;
        var char_literal10 = null;
        var char_literal11 = null;
        var EOF12 = null;
        var list_previous=null;
         var info = null;
         var date = null;
        var previous = null;
        var description_tree=null;
        var topics_tree=null;
        var committee_tree=null;
        var organizers_tree=null;
        var submdetails_tree=null;
        var string_literal1_tree=null;
        var char_literal2_tree=null;
        var char_literal3_tree=null;
        var string_literal4_tree=null;
        var string_literal5_tree=null;
        var string_literal6_tree=null;
        var string_literal7_tree=null;
        var string_literal8_tree=null;
        var string_literal9_tree=null;
        var char_literal10_tree=null;
        var char_literal11_tree=null;
        var EOF12_tree=null;

        try {
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:13:6: (info= basicConfInfo 'Dates' '[' date= dates ']' 'Description' description= TEXT 'Topics' topics= TEXT 'ProgramCommittee' committee= TEXT 'Organizers' organizers= TEXT 'SubmissionDetails' submdetails= TEXT 'PreviousEditions' ( '[' previous+= basicConfInfo ']' )+ EOF )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:13:8: info= basicConfInfo 'Dates' '[' date= dates ']' 'Description' description= TEXT 'Topics' topics= TEXT 'ProgramCommittee' committee= TEXT 'Organizers' organizers= TEXT 'SubmissionDetails' submdetails= TEXT 'PreviousEditions' ( '[' previous+= basicConfInfo ']' )+ EOF
            root_0 = this.adaptor.nil();

            this.pushFollow(InternalConfParser.FOLLOW_basicConfInfo_in_model55);
            info=this.basicConfInfo();

            this.state._fsp--;

            this.adaptor.addChild(root_0, info.getTree());
            string_literal1=this.match(this.input,10,InternalConfParser.FOLLOW_10_in_model59); 
            string_literal1_tree = this.adaptor.create(string_literal1);
            this.adaptor.addChild(root_0, string_literal1_tree);

            char_literal2=this.match(this.input,11,InternalConfParser.FOLLOW_11_in_model61); 
            char_literal2_tree = this.adaptor.create(char_literal2);
            this.adaptor.addChild(root_0, char_literal2_tree);

            this.pushFollow(InternalConfParser.FOLLOW_dates_in_model65);
            date=this.dates();

            this.state._fsp--;

            this.adaptor.addChild(root_0, date.getTree());
            char_literal3=this.match(this.input,12,InternalConfParser.FOLLOW_12_in_model67); 
            char_literal3_tree = this.adaptor.create(char_literal3);
            this.adaptor.addChild(root_0, char_literal3_tree);

            string_literal4=this.match(this.input,13,InternalConfParser.FOLLOW_13_in_model71); 
            string_literal4_tree = this.adaptor.create(string_literal4);
            this.adaptor.addChild(root_0, string_literal4_tree);

            description=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_model77); 
            description_tree = this.adaptor.create(description);
            this.adaptor.addChild(root_0, description_tree);

            string_literal5=this.match(this.input,14,InternalConfParser.FOLLOW_14_in_model81); 
            string_literal5_tree = this.adaptor.create(string_literal5);
            this.adaptor.addChild(root_0, string_literal5_tree);

            topics=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_model87); 
            topics_tree = this.adaptor.create(topics);
            this.adaptor.addChild(root_0, topics_tree);

            string_literal6=this.match(this.input,15,InternalConfParser.FOLLOW_15_in_model91); 
            string_literal6_tree = this.adaptor.create(string_literal6);
            this.adaptor.addChild(root_0, string_literal6_tree);

            committee=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_model95); 
            committee_tree = this.adaptor.create(committee);
            this.adaptor.addChild(root_0, committee_tree);

            string_literal7=this.match(this.input,16,InternalConfParser.FOLLOW_16_in_model99); 
            string_literal7_tree = this.adaptor.create(string_literal7);
            this.adaptor.addChild(root_0, string_literal7_tree);

            organizers=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_model103); 
            organizers_tree = this.adaptor.create(organizers);
            this.adaptor.addChild(root_0, organizers_tree);

            string_literal8=this.match(this.input,17,InternalConfParser.FOLLOW_17_in_model107); 
            string_literal8_tree = this.adaptor.create(string_literal8);
            this.adaptor.addChild(root_0, string_literal8_tree);

            submdetails=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_model111); 
            submdetails_tree = this.adaptor.create(submdetails);
            this.adaptor.addChild(root_0, submdetails_tree);

            string_literal9=this.match(this.input,18,InternalConfParser.FOLLOW_18_in_model115); 
            string_literal9_tree = this.adaptor.create(string_literal9);
            this.adaptor.addChild(root_0, string_literal9_tree);

            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:20:20: ( '[' previous+= basicConfInfo ']' )+
            var cnt1=0;
            loop1:
            do {
                var alt1=2;
                var LA1_0 = this.input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:20:21: '[' previous+= basicConfInfo ']'
                    char_literal10=this.match(this.input,11,InternalConfParser.FOLLOW_11_in_model118); 
                    char_literal10_tree = this.adaptor.create(char_literal10);
                    this.adaptor.addChild(root_0, char_literal10_tree);

                    this.pushFollow(InternalConfParser.FOLLOW_basicConfInfo_in_model122);
                    previous=this.basicConfInfo();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, previous.getTree());
                    if (org.antlr.lang.isNull(list_previous)) list_previous = [];
                    list_previous.push(previous.getTree());

                    char_literal11=this.match(this.input,12,InternalConfParser.FOLLOW_12_in_model124); 
                    char_literal11_tree = this.adaptor.create(char_literal11);
                    this.adaptor.addChild(root_0, char_literal11_tree);



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

            EOF12=this.match(this.input,EOF,InternalConfParser.FOLLOW_EOF_in_model128); 



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
    basicConfInfo_return: (function() {
        InternalConfParser.basicConfInfo_return = function(){};
        org.antlr.lang.extend(InternalConfParser.basicConfInfo_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:24:1: basicConfInfo : 'Name' name= TEXT 'Acronym' acronym= TEXT 'Year' year= TEXT ( 'HeldInConjuctionWith' '[' conjunction= basicConfInfo ']' )? ( 'Location' location= TEXT )? ( 'Web' url= TEXT )? ;
    // $ANTLR start "basicConfInfo"
    basicConfInfo: function() {
        var retval = new InternalConfParser.basicConfInfo_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var name = null;
        var acronym = null;
        var year = null;
        var location = null;
        var url = null;
        var string_literal13 = null;
        var string_literal14 = null;
        var string_literal15 = null;
        var string_literal16 = null;
        var char_literal17 = null;
        var char_literal18 = null;
        var string_literal19 = null;
        var string_literal20 = null;
         var conjunction = null;

        var name_tree=null;
        var acronym_tree=null;
        var year_tree=null;
        var location_tree=null;
        var url_tree=null;
        var string_literal13_tree=null;
        var string_literal14_tree=null;
        var string_literal15_tree=null;
        var string_literal16_tree=null;
        var char_literal17_tree=null;
        var char_literal18_tree=null;
        var string_literal19_tree=null;
        var string_literal20_tree=null;

        try {
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:24:15: ( 'Name' name= TEXT 'Acronym' acronym= TEXT 'Year' year= TEXT ( 'HeldInConjuctionWith' '[' conjunction= basicConfInfo ']' )? ( 'Location' location= TEXT )? ( 'Web' url= TEXT )? )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:25:1: 'Name' name= TEXT 'Acronym' acronym= TEXT 'Year' year= TEXT ( 'HeldInConjuctionWith' '[' conjunction= basicConfInfo ']' )? ( 'Location' location= TEXT )? ( 'Web' url= TEXT )?
            root_0 = this.adaptor.nil();

            string_literal13=this.match(this.input,19,InternalConfParser.FOLLOW_19_in_basicConfInfo141); 
            string_literal13_tree = this.adaptor.create(string_literal13);
            this.adaptor.addChild(root_0, string_literal13_tree);

            name=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_basicConfInfo145); 
            name_tree = this.adaptor.create(name);
            this.adaptor.addChild(root_0, name_tree);

            string_literal14=this.match(this.input,20,InternalConfParser.FOLLOW_20_in_basicConfInfo149); 
            string_literal14_tree = this.adaptor.create(string_literal14);
            this.adaptor.addChild(root_0, string_literal14_tree);

            acronym=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_basicConfInfo153); 
            acronym_tree = this.adaptor.create(acronym);
            this.adaptor.addChild(root_0, acronym_tree);

            string_literal15=this.match(this.input,21,InternalConfParser.FOLLOW_21_in_basicConfInfo157); 
            string_literal15_tree = this.adaptor.create(string_literal15);
            this.adaptor.addChild(root_0, string_literal15_tree);

            year=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_basicConfInfo161); 
            year_tree = this.adaptor.create(year);
            this.adaptor.addChild(root_0, year_tree);

            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:27:18: ( 'HeldInConjuctionWith' '[' conjunction= basicConfInfo ']' )?
            var alt2=2;
            var LA2_0 = this.input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:27:19: 'HeldInConjuctionWith' '[' conjunction= basicConfInfo ']'
                    string_literal16=this.match(this.input,22,InternalConfParser.FOLLOW_22_in_basicConfInfo164); 
                    string_literal16_tree = this.adaptor.create(string_literal16);
                    this.adaptor.addChild(root_0, string_literal16_tree);

                    char_literal17=this.match(this.input,11,InternalConfParser.FOLLOW_11_in_basicConfInfo166); 
                    char_literal17_tree = this.adaptor.create(char_literal17);
                    this.adaptor.addChild(root_0, char_literal17_tree);

                    this.pushFollow(InternalConfParser.FOLLOW_basicConfInfo_in_basicConfInfo170);
                    conjunction=this.basicConfInfo();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, conjunction.getTree());
                    char_literal18=this.match(this.input,12,InternalConfParser.FOLLOW_12_in_basicConfInfo172); 
                    char_literal18_tree = this.adaptor.create(char_literal18);
                    this.adaptor.addChild(root_0, char_literal18_tree);



                    break;

            }

            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:28:1: ( 'Location' location= TEXT )?
            var alt3=2;
            var LA3_0 = this.input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:28:2: 'Location' location= TEXT
                    string_literal19=this.match(this.input,23,InternalConfParser.FOLLOW_23_in_basicConfInfo178); 
                    string_literal19_tree = this.adaptor.create(string_literal19);
                    this.adaptor.addChild(root_0, string_literal19_tree);

                    location=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_basicConfInfo184); 
                    location_tree = this.adaptor.create(location);
                    this.adaptor.addChild(root_0, location_tree);



                    break;

            }

            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:29:1: ( 'Web' url= TEXT )?
            var alt4=2;
            var LA4_0 = this.input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:29:2: 'Web' url= TEXT
                    string_literal20=this.match(this.input,24,InternalConfParser.FOLLOW_24_in_basicConfInfo190); 
                    string_literal20_tree = this.adaptor.create(string_literal20);
                    this.adaptor.addChild(root_0, string_literal20_tree);

                    url=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_basicConfInfo194); 
                    url_tree = this.adaptor.create(url);
                    this.adaptor.addChild(root_0, url_tree);



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
    dates_return: (function() {
        InternalConfParser.dates_return = function(){};
        org.antlr.lang.extend(InternalConfParser.dates_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:32:1: dates : 'Conference' confdates= TEXT 'Submissions' submdates= TEXT ( 'ExtendedSubmissions' extsubmdates= TEXT )? 'Notifications' notidates= TEXT ( 'ExtendedNotifications' extnotidates= TEXT )? 'CameraReady' camedates= TEXT ;
    // $ANTLR start "dates"
    dates: function() {
        var retval = new InternalConfParser.dates_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var confdates = null;
        var submdates = null;
        var extsubmdates = null;
        var notidates = null;
        var extnotidates = null;
        var camedates = null;
        var string_literal21 = null;
        var string_literal22 = null;
        var string_literal23 = null;
        var string_literal24 = null;
        var string_literal25 = null;
        var string_literal26 = null;

        var confdates_tree=null;
        var submdates_tree=null;
        var extsubmdates_tree=null;
        var notidates_tree=null;
        var extnotidates_tree=null;
        var camedates_tree=null;
        var string_literal21_tree=null;
        var string_literal22_tree=null;
        var string_literal23_tree=null;
        var string_literal24_tree=null;
        var string_literal25_tree=null;
        var string_literal26_tree=null;

        try {
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:32:6: ( 'Conference' confdates= TEXT 'Submissions' submdates= TEXT ( 'ExtendedSubmissions' extsubmdates= TEXT )? 'Notifications' notidates= TEXT ( 'ExtendedNotifications' extnotidates= TEXT )? 'CameraReady' camedates= TEXT )
            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:33:1: 'Conference' confdates= TEXT 'Submissions' submdates= TEXT ( 'ExtendedSubmissions' extsubmdates= TEXT )? 'Notifications' notidates= TEXT ( 'ExtendedNotifications' extnotidates= TEXT )? 'CameraReady' camedates= TEXT
            root_0 = this.adaptor.nil();

            string_literal21=this.match(this.input,25,InternalConfParser.FOLLOW_25_in_dates207); 
            string_literal21_tree = this.adaptor.create(string_literal21);
            this.adaptor.addChild(root_0, string_literal21_tree);

            confdates=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_dates211); 
            confdates_tree = this.adaptor.create(confdates);
            this.adaptor.addChild(root_0, confdates_tree);

            string_literal22=this.match(this.input,26,InternalConfParser.FOLLOW_26_in_dates214); 
            string_literal22_tree = this.adaptor.create(string_literal22);
            this.adaptor.addChild(root_0, string_literal22_tree);

            submdates=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_dates218); 
            submdates_tree = this.adaptor.create(submdates);
            this.adaptor.addChild(root_0, submdates_tree);

            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:35:1: ( 'ExtendedSubmissions' extsubmdates= TEXT )?
            var alt5=2;
            var LA5_0 = this.input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:35:2: 'ExtendedSubmissions' extsubmdates= TEXT
                    string_literal23=this.match(this.input,27,InternalConfParser.FOLLOW_27_in_dates222); 
                    string_literal23_tree = this.adaptor.create(string_literal23);
                    this.adaptor.addChild(root_0, string_literal23_tree);

                    extsubmdates=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_dates226); 
                    extsubmdates_tree = this.adaptor.create(extsubmdates);
                    this.adaptor.addChild(root_0, extsubmdates_tree);



                    break;

            }

            string_literal24=this.match(this.input,28,InternalConfParser.FOLLOW_28_in_dates231); 
            string_literal24_tree = this.adaptor.create(string_literal24);
            this.adaptor.addChild(root_0, string_literal24_tree);

            notidates=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_dates235); 
            notidates_tree = this.adaptor.create(notidates);
            this.adaptor.addChild(root_0, notidates_tree);

            // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:37:1: ( 'ExtendedNotifications' extnotidates= TEXT )?
            var alt6=2;
            var LA6_0 = this.input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // E:\\dev\\www\\runtime-tests\\org.xtext.example.conf.web\\src-js\\org\\xtext\\example\\conf\\web\\parser\\InternalConf.g:37:2: 'ExtendedNotifications' extnotidates= TEXT
                    string_literal25=this.match(this.input,29,InternalConfParser.FOLLOW_29_in_dates239); 
                    string_literal25_tree = this.adaptor.create(string_literal25);
                    this.adaptor.addChild(root_0, string_literal25_tree);

                    extnotidates=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_dates243); 
                    extnotidates_tree = this.adaptor.create(extnotidates);
                    this.adaptor.addChild(root_0, extnotidates_tree);



                    break;

            }

            string_literal26=this.match(this.input,30,InternalConfParser.FOLLOW_30_in_dates249); 
            string_literal26_tree = this.adaptor.create(string_literal26);
            this.adaptor.addChild(root_0, string_literal26_tree);

            camedates=this.match(this.input,TEXT,InternalConfParser.FOLLOW_TEXT_in_dates253); 
            camedates_tree = this.adaptor.create(camedates);
            this.adaptor.addChild(root_0, camedates_tree);




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
org.antlr.lang.augmentObject(InternalConfParser, {
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "ID", "INT", "WS", "COMMENT", "STRING", "'Dates'", "'['", "']'", "'Description'", "'Topics'", "'ProgramCommittee'", "'Organizers'", "'SubmissionDetails'", "'PreviousEditions'", "'Name'", "'Acronym'", "'Year'", "'HeldInConjuctionWith'", "'Location'", "'Web'", "'Conference'", "'Submissions'", "'ExtendedSubmissions'", "'Notifications'", "'ExtendedNotifications'", "'CameraReady'"],
    FOLLOW_basicConfInfo_in_model55: new org.antlr.runtime.BitSet([0x00000400, 0x00000000]),
    FOLLOW_10_in_model59: new org.antlr.runtime.BitSet([0x00000800, 0x00000000]),
    FOLLOW_11_in_model61: new org.antlr.runtime.BitSet([0x02000000, 0x00000000]),
    FOLLOW_dates_in_model65: new org.antlr.runtime.BitSet([0x00001000, 0x00000000]),
    FOLLOW_12_in_model67: new org.antlr.runtime.BitSet([0x00002000, 0x00000000]),
    FOLLOW_13_in_model71: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_model77: new org.antlr.runtime.BitSet([0x00004000, 0x00000000]),
    FOLLOW_14_in_model81: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_model87: new org.antlr.runtime.BitSet([0x00008000, 0x00000000]),
    FOLLOW_15_in_model91: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_model95: new org.antlr.runtime.BitSet([0x00010000, 0x00000000]),
    FOLLOW_16_in_model99: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_model103: new org.antlr.runtime.BitSet([0x00020000, 0x00000000]),
    FOLLOW_17_in_model107: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_model111: new org.antlr.runtime.BitSet([0x00040000, 0x00000000]),
    FOLLOW_18_in_model115: new org.antlr.runtime.BitSet([0x00000800, 0x00000000]),
    FOLLOW_11_in_model118: new org.antlr.runtime.BitSet([0x00080000, 0x00000000]),
    FOLLOW_basicConfInfo_in_model122: new org.antlr.runtime.BitSet([0x00001000, 0x00000000]),
    FOLLOW_12_in_model124: new org.antlr.runtime.BitSet([0x00000800, 0x00000000]),
    FOLLOW_EOF_in_model128: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_19_in_basicConfInfo141: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_basicConfInfo145: new org.antlr.runtime.BitSet([0x00100000, 0x00000000]),
    FOLLOW_20_in_basicConfInfo149: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_basicConfInfo153: new org.antlr.runtime.BitSet([0x00200000, 0x00000000]),
    FOLLOW_21_in_basicConfInfo157: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_basicConfInfo161: new org.antlr.runtime.BitSet([0x01C00002, 0x00000000]),
    FOLLOW_22_in_basicConfInfo164: new org.antlr.runtime.BitSet([0x00000800, 0x00000000]),
    FOLLOW_11_in_basicConfInfo166: new org.antlr.runtime.BitSet([0x00080000, 0x00000000]),
    FOLLOW_basicConfInfo_in_basicConfInfo170: new org.antlr.runtime.BitSet([0x00001000, 0x00000000]),
    FOLLOW_12_in_basicConfInfo172: new org.antlr.runtime.BitSet([0x01800002, 0x00000000]),
    FOLLOW_23_in_basicConfInfo178: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_basicConfInfo184: new org.antlr.runtime.BitSet([0x01000002, 0x00000000]),
    FOLLOW_24_in_basicConfInfo190: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_basicConfInfo194: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_25_in_dates207: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_dates211: new org.antlr.runtime.BitSet([0x04000000, 0x00000000]),
    FOLLOW_26_in_dates214: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_dates218: new org.antlr.runtime.BitSet([0x18000000, 0x00000000]),
    FOLLOW_27_in_dates222: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_dates226: new org.antlr.runtime.BitSet([0x10000000, 0x00000000]),
    FOLLOW_28_in_dates231: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_dates235: new org.antlr.runtime.BitSet([0x60000000, 0x00000000]),
    FOLLOW_29_in_dates239: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_dates243: new org.antlr.runtime.BitSet([0x40000000, 0x00000000]),
    FOLLOW_30_in_dates249: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_TEXT_in_dates253: new org.antlr.runtime.BitSet([0x00000002, 0x00000000])
});

})();