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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Extension'", "'{'", "'scheme'", "'import'", "'('", "','", "')'", "'kinds'", "'}'", "'mixins'", "'Kind'", "'title'", "'parent'", "'attributes'", "'actions'", "'Mixin'", "'Attribute'", "'mutable'", "'required'", "'default'", "'description'", "'Action'", "'EEnum'", "'instanceClassName'", "'instanceTypeName'", "'serializable'", "'eLiterals'", "'EEnumLiteral'", "'value'", "'literal'", "'EDataType'", "'true'", "'false'", "'-'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public static final int T__44=44;
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
        	return "Extension";	
       	}
       	
       	@Override
       	protected OCCIGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleExtension"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:67:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:68:2: (iv_ruleExtension= ruleExtension EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:69:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_entryRuleExtension75);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtension85); 

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
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:76:1: ruleExtension returns [EObject current=null] : (otherlv_0= 'Extension' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'import' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'kinds' otherlv_12= '{' ( (lv_kinds_13_0= ruleKind ) ) (otherlv_14= ',' ( (lv_kinds_15_0= ruleKind ) ) )* otherlv_16= '}' )? (otherlv_17= 'mixins' otherlv_18= '{' ( (lv_mixins_19_0= ruleMixin ) ) (otherlv_20= ',' ( (lv_mixins_21_0= ruleMixin ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_scheme_4_0 = null;

        EObject lv_kinds_13_0 = null;

        EObject lv_kinds_15_0 = null;

        EObject lv_mixins_19_0 = null;

        EObject lv_mixins_21_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:79:28: ( (otherlv_0= 'Extension' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'import' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'kinds' otherlv_12= '{' ( (lv_kinds_13_0= ruleKind ) ) (otherlv_14= ',' ( (lv_kinds_15_0= ruleKind ) ) )* otherlv_16= '}' )? (otherlv_17= 'mixins' otherlv_18= '{' ( (lv_mixins_19_0= ruleMixin ) ) (otherlv_20= ',' ( (lv_mixins_21_0= ruleMixin ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:80:1: (otherlv_0= 'Extension' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'import' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'kinds' otherlv_12= '{' ( (lv_kinds_13_0= ruleKind ) ) (otherlv_14= ',' ( (lv_kinds_15_0= ruleKind ) ) )* otherlv_16= '}' )? (otherlv_17= 'mixins' otherlv_18= '{' ( (lv_mixins_19_0= ruleMixin ) ) (otherlv_20= ',' ( (lv_mixins_21_0= ruleMixin ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:80:1: (otherlv_0= 'Extension' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'import' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'kinds' otherlv_12= '{' ( (lv_kinds_13_0= ruleKind ) ) (otherlv_14= ',' ( (lv_kinds_15_0= ruleKind ) ) )* otherlv_16= '}' )? (otherlv_17= 'mixins' otherlv_18= '{' ( (lv_mixins_19_0= ruleMixin ) ) (otherlv_20= ',' ( (lv_mixins_21_0= ruleMixin ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:80:3: otherlv_0= 'Extension' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'import' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'kinds' otherlv_12= '{' ( (lv_kinds_13_0= ruleKind ) ) (otherlv_14= ',' ( (lv_kinds_15_0= ruleKind ) ) )* otherlv_16= '}' )? (otherlv_17= 'mixins' otherlv_18= '{' ( (lv_mixins_19_0= ruleMixin ) ) (otherlv_20= ',' ( (lv_mixins_21_0= ruleMixin ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleExtension122); 

                	newLeafNode(otherlv_0, grammarAccess.getExtensionAccess().getExtensionKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:84:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:85:1: (lv_name_1_0= ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:85:1: (lv_name_1_0= ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:86:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExtensionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtension143);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtensionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleExtension155); 

                	newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExtension167); 

                	newLeafNode(otherlv_3, grammarAccess.getExtensionAccess().getSchemeKeyword_3());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:110:1: ( (lv_scheme_4_0= ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:111:1: (lv_scheme_4_0= ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:111:1: (lv_scheme_4_0= ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:112:3: lv_scheme_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExtensionAccess().getSchemeEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtension188);
            lv_scheme_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtensionRule());
            	        }
                   		set(
                   			current, 
                   			"scheme",
                    		lv_scheme_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:128:2: (otherlv_5= 'import' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:128:4: otherlv_5= 'import' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtension201); 

                        	newLeafNode(otherlv_5, grammarAccess.getExtensionAccess().getImportKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExtension213); 

                        	newLeafNode(otherlv_6, grammarAccess.getExtensionAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:136:1: ( ( ruleEString ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:137:1: ( ruleEString )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:137:1: ( ruleEString )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:138:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtensionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getImportExtensionCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtension236);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:151:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:151:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExtension249); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getExtensionAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:155:1: ( ( ruleEString ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:156:1: ( ruleEString )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:156:1: ( ruleEString )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:157:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getExtensionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getImportExtensionCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtension272);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleExtension286); 

                        	newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:174:3: (otherlv_11= 'kinds' otherlv_12= '{' ( (lv_kinds_13_0= ruleKind ) ) (otherlv_14= ',' ( (lv_kinds_15_0= ruleKind ) ) )* otherlv_16= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:174:5: otherlv_11= 'kinds' otherlv_12= '{' ( (lv_kinds_13_0= ruleKind ) ) (otherlv_14= ',' ( (lv_kinds_15_0= ruleKind ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtension301); 

                        	newLeafNode(otherlv_11, grammarAccess.getExtensionAccess().getKindsKeyword_6_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleExtension313); 

                        	newLeafNode(otherlv_12, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:182:1: ( (lv_kinds_13_0= ruleKind ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:183:1: (lv_kinds_13_0= ruleKind )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:183:1: (lv_kinds_13_0= ruleKind )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:184:3: lv_kinds_13_0= ruleKind
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getKindsKindParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleKind_in_ruleExtension334);
                    lv_kinds_13_0=ruleKind();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	        }
                           		add(
                           			current, 
                           			"kinds",
                            		lv_kinds_13_0, 
                            		"Kind");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:200:2: (otherlv_14= ',' ( (lv_kinds_15_0= ruleKind ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:200:4: otherlv_14= ',' ( (lv_kinds_15_0= ruleKind ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExtension347); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getExtensionAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:204:1: ( (lv_kinds_15_0= ruleKind ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:205:1: (lv_kinds_15_0= ruleKind )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:205:1: (lv_kinds_15_0= ruleKind )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:206:3: lv_kinds_15_0= ruleKind
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getKindsKindParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleKind_in_ruleExtension368);
                    	    lv_kinds_15_0=ruleKind();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"kinds",
                    	            		lv_kinds_15_0, 
                    	            		"Kind");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtension382); 

                        	newLeafNode(otherlv_16, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:226:3: (otherlv_17= 'mixins' otherlv_18= '{' ( (lv_mixins_19_0= ruleMixin ) ) (otherlv_20= ',' ( (lv_mixins_21_0= ruleMixin ) ) )* otherlv_22= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:226:5: otherlv_17= 'mixins' otherlv_18= '{' ( (lv_mixins_19_0= ruleMixin ) ) (otherlv_20= ',' ( (lv_mixins_21_0= ruleMixin ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleExtension397); 

                        	newLeafNode(otherlv_17, grammarAccess.getExtensionAccess().getMixinsKeyword_7_0());
                        
                    otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleExtension409); 

                        	newLeafNode(otherlv_18, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:234:1: ( (lv_mixins_19_0= ruleMixin ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:235:1: (lv_mixins_19_0= ruleMixin )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:235:1: (lv_mixins_19_0= ruleMixin )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:236:3: lv_mixins_19_0= ruleMixin
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getMixinsMixinParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMixin_in_ruleExtension430);
                    lv_mixins_19_0=ruleMixin();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	        }
                           		add(
                           			current, 
                           			"mixins",
                            		lv_mixins_19_0, 
                            		"Mixin");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:252:2: (otherlv_20= ',' ( (lv_mixins_21_0= ruleMixin ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:252:4: otherlv_20= ',' ( (lv_mixins_21_0= ruleMixin ) )
                    	    {
                    	    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExtension443); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getExtensionAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:256:1: ( (lv_mixins_21_0= ruleMixin ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:257:1: (lv_mixins_21_0= ruleMixin )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:257:1: (lv_mixins_21_0= ruleMixin )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:258:3: lv_mixins_21_0= ruleMixin
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getMixinsMixinParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMixin_in_ruleExtension464);
                    	    lv_mixins_21_0=ruleMixin();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"mixins",
                    	            		lv_mixins_21_0, 
                    	            		"Mixin");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtension478); 

                        	newLeafNode(otherlv_22, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtension492); 

                	newLeafNode(otherlv_23, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleKind"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:290:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:291:2: (iv_ruleKind= ruleKind EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:292:2: iv_ruleKind= ruleKind EOF
            {
             newCompositeNode(grammarAccess.getKindRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKind_in_entryRuleKind528);
            iv_ruleKind=ruleKind();

            state._fsp--;

             current =iv_ruleKind; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKind538); 

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
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:299:1: ruleKind returns [EObject current=null] : (otherlv_0= 'Kind' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'parent' ( ( ruleEString ) ) )? (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'actions' otherlv_16= '{' ( (lv_actions_17_0= ruleAction ) ) (otherlv_18= ',' ( (lv_actions_19_0= ruleAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_term_1_0 = null;

        AntlrDatatypeRuleToken lv_scheme_4_0 = null;

        AntlrDatatypeRuleToken lv_title_6_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_attributes_13_0 = null;

        EObject lv_actions_17_0 = null;

        EObject lv_actions_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:302:28: ( (otherlv_0= 'Kind' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'parent' ( ( ruleEString ) ) )? (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'actions' otherlv_16= '{' ( (lv_actions_17_0= ruleAction ) ) (otherlv_18= ',' ( (lv_actions_19_0= ruleAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:303:1: (otherlv_0= 'Kind' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'parent' ( ( ruleEString ) ) )? (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'actions' otherlv_16= '{' ( (lv_actions_17_0= ruleAction ) ) (otherlv_18= ',' ( (lv_actions_19_0= ruleAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:303:1: (otherlv_0= 'Kind' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'parent' ( ( ruleEString ) ) )? (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'actions' otherlv_16= '{' ( (lv_actions_17_0= ruleAction ) ) (otherlv_18= ',' ( (lv_actions_19_0= ruleAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:303:3: otherlv_0= 'Kind' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'parent' ( ( ruleEString ) ) )? (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'actions' otherlv_16= '{' ( (lv_actions_17_0= ruleAction ) ) (otherlv_18= ',' ( (lv_actions_19_0= ruleAction ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleKind575); 

                	newLeafNode(otherlv_0, grammarAccess.getKindAccess().getKindKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:307:1: ( (lv_term_1_0= ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:308:1: (lv_term_1_0= ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:308:1: (lv_term_1_0= ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:309:3: lv_term_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getKindAccess().getTermEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKind596);
            lv_term_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKindRule());
            	        }
                   		set(
                   			current, 
                   			"term",
                    		lv_term_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleKind608); 

                	newLeafNode(otherlv_2, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleKind620); 

                	newLeafNode(otherlv_3, grammarAccess.getKindAccess().getSchemeKeyword_3());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:333:1: ( (lv_scheme_4_0= ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:334:1: (lv_scheme_4_0= ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:334:1: (lv_scheme_4_0= ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:335:3: lv_scheme_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getKindAccess().getSchemeEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKind641);
            lv_scheme_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKindRule());
            	        }
                   		set(
                   			current, 
                   			"scheme",
                    		lv_scheme_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:351:2: (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:351:4: otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleKind654); 

                        	newLeafNode(otherlv_5, grammarAccess.getKindAccess().getTitleKeyword_5_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:355:1: ( (lv_title_6_0= ruleEString ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:356:1: (lv_title_6_0= ruleEString )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:356:1: (lv_title_6_0= ruleEString )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:357:3: lv_title_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindAccess().getTitleEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKind675);
                    lv_title_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKindRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:373:4: (otherlv_7= 'parent' ( ( ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:373:6: otherlv_7= 'parent' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleKind690); 

                        	newLeafNode(otherlv_7, grammarAccess.getKindAccess().getParentKeyword_6_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:377:1: ( ( ruleEString ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:378:1: ( ruleEString )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:378:1: ( ruleEString )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:379:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getKindRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getKindAccess().getParentKindCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKind713);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:392:4: (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:392:6: otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleKind728); 

                        	newLeafNode(otherlv_9, grammarAccess.getKindAccess().getAttributesKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleKind740); 

                        	newLeafNode(otherlv_10, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:400:1: ( (lv_attributes_11_0= ruleAttribute ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:401:1: (lv_attributes_11_0= ruleAttribute )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:401:1: (lv_attributes_11_0= ruleAttribute )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:402:3: lv_attributes_11_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleKind761);
                    lv_attributes_11_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKindRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_11_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:418:2: (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:418:4: otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKind774); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getKindAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:422:1: ( (lv_attributes_13_0= ruleAttribute ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:423:1: (lv_attributes_13_0= ruleAttribute )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:423:1: (lv_attributes_13_0= ruleAttribute )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:424:3: lv_attributes_13_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleKind795);
                    	    lv_attributes_13_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKindRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_13_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleKind809); 

                        	newLeafNode(otherlv_14, grammarAccess.getKindAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:444:3: (otherlv_15= 'actions' otherlv_16= '{' ( (lv_actions_17_0= ruleAction ) ) (otherlv_18= ',' ( (lv_actions_19_0= ruleAction ) ) )* otherlv_20= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:444:5: otherlv_15= 'actions' otherlv_16= '{' ( (lv_actions_17_0= ruleAction ) ) (otherlv_18= ',' ( (lv_actions_19_0= ruleAction ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleKind824); 

                        	newLeafNode(otherlv_15, grammarAccess.getKindAccess().getActionsKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleKind836); 

                        	newLeafNode(otherlv_16, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:452:1: ( (lv_actions_17_0= ruleAction ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:453:1: (lv_actions_17_0= ruleAction )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:453:1: (lv_actions_17_0= ruleAction )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:454:3: lv_actions_17_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindAccess().getActionsActionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleKind857);
                    lv_actions_17_0=ruleAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKindRule());
                    	        }
                           		add(
                           			current, 
                           			"actions",
                            		lv_actions_17_0, 
                            		"Action");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:470:2: (otherlv_18= ',' ( (lv_actions_19_0= ruleAction ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:470:4: otherlv_18= ',' ( (lv_actions_19_0= ruleAction ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKind870); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getKindAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:474:1: ( (lv_actions_19_0= ruleAction ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:475:1: (lv_actions_19_0= ruleAction )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:475:1: (lv_actions_19_0= ruleAction )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:476:3: lv_actions_19_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKindAccess().getActionsActionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleKind891);
                    	    lv_actions_19_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKindRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_19_0, 
                    	            		"Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleKind905); 

                        	newLeafNode(otherlv_20, grammarAccess.getKindAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleKind919); 

                	newLeafNode(otherlv_21, grammarAccess.getKindAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleKind"


    // $ANTLR start "entryRuleMixin"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:508:1: entryRuleMixin returns [EObject current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final EObject entryRuleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixin = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:509:2: (iv_ruleMixin= ruleMixin EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:510:2: iv_ruleMixin= ruleMixin EOF
            {
             newCompositeNode(grammarAccess.getMixinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMixin_in_entryRuleMixin955);
            iv_ruleMixin=ruleMixin();

            state._fsp--;

             current =iv_ruleMixin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMixin965); 

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
    // $ANTLR end "entryRuleMixin"


    // $ANTLR start "ruleMixin"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:517:1: ruleMixin returns [EObject current=null] : (otherlv_0= 'Mixin' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'actions' otherlv_14= '{' ( (lv_actions_15_0= ruleAction ) ) (otherlv_16= ',' ( (lv_actions_17_0= ruleAction ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleMixin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_term_1_0 = null;

        AntlrDatatypeRuleToken lv_scheme_4_0 = null;

        AntlrDatatypeRuleToken lv_title_6_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_actions_15_0 = null;

        EObject lv_actions_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:520:28: ( (otherlv_0= 'Mixin' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'actions' otherlv_14= '{' ( (lv_actions_15_0= ruleAction ) ) (otherlv_16= ',' ( (lv_actions_17_0= ruleAction ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:521:1: (otherlv_0= 'Mixin' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'actions' otherlv_14= '{' ( (lv_actions_15_0= ruleAction ) ) (otherlv_16= ',' ( (lv_actions_17_0= ruleAction ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:521:1: (otherlv_0= 'Mixin' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'actions' otherlv_14= '{' ( (lv_actions_15_0= ruleAction ) ) (otherlv_16= ',' ( (lv_actions_17_0= ruleAction ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:521:3: otherlv_0= 'Mixin' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'actions' otherlv_14= '{' ( (lv_actions_15_0= ruleAction ) ) (otherlv_16= ',' ( (lv_actions_17_0= ruleAction ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMixin1002); 

                	newLeafNode(otherlv_0, grammarAccess.getMixinAccess().getMixinKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:525:1: ( (lv_term_1_0= ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:526:1: (lv_term_1_0= ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:526:1: (lv_term_1_0= ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:527:3: lv_term_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMixinAccess().getTermEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMixin1023);
            lv_term_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMixinRule());
            	        }
                   		set(
                   			current, 
                   			"term",
                    		lv_term_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMixin1035); 

                	newLeafNode(otherlv_2, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMixin1047); 

                	newLeafNode(otherlv_3, grammarAccess.getMixinAccess().getSchemeKeyword_3());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:551:1: ( (lv_scheme_4_0= ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:552:1: (lv_scheme_4_0= ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:552:1: (lv_scheme_4_0= ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:553:3: lv_scheme_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMixinAccess().getSchemeEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMixin1068);
            lv_scheme_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMixinRule());
            	        }
                   		set(
                   			current, 
                   			"scheme",
                    		lv_scheme_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:569:2: (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:569:4: otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMixin1081); 

                        	newLeafNode(otherlv_5, grammarAccess.getMixinAccess().getTitleKeyword_5_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:573:1: ( (lv_title_6_0= ruleEString ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:574:1: (lv_title_6_0= ruleEString )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:574:1: (lv_title_6_0= ruleEString )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:575:3: lv_title_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMixinAccess().getTitleEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMixin1102);
                    lv_title_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMixinRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:591:4: (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:591:6: otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMixin1117); 

                        	newLeafNode(otherlv_7, grammarAccess.getMixinAccess().getAttributesKeyword_6_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMixin1129); 

                        	newLeafNode(otherlv_8, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:599:1: ( (lv_attributes_9_0= ruleAttribute ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:600:1: (lv_attributes_9_0= ruleAttribute )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:600:1: (lv_attributes_9_0= ruleAttribute )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:601:3: lv_attributes_9_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleMixin1150);
                    lv_attributes_9_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMixinRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_9_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:617:2: (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:617:4: otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMixin1163); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getMixinAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:621:1: ( (lv_attributes_11_0= ruleAttribute ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:622:1: (lv_attributes_11_0= ruleAttribute )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:622:1: (lv_attributes_11_0= ruleAttribute )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:623:3: lv_attributes_11_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleMixin1184);
                    	    lv_attributes_11_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMixinRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_11_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMixin1198); 

                        	newLeafNode(otherlv_12, grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:643:3: (otherlv_13= 'actions' otherlv_14= '{' ( (lv_actions_15_0= ruleAction ) ) (otherlv_16= ',' ( (lv_actions_17_0= ruleAction ) ) )* otherlv_18= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:643:5: otherlv_13= 'actions' otherlv_14= '{' ( (lv_actions_15_0= ruleAction ) ) (otherlv_16= ',' ( (lv_actions_17_0= ruleAction ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMixin1213); 

                        	newLeafNode(otherlv_13, grammarAccess.getMixinAccess().getActionsKeyword_7_0());
                        
                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMixin1225); 

                        	newLeafNode(otherlv_14, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:651:1: ( (lv_actions_15_0= ruleAction ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:652:1: (lv_actions_15_0= ruleAction )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:652:1: (lv_actions_15_0= ruleAction )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:653:3: lv_actions_15_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleMixin1246);
                    lv_actions_15_0=ruleAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMixinRule());
                    	        }
                           		add(
                           			current, 
                           			"actions",
                            		lv_actions_15_0, 
                            		"Action");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:669:2: (otherlv_16= ',' ( (lv_actions_17_0= ruleAction ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:669:4: otherlv_16= ',' ( (lv_actions_17_0= ruleAction ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMixin1259); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getMixinAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:673:1: ( (lv_actions_17_0= ruleAction ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:674:1: (lv_actions_17_0= ruleAction )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:674:1: (lv_actions_17_0= ruleAction )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:675:3: lv_actions_17_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleMixin1280);
                    	    lv_actions_17_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMixinRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_17_0, 
                    	            		"Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMixin1294); 

                        	newLeafNode(otherlv_18, grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMixin1308); 

                	newLeafNode(otherlv_19, grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleMixin"


    // $ANTLR start "entryRuleAttribute"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:707:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:708:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:709:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute1344);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute1354); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:716:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'mutable' ( (lv_mutable_4_0= ruleEBoolean ) ) )? (otherlv_5= 'required' ( (lv_required_6_0= ruleEBoolean ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_mutable_4_0 = null;

        AntlrDatatypeRuleToken lv_required_6_0 = null;

        AntlrDatatypeRuleToken lv_default_8_0 = null;

        AntlrDatatypeRuleToken lv_description_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:719:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'mutable' ( (lv_mutable_4_0= ruleEBoolean ) ) )? (otherlv_5= 'required' ( (lv_required_6_0= ruleEBoolean ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:720:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'mutable' ( (lv_mutable_4_0= ruleEBoolean ) ) )? (otherlv_5= 'required' ( (lv_required_6_0= ruleEBoolean ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:720:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'mutable' ( (lv_mutable_4_0= ruleEBoolean ) ) )? (otherlv_5= 'required' ( (lv_required_6_0= ruleEBoolean ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:720:3: otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'mutable' ( (lv_mutable_4_0= ruleEBoolean ) ) )? (otherlv_5= 'required' ( (lv_required_6_0= ruleEBoolean ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAttribute1391); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:724:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:725:1: (lv_name_1_0= ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:725:1: (lv_name_1_0= ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:726:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttribute1412);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAttribute1424); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:746:1: (otherlv_3= 'mutable' ( (lv_mutable_4_0= ruleEBoolean ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:746:3: otherlv_3= 'mutable' ( (lv_mutable_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAttribute1437); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getMutableKeyword_3_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:750:1: ( (lv_mutable_4_0= ruleEBoolean ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:751:1: (lv_mutable_4_0= ruleEBoolean )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:751:1: (lv_mutable_4_0= ruleEBoolean )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:752:3: lv_mutable_4_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getMutableEBooleanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleAttribute1458);
                    lv_mutable_4_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"mutable",
                            		lv_mutable_4_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:768:4: (otherlv_5= 'required' ( (lv_required_6_0= ruleEBoolean ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:768:6: otherlv_5= 'required' ( (lv_required_6_0= ruleEBoolean ) )
                    {
                    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAttribute1473); 

                        	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRequiredKeyword_4_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:772:1: ( (lv_required_6_0= ruleEBoolean ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:773:1: (lv_required_6_0= ruleEBoolean )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:773:1: (lv_required_6_0= ruleEBoolean )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:774:3: lv_required_6_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getRequiredEBooleanParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleAttribute1494);
                    lv_required_6_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"required",
                            		lv_required_6_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:790:4: (otherlv_7= 'default' ( (lv_default_8_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:790:6: otherlv_7= 'default' ( (lv_default_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAttribute1509); 

                        	newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getDefaultKeyword_5_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:794:1: ( (lv_default_8_0= ruleEString ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:795:1: (lv_default_8_0= ruleEString )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:795:1: (lv_default_8_0= ruleEString )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:796:3: lv_default_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getDefaultEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttribute1530);
                    lv_default_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"default",
                            		lv_default_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:812:4: (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:812:6: otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAttribute1545); 

                        	newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getDescriptionKeyword_6_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:816:1: ( (lv_description_10_0= ruleEString ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:817:1: (lv_description_10_0= ruleEString )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:817:1: (lv_description_10_0= ruleEString )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:818:3: lv_description_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttribute1566);
                    lv_description_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAttribute1580); 

                	newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAction"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:846:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:847:2: (iv_ruleAction= ruleAction EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:848:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction1616);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction1626); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:855:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_term_1_0 = null;

        AntlrDatatypeRuleToken lv_scheme_4_0 = null;

        AntlrDatatypeRuleToken lv_title_6_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:858:28: ( (otherlv_0= 'Action' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:859:1: (otherlv_0= 'Action' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:859:1: (otherlv_0= 'Action' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:859:3: otherlv_0= 'Action' ( (lv_term_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheme' ( (lv_scheme_4_0= ruleEString ) ) (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAction1663); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:863:1: ( (lv_term_1_0= ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:864:1: (lv_term_1_0= ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:864:1: (lv_term_1_0= ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:865:3: lv_term_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getTermEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction1684);
            lv_term_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"term",
                    		lv_term_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAction1696); 

                	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAction1708); 

                	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getSchemeKeyword_3());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:889:1: ( (lv_scheme_4_0= ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:890:1: (lv_scheme_4_0= ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:890:1: (lv_scheme_4_0= ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:891:3: lv_scheme_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getSchemeEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction1729);
            lv_scheme_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"scheme",
                    		lv_scheme_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:907:2: (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:907:4: otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAction1742); 

                        	newLeafNode(otherlv_5, grammarAccess.getActionAccess().getTitleKeyword_5_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:911:1: ( (lv_title_6_0= ruleEString ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:912:1: (lv_title_6_0= ruleEString )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:912:1: (lv_title_6_0= ruleEString )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:913:3: lv_title_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getTitleEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction1763);
                    lv_title_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:929:4: (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:929:6: otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAction1778); 

                        	newLeafNode(otherlv_7, grammarAccess.getActionAccess().getAttributesKeyword_6_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAction1790); 

                        	newLeafNode(otherlv_8, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:937:1: ( (lv_attributes_9_0= ruleAttribute ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:938:1: (lv_attributes_9_0= ruleAttribute )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:938:1: (lv_attributes_9_0= ruleAttribute )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:939:3: lv_attributes_9_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getAttributesAttributeParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleAction1811);
                    lv_attributes_9_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_9_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:955:2: (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==16) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:955:4: otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAction1824); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getActionAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:959:1: ( (lv_attributes_11_0= ruleAttribute ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:960:1: (lv_attributes_11_0= ruleAttribute )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:960:1: (lv_attributes_11_0= ruleAttribute )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:961:3: lv_attributes_11_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActionAccess().getAttributesAttributeParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleAction1845);
                    	    lv_attributes_11_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_11_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAction1859); 

                        	newLeafNode(otherlv_12, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAction1873); 

                	newLeafNode(otherlv_13, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleEEnum"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:993:1: entryRuleEEnum returns [EObject current=null] : iv_ruleEEnum= ruleEEnum EOF ;
    public final EObject entryRuleEEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnum = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:994:2: (iv_ruleEEnum= ruleEEnum EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:995:2: iv_ruleEEnum= ruleEEnum EOF
            {
             newCompositeNode(grammarAccess.getEEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEEnum_in_entryRuleEEnum1909);
            iv_ruleEEnum=ruleEEnum();

            state._fsp--;

             current =iv_ruleEEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEEnum1919); 

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
    // $ANTLR end "entryRuleEEnum"


    // $ANTLR start "ruleEEnum"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1002:1: ruleEEnum returns [EObject current=null] : ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eLiterals' otherlv_11= '{' ( (lv_eLiterals_12_0= ruleEEnumLiteral ) ) (otherlv_13= ',' ( (lv_eLiterals_14_0= ruleEEnumLiteral ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleEEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_5_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_7_0 = null;

        AntlrDatatypeRuleToken lv_serializable_9_0 = null;

        EObject lv_eLiterals_12_0 = null;

        EObject lv_eLiterals_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1005:28: ( ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eLiterals' otherlv_11= '{' ( (lv_eLiterals_12_0= ruleEEnumLiteral ) ) (otherlv_13= ',' ( (lv_eLiterals_14_0= ruleEEnumLiteral ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1006:1: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eLiterals' otherlv_11= '{' ( (lv_eLiterals_12_0= ruleEEnumLiteral ) ) (otherlv_13= ',' ( (lv_eLiterals_14_0= ruleEEnumLiteral ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1006:1: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eLiterals' otherlv_11= '{' ( (lv_eLiterals_12_0= ruleEEnumLiteral ) ) (otherlv_13= ',' ( (lv_eLiterals_14_0= ruleEEnumLiteral ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1006:2: () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eLiterals' otherlv_11= '{' ( (lv_eLiterals_12_0= ruleEEnumLiteral ) ) (otherlv_13= ',' ( (lv_eLiterals_14_0= ruleEEnumLiteral ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1006:2: ()
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1007:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEEnumAccess().getEEnumAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEEnum1965); 

                	newLeafNode(otherlv_1, grammarAccess.getEEnumAccess().getEEnumKeyword_1());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1016:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1017:1: (lv_name_2_0= ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1017:1: (lv_name_2_0= ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1018:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEEnumAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnum1986);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEEnumRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnum1998); 

                	newLeafNode(otherlv_3, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1038:1: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1038:3: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEEnum2011); 

                        	newLeafNode(otherlv_4, grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1042:1: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1043:1: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1043:1: (lv_instanceClassName_5_0= ruleEString )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1044:3: lv_instanceClassName_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnum2032);
                    lv_instanceClassName_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	        }
                           		set(
                           			current, 
                           			"instanceClassName",
                            		lv_instanceClassName_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1060:4: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1060:6: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEEnum2047); 

                        	newLeafNode(otherlv_6, grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1064:1: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1065:1: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1065:1: (lv_instanceTypeName_7_0= ruleEString )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1066:3: lv_instanceTypeName_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnum2068);
                    lv_instanceTypeName_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	        }
                           		set(
                           			current, 
                           			"instanceTypeName",
                            		lv_instanceTypeName_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1082:4: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1082:6: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEEnum2083); 

                        	newLeafNode(otherlv_8, grammarAccess.getEEnumAccess().getSerializableKeyword_6_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1086:1: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1087:1: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1087:1: (lv_serializable_9_0= ruleEBoolean )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1088:3: lv_serializable_9_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEEnum2104);
                    lv_serializable_9_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	        }
                           		set(
                           			current, 
                           			"serializable",
                            		lv_serializable_9_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1104:4: (otherlv_10= 'eLiterals' otherlv_11= '{' ( (lv_eLiterals_12_0= ruleEEnumLiteral ) ) (otherlv_13= ',' ( (lv_eLiterals_14_0= ruleEEnumLiteral ) ) )* otherlv_15= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1104:6: otherlv_10= 'eLiterals' otherlv_11= '{' ( (lv_eLiterals_12_0= ruleEEnumLiteral ) ) (otherlv_13= ',' ( (lv_eLiterals_14_0= ruleEEnumLiteral ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEEnum2119); 

                        	newLeafNode(otherlv_10, grammarAccess.getEEnumAccess().getELiteralsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnum2131); 

                        	newLeafNode(otherlv_11, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1112:1: ( (lv_eLiterals_12_0= ruleEEnumLiteral ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1113:1: (lv_eLiterals_12_0= ruleEEnumLiteral )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1113:1: (lv_eLiterals_12_0= ruleEEnumLiteral )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1114:3: lv_eLiterals_12_0= ruleEEnumLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_ruleEEnum2152);
                    lv_eLiterals_12_0=ruleEEnumLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	        }
                           		add(
                           			current, 
                           			"eLiterals",
                            		lv_eLiterals_12_0, 
                            		"EEnumLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1130:2: (otherlv_13= ',' ( (lv_eLiterals_14_0= ruleEEnumLiteral ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==16) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1130:4: otherlv_13= ',' ( (lv_eLiterals_14_0= ruleEEnumLiteral ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEEnum2165); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1134:1: ( (lv_eLiterals_14_0= ruleEEnumLiteral ) )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1135:1: (lv_eLiterals_14_0= ruleEEnumLiteral )
                    	    {
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1135:1: (lv_eLiterals_14_0= ruleEEnumLiteral )
                    	    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1136:3: lv_eLiterals_14_0= ruleEEnumLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_ruleEEnum2186);
                    	    lv_eLiterals_14_0=ruleEEnumLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eLiterals",
                    	            		lv_eLiterals_14_0, 
                    	            		"EEnumLiteral");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEEnum2200); 

                        	newLeafNode(otherlv_15, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEEnum2214); 

                	newLeafNode(otherlv_16, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleEEnum"


    // $ANTLR start "entryRuleEEnumLiteral"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1168:1: entryRuleEEnumLiteral returns [EObject current=null] : iv_ruleEEnumLiteral= ruleEEnumLiteral EOF ;
    public final EObject entryRuleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnumLiteral = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1169:2: (iv_ruleEEnumLiteral= ruleEEnumLiteral EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1170:2: iv_ruleEEnumLiteral= ruleEEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEEnumLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_entryRuleEEnumLiteral2250);
            iv_ruleEEnumLiteral=ruleEEnumLiteral();

            state._fsp--;

             current =iv_ruleEEnumLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEEnumLiteral2260); 

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
    // $ANTLR end "entryRuleEEnumLiteral"


    // $ANTLR start "ruleEEnumLiteral"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1177:1: ruleEEnumLiteral returns [EObject current=null] : ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_literal_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1180:28: ( ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1181:1: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1181:1: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1181:2: () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1181:2: ()
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1182:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEEnumLiteral2306); 

                	newLeafNode(otherlv_1, grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1191:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1192:1: (lv_name_2_0= ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1192:1: (lv_name_2_0= ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1193:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnumLiteral2327);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnumLiteral2339); 

                	newLeafNode(otherlv_3, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1213:1: (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1213:3: otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEEnumLiteral2352); 

                        	newLeafNode(otherlv_4, grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1217:1: ( (lv_value_5_0= ruleEInt ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1218:1: (lv_value_5_0= ruleEInt )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1218:1: (lv_value_5_0= ruleEInt )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1219:3: lv_value_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEEnumLiteral2373);
                    lv_value_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1235:4: (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1235:6: otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEEnumLiteral2388); 

                        	newLeafNode(otherlv_6, grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1239:1: ( (lv_literal_7_0= ruleEString ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1240:1: (lv_literal_7_0= ruleEString )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1240:1: (lv_literal_7_0= ruleEString )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1241:3: lv_literal_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnumLiteral2409);
                    lv_literal_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEEnumLiteral2423); 

                	newLeafNode(otherlv_8, grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleEEnumLiteral"


    // $ANTLR start "entryRuleEDataType_Impl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1269:1: entryRuleEDataType_Impl returns [EObject current=null] : iv_ruleEDataType_Impl= ruleEDataType_Impl EOF ;
    public final EObject entryRuleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType_Impl = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1270:2: (iv_ruleEDataType_Impl= ruleEDataType_Impl EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1271:2: iv_ruleEDataType_Impl= ruleEDataType_Impl EOF
            {
             newCompositeNode(grammarAccess.getEDataType_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDataType_Impl_in_entryRuleEDataType_Impl2459);
            iv_ruleEDataType_Impl=ruleEDataType_Impl();

            state._fsp--;

             current =iv_ruleEDataType_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDataType_Impl2469); 

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
    // $ANTLR end "entryRuleEDataType_Impl"


    // $ANTLR start "ruleEDataType_Impl"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1278:1: ruleEDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_5_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_7_0 = null;

        AntlrDatatypeRuleToken lv_serializable_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1281:28: ( ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? otherlv_10= '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1282:1: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? otherlv_10= '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1282:1: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? otherlv_10= '}' )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1282:2: () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? otherlv_10= '}'
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1282:2: ()
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1283:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEDataType_Impl2515); 

                	newLeafNode(otherlv_1, grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1292:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1293:1: (lv_name_2_0= ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1293:1: (lv_name_2_0= ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1294:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEDataType_Impl2536);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDataType_Impl2548); 

                	newLeafNode(otherlv_3, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1314:1: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1314:3: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEDataType_Impl2561); 

                        	newLeafNode(otherlv_4, grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1318:1: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1319:1: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1319:1: (lv_instanceClassName_5_0= ruleEString )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1320:3: lv_instanceClassName_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEDataType_Impl2582);
                    lv_instanceClassName_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"instanceClassName",
                            		lv_instanceClassName_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1336:4: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1336:6: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEDataType_Impl2597); 

                        	newLeafNode(otherlv_6, grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1340:1: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1341:1: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1341:1: (lv_instanceTypeName_7_0= ruleEString )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1342:3: lv_instanceTypeName_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEDataType_Impl2618);
                    lv_instanceTypeName_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"instanceTypeName",
                            		lv_instanceTypeName_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1358:4: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1358:6: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEDataType_Impl2633); 

                        	newLeafNode(otherlv_8, grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0());
                        
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1362:1: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1363:1: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1363:1: (lv_serializable_9_0= ruleEBoolean )
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1364:3: lv_serializable_9_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEDataType_Impl2654);
                    lv_serializable_9_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"serializable",
                            		lv_serializable_9_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEDataType_Impl2668); 

                	newLeafNode(otherlv_10, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleEDataType_Impl"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1394:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1395:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1396:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean2707);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean2718); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1403:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1406:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1407:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1407:1: (kw= 'true' | kw= 'false' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            else if ( (LA35_0==43) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1408:2: kw= 'true'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEBoolean2756); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1415:2: kw= 'false'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEBoolean2775); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEString"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1428:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1429:2: (iv_ruleEString= ruleEString EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1430:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2816);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2827); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1437:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1440:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1441:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1441:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1441:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2867); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1449:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2893); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1464:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1465:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1466:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2939);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2950); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1473:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1476:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1477:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1477:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1477:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1477:2: (kw= '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext/src-gen/org/occiware/clouddesigner/occi/xtext/parser/antlr/internal/InternalOCCI.g:1478:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEInt2989); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3006); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtension85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleExtension122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtension143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleExtension155 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleExtension167 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtension188 = new BitSet(new long[]{0x00000000001C4000L});
        public static final BitSet FOLLOW_14_in_ruleExtension201 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleExtension213 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtension236 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleExtension249 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtension272 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleExtension286 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_18_in_ruleExtension301 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleExtension313 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleKind_in_ruleExtension334 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleExtension347 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleKind_in_ruleExtension368 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleExtension382 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleExtension397 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleExtension409 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleMixin_in_ruleExtension430 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleExtension443 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleMixin_in_ruleExtension464 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleExtension478 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleExtension492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKind_in_entryRuleKind528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKind538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleKind575 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKind596 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleKind608 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleKind620 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKind641 = new BitSet(new long[]{0x0000000003C80000L});
        public static final BitSet FOLLOW_22_in_ruleKind654 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKind675 = new BitSet(new long[]{0x0000000003880000L});
        public static final BitSet FOLLOW_23_in_ruleKind690 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKind713 = new BitSet(new long[]{0x0000000003080000L});
        public static final BitSet FOLLOW_24_in_ruleKind728 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleKind740 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleKind761 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleKind774 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleKind795 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleKind809 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_25_in_ruleKind824 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleKind836 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleKind857 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleKind870 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleKind891 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleKind905 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleKind919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin955 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMixin965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleMixin1002 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMixin1023 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMixin1035 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMixin1047 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMixin1068 = new BitSet(new long[]{0x0000000003480000L});
        public static final BitSet FOLLOW_22_in_ruleMixin1081 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMixin1102 = new BitSet(new long[]{0x0000000003080000L});
        public static final BitSet FOLLOW_24_in_ruleMixin1117 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMixin1129 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleMixin1150 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleMixin1163 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleMixin1184 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleMixin1198 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_25_in_ruleMixin1213 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMixin1225 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleMixin1246 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleMixin1259 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleMixin1280 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleMixin1294 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMixin1308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleAttribute1391 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttribute1412 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAttribute1424 = new BitSet(new long[]{0x00000000F0080000L});
        public static final BitSet FOLLOW_28_in_ruleAttribute1437 = new BitSet(new long[]{0x00000C0000000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleAttribute1458 = new BitSet(new long[]{0x00000000E0080000L});
        public static final BitSet FOLLOW_29_in_ruleAttribute1473 = new BitSet(new long[]{0x00000C0000000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleAttribute1494 = new BitSet(new long[]{0x00000000C0080000L});
        public static final BitSet FOLLOW_30_in_ruleAttribute1509 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttribute1530 = new BitSet(new long[]{0x0000000080080000L});
        public static final BitSet FOLLOW_31_in_ruleAttribute1545 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttribute1566 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAttribute1580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1616 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction1626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAction1663 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction1684 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAction1696 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAction1708 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction1729 = new BitSet(new long[]{0x0000000001480000L});
        public static final BitSet FOLLOW_22_in_ruleAction1742 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction1763 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_24_in_ruleAction1778 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAction1790 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleAction1811 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleAction1824 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleAction1845 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleAction1859 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAction1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnum_in_entryRuleEEnum1909 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEEnum1919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEEnum1965 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnum1986 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnum1998 = new BitSet(new long[]{0x0000003C00080000L});
        public static final BitSet FOLLOW_34_in_ruleEEnum2011 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnum2032 = new BitSet(new long[]{0x0000003800080000L});
        public static final BitSet FOLLOW_35_in_ruleEEnum2047 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnum2068 = new BitSet(new long[]{0x0000003000080000L});
        public static final BitSet FOLLOW_36_in_ruleEEnum2083 = new BitSet(new long[]{0x00000C0000000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEEnum2104 = new BitSet(new long[]{0x0000002000080000L});
        public static final BitSet FOLLOW_37_in_ruleEEnum2119 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnum2131 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_ruleEEnum2152 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleEEnum2165 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_ruleEEnum2186 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleEEnum2200 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleEEnum2214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_entryRuleEEnumLiteral2250 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEEnumLiteral2260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleEEnumLiteral2306 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnumLiteral2327 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnumLiteral2339 = new BitSet(new long[]{0x0000018000080000L});
        public static final BitSet FOLLOW_39_in_ruleEEnumLiteral2352 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEEnumLiteral2373 = new BitSet(new long[]{0x0000010000080000L});
        public static final BitSet FOLLOW_40_in_ruleEEnumLiteral2388 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnumLiteral2409 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleEEnumLiteral2423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDataType_Impl_in_entryRuleEDataType_Impl2459 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDataType_Impl2469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleEDataType_Impl2515 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEDataType_Impl2536 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDataType_Impl2548 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_34_in_ruleEDataType_Impl2561 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEDataType_Impl2582 = new BitSet(new long[]{0x0000001800080000L});
        public static final BitSet FOLLOW_35_in_ruleEDataType_Impl2597 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEDataType_Impl2618 = new BitSet(new long[]{0x0000001000080000L});
        public static final BitSet FOLLOW_36_in_ruleEDataType_Impl2633 = new BitSet(new long[]{0x00000C0000000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEDataType_Impl2654 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleEDataType_Impl2668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2707 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEBoolean2756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEBoolean2775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2816 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2939 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEInt2989 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3006 = new BitSet(new long[]{0x0000000000000002L});
    }


}