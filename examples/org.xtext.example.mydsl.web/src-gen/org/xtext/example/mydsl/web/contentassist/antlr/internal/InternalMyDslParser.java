// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g 2016-03-16 22:53:39

package org.xtext.example.mydsl.web.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'"
    };
    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:58:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:59:1: ( ruleModel EOF )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:60:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:67:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:71:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:72:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:72:1: ( ( rule__Model__GreetingsAssignment )* )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:73:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:74:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:74:2: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:86:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:87:1: ( ruleGreeting EOF )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:88:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting122);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:95:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:99:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:100:1: ( ( rule__Greeting__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:100:1: ( ( rule__Greeting__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:101:1: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:102:1: ( rule__Greeting__Group__0 )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:102:2: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "rule__Greeting__Group__0"
    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:116:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:120:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:121:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0189);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0192);
            rule__Greeting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:128:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:132:1: ( ( 'Hello' ) )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:133:1: ( 'Hello' )
            {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:133:1: ( 'Hello' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:134:1: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Greeting__Group__0__Impl220); 
             after(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:147:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:151:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:152:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1251);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1254);
            rule__Greeting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:159:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:163:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:164:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:164:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:165:1: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:166:1: ( rule__Greeting__NameAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:166:2: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl281);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:176:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:180:1: ( rule__Greeting__Group__2__Impl )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:181:2: rule__Greeting__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2311);
            rule__Greeting__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:187:1: rule__Greeting__Group__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:191:1: ( ( '!' ) )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:192:1: ( '!' )
            {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:192:1: ( '!' )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:193:1: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Greeting__Group__2__Impl339); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:213:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:217:1: ( ( ruleGreeting ) )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:218:1: ( ruleGreeting )
            {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:218:1: ( ruleGreeting )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:219:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment381);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:228:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:232:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:233:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:233:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.xtext.example.mydsl.web\\src-gen\\org\\xtext\\example\\mydsl\\web\\contentassist\\antlr\\internal\\InternalMyDsl.g:234:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_1412); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Greeting__Group__0__Impl220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1251 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Greeting__Group__2__Impl339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_1412 = new BitSet(new long[]{0x0000000000000002L});

}