package org.occiware.clouddesigner.occi.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.occiware.clouddesigner.occi.xtext.services.OCCIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOCCIParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'extension'", "':'", "'import'", "'as'", "'kind'", "'extends'", "'{'", "'title'", "'}'", "'mixin'", "'depends'", "','", "'applies'", "'scheme'", "'attribute'", "'mutable'", "'required'", "'*'", "'='", "'description'", "'action'", "'('", "')'", "'datatype'", "'minExclusive'", "'minInclusive'", "'maxExclusive'", "'maxInclusive'", "'totalDigits'", "'fractionDigits'", "'length'", "'minLength'", "'maxLength'", "'whiteSpace'", "'pattern'", "'enum'", "'configuration'", "'use'", "'resource'", "'mixins'", "'state'", "'link'", "'target'", "'-'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int RULE_QUALIFIED_ID=6;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalOCCIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOCCIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOCCIParser.tokenNames; }
    public String getGrammarFileName() { return "../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g"; }



     	private OCCIGrammarAccess grammarAccess;
     	
        public InternalOCCIParser(TokenStream input, OCCIGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Grammar";	
       	}
       	
       	@Override
       	protected OCCIGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGrammar"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:67:1: entryRuleGrammar returns [EObject current=null] : iv_ruleGrammar= ruleGrammar EOF ;
    public final EObject entryRuleGrammar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammar = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:68:2: (iv_ruleGrammar= ruleGrammar EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:69:2: iv_ruleGrammar= ruleGrammar EOF
            {
             newCompositeNode(grammarAccess.getGrammarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrammar_in_entryRuleGrammar75);
            iv_ruleGrammar=ruleGrammar();

            state._fsp--;

             current =iv_ruleGrammar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrammar85); 

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
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:76:1: ruleGrammar returns [EObject current=null] : (this_ExtensionDecl_0= ruleExtensionDecl | this_ConfigurationDecl_1= ruleConfigurationDecl ) ;
    public final EObject ruleGrammar() throws RecognitionException {
        EObject current = null;

        EObject this_ExtensionDecl_0 = null;

        EObject this_ConfigurationDecl_1 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:79:28: ( (this_ExtensionDecl_0= ruleExtensionDecl | this_ConfigurationDecl_1= ruleConfigurationDecl ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:80:1: (this_ExtensionDecl_0= ruleExtensionDecl | this_ConfigurationDecl_1= ruleConfigurationDecl )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:80:1: (this_ExtensionDecl_0= ruleExtensionDecl | this_ConfigurationDecl_1= ruleConfigurationDecl )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==48) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:81:5: this_ExtensionDecl_0= ruleExtensionDecl
                    {
                     
                            newCompositeNode(grammarAccess.getGrammarAccess().getExtensionDeclParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExtensionDecl_in_ruleGrammar132);
                    this_ExtensionDecl_0=ruleExtensionDecl();

                    state._fsp--;

                     
                            current = this_ExtensionDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:91:5: this_ConfigurationDecl_1= ruleConfigurationDecl
                    {
                     
                            newCompositeNode(grammarAccess.getGrammarAccess().getConfigurationDeclParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConfigurationDecl_in_ruleGrammar159);
                    this_ConfigurationDecl_1=ruleConfigurationDecl();

                    state._fsp--;

                     
                            current = this_ConfigurationDecl_1; 
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
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleExtensionDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:107:1: entryRuleExtensionDecl returns [EObject current=null] : iv_ruleExtensionDecl= ruleExtensionDecl EOF ;
    public final EObject entryRuleExtensionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:108:2: (iv_ruleExtensionDecl= ruleExtensionDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:109:2: iv_ruleExtensionDecl= ruleExtensionDecl EOF
            {
             newCompositeNode(grammarAccess.getExtensionDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtensionDecl_in_entryRuleExtensionDecl194);
            iv_ruleExtensionDecl=ruleExtensionDecl();

            state._fsp--;

             current =iv_ruleExtensionDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtensionDecl204); 

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
    // $ANTLR end "entryRuleExtensionDecl"


    // $ANTLR start "ruleExtensionDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:116:1: ruleExtensionDecl returns [EObject current=null] : (otherlv_0= 'extension' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'import' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= 'as' this_ID_7= RULE_ID )? )* ( ( (lv_kinds_8_0= ruleKindDecl ) ) | ( (lv_mixins_9_0= ruleMixinDecl ) ) | ( (lv_types_10_0= ruleDataTypeDecl ) ) | ( (lv_types_11_0= ruleEnumTypeDecl ) ) )* ) ;
    public final EObject ruleExtensionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_scheme_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_ID_7=null;
        EObject lv_kinds_8_0 = null;

        EObject lv_mixins_9_0 = null;

        EObject lv_types_10_0 = null;

        EObject lv_types_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:119:28: ( (otherlv_0= 'extension' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'import' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= 'as' this_ID_7= RULE_ID )? )* ( ( (lv_kinds_8_0= ruleKindDecl ) ) | ( (lv_mixins_9_0= ruleMixinDecl ) ) | ( (lv_types_10_0= ruleDataTypeDecl ) ) | ( (lv_types_11_0= ruleEnumTypeDecl ) ) )* ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:120:1: (otherlv_0= 'extension' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'import' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= 'as' this_ID_7= RULE_ID )? )* ( ( (lv_kinds_8_0= ruleKindDecl ) ) | ( (lv_mixins_9_0= ruleMixinDecl ) ) | ( (lv_types_10_0= ruleDataTypeDecl ) ) | ( (lv_types_11_0= ruleEnumTypeDecl ) ) )* )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:120:1: (otherlv_0= 'extension' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'import' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= 'as' this_ID_7= RULE_ID )? )* ( ( (lv_kinds_8_0= ruleKindDecl ) ) | ( (lv_mixins_9_0= ruleMixinDecl ) ) | ( (lv_types_10_0= ruleDataTypeDecl ) ) | ( (lv_types_11_0= ruleEnumTypeDecl ) ) )* )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:120:3: otherlv_0= 'extension' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'import' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= 'as' this_ID_7= RULE_ID )? )* ( ( (lv_kinds_8_0= ruleKindDecl ) ) | ( (lv_mixins_9_0= ruleMixinDecl ) ) | ( (lv_types_10_0= ruleDataTypeDecl ) ) | ( (lv_types_11_0= ruleEnumTypeDecl ) ) )*
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleExtensionDecl241); 

                	newLeafNode(otherlv_0, grammarAccess.getExtensionDeclAccess().getExtensionKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:124:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:125:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:125:1: (lv_name_1_0= RULE_ID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:126:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtensionDecl258); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExtensionDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtensionDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExtensionDecl275); 

                	newLeafNode(otherlv_2, grammarAccess.getExtensionDeclAccess().getColonKeyword_2());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:146:1: ( (lv_scheme_3_0= RULE_STRING ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:147:1: (lv_scheme_3_0= RULE_STRING )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:147:1: (lv_scheme_3_0= RULE_STRING )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:148:3: lv_scheme_3_0= RULE_STRING
            {
            lv_scheme_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExtensionDecl292); 

            			newLeafNode(lv_scheme_3_0, grammarAccess.getExtensionDeclAccess().getSchemeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtensionDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"scheme",
                    		lv_scheme_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:164:2: (otherlv_4= 'import' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= 'as' this_ID_7= RULE_ID )? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:164:4: otherlv_4= 'import' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= 'as' this_ID_7= RULE_ID )?
            	    {
            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtensionDecl310); 

            	        	newLeafNode(otherlv_4, grammarAccess.getExtensionDeclAccess().getImportKeyword_4_0());
            	        
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:168:1: ( (otherlv_5= RULE_STRING ) )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:169:1: (otherlv_5= RULE_STRING )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:169:1: (otherlv_5= RULE_STRING )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:170:3: otherlv_5= RULE_STRING
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExtensionDeclRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExtensionDecl330); 

            	    		newLeafNode(otherlv_5, grammarAccess.getExtensionDeclAccess().getImportExtensionCrossReference_4_1_0()); 
            	    	

            	    }


            	    }

            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:181:2: (otherlv_6= 'as' this_ID_7= RULE_ID )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==15) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:181:4: otherlv_6= 'as' this_ID_7= RULE_ID
            	            {
            	            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExtensionDecl343); 

            	                	newLeafNode(otherlv_6, grammarAccess.getExtensionDeclAccess().getAsKeyword_4_2_0());
            	                
            	            this_ID_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtensionDecl354); 
            	             
            	                newLeafNode(this_ID_7, grammarAccess.getExtensionDeclAccess().getIDTerminalRuleCall_4_2_1()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:189:5: ( ( (lv_kinds_8_0= ruleKindDecl ) ) | ( (lv_mixins_9_0= ruleMixinDecl ) ) | ( (lv_types_10_0= ruleDataTypeDecl ) ) | ( (lv_types_11_0= ruleEnumTypeDecl ) ) )*
            loop4:
            do {
                int alt4=5;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt4=1;
                    }
                    break;
                case 21:
                    {
                    alt4=2;
                    }
                    break;
                case 35:
                    {
                    alt4=3;
                    }
                    break;
                case 47:
                    {
                    alt4=4;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:189:6: ( (lv_kinds_8_0= ruleKindDecl ) )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:189:6: ( (lv_kinds_8_0= ruleKindDecl ) )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:190:1: (lv_kinds_8_0= ruleKindDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:190:1: (lv_kinds_8_0= ruleKindDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:191:3: lv_kinds_8_0= ruleKindDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExtensionDeclAccess().getKindsKindDeclParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKindDecl_in_ruleExtensionDecl379);
            	    lv_kinds_8_0=ruleKindDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExtensionDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"kinds",
            	            		lv_kinds_8_0, 
            	            		"KindDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:208:6: ( (lv_mixins_9_0= ruleMixinDecl ) )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:208:6: ( (lv_mixins_9_0= ruleMixinDecl ) )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:209:1: (lv_mixins_9_0= ruleMixinDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:209:1: (lv_mixins_9_0= ruleMixinDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:210:3: lv_mixins_9_0= ruleMixinDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExtensionDeclAccess().getMixinsMixinDeclParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMixinDecl_in_ruleExtensionDecl406);
            	    lv_mixins_9_0=ruleMixinDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExtensionDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mixins",
            	            		lv_mixins_9_0, 
            	            		"MixinDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:227:6: ( (lv_types_10_0= ruleDataTypeDecl ) )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:227:6: ( (lv_types_10_0= ruleDataTypeDecl ) )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:228:1: (lv_types_10_0= ruleDataTypeDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:228:1: (lv_types_10_0= ruleDataTypeDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:229:3: lv_types_10_0= ruleDataTypeDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExtensionDeclAccess().getTypesDataTypeDeclParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDataTypeDecl_in_ruleExtensionDecl433);
            	    lv_types_10_0=ruleDataTypeDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExtensionDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_10_0, 
            	            		"DataTypeDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:246:6: ( (lv_types_11_0= ruleEnumTypeDecl ) )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:246:6: ( (lv_types_11_0= ruleEnumTypeDecl ) )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:247:1: (lv_types_11_0= ruleEnumTypeDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:247:1: (lv_types_11_0= ruleEnumTypeDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:248:3: lv_types_11_0= ruleEnumTypeDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExtensionDeclAccess().getTypesEnumTypeDeclParserRuleCall_5_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumTypeDecl_in_ruleExtensionDecl460);
            	    lv_types_11_0=ruleEnumTypeDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExtensionDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_11_0, 
            	            		"EnumTypeDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleExtensionDecl"


    // $ANTLR start "entryRuleKindDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:272:1: entryRuleKindDecl returns [EObject current=null] : iv_ruleKindDecl= ruleKindDecl EOF ;
    public final EObject entryRuleKindDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKindDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:273:2: (iv_ruleKindDecl= ruleKindDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:274:2: iv_ruleKindDecl= ruleKindDecl EOF
            {
             newCompositeNode(grammarAccess.getKindDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKindDecl_in_entryRuleKindDecl498);
            iv_ruleKindDecl=ruleKindDecl();

            state._fsp--;

             current =iv_ruleKindDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKindDecl508); 

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
    // $ANTLR end "entryRuleKindDecl"


    // $ANTLR start "ruleKindDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:281:1: ruleKindDecl returns [EObject current=null] : (otherlv_0= 'kind' ( (lv_term_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( ( (lv_attributes_7_0= ruleAttributeDecl ) ) | ( (lv_actions_8_0= ruleActionDecl ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleKindDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_term_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_title_6_0=null;
        Token otherlv_9=null;
        EObject lv_attributes_7_0 = null;

        EObject lv_actions_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:284:28: ( (otherlv_0= 'kind' ( (lv_term_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( ( (lv_attributes_7_0= ruleAttributeDecl ) ) | ( (lv_actions_8_0= ruleActionDecl ) ) )* otherlv_9= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:285:1: (otherlv_0= 'kind' ( (lv_term_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( ( (lv_attributes_7_0= ruleAttributeDecl ) ) | ( (lv_actions_8_0= ruleActionDecl ) ) )* otherlv_9= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:285:1: (otherlv_0= 'kind' ( (lv_term_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( ( (lv_attributes_7_0= ruleAttributeDecl ) ) | ( (lv_actions_8_0= ruleActionDecl ) ) )* otherlv_9= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:285:3: otherlv_0= 'kind' ( (lv_term_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( ( (lv_attributes_7_0= ruleAttributeDecl ) ) | ( (lv_actions_8_0= ruleActionDecl ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKindDecl545); 

                	newLeafNode(otherlv_0, grammarAccess.getKindDeclAccess().getKindKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:289:1: ( (lv_term_1_0= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:290:1: (lv_term_1_0= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:290:1: (lv_term_1_0= RULE_ID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:291:3: lv_term_1_0= RULE_ID
            {
            lv_term_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKindDecl562); 

            			newLeafNode(lv_term_1_0, grammarAccess.getKindDeclAccess().getTermIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKindDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"term",
                    		lv_term_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:307:2: (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:307:4: otherlv_2= 'extends' ( ( ruleQualifiedID ) )
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleKindDecl580); 

                        	newLeafNode(otherlv_2, grammarAccess.getKindDeclAccess().getExtendsKeyword_2_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:311:1: ( ( ruleQualifiedID ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:312:1: ( ruleQualifiedID )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:312:1: ( ruleQualifiedID )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:313:3: ruleQualifiedID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getKindDeclRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getKindDeclAccess().getParentKindCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleKindDecl603);
                    ruleQualifiedID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleKindDecl617); 

                	newLeafNode(otherlv_4, grammarAccess.getKindDeclAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:330:1: (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:330:3: otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleKindDecl630); 

                        	newLeafNode(otherlv_5, grammarAccess.getKindDeclAccess().getTitleKeyword_4_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:334:1: ( (lv_title_6_0= RULE_STRING ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:335:1: (lv_title_6_0= RULE_STRING )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:335:1: (lv_title_6_0= RULE_STRING )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:336:3: lv_title_6_0= RULE_STRING
                    {
                    lv_title_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleKindDecl647); 

                    			newLeafNode(lv_title_6_0, grammarAccess.getKindDeclAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKindDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"title",
                            		lv_title_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:352:4: ( ( (lv_attributes_7_0= ruleAttributeDecl ) ) | ( (lv_actions_8_0= ruleActionDecl ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }
                else if ( (LA7_0==32) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:352:5: ( (lv_attributes_7_0= ruleAttributeDecl ) )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:352:5: ( (lv_attributes_7_0= ruleAttributeDecl ) )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:353:1: (lv_attributes_7_0= ruleAttributeDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:353:1: (lv_attributes_7_0= ruleAttributeDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:354:3: lv_attributes_7_0= ruleAttributeDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKindDeclAccess().getAttributesAttributeDeclParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAttributeDecl_in_ruleKindDecl676);
            	    lv_attributes_7_0=ruleAttributeDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKindDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_7_0, 
            	            		"AttributeDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:371:6: ( (lv_actions_8_0= ruleActionDecl ) )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:371:6: ( (lv_actions_8_0= ruleActionDecl ) )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:372:1: (lv_actions_8_0= ruleActionDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:372:1: (lv_actions_8_0= ruleActionDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:373:3: lv_actions_8_0= ruleActionDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKindDeclAccess().getActionsActionDeclParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleActionDecl_in_ruleKindDecl703);
            	    lv_actions_8_0=ruleActionDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKindDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_8_0, 
            	            		"ActionDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleKindDecl717); 

                	newLeafNode(otherlv_9, grammarAccess.getKindDeclAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleKindDecl"


    // $ANTLR start "entryRuleMixinDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:401:1: entryRuleMixinDecl returns [EObject current=null] : iv_ruleMixinDecl= ruleMixinDecl EOF ;
    public final EObject entryRuleMixinDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixinDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:402:2: (iv_ruleMixinDecl= ruleMixinDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:403:2: iv_ruleMixinDecl= ruleMixinDecl EOF
            {
             newCompositeNode(grammarAccess.getMixinDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMixinDecl_in_entryRuleMixinDecl753);
            iv_ruleMixinDecl=ruleMixinDecl();

            state._fsp--;

             current =iv_ruleMixinDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMixinDecl763); 

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
    // $ANTLR end "entryRuleMixinDecl"


    // $ANTLR start "ruleMixinDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:410:1: ruleMixinDecl returns [EObject current=null] : (otherlv_0= 'mixin' ( (lv_term_1_0= RULE_ID ) ) (otherlv_2= 'depends' ( ( ruleQualifiedID ) ) (otherlv_4= ',' ( ( ruleQualifiedID ) ) )* )? (otherlv_6= 'applies' ( ( ruleQualifiedID ) ) (otherlv_8= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_10= '{' (otherlv_11= 'scheme' ( (lv_scheme_12_0= RULE_STRING ) ) )? (otherlv_13= 'title' ( (lv_title_14_0= RULE_STRING ) ) )? ( ( (lv_attributes_15_0= ruleAttributeDecl ) ) | ( (lv_actions_16_0= ruleActionDecl ) ) )* otherlv_17= '}' ) ;
    public final EObject ruleMixinDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_term_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_scheme_12_0=null;
        Token otherlv_13=null;
        Token lv_title_14_0=null;
        Token otherlv_17=null;
        EObject lv_attributes_15_0 = null;

        EObject lv_actions_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:413:28: ( (otherlv_0= 'mixin' ( (lv_term_1_0= RULE_ID ) ) (otherlv_2= 'depends' ( ( ruleQualifiedID ) ) (otherlv_4= ',' ( ( ruleQualifiedID ) ) )* )? (otherlv_6= 'applies' ( ( ruleQualifiedID ) ) (otherlv_8= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_10= '{' (otherlv_11= 'scheme' ( (lv_scheme_12_0= RULE_STRING ) ) )? (otherlv_13= 'title' ( (lv_title_14_0= RULE_STRING ) ) )? ( ( (lv_attributes_15_0= ruleAttributeDecl ) ) | ( (lv_actions_16_0= ruleActionDecl ) ) )* otherlv_17= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:414:1: (otherlv_0= 'mixin' ( (lv_term_1_0= RULE_ID ) ) (otherlv_2= 'depends' ( ( ruleQualifiedID ) ) (otherlv_4= ',' ( ( ruleQualifiedID ) ) )* )? (otherlv_6= 'applies' ( ( ruleQualifiedID ) ) (otherlv_8= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_10= '{' (otherlv_11= 'scheme' ( (lv_scheme_12_0= RULE_STRING ) ) )? (otherlv_13= 'title' ( (lv_title_14_0= RULE_STRING ) ) )? ( ( (lv_attributes_15_0= ruleAttributeDecl ) ) | ( (lv_actions_16_0= ruleActionDecl ) ) )* otherlv_17= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:414:1: (otherlv_0= 'mixin' ( (lv_term_1_0= RULE_ID ) ) (otherlv_2= 'depends' ( ( ruleQualifiedID ) ) (otherlv_4= ',' ( ( ruleQualifiedID ) ) )* )? (otherlv_6= 'applies' ( ( ruleQualifiedID ) ) (otherlv_8= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_10= '{' (otherlv_11= 'scheme' ( (lv_scheme_12_0= RULE_STRING ) ) )? (otherlv_13= 'title' ( (lv_title_14_0= RULE_STRING ) ) )? ( ( (lv_attributes_15_0= ruleAttributeDecl ) ) | ( (lv_actions_16_0= ruleActionDecl ) ) )* otherlv_17= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:414:3: otherlv_0= 'mixin' ( (lv_term_1_0= RULE_ID ) ) (otherlv_2= 'depends' ( ( ruleQualifiedID ) ) (otherlv_4= ',' ( ( ruleQualifiedID ) ) )* )? (otherlv_6= 'applies' ( ( ruleQualifiedID ) ) (otherlv_8= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_10= '{' (otherlv_11= 'scheme' ( (lv_scheme_12_0= RULE_STRING ) ) )? (otherlv_13= 'title' ( (lv_title_14_0= RULE_STRING ) ) )? ( ( (lv_attributes_15_0= ruleAttributeDecl ) ) | ( (lv_actions_16_0= ruleActionDecl ) ) )* otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMixinDecl800); 

                	newLeafNode(otherlv_0, grammarAccess.getMixinDeclAccess().getMixinKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:418:1: ( (lv_term_1_0= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:419:1: (lv_term_1_0= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:419:1: (lv_term_1_0= RULE_ID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:420:3: lv_term_1_0= RULE_ID
            {
            lv_term_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMixinDecl817); 

            			newLeafNode(lv_term_1_0, grammarAccess.getMixinDeclAccess().getTermIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMixinDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"term",
                    		lv_term_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:436:2: (otherlv_2= 'depends' ( ( ruleQualifiedID ) ) (otherlv_4= ',' ( ( ruleQualifiedID ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:436:4: otherlv_2= 'depends' ( ( ruleQualifiedID ) ) (otherlv_4= ',' ( ( ruleQualifiedID ) ) )*
                    {
                    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMixinDecl835); 

                        	newLeafNode(otherlv_2, grammarAccess.getMixinDeclAccess().getDependsKeyword_2_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:440:1: ( ( ruleQualifiedID ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:441:1: ( ruleQualifiedID )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:441:1: ( ruleQualifiedID )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:442:3: ruleQualifiedID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMixinDeclRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMixinDeclAccess().getDependsMixinCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleMixinDecl858);
                    ruleQualifiedID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:455:2: (otherlv_4= ',' ( ( ruleQualifiedID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==23) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:455:4: otherlv_4= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMixinDecl871); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getMixinDeclAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:459:1: ( ( ruleQualifiedID ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:460:1: ( ruleQualifiedID )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:460:1: ( ruleQualifiedID )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:461:3: ruleQualifiedID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMixinDeclRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMixinDeclAccess().getDependsMixinCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleMixinDecl894);
                    	    ruleQualifiedID();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:474:6: (otherlv_6= 'applies' ( ( ruleQualifiedID ) ) (otherlv_8= ',' ( ( ruleQualifiedID ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:474:8: otherlv_6= 'applies' ( ( ruleQualifiedID ) ) (otherlv_8= ',' ( ( ruleQualifiedID ) ) )*
                    {
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMixinDecl911); 

                        	newLeafNode(otherlv_6, grammarAccess.getMixinDeclAccess().getAppliesKeyword_3_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:478:1: ( ( ruleQualifiedID ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:479:1: ( ruleQualifiedID )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:479:1: ( ruleQualifiedID )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:480:3: ruleQualifiedID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMixinDeclRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMixinDeclAccess().getAppliesKindCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleMixinDecl934);
                    ruleQualifiedID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:493:2: (otherlv_8= ',' ( ( ruleQualifiedID ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==23) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:493:4: otherlv_8= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMixinDecl947); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getMixinDeclAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:497:1: ( ( ruleQualifiedID ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:498:1: ( ruleQualifiedID )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:498:1: ( ruleQualifiedID )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:499:3: ruleQualifiedID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMixinDeclRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMixinDeclAccess().getAppliesKindCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleMixinDecl970);
                    	    ruleQualifiedID();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMixinDecl986); 

                	newLeafNode(otherlv_10, grammarAccess.getMixinDeclAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:516:1: (otherlv_11= 'scheme' ( (lv_scheme_12_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:516:3: otherlv_11= 'scheme' ( (lv_scheme_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMixinDecl999); 

                        	newLeafNode(otherlv_11, grammarAccess.getMixinDeclAccess().getSchemeKeyword_5_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:520:1: ( (lv_scheme_12_0= RULE_STRING ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:521:1: (lv_scheme_12_0= RULE_STRING )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:521:1: (lv_scheme_12_0= RULE_STRING )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:522:3: lv_scheme_12_0= RULE_STRING
                    {
                    lv_scheme_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMixinDecl1016); 

                    			newLeafNode(lv_scheme_12_0, grammarAccess.getMixinDeclAccess().getSchemeSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMixinDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"scheme",
                            		lv_scheme_12_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:538:4: (otherlv_13= 'title' ( (lv_title_14_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:538:6: otherlv_13= 'title' ( (lv_title_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMixinDecl1036); 

                        	newLeafNode(otherlv_13, grammarAccess.getMixinDeclAccess().getTitleKeyword_6_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:542:1: ( (lv_title_14_0= RULE_STRING ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:543:1: (lv_title_14_0= RULE_STRING )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:543:1: (lv_title_14_0= RULE_STRING )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:544:3: lv_title_14_0= RULE_STRING
                    {
                    lv_title_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMixinDecl1053); 

                    			newLeafNode(lv_title_14_0, grammarAccess.getMixinDeclAccess().getTitleSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMixinDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"title",
                            		lv_title_14_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:560:4: ( ( (lv_attributes_15_0= ruleAttributeDecl ) ) | ( (lv_actions_16_0= ruleActionDecl ) ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }
                else if ( (LA14_0==32) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:560:5: ( (lv_attributes_15_0= ruleAttributeDecl ) )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:560:5: ( (lv_attributes_15_0= ruleAttributeDecl ) )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:561:1: (lv_attributes_15_0= ruleAttributeDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:561:1: (lv_attributes_15_0= ruleAttributeDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:562:3: lv_attributes_15_0= ruleAttributeDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMixinDeclAccess().getAttributesAttributeDeclParserRuleCall_7_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAttributeDecl_in_ruleMixinDecl1082);
            	    lv_attributes_15_0=ruleAttributeDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMixinDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_15_0, 
            	            		"AttributeDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:579:6: ( (lv_actions_16_0= ruleActionDecl ) )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:579:6: ( (lv_actions_16_0= ruleActionDecl ) )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:580:1: (lv_actions_16_0= ruleActionDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:580:1: (lv_actions_16_0= ruleActionDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:581:3: lv_actions_16_0= ruleActionDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMixinDeclAccess().getActionsActionDeclParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleActionDecl_in_ruleMixinDecl1109);
            	    lv_actions_16_0=ruleActionDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMixinDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_16_0, 
            	            		"ActionDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMixinDecl1123); 

                	newLeafNode(otherlv_17, grammarAccess.getMixinDeclAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleMixinDecl"


    // $ANTLR start "entryRuleAttributeDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:609:1: entryRuleAttributeDecl returns [EObject current=null] : iv_ruleAttributeDecl= ruleAttributeDecl EOF ;
    public final EObject entryRuleAttributeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:610:2: (iv_ruleAttributeDecl= ruleAttributeDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:611:2: iv_ruleAttributeDecl= ruleAttributeDecl EOF
            {
             newCompositeNode(grammarAccess.getAttributeDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeDecl_in_entryRuleAttributeDecl1159);
            iv_ruleAttributeDecl=ruleAttributeDecl();

            state._fsp--;

             current =iv_ruleAttributeDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeDecl1169); 

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
    // $ANTLR end "entryRuleAttributeDecl"


    // $ANTLR start "ruleAttributeDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:618:1: ruleAttributeDecl returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_6_0= '*' ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' )? ) ;
    public final EObject ruleAttributeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mutable_1_0=null;
        Token lv_required_2_0=null;
        Token otherlv_4=null;
        Token lv_multiple_values_6_0=null;
        Token otherlv_7=null;
        Token lv_default_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:621:28: ( (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_6_0= '*' ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' )? ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:622:1: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_6_0= '*' ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:622:1: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_6_0= '*' ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' )? )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:622:3: otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_6_0= '*' ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAttributeDecl1206); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeDeclAccess().getAttributeKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:626:1: ( (lv_mutable_1_0= 'mutable' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:627:1: (lv_mutable_1_0= 'mutable' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:627:1: (lv_mutable_1_0= 'mutable' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:628:3: lv_mutable_1_0= 'mutable'
                    {
                    lv_mutable_1_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAttributeDecl1224); 

                            newLeafNode(lv_mutable_1_0, grammarAccess.getAttributeDeclAccess().getMutableMutableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeDeclRule());
                    	        }
                           		setWithLastConsumed(current, "mutable", true, "mutable");
                    	    

                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:641:3: ( (lv_required_2_0= 'required' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:642:1: (lv_required_2_0= 'required' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:642:1: (lv_required_2_0= 'required' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:643:3: lv_required_2_0= 'required'
                    {
                    lv_required_2_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAttributeDecl1256); 

                            newLeafNode(lv_required_2_0, grammarAccess.getAttributeDeclAccess().getRequiredRequiredKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeDeclRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:656:3: ( (lv_name_3_0= ruleQualifiedID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:657:1: (lv_name_3_0= ruleQualifiedID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:657:1: (lv_name_3_0= ruleQualifiedID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:658:3: lv_name_3_0= ruleQualifiedID
            {
             
            	        newCompositeNode(grammarAccess.getAttributeDeclAccess().getNameQualifiedIDParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleAttributeDecl1291);
            lv_name_3_0=ruleQualifiedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeDeclRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"QualifiedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAttributeDecl1303); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeDeclAccess().getColonKeyword_4());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:678:1: ( ( ruleQualifiedID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:679:1: ( ruleQualifiedID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:679:1: ( ruleQualifiedID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:680:3: ruleQualifiedID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeDeclRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAttributeDeclAccess().getTypeEDataTypeCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleAttributeDecl1326);
            ruleQualifiedID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:693:2: ( (lv_multiple_values_6_0= '*' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:694:1: (lv_multiple_values_6_0= '*' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:694:1: (lv_multiple_values_6_0= '*' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:695:3: lv_multiple_values_6_0= '*'
                    {
                    lv_multiple_values_6_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAttributeDecl1344); 

                            newLeafNode(lv_multiple_values_6_0, grammarAccess.getAttributeDeclAccess().getMultiple_valuesAsteriskKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeDeclRule());
                    	        }
                           		setWithLastConsumed(current, "multiple_values", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:708:3: (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:708:5: otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAttributeDecl1371); 

                        	newLeafNode(otherlv_7, grammarAccess.getAttributeDeclAccess().getEqualsSignKeyword_7_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:712:1: ( (lv_default_8_0= RULE_STRING ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:713:1: (lv_default_8_0= RULE_STRING )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:713:1: (lv_default_8_0= RULE_STRING )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:714:3: lv_default_8_0= RULE_STRING
                    {
                    lv_default_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttributeDecl1388); 

                    			newLeafNode(lv_default_8_0, grammarAccess.getAttributeDeclAccess().getDefaultSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"default",
                            		lv_default_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:730:4: (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:730:6: otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAttributeDecl1408); 

                        	newLeafNode(otherlv_9, grammarAccess.getAttributeDeclAccess().getLeftCurlyBracketKeyword_8_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:734:1: (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==31) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:734:3: otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) )
                            {
                            otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAttributeDecl1421); 

                                	newLeafNode(otherlv_10, grammarAccess.getAttributeDeclAccess().getDescriptionKeyword_8_1_0());
                                
                            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:738:1: ( (lv_description_11_0= RULE_STRING ) )
                            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:739:1: (lv_description_11_0= RULE_STRING )
                            {
                            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:739:1: (lv_description_11_0= RULE_STRING )
                            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:740:3: lv_description_11_0= RULE_STRING
                            {
                            lv_description_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttributeDecl1438); 

                            			newLeafNode(lv_description_11_0, grammarAccess.getAttributeDeclAccess().getDescriptionSTRINGTerminalRuleCall_8_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAttributeDeclRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_11_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAttributeDecl1457); 

                        	newLeafNode(otherlv_12, grammarAccess.getAttributeDeclAccess().getRightCurlyBracketKeyword_8_2());
                        

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
    // $ANTLR end "ruleAttributeDecl"


    // $ANTLR start "entryRuleActionDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:768:1: entryRuleActionDecl returns [EObject current=null] : iv_ruleActionDecl= ruleActionDecl EOF ;
    public final EObject entryRuleActionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:769:2: (iv_ruleActionDecl= ruleActionDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:770:2: iv_ruleActionDecl= ruleActionDecl EOF
            {
             newCompositeNode(grammarAccess.getActionDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActionDecl_in_entryRuleActionDecl1495);
            iv_ruleActionDecl=ruleActionDecl();

            state._fsp--;

             current =iv_ruleActionDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActionDecl1505); 

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
    // $ANTLR end "entryRuleActionDecl"


    // $ANTLR start "ruleActionDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:777:1: ruleActionDecl returns [EObject current=null] : (otherlv_0= 'action' ( (lv_term_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* )? otherlv_6= ')' (otherlv_7= '{' otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) otherlv_10= '}' )? ) ;
    public final EObject ruleActionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_term_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_title_9_0=null;
        Token otherlv_10=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:780:28: ( (otherlv_0= 'action' ( (lv_term_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* )? otherlv_6= ')' (otherlv_7= '{' otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) otherlv_10= '}' )? ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:781:1: (otherlv_0= 'action' ( (lv_term_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* )? otherlv_6= ')' (otherlv_7= '{' otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) otherlv_10= '}' )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:781:1: (otherlv_0= 'action' ( (lv_term_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* )? otherlv_6= ')' (otherlv_7= '{' otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) otherlv_10= '}' )? )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:781:3: otherlv_0= 'action' ( (lv_term_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* )? otherlv_6= ')' (otherlv_7= '{' otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleActionDecl1542); 

                	newLeafNode(otherlv_0, grammarAccess.getActionDeclAccess().getActionKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:785:1: ( (lv_term_1_0= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:786:1: (lv_term_1_0= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:786:1: (lv_term_1_0= RULE_ID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:787:3: lv_term_1_0= RULE_ID
            {
            lv_term_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleActionDecl1559); 

            			newLeafNode(lv_term_1_0, grammarAccess.getActionDeclAccess().getTermIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"term",
                    		lv_term_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleActionDecl1576); 

                	newLeafNode(otherlv_2, grammarAccess.getActionDeclAccess().getLeftParenthesisKeyword_2());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:807:1: ( ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==RULE_QUALIFIED_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:807:2: ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )*
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:807:2: ( (lv_attributes_3_0= ruleParameterDecl ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:808:1: (lv_attributes_3_0= ruleParameterDecl )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:808:1: (lv_attributes_3_0= ruleParameterDecl )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:809:3: lv_attributes_3_0= ruleParameterDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionDeclAccess().getAttributesParameterDeclParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameterDecl_in_ruleActionDecl1598);
                    lv_attributes_3_0=ruleParameterDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionDeclRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_3_0, 
                            		"ParameterDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:825:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==23) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:825:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleActionDecl1611); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getActionDeclAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:829:1: ( (lv_attributes_5_0= ruleParameterDecl ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:830:1: (lv_attributes_5_0= ruleParameterDecl )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:830:1: (lv_attributes_5_0= ruleParameterDecl )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:831:3: lv_attributes_5_0= ruleParameterDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActionDeclAccess().getAttributesParameterDeclParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameterDecl_in_ruleActionDecl1632);
                    	    lv_attributes_5_0=ruleParameterDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActionDeclRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_5_0, 
                    	            		"ParameterDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleActionDecl1648); 

                	newLeafNode(otherlv_6, grammarAccess.getActionDeclAccess().getRightParenthesisKeyword_4());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:851:1: (otherlv_7= '{' otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) otherlv_10= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:851:3: otherlv_7= '{' otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleActionDecl1661); 

                        	newLeafNode(otherlv_7, grammarAccess.getActionDeclAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleActionDecl1673); 

                        	newLeafNode(otherlv_8, grammarAccess.getActionDeclAccess().getTitleKeyword_5_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:859:1: ( (lv_title_9_0= RULE_STRING ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:860:1: (lv_title_9_0= RULE_STRING )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:860:1: (lv_title_9_0= RULE_STRING )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:861:3: lv_title_9_0= RULE_STRING
                    {
                    lv_title_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleActionDecl1690); 

                    			newLeafNode(lv_title_9_0, grammarAccess.getActionDeclAccess().getTitleSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"title",
                            		lv_title_9_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleActionDecl1707); 

                        	newLeafNode(otherlv_10, grammarAccess.getActionDeclAccess().getRightCurlyBracketKeyword_5_3());
                        

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
    // $ANTLR end "ruleActionDecl"


    // $ANTLR start "entryRuleParameterDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:889:1: entryRuleParameterDecl returns [EObject current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final EObject entryRuleParameterDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:890:2: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:891:2: iv_ruleParameterDecl= ruleParameterDecl EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterDecl_in_entryRuleParameterDecl1745);
            iv_ruleParameterDecl=ruleParameterDecl();

            state._fsp--;

             current =iv_ruleParameterDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterDecl1755); 

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
    // $ANTLR end "entryRuleParameterDecl"


    // $ANTLR start "ruleParameterDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:898:1: ruleParameterDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_3_0= '*' ) )? (otherlv_4= '=' ( (lv_default_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleParameterDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_multiple_values_3_0=null;
        Token otherlv_4=null;
        Token lv_default_5_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:901:28: ( ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_3_0= '*' ) )? (otherlv_4= '=' ( (lv_default_5_0= RULE_STRING ) ) )? ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:902:1: ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_3_0= '*' ) )? (otherlv_4= '=' ( (lv_default_5_0= RULE_STRING ) ) )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:902:1: ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_3_0= '*' ) )? (otherlv_4= '=' ( (lv_default_5_0= RULE_STRING ) ) )? )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:902:2: ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_3_0= '*' ) )? (otherlv_4= '=' ( (lv_default_5_0= RULE_STRING ) ) )?
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:902:2: ( (lv_name_0_0= ruleQualifiedID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:903:1: (lv_name_0_0= ruleQualifiedID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:903:1: (lv_name_0_0= ruleQualifiedID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:904:3: lv_name_0_0= ruleQualifiedID
            {
             
            	        newCompositeNode(grammarAccess.getParameterDeclAccess().getNameQualifiedIDParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleParameterDecl1801);
            lv_name_0_0=ruleQualifiedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterDeclRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"QualifiedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParameterDecl1813); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterDeclAccess().getColonKeyword_1());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:924:1: ( ( ruleQualifiedID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:925:1: ( ruleQualifiedID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:925:1: ( ruleQualifiedID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:926:3: ruleQualifiedID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterDeclRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterDeclAccess().getTypeEDataTypeCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleParameterDecl1836);
            ruleQualifiedID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:939:2: ( (lv_multiple_values_3_0= '*' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:940:1: (lv_multiple_values_3_0= '*' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:940:1: (lv_multiple_values_3_0= '*' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:941:3: lv_multiple_values_3_0= '*'
                    {
                    lv_multiple_values_3_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleParameterDecl1854); 

                            newLeafNode(lv_multiple_values_3_0, grammarAccess.getParameterDeclAccess().getMultiple_valuesAsteriskKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDeclRule());
                    	        }
                           		setWithLastConsumed(current, "multiple_values", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:954:3: (otherlv_4= '=' ( (lv_default_5_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:954:5: otherlv_4= '=' ( (lv_default_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleParameterDecl1881); 

                        	newLeafNode(otherlv_4, grammarAccess.getParameterDeclAccess().getEqualsSignKeyword_4_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:958:1: ( (lv_default_5_0= RULE_STRING ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:959:1: (lv_default_5_0= RULE_STRING )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:959:1: (lv_default_5_0= RULE_STRING )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:960:3: lv_default_5_0= RULE_STRING
                    {
                    lv_default_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleParameterDecl1898); 

                    			newLeafNode(lv_default_5_0, grammarAccess.getParameterDeclAccess().getDefaultSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"default",
                            		lv_default_5_0, 
                            		"STRING");
                    	    

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
    // $ANTLR end "ruleParameterDecl"


    // $ANTLR start "entryRuleDataTypeDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:984:1: entryRuleDataTypeDecl returns [EObject current=null] : iv_ruleDataTypeDecl= ruleDataTypeDecl EOF ;
    public final EObject entryRuleDataTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:985:2: (iv_ruleDataTypeDecl= ruleDataTypeDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:986:2: iv_ruleDataTypeDecl= ruleDataTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getDataTypeDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypeDecl_in_entryRuleDataTypeDecl1941);
            iv_ruleDataTypeDecl=ruleDataTypeDecl();

            state._fsp--;

             current =iv_ruleDataTypeDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataTypeDecl1951); 

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
    // $ANTLR end "entryRuleDataTypeDecl"


    // $ANTLR start "ruleDataTypeDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:993:1: ruleDataTypeDecl returns [EObject current=null] : ( () otherlv_1= 'datatype' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_instanceClassName_4_0= RULE_STRING ) ) (otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleDataTypeAnnotations ) ) otherlv_7= '}' )? ) ;
    public final EObject ruleDataTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_instanceClassName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_eAnnotations_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:996:28: ( ( () otherlv_1= 'datatype' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_instanceClassName_4_0= RULE_STRING ) ) (otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleDataTypeAnnotations ) ) otherlv_7= '}' )? ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:997:1: ( () otherlv_1= 'datatype' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_instanceClassName_4_0= RULE_STRING ) ) (otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleDataTypeAnnotations ) ) otherlv_7= '}' )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:997:1: ( () otherlv_1= 'datatype' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_instanceClassName_4_0= RULE_STRING ) ) (otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleDataTypeAnnotations ) ) otherlv_7= '}' )? )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:997:2: () otherlv_1= 'datatype' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_instanceClassName_4_0= RULE_STRING ) ) (otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleDataTypeAnnotations ) ) otherlv_7= '}' )?
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:997:2: ()
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:998:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataTypeDeclAccess().getEDataTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleDataTypeDecl1997); 

                	newLeafNode(otherlv_1, grammarAccess.getDataTypeDeclAccess().getDatatypeKeyword_1());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1007:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1008:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1008:1: (lv_name_2_0= RULE_ID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1009:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataTypeDecl2014); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDataTypeDeclAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDataTypeDecl2031); 

                	newLeafNode(otherlv_3, grammarAccess.getDataTypeDeclAccess().getColonKeyword_3());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1029:1: ( (lv_instanceClassName_4_0= RULE_STRING ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1030:1: (lv_instanceClassName_4_0= RULE_STRING )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1030:1: (lv_instanceClassName_4_0= RULE_STRING )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1031:3: lv_instanceClassName_4_0= RULE_STRING
            {
            lv_instanceClassName_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDataTypeDecl2048); 

            			newLeafNode(lv_instanceClassName_4_0, grammarAccess.getDataTypeDeclAccess().getInstanceClassNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"instanceClassName",
                    		lv_instanceClassName_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1047:2: (otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleDataTypeAnnotations ) ) otherlv_7= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1047:4: otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleDataTypeAnnotations ) ) otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDataTypeDecl2066); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataTypeDeclAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1051:1: ( (lv_eAnnotations_6_0= ruleDataTypeAnnotations ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1052:1: (lv_eAnnotations_6_0= ruleDataTypeAnnotations )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1052:1: (lv_eAnnotations_6_0= ruleDataTypeAnnotations )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1053:3: lv_eAnnotations_6_0= ruleDataTypeAnnotations
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeDeclAccess().getEAnnotationsDataTypeAnnotationsParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDataTypeAnnotations_in_ruleDataTypeDecl2087);
                    lv_eAnnotations_6_0=ruleDataTypeAnnotations();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeDeclRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_6_0, 
                            		"DataTypeAnnotations");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDataTypeDecl2099); 

                        	newLeafNode(otherlv_7, grammarAccess.getDataTypeDeclAccess().getRightCurlyBracketKeyword_5_2());
                        

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
    // $ANTLR end "ruleDataTypeDecl"


    // $ANTLR start "entryRuleDataTypeAnnotations"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1081:1: entryRuleDataTypeAnnotations returns [EObject current=null] : iv_ruleDataTypeAnnotations= ruleDataTypeAnnotations EOF ;
    public final EObject entryRuleDataTypeAnnotations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeAnnotations = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1082:2: (iv_ruleDataTypeAnnotations= ruleDataTypeAnnotations EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1083:2: iv_ruleDataTypeAnnotations= ruleDataTypeAnnotations EOF
            {
             newCompositeNode(grammarAccess.getDataTypeAnnotationsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypeAnnotations_in_entryRuleDataTypeAnnotations2137);
            iv_ruleDataTypeAnnotations=ruleDataTypeAnnotations();

            state._fsp--;

             current =iv_ruleDataTypeAnnotations; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataTypeAnnotations2147); 

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
    // $ANTLR end "entryRuleDataTypeAnnotations"


    // $ANTLR start "ruleDataTypeAnnotations"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1090:1: ruleDataTypeAnnotations returns [EObject current=null] : ( (lv_details_0_0= ruleDataTypeAnnotation ) )+ ;
    public final EObject ruleDataTypeAnnotations() throws RecognitionException {
        EObject current = null;

        EObject lv_details_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1093:28: ( ( (lv_details_0_0= ruleDataTypeAnnotation ) )+ )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1094:1: ( (lv_details_0_0= ruleDataTypeAnnotation ) )+
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1094:1: ( (lv_details_0_0= ruleDataTypeAnnotation ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=36 && LA27_0<=46)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1095:1: (lv_details_0_0= ruleDataTypeAnnotation )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1095:1: (lv_details_0_0= ruleDataTypeAnnotation )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1096:3: lv_details_0_0= ruleDataTypeAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataTypeAnnotationsAccess().getDetailsDataTypeAnnotationParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDataTypeAnnotation_in_ruleDataTypeAnnotations2192);
            	    lv_details_0_0=ruleDataTypeAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"details",
            	            		lv_details_0_0, 
            	            		"DataTypeAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
    // $ANTLR end "ruleDataTypeAnnotations"


    // $ANTLR start "entryRuleDataTypeAnnotation"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1120:1: entryRuleDataTypeAnnotation returns [EObject current=null] : iv_ruleDataTypeAnnotation= ruleDataTypeAnnotation EOF ;
    public final EObject entryRuleDataTypeAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeAnnotation = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1121:2: (iv_ruleDataTypeAnnotation= ruleDataTypeAnnotation EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1122:2: iv_ruleDataTypeAnnotation= ruleDataTypeAnnotation EOF
            {
             newCompositeNode(grammarAccess.getDataTypeAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypeAnnotation_in_entryRuleDataTypeAnnotation2228);
            iv_ruleDataTypeAnnotation=ruleDataTypeAnnotation();

            state._fsp--;

             current =iv_ruleDataTypeAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataTypeAnnotation2238); 

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
    // $ANTLR end "entryRuleDataTypeAnnotation"


    // $ANTLR start "ruleDataTypeAnnotation"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1129:1: ruleDataTypeAnnotation returns [EObject current=null] : ( ( ( (lv_key_0_0= 'minExclusive' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= 'minInclusive' ) ) otherlv_4= '=' ( (lv_value_5_0= ruleInteger ) ) ) | ( ( (lv_key_6_0= 'maxExclusive' ) ) otherlv_7= '=' ( (lv_value_8_0= ruleInteger ) ) ) | ( ( (lv_key_9_0= 'maxInclusive' ) ) otherlv_10= '=' ( (lv_value_11_0= ruleInteger ) ) ) | ( ( (lv_key_12_0= 'totalDigits' ) ) otherlv_13= '=' ( (lv_value_14_0= rulePositiveInteger ) ) ) | ( ( (lv_key_15_0= 'fractionDigits' ) ) otherlv_16= '=' ( (lv_value_17_0= rulePositiveInteger ) ) ) | ( ( (lv_key_18_0= 'length' ) ) otherlv_19= '=' ( (lv_value_20_0= rulePositiveInteger ) ) ) | ( ( (lv_key_21_0= 'minLength' ) ) otherlv_22= '=' ( (lv_value_23_0= rulePositiveInteger ) ) ) | ( ( (lv_key_24_0= 'maxLength' ) ) otherlv_25= '=' ( (lv_value_26_0= rulePositiveInteger ) ) ) | ( ( (lv_key_27_0= 'whiteSpace' ) ) otherlv_28= '=' ( (lv_value_29_0= RULE_STRING ) ) ) | ( ( (lv_key_30_0= 'pattern' ) ) otherlv_31= '=' ( (lv_value_32_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleDataTypeAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_key_3_0=null;
        Token otherlv_4=null;
        Token lv_key_6_0=null;
        Token otherlv_7=null;
        Token lv_key_9_0=null;
        Token otherlv_10=null;
        Token lv_key_12_0=null;
        Token otherlv_13=null;
        Token lv_key_15_0=null;
        Token otherlv_16=null;
        Token lv_key_18_0=null;
        Token otherlv_19=null;
        Token lv_key_21_0=null;
        Token otherlv_22=null;
        Token lv_key_24_0=null;
        Token otherlv_25=null;
        Token lv_key_27_0=null;
        Token otherlv_28=null;
        Token lv_value_29_0=null;
        Token lv_key_30_0=null;
        Token otherlv_31=null;
        Token lv_value_32_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_value_11_0 = null;

        AntlrDatatypeRuleToken lv_value_14_0 = null;

        AntlrDatatypeRuleToken lv_value_17_0 = null;

        AntlrDatatypeRuleToken lv_value_20_0 = null;

        AntlrDatatypeRuleToken lv_value_23_0 = null;

        AntlrDatatypeRuleToken lv_value_26_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1132:28: ( ( ( ( (lv_key_0_0= 'minExclusive' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= 'minInclusive' ) ) otherlv_4= '=' ( (lv_value_5_0= ruleInteger ) ) ) | ( ( (lv_key_6_0= 'maxExclusive' ) ) otherlv_7= '=' ( (lv_value_8_0= ruleInteger ) ) ) | ( ( (lv_key_9_0= 'maxInclusive' ) ) otherlv_10= '=' ( (lv_value_11_0= ruleInteger ) ) ) | ( ( (lv_key_12_0= 'totalDigits' ) ) otherlv_13= '=' ( (lv_value_14_0= rulePositiveInteger ) ) ) | ( ( (lv_key_15_0= 'fractionDigits' ) ) otherlv_16= '=' ( (lv_value_17_0= rulePositiveInteger ) ) ) | ( ( (lv_key_18_0= 'length' ) ) otherlv_19= '=' ( (lv_value_20_0= rulePositiveInteger ) ) ) | ( ( (lv_key_21_0= 'minLength' ) ) otherlv_22= '=' ( (lv_value_23_0= rulePositiveInteger ) ) ) | ( ( (lv_key_24_0= 'maxLength' ) ) otherlv_25= '=' ( (lv_value_26_0= rulePositiveInteger ) ) ) | ( ( (lv_key_27_0= 'whiteSpace' ) ) otherlv_28= '=' ( (lv_value_29_0= RULE_STRING ) ) ) | ( ( (lv_key_30_0= 'pattern' ) ) otherlv_31= '=' ( (lv_value_32_0= RULE_STRING ) ) ) ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1133:1: ( ( ( (lv_key_0_0= 'minExclusive' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= 'minInclusive' ) ) otherlv_4= '=' ( (lv_value_5_0= ruleInteger ) ) ) | ( ( (lv_key_6_0= 'maxExclusive' ) ) otherlv_7= '=' ( (lv_value_8_0= ruleInteger ) ) ) | ( ( (lv_key_9_0= 'maxInclusive' ) ) otherlv_10= '=' ( (lv_value_11_0= ruleInteger ) ) ) | ( ( (lv_key_12_0= 'totalDigits' ) ) otherlv_13= '=' ( (lv_value_14_0= rulePositiveInteger ) ) ) | ( ( (lv_key_15_0= 'fractionDigits' ) ) otherlv_16= '=' ( (lv_value_17_0= rulePositiveInteger ) ) ) | ( ( (lv_key_18_0= 'length' ) ) otherlv_19= '=' ( (lv_value_20_0= rulePositiveInteger ) ) ) | ( ( (lv_key_21_0= 'minLength' ) ) otherlv_22= '=' ( (lv_value_23_0= rulePositiveInteger ) ) ) | ( ( (lv_key_24_0= 'maxLength' ) ) otherlv_25= '=' ( (lv_value_26_0= rulePositiveInteger ) ) ) | ( ( (lv_key_27_0= 'whiteSpace' ) ) otherlv_28= '=' ( (lv_value_29_0= RULE_STRING ) ) ) | ( ( (lv_key_30_0= 'pattern' ) ) otherlv_31= '=' ( (lv_value_32_0= RULE_STRING ) ) ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1133:1: ( ( ( (lv_key_0_0= 'minExclusive' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= 'minInclusive' ) ) otherlv_4= '=' ( (lv_value_5_0= ruleInteger ) ) ) | ( ( (lv_key_6_0= 'maxExclusive' ) ) otherlv_7= '=' ( (lv_value_8_0= ruleInteger ) ) ) | ( ( (lv_key_9_0= 'maxInclusive' ) ) otherlv_10= '=' ( (lv_value_11_0= ruleInteger ) ) ) | ( ( (lv_key_12_0= 'totalDigits' ) ) otherlv_13= '=' ( (lv_value_14_0= rulePositiveInteger ) ) ) | ( ( (lv_key_15_0= 'fractionDigits' ) ) otherlv_16= '=' ( (lv_value_17_0= rulePositiveInteger ) ) ) | ( ( (lv_key_18_0= 'length' ) ) otherlv_19= '=' ( (lv_value_20_0= rulePositiveInteger ) ) ) | ( ( (lv_key_21_0= 'minLength' ) ) otherlv_22= '=' ( (lv_value_23_0= rulePositiveInteger ) ) ) | ( ( (lv_key_24_0= 'maxLength' ) ) otherlv_25= '=' ( (lv_value_26_0= rulePositiveInteger ) ) ) | ( ( (lv_key_27_0= 'whiteSpace' ) ) otherlv_28= '=' ( (lv_value_29_0= RULE_STRING ) ) ) | ( ( (lv_key_30_0= 'pattern' ) ) otherlv_31= '=' ( (lv_value_32_0= RULE_STRING ) ) ) )
            int alt28=11;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt28=1;
                }
                break;
            case 37:
                {
                alt28=2;
                }
                break;
            case 38:
                {
                alt28=3;
                }
                break;
            case 39:
                {
                alt28=4;
                }
                break;
            case 40:
                {
                alt28=5;
                }
                break;
            case 41:
                {
                alt28=6;
                }
                break;
            case 42:
                {
                alt28=7;
                }
                break;
            case 43:
                {
                alt28=8;
                }
                break;
            case 44:
                {
                alt28=9;
                }
                break;
            case 45:
                {
                alt28=10;
                }
                break;
            case 46:
                {
                alt28=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1133:2: ( ( (lv_key_0_0= 'minExclusive' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1133:2: ( ( (lv_key_0_0= 'minExclusive' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1133:3: ( (lv_key_0_0= 'minExclusive' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1133:3: ( (lv_key_0_0= 'minExclusive' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1134:1: (lv_key_0_0= 'minExclusive' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1134:1: (lv_key_0_0= 'minExclusive' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1135:3: lv_key_0_0= 'minExclusive'
                    {
                    lv_key_0_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleDataTypeAnnotation2282); 

                            newLeafNode(lv_key_0_0, grammarAccess.getDataTypeAnnotationAccess().getKeyMinExclusiveKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_0_0, "minExclusive");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypeAnnotation2307); 

                        	newLeafNode(otherlv_1, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_0_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1152:1: ( (lv_value_2_0= ruleInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1153:1: (lv_value_2_0= ruleInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1153:1: (lv_value_2_0= ruleInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1154:3: lv_value_2_0= ruleInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValueIntegerParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2328);
                    lv_value_2_0=ruleInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"Integer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1171:6: ( ( (lv_key_3_0= 'minInclusive' ) ) otherlv_4= '=' ( (lv_value_5_0= ruleInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1171:6: ( ( (lv_key_3_0= 'minInclusive' ) ) otherlv_4= '=' ( (lv_value_5_0= ruleInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1171:7: ( (lv_key_3_0= 'minInclusive' ) ) otherlv_4= '=' ( (lv_value_5_0= ruleInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1171:7: ( (lv_key_3_0= 'minInclusive' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1172:1: (lv_key_3_0= 'minInclusive' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1172:1: (lv_key_3_0= 'minInclusive' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1173:3: lv_key_3_0= 'minInclusive'
                    {
                    lv_key_3_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleDataTypeAnnotation2354); 

                            newLeafNode(lv_key_3_0, grammarAccess.getDataTypeAnnotationAccess().getKeyMinInclusiveKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_3_0, "minInclusive");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypeAnnotation2379); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_1_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1190:1: ( (lv_value_5_0= ruleInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1191:1: (lv_value_5_0= ruleInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1191:1: (lv_value_5_0= ruleInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1192:3: lv_value_5_0= ruleInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValueIntegerParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2400);
                    lv_value_5_0=ruleInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"Integer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1209:6: ( ( (lv_key_6_0= 'maxExclusive' ) ) otherlv_7= '=' ( (lv_value_8_0= ruleInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1209:6: ( ( (lv_key_6_0= 'maxExclusive' ) ) otherlv_7= '=' ( (lv_value_8_0= ruleInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1209:7: ( (lv_key_6_0= 'maxExclusive' ) ) otherlv_7= '=' ( (lv_value_8_0= ruleInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1209:7: ( (lv_key_6_0= 'maxExclusive' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1210:1: (lv_key_6_0= 'maxExclusive' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1210:1: (lv_key_6_0= 'maxExclusive' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1211:3: lv_key_6_0= 'maxExclusive'
                    {
                    lv_key_6_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDataTypeAnnotation2426); 

                            newLeafNode(lv_key_6_0, grammarAccess.getDataTypeAnnotationAccess().getKeyMaxExclusiveKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_6_0, "maxExclusive");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypeAnnotation2451); 

                        	newLeafNode(otherlv_7, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_2_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1228:1: ( (lv_value_8_0= ruleInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1229:1: (lv_value_8_0= ruleInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1229:1: (lv_value_8_0= ruleInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1230:3: lv_value_8_0= ruleInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValueIntegerParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2472);
                    lv_value_8_0=ruleInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_8_0, 
                            		"Integer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1247:6: ( ( (lv_key_9_0= 'maxInclusive' ) ) otherlv_10= '=' ( (lv_value_11_0= ruleInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1247:6: ( ( (lv_key_9_0= 'maxInclusive' ) ) otherlv_10= '=' ( (lv_value_11_0= ruleInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1247:7: ( (lv_key_9_0= 'maxInclusive' ) ) otherlv_10= '=' ( (lv_value_11_0= ruleInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1247:7: ( (lv_key_9_0= 'maxInclusive' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1248:1: (lv_key_9_0= 'maxInclusive' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1248:1: (lv_key_9_0= 'maxInclusive' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1249:3: lv_key_9_0= 'maxInclusive'
                    {
                    lv_key_9_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDataTypeAnnotation2498); 

                            newLeafNode(lv_key_9_0, grammarAccess.getDataTypeAnnotationAccess().getKeyMaxInclusiveKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_9_0, "maxInclusive");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypeAnnotation2523); 

                        	newLeafNode(otherlv_10, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1266:1: ( (lv_value_11_0= ruleInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1267:1: (lv_value_11_0= ruleInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1267:1: (lv_value_11_0= ruleInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1268:3: lv_value_11_0= ruleInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValueIntegerParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2544);
                    lv_value_11_0=ruleInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_11_0, 
                            		"Integer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1285:6: ( ( (lv_key_12_0= 'totalDigits' ) ) otherlv_13= '=' ( (lv_value_14_0= rulePositiveInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1285:6: ( ( (lv_key_12_0= 'totalDigits' ) ) otherlv_13= '=' ( (lv_value_14_0= rulePositiveInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1285:7: ( (lv_key_12_0= 'totalDigits' ) ) otherlv_13= '=' ( (lv_value_14_0= rulePositiveInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1285:7: ( (lv_key_12_0= 'totalDigits' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1286:1: (lv_key_12_0= 'totalDigits' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1286:1: (lv_key_12_0= 'totalDigits' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1287:3: lv_key_12_0= 'totalDigits'
                    {
                    lv_key_12_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDataTypeAnnotation2570); 

                            newLeafNode(lv_key_12_0, grammarAccess.getDataTypeAnnotationAccess().getKeyTotalDigitsKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_12_0, "totalDigits");
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypeAnnotation2595); 

                        	newLeafNode(otherlv_13, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_4_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1304:1: ( (lv_value_14_0= rulePositiveInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1305:1: (lv_value_14_0= rulePositiveInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1305:1: (lv_value_14_0= rulePositiveInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1306:3: lv_value_14_0= rulePositiveInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValuePositiveIntegerParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2616);
                    lv_value_14_0=rulePositiveInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_14_0, 
                            		"PositiveInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1323:6: ( ( (lv_key_15_0= 'fractionDigits' ) ) otherlv_16= '=' ( (lv_value_17_0= rulePositiveInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1323:6: ( ( (lv_key_15_0= 'fractionDigits' ) ) otherlv_16= '=' ( (lv_value_17_0= rulePositiveInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1323:7: ( (lv_key_15_0= 'fractionDigits' ) ) otherlv_16= '=' ( (lv_value_17_0= rulePositiveInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1323:7: ( (lv_key_15_0= 'fractionDigits' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1324:1: (lv_key_15_0= 'fractionDigits' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1324:1: (lv_key_15_0= 'fractionDigits' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1325:3: lv_key_15_0= 'fractionDigits'
                    {
                    lv_key_15_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDataTypeAnnotation2642); 

                            newLeafNode(lv_key_15_0, grammarAccess.getDataTypeAnnotationAccess().getKeyFractionDigitsKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_15_0, "fractionDigits");
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypeAnnotation2667); 

                        	newLeafNode(otherlv_16, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_5_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1342:1: ( (lv_value_17_0= rulePositiveInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1343:1: (lv_value_17_0= rulePositiveInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1343:1: (lv_value_17_0= rulePositiveInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1344:3: lv_value_17_0= rulePositiveInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValuePositiveIntegerParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2688);
                    lv_value_17_0=rulePositiveInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_17_0, 
                            		"PositiveInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1361:6: ( ( (lv_key_18_0= 'length' ) ) otherlv_19= '=' ( (lv_value_20_0= rulePositiveInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1361:6: ( ( (lv_key_18_0= 'length' ) ) otherlv_19= '=' ( (lv_value_20_0= rulePositiveInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1361:7: ( (lv_key_18_0= 'length' ) ) otherlv_19= '=' ( (lv_value_20_0= rulePositiveInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1361:7: ( (lv_key_18_0= 'length' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1362:1: (lv_key_18_0= 'length' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1362:1: (lv_key_18_0= 'length' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1363:3: lv_key_18_0= 'length'
                    {
                    lv_key_18_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDataTypeAnnotation2714); 

                            newLeafNode(lv_key_18_0, grammarAccess.getDataTypeAnnotationAccess().getKeyLengthKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_18_0, "length");
                    	    

                    }


                    }

                    otherlv_19=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypeAnnotation2739); 

                        	newLeafNode(otherlv_19, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_6_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1380:1: ( (lv_value_20_0= rulePositiveInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1381:1: (lv_value_20_0= rulePositiveInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1381:1: (lv_value_20_0= rulePositiveInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1382:3: lv_value_20_0= rulePositiveInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValuePositiveIntegerParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2760);
                    lv_value_20_0=rulePositiveInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_20_0, 
                            		"PositiveInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1399:6: ( ( (lv_key_21_0= 'minLength' ) ) otherlv_22= '=' ( (lv_value_23_0= rulePositiveInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1399:6: ( ( (lv_key_21_0= 'minLength' ) ) otherlv_22= '=' ( (lv_value_23_0= rulePositiveInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1399:7: ( (lv_key_21_0= 'minLength' ) ) otherlv_22= '=' ( (lv_value_23_0= rulePositiveInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1399:7: ( (lv_key_21_0= 'minLength' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1400:1: (lv_key_21_0= 'minLength' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1400:1: (lv_key_21_0= 'minLength' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1401:3: lv_key_21_0= 'minLength'
                    {
                    lv_key_21_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDataTypeAnnotation2786); 

                            newLeafNode(lv_key_21_0, grammarAccess.getDataTypeAnnotationAccess().getKeyMinLengthKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_21_0, "minLength");
                    	    

                    }


                    }

                    otherlv_22=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypeAnnotation2811); 

                        	newLeafNode(otherlv_22, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_7_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1418:1: ( (lv_value_23_0= rulePositiveInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1419:1: (lv_value_23_0= rulePositiveInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1419:1: (lv_value_23_0= rulePositiveInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1420:3: lv_value_23_0= rulePositiveInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValuePositiveIntegerParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2832);
                    lv_value_23_0=rulePositiveInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_23_0, 
                            		"PositiveInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1437:6: ( ( (lv_key_24_0= 'maxLength' ) ) otherlv_25= '=' ( (lv_value_26_0= rulePositiveInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1437:6: ( ( (lv_key_24_0= 'maxLength' ) ) otherlv_25= '=' ( (lv_value_26_0= rulePositiveInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1437:7: ( (lv_key_24_0= 'maxLength' ) ) otherlv_25= '=' ( (lv_value_26_0= rulePositiveInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1437:7: ( (lv_key_24_0= 'maxLength' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1438:1: (lv_key_24_0= 'maxLength' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1438:1: (lv_key_24_0= 'maxLength' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1439:3: lv_key_24_0= 'maxLength'
                    {
                    lv_key_24_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDataTypeAnnotation2858); 

                            newLeafNode(lv_key_24_0, grammarAccess.getDataTypeAnnotationAccess().getKeyMaxLengthKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_24_0, "maxLength");
                    	    

                    }


                    }

                    otherlv_25=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypeAnnotation2883); 

                        	newLeafNode(otherlv_25, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_8_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1456:1: ( (lv_value_26_0= rulePositiveInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1457:1: (lv_value_26_0= rulePositiveInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1457:1: (lv_value_26_0= rulePositiveInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1458:3: lv_value_26_0= rulePositiveInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValuePositiveIntegerParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2904);
                    lv_value_26_0=rulePositiveInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_26_0, 
                            		"PositiveInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1475:6: ( ( (lv_key_27_0= 'whiteSpace' ) ) otherlv_28= '=' ( (lv_value_29_0= RULE_STRING ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1475:6: ( ( (lv_key_27_0= 'whiteSpace' ) ) otherlv_28= '=' ( (lv_value_29_0= RULE_STRING ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1475:7: ( (lv_key_27_0= 'whiteSpace' ) ) otherlv_28= '=' ( (lv_value_29_0= RULE_STRING ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1475:7: ( (lv_key_27_0= 'whiteSpace' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1476:1: (lv_key_27_0= 'whiteSpace' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1476:1: (lv_key_27_0= 'whiteSpace' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1477:3: lv_key_27_0= 'whiteSpace'
                    {
                    lv_key_27_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDataTypeAnnotation2930); 

                            newLeafNode(lv_key_27_0, grammarAccess.getDataTypeAnnotationAccess().getKeyWhiteSpaceKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_27_0, "whiteSpace");
                    	    

                    }


                    }

                    otherlv_28=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypeAnnotation2955); 

                        	newLeafNode(otherlv_28, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_9_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1494:1: ( (lv_value_29_0= RULE_STRING ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1495:1: (lv_value_29_0= RULE_STRING )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1495:1: (lv_value_29_0= RULE_STRING )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1496:3: lv_value_29_0= RULE_STRING
                    {
                    lv_value_29_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDataTypeAnnotation2972); 

                    			newLeafNode(lv_value_29_0, grammarAccess.getDataTypeAnnotationAccess().getValueSTRINGTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_29_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1513:6: ( ( (lv_key_30_0= 'pattern' ) ) otherlv_31= '=' ( (lv_value_32_0= RULE_STRING ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1513:6: ( ( (lv_key_30_0= 'pattern' ) ) otherlv_31= '=' ( (lv_value_32_0= RULE_STRING ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1513:7: ( (lv_key_30_0= 'pattern' ) ) otherlv_31= '=' ( (lv_value_32_0= RULE_STRING ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1513:7: ( (lv_key_30_0= 'pattern' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1514:1: (lv_key_30_0= 'pattern' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1514:1: (lv_key_30_0= 'pattern' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1515:3: lv_key_30_0= 'pattern'
                    {
                    lv_key_30_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleDataTypeAnnotation3003); 

                            newLeafNode(lv_key_30_0, grammarAccess.getDataTypeAnnotationAccess().getKeyPatternKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_30_0, "pattern");
                    	    

                    }


                    }

                    otherlv_31=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypeAnnotation3028); 

                        	newLeafNode(otherlv_31, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_10_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1532:1: ( (lv_value_32_0= RULE_STRING ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1533:1: (lv_value_32_0= RULE_STRING )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1533:1: (lv_value_32_0= RULE_STRING )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1534:3: lv_value_32_0= RULE_STRING
                    {
                    lv_value_32_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDataTypeAnnotation3045); 

                    			newLeafNode(lv_value_32_0, grammarAccess.getDataTypeAnnotationAccess().getValueSTRINGTerminalRuleCall_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_32_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


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
    // $ANTLR end "ruleDataTypeAnnotation"


    // $ANTLR start "entryRuleEnumTypeDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1558:1: entryRuleEnumTypeDecl returns [EObject current=null] : iv_ruleEnumTypeDecl= ruleEnumTypeDecl EOF ;
    public final EObject entryRuleEnumTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1559:2: (iv_ruleEnumTypeDecl= ruleEnumTypeDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1560:2: iv_ruleEnumTypeDecl= ruleEnumTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumTypeDecl_in_entryRuleEnumTypeDecl3087);
            iv_ruleEnumTypeDecl=ruleEnumTypeDecl();

            state._fsp--;

             current =iv_ruleEnumTypeDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumTypeDecl3097); 

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
    // $ANTLR end "entryRuleEnumTypeDecl"


    // $ANTLR start "ruleEnumTypeDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1567:1: ruleEnumTypeDecl returns [EObject current=null] : ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eLiterals_4_0= ruleEnumLiteralDecl ) ) (otherlv_5= ',' ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleEnumTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_eLiterals_4_0 = null;

        EObject lv_eLiterals_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1570:28: ( ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eLiterals_4_0= ruleEnumLiteralDecl ) ) (otherlv_5= ',' ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) ) )* otherlv_7= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1571:1: ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eLiterals_4_0= ruleEnumLiteralDecl ) ) (otherlv_5= ',' ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) ) )* otherlv_7= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1571:1: ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eLiterals_4_0= ruleEnumLiteralDecl ) ) (otherlv_5= ',' ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) ) )* otherlv_7= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1571:2: () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eLiterals_4_0= ruleEnumLiteralDecl ) ) (otherlv_5= ',' ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) ) )* otherlv_7= '}'
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1571:2: ()
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1572:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEnumTypeDeclAccess().getEEnumAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEnumTypeDecl3143); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumTypeDeclAccess().getEnumKeyword_1());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1581:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1582:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1582:1: (lv_name_2_0= RULE_ID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1583:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumTypeDecl3160); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEnumTypeDeclAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEnumTypeDecl3177); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumTypeDeclAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1603:1: ( (lv_eLiterals_4_0= ruleEnumLiteralDecl ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1604:1: (lv_eLiterals_4_0= ruleEnumLiteralDecl )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1604:1: (lv_eLiterals_4_0= ruleEnumLiteralDecl )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1605:3: lv_eLiterals_4_0= ruleEnumLiteralDecl
            {
             
            	        newCompositeNode(grammarAccess.getEnumTypeDeclAccess().getELiteralsEnumLiteralDeclParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDecl_in_ruleEnumTypeDecl3198);
            lv_eLiterals_4_0=ruleEnumLiteralDecl();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumTypeDeclRule());
            	        }
                   		add(
                   			current, 
                   			"eLiterals",
                    		lv_eLiterals_4_0, 
                    		"EnumLiteralDecl");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1621:2: (otherlv_5= ',' ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==23) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1621:4: otherlv_5= ',' ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEnumTypeDecl3211); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEnumTypeDeclAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1625:1: ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1626:1: (lv_eLiterals_6_0= ruleEnumLiteralDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1626:1: (lv_eLiterals_6_0= ruleEnumLiteralDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1627:3: lv_eLiterals_6_0= ruleEnumLiteralDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumTypeDeclAccess().getELiteralsEnumLiteralDeclParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDecl_in_ruleEnumTypeDecl3232);
            	    lv_eLiterals_6_0=ruleEnumLiteralDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumTypeDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"eLiterals",
            	            		lv_eLiterals_6_0, 
            	            		"EnumLiteralDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEnumTypeDecl3246); 

                	newLeafNode(otherlv_7, grammarAccess.getEnumTypeDeclAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleEnumTypeDecl"


    // $ANTLR start "entryRuleEnumLiteralDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1655:1: entryRuleEnumLiteralDecl returns [EObject current=null] : iv_ruleEnumLiteralDecl= ruleEnumLiteralDecl EOF ;
    public final EObject entryRuleEnumLiteralDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1656:2: (iv_ruleEnumLiteralDecl= ruleEnumLiteralDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1657:2: iv_ruleEnumLiteralDecl= ruleEnumLiteralDecl EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDecl_in_entryRuleEnumLiteralDecl3282);
            iv_ruleEnumLiteralDecl=ruleEnumLiteralDecl();

            state._fsp--;

             current =iv_ruleEnumLiteralDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumLiteralDecl3292); 

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
    // $ANTLR end "entryRuleEnumLiteralDecl"


    // $ANTLR start "ruleEnumLiteralDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1664:1: ruleEnumLiteralDecl returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumLiteralDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1667:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1668:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1668:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1668:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1668:2: ()
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1669:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEnumLiteralDeclAccess().getEEnumLiteralAction_0(),
                        current);
                

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1674:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1675:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1675:1: (lv_name_1_0= RULE_ID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1676:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumLiteralDecl3343); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumLiteralDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumLiteralDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleEnumLiteralDecl"


    // $ANTLR start "entryRuleConfigurationDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1700:1: entryRuleConfigurationDecl returns [EObject current=null] : iv_ruleConfigurationDecl= ruleConfigurationDecl EOF ;
    public final EObject entryRuleConfigurationDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1701:2: (iv_ruleConfigurationDecl= ruleConfigurationDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1702:2: iv_ruleConfigurationDecl= ruleConfigurationDecl EOF
            {
             newCompositeNode(grammarAccess.getConfigurationDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfigurationDecl_in_entryRuleConfigurationDecl3384);
            iv_ruleConfigurationDecl=ruleConfigurationDecl();

            state._fsp--;

             current =iv_ruleConfigurationDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfigurationDecl3394); 

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
    // $ANTLR end "entryRuleConfigurationDecl"


    // $ANTLR start "ruleConfigurationDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1709:1: ruleConfigurationDecl returns [EObject current=null] : ( () otherlv_1= 'configuration' (otherlv_2= 'use' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'as' this_ID_5= RULE_ID )? )* ( (lv_resources_6_0= ruleResourceDecl ) )* ) ;
    public final EObject ruleConfigurationDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_ID_5=null;
        EObject lv_resources_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1712:28: ( ( () otherlv_1= 'configuration' (otherlv_2= 'use' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'as' this_ID_5= RULE_ID )? )* ( (lv_resources_6_0= ruleResourceDecl ) )* ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1713:1: ( () otherlv_1= 'configuration' (otherlv_2= 'use' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'as' this_ID_5= RULE_ID )? )* ( (lv_resources_6_0= ruleResourceDecl ) )* )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1713:1: ( () otherlv_1= 'configuration' (otherlv_2= 'use' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'as' this_ID_5= RULE_ID )? )* ( (lv_resources_6_0= ruleResourceDecl ) )* )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1713:2: () otherlv_1= 'configuration' (otherlv_2= 'use' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'as' this_ID_5= RULE_ID )? )* ( (lv_resources_6_0= ruleResourceDecl ) )*
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1713:2: ()
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1714:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConfigurationDeclAccess().getConfigurationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleConfigurationDecl3440); 

                	newLeafNode(otherlv_1, grammarAccess.getConfigurationDeclAccess().getConfigurationKeyword_1());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1723:1: (otherlv_2= 'use' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'as' this_ID_5= RULE_ID )? )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==49) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1723:3: otherlv_2= 'use' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'as' this_ID_5= RULE_ID )?
            	    {
            	    otherlv_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleConfigurationDecl3453); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConfigurationDeclAccess().getUseKeyword_2_0());
            	        
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1727:1: ( (otherlv_3= RULE_STRING ) )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1728:1: (otherlv_3= RULE_STRING )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1728:1: (otherlv_3= RULE_STRING )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1729:3: otherlv_3= RULE_STRING
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getConfigurationDeclRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleConfigurationDecl3473); 

            	    		newLeafNode(otherlv_3, grammarAccess.getConfigurationDeclAccess().getUseExtensionCrossReference_2_1_0()); 
            	    	

            	    }


            	    }

            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1740:2: (otherlv_4= 'as' this_ID_5= RULE_ID )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==15) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1740:4: otherlv_4= 'as' this_ID_5= RULE_ID
            	            {
            	            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConfigurationDecl3486); 

            	                	newLeafNode(otherlv_4, grammarAccess.getConfigurationDeclAccess().getAsKeyword_2_2_0());
            	                
            	            this_ID_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConfigurationDecl3497); 
            	             
            	                newLeafNode(this_ID_5, grammarAccess.getConfigurationDeclAccess().getIDTerminalRuleCall_2_2_1()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1748:5: ( (lv_resources_6_0= ruleResourceDecl ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==50) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1749:1: (lv_resources_6_0= ruleResourceDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1749:1: (lv_resources_6_0= ruleResourceDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1750:3: lv_resources_6_0= ruleResourceDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConfigurationDeclAccess().getResourcesResourceDeclParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleResourceDecl_in_ruleConfigurationDecl3521);
            	    lv_resources_6_0=ruleResourceDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConfigurationDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_6_0, 
            	            		"ResourceDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // $ANTLR end "ruleConfigurationDecl"


    // $ANTLR start "entryRuleResourceDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1774:1: entryRuleResourceDecl returns [EObject current=null] : iv_ruleResourceDecl= ruleResourceDecl EOF ;
    public final EObject entryRuleResourceDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1775:2: (iv_ruleResourceDecl= ruleResourceDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1776:2: iv_ruleResourceDecl= ruleResourceDecl EOF
            {
             newCompositeNode(grammarAccess.getResourceDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResourceDecl_in_entryRuleResourceDecl3558);
            iv_ruleResourceDecl=ruleResourceDecl();

            state._fsp--;

             current =iv_ruleResourceDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResourceDecl3568); 

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
    // $ANTLR end "entryRuleResourceDecl"


    // $ANTLR start "ruleResourceDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1783:1: ruleResourceDecl returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= '{' ( (lv_attributes_9_0= ruleStateDecl ) )* ( (lv_links_10_0= ruleLinkDecl ) )* otherlv_11= '}' ) ;
    public final EObject ruleResourceDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_attributes_9_0 = null;

        EObject lv_links_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1786:28: ( (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= '{' ( (lv_attributes_9_0= ruleStateDecl ) )* ( (lv_links_10_0= ruleLinkDecl ) )* otherlv_11= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1787:1: (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= '{' ( (lv_attributes_9_0= ruleStateDecl ) )* ( (lv_links_10_0= ruleLinkDecl ) )* otherlv_11= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1787:1: (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= '{' ( (lv_attributes_9_0= ruleStateDecl ) )* ( (lv_links_10_0= ruleLinkDecl ) )* otherlv_11= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1787:3: otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= '{' ( (lv_attributes_9_0= ruleStateDecl ) )* ( (lv_links_10_0= ruleLinkDecl ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleResourceDecl3605); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceDeclAccess().getResourceKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1791:1: ( (lv_id_1_0= RULE_STRING ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1792:1: (lv_id_1_0= RULE_STRING )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1792:1: (lv_id_1_0= RULE_STRING )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1793:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleResourceDecl3622); 

            			newLeafNode(lv_id_1_0, grammarAccess.getResourceDeclAccess().getIdSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleResourceDecl3639); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceDeclAccess().getColonKeyword_2());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1813:1: ( ( ruleQualifiedID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1814:1: ( ruleQualifiedID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1814:1: ( ruleQualifiedID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1815:3: ruleQualifiedID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceDeclRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getResourceDeclAccess().getKindKindCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleResourceDecl3662);
            ruleQualifiedID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1828:2: (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1828:4: otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )*
                    {
                    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleResourceDecl3675); 

                        	newLeafNode(otherlv_4, grammarAccess.getResourceDeclAccess().getMixinsKeyword_4_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1832:1: ( ( ruleQualifiedID ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1833:1: ( ruleQualifiedID )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1833:1: ( ruleQualifiedID )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1834:3: ruleQualifiedID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceDeclRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getResourceDeclAccess().getMixinsMixinCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleResourceDecl3698);
                    ruleQualifiedID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1847:2: (otherlv_6= ',' ( ( ruleQualifiedID ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==23) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1847:4: otherlv_6= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleResourceDecl3711); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getResourceDeclAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1851:1: ( ( ruleQualifiedID ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1852:1: ( ruleQualifiedID )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1852:1: ( ruleQualifiedID )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1853:3: ruleQualifiedID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getResourceDeclRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getResourceDeclAccess().getMixinsMixinCrossReference_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleResourceDecl3734);
                    	    ruleQualifiedID();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleResourceDecl3750); 

                	newLeafNode(otherlv_8, grammarAccess.getResourceDeclAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1870:1: ( (lv_attributes_9_0= ruleStateDecl ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==52) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1871:1: (lv_attributes_9_0= ruleStateDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1871:1: (lv_attributes_9_0= ruleStateDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1872:3: lv_attributes_9_0= ruleStateDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceDeclAccess().getAttributesStateDeclParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleStateDecl_in_ruleResourceDecl3771);
            	    lv_attributes_9_0=ruleStateDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getResourceDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_9_0, 
            	            		"StateDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1888:3: ( (lv_links_10_0= ruleLinkDecl ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==53) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1889:1: (lv_links_10_0= ruleLinkDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1889:1: (lv_links_10_0= ruleLinkDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1890:3: lv_links_10_0= ruleLinkDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceDeclAccess().getLinksLinkDeclParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLinkDecl_in_ruleResourceDecl3793);
            	    lv_links_10_0=ruleLinkDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getResourceDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"links",
            	            		lv_links_10_0, 
            	            		"LinkDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleResourceDecl3806); 

                	newLeafNode(otherlv_11, grammarAccess.getResourceDeclAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleResourceDecl"


    // $ANTLR start "entryRuleStateDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1918:1: entryRuleStateDecl returns [EObject current=null] : iv_ruleStateDecl= ruleStateDecl EOF ;
    public final EObject entryRuleStateDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1919:2: (iv_ruleStateDecl= ruleStateDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1920:2: iv_ruleStateDecl= ruleStateDecl EOF
            {
             newCompositeNode(grammarAccess.getStateDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateDecl_in_entryRuleStateDecl3842);
            iv_ruleStateDecl=ruleStateDecl();

            state._fsp--;

             current =iv_ruleStateDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateDecl3852); 

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
    // $ANTLR end "entryRuleStateDecl"


    // $ANTLR start "ruleStateDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1927:1: ruleStateDecl returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleStateDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1930:28: ( (otherlv_0= 'state' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1931:1: (otherlv_0= 'state' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1931:1: (otherlv_0= 'state' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1931:3: otherlv_0= 'state' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleStateDecl3889); 

                	newLeafNode(otherlv_0, grammarAccess.getStateDeclAccess().getStateKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1935:1: ( (lv_name_1_0= ruleQualifiedID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1936:1: (lv_name_1_0= ruleQualifiedID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1936:1: (lv_name_1_0= ruleQualifiedID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1937:3: lv_name_1_0= ruleQualifiedID
            {
             
            	        newCompositeNode(grammarAccess.getStateDeclAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleStateDecl3910);
            lv_name_1_0=ruleQualifiedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateDeclRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleStateDecl3922); 

                	newLeafNode(otherlv_2, grammarAccess.getStateDeclAccess().getEqualsSignKeyword_2());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1957:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1958:1: (lv_value_3_0= RULE_STRING )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1958:1: (lv_value_3_0= RULE_STRING )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1959:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStateDecl3939); 

            			newLeafNode(lv_value_3_0, grammarAccess.getStateDeclAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStateDecl"


    // $ANTLR start "entryRuleLinkDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1983:1: entryRuleLinkDecl returns [EObject current=null] : iv_ruleLinkDecl= ruleLinkDecl EOF ;
    public final EObject entryRuleLinkDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1984:2: (iv_ruleLinkDecl= ruleLinkDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1985:2: iv_ruleLinkDecl= ruleLinkDecl EOF
            {
             newCompositeNode(grammarAccess.getLinkDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinkDecl_in_entryRuleLinkDecl3980);
            iv_ruleLinkDecl=ruleLinkDecl();

            state._fsp--;

             current =iv_ruleLinkDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLinkDecl3990); 

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
    // $ANTLR end "entryRuleLinkDecl"


    // $ANTLR start "ruleLinkDecl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1992:1: ruleLinkDecl returns [EObject current=null] : (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) otherlv_10= '{' ( (lv_attributes_11_0= ruleStateDecl ) )* otherlv_12= '}' ) ;
    public final EObject ruleLinkDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_attributes_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1995:28: ( (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) otherlv_10= '{' ( (lv_attributes_11_0= ruleStateDecl ) )* otherlv_12= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1996:1: (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) otherlv_10= '{' ( (lv_attributes_11_0= ruleStateDecl ) )* otherlv_12= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1996:1: (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) otherlv_10= '{' ( (lv_attributes_11_0= ruleStateDecl ) )* otherlv_12= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1996:3: otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) otherlv_10= '{' ( (lv_attributes_11_0= ruleStateDecl ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleLinkDecl4027); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkDeclAccess().getLinkKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2000:1: ( (lv_id_1_0= RULE_STRING ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2001:1: (lv_id_1_0= RULE_STRING )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2001:1: (lv_id_1_0= RULE_STRING )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2002:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLinkDecl4044); 

            			newLeafNode(lv_id_1_0, grammarAccess.getLinkDeclAccess().getIdSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLinkDecl4061); 

                	newLeafNode(otherlv_2, grammarAccess.getLinkDeclAccess().getColonKeyword_2());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2022:1: ( ( ruleQualifiedID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2023:1: ( ruleQualifiedID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2023:1: ( ruleQualifiedID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2024:3: ruleQualifiedID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkDeclRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLinkDeclAccess().getKindKindCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleLinkDecl4084);
            ruleQualifiedID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2037:2: (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==51) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2037:4: otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )*
                    {
                    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleLinkDecl4097); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinkDeclAccess().getMixinsKeyword_4_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2041:1: ( ( ruleQualifiedID ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2042:1: ( ruleQualifiedID )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2042:1: ( ruleQualifiedID )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2043:3: ruleQualifiedID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkDeclRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkDeclAccess().getMixinsMixinCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleLinkDecl4120);
                    ruleQualifiedID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2056:2: (otherlv_6= ',' ( ( ruleQualifiedID ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==23) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2056:4: otherlv_6= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLinkDecl4133); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getLinkDeclAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2060:1: ( ( ruleQualifiedID ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2061:1: ( ruleQualifiedID )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2061:1: ( ruleQualifiedID )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2062:3: ruleQualifiedID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getLinkDeclRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getLinkDeclAccess().getMixinsMixinCrossReference_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleLinkDecl4156);
                    	    ruleQualifiedID();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleLinkDecl4172); 

                	newLeafNode(otherlv_8, grammarAccess.getLinkDeclAccess().getTargetKeyword_5());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2079:1: ( (otherlv_9= RULE_STRING ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2080:1: (otherlv_9= RULE_STRING )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2080:1: (otherlv_9= RULE_STRING )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2081:3: otherlv_9= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkDeclRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLinkDecl4192); 

            		newLeafNode(otherlv_9, grammarAccess.getLinkDeclAccess().getTargetResourceCrossReference_6_0()); 
            	

            }


            }

            otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLinkDecl4204); 

                	newLeafNode(otherlv_10, grammarAccess.getLinkDeclAccess().getLeftCurlyBracketKeyword_7());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2096:1: ( (lv_attributes_11_0= ruleStateDecl ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==52) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2097:1: (lv_attributes_11_0= ruleStateDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2097:1: (lv_attributes_11_0= ruleStateDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2098:3: lv_attributes_11_0= ruleStateDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkDeclAccess().getAttributesStateDeclParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleStateDecl_in_ruleLinkDecl4225);
            	    lv_attributes_11_0=ruleStateDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_11_0, 
            	            		"StateDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLinkDecl4238); 

                	newLeafNode(otherlv_12, grammarAccess.getLinkDeclAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleLinkDecl"


    // $ANTLR start "entryRuleQualifiedID"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2126:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2127:2: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2128:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID4275);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;

             current =iv_ruleQualifiedID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedID4286); 

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
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2135:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_QUALIFIED_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2138:28: ( (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2139:1: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2139:1: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_QUALIFIED_ID) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2139:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedID4326); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2147:10: this_QUALIFIED_ID_1= RULE_QUALIFIED_ID
                    {
                    this_QUALIFIED_ID_1=(Token)match(input,RULE_QUALIFIED_ID,FollowSets000.FOLLOW_RULE_QUALIFIED_ID_in_ruleQualifiedID4352); 

                    		current.merge(this_QUALIFIED_ID_1);
                        
                     
                        newLeafNode(this_QUALIFIED_ID_1, grammarAccess.getQualifiedIDAccess().getQUALIFIED_IDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleQualifiedID"


    // $ANTLR start "entryRuleInteger"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2162:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2163:2: (iv_ruleInteger= ruleInteger EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2164:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger4398);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger4409); 

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2171:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2174:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2175:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2175:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2175:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2175:2: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==55) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2176:2: kw= '-'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleInteger4448); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInteger4465); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRulePositiveInteger"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2196:1: entryRulePositiveInteger returns [String current=null] : iv_rulePositiveInteger= rulePositiveInteger EOF ;
    public final String entryRulePositiveInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePositiveInteger = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2197:2: (iv_rulePositiveInteger= rulePositiveInteger EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2198:2: iv_rulePositiveInteger= rulePositiveInteger EOF
            {
             newCompositeNode(grammarAccess.getPositiveIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_entryRulePositiveInteger4511);
            iv_rulePositiveInteger=rulePositiveInteger();

            state._fsp--;

             current =iv_rulePositiveInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePositiveInteger4522); 

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
    // $ANTLR end "entryRulePositiveInteger"


    // $ANTLR start "rulePositiveInteger"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2205:1: rulePositiveInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken rulePositiveInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2208:28: (this_INT_0= RULE_INT )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2209:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulePositiveInteger4561); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getPositiveIntegerAccess().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "rulePositiveInteger"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGrammar_in_entryRuleGrammar75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrammar85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtensionDecl_in_ruleGrammar132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfigurationDecl_in_ruleGrammar159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtensionDecl_in_entryRuleExtensionDecl194 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtensionDecl204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleExtensionDecl241 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtensionDecl258 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleExtensionDecl275 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExtensionDecl292 = new BitSet(new long[]{0x0000800800214002L});
        public static final BitSet FOLLOW_14_in_ruleExtensionDecl310 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExtensionDecl330 = new BitSet(new long[]{0x000080080021C002L});
        public static final BitSet FOLLOW_15_in_ruleExtensionDecl343 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtensionDecl354 = new BitSet(new long[]{0x0000800800214002L});
        public static final BitSet FOLLOW_ruleKindDecl_in_ruleExtensionDecl379 = new BitSet(new long[]{0x0000800800210002L});
        public static final BitSet FOLLOW_ruleMixinDecl_in_ruleExtensionDecl406 = new BitSet(new long[]{0x0000800800210002L});
        public static final BitSet FOLLOW_ruleDataTypeDecl_in_ruleExtensionDecl433 = new BitSet(new long[]{0x0000800800210002L});
        public static final BitSet FOLLOW_ruleEnumTypeDecl_in_ruleExtensionDecl460 = new BitSet(new long[]{0x0000800800210002L});
        public static final BitSet FOLLOW_ruleKindDecl_in_entryRuleKindDecl498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKindDecl508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleKindDecl545 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKindDecl562 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleKindDecl580 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleKindDecl603 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleKindDecl617 = new BitSet(new long[]{0x0000000104180000L});
        public static final BitSet FOLLOW_19_in_ruleKindDecl630 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleKindDecl647 = new BitSet(new long[]{0x0000000104100000L});
        public static final BitSet FOLLOW_ruleAttributeDecl_in_ruleKindDecl676 = new BitSet(new long[]{0x0000000104100000L});
        public static final BitSet FOLLOW_ruleActionDecl_in_ruleKindDecl703 = new BitSet(new long[]{0x0000000104100000L});
        public static final BitSet FOLLOW_20_in_ruleKindDecl717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixinDecl_in_entryRuleMixinDecl753 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMixinDecl763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleMixinDecl800 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMixinDecl817 = new BitSet(new long[]{0x0000000001440000L});
        public static final BitSet FOLLOW_22_in_ruleMixinDecl835 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMixinDecl858 = new BitSet(new long[]{0x0000000001840000L});
        public static final BitSet FOLLOW_23_in_ruleMixinDecl871 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMixinDecl894 = new BitSet(new long[]{0x0000000001840000L});
        public static final BitSet FOLLOW_24_in_ruleMixinDecl911 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMixinDecl934 = new BitSet(new long[]{0x0000000000840000L});
        public static final BitSet FOLLOW_23_in_ruleMixinDecl947 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMixinDecl970 = new BitSet(new long[]{0x0000000000840000L});
        public static final BitSet FOLLOW_18_in_ruleMixinDecl986 = new BitSet(new long[]{0x0000000106180000L});
        public static final BitSet FOLLOW_25_in_ruleMixinDecl999 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMixinDecl1016 = new BitSet(new long[]{0x0000000104180000L});
        public static final BitSet FOLLOW_19_in_ruleMixinDecl1036 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMixinDecl1053 = new BitSet(new long[]{0x0000000104100000L});
        public static final BitSet FOLLOW_ruleAttributeDecl_in_ruleMixinDecl1082 = new BitSet(new long[]{0x0000000104100000L});
        public static final BitSet FOLLOW_ruleActionDecl_in_ruleMixinDecl1109 = new BitSet(new long[]{0x0000000104100000L});
        public static final BitSet FOLLOW_20_in_ruleMixinDecl1123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeDecl_in_entryRuleAttributeDecl1159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDecl1169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleAttributeDecl1206 = new BitSet(new long[]{0x0000000018000050L});
        public static final BitSet FOLLOW_27_in_ruleAttributeDecl1224 = new BitSet(new long[]{0x0000000010000050L});
        public static final BitSet FOLLOW_28_in_ruleAttributeDecl1256 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleAttributeDecl1291 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAttributeDecl1303 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleAttributeDecl1326 = new BitSet(new long[]{0x0000000060040002L});
        public static final BitSet FOLLOW_29_in_ruleAttributeDecl1344 = new BitSet(new long[]{0x0000000040040002L});
        public static final BitSet FOLLOW_30_in_ruleAttributeDecl1371 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeDecl1388 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleAttributeDecl1408 = new BitSet(new long[]{0x0000000080100000L});
        public static final BitSet FOLLOW_31_in_ruleAttributeDecl1421 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeDecl1438 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAttributeDecl1457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActionDecl_in_entryRuleActionDecl1495 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActionDecl1505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleActionDecl1542 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleActionDecl1559 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleActionDecl1576 = new BitSet(new long[]{0x0000000400000050L});
        public static final BitSet FOLLOW_ruleParameterDecl_in_ruleActionDecl1598 = new BitSet(new long[]{0x0000000400800000L});
        public static final BitSet FOLLOW_23_in_ruleActionDecl1611 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleParameterDecl_in_ruleActionDecl1632 = new BitSet(new long[]{0x0000000400800000L});
        public static final BitSet FOLLOW_34_in_ruleActionDecl1648 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleActionDecl1661 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleActionDecl1673 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleActionDecl1690 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleActionDecl1707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterDecl_in_entryRuleParameterDecl1745 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterDecl1755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleParameterDecl1801 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleParameterDecl1813 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleParameterDecl1836 = new BitSet(new long[]{0x0000000060000002L});
        public static final BitSet FOLLOW_29_in_ruleParameterDecl1854 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleParameterDecl1881 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleParameterDecl1898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataTypeDecl_in_entryRuleDataTypeDecl1941 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeDecl1951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleDataTypeDecl1997 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeDecl2014 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDataTypeDecl2031 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDataTypeDecl2048 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleDataTypeDecl2066 = new BitSet(new long[]{0x00007FF000000000L});
        public static final BitSet FOLLOW_ruleDataTypeAnnotations_in_ruleDataTypeDecl2087 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleDataTypeDecl2099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataTypeAnnotations_in_entryRuleDataTypeAnnotations2137 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeAnnotations2147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataTypeAnnotation_in_ruleDataTypeAnnotations2192 = new BitSet(new long[]{0x00007FF000000002L});
        public static final BitSet FOLLOW_ruleDataTypeAnnotation_in_entryRuleDataTypeAnnotation2228 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeAnnotation2238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleDataTypeAnnotation2282 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDataTypeAnnotation2307 = new BitSet(new long[]{0x0080000000000080L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleDataTypeAnnotation2354 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDataTypeAnnotation2379 = new BitSet(new long[]{0x0080000000000080L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleDataTypeAnnotation2426 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDataTypeAnnotation2451 = new BitSet(new long[]{0x0080000000000080L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleDataTypeAnnotation2498 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDataTypeAnnotation2523 = new BitSet(new long[]{0x0080000000000080L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleDataTypeAnnotation2570 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDataTypeAnnotation2595 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleDataTypeAnnotation2642 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDataTypeAnnotation2667 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleDataTypeAnnotation2714 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDataTypeAnnotation2739 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleDataTypeAnnotation2786 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDataTypeAnnotation2811 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleDataTypeAnnotation2858 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDataTypeAnnotation2883 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleDataTypeAnnotation2930 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDataTypeAnnotation2955 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDataTypeAnnotation2972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleDataTypeAnnotation3003 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDataTypeAnnotation3028 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDataTypeAnnotation3045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumTypeDecl_in_entryRuleEnumTypeDecl3087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeDecl3097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEnumTypeDecl3143 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumTypeDecl3160 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEnumTypeDecl3177 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumLiteralDecl_in_ruleEnumTypeDecl3198 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_23_in_ruleEnumTypeDecl3211 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumLiteralDecl_in_ruleEnumTypeDecl3232 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_20_in_ruleEnumTypeDecl3246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiteralDecl_in_entryRuleEnumLiteralDecl3282 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteralDecl3292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteralDecl3343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfigurationDecl_in_entryRuleConfigurationDecl3384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationDecl3394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleConfigurationDecl3440 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_49_in_ruleConfigurationDecl3453 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleConfigurationDecl3473 = new BitSet(new long[]{0x0006000000008002L});
        public static final BitSet FOLLOW_15_in_ruleConfigurationDecl3486 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConfigurationDecl3497 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_ruleResourceDecl_in_ruleConfigurationDecl3521 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleResourceDecl_in_entryRuleResourceDecl3558 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResourceDecl3568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleResourceDecl3605 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceDecl3622 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleResourceDecl3639 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleResourceDecl3662 = new BitSet(new long[]{0x0008000000040000L});
        public static final BitSet FOLLOW_51_in_ruleResourceDecl3675 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleResourceDecl3698 = new BitSet(new long[]{0x0000000000840000L});
        public static final BitSet FOLLOW_23_in_ruleResourceDecl3711 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleResourceDecl3734 = new BitSet(new long[]{0x0000000000840000L});
        public static final BitSet FOLLOW_18_in_ruleResourceDecl3750 = new BitSet(new long[]{0x0030000000100000L});
        public static final BitSet FOLLOW_ruleStateDecl_in_ruleResourceDecl3771 = new BitSet(new long[]{0x0030000000100000L});
        public static final BitSet FOLLOW_ruleLinkDecl_in_ruleResourceDecl3793 = new BitSet(new long[]{0x0020000000100000L});
        public static final BitSet FOLLOW_20_in_ruleResourceDecl3806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateDecl_in_entryRuleStateDecl3842 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateDecl3852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleStateDecl3889 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleStateDecl3910 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleStateDecl3922 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStateDecl3939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinkDecl_in_entryRuleLinkDecl3980 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLinkDecl3990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleLinkDecl4027 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkDecl4044 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLinkDecl4061 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleLinkDecl4084 = new BitSet(new long[]{0x0048000000000000L});
        public static final BitSet FOLLOW_51_in_ruleLinkDecl4097 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleLinkDecl4120 = new BitSet(new long[]{0x0040000000800000L});
        public static final BitSet FOLLOW_23_in_ruleLinkDecl4133 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleLinkDecl4156 = new BitSet(new long[]{0x0040000000800000L});
        public static final BitSet FOLLOW_54_in_ruleLinkDecl4172 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkDecl4192 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleLinkDecl4204 = new BitSet(new long[]{0x0010000000100000L});
        public static final BitSet FOLLOW_ruleStateDecl_in_ruleLinkDecl4225 = new BitSet(new long[]{0x0010000000100000L});
        public static final BitSet FOLLOW_20_in_ruleLinkDecl4238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID4275 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID4286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID4326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_QUALIFIED_ID_in_ruleQualifiedID4352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger4398 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger4409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleInteger4448 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInteger4465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_entryRulePositiveInteger4511 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePositiveInteger4522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rulePositiveInteger4561 = new BitSet(new long[]{0x0000000000000002L});
    }


}