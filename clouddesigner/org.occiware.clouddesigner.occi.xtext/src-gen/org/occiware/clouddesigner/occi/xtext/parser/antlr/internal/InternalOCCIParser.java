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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'extension'", "':'", "'import'", "'as'", "'kind'", "'extends'", "'{'", "'title'", "'}'", "'mixin'", "'depends'", "','", "'applies'", "'scheme'", "'attribute'", "'mutable'", "'required'", "'*'", "'='", "'description'", "'action'", "'('", "')'", "'datatype'", "'serializable'", "'minExclusive'", "'minInclusive'", "'maxExclusive'", "'maxInclusive'", "'totalDigits'", "'fractionDigits'", "'length'", "'minLength'", "'maxLength'", "'whiteSpace'", "'pattern'", "'enum'", "'configuration'", "'use'", "'resource'", "'mixins'", "'state'", "'link'", "'target'", "'.'", "'-'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

            if ( (LA1_0==11) ) {
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
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleExtensionDecl241); 

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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleExtensionDecl275); 

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

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:164:4: otherlv_4= 'import' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= 'as' this_ID_7= RULE_ID )?
            	    {
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExtensionDecl310); 

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

            	    if ( (LA2_0==14) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:181:4: otherlv_6= 'as' this_ID_7= RULE_ID
            	            {
            	            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtensionDecl343); 

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
                case 15:
                    {
                    alt4=1;
                    }
                    break;
                case 20:
                    {
                    alt4=2;
                    }
                    break;
                case 34:
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
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKindDecl545); 

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

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:307:4: otherlv_2= 'extends' ( ( ruleQualifiedID ) )
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKindDecl580); 

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

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleKindDecl617); 

                	newLeafNode(otherlv_4, grammarAccess.getKindDeclAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:330:1: (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:330:3: otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleKindDecl630); 

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

                if ( (LA7_0==25) ) {
                    alt7=1;
                }
                else if ( (LA7_0==31) ) {
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

            otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleKindDecl717); 

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
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMixinDecl800); 

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

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:436:4: otherlv_2= 'depends' ( ( ruleQualifiedID ) ) (otherlv_4= ',' ( ( ruleQualifiedID ) ) )*
                    {
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMixinDecl835); 

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

                        if ( (LA8_0==22) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:455:4: otherlv_4= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMixinDecl871); 

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

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:474:8: otherlv_6= 'applies' ( ( ruleQualifiedID ) ) (otherlv_8= ',' ( ( ruleQualifiedID ) ) )*
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMixinDecl911); 

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

                        if ( (LA10_0==22) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:493:4: otherlv_8= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMixinDecl947); 

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

            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMixinDecl986); 

                	newLeafNode(otherlv_10, grammarAccess.getMixinDeclAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:516:1: (otherlv_11= 'scheme' ( (lv_scheme_12_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:516:3: otherlv_11= 'scheme' ( (lv_scheme_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMixinDecl999); 

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

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:538:6: otherlv_13= 'title' ( (lv_title_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMixinDecl1036); 

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

                if ( (LA14_0==25) ) {
                    alt14=1;
                }
                else if ( (LA14_0==31) ) {
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

            otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMixinDecl1123); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:618:1: ruleAttributeDecl returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleQualifiedID ) ) (otherlv_6= '*' )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' )? ) ;
    public final EObject ruleAttributeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mutable_1_0=null;
        Token lv_required_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_default_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:621:28: ( (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleQualifiedID ) ) (otherlv_6= '*' )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' )? ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:622:1: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleQualifiedID ) ) (otherlv_6= '*' )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:622:1: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleQualifiedID ) ) (otherlv_6= '*' )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' )? )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:622:3: otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleQualifiedID ) ) (otherlv_6= '*' )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAttributeDecl1206); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeDeclAccess().getAttributeKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:626:1: ( (lv_mutable_1_0= 'mutable' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:627:1: (lv_mutable_1_0= 'mutable' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:627:1: (lv_mutable_1_0= 'mutable' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:628:3: lv_mutable_1_0= 'mutable'
                    {
                    lv_mutable_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAttributeDecl1224); 

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

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:642:1: (lv_required_2_0= 'required' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:642:1: (lv_required_2_0= 'required' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:643:3: lv_required_2_0= 'required'
                    {
                    lv_required_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAttributeDecl1256); 

                            newLeafNode(lv_required_2_0, grammarAccess.getAttributeDeclAccess().getRequiredRequiredKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeDeclRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:656:3: ( (lv_name_3_0= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:657:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:657:1: (lv_name_3_0= RULE_ID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:658:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeDecl1287); 

            			newLeafNode(lv_name_3_0, grammarAccess.getAttributeDeclAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAttributeDecl1304); 

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
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleAttributeDecl1327);
            ruleQualifiedID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:693:2: (otherlv_6= '*' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:693:4: otherlv_6= '*'
                    {
                    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAttributeDecl1340); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttributeDeclAccess().getAsteriskKeyword_6());
                        

                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:697:3: (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:697:5: otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAttributeDecl1355); 

                        	newLeafNode(otherlv_7, grammarAccess.getAttributeDeclAccess().getEqualsSignKeyword_7_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:701:1: ( (lv_default_8_0= RULE_STRING ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:702:1: (lv_default_8_0= RULE_STRING )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:702:1: (lv_default_8_0= RULE_STRING )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:703:3: lv_default_8_0= RULE_STRING
                    {
                    lv_default_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttributeDecl1372); 

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

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:719:4: (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:719:6: otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAttributeDecl1392); 

                        	newLeafNode(otherlv_9, grammarAccess.getAttributeDeclAccess().getLeftCurlyBracketKeyword_8_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:723:1: (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==30) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:723:3: otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) )
                            {
                            otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAttributeDecl1405); 

                                	newLeafNode(otherlv_10, grammarAccess.getAttributeDeclAccess().getDescriptionKeyword_8_1_0());
                                
                            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:727:1: ( (lv_description_11_0= RULE_STRING ) )
                            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:728:1: (lv_description_11_0= RULE_STRING )
                            {
                            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:728:1: (lv_description_11_0= RULE_STRING )
                            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:729:3: lv_description_11_0= RULE_STRING
                            {
                            lv_description_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttributeDecl1422); 

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

                    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAttributeDecl1441); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:757:1: entryRuleActionDecl returns [EObject current=null] : iv_ruleActionDecl= ruleActionDecl EOF ;
    public final EObject entryRuleActionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:758:2: (iv_ruleActionDecl= ruleActionDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:759:2: iv_ruleActionDecl= ruleActionDecl EOF
            {
             newCompositeNode(grammarAccess.getActionDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActionDecl_in_entryRuleActionDecl1479);
            iv_ruleActionDecl=ruleActionDecl();

            state._fsp--;

             current =iv_ruleActionDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActionDecl1489); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:766:1: ruleActionDecl returns [EObject current=null] : (otherlv_0= 'action' ( (lv_term_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* )? otherlv_6= ')' (otherlv_7= '{' otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) otherlv_10= '}' )? ) ;
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
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:769:28: ( (otherlv_0= 'action' ( (lv_term_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* )? otherlv_6= ')' (otherlv_7= '{' otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) otherlv_10= '}' )? ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:770:1: (otherlv_0= 'action' ( (lv_term_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* )? otherlv_6= ')' (otherlv_7= '{' otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) otherlv_10= '}' )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:770:1: (otherlv_0= 'action' ( (lv_term_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* )? otherlv_6= ')' (otherlv_7= '{' otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) otherlv_10= '}' )? )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:770:3: otherlv_0= 'action' ( (lv_term_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* )? otherlv_6= ')' (otherlv_7= '{' otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleActionDecl1526); 

                	newLeafNode(otherlv_0, grammarAccess.getActionDeclAccess().getActionKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:774:1: ( (lv_term_1_0= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:775:1: (lv_term_1_0= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:775:1: (lv_term_1_0= RULE_ID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:776:3: lv_term_1_0= RULE_ID
            {
            lv_term_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleActionDecl1543); 

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

            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleActionDecl1560); 

                	newLeafNode(otherlv_2, grammarAccess.getActionDeclAccess().getLeftParenthesisKeyword_2());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:796:1: ( ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:796:2: ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )*
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:796:2: ( (lv_attributes_3_0= ruleParameterDecl ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:797:1: (lv_attributes_3_0= ruleParameterDecl )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:797:1: (lv_attributes_3_0= ruleParameterDecl )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:798:3: lv_attributes_3_0= ruleParameterDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionDeclAccess().getAttributesParameterDeclParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameterDecl_in_ruleActionDecl1582);
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

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:814:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==22) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:814:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleActionDecl1595); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getActionDeclAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:818:1: ( (lv_attributes_5_0= ruleParameterDecl ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:819:1: (lv_attributes_5_0= ruleParameterDecl )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:819:1: (lv_attributes_5_0= ruleParameterDecl )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:820:3: lv_attributes_5_0= ruleParameterDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActionDeclAccess().getAttributesParameterDeclParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameterDecl_in_ruleActionDecl1616);
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

            otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleActionDecl1632); 

                	newLeafNode(otherlv_6, grammarAccess.getActionDeclAccess().getRightParenthesisKeyword_4());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:840:1: (otherlv_7= '{' otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) otherlv_10= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:840:3: otherlv_7= '{' otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleActionDecl1645); 

                        	newLeafNode(otherlv_7, grammarAccess.getActionDeclAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleActionDecl1657); 

                        	newLeafNode(otherlv_8, grammarAccess.getActionDeclAccess().getTitleKeyword_5_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:848:1: ( (lv_title_9_0= RULE_STRING ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:849:1: (lv_title_9_0= RULE_STRING )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:849:1: (lv_title_9_0= RULE_STRING )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:850:3: lv_title_9_0= RULE_STRING
                    {
                    lv_title_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleActionDecl1674); 

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

                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleActionDecl1691); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:878:1: entryRuleParameterDecl returns [EObject current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final EObject entryRuleParameterDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:879:2: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:880:2: iv_ruleParameterDecl= ruleParameterDecl EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterDecl_in_entryRuleParameterDecl1729);
            iv_ruleParameterDecl=ruleParameterDecl();

            state._fsp--;

             current =iv_ruleParameterDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterDecl1739); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:887:1: ruleParameterDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_3_0= '*' ) )? ) ;
    public final EObject ruleParameterDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_multiple_values_3_0=null;

         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:890:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_3_0= '*' ) )? ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:891:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_3_0= '*' ) )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:891:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_3_0= '*' ) )? )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:891:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) ( (lv_multiple_values_3_0= '*' ) )?
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:891:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:892:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:892:1: (lv_name_0_0= RULE_ID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:893:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParameterDecl1781); 

            			newLeafNode(lv_name_0_0, grammarAccess.getParameterDeclAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameterDecl1798); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterDeclAccess().getColonKeyword_1());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:913:1: ( ( ruleQualifiedID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:914:1: ( ruleQualifiedID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:914:1: ( ruleQualifiedID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:915:3: ruleQualifiedID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterDeclRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterDeclAccess().getTypeEDataTypeCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleParameterDecl1821);
            ruleQualifiedID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:928:2: ( (lv_multiple_values_3_0= '*' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:929:1: (lv_multiple_values_3_0= '*' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:929:1: (lv_multiple_values_3_0= '*' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:930:3: lv_multiple_values_3_0= '*'
                    {
                    lv_multiple_values_3_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleParameterDecl1839); 

                            newLeafNode(lv_multiple_values_3_0, grammarAccess.getParameterDeclAccess().getMultiple_valuesAsteriskKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDeclRule());
                    	        }
                           		setWithLastConsumed(current, "multiple_values", true, "*");
                    	    

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:951:1: entryRuleDataTypeDecl returns [EObject current=null] : iv_ruleDataTypeDecl= ruleDataTypeDecl EOF ;
    public final EObject entryRuleDataTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:952:2: (iv_ruleDataTypeDecl= ruleDataTypeDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:953:2: iv_ruleDataTypeDecl= ruleDataTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getDataTypeDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypeDecl_in_entryRuleDataTypeDecl1889);
            iv_ruleDataTypeDecl=ruleDataTypeDecl();

            state._fsp--;

             current =iv_ruleDataTypeDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataTypeDecl1899); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:960:1: ruleDataTypeDecl returns [EObject current=null] : ( () otherlv_1= 'datatype' ( (lv_serializable_2_0= 'serializable' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_instanceTypeName_5_0= RULE_STRING ) ) (otherlv_6= '{' ( (lv_eAnnotations_7_0= ruleDataTypeAnnotations ) ) otherlv_8= '}' )? ) ;
    public final EObject ruleDataTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_serializable_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_instanceTypeName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_eAnnotations_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:963:28: ( ( () otherlv_1= 'datatype' ( (lv_serializable_2_0= 'serializable' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_instanceTypeName_5_0= RULE_STRING ) ) (otherlv_6= '{' ( (lv_eAnnotations_7_0= ruleDataTypeAnnotations ) ) otherlv_8= '}' )? ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:964:1: ( () otherlv_1= 'datatype' ( (lv_serializable_2_0= 'serializable' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_instanceTypeName_5_0= RULE_STRING ) ) (otherlv_6= '{' ( (lv_eAnnotations_7_0= ruleDataTypeAnnotations ) ) otherlv_8= '}' )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:964:1: ( () otherlv_1= 'datatype' ( (lv_serializable_2_0= 'serializable' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_instanceTypeName_5_0= RULE_STRING ) ) (otherlv_6= '{' ( (lv_eAnnotations_7_0= ruleDataTypeAnnotations ) ) otherlv_8= '}' )? )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:964:2: () otherlv_1= 'datatype' ( (lv_serializable_2_0= 'serializable' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_instanceTypeName_5_0= RULE_STRING ) ) (otherlv_6= '{' ( (lv_eAnnotations_7_0= ruleDataTypeAnnotations ) ) otherlv_8= '}' )?
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:964:2: ()
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:965:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataTypeDeclAccess().getEDataTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDataTypeDecl1945); 

                	newLeafNode(otherlv_1, grammarAccess.getDataTypeDeclAccess().getDatatypeKeyword_1());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:974:1: ( (lv_serializable_2_0= 'serializable' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:975:1: (lv_serializable_2_0= 'serializable' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:975:1: (lv_serializable_2_0= 'serializable' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:976:3: lv_serializable_2_0= 'serializable'
                    {
                    lv_serializable_2_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleDataTypeDecl1963); 

                            newLeafNode(lv_serializable_2_0, grammarAccess.getDataTypeDeclAccess().getSerializableSerializableKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeDeclRule());
                    	        }
                           		setWithLastConsumed(current, "serializable", true, "serializable");
                    	    

                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:989:3: ( (lv_name_3_0= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:990:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:990:1: (lv_name_3_0= RULE_ID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:991:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataTypeDecl1994); 

            			newLeafNode(lv_name_3_0, grammarAccess.getDataTypeDeclAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataTypeDecl2011); 

                	newLeafNode(otherlv_4, grammarAccess.getDataTypeDeclAccess().getColonKeyword_4());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1011:1: ( (lv_instanceTypeName_5_0= RULE_STRING ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1012:1: (lv_instanceTypeName_5_0= RULE_STRING )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1012:1: (lv_instanceTypeName_5_0= RULE_STRING )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1013:3: lv_instanceTypeName_5_0= RULE_STRING
            {
            lv_instanceTypeName_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDataTypeDecl2028); 

            			newLeafNode(lv_instanceTypeName_5_0, grammarAccess.getDataTypeDeclAccess().getInstanceTypeNameSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"instanceTypeName",
                    		lv_instanceTypeName_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1029:2: (otherlv_6= '{' ( (lv_eAnnotations_7_0= ruleDataTypeAnnotations ) ) otherlv_8= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1029:4: otherlv_6= '{' ( (lv_eAnnotations_7_0= ruleDataTypeAnnotations ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDataTypeDecl2046); 

                        	newLeafNode(otherlv_6, grammarAccess.getDataTypeDeclAccess().getLeftCurlyBracketKeyword_6_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1033:1: ( (lv_eAnnotations_7_0= ruleDataTypeAnnotations ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1034:1: (lv_eAnnotations_7_0= ruleDataTypeAnnotations )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1034:1: (lv_eAnnotations_7_0= ruleDataTypeAnnotations )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1035:3: lv_eAnnotations_7_0= ruleDataTypeAnnotations
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeDeclAccess().getEAnnotationsDataTypeAnnotationsParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDataTypeAnnotations_in_ruleDataTypeDecl2067);
                    lv_eAnnotations_7_0=ruleDataTypeAnnotations();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeDeclRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_7_0, 
                            		"DataTypeAnnotations");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDataTypeDecl2079); 

                        	newLeafNode(otherlv_8, grammarAccess.getDataTypeDeclAccess().getRightCurlyBracketKeyword_6_2());
                        

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1063:1: entryRuleDataTypeAnnotations returns [EObject current=null] : iv_ruleDataTypeAnnotations= ruleDataTypeAnnotations EOF ;
    public final EObject entryRuleDataTypeAnnotations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeAnnotations = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1064:2: (iv_ruleDataTypeAnnotations= ruleDataTypeAnnotations EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1065:2: iv_ruleDataTypeAnnotations= ruleDataTypeAnnotations EOF
            {
             newCompositeNode(grammarAccess.getDataTypeAnnotationsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypeAnnotations_in_entryRuleDataTypeAnnotations2117);
            iv_ruleDataTypeAnnotations=ruleDataTypeAnnotations();

            state._fsp--;

             current =iv_ruleDataTypeAnnotations; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataTypeAnnotations2127); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1072:1: ruleDataTypeAnnotations returns [EObject current=null] : ( (lv_details_0_0= ruleDataTypeAnnotation ) )+ ;
    public final EObject ruleDataTypeAnnotations() throws RecognitionException {
        EObject current = null;

        EObject lv_details_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1075:28: ( ( (lv_details_0_0= ruleDataTypeAnnotation ) )+ )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1076:1: ( (lv_details_0_0= ruleDataTypeAnnotation ) )+
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1076:1: ( (lv_details_0_0= ruleDataTypeAnnotation ) )+
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
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1077:1: (lv_details_0_0= ruleDataTypeAnnotation )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1077:1: (lv_details_0_0= ruleDataTypeAnnotation )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1078:3: lv_details_0_0= ruleDataTypeAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataTypeAnnotationsAccess().getDetailsDataTypeAnnotationParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDataTypeAnnotation_in_ruleDataTypeAnnotations2172);
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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1102:1: entryRuleDataTypeAnnotation returns [EObject current=null] : iv_ruleDataTypeAnnotation= ruleDataTypeAnnotation EOF ;
    public final EObject entryRuleDataTypeAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeAnnotation = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1103:2: (iv_ruleDataTypeAnnotation= ruleDataTypeAnnotation EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1104:2: iv_ruleDataTypeAnnotation= ruleDataTypeAnnotation EOF
            {
             newCompositeNode(grammarAccess.getDataTypeAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypeAnnotation_in_entryRuleDataTypeAnnotation2208);
            iv_ruleDataTypeAnnotation=ruleDataTypeAnnotation();

            state._fsp--;

             current =iv_ruleDataTypeAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataTypeAnnotation2218); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1111:1: ruleDataTypeAnnotation returns [EObject current=null] : ( ( ( (lv_key_0_0= 'minExclusive' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= 'minInclusive' ) ) otherlv_4= 'minInclusive' otherlv_5= '=' ( (lv_value_6_0= ruleInteger ) ) ) | ( ( (lv_key_7_0= 'maxExclusive' ) ) otherlv_8= '=' ( (lv_value_9_0= ruleInteger ) ) ) | ( ( (lv_key_10_0= 'maxInclusive' ) ) otherlv_11= '=' ( (lv_value_12_0= ruleInteger ) ) ) | ( ( (lv_key_13_0= 'totalDigits' ) ) otherlv_14= '=' ( (lv_value_15_0= rulePositiveInteger ) ) ) | ( ( (lv_key_16_0= 'fractionDigits' ) ) otherlv_17= '=' ( (lv_value_18_0= rulePositiveInteger ) ) ) | ( ( (lv_key_19_0= 'length' ) ) otherlv_20= '=' ( (lv_value_21_0= rulePositiveInteger ) ) ) | ( ( (lv_key_22_0= 'minLength' ) ) otherlv_23= '=' ( (lv_value_24_0= rulePositiveInteger ) ) ) | ( ( (lv_key_25_0= 'maxLength' ) ) otherlv_26= '=' ( (lv_value_27_0= rulePositiveInteger ) ) ) | ( ( (lv_key_28_0= 'whiteSpace' ) ) otherlv_29= '=' ( (lv_value_30_0= rulePositiveInteger ) ) ) | ( ( (lv_key_31_0= 'pattern' ) ) otherlv_32= '=' ( (lv_value_33_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleDataTypeAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_key_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_key_7_0=null;
        Token otherlv_8=null;
        Token lv_key_10_0=null;
        Token otherlv_11=null;
        Token lv_key_13_0=null;
        Token otherlv_14=null;
        Token lv_key_16_0=null;
        Token otherlv_17=null;
        Token lv_key_19_0=null;
        Token otherlv_20=null;
        Token lv_key_22_0=null;
        Token otherlv_23=null;
        Token lv_key_25_0=null;
        Token otherlv_26=null;
        Token lv_key_28_0=null;
        Token otherlv_29=null;
        Token lv_key_31_0=null;
        Token otherlv_32=null;
        Token lv_value_33_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;

        AntlrDatatypeRuleToken lv_value_12_0 = null;

        AntlrDatatypeRuleToken lv_value_15_0 = null;

        AntlrDatatypeRuleToken lv_value_18_0 = null;

        AntlrDatatypeRuleToken lv_value_21_0 = null;

        AntlrDatatypeRuleToken lv_value_24_0 = null;

        AntlrDatatypeRuleToken lv_value_27_0 = null;

        AntlrDatatypeRuleToken lv_value_30_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1114:28: ( ( ( ( (lv_key_0_0= 'minExclusive' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= 'minInclusive' ) ) otherlv_4= 'minInclusive' otherlv_5= '=' ( (lv_value_6_0= ruleInteger ) ) ) | ( ( (lv_key_7_0= 'maxExclusive' ) ) otherlv_8= '=' ( (lv_value_9_0= ruleInteger ) ) ) | ( ( (lv_key_10_0= 'maxInclusive' ) ) otherlv_11= '=' ( (lv_value_12_0= ruleInteger ) ) ) | ( ( (lv_key_13_0= 'totalDigits' ) ) otherlv_14= '=' ( (lv_value_15_0= rulePositiveInteger ) ) ) | ( ( (lv_key_16_0= 'fractionDigits' ) ) otherlv_17= '=' ( (lv_value_18_0= rulePositiveInteger ) ) ) | ( ( (lv_key_19_0= 'length' ) ) otherlv_20= '=' ( (lv_value_21_0= rulePositiveInteger ) ) ) | ( ( (lv_key_22_0= 'minLength' ) ) otherlv_23= '=' ( (lv_value_24_0= rulePositiveInteger ) ) ) | ( ( (lv_key_25_0= 'maxLength' ) ) otherlv_26= '=' ( (lv_value_27_0= rulePositiveInteger ) ) ) | ( ( (lv_key_28_0= 'whiteSpace' ) ) otherlv_29= '=' ( (lv_value_30_0= rulePositiveInteger ) ) ) | ( ( (lv_key_31_0= 'pattern' ) ) otherlv_32= '=' ( (lv_value_33_0= RULE_STRING ) ) ) ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1115:1: ( ( ( (lv_key_0_0= 'minExclusive' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= 'minInclusive' ) ) otherlv_4= 'minInclusive' otherlv_5= '=' ( (lv_value_6_0= ruleInteger ) ) ) | ( ( (lv_key_7_0= 'maxExclusive' ) ) otherlv_8= '=' ( (lv_value_9_0= ruleInteger ) ) ) | ( ( (lv_key_10_0= 'maxInclusive' ) ) otherlv_11= '=' ( (lv_value_12_0= ruleInteger ) ) ) | ( ( (lv_key_13_0= 'totalDigits' ) ) otherlv_14= '=' ( (lv_value_15_0= rulePositiveInteger ) ) ) | ( ( (lv_key_16_0= 'fractionDigits' ) ) otherlv_17= '=' ( (lv_value_18_0= rulePositiveInteger ) ) ) | ( ( (lv_key_19_0= 'length' ) ) otherlv_20= '=' ( (lv_value_21_0= rulePositiveInteger ) ) ) | ( ( (lv_key_22_0= 'minLength' ) ) otherlv_23= '=' ( (lv_value_24_0= rulePositiveInteger ) ) ) | ( ( (lv_key_25_0= 'maxLength' ) ) otherlv_26= '=' ( (lv_value_27_0= rulePositiveInteger ) ) ) | ( ( (lv_key_28_0= 'whiteSpace' ) ) otherlv_29= '=' ( (lv_value_30_0= rulePositiveInteger ) ) ) | ( ( (lv_key_31_0= 'pattern' ) ) otherlv_32= '=' ( (lv_value_33_0= RULE_STRING ) ) ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1115:1: ( ( ( (lv_key_0_0= 'minExclusive' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= 'minInclusive' ) ) otherlv_4= 'minInclusive' otherlv_5= '=' ( (lv_value_6_0= ruleInteger ) ) ) | ( ( (lv_key_7_0= 'maxExclusive' ) ) otherlv_8= '=' ( (lv_value_9_0= ruleInteger ) ) ) | ( ( (lv_key_10_0= 'maxInclusive' ) ) otherlv_11= '=' ( (lv_value_12_0= ruleInteger ) ) ) | ( ( (lv_key_13_0= 'totalDigits' ) ) otherlv_14= '=' ( (lv_value_15_0= rulePositiveInteger ) ) ) | ( ( (lv_key_16_0= 'fractionDigits' ) ) otherlv_17= '=' ( (lv_value_18_0= rulePositiveInteger ) ) ) | ( ( (lv_key_19_0= 'length' ) ) otherlv_20= '=' ( (lv_value_21_0= rulePositiveInteger ) ) ) | ( ( (lv_key_22_0= 'minLength' ) ) otherlv_23= '=' ( (lv_value_24_0= rulePositiveInteger ) ) ) | ( ( (lv_key_25_0= 'maxLength' ) ) otherlv_26= '=' ( (lv_value_27_0= rulePositiveInteger ) ) ) | ( ( (lv_key_28_0= 'whiteSpace' ) ) otherlv_29= '=' ( (lv_value_30_0= rulePositiveInteger ) ) ) | ( ( (lv_key_31_0= 'pattern' ) ) otherlv_32= '=' ( (lv_value_33_0= RULE_STRING ) ) ) )
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
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1115:2: ( ( (lv_key_0_0= 'minExclusive' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1115:2: ( ( (lv_key_0_0= 'minExclusive' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1115:3: ( (lv_key_0_0= 'minExclusive' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1115:3: ( (lv_key_0_0= 'minExclusive' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1116:1: (lv_key_0_0= 'minExclusive' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1116:1: (lv_key_0_0= 'minExclusive' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1117:3: lv_key_0_0= 'minExclusive'
                    {
                    lv_key_0_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleDataTypeAnnotation2262); 

                            newLeafNode(lv_key_0_0, grammarAccess.getDataTypeAnnotationAccess().getKeyMinExclusiveKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_0_0, "minExclusive");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypeAnnotation2287); 

                        	newLeafNode(otherlv_1, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_0_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1134:1: ( (lv_value_2_0= ruleInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1135:1: (lv_value_2_0= ruleInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1135:1: (lv_value_2_0= ruleInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1136:3: lv_value_2_0= ruleInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValueIntegerParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2308);
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
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1153:6: ( ( (lv_key_3_0= 'minInclusive' ) ) otherlv_4= 'minInclusive' otherlv_5= '=' ( (lv_value_6_0= ruleInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1153:6: ( ( (lv_key_3_0= 'minInclusive' ) ) otherlv_4= 'minInclusive' otherlv_5= '=' ( (lv_value_6_0= ruleInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1153:7: ( (lv_key_3_0= 'minInclusive' ) ) otherlv_4= 'minInclusive' otherlv_5= '=' ( (lv_value_6_0= ruleInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1153:7: ( (lv_key_3_0= 'minInclusive' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1154:1: (lv_key_3_0= 'minInclusive' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1154:1: (lv_key_3_0= 'minInclusive' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1155:3: lv_key_3_0= 'minInclusive'
                    {
                    lv_key_3_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleDataTypeAnnotation2334); 

                            newLeafNode(lv_key_3_0, grammarAccess.getDataTypeAnnotationAccess().getKeyMinInclusiveKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_3_0, "minInclusive");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleDataTypeAnnotation2359); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataTypeAnnotationAccess().getMinInclusiveKeyword_1_1());
                        
                    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypeAnnotation2371); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_1_2());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1176:1: ( (lv_value_6_0= ruleInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1177:1: (lv_value_6_0= ruleInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1177:1: (lv_value_6_0= ruleInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1178:3: lv_value_6_0= ruleInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValueIntegerParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2392);
                    lv_value_6_0=ruleInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"Integer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1195:6: ( ( (lv_key_7_0= 'maxExclusive' ) ) otherlv_8= '=' ( (lv_value_9_0= ruleInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1195:6: ( ( (lv_key_7_0= 'maxExclusive' ) ) otherlv_8= '=' ( (lv_value_9_0= ruleInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1195:7: ( (lv_key_7_0= 'maxExclusive' ) ) otherlv_8= '=' ( (lv_value_9_0= ruleInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1195:7: ( (lv_key_7_0= 'maxExclusive' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1196:1: (lv_key_7_0= 'maxExclusive' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1196:1: (lv_key_7_0= 'maxExclusive' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1197:3: lv_key_7_0= 'maxExclusive'
                    {
                    lv_key_7_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDataTypeAnnotation2418); 

                            newLeafNode(lv_key_7_0, grammarAccess.getDataTypeAnnotationAccess().getKeyMaxExclusiveKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_7_0, "maxExclusive");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypeAnnotation2443); 

                        	newLeafNode(otherlv_8, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_2_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1214:1: ( (lv_value_9_0= ruleInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1215:1: (lv_value_9_0= ruleInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1215:1: (lv_value_9_0= ruleInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1216:3: lv_value_9_0= ruleInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValueIntegerParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2464);
                    lv_value_9_0=ruleInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_9_0, 
                            		"Integer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1233:6: ( ( (lv_key_10_0= 'maxInclusive' ) ) otherlv_11= '=' ( (lv_value_12_0= ruleInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1233:6: ( ( (lv_key_10_0= 'maxInclusive' ) ) otherlv_11= '=' ( (lv_value_12_0= ruleInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1233:7: ( (lv_key_10_0= 'maxInclusive' ) ) otherlv_11= '=' ( (lv_value_12_0= ruleInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1233:7: ( (lv_key_10_0= 'maxInclusive' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1234:1: (lv_key_10_0= 'maxInclusive' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1234:1: (lv_key_10_0= 'maxInclusive' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1235:3: lv_key_10_0= 'maxInclusive'
                    {
                    lv_key_10_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDataTypeAnnotation2490); 

                            newLeafNode(lv_key_10_0, grammarAccess.getDataTypeAnnotationAccess().getKeyMaxInclusiveKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_10_0, "maxInclusive");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypeAnnotation2515); 

                        	newLeafNode(otherlv_11, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1252:1: ( (lv_value_12_0= ruleInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1253:1: (lv_value_12_0= ruleInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1253:1: (lv_value_12_0= ruleInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1254:3: lv_value_12_0= ruleInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValueIntegerParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2536);
                    lv_value_12_0=ruleInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_12_0, 
                            		"Integer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1271:6: ( ( (lv_key_13_0= 'totalDigits' ) ) otherlv_14= '=' ( (lv_value_15_0= rulePositiveInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1271:6: ( ( (lv_key_13_0= 'totalDigits' ) ) otherlv_14= '=' ( (lv_value_15_0= rulePositiveInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1271:7: ( (lv_key_13_0= 'totalDigits' ) ) otherlv_14= '=' ( (lv_value_15_0= rulePositiveInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1271:7: ( (lv_key_13_0= 'totalDigits' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1272:1: (lv_key_13_0= 'totalDigits' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1272:1: (lv_key_13_0= 'totalDigits' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1273:3: lv_key_13_0= 'totalDigits'
                    {
                    lv_key_13_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDataTypeAnnotation2562); 

                            newLeafNode(lv_key_13_0, grammarAccess.getDataTypeAnnotationAccess().getKeyTotalDigitsKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_13_0, "totalDigits");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypeAnnotation2587); 

                        	newLeafNode(otherlv_14, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_4_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1290:1: ( (lv_value_15_0= rulePositiveInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1291:1: (lv_value_15_0= rulePositiveInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1291:1: (lv_value_15_0= rulePositiveInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1292:3: lv_value_15_0= rulePositiveInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValuePositiveIntegerParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2608);
                    lv_value_15_0=rulePositiveInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_15_0, 
                            		"PositiveInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1309:6: ( ( (lv_key_16_0= 'fractionDigits' ) ) otherlv_17= '=' ( (lv_value_18_0= rulePositiveInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1309:6: ( ( (lv_key_16_0= 'fractionDigits' ) ) otherlv_17= '=' ( (lv_value_18_0= rulePositiveInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1309:7: ( (lv_key_16_0= 'fractionDigits' ) ) otherlv_17= '=' ( (lv_value_18_0= rulePositiveInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1309:7: ( (lv_key_16_0= 'fractionDigits' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1310:1: (lv_key_16_0= 'fractionDigits' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1310:1: (lv_key_16_0= 'fractionDigits' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1311:3: lv_key_16_0= 'fractionDigits'
                    {
                    lv_key_16_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDataTypeAnnotation2634); 

                            newLeafNode(lv_key_16_0, grammarAccess.getDataTypeAnnotationAccess().getKeyFractionDigitsKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_16_0, "fractionDigits");
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypeAnnotation2659); 

                        	newLeafNode(otherlv_17, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_5_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1328:1: ( (lv_value_18_0= rulePositiveInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1329:1: (lv_value_18_0= rulePositiveInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1329:1: (lv_value_18_0= rulePositiveInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1330:3: lv_value_18_0= rulePositiveInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValuePositiveIntegerParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2680);
                    lv_value_18_0=rulePositiveInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_18_0, 
                            		"PositiveInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1347:6: ( ( (lv_key_19_0= 'length' ) ) otherlv_20= '=' ( (lv_value_21_0= rulePositiveInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1347:6: ( ( (lv_key_19_0= 'length' ) ) otherlv_20= '=' ( (lv_value_21_0= rulePositiveInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1347:7: ( (lv_key_19_0= 'length' ) ) otherlv_20= '=' ( (lv_value_21_0= rulePositiveInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1347:7: ( (lv_key_19_0= 'length' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1348:1: (lv_key_19_0= 'length' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1348:1: (lv_key_19_0= 'length' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1349:3: lv_key_19_0= 'length'
                    {
                    lv_key_19_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDataTypeAnnotation2706); 

                            newLeafNode(lv_key_19_0, grammarAccess.getDataTypeAnnotationAccess().getKeyLengthKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_19_0, "length");
                    	    

                    }


                    }

                    otherlv_20=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypeAnnotation2731); 

                        	newLeafNode(otherlv_20, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_6_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1366:1: ( (lv_value_21_0= rulePositiveInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1367:1: (lv_value_21_0= rulePositiveInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1367:1: (lv_value_21_0= rulePositiveInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1368:3: lv_value_21_0= rulePositiveInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValuePositiveIntegerParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2752);
                    lv_value_21_0=rulePositiveInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_21_0, 
                            		"PositiveInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1385:6: ( ( (lv_key_22_0= 'minLength' ) ) otherlv_23= '=' ( (lv_value_24_0= rulePositiveInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1385:6: ( ( (lv_key_22_0= 'minLength' ) ) otherlv_23= '=' ( (lv_value_24_0= rulePositiveInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1385:7: ( (lv_key_22_0= 'minLength' ) ) otherlv_23= '=' ( (lv_value_24_0= rulePositiveInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1385:7: ( (lv_key_22_0= 'minLength' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1386:1: (lv_key_22_0= 'minLength' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1386:1: (lv_key_22_0= 'minLength' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1387:3: lv_key_22_0= 'minLength'
                    {
                    lv_key_22_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDataTypeAnnotation2778); 

                            newLeafNode(lv_key_22_0, grammarAccess.getDataTypeAnnotationAccess().getKeyMinLengthKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_22_0, "minLength");
                    	    

                    }


                    }

                    otherlv_23=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypeAnnotation2803); 

                        	newLeafNode(otherlv_23, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_7_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1404:1: ( (lv_value_24_0= rulePositiveInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1405:1: (lv_value_24_0= rulePositiveInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1405:1: (lv_value_24_0= rulePositiveInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1406:3: lv_value_24_0= rulePositiveInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValuePositiveIntegerParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2824);
                    lv_value_24_0=rulePositiveInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_24_0, 
                            		"PositiveInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1423:6: ( ( (lv_key_25_0= 'maxLength' ) ) otherlv_26= '=' ( (lv_value_27_0= rulePositiveInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1423:6: ( ( (lv_key_25_0= 'maxLength' ) ) otherlv_26= '=' ( (lv_value_27_0= rulePositiveInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1423:7: ( (lv_key_25_0= 'maxLength' ) ) otherlv_26= '=' ( (lv_value_27_0= rulePositiveInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1423:7: ( (lv_key_25_0= 'maxLength' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1424:1: (lv_key_25_0= 'maxLength' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1424:1: (lv_key_25_0= 'maxLength' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1425:3: lv_key_25_0= 'maxLength'
                    {
                    lv_key_25_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDataTypeAnnotation2850); 

                            newLeafNode(lv_key_25_0, grammarAccess.getDataTypeAnnotationAccess().getKeyMaxLengthKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_25_0, "maxLength");
                    	    

                    }


                    }

                    otherlv_26=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypeAnnotation2875); 

                        	newLeafNode(otherlv_26, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_8_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1442:1: ( (lv_value_27_0= rulePositiveInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1443:1: (lv_value_27_0= rulePositiveInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1443:1: (lv_value_27_0= rulePositiveInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1444:3: lv_value_27_0= rulePositiveInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValuePositiveIntegerParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2896);
                    lv_value_27_0=rulePositiveInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_27_0, 
                            		"PositiveInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1461:6: ( ( (lv_key_28_0= 'whiteSpace' ) ) otherlv_29= '=' ( (lv_value_30_0= rulePositiveInteger ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1461:6: ( ( (lv_key_28_0= 'whiteSpace' ) ) otherlv_29= '=' ( (lv_value_30_0= rulePositiveInteger ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1461:7: ( (lv_key_28_0= 'whiteSpace' ) ) otherlv_29= '=' ( (lv_value_30_0= rulePositiveInteger ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1461:7: ( (lv_key_28_0= 'whiteSpace' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1462:1: (lv_key_28_0= 'whiteSpace' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1462:1: (lv_key_28_0= 'whiteSpace' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1463:3: lv_key_28_0= 'whiteSpace'
                    {
                    lv_key_28_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDataTypeAnnotation2922); 

                            newLeafNode(lv_key_28_0, grammarAccess.getDataTypeAnnotationAccess().getKeyWhiteSpaceKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_28_0, "whiteSpace");
                    	    

                    }


                    }

                    otherlv_29=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypeAnnotation2947); 

                        	newLeafNode(otherlv_29, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_9_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1480:1: ( (lv_value_30_0= rulePositiveInteger ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1481:1: (lv_value_30_0= rulePositiveInteger )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1481:1: (lv_value_30_0= rulePositiveInteger )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1482:3: lv_value_30_0= rulePositiveInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAnnotationAccess().getValuePositiveIntegerParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2968);
                    lv_value_30_0=rulePositiveInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_30_0, 
                            		"PositiveInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1499:6: ( ( (lv_key_31_0= 'pattern' ) ) otherlv_32= '=' ( (lv_value_33_0= RULE_STRING ) ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1499:6: ( ( (lv_key_31_0= 'pattern' ) ) otherlv_32= '=' ( (lv_value_33_0= RULE_STRING ) ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1499:7: ( (lv_key_31_0= 'pattern' ) ) otherlv_32= '=' ( (lv_value_33_0= RULE_STRING ) )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1499:7: ( (lv_key_31_0= 'pattern' ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1500:1: (lv_key_31_0= 'pattern' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1500:1: (lv_key_31_0= 'pattern' )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1501:3: lv_key_31_0= 'pattern'
                    {
                    lv_key_31_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleDataTypeAnnotation2994); 

                            newLeafNode(lv_key_31_0, grammarAccess.getDataTypeAnnotationAccess().getKeyPatternKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_31_0, "pattern");
                    	    

                    }


                    }

                    otherlv_32=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypeAnnotation3019); 

                        	newLeafNode(otherlv_32, grammarAccess.getDataTypeAnnotationAccess().getEqualsSignKeyword_10_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1518:1: ( (lv_value_33_0= RULE_STRING ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1519:1: (lv_value_33_0= RULE_STRING )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1519:1: (lv_value_33_0= RULE_STRING )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1520:3: lv_value_33_0= RULE_STRING
                    {
                    lv_value_33_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDataTypeAnnotation3036); 

                    			newLeafNode(lv_value_33_0, grammarAccess.getDataTypeAnnotationAccess().getValueSTRINGTerminalRuleCall_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeAnnotationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_33_0, 
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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1544:1: entryRuleEnumTypeDecl returns [EObject current=null] : iv_ruleEnumTypeDecl= ruleEnumTypeDecl EOF ;
    public final EObject entryRuleEnumTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1545:2: (iv_ruleEnumTypeDecl= ruleEnumTypeDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1546:2: iv_ruleEnumTypeDecl= ruleEnumTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumTypeDecl_in_entryRuleEnumTypeDecl3078);
            iv_ruleEnumTypeDecl=ruleEnumTypeDecl();

            state._fsp--;

             current =iv_ruleEnumTypeDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumTypeDecl3088); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1553:1: ruleEnumTypeDecl returns [EObject current=null] : ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eLiterals_4_0= ruleEnumLiteralDecl ) ) (otherlv_5= ',' ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) ) )* otherlv_7= '}' ) ;
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
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1556:28: ( ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eLiterals_4_0= ruleEnumLiteralDecl ) ) (otherlv_5= ',' ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) ) )* otherlv_7= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1557:1: ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eLiterals_4_0= ruleEnumLiteralDecl ) ) (otherlv_5= ',' ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) ) )* otherlv_7= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1557:1: ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eLiterals_4_0= ruleEnumLiteralDecl ) ) (otherlv_5= ',' ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) ) )* otherlv_7= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1557:2: () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eLiterals_4_0= ruleEnumLiteralDecl ) ) (otherlv_5= ',' ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) ) )* otherlv_7= '}'
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1557:2: ()
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1558:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEnumTypeDeclAccess().getEEnumAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEnumTypeDecl3134); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumTypeDeclAccess().getEnumKeyword_1());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1567:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1568:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1568:1: (lv_name_2_0= RULE_ID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1569:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumTypeDecl3151); 

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

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEnumTypeDecl3168); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumTypeDeclAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1589:1: ( (lv_eLiterals_4_0= ruleEnumLiteralDecl ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1590:1: (lv_eLiterals_4_0= ruleEnumLiteralDecl )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1590:1: (lv_eLiterals_4_0= ruleEnumLiteralDecl )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1591:3: lv_eLiterals_4_0= ruleEnumLiteralDecl
            {
             
            	        newCompositeNode(grammarAccess.getEnumTypeDeclAccess().getELiteralsEnumLiteralDeclParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDecl_in_ruleEnumTypeDecl3189);
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

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1607:2: (otherlv_5= ',' ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==22) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1607:4: otherlv_5= ',' ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEnumTypeDecl3202); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEnumTypeDeclAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1611:1: ( (lv_eLiterals_6_0= ruleEnumLiteralDecl ) )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1612:1: (lv_eLiterals_6_0= ruleEnumLiteralDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1612:1: (lv_eLiterals_6_0= ruleEnumLiteralDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1613:3: lv_eLiterals_6_0= ruleEnumLiteralDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumTypeDeclAccess().getELiteralsEnumLiteralDeclParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDecl_in_ruleEnumTypeDecl3223);
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

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEnumTypeDecl3237); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1641:1: entryRuleEnumLiteralDecl returns [EObject current=null] : iv_ruleEnumLiteralDecl= ruleEnumLiteralDecl EOF ;
    public final EObject entryRuleEnumLiteralDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1642:2: (iv_ruleEnumLiteralDecl= ruleEnumLiteralDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1643:2: iv_ruleEnumLiteralDecl= ruleEnumLiteralDecl EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDecl_in_entryRuleEnumLiteralDecl3273);
            iv_ruleEnumLiteralDecl=ruleEnumLiteralDecl();

            state._fsp--;

             current =iv_ruleEnumLiteralDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumLiteralDecl3283); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1650:1: ruleEnumLiteralDecl returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumLiteralDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1653:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1654:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1654:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1654:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1654:2: ()
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1655:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEnumLiteralDeclAccess().getEEnumLiteralAction_0(),
                        current);
                

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1660:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1661:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1661:1: (lv_name_1_0= RULE_ID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1662:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumLiteralDecl3334); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1686:1: entryRuleConfigurationDecl returns [EObject current=null] : iv_ruleConfigurationDecl= ruleConfigurationDecl EOF ;
    public final EObject entryRuleConfigurationDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1687:2: (iv_ruleConfigurationDecl= ruleConfigurationDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1688:2: iv_ruleConfigurationDecl= ruleConfigurationDecl EOF
            {
             newCompositeNode(grammarAccess.getConfigurationDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfigurationDecl_in_entryRuleConfigurationDecl3375);
            iv_ruleConfigurationDecl=ruleConfigurationDecl();

            state._fsp--;

             current =iv_ruleConfigurationDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfigurationDecl3385); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1695:1: ruleConfigurationDecl returns [EObject current=null] : ( () otherlv_1= 'configuration' (otherlv_2= 'use' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'as' this_ID_5= RULE_ID )? )* ( (lv_resources_6_0= ruleResourceDecl ) )* ) ;
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
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1698:28: ( ( () otherlv_1= 'configuration' (otherlv_2= 'use' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'as' this_ID_5= RULE_ID )? )* ( (lv_resources_6_0= ruleResourceDecl ) )* ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1699:1: ( () otherlv_1= 'configuration' (otherlv_2= 'use' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'as' this_ID_5= RULE_ID )? )* ( (lv_resources_6_0= ruleResourceDecl ) )* )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1699:1: ( () otherlv_1= 'configuration' (otherlv_2= 'use' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'as' this_ID_5= RULE_ID )? )* ( (lv_resources_6_0= ruleResourceDecl ) )* )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1699:2: () otherlv_1= 'configuration' (otherlv_2= 'use' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'as' this_ID_5= RULE_ID )? )* ( (lv_resources_6_0= ruleResourceDecl ) )*
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1699:2: ()
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1700:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConfigurationDeclAccess().getConfigurationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleConfigurationDecl3431); 

                	newLeafNode(otherlv_1, grammarAccess.getConfigurationDeclAccess().getConfigurationKeyword_1());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1709:1: (otherlv_2= 'use' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'as' this_ID_5= RULE_ID )? )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==49) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1709:3: otherlv_2= 'use' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'as' this_ID_5= RULE_ID )?
            	    {
            	    otherlv_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleConfigurationDecl3444); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConfigurationDeclAccess().getUseKeyword_2_0());
            	        
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1713:1: ( (otherlv_3= RULE_STRING ) )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1714:1: (otherlv_3= RULE_STRING )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1714:1: (otherlv_3= RULE_STRING )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1715:3: otherlv_3= RULE_STRING
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getConfigurationDeclRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleConfigurationDecl3464); 

            	    		newLeafNode(otherlv_3, grammarAccess.getConfigurationDeclAccess().getUseExtensionCrossReference_2_1_0()); 
            	    	

            	    }


            	    }

            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1726:2: (otherlv_4= 'as' this_ID_5= RULE_ID )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==14) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1726:4: otherlv_4= 'as' this_ID_5= RULE_ID
            	            {
            	            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConfigurationDecl3477); 

            	                	newLeafNode(otherlv_4, grammarAccess.getConfigurationDeclAccess().getAsKeyword_2_2_0());
            	                
            	            this_ID_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConfigurationDecl3488); 
            	             
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

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1734:5: ( (lv_resources_6_0= ruleResourceDecl ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==50) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1735:1: (lv_resources_6_0= ruleResourceDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1735:1: (lv_resources_6_0= ruleResourceDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1736:3: lv_resources_6_0= ruleResourceDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConfigurationDeclAccess().getResourcesResourceDeclParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleResourceDecl_in_ruleConfigurationDecl3512);
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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1760:1: entryRuleResourceDecl returns [EObject current=null] : iv_ruleResourceDecl= ruleResourceDecl EOF ;
    public final EObject entryRuleResourceDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1761:2: (iv_ruleResourceDecl= ruleResourceDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1762:2: iv_ruleResourceDecl= ruleResourceDecl EOF
            {
             newCompositeNode(grammarAccess.getResourceDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResourceDecl_in_entryRuleResourceDecl3549);
            iv_ruleResourceDecl=ruleResourceDecl();

            state._fsp--;

             current =iv_ruleResourceDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResourceDecl3559); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1769:1: ruleResourceDecl returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= '{' ( (lv_attributes_9_0= ruleStateDecl ) )* ( (lv_links_10_0= ruleLinkDecl ) )* otherlv_11= '}' ) ;
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
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1772:28: ( (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= '{' ( (lv_attributes_9_0= ruleStateDecl ) )* ( (lv_links_10_0= ruleLinkDecl ) )* otherlv_11= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1773:1: (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= '{' ( (lv_attributes_9_0= ruleStateDecl ) )* ( (lv_links_10_0= ruleLinkDecl ) )* otherlv_11= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1773:1: (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= '{' ( (lv_attributes_9_0= ruleStateDecl ) )* ( (lv_links_10_0= ruleLinkDecl ) )* otherlv_11= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1773:3: otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= '{' ( (lv_attributes_9_0= ruleStateDecl ) )* ( (lv_links_10_0= ruleLinkDecl ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleResourceDecl3596); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceDeclAccess().getResourceKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1777:1: ( (lv_id_1_0= RULE_STRING ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1778:1: (lv_id_1_0= RULE_STRING )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1778:1: (lv_id_1_0= RULE_STRING )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1779:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleResourceDecl3613); 

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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleResourceDecl3630); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceDeclAccess().getColonKeyword_2());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1799:1: ( ( ruleQualifiedID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1800:1: ( ruleQualifiedID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1800:1: ( ruleQualifiedID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1801:3: ruleQualifiedID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceDeclRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getResourceDeclAccess().getKindKindCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleResourceDecl3653);
            ruleQualifiedID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1814:2: (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1814:4: otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )*
                    {
                    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleResourceDecl3666); 

                        	newLeafNode(otherlv_4, grammarAccess.getResourceDeclAccess().getMixinsKeyword_4_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1818:1: ( ( ruleQualifiedID ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1819:1: ( ruleQualifiedID )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1819:1: ( ruleQualifiedID )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1820:3: ruleQualifiedID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceDeclRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getResourceDeclAccess().getMixinsMixinCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleResourceDecl3689);
                    ruleQualifiedID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1833:2: (otherlv_6= ',' ( ( ruleQualifiedID ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==22) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1833:4: otherlv_6= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleResourceDecl3702); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getResourceDeclAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1837:1: ( ( ruleQualifiedID ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1838:1: ( ruleQualifiedID )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1838:1: ( ruleQualifiedID )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1839:3: ruleQualifiedID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getResourceDeclRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getResourceDeclAccess().getMixinsMixinCrossReference_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleResourceDecl3725);
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

            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleResourceDecl3741); 

                	newLeafNode(otherlv_8, grammarAccess.getResourceDeclAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1856:1: ( (lv_attributes_9_0= ruleStateDecl ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==52) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1857:1: (lv_attributes_9_0= ruleStateDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1857:1: (lv_attributes_9_0= ruleStateDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1858:3: lv_attributes_9_0= ruleStateDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceDeclAccess().getAttributesStateDeclParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleStateDecl_in_ruleResourceDecl3762);
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

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1874:3: ( (lv_links_10_0= ruleLinkDecl ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==53) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1875:1: (lv_links_10_0= ruleLinkDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1875:1: (lv_links_10_0= ruleLinkDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1876:3: lv_links_10_0= ruleLinkDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceDeclAccess().getLinksLinkDeclParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLinkDecl_in_ruleResourceDecl3784);
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

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleResourceDecl3797); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1904:1: entryRuleStateDecl returns [EObject current=null] : iv_ruleStateDecl= ruleStateDecl EOF ;
    public final EObject entryRuleStateDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1905:2: (iv_ruleStateDecl= ruleStateDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1906:2: iv_ruleStateDecl= ruleStateDecl EOF
            {
             newCompositeNode(grammarAccess.getStateDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateDecl_in_entryRuleStateDecl3833);
            iv_ruleStateDecl=ruleStateDecl();

            state._fsp--;

             current =iv_ruleStateDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateDecl3843); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1913:1: ruleStateDecl returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleStateDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1916:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1917:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1917:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1917:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleStateDecl3880); 

                	newLeafNode(otherlv_0, grammarAccess.getStateDeclAccess().getStateKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1921:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1922:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1922:1: (lv_name_1_0= RULE_ID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1923:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStateDecl3897); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleStateDecl3914); 

                	newLeafNode(otherlv_2, grammarAccess.getStateDeclAccess().getEqualsSignKeyword_2());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1943:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1944:1: (lv_value_3_0= RULE_STRING )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1944:1: (lv_value_3_0= RULE_STRING )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1945:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStateDecl3931); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1969:1: entryRuleLinkDecl returns [EObject current=null] : iv_ruleLinkDecl= ruleLinkDecl EOF ;
    public final EObject entryRuleLinkDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkDecl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1970:2: (iv_ruleLinkDecl= ruleLinkDecl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1971:2: iv_ruleLinkDecl= ruleLinkDecl EOF
            {
             newCompositeNode(grammarAccess.getLinkDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinkDecl_in_entryRuleLinkDecl3972);
            iv_ruleLinkDecl=ruleLinkDecl();

            state._fsp--;

             current =iv_ruleLinkDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLinkDecl3982); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1978:1: ruleLinkDecl returns [EObject current=null] : (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) otherlv_10= '{' ( (lv_attributes_11_0= ruleStateDecl ) )* otherlv_12= '}' ) ;
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
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1981:28: ( (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) otherlv_10= '{' ( (lv_attributes_11_0= ruleStateDecl ) )* otherlv_12= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1982:1: (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) otherlv_10= '{' ( (lv_attributes_11_0= ruleStateDecl ) )* otherlv_12= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1982:1: (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) otherlv_10= '{' ( (lv_attributes_11_0= ruleStateDecl ) )* otherlv_12= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1982:3: otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) otherlv_10= '{' ( (lv_attributes_11_0= ruleStateDecl ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleLinkDecl4019); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkDeclAccess().getLinkKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1986:1: ( (lv_id_1_0= RULE_STRING ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1987:1: (lv_id_1_0= RULE_STRING )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1987:1: (lv_id_1_0= RULE_STRING )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1988:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLinkDecl4036); 

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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLinkDecl4053); 

                	newLeafNode(otherlv_2, grammarAccess.getLinkDeclAccess().getColonKeyword_2());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2008:1: ( ( ruleQualifiedID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2009:1: ( ruleQualifiedID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2009:1: ( ruleQualifiedID )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2010:3: ruleQualifiedID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkDeclRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLinkDeclAccess().getKindKindCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleLinkDecl4076);
            ruleQualifiedID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2023:2: (otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==51) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2023:4: otherlv_4= 'mixins' ( ( ruleQualifiedID ) ) (otherlv_6= ',' ( ( ruleQualifiedID ) ) )*
                    {
                    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleLinkDecl4089); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinkDeclAccess().getMixinsKeyword_4_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2027:1: ( ( ruleQualifiedID ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2028:1: ( ruleQualifiedID )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2028:1: ( ruleQualifiedID )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2029:3: ruleQualifiedID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkDeclRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkDeclAccess().getMixinsMixinCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleLinkDecl4112);
                    ruleQualifiedID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2042:2: (otherlv_6= ',' ( ( ruleQualifiedID ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==22) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2042:4: otherlv_6= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLinkDecl4125); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getLinkDeclAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2046:1: ( ( ruleQualifiedID ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2047:1: ( ruleQualifiedID )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2047:1: ( ruleQualifiedID )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2048:3: ruleQualifiedID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getLinkDeclRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getLinkDeclAccess().getMixinsMixinCrossReference_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleLinkDecl4148);
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

            otherlv_8=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleLinkDecl4164); 

                	newLeafNode(otherlv_8, grammarAccess.getLinkDeclAccess().getTargetKeyword_5());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2065:1: ( (otherlv_9= RULE_STRING ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2066:1: (otherlv_9= RULE_STRING )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2066:1: (otherlv_9= RULE_STRING )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2067:3: otherlv_9= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkDeclRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLinkDecl4184); 

            		newLeafNode(otherlv_9, grammarAccess.getLinkDeclAccess().getTargetResourceCrossReference_6_0()); 
            	

            }


            }

            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLinkDecl4196); 

                	newLeafNode(otherlv_10, grammarAccess.getLinkDeclAccess().getLeftCurlyBracketKeyword_7());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2082:1: ( (lv_attributes_11_0= ruleStateDecl ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==52) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2083:1: (lv_attributes_11_0= ruleStateDecl )
            	    {
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2083:1: (lv_attributes_11_0= ruleStateDecl )
            	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2084:3: lv_attributes_11_0= ruleStateDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkDeclAccess().getAttributesStateDeclParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleStateDecl_in_ruleLinkDecl4217);
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

            otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLinkDecl4230); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2112:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2113:2: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2114:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID4267);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;

             current =iv_ruleQualifiedID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedID4278); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2121:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2124:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2125:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2125:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2125:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedID4318); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2132:1: (kw= '.' this_ID_2= RULE_ID )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==55) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2133:2: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleQualifiedID4337); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
                        
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedID4352); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
                        

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
    // $ANTLR end "ruleQualifiedID"


    // $ANTLR start "entryRuleInteger"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2153:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2154:2: (iv_ruleInteger= ruleInteger EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2155:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger4400);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger4411); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2162:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2165:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2166:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2166:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2166:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2166:2: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==56) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2167:2: kw= '-'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleInteger4450); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInteger4467); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2187:1: entryRulePositiveInteger returns [String current=null] : iv_rulePositiveInteger= rulePositiveInteger EOF ;
    public final String entryRulePositiveInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePositiveInteger = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2188:2: (iv_rulePositiveInteger= rulePositiveInteger EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2189:2: iv_rulePositiveInteger= rulePositiveInteger EOF
            {
             newCompositeNode(grammarAccess.getPositiveIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_entryRulePositiveInteger4513);
            iv_rulePositiveInteger=rulePositiveInteger();

            state._fsp--;

             current =iv_rulePositiveInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePositiveInteger4524); 

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
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2196:1: rulePositiveInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken rulePositiveInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2199:28: (this_INT_0= RULE_INT )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:2200:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulePositiveInteger4563); 

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
        public static final BitSet FOLLOW_11_in_ruleExtensionDecl241 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtensionDecl258 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleExtensionDecl275 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExtensionDecl292 = new BitSet(new long[]{0x000080040010A002L});
        public static final BitSet FOLLOW_13_in_ruleExtensionDecl310 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExtensionDecl330 = new BitSet(new long[]{0x000080040010E002L});
        public static final BitSet FOLLOW_14_in_ruleExtensionDecl343 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtensionDecl354 = new BitSet(new long[]{0x000080040010A002L});
        public static final BitSet FOLLOW_ruleKindDecl_in_ruleExtensionDecl379 = new BitSet(new long[]{0x0000800400108002L});
        public static final BitSet FOLLOW_ruleMixinDecl_in_ruleExtensionDecl406 = new BitSet(new long[]{0x0000800400108002L});
        public static final BitSet FOLLOW_ruleDataTypeDecl_in_ruleExtensionDecl433 = new BitSet(new long[]{0x0000800400108002L});
        public static final BitSet FOLLOW_ruleEnumTypeDecl_in_ruleExtensionDecl460 = new BitSet(new long[]{0x0000800400108002L});
        public static final BitSet FOLLOW_ruleKindDecl_in_entryRuleKindDecl498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKindDecl508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKindDecl545 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKindDecl562 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleKindDecl580 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleKindDecl603 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleKindDecl617 = new BitSet(new long[]{0x00000000820C0000L});
        public static final BitSet FOLLOW_18_in_ruleKindDecl630 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleKindDecl647 = new BitSet(new long[]{0x0000000082080000L});
        public static final BitSet FOLLOW_ruleAttributeDecl_in_ruleKindDecl676 = new BitSet(new long[]{0x0000000082080000L});
        public static final BitSet FOLLOW_ruleActionDecl_in_ruleKindDecl703 = new BitSet(new long[]{0x0000000082080000L});
        public static final BitSet FOLLOW_19_in_ruleKindDecl717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixinDecl_in_entryRuleMixinDecl753 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMixinDecl763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleMixinDecl800 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMixinDecl817 = new BitSet(new long[]{0x0000000000A20000L});
        public static final BitSet FOLLOW_21_in_ruleMixinDecl835 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMixinDecl858 = new BitSet(new long[]{0x0000000000C20000L});
        public static final BitSet FOLLOW_22_in_ruleMixinDecl871 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMixinDecl894 = new BitSet(new long[]{0x0000000000C20000L});
        public static final BitSet FOLLOW_23_in_ruleMixinDecl911 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMixinDecl934 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleMixinDecl947 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMixinDecl970 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleMixinDecl986 = new BitSet(new long[]{0x00000000830C0000L});
        public static final BitSet FOLLOW_24_in_ruleMixinDecl999 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMixinDecl1016 = new BitSet(new long[]{0x00000000820C0000L});
        public static final BitSet FOLLOW_18_in_ruleMixinDecl1036 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMixinDecl1053 = new BitSet(new long[]{0x0000000082080000L});
        public static final BitSet FOLLOW_ruleAttributeDecl_in_ruleMixinDecl1082 = new BitSet(new long[]{0x0000000082080000L});
        public static final BitSet FOLLOW_ruleActionDecl_in_ruleMixinDecl1109 = new BitSet(new long[]{0x0000000082080000L});
        public static final BitSet FOLLOW_19_in_ruleMixinDecl1123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeDecl_in_entryRuleAttributeDecl1159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDecl1169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleAttributeDecl1206 = new BitSet(new long[]{0x000000000C000010L});
        public static final BitSet FOLLOW_26_in_ruleAttributeDecl1224 = new BitSet(new long[]{0x0000000008000010L});
        public static final BitSet FOLLOW_27_in_ruleAttributeDecl1256 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDecl1287 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAttributeDecl1304 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleAttributeDecl1327 = new BitSet(new long[]{0x0000000030020002L});
        public static final BitSet FOLLOW_28_in_ruleAttributeDecl1340 = new BitSet(new long[]{0x0000000020020002L});
        public static final BitSet FOLLOW_29_in_ruleAttributeDecl1355 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeDecl1372 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleAttributeDecl1392 = new BitSet(new long[]{0x0000000040080000L});
        public static final BitSet FOLLOW_30_in_ruleAttributeDecl1405 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeDecl1422 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAttributeDecl1441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActionDecl_in_entryRuleActionDecl1479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActionDecl1489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleActionDecl1526 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleActionDecl1543 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleActionDecl1560 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleParameterDecl_in_ruleActionDecl1582 = new BitSet(new long[]{0x0000000200400000L});
        public static final BitSet FOLLOW_22_in_ruleActionDecl1595 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDecl_in_ruleActionDecl1616 = new BitSet(new long[]{0x0000000200400000L});
        public static final BitSet FOLLOW_33_in_ruleActionDecl1632 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleActionDecl1645 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleActionDecl1657 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleActionDecl1674 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleActionDecl1691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterDecl_in_entryRuleParameterDecl1729 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterDecl1739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDecl1781 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParameterDecl1798 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleParameterDecl1821 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleParameterDecl1839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataTypeDecl_in_entryRuleDataTypeDecl1889 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeDecl1899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleDataTypeDecl1945 = new BitSet(new long[]{0x0000000800000010L});
        public static final BitSet FOLLOW_35_in_ruleDataTypeDecl1963 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeDecl1994 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataTypeDecl2011 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDataTypeDecl2028 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleDataTypeDecl2046 = new BitSet(new long[]{0x00007FF000000000L});
        public static final BitSet FOLLOW_ruleDataTypeAnnotations_in_ruleDataTypeDecl2067 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDataTypeDecl2079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataTypeAnnotations_in_entryRuleDataTypeAnnotations2117 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeAnnotations2127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataTypeAnnotation_in_ruleDataTypeAnnotations2172 = new BitSet(new long[]{0x00007FF000000002L});
        public static final BitSet FOLLOW_ruleDataTypeAnnotation_in_entryRuleDataTypeAnnotation2208 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeAnnotation2218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleDataTypeAnnotation2262 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDataTypeAnnotation2287 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleDataTypeAnnotation2334 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleDataTypeAnnotation2359 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDataTypeAnnotation2371 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleDataTypeAnnotation2418 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDataTypeAnnotation2443 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleDataTypeAnnotation2490 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDataTypeAnnotation2515 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleDataTypeAnnotation2536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleDataTypeAnnotation2562 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDataTypeAnnotation2587 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleDataTypeAnnotation2634 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDataTypeAnnotation2659 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleDataTypeAnnotation2706 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDataTypeAnnotation2731 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleDataTypeAnnotation2778 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDataTypeAnnotation2803 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleDataTypeAnnotation2850 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDataTypeAnnotation2875 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleDataTypeAnnotation2922 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDataTypeAnnotation2947 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_ruleDataTypeAnnotation2968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleDataTypeAnnotation2994 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDataTypeAnnotation3019 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDataTypeAnnotation3036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumTypeDecl_in_entryRuleEnumTypeDecl3078 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeDecl3088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEnumTypeDecl3134 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumTypeDecl3151 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEnumTypeDecl3168 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumLiteralDecl_in_ruleEnumTypeDecl3189 = new BitSet(new long[]{0x0000000000480000L});
        public static final BitSet FOLLOW_22_in_ruleEnumTypeDecl3202 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumLiteralDecl_in_ruleEnumTypeDecl3223 = new BitSet(new long[]{0x0000000000480000L});
        public static final BitSet FOLLOW_19_in_ruleEnumTypeDecl3237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiteralDecl_in_entryRuleEnumLiteralDecl3273 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteralDecl3283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteralDecl3334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfigurationDecl_in_entryRuleConfigurationDecl3375 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationDecl3385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleConfigurationDecl3431 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_49_in_ruleConfigurationDecl3444 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleConfigurationDecl3464 = new BitSet(new long[]{0x0006000000004002L});
        public static final BitSet FOLLOW_14_in_ruleConfigurationDecl3477 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConfigurationDecl3488 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_ruleResourceDecl_in_ruleConfigurationDecl3512 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleResourceDecl_in_entryRuleResourceDecl3549 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResourceDecl3559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleResourceDecl3596 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceDecl3613 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleResourceDecl3630 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleResourceDecl3653 = new BitSet(new long[]{0x0008000000020000L});
        public static final BitSet FOLLOW_51_in_ruleResourceDecl3666 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleResourceDecl3689 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleResourceDecl3702 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleResourceDecl3725 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleResourceDecl3741 = new BitSet(new long[]{0x0030000000080000L});
        public static final BitSet FOLLOW_ruleStateDecl_in_ruleResourceDecl3762 = new BitSet(new long[]{0x0030000000080000L});
        public static final BitSet FOLLOW_ruleLinkDecl_in_ruleResourceDecl3784 = new BitSet(new long[]{0x0020000000080000L});
        public static final BitSet FOLLOW_19_in_ruleResourceDecl3797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateDecl_in_entryRuleStateDecl3833 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateDecl3843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleStateDecl3880 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStateDecl3897 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleStateDecl3914 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStateDecl3931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinkDecl_in_entryRuleLinkDecl3972 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLinkDecl3982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleLinkDecl4019 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkDecl4036 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLinkDecl4053 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleLinkDecl4076 = new BitSet(new long[]{0x0048000000000000L});
        public static final BitSet FOLLOW_51_in_ruleLinkDecl4089 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleLinkDecl4112 = new BitSet(new long[]{0x0040000000400000L});
        public static final BitSet FOLLOW_22_in_ruleLinkDecl4125 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleLinkDecl4148 = new BitSet(new long[]{0x0040000000400000L});
        public static final BitSet FOLLOW_54_in_ruleLinkDecl4164 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkDecl4184 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLinkDecl4196 = new BitSet(new long[]{0x0010000000080000L});
        public static final BitSet FOLLOW_ruleStateDecl_in_ruleLinkDecl4217 = new BitSet(new long[]{0x0010000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLinkDecl4230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID4267 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID4278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID4318 = new BitSet(new long[]{0x0080000000000002L});
        public static final BitSet FOLLOW_55_in_ruleQualifiedID4337 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID4352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger4400 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger4411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleInteger4450 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInteger4467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_entryRulePositiveInteger4513 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePositiveInteger4524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rulePositiveInteger4563 = new BitSet(new long[]{0x0000000000000002L});
    }


}