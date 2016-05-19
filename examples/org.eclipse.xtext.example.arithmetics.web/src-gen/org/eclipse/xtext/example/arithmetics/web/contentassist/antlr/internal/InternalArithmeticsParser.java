// $ANTLR 3.3 avr. 19, 2016 01:13:22 D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g 2016-05-18 22:02:04

package org.eclipse.xtext.example.arithmetics.web.contentassist.antlr.internal; 

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
import org.eclipse.xtext.example.arithmetics.services.ArithmeticsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalArithmeticsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'import'", "'def'", "':'", "';'", "'('", "')'", "','", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int RULE_ID=4;
    public static final int RULE_NUMBER=5;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=7;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;

    // delegates
    // delegators


        public InternalArithmeticsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArithmeticsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArithmeticsParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g"; }


     
     	private ArithmeticsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ArithmeticsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModule"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:58:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:59:1: ( ruleModule EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:60:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule61);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule68); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:67:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:71:2: ( ( ( rule__Module__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:72:1: ( ( rule__Module__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:72:1: ( ( rule__Module__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:73:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:74:1: ( rule__Module__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:74:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule94);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleImport"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:86:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:87:1: ( ruleImport EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:88:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:95:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:99:2: ( ( ( rule__Import__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:100:1: ( ( rule__Import__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:100:1: ( ( rule__Import__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:101:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:102:1: ( rule__Import__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:102:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleStatement"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:114:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:115:1: ( ruleStatement EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:116:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement181);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement188); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:123:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:127:2: ( ( ( rule__Statement__Alternatives ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:128:1: ( ( rule__Statement__Alternatives ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:128:1: ( ( rule__Statement__Alternatives ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:129:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:130:1: ( rule__Statement__Alternatives )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:130:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement214);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDefinition"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:142:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:143:1: ( ruleDefinition EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:144:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition241);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition248); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:151:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:155:2: ( ( ( rule__Definition__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:156:1: ( ( rule__Definition__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:156:1: ( ( rule__Definition__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:157:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:158:1: ( rule__Definition__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:158:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition274);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleDeclaredParameter"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:170:1: entryRuleDeclaredParameter : ruleDeclaredParameter EOF ;
    public final void entryRuleDeclaredParameter() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:171:1: ( ruleDeclaredParameter EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:172:1: ruleDeclaredParameter EOF
            {
             before(grammarAccess.getDeclaredParameterRule()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_entryRuleDeclaredParameter301);
            ruleDeclaredParameter();

            state._fsp--;

             after(grammarAccess.getDeclaredParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredParameter308); 

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
    // $ANTLR end "entryRuleDeclaredParameter"


    // $ANTLR start "ruleDeclaredParameter"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:179:1: ruleDeclaredParameter : ( ( rule__DeclaredParameter__NameAssignment ) ) ;
    public final void ruleDeclaredParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:183:2: ( ( ( rule__DeclaredParameter__NameAssignment ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:184:1: ( ( rule__DeclaredParameter__NameAssignment ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:184:1: ( ( rule__DeclaredParameter__NameAssignment ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:185:1: ( rule__DeclaredParameter__NameAssignment )
            {
             before(grammarAccess.getDeclaredParameterAccess().getNameAssignment()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:186:1: ( rule__DeclaredParameter__NameAssignment )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:186:2: rule__DeclaredParameter__NameAssignment
            {
            pushFollow(FOLLOW_rule__DeclaredParameter__NameAssignment_in_ruleDeclaredParameter334);
            rule__DeclaredParameter__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeclaredParameterAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleDeclaredParameter"


    // $ANTLR start "entryRuleEvaluation"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:200:1: entryRuleEvaluation : ruleEvaluation EOF ;
    public final void entryRuleEvaluation() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:201:1: ( ruleEvaluation EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:202:1: ruleEvaluation EOF
            {
             before(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation363);
            ruleEvaluation();

            state._fsp--;

             after(grammarAccess.getEvaluationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation370); 

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
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:209:1: ruleEvaluation : ( ( rule__Evaluation__Group__0 ) ) ;
    public final void ruleEvaluation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:213:2: ( ( ( rule__Evaluation__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:214:1: ( ( rule__Evaluation__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:214:1: ( ( rule__Evaluation__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:215:1: ( rule__Evaluation__Group__0 )
            {
             before(grammarAccess.getEvaluationAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:216:1: ( rule__Evaluation__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:216:2: rule__Evaluation__Group__0
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__0_in_ruleEvaluation396);
            rule__Evaluation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getGroup()); 

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
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleExpression"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:228:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:229:1: ( ruleExpression EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:230:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression423);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression430); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:237:1: ruleExpression : ( ruleAddition ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:241:2: ( ( ruleAddition ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:242:1: ( ruleAddition )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:242:1: ( ruleAddition )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:243:1: ruleAddition
            {
             before(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
            pushFollow(FOLLOW_ruleAddition_in_ruleExpression456);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:256:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:257:1: ( ruleAddition EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:258:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition482);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition489); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:265:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:269:2: ( ( ( rule__Addition__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:270:1: ( ( rule__Addition__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:270:1: ( ( rule__Addition__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:271:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:272:1: ( rule__Addition__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:272:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition515);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:284:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:285:1: ( ruleMultiplication EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:286:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication542);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication549); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:293:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:297:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:298:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:298:1: ( ( rule__Multiplication__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:299:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:300:1: ( rule__Multiplication__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:300:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication575);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:312:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:313:1: ( rulePrimaryExpression EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:314:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression602);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression609); 

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:321:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:325:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:326:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:326:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:327:1: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:328:1: ( rule__PrimaryExpression__Alternatives )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:328:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression635);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "rule__Statement__Alternatives"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:340:1: rule__Statement__Alternatives : ( ( ruleDefinition ) | ( ruleEvaluation ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:344:1: ( ( ruleDefinition ) | ( ruleEvaluation ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_NUMBER)||LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:345:1: ( ruleDefinition )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:345:1: ( ruleDefinition )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:346:1: ruleDefinition
                    {
                     before(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefinition_in_rule__Statement__Alternatives671);
                    ruleDefinition();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:351:6: ( ruleEvaluation )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:351:6: ( ruleEvaluation )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:352:1: ruleEvaluation
                    {
                     before(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEvaluation_in_rule__Statement__Alternatives688);
                    ruleEvaluation();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:363:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:367:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:368:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:368:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:369:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:370:1: ( rule__Addition__Group_1_0_0__0 )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:370:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_0721);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:374:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:374:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:375:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:376:1: ( rule__Addition__Group_1_0_1__0 )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:376:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_0739);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__Alternatives_1_0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:385:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:389:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:390:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:390:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:391:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:392:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:392:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_0772);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:396:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:396:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:397:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:398:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:398:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_0790);
                    rule__Multiplication__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Multiplication__Alternatives_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:407:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:411:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:412:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:412:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:413:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:414:1: ( rule__PrimaryExpression__Group_0__0 )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:414:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives823);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:418:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:418:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:419:1: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:420:1: ( rule__PrimaryExpression__Group_1__0 )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:420:2: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives841);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:424:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:424:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:425:1: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:426:1: ( rule__PrimaryExpression__Group_2__0 )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:426:2: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives859);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:437:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:441:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:442:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0890);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0893);
            rule__Module__Group__1();

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
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:449:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:453:1: ( ( 'module' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:454:1: ( 'module' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:454:1: ( 'module' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:455:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Module__Group__0__Impl921); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_0()); 

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
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:468:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:472:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:473:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1952);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1955);
            rule__Module__Group__2();

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
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:480:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:484:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:485:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:485:1: ( ( rule__Module__NameAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:486:1: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:487:1: ( rule__Module__NameAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:487:2: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl982);
            rule__Module__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:497:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:501:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:502:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21012);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21015);
            rule__Module__Group__3();

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
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:509:1: rule__Module__Group__2__Impl : ( ( rule__Module__ImportsAssignment_2 )* ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:513:1: ( ( ( rule__Module__ImportsAssignment_2 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:514:1: ( ( rule__Module__ImportsAssignment_2 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:514:1: ( ( rule__Module__ImportsAssignment_2 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:515:1: ( rule__Module__ImportsAssignment_2 )*
            {
             before(grammarAccess.getModuleAccess().getImportsAssignment_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:516:1: ( rule__Module__ImportsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:516:2: rule__Module__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Module__ImportsAssignment_2_in_rule__Module__Group__2__Impl1042);
            	    rule__Module__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getImportsAssignment_2()); 

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
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:526:1: rule__Module__Group__3 : rule__Module__Group__3__Impl ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:530:1: ( rule__Module__Group__3__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:531:2: rule__Module__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31073);
            rule__Module__Group__3__Impl();

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
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:537:1: rule__Module__Group__3__Impl : ( ( rule__Module__StatementsAssignment_3 )* ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:541:1: ( ( ( rule__Module__StatementsAssignment_3 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:542:1: ( ( rule__Module__StatementsAssignment_3 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:542:1: ( ( rule__Module__StatementsAssignment_3 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:543:1: ( rule__Module__StatementsAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getStatementsAssignment_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:544:1: ( rule__Module__StatementsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_NUMBER)||LA6_0==14||LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:544:2: rule__Module__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Module__StatementsAssignment_3_in_rule__Module__Group__3__Impl1100);
            	    rule__Module__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getStatementsAssignment_3()); 

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
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:562:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:566:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:567:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01139);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01142);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:574:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:578:1: ( ( 'import' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:579:1: ( 'import' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:579:1: ( 'import' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:580:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Import__Group__0__Impl1170); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:593:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:597:1: ( rule__Import__Group__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:598:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11201);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:604:1: rule__Import__Group__1__Impl : ( ( rule__Import__ModuleAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:608:1: ( ( ( rule__Import__ModuleAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:609:1: ( ( rule__Import__ModuleAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:609:1: ( ( rule__Import__ModuleAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:610:1: ( rule__Import__ModuleAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getModuleAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:611:1: ( rule__Import__ModuleAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:611:2: rule__Import__ModuleAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ModuleAssignment_1_in_rule__Import__Group__1__Impl1228);
            rule__Import__ModuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getModuleAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:625:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:629:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:630:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__01262);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__01265);
            rule__Definition__Group__1();

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
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:637:1: rule__Definition__Group__0__Impl : ( 'def' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:641:1: ( ( 'def' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:642:1: ( 'def' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:642:1: ( 'def' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:643:1: 'def'
            {
             before(grammarAccess.getDefinitionAccess().getDefKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Definition__Group__0__Impl1293); 
             after(grammarAccess.getDefinitionAccess().getDefKeyword_0()); 

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
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:656:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:660:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:661:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__11324);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__11327);
            rule__Definition__Group__2();

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
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:668:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__NameAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:672:1: ( ( ( rule__Definition__NameAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:673:1: ( ( rule__Definition__NameAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:673:1: ( ( rule__Definition__NameAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:674:1: ( rule__Definition__NameAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:675:1: ( rule__Definition__NameAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:675:2: rule__Definition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__NameAssignment_1_in_rule__Definition__Group__1__Impl1354);
            rule__Definition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:685:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:689:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:690:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__21384);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__21387);
            rule__Definition__Group__3();

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
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:697:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__Group_2__0 )? ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:701:1: ( ( ( rule__Definition__Group_2__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:702:1: ( ( rule__Definition__Group_2__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:702:1: ( ( rule__Definition__Group_2__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:703:1: ( rule__Definition__Group_2__0 )?
            {
             before(grammarAccess.getDefinitionAccess().getGroup_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:704:1: ( rule__Definition__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:704:2: rule__Definition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Definition__Group_2__0_in_rule__Definition__Group__2__Impl1414);
                    rule__Definition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:714:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:718:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:719:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__31445);
            rule__Definition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__31448);
            rule__Definition__Group__4();

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
    // $ANTLR end "rule__Definition__Group__3"


    // $ANTLR start "rule__Definition__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:726:1: rule__Definition__Group__3__Impl : ( ':' ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:730:1: ( ( ':' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:731:1: ( ':' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:731:1: ( ':' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:732:1: ':'
            {
             before(grammarAccess.getDefinitionAccess().getColonKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Definition__Group__3__Impl1476); 
             after(grammarAccess.getDefinitionAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Definition__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:745:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl rule__Definition__Group__5 ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:749:1: ( rule__Definition__Group__4__Impl rule__Definition__Group__5 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:750:2: rule__Definition__Group__4__Impl rule__Definition__Group__5
            {
            pushFollow(FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__41507);
            rule__Definition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__41510);
            rule__Definition__Group__5();

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
    // $ANTLR end "rule__Definition__Group__4"


    // $ANTLR start "rule__Definition__Group__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:757:1: rule__Definition__Group__4__Impl : ( ( rule__Definition__ExprAssignment_4 ) ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:761:1: ( ( ( rule__Definition__ExprAssignment_4 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:762:1: ( ( rule__Definition__ExprAssignment_4 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:762:1: ( ( rule__Definition__ExprAssignment_4 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:763:1: ( rule__Definition__ExprAssignment_4 )
            {
             before(grammarAccess.getDefinitionAccess().getExprAssignment_4()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:764:1: ( rule__Definition__ExprAssignment_4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:764:2: rule__Definition__ExprAssignment_4
            {
            pushFollow(FOLLOW_rule__Definition__ExprAssignment_4_in_rule__Definition__Group__4__Impl1537);
            rule__Definition__ExprAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getExprAssignment_4()); 

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
    // $ANTLR end "rule__Definition__Group__4__Impl"


    // $ANTLR start "rule__Definition__Group__5"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:774:1: rule__Definition__Group__5 : rule__Definition__Group__5__Impl ;
    public final void rule__Definition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:778:1: ( rule__Definition__Group__5__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:779:2: rule__Definition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__51567);
            rule__Definition__Group__5__Impl();

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
    // $ANTLR end "rule__Definition__Group__5"


    // $ANTLR start "rule__Definition__Group__5__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:785:1: rule__Definition__Group__5__Impl : ( ';' ) ;
    public final void rule__Definition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:789:1: ( ( ';' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:790:1: ( ';' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:790:1: ( ';' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:791:1: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Definition__Group__5__Impl1595); 
             after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Definition__Group__5__Impl"


    // $ANTLR start "rule__Definition__Group_2__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:816:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:820:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:821:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
            {
            pushFollow(FOLLOW_rule__Definition__Group_2__0__Impl_in_rule__Definition__Group_2__01638);
            rule__Definition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_2__1_in_rule__Definition__Group_2__01641);
            rule__Definition__Group_2__1();

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
    // $ANTLR end "rule__Definition__Group_2__0"


    // $ANTLR start "rule__Definition__Group_2__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:828:1: rule__Definition__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:832:1: ( ( '(' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:833:1: ( '(' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:833:1: ( '(' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:834:1: '('
            {
             before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Definition__Group_2__0__Impl1669); 
             after(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Definition__Group_2__0__Impl"


    // $ANTLR start "rule__Definition__Group_2__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:847:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:851:1: ( rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:852:2: rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2
            {
            pushFollow(FOLLOW_rule__Definition__Group_2__1__Impl_in_rule__Definition__Group_2__11700);
            rule__Definition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_2__2_in_rule__Definition__Group_2__11703);
            rule__Definition__Group_2__2();

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
    // $ANTLR end "rule__Definition__Group_2__1"


    // $ANTLR start "rule__Definition__Group_2__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:859:1: rule__Definition__Group_2__1__Impl : ( ( rule__Definition__ArgsAssignment_2_1 ) ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:863:1: ( ( ( rule__Definition__ArgsAssignment_2_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:864:1: ( ( rule__Definition__ArgsAssignment_2_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:864:1: ( ( rule__Definition__ArgsAssignment_2_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:865:1: ( rule__Definition__ArgsAssignment_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getArgsAssignment_2_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:866:1: ( rule__Definition__ArgsAssignment_2_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:866:2: rule__Definition__ArgsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Definition__ArgsAssignment_2_1_in_rule__Definition__Group_2__1__Impl1730);
            rule__Definition__ArgsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getArgsAssignment_2_1()); 

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
    // $ANTLR end "rule__Definition__Group_2__1__Impl"


    // $ANTLR start "rule__Definition__Group_2__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:876:1: rule__Definition__Group_2__2 : rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 ;
    public final void rule__Definition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:880:1: ( rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:881:2: rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3
            {
            pushFollow(FOLLOW_rule__Definition__Group_2__2__Impl_in_rule__Definition__Group_2__21760);
            rule__Definition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_2__3_in_rule__Definition__Group_2__21763);
            rule__Definition__Group_2__3();

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
    // $ANTLR end "rule__Definition__Group_2__2"


    // $ANTLR start "rule__Definition__Group_2__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:888:1: rule__Definition__Group_2__2__Impl : ( ( rule__Definition__Group_2_2__0 )* ) ;
    public final void rule__Definition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:892:1: ( ( ( rule__Definition__Group_2_2__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:893:1: ( ( rule__Definition__Group_2_2__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:893:1: ( ( rule__Definition__Group_2_2__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:894:1: ( rule__Definition__Group_2_2__0 )*
            {
             before(grammarAccess.getDefinitionAccess().getGroup_2_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:895:1: ( rule__Definition__Group_2_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:895:2: rule__Definition__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Definition__Group_2_2__0_in_rule__Definition__Group_2__2__Impl1790);
            	    rule__Definition__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDefinitionAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__Definition__Group_2__2__Impl"


    // $ANTLR start "rule__Definition__Group_2__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:905:1: rule__Definition__Group_2__3 : rule__Definition__Group_2__3__Impl ;
    public final void rule__Definition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:909:1: ( rule__Definition__Group_2__3__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:910:2: rule__Definition__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group_2__3__Impl_in_rule__Definition__Group_2__31821);
            rule__Definition__Group_2__3__Impl();

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
    // $ANTLR end "rule__Definition__Group_2__3"


    // $ANTLR start "rule__Definition__Group_2__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:916:1: rule__Definition__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Definition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:920:1: ( ( ')' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:921:1: ( ')' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:921:1: ( ')' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:922:1: ')'
            {
             before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_2_3()); 
            match(input,18,FOLLOW_18_in_rule__Definition__Group_2__3__Impl1849); 
             after(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_2_3()); 

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
    // $ANTLR end "rule__Definition__Group_2__3__Impl"


    // $ANTLR start "rule__Definition__Group_2_2__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:943:1: rule__Definition__Group_2_2__0 : rule__Definition__Group_2_2__0__Impl rule__Definition__Group_2_2__1 ;
    public final void rule__Definition__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:947:1: ( rule__Definition__Group_2_2__0__Impl rule__Definition__Group_2_2__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:948:2: rule__Definition__Group_2_2__0__Impl rule__Definition__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Definition__Group_2_2__0__Impl_in_rule__Definition__Group_2_2__01888);
            rule__Definition__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_2_2__1_in_rule__Definition__Group_2_2__01891);
            rule__Definition__Group_2_2__1();

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
    // $ANTLR end "rule__Definition__Group_2_2__0"


    // $ANTLR start "rule__Definition__Group_2_2__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:955:1: rule__Definition__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:959:1: ( ( ',' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:960:1: ( ',' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:960:1: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:961:1: ','
            {
             before(grammarAccess.getDefinitionAccess().getCommaKeyword_2_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Definition__Group_2_2__0__Impl1919); 
             after(grammarAccess.getDefinitionAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Definition__Group_2_2__0__Impl"


    // $ANTLR start "rule__Definition__Group_2_2__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:974:1: rule__Definition__Group_2_2__1 : rule__Definition__Group_2_2__1__Impl ;
    public final void rule__Definition__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:978:1: ( rule__Definition__Group_2_2__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:979:2: rule__Definition__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group_2_2__1__Impl_in_rule__Definition__Group_2_2__11950);
            rule__Definition__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Definition__Group_2_2__1"


    // $ANTLR start "rule__Definition__Group_2_2__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:985:1: rule__Definition__Group_2_2__1__Impl : ( ( rule__Definition__ArgsAssignment_2_2_1 ) ) ;
    public final void rule__Definition__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:989:1: ( ( ( rule__Definition__ArgsAssignment_2_2_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:990:1: ( ( rule__Definition__ArgsAssignment_2_2_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:990:1: ( ( rule__Definition__ArgsAssignment_2_2_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:991:1: ( rule__Definition__ArgsAssignment_2_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getArgsAssignment_2_2_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:992:1: ( rule__Definition__ArgsAssignment_2_2_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:992:2: rule__Definition__ArgsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Definition__ArgsAssignment_2_2_1_in_rule__Definition__Group_2_2__1__Impl1977);
            rule__Definition__ArgsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getArgsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Definition__Group_2_2__1__Impl"


    // $ANTLR start "rule__Evaluation__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1006:1: rule__Evaluation__Group__0 : rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 ;
    public final void rule__Evaluation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1010:1: ( rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1011:2: rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__0__Impl_in_rule__Evaluation__Group__02011);
            rule__Evaluation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Evaluation__Group__1_in_rule__Evaluation__Group__02014);
            rule__Evaluation__Group__1();

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
    // $ANTLR end "rule__Evaluation__Group__0"


    // $ANTLR start "rule__Evaluation__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1018:1: rule__Evaluation__Group__0__Impl : ( ( rule__Evaluation__ExpressionAssignment_0 ) ) ;
    public final void rule__Evaluation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1022:1: ( ( ( rule__Evaluation__ExpressionAssignment_0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1023:1: ( ( rule__Evaluation__ExpressionAssignment_0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1023:1: ( ( rule__Evaluation__ExpressionAssignment_0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1024:1: ( rule__Evaluation__ExpressionAssignment_0 )
            {
             before(grammarAccess.getEvaluationAccess().getExpressionAssignment_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1025:1: ( rule__Evaluation__ExpressionAssignment_0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1025:2: rule__Evaluation__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_rule__Evaluation__ExpressionAssignment_0_in_rule__Evaluation__Group__0__Impl2041);
            rule__Evaluation__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getExpressionAssignment_0()); 

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
    // $ANTLR end "rule__Evaluation__Group__0__Impl"


    // $ANTLR start "rule__Evaluation__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1035:1: rule__Evaluation__Group__1 : rule__Evaluation__Group__1__Impl ;
    public final void rule__Evaluation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1039:1: ( rule__Evaluation__Group__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1040:2: rule__Evaluation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__1__Impl_in_rule__Evaluation__Group__12071);
            rule__Evaluation__Group__1__Impl();

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
    // $ANTLR end "rule__Evaluation__Group__1"


    // $ANTLR start "rule__Evaluation__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1046:1: rule__Evaluation__Group__1__Impl : ( ';' ) ;
    public final void rule__Evaluation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1050:1: ( ( ';' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1051:1: ( ';' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1051:1: ( ';' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1052:1: ';'
            {
             before(grammarAccess.getEvaluationAccess().getSemicolonKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Evaluation__Group__1__Impl2099); 
             after(grammarAccess.getEvaluationAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Evaluation__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1069:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1073:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1074:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__02134);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__02137);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1081:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1085:1: ( ( ruleMultiplication ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1086:1: ( ruleMultiplication )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1086:1: ( ruleMultiplication )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1087:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl2164);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1098:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1102:1: ( rule__Addition__Group__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1103:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__12193);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1109:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1113:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1114:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1114:1: ( ( rule__Addition__Group_1__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1115:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1116:1: ( rule__Addition__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=20 && LA9_0<=21)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1116:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl2220);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1130:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1134:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1135:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__02255);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__02258);
            rule__Addition__Group_1__1();

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1142:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1146:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1147:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1147:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1148:1: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1149:1: ( rule__Addition__Alternatives_1_0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1149:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl2285);
            rule__Addition__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1159:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1163:1: ( rule__Addition__Group_1__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1164:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__12315);
            rule__Addition__Group_1__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1170:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1174:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1175:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1175:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1176:1: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1177:1: ( rule__Addition__RightAssignment_1_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1177:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl2342);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1191:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1195:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1196:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__02376);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__02379);
            rule__Addition__Group_1_0_0__1();

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
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1203:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1207:1: ( ( () ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1208:1: ( () )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1208:1: ( () )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1209:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1210:1: ()
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1212:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1222:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1226:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1227:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__12437);
            rule__Addition__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1233:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1237:1: ( ( '+' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1238:1: ( '+' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1238:1: ( '+' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1239:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,20,FOLLOW_20_in_rule__Addition__Group_1_0_0__1__Impl2465); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1256:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1260:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1261:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__02500);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__02503);
            rule__Addition__Group_1_0_1__1();

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
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1268:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1272:1: ( ( () ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1273:1: ( () )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1273:1: ( () )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1274:1: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1275:1: ()
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1277:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1287:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1291:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1292:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__12561);
            rule__Addition__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1298:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1302:1: ( ( '-' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1303:1: ( '-' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1303:1: ( '-' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1304:1: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,21,FOLLOW_21_in_rule__Addition__Group_1_0_1__1__Impl2589); 
             after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1321:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1325:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1326:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__02624);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__02627);
            rule__Multiplication__Group__1();

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1333:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1337:1: ( ( rulePrimaryExpression ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1338:1: ( rulePrimaryExpression )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1338:1: ( rulePrimaryExpression )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1339:1: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl2654);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1350:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1354:1: ( rule__Multiplication__Group__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1355:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__12683);
            rule__Multiplication__Group__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1361:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1365:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1366:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1366:1: ( ( rule__Multiplication__Group_1__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1367:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1368:1: ( rule__Multiplication__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=22 && LA10_0<=23)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1368:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl2710);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1382:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1386:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1387:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__02745);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__02748);
            rule__Multiplication__Group_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1394:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1398:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1399:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1399:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1400:1: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1401:1: ( rule__Multiplication__Alternatives_1_0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1401:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl2775);
            rule__Multiplication__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1411:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1415:1: ( rule__Multiplication__Group_1__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1416:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__12805);
            rule__Multiplication__Group_1__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1422:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1426:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1427:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1427:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1428:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1429:1: ( rule__Multiplication__RightAssignment_1_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1429:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl2832);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1443:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1447:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1448:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__02866);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__02869);
            rule__Multiplication__Group_1_0_0__1();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1455:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1459:1: ( ( () ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1460:1: ( () )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1460:1: ( () )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1461:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1462:1: ()
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1464:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1474:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1478:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1479:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__12927);
            rule__Multiplication__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1485:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1489:1: ( ( '*' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1490:1: ( '*' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1490:1: ( '*' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1491:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,22,FOLLOW_22_in_rule__Multiplication__Group_1_0_0__1__Impl2955); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1508:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1512:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1513:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__02990);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__02993);
            rule__Multiplication__Group_1_0_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1520:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1524:1: ( ( () ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1525:1: ( () )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1525:1: ( () )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1526:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1527:1: ()
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1529:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1539:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1543:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1544:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__13051);
            rule__Multiplication__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1550:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1554:1: ( ( '/' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1555:1: ( '/' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1555:1: ( '/' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1556:1: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,23,FOLLOW_23_in_rule__Multiplication__Group_1_0_1__1__Impl3079); 
             after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1573:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1577:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1578:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__03114);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__03117);
            rule__PrimaryExpression__Group_0__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1585:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1589:1: ( ( '(' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1590:1: ( '(' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1590:1: ( '(' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1591:1: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,17,FOLLOW_17_in_rule__PrimaryExpression__Group_0__0__Impl3145); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1604:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1608:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1609:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__13176);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__13179);
            rule__PrimaryExpression__Group_0__2();

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1616:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1620:1: ( ( ruleExpression ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1621:1: ( ruleExpression )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1621:1: ( ruleExpression )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1622:1: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl3206);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1633:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1637:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1638:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__23235);
            rule__PrimaryExpression__Group_0__2__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1644:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1648:1: ( ( ')' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1649:1: ( ')' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1649:1: ( ')' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1650:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,18,FOLLOW_18_in_rule__PrimaryExpression__Group_0__2__Impl3263); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1669:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1673:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1674:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__03300);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__03303);
            rule__PrimaryExpression__Group_1__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1681:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1685:1: ( ( () ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1686:1: ( () )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1686:1: ( () )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1687:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1688:1: ()
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1690:1: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1700:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1704:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1705:2: rule__PrimaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__13361);
            rule__PrimaryExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1711:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1715:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1716:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1716:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1717:1: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1718:1: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1718:2: rule__PrimaryExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl3388);
            rule__PrimaryExpression__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1732:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1736:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1737:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__03422);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__03425);
            rule__PrimaryExpression__Group_2__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1744:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1748:1: ( ( () ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1749:1: ( () )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1749:1: ( () )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1750:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFunctionCallAction_2_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1751:1: ()
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1753:1: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getFunctionCallAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1763:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1767:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1768:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__13483);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__2_in_rule__PrimaryExpression__Group_2__13486);
            rule__PrimaryExpression__Group_2__2();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1775:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__FuncAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1779:1: ( ( ( rule__PrimaryExpression__FuncAssignment_2_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1780:1: ( ( rule__PrimaryExpression__FuncAssignment_2_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1780:1: ( ( rule__PrimaryExpression__FuncAssignment_2_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1781:1: ( rule__PrimaryExpression__FuncAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFuncAssignment_2_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1782:1: ( rule__PrimaryExpression__FuncAssignment_2_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1782:2: rule__PrimaryExpression__FuncAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__FuncAssignment_2_1_in_rule__PrimaryExpression__Group_2__1__Impl3513);
            rule__PrimaryExpression__FuncAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getFuncAssignment_2_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1792:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1796:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1797:2: rule__PrimaryExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__2__Impl_in_rule__PrimaryExpression__Group_2__23543);
            rule__PrimaryExpression__Group_2__2__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1803:1: rule__PrimaryExpression__Group_2__2__Impl : ( ( rule__PrimaryExpression__Group_2_2__0 )? ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1807:1: ( ( ( rule__PrimaryExpression__Group_2_2__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1808:1: ( ( rule__PrimaryExpression__Group_2_2__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1808:1: ( ( rule__PrimaryExpression__Group_2_2__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1809:1: ( rule__PrimaryExpression__Group_2_2__0 )?
            {
             before(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1810:1: ( rule__PrimaryExpression__Group_2_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1810:2: rule__PrimaryExpression__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__0_in_rule__PrimaryExpression__Group_2__2__Impl3570);
                    rule__PrimaryExpression__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1826:1: rule__PrimaryExpression__Group_2_2__0 : rule__PrimaryExpression__Group_2_2__0__Impl rule__PrimaryExpression__Group_2_2__1 ;
    public final void rule__PrimaryExpression__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1830:1: ( rule__PrimaryExpression__Group_2_2__0__Impl rule__PrimaryExpression__Group_2_2__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1831:2: rule__PrimaryExpression__Group_2_2__0__Impl rule__PrimaryExpression__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__0__Impl_in_rule__PrimaryExpression__Group_2_2__03607);
            rule__PrimaryExpression__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__1_in_rule__PrimaryExpression__Group_2_2__03610);
            rule__PrimaryExpression__Group_2_2__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1838:1: rule__PrimaryExpression__Group_2_2__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1842:1: ( ( '(' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1843:1: ( '(' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1843:1: ( '(' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1844:1: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_2_0()); 
            match(input,17,FOLLOW_17_in_rule__PrimaryExpression__Group_2_2__0__Impl3638); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_2_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1857:1: rule__PrimaryExpression__Group_2_2__1 : rule__PrimaryExpression__Group_2_2__1__Impl rule__PrimaryExpression__Group_2_2__2 ;
    public final void rule__PrimaryExpression__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1861:1: ( rule__PrimaryExpression__Group_2_2__1__Impl rule__PrimaryExpression__Group_2_2__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1862:2: rule__PrimaryExpression__Group_2_2__1__Impl rule__PrimaryExpression__Group_2_2__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__1__Impl_in_rule__PrimaryExpression__Group_2_2__13669);
            rule__PrimaryExpression__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__2_in_rule__PrimaryExpression__Group_2_2__13672);
            rule__PrimaryExpression__Group_2_2__2();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1869:1: rule__PrimaryExpression__Group_2_2__1__Impl : ( ( rule__PrimaryExpression__ArgsAssignment_2_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1873:1: ( ( ( rule__PrimaryExpression__ArgsAssignment_2_2_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1874:1: ( ( rule__PrimaryExpression__ArgsAssignment_2_2_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1874:1: ( ( rule__PrimaryExpression__ArgsAssignment_2_2_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1875:1: ( rule__PrimaryExpression__ArgsAssignment_2_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1876:1: ( rule__PrimaryExpression__ArgsAssignment_2_2_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1876:2: rule__PrimaryExpression__ArgsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ArgsAssignment_2_2_1_in_rule__PrimaryExpression__Group_2_2__1__Impl3699);
            rule__PrimaryExpression__ArgsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1886:1: rule__PrimaryExpression__Group_2_2__2 : rule__PrimaryExpression__Group_2_2__2__Impl rule__PrimaryExpression__Group_2_2__3 ;
    public final void rule__PrimaryExpression__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1890:1: ( rule__PrimaryExpression__Group_2_2__2__Impl rule__PrimaryExpression__Group_2_2__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1891:2: rule__PrimaryExpression__Group_2_2__2__Impl rule__PrimaryExpression__Group_2_2__3
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__2__Impl_in_rule__PrimaryExpression__Group_2_2__23729);
            rule__PrimaryExpression__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__3_in_rule__PrimaryExpression__Group_2_2__23732);
            rule__PrimaryExpression__Group_2_2__3();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1898:1: rule__PrimaryExpression__Group_2_2__2__Impl : ( ( rule__PrimaryExpression__Group_2_2_2__0 )* ) ;
    public final void rule__PrimaryExpression__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1902:1: ( ( ( rule__PrimaryExpression__Group_2_2_2__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1903:1: ( ( rule__PrimaryExpression__Group_2_2_2__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1903:1: ( ( rule__PrimaryExpression__Group_2_2_2__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1904:1: ( rule__PrimaryExpression__Group_2_2_2__0 )*
            {
             before(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1905:1: ( rule__PrimaryExpression__Group_2_2_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1905:2: rule__PrimaryExpression__Group_2_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2_2__0_in_rule__PrimaryExpression__Group_2_2__2__Impl3759);
            	    rule__PrimaryExpression__Group_2_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1915:1: rule__PrimaryExpression__Group_2_2__3 : rule__PrimaryExpression__Group_2_2__3__Impl ;
    public final void rule__PrimaryExpression__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1919:1: ( rule__PrimaryExpression__Group_2_2__3__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1920:2: rule__PrimaryExpression__Group_2_2__3__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__3__Impl_in_rule__PrimaryExpression__Group_2_2__33790);
            rule__PrimaryExpression__Group_2_2__3__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__3"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1926:1: rule__PrimaryExpression__Group_2_2__3__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1930:1: ( ( ')' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1931:1: ( ')' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1931:1: ( ')' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1932:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2_3()); 
            match(input,18,FOLLOW_18_in_rule__PrimaryExpression__Group_2_2__3__Impl3818); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2_3()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2_2__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1953:1: rule__PrimaryExpression__Group_2_2_2__0 : rule__PrimaryExpression__Group_2_2_2__0__Impl rule__PrimaryExpression__Group_2_2_2__1 ;
    public final void rule__PrimaryExpression__Group_2_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1957:1: ( rule__PrimaryExpression__Group_2_2_2__0__Impl rule__PrimaryExpression__Group_2_2_2__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1958:2: rule__PrimaryExpression__Group_2_2_2__0__Impl rule__PrimaryExpression__Group_2_2_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2_2__0__Impl_in_rule__PrimaryExpression__Group_2_2_2__03857);
            rule__PrimaryExpression__Group_2_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2_2__1_in_rule__PrimaryExpression__Group_2_2_2__03860);
            rule__PrimaryExpression__Group_2_2_2__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2_2__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1965:1: rule__PrimaryExpression__Group_2_2_2__0__Impl : ( ',' ) ;
    public final void rule__PrimaryExpression__Group_2_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1969:1: ( ( ',' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1970:1: ( ',' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1970:1: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1971:1: ','
            {
             before(grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_2_2_0()); 
            match(input,19,FOLLOW_19_in_rule__PrimaryExpression__Group_2_2_2__0__Impl3888); 
             after(grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_2_2_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2_2__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1984:1: rule__PrimaryExpression__Group_2_2_2__1 : rule__PrimaryExpression__Group_2_2_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1988:1: ( rule__PrimaryExpression__Group_2_2_2__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1989:2: rule__PrimaryExpression__Group_2_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2_2__1__Impl_in_rule__PrimaryExpression__Group_2_2_2__13919);
            rule__PrimaryExpression__Group_2_2_2__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2_2__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1995:1: rule__PrimaryExpression__Group_2_2_2__1__Impl : ( ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:1999:1: ( ( ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2000:1: ( ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2000:1: ( ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2001:1: ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_2_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2002:1: ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2002:2: rule__PrimaryExpression__ArgsAssignment_2_2_2_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ArgsAssignment_2_2_2_1_in_rule__PrimaryExpression__Group_2_2_2__1__Impl3946);
            rule__PrimaryExpression__ArgsAssignment_2_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_2_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2_2__1__Impl"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2017:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2021:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2022:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2022:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2023:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__NameAssignment_13985); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Module__NameAssignment_1"


    // $ANTLR start "rule__Module__ImportsAssignment_2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2032:1: rule__Module__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Module__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2036:1: ( ( ruleImport ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2037:1: ( ruleImport )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2037:1: ( ruleImport )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2038:1: ruleImport
            {
             before(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Module__ImportsAssignment_24016);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Module__ImportsAssignment_2"


    // $ANTLR start "rule__Module__StatementsAssignment_3"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2047:1: rule__Module__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Module__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2051:1: ( ( ruleStatement ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2052:1: ( ruleStatement )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2052:1: ( ruleStatement )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2053:1: ruleStatement
            {
             before(grammarAccess.getModuleAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Module__StatementsAssignment_34047);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getStatementsStatementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Module__StatementsAssignment_3"


    // $ANTLR start "rule__Import__ModuleAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2062:1: rule__Import__ModuleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Import__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2066:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2067:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2067:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2068:1: ( RULE_ID )
            {
             before(grammarAccess.getImportAccess().getModuleModuleCrossReference_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2069:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2070:1: RULE_ID
            {
             before(grammarAccess.getImportAccess().getModuleModuleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Import__ModuleAssignment_14082); 
             after(grammarAccess.getImportAccess().getModuleModuleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getImportAccess().getModuleModuleCrossReference_1_0()); 

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
    // $ANTLR end "rule__Import__ModuleAssignment_1"


    // $ANTLR start "rule__Definition__NameAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2081:1: rule__Definition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2085:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2086:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2086:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2087:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_14117); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Definition__NameAssignment_1"


    // $ANTLR start "rule__Definition__ArgsAssignment_2_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2096:1: rule__Definition__ArgsAssignment_2_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Definition__ArgsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2100:1: ( ( ruleDeclaredParameter ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2101:1: ( ruleDeclaredParameter )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2101:1: ( ruleDeclaredParameter )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2102:1: ruleDeclaredParameter
            {
             before(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Definition__ArgsAssignment_2_14148);
            ruleDeclaredParameter();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Definition__ArgsAssignment_2_1"


    // $ANTLR start "rule__Definition__ArgsAssignment_2_2_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2111:1: rule__Definition__ArgsAssignment_2_2_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Definition__ArgsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2115:1: ( ( ruleDeclaredParameter ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2116:1: ( ruleDeclaredParameter )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2116:1: ( ruleDeclaredParameter )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2117:1: ruleDeclaredParameter
            {
             before(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Definition__ArgsAssignment_2_2_14179);
            ruleDeclaredParameter();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__Definition__ArgsAssignment_2_2_1"


    // $ANTLR start "rule__Definition__ExprAssignment_4"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2126:1: rule__Definition__ExprAssignment_4 : ( ruleExpression ) ;
    public final void rule__Definition__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2130:1: ( ( ruleExpression ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2131:1: ( ruleExpression )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2131:1: ( ruleExpression )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2132:1: ruleExpression
            {
             before(grammarAccess.getDefinitionAccess().getExprExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Definition__ExprAssignment_44210);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getExprExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Definition__ExprAssignment_4"


    // $ANTLR start "rule__DeclaredParameter__NameAssignment"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2141:1: rule__DeclaredParameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__DeclaredParameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2145:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2146:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2146:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2147:1: RULE_ID
            {
             before(grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeclaredParameter__NameAssignment4241); 
             after(grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DeclaredParameter__NameAssignment"


    // $ANTLR start "rule__Evaluation__ExpressionAssignment_0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2156:1: rule__Evaluation__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__Evaluation__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2160:1: ( ( ruleExpression ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2161:1: ( ruleExpression )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2161:1: ( ruleExpression )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2162:1: ruleExpression
            {
             before(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Evaluation__ExpressionAssignment_04272);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Evaluation__ExpressionAssignment_0"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2171:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2175:1: ( ( ruleMultiplication ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2176:1: ( ruleMultiplication )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2176:1: ( ruleMultiplication )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2177:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_14303);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2186:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2190:1: ( ( rulePrimaryExpression ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2191:1: ( rulePrimaryExpression )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2191:1: ( rulePrimaryExpression )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2192:1: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_14334);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_1_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2201:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2205:1: ( ( RULE_NUMBER ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2206:1: ( RULE_NUMBER )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2206:1: ( RULE_NUMBER )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2207:1: RULE_NUMBER
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__PrimaryExpression__ValueAssignment_1_14365); 
             after(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__FuncAssignment_2_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2216:1: rule__PrimaryExpression__FuncAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__FuncAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2220:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2221:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2221:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2222:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFuncAbstractDefinitionCrossReference_2_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2223:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2224:1: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFuncAbstractDefinitionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimaryExpression__FuncAssignment_2_14400); 
             after(grammarAccess.getPrimaryExpressionAccess().getFuncAbstractDefinitionIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getPrimaryExpressionAccess().getFuncAbstractDefinitionCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__FuncAssignment_2_1"


    // $ANTLR start "rule__PrimaryExpression__ArgsAssignment_2_2_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2235:1: rule__PrimaryExpression__ArgsAssignment_2_2_1 : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__ArgsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2239:1: ( ( ruleExpression ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2240:1: ( ruleExpression )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2240:1: ( ruleExpression )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2241:1: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgsExpressionParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__PrimaryExpression__ArgsAssignment_2_2_14435);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getArgsExpressionParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__ArgsAssignment_2_2_1"


    // $ANTLR start "rule__PrimaryExpression__ArgsAssignment_2_2_2_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2250:1: rule__PrimaryExpression__ArgsAssignment_2_2_2_1 : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__ArgsAssignment_2_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2254:1: ( ( ruleExpression ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2255:1: ( ruleExpression )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2255:1: ( ruleExpression )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.arithmetics.web\\src-gen\\org\\eclipse\\xtext\\example\\arithmetics\\web\\contentassist\\antlr\\internal\\InternalArithmetics.g:2256:1: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgsExpressionParserRuleCall_2_2_2_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__PrimaryExpression__ArgsAssignment_2_2_2_14466);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getArgsExpressionParserRuleCall_2_2_2_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__ArgsAssignment_2_2_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_entryRuleDeclaredParameter301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredParameter308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredParameter__NameAssignment_in_ruleDeclaredParameter334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__0_in_ruleEvaluation396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleExpression456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Statement__Alternatives671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_rule__Statement__Alternatives688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_0721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_0739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_0772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_0790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Module__Group__0__Impl921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1952 = new BitSet(new long[]{0x0000000000026030L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21012 = new BitSet(new long[]{0x0000000000026030L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ImportsAssignment_2_in_rule__Module__Group__2__Impl1042 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__StatementsAssignment_3_in_rule__Module__Group__3__Impl1100 = new BitSet(new long[]{0x0000000000024032L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Import__Group__0__Impl1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ModuleAssignment_1_in_rule__Import__Group__1__Impl1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__01262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__01265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Definition__Group__0__Impl1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__11324 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__11327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__NameAssignment_1_in_rule__Definition__Group__1__Impl1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__21384 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__21387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__0_in_rule__Definition__Group__2__Impl1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__31445 = new BitSet(new long[]{0x0000000000024030L});
    public static final BitSet FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__31448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Definition__Group__3__Impl1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__41507 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__41510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ExprAssignment_4_in_rule__Definition__Group__4__Impl1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__51567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Definition__Group__5__Impl1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__0__Impl_in_rule__Definition__Group_2__01638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__1_in_rule__Definition__Group_2__01641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Definition__Group_2__0__Impl1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__1__Impl_in_rule__Definition__Group_2__11700 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__2_in_rule__Definition__Group_2__11703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ArgsAssignment_2_1_in_rule__Definition__Group_2__1__Impl1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__2__Impl_in_rule__Definition__Group_2__21760 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__3_in_rule__Definition__Group_2__21763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2_2__0_in_rule__Definition__Group_2__2__Impl1790 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__3__Impl_in_rule__Definition__Group_2__31821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Definition__Group_2__3__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2_2__0__Impl_in_rule__Definition__Group_2_2__01888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group_2_2__1_in_rule__Definition__Group_2_2__01891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Definition__Group_2_2__0__Impl1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2_2__1__Impl_in_rule__Definition__Group_2_2__11950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ArgsAssignment_2_2_1_in_rule__Definition__Group_2_2__1__Impl1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__0__Impl_in_rule__Evaluation__Group__02011 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__1_in_rule__Evaluation__Group__02014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__ExpressionAssignment_0_in_rule__Evaluation__Group__0__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__1__Impl_in_rule__Evaluation__Group__12071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Evaluation__Group__1__Impl2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__02134 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__02137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__12193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl2220 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__02255 = new BitSet(new long[]{0x0000000000024030L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__02258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__12315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__02376 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__02379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__12437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Addition__Group_1_0_0__1__Impl2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__02500 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__02503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__12561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Addition__Group_1_0_1__1__Impl2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__02624 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__02627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__12683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl2710 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__02745 = new BitSet(new long[]{0x0000000000024030L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__02748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__12805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__02866 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__02869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__12927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Multiplication__Group_1_0_0__1__Impl2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__02990 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__02993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__13051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Multiplication__Group_1_0_1__1__Impl3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__03114 = new BitSet(new long[]{0x0000000000024030L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__03117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PrimaryExpression__Group_0__0__Impl3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__13176 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__13179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__23235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PrimaryExpression__Group_0__2__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__03300 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__03303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__13361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__03422 = new BitSet(new long[]{0x0000000000024030L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__03425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__13483 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__2_in_rule__PrimaryExpression__Group_2__13486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__FuncAssignment_2_1_in_rule__PrimaryExpression__Group_2__1__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__2__Impl_in_rule__PrimaryExpression__Group_2__23543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__0_in_rule__PrimaryExpression__Group_2__2__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__0__Impl_in_rule__PrimaryExpression__Group_2_2__03607 = new BitSet(new long[]{0x0000000000024030L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__1_in_rule__PrimaryExpression__Group_2_2__03610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PrimaryExpression__Group_2_2__0__Impl3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__1__Impl_in_rule__PrimaryExpression__Group_2_2__13669 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__2_in_rule__PrimaryExpression__Group_2_2__13672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ArgsAssignment_2_2_1_in_rule__PrimaryExpression__Group_2_2__1__Impl3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__2__Impl_in_rule__PrimaryExpression__Group_2_2__23729 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__3_in_rule__PrimaryExpression__Group_2_2__23732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2_2__0_in_rule__PrimaryExpression__Group_2_2__2__Impl3759 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__3__Impl_in_rule__PrimaryExpression__Group_2_2__33790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PrimaryExpression__Group_2_2__3__Impl3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2_2__0__Impl_in_rule__PrimaryExpression__Group_2_2_2__03857 = new BitSet(new long[]{0x0000000000024030L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2_2__1_in_rule__PrimaryExpression__Group_2_2_2__03860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PrimaryExpression__Group_2_2_2__0__Impl3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2_2__1__Impl_in_rule__PrimaryExpression__Group_2_2_2__13919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ArgsAssignment_2_2_2_1_in_rule__PrimaryExpression__Group_2_2_2__1__Impl3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_13985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Module__ImportsAssignment_24016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Module__StatementsAssignment_34047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Import__ModuleAssignment_14082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_14117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Definition__ArgsAssignment_2_14148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Definition__ArgsAssignment_2_2_14179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Definition__ExprAssignment_44210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeclaredParameter__NameAssignment4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Evaluation__ExpressionAssignment_04272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_14303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_14334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__PrimaryExpression__ValueAssignment_1_14365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimaryExpression__FuncAssignment_2_14400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrimaryExpression__ArgsAssignment_2_2_14435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrimaryExpression__ArgsAssignment_2_2_2_14466 = new BitSet(new long[]{0x0000000000000002L});

}