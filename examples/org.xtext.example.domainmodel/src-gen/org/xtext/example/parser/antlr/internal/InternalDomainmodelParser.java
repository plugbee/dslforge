package org.xtext.example.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'entity'", "'extends'", "':'", "'op'", "'('", "','", "')'", "'import'", "';'", "'.'", "'*'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainmodel.g"; }



     	private DomainmodelGrammarAccess grammarAccess;
     	
        public InternalDomainmodelParser(TokenStream input, DomainmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";	
       	}
       	
       	@Override
       	protected DomainmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainModel"
    // InternalDomainmodel.g:67:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // InternalDomainmodel.g:68:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // InternalDomainmodel.g:69:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalDomainmodel.g:76:1: ruleDomainModel returns [EObject current=null] : ( ( (lv_importSection_0_0= ruleImportSection ) )? ( (lv_elements_1_0= ruleAbstractElement ) )* ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_importSection_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDomainmodel.g:79:28: ( ( ( (lv_importSection_0_0= ruleImportSection ) )? ( (lv_elements_1_0= ruleAbstractElement ) )* ) )
            // InternalDomainmodel.g:80:1: ( ( (lv_importSection_0_0= ruleImportSection ) )? ( (lv_elements_1_0= ruleAbstractElement ) )* )
            {
            // InternalDomainmodel.g:80:1: ( ( (lv_importSection_0_0= ruleImportSection ) )? ( (lv_elements_1_0= ruleAbstractElement ) )* )
            // InternalDomainmodel.g:80:2: ( (lv_importSection_0_0= ruleImportSection ) )? ( (lv_elements_1_0= ruleAbstractElement ) )*
            {
            // InternalDomainmodel.g:80:2: ( (lv_importSection_0_0= ruleImportSection ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDomainmodel.g:81:1: (lv_importSection_0_0= ruleImportSection )
                    {
                    // InternalDomainmodel.g:81:1: (lv_importSection_0_0= ruleImportSection )
                    // InternalDomainmodel.g:82:3: lv_importSection_0_0= ruleImportSection
                    {
                     
                    	        newCompositeNode(grammarAccess.getDomainModelAccess().getImportSectionImportSectionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_3);
                    lv_importSection_0_0=ruleImportSection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
                    	        }
                           		set(
                           			current, 
                           			"importSection",
                            		lv_importSection_0_0, 
                            		"org.xtext.example.Domainmodel.ImportSection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalDomainmodel.g:98:3: ( (lv_elements_1_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDomainmodel.g:99:1: (lv_elements_1_0= ruleAbstractElement )
            	    {
            	    // InternalDomainmodel.g:99:1: (lv_elements_1_0= ruleAbstractElement )
            	    // InternalDomainmodel.g:100:3: lv_elements_1_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelAccess().getElementsAbstractElementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_elements_1_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"org.xtext.example.Domainmodel.AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDomainmodel.g:124:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalDomainmodel.g:125:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalDomainmodel.g:126:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalDomainmodel.g:133:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Entity_1= ruleEntity ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Entity_1 = null;


         enterRule(); 
            
        try {
            // InternalDomainmodel.g:136:28: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Entity_1= ruleEntity ) )
            // InternalDomainmodel.g:137:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Entity_1= ruleEntity )
            {
            // InternalDomainmodel.g:137:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Entity_1= ruleEntity )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:138:5: this_PackageDeclaration_0= rulePackageDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;

                     
                            current = this_PackageDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:148:5: this_Entity_1= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalDomainmodel.g:164:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalDomainmodel.g:165:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalDomainmodel.g:166:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalDomainmodel.g:173:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDomainmodel.g:176:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalDomainmodel.g:177:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalDomainmodel.g:177:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalDomainmodel.g:177:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                
            // InternalDomainmodel.g:181:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDomainmodel.g:182:1: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDomainmodel.g:182:1: (lv_name_1_0= ruleQualifiedName )
            // InternalDomainmodel.g:183:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.xtext.example.Domainmodel.QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDomainmodel.g:203:1: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11||LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomainmodel.g:204:1: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalDomainmodel.g:204:1: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalDomainmodel.g:205:3: lv_elements_3_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"org.xtext.example.Domainmodel.AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleEntity"
    // InternalDomainmodel.g:233:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDomainmodel.g:234:2: (iv_ruleEntity= ruleEntity EOF )
            // InternalDomainmodel.g:235:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomainmodel.g:242:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // InternalDomainmodel.g:245:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // InternalDomainmodel.g:246:1: (otherlv_0= 'entity' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // InternalDomainmodel.g:246:1: (otherlv_0= 'entity' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // InternalDomainmodel.g:246:3: otherlv_0= 'entity' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // InternalDomainmodel.g:250:1: ( (lv_name_1_0= ruleValidID ) )
            // InternalDomainmodel.g:251:1: (lv_name_1_0= ruleValidID )
            {
            // InternalDomainmodel.g:251:1: (lv_name_1_0= ruleValidID )
            // InternalDomainmodel.g:252:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.xtext.example.Domainmodel.ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDomainmodel.g:268:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainmodel.g:268:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_4); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // InternalDomainmodel.g:272:1: ( ( ruleQualifiedName ) )
                    // InternalDomainmodel.g:273:1: ( ruleQualifiedName )
                    {
                    // InternalDomainmodel.g:273:1: ( ruleQualifiedName )
                    // InternalDomainmodel.g:274:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_5);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_8); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDomainmodel.g:291:1: ( (lv_features_5_0= ruleFeature ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDomainmodel.g:292:1: (lv_features_5_0= ruleFeature )
            	    {
            	    // InternalDomainmodel.g:292:1: (lv_features_5_0= ruleFeature )
            	    // InternalDomainmodel.g:293:3: lv_features_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_8);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"org.xtext.example.Domainmodel.Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalDomainmodel.g:321:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalDomainmodel.g:322:2: (iv_ruleFeature= ruleFeature EOF )
            // InternalDomainmodel.g:323:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalDomainmodel.g:330:1: ruleFeature returns [EObject current=null] : (this_Property_0= ruleProperty | this_Operation_1= ruleOperation ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Property_0 = null;

        EObject this_Operation_1 = null;


         enterRule(); 
            
        try {
            // InternalDomainmodel.g:333:28: ( (this_Property_0= ruleProperty | this_Operation_1= ruleOperation ) )
            // InternalDomainmodel.g:334:1: (this_Property_0= ruleProperty | this_Operation_1= ruleOperation )
            {
            // InternalDomainmodel.g:334:1: (this_Property_0= ruleProperty | this_Operation_1= ruleOperation )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainmodel.g:335:5: this_Property_0= ruleProperty
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getPropertyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Property_0=ruleProperty();

                    state._fsp--;

                     
                            current = this_Property_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:345:5: this_Operation_1= ruleOperation
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Operation_1=ruleOperation();

                    state._fsp--;

                     
                            current = this_Operation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleProperty"
    // InternalDomainmodel.g:361:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalDomainmodel.g:362:2: (iv_ruleProperty= ruleProperty EOF )
            // InternalDomainmodel.g:363:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalDomainmodel.g:370:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // InternalDomainmodel.g:373:28: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDomainmodel.g:374:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDomainmodel.g:374:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalDomainmodel.g:374:2: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalDomainmodel.g:374:2: ( (lv_name_0_0= ruleValidID ) )
            // InternalDomainmodel.g:375:1: (lv_name_0_0= ruleValidID )
            {
            // InternalDomainmodel.g:375:1: (lv_name_0_0= ruleValidID )
            // InternalDomainmodel.g:376:3: lv_name_0_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getNameValidIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_9);
            lv_name_0_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.xtext.example.Domainmodel.ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
                
            // InternalDomainmodel.g:396:1: ( (otherlv_2= RULE_ID ) )
            // InternalDomainmodel.g:397:1: (otherlv_2= RULE_ID )
            {
            // InternalDomainmodel.g:397:1: (otherlv_2= RULE_ID )
            // InternalDomainmodel.g:398:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getTypeEntityCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleOperation"
    // InternalDomainmodel.g:417:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalDomainmodel.g:418:2: (iv_ruleOperation= ruleOperation EOF )
            // InternalDomainmodel.g:419:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalDomainmodel.g:426:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_params_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_params_3_0=null;
        Token otherlv_4=null;
        Token lv_params_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDomainmodel.g:429:28: ( (otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_params_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) )
            // InternalDomainmodel.g:430:1: (otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_params_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            {
            // InternalDomainmodel.g:430:1: (otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_params_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            // InternalDomainmodel.g:430:3: otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_params_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOpKeyword_0());
                
            // InternalDomainmodel.g:434:1: ( (lv_name_1_0= ruleValidID ) )
            // InternalDomainmodel.g:435:1: (lv_name_1_0= ruleValidID )
            {
            // InternalDomainmodel.g:435:1: (lv_name_1_0= ruleValidID )
            // InternalDomainmodel.g:436:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getOperationAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_10);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.xtext.example.Domainmodel.ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_11); 

                	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                
            // InternalDomainmodel.g:456:1: ( ( (lv_params_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_params_5_0= RULE_ID ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDomainmodel.g:456:2: ( (lv_params_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_params_5_0= RULE_ID ) ) )*
                    {
                    // InternalDomainmodel.g:456:2: ( (lv_params_3_0= RULE_ID ) )
                    // InternalDomainmodel.g:457:1: (lv_params_3_0= RULE_ID )
                    {
                    // InternalDomainmodel.g:457:1: (lv_params_3_0= RULE_ID )
                    // InternalDomainmodel.g:458:3: lv_params_3_0= RULE_ID
                    {
                    lv_params_3_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    			newLeafNode(lv_params_3_0, grammarAccess.getOperationAccess().getParamsIDTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }


                    }

                    // InternalDomainmodel.g:474:2: (otherlv_4= ',' ( (lv_params_5_0= RULE_ID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDomainmodel.g:474:4: otherlv_4= ',' ( (lv_params_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_4); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // InternalDomainmodel.g:478:1: ( (lv_params_5_0= RULE_ID ) )
                    	    // InternalDomainmodel.g:479:1: (lv_params_5_0= RULE_ID )
                    	    {
                    	    // InternalDomainmodel.g:479:1: (lv_params_5_0= RULE_ID )
                    	    // InternalDomainmodel.g:480:3: lv_params_5_0= RULE_ID
                    	    {
                    	    lv_params_5_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	    			newLeafNode(lv_params_5_0, grammarAccess.getOperationAccess().getParamsIDTerminalRuleCall_3_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getOperationRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"org.eclipse.xtext.common.Terminals.ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_13); 

                	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                
            // InternalDomainmodel.g:500:1: (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomainmodel.g:500:3: otherlv_7= ':' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_4); 

                        	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getColonKeyword_5_0());
                        
                    // InternalDomainmodel.g:504:1: ( (otherlv_8= RULE_ID ) )
                    // InternalDomainmodel.g:505:1: (otherlv_8= RULE_ID )
                    {
                    // InternalDomainmodel.g:505:1: (otherlv_8= RULE_ID )
                    // InternalDomainmodel.g:506:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getTypeEntityCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleImportSection"
    // InternalDomainmodel.g:527:1: entryRuleImportSection returns [EObject current=null] : iv_ruleImportSection= ruleImportSection EOF ;
    public final EObject entryRuleImportSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportSection = null;


        try {
            // InternalDomainmodel.g:528:2: (iv_ruleImportSection= ruleImportSection EOF )
            // InternalDomainmodel.g:529:2: iv_ruleImportSection= ruleImportSection EOF
            {
             newCompositeNode(grammarAccess.getImportSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportSection=ruleImportSection();

            state._fsp--;

             current =iv_ruleImportSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportSection"


    // $ANTLR start "ruleImportSection"
    // InternalDomainmodel.g:536:1: ruleImportSection returns [EObject current=null] : ( (lv_importDeclarations_0_0= ruleImportDeclaration ) )+ ;
    public final EObject ruleImportSection() throws RecognitionException {
        EObject current = null;

        EObject lv_importDeclarations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalDomainmodel.g:539:28: ( ( (lv_importDeclarations_0_0= ruleImportDeclaration ) )+ )
            // InternalDomainmodel.g:540:1: ( (lv_importDeclarations_0_0= ruleImportDeclaration ) )+
            {
            // InternalDomainmodel.g:540:1: ( (lv_importDeclarations_0_0= ruleImportDeclaration ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDomainmodel.g:541:1: (lv_importDeclarations_0_0= ruleImportDeclaration )
            	    {
            	    // InternalDomainmodel.g:541:1: (lv_importDeclarations_0_0= ruleImportDeclaration )
            	    // InternalDomainmodel.g:542:3: lv_importDeclarations_0_0= ruleImportDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImportSectionAccess().getImportDeclarationsImportDeclarationParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_14);
            	    lv_importDeclarations_0_0=ruleImportDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImportSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"importDeclarations",
            	            		lv_importDeclarations_0_0, 
            	            		"org.xtext.example.Domainmodel.ImportDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportSection"


    // $ANTLR start "entryRuleImportDeclaration"
    // InternalDomainmodel.g:566:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // InternalDomainmodel.g:567:2: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // InternalDomainmodel.g:568:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
             newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;

             current =iv_ruleImportDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDeclaration"


    // $ANTLR start "ruleImportDeclaration"
    // InternalDomainmodel.g:575:1: ruleImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDomainmodel.g:578:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? ) )
            // InternalDomainmodel.g:579:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? )
            {
            // InternalDomainmodel.g:579:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? )
            // InternalDomainmodel.g:579:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getImportDeclarationAccess().getImportKeyword_0());
                
            // InternalDomainmodel.g:583:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalDomainmodel.g:584:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalDomainmodel.g:584:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalDomainmodel.g:585:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_15);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"org.xtext.example.Domainmodel.QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDomainmodel.g:601:2: (otherlv_2= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomainmodel.g:601:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_2); 

                        	newLeafNode(otherlv_2, grammarAccess.getImportDeclarationAccess().getSemicolonKeyword_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDomainmodel.g:613:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDomainmodel.g:614:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDomainmodel.g:615:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDomainmodel.g:622:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // InternalDomainmodel.g:625:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // InternalDomainmodel.g:626:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // InternalDomainmodel.g:626:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // InternalDomainmodel.g:627:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                
            pushFollow(FOLLOW_16);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            		current.merge(this_ValidID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalDomainmodel.g:637:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==RULE_ID) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalDomainmodel.g:638:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_4); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_16);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    		current.merge(this_ValidID_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalDomainmodel.g:662:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalDomainmodel.g:663:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalDomainmodel.g:664:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalDomainmodel.g:671:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalDomainmodel.g:674:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // InternalDomainmodel.g:675:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // InternalDomainmodel.g:675:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // InternalDomainmodel.g:676:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_17);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,23,FOLLOW_18); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                
            kw=(Token)match(input,24,FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // InternalDomainmodel.g:706:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalDomainmodel.g:707:2: (iv_ruleValidID= ruleValidID EOF )
            // InternalDomainmodel.g:708:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalDomainmodel.g:715:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalDomainmodel.g:718:28: (this_ID_0= RULE_ID )
            // InternalDomainmodel.g:719:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000022010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});

}