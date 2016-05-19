// $ANTLR 3.3 avr. 19, 2016 01:13:22 D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g 2016-05-18 22:02:11

package org.eclipse.xtext.example.domainmodel.web.contentassist.antlr.internal; 

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
import org.eclipse.xtext.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalDomainmodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'public'", "'private'", "'protected'", "'import'", "'package'", "'{'", "'}'", "'datatype'", "'entity'", "'extends'", "':'", "'ref'", "'opposite'", "'op'", "'('", "')'", "','", "'.'", "'*'"
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
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g"; }


     
     	private DomainmodelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DomainmodelGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDomainModel"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:58:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:59:1: ( ruleDomainModel EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:60:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel61);
            ruleDomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel68); 

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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:67:1: ruleDomainModel : ( ( rule__DomainModel__ElementsAssignment )* ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:71:2: ( ( ( rule__DomainModel__ElementsAssignment )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:72:1: ( ( rule__DomainModel__ElementsAssignment )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:72:1: ( ( rule__DomainModel__ElementsAssignment )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:73:1: ( rule__DomainModel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainModelAccess().getElementsAssignment()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:74:1: ( rule__DomainModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||(LA1_0>=18 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:74:2: rule__DomainModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__DomainModel__ElementsAssignment_in_ruleDomainModel94);
            	    rule__DomainModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleAbstractElement"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:86:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:87:1: ( ruleAbstractElement EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:88:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement129); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:95:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:99:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:100:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:100:1: ( ( rule__AbstractElement__Alternatives ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:101:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:102:1: ( rule__AbstractElement__Alternatives )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:102:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleImport"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:114:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:115:1: ( ruleImport EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:116:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport182);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport189); 

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
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:123:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:127:2: ( ( ( rule__Import__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:128:1: ( ( rule__Import__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:128:1: ( ( rule__Import__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:129:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:130:1: ( rule__Import__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:130:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport215);
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


    // $ANTLR start "entryRulePackageDeclaration"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:142:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:143:1: ( rulePackageDeclaration EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:144:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration242);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration249); 

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:151:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:155:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:156:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:156:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:157:1: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:158:1: ( rule__PackageDeclaration__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:158:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration275);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleType"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:170:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:171:1: ( ruleType EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:172:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType302);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType309); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:179:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:183:2: ( ( ( rule__Type__Alternatives ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:184:1: ( ( rule__Type__Alternatives ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:184:1: ( ( rule__Type__Alternatives ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:185:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:186:1: ( rule__Type__Alternatives )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:186:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType335);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:198:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:199:1: ( ruleDataType EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:200:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType362);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType369); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:207:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:211:2: ( ( ( rule__DataType__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:212:1: ( ( rule__DataType__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:212:1: ( ( rule__DataType__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:213:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:214:1: ( rule__DataType__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:214:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType395);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:226:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:227:1: ( ruleEntity EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:228:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity422);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity429); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:235:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:239:2: ( ( ( rule__Entity__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:240:1: ( ( rule__Entity__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:240:1: ( ( rule__Entity__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:241:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:242:1: ( rule__Entity__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:242:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity455);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:254:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:255:1: ( ruleFeature EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:256:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature482);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature489); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:263:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:267:2: ( ( ( rule__Feature__Alternatives ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:268:1: ( ( rule__Feature__Alternatives ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:268:1: ( ( rule__Feature__Alternatives ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:269:1: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:270:1: ( rule__Feature__Alternatives )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:270:2: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_rule__Feature__Alternatives_in_ruleFeature515);
            rule__Feature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleStructuralFeature"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:282:1: entryRuleStructuralFeature : ruleStructuralFeature EOF ;
    public final void entryRuleStructuralFeature() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:283:1: ( ruleStructuralFeature EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:284:1: ruleStructuralFeature EOF
            {
             before(grammarAccess.getStructuralFeatureRule()); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature542);
            ruleStructuralFeature();

            state._fsp--;

             after(grammarAccess.getStructuralFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuralFeature549); 

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
    // $ANTLR end "entryRuleStructuralFeature"


    // $ANTLR start "ruleStructuralFeature"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:291:1: ruleStructuralFeature : ( ( rule__StructuralFeature__Alternatives ) ) ;
    public final void ruleStructuralFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:295:2: ( ( ( rule__StructuralFeature__Alternatives ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:296:1: ( ( rule__StructuralFeature__Alternatives ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:296:1: ( ( rule__StructuralFeature__Alternatives ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:297:1: ( rule__StructuralFeature__Alternatives )
            {
             before(grammarAccess.getStructuralFeatureAccess().getAlternatives()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:298:1: ( rule__StructuralFeature__Alternatives )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:298:2: rule__StructuralFeature__Alternatives
            {
            pushFollow(FOLLOW_rule__StructuralFeature__Alternatives_in_ruleStructuralFeature575);
            rule__StructuralFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStructuralFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructuralFeature"


    // $ANTLR start "entryRuleAttribute"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:310:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:311:1: ( ruleAttribute EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:312:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute602);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute609); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:319:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:323:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:324:1: ( ( rule__Attribute__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:324:1: ( ( rule__Attribute__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:325:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:326:1: ( rule__Attribute__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:326:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute635);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:338:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:339:1: ( ruleReference EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:340:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference662);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference669); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:347:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:351:2: ( ( ( rule__Reference__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:352:1: ( ( rule__Reference__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:352:1: ( ( rule__Reference__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:353:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:354:1: ( rule__Reference__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:354:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference695);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleOperation"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:366:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:367:1: ( ruleOperation EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:368:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation722);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation729); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:375:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:379:2: ( ( ( rule__Operation__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:380:1: ( ( rule__Operation__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:380:1: ( ( rule__Operation__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:381:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:382:1: ( rule__Operation__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:382:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation755);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:394:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:395:1: ( ruleParameter EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:396:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter782);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter789); 

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
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:403:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:407:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:408:1: ( ( rule__Parameter__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:408:1: ( ( rule__Parameter__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:409:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:410:1: ( rule__Parameter__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:410:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter815);
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


    // $ANTLR start "entryRuleTypeRef"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:422:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:423:1: ( ruleTypeRef EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:424:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef842);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef849); 

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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:431:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:435:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:436:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:436:1: ( ( rule__TypeRef__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:437:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:438:1: ( rule__TypeRef__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:438:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef875);
            rule__TypeRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleQualifiedName"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:450:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:451:1: ( ruleQualifiedName EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:452:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName902);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName909); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:459:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:463:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:464:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:464:1: ( ( rule__QualifiedName__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:465:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:466:1: ( rule__QualifiedName__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:466:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName935);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:478:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:479:1: ( ruleQualifiedNameWithWildcard EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:480:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard962);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard969); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:487:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:491:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:492:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:492:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:493:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:494:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:494:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard995);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:506:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:507:1: ( ruleValidID EOF )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:508:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID1022);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID1029); 

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:515:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:519:2: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:520:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:520:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:521:1: RULE_ID
            {
             before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID1055); 
             after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "ruleVisibility"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:535:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:539:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:540:1: ( ( rule__Visibility__Alternatives ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:540:1: ( ( rule__Visibility__Alternatives ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:541:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:542:1: ( rule__Visibility__Alternatives )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:542:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1091);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:553:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:557:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 18:
            case 19:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:558:1: ( rulePackageDeclaration )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:558:1: ( rulePackageDeclaration )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:559:1: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives1126);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:564:6: ( ruleType )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:564:6: ( ruleType )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:565:1: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleType_in_rule__AbstractElement__Alternatives1143);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:570:6: ( ruleImport )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:570:6: ( ruleImport )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:571:1: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives1160);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:581:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:585:1: ( ( ruleEntity ) | ( ruleDataType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:586:1: ( ruleEntity )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:586:1: ( ruleEntity )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:587:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives1192);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:592:6: ( ruleDataType )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:592:6: ( ruleDataType )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:593:1: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Type__Alternatives1209);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Feature__Alternatives"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:603:1: rule__Feature__Alternatives : ( ( ruleStructuralFeature ) | ( ruleOperation ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:607:1: ( ( ruleStructuralFeature ) | ( ruleOperation ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==22) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=11 && LA4_0<=13)||LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:608:1: ( ruleStructuralFeature )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:608:1: ( ruleStructuralFeature )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:609:1: ruleStructuralFeature
                    {
                     before(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStructuralFeature_in_rule__Feature__Alternatives1241);
                    ruleStructuralFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:614:6: ( ruleOperation )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:614:6: ( ruleOperation )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:615:1: ruleOperation
                    {
                     before(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOperation_in_rule__Feature__Alternatives1258);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__StructuralFeature__Alternatives"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:625:1: rule__StructuralFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__StructuralFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:629:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:630:1: ( ruleAttribute )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:630:1: ( ruleAttribute )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:631:1: ruleAttribute
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives1290);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:636:6: ( ruleReference )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:636:6: ( ruleReference )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:637:1: ruleReference
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives1307);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__StructuralFeature__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:647:1: rule__Visibility__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:651:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:652:1: ( ( 'public' ) )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:652:1: ( ( 'public' ) )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:653:1: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:654:1: ( 'public' )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:654:3: 'public'
                    {
                    match(input,11,FOLLOW_11_in_rule__Visibility__Alternatives1340); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:659:6: ( ( 'private' ) )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:659:6: ( ( 'private' ) )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:660:1: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:661:1: ( 'private' )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:661:3: 'private'
                    {
                    match(input,12,FOLLOW_12_in_rule__Visibility__Alternatives1361); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:666:6: ( ( 'protected' ) )
                    {
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:666:6: ( ( 'protected' ) )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:667:1: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:668:1: ( 'protected' )
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:668:3: 'protected'
                    {
                    match(input,13,FOLLOW_13_in_rule__Visibility__Alternatives1382); 

                    }

                     after(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__Import__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:680:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:684:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:685:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01415);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01418);
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
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:692:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:696:1: ( ( 'import' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:697:1: ( 'import' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:697:1: ( 'import' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:698:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Import__Group__0__Impl1446); 
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
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:711:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:715:1: ( rule__Import__Group__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:716:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11477);
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
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:722:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:726:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:727:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:727:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:728:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:729:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:729:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1504);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:743:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:747:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:748:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01538);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01541);
            rule__PackageDeclaration__Group__1();

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
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:755:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:759:1: ( ( 'package' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:760:1: ( 'package' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:760:1: ( 'package' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:761:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__PackageDeclaration__Group__0__Impl1569); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:774:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:778:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:779:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11600);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11603);
            rule__PackageDeclaration__Group__2();

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
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:786:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:790:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:791:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:791:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:792:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:793:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:793:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1630);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:803:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:807:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:808:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21660);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21663);
            rule__PackageDeclaration__Group__3();

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
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:815:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:819:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:820:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:820:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:821:1: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__PackageDeclaration__Group__2__Impl1691); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:834:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:838:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:839:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31722);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31725);
            rule__PackageDeclaration__Group__4();

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
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:846:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:850:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:851:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:851:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:852:1: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:853:1: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=14 && LA7_0<=15)||(LA7_0>=18 && LA7_0<=19)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:853:2: rule__PackageDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__ElementsAssignment_3_in_rule__PackageDeclaration__Group__3__Impl1752);
            	    rule__PackageDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:863:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:867:1: ( rule__PackageDeclaration__Group__4__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:868:2: rule__PackageDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__41783);
            rule__PackageDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:874:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:878:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:879:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:879:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:880:1: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__PackageDeclaration__Group__4__Impl1811); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:903:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:907:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:908:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__01852);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__01855);
            rule__DataType__Group__1();

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
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:915:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:919:1: ( ( 'datatype' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:920:1: ( 'datatype' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:920:1: ( 'datatype' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:921:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__DataType__Group__0__Impl1883); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:934:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:938:1: ( rule__DataType__Group__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:939:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__11914);
            rule__DataType__Group__1__Impl();

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
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:945:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:949:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:950:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:950:1: ( ( rule__DataType__NameAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:951:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:952:1: ( rule__DataType__NameAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:952:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl1941);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:966:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:970:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:971:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01975);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01978);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:978:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:982:1: ( ( 'entity' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:983:1: ( 'entity' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:983:1: ( 'entity' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:984:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group__0__Impl2006); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:997:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1001:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1002:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12037);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12040);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1009:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1013:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1014:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1014:1: ( ( rule__Entity__NameAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1015:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1016:1: ( rule__Entity__NameAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1016:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl2067);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1026:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1030:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1031:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22097);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22100);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1038:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1042:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1043:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1043:1: ( ( rule__Entity__Group_2__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1044:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1045:1: ( rule__Entity__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1045:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl2127);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1055:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1059:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1060:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32158);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32161);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1067:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1071:1: ( ( '{' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1072:1: ( '{' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1072:1: ( '{' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1073:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__3__Impl2189); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1086:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1090:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1091:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42220);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42223);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1098:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeaturesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1102:1: ( ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1103:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1103:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1104:1: ( rule__Entity__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1105:1: ( rule__Entity__FeaturesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=11 && LA9_0<=13)||LA9_0==22||LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1105:2: rule__Entity__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl2250);
            	    rule__Entity__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1115:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1119:1: ( rule__Entity__Group__5__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1120:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52281);
            rule__Entity__Group__5__Impl();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1126:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1130:1: ( ( '}' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1131:1: ( '}' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1131:1: ( '}' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1132:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__5__Impl2309); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1157:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1161:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1162:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__02352);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__02355);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1169:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1173:1: ( ( 'extends' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1174:1: ( 'extends' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1174:1: ( 'extends' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1175:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group_2__0__Impl2383); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1188:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1192:1: ( rule__Entity__Group_2__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1193:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__12414);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1199:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1203:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1204:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1204:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1205:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1206:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1206:2: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl2441);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1220:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1224:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1225:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02475);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02478);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1232:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1236:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1237:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1237:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1238:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1239:1: ( rule__Attribute__NameAssignment_0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1239:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl2505);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1249:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1253:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1254:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12535);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12538);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1261:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1265:1: ( ( ':' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1266:1: ( ':' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1266:1: ( ':' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1267:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Attribute__Group__1__Impl2566); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1280:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1284:1: ( rule__Attribute__Group__2__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1285:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22597);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1291:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1295:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1296:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1296:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1297:1: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1298:1: ( rule__Attribute__TypeAssignment_2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1298:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl2624);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1314:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1318:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1319:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__02660);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__02663);
            rule__Reference__Group__1();

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
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1326:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1330:1: ( ( 'ref' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1331:1: ( 'ref' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1331:1: ( 'ref' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1332:1: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Reference__Group__0__Impl2691); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1345:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1349:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1350:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__12722);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__12725);
            rule__Reference__Group__2();

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
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1357:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1361:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1362:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1362:1: ( ( rule__Reference__NameAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1363:1: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1364:1: ( rule__Reference__NameAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1364:2: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl2752);
            rule__Reference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1374:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1378:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1379:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__22782);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__22785);
            rule__Reference__Group__3();

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
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1386:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1390:1: ( ( ':' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1391:1: ( ':' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1391:1: ( ':' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1392:1: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Reference__Group__2__Impl2813); 
             after(grammarAccess.getReferenceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1405:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1409:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1410:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__32844);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__32847);
            rule__Reference__Group__4();

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
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1417:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TypeAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1421:1: ( ( ( rule__Reference__TypeAssignment_3 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1422:1: ( ( rule__Reference__TypeAssignment_3 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1422:1: ( ( rule__Reference__TypeAssignment_3 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1423:1: ( rule__Reference__TypeAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1424:1: ( rule__Reference__TypeAssignment_3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1424:2: rule__Reference__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl2874);
            rule__Reference__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1434:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1438:1: ( rule__Reference__Group__4__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1439:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__42904);
            rule__Reference__Group__4__Impl();

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
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1445:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Group_4__0 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1449:1: ( ( ( rule__Reference__Group_4__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1450:1: ( ( rule__Reference__Group_4__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1450:1: ( ( rule__Reference__Group_4__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1451:1: ( rule__Reference__Group_4__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_4()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1452:1: ( rule__Reference__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1452:2: rule__Reference__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl2931);
                    rule__Reference__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group_4__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1472:1: rule__Reference__Group_4__0 : rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 ;
    public final void rule__Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1476:1: ( rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1477:2: rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__02972);
            rule__Reference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__02975);
            rule__Reference__Group_4__1();

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
    // $ANTLR end "rule__Reference__Group_4__0"


    // $ANTLR start "rule__Reference__Group_4__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1484:1: rule__Reference__Group_4__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1488:1: ( ( 'opposite' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1489:1: ( 'opposite' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1489:1: ( 'opposite' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1490:1: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0()); 
            match(input,23,FOLLOW_23_in_rule__Reference__Group_4__0__Impl3003); 
             after(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__0__Impl"


    // $ANTLR start "rule__Reference__Group_4__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1503:1: rule__Reference__Group_4__1 : rule__Reference__Group_4__1__Impl ;
    public final void rule__Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1507:1: ( rule__Reference__Group_4__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1508:2: rule__Reference__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__13034);
            rule__Reference__Group_4__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_4__1"


    // $ANTLR start "rule__Reference__Group_4__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1514:1: rule__Reference__Group_4__1__Impl : ( ( rule__Reference__OppositeAssignment_4_1 ) ) ;
    public final void rule__Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1518:1: ( ( ( rule__Reference__OppositeAssignment_4_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1519:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1519:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1520:1: ( rule__Reference__OppositeAssignment_4_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_4_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1521:1: ( rule__Reference__OppositeAssignment_4_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1521:2: rule__Reference__OppositeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl3061);
            rule__Reference__OppositeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getOppositeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1535:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1539:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1540:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__03095);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__03098);
            rule__Operation__Group__1();

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
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1547:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__VisibilityAssignment_0 )? ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1551:1: ( ( ( rule__Operation__VisibilityAssignment_0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1552:1: ( ( rule__Operation__VisibilityAssignment_0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1552:1: ( ( rule__Operation__VisibilityAssignment_0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1553:1: ( rule__Operation__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getOperationAccess().getVisibilityAssignment_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1554:1: ( rule__Operation__VisibilityAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=13)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1554:2: rule__Operation__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Operation__VisibilityAssignment_0_in_rule__Operation__Group__0__Impl3125);
                    rule__Operation__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1564:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1568:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1569:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__13156);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__13159);
            rule__Operation__Group__2();

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
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1576:1: rule__Operation__Group__1__Impl : ( 'op' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1580:1: ( ( 'op' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1581:1: ( 'op' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1581:1: ( 'op' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1582:1: 'op'
            {
             before(grammarAccess.getOperationAccess().getOpKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Operation__Group__1__Impl3187); 
             after(grammarAccess.getOperationAccess().getOpKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1595:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1599:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1600:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__23218);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__23221);
            rule__Operation__Group__3();

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
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1607:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1611:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1612:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1612:1: ( ( rule__Operation__NameAssignment_2 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1613:1: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1614:1: ( rule__Operation__NameAssignment_2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1614:2: rule__Operation__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl3248);
            rule__Operation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1624:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1628:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1629:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__33278);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__33281);
            rule__Operation__Group__4();

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
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1636:1: rule__Operation__Group__3__Impl : ( '(' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1640:1: ( ( '(' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1641:1: ( '(' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1641:1: ( '(' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1642:1: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group__3__Impl3309); 
             after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1655:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1659:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1660:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__43340);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__43343);
            rule__Operation__Group__5();

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
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1667:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1671:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1672:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1672:1: ( ( rule__Operation__Group_4__0 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1673:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1674:1: ( rule__Operation__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1674:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl3370);
                    rule__Operation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1684:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1688:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1689:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__53401);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__53404);
            rule__Operation__Group__6();

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
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1696:1: rule__Operation__Group__5__Impl : ( ')' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1700:1: ( ( ')' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1701:1: ( ')' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1701:1: ( ')' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1702:1: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Operation__Group__5__Impl3432); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1715:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl rule__Operation__Group__7 ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1719:1: ( rule__Operation__Group__6__Impl rule__Operation__Group__7 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1720:2: rule__Operation__Group__6__Impl rule__Operation__Group__7
            {
            pushFollow(FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__63463);
            rule__Operation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__7_in_rule__Operation__Group__63466);
            rule__Operation__Group__7();

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
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1727:1: rule__Operation__Group__6__Impl : ( ':' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1731:1: ( ( ':' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1732:1: ( ':' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1732:1: ( ':' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1733:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__Operation__Group__6__Impl3494); 
             after(grammarAccess.getOperationAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group__7"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1746:1: rule__Operation__Group__7 : rule__Operation__Group__7__Impl ;
    public final void rule__Operation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1750:1: ( rule__Operation__Group__7__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1751:2: rule__Operation__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__7__Impl_in_rule__Operation__Group__73525);
            rule__Operation__Group__7__Impl();

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
    // $ANTLR end "rule__Operation__Group__7"


    // $ANTLR start "rule__Operation__Group__7__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1757:1: rule__Operation__Group__7__Impl : ( ( rule__Operation__TypeAssignment_7 ) ) ;
    public final void rule__Operation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1761:1: ( ( ( rule__Operation__TypeAssignment_7 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1762:1: ( ( rule__Operation__TypeAssignment_7 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1762:1: ( ( rule__Operation__TypeAssignment_7 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1763:1: ( rule__Operation__TypeAssignment_7 )
            {
             before(grammarAccess.getOperationAccess().getTypeAssignment_7()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1764:1: ( rule__Operation__TypeAssignment_7 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1764:2: rule__Operation__TypeAssignment_7
            {
            pushFollow(FOLLOW_rule__Operation__TypeAssignment_7_in_rule__Operation__Group__7__Impl3552);
            rule__Operation__TypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__7__Impl"


    // $ANTLR start "rule__Operation__Group_4__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1790:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1794:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1795:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__03598);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__03601);
            rule__Operation__Group_4__1();

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
    // $ANTLR end "rule__Operation__Group_4__0"


    // $ANTLR start "rule__Operation__Group_4__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1802:1: rule__Operation__Group_4__0__Impl : ( ( rule__Operation__ParamsAssignment_4_0 ) ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1806:1: ( ( ( rule__Operation__ParamsAssignment_4_0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1807:1: ( ( rule__Operation__ParamsAssignment_4_0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1807:1: ( ( rule__Operation__ParamsAssignment_4_0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1808:1: ( rule__Operation__ParamsAssignment_4_0 )
            {
             before(grammarAccess.getOperationAccess().getParamsAssignment_4_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1809:1: ( rule__Operation__ParamsAssignment_4_0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1809:2: rule__Operation__ParamsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Operation__ParamsAssignment_4_0_in_rule__Operation__Group_4__0__Impl3628);
            rule__Operation__ParamsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getParamsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0__Impl"


    // $ANTLR start "rule__Operation__Group_4__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1819:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1823:1: ( rule__Operation__Group_4__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1824:2: rule__Operation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__13658);
            rule__Operation__Group_4__1__Impl();

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
    // $ANTLR end "rule__Operation__Group_4__1"


    // $ANTLR start "rule__Operation__Group_4__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1830:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__Group_4_1__0 )* ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1834:1: ( ( ( rule__Operation__Group_4_1__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1835:1: ( ( rule__Operation__Group_4_1__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1835:1: ( ( rule__Operation__Group_4_1__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1836:1: ( rule__Operation__Group_4_1__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_4_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1837:1: ( rule__Operation__Group_4_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1837:2: rule__Operation__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Group_4_1__0_in_rule__Operation__Group_4__1__Impl3685);
            	    rule__Operation__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group_4_1__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1851:1: rule__Operation__Group_4_1__0 : rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1 ;
    public final void rule__Operation__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1855:1: ( rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1856:2: rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4_1__0__Impl_in_rule__Operation__Group_4_1__03720);
            rule__Operation__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4_1__1_in_rule__Operation__Group_4_1__03723);
            rule__Operation__Group_4_1__1();

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
    // $ANTLR end "rule__Operation__Group_4_1__0"


    // $ANTLR start "rule__Operation__Group_4_1__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1863:1: rule__Operation__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1867:1: ( ( ',' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1868:1: ( ',' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1868:1: ( ',' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1869:1: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_4_1_0()); 
            match(input,27,FOLLOW_27_in_rule__Operation__Group_4_1__0__Impl3751); 
             after(grammarAccess.getOperationAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_1__0__Impl"


    // $ANTLR start "rule__Operation__Group_4_1__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1882:1: rule__Operation__Group_4_1__1 : rule__Operation__Group_4_1__1__Impl ;
    public final void rule__Operation__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1886:1: ( rule__Operation__Group_4_1__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1887:2: rule__Operation__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4_1__1__Impl_in_rule__Operation__Group_4_1__13782);
            rule__Operation__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Operation__Group_4_1__1"


    // $ANTLR start "rule__Operation__Group_4_1__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1893:1: rule__Operation__Group_4_1__1__Impl : ( ( rule__Operation__ParamsAssignment_4_1_1 ) ) ;
    public final void rule__Operation__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1897:1: ( ( ( rule__Operation__ParamsAssignment_4_1_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1898:1: ( ( rule__Operation__ParamsAssignment_4_1_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1898:1: ( ( rule__Operation__ParamsAssignment_4_1_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1899:1: ( rule__Operation__ParamsAssignment_4_1_1 )
            {
             before(grammarAccess.getOperationAccess().getParamsAssignment_4_1_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1900:1: ( rule__Operation__ParamsAssignment_4_1_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1900:2: rule__Operation__ParamsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Operation__ParamsAssignment_4_1_1_in_rule__Operation__Group_4_1__1__Impl3809);
            rule__Operation__ParamsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getParamsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1914:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1918:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1919:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03843);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03846);
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
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1926:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1930:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1931:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1931:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1932:1: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1933:1: ( rule__Parameter__NameAssignment_0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1933:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl3873);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1943:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1947:1: ( rule__Parameter__Group__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1948:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13903);
            rule__Parameter__Group__1__Impl();

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
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1954:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1958:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1959:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1959:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1960:1: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1961:1: ( rule__Parameter__TypeAssignment_1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1961:2: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl3930);
            rule__Parameter__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TypeRef__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1975:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1979:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1980:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__03964);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__03967);
            rule__TypeRef__Group__1();

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
    // $ANTLR end "rule__TypeRef__Group__0"


    // $ANTLR start "rule__TypeRef__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1987:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1991:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1992:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1992:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1993:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1994:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:1994:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl3994);
            rule__TypeRef__ReferencedAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__0__Impl"


    // $ANTLR start "rule__TypeRef__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2004:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2008:1: ( rule__TypeRef__Group__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2009:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__14024);
            rule__TypeRef__Group__1__Impl();

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
    // $ANTLR end "rule__TypeRef__Group__1"


    // $ANTLR start "rule__TypeRef__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2015:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__MultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2019:1: ( ( ( rule__TypeRef__MultiAssignment_1 )? ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2020:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2020:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2021:1: ( rule__TypeRef__MultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2022:1: ( rule__TypeRef__MultiAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2022:2: rule__TypeRef__MultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl4051);
                    rule__TypeRef__MultiAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2036:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2040:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2041:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04086);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04089);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2048:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2052:1: ( ( ruleValidID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2053:1: ( ruleValidID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2053:1: ( ruleValidID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2054:1: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl4116);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2065:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2069:1: ( rule__QualifiedName__Group__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2070:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14145);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2076:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2080:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2081:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2081:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2082:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2083:1: ( rule__QualifiedName__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_ID) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2083:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4172);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2097:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2101:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2102:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04207);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04210);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2109:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2113:1: ( ( '.' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2114:1: ( '.' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2114:1: ( '.' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2115:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__QualifiedName__Group_1__0__Impl4238); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2128:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2132:1: ( rule__QualifiedName__Group_1__1__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2133:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14269);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2139:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2143:1: ( ( ruleValidID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2144:1: ( ruleValidID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2144:1: ( ruleValidID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2145:1: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl4296);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2160:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2164:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2165:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__04329);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__04332);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2172:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2176:1: ( ( ruleQualifiedName ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2177:1: ( ruleQualifiedName )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2177:1: ( ruleQualifiedName )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2178:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl4359);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2189:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2193:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2194:2: rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__14388);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__14391);
            rule__QualifiedNameWithWildcard__Group__2();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2201:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2205:1: ( ( '.' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2206:1: ( '.' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2206:1: ( '.' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2207:1: '.'
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__QualifiedNameWithWildcard__Group__1__Impl4419); 
             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2220:1: rule__QualifiedNameWithWildcard__Group__2 : rule__QualifiedNameWithWildcard__Group__2__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2224:1: ( rule__QualifiedNameWithWildcard__Group__2__Impl )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2225:2: rule__QualifiedNameWithWildcard__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__24450);
            rule__QualifiedNameWithWildcard__Group__2__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__2"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__2__Impl"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2231:1: rule__QualifiedNameWithWildcard__Group__2__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2235:1: ( ( '*' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2236:1: ( '*' )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2236:1: ( '*' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2237:1: '*'
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__QualifiedNameWithWildcard__Group__2__Impl4478); 
             after(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__2__Impl"


    // $ANTLR start "rule__DomainModel__ElementsAssignment"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2257:1: rule__DomainModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__DomainModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2261:1: ( ( ruleAbstractElement ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2262:1: ( ruleAbstractElement )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2262:1: ( ruleAbstractElement )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2263:1: ruleAbstractElement
            {
             before(grammarAccess.getDomainModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__DomainModel__ElementsAssignment4520);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__ElementsAssignment"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2272:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2276:1: ( ( ruleQualifiedNameWithWildcard ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2277:1: ( ruleQualifiedNameWithWildcard )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2277:1: ( ruleQualifiedNameWithWildcard )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2278:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_14551);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2287:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2291:1: ( ( ruleQualifiedName ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2292:1: ( ruleQualifiedName )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2292:1: ( ruleQualifiedName )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2293:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_14582);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_3"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2302:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2306:1: ( ( ruleAbstractElement ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2307:1: ( ruleAbstractElement )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2307:1: ( ruleAbstractElement )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2308:1: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_34613);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_3"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2317:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2321:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2322:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2322:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2323:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_14644); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2332:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2336:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2337:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2337:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2338:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_14675); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2347:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2351:1: ( ( ( ruleQualifiedName ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2352:1: ( ( ruleQualifiedName ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2352:1: ( ( ruleQualifiedName ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2353:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2354:1: ( ruleQualifiedName )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2355:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_2_14710);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_4"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2366:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2370:1: ( ( ruleFeature ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2371:1: ( ruleFeature )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2371:1: ( ruleFeature )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2372:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_44745);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_4"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2381:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2385:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2386:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2386:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2387:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_04776); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2396:1: rule__Attribute__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2400:1: ( ( ruleTypeRef ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2401:1: ( ruleTypeRef )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2401:1: ( ruleTypeRef )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2402:1: ruleTypeRef
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Attribute__TypeAssignment_24807);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2411:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2415:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2416:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2416:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2417:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_14838); 
             after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_1"


    // $ANTLR start "rule__Reference__TypeAssignment_3"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2426:1: rule__Reference__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__Reference__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2430:1: ( ( ruleTypeRef ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2431:1: ( ruleTypeRef )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2431:1: ( ruleTypeRef )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2432:1: ruleTypeRef
            {
             before(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_34869);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__TypeAssignment_3"


    // $ANTLR start "rule__Reference__OppositeAssignment_4_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2441:1: rule__Reference__OppositeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__OppositeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2445:1: ( ( ( RULE_ID ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2446:1: ( ( RULE_ID ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2446:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2447:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2448:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2449:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_14904); 
             after(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__OppositeAssignment_4_1"


    // $ANTLR start "rule__Operation__VisibilityAssignment_0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2460:1: rule__Operation__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Operation__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2464:1: ( ( ruleVisibility ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2465:1: ( ruleVisibility )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2465:1: ( ruleVisibility )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2466:1: ruleVisibility
            {
             before(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVisibility_in_rule__Operation__VisibilityAssignment_04939);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__VisibilityAssignment_0"


    // $ANTLR start "rule__Operation__NameAssignment_2"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2475:1: rule__Operation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2479:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2480:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2480:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2481:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_24970); 
             after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_2"


    // $ANTLR start "rule__Operation__ParamsAssignment_4_0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2490:1: rule__Operation__ParamsAssignment_4_0 : ( ruleParameter ) ;
    public final void rule__Operation__ParamsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2494:1: ( ( ruleParameter ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2495:1: ( ruleParameter )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2495:1: ( ruleParameter )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2496:1: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Operation__ParamsAssignment_4_05001);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParamsAssignment_4_0"


    // $ANTLR start "rule__Operation__ParamsAssignment_4_1_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2505:1: rule__Operation__ParamsAssignment_4_1_1 : ( ruleParameter ) ;
    public final void rule__Operation__ParamsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2509:1: ( ( ruleParameter ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2510:1: ( ruleParameter )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2510:1: ( ruleParameter )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2511:1: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Operation__ParamsAssignment_4_1_15032);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParamsAssignment_4_1_1"


    // $ANTLR start "rule__Operation__TypeAssignment_7"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2520:1: rule__Operation__TypeAssignment_7 : ( ruleTypeRef ) ;
    public final void rule__Operation__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2524:1: ( ( ruleTypeRef ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2525:1: ( ruleTypeRef )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2525:1: ( ruleTypeRef )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2526:1: ruleTypeRef
            {
             before(grammarAccess.getOperationAccess().getTypeTypeRefParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Operation__TypeAssignment_75063);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getTypeTypeRefParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__TypeAssignment_7"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2535:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2539:1: ( ( RULE_ID ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2540:1: ( RULE_ID )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2540:1: ( RULE_ID )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2541:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_05094); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2550:1: rule__Parameter__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2554:1: ( ( ruleTypeRef ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2555:1: ( ruleTypeRef )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2555:1: ( ruleTypeRef )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2556:1: ruleTypeRef
            {
             before(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_15125);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_1"


    // $ANTLR start "rule__TypeRef__ReferencedAssignment_0"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2565:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2569:1: ( ( ( ruleQualifiedName ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2570:1: ( ( ruleQualifiedName ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2570:1: ( ( ruleQualifiedName ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2571:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2572:1: ( ruleQualifiedName )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2573:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_05160);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__ReferencedAssignment_0"


    // $ANTLR start "rule__TypeRef__MultiAssignment_1"
    // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2584:1: rule__TypeRef__MultiAssignment_1 : ( ( '*' ) ) ;
    public final void rule__TypeRef__MultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2588:1: ( ( ( '*' ) ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2589:1: ( ( '*' ) )
            {
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2589:1: ( ( '*' ) )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2590:1: ( '*' )
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2591:1: ( '*' )
            // D:\\git\\dslforge\\examples\\org.eclipse.xtext.example.domainmodel.web\\src-gen\\org\\eclipse\\xtext\\example\\domainmodel\\web\\contentassist\\antlr\\internal\\InternalDomainmodel.g:2592:1: '*'
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__TypeRef__MultiAssignment_15200); 
             after(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__MultiAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__ElementsAssignment_in_ruleDomainModel94 = new BitSet(new long[]{0x00000000000CC002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuralFeature549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralFeature__Alternatives_in_ruleStructuralFeature575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AbstractElement__Alternatives1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_rule__Feature__Alternatives1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Feature__Alternatives1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Visibility__Alternatives1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Visibility__Alternatives1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Visibility__Alternatives1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Import__Group__0__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PackageDeclaration__Group__0__Impl1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11600 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21660 = new BitSet(new long[]{0x00000000000EC000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PackageDeclaration__Group__2__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31722 = new BitSet(new long[]{0x00000000000EC000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ElementsAssignment_3_in_rule__PackageDeclaration__Group__3__Impl1752 = new BitSet(new long[]{0x00000000000CC002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__41783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PackageDeclaration__Group__4__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__01852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__01855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DataType__Group__0__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__11914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group__0__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12037 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22097 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32158 = new BitSet(new long[]{0x0000000001423810L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__3__Impl2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42220 = new BitSet(new long[]{0x0000000001423810L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl2250 = new BitSet(new long[]{0x0000000001403812L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__5__Impl2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__02352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__02355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group_2__0__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__12414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02475 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Attribute__Group__1__Impl2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__02660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__02663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Reference__Group__0__Impl2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__12722 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__12725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__22782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__22785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Reference__Group__2__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__32844 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__32847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__42904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__02972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__02975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Reference__Group_4__0__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__13034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__03095 = new BitSet(new long[]{0x0000000001403810L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__03098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__VisibilityAssignment_0_in_rule__Operation__Group__0__Impl3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__13156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__13159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Operation__Group__1__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__23218 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__23221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__33278 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__33281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group__3__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__43340 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__43343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__53401 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__53404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Operation__Group__5__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__63463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__7_in_rule__Operation__Group__63466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Operation__Group__6__Impl3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__7__Impl_in_rule__Operation__Group__73525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__TypeAssignment_7_in_rule__Operation__Group__7__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__03598 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__03601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ParamsAssignment_4_0_in_rule__Operation__Group_4__0__Impl3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__13658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__0_in_rule__Operation__Group_4__1__Impl3685 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__0__Impl_in_rule__Operation__Group_4_1__03720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__1_in_rule__Operation__Group_4_1__03723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Operation__Group_4_1__0__Impl3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__1__Impl_in_rule__Operation__Group_4_1__13782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ParamsAssignment_4_1_1_in_rule__Operation__Group_4_1__1__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__03964 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__03967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__14024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04086 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4172 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QualifiedName__Group_1__0__Impl4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__04329 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__04332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__14388 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__14391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QualifiedNameWithWildcard__Group__1__Impl4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__24450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualifiedNameWithWildcard__Group__2__Impl4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__DomainModel__ElementsAssignment4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_14551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_14582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_34613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_14644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_14675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_2_14710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_44745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_04776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Attribute__TypeAssignment_24807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_14838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_34869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_14904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Operation__VisibilityAssignment_04939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_24970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Operation__ParamsAssignment_4_05001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Operation__ParamsAssignment_4_1_15032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Operation__TypeAssignment_75063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_05094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_15125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_05160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TypeRef__MultiAssignment_15200 = new BitSet(new long[]{0x0000000000000002L});

}