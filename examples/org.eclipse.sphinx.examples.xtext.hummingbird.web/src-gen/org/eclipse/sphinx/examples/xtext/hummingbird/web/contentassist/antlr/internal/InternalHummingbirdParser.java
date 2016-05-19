// $ANTLR 3.3 avr. 19, 2016 01:13:22 D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g 2016-05-18 22:01:57

package org.eclipse.sphinx.examples.xtext.hummingbird.web.contentassist.antlr.internal; 

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
import org.eclipse.sphinx.examples.xtext.services.HummingbirdGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalHummingbirdParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'{'", "'components'", "'}'", "'description'", "','", "'Component'", "'type'", "'incomingConnections'", "'outgoingConnections'", "'parameterValues'", "'Connection'", "'sourcePort'", "'targetComponent'", "'ParameterValue'", "'value'", "'Platform'", "'componentTypes'", "'interfaces'", "'ComponentType'", "'providedInterfaces'", "'('", "')'", "'ports'", "'parameters'", "'Interface'", "'providingComponentTypes'", "'requiringPorts'", "'Port'", "'minProviderCount'", "'maxProviderCount'", "'requiredInterface'", "'Parameter'", "'dataType'", "'-'", "'optional'"
    };
    public static final int EOF=-1;
    public static final int T__11=11;
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
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_INT=4;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;

    // delegates
    // delegators


        public InternalHummingbirdParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHummingbirdParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHummingbirdParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g"; }


     
     	private HummingbirdGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(HummingbirdGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleEntryPoint"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:58:1: entryRuleEntryPoint : ruleEntryPoint EOF ;
    public final void entryRuleEntryPoint() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:59:1: ( ruleEntryPoint EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:60:1: ruleEntryPoint EOF
            {
             before(grammarAccess.getEntryPointRule()); 
            pushFollow(FOLLOW_ruleEntryPoint_in_entryRuleEntryPoint61);
            ruleEntryPoint();

            state._fsp--;

             after(grammarAccess.getEntryPointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPoint68); 

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
    // $ANTLR end "entryRuleEntryPoint"


    // $ANTLR start "ruleEntryPoint"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:67:1: ruleEntryPoint : ( ( rule__EntryPoint__Alternatives ) ) ;
    public final void ruleEntryPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:71:2: ( ( ( rule__EntryPoint__Alternatives ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:72:1: ( ( rule__EntryPoint__Alternatives ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:72:1: ( ( rule__EntryPoint__Alternatives ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:73:1: ( rule__EntryPoint__Alternatives )
            {
             before(grammarAccess.getEntryPointAccess().getAlternatives()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:74:1: ( rule__EntryPoint__Alternatives )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:74:2: rule__EntryPoint__Alternatives
            {
            pushFollow(FOLLOW_rule__EntryPoint__Alternatives_in_ruleEntryPoint94);
            rule__EntryPoint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntryPointAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEntryPoint"


    // $ANTLR start "entryRuleApplication"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:86:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:87:1: ( ruleApplication EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:88:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication121);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication128); 

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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:95:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:99:2: ( ( ( rule__Application__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:100:1: ( ( rule__Application__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:100:1: ( ( rule__Application__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:101:1: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:102:1: ( rule__Application__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:102:2: rule__Application__Group__0
            {
            pushFollow(FOLLOW_rule__Application__Group__0_in_ruleApplication154);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleComponent"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:114:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:115:1: ( ruleComponent EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:116:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent181);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent188); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:123:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:127:2: ( ( ( rule__Component__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:128:1: ( ( rule__Component__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:128:1: ( ( rule__Component__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:129:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:130:1: ( rule__Component__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:130:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent214);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConnection"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:142:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:143:1: ( ruleConnection EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:144:1: ruleConnection EOF
            {
             before(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_ruleConnection_in_entryRuleConnection241);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getConnectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnection248); 

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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:151:1: ruleConnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:155:2: ( ( ( rule__Connection__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:156:1: ( ( rule__Connection__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:156:1: ( ( rule__Connection__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:157:1: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:158:1: ( rule__Connection__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:158:2: rule__Connection__Group__0
            {
            pushFollow(FOLLOW_rule__Connection__Group__0_in_ruleConnection274);
            rule__Connection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getGroup()); 

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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleParameterValue"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:170:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:171:1: ( ruleParameterValue EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:172:1: ruleParameterValue EOF
            {
             before(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_ruleParameterValue_in_entryRuleParameterValue301);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterValue308); 

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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:179:1: ruleParameterValue : ( ( rule__ParameterValue__Group__0 ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:183:2: ( ( ( rule__ParameterValue__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:184:1: ( ( rule__ParameterValue__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:184:1: ( ( rule__ParameterValue__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:185:1: ( rule__ParameterValue__Group__0 )
            {
             before(grammarAccess.getParameterValueAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:186:1: ( rule__ParameterValue__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:186:2: rule__ParameterValue__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterValue__Group__0_in_ruleParameterValue334);
            rule__ParameterValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getGroup()); 

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
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRulePlatform"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:198:1: entryRulePlatform : rulePlatform EOF ;
    public final void entryRulePlatform() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:199:1: ( rulePlatform EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:200:1: rulePlatform EOF
            {
             before(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_rulePlatform_in_entryRulePlatform361);
            rulePlatform();

            state._fsp--;

             after(grammarAccess.getPlatformRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatform368); 

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
    // $ANTLR end "entryRulePlatform"


    // $ANTLR start "rulePlatform"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:207:1: rulePlatform : ( ( rule__Platform__Group__0 ) ) ;
    public final void rulePlatform() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:211:2: ( ( ( rule__Platform__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:212:1: ( ( rule__Platform__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:212:1: ( ( rule__Platform__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:213:1: ( rule__Platform__Group__0 )
            {
             before(grammarAccess.getPlatformAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:214:1: ( rule__Platform__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:214:2: rule__Platform__Group__0
            {
            pushFollow(FOLLOW_rule__Platform__Group__0_in_rulePlatform394);
            rule__Platform__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getGroup()); 

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
    // $ANTLR end "rulePlatform"


    // $ANTLR start "entryRuleComponentType"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:226:1: entryRuleComponentType : ruleComponentType EOF ;
    public final void entryRuleComponentType() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:227:1: ( ruleComponentType EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:228:1: ruleComponentType EOF
            {
             before(grammarAccess.getComponentTypeRule()); 
            pushFollow(FOLLOW_ruleComponentType_in_entryRuleComponentType421);
            ruleComponentType();

            state._fsp--;

             after(grammarAccess.getComponentTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentType428); 

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
    // $ANTLR end "entryRuleComponentType"


    // $ANTLR start "ruleComponentType"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:235:1: ruleComponentType : ( ( rule__ComponentType__Group__0 ) ) ;
    public final void ruleComponentType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:239:2: ( ( ( rule__ComponentType__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:240:1: ( ( rule__ComponentType__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:240:1: ( ( rule__ComponentType__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:241:1: ( rule__ComponentType__Group__0 )
            {
             before(grammarAccess.getComponentTypeAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:242:1: ( rule__ComponentType__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:242:2: rule__ComponentType__Group__0
            {
            pushFollow(FOLLOW_rule__ComponentType__Group__0_in_ruleComponentType454);
            rule__ComponentType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentType"


    // $ANTLR start "entryRuleInterface"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:254:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:255:1: ( ruleInterface EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:256:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface481);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface488); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:263:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:267:2: ( ( ( rule__Interface__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:268:1: ( ( rule__Interface__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:268:1: ( ( rule__Interface__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:269:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:270:1: ( rule__Interface__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:270:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_rule__Interface__Group__0_in_ruleInterface514);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRulePort"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:282:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:283:1: ( rulePort EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:284:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort541);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort548); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:291:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:295:2: ( ( ( rule__Port__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:296:1: ( ( rule__Port__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:296:1: ( ( rule__Port__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:297:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:298:1: ( rule__Port__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:298:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort574);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleParameter"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:310:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:311:1: ( ruleParameter EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:312:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter601);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter608); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:319:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:323:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:324:1: ( ( rule__Parameter__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:324:1: ( ( rule__Parameter__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:325:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:326:1: ( rule__Parameter__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:326:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter634);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleInteger"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:338:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:339:1: ( ruleInteger EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:340:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger661);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger668); 

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:347:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:351:2: ( ( ( rule__Integer__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:352:1: ( ( rule__Integer__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:352:1: ( ( rule__Integer__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:353:1: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:354:1: ( rule__Integer__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:354:2: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_rule__Integer__Group__0_in_ruleInteger694);
            rule__Integer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getGroup()); 

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDescription"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:370:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:371:1: ( ruleDescription EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:372:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription725);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription732); 

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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:379:1: ruleDescription : ( ( rule__Description__DescriptionAssignment ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:383:2: ( ( ( rule__Description__DescriptionAssignment ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:384:1: ( ( rule__Description__DescriptionAssignment ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:384:1: ( ( rule__Description__DescriptionAssignment ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:385:1: ( rule__Description__DescriptionAssignment )
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:386:1: ( rule__Description__DescriptionAssignment )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:386:2: rule__Description__DescriptionAssignment
            {
            pushFollow(FOLLOW_rule__Description__DescriptionAssignment_in_ruleDescription758);
            rule__Description__DescriptionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); 

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "rule__EntryPoint__Alternatives"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:398:1: rule__EntryPoint__Alternatives : ( ( ruleApplication ) | ( rulePlatform ) );
    public final void rule__EntryPoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:402:1: ( ( ruleApplication ) | ( rulePlatform ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:403:1: ( ruleApplication )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:403:1: ( ruleApplication )
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:404:1: ruleApplication
                    {
                     before(grammarAccess.getEntryPointAccess().getApplicationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleApplication_in_rule__EntryPoint__Alternatives794);
                    ruleApplication();

                    state._fsp--;

                     after(grammarAccess.getEntryPointAccess().getApplicationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:409:6: ( rulePlatform )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:409:6: ( rulePlatform )
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:410:1: rulePlatform
                    {
                     before(grammarAccess.getEntryPointAccess().getPlatformParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePlatform_in_rule__EntryPoint__Alternatives811);
                    rulePlatform();

                    state._fsp--;

                     after(grammarAccess.getEntryPointAccess().getPlatformParserRuleCall_1()); 

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
    // $ANTLR end "rule__EntryPoint__Alternatives"


    // $ANTLR start "rule__Application__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:424:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:428:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:429:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__0843);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__0846);
            rule__Application__Group__1();

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
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:436:1: rule__Application__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:440:1: ( ( 'Application' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:441:1: ( 'Application' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:441:1: ( 'Application' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:442:1: 'Application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Application__Group__0__Impl874); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

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
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:455:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:459:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:460:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__1905);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__1908);
            rule__Application__Group__2();

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
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:467:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:471:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:472:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:472:1: ( ( rule__Application__NameAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:473:1: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:474:1: ( rule__Application__NameAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:474:2: rule__Application__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl935);
            rule__Application__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:484:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:488:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:489:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__2965);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__2968);
            rule__Application__Group__3();

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
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:496:1: rule__Application__Group__2__Impl : ( '{' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:500:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:501:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:501:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:502:1: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Application__Group__2__Impl996); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:515:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:519:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:520:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__31027);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__4_in_rule__Application__Group__31030);
            rule__Application__Group__4();

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
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:527:1: rule__Application__Group__3__Impl : ( ( rule__Application__Group_3__0 )? ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:531:1: ( ( ( rule__Application__Group_3__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:532:1: ( ( rule__Application__Group_3__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:532:1: ( ( rule__Application__Group_3__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:533:1: ( rule__Application__Group_3__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:534:1: ( rule__Application__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:534:2: rule__Application__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Application__Group_3__0_in_rule__Application__Group__3__Impl1057);
                    rule__Application__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Application__Group__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:544:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:548:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:549:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__41088);
            rule__Application__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__5_in_rule__Application__Group__41091);
            rule__Application__Group__5();

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
    // $ANTLR end "rule__Application__Group__4"


    // $ANTLR start "rule__Application__Group__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:556:1: rule__Application__Group__4__Impl : ( 'components' ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:560:1: ( ( 'components' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:561:1: ( 'components' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:561:1: ( 'components' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:562:1: 'components'
            {
             before(grammarAccess.getApplicationAccess().getComponentsKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Application__Group__4__Impl1119); 
             after(grammarAccess.getApplicationAccess().getComponentsKeyword_4()); 

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
    // $ANTLR end "rule__Application__Group__4__Impl"


    // $ANTLR start "rule__Application__Group__5"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:575:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:579:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:580:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__51150);
            rule__Application__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__6_in_rule__Application__Group__51153);
            rule__Application__Group__6();

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
    // $ANTLR end "rule__Application__Group__5"


    // $ANTLR start "rule__Application__Group__5__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:587:1: rule__Application__Group__5__Impl : ( '{' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:591:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:592:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:592:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:593:1: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__Application__Group__5__Impl1181); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Application__Group__5__Impl"


    // $ANTLR start "rule__Application__Group__6"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:606:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:610:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:611:2: rule__Application__Group__6__Impl rule__Application__Group__7
            {
            pushFollow(FOLLOW_rule__Application__Group__6__Impl_in_rule__Application__Group__61212);
            rule__Application__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__7_in_rule__Application__Group__61215);
            rule__Application__Group__7();

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
    // $ANTLR end "rule__Application__Group__6"


    // $ANTLR start "rule__Application__Group__6__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:618:1: rule__Application__Group__6__Impl : ( ( rule__Application__ComponentsAssignment_6 ) ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:622:1: ( ( ( rule__Application__ComponentsAssignment_6 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:623:1: ( ( rule__Application__ComponentsAssignment_6 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:623:1: ( ( rule__Application__ComponentsAssignment_6 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:624:1: ( rule__Application__ComponentsAssignment_6 )
            {
             before(grammarAccess.getApplicationAccess().getComponentsAssignment_6()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:625:1: ( rule__Application__ComponentsAssignment_6 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:625:2: rule__Application__ComponentsAssignment_6
            {
            pushFollow(FOLLOW_rule__Application__ComponentsAssignment_6_in_rule__Application__Group__6__Impl1242);
            rule__Application__ComponentsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getComponentsAssignment_6()); 

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
    // $ANTLR end "rule__Application__Group__6__Impl"


    // $ANTLR start "rule__Application__Group__7"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:635:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:639:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:640:2: rule__Application__Group__7__Impl rule__Application__Group__8
            {
            pushFollow(FOLLOW_rule__Application__Group__7__Impl_in_rule__Application__Group__71272);
            rule__Application__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__8_in_rule__Application__Group__71275);
            rule__Application__Group__8();

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
    // $ANTLR end "rule__Application__Group__7"


    // $ANTLR start "rule__Application__Group__7__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:647:1: rule__Application__Group__7__Impl : ( ( rule__Application__Group_7__0 )* ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:651:1: ( ( ( rule__Application__Group_7__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:652:1: ( ( rule__Application__Group_7__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:652:1: ( ( rule__Application__Group_7__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:653:1: ( rule__Application__Group_7__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_7()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:654:1: ( rule__Application__Group_7__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:654:2: rule__Application__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Application__Group_7__0_in_rule__Application__Group__7__Impl1302);
            	    rule__Application__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Application__Group__7__Impl"


    // $ANTLR start "rule__Application__Group__8"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:664:1: rule__Application__Group__8 : rule__Application__Group__8__Impl rule__Application__Group__9 ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:668:1: ( rule__Application__Group__8__Impl rule__Application__Group__9 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:669:2: rule__Application__Group__8__Impl rule__Application__Group__9
            {
            pushFollow(FOLLOW_rule__Application__Group__8__Impl_in_rule__Application__Group__81333);
            rule__Application__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__9_in_rule__Application__Group__81336);
            rule__Application__Group__9();

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
    // $ANTLR end "rule__Application__Group__8"


    // $ANTLR start "rule__Application__Group__8__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:676:1: rule__Application__Group__8__Impl : ( '}' ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:680:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:681:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:681:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:682:1: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_14_in_rule__Application__Group__8__Impl1364); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Application__Group__8__Impl"


    // $ANTLR start "rule__Application__Group__9"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:695:1: rule__Application__Group__9 : rule__Application__Group__9__Impl ;
    public final void rule__Application__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:699:1: ( rule__Application__Group__9__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:700:2: rule__Application__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group__9__Impl_in_rule__Application__Group__91395);
            rule__Application__Group__9__Impl();

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
    // $ANTLR end "rule__Application__Group__9"


    // $ANTLR start "rule__Application__Group__9__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:706:1: rule__Application__Group__9__Impl : ( '}' ) ;
    public final void rule__Application__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:710:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:711:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:711:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:712:1: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_14_in_rule__Application__Group__9__Impl1423); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Application__Group__9__Impl"


    // $ANTLR start "rule__Application__Group_3__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:745:1: rule__Application__Group_3__0 : rule__Application__Group_3__0__Impl rule__Application__Group_3__1 ;
    public final void rule__Application__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:749:1: ( rule__Application__Group_3__0__Impl rule__Application__Group_3__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:750:2: rule__Application__Group_3__0__Impl rule__Application__Group_3__1
            {
            pushFollow(FOLLOW_rule__Application__Group_3__0__Impl_in_rule__Application__Group_3__01474);
            rule__Application__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group_3__1_in_rule__Application__Group_3__01477);
            rule__Application__Group_3__1();

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
    // $ANTLR end "rule__Application__Group_3__0"


    // $ANTLR start "rule__Application__Group_3__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:757:1: rule__Application__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Application__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:761:1: ( ( 'description' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:762:1: ( 'description' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:762:1: ( 'description' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:763:1: 'description'
            {
             before(grammarAccess.getApplicationAccess().getDescriptionKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__Application__Group_3__0__Impl1505); 
             after(grammarAccess.getApplicationAccess().getDescriptionKeyword_3_0()); 

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
    // $ANTLR end "rule__Application__Group_3__0__Impl"


    // $ANTLR start "rule__Application__Group_3__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:776:1: rule__Application__Group_3__1 : rule__Application__Group_3__1__Impl ;
    public final void rule__Application__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:780:1: ( rule__Application__Group_3__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:781:2: rule__Application__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group_3__1__Impl_in_rule__Application__Group_3__11536);
            rule__Application__Group_3__1__Impl();

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
    // $ANTLR end "rule__Application__Group_3__1"


    // $ANTLR start "rule__Application__Group_3__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:787:1: rule__Application__Group_3__1__Impl : ( ( rule__Application__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Application__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:791:1: ( ( ( rule__Application__DescriptionAssignment_3_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:792:1: ( ( rule__Application__DescriptionAssignment_3_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:792:1: ( ( rule__Application__DescriptionAssignment_3_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:793:1: ( rule__Application__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getApplicationAccess().getDescriptionAssignment_3_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:794:1: ( rule__Application__DescriptionAssignment_3_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:794:2: rule__Application__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Application__DescriptionAssignment_3_1_in_rule__Application__Group_3__1__Impl1563);
            rule__Application__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getDescriptionAssignment_3_1()); 

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
    // $ANTLR end "rule__Application__Group_3__1__Impl"


    // $ANTLR start "rule__Application__Group_7__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:808:1: rule__Application__Group_7__0 : rule__Application__Group_7__0__Impl rule__Application__Group_7__1 ;
    public final void rule__Application__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:812:1: ( rule__Application__Group_7__0__Impl rule__Application__Group_7__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:813:2: rule__Application__Group_7__0__Impl rule__Application__Group_7__1
            {
            pushFollow(FOLLOW_rule__Application__Group_7__0__Impl_in_rule__Application__Group_7__01597);
            rule__Application__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group_7__1_in_rule__Application__Group_7__01600);
            rule__Application__Group_7__1();

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
    // $ANTLR end "rule__Application__Group_7__0"


    // $ANTLR start "rule__Application__Group_7__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:820:1: rule__Application__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Application__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:824:1: ( ( ',' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:825:1: ( ',' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:825:1: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:826:1: ','
            {
             before(grammarAccess.getApplicationAccess().getCommaKeyword_7_0()); 
            match(input,16,FOLLOW_16_in_rule__Application__Group_7__0__Impl1628); 
             after(grammarAccess.getApplicationAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__Application__Group_7__0__Impl"


    // $ANTLR start "rule__Application__Group_7__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:839:1: rule__Application__Group_7__1 : rule__Application__Group_7__1__Impl ;
    public final void rule__Application__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:843:1: ( rule__Application__Group_7__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:844:2: rule__Application__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group_7__1__Impl_in_rule__Application__Group_7__11659);
            rule__Application__Group_7__1__Impl();

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
    // $ANTLR end "rule__Application__Group_7__1"


    // $ANTLR start "rule__Application__Group_7__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:850:1: rule__Application__Group_7__1__Impl : ( ( rule__Application__ComponentsAssignment_7_1 ) ) ;
    public final void rule__Application__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:854:1: ( ( ( rule__Application__ComponentsAssignment_7_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:855:1: ( ( rule__Application__ComponentsAssignment_7_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:855:1: ( ( rule__Application__ComponentsAssignment_7_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:856:1: ( rule__Application__ComponentsAssignment_7_1 )
            {
             before(grammarAccess.getApplicationAccess().getComponentsAssignment_7_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:857:1: ( rule__Application__ComponentsAssignment_7_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:857:2: rule__Application__ComponentsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Application__ComponentsAssignment_7_1_in_rule__Application__Group_7__1__Impl1686);
            rule__Application__ComponentsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getComponentsAssignment_7_1()); 

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
    // $ANTLR end "rule__Application__Group_7__1__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:871:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:875:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:876:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__01720);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__01723);
            rule__Component__Group__1();

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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:883:1: rule__Component__Group__0__Impl : ( () ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:887:1: ( ( () ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:888:1: ( () )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:888:1: ( () )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:889:1: ()
            {
             before(grammarAccess.getComponentAccess().getComponentAction_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:890:1: ()
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:892:1: 
            {
            }

             after(grammarAccess.getComponentAccess().getComponentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:902:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:906:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:907:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11781);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11784);
            rule__Component__Group__2();

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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:914:1: rule__Component__Group__1__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:918:1: ( ( 'Component' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:919:1: ( 'Component' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:919:1: ( 'Component' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:920:1: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Component__Group__1__Impl1812); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_1()); 

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
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:933:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:937:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:938:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21843);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__21846);
            rule__Component__Group__3();

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
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:945:1: rule__Component__Group__2__Impl : ( ( rule__Component__NameAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:949:1: ( ( ( rule__Component__NameAssignment_2 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:950:1: ( ( rule__Component__NameAssignment_2 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:950:1: ( ( rule__Component__NameAssignment_2 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:951:1: ( rule__Component__NameAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:952:1: ( rule__Component__NameAssignment_2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:952:2: rule__Component__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_2_in_rule__Component__Group__2__Impl1873);
            rule__Component__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:962:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:966:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:967:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__31903);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__31906);
            rule__Component__Group__4();

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
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:974:1: rule__Component__Group__3__Impl : ( '{' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:978:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:979:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:979:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:980:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Component__Group__3__Impl1934); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:993:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:997:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:998:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41965);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41968);
            rule__Component__Group__5();

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
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1005:1: rule__Component__Group__4__Impl : ( ( rule__Component__Group_4__0 )? ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1009:1: ( ( ( rule__Component__Group_4__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1010:1: ( ( rule__Component__Group_4__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1010:1: ( ( rule__Component__Group_4__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1011:1: ( rule__Component__Group_4__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_4()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1012:1: ( rule__Component__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1012:2: rule__Component__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_4__0_in_rule__Component__Group__4__Impl1995);
                    rule__Component__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1022:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1026:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1027:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__52026);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__6_in_rule__Component__Group__52029);
            rule__Component__Group__6();

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
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1034:1: rule__Component__Group__5__Impl : ( ( rule__Component__Group_5__0 )? ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1038:1: ( ( ( rule__Component__Group_5__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1039:1: ( ( rule__Component__Group_5__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1039:1: ( ( rule__Component__Group_5__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1040:1: ( rule__Component__Group_5__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_5()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1041:1: ( rule__Component__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1041:2: rule__Component__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_5__0_in_rule__Component__Group__5__Impl2056);
                    rule__Component__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1051:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1055:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1056:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__62087);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__7_in_rule__Component__Group__62090);
            rule__Component__Group__7();

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
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1063:1: rule__Component__Group__6__Impl : ( ( rule__Component__Group_6__0 )? ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1067:1: ( ( ( rule__Component__Group_6__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1068:1: ( ( rule__Component__Group_6__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1068:1: ( ( rule__Component__Group_6__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1069:1: ( rule__Component__Group_6__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_6()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1070:1: ( rule__Component__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1070:2: rule__Component__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_6__0_in_rule__Component__Group__6__Impl2117);
                    rule__Component__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group__7"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1080:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1084:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1085:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_rule__Component__Group__7__Impl_in_rule__Component__Group__72148);
            rule__Component__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__8_in_rule__Component__Group__72151);
            rule__Component__Group__8();

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
    // $ANTLR end "rule__Component__Group__7"


    // $ANTLR start "rule__Component__Group__7__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1092:1: rule__Component__Group__7__Impl : ( ( rule__Component__Group_7__0 )? ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1096:1: ( ( ( rule__Component__Group_7__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1097:1: ( ( rule__Component__Group_7__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1097:1: ( ( rule__Component__Group_7__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1098:1: ( rule__Component__Group_7__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_7()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1099:1: ( rule__Component__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1099:2: rule__Component__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_7__0_in_rule__Component__Group__7__Impl2178);
                    rule__Component__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Component__Group__7__Impl"


    // $ANTLR start "rule__Component__Group__8"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1109:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1113:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1114:2: rule__Component__Group__8__Impl rule__Component__Group__9
            {
            pushFollow(FOLLOW_rule__Component__Group__8__Impl_in_rule__Component__Group__82209);
            rule__Component__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__9_in_rule__Component__Group__82212);
            rule__Component__Group__9();

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
    // $ANTLR end "rule__Component__Group__8"


    // $ANTLR start "rule__Component__Group__8__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1121:1: rule__Component__Group__8__Impl : ( ( rule__Component__Group_8__0 )? ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1125:1: ( ( ( rule__Component__Group_8__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1126:1: ( ( rule__Component__Group_8__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1126:1: ( ( rule__Component__Group_8__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1127:1: ( rule__Component__Group_8__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_8()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1128:1: ( rule__Component__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1128:2: rule__Component__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_8__0_in_rule__Component__Group__8__Impl2239);
                    rule__Component__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Component__Group__8__Impl"


    // $ANTLR start "rule__Component__Group__9"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1138:1: rule__Component__Group__9 : rule__Component__Group__9__Impl ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1142:1: ( rule__Component__Group__9__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1143:2: rule__Component__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__9__Impl_in_rule__Component__Group__92270);
            rule__Component__Group__9__Impl();

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
    // $ANTLR end "rule__Component__Group__9"


    // $ANTLR start "rule__Component__Group__9__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1149:1: rule__Component__Group__9__Impl : ( '}' ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1153:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1154:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1154:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1155:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_14_in_rule__Component__Group__9__Impl2298); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Component__Group__9__Impl"


    // $ANTLR start "rule__Component__Group_4__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1188:1: rule__Component__Group_4__0 : rule__Component__Group_4__0__Impl rule__Component__Group_4__1 ;
    public final void rule__Component__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1192:1: ( rule__Component__Group_4__0__Impl rule__Component__Group_4__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1193:2: rule__Component__Group_4__0__Impl rule__Component__Group_4__1
            {
            pushFollow(FOLLOW_rule__Component__Group_4__0__Impl_in_rule__Component__Group_4__02349);
            rule__Component__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_4__1_in_rule__Component__Group_4__02352);
            rule__Component__Group_4__1();

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
    // $ANTLR end "rule__Component__Group_4__0"


    // $ANTLR start "rule__Component__Group_4__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1200:1: rule__Component__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Component__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1204:1: ( ( 'type' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1205:1: ( 'type' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1205:1: ( 'type' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1206:1: 'type'
            {
             before(grammarAccess.getComponentAccess().getTypeKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__Component__Group_4__0__Impl2380); 
             after(grammarAccess.getComponentAccess().getTypeKeyword_4_0()); 

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
    // $ANTLR end "rule__Component__Group_4__0__Impl"


    // $ANTLR start "rule__Component__Group_4__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1219:1: rule__Component__Group_4__1 : rule__Component__Group_4__1__Impl ;
    public final void rule__Component__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1223:1: ( rule__Component__Group_4__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1224:2: rule__Component__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_4__1__Impl_in_rule__Component__Group_4__12411);
            rule__Component__Group_4__1__Impl();

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
    // $ANTLR end "rule__Component__Group_4__1"


    // $ANTLR start "rule__Component__Group_4__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1230:1: rule__Component__Group_4__1__Impl : ( ( rule__Component__TypeAssignment_4_1 ) ) ;
    public final void rule__Component__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1234:1: ( ( ( rule__Component__TypeAssignment_4_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1235:1: ( ( rule__Component__TypeAssignment_4_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1235:1: ( ( rule__Component__TypeAssignment_4_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1236:1: ( rule__Component__TypeAssignment_4_1 )
            {
             before(grammarAccess.getComponentAccess().getTypeAssignment_4_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1237:1: ( rule__Component__TypeAssignment_4_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1237:2: rule__Component__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Component__TypeAssignment_4_1_in_rule__Component__Group_4__1__Impl2438);
            rule__Component__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__Component__Group_4__1__Impl"


    // $ANTLR start "rule__Component__Group_5__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1251:1: rule__Component__Group_5__0 : rule__Component__Group_5__0__Impl rule__Component__Group_5__1 ;
    public final void rule__Component__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1255:1: ( rule__Component__Group_5__0__Impl rule__Component__Group_5__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1256:2: rule__Component__Group_5__0__Impl rule__Component__Group_5__1
            {
            pushFollow(FOLLOW_rule__Component__Group_5__0__Impl_in_rule__Component__Group_5__02472);
            rule__Component__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_5__1_in_rule__Component__Group_5__02475);
            rule__Component__Group_5__1();

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
    // $ANTLR end "rule__Component__Group_5__0"


    // $ANTLR start "rule__Component__Group_5__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1263:1: rule__Component__Group_5__0__Impl : ( 'incomingConnections' ) ;
    public final void rule__Component__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1267:1: ( ( 'incomingConnections' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1268:1: ( 'incomingConnections' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1268:1: ( 'incomingConnections' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1269:1: 'incomingConnections'
            {
             before(grammarAccess.getComponentAccess().getIncomingConnectionsKeyword_5_0()); 
            match(input,19,FOLLOW_19_in_rule__Component__Group_5__0__Impl2503); 
             after(grammarAccess.getComponentAccess().getIncomingConnectionsKeyword_5_0()); 

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
    // $ANTLR end "rule__Component__Group_5__0__Impl"


    // $ANTLR start "rule__Component__Group_5__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1282:1: rule__Component__Group_5__1 : rule__Component__Group_5__1__Impl ;
    public final void rule__Component__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1286:1: ( rule__Component__Group_5__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1287:2: rule__Component__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_5__1__Impl_in_rule__Component__Group_5__12534);
            rule__Component__Group_5__1__Impl();

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
    // $ANTLR end "rule__Component__Group_5__1"


    // $ANTLR start "rule__Component__Group_5__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1293:1: rule__Component__Group_5__1__Impl : ( ( rule__Component__IncomingConnectionsAssignment_5_1 ) ) ;
    public final void rule__Component__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1297:1: ( ( ( rule__Component__IncomingConnectionsAssignment_5_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1298:1: ( ( rule__Component__IncomingConnectionsAssignment_5_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1298:1: ( ( rule__Component__IncomingConnectionsAssignment_5_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1299:1: ( rule__Component__IncomingConnectionsAssignment_5_1 )
            {
             before(grammarAccess.getComponentAccess().getIncomingConnectionsAssignment_5_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1300:1: ( rule__Component__IncomingConnectionsAssignment_5_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1300:2: rule__Component__IncomingConnectionsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Component__IncomingConnectionsAssignment_5_1_in_rule__Component__Group_5__1__Impl2561);
            rule__Component__IncomingConnectionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getIncomingConnectionsAssignment_5_1()); 

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
    // $ANTLR end "rule__Component__Group_5__1__Impl"


    // $ANTLR start "rule__Component__Group_6__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1314:1: rule__Component__Group_6__0 : rule__Component__Group_6__0__Impl rule__Component__Group_6__1 ;
    public final void rule__Component__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1318:1: ( rule__Component__Group_6__0__Impl rule__Component__Group_6__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1319:2: rule__Component__Group_6__0__Impl rule__Component__Group_6__1
            {
            pushFollow(FOLLOW_rule__Component__Group_6__0__Impl_in_rule__Component__Group_6__02595);
            rule__Component__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_6__1_in_rule__Component__Group_6__02598);
            rule__Component__Group_6__1();

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
    // $ANTLR end "rule__Component__Group_6__0"


    // $ANTLR start "rule__Component__Group_6__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1326:1: rule__Component__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__Component__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1330:1: ( ( 'description' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1331:1: ( 'description' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1331:1: ( 'description' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1332:1: 'description'
            {
             before(grammarAccess.getComponentAccess().getDescriptionKeyword_6_0()); 
            match(input,15,FOLLOW_15_in_rule__Component__Group_6__0__Impl2626); 
             after(grammarAccess.getComponentAccess().getDescriptionKeyword_6_0()); 

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
    // $ANTLR end "rule__Component__Group_6__0__Impl"


    // $ANTLR start "rule__Component__Group_6__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1345:1: rule__Component__Group_6__1 : rule__Component__Group_6__1__Impl ;
    public final void rule__Component__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1349:1: ( rule__Component__Group_6__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1350:2: rule__Component__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_6__1__Impl_in_rule__Component__Group_6__12657);
            rule__Component__Group_6__1__Impl();

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
    // $ANTLR end "rule__Component__Group_6__1"


    // $ANTLR start "rule__Component__Group_6__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1356:1: rule__Component__Group_6__1__Impl : ( ( rule__Component__DescriptionAssignment_6_1 ) ) ;
    public final void rule__Component__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1360:1: ( ( ( rule__Component__DescriptionAssignment_6_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1361:1: ( ( rule__Component__DescriptionAssignment_6_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1361:1: ( ( rule__Component__DescriptionAssignment_6_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1362:1: ( rule__Component__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getComponentAccess().getDescriptionAssignment_6_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1363:1: ( rule__Component__DescriptionAssignment_6_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1363:2: rule__Component__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Component__DescriptionAssignment_6_1_in_rule__Component__Group_6__1__Impl2684);
            rule__Component__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getDescriptionAssignment_6_1()); 

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
    // $ANTLR end "rule__Component__Group_6__1__Impl"


    // $ANTLR start "rule__Component__Group_7__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1377:1: rule__Component__Group_7__0 : rule__Component__Group_7__0__Impl rule__Component__Group_7__1 ;
    public final void rule__Component__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1381:1: ( rule__Component__Group_7__0__Impl rule__Component__Group_7__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1382:2: rule__Component__Group_7__0__Impl rule__Component__Group_7__1
            {
            pushFollow(FOLLOW_rule__Component__Group_7__0__Impl_in_rule__Component__Group_7__02718);
            rule__Component__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_7__1_in_rule__Component__Group_7__02721);
            rule__Component__Group_7__1();

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
    // $ANTLR end "rule__Component__Group_7__0"


    // $ANTLR start "rule__Component__Group_7__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1389:1: rule__Component__Group_7__0__Impl : ( 'outgoingConnections' ) ;
    public final void rule__Component__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1393:1: ( ( 'outgoingConnections' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1394:1: ( 'outgoingConnections' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1394:1: ( 'outgoingConnections' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1395:1: 'outgoingConnections'
            {
             before(grammarAccess.getComponentAccess().getOutgoingConnectionsKeyword_7_0()); 
            match(input,20,FOLLOW_20_in_rule__Component__Group_7__0__Impl2749); 
             after(grammarAccess.getComponentAccess().getOutgoingConnectionsKeyword_7_0()); 

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
    // $ANTLR end "rule__Component__Group_7__0__Impl"


    // $ANTLR start "rule__Component__Group_7__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1408:1: rule__Component__Group_7__1 : rule__Component__Group_7__1__Impl rule__Component__Group_7__2 ;
    public final void rule__Component__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1412:1: ( rule__Component__Group_7__1__Impl rule__Component__Group_7__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1413:2: rule__Component__Group_7__1__Impl rule__Component__Group_7__2
            {
            pushFollow(FOLLOW_rule__Component__Group_7__1__Impl_in_rule__Component__Group_7__12780);
            rule__Component__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_7__2_in_rule__Component__Group_7__12783);
            rule__Component__Group_7__2();

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
    // $ANTLR end "rule__Component__Group_7__1"


    // $ANTLR start "rule__Component__Group_7__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1420:1: rule__Component__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Component__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1424:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1425:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1425:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1426:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_12_in_rule__Component__Group_7__1__Impl2811); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__Component__Group_7__1__Impl"


    // $ANTLR start "rule__Component__Group_7__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1439:1: rule__Component__Group_7__2 : rule__Component__Group_7__2__Impl rule__Component__Group_7__3 ;
    public final void rule__Component__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1443:1: ( rule__Component__Group_7__2__Impl rule__Component__Group_7__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1444:2: rule__Component__Group_7__2__Impl rule__Component__Group_7__3
            {
            pushFollow(FOLLOW_rule__Component__Group_7__2__Impl_in_rule__Component__Group_7__22842);
            rule__Component__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_7__3_in_rule__Component__Group_7__22845);
            rule__Component__Group_7__3();

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
    // $ANTLR end "rule__Component__Group_7__2"


    // $ANTLR start "rule__Component__Group_7__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1451:1: rule__Component__Group_7__2__Impl : ( ( rule__Component__OutgoingConnectionsAssignment_7_2 ) ) ;
    public final void rule__Component__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1455:1: ( ( ( rule__Component__OutgoingConnectionsAssignment_7_2 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1456:1: ( ( rule__Component__OutgoingConnectionsAssignment_7_2 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1456:1: ( ( rule__Component__OutgoingConnectionsAssignment_7_2 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1457:1: ( rule__Component__OutgoingConnectionsAssignment_7_2 )
            {
             before(grammarAccess.getComponentAccess().getOutgoingConnectionsAssignment_7_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1458:1: ( rule__Component__OutgoingConnectionsAssignment_7_2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1458:2: rule__Component__OutgoingConnectionsAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Component__OutgoingConnectionsAssignment_7_2_in_rule__Component__Group_7__2__Impl2872);
            rule__Component__OutgoingConnectionsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getOutgoingConnectionsAssignment_7_2()); 

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
    // $ANTLR end "rule__Component__Group_7__2__Impl"


    // $ANTLR start "rule__Component__Group_7__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1468:1: rule__Component__Group_7__3 : rule__Component__Group_7__3__Impl rule__Component__Group_7__4 ;
    public final void rule__Component__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1472:1: ( rule__Component__Group_7__3__Impl rule__Component__Group_7__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1473:2: rule__Component__Group_7__3__Impl rule__Component__Group_7__4
            {
            pushFollow(FOLLOW_rule__Component__Group_7__3__Impl_in_rule__Component__Group_7__32902);
            rule__Component__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_7__4_in_rule__Component__Group_7__32905);
            rule__Component__Group_7__4();

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
    // $ANTLR end "rule__Component__Group_7__3"


    // $ANTLR start "rule__Component__Group_7__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1480:1: rule__Component__Group_7__3__Impl : ( ( rule__Component__Group_7_3__0 )* ) ;
    public final void rule__Component__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1484:1: ( ( ( rule__Component__Group_7_3__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1485:1: ( ( rule__Component__Group_7_3__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1485:1: ( ( rule__Component__Group_7_3__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1486:1: ( rule__Component__Group_7_3__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_7_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1487:1: ( rule__Component__Group_7_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1487:2: rule__Component__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Component__Group_7_3__0_in_rule__Component__Group_7__3__Impl2932);
            	    rule__Component__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__Component__Group_7__3__Impl"


    // $ANTLR start "rule__Component__Group_7__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1497:1: rule__Component__Group_7__4 : rule__Component__Group_7__4__Impl ;
    public final void rule__Component__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1501:1: ( rule__Component__Group_7__4__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1502:2: rule__Component__Group_7__4__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_7__4__Impl_in_rule__Component__Group_7__42963);
            rule__Component__Group_7__4__Impl();

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
    // $ANTLR end "rule__Component__Group_7__4"


    // $ANTLR start "rule__Component__Group_7__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1508:1: rule__Component__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Component__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1512:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1513:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1513:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1514:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,14,FOLLOW_14_in_rule__Component__Group_7__4__Impl2991); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__Component__Group_7__4__Impl"


    // $ANTLR start "rule__Component__Group_7_3__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1537:1: rule__Component__Group_7_3__0 : rule__Component__Group_7_3__0__Impl rule__Component__Group_7_3__1 ;
    public final void rule__Component__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1541:1: ( rule__Component__Group_7_3__0__Impl rule__Component__Group_7_3__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1542:2: rule__Component__Group_7_3__0__Impl rule__Component__Group_7_3__1
            {
            pushFollow(FOLLOW_rule__Component__Group_7_3__0__Impl_in_rule__Component__Group_7_3__03032);
            rule__Component__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_7_3__1_in_rule__Component__Group_7_3__03035);
            rule__Component__Group_7_3__1();

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
    // $ANTLR end "rule__Component__Group_7_3__0"


    // $ANTLR start "rule__Component__Group_7_3__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1549:1: rule__Component__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1553:1: ( ( ',' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1554:1: ( ',' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1554:1: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1555:1: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_7_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Component__Group_7_3__0__Impl3063); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__Component__Group_7_3__0__Impl"


    // $ANTLR start "rule__Component__Group_7_3__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1568:1: rule__Component__Group_7_3__1 : rule__Component__Group_7_3__1__Impl ;
    public final void rule__Component__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1572:1: ( rule__Component__Group_7_3__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1573:2: rule__Component__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_7_3__1__Impl_in_rule__Component__Group_7_3__13094);
            rule__Component__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__Component__Group_7_3__1"


    // $ANTLR start "rule__Component__Group_7_3__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1579:1: rule__Component__Group_7_3__1__Impl : ( ( rule__Component__OutgoingConnectionsAssignment_7_3_1 ) ) ;
    public final void rule__Component__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1583:1: ( ( ( rule__Component__OutgoingConnectionsAssignment_7_3_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1584:1: ( ( rule__Component__OutgoingConnectionsAssignment_7_3_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1584:1: ( ( rule__Component__OutgoingConnectionsAssignment_7_3_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1585:1: ( rule__Component__OutgoingConnectionsAssignment_7_3_1 )
            {
             before(grammarAccess.getComponentAccess().getOutgoingConnectionsAssignment_7_3_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1586:1: ( rule__Component__OutgoingConnectionsAssignment_7_3_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1586:2: rule__Component__OutgoingConnectionsAssignment_7_3_1
            {
            pushFollow(FOLLOW_rule__Component__OutgoingConnectionsAssignment_7_3_1_in_rule__Component__Group_7_3__1__Impl3121);
            rule__Component__OutgoingConnectionsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getOutgoingConnectionsAssignment_7_3_1()); 

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
    // $ANTLR end "rule__Component__Group_7_3__1__Impl"


    // $ANTLR start "rule__Component__Group_8__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1600:1: rule__Component__Group_8__0 : rule__Component__Group_8__0__Impl rule__Component__Group_8__1 ;
    public final void rule__Component__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1604:1: ( rule__Component__Group_8__0__Impl rule__Component__Group_8__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1605:2: rule__Component__Group_8__0__Impl rule__Component__Group_8__1
            {
            pushFollow(FOLLOW_rule__Component__Group_8__0__Impl_in_rule__Component__Group_8__03155);
            rule__Component__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_8__1_in_rule__Component__Group_8__03158);
            rule__Component__Group_8__1();

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
    // $ANTLR end "rule__Component__Group_8__0"


    // $ANTLR start "rule__Component__Group_8__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1612:1: rule__Component__Group_8__0__Impl : ( 'parameterValues' ) ;
    public final void rule__Component__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1616:1: ( ( 'parameterValues' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1617:1: ( 'parameterValues' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1617:1: ( 'parameterValues' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1618:1: 'parameterValues'
            {
             before(grammarAccess.getComponentAccess().getParameterValuesKeyword_8_0()); 
            match(input,21,FOLLOW_21_in_rule__Component__Group_8__0__Impl3186); 
             after(grammarAccess.getComponentAccess().getParameterValuesKeyword_8_0()); 

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
    // $ANTLR end "rule__Component__Group_8__0__Impl"


    // $ANTLR start "rule__Component__Group_8__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1631:1: rule__Component__Group_8__1 : rule__Component__Group_8__1__Impl rule__Component__Group_8__2 ;
    public final void rule__Component__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1635:1: ( rule__Component__Group_8__1__Impl rule__Component__Group_8__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1636:2: rule__Component__Group_8__1__Impl rule__Component__Group_8__2
            {
            pushFollow(FOLLOW_rule__Component__Group_8__1__Impl_in_rule__Component__Group_8__13217);
            rule__Component__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_8__2_in_rule__Component__Group_8__13220);
            rule__Component__Group_8__2();

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
    // $ANTLR end "rule__Component__Group_8__1"


    // $ANTLR start "rule__Component__Group_8__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1643:1: rule__Component__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Component__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1647:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1648:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1648:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1649:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,12,FOLLOW_12_in_rule__Component__Group_8__1__Impl3248); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_8_1()); 

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
    // $ANTLR end "rule__Component__Group_8__1__Impl"


    // $ANTLR start "rule__Component__Group_8__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1662:1: rule__Component__Group_8__2 : rule__Component__Group_8__2__Impl rule__Component__Group_8__3 ;
    public final void rule__Component__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1666:1: ( rule__Component__Group_8__2__Impl rule__Component__Group_8__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1667:2: rule__Component__Group_8__2__Impl rule__Component__Group_8__3
            {
            pushFollow(FOLLOW_rule__Component__Group_8__2__Impl_in_rule__Component__Group_8__23279);
            rule__Component__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_8__3_in_rule__Component__Group_8__23282);
            rule__Component__Group_8__3();

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
    // $ANTLR end "rule__Component__Group_8__2"


    // $ANTLR start "rule__Component__Group_8__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1674:1: rule__Component__Group_8__2__Impl : ( ( rule__Component__ParameterValuesAssignment_8_2 ) ) ;
    public final void rule__Component__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1678:1: ( ( ( rule__Component__ParameterValuesAssignment_8_2 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1679:1: ( ( rule__Component__ParameterValuesAssignment_8_2 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1679:1: ( ( rule__Component__ParameterValuesAssignment_8_2 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1680:1: ( rule__Component__ParameterValuesAssignment_8_2 )
            {
             before(grammarAccess.getComponentAccess().getParameterValuesAssignment_8_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1681:1: ( rule__Component__ParameterValuesAssignment_8_2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1681:2: rule__Component__ParameterValuesAssignment_8_2
            {
            pushFollow(FOLLOW_rule__Component__ParameterValuesAssignment_8_2_in_rule__Component__Group_8__2__Impl3309);
            rule__Component__ParameterValuesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getParameterValuesAssignment_8_2()); 

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
    // $ANTLR end "rule__Component__Group_8__2__Impl"


    // $ANTLR start "rule__Component__Group_8__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1691:1: rule__Component__Group_8__3 : rule__Component__Group_8__3__Impl rule__Component__Group_8__4 ;
    public final void rule__Component__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1695:1: ( rule__Component__Group_8__3__Impl rule__Component__Group_8__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1696:2: rule__Component__Group_8__3__Impl rule__Component__Group_8__4
            {
            pushFollow(FOLLOW_rule__Component__Group_8__3__Impl_in_rule__Component__Group_8__33339);
            rule__Component__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_8__4_in_rule__Component__Group_8__33342);
            rule__Component__Group_8__4();

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
    // $ANTLR end "rule__Component__Group_8__3"


    // $ANTLR start "rule__Component__Group_8__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1703:1: rule__Component__Group_8__3__Impl : ( ( rule__Component__Group_8_3__0 )* ) ;
    public final void rule__Component__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1707:1: ( ( ( rule__Component__Group_8_3__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1708:1: ( ( rule__Component__Group_8_3__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1708:1: ( ( rule__Component__Group_8_3__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1709:1: ( rule__Component__Group_8_3__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_8_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1710:1: ( rule__Component__Group_8_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1710:2: rule__Component__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Component__Group_8_3__0_in_rule__Component__Group_8__3__Impl3369);
            	    rule__Component__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_8_3()); 

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
    // $ANTLR end "rule__Component__Group_8__3__Impl"


    // $ANTLR start "rule__Component__Group_8__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1720:1: rule__Component__Group_8__4 : rule__Component__Group_8__4__Impl ;
    public final void rule__Component__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1724:1: ( rule__Component__Group_8__4__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1725:2: rule__Component__Group_8__4__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_8__4__Impl_in_rule__Component__Group_8__43400);
            rule__Component__Group_8__4__Impl();

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
    // $ANTLR end "rule__Component__Group_8__4"


    // $ANTLR start "rule__Component__Group_8__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1731:1: rule__Component__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Component__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1735:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1736:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1736:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1737:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,14,FOLLOW_14_in_rule__Component__Group_8__4__Impl3428); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8_4()); 

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
    // $ANTLR end "rule__Component__Group_8__4__Impl"


    // $ANTLR start "rule__Component__Group_8_3__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1760:1: rule__Component__Group_8_3__0 : rule__Component__Group_8_3__0__Impl rule__Component__Group_8_3__1 ;
    public final void rule__Component__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1764:1: ( rule__Component__Group_8_3__0__Impl rule__Component__Group_8_3__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1765:2: rule__Component__Group_8_3__0__Impl rule__Component__Group_8_3__1
            {
            pushFollow(FOLLOW_rule__Component__Group_8_3__0__Impl_in_rule__Component__Group_8_3__03469);
            rule__Component__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_8_3__1_in_rule__Component__Group_8_3__03472);
            rule__Component__Group_8_3__1();

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
    // $ANTLR end "rule__Component__Group_8_3__0"


    // $ANTLR start "rule__Component__Group_8_3__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1772:1: rule__Component__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1776:1: ( ( ',' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1777:1: ( ',' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1777:1: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1778:1: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_8_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Component__Group_8_3__0__Impl3500); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_8_3_0()); 

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
    // $ANTLR end "rule__Component__Group_8_3__0__Impl"


    // $ANTLR start "rule__Component__Group_8_3__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1791:1: rule__Component__Group_8_3__1 : rule__Component__Group_8_3__1__Impl ;
    public final void rule__Component__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1795:1: ( rule__Component__Group_8_3__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1796:2: rule__Component__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_8_3__1__Impl_in_rule__Component__Group_8_3__13531);
            rule__Component__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__Component__Group_8_3__1"


    // $ANTLR start "rule__Component__Group_8_3__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1802:1: rule__Component__Group_8_3__1__Impl : ( ( rule__Component__ParameterValuesAssignment_8_3_1 ) ) ;
    public final void rule__Component__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1806:1: ( ( ( rule__Component__ParameterValuesAssignment_8_3_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1807:1: ( ( rule__Component__ParameterValuesAssignment_8_3_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1807:1: ( ( rule__Component__ParameterValuesAssignment_8_3_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1808:1: ( rule__Component__ParameterValuesAssignment_8_3_1 )
            {
             before(grammarAccess.getComponentAccess().getParameterValuesAssignment_8_3_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1809:1: ( rule__Component__ParameterValuesAssignment_8_3_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1809:2: rule__Component__ParameterValuesAssignment_8_3_1
            {
            pushFollow(FOLLOW_rule__Component__ParameterValuesAssignment_8_3_1_in_rule__Component__Group_8_3__1__Impl3558);
            rule__Component__ParameterValuesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getParameterValuesAssignment_8_3_1()); 

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
    // $ANTLR end "rule__Component__Group_8_3__1__Impl"


    // $ANTLR start "rule__Connection__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1823:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1827:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1828:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__03592);
            rule__Connection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__03595);
            rule__Connection__Group__1();

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
    // $ANTLR end "rule__Connection__Group__0"


    // $ANTLR start "rule__Connection__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1835:1: rule__Connection__Group__0__Impl : ( 'Connection' ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1839:1: ( ( 'Connection' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1840:1: ( 'Connection' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1840:1: ( 'Connection' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1841:1: 'Connection'
            {
             before(grammarAccess.getConnectionAccess().getConnectionKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Connection__Group__0__Impl3623); 
             after(grammarAccess.getConnectionAccess().getConnectionKeyword_0()); 

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
    // $ANTLR end "rule__Connection__Group__0__Impl"


    // $ANTLR start "rule__Connection__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1854:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1858:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1859:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__13654);
            rule__Connection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__13657);
            rule__Connection__Group__2();

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
    // $ANTLR end "rule__Connection__Group__1"


    // $ANTLR start "rule__Connection__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1866:1: rule__Connection__Group__1__Impl : ( ( rule__Connection__NameAssignment_1 ) ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1870:1: ( ( ( rule__Connection__NameAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1871:1: ( ( rule__Connection__NameAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1871:1: ( ( rule__Connection__NameAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1872:1: ( rule__Connection__NameAssignment_1 )
            {
             before(grammarAccess.getConnectionAccess().getNameAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1873:1: ( rule__Connection__NameAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1873:2: rule__Connection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Connection__NameAssignment_1_in_rule__Connection__Group__1__Impl3684);
            rule__Connection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Connection__Group__1__Impl"


    // $ANTLR start "rule__Connection__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1883:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1887:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1888:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__23714);
            rule__Connection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__23717);
            rule__Connection__Group__3();

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
    // $ANTLR end "rule__Connection__Group__2"


    // $ANTLR start "rule__Connection__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1895:1: rule__Connection__Group__2__Impl : ( '{' ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1899:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1900:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1900:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1901:1: '{'
            {
             before(grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Connection__Group__2__Impl3745); 
             after(grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Connection__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1914:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl rule__Connection__Group__4 ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1918:1: ( rule__Connection__Group__3__Impl rule__Connection__Group__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1919:2: rule__Connection__Group__3__Impl rule__Connection__Group__4
            {
            pushFollow(FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__33776);
            rule__Connection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__4_in_rule__Connection__Group__33779);
            rule__Connection__Group__4();

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
    // $ANTLR end "rule__Connection__Group__3"


    // $ANTLR start "rule__Connection__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1926:1: rule__Connection__Group__3__Impl : ( 'sourcePort' ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1930:1: ( ( 'sourcePort' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1931:1: ( 'sourcePort' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1931:1: ( 'sourcePort' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1932:1: 'sourcePort'
            {
             before(grammarAccess.getConnectionAccess().getSourcePortKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Connection__Group__3__Impl3807); 
             after(grammarAccess.getConnectionAccess().getSourcePortKeyword_3()); 

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
    // $ANTLR end "rule__Connection__Group__3__Impl"


    // $ANTLR start "rule__Connection__Group__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1945:1: rule__Connection__Group__4 : rule__Connection__Group__4__Impl rule__Connection__Group__5 ;
    public final void rule__Connection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1949:1: ( rule__Connection__Group__4__Impl rule__Connection__Group__5 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1950:2: rule__Connection__Group__4__Impl rule__Connection__Group__5
            {
            pushFollow(FOLLOW_rule__Connection__Group__4__Impl_in_rule__Connection__Group__43838);
            rule__Connection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__5_in_rule__Connection__Group__43841);
            rule__Connection__Group__5();

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
    // $ANTLR end "rule__Connection__Group__4"


    // $ANTLR start "rule__Connection__Group__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1957:1: rule__Connection__Group__4__Impl : ( ( rule__Connection__SourcePortAssignment_4 ) ) ;
    public final void rule__Connection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1961:1: ( ( ( rule__Connection__SourcePortAssignment_4 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1962:1: ( ( rule__Connection__SourcePortAssignment_4 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1962:1: ( ( rule__Connection__SourcePortAssignment_4 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1963:1: ( rule__Connection__SourcePortAssignment_4 )
            {
             before(grammarAccess.getConnectionAccess().getSourcePortAssignment_4()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1964:1: ( rule__Connection__SourcePortAssignment_4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1964:2: rule__Connection__SourcePortAssignment_4
            {
            pushFollow(FOLLOW_rule__Connection__SourcePortAssignment_4_in_rule__Connection__Group__4__Impl3868);
            rule__Connection__SourcePortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getSourcePortAssignment_4()); 

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
    // $ANTLR end "rule__Connection__Group__4__Impl"


    // $ANTLR start "rule__Connection__Group__5"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1974:1: rule__Connection__Group__5 : rule__Connection__Group__5__Impl rule__Connection__Group__6 ;
    public final void rule__Connection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1978:1: ( rule__Connection__Group__5__Impl rule__Connection__Group__6 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1979:2: rule__Connection__Group__5__Impl rule__Connection__Group__6
            {
            pushFollow(FOLLOW_rule__Connection__Group__5__Impl_in_rule__Connection__Group__53898);
            rule__Connection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__6_in_rule__Connection__Group__53901);
            rule__Connection__Group__6();

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
    // $ANTLR end "rule__Connection__Group__5"


    // $ANTLR start "rule__Connection__Group__5__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1986:1: rule__Connection__Group__5__Impl : ( 'targetComponent' ) ;
    public final void rule__Connection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1990:1: ( ( 'targetComponent' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1991:1: ( 'targetComponent' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1991:1: ( 'targetComponent' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:1992:1: 'targetComponent'
            {
             before(grammarAccess.getConnectionAccess().getTargetComponentKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Connection__Group__5__Impl3929); 
             after(grammarAccess.getConnectionAccess().getTargetComponentKeyword_5()); 

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
    // $ANTLR end "rule__Connection__Group__5__Impl"


    // $ANTLR start "rule__Connection__Group__6"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2005:1: rule__Connection__Group__6 : rule__Connection__Group__6__Impl rule__Connection__Group__7 ;
    public final void rule__Connection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2009:1: ( rule__Connection__Group__6__Impl rule__Connection__Group__7 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2010:2: rule__Connection__Group__6__Impl rule__Connection__Group__7
            {
            pushFollow(FOLLOW_rule__Connection__Group__6__Impl_in_rule__Connection__Group__63960);
            rule__Connection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__7_in_rule__Connection__Group__63963);
            rule__Connection__Group__7();

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
    // $ANTLR end "rule__Connection__Group__6"


    // $ANTLR start "rule__Connection__Group__6__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2017:1: rule__Connection__Group__6__Impl : ( ( rule__Connection__TargetComponentAssignment_6 ) ) ;
    public final void rule__Connection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2021:1: ( ( ( rule__Connection__TargetComponentAssignment_6 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2022:1: ( ( rule__Connection__TargetComponentAssignment_6 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2022:1: ( ( rule__Connection__TargetComponentAssignment_6 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2023:1: ( rule__Connection__TargetComponentAssignment_6 )
            {
             before(grammarAccess.getConnectionAccess().getTargetComponentAssignment_6()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2024:1: ( rule__Connection__TargetComponentAssignment_6 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2024:2: rule__Connection__TargetComponentAssignment_6
            {
            pushFollow(FOLLOW_rule__Connection__TargetComponentAssignment_6_in_rule__Connection__Group__6__Impl3990);
            rule__Connection__TargetComponentAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getTargetComponentAssignment_6()); 

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
    // $ANTLR end "rule__Connection__Group__6__Impl"


    // $ANTLR start "rule__Connection__Group__7"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2034:1: rule__Connection__Group__7 : rule__Connection__Group__7__Impl rule__Connection__Group__8 ;
    public final void rule__Connection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2038:1: ( rule__Connection__Group__7__Impl rule__Connection__Group__8 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2039:2: rule__Connection__Group__7__Impl rule__Connection__Group__8
            {
            pushFollow(FOLLOW_rule__Connection__Group__7__Impl_in_rule__Connection__Group__74020);
            rule__Connection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__8_in_rule__Connection__Group__74023);
            rule__Connection__Group__8();

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
    // $ANTLR end "rule__Connection__Group__7"


    // $ANTLR start "rule__Connection__Group__7__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2046:1: rule__Connection__Group__7__Impl : ( ( rule__Connection__Group_7__0 )? ) ;
    public final void rule__Connection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2050:1: ( ( ( rule__Connection__Group_7__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2051:1: ( ( rule__Connection__Group_7__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2051:1: ( ( rule__Connection__Group_7__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2052:1: ( rule__Connection__Group_7__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_7()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2053:1: ( rule__Connection__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2053:2: rule__Connection__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Connection__Group_7__0_in_rule__Connection__Group__7__Impl4050);
                    rule__Connection__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Connection__Group__7__Impl"


    // $ANTLR start "rule__Connection__Group__8"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2063:1: rule__Connection__Group__8 : rule__Connection__Group__8__Impl ;
    public final void rule__Connection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2067:1: ( rule__Connection__Group__8__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2068:2: rule__Connection__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Connection__Group__8__Impl_in_rule__Connection__Group__84081);
            rule__Connection__Group__8__Impl();

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
    // $ANTLR end "rule__Connection__Group__8"


    // $ANTLR start "rule__Connection__Group__8__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2074:1: rule__Connection__Group__8__Impl : ( '}' ) ;
    public final void rule__Connection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2078:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2079:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2079:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2080:1: '}'
            {
             before(grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_14_in_rule__Connection__Group__8__Impl4109); 
             after(grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Connection__Group__8__Impl"


    // $ANTLR start "rule__Connection__Group_7__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2111:1: rule__Connection__Group_7__0 : rule__Connection__Group_7__0__Impl rule__Connection__Group_7__1 ;
    public final void rule__Connection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2115:1: ( rule__Connection__Group_7__0__Impl rule__Connection__Group_7__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2116:2: rule__Connection__Group_7__0__Impl rule__Connection__Group_7__1
            {
            pushFollow(FOLLOW_rule__Connection__Group_7__0__Impl_in_rule__Connection__Group_7__04158);
            rule__Connection__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group_7__1_in_rule__Connection__Group_7__04161);
            rule__Connection__Group_7__1();

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
    // $ANTLR end "rule__Connection__Group_7__0"


    // $ANTLR start "rule__Connection__Group_7__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2123:1: rule__Connection__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__Connection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2127:1: ( ( 'description' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2128:1: ( 'description' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2128:1: ( 'description' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2129:1: 'description'
            {
             before(grammarAccess.getConnectionAccess().getDescriptionKeyword_7_0()); 
            match(input,15,FOLLOW_15_in_rule__Connection__Group_7__0__Impl4189); 
             after(grammarAccess.getConnectionAccess().getDescriptionKeyword_7_0()); 

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
    // $ANTLR end "rule__Connection__Group_7__0__Impl"


    // $ANTLR start "rule__Connection__Group_7__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2142:1: rule__Connection__Group_7__1 : rule__Connection__Group_7__1__Impl ;
    public final void rule__Connection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2146:1: ( rule__Connection__Group_7__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2147:2: rule__Connection__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Connection__Group_7__1__Impl_in_rule__Connection__Group_7__14220);
            rule__Connection__Group_7__1__Impl();

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
    // $ANTLR end "rule__Connection__Group_7__1"


    // $ANTLR start "rule__Connection__Group_7__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2153:1: rule__Connection__Group_7__1__Impl : ( ( rule__Connection__DescriptionAssignment_7_1 ) ) ;
    public final void rule__Connection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2157:1: ( ( ( rule__Connection__DescriptionAssignment_7_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2158:1: ( ( rule__Connection__DescriptionAssignment_7_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2158:1: ( ( rule__Connection__DescriptionAssignment_7_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2159:1: ( rule__Connection__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getConnectionAccess().getDescriptionAssignment_7_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2160:1: ( rule__Connection__DescriptionAssignment_7_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2160:2: rule__Connection__DescriptionAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Connection__DescriptionAssignment_7_1_in_rule__Connection__Group_7__1__Impl4247);
            rule__Connection__DescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getDescriptionAssignment_7_1()); 

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
    // $ANTLR end "rule__Connection__Group_7__1__Impl"


    // $ANTLR start "rule__ParameterValue__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2174:1: rule__ParameterValue__Group__0 : rule__ParameterValue__Group__0__Impl rule__ParameterValue__Group__1 ;
    public final void rule__ParameterValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2178:1: ( rule__ParameterValue__Group__0__Impl rule__ParameterValue__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2179:2: rule__ParameterValue__Group__0__Impl rule__ParameterValue__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterValue__Group__0__Impl_in_rule__ParameterValue__Group__04281);
            rule__ParameterValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterValue__Group__1_in_rule__ParameterValue__Group__04284);
            rule__ParameterValue__Group__1();

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
    // $ANTLR end "rule__ParameterValue__Group__0"


    // $ANTLR start "rule__ParameterValue__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2186:1: rule__ParameterValue__Group__0__Impl : ( 'ParameterValue' ) ;
    public final void rule__ParameterValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2190:1: ( ( 'ParameterValue' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2191:1: ( 'ParameterValue' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2191:1: ( 'ParameterValue' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2192:1: 'ParameterValue'
            {
             before(grammarAccess.getParameterValueAccess().getParameterValueKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ParameterValue__Group__0__Impl4312); 
             after(grammarAccess.getParameterValueAccess().getParameterValueKeyword_0()); 

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
    // $ANTLR end "rule__ParameterValue__Group__0__Impl"


    // $ANTLR start "rule__ParameterValue__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2205:1: rule__ParameterValue__Group__1 : rule__ParameterValue__Group__1__Impl rule__ParameterValue__Group__2 ;
    public final void rule__ParameterValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2209:1: ( rule__ParameterValue__Group__1__Impl rule__ParameterValue__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2210:2: rule__ParameterValue__Group__1__Impl rule__ParameterValue__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterValue__Group__1__Impl_in_rule__ParameterValue__Group__14343);
            rule__ParameterValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterValue__Group__2_in_rule__ParameterValue__Group__14346);
            rule__ParameterValue__Group__2();

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
    // $ANTLR end "rule__ParameterValue__Group__1"


    // $ANTLR start "rule__ParameterValue__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2217:1: rule__ParameterValue__Group__1__Impl : ( ( rule__ParameterValue__NameAssignment_1 ) ) ;
    public final void rule__ParameterValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2221:1: ( ( ( rule__ParameterValue__NameAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2222:1: ( ( rule__ParameterValue__NameAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2222:1: ( ( rule__ParameterValue__NameAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2223:1: ( rule__ParameterValue__NameAssignment_1 )
            {
             before(grammarAccess.getParameterValueAccess().getNameAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2224:1: ( rule__ParameterValue__NameAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2224:2: rule__ParameterValue__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterValue__NameAssignment_1_in_rule__ParameterValue__Group__1__Impl4373);
            rule__ParameterValue__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ParameterValue__Group__1__Impl"


    // $ANTLR start "rule__ParameterValue__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2234:1: rule__ParameterValue__Group__2 : rule__ParameterValue__Group__2__Impl rule__ParameterValue__Group__3 ;
    public final void rule__ParameterValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2238:1: ( rule__ParameterValue__Group__2__Impl rule__ParameterValue__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2239:2: rule__ParameterValue__Group__2__Impl rule__ParameterValue__Group__3
            {
            pushFollow(FOLLOW_rule__ParameterValue__Group__2__Impl_in_rule__ParameterValue__Group__24403);
            rule__ParameterValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterValue__Group__3_in_rule__ParameterValue__Group__24406);
            rule__ParameterValue__Group__3();

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
    // $ANTLR end "rule__ParameterValue__Group__2"


    // $ANTLR start "rule__ParameterValue__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2246:1: rule__ParameterValue__Group__2__Impl : ( '{' ) ;
    public final void rule__ParameterValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2250:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2251:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2251:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2252:1: '{'
            {
             before(grammarAccess.getParameterValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__ParameterValue__Group__2__Impl4434); 
             after(grammarAccess.getParameterValueAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ParameterValue__Group__2__Impl"


    // $ANTLR start "rule__ParameterValue__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2265:1: rule__ParameterValue__Group__3 : rule__ParameterValue__Group__3__Impl rule__ParameterValue__Group__4 ;
    public final void rule__ParameterValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2269:1: ( rule__ParameterValue__Group__3__Impl rule__ParameterValue__Group__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2270:2: rule__ParameterValue__Group__3__Impl rule__ParameterValue__Group__4
            {
            pushFollow(FOLLOW_rule__ParameterValue__Group__3__Impl_in_rule__ParameterValue__Group__34465);
            rule__ParameterValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterValue__Group__4_in_rule__ParameterValue__Group__34468);
            rule__ParameterValue__Group__4();

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
    // $ANTLR end "rule__ParameterValue__Group__3"


    // $ANTLR start "rule__ParameterValue__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2277:1: rule__ParameterValue__Group__3__Impl : ( ( rule__ParameterValue__Group_3__0 )? ) ;
    public final void rule__ParameterValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2281:1: ( ( ( rule__ParameterValue__Group_3__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2282:1: ( ( rule__ParameterValue__Group_3__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2282:1: ( ( rule__ParameterValue__Group_3__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2283:1: ( rule__ParameterValue__Group_3__0 )?
            {
             before(grammarAccess.getParameterValueAccess().getGroup_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2284:1: ( rule__ParameterValue__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2284:2: rule__ParameterValue__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ParameterValue__Group_3__0_in_rule__ParameterValue__Group__3__Impl4495);
                    rule__ParameterValue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterValueAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ParameterValue__Group__3__Impl"


    // $ANTLR start "rule__ParameterValue__Group__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2294:1: rule__ParameterValue__Group__4 : rule__ParameterValue__Group__4__Impl rule__ParameterValue__Group__5 ;
    public final void rule__ParameterValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2298:1: ( rule__ParameterValue__Group__4__Impl rule__ParameterValue__Group__5 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2299:2: rule__ParameterValue__Group__4__Impl rule__ParameterValue__Group__5
            {
            pushFollow(FOLLOW_rule__ParameterValue__Group__4__Impl_in_rule__ParameterValue__Group__44526);
            rule__ParameterValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterValue__Group__5_in_rule__ParameterValue__Group__44529);
            rule__ParameterValue__Group__5();

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
    // $ANTLR end "rule__ParameterValue__Group__4"


    // $ANTLR start "rule__ParameterValue__Group__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2306:1: rule__ParameterValue__Group__4__Impl : ( 'type' ) ;
    public final void rule__ParameterValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2310:1: ( ( 'type' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2311:1: ( 'type' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2311:1: ( 'type' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2312:1: 'type'
            {
             before(grammarAccess.getParameterValueAccess().getTypeKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__ParameterValue__Group__4__Impl4557); 
             after(grammarAccess.getParameterValueAccess().getTypeKeyword_4()); 

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
    // $ANTLR end "rule__ParameterValue__Group__4__Impl"


    // $ANTLR start "rule__ParameterValue__Group__5"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2325:1: rule__ParameterValue__Group__5 : rule__ParameterValue__Group__5__Impl rule__ParameterValue__Group__6 ;
    public final void rule__ParameterValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2329:1: ( rule__ParameterValue__Group__5__Impl rule__ParameterValue__Group__6 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2330:2: rule__ParameterValue__Group__5__Impl rule__ParameterValue__Group__6
            {
            pushFollow(FOLLOW_rule__ParameterValue__Group__5__Impl_in_rule__ParameterValue__Group__54588);
            rule__ParameterValue__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterValue__Group__6_in_rule__ParameterValue__Group__54591);
            rule__ParameterValue__Group__6();

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
    // $ANTLR end "rule__ParameterValue__Group__5"


    // $ANTLR start "rule__ParameterValue__Group__5__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2337:1: rule__ParameterValue__Group__5__Impl : ( ( rule__ParameterValue__TypeAssignment_5 ) ) ;
    public final void rule__ParameterValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2341:1: ( ( ( rule__ParameterValue__TypeAssignment_5 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2342:1: ( ( rule__ParameterValue__TypeAssignment_5 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2342:1: ( ( rule__ParameterValue__TypeAssignment_5 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2343:1: ( rule__ParameterValue__TypeAssignment_5 )
            {
             before(grammarAccess.getParameterValueAccess().getTypeAssignment_5()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2344:1: ( rule__ParameterValue__TypeAssignment_5 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2344:2: rule__ParameterValue__TypeAssignment_5
            {
            pushFollow(FOLLOW_rule__ParameterValue__TypeAssignment_5_in_rule__ParameterValue__Group__5__Impl4618);
            rule__ParameterValue__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getTypeAssignment_5()); 

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
    // $ANTLR end "rule__ParameterValue__Group__5__Impl"


    // $ANTLR start "rule__ParameterValue__Group__6"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2354:1: rule__ParameterValue__Group__6 : rule__ParameterValue__Group__6__Impl rule__ParameterValue__Group__7 ;
    public final void rule__ParameterValue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2358:1: ( rule__ParameterValue__Group__6__Impl rule__ParameterValue__Group__7 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2359:2: rule__ParameterValue__Group__6__Impl rule__ParameterValue__Group__7
            {
            pushFollow(FOLLOW_rule__ParameterValue__Group__6__Impl_in_rule__ParameterValue__Group__64648);
            rule__ParameterValue__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterValue__Group__7_in_rule__ParameterValue__Group__64651);
            rule__ParameterValue__Group__7();

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
    // $ANTLR end "rule__ParameterValue__Group__6"


    // $ANTLR start "rule__ParameterValue__Group__6__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2366:1: rule__ParameterValue__Group__6__Impl : ( ( rule__ParameterValue__Group_6__0 )? ) ;
    public final void rule__ParameterValue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2370:1: ( ( ( rule__ParameterValue__Group_6__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2371:1: ( ( rule__ParameterValue__Group_6__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2371:1: ( ( rule__ParameterValue__Group_6__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2372:1: ( rule__ParameterValue__Group_6__0 )?
            {
             before(grammarAccess.getParameterValueAccess().getGroup_6()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2373:1: ( rule__ParameterValue__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2373:2: rule__ParameterValue__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ParameterValue__Group_6__0_in_rule__ParameterValue__Group__6__Impl4678);
                    rule__ParameterValue__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterValueAccess().getGroup_6()); 

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
    // $ANTLR end "rule__ParameterValue__Group__6__Impl"


    // $ANTLR start "rule__ParameterValue__Group__7"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2383:1: rule__ParameterValue__Group__7 : rule__ParameterValue__Group__7__Impl ;
    public final void rule__ParameterValue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2387:1: ( rule__ParameterValue__Group__7__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2388:2: rule__ParameterValue__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ParameterValue__Group__7__Impl_in_rule__ParameterValue__Group__74709);
            rule__ParameterValue__Group__7__Impl();

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
    // $ANTLR end "rule__ParameterValue__Group__7"


    // $ANTLR start "rule__ParameterValue__Group__7__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2394:1: rule__ParameterValue__Group__7__Impl : ( '}' ) ;
    public final void rule__ParameterValue__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2398:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2399:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2399:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2400:1: '}'
            {
             before(grammarAccess.getParameterValueAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__ParameterValue__Group__7__Impl4737); 
             after(grammarAccess.getParameterValueAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__ParameterValue__Group__7__Impl"


    // $ANTLR start "rule__ParameterValue__Group_3__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2429:1: rule__ParameterValue__Group_3__0 : rule__ParameterValue__Group_3__0__Impl rule__ParameterValue__Group_3__1 ;
    public final void rule__ParameterValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2433:1: ( rule__ParameterValue__Group_3__0__Impl rule__ParameterValue__Group_3__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2434:2: rule__ParameterValue__Group_3__0__Impl rule__ParameterValue__Group_3__1
            {
            pushFollow(FOLLOW_rule__ParameterValue__Group_3__0__Impl_in_rule__ParameterValue__Group_3__04784);
            rule__ParameterValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterValue__Group_3__1_in_rule__ParameterValue__Group_3__04787);
            rule__ParameterValue__Group_3__1();

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
    // $ANTLR end "rule__ParameterValue__Group_3__0"


    // $ANTLR start "rule__ParameterValue__Group_3__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2441:1: rule__ParameterValue__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__ParameterValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2445:1: ( ( 'value' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2446:1: ( 'value' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2446:1: ( 'value' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2447:1: 'value'
            {
             before(grammarAccess.getParameterValueAccess().getValueKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__ParameterValue__Group_3__0__Impl4815); 
             after(grammarAccess.getParameterValueAccess().getValueKeyword_3_0()); 

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
    // $ANTLR end "rule__ParameterValue__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterValue__Group_3__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2460:1: rule__ParameterValue__Group_3__1 : rule__ParameterValue__Group_3__1__Impl ;
    public final void rule__ParameterValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2464:1: ( rule__ParameterValue__Group_3__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2465:2: rule__ParameterValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterValue__Group_3__1__Impl_in_rule__ParameterValue__Group_3__14846);
            rule__ParameterValue__Group_3__1__Impl();

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
    // $ANTLR end "rule__ParameterValue__Group_3__1"


    // $ANTLR start "rule__ParameterValue__Group_3__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2471:1: rule__ParameterValue__Group_3__1__Impl : ( ( rule__ParameterValue__ValueAssignment_3_1 ) ) ;
    public final void rule__ParameterValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2475:1: ( ( ( rule__ParameterValue__ValueAssignment_3_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2476:1: ( ( rule__ParameterValue__ValueAssignment_3_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2476:1: ( ( rule__ParameterValue__ValueAssignment_3_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2477:1: ( rule__ParameterValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getParameterValueAccess().getValueAssignment_3_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2478:1: ( rule__ParameterValue__ValueAssignment_3_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2478:2: rule__ParameterValue__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ParameterValue__ValueAssignment_3_1_in_rule__ParameterValue__Group_3__1__Impl4873);
            rule__ParameterValue__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__ParameterValue__Group_3__1__Impl"


    // $ANTLR start "rule__ParameterValue__Group_6__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2492:1: rule__ParameterValue__Group_6__0 : rule__ParameterValue__Group_6__0__Impl rule__ParameterValue__Group_6__1 ;
    public final void rule__ParameterValue__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2496:1: ( rule__ParameterValue__Group_6__0__Impl rule__ParameterValue__Group_6__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2497:2: rule__ParameterValue__Group_6__0__Impl rule__ParameterValue__Group_6__1
            {
            pushFollow(FOLLOW_rule__ParameterValue__Group_6__0__Impl_in_rule__ParameterValue__Group_6__04907);
            rule__ParameterValue__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterValue__Group_6__1_in_rule__ParameterValue__Group_6__04910);
            rule__ParameterValue__Group_6__1();

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
    // $ANTLR end "rule__ParameterValue__Group_6__0"


    // $ANTLR start "rule__ParameterValue__Group_6__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2504:1: rule__ParameterValue__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__ParameterValue__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2508:1: ( ( 'description' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2509:1: ( 'description' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2509:1: ( 'description' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2510:1: 'description'
            {
             before(grammarAccess.getParameterValueAccess().getDescriptionKeyword_6_0()); 
            match(input,15,FOLLOW_15_in_rule__ParameterValue__Group_6__0__Impl4938); 
             after(grammarAccess.getParameterValueAccess().getDescriptionKeyword_6_0()); 

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
    // $ANTLR end "rule__ParameterValue__Group_6__0__Impl"


    // $ANTLR start "rule__ParameterValue__Group_6__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2523:1: rule__ParameterValue__Group_6__1 : rule__ParameterValue__Group_6__1__Impl ;
    public final void rule__ParameterValue__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2527:1: ( rule__ParameterValue__Group_6__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2528:2: rule__ParameterValue__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterValue__Group_6__1__Impl_in_rule__ParameterValue__Group_6__14969);
            rule__ParameterValue__Group_6__1__Impl();

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
    // $ANTLR end "rule__ParameterValue__Group_6__1"


    // $ANTLR start "rule__ParameterValue__Group_6__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2534:1: rule__ParameterValue__Group_6__1__Impl : ( ( rule__ParameterValue__DescriptionAssignment_6_1 ) ) ;
    public final void rule__ParameterValue__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2538:1: ( ( ( rule__ParameterValue__DescriptionAssignment_6_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2539:1: ( ( rule__ParameterValue__DescriptionAssignment_6_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2539:1: ( ( rule__ParameterValue__DescriptionAssignment_6_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2540:1: ( rule__ParameterValue__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getParameterValueAccess().getDescriptionAssignment_6_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2541:1: ( rule__ParameterValue__DescriptionAssignment_6_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2541:2: rule__ParameterValue__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_rule__ParameterValue__DescriptionAssignment_6_1_in_rule__ParameterValue__Group_6__1__Impl4996);
            rule__ParameterValue__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getDescriptionAssignment_6_1()); 

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
    // $ANTLR end "rule__ParameterValue__Group_6__1__Impl"


    // $ANTLR start "rule__Platform__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2555:1: rule__Platform__Group__0 : rule__Platform__Group__0__Impl rule__Platform__Group__1 ;
    public final void rule__Platform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2559:1: ( rule__Platform__Group__0__Impl rule__Platform__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2560:2: rule__Platform__Group__0__Impl rule__Platform__Group__1
            {
            pushFollow(FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__05030);
            rule__Platform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__05033);
            rule__Platform__Group__1();

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
    // $ANTLR end "rule__Platform__Group__0"


    // $ANTLR start "rule__Platform__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2567:1: rule__Platform__Group__0__Impl : ( 'Platform' ) ;
    public final void rule__Platform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2571:1: ( ( 'Platform' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2572:1: ( 'Platform' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2572:1: ( 'Platform' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2573:1: 'Platform'
            {
             before(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Platform__Group__0__Impl5061); 
             after(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); 

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
    // $ANTLR end "rule__Platform__Group__0__Impl"


    // $ANTLR start "rule__Platform__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2586:1: rule__Platform__Group__1 : rule__Platform__Group__1__Impl rule__Platform__Group__2 ;
    public final void rule__Platform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2590:1: ( rule__Platform__Group__1__Impl rule__Platform__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2591:2: rule__Platform__Group__1__Impl rule__Platform__Group__2
            {
            pushFollow(FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__15092);
            rule__Platform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__15095);
            rule__Platform__Group__2();

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
    // $ANTLR end "rule__Platform__Group__1"


    // $ANTLR start "rule__Platform__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2598:1: rule__Platform__Group__1__Impl : ( ( rule__Platform__NameAssignment_1 ) ) ;
    public final void rule__Platform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2602:1: ( ( ( rule__Platform__NameAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2603:1: ( ( rule__Platform__NameAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2603:1: ( ( rule__Platform__NameAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2604:1: ( rule__Platform__NameAssignment_1 )
            {
             before(grammarAccess.getPlatformAccess().getNameAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2605:1: ( rule__Platform__NameAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2605:2: rule__Platform__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Platform__NameAssignment_1_in_rule__Platform__Group__1__Impl5122);
            rule__Platform__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Platform__Group__1__Impl"


    // $ANTLR start "rule__Platform__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2615:1: rule__Platform__Group__2 : rule__Platform__Group__2__Impl rule__Platform__Group__3 ;
    public final void rule__Platform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2619:1: ( rule__Platform__Group__2__Impl rule__Platform__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2620:2: rule__Platform__Group__2__Impl rule__Platform__Group__3
            {
            pushFollow(FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__25152);
            rule__Platform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__25155);
            rule__Platform__Group__3();

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
    // $ANTLR end "rule__Platform__Group__2"


    // $ANTLR start "rule__Platform__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2627:1: rule__Platform__Group__2__Impl : ( '{' ) ;
    public final void rule__Platform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2631:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2632:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2632:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2633:1: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Platform__Group__2__Impl5183); 
             after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Platform__Group__2__Impl"


    // $ANTLR start "rule__Platform__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2646:1: rule__Platform__Group__3 : rule__Platform__Group__3__Impl rule__Platform__Group__4 ;
    public final void rule__Platform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2650:1: ( rule__Platform__Group__3__Impl rule__Platform__Group__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2651:2: rule__Platform__Group__3__Impl rule__Platform__Group__4
            {
            pushFollow(FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__35214);
            rule__Platform__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__4_in_rule__Platform__Group__35217);
            rule__Platform__Group__4();

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
    // $ANTLR end "rule__Platform__Group__3"


    // $ANTLR start "rule__Platform__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2658:1: rule__Platform__Group__3__Impl : ( ( rule__Platform__Group_3__0 )? ) ;
    public final void rule__Platform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2662:1: ( ( ( rule__Platform__Group_3__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2663:1: ( ( rule__Platform__Group_3__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2663:1: ( ( rule__Platform__Group_3__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2664:1: ( rule__Platform__Group_3__0 )?
            {
             before(grammarAccess.getPlatformAccess().getGroup_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2665:1: ( rule__Platform__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2665:2: rule__Platform__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Platform__Group_3__0_in_rule__Platform__Group__3__Impl5244);
                    rule__Platform__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlatformAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Platform__Group__3__Impl"


    // $ANTLR start "rule__Platform__Group__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2675:1: rule__Platform__Group__4 : rule__Platform__Group__4__Impl rule__Platform__Group__5 ;
    public final void rule__Platform__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2679:1: ( rule__Platform__Group__4__Impl rule__Platform__Group__5 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2680:2: rule__Platform__Group__4__Impl rule__Platform__Group__5
            {
            pushFollow(FOLLOW_rule__Platform__Group__4__Impl_in_rule__Platform__Group__45275);
            rule__Platform__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__5_in_rule__Platform__Group__45278);
            rule__Platform__Group__5();

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
    // $ANTLR end "rule__Platform__Group__4"


    // $ANTLR start "rule__Platform__Group__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2687:1: rule__Platform__Group__4__Impl : ( 'componentTypes' ) ;
    public final void rule__Platform__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2691:1: ( ( 'componentTypes' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2692:1: ( 'componentTypes' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2692:1: ( 'componentTypes' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2693:1: 'componentTypes'
            {
             before(grammarAccess.getPlatformAccess().getComponentTypesKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__Platform__Group__4__Impl5306); 
             after(grammarAccess.getPlatformAccess().getComponentTypesKeyword_4()); 

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
    // $ANTLR end "rule__Platform__Group__4__Impl"


    // $ANTLR start "rule__Platform__Group__5"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2706:1: rule__Platform__Group__5 : rule__Platform__Group__5__Impl rule__Platform__Group__6 ;
    public final void rule__Platform__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2710:1: ( rule__Platform__Group__5__Impl rule__Platform__Group__6 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2711:2: rule__Platform__Group__5__Impl rule__Platform__Group__6
            {
            pushFollow(FOLLOW_rule__Platform__Group__5__Impl_in_rule__Platform__Group__55337);
            rule__Platform__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__6_in_rule__Platform__Group__55340);
            rule__Platform__Group__6();

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
    // $ANTLR end "rule__Platform__Group__5"


    // $ANTLR start "rule__Platform__Group__5__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2718:1: rule__Platform__Group__5__Impl : ( '{' ) ;
    public final void rule__Platform__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2722:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2723:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2723:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2724:1: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__Platform__Group__5__Impl5368); 
             after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Platform__Group__5__Impl"


    // $ANTLR start "rule__Platform__Group__6"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2737:1: rule__Platform__Group__6 : rule__Platform__Group__6__Impl rule__Platform__Group__7 ;
    public final void rule__Platform__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2741:1: ( rule__Platform__Group__6__Impl rule__Platform__Group__7 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2742:2: rule__Platform__Group__6__Impl rule__Platform__Group__7
            {
            pushFollow(FOLLOW_rule__Platform__Group__6__Impl_in_rule__Platform__Group__65399);
            rule__Platform__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__7_in_rule__Platform__Group__65402);
            rule__Platform__Group__7();

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
    // $ANTLR end "rule__Platform__Group__6"


    // $ANTLR start "rule__Platform__Group__6__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2749:1: rule__Platform__Group__6__Impl : ( ( rule__Platform__ComponentTypesAssignment_6 ) ) ;
    public final void rule__Platform__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2753:1: ( ( ( rule__Platform__ComponentTypesAssignment_6 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2754:1: ( ( rule__Platform__ComponentTypesAssignment_6 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2754:1: ( ( rule__Platform__ComponentTypesAssignment_6 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2755:1: ( rule__Platform__ComponentTypesAssignment_6 )
            {
             before(grammarAccess.getPlatformAccess().getComponentTypesAssignment_6()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2756:1: ( rule__Platform__ComponentTypesAssignment_6 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2756:2: rule__Platform__ComponentTypesAssignment_6
            {
            pushFollow(FOLLOW_rule__Platform__ComponentTypesAssignment_6_in_rule__Platform__Group__6__Impl5429);
            rule__Platform__ComponentTypesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getComponentTypesAssignment_6()); 

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
    // $ANTLR end "rule__Platform__Group__6__Impl"


    // $ANTLR start "rule__Platform__Group__7"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2766:1: rule__Platform__Group__7 : rule__Platform__Group__7__Impl rule__Platform__Group__8 ;
    public final void rule__Platform__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2770:1: ( rule__Platform__Group__7__Impl rule__Platform__Group__8 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2771:2: rule__Platform__Group__7__Impl rule__Platform__Group__8
            {
            pushFollow(FOLLOW_rule__Platform__Group__7__Impl_in_rule__Platform__Group__75459);
            rule__Platform__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__8_in_rule__Platform__Group__75462);
            rule__Platform__Group__8();

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
    // $ANTLR end "rule__Platform__Group__7"


    // $ANTLR start "rule__Platform__Group__7__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2778:1: rule__Platform__Group__7__Impl : ( ( rule__Platform__Group_7__0 )* ) ;
    public final void rule__Platform__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2782:1: ( ( ( rule__Platform__Group_7__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2783:1: ( ( rule__Platform__Group_7__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2783:1: ( ( rule__Platform__Group_7__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2784:1: ( rule__Platform__Group_7__0 )*
            {
             before(grammarAccess.getPlatformAccess().getGroup_7()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2785:1: ( rule__Platform__Group_7__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2785:2: rule__Platform__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Platform__Group_7__0_in_rule__Platform__Group__7__Impl5489);
            	    rule__Platform__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPlatformAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Platform__Group__7__Impl"


    // $ANTLR start "rule__Platform__Group__8"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2795:1: rule__Platform__Group__8 : rule__Platform__Group__8__Impl rule__Platform__Group__9 ;
    public final void rule__Platform__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2799:1: ( rule__Platform__Group__8__Impl rule__Platform__Group__9 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2800:2: rule__Platform__Group__8__Impl rule__Platform__Group__9
            {
            pushFollow(FOLLOW_rule__Platform__Group__8__Impl_in_rule__Platform__Group__85520);
            rule__Platform__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__9_in_rule__Platform__Group__85523);
            rule__Platform__Group__9();

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
    // $ANTLR end "rule__Platform__Group__8"


    // $ANTLR start "rule__Platform__Group__8__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2807:1: rule__Platform__Group__8__Impl : ( '}' ) ;
    public final void rule__Platform__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2811:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2812:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2812:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2813:1: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_14_in_rule__Platform__Group__8__Impl5551); 
             after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Platform__Group__8__Impl"


    // $ANTLR start "rule__Platform__Group__9"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2826:1: rule__Platform__Group__9 : rule__Platform__Group__9__Impl rule__Platform__Group__10 ;
    public final void rule__Platform__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2830:1: ( rule__Platform__Group__9__Impl rule__Platform__Group__10 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2831:2: rule__Platform__Group__9__Impl rule__Platform__Group__10
            {
            pushFollow(FOLLOW_rule__Platform__Group__9__Impl_in_rule__Platform__Group__95582);
            rule__Platform__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__10_in_rule__Platform__Group__95585);
            rule__Platform__Group__10();

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
    // $ANTLR end "rule__Platform__Group__9"


    // $ANTLR start "rule__Platform__Group__9__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2838:1: rule__Platform__Group__9__Impl : ( ( rule__Platform__Group_9__0 )? ) ;
    public final void rule__Platform__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2842:1: ( ( ( rule__Platform__Group_9__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2843:1: ( ( rule__Platform__Group_9__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2843:1: ( ( rule__Platform__Group_9__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2844:1: ( rule__Platform__Group_9__0 )?
            {
             before(grammarAccess.getPlatformAccess().getGroup_9()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2845:1: ( rule__Platform__Group_9__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2845:2: rule__Platform__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Platform__Group_9__0_in_rule__Platform__Group__9__Impl5612);
                    rule__Platform__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlatformAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Platform__Group__9__Impl"


    // $ANTLR start "rule__Platform__Group__10"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2855:1: rule__Platform__Group__10 : rule__Platform__Group__10__Impl ;
    public final void rule__Platform__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2859:1: ( rule__Platform__Group__10__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2860:2: rule__Platform__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group__10__Impl_in_rule__Platform__Group__105643);
            rule__Platform__Group__10__Impl();

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
    // $ANTLR end "rule__Platform__Group__10"


    // $ANTLR start "rule__Platform__Group__10__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2866:1: rule__Platform__Group__10__Impl : ( '}' ) ;
    public final void rule__Platform__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2870:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2871:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2871:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2872:1: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_10()); 
            match(input,14,FOLLOW_14_in_rule__Platform__Group__10__Impl5671); 
             after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Platform__Group__10__Impl"


    // $ANTLR start "rule__Platform__Group_3__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2907:1: rule__Platform__Group_3__0 : rule__Platform__Group_3__0__Impl rule__Platform__Group_3__1 ;
    public final void rule__Platform__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2911:1: ( rule__Platform__Group_3__0__Impl rule__Platform__Group_3__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2912:2: rule__Platform__Group_3__0__Impl rule__Platform__Group_3__1
            {
            pushFollow(FOLLOW_rule__Platform__Group_3__0__Impl_in_rule__Platform__Group_3__05724);
            rule__Platform__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_3__1_in_rule__Platform__Group_3__05727);
            rule__Platform__Group_3__1();

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
    // $ANTLR end "rule__Platform__Group_3__0"


    // $ANTLR start "rule__Platform__Group_3__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2919:1: rule__Platform__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Platform__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2923:1: ( ( 'description' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2924:1: ( 'description' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2924:1: ( 'description' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2925:1: 'description'
            {
             before(grammarAccess.getPlatformAccess().getDescriptionKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__Platform__Group_3__0__Impl5755); 
             after(grammarAccess.getPlatformAccess().getDescriptionKeyword_3_0()); 

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
    // $ANTLR end "rule__Platform__Group_3__0__Impl"


    // $ANTLR start "rule__Platform__Group_3__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2938:1: rule__Platform__Group_3__1 : rule__Platform__Group_3__1__Impl ;
    public final void rule__Platform__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2942:1: ( rule__Platform__Group_3__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2943:2: rule__Platform__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group_3__1__Impl_in_rule__Platform__Group_3__15786);
            rule__Platform__Group_3__1__Impl();

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
    // $ANTLR end "rule__Platform__Group_3__1"


    // $ANTLR start "rule__Platform__Group_3__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2949:1: rule__Platform__Group_3__1__Impl : ( ( rule__Platform__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Platform__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2953:1: ( ( ( rule__Platform__DescriptionAssignment_3_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2954:1: ( ( rule__Platform__DescriptionAssignment_3_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2954:1: ( ( rule__Platform__DescriptionAssignment_3_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2955:1: ( rule__Platform__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getPlatformAccess().getDescriptionAssignment_3_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2956:1: ( rule__Platform__DescriptionAssignment_3_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2956:2: rule__Platform__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Platform__DescriptionAssignment_3_1_in_rule__Platform__Group_3__1__Impl5813);
            rule__Platform__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getDescriptionAssignment_3_1()); 

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
    // $ANTLR end "rule__Platform__Group_3__1__Impl"


    // $ANTLR start "rule__Platform__Group_7__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2970:1: rule__Platform__Group_7__0 : rule__Platform__Group_7__0__Impl rule__Platform__Group_7__1 ;
    public final void rule__Platform__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2974:1: ( rule__Platform__Group_7__0__Impl rule__Platform__Group_7__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2975:2: rule__Platform__Group_7__0__Impl rule__Platform__Group_7__1
            {
            pushFollow(FOLLOW_rule__Platform__Group_7__0__Impl_in_rule__Platform__Group_7__05847);
            rule__Platform__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_7__1_in_rule__Platform__Group_7__05850);
            rule__Platform__Group_7__1();

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
    // $ANTLR end "rule__Platform__Group_7__0"


    // $ANTLR start "rule__Platform__Group_7__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2982:1: rule__Platform__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Platform__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2986:1: ( ( ',' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2987:1: ( ',' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2987:1: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:2988:1: ','
            {
             before(grammarAccess.getPlatformAccess().getCommaKeyword_7_0()); 
            match(input,16,FOLLOW_16_in_rule__Platform__Group_7__0__Impl5878); 
             after(grammarAccess.getPlatformAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__Platform__Group_7__0__Impl"


    // $ANTLR start "rule__Platform__Group_7__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3001:1: rule__Platform__Group_7__1 : rule__Platform__Group_7__1__Impl ;
    public final void rule__Platform__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3005:1: ( rule__Platform__Group_7__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3006:2: rule__Platform__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group_7__1__Impl_in_rule__Platform__Group_7__15909);
            rule__Platform__Group_7__1__Impl();

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
    // $ANTLR end "rule__Platform__Group_7__1"


    // $ANTLR start "rule__Platform__Group_7__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3012:1: rule__Platform__Group_7__1__Impl : ( ( rule__Platform__ComponentTypesAssignment_7_1 ) ) ;
    public final void rule__Platform__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3016:1: ( ( ( rule__Platform__ComponentTypesAssignment_7_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3017:1: ( ( rule__Platform__ComponentTypesAssignment_7_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3017:1: ( ( rule__Platform__ComponentTypesAssignment_7_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3018:1: ( rule__Platform__ComponentTypesAssignment_7_1 )
            {
             before(grammarAccess.getPlatformAccess().getComponentTypesAssignment_7_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3019:1: ( rule__Platform__ComponentTypesAssignment_7_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3019:2: rule__Platform__ComponentTypesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Platform__ComponentTypesAssignment_7_1_in_rule__Platform__Group_7__1__Impl5936);
            rule__Platform__ComponentTypesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getComponentTypesAssignment_7_1()); 

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
    // $ANTLR end "rule__Platform__Group_7__1__Impl"


    // $ANTLR start "rule__Platform__Group_9__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3033:1: rule__Platform__Group_9__0 : rule__Platform__Group_9__0__Impl rule__Platform__Group_9__1 ;
    public final void rule__Platform__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3037:1: ( rule__Platform__Group_9__0__Impl rule__Platform__Group_9__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3038:2: rule__Platform__Group_9__0__Impl rule__Platform__Group_9__1
            {
            pushFollow(FOLLOW_rule__Platform__Group_9__0__Impl_in_rule__Platform__Group_9__05970);
            rule__Platform__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_9__1_in_rule__Platform__Group_9__05973);
            rule__Platform__Group_9__1();

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
    // $ANTLR end "rule__Platform__Group_9__0"


    // $ANTLR start "rule__Platform__Group_9__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3045:1: rule__Platform__Group_9__0__Impl : ( 'interfaces' ) ;
    public final void rule__Platform__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3049:1: ( ( 'interfaces' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3050:1: ( 'interfaces' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3050:1: ( 'interfaces' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3051:1: 'interfaces'
            {
             before(grammarAccess.getPlatformAccess().getInterfacesKeyword_9_0()); 
            match(input,29,FOLLOW_29_in_rule__Platform__Group_9__0__Impl6001); 
             after(grammarAccess.getPlatformAccess().getInterfacesKeyword_9_0()); 

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
    // $ANTLR end "rule__Platform__Group_9__0__Impl"


    // $ANTLR start "rule__Platform__Group_9__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3064:1: rule__Platform__Group_9__1 : rule__Platform__Group_9__1__Impl rule__Platform__Group_9__2 ;
    public final void rule__Platform__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3068:1: ( rule__Platform__Group_9__1__Impl rule__Platform__Group_9__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3069:2: rule__Platform__Group_9__1__Impl rule__Platform__Group_9__2
            {
            pushFollow(FOLLOW_rule__Platform__Group_9__1__Impl_in_rule__Platform__Group_9__16032);
            rule__Platform__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_9__2_in_rule__Platform__Group_9__16035);
            rule__Platform__Group_9__2();

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
    // $ANTLR end "rule__Platform__Group_9__1"


    // $ANTLR start "rule__Platform__Group_9__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3076:1: rule__Platform__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Platform__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3080:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3081:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3081:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3082:1: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,12,FOLLOW_12_in_rule__Platform__Group_9__1__Impl6063); 
             after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_9_1()); 

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
    // $ANTLR end "rule__Platform__Group_9__1__Impl"


    // $ANTLR start "rule__Platform__Group_9__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3095:1: rule__Platform__Group_9__2 : rule__Platform__Group_9__2__Impl rule__Platform__Group_9__3 ;
    public final void rule__Platform__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3099:1: ( rule__Platform__Group_9__2__Impl rule__Platform__Group_9__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3100:2: rule__Platform__Group_9__2__Impl rule__Platform__Group_9__3
            {
            pushFollow(FOLLOW_rule__Platform__Group_9__2__Impl_in_rule__Platform__Group_9__26094);
            rule__Platform__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_9__3_in_rule__Platform__Group_9__26097);
            rule__Platform__Group_9__3();

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
    // $ANTLR end "rule__Platform__Group_9__2"


    // $ANTLR start "rule__Platform__Group_9__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3107:1: rule__Platform__Group_9__2__Impl : ( ( rule__Platform__InterfacesAssignment_9_2 ) ) ;
    public final void rule__Platform__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3111:1: ( ( ( rule__Platform__InterfacesAssignment_9_2 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3112:1: ( ( rule__Platform__InterfacesAssignment_9_2 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3112:1: ( ( rule__Platform__InterfacesAssignment_9_2 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3113:1: ( rule__Platform__InterfacesAssignment_9_2 )
            {
             before(grammarAccess.getPlatformAccess().getInterfacesAssignment_9_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3114:1: ( rule__Platform__InterfacesAssignment_9_2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3114:2: rule__Platform__InterfacesAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Platform__InterfacesAssignment_9_2_in_rule__Platform__Group_9__2__Impl6124);
            rule__Platform__InterfacesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getInterfacesAssignment_9_2()); 

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
    // $ANTLR end "rule__Platform__Group_9__2__Impl"


    // $ANTLR start "rule__Platform__Group_9__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3124:1: rule__Platform__Group_9__3 : rule__Platform__Group_9__3__Impl rule__Platform__Group_9__4 ;
    public final void rule__Platform__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3128:1: ( rule__Platform__Group_9__3__Impl rule__Platform__Group_9__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3129:2: rule__Platform__Group_9__3__Impl rule__Platform__Group_9__4
            {
            pushFollow(FOLLOW_rule__Platform__Group_9__3__Impl_in_rule__Platform__Group_9__36154);
            rule__Platform__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_9__4_in_rule__Platform__Group_9__36157);
            rule__Platform__Group_9__4();

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
    // $ANTLR end "rule__Platform__Group_9__3"


    // $ANTLR start "rule__Platform__Group_9__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3136:1: rule__Platform__Group_9__3__Impl : ( ( rule__Platform__Group_9_3__0 )* ) ;
    public final void rule__Platform__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3140:1: ( ( ( rule__Platform__Group_9_3__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3141:1: ( ( rule__Platform__Group_9_3__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3141:1: ( ( rule__Platform__Group_9_3__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3142:1: ( rule__Platform__Group_9_3__0 )*
            {
             before(grammarAccess.getPlatformAccess().getGroup_9_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3143:1: ( rule__Platform__Group_9_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3143:2: rule__Platform__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Platform__Group_9_3__0_in_rule__Platform__Group_9__3__Impl6184);
            	    rule__Platform__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPlatformAccess().getGroup_9_3()); 

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
    // $ANTLR end "rule__Platform__Group_9__3__Impl"


    // $ANTLR start "rule__Platform__Group_9__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3153:1: rule__Platform__Group_9__4 : rule__Platform__Group_9__4__Impl ;
    public final void rule__Platform__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3157:1: ( rule__Platform__Group_9__4__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3158:2: rule__Platform__Group_9__4__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group_9__4__Impl_in_rule__Platform__Group_9__46215);
            rule__Platform__Group_9__4__Impl();

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
    // $ANTLR end "rule__Platform__Group_9__4"


    // $ANTLR start "rule__Platform__Group_9__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3164:1: rule__Platform__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Platform__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3168:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3169:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3169:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3170:1: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,14,FOLLOW_14_in_rule__Platform__Group_9__4__Impl6243); 
             after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_9_4()); 

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
    // $ANTLR end "rule__Platform__Group_9__4__Impl"


    // $ANTLR start "rule__Platform__Group_9_3__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3193:1: rule__Platform__Group_9_3__0 : rule__Platform__Group_9_3__0__Impl rule__Platform__Group_9_3__1 ;
    public final void rule__Platform__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3197:1: ( rule__Platform__Group_9_3__0__Impl rule__Platform__Group_9_3__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3198:2: rule__Platform__Group_9_3__0__Impl rule__Platform__Group_9_3__1
            {
            pushFollow(FOLLOW_rule__Platform__Group_9_3__0__Impl_in_rule__Platform__Group_9_3__06284);
            rule__Platform__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_9_3__1_in_rule__Platform__Group_9_3__06287);
            rule__Platform__Group_9_3__1();

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
    // $ANTLR end "rule__Platform__Group_9_3__0"


    // $ANTLR start "rule__Platform__Group_9_3__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3205:1: rule__Platform__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Platform__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3209:1: ( ( ',' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3210:1: ( ',' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3210:1: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3211:1: ','
            {
             before(grammarAccess.getPlatformAccess().getCommaKeyword_9_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Platform__Group_9_3__0__Impl6315); 
             after(grammarAccess.getPlatformAccess().getCommaKeyword_9_3_0()); 

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
    // $ANTLR end "rule__Platform__Group_9_3__0__Impl"


    // $ANTLR start "rule__Platform__Group_9_3__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3224:1: rule__Platform__Group_9_3__1 : rule__Platform__Group_9_3__1__Impl ;
    public final void rule__Platform__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3228:1: ( rule__Platform__Group_9_3__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3229:2: rule__Platform__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group_9_3__1__Impl_in_rule__Platform__Group_9_3__16346);
            rule__Platform__Group_9_3__1__Impl();

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
    // $ANTLR end "rule__Platform__Group_9_3__1"


    // $ANTLR start "rule__Platform__Group_9_3__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3235:1: rule__Platform__Group_9_3__1__Impl : ( ( rule__Platform__InterfacesAssignment_9_3_1 ) ) ;
    public final void rule__Platform__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3239:1: ( ( ( rule__Platform__InterfacesAssignment_9_3_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3240:1: ( ( rule__Platform__InterfacesAssignment_9_3_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3240:1: ( ( rule__Platform__InterfacesAssignment_9_3_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3241:1: ( rule__Platform__InterfacesAssignment_9_3_1 )
            {
             before(grammarAccess.getPlatformAccess().getInterfacesAssignment_9_3_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3242:1: ( rule__Platform__InterfacesAssignment_9_3_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3242:2: rule__Platform__InterfacesAssignment_9_3_1
            {
            pushFollow(FOLLOW_rule__Platform__InterfacesAssignment_9_3_1_in_rule__Platform__Group_9_3__1__Impl6373);
            rule__Platform__InterfacesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getInterfacesAssignment_9_3_1()); 

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
    // $ANTLR end "rule__Platform__Group_9_3__1__Impl"


    // $ANTLR start "rule__ComponentType__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3256:1: rule__ComponentType__Group__0 : rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1 ;
    public final void rule__ComponentType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3260:1: ( rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3261:2: rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1
            {
            pushFollow(FOLLOW_rule__ComponentType__Group__0__Impl_in_rule__ComponentType__Group__06407);
            rule__ComponentType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group__1_in_rule__ComponentType__Group__06410);
            rule__ComponentType__Group__1();

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
    // $ANTLR end "rule__ComponentType__Group__0"


    // $ANTLR start "rule__ComponentType__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3268:1: rule__ComponentType__Group__0__Impl : ( () ) ;
    public final void rule__ComponentType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3272:1: ( ( () ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3273:1: ( () )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3273:1: ( () )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3274:1: ()
            {
             before(grammarAccess.getComponentTypeAccess().getComponentTypeAction_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3275:1: ()
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3277:1: 
            {
            }

             after(grammarAccess.getComponentTypeAccess().getComponentTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group__0__Impl"


    // $ANTLR start "rule__ComponentType__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3287:1: rule__ComponentType__Group__1 : rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2 ;
    public final void rule__ComponentType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3291:1: ( rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3292:2: rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2
            {
            pushFollow(FOLLOW_rule__ComponentType__Group__1__Impl_in_rule__ComponentType__Group__16468);
            rule__ComponentType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group__2_in_rule__ComponentType__Group__16471);
            rule__ComponentType__Group__2();

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
    // $ANTLR end "rule__ComponentType__Group__1"


    // $ANTLR start "rule__ComponentType__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3299:1: rule__ComponentType__Group__1__Impl : ( 'ComponentType' ) ;
    public final void rule__ComponentType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3303:1: ( ( 'ComponentType' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3304:1: ( 'ComponentType' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3304:1: ( 'ComponentType' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3305:1: 'ComponentType'
            {
             before(grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__ComponentType__Group__1__Impl6499); 
             after(grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_1()); 

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
    // $ANTLR end "rule__ComponentType__Group__1__Impl"


    // $ANTLR start "rule__ComponentType__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3318:1: rule__ComponentType__Group__2 : rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3 ;
    public final void rule__ComponentType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3322:1: ( rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3323:2: rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3
            {
            pushFollow(FOLLOW_rule__ComponentType__Group__2__Impl_in_rule__ComponentType__Group__26530);
            rule__ComponentType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group__3_in_rule__ComponentType__Group__26533);
            rule__ComponentType__Group__3();

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
    // $ANTLR end "rule__ComponentType__Group__2"


    // $ANTLR start "rule__ComponentType__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3330:1: rule__ComponentType__Group__2__Impl : ( ( rule__ComponentType__NameAssignment_2 ) ) ;
    public final void rule__ComponentType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3334:1: ( ( ( rule__ComponentType__NameAssignment_2 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3335:1: ( ( rule__ComponentType__NameAssignment_2 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3335:1: ( ( rule__ComponentType__NameAssignment_2 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3336:1: ( rule__ComponentType__NameAssignment_2 )
            {
             before(grammarAccess.getComponentTypeAccess().getNameAssignment_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3337:1: ( rule__ComponentType__NameAssignment_2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3337:2: rule__ComponentType__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ComponentType__NameAssignment_2_in_rule__ComponentType__Group__2__Impl6560);
            rule__ComponentType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ComponentType__Group__2__Impl"


    // $ANTLR start "rule__ComponentType__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3347:1: rule__ComponentType__Group__3 : rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4 ;
    public final void rule__ComponentType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3351:1: ( rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3352:2: rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4
            {
            pushFollow(FOLLOW_rule__ComponentType__Group__3__Impl_in_rule__ComponentType__Group__36590);
            rule__ComponentType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group__4_in_rule__ComponentType__Group__36593);
            rule__ComponentType__Group__4();

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
    // $ANTLR end "rule__ComponentType__Group__3"


    // $ANTLR start "rule__ComponentType__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3359:1: rule__ComponentType__Group__3__Impl : ( '{' ) ;
    public final void rule__ComponentType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3363:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3364:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3364:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3365:1: '{'
            {
             before(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__ComponentType__Group__3__Impl6621); 
             after(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ComponentType__Group__3__Impl"


    // $ANTLR start "rule__ComponentType__Group__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3378:1: rule__ComponentType__Group__4 : rule__ComponentType__Group__4__Impl rule__ComponentType__Group__5 ;
    public final void rule__ComponentType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3382:1: ( rule__ComponentType__Group__4__Impl rule__ComponentType__Group__5 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3383:2: rule__ComponentType__Group__4__Impl rule__ComponentType__Group__5
            {
            pushFollow(FOLLOW_rule__ComponentType__Group__4__Impl_in_rule__ComponentType__Group__46652);
            rule__ComponentType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group__5_in_rule__ComponentType__Group__46655);
            rule__ComponentType__Group__5();

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
    // $ANTLR end "rule__ComponentType__Group__4"


    // $ANTLR start "rule__ComponentType__Group__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3390:1: rule__ComponentType__Group__4__Impl : ( ( rule__ComponentType__Group_4__0 )? ) ;
    public final void rule__ComponentType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3394:1: ( ( ( rule__ComponentType__Group_4__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3395:1: ( ( rule__ComponentType__Group_4__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3395:1: ( ( rule__ComponentType__Group_4__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3396:1: ( rule__ComponentType__Group_4__0 )?
            {
             before(grammarAccess.getComponentTypeAccess().getGroup_4()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3397:1: ( rule__ComponentType__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3397:2: rule__ComponentType__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ComponentType__Group_4__0_in_rule__ComponentType__Group__4__Impl6682);
                    rule__ComponentType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentTypeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ComponentType__Group__4__Impl"


    // $ANTLR start "rule__ComponentType__Group__5"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3407:1: rule__ComponentType__Group__5 : rule__ComponentType__Group__5__Impl rule__ComponentType__Group__6 ;
    public final void rule__ComponentType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3411:1: ( rule__ComponentType__Group__5__Impl rule__ComponentType__Group__6 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3412:2: rule__ComponentType__Group__5__Impl rule__ComponentType__Group__6
            {
            pushFollow(FOLLOW_rule__ComponentType__Group__5__Impl_in_rule__ComponentType__Group__56713);
            rule__ComponentType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group__6_in_rule__ComponentType__Group__56716);
            rule__ComponentType__Group__6();

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
    // $ANTLR end "rule__ComponentType__Group__5"


    // $ANTLR start "rule__ComponentType__Group__5__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3419:1: rule__ComponentType__Group__5__Impl : ( ( rule__ComponentType__Group_5__0 )? ) ;
    public final void rule__ComponentType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3423:1: ( ( ( rule__ComponentType__Group_5__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3424:1: ( ( rule__ComponentType__Group_5__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3424:1: ( ( rule__ComponentType__Group_5__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3425:1: ( rule__ComponentType__Group_5__0 )?
            {
             before(grammarAccess.getComponentTypeAccess().getGroup_5()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3426:1: ( rule__ComponentType__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3426:2: rule__ComponentType__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ComponentType__Group_5__0_in_rule__ComponentType__Group__5__Impl6743);
                    rule__ComponentType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentTypeAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ComponentType__Group__5__Impl"


    // $ANTLR start "rule__ComponentType__Group__6"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3436:1: rule__ComponentType__Group__6 : rule__ComponentType__Group__6__Impl rule__ComponentType__Group__7 ;
    public final void rule__ComponentType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3440:1: ( rule__ComponentType__Group__6__Impl rule__ComponentType__Group__7 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3441:2: rule__ComponentType__Group__6__Impl rule__ComponentType__Group__7
            {
            pushFollow(FOLLOW_rule__ComponentType__Group__6__Impl_in_rule__ComponentType__Group__66774);
            rule__ComponentType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group__7_in_rule__ComponentType__Group__66777);
            rule__ComponentType__Group__7();

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
    // $ANTLR end "rule__ComponentType__Group__6"


    // $ANTLR start "rule__ComponentType__Group__6__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3448:1: rule__ComponentType__Group__6__Impl : ( ( rule__ComponentType__Group_6__0 )? ) ;
    public final void rule__ComponentType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3452:1: ( ( ( rule__ComponentType__Group_6__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3453:1: ( ( rule__ComponentType__Group_6__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3453:1: ( ( rule__ComponentType__Group_6__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3454:1: ( rule__ComponentType__Group_6__0 )?
            {
             before(grammarAccess.getComponentTypeAccess().getGroup_6()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3455:1: ( rule__ComponentType__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3455:2: rule__ComponentType__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ComponentType__Group_6__0_in_rule__ComponentType__Group__6__Impl6804);
                    rule__ComponentType__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentTypeAccess().getGroup_6()); 

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
    // $ANTLR end "rule__ComponentType__Group__6__Impl"


    // $ANTLR start "rule__ComponentType__Group__7"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3465:1: rule__ComponentType__Group__7 : rule__ComponentType__Group__7__Impl rule__ComponentType__Group__8 ;
    public final void rule__ComponentType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3469:1: ( rule__ComponentType__Group__7__Impl rule__ComponentType__Group__8 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3470:2: rule__ComponentType__Group__7__Impl rule__ComponentType__Group__8
            {
            pushFollow(FOLLOW_rule__ComponentType__Group__7__Impl_in_rule__ComponentType__Group__76835);
            rule__ComponentType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group__8_in_rule__ComponentType__Group__76838);
            rule__ComponentType__Group__8();

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
    // $ANTLR end "rule__ComponentType__Group__7"


    // $ANTLR start "rule__ComponentType__Group__7__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3477:1: rule__ComponentType__Group__7__Impl : ( ( rule__ComponentType__Group_7__0 )? ) ;
    public final void rule__ComponentType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3481:1: ( ( ( rule__ComponentType__Group_7__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3482:1: ( ( rule__ComponentType__Group_7__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3482:1: ( ( rule__ComponentType__Group_7__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3483:1: ( rule__ComponentType__Group_7__0 )?
            {
             before(grammarAccess.getComponentTypeAccess().getGroup_7()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3484:1: ( rule__ComponentType__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3484:2: rule__ComponentType__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__ComponentType__Group_7__0_in_rule__ComponentType__Group__7__Impl6865);
                    rule__ComponentType__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentTypeAccess().getGroup_7()); 

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
    // $ANTLR end "rule__ComponentType__Group__7__Impl"


    // $ANTLR start "rule__ComponentType__Group__8"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3494:1: rule__ComponentType__Group__8 : rule__ComponentType__Group__8__Impl ;
    public final void rule__ComponentType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3498:1: ( rule__ComponentType__Group__8__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3499:2: rule__ComponentType__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ComponentType__Group__8__Impl_in_rule__ComponentType__Group__86896);
            rule__ComponentType__Group__8__Impl();

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
    // $ANTLR end "rule__ComponentType__Group__8"


    // $ANTLR start "rule__ComponentType__Group__8__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3505:1: rule__ComponentType__Group__8__Impl : ( '}' ) ;
    public final void rule__ComponentType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3509:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3510:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3510:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3511:1: '}'
            {
             before(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_14_in_rule__ComponentType__Group__8__Impl6924); 
             after(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__ComponentType__Group__8__Impl"


    // $ANTLR start "rule__ComponentType__Group_4__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3542:1: rule__ComponentType__Group_4__0 : rule__ComponentType__Group_4__0__Impl rule__ComponentType__Group_4__1 ;
    public final void rule__ComponentType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3546:1: ( rule__ComponentType__Group_4__0__Impl rule__ComponentType__Group_4__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3547:2: rule__ComponentType__Group_4__0__Impl rule__ComponentType__Group_4__1
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_4__0__Impl_in_rule__ComponentType__Group_4__06973);
            rule__ComponentType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_4__1_in_rule__ComponentType__Group_4__06976);
            rule__ComponentType__Group_4__1();

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
    // $ANTLR end "rule__ComponentType__Group_4__0"


    // $ANTLR start "rule__ComponentType__Group_4__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3554:1: rule__ComponentType__Group_4__0__Impl : ( 'providedInterfaces' ) ;
    public final void rule__ComponentType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3558:1: ( ( 'providedInterfaces' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3559:1: ( 'providedInterfaces' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3559:1: ( 'providedInterfaces' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3560:1: 'providedInterfaces'
            {
             before(grammarAccess.getComponentTypeAccess().getProvidedInterfacesKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__ComponentType__Group_4__0__Impl7004); 
             after(grammarAccess.getComponentTypeAccess().getProvidedInterfacesKeyword_4_0()); 

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
    // $ANTLR end "rule__ComponentType__Group_4__0__Impl"


    // $ANTLR start "rule__ComponentType__Group_4__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3573:1: rule__ComponentType__Group_4__1 : rule__ComponentType__Group_4__1__Impl rule__ComponentType__Group_4__2 ;
    public final void rule__ComponentType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3577:1: ( rule__ComponentType__Group_4__1__Impl rule__ComponentType__Group_4__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3578:2: rule__ComponentType__Group_4__1__Impl rule__ComponentType__Group_4__2
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_4__1__Impl_in_rule__ComponentType__Group_4__17035);
            rule__ComponentType__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_4__2_in_rule__ComponentType__Group_4__17038);
            rule__ComponentType__Group_4__2();

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
    // $ANTLR end "rule__ComponentType__Group_4__1"


    // $ANTLR start "rule__ComponentType__Group_4__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3585:1: rule__ComponentType__Group_4__1__Impl : ( '(' ) ;
    public final void rule__ComponentType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3589:1: ( ( '(' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3590:1: ( '(' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3590:1: ( '(' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3591:1: '('
            {
             before(grammarAccess.getComponentTypeAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,32,FOLLOW_32_in_rule__ComponentType__Group_4__1__Impl7066); 
             after(grammarAccess.getComponentTypeAccess().getLeftParenthesisKeyword_4_1()); 

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
    // $ANTLR end "rule__ComponentType__Group_4__1__Impl"


    // $ANTLR start "rule__ComponentType__Group_4__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3604:1: rule__ComponentType__Group_4__2 : rule__ComponentType__Group_4__2__Impl rule__ComponentType__Group_4__3 ;
    public final void rule__ComponentType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3608:1: ( rule__ComponentType__Group_4__2__Impl rule__ComponentType__Group_4__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3609:2: rule__ComponentType__Group_4__2__Impl rule__ComponentType__Group_4__3
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_4__2__Impl_in_rule__ComponentType__Group_4__27097);
            rule__ComponentType__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_4__3_in_rule__ComponentType__Group_4__27100);
            rule__ComponentType__Group_4__3();

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
    // $ANTLR end "rule__ComponentType__Group_4__2"


    // $ANTLR start "rule__ComponentType__Group_4__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3616:1: rule__ComponentType__Group_4__2__Impl : ( ( rule__ComponentType__ProvidedInterfacesAssignment_4_2 ) ) ;
    public final void rule__ComponentType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3620:1: ( ( ( rule__ComponentType__ProvidedInterfacesAssignment_4_2 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3621:1: ( ( rule__ComponentType__ProvidedInterfacesAssignment_4_2 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3621:1: ( ( rule__ComponentType__ProvidedInterfacesAssignment_4_2 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3622:1: ( rule__ComponentType__ProvidedInterfacesAssignment_4_2 )
            {
             before(grammarAccess.getComponentTypeAccess().getProvidedInterfacesAssignment_4_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3623:1: ( rule__ComponentType__ProvidedInterfacesAssignment_4_2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3623:2: rule__ComponentType__ProvidedInterfacesAssignment_4_2
            {
            pushFollow(FOLLOW_rule__ComponentType__ProvidedInterfacesAssignment_4_2_in_rule__ComponentType__Group_4__2__Impl7127);
            rule__ComponentType__ProvidedInterfacesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getProvidedInterfacesAssignment_4_2()); 

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
    // $ANTLR end "rule__ComponentType__Group_4__2__Impl"


    // $ANTLR start "rule__ComponentType__Group_4__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3633:1: rule__ComponentType__Group_4__3 : rule__ComponentType__Group_4__3__Impl rule__ComponentType__Group_4__4 ;
    public final void rule__ComponentType__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3637:1: ( rule__ComponentType__Group_4__3__Impl rule__ComponentType__Group_4__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3638:2: rule__ComponentType__Group_4__3__Impl rule__ComponentType__Group_4__4
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_4__3__Impl_in_rule__ComponentType__Group_4__37157);
            rule__ComponentType__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_4__4_in_rule__ComponentType__Group_4__37160);
            rule__ComponentType__Group_4__4();

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
    // $ANTLR end "rule__ComponentType__Group_4__3"


    // $ANTLR start "rule__ComponentType__Group_4__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3645:1: rule__ComponentType__Group_4__3__Impl : ( ( rule__ComponentType__Group_4_3__0 )* ) ;
    public final void rule__ComponentType__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3649:1: ( ( ( rule__ComponentType__Group_4_3__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3650:1: ( ( rule__ComponentType__Group_4_3__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3650:1: ( ( rule__ComponentType__Group_4_3__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3651:1: ( rule__ComponentType__Group_4_3__0 )*
            {
             before(grammarAccess.getComponentTypeAccess().getGroup_4_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3652:1: ( rule__ComponentType__Group_4_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3652:2: rule__ComponentType__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ComponentType__Group_4_3__0_in_rule__ComponentType__Group_4__3__Impl7187);
            	    rule__ComponentType__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getComponentTypeAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__ComponentType__Group_4__3__Impl"


    // $ANTLR start "rule__ComponentType__Group_4__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3662:1: rule__ComponentType__Group_4__4 : rule__ComponentType__Group_4__4__Impl ;
    public final void rule__ComponentType__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3666:1: ( rule__ComponentType__Group_4__4__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3667:2: rule__ComponentType__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_4__4__Impl_in_rule__ComponentType__Group_4__47218);
            rule__ComponentType__Group_4__4__Impl();

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
    // $ANTLR end "rule__ComponentType__Group_4__4"


    // $ANTLR start "rule__ComponentType__Group_4__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3673:1: rule__ComponentType__Group_4__4__Impl : ( ')' ) ;
    public final void rule__ComponentType__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3677:1: ( ( ')' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3678:1: ( ')' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3678:1: ( ')' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3679:1: ')'
            {
             before(grammarAccess.getComponentTypeAccess().getRightParenthesisKeyword_4_4()); 
            match(input,33,FOLLOW_33_in_rule__ComponentType__Group_4__4__Impl7246); 
             after(grammarAccess.getComponentTypeAccess().getRightParenthesisKeyword_4_4()); 

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
    // $ANTLR end "rule__ComponentType__Group_4__4__Impl"


    // $ANTLR start "rule__ComponentType__Group_4_3__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3702:1: rule__ComponentType__Group_4_3__0 : rule__ComponentType__Group_4_3__0__Impl rule__ComponentType__Group_4_3__1 ;
    public final void rule__ComponentType__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3706:1: ( rule__ComponentType__Group_4_3__0__Impl rule__ComponentType__Group_4_3__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3707:2: rule__ComponentType__Group_4_3__0__Impl rule__ComponentType__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_4_3__0__Impl_in_rule__ComponentType__Group_4_3__07287);
            rule__ComponentType__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_4_3__1_in_rule__ComponentType__Group_4_3__07290);
            rule__ComponentType__Group_4_3__1();

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
    // $ANTLR end "rule__ComponentType__Group_4_3__0"


    // $ANTLR start "rule__ComponentType__Group_4_3__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3714:1: rule__ComponentType__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentType__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3718:1: ( ( ',' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3719:1: ( ',' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3719:1: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3720:1: ','
            {
             before(grammarAccess.getComponentTypeAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FOLLOW_16_in_rule__ComponentType__Group_4_3__0__Impl7318); 
             after(grammarAccess.getComponentTypeAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__ComponentType__Group_4_3__0__Impl"


    // $ANTLR start "rule__ComponentType__Group_4_3__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3733:1: rule__ComponentType__Group_4_3__1 : rule__ComponentType__Group_4_3__1__Impl ;
    public final void rule__ComponentType__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3737:1: ( rule__ComponentType__Group_4_3__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3738:2: rule__ComponentType__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_4_3__1__Impl_in_rule__ComponentType__Group_4_3__17349);
            rule__ComponentType__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__ComponentType__Group_4_3__1"


    // $ANTLR start "rule__ComponentType__Group_4_3__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3744:1: rule__ComponentType__Group_4_3__1__Impl : ( ( rule__ComponentType__ProvidedInterfacesAssignment_4_3_1 ) ) ;
    public final void rule__ComponentType__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3748:1: ( ( ( rule__ComponentType__ProvidedInterfacesAssignment_4_3_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3749:1: ( ( rule__ComponentType__ProvidedInterfacesAssignment_4_3_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3749:1: ( ( rule__ComponentType__ProvidedInterfacesAssignment_4_3_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3750:1: ( rule__ComponentType__ProvidedInterfacesAssignment_4_3_1 )
            {
             before(grammarAccess.getComponentTypeAccess().getProvidedInterfacesAssignment_4_3_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3751:1: ( rule__ComponentType__ProvidedInterfacesAssignment_4_3_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3751:2: rule__ComponentType__ProvidedInterfacesAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__ComponentType__ProvidedInterfacesAssignment_4_3_1_in_rule__ComponentType__Group_4_3__1__Impl7376);
            rule__ComponentType__ProvidedInterfacesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getProvidedInterfacesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__ComponentType__Group_4_3__1__Impl"


    // $ANTLR start "rule__ComponentType__Group_5__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3765:1: rule__ComponentType__Group_5__0 : rule__ComponentType__Group_5__0__Impl rule__ComponentType__Group_5__1 ;
    public final void rule__ComponentType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3769:1: ( rule__ComponentType__Group_5__0__Impl rule__ComponentType__Group_5__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3770:2: rule__ComponentType__Group_5__0__Impl rule__ComponentType__Group_5__1
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_5__0__Impl_in_rule__ComponentType__Group_5__07410);
            rule__ComponentType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_5__1_in_rule__ComponentType__Group_5__07413);
            rule__ComponentType__Group_5__1();

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
    // $ANTLR end "rule__ComponentType__Group_5__0"


    // $ANTLR start "rule__ComponentType__Group_5__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3777:1: rule__ComponentType__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__ComponentType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3781:1: ( ( 'description' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3782:1: ( 'description' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3782:1: ( 'description' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3783:1: 'description'
            {
             before(grammarAccess.getComponentTypeAccess().getDescriptionKeyword_5_0()); 
            match(input,15,FOLLOW_15_in_rule__ComponentType__Group_5__0__Impl7441); 
             after(grammarAccess.getComponentTypeAccess().getDescriptionKeyword_5_0()); 

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
    // $ANTLR end "rule__ComponentType__Group_5__0__Impl"


    // $ANTLR start "rule__ComponentType__Group_5__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3796:1: rule__ComponentType__Group_5__1 : rule__ComponentType__Group_5__1__Impl ;
    public final void rule__ComponentType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3800:1: ( rule__ComponentType__Group_5__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3801:2: rule__ComponentType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_5__1__Impl_in_rule__ComponentType__Group_5__17472);
            rule__ComponentType__Group_5__1__Impl();

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
    // $ANTLR end "rule__ComponentType__Group_5__1"


    // $ANTLR start "rule__ComponentType__Group_5__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3807:1: rule__ComponentType__Group_5__1__Impl : ( ( rule__ComponentType__DescriptionAssignment_5_1 ) ) ;
    public final void rule__ComponentType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3811:1: ( ( ( rule__ComponentType__DescriptionAssignment_5_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3812:1: ( ( rule__ComponentType__DescriptionAssignment_5_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3812:1: ( ( rule__ComponentType__DescriptionAssignment_5_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3813:1: ( rule__ComponentType__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getComponentTypeAccess().getDescriptionAssignment_5_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3814:1: ( rule__ComponentType__DescriptionAssignment_5_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3814:2: rule__ComponentType__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ComponentType__DescriptionAssignment_5_1_in_rule__ComponentType__Group_5__1__Impl7499);
            rule__ComponentType__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getDescriptionAssignment_5_1()); 

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
    // $ANTLR end "rule__ComponentType__Group_5__1__Impl"


    // $ANTLR start "rule__ComponentType__Group_6__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3828:1: rule__ComponentType__Group_6__0 : rule__ComponentType__Group_6__0__Impl rule__ComponentType__Group_6__1 ;
    public final void rule__ComponentType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3832:1: ( rule__ComponentType__Group_6__0__Impl rule__ComponentType__Group_6__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3833:2: rule__ComponentType__Group_6__0__Impl rule__ComponentType__Group_6__1
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_6__0__Impl_in_rule__ComponentType__Group_6__07533);
            rule__ComponentType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_6__1_in_rule__ComponentType__Group_6__07536);
            rule__ComponentType__Group_6__1();

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
    // $ANTLR end "rule__ComponentType__Group_6__0"


    // $ANTLR start "rule__ComponentType__Group_6__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3840:1: rule__ComponentType__Group_6__0__Impl : ( 'ports' ) ;
    public final void rule__ComponentType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3844:1: ( ( 'ports' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3845:1: ( 'ports' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3845:1: ( 'ports' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3846:1: 'ports'
            {
             before(grammarAccess.getComponentTypeAccess().getPortsKeyword_6_0()); 
            match(input,34,FOLLOW_34_in_rule__ComponentType__Group_6__0__Impl7564); 
             after(grammarAccess.getComponentTypeAccess().getPortsKeyword_6_0()); 

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
    // $ANTLR end "rule__ComponentType__Group_6__0__Impl"


    // $ANTLR start "rule__ComponentType__Group_6__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3859:1: rule__ComponentType__Group_6__1 : rule__ComponentType__Group_6__1__Impl rule__ComponentType__Group_6__2 ;
    public final void rule__ComponentType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3863:1: ( rule__ComponentType__Group_6__1__Impl rule__ComponentType__Group_6__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3864:2: rule__ComponentType__Group_6__1__Impl rule__ComponentType__Group_6__2
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_6__1__Impl_in_rule__ComponentType__Group_6__17595);
            rule__ComponentType__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_6__2_in_rule__ComponentType__Group_6__17598);
            rule__ComponentType__Group_6__2();

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
    // $ANTLR end "rule__ComponentType__Group_6__1"


    // $ANTLR start "rule__ComponentType__Group_6__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3871:1: rule__ComponentType__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ComponentType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3875:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3876:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3876:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3877:1: '{'
            {
             before(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_12_in_rule__ComponentType__Group_6__1__Impl7626); 
             after(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__ComponentType__Group_6__1__Impl"


    // $ANTLR start "rule__ComponentType__Group_6__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3890:1: rule__ComponentType__Group_6__2 : rule__ComponentType__Group_6__2__Impl rule__ComponentType__Group_6__3 ;
    public final void rule__ComponentType__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3894:1: ( rule__ComponentType__Group_6__2__Impl rule__ComponentType__Group_6__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3895:2: rule__ComponentType__Group_6__2__Impl rule__ComponentType__Group_6__3
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_6__2__Impl_in_rule__ComponentType__Group_6__27657);
            rule__ComponentType__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_6__3_in_rule__ComponentType__Group_6__27660);
            rule__ComponentType__Group_6__3();

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
    // $ANTLR end "rule__ComponentType__Group_6__2"


    // $ANTLR start "rule__ComponentType__Group_6__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3902:1: rule__ComponentType__Group_6__2__Impl : ( ( rule__ComponentType__PortsAssignment_6_2 ) ) ;
    public final void rule__ComponentType__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3906:1: ( ( ( rule__ComponentType__PortsAssignment_6_2 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3907:1: ( ( rule__ComponentType__PortsAssignment_6_2 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3907:1: ( ( rule__ComponentType__PortsAssignment_6_2 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3908:1: ( rule__ComponentType__PortsAssignment_6_2 )
            {
             before(grammarAccess.getComponentTypeAccess().getPortsAssignment_6_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3909:1: ( rule__ComponentType__PortsAssignment_6_2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3909:2: rule__ComponentType__PortsAssignment_6_2
            {
            pushFollow(FOLLOW_rule__ComponentType__PortsAssignment_6_2_in_rule__ComponentType__Group_6__2__Impl7687);
            rule__ComponentType__PortsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getPortsAssignment_6_2()); 

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
    // $ANTLR end "rule__ComponentType__Group_6__2__Impl"


    // $ANTLR start "rule__ComponentType__Group_6__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3919:1: rule__ComponentType__Group_6__3 : rule__ComponentType__Group_6__3__Impl rule__ComponentType__Group_6__4 ;
    public final void rule__ComponentType__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3923:1: ( rule__ComponentType__Group_6__3__Impl rule__ComponentType__Group_6__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3924:2: rule__ComponentType__Group_6__3__Impl rule__ComponentType__Group_6__4
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_6__3__Impl_in_rule__ComponentType__Group_6__37717);
            rule__ComponentType__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_6__4_in_rule__ComponentType__Group_6__37720);
            rule__ComponentType__Group_6__4();

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
    // $ANTLR end "rule__ComponentType__Group_6__3"


    // $ANTLR start "rule__ComponentType__Group_6__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3931:1: rule__ComponentType__Group_6__3__Impl : ( ( rule__ComponentType__Group_6_3__0 )* ) ;
    public final void rule__ComponentType__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3935:1: ( ( ( rule__ComponentType__Group_6_3__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3936:1: ( ( rule__ComponentType__Group_6_3__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3936:1: ( ( rule__ComponentType__Group_6_3__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3937:1: ( rule__ComponentType__Group_6_3__0 )*
            {
             before(grammarAccess.getComponentTypeAccess().getGroup_6_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3938:1: ( rule__ComponentType__Group_6_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3938:2: rule__ComponentType__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ComponentType__Group_6_3__0_in_rule__ComponentType__Group_6__3__Impl7747);
            	    rule__ComponentType__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getComponentTypeAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__ComponentType__Group_6__3__Impl"


    // $ANTLR start "rule__ComponentType__Group_6__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3948:1: rule__ComponentType__Group_6__4 : rule__ComponentType__Group_6__4__Impl ;
    public final void rule__ComponentType__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3952:1: ( rule__ComponentType__Group_6__4__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3953:2: rule__ComponentType__Group_6__4__Impl
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_6__4__Impl_in_rule__ComponentType__Group_6__47778);
            rule__ComponentType__Group_6__4__Impl();

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
    // $ANTLR end "rule__ComponentType__Group_6__4"


    // $ANTLR start "rule__ComponentType__Group_6__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3959:1: rule__ComponentType__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ComponentType__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3963:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3964:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3964:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3965:1: '}'
            {
             before(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,14,FOLLOW_14_in_rule__ComponentType__Group_6__4__Impl7806); 
             after(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__ComponentType__Group_6__4__Impl"


    // $ANTLR start "rule__ComponentType__Group_6_3__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3988:1: rule__ComponentType__Group_6_3__0 : rule__ComponentType__Group_6_3__0__Impl rule__ComponentType__Group_6_3__1 ;
    public final void rule__ComponentType__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3992:1: ( rule__ComponentType__Group_6_3__0__Impl rule__ComponentType__Group_6_3__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:3993:2: rule__ComponentType__Group_6_3__0__Impl rule__ComponentType__Group_6_3__1
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_6_3__0__Impl_in_rule__ComponentType__Group_6_3__07847);
            rule__ComponentType__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_6_3__1_in_rule__ComponentType__Group_6_3__07850);
            rule__ComponentType__Group_6_3__1();

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
    // $ANTLR end "rule__ComponentType__Group_6_3__0"


    // $ANTLR start "rule__ComponentType__Group_6_3__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4000:1: rule__ComponentType__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentType__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4004:1: ( ( ',' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4005:1: ( ',' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4005:1: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4006:1: ','
            {
             before(grammarAccess.getComponentTypeAccess().getCommaKeyword_6_3_0()); 
            match(input,16,FOLLOW_16_in_rule__ComponentType__Group_6_3__0__Impl7878); 
             after(grammarAccess.getComponentTypeAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__ComponentType__Group_6_3__0__Impl"


    // $ANTLR start "rule__ComponentType__Group_6_3__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4019:1: rule__ComponentType__Group_6_3__1 : rule__ComponentType__Group_6_3__1__Impl ;
    public final void rule__ComponentType__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4023:1: ( rule__ComponentType__Group_6_3__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4024:2: rule__ComponentType__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_6_3__1__Impl_in_rule__ComponentType__Group_6_3__17909);
            rule__ComponentType__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__ComponentType__Group_6_3__1"


    // $ANTLR start "rule__ComponentType__Group_6_3__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4030:1: rule__ComponentType__Group_6_3__1__Impl : ( ( rule__ComponentType__PortsAssignment_6_3_1 ) ) ;
    public final void rule__ComponentType__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4034:1: ( ( ( rule__ComponentType__PortsAssignment_6_3_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4035:1: ( ( rule__ComponentType__PortsAssignment_6_3_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4035:1: ( ( rule__ComponentType__PortsAssignment_6_3_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4036:1: ( rule__ComponentType__PortsAssignment_6_3_1 )
            {
             before(grammarAccess.getComponentTypeAccess().getPortsAssignment_6_3_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4037:1: ( rule__ComponentType__PortsAssignment_6_3_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4037:2: rule__ComponentType__PortsAssignment_6_3_1
            {
            pushFollow(FOLLOW_rule__ComponentType__PortsAssignment_6_3_1_in_rule__ComponentType__Group_6_3__1__Impl7936);
            rule__ComponentType__PortsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getPortsAssignment_6_3_1()); 

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
    // $ANTLR end "rule__ComponentType__Group_6_3__1__Impl"


    // $ANTLR start "rule__ComponentType__Group_7__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4051:1: rule__ComponentType__Group_7__0 : rule__ComponentType__Group_7__0__Impl rule__ComponentType__Group_7__1 ;
    public final void rule__ComponentType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4055:1: ( rule__ComponentType__Group_7__0__Impl rule__ComponentType__Group_7__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4056:2: rule__ComponentType__Group_7__0__Impl rule__ComponentType__Group_7__1
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_7__0__Impl_in_rule__ComponentType__Group_7__07970);
            rule__ComponentType__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_7__1_in_rule__ComponentType__Group_7__07973);
            rule__ComponentType__Group_7__1();

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
    // $ANTLR end "rule__ComponentType__Group_7__0"


    // $ANTLR start "rule__ComponentType__Group_7__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4063:1: rule__ComponentType__Group_7__0__Impl : ( 'parameters' ) ;
    public final void rule__ComponentType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4067:1: ( ( 'parameters' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4068:1: ( 'parameters' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4068:1: ( 'parameters' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4069:1: 'parameters'
            {
             before(grammarAccess.getComponentTypeAccess().getParametersKeyword_7_0()); 
            match(input,35,FOLLOW_35_in_rule__ComponentType__Group_7__0__Impl8001); 
             after(grammarAccess.getComponentTypeAccess().getParametersKeyword_7_0()); 

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
    // $ANTLR end "rule__ComponentType__Group_7__0__Impl"


    // $ANTLR start "rule__ComponentType__Group_7__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4082:1: rule__ComponentType__Group_7__1 : rule__ComponentType__Group_7__1__Impl rule__ComponentType__Group_7__2 ;
    public final void rule__ComponentType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4086:1: ( rule__ComponentType__Group_7__1__Impl rule__ComponentType__Group_7__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4087:2: rule__ComponentType__Group_7__1__Impl rule__ComponentType__Group_7__2
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_7__1__Impl_in_rule__ComponentType__Group_7__18032);
            rule__ComponentType__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_7__2_in_rule__ComponentType__Group_7__18035);
            rule__ComponentType__Group_7__2();

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
    // $ANTLR end "rule__ComponentType__Group_7__1"


    // $ANTLR start "rule__ComponentType__Group_7__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4094:1: rule__ComponentType__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ComponentType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4098:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4099:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4099:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4100:1: '{'
            {
             before(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_12_in_rule__ComponentType__Group_7__1__Impl8063); 
             after(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__ComponentType__Group_7__1__Impl"


    // $ANTLR start "rule__ComponentType__Group_7__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4113:1: rule__ComponentType__Group_7__2 : rule__ComponentType__Group_7__2__Impl rule__ComponentType__Group_7__3 ;
    public final void rule__ComponentType__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4117:1: ( rule__ComponentType__Group_7__2__Impl rule__ComponentType__Group_7__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4118:2: rule__ComponentType__Group_7__2__Impl rule__ComponentType__Group_7__3
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_7__2__Impl_in_rule__ComponentType__Group_7__28094);
            rule__ComponentType__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_7__3_in_rule__ComponentType__Group_7__28097);
            rule__ComponentType__Group_7__3();

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
    // $ANTLR end "rule__ComponentType__Group_7__2"


    // $ANTLR start "rule__ComponentType__Group_7__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4125:1: rule__ComponentType__Group_7__2__Impl : ( ( rule__ComponentType__ParametersAssignment_7_2 ) ) ;
    public final void rule__ComponentType__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4129:1: ( ( ( rule__ComponentType__ParametersAssignment_7_2 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4130:1: ( ( rule__ComponentType__ParametersAssignment_7_2 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4130:1: ( ( rule__ComponentType__ParametersAssignment_7_2 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4131:1: ( rule__ComponentType__ParametersAssignment_7_2 )
            {
             before(grammarAccess.getComponentTypeAccess().getParametersAssignment_7_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4132:1: ( rule__ComponentType__ParametersAssignment_7_2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4132:2: rule__ComponentType__ParametersAssignment_7_2
            {
            pushFollow(FOLLOW_rule__ComponentType__ParametersAssignment_7_2_in_rule__ComponentType__Group_7__2__Impl8124);
            rule__ComponentType__ParametersAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getParametersAssignment_7_2()); 

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
    // $ANTLR end "rule__ComponentType__Group_7__2__Impl"


    // $ANTLR start "rule__ComponentType__Group_7__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4142:1: rule__ComponentType__Group_7__3 : rule__ComponentType__Group_7__3__Impl rule__ComponentType__Group_7__4 ;
    public final void rule__ComponentType__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4146:1: ( rule__ComponentType__Group_7__3__Impl rule__ComponentType__Group_7__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4147:2: rule__ComponentType__Group_7__3__Impl rule__ComponentType__Group_7__4
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_7__3__Impl_in_rule__ComponentType__Group_7__38154);
            rule__ComponentType__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_7__4_in_rule__ComponentType__Group_7__38157);
            rule__ComponentType__Group_7__4();

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
    // $ANTLR end "rule__ComponentType__Group_7__3"


    // $ANTLR start "rule__ComponentType__Group_7__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4154:1: rule__ComponentType__Group_7__3__Impl : ( ( rule__ComponentType__Group_7_3__0 )* ) ;
    public final void rule__ComponentType__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4158:1: ( ( ( rule__ComponentType__Group_7_3__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4159:1: ( ( rule__ComponentType__Group_7_3__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4159:1: ( ( rule__ComponentType__Group_7_3__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4160:1: ( rule__ComponentType__Group_7_3__0 )*
            {
             before(grammarAccess.getComponentTypeAccess().getGroup_7_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4161:1: ( rule__ComponentType__Group_7_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4161:2: rule__ComponentType__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ComponentType__Group_7_3__0_in_rule__ComponentType__Group_7__3__Impl8184);
            	    rule__ComponentType__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getComponentTypeAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__ComponentType__Group_7__3__Impl"


    // $ANTLR start "rule__ComponentType__Group_7__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4171:1: rule__ComponentType__Group_7__4 : rule__ComponentType__Group_7__4__Impl ;
    public final void rule__ComponentType__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4175:1: ( rule__ComponentType__Group_7__4__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4176:2: rule__ComponentType__Group_7__4__Impl
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_7__4__Impl_in_rule__ComponentType__Group_7__48215);
            rule__ComponentType__Group_7__4__Impl();

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
    // $ANTLR end "rule__ComponentType__Group_7__4"


    // $ANTLR start "rule__ComponentType__Group_7__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4182:1: rule__ComponentType__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ComponentType__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4186:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4187:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4187:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4188:1: '}'
            {
             before(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,14,FOLLOW_14_in_rule__ComponentType__Group_7__4__Impl8243); 
             after(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__ComponentType__Group_7__4__Impl"


    // $ANTLR start "rule__ComponentType__Group_7_3__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4211:1: rule__ComponentType__Group_7_3__0 : rule__ComponentType__Group_7_3__0__Impl rule__ComponentType__Group_7_3__1 ;
    public final void rule__ComponentType__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4215:1: ( rule__ComponentType__Group_7_3__0__Impl rule__ComponentType__Group_7_3__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4216:2: rule__ComponentType__Group_7_3__0__Impl rule__ComponentType__Group_7_3__1
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_7_3__0__Impl_in_rule__ComponentType__Group_7_3__08284);
            rule__ComponentType__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComponentType__Group_7_3__1_in_rule__ComponentType__Group_7_3__08287);
            rule__ComponentType__Group_7_3__1();

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
    // $ANTLR end "rule__ComponentType__Group_7_3__0"


    // $ANTLR start "rule__ComponentType__Group_7_3__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4223:1: rule__ComponentType__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentType__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4227:1: ( ( ',' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4228:1: ( ',' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4228:1: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4229:1: ','
            {
             before(grammarAccess.getComponentTypeAccess().getCommaKeyword_7_3_0()); 
            match(input,16,FOLLOW_16_in_rule__ComponentType__Group_7_3__0__Impl8315); 
             after(grammarAccess.getComponentTypeAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__ComponentType__Group_7_3__0__Impl"


    // $ANTLR start "rule__ComponentType__Group_7_3__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4242:1: rule__ComponentType__Group_7_3__1 : rule__ComponentType__Group_7_3__1__Impl ;
    public final void rule__ComponentType__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4246:1: ( rule__ComponentType__Group_7_3__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4247:2: rule__ComponentType__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ComponentType__Group_7_3__1__Impl_in_rule__ComponentType__Group_7_3__18346);
            rule__ComponentType__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__ComponentType__Group_7_3__1"


    // $ANTLR start "rule__ComponentType__Group_7_3__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4253:1: rule__ComponentType__Group_7_3__1__Impl : ( ( rule__ComponentType__ParametersAssignment_7_3_1 ) ) ;
    public final void rule__ComponentType__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4257:1: ( ( ( rule__ComponentType__ParametersAssignment_7_3_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4258:1: ( ( rule__ComponentType__ParametersAssignment_7_3_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4258:1: ( ( rule__ComponentType__ParametersAssignment_7_3_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4259:1: ( rule__ComponentType__ParametersAssignment_7_3_1 )
            {
             before(grammarAccess.getComponentTypeAccess().getParametersAssignment_7_3_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4260:1: ( rule__ComponentType__ParametersAssignment_7_3_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4260:2: rule__ComponentType__ParametersAssignment_7_3_1
            {
            pushFollow(FOLLOW_rule__ComponentType__ParametersAssignment_7_3_1_in_rule__ComponentType__Group_7_3__1__Impl8373);
            rule__ComponentType__ParametersAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getParametersAssignment_7_3_1()); 

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
    // $ANTLR end "rule__ComponentType__Group_7_3__1__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4274:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4278:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4279:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__08407);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__08410);
            rule__Interface__Group__1();

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
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4286:1: rule__Interface__Group__0__Impl : ( () ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4290:1: ( ( () ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4291:1: ( () )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4291:1: ( () )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4292:1: ()
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceAction_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4293:1: ()
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4295:1: 
            {
            }

             after(grammarAccess.getInterfaceAccess().getInterfaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4305:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4309:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4310:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__18468);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__18471);
            rule__Interface__Group__2();

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
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4317:1: rule__Interface__Group__1__Impl : ( 'Interface' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4321:1: ( ( 'Interface' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4322:1: ( 'Interface' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4322:1: ( 'Interface' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4323:1: 'Interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__Interface__Group__1__Impl8499); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 

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
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4336:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4340:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4341:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__28530);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__28533);
            rule__Interface__Group__3();

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
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4348:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__NameAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4352:1: ( ( ( rule__Interface__NameAssignment_2 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4353:1: ( ( rule__Interface__NameAssignment_2 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4353:1: ( ( rule__Interface__NameAssignment_2 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4354:1: ( rule__Interface__NameAssignment_2 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4355:1: ( rule__Interface__NameAssignment_2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4355:2: rule__Interface__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl8560);
            rule__Interface__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4365:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4369:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4370:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__38590);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__38593);
            rule__Interface__Group__4();

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
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4377:1: rule__Interface__Group__3__Impl : ( '{' ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4381:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4382:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4382:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4383:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Interface__Group__3__Impl8621); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4396:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4400:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4401:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__48652);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__48655);
            rule__Interface__Group__5();

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
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4408:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__Group_4__0 )? ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4412:1: ( ( ( rule__Interface__Group_4__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4413:1: ( ( rule__Interface__Group_4__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4413:1: ( ( rule__Interface__Group_4__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4414:1: ( rule__Interface__Group_4__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_4()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4415:1: ( rule__Interface__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4415:2: rule__Interface__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_4__0_in_rule__Interface__Group__4__Impl8682);
                    rule__Interface__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__5"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4425:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4429:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4430:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__58713);
            rule__Interface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__6_in_rule__Interface__Group__58716);
            rule__Interface__Group__6();

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
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4437:1: rule__Interface__Group__5__Impl : ( ( rule__Interface__Group_5__0 )? ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4441:1: ( ( ( rule__Interface__Group_5__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4442:1: ( ( rule__Interface__Group_5__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4442:1: ( ( rule__Interface__Group_5__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4443:1: ( rule__Interface__Group_5__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_5()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4444:1: ( rule__Interface__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4444:2: rule__Interface__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_5__0_in_rule__Interface__Group__5__Impl8743);
                    rule__Interface__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group__6"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4454:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl rule__Interface__Group__7 ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4458:1: ( rule__Interface__Group__6__Impl rule__Interface__Group__7 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4459:2: rule__Interface__Group__6__Impl rule__Interface__Group__7
            {
            pushFollow(FOLLOW_rule__Interface__Group__6__Impl_in_rule__Interface__Group__68774);
            rule__Interface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__7_in_rule__Interface__Group__68777);
            rule__Interface__Group__7();

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
    // $ANTLR end "rule__Interface__Group__6"


    // $ANTLR start "rule__Interface__Group__6__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4466:1: rule__Interface__Group__6__Impl : ( ( rule__Interface__Group_6__0 )? ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4470:1: ( ( ( rule__Interface__Group_6__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4471:1: ( ( rule__Interface__Group_6__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4471:1: ( ( rule__Interface__Group_6__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4472:1: ( rule__Interface__Group_6__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_6()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4473:1: ( rule__Interface__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==15) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4473:2: rule__Interface__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_6__0_in_rule__Interface__Group__6__Impl8804);
                    rule__Interface__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Interface__Group__6__Impl"


    // $ANTLR start "rule__Interface__Group__7"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4483:1: rule__Interface__Group__7 : rule__Interface__Group__7__Impl ;
    public final void rule__Interface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4487:1: ( rule__Interface__Group__7__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4488:2: rule__Interface__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__7__Impl_in_rule__Interface__Group__78835);
            rule__Interface__Group__7__Impl();

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
    // $ANTLR end "rule__Interface__Group__7"


    // $ANTLR start "rule__Interface__Group__7__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4494:1: rule__Interface__Group__7__Impl : ( '}' ) ;
    public final void rule__Interface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4498:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4499:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4499:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4500:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__Interface__Group__7__Impl8863); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Interface__Group__7__Impl"


    // $ANTLR start "rule__Interface__Group_4__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4529:1: rule__Interface__Group_4__0 : rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 ;
    public final void rule__Interface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4533:1: ( rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4534:2: rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_4__0__Impl_in_rule__Interface__Group_4__08910);
            rule__Interface__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_4__1_in_rule__Interface__Group_4__08913);
            rule__Interface__Group_4__1();

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
    // $ANTLR end "rule__Interface__Group_4__0"


    // $ANTLR start "rule__Interface__Group_4__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4541:1: rule__Interface__Group_4__0__Impl : ( 'providingComponentTypes' ) ;
    public final void rule__Interface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4545:1: ( ( 'providingComponentTypes' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4546:1: ( 'providingComponentTypes' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4546:1: ( 'providingComponentTypes' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4547:1: 'providingComponentTypes'
            {
             before(grammarAccess.getInterfaceAccess().getProvidingComponentTypesKeyword_4_0()); 
            match(input,37,FOLLOW_37_in_rule__Interface__Group_4__0__Impl8941); 
             after(grammarAccess.getInterfaceAccess().getProvidingComponentTypesKeyword_4_0()); 

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
    // $ANTLR end "rule__Interface__Group_4__0__Impl"


    // $ANTLR start "rule__Interface__Group_4__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4560:1: rule__Interface__Group_4__1 : rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2 ;
    public final void rule__Interface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4564:1: ( rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4565:2: rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_4__1__Impl_in_rule__Interface__Group_4__18972);
            rule__Interface__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_4__2_in_rule__Interface__Group_4__18975);
            rule__Interface__Group_4__2();

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
    // $ANTLR end "rule__Interface__Group_4__1"


    // $ANTLR start "rule__Interface__Group_4__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4572:1: rule__Interface__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Interface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4576:1: ( ( '(' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4577:1: ( '(' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4577:1: ( '(' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4578:1: '('
            {
             before(grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,32,FOLLOW_32_in_rule__Interface__Group_4__1__Impl9003); 
             after(grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_4_1()); 

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
    // $ANTLR end "rule__Interface__Group_4__1__Impl"


    // $ANTLR start "rule__Interface__Group_4__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4591:1: rule__Interface__Group_4__2 : rule__Interface__Group_4__2__Impl rule__Interface__Group_4__3 ;
    public final void rule__Interface__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4595:1: ( rule__Interface__Group_4__2__Impl rule__Interface__Group_4__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4596:2: rule__Interface__Group_4__2__Impl rule__Interface__Group_4__3
            {
            pushFollow(FOLLOW_rule__Interface__Group_4__2__Impl_in_rule__Interface__Group_4__29034);
            rule__Interface__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_4__3_in_rule__Interface__Group_4__29037);
            rule__Interface__Group_4__3();

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
    // $ANTLR end "rule__Interface__Group_4__2"


    // $ANTLR start "rule__Interface__Group_4__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4603:1: rule__Interface__Group_4__2__Impl : ( ( rule__Interface__ProvidingComponentTypesAssignment_4_2 ) ) ;
    public final void rule__Interface__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4607:1: ( ( ( rule__Interface__ProvidingComponentTypesAssignment_4_2 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4608:1: ( ( rule__Interface__ProvidingComponentTypesAssignment_4_2 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4608:1: ( ( rule__Interface__ProvidingComponentTypesAssignment_4_2 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4609:1: ( rule__Interface__ProvidingComponentTypesAssignment_4_2 )
            {
             before(grammarAccess.getInterfaceAccess().getProvidingComponentTypesAssignment_4_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4610:1: ( rule__Interface__ProvidingComponentTypesAssignment_4_2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4610:2: rule__Interface__ProvidingComponentTypesAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Interface__ProvidingComponentTypesAssignment_4_2_in_rule__Interface__Group_4__2__Impl9064);
            rule__Interface__ProvidingComponentTypesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getProvidingComponentTypesAssignment_4_2()); 

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
    // $ANTLR end "rule__Interface__Group_4__2__Impl"


    // $ANTLR start "rule__Interface__Group_4__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4620:1: rule__Interface__Group_4__3 : rule__Interface__Group_4__3__Impl rule__Interface__Group_4__4 ;
    public final void rule__Interface__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4624:1: ( rule__Interface__Group_4__3__Impl rule__Interface__Group_4__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4625:2: rule__Interface__Group_4__3__Impl rule__Interface__Group_4__4
            {
            pushFollow(FOLLOW_rule__Interface__Group_4__3__Impl_in_rule__Interface__Group_4__39094);
            rule__Interface__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_4__4_in_rule__Interface__Group_4__39097);
            rule__Interface__Group_4__4();

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
    // $ANTLR end "rule__Interface__Group_4__3"


    // $ANTLR start "rule__Interface__Group_4__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4632:1: rule__Interface__Group_4__3__Impl : ( ( rule__Interface__Group_4_3__0 )* ) ;
    public final void rule__Interface__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4636:1: ( ( ( rule__Interface__Group_4_3__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4637:1: ( ( rule__Interface__Group_4_3__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4637:1: ( ( rule__Interface__Group_4_3__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4638:1: ( rule__Interface__Group_4_3__0 )*
            {
             before(grammarAccess.getInterfaceAccess().getGroup_4_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4639:1: ( rule__Interface__Group_4_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4639:2: rule__Interface__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Interface__Group_4_3__0_in_rule__Interface__Group_4__3__Impl9124);
            	    rule__Interface__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Interface__Group_4__3__Impl"


    // $ANTLR start "rule__Interface__Group_4__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4649:1: rule__Interface__Group_4__4 : rule__Interface__Group_4__4__Impl ;
    public final void rule__Interface__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4653:1: ( rule__Interface__Group_4__4__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4654:2: rule__Interface__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_4__4__Impl_in_rule__Interface__Group_4__49155);
            rule__Interface__Group_4__4__Impl();

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
    // $ANTLR end "rule__Interface__Group_4__4"


    // $ANTLR start "rule__Interface__Group_4__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4660:1: rule__Interface__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Interface__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4664:1: ( ( ')' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4665:1: ( ')' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4665:1: ( ')' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4666:1: ')'
            {
             before(grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_4_4()); 
            match(input,33,FOLLOW_33_in_rule__Interface__Group_4__4__Impl9183); 
             after(grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_4_4()); 

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
    // $ANTLR end "rule__Interface__Group_4__4__Impl"


    // $ANTLR start "rule__Interface__Group_4_3__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4689:1: rule__Interface__Group_4_3__0 : rule__Interface__Group_4_3__0__Impl rule__Interface__Group_4_3__1 ;
    public final void rule__Interface__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4693:1: ( rule__Interface__Group_4_3__0__Impl rule__Interface__Group_4_3__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4694:2: rule__Interface__Group_4_3__0__Impl rule__Interface__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_4_3__0__Impl_in_rule__Interface__Group_4_3__09224);
            rule__Interface__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_4_3__1_in_rule__Interface__Group_4_3__09227);
            rule__Interface__Group_4_3__1();

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
    // $ANTLR end "rule__Interface__Group_4_3__0"


    // $ANTLR start "rule__Interface__Group_4_3__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4701:1: rule__Interface__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Interface__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4705:1: ( ( ',' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4706:1: ( ',' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4706:1: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4707:1: ','
            {
             before(grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Interface__Group_4_3__0__Impl9255); 
             after(grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Interface__Group_4_3__0__Impl"


    // $ANTLR start "rule__Interface__Group_4_3__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4720:1: rule__Interface__Group_4_3__1 : rule__Interface__Group_4_3__1__Impl ;
    public final void rule__Interface__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4724:1: ( rule__Interface__Group_4_3__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4725:2: rule__Interface__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_4_3__1__Impl_in_rule__Interface__Group_4_3__19286);
            rule__Interface__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Interface__Group_4_3__1"


    // $ANTLR start "rule__Interface__Group_4_3__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4731:1: rule__Interface__Group_4_3__1__Impl : ( ( rule__Interface__ProvidingComponentTypesAssignment_4_3_1 ) ) ;
    public final void rule__Interface__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4735:1: ( ( ( rule__Interface__ProvidingComponentTypesAssignment_4_3_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4736:1: ( ( rule__Interface__ProvidingComponentTypesAssignment_4_3_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4736:1: ( ( rule__Interface__ProvidingComponentTypesAssignment_4_3_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4737:1: ( rule__Interface__ProvidingComponentTypesAssignment_4_3_1 )
            {
             before(grammarAccess.getInterfaceAccess().getProvidingComponentTypesAssignment_4_3_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4738:1: ( rule__Interface__ProvidingComponentTypesAssignment_4_3_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4738:2: rule__Interface__ProvidingComponentTypesAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__Interface__ProvidingComponentTypesAssignment_4_3_1_in_rule__Interface__Group_4_3__1__Impl9313);
            rule__Interface__ProvidingComponentTypesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getProvidingComponentTypesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Interface__Group_4_3__1__Impl"


    // $ANTLR start "rule__Interface__Group_5__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4752:1: rule__Interface__Group_5__0 : rule__Interface__Group_5__0__Impl rule__Interface__Group_5__1 ;
    public final void rule__Interface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4756:1: ( rule__Interface__Group_5__0__Impl rule__Interface__Group_5__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4757:2: rule__Interface__Group_5__0__Impl rule__Interface__Group_5__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_5__0__Impl_in_rule__Interface__Group_5__09347);
            rule__Interface__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_5__1_in_rule__Interface__Group_5__09350);
            rule__Interface__Group_5__1();

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
    // $ANTLR end "rule__Interface__Group_5__0"


    // $ANTLR start "rule__Interface__Group_5__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4764:1: rule__Interface__Group_5__0__Impl : ( 'requiringPorts' ) ;
    public final void rule__Interface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4768:1: ( ( 'requiringPorts' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4769:1: ( 'requiringPorts' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4769:1: ( 'requiringPorts' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4770:1: 'requiringPorts'
            {
             before(grammarAccess.getInterfaceAccess().getRequiringPortsKeyword_5_0()); 
            match(input,38,FOLLOW_38_in_rule__Interface__Group_5__0__Impl9378); 
             after(grammarAccess.getInterfaceAccess().getRequiringPortsKeyword_5_0()); 

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
    // $ANTLR end "rule__Interface__Group_5__0__Impl"


    // $ANTLR start "rule__Interface__Group_5__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4783:1: rule__Interface__Group_5__1 : rule__Interface__Group_5__1__Impl rule__Interface__Group_5__2 ;
    public final void rule__Interface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4787:1: ( rule__Interface__Group_5__1__Impl rule__Interface__Group_5__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4788:2: rule__Interface__Group_5__1__Impl rule__Interface__Group_5__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_5__1__Impl_in_rule__Interface__Group_5__19409);
            rule__Interface__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_5__2_in_rule__Interface__Group_5__19412);
            rule__Interface__Group_5__2();

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
    // $ANTLR end "rule__Interface__Group_5__1"


    // $ANTLR start "rule__Interface__Group_5__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4795:1: rule__Interface__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Interface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4799:1: ( ( '(' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4800:1: ( '(' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4800:1: ( '(' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4801:1: '('
            {
             before(grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,32,FOLLOW_32_in_rule__Interface__Group_5__1__Impl9440); 
             after(grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__Interface__Group_5__1__Impl"


    // $ANTLR start "rule__Interface__Group_5__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4814:1: rule__Interface__Group_5__2 : rule__Interface__Group_5__2__Impl rule__Interface__Group_5__3 ;
    public final void rule__Interface__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4818:1: ( rule__Interface__Group_5__2__Impl rule__Interface__Group_5__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4819:2: rule__Interface__Group_5__2__Impl rule__Interface__Group_5__3
            {
            pushFollow(FOLLOW_rule__Interface__Group_5__2__Impl_in_rule__Interface__Group_5__29471);
            rule__Interface__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_5__3_in_rule__Interface__Group_5__29474);
            rule__Interface__Group_5__3();

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
    // $ANTLR end "rule__Interface__Group_5__2"


    // $ANTLR start "rule__Interface__Group_5__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4826:1: rule__Interface__Group_5__2__Impl : ( ( rule__Interface__RequiringPortsAssignment_5_2 ) ) ;
    public final void rule__Interface__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4830:1: ( ( ( rule__Interface__RequiringPortsAssignment_5_2 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4831:1: ( ( rule__Interface__RequiringPortsAssignment_5_2 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4831:1: ( ( rule__Interface__RequiringPortsAssignment_5_2 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4832:1: ( rule__Interface__RequiringPortsAssignment_5_2 )
            {
             before(grammarAccess.getInterfaceAccess().getRequiringPortsAssignment_5_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4833:1: ( rule__Interface__RequiringPortsAssignment_5_2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4833:2: rule__Interface__RequiringPortsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Interface__RequiringPortsAssignment_5_2_in_rule__Interface__Group_5__2__Impl9501);
            rule__Interface__RequiringPortsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getRequiringPortsAssignment_5_2()); 

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
    // $ANTLR end "rule__Interface__Group_5__2__Impl"


    // $ANTLR start "rule__Interface__Group_5__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4843:1: rule__Interface__Group_5__3 : rule__Interface__Group_5__3__Impl rule__Interface__Group_5__4 ;
    public final void rule__Interface__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4847:1: ( rule__Interface__Group_5__3__Impl rule__Interface__Group_5__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4848:2: rule__Interface__Group_5__3__Impl rule__Interface__Group_5__4
            {
            pushFollow(FOLLOW_rule__Interface__Group_5__3__Impl_in_rule__Interface__Group_5__39531);
            rule__Interface__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_5__4_in_rule__Interface__Group_5__39534);
            rule__Interface__Group_5__4();

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
    // $ANTLR end "rule__Interface__Group_5__3"


    // $ANTLR start "rule__Interface__Group_5__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4855:1: rule__Interface__Group_5__3__Impl : ( ( rule__Interface__Group_5_3__0 )* ) ;
    public final void rule__Interface__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4859:1: ( ( ( rule__Interface__Group_5_3__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4860:1: ( ( rule__Interface__Group_5_3__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4860:1: ( ( rule__Interface__Group_5_3__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4861:1: ( rule__Interface__Group_5_3__0 )*
            {
             before(grammarAccess.getInterfaceAccess().getGroup_5_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4862:1: ( rule__Interface__Group_5_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4862:2: rule__Interface__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Interface__Group_5_3__0_in_rule__Interface__Group_5__3__Impl9561);
            	    rule__Interface__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Interface__Group_5__3__Impl"


    // $ANTLR start "rule__Interface__Group_5__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4872:1: rule__Interface__Group_5__4 : rule__Interface__Group_5__4__Impl ;
    public final void rule__Interface__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4876:1: ( rule__Interface__Group_5__4__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4877:2: rule__Interface__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_5__4__Impl_in_rule__Interface__Group_5__49592);
            rule__Interface__Group_5__4__Impl();

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
    // $ANTLR end "rule__Interface__Group_5__4"


    // $ANTLR start "rule__Interface__Group_5__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4883:1: rule__Interface__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Interface__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4887:1: ( ( ')' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4888:1: ( ')' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4888:1: ( ')' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4889:1: ')'
            {
             before(grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_5_4()); 
            match(input,33,FOLLOW_33_in_rule__Interface__Group_5__4__Impl9620); 
             after(grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__Interface__Group_5__4__Impl"


    // $ANTLR start "rule__Interface__Group_5_3__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4912:1: rule__Interface__Group_5_3__0 : rule__Interface__Group_5_3__0__Impl rule__Interface__Group_5_3__1 ;
    public final void rule__Interface__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4916:1: ( rule__Interface__Group_5_3__0__Impl rule__Interface__Group_5_3__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4917:2: rule__Interface__Group_5_3__0__Impl rule__Interface__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_5_3__0__Impl_in_rule__Interface__Group_5_3__09661);
            rule__Interface__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_5_3__1_in_rule__Interface__Group_5_3__09664);
            rule__Interface__Group_5_3__1();

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
    // $ANTLR end "rule__Interface__Group_5_3__0"


    // $ANTLR start "rule__Interface__Group_5_3__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4924:1: rule__Interface__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Interface__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4928:1: ( ( ',' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4929:1: ( ',' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4929:1: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4930:1: ','
            {
             before(grammarAccess.getInterfaceAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Interface__Group_5_3__0__Impl9692); 
             after(grammarAccess.getInterfaceAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Interface__Group_5_3__0__Impl"


    // $ANTLR start "rule__Interface__Group_5_3__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4943:1: rule__Interface__Group_5_3__1 : rule__Interface__Group_5_3__1__Impl ;
    public final void rule__Interface__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4947:1: ( rule__Interface__Group_5_3__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4948:2: rule__Interface__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_5_3__1__Impl_in_rule__Interface__Group_5_3__19723);
            rule__Interface__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Interface__Group_5_3__1"


    // $ANTLR start "rule__Interface__Group_5_3__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4954:1: rule__Interface__Group_5_3__1__Impl : ( ( rule__Interface__RequiringPortsAssignment_5_3_1 ) ) ;
    public final void rule__Interface__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4958:1: ( ( ( rule__Interface__RequiringPortsAssignment_5_3_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4959:1: ( ( rule__Interface__RequiringPortsAssignment_5_3_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4959:1: ( ( rule__Interface__RequiringPortsAssignment_5_3_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4960:1: ( rule__Interface__RequiringPortsAssignment_5_3_1 )
            {
             before(grammarAccess.getInterfaceAccess().getRequiringPortsAssignment_5_3_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4961:1: ( rule__Interface__RequiringPortsAssignment_5_3_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4961:2: rule__Interface__RequiringPortsAssignment_5_3_1
            {
            pushFollow(FOLLOW_rule__Interface__RequiringPortsAssignment_5_3_1_in_rule__Interface__Group_5_3__1__Impl9750);
            rule__Interface__RequiringPortsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getRequiringPortsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Interface__Group_5_3__1__Impl"


    // $ANTLR start "rule__Interface__Group_6__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4975:1: rule__Interface__Group_6__0 : rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1 ;
    public final void rule__Interface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4979:1: ( rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4980:2: rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_6__0__Impl_in_rule__Interface__Group_6__09784);
            rule__Interface__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_6__1_in_rule__Interface__Group_6__09787);
            rule__Interface__Group_6__1();

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
    // $ANTLR end "rule__Interface__Group_6__0"


    // $ANTLR start "rule__Interface__Group_6__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4987:1: rule__Interface__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__Interface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4991:1: ( ( 'description' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4992:1: ( 'description' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4992:1: ( 'description' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:4993:1: 'description'
            {
             before(grammarAccess.getInterfaceAccess().getDescriptionKeyword_6_0()); 
            match(input,15,FOLLOW_15_in_rule__Interface__Group_6__0__Impl9815); 
             after(grammarAccess.getInterfaceAccess().getDescriptionKeyword_6_0()); 

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
    // $ANTLR end "rule__Interface__Group_6__0__Impl"


    // $ANTLR start "rule__Interface__Group_6__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5006:1: rule__Interface__Group_6__1 : rule__Interface__Group_6__1__Impl ;
    public final void rule__Interface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5010:1: ( rule__Interface__Group_6__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5011:2: rule__Interface__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_6__1__Impl_in_rule__Interface__Group_6__19846);
            rule__Interface__Group_6__1__Impl();

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
    // $ANTLR end "rule__Interface__Group_6__1"


    // $ANTLR start "rule__Interface__Group_6__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5017:1: rule__Interface__Group_6__1__Impl : ( ( rule__Interface__DescriptionAssignment_6_1 ) ) ;
    public final void rule__Interface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5021:1: ( ( ( rule__Interface__DescriptionAssignment_6_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5022:1: ( ( rule__Interface__DescriptionAssignment_6_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5022:1: ( ( rule__Interface__DescriptionAssignment_6_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5023:1: ( rule__Interface__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getInterfaceAccess().getDescriptionAssignment_6_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5024:1: ( rule__Interface__DescriptionAssignment_6_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5024:2: rule__Interface__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Interface__DescriptionAssignment_6_1_in_rule__Interface__Group_6__1__Impl9873);
            rule__Interface__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getDescriptionAssignment_6_1()); 

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
    // $ANTLR end "rule__Interface__Group_6__1__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5038:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5042:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5043:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__09907);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__09910);
            rule__Port__Group__1();

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
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5050:1: rule__Port__Group__0__Impl : ( 'Port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5054:1: ( ( 'Port' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5055:1: ( 'Port' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5055:1: ( 'Port' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5056:1: 'Port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Port__Group__0__Impl9938); 
             after(grammarAccess.getPortAccess().getPortKeyword_0()); 

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
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5069:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5073:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5074:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__19969);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__2_in_rule__Port__Group__19972);
            rule__Port__Group__2();

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
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5081:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5085:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5086:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5086:1: ( ( rule__Port__NameAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5087:1: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5088:1: ( rule__Port__NameAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5088:2: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl9999);
            rule__Port__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5098:1: rule__Port__Group__2 : rule__Port__Group__2__Impl rule__Port__Group__3 ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5102:1: ( rule__Port__Group__2__Impl rule__Port__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5103:2: rule__Port__Group__2__Impl rule__Port__Group__3
            {
            pushFollow(FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__210029);
            rule__Port__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__3_in_rule__Port__Group__210032);
            rule__Port__Group__3();

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
    // $ANTLR end "rule__Port__Group__2"


    // $ANTLR start "rule__Port__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5110:1: rule__Port__Group__2__Impl : ( '{' ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5114:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5115:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5115:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5116:1: '{'
            {
             before(grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Port__Group__2__Impl10060); 
             after(grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Port__Group__2__Impl"


    // $ANTLR start "rule__Port__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5129:1: rule__Port__Group__3 : rule__Port__Group__3__Impl rule__Port__Group__4 ;
    public final void rule__Port__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5133:1: ( rule__Port__Group__3__Impl rule__Port__Group__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5134:2: rule__Port__Group__3__Impl rule__Port__Group__4
            {
            pushFollow(FOLLOW_rule__Port__Group__3__Impl_in_rule__Port__Group__310091);
            rule__Port__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__4_in_rule__Port__Group__310094);
            rule__Port__Group__4();

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
    // $ANTLR end "rule__Port__Group__3"


    // $ANTLR start "rule__Port__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5141:1: rule__Port__Group__3__Impl : ( 'minProviderCount' ) ;
    public final void rule__Port__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5145:1: ( ( 'minProviderCount' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5146:1: ( 'minProviderCount' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5146:1: ( 'minProviderCount' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5147:1: 'minProviderCount'
            {
             before(grammarAccess.getPortAccess().getMinProviderCountKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__Port__Group__3__Impl10122); 
             after(grammarAccess.getPortAccess().getMinProviderCountKeyword_3()); 

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
    // $ANTLR end "rule__Port__Group__3__Impl"


    // $ANTLR start "rule__Port__Group__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5160:1: rule__Port__Group__4 : rule__Port__Group__4__Impl rule__Port__Group__5 ;
    public final void rule__Port__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5164:1: ( rule__Port__Group__4__Impl rule__Port__Group__5 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5165:2: rule__Port__Group__4__Impl rule__Port__Group__5
            {
            pushFollow(FOLLOW_rule__Port__Group__4__Impl_in_rule__Port__Group__410153);
            rule__Port__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__5_in_rule__Port__Group__410156);
            rule__Port__Group__5();

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
    // $ANTLR end "rule__Port__Group__4"


    // $ANTLR start "rule__Port__Group__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5172:1: rule__Port__Group__4__Impl : ( ( rule__Port__MinProviderCountAssignment_4 ) ) ;
    public final void rule__Port__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5176:1: ( ( ( rule__Port__MinProviderCountAssignment_4 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5177:1: ( ( rule__Port__MinProviderCountAssignment_4 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5177:1: ( ( rule__Port__MinProviderCountAssignment_4 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5178:1: ( rule__Port__MinProviderCountAssignment_4 )
            {
             before(grammarAccess.getPortAccess().getMinProviderCountAssignment_4()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5179:1: ( rule__Port__MinProviderCountAssignment_4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5179:2: rule__Port__MinProviderCountAssignment_4
            {
            pushFollow(FOLLOW_rule__Port__MinProviderCountAssignment_4_in_rule__Port__Group__4__Impl10183);
            rule__Port__MinProviderCountAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getMinProviderCountAssignment_4()); 

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
    // $ANTLR end "rule__Port__Group__4__Impl"


    // $ANTLR start "rule__Port__Group__5"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5189:1: rule__Port__Group__5 : rule__Port__Group__5__Impl rule__Port__Group__6 ;
    public final void rule__Port__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5193:1: ( rule__Port__Group__5__Impl rule__Port__Group__6 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5194:2: rule__Port__Group__5__Impl rule__Port__Group__6
            {
            pushFollow(FOLLOW_rule__Port__Group__5__Impl_in_rule__Port__Group__510213);
            rule__Port__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__6_in_rule__Port__Group__510216);
            rule__Port__Group__6();

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
    // $ANTLR end "rule__Port__Group__5"


    // $ANTLR start "rule__Port__Group__5__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5201:1: rule__Port__Group__5__Impl : ( 'maxProviderCount' ) ;
    public final void rule__Port__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5205:1: ( ( 'maxProviderCount' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5206:1: ( 'maxProviderCount' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5206:1: ( 'maxProviderCount' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5207:1: 'maxProviderCount'
            {
             before(grammarAccess.getPortAccess().getMaxProviderCountKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Port__Group__5__Impl10244); 
             after(grammarAccess.getPortAccess().getMaxProviderCountKeyword_5()); 

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
    // $ANTLR end "rule__Port__Group__5__Impl"


    // $ANTLR start "rule__Port__Group__6"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5220:1: rule__Port__Group__6 : rule__Port__Group__6__Impl rule__Port__Group__7 ;
    public final void rule__Port__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5224:1: ( rule__Port__Group__6__Impl rule__Port__Group__7 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5225:2: rule__Port__Group__6__Impl rule__Port__Group__7
            {
            pushFollow(FOLLOW_rule__Port__Group__6__Impl_in_rule__Port__Group__610275);
            rule__Port__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__7_in_rule__Port__Group__610278);
            rule__Port__Group__7();

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
    // $ANTLR end "rule__Port__Group__6"


    // $ANTLR start "rule__Port__Group__6__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5232:1: rule__Port__Group__6__Impl : ( ( rule__Port__MaxProviderCountAssignment_6 ) ) ;
    public final void rule__Port__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5236:1: ( ( ( rule__Port__MaxProviderCountAssignment_6 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5237:1: ( ( rule__Port__MaxProviderCountAssignment_6 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5237:1: ( ( rule__Port__MaxProviderCountAssignment_6 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5238:1: ( rule__Port__MaxProviderCountAssignment_6 )
            {
             before(grammarAccess.getPortAccess().getMaxProviderCountAssignment_6()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5239:1: ( rule__Port__MaxProviderCountAssignment_6 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5239:2: rule__Port__MaxProviderCountAssignment_6
            {
            pushFollow(FOLLOW_rule__Port__MaxProviderCountAssignment_6_in_rule__Port__Group__6__Impl10305);
            rule__Port__MaxProviderCountAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getMaxProviderCountAssignment_6()); 

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
    // $ANTLR end "rule__Port__Group__6__Impl"


    // $ANTLR start "rule__Port__Group__7"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5249:1: rule__Port__Group__7 : rule__Port__Group__7__Impl rule__Port__Group__8 ;
    public final void rule__Port__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5253:1: ( rule__Port__Group__7__Impl rule__Port__Group__8 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5254:2: rule__Port__Group__7__Impl rule__Port__Group__8
            {
            pushFollow(FOLLOW_rule__Port__Group__7__Impl_in_rule__Port__Group__710335);
            rule__Port__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__8_in_rule__Port__Group__710338);
            rule__Port__Group__8();

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
    // $ANTLR end "rule__Port__Group__7"


    // $ANTLR start "rule__Port__Group__7__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5261:1: rule__Port__Group__7__Impl : ( 'requiredInterface' ) ;
    public final void rule__Port__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5265:1: ( ( 'requiredInterface' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5266:1: ( 'requiredInterface' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5266:1: ( 'requiredInterface' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5267:1: 'requiredInterface'
            {
             before(grammarAccess.getPortAccess().getRequiredInterfaceKeyword_7()); 
            match(input,42,FOLLOW_42_in_rule__Port__Group__7__Impl10366); 
             after(grammarAccess.getPortAccess().getRequiredInterfaceKeyword_7()); 

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
    // $ANTLR end "rule__Port__Group__7__Impl"


    // $ANTLR start "rule__Port__Group__8"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5280:1: rule__Port__Group__8 : rule__Port__Group__8__Impl rule__Port__Group__9 ;
    public final void rule__Port__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5284:1: ( rule__Port__Group__8__Impl rule__Port__Group__9 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5285:2: rule__Port__Group__8__Impl rule__Port__Group__9
            {
            pushFollow(FOLLOW_rule__Port__Group__8__Impl_in_rule__Port__Group__810397);
            rule__Port__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__9_in_rule__Port__Group__810400);
            rule__Port__Group__9();

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
    // $ANTLR end "rule__Port__Group__8"


    // $ANTLR start "rule__Port__Group__8__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5292:1: rule__Port__Group__8__Impl : ( ( rule__Port__RequiredInterfaceAssignment_8 ) ) ;
    public final void rule__Port__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5296:1: ( ( ( rule__Port__RequiredInterfaceAssignment_8 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5297:1: ( ( rule__Port__RequiredInterfaceAssignment_8 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5297:1: ( ( rule__Port__RequiredInterfaceAssignment_8 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5298:1: ( rule__Port__RequiredInterfaceAssignment_8 )
            {
             before(grammarAccess.getPortAccess().getRequiredInterfaceAssignment_8()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5299:1: ( rule__Port__RequiredInterfaceAssignment_8 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5299:2: rule__Port__RequiredInterfaceAssignment_8
            {
            pushFollow(FOLLOW_rule__Port__RequiredInterfaceAssignment_8_in_rule__Port__Group__8__Impl10427);
            rule__Port__RequiredInterfaceAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getRequiredInterfaceAssignment_8()); 

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
    // $ANTLR end "rule__Port__Group__8__Impl"


    // $ANTLR start "rule__Port__Group__9"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5309:1: rule__Port__Group__9 : rule__Port__Group__9__Impl rule__Port__Group__10 ;
    public final void rule__Port__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5313:1: ( rule__Port__Group__9__Impl rule__Port__Group__10 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5314:2: rule__Port__Group__9__Impl rule__Port__Group__10
            {
            pushFollow(FOLLOW_rule__Port__Group__9__Impl_in_rule__Port__Group__910457);
            rule__Port__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__10_in_rule__Port__Group__910460);
            rule__Port__Group__10();

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
    // $ANTLR end "rule__Port__Group__9"


    // $ANTLR start "rule__Port__Group__9__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5321:1: rule__Port__Group__9__Impl : ( ( rule__Port__Group_9__0 )? ) ;
    public final void rule__Port__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5325:1: ( ( ( rule__Port__Group_9__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5326:1: ( ( rule__Port__Group_9__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5326:1: ( ( rule__Port__Group_9__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5327:1: ( rule__Port__Group_9__0 )?
            {
             before(grammarAccess.getPortAccess().getGroup_9()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5328:1: ( rule__Port__Group_9__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==15) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5328:2: rule__Port__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Port__Group_9__0_in_rule__Port__Group__9__Impl10487);
                    rule__Port__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Port__Group__9__Impl"


    // $ANTLR start "rule__Port__Group__10"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5338:1: rule__Port__Group__10 : rule__Port__Group__10__Impl ;
    public final void rule__Port__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5342:1: ( rule__Port__Group__10__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5343:2: rule__Port__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__10__Impl_in_rule__Port__Group__1010518);
            rule__Port__Group__10__Impl();

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
    // $ANTLR end "rule__Port__Group__10"


    // $ANTLR start "rule__Port__Group__10__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5349:1: rule__Port__Group__10__Impl : ( '}' ) ;
    public final void rule__Port__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5353:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5354:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5354:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5355:1: '}'
            {
             before(grammarAccess.getPortAccess().getRightCurlyBracketKeyword_10()); 
            match(input,14,FOLLOW_14_in_rule__Port__Group__10__Impl10546); 
             after(grammarAccess.getPortAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Port__Group__10__Impl"


    // $ANTLR start "rule__Port__Group_9__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5390:1: rule__Port__Group_9__0 : rule__Port__Group_9__0__Impl rule__Port__Group_9__1 ;
    public final void rule__Port__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5394:1: ( rule__Port__Group_9__0__Impl rule__Port__Group_9__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5395:2: rule__Port__Group_9__0__Impl rule__Port__Group_9__1
            {
            pushFollow(FOLLOW_rule__Port__Group_9__0__Impl_in_rule__Port__Group_9__010599);
            rule__Port__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group_9__1_in_rule__Port__Group_9__010602);
            rule__Port__Group_9__1();

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
    // $ANTLR end "rule__Port__Group_9__0"


    // $ANTLR start "rule__Port__Group_9__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5402:1: rule__Port__Group_9__0__Impl : ( 'description' ) ;
    public final void rule__Port__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5406:1: ( ( 'description' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5407:1: ( 'description' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5407:1: ( 'description' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5408:1: 'description'
            {
             before(grammarAccess.getPortAccess().getDescriptionKeyword_9_0()); 
            match(input,15,FOLLOW_15_in_rule__Port__Group_9__0__Impl10630); 
             after(grammarAccess.getPortAccess().getDescriptionKeyword_9_0()); 

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
    // $ANTLR end "rule__Port__Group_9__0__Impl"


    // $ANTLR start "rule__Port__Group_9__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5421:1: rule__Port__Group_9__1 : rule__Port__Group_9__1__Impl ;
    public final void rule__Port__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5425:1: ( rule__Port__Group_9__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5426:2: rule__Port__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group_9__1__Impl_in_rule__Port__Group_9__110661);
            rule__Port__Group_9__1__Impl();

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
    // $ANTLR end "rule__Port__Group_9__1"


    // $ANTLR start "rule__Port__Group_9__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5432:1: rule__Port__Group_9__1__Impl : ( ( rule__Port__DescriptionAssignment_9_1 ) ) ;
    public final void rule__Port__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5436:1: ( ( ( rule__Port__DescriptionAssignment_9_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5437:1: ( ( rule__Port__DescriptionAssignment_9_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5437:1: ( ( rule__Port__DescriptionAssignment_9_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5438:1: ( rule__Port__DescriptionAssignment_9_1 )
            {
             before(grammarAccess.getPortAccess().getDescriptionAssignment_9_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5439:1: ( rule__Port__DescriptionAssignment_9_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5439:2: rule__Port__DescriptionAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Port__DescriptionAssignment_9_1_in_rule__Port__Group_9__1__Impl10688);
            rule__Port__DescriptionAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getDescriptionAssignment_9_1()); 

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
    // $ANTLR end "rule__Port__Group_9__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5453:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5457:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5458:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__010722);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__010725);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5465:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5469:1: ( ( () ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5470:1: ( () )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5470:1: ( () )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5471:1: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5472:1: ()
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5474:1: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5484:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5488:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5489:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__110783);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__110786);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5496:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__OptionalAssignment_1 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5500:1: ( ( ( rule__Parameter__OptionalAssignment_1 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5501:1: ( ( rule__Parameter__OptionalAssignment_1 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5501:1: ( ( rule__Parameter__OptionalAssignment_1 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5502:1: ( rule__Parameter__OptionalAssignment_1 )?
            {
             before(grammarAccess.getParameterAccess().getOptionalAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5503:1: ( rule__Parameter__OptionalAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5503:2: rule__Parameter__OptionalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Parameter__OptionalAssignment_1_in_rule__Parameter__Group__1__Impl10813);
                    rule__Parameter__OptionalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getOptionalAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5513:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5517:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5518:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__210844);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__210847);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5525:1: rule__Parameter__Group__2__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5529:1: ( ( 'Parameter' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5530:1: ( 'Parameter' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5530:1: ( 'Parameter' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5531:1: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__Parameter__Group__2__Impl10875); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5544:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5548:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5549:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__310906);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__4_in_rule__Parameter__Group__310909);
            rule__Parameter__Group__4();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5556:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__NameAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5560:1: ( ( ( rule__Parameter__NameAssignment_3 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5561:1: ( ( rule__Parameter__NameAssignment_3 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5561:1: ( ( rule__Parameter__NameAssignment_3 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5562:1: ( rule__Parameter__NameAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5563:1: ( rule__Parameter__NameAssignment_3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5563:2: rule__Parameter__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_3_in_rule__Parameter__Group__3__Impl10936);
            rule__Parameter__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5573:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5577:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5578:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_rule__Parameter__Group__4__Impl_in_rule__Parameter__Group__410966);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__5_in_rule__Parameter__Group__410969);
            rule__Parameter__Group__5();

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
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5585:1: rule__Parameter__Group__4__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5589:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5590:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5590:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5591:1: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__Parameter__Group__4__Impl10997); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5604:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl rule__Parameter__Group__6 ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5608:1: ( rule__Parameter__Group__5__Impl rule__Parameter__Group__6 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5609:2: rule__Parameter__Group__5__Impl rule__Parameter__Group__6
            {
            pushFollow(FOLLOW_rule__Parameter__Group__5__Impl_in_rule__Parameter__Group__511028);
            rule__Parameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__6_in_rule__Parameter__Group__511031);
            rule__Parameter__Group__6();

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
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5616:1: rule__Parameter__Group__5__Impl : ( ( rule__Parameter__Group_5__0 )? ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5620:1: ( ( ( rule__Parameter__Group_5__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5621:1: ( ( rule__Parameter__Group_5__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5621:1: ( ( rule__Parameter__Group_5__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5622:1: ( rule__Parameter__Group_5__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_5()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5623:1: ( rule__Parameter__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5623:2: rule__Parameter__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_5__0_in_rule__Parameter__Group__5__Impl11058);
                    rule__Parameter__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group__6"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5633:1: rule__Parameter__Group__6 : rule__Parameter__Group__6__Impl rule__Parameter__Group__7 ;
    public final void rule__Parameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5637:1: ( rule__Parameter__Group__6__Impl rule__Parameter__Group__7 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5638:2: rule__Parameter__Group__6__Impl rule__Parameter__Group__7
            {
            pushFollow(FOLLOW_rule__Parameter__Group__6__Impl_in_rule__Parameter__Group__611089);
            rule__Parameter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__7_in_rule__Parameter__Group__611092);
            rule__Parameter__Group__7();

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
    // $ANTLR end "rule__Parameter__Group__6"


    // $ANTLR start "rule__Parameter__Group__6__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5645:1: rule__Parameter__Group__6__Impl : ( ( rule__Parameter__Group_6__0 )? ) ;
    public final void rule__Parameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5649:1: ( ( ( rule__Parameter__Group_6__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5650:1: ( ( rule__Parameter__Group_6__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5650:1: ( ( rule__Parameter__Group_6__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5651:1: ( rule__Parameter__Group_6__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_6()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5652:1: ( rule__Parameter__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==15) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5652:2: rule__Parameter__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_6__0_in_rule__Parameter__Group__6__Impl11119);
                    rule__Parameter__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Parameter__Group__6__Impl"


    // $ANTLR start "rule__Parameter__Group__7"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5662:1: rule__Parameter__Group__7 : rule__Parameter__Group__7__Impl ;
    public final void rule__Parameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5666:1: ( rule__Parameter__Group__7__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5667:2: rule__Parameter__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__7__Impl_in_rule__Parameter__Group__711150);
            rule__Parameter__Group__7__Impl();

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
    // $ANTLR end "rule__Parameter__Group__7"


    // $ANTLR start "rule__Parameter__Group__7__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5673:1: rule__Parameter__Group__7__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5677:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5678:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5678:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5679:1: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__Parameter__Group__7__Impl11178); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Parameter__Group__7__Impl"


    // $ANTLR start "rule__Parameter__Group_5__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5708:1: rule__Parameter__Group_5__0 : rule__Parameter__Group_5__0__Impl rule__Parameter__Group_5__1 ;
    public final void rule__Parameter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5712:1: ( rule__Parameter__Group_5__0__Impl rule__Parameter__Group_5__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5713:2: rule__Parameter__Group_5__0__Impl rule__Parameter__Group_5__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_5__0__Impl_in_rule__Parameter__Group_5__011225);
            rule__Parameter__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_5__1_in_rule__Parameter__Group_5__011228);
            rule__Parameter__Group_5__1();

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
    // $ANTLR end "rule__Parameter__Group_5__0"


    // $ANTLR start "rule__Parameter__Group_5__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5720:1: rule__Parameter__Group_5__0__Impl : ( 'dataType' ) ;
    public final void rule__Parameter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5724:1: ( ( 'dataType' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5725:1: ( 'dataType' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5725:1: ( 'dataType' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5726:1: 'dataType'
            {
             before(grammarAccess.getParameterAccess().getDataTypeKeyword_5_0()); 
            match(input,44,FOLLOW_44_in_rule__Parameter__Group_5__0__Impl11256); 
             after(grammarAccess.getParameterAccess().getDataTypeKeyword_5_0()); 

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
    // $ANTLR end "rule__Parameter__Group_5__0__Impl"


    // $ANTLR start "rule__Parameter__Group_5__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5739:1: rule__Parameter__Group_5__1 : rule__Parameter__Group_5__1__Impl ;
    public final void rule__Parameter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5743:1: ( rule__Parameter__Group_5__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5744:2: rule__Parameter__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_5__1__Impl_in_rule__Parameter__Group_5__111287);
            rule__Parameter__Group_5__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group_5__1"


    // $ANTLR start "rule__Parameter__Group_5__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5750:1: rule__Parameter__Group_5__1__Impl : ( ( rule__Parameter__DataTypeAssignment_5_1 ) ) ;
    public final void rule__Parameter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5754:1: ( ( ( rule__Parameter__DataTypeAssignment_5_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5755:1: ( ( rule__Parameter__DataTypeAssignment_5_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5755:1: ( ( rule__Parameter__DataTypeAssignment_5_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5756:1: ( rule__Parameter__DataTypeAssignment_5_1 )
            {
             before(grammarAccess.getParameterAccess().getDataTypeAssignment_5_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5757:1: ( rule__Parameter__DataTypeAssignment_5_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5757:2: rule__Parameter__DataTypeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Parameter__DataTypeAssignment_5_1_in_rule__Parameter__Group_5__1__Impl11314);
            rule__Parameter__DataTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getDataTypeAssignment_5_1()); 

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
    // $ANTLR end "rule__Parameter__Group_5__1__Impl"


    // $ANTLR start "rule__Parameter__Group_6__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5771:1: rule__Parameter__Group_6__0 : rule__Parameter__Group_6__0__Impl rule__Parameter__Group_6__1 ;
    public final void rule__Parameter__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5775:1: ( rule__Parameter__Group_6__0__Impl rule__Parameter__Group_6__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5776:2: rule__Parameter__Group_6__0__Impl rule__Parameter__Group_6__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_6__0__Impl_in_rule__Parameter__Group_6__011348);
            rule__Parameter__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_6__1_in_rule__Parameter__Group_6__011351);
            rule__Parameter__Group_6__1();

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
    // $ANTLR end "rule__Parameter__Group_6__0"


    // $ANTLR start "rule__Parameter__Group_6__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5783:1: rule__Parameter__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__Parameter__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5787:1: ( ( 'description' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5788:1: ( 'description' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5788:1: ( 'description' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5789:1: 'description'
            {
             before(grammarAccess.getParameterAccess().getDescriptionKeyword_6_0()); 
            match(input,15,FOLLOW_15_in_rule__Parameter__Group_6__0__Impl11379); 
             after(grammarAccess.getParameterAccess().getDescriptionKeyword_6_0()); 

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
    // $ANTLR end "rule__Parameter__Group_6__0__Impl"


    // $ANTLR start "rule__Parameter__Group_6__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5802:1: rule__Parameter__Group_6__1 : rule__Parameter__Group_6__1__Impl ;
    public final void rule__Parameter__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5806:1: ( rule__Parameter__Group_6__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5807:2: rule__Parameter__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_6__1__Impl_in_rule__Parameter__Group_6__111410);
            rule__Parameter__Group_6__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group_6__1"


    // $ANTLR start "rule__Parameter__Group_6__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5813:1: rule__Parameter__Group_6__1__Impl : ( ( rule__Parameter__DescriptionAssignment_6_1 ) ) ;
    public final void rule__Parameter__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5817:1: ( ( ( rule__Parameter__DescriptionAssignment_6_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5818:1: ( ( rule__Parameter__DescriptionAssignment_6_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5818:1: ( ( rule__Parameter__DescriptionAssignment_6_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5819:1: ( rule__Parameter__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getParameterAccess().getDescriptionAssignment_6_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5820:1: ( rule__Parameter__DescriptionAssignment_6_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5820:2: rule__Parameter__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Parameter__DescriptionAssignment_6_1_in_rule__Parameter__Group_6__1__Impl11437);
            rule__Parameter__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getDescriptionAssignment_6_1()); 

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
    // $ANTLR end "rule__Parameter__Group_6__1__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5834:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5838:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5839:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__011471);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__011474);
            rule__Integer__Group__1();

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
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5846:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5850:1: ( ( ( '-' )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5851:1: ( ( '-' )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5851:1: ( ( '-' )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5852:1: ( '-' )?
            {
             before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5853:1: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5854:2: '-'
                    {
                    match(input,45,FOLLOW_45_in_rule__Integer__Group__0__Impl11503); 

                    }
                    break;

            }

             after(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5865:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5869:1: ( rule__Integer__Group__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5870:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__111536);
            rule__Integer__Group__1__Impl();

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
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5876:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5880:1: ( ( RULE_INT ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5881:1: ( RULE_INT )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5881:1: ( RULE_INT )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5882:1: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Integer__Group__1__Impl11563); 
             after(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__Application__NameAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5898:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5902:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5903:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5903:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5904:1: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Application__NameAssignment_111601); 
             after(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Application__NameAssignment_1"


    // $ANTLR start "rule__Application__DescriptionAssignment_3_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5913:1: rule__Application__DescriptionAssignment_3_1 : ( ruleDescription ) ;
    public final void rule__Application__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5917:1: ( ( ruleDescription ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5918:1: ( ruleDescription )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5918:1: ( ruleDescription )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5919:1: ruleDescription
            {
             before(grammarAccess.getApplicationAccess().getDescriptionDescriptionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__Application__DescriptionAssignment_3_111632);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getDescriptionDescriptionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Application__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Application__ComponentsAssignment_6"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5928:1: rule__Application__ComponentsAssignment_6 : ( ruleComponent ) ;
    public final void rule__Application__ComponentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5932:1: ( ( ruleComponent ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5933:1: ( ruleComponent )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5933:1: ( ruleComponent )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5934:1: ruleComponent
            {
             before(grammarAccess.getApplicationAccess().getComponentsComponentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Application__ComponentsAssignment_611663);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getComponentsComponentParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Application__ComponentsAssignment_6"


    // $ANTLR start "rule__Application__ComponentsAssignment_7_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5943:1: rule__Application__ComponentsAssignment_7_1 : ( ruleComponent ) ;
    public final void rule__Application__ComponentsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5947:1: ( ( ruleComponent ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5948:1: ( ruleComponent )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5948:1: ( ruleComponent )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5949:1: ruleComponent
            {
             before(grammarAccess.getApplicationAccess().getComponentsComponentParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Application__ComponentsAssignment_7_111694);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getComponentsComponentParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Application__ComponentsAssignment_7_1"


    // $ANTLR start "rule__Component__NameAssignment_2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5958:1: rule__Component__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5962:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5963:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5963:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5964:1: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Component__NameAssignment_211725); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Component__NameAssignment_2"


    // $ANTLR start "rule__Component__TypeAssignment_4_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5973:1: rule__Component__TypeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Component__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5977:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5978:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5978:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5979:1: ( RULE_ID )
            {
             before(grammarAccess.getComponentAccess().getTypeComponentTypeCrossReference_4_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5980:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5981:1: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getTypeComponentTypeIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Component__TypeAssignment_4_111760); 
             after(grammarAccess.getComponentAccess().getTypeComponentTypeIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getTypeComponentTypeCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Component__TypeAssignment_4_1"


    // $ANTLR start "rule__Component__IncomingConnectionsAssignment_5_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5992:1: rule__Component__IncomingConnectionsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Component__IncomingConnectionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5996:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5997:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5997:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5998:1: ( RULE_ID )
            {
             before(grammarAccess.getComponentAccess().getIncomingConnectionsConnectionCrossReference_5_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:5999:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6000:1: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getIncomingConnectionsConnectionIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Component__IncomingConnectionsAssignment_5_111799); 
             after(grammarAccess.getComponentAccess().getIncomingConnectionsConnectionIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getIncomingConnectionsConnectionCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Component__IncomingConnectionsAssignment_5_1"


    // $ANTLR start "rule__Component__DescriptionAssignment_6_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6011:1: rule__Component__DescriptionAssignment_6_1 : ( ruleDescription ) ;
    public final void rule__Component__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6015:1: ( ( ruleDescription ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6016:1: ( ruleDescription )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6016:1: ( ruleDescription )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6017:1: ruleDescription
            {
             before(grammarAccess.getComponentAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__Component__DescriptionAssignment_6_111834);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Component__DescriptionAssignment_6_1"


    // $ANTLR start "rule__Component__OutgoingConnectionsAssignment_7_2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6026:1: rule__Component__OutgoingConnectionsAssignment_7_2 : ( ruleConnection ) ;
    public final void rule__Component__OutgoingConnectionsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6030:1: ( ( ruleConnection ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6031:1: ( ruleConnection )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6031:1: ( ruleConnection )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6032:1: ruleConnection
            {
             before(grammarAccess.getComponentAccess().getOutgoingConnectionsConnectionParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleConnection_in_rule__Component__OutgoingConnectionsAssignment_7_211865);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getOutgoingConnectionsConnectionParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Component__OutgoingConnectionsAssignment_7_2"


    // $ANTLR start "rule__Component__OutgoingConnectionsAssignment_7_3_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6041:1: rule__Component__OutgoingConnectionsAssignment_7_3_1 : ( ruleConnection ) ;
    public final void rule__Component__OutgoingConnectionsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6045:1: ( ( ruleConnection ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6046:1: ( ruleConnection )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6046:1: ( ruleConnection )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6047:1: ruleConnection
            {
             before(grammarAccess.getComponentAccess().getOutgoingConnectionsConnectionParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_ruleConnection_in_rule__Component__OutgoingConnectionsAssignment_7_3_111896);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getOutgoingConnectionsConnectionParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__Component__OutgoingConnectionsAssignment_7_3_1"


    // $ANTLR start "rule__Component__ParameterValuesAssignment_8_2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6056:1: rule__Component__ParameterValuesAssignment_8_2 : ( ruleParameterValue ) ;
    public final void rule__Component__ParameterValuesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6060:1: ( ( ruleParameterValue ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6061:1: ( ruleParameterValue )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6061:1: ( ruleParameterValue )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6062:1: ruleParameterValue
            {
             before(grammarAccess.getComponentAccess().getParameterValuesParameterValueParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleParameterValue_in_rule__Component__ParameterValuesAssignment_8_211927);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getParameterValuesParameterValueParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Component__ParameterValuesAssignment_8_2"


    // $ANTLR start "rule__Component__ParameterValuesAssignment_8_3_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6071:1: rule__Component__ParameterValuesAssignment_8_3_1 : ( ruleParameterValue ) ;
    public final void rule__Component__ParameterValuesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6075:1: ( ( ruleParameterValue ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6076:1: ( ruleParameterValue )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6076:1: ( ruleParameterValue )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6077:1: ruleParameterValue
            {
             before(grammarAccess.getComponentAccess().getParameterValuesParameterValueParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_ruleParameterValue_in_rule__Component__ParameterValuesAssignment_8_3_111958);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getParameterValuesParameterValueParserRuleCall_8_3_1_0()); 

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
    // $ANTLR end "rule__Component__ParameterValuesAssignment_8_3_1"


    // $ANTLR start "rule__Connection__NameAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6086:1: rule__Connection__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6090:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6091:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6091:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6092:1: RULE_ID
            {
             before(grammarAccess.getConnectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Connection__NameAssignment_111989); 
             after(grammarAccess.getConnectionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Connection__NameAssignment_1"


    // $ANTLR start "rule__Connection__SourcePortAssignment_4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6101:1: rule__Connection__SourcePortAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Connection__SourcePortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6105:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6106:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6106:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6107:1: ( RULE_ID )
            {
             before(grammarAccess.getConnectionAccess().getSourcePortPortCrossReference_4_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6108:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6109:1: RULE_ID
            {
             before(grammarAccess.getConnectionAccess().getSourcePortPortIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Connection__SourcePortAssignment_412024); 
             after(grammarAccess.getConnectionAccess().getSourcePortPortIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConnectionAccess().getSourcePortPortCrossReference_4_0()); 

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
    // $ANTLR end "rule__Connection__SourcePortAssignment_4"


    // $ANTLR start "rule__Connection__TargetComponentAssignment_6"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6120:1: rule__Connection__TargetComponentAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Connection__TargetComponentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6124:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6125:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6125:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6126:1: ( RULE_ID )
            {
             before(grammarAccess.getConnectionAccess().getTargetComponentComponentCrossReference_6_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6127:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6128:1: RULE_ID
            {
             before(grammarAccess.getConnectionAccess().getTargetComponentComponentIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Connection__TargetComponentAssignment_612063); 
             after(grammarAccess.getConnectionAccess().getTargetComponentComponentIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getConnectionAccess().getTargetComponentComponentCrossReference_6_0()); 

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
    // $ANTLR end "rule__Connection__TargetComponentAssignment_6"


    // $ANTLR start "rule__Connection__DescriptionAssignment_7_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6139:1: rule__Connection__DescriptionAssignment_7_1 : ( ruleDescription ) ;
    public final void rule__Connection__DescriptionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6143:1: ( ( ruleDescription ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6144:1: ( ruleDescription )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6144:1: ( ruleDescription )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6145:1: ruleDescription
            {
             before(grammarAccess.getConnectionAccess().getDescriptionDescriptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__Connection__DescriptionAssignment_7_112098);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getDescriptionDescriptionParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Connection__DescriptionAssignment_7_1"


    // $ANTLR start "rule__ParameterValue__NameAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6154:1: rule__ParameterValue__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParameterValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6158:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6159:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6159:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6160:1: RULE_ID
            {
             before(grammarAccess.getParameterValueAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterValue__NameAssignment_112129); 
             after(grammarAccess.getParameterValueAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ParameterValue__NameAssignment_1"


    // $ANTLR start "rule__ParameterValue__ValueAssignment_3_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6169:1: rule__ParameterValue__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ParameterValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6173:1: ( ( RULE_STRING ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6174:1: ( RULE_STRING )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6174:1: ( RULE_STRING )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6175:1: RULE_STRING
            {
             before(grammarAccess.getParameterValueAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ParameterValue__ValueAssignment_3_112160); 
             after(grammarAccess.getParameterValueAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ParameterValue__ValueAssignment_3_1"


    // $ANTLR start "rule__ParameterValue__TypeAssignment_5"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6184:1: rule__ParameterValue__TypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterValue__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6188:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6189:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6189:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6190:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterValueAccess().getTypeParameterCrossReference_5_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6191:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6192:1: RULE_ID
            {
             before(grammarAccess.getParameterValueAccess().getTypeParameterIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterValue__TypeAssignment_512195); 
             after(grammarAccess.getParameterValueAccess().getTypeParameterIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getParameterValueAccess().getTypeParameterCrossReference_5_0()); 

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
    // $ANTLR end "rule__ParameterValue__TypeAssignment_5"


    // $ANTLR start "rule__ParameterValue__DescriptionAssignment_6_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6203:1: rule__ParameterValue__DescriptionAssignment_6_1 : ( ruleDescription ) ;
    public final void rule__ParameterValue__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6207:1: ( ( ruleDescription ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6208:1: ( ruleDescription )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6208:1: ( ruleDescription )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6209:1: ruleDescription
            {
             before(grammarAccess.getParameterValueAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__ParameterValue__DescriptionAssignment_6_112230);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getParameterValueAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__ParameterValue__DescriptionAssignment_6_1"


    // $ANTLR start "rule__Platform__NameAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6218:1: rule__Platform__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Platform__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6222:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6223:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6223:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6224:1: RULE_ID
            {
             before(grammarAccess.getPlatformAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Platform__NameAssignment_112261); 
             after(grammarAccess.getPlatformAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Platform__NameAssignment_1"


    // $ANTLR start "rule__Platform__DescriptionAssignment_3_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6233:1: rule__Platform__DescriptionAssignment_3_1 : ( ruleDescription ) ;
    public final void rule__Platform__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6237:1: ( ( ruleDescription ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6238:1: ( ruleDescription )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6238:1: ( ruleDescription )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6239:1: ruleDescription
            {
             before(grammarAccess.getPlatformAccess().getDescriptionDescriptionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__Platform__DescriptionAssignment_3_112292);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getDescriptionDescriptionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Platform__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Platform__ComponentTypesAssignment_6"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6248:1: rule__Platform__ComponentTypesAssignment_6 : ( ruleComponentType ) ;
    public final void rule__Platform__ComponentTypesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6252:1: ( ( ruleComponentType ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6253:1: ( ruleComponentType )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6253:1: ( ruleComponentType )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6254:1: ruleComponentType
            {
             before(grammarAccess.getPlatformAccess().getComponentTypesComponentTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleComponentType_in_rule__Platform__ComponentTypesAssignment_612323);
            ruleComponentType();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getComponentTypesComponentTypeParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Platform__ComponentTypesAssignment_6"


    // $ANTLR start "rule__Platform__ComponentTypesAssignment_7_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6263:1: rule__Platform__ComponentTypesAssignment_7_1 : ( ruleComponentType ) ;
    public final void rule__Platform__ComponentTypesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6267:1: ( ( ruleComponentType ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6268:1: ( ruleComponentType )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6268:1: ( ruleComponentType )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6269:1: ruleComponentType
            {
             before(grammarAccess.getPlatformAccess().getComponentTypesComponentTypeParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleComponentType_in_rule__Platform__ComponentTypesAssignment_7_112354);
            ruleComponentType();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getComponentTypesComponentTypeParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Platform__ComponentTypesAssignment_7_1"


    // $ANTLR start "rule__Platform__InterfacesAssignment_9_2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6278:1: rule__Platform__InterfacesAssignment_9_2 : ( ruleInterface ) ;
    public final void rule__Platform__InterfacesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6282:1: ( ( ruleInterface ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6283:1: ( ruleInterface )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6283:1: ( ruleInterface )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6284:1: ruleInterface
            {
             before(grammarAccess.getPlatformAccess().getInterfacesInterfaceParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__Platform__InterfacesAssignment_9_212385);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getInterfacesInterfaceParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Platform__InterfacesAssignment_9_2"


    // $ANTLR start "rule__Platform__InterfacesAssignment_9_3_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6293:1: rule__Platform__InterfacesAssignment_9_3_1 : ( ruleInterface ) ;
    public final void rule__Platform__InterfacesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6297:1: ( ( ruleInterface ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6298:1: ( ruleInterface )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6298:1: ( ruleInterface )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6299:1: ruleInterface
            {
             before(grammarAccess.getPlatformAccess().getInterfacesInterfaceParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__Platform__InterfacesAssignment_9_3_112416);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getInterfacesInterfaceParserRuleCall_9_3_1_0()); 

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
    // $ANTLR end "rule__Platform__InterfacesAssignment_9_3_1"


    // $ANTLR start "rule__ComponentType__NameAssignment_2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6308:1: rule__ComponentType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComponentType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6312:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6313:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6313:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6314:1: RULE_ID
            {
             before(grammarAccess.getComponentTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComponentType__NameAssignment_212447); 
             after(grammarAccess.getComponentTypeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ComponentType__NameAssignment_2"


    // $ANTLR start "rule__ComponentType__ProvidedInterfacesAssignment_4_2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6323:1: rule__ComponentType__ProvidedInterfacesAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__ComponentType__ProvidedInterfacesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6327:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6328:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6328:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6329:1: ( RULE_ID )
            {
             before(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceCrossReference_4_2_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6330:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6331:1: RULE_ID
            {
             before(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComponentType__ProvidedInterfacesAssignment_4_212482); 
             after(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__ComponentType__ProvidedInterfacesAssignment_4_2"


    // $ANTLR start "rule__ComponentType__ProvidedInterfacesAssignment_4_3_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6342:1: rule__ComponentType__ProvidedInterfacesAssignment_4_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ComponentType__ProvidedInterfacesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6346:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6347:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6347:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6348:1: ( RULE_ID )
            {
             before(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceCrossReference_4_3_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6349:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6350:1: RULE_ID
            {
             before(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceIDTerminalRuleCall_4_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComponentType__ProvidedInterfacesAssignment_4_3_112521); 
             after(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceIDTerminalRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__ComponentType__ProvidedInterfacesAssignment_4_3_1"


    // $ANTLR start "rule__ComponentType__DescriptionAssignment_5_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6361:1: rule__ComponentType__DescriptionAssignment_5_1 : ( ruleDescription ) ;
    public final void rule__ComponentType__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6365:1: ( ( ruleDescription ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6366:1: ( ruleDescription )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6366:1: ( ruleDescription )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6367:1: ruleDescription
            {
             before(grammarAccess.getComponentTypeAccess().getDescriptionDescriptionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__ComponentType__DescriptionAssignment_5_112556);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getComponentTypeAccess().getDescriptionDescriptionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__ComponentType__DescriptionAssignment_5_1"


    // $ANTLR start "rule__ComponentType__PortsAssignment_6_2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6376:1: rule__ComponentType__PortsAssignment_6_2 : ( rulePort ) ;
    public final void rule__ComponentType__PortsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6380:1: ( ( rulePort ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6381:1: ( rulePort )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6381:1: ( rulePort )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6382:1: rulePort
            {
             before(grammarAccess.getComponentTypeAccess().getPortsPortParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__ComponentType__PortsAssignment_6_212587);
            rulePort();

            state._fsp--;

             after(grammarAccess.getComponentTypeAccess().getPortsPortParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__ComponentType__PortsAssignment_6_2"


    // $ANTLR start "rule__ComponentType__PortsAssignment_6_3_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6391:1: rule__ComponentType__PortsAssignment_6_3_1 : ( rulePort ) ;
    public final void rule__ComponentType__PortsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6395:1: ( ( rulePort ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6396:1: ( rulePort )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6396:1: ( rulePort )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6397:1: rulePort
            {
             before(grammarAccess.getComponentTypeAccess().getPortsPortParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__ComponentType__PortsAssignment_6_3_112618);
            rulePort();

            state._fsp--;

             after(grammarAccess.getComponentTypeAccess().getPortsPortParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__ComponentType__PortsAssignment_6_3_1"


    // $ANTLR start "rule__ComponentType__ParametersAssignment_7_2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6406:1: rule__ComponentType__ParametersAssignment_7_2 : ( ruleParameter ) ;
    public final void rule__ComponentType__ParametersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6410:1: ( ( ruleParameter ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6411:1: ( ruleParameter )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6411:1: ( ruleParameter )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6412:1: ruleParameter
            {
             before(grammarAccess.getComponentTypeAccess().getParametersParameterParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ComponentType__ParametersAssignment_7_212649);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getComponentTypeAccess().getParametersParameterParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__ComponentType__ParametersAssignment_7_2"


    // $ANTLR start "rule__ComponentType__ParametersAssignment_7_3_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6421:1: rule__ComponentType__ParametersAssignment_7_3_1 : ( ruleParameter ) ;
    public final void rule__ComponentType__ParametersAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6425:1: ( ( ruleParameter ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6426:1: ( ruleParameter )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6426:1: ( ruleParameter )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6427:1: ruleParameter
            {
             before(grammarAccess.getComponentTypeAccess().getParametersParameterParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ComponentType__ParametersAssignment_7_3_112680);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getComponentTypeAccess().getParametersParameterParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__ComponentType__ParametersAssignment_7_3_1"


    // $ANTLR start "rule__Interface__NameAssignment_2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6436:1: rule__Interface__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6440:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6441:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6441:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6442:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_212711); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Interface__NameAssignment_2"


    // $ANTLR start "rule__Interface__ProvidingComponentTypesAssignment_4_2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6451:1: rule__Interface__ProvidingComponentTypesAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__ProvidingComponentTypesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6455:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6456:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6456:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6457:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeCrossReference_4_2_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6458:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6459:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__ProvidingComponentTypesAssignment_4_212746); 
             after(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__Interface__ProvidingComponentTypesAssignment_4_2"


    // $ANTLR start "rule__Interface__ProvidingComponentTypesAssignment_4_3_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6470:1: rule__Interface__ProvidingComponentTypesAssignment_4_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__ProvidingComponentTypesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6474:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6475:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6475:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6476:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeCrossReference_4_3_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6477:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6478:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeIDTerminalRuleCall_4_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__ProvidingComponentTypesAssignment_4_3_112785); 
             after(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeIDTerminalRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__Interface__ProvidingComponentTypesAssignment_4_3_1"


    // $ANTLR start "rule__Interface__RequiringPortsAssignment_5_2"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6489:1: rule__Interface__RequiringPortsAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__RequiringPortsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6493:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6494:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6494:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6495:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getRequiringPortsPortCrossReference_5_2_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6496:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6497:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getRequiringPortsPortIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__RequiringPortsAssignment_5_212824); 
             after(grammarAccess.getInterfaceAccess().getRequiringPortsPortIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getRequiringPortsPortCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__Interface__RequiringPortsAssignment_5_2"


    // $ANTLR start "rule__Interface__RequiringPortsAssignment_5_3_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6508:1: rule__Interface__RequiringPortsAssignment_5_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__RequiringPortsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6512:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6513:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6513:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6514:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getRequiringPortsPortCrossReference_5_3_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6515:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6516:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getRequiringPortsPortIDTerminalRuleCall_5_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__RequiringPortsAssignment_5_3_112863); 
             after(grammarAccess.getInterfaceAccess().getRequiringPortsPortIDTerminalRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getRequiringPortsPortCrossReference_5_3_1_0()); 

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
    // $ANTLR end "rule__Interface__RequiringPortsAssignment_5_3_1"


    // $ANTLR start "rule__Interface__DescriptionAssignment_6_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6527:1: rule__Interface__DescriptionAssignment_6_1 : ( ruleDescription ) ;
    public final void rule__Interface__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6531:1: ( ( ruleDescription ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6532:1: ( ruleDescription )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6532:1: ( ruleDescription )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6533:1: ruleDescription
            {
             before(grammarAccess.getInterfaceAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__Interface__DescriptionAssignment_6_112898);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Interface__DescriptionAssignment_6_1"


    // $ANTLR start "rule__Port__NameAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6542:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6546:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6547:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6547:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6548:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__NameAssignment_112929); 
             after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Port__NameAssignment_1"


    // $ANTLR start "rule__Port__MinProviderCountAssignment_4"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6557:1: rule__Port__MinProviderCountAssignment_4 : ( ruleInteger ) ;
    public final void rule__Port__MinProviderCountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6561:1: ( ( ruleInteger ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6562:1: ( ruleInteger )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6562:1: ( ruleInteger )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6563:1: ruleInteger
            {
             before(grammarAccess.getPortAccess().getMinProviderCountIntegerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInteger_in_rule__Port__MinProviderCountAssignment_412960);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getPortAccess().getMinProviderCountIntegerParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Port__MinProviderCountAssignment_4"


    // $ANTLR start "rule__Port__MaxProviderCountAssignment_6"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6572:1: rule__Port__MaxProviderCountAssignment_6 : ( ruleInteger ) ;
    public final void rule__Port__MaxProviderCountAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6576:1: ( ( ruleInteger ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6577:1: ( ruleInteger )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6577:1: ( ruleInteger )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6578:1: ruleInteger
            {
             before(grammarAccess.getPortAccess().getMaxProviderCountIntegerParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleInteger_in_rule__Port__MaxProviderCountAssignment_612991);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getPortAccess().getMaxProviderCountIntegerParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Port__MaxProviderCountAssignment_6"


    // $ANTLR start "rule__Port__RequiredInterfaceAssignment_8"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6587:1: rule__Port__RequiredInterfaceAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Port__RequiredInterfaceAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6591:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6592:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6592:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6593:1: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getRequiredInterfaceInterfaceCrossReference_8_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6594:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6595:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getRequiredInterfaceInterfaceIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__RequiredInterfaceAssignment_813026); 
             after(grammarAccess.getPortAccess().getRequiredInterfaceInterfaceIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getPortAccess().getRequiredInterfaceInterfaceCrossReference_8_0()); 

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
    // $ANTLR end "rule__Port__RequiredInterfaceAssignment_8"


    // $ANTLR start "rule__Port__DescriptionAssignment_9_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6606:1: rule__Port__DescriptionAssignment_9_1 : ( ruleDescription ) ;
    public final void rule__Port__DescriptionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6610:1: ( ( ruleDescription ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6611:1: ( ruleDescription )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6611:1: ( ruleDescription )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6612:1: ruleDescription
            {
             before(grammarAccess.getPortAccess().getDescriptionDescriptionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__Port__DescriptionAssignment_9_113061);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getPortAccess().getDescriptionDescriptionParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Port__DescriptionAssignment_9_1"


    // $ANTLR start "rule__Parameter__OptionalAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6621:1: rule__Parameter__OptionalAssignment_1 : ( ( 'optional' ) ) ;
    public final void rule__Parameter__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6625:1: ( ( ( 'optional' ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6626:1: ( ( 'optional' ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6626:1: ( ( 'optional' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6627:1: ( 'optional' )
            {
             before(grammarAccess.getParameterAccess().getOptionalOptionalKeyword_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6628:1: ( 'optional' )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6629:1: 'optional'
            {
             before(grammarAccess.getParameterAccess().getOptionalOptionalKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__Parameter__OptionalAssignment_113097); 
             after(grammarAccess.getParameterAccess().getOptionalOptionalKeyword_1_0()); 

            }

             after(grammarAccess.getParameterAccess().getOptionalOptionalKeyword_1_0()); 

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
    // $ANTLR end "rule__Parameter__OptionalAssignment_1"


    // $ANTLR start "rule__Parameter__NameAssignment_3"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6644:1: rule__Parameter__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6648:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6649:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6649:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6650:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_313136); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_3"


    // $ANTLR start "rule__Parameter__DataTypeAssignment_5_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6659:1: rule__Parameter__DataTypeAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Parameter__DataTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6663:1: ( ( RULE_STRING ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6664:1: ( RULE_STRING )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6664:1: ( RULE_STRING )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6665:1: RULE_STRING
            {
             before(grammarAccess.getParameterAccess().getDataTypeSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Parameter__DataTypeAssignment_5_113167); 
             after(grammarAccess.getParameterAccess().getDataTypeSTRINGTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Parameter__DataTypeAssignment_5_1"


    // $ANTLR start "rule__Parameter__DescriptionAssignment_6_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6674:1: rule__Parameter__DescriptionAssignment_6_1 : ( ruleDescription ) ;
    public final void rule__Parameter__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6678:1: ( ( ruleDescription ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6679:1: ( ruleDescription )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6679:1: ( ruleDescription )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6680:1: ruleDescription
            {
             before(grammarAccess.getParameterAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__Parameter__DescriptionAssignment_6_113198);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Parameter__DescriptionAssignment_6_1"


    // $ANTLR start "rule__Description__DescriptionAssignment"
    // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6690:1: rule__Description__DescriptionAssignment : ( RULE_STRING ) ;
    public final void rule__Description__DescriptionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6694:1: ( ( RULE_STRING ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6695:1: ( RULE_STRING )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6695:1: ( RULE_STRING )
            // D:\\git\\dslforge\\examples\\org.eclipse.sphinx.examples.xtext.hummingbird.web\\src-gen\\org\\eclipse\\sphinx\\examples\\xtext\\hummingbird\\web\\contentassist\\antlr\\internal\\InternalHummingbird.g:6696:1: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Description__DescriptionAssignment13230); 
             after(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Description__DescriptionAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleEntryPoint_in_entryRuleEntryPoint61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPoint68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryPoint__Alternatives_in_ruleEntryPoint94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0_in_ruleApplication154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnection248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__0_in_ruleConnection274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterValue_in_entryRuleParameterValue301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterValue308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__0_in_ruleParameterValue334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0_in_rulePlatform394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentType_in_entryRuleComponentType421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentType428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__0_in_ruleComponentType454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__DescriptionAssignment_in_ruleDescription758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__EntryPoint__Alternatives794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_rule__EntryPoint__Alternatives811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__0843 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__0846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Application__Group__0__Impl874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__1905 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__2965 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Application__Group__2__Impl996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__31027 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Application__Group__4_in_rule__Application__Group__31030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_3__0_in_rule__Application__Group__3__Impl1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__41088 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Application__Group__5_in_rule__Application__Group__41091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Application__Group__4__Impl1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__51150 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Application__Group__6_in_rule__Application__Group__51153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Application__Group__5__Impl1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__6__Impl_in_rule__Application__Group__61212 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Application__Group__7_in_rule__Application__Group__61215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__ComponentsAssignment_6_in_rule__Application__Group__6__Impl1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__7__Impl_in_rule__Application__Group__71272 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Application__Group__8_in_rule__Application__Group__71275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_7__0_in_rule__Application__Group__7__Impl1302 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Application__Group__8__Impl_in_rule__Application__Group__81333 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Application__Group__9_in_rule__Application__Group__81336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Application__Group__8__Impl1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__9__Impl_in_rule__Application__Group__91395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Application__Group__9__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_3__0__Impl_in_rule__Application__Group_3__01474 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Application__Group_3__1_in_rule__Application__Group_3__01477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Application__Group_3__0__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_3__1__Impl_in_rule__Application__Group_3__11536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__DescriptionAssignment_3_1_in_rule__Application__Group_3__1__Impl1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_7__0__Impl_in_rule__Application__Group_7__01597 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Application__Group_7__1_in_rule__Application__Group_7__01600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Application__Group_7__0__Impl1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_7__1__Impl_in_rule__Application__Group_7__11659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__ComponentsAssignment_7_1_in_rule__Application__Group_7__1__Impl1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__01720 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__01723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11781 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Component__Group__1__Impl1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21843 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__21846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_2_in_rule__Component__Group__2__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__31903 = new BitSet(new long[]{0x00000000003CC000L});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__31906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Component__Group__3__Impl1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41965 = new BitSet(new long[]{0x00000000003CC000L});
    public static final BitSet FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_4__0_in_rule__Component__Group__4__Impl1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__52026 = new BitSet(new long[]{0x00000000003CC000L});
    public static final BitSet FOLLOW_rule__Component__Group__6_in_rule__Component__Group__52029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_5__0_in_rule__Component__Group__5__Impl2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__62087 = new BitSet(new long[]{0x00000000003CC000L});
    public static final BitSet FOLLOW_rule__Component__Group__7_in_rule__Component__Group__62090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_6__0_in_rule__Component__Group__6__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__7__Impl_in_rule__Component__Group__72148 = new BitSet(new long[]{0x00000000003CC000L});
    public static final BitSet FOLLOW_rule__Component__Group__8_in_rule__Component__Group__72151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_7__0_in_rule__Component__Group__7__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__8__Impl_in_rule__Component__Group__82209 = new BitSet(new long[]{0x00000000003CC000L});
    public static final BitSet FOLLOW_rule__Component__Group__9_in_rule__Component__Group__82212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_8__0_in_rule__Component__Group__8__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__9__Impl_in_rule__Component__Group__92270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Component__Group__9__Impl2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_4__0__Impl_in_rule__Component__Group_4__02349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Component__Group_4__1_in_rule__Component__Group_4__02352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Component__Group_4__0__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_4__1__Impl_in_rule__Component__Group_4__12411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__TypeAssignment_4_1_in_rule__Component__Group_4__1__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_5__0__Impl_in_rule__Component__Group_5__02472 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Component__Group_5__1_in_rule__Component__Group_5__02475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Component__Group_5__0__Impl2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_5__1__Impl_in_rule__Component__Group_5__12534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__IncomingConnectionsAssignment_5_1_in_rule__Component__Group_5__1__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_6__0__Impl_in_rule__Component__Group_6__02595 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Component__Group_6__1_in_rule__Component__Group_6__02598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Component__Group_6__0__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_6__1__Impl_in_rule__Component__Group_6__12657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__DescriptionAssignment_6_1_in_rule__Component__Group_6__1__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_7__0__Impl_in_rule__Component__Group_7__02718 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Component__Group_7__1_in_rule__Component__Group_7__02721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Component__Group_7__0__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_7__1__Impl_in_rule__Component__Group_7__12780 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Component__Group_7__2_in_rule__Component__Group_7__12783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Component__Group_7__1__Impl2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_7__2__Impl_in_rule__Component__Group_7__22842 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Component__Group_7__3_in_rule__Component__Group_7__22845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__OutgoingConnectionsAssignment_7_2_in_rule__Component__Group_7__2__Impl2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_7__3__Impl_in_rule__Component__Group_7__32902 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Component__Group_7__4_in_rule__Component__Group_7__32905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_7_3__0_in_rule__Component__Group_7__3__Impl2932 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Component__Group_7__4__Impl_in_rule__Component__Group_7__42963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Component__Group_7__4__Impl2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_7_3__0__Impl_in_rule__Component__Group_7_3__03032 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Component__Group_7_3__1_in_rule__Component__Group_7_3__03035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Component__Group_7_3__0__Impl3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_7_3__1__Impl_in_rule__Component__Group_7_3__13094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__OutgoingConnectionsAssignment_7_3_1_in_rule__Component__Group_7_3__1__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_8__0__Impl_in_rule__Component__Group_8__03155 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Component__Group_8__1_in_rule__Component__Group_8__03158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Component__Group_8__0__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_8__1__Impl_in_rule__Component__Group_8__13217 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Component__Group_8__2_in_rule__Component__Group_8__13220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Component__Group_8__1__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_8__2__Impl_in_rule__Component__Group_8__23279 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Component__Group_8__3_in_rule__Component__Group_8__23282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__ParameterValuesAssignment_8_2_in_rule__Component__Group_8__2__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_8__3__Impl_in_rule__Component__Group_8__33339 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Component__Group_8__4_in_rule__Component__Group_8__33342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_8_3__0_in_rule__Component__Group_8__3__Impl3369 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Component__Group_8__4__Impl_in_rule__Component__Group_8__43400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Component__Group_8__4__Impl3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_8_3__0__Impl_in_rule__Component__Group_8_3__03469 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Component__Group_8_3__1_in_rule__Component__Group_8_3__03472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Component__Group_8_3__0__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_8_3__1__Impl_in_rule__Component__Group_8_3__13531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__ParameterValuesAssignment_8_3_1_in_rule__Component__Group_8_3__1__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__03592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__03595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Connection__Group__0__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__13654 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__13657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__NameAssignment_1_in_rule__Connection__Group__1__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__23714 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__23717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Connection__Group__2__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__33776 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Connection__Group__4_in_rule__Connection__Group__33779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Connection__Group__3__Impl3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__4__Impl_in_rule__Connection__Group__43838 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Connection__Group__5_in_rule__Connection__Group__43841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__SourcePortAssignment_4_in_rule__Connection__Group__4__Impl3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__5__Impl_in_rule__Connection__Group__53898 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Connection__Group__6_in_rule__Connection__Group__53901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Connection__Group__5__Impl3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__6__Impl_in_rule__Connection__Group__63960 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Connection__Group__7_in_rule__Connection__Group__63963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__TargetComponentAssignment_6_in_rule__Connection__Group__6__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__7__Impl_in_rule__Connection__Group__74020 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Connection__Group__8_in_rule__Connection__Group__74023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_7__0_in_rule__Connection__Group__7__Impl4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__8__Impl_in_rule__Connection__Group__84081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Connection__Group__8__Impl4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_7__0__Impl_in_rule__Connection__Group_7__04158 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Connection__Group_7__1_in_rule__Connection__Group_7__04161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Connection__Group_7__0__Impl4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_7__1__Impl_in_rule__Connection__Group_7__14220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__DescriptionAssignment_7_1_in_rule__Connection__Group_7__1__Impl4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__0__Impl_in_rule__ParameterValue__Group__04281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__1_in_rule__ParameterValue__Group__04284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ParameterValue__Group__0__Impl4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__1__Impl_in_rule__ParameterValue__Group__14343 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__2_in_rule__ParameterValue__Group__14346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__NameAssignment_1_in_rule__ParameterValue__Group__1__Impl4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__2__Impl_in_rule__ParameterValue__Group__24403 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__3_in_rule__ParameterValue__Group__24406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ParameterValue__Group__2__Impl4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__3__Impl_in_rule__ParameterValue__Group__34465 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__4_in_rule__ParameterValue__Group__34468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group_3__0_in_rule__ParameterValue__Group__3__Impl4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__4__Impl_in_rule__ParameterValue__Group__44526 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__5_in_rule__ParameterValue__Group__44529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ParameterValue__Group__4__Impl4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__5__Impl_in_rule__ParameterValue__Group__54588 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__6_in_rule__ParameterValue__Group__54591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__TypeAssignment_5_in_rule__ParameterValue__Group__5__Impl4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__6__Impl_in_rule__ParameterValue__Group__64648 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__7_in_rule__ParameterValue__Group__64651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group_6__0_in_rule__ParameterValue__Group__6__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group__7__Impl_in_rule__ParameterValue__Group__74709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ParameterValue__Group__7__Impl4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group_3__0__Impl_in_rule__ParameterValue__Group_3__04784 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group_3__1_in_rule__ParameterValue__Group_3__04787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ParameterValue__Group_3__0__Impl4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group_3__1__Impl_in_rule__ParameterValue__Group_3__14846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__ValueAssignment_3_1_in_rule__ParameterValue__Group_3__1__Impl4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group_6__0__Impl_in_rule__ParameterValue__Group_6__04907 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group_6__1_in_rule__ParameterValue__Group_6__04910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ParameterValue__Group_6__0__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__Group_6__1__Impl_in_rule__ParameterValue__Group_6__14969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterValue__DescriptionAssignment_6_1_in_rule__ParameterValue__Group_6__1__Impl4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__05030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__05033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Platform__Group__0__Impl5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__15092 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__15095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__NameAssignment_1_in_rule__Platform__Group__1__Impl5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__25152 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__25155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Platform__Group__2__Impl5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__35214 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_rule__Platform__Group__4_in_rule__Platform__Group__35217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_3__0_in_rule__Platform__Group__3__Impl5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__4__Impl_in_rule__Platform__Group__45275 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Platform__Group__5_in_rule__Platform__Group__45278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Platform__Group__4__Impl5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__5__Impl_in_rule__Platform__Group__55337 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Platform__Group__6_in_rule__Platform__Group__55340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Platform__Group__5__Impl5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__6__Impl_in_rule__Platform__Group__65399 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Platform__Group__7_in_rule__Platform__Group__65402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__ComponentTypesAssignment_6_in_rule__Platform__Group__6__Impl5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__7__Impl_in_rule__Platform__Group__75459 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Platform__Group__8_in_rule__Platform__Group__75462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_7__0_in_rule__Platform__Group__7__Impl5489 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Platform__Group__8__Impl_in_rule__Platform__Group__85520 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_rule__Platform__Group__9_in_rule__Platform__Group__85523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Platform__Group__8__Impl5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__9__Impl_in_rule__Platform__Group__95582 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_rule__Platform__Group__10_in_rule__Platform__Group__95585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_9__0_in_rule__Platform__Group__9__Impl5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__10__Impl_in_rule__Platform__Group__105643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Platform__Group__10__Impl5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_3__0__Impl_in_rule__Platform__Group_3__05724 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Platform__Group_3__1_in_rule__Platform__Group_3__05727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Platform__Group_3__0__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_3__1__Impl_in_rule__Platform__Group_3__15786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__DescriptionAssignment_3_1_in_rule__Platform__Group_3__1__Impl5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_7__0__Impl_in_rule__Platform__Group_7__05847 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Platform__Group_7__1_in_rule__Platform__Group_7__05850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Platform__Group_7__0__Impl5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_7__1__Impl_in_rule__Platform__Group_7__15909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__ComponentTypesAssignment_7_1_in_rule__Platform__Group_7__1__Impl5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_9__0__Impl_in_rule__Platform__Group_9__05970 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Platform__Group_9__1_in_rule__Platform__Group_9__05973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Platform__Group_9__0__Impl6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_9__1__Impl_in_rule__Platform__Group_9__16032 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Platform__Group_9__2_in_rule__Platform__Group_9__16035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Platform__Group_9__1__Impl6063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_9__2__Impl_in_rule__Platform__Group_9__26094 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Platform__Group_9__3_in_rule__Platform__Group_9__26097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__InterfacesAssignment_9_2_in_rule__Platform__Group_9__2__Impl6124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_9__3__Impl_in_rule__Platform__Group_9__36154 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Platform__Group_9__4_in_rule__Platform__Group_9__36157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_9_3__0_in_rule__Platform__Group_9__3__Impl6184 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Platform__Group_9__4__Impl_in_rule__Platform__Group_9__46215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Platform__Group_9__4__Impl6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_9_3__0__Impl_in_rule__Platform__Group_9_3__06284 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Platform__Group_9_3__1_in_rule__Platform__Group_9_3__06287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Platform__Group_9_3__0__Impl6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_9_3__1__Impl_in_rule__Platform__Group_9_3__16346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__InterfacesAssignment_9_3_1_in_rule__Platform__Group_9_3__1__Impl6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__0__Impl_in_rule__ComponentType__Group__06407 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__1_in_rule__ComponentType__Group__06410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__1__Impl_in_rule__ComponentType__Group__16468 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__2_in_rule__ComponentType__Group__16471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ComponentType__Group__1__Impl6499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__2__Impl_in_rule__ComponentType__Group__26530 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__3_in_rule__ComponentType__Group__26533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__NameAssignment_2_in_rule__ComponentType__Group__2__Impl6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__3__Impl_in_rule__ComponentType__Group__36590 = new BitSet(new long[]{0x0000000C8000C000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__4_in_rule__ComponentType__Group__36593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ComponentType__Group__3__Impl6621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__4__Impl_in_rule__ComponentType__Group__46652 = new BitSet(new long[]{0x0000000C8000C000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__5_in_rule__ComponentType__Group__46655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_4__0_in_rule__ComponentType__Group__4__Impl6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__5__Impl_in_rule__ComponentType__Group__56713 = new BitSet(new long[]{0x0000000C8000C000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__6_in_rule__ComponentType__Group__56716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_5__0_in_rule__ComponentType__Group__5__Impl6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__6__Impl_in_rule__ComponentType__Group__66774 = new BitSet(new long[]{0x0000000C8000C000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__7_in_rule__ComponentType__Group__66777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_6__0_in_rule__ComponentType__Group__6__Impl6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__7__Impl_in_rule__ComponentType__Group__76835 = new BitSet(new long[]{0x0000000C8000C000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__8_in_rule__ComponentType__Group__76838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_7__0_in_rule__ComponentType__Group__7__Impl6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group__8__Impl_in_rule__ComponentType__Group__86896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComponentType__Group__8__Impl6924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_4__0__Impl_in_rule__ComponentType__Group_4__06973 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_4__1_in_rule__ComponentType__Group_4__06976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ComponentType__Group_4__0__Impl7004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_4__1__Impl_in_rule__ComponentType__Group_4__17035 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_4__2_in_rule__ComponentType__Group_4__17038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ComponentType__Group_4__1__Impl7066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_4__2__Impl_in_rule__ComponentType__Group_4__27097 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_4__3_in_rule__ComponentType__Group_4__27100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__ProvidedInterfacesAssignment_4_2_in_rule__ComponentType__Group_4__2__Impl7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_4__3__Impl_in_rule__ComponentType__Group_4__37157 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_4__4_in_rule__ComponentType__Group_4__37160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_4_3__0_in_rule__ComponentType__Group_4__3__Impl7187 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_4__4__Impl_in_rule__ComponentType__Group_4__47218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ComponentType__Group_4__4__Impl7246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_4_3__0__Impl_in_rule__ComponentType__Group_4_3__07287 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_4_3__1_in_rule__ComponentType__Group_4_3__07290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComponentType__Group_4_3__0__Impl7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_4_3__1__Impl_in_rule__ComponentType__Group_4_3__17349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__ProvidedInterfacesAssignment_4_3_1_in_rule__ComponentType__Group_4_3__1__Impl7376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_5__0__Impl_in_rule__ComponentType__Group_5__07410 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_5__1_in_rule__ComponentType__Group_5__07413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComponentType__Group_5__0__Impl7441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_5__1__Impl_in_rule__ComponentType__Group_5__17472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__DescriptionAssignment_5_1_in_rule__ComponentType__Group_5__1__Impl7499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_6__0__Impl_in_rule__ComponentType__Group_6__07533 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_6__1_in_rule__ComponentType__Group_6__07536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ComponentType__Group_6__0__Impl7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_6__1__Impl_in_rule__ComponentType__Group_6__17595 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_6__2_in_rule__ComponentType__Group_6__17598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ComponentType__Group_6__1__Impl7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_6__2__Impl_in_rule__ComponentType__Group_6__27657 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_6__3_in_rule__ComponentType__Group_6__27660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__PortsAssignment_6_2_in_rule__ComponentType__Group_6__2__Impl7687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_6__3__Impl_in_rule__ComponentType__Group_6__37717 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_6__4_in_rule__ComponentType__Group_6__37720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_6_3__0_in_rule__ComponentType__Group_6__3__Impl7747 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_6__4__Impl_in_rule__ComponentType__Group_6__47778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComponentType__Group_6__4__Impl7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_6_3__0__Impl_in_rule__ComponentType__Group_6_3__07847 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_6_3__1_in_rule__ComponentType__Group_6_3__07850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComponentType__Group_6_3__0__Impl7878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_6_3__1__Impl_in_rule__ComponentType__Group_6_3__17909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__PortsAssignment_6_3_1_in_rule__ComponentType__Group_6_3__1__Impl7936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_7__0__Impl_in_rule__ComponentType__Group_7__07970 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_7__1_in_rule__ComponentType__Group_7__07973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ComponentType__Group_7__0__Impl8001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_7__1__Impl_in_rule__ComponentType__Group_7__18032 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_7__2_in_rule__ComponentType__Group_7__18035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ComponentType__Group_7__1__Impl8063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_7__2__Impl_in_rule__ComponentType__Group_7__28094 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_7__3_in_rule__ComponentType__Group_7__28097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__ParametersAssignment_7_2_in_rule__ComponentType__Group_7__2__Impl8124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_7__3__Impl_in_rule__ComponentType__Group_7__38154 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_7__4_in_rule__ComponentType__Group_7__38157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_7_3__0_in_rule__ComponentType__Group_7__3__Impl8184 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_7__4__Impl_in_rule__ComponentType__Group_7__48215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComponentType__Group_7__4__Impl8243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_7_3__0__Impl_in_rule__ComponentType__Group_7_3__08284 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_7_3__1_in_rule__ComponentType__Group_7_3__08287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComponentType__Group_7_3__0__Impl8315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__Group_7_3__1__Impl_in_rule__ComponentType__Group_7_3__18346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentType__ParametersAssignment_7_3_1_in_rule__ComponentType__Group_7_3__1__Impl8373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__08407 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__08410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__18468 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__18471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Interface__Group__1__Impl8499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__28530 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__28533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl8560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__38590 = new BitSet(new long[]{0x000000600000C000L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__38593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Interface__Group__3__Impl8621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__48652 = new BitSet(new long[]{0x000000600000C000L});
    public static final BitSet FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__48655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__0_in_rule__Interface__Group__4__Impl8682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__58713 = new BitSet(new long[]{0x000000600000C000L});
    public static final BitSet FOLLOW_rule__Interface__Group__6_in_rule__Interface__Group__58716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__0_in_rule__Interface__Group__5__Impl8743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__6__Impl_in_rule__Interface__Group__68774 = new BitSet(new long[]{0x000000600000C000L});
    public static final BitSet FOLLOW_rule__Interface__Group__7_in_rule__Interface__Group__68777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__0_in_rule__Interface__Group__6__Impl8804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__7__Impl_in_rule__Interface__Group__78835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Interface__Group__7__Impl8863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__0__Impl_in_rule__Interface__Group_4__08910 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__1_in_rule__Interface__Group_4__08913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Interface__Group_4__0__Impl8941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__1__Impl_in_rule__Interface__Group_4__18972 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__2_in_rule__Interface__Group_4__18975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Interface__Group_4__1__Impl9003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__2__Impl_in_rule__Interface__Group_4__29034 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__3_in_rule__Interface__Group_4__29037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__ProvidingComponentTypesAssignment_4_2_in_rule__Interface__Group_4__2__Impl9064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__3__Impl_in_rule__Interface__Group_4__39094 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__4_in_rule__Interface__Group_4__39097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4_3__0_in_rule__Interface__Group_4__3__Impl9124 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__4__Impl_in_rule__Interface__Group_4__49155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Interface__Group_4__4__Impl9183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4_3__0__Impl_in_rule__Interface__Group_4_3__09224 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Interface__Group_4_3__1_in_rule__Interface__Group_4_3__09227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Interface__Group_4_3__0__Impl9255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4_3__1__Impl_in_rule__Interface__Group_4_3__19286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__ProvidingComponentTypesAssignment_4_3_1_in_rule__Interface__Group_4_3__1__Impl9313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__0__Impl_in_rule__Interface__Group_5__09347 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__1_in_rule__Interface__Group_5__09350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Interface__Group_5__0__Impl9378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__1__Impl_in_rule__Interface__Group_5__19409 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__2_in_rule__Interface__Group_5__19412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Interface__Group_5__1__Impl9440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__2__Impl_in_rule__Interface__Group_5__29471 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__3_in_rule__Interface__Group_5__29474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__RequiringPortsAssignment_5_2_in_rule__Interface__Group_5__2__Impl9501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__3__Impl_in_rule__Interface__Group_5__39531 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__4_in_rule__Interface__Group_5__39534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_5_3__0_in_rule__Interface__Group_5__3__Impl9561 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__4__Impl_in_rule__Interface__Group_5__49592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Interface__Group_5__4__Impl9620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_5_3__0__Impl_in_rule__Interface__Group_5_3__09661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Interface__Group_5_3__1_in_rule__Interface__Group_5_3__09664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Interface__Group_5_3__0__Impl9692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_5_3__1__Impl_in_rule__Interface__Group_5_3__19723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__RequiringPortsAssignment_5_3_1_in_rule__Interface__Group_5_3__1__Impl9750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__0__Impl_in_rule__Interface__Group_6__09784 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__1_in_rule__Interface__Group_6__09787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Interface__Group_6__0__Impl9815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__1__Impl_in_rule__Interface__Group_6__19846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__DescriptionAssignment_6_1_in_rule__Interface__Group_6__1__Impl9873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__09907 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__09910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Port__Group__0__Impl9938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__19969 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Port__Group__2_in_rule__Port__Group__19972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl9999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__210029 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Port__Group__3_in_rule__Port__Group__210032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Port__Group__2__Impl10060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__3__Impl_in_rule__Port__Group__310091 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__4_in_rule__Port__Group__310094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Port__Group__3__Impl10122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__4__Impl_in_rule__Port__Group__410153 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Port__Group__5_in_rule__Port__Group__410156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__MinProviderCountAssignment_4_in_rule__Port__Group__4__Impl10183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__5__Impl_in_rule__Port__Group__510213 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__6_in_rule__Port__Group__510216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Port__Group__5__Impl10244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__6__Impl_in_rule__Port__Group__610275 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Port__Group__7_in_rule__Port__Group__610278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__MaxProviderCountAssignment_6_in_rule__Port__Group__6__Impl10305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__7__Impl_in_rule__Port__Group__710335 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Port__Group__8_in_rule__Port__Group__710338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Port__Group__7__Impl10366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__8__Impl_in_rule__Port__Group__810397 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Port__Group__9_in_rule__Port__Group__810400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__RequiredInterfaceAssignment_8_in_rule__Port__Group__8__Impl10427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__9__Impl_in_rule__Port__Group__910457 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Port__Group__10_in_rule__Port__Group__910460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_9__0_in_rule__Port__Group__9__Impl10487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__10__Impl_in_rule__Port__Group__1010518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Port__Group__10__Impl10546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_9__0__Impl_in_rule__Port__Group_9__010599 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Port__Group_9__1_in_rule__Port__Group_9__010602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Port__Group_9__0__Impl10630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_9__1__Impl_in_rule__Port__Group_9__110661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__DescriptionAssignment_9_1_in_rule__Port__Group_9__1__Impl10688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__010722 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__010725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__110783 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__110786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__OptionalAssignment_1_in_rule__Parameter__Group__1__Impl10813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__210844 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__210847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Parameter__Group__2__Impl10875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__310906 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__4_in_rule__Parameter__Group__310909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_3_in_rule__Parameter__Group__3__Impl10936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__4__Impl_in_rule__Parameter__Group__410966 = new BitSet(new long[]{0x000010000000C000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__5_in_rule__Parameter__Group__410969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Parameter__Group__4__Impl10997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__5__Impl_in_rule__Parameter__Group__511028 = new BitSet(new long[]{0x000010000000C000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__6_in_rule__Parameter__Group__511031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_5__0_in_rule__Parameter__Group__5__Impl11058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__6__Impl_in_rule__Parameter__Group__611089 = new BitSet(new long[]{0x000010000000C000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__7_in_rule__Parameter__Group__611092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_6__0_in_rule__Parameter__Group__6__Impl11119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__7__Impl_in_rule__Parameter__Group__711150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Parameter__Group__7__Impl11178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_5__0__Impl_in_rule__Parameter__Group_5__011225 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Parameter__Group_5__1_in_rule__Parameter__Group_5__011228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Parameter__Group_5__0__Impl11256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_5__1__Impl_in_rule__Parameter__Group_5__111287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DataTypeAssignment_5_1_in_rule__Parameter__Group_5__1__Impl11314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_6__0__Impl_in_rule__Parameter__Group_6__011348 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Parameter__Group_6__1_in_rule__Parameter__Group_6__011351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Parameter__Group_6__0__Impl11379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_6__1__Impl_in_rule__Parameter__Group_6__111410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DescriptionAssignment_6_1_in_rule__Parameter__Group_6__1__Impl11437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__011471 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__011474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Integer__Group__0__Impl11503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__111536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Integer__Group__1__Impl11563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Application__NameAssignment_111601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__Application__DescriptionAssignment_3_111632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Application__ComponentsAssignment_611663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Application__ComponentsAssignment_7_111694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Component__NameAssignment_211725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Component__TypeAssignment_4_111760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Component__IncomingConnectionsAssignment_5_111799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__Component__DescriptionAssignment_6_111834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_rule__Component__OutgoingConnectionsAssignment_7_211865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_rule__Component__OutgoingConnectionsAssignment_7_3_111896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterValue_in_rule__Component__ParameterValuesAssignment_8_211927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterValue_in_rule__Component__ParameterValuesAssignment_8_3_111958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Connection__NameAssignment_111989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Connection__SourcePortAssignment_412024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Connection__TargetComponentAssignment_612063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__Connection__DescriptionAssignment_7_112098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterValue__NameAssignment_112129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ParameterValue__ValueAssignment_3_112160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterValue__TypeAssignment_512195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__ParameterValue__DescriptionAssignment_6_112230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Platform__NameAssignment_112261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__Platform__DescriptionAssignment_3_112292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentType_in_rule__Platform__ComponentTypesAssignment_612323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentType_in_rule__Platform__ComponentTypesAssignment_7_112354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Platform__InterfacesAssignment_9_212385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Platform__InterfacesAssignment_9_3_112416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComponentType__NameAssignment_212447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComponentType__ProvidedInterfacesAssignment_4_212482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComponentType__ProvidedInterfacesAssignment_4_3_112521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__ComponentType__DescriptionAssignment_5_112556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__ComponentType__PortsAssignment_6_212587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__ComponentType__PortsAssignment_6_3_112618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ComponentType__ParametersAssignment_7_212649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ComponentType__ParametersAssignment_7_3_112680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_212711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__ProvidingComponentTypesAssignment_4_212746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__ProvidingComponentTypesAssignment_4_3_112785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__RequiringPortsAssignment_5_212824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__RequiringPortsAssignment_5_3_112863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__Interface__DescriptionAssignment_6_112898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__NameAssignment_112929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Port__MinProviderCountAssignment_412960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Port__MaxProviderCountAssignment_612991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__RequiredInterfaceAssignment_813026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__Port__DescriptionAssignment_9_113061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Parameter__OptionalAssignment_113097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_313136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Parameter__DataTypeAssignment_5_113167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__Parameter__DescriptionAssignment_6_113198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Description__DescriptionAssignment13230 = new BitSet(new long[]{0x0000000000000002L});

}