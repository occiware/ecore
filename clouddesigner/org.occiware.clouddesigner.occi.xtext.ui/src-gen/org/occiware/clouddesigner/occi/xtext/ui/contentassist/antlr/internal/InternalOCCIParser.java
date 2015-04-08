package org.occiware.clouddesigner.occi.xtext.ui.contentassist.antlr.internal; 

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
import org.occiware.clouddesigner.occi.xtext.services.OCCIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOCCIParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Extension'", "'{'", "'scheme'", "'}'", "'import'", "'('", "')'", "','", "'kinds'", "'mixins'", "'Kind'", "'title'", "'parent'", "'attributes'", "'actions'", "'Mixin'", "'Attribute'", "'mutable'", "'required'", "'default'", "'description'", "'Action'", "'EEnum'", "'instanceClassName'", "'instanceTypeName'", "'serializable'", "'eLiterals'", "'EEnumLiteral'", "'value'", "'literal'", "'EDataType'", "'-'"
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
    public String getGrammarFileName() { return "../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g"; }


     
     	private OCCIGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(OCCIGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleExtension"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:60:1: entryRuleExtension : ruleExtension EOF ;
    public final void entryRuleExtension() throws RecognitionException {
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:61:1: ( ruleExtension EOF )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:62:1: ruleExtension EOF
            {
             before(grammarAccess.getExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_entryRuleExtension61);
            ruleExtension();

            state._fsp--;

             after(grammarAccess.getExtensionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtension68); 

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
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:69:1: ruleExtension : ( ( rule__Extension__Group__0 ) ) ;
    public final void ruleExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:73:2: ( ( ( rule__Extension__Group__0 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:74:1: ( ( rule__Extension__Group__0 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:74:1: ( ( rule__Extension__Group__0 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:75:1: ( rule__Extension__Group__0 )
            {
             before(grammarAccess.getExtensionAccess().getGroup()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:76:1: ( rule__Extension__Group__0 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:76:2: rule__Extension__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__0_in_ruleExtension94);
            rule__Extension__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleKind"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:88:1: entryRuleKind : ruleKind EOF ;
    public final void entryRuleKind() throws RecognitionException {
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:89:1: ( ruleKind EOF )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:90:1: ruleKind EOF
            {
             before(grammarAccess.getKindRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKind_in_entryRuleKind121);
            ruleKind();

            state._fsp--;

             after(grammarAccess.getKindRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKind128); 

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
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:97:1: ruleKind : ( ( rule__Kind__Group__0 ) ) ;
    public final void ruleKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:101:2: ( ( ( rule__Kind__Group__0 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:102:1: ( ( rule__Kind__Group__0 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:102:1: ( ( rule__Kind__Group__0 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:103:1: ( rule__Kind__Group__0 )
            {
             before(grammarAccess.getKindAccess().getGroup()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:104:1: ( rule__Kind__Group__0 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:104:2: rule__Kind__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__0_in_ruleKind154);
            rule__Kind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKind"


    // $ANTLR start "entryRuleMixin"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:116:1: entryRuleMixin : ruleMixin EOF ;
    public final void entryRuleMixin() throws RecognitionException {
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:117:1: ( ruleMixin EOF )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:118:1: ruleMixin EOF
            {
             before(grammarAccess.getMixinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMixin_in_entryRuleMixin181);
            ruleMixin();

            state._fsp--;

             after(grammarAccess.getMixinRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMixin188); 

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
    // $ANTLR end "entryRuleMixin"


    // $ANTLR start "ruleMixin"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:125:1: ruleMixin : ( ( rule__Mixin__Group__0 ) ) ;
    public final void ruleMixin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:129:2: ( ( ( rule__Mixin__Group__0 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:130:1: ( ( rule__Mixin__Group__0 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:130:1: ( ( rule__Mixin__Group__0 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:131:1: ( rule__Mixin__Group__0 )
            {
             before(grammarAccess.getMixinAccess().getGroup()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:132:1: ( rule__Mixin__Group__0 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:132:2: rule__Mixin__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__0_in_ruleMixin214);
            rule__Mixin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMixin"


    // $ANTLR start "entryRuleAttribute"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:144:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:145:1: ( ruleAttribute EOF )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:146:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute241);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute248); 

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
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:153:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:157:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:158:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:158:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:159:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:160:1: ( rule__Attribute__Group__0 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:160:2: rule__Attribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__0_in_ruleAttribute274);
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


    // $ANTLR start "entryRuleAction"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:172:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:173:1: ( ruleAction EOF )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:174:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction301);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction308); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:181:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:185:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:186:1: ( ( rule__Action__Group__0 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:186:1: ( ( rule__Action__Group__0 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:187:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:188:1: ( rule__Action__Group__0 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:188:2: rule__Action__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__0_in_ruleAction334);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleEEnum"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:200:1: entryRuleEEnum : ruleEEnum EOF ;
    public final void entryRuleEEnum() throws RecognitionException {
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:201:1: ( ruleEEnum EOF )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:202:1: ruleEEnum EOF
            {
             before(grammarAccess.getEEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEEnum_in_entryRuleEEnum361);
            ruleEEnum();

            state._fsp--;

             after(grammarAccess.getEEnumRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEEnum368); 

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
    // $ANTLR end "entryRuleEEnum"


    // $ANTLR start "ruleEEnum"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:209:1: ruleEEnum : ( ( rule__EEnum__Group__0 ) ) ;
    public final void ruleEEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:213:2: ( ( ( rule__EEnum__Group__0 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:214:1: ( ( rule__EEnum__Group__0 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:214:1: ( ( rule__EEnum__Group__0 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:215:1: ( rule__EEnum__Group__0 )
            {
             before(grammarAccess.getEEnumAccess().getGroup()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:216:1: ( rule__EEnum__Group__0 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:216:2: rule__EEnum__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__0_in_ruleEEnum394);
            rule__EEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEEnum"


    // $ANTLR start "entryRuleEEnumLiteral"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:228:1: entryRuleEEnumLiteral : ruleEEnumLiteral EOF ;
    public final void entryRuleEEnumLiteral() throws RecognitionException {
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:229:1: ( ruleEEnumLiteral EOF )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:230:1: ruleEEnumLiteral EOF
            {
             before(grammarAccess.getEEnumLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_entryRuleEEnumLiteral421);
            ruleEEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEEnumLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEEnumLiteral428); 

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
    // $ANTLR end "entryRuleEEnumLiteral"


    // $ANTLR start "ruleEEnumLiteral"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:237:1: ruleEEnumLiteral : ( ( rule__EEnumLiteral__Group__0 ) ) ;
    public final void ruleEEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:241:2: ( ( ( rule__EEnumLiteral__Group__0 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:242:1: ( ( rule__EEnumLiteral__Group__0 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:242:1: ( ( rule__EEnumLiteral__Group__0 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:243:1: ( rule__EEnumLiteral__Group__0 )
            {
             before(grammarAccess.getEEnumLiteralAccess().getGroup()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:244:1: ( rule__EEnumLiteral__Group__0 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:244:2: rule__EEnumLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group__0_in_ruleEEnumLiteral454);
            rule__EEnumLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEEnumLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEEnumLiteral"


    // $ANTLR start "entryRuleEDataType_Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:256:1: entryRuleEDataType_Impl : ruleEDataType_Impl EOF ;
    public final void entryRuleEDataType_Impl() throws RecognitionException {
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:257:1: ( ruleEDataType_Impl EOF )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:258:1: ruleEDataType_Impl EOF
            {
             before(grammarAccess.getEDataType_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDataType_Impl_in_entryRuleEDataType_Impl481);
            ruleEDataType_Impl();

            state._fsp--;

             after(grammarAccess.getEDataType_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDataType_Impl488); 

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
    // $ANTLR end "entryRuleEDataType_Impl"


    // $ANTLR start "ruleEDataType_Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:265:1: ruleEDataType_Impl : ( ( rule__EDataType_Impl__Group__0 ) ) ;
    public final void ruleEDataType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:269:2: ( ( ( rule__EDataType_Impl__Group__0 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:270:1: ( ( rule__EDataType_Impl__Group__0 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:270:1: ( ( rule__EDataType_Impl__Group__0 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:271:1: ( rule__EDataType_Impl__Group__0 )
            {
             before(grammarAccess.getEDataType_ImplAccess().getGroup()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:272:1: ( rule__EDataType_Impl__Group__0 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:272:2: rule__EDataType_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__0_in_ruleEDataType_Impl514);
            rule__EDataType_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDataType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDataType_Impl"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:286:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:287:1: ( ruleEBoolean EOF )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:288:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean543);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean550); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:295:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:299:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:300:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:300:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:301:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:302:1: ( rule__EBoolean__Alternatives )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:302:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean576);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEString"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:314:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:315:1: ( ruleEString EOF )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:316:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString603);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString610); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:323:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:327:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:328:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:328:1: ( ( rule__EString__Alternatives ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:329:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:330:1: ( rule__EString__Alternatives )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:330:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString636);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:342:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:343:1: ( ruleEInt EOF )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:344:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt663);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt670); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:351:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:355:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:356:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:356:1: ( ( rule__EInt__Group__0 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:357:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:358:1: ( rule__EInt__Group__0 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:358:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt696);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:371:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:375:1: ( ( 'true' ) | ( 'false' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:376:1: ( 'true' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:376:1: ( 'true' )
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:377:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EBoolean__Alternatives734); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:384:6: ( 'false' )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:384:6: ( 'false' )
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:385:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EBoolean__Alternatives754); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:397:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:401:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:402:1: ( RULE_STRING )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:402:1: ( RULE_STRING )
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:403:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives788); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:408:6: ( RULE_ID )
                    {
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:408:6: ( RULE_ID )
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:409:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives805); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Extension__Group__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:421:1: rule__Extension__Group__0 : rule__Extension__Group__0__Impl rule__Extension__Group__1 ;
    public final void rule__Extension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:425:1: ( rule__Extension__Group__0__Impl rule__Extension__Group__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:426:2: rule__Extension__Group__0__Impl rule__Extension__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__0__Impl_in_rule__Extension__Group__0835);
            rule__Extension__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__1_in_rule__Extension__Group__0838);
            rule__Extension__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__0"


    // $ANTLR start "rule__Extension__Group__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:433:1: rule__Extension__Group__0__Impl : ( 'Extension' ) ;
    public final void rule__Extension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:437:1: ( ( 'Extension' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:438:1: ( 'Extension' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:438:1: ( 'Extension' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:439:1: 'Extension'
            {
             before(grammarAccess.getExtensionAccess().getExtensionKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Extension__Group__0__Impl866); 
             after(grammarAccess.getExtensionAccess().getExtensionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__0__Impl"


    // $ANTLR start "rule__Extension__Group__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:452:1: rule__Extension__Group__1 : rule__Extension__Group__1__Impl rule__Extension__Group__2 ;
    public final void rule__Extension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:456:1: ( rule__Extension__Group__1__Impl rule__Extension__Group__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:457:2: rule__Extension__Group__1__Impl rule__Extension__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__1__Impl_in_rule__Extension__Group__1897);
            rule__Extension__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__2_in_rule__Extension__Group__1900);
            rule__Extension__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__1"


    // $ANTLR start "rule__Extension__Group__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:464:1: rule__Extension__Group__1__Impl : ( ( rule__Extension__NameAssignment_1 ) ) ;
    public final void rule__Extension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:468:1: ( ( ( rule__Extension__NameAssignment_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:469:1: ( ( rule__Extension__NameAssignment_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:469:1: ( ( rule__Extension__NameAssignment_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:470:1: ( rule__Extension__NameAssignment_1 )
            {
             before(grammarAccess.getExtensionAccess().getNameAssignment_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:471:1: ( rule__Extension__NameAssignment_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:471:2: rule__Extension__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__NameAssignment_1_in_rule__Extension__Group__1__Impl927);
            rule__Extension__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__1__Impl"


    // $ANTLR start "rule__Extension__Group__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:481:1: rule__Extension__Group__2 : rule__Extension__Group__2__Impl rule__Extension__Group__3 ;
    public final void rule__Extension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:485:1: ( rule__Extension__Group__2__Impl rule__Extension__Group__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:486:2: rule__Extension__Group__2__Impl rule__Extension__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__2__Impl_in_rule__Extension__Group__2957);
            rule__Extension__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__3_in_rule__Extension__Group__2960);
            rule__Extension__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__2"


    // $ANTLR start "rule__Extension__Group__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:493:1: rule__Extension__Group__2__Impl : ( '{' ) ;
    public final void rule__Extension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:497:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:498:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:498:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:499:1: '{'
            {
             before(grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Extension__Group__2__Impl988); 
             after(grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__2__Impl"


    // $ANTLR start "rule__Extension__Group__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:512:1: rule__Extension__Group__3 : rule__Extension__Group__3__Impl rule__Extension__Group__4 ;
    public final void rule__Extension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:516:1: ( rule__Extension__Group__3__Impl rule__Extension__Group__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:517:2: rule__Extension__Group__3__Impl rule__Extension__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__3__Impl_in_rule__Extension__Group__31019);
            rule__Extension__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__4_in_rule__Extension__Group__31022);
            rule__Extension__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__3"


    // $ANTLR start "rule__Extension__Group__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:524:1: rule__Extension__Group__3__Impl : ( 'scheme' ) ;
    public final void rule__Extension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:528:1: ( ( 'scheme' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:529:1: ( 'scheme' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:529:1: ( 'scheme' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:530:1: 'scheme'
            {
             before(grammarAccess.getExtensionAccess().getSchemeKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Extension__Group__3__Impl1050); 
             after(grammarAccess.getExtensionAccess().getSchemeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__3__Impl"


    // $ANTLR start "rule__Extension__Group__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:543:1: rule__Extension__Group__4 : rule__Extension__Group__4__Impl rule__Extension__Group__5 ;
    public final void rule__Extension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:547:1: ( rule__Extension__Group__4__Impl rule__Extension__Group__5 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:548:2: rule__Extension__Group__4__Impl rule__Extension__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__4__Impl_in_rule__Extension__Group__41081);
            rule__Extension__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__5_in_rule__Extension__Group__41084);
            rule__Extension__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__4"


    // $ANTLR start "rule__Extension__Group__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:555:1: rule__Extension__Group__4__Impl : ( ( rule__Extension__SchemeAssignment_4 ) ) ;
    public final void rule__Extension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:559:1: ( ( ( rule__Extension__SchemeAssignment_4 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:560:1: ( ( rule__Extension__SchemeAssignment_4 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:560:1: ( ( rule__Extension__SchemeAssignment_4 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:561:1: ( rule__Extension__SchemeAssignment_4 )
            {
             before(grammarAccess.getExtensionAccess().getSchemeAssignment_4()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:562:1: ( rule__Extension__SchemeAssignment_4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:562:2: rule__Extension__SchemeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__SchemeAssignment_4_in_rule__Extension__Group__4__Impl1111);
            rule__Extension__SchemeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getSchemeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__4__Impl"


    // $ANTLR start "rule__Extension__Group__5"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:572:1: rule__Extension__Group__5 : rule__Extension__Group__5__Impl rule__Extension__Group__6 ;
    public final void rule__Extension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:576:1: ( rule__Extension__Group__5__Impl rule__Extension__Group__6 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:577:2: rule__Extension__Group__5__Impl rule__Extension__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__5__Impl_in_rule__Extension__Group__51141);
            rule__Extension__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__6_in_rule__Extension__Group__51144);
            rule__Extension__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__5"


    // $ANTLR start "rule__Extension__Group__5__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:584:1: rule__Extension__Group__5__Impl : ( ( rule__Extension__Group_5__0 )? ) ;
    public final void rule__Extension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:588:1: ( ( ( rule__Extension__Group_5__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:589:1: ( ( rule__Extension__Group_5__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:589:1: ( ( rule__Extension__Group_5__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:590:1: ( rule__Extension__Group_5__0 )?
            {
             before(grammarAccess.getExtensionAccess().getGroup_5()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:591:1: ( rule__Extension__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:591:2: rule__Extension__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_5__0_in_rule__Extension__Group__5__Impl1171);
                    rule__Extension__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtensionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__5__Impl"


    // $ANTLR start "rule__Extension__Group__6"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:601:1: rule__Extension__Group__6 : rule__Extension__Group__6__Impl rule__Extension__Group__7 ;
    public final void rule__Extension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:605:1: ( rule__Extension__Group__6__Impl rule__Extension__Group__7 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:606:2: rule__Extension__Group__6__Impl rule__Extension__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__6__Impl_in_rule__Extension__Group__61202);
            rule__Extension__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__7_in_rule__Extension__Group__61205);
            rule__Extension__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__6"


    // $ANTLR start "rule__Extension__Group__6__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:613:1: rule__Extension__Group__6__Impl : ( ( rule__Extension__Group_6__0 )? ) ;
    public final void rule__Extension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:617:1: ( ( ( rule__Extension__Group_6__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:618:1: ( ( rule__Extension__Group_6__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:618:1: ( ( rule__Extension__Group_6__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:619:1: ( rule__Extension__Group_6__0 )?
            {
             before(grammarAccess.getExtensionAccess().getGroup_6()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:620:1: ( rule__Extension__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:620:2: rule__Extension__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_6__0_in_rule__Extension__Group__6__Impl1232);
                    rule__Extension__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtensionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__6__Impl"


    // $ANTLR start "rule__Extension__Group__7"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:630:1: rule__Extension__Group__7 : rule__Extension__Group__7__Impl rule__Extension__Group__8 ;
    public final void rule__Extension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:634:1: ( rule__Extension__Group__7__Impl rule__Extension__Group__8 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:635:2: rule__Extension__Group__7__Impl rule__Extension__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__7__Impl_in_rule__Extension__Group__71263);
            rule__Extension__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__8_in_rule__Extension__Group__71266);
            rule__Extension__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__7"


    // $ANTLR start "rule__Extension__Group__7__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:642:1: rule__Extension__Group__7__Impl : ( ( rule__Extension__Group_7__0 )? ) ;
    public final void rule__Extension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:646:1: ( ( ( rule__Extension__Group_7__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:647:1: ( ( rule__Extension__Group_7__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:647:1: ( ( rule__Extension__Group_7__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:648:1: ( rule__Extension__Group_7__0 )?
            {
             before(grammarAccess.getExtensionAccess().getGroup_7()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:649:1: ( rule__Extension__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:649:2: rule__Extension__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_7__0_in_rule__Extension__Group__7__Impl1293);
                    rule__Extension__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtensionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__7__Impl"


    // $ANTLR start "rule__Extension__Group__8"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:659:1: rule__Extension__Group__8 : rule__Extension__Group__8__Impl ;
    public final void rule__Extension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:663:1: ( rule__Extension__Group__8__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:664:2: rule__Extension__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group__8__Impl_in_rule__Extension__Group__81324);
            rule__Extension__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__8"


    // $ANTLR start "rule__Extension__Group__8__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:670:1: rule__Extension__Group__8__Impl : ( '}' ) ;
    public final void rule__Extension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:674:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:675:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:675:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:676:1: '}'
            {
             before(grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Extension__Group__8__Impl1352); 
             after(grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__8__Impl"


    // $ANTLR start "rule__Extension__Group_5__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:707:1: rule__Extension__Group_5__0 : rule__Extension__Group_5__0__Impl rule__Extension__Group_5__1 ;
    public final void rule__Extension__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:711:1: ( rule__Extension__Group_5__0__Impl rule__Extension__Group_5__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:712:2: rule__Extension__Group_5__0__Impl rule__Extension__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_5__0__Impl_in_rule__Extension__Group_5__01401);
            rule__Extension__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_5__1_in_rule__Extension__Group_5__01404);
            rule__Extension__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5__0"


    // $ANTLR start "rule__Extension__Group_5__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:719:1: rule__Extension__Group_5__0__Impl : ( 'import' ) ;
    public final void rule__Extension__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:723:1: ( ( 'import' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:724:1: ( 'import' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:724:1: ( 'import' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:725:1: 'import'
            {
             before(grammarAccess.getExtensionAccess().getImportKeyword_5_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Extension__Group_5__0__Impl1432); 
             after(grammarAccess.getExtensionAccess().getImportKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5__0__Impl"


    // $ANTLR start "rule__Extension__Group_5__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:738:1: rule__Extension__Group_5__1 : rule__Extension__Group_5__1__Impl rule__Extension__Group_5__2 ;
    public final void rule__Extension__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:742:1: ( rule__Extension__Group_5__1__Impl rule__Extension__Group_5__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:743:2: rule__Extension__Group_5__1__Impl rule__Extension__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_5__1__Impl_in_rule__Extension__Group_5__11463);
            rule__Extension__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_5__2_in_rule__Extension__Group_5__11466);
            rule__Extension__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5__1"


    // $ANTLR start "rule__Extension__Group_5__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:750:1: rule__Extension__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Extension__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:754:1: ( ( '(' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:755:1: ( '(' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:755:1: ( '(' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:756:1: '('
            {
             before(grammarAccess.getExtensionAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Extension__Group_5__1__Impl1494); 
             after(grammarAccess.getExtensionAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5__1__Impl"


    // $ANTLR start "rule__Extension__Group_5__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:769:1: rule__Extension__Group_5__2 : rule__Extension__Group_5__2__Impl rule__Extension__Group_5__3 ;
    public final void rule__Extension__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:773:1: ( rule__Extension__Group_5__2__Impl rule__Extension__Group_5__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:774:2: rule__Extension__Group_5__2__Impl rule__Extension__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_5__2__Impl_in_rule__Extension__Group_5__21525);
            rule__Extension__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_5__3_in_rule__Extension__Group_5__21528);
            rule__Extension__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5__2"


    // $ANTLR start "rule__Extension__Group_5__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:781:1: rule__Extension__Group_5__2__Impl : ( ( rule__Extension__ImportAssignment_5_2 ) ) ;
    public final void rule__Extension__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:785:1: ( ( ( rule__Extension__ImportAssignment_5_2 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:786:1: ( ( rule__Extension__ImportAssignment_5_2 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:786:1: ( ( rule__Extension__ImportAssignment_5_2 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:787:1: ( rule__Extension__ImportAssignment_5_2 )
            {
             before(grammarAccess.getExtensionAccess().getImportAssignment_5_2()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:788:1: ( rule__Extension__ImportAssignment_5_2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:788:2: rule__Extension__ImportAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__ImportAssignment_5_2_in_rule__Extension__Group_5__2__Impl1555);
            rule__Extension__ImportAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getImportAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5__2__Impl"


    // $ANTLR start "rule__Extension__Group_5__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:798:1: rule__Extension__Group_5__3 : rule__Extension__Group_5__3__Impl rule__Extension__Group_5__4 ;
    public final void rule__Extension__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:802:1: ( rule__Extension__Group_5__3__Impl rule__Extension__Group_5__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:803:2: rule__Extension__Group_5__3__Impl rule__Extension__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_5__3__Impl_in_rule__Extension__Group_5__31585);
            rule__Extension__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_5__4_in_rule__Extension__Group_5__31588);
            rule__Extension__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5__3"


    // $ANTLR start "rule__Extension__Group_5__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:810:1: rule__Extension__Group_5__3__Impl : ( ( rule__Extension__Group_5_3__0 )* ) ;
    public final void rule__Extension__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:814:1: ( ( ( rule__Extension__Group_5_3__0 )* ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:815:1: ( ( rule__Extension__Group_5_3__0 )* )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:815:1: ( ( rule__Extension__Group_5_3__0 )* )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:816:1: ( rule__Extension__Group_5_3__0 )*
            {
             before(grammarAccess.getExtensionAccess().getGroup_5_3()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:817:1: ( rule__Extension__Group_5_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:817:2: rule__Extension__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_5_3__0_in_rule__Extension__Group_5__3__Impl1615);
            	    rule__Extension__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getExtensionAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5__3__Impl"


    // $ANTLR start "rule__Extension__Group_5__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:827:1: rule__Extension__Group_5__4 : rule__Extension__Group_5__4__Impl ;
    public final void rule__Extension__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:831:1: ( rule__Extension__Group_5__4__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:832:2: rule__Extension__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_5__4__Impl_in_rule__Extension__Group_5__41646);
            rule__Extension__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5__4"


    // $ANTLR start "rule__Extension__Group_5__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:838:1: rule__Extension__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Extension__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:842:1: ( ( ')' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:843:1: ( ')' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:843:1: ( ')' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:844:1: ')'
            {
             before(grammarAccess.getExtensionAccess().getRightParenthesisKeyword_5_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Extension__Group_5__4__Impl1674); 
             after(grammarAccess.getExtensionAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5__4__Impl"


    // $ANTLR start "rule__Extension__Group_5_3__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:867:1: rule__Extension__Group_5_3__0 : rule__Extension__Group_5_3__0__Impl rule__Extension__Group_5_3__1 ;
    public final void rule__Extension__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:871:1: ( rule__Extension__Group_5_3__0__Impl rule__Extension__Group_5_3__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:872:2: rule__Extension__Group_5_3__0__Impl rule__Extension__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_5_3__0__Impl_in_rule__Extension__Group_5_3__01715);
            rule__Extension__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_5_3__1_in_rule__Extension__Group_5_3__01718);
            rule__Extension__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5_3__0"


    // $ANTLR start "rule__Extension__Group_5_3__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:879:1: rule__Extension__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Extension__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:883:1: ( ( ',' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:884:1: ( ',' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:884:1: ( ',' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:885:1: ','
            {
             before(grammarAccess.getExtensionAccess().getCommaKeyword_5_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Extension__Group_5_3__0__Impl1746); 
             after(grammarAccess.getExtensionAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5_3__0__Impl"


    // $ANTLR start "rule__Extension__Group_5_3__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:898:1: rule__Extension__Group_5_3__1 : rule__Extension__Group_5_3__1__Impl ;
    public final void rule__Extension__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:902:1: ( rule__Extension__Group_5_3__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:903:2: rule__Extension__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_5_3__1__Impl_in_rule__Extension__Group_5_3__11777);
            rule__Extension__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5_3__1"


    // $ANTLR start "rule__Extension__Group_5_3__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:909:1: rule__Extension__Group_5_3__1__Impl : ( ( rule__Extension__ImportAssignment_5_3_1 ) ) ;
    public final void rule__Extension__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:913:1: ( ( ( rule__Extension__ImportAssignment_5_3_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:914:1: ( ( rule__Extension__ImportAssignment_5_3_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:914:1: ( ( rule__Extension__ImportAssignment_5_3_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:915:1: ( rule__Extension__ImportAssignment_5_3_1 )
            {
             before(grammarAccess.getExtensionAccess().getImportAssignment_5_3_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:916:1: ( rule__Extension__ImportAssignment_5_3_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:916:2: rule__Extension__ImportAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__ImportAssignment_5_3_1_in_rule__Extension__Group_5_3__1__Impl1804);
            rule__Extension__ImportAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getImportAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5_3__1__Impl"


    // $ANTLR start "rule__Extension__Group_6__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:930:1: rule__Extension__Group_6__0 : rule__Extension__Group_6__0__Impl rule__Extension__Group_6__1 ;
    public final void rule__Extension__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:934:1: ( rule__Extension__Group_6__0__Impl rule__Extension__Group_6__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:935:2: rule__Extension__Group_6__0__Impl rule__Extension__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_6__0__Impl_in_rule__Extension__Group_6__01838);
            rule__Extension__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_6__1_in_rule__Extension__Group_6__01841);
            rule__Extension__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__0"


    // $ANTLR start "rule__Extension__Group_6__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:942:1: rule__Extension__Group_6__0__Impl : ( 'kinds' ) ;
    public final void rule__Extension__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:946:1: ( ( 'kinds' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:947:1: ( 'kinds' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:947:1: ( 'kinds' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:948:1: 'kinds'
            {
             before(grammarAccess.getExtensionAccess().getKindsKeyword_6_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Extension__Group_6__0__Impl1869); 
             after(grammarAccess.getExtensionAccess().getKindsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__0__Impl"


    // $ANTLR start "rule__Extension__Group_6__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:961:1: rule__Extension__Group_6__1 : rule__Extension__Group_6__1__Impl rule__Extension__Group_6__2 ;
    public final void rule__Extension__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:965:1: ( rule__Extension__Group_6__1__Impl rule__Extension__Group_6__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:966:2: rule__Extension__Group_6__1__Impl rule__Extension__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_6__1__Impl_in_rule__Extension__Group_6__11900);
            rule__Extension__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_6__2_in_rule__Extension__Group_6__11903);
            rule__Extension__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__1"


    // $ANTLR start "rule__Extension__Group_6__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:973:1: rule__Extension__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Extension__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:977:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:978:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:978:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:979:1: '{'
            {
             before(grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Extension__Group_6__1__Impl1931); 
             after(grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__1__Impl"


    // $ANTLR start "rule__Extension__Group_6__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:992:1: rule__Extension__Group_6__2 : rule__Extension__Group_6__2__Impl rule__Extension__Group_6__3 ;
    public final void rule__Extension__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:996:1: ( rule__Extension__Group_6__2__Impl rule__Extension__Group_6__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:997:2: rule__Extension__Group_6__2__Impl rule__Extension__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_6__2__Impl_in_rule__Extension__Group_6__21962);
            rule__Extension__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_6__3_in_rule__Extension__Group_6__21965);
            rule__Extension__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__2"


    // $ANTLR start "rule__Extension__Group_6__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1004:1: rule__Extension__Group_6__2__Impl : ( ( rule__Extension__KindsAssignment_6_2 ) ) ;
    public final void rule__Extension__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1008:1: ( ( ( rule__Extension__KindsAssignment_6_2 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1009:1: ( ( rule__Extension__KindsAssignment_6_2 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1009:1: ( ( rule__Extension__KindsAssignment_6_2 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1010:1: ( rule__Extension__KindsAssignment_6_2 )
            {
             before(grammarAccess.getExtensionAccess().getKindsAssignment_6_2()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1011:1: ( rule__Extension__KindsAssignment_6_2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1011:2: rule__Extension__KindsAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__KindsAssignment_6_2_in_rule__Extension__Group_6__2__Impl1992);
            rule__Extension__KindsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getKindsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__2__Impl"


    // $ANTLR start "rule__Extension__Group_6__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1021:1: rule__Extension__Group_6__3 : rule__Extension__Group_6__3__Impl rule__Extension__Group_6__4 ;
    public final void rule__Extension__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1025:1: ( rule__Extension__Group_6__3__Impl rule__Extension__Group_6__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1026:2: rule__Extension__Group_6__3__Impl rule__Extension__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_6__3__Impl_in_rule__Extension__Group_6__32022);
            rule__Extension__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_6__4_in_rule__Extension__Group_6__32025);
            rule__Extension__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__3"


    // $ANTLR start "rule__Extension__Group_6__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1033:1: rule__Extension__Group_6__3__Impl : ( ( rule__Extension__Group_6_3__0 )* ) ;
    public final void rule__Extension__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1037:1: ( ( ( rule__Extension__Group_6_3__0 )* ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1038:1: ( ( rule__Extension__Group_6_3__0 )* )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1038:1: ( ( rule__Extension__Group_6_3__0 )* )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1039:1: ( rule__Extension__Group_6_3__0 )*
            {
             before(grammarAccess.getExtensionAccess().getGroup_6_3()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1040:1: ( rule__Extension__Group_6_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1040:2: rule__Extension__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_6_3__0_in_rule__Extension__Group_6__3__Impl2052);
            	    rule__Extension__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getExtensionAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__3__Impl"


    // $ANTLR start "rule__Extension__Group_6__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1050:1: rule__Extension__Group_6__4 : rule__Extension__Group_6__4__Impl ;
    public final void rule__Extension__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1054:1: ( rule__Extension__Group_6__4__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1055:2: rule__Extension__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_6__4__Impl_in_rule__Extension__Group_6__42083);
            rule__Extension__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__4"


    // $ANTLR start "rule__Extension__Group_6__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1061:1: rule__Extension__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Extension__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1065:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1066:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1066:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1067:1: '}'
            {
             before(grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Extension__Group_6__4__Impl2111); 
             after(grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__4__Impl"


    // $ANTLR start "rule__Extension__Group_6_3__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1090:1: rule__Extension__Group_6_3__0 : rule__Extension__Group_6_3__0__Impl rule__Extension__Group_6_3__1 ;
    public final void rule__Extension__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1094:1: ( rule__Extension__Group_6_3__0__Impl rule__Extension__Group_6_3__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1095:2: rule__Extension__Group_6_3__0__Impl rule__Extension__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_6_3__0__Impl_in_rule__Extension__Group_6_3__02152);
            rule__Extension__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_6_3__1_in_rule__Extension__Group_6_3__02155);
            rule__Extension__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6_3__0"


    // $ANTLR start "rule__Extension__Group_6_3__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1102:1: rule__Extension__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Extension__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1106:1: ( ( ',' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1107:1: ( ',' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1107:1: ( ',' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1108:1: ','
            {
             before(grammarAccess.getExtensionAccess().getCommaKeyword_6_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Extension__Group_6_3__0__Impl2183); 
             after(grammarAccess.getExtensionAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6_3__0__Impl"


    // $ANTLR start "rule__Extension__Group_6_3__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1121:1: rule__Extension__Group_6_3__1 : rule__Extension__Group_6_3__1__Impl ;
    public final void rule__Extension__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1125:1: ( rule__Extension__Group_6_3__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1126:2: rule__Extension__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_6_3__1__Impl_in_rule__Extension__Group_6_3__12214);
            rule__Extension__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6_3__1"


    // $ANTLR start "rule__Extension__Group_6_3__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1132:1: rule__Extension__Group_6_3__1__Impl : ( ( rule__Extension__KindsAssignment_6_3_1 ) ) ;
    public final void rule__Extension__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1136:1: ( ( ( rule__Extension__KindsAssignment_6_3_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1137:1: ( ( rule__Extension__KindsAssignment_6_3_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1137:1: ( ( rule__Extension__KindsAssignment_6_3_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1138:1: ( rule__Extension__KindsAssignment_6_3_1 )
            {
             before(grammarAccess.getExtensionAccess().getKindsAssignment_6_3_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1139:1: ( rule__Extension__KindsAssignment_6_3_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1139:2: rule__Extension__KindsAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__KindsAssignment_6_3_1_in_rule__Extension__Group_6_3__1__Impl2241);
            rule__Extension__KindsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getKindsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6_3__1__Impl"


    // $ANTLR start "rule__Extension__Group_7__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1153:1: rule__Extension__Group_7__0 : rule__Extension__Group_7__0__Impl rule__Extension__Group_7__1 ;
    public final void rule__Extension__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1157:1: ( rule__Extension__Group_7__0__Impl rule__Extension__Group_7__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1158:2: rule__Extension__Group_7__0__Impl rule__Extension__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_7__0__Impl_in_rule__Extension__Group_7__02275);
            rule__Extension__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_7__1_in_rule__Extension__Group_7__02278);
            rule__Extension__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7__0"


    // $ANTLR start "rule__Extension__Group_7__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1165:1: rule__Extension__Group_7__0__Impl : ( 'mixins' ) ;
    public final void rule__Extension__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1169:1: ( ( 'mixins' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1170:1: ( 'mixins' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1170:1: ( 'mixins' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1171:1: 'mixins'
            {
             before(grammarAccess.getExtensionAccess().getMixinsKeyword_7_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Extension__Group_7__0__Impl2306); 
             after(grammarAccess.getExtensionAccess().getMixinsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7__0__Impl"


    // $ANTLR start "rule__Extension__Group_7__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1184:1: rule__Extension__Group_7__1 : rule__Extension__Group_7__1__Impl rule__Extension__Group_7__2 ;
    public final void rule__Extension__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1188:1: ( rule__Extension__Group_7__1__Impl rule__Extension__Group_7__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1189:2: rule__Extension__Group_7__1__Impl rule__Extension__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_7__1__Impl_in_rule__Extension__Group_7__12337);
            rule__Extension__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_7__2_in_rule__Extension__Group_7__12340);
            rule__Extension__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7__1"


    // $ANTLR start "rule__Extension__Group_7__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1196:1: rule__Extension__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Extension__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1200:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1201:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1201:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1202:1: '{'
            {
             before(grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Extension__Group_7__1__Impl2368); 
             after(grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7__1__Impl"


    // $ANTLR start "rule__Extension__Group_7__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1215:1: rule__Extension__Group_7__2 : rule__Extension__Group_7__2__Impl rule__Extension__Group_7__3 ;
    public final void rule__Extension__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1219:1: ( rule__Extension__Group_7__2__Impl rule__Extension__Group_7__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1220:2: rule__Extension__Group_7__2__Impl rule__Extension__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_7__2__Impl_in_rule__Extension__Group_7__22399);
            rule__Extension__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_7__3_in_rule__Extension__Group_7__22402);
            rule__Extension__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7__2"


    // $ANTLR start "rule__Extension__Group_7__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1227:1: rule__Extension__Group_7__2__Impl : ( ( rule__Extension__MixinsAssignment_7_2 ) ) ;
    public final void rule__Extension__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1231:1: ( ( ( rule__Extension__MixinsAssignment_7_2 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1232:1: ( ( rule__Extension__MixinsAssignment_7_2 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1232:1: ( ( rule__Extension__MixinsAssignment_7_2 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1233:1: ( rule__Extension__MixinsAssignment_7_2 )
            {
             before(grammarAccess.getExtensionAccess().getMixinsAssignment_7_2()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1234:1: ( rule__Extension__MixinsAssignment_7_2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1234:2: rule__Extension__MixinsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__MixinsAssignment_7_2_in_rule__Extension__Group_7__2__Impl2429);
            rule__Extension__MixinsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getMixinsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7__2__Impl"


    // $ANTLR start "rule__Extension__Group_7__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1244:1: rule__Extension__Group_7__3 : rule__Extension__Group_7__3__Impl rule__Extension__Group_7__4 ;
    public final void rule__Extension__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1248:1: ( rule__Extension__Group_7__3__Impl rule__Extension__Group_7__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1249:2: rule__Extension__Group_7__3__Impl rule__Extension__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_7__3__Impl_in_rule__Extension__Group_7__32459);
            rule__Extension__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_7__4_in_rule__Extension__Group_7__32462);
            rule__Extension__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7__3"


    // $ANTLR start "rule__Extension__Group_7__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1256:1: rule__Extension__Group_7__3__Impl : ( ( rule__Extension__Group_7_3__0 )* ) ;
    public final void rule__Extension__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1260:1: ( ( ( rule__Extension__Group_7_3__0 )* ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1261:1: ( ( rule__Extension__Group_7_3__0 )* )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1261:1: ( ( rule__Extension__Group_7_3__0 )* )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1262:1: ( rule__Extension__Group_7_3__0 )*
            {
             before(grammarAccess.getExtensionAccess().getGroup_7_3()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1263:1: ( rule__Extension__Group_7_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1263:2: rule__Extension__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_7_3__0_in_rule__Extension__Group_7__3__Impl2489);
            	    rule__Extension__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getExtensionAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7__3__Impl"


    // $ANTLR start "rule__Extension__Group_7__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1273:1: rule__Extension__Group_7__4 : rule__Extension__Group_7__4__Impl ;
    public final void rule__Extension__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1277:1: ( rule__Extension__Group_7__4__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1278:2: rule__Extension__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_7__4__Impl_in_rule__Extension__Group_7__42520);
            rule__Extension__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7__4"


    // $ANTLR start "rule__Extension__Group_7__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1284:1: rule__Extension__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Extension__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1288:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1289:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1289:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1290:1: '}'
            {
             before(grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Extension__Group_7__4__Impl2548); 
             after(grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7__4__Impl"


    // $ANTLR start "rule__Extension__Group_7_3__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1313:1: rule__Extension__Group_7_3__0 : rule__Extension__Group_7_3__0__Impl rule__Extension__Group_7_3__1 ;
    public final void rule__Extension__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1317:1: ( rule__Extension__Group_7_3__0__Impl rule__Extension__Group_7_3__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1318:2: rule__Extension__Group_7_3__0__Impl rule__Extension__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_7_3__0__Impl_in_rule__Extension__Group_7_3__02589);
            rule__Extension__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_7_3__1_in_rule__Extension__Group_7_3__02592);
            rule__Extension__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7_3__0"


    // $ANTLR start "rule__Extension__Group_7_3__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1325:1: rule__Extension__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Extension__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1329:1: ( ( ',' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1330:1: ( ',' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1330:1: ( ',' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1331:1: ','
            {
             before(grammarAccess.getExtensionAccess().getCommaKeyword_7_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Extension__Group_7_3__0__Impl2620); 
             after(grammarAccess.getExtensionAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7_3__0__Impl"


    // $ANTLR start "rule__Extension__Group_7_3__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1344:1: rule__Extension__Group_7_3__1 : rule__Extension__Group_7_3__1__Impl ;
    public final void rule__Extension__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1348:1: ( rule__Extension__Group_7_3__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1349:2: rule__Extension__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__Group_7_3__1__Impl_in_rule__Extension__Group_7_3__12651);
            rule__Extension__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7_3__1"


    // $ANTLR start "rule__Extension__Group_7_3__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1355:1: rule__Extension__Group_7_3__1__Impl : ( ( rule__Extension__MixinsAssignment_7_3_1 ) ) ;
    public final void rule__Extension__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1359:1: ( ( ( rule__Extension__MixinsAssignment_7_3_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1360:1: ( ( rule__Extension__MixinsAssignment_7_3_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1360:1: ( ( rule__Extension__MixinsAssignment_7_3_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1361:1: ( rule__Extension__MixinsAssignment_7_3_1 )
            {
             before(grammarAccess.getExtensionAccess().getMixinsAssignment_7_3_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1362:1: ( rule__Extension__MixinsAssignment_7_3_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1362:2: rule__Extension__MixinsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extension__MixinsAssignment_7_3_1_in_rule__Extension__Group_7_3__1__Impl2678);
            rule__Extension__MixinsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getMixinsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7_3__1__Impl"


    // $ANTLR start "rule__Kind__Group__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1376:1: rule__Kind__Group__0 : rule__Kind__Group__0__Impl rule__Kind__Group__1 ;
    public final void rule__Kind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1380:1: ( rule__Kind__Group__0__Impl rule__Kind__Group__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1381:2: rule__Kind__Group__0__Impl rule__Kind__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__0__Impl_in_rule__Kind__Group__02712);
            rule__Kind__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__1_in_rule__Kind__Group__02715);
            rule__Kind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__0"


    // $ANTLR start "rule__Kind__Group__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1388:1: rule__Kind__Group__0__Impl : ( 'Kind' ) ;
    public final void rule__Kind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1392:1: ( ( 'Kind' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1393:1: ( 'Kind' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1393:1: ( 'Kind' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1394:1: 'Kind'
            {
             before(grammarAccess.getKindAccess().getKindKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Kind__Group__0__Impl2743); 
             after(grammarAccess.getKindAccess().getKindKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__0__Impl"


    // $ANTLR start "rule__Kind__Group__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1407:1: rule__Kind__Group__1 : rule__Kind__Group__1__Impl rule__Kind__Group__2 ;
    public final void rule__Kind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1411:1: ( rule__Kind__Group__1__Impl rule__Kind__Group__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1412:2: rule__Kind__Group__1__Impl rule__Kind__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__1__Impl_in_rule__Kind__Group__12774);
            rule__Kind__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__2_in_rule__Kind__Group__12777);
            rule__Kind__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__1"


    // $ANTLR start "rule__Kind__Group__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1419:1: rule__Kind__Group__1__Impl : ( ( rule__Kind__TermAssignment_1 ) ) ;
    public final void rule__Kind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1423:1: ( ( ( rule__Kind__TermAssignment_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1424:1: ( ( rule__Kind__TermAssignment_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1424:1: ( ( rule__Kind__TermAssignment_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1425:1: ( rule__Kind__TermAssignment_1 )
            {
             before(grammarAccess.getKindAccess().getTermAssignment_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1426:1: ( rule__Kind__TermAssignment_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1426:2: rule__Kind__TermAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__TermAssignment_1_in_rule__Kind__Group__1__Impl2804);
            rule__Kind__TermAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getTermAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__1__Impl"


    // $ANTLR start "rule__Kind__Group__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1436:1: rule__Kind__Group__2 : rule__Kind__Group__2__Impl rule__Kind__Group__3 ;
    public final void rule__Kind__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1440:1: ( rule__Kind__Group__2__Impl rule__Kind__Group__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1441:2: rule__Kind__Group__2__Impl rule__Kind__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__2__Impl_in_rule__Kind__Group__22834);
            rule__Kind__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__3_in_rule__Kind__Group__22837);
            rule__Kind__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__2"


    // $ANTLR start "rule__Kind__Group__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1448:1: rule__Kind__Group__2__Impl : ( '{' ) ;
    public final void rule__Kind__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1452:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1453:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1453:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1454:1: '{'
            {
             before(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Kind__Group__2__Impl2865); 
             after(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__2__Impl"


    // $ANTLR start "rule__Kind__Group__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1467:1: rule__Kind__Group__3 : rule__Kind__Group__3__Impl rule__Kind__Group__4 ;
    public final void rule__Kind__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1471:1: ( rule__Kind__Group__3__Impl rule__Kind__Group__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1472:2: rule__Kind__Group__3__Impl rule__Kind__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__3__Impl_in_rule__Kind__Group__32896);
            rule__Kind__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__4_in_rule__Kind__Group__32899);
            rule__Kind__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__3"


    // $ANTLR start "rule__Kind__Group__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1479:1: rule__Kind__Group__3__Impl : ( 'scheme' ) ;
    public final void rule__Kind__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1483:1: ( ( 'scheme' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1484:1: ( 'scheme' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1484:1: ( 'scheme' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1485:1: 'scheme'
            {
             before(grammarAccess.getKindAccess().getSchemeKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Kind__Group__3__Impl2927); 
             after(grammarAccess.getKindAccess().getSchemeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__3__Impl"


    // $ANTLR start "rule__Kind__Group__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1498:1: rule__Kind__Group__4 : rule__Kind__Group__4__Impl rule__Kind__Group__5 ;
    public final void rule__Kind__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1502:1: ( rule__Kind__Group__4__Impl rule__Kind__Group__5 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1503:2: rule__Kind__Group__4__Impl rule__Kind__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__4__Impl_in_rule__Kind__Group__42958);
            rule__Kind__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__5_in_rule__Kind__Group__42961);
            rule__Kind__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__4"


    // $ANTLR start "rule__Kind__Group__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1510:1: rule__Kind__Group__4__Impl : ( ( rule__Kind__SchemeAssignment_4 ) ) ;
    public final void rule__Kind__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1514:1: ( ( ( rule__Kind__SchemeAssignment_4 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1515:1: ( ( rule__Kind__SchemeAssignment_4 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1515:1: ( ( rule__Kind__SchemeAssignment_4 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1516:1: ( rule__Kind__SchemeAssignment_4 )
            {
             before(grammarAccess.getKindAccess().getSchemeAssignment_4()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1517:1: ( rule__Kind__SchemeAssignment_4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1517:2: rule__Kind__SchemeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__SchemeAssignment_4_in_rule__Kind__Group__4__Impl2988);
            rule__Kind__SchemeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getSchemeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__4__Impl"


    // $ANTLR start "rule__Kind__Group__5"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1527:1: rule__Kind__Group__5 : rule__Kind__Group__5__Impl rule__Kind__Group__6 ;
    public final void rule__Kind__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1531:1: ( rule__Kind__Group__5__Impl rule__Kind__Group__6 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1532:2: rule__Kind__Group__5__Impl rule__Kind__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__5__Impl_in_rule__Kind__Group__53018);
            rule__Kind__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__6_in_rule__Kind__Group__53021);
            rule__Kind__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__5"


    // $ANTLR start "rule__Kind__Group__5__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1539:1: rule__Kind__Group__5__Impl : ( ( rule__Kind__Group_5__0 )? ) ;
    public final void rule__Kind__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1543:1: ( ( ( rule__Kind__Group_5__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1544:1: ( ( rule__Kind__Group_5__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1544:1: ( ( rule__Kind__Group_5__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1545:1: ( rule__Kind__Group_5__0 )?
            {
             before(grammarAccess.getKindAccess().getGroup_5()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1546:1: ( rule__Kind__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1546:2: rule__Kind__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_5__0_in_rule__Kind__Group__5__Impl3048);
                    rule__Kind__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKindAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__5__Impl"


    // $ANTLR start "rule__Kind__Group__6"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1556:1: rule__Kind__Group__6 : rule__Kind__Group__6__Impl rule__Kind__Group__7 ;
    public final void rule__Kind__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1560:1: ( rule__Kind__Group__6__Impl rule__Kind__Group__7 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1561:2: rule__Kind__Group__6__Impl rule__Kind__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__6__Impl_in_rule__Kind__Group__63079);
            rule__Kind__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__7_in_rule__Kind__Group__63082);
            rule__Kind__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__6"


    // $ANTLR start "rule__Kind__Group__6__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1568:1: rule__Kind__Group__6__Impl : ( ( rule__Kind__Group_6__0 )? ) ;
    public final void rule__Kind__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1572:1: ( ( ( rule__Kind__Group_6__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1573:1: ( ( rule__Kind__Group_6__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1573:1: ( ( rule__Kind__Group_6__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1574:1: ( rule__Kind__Group_6__0 )?
            {
             before(grammarAccess.getKindAccess().getGroup_6()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1575:1: ( rule__Kind__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1575:2: rule__Kind__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_6__0_in_rule__Kind__Group__6__Impl3109);
                    rule__Kind__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKindAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__6__Impl"


    // $ANTLR start "rule__Kind__Group__7"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1585:1: rule__Kind__Group__7 : rule__Kind__Group__7__Impl rule__Kind__Group__8 ;
    public final void rule__Kind__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1589:1: ( rule__Kind__Group__7__Impl rule__Kind__Group__8 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1590:2: rule__Kind__Group__7__Impl rule__Kind__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__7__Impl_in_rule__Kind__Group__73140);
            rule__Kind__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__8_in_rule__Kind__Group__73143);
            rule__Kind__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__7"


    // $ANTLR start "rule__Kind__Group__7__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1597:1: rule__Kind__Group__7__Impl : ( ( rule__Kind__Group_7__0 )? ) ;
    public final void rule__Kind__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1601:1: ( ( ( rule__Kind__Group_7__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1602:1: ( ( rule__Kind__Group_7__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1602:1: ( ( rule__Kind__Group_7__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1603:1: ( rule__Kind__Group_7__0 )?
            {
             before(grammarAccess.getKindAccess().getGroup_7()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1604:1: ( rule__Kind__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1604:2: rule__Kind__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_7__0_in_rule__Kind__Group__7__Impl3170);
                    rule__Kind__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKindAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__7__Impl"


    // $ANTLR start "rule__Kind__Group__8"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1614:1: rule__Kind__Group__8 : rule__Kind__Group__8__Impl rule__Kind__Group__9 ;
    public final void rule__Kind__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1618:1: ( rule__Kind__Group__8__Impl rule__Kind__Group__9 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1619:2: rule__Kind__Group__8__Impl rule__Kind__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__8__Impl_in_rule__Kind__Group__83201);
            rule__Kind__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__9_in_rule__Kind__Group__83204);
            rule__Kind__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__8"


    // $ANTLR start "rule__Kind__Group__8__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1626:1: rule__Kind__Group__8__Impl : ( ( rule__Kind__Group_8__0 )? ) ;
    public final void rule__Kind__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1630:1: ( ( ( rule__Kind__Group_8__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1631:1: ( ( rule__Kind__Group_8__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1631:1: ( ( rule__Kind__Group_8__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1632:1: ( rule__Kind__Group_8__0 )?
            {
             before(grammarAccess.getKindAccess().getGroup_8()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1633:1: ( rule__Kind__Group_8__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1633:2: rule__Kind__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_8__0_in_rule__Kind__Group__8__Impl3231);
                    rule__Kind__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKindAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__8__Impl"


    // $ANTLR start "rule__Kind__Group__9"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1643:1: rule__Kind__Group__9 : rule__Kind__Group__9__Impl ;
    public final void rule__Kind__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1647:1: ( rule__Kind__Group__9__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1648:2: rule__Kind__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group__9__Impl_in_rule__Kind__Group__93262);
            rule__Kind__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__9"


    // $ANTLR start "rule__Kind__Group__9__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1654:1: rule__Kind__Group__9__Impl : ( '}' ) ;
    public final void rule__Kind__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1658:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1659:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1659:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1660:1: '}'
            {
             before(grammarAccess.getKindAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Kind__Group__9__Impl3290); 
             after(grammarAccess.getKindAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__9__Impl"


    // $ANTLR start "rule__Kind__Group_5__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1693:1: rule__Kind__Group_5__0 : rule__Kind__Group_5__0__Impl rule__Kind__Group_5__1 ;
    public final void rule__Kind__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1697:1: ( rule__Kind__Group_5__0__Impl rule__Kind__Group_5__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1698:2: rule__Kind__Group_5__0__Impl rule__Kind__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_5__0__Impl_in_rule__Kind__Group_5__03341);
            rule__Kind__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_5__1_in_rule__Kind__Group_5__03344);
            rule__Kind__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5__0"


    // $ANTLR start "rule__Kind__Group_5__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1705:1: rule__Kind__Group_5__0__Impl : ( 'title' ) ;
    public final void rule__Kind__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1709:1: ( ( 'title' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1710:1: ( 'title' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1710:1: ( 'title' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1711:1: 'title'
            {
             before(grammarAccess.getKindAccess().getTitleKeyword_5_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Kind__Group_5__0__Impl3372); 
             after(grammarAccess.getKindAccess().getTitleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5__0__Impl"


    // $ANTLR start "rule__Kind__Group_5__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1724:1: rule__Kind__Group_5__1 : rule__Kind__Group_5__1__Impl ;
    public final void rule__Kind__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1728:1: ( rule__Kind__Group_5__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1729:2: rule__Kind__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_5__1__Impl_in_rule__Kind__Group_5__13403);
            rule__Kind__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5__1"


    // $ANTLR start "rule__Kind__Group_5__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1735:1: rule__Kind__Group_5__1__Impl : ( ( rule__Kind__TitleAssignment_5_1 ) ) ;
    public final void rule__Kind__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1739:1: ( ( ( rule__Kind__TitleAssignment_5_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1740:1: ( ( rule__Kind__TitleAssignment_5_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1740:1: ( ( rule__Kind__TitleAssignment_5_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1741:1: ( rule__Kind__TitleAssignment_5_1 )
            {
             before(grammarAccess.getKindAccess().getTitleAssignment_5_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1742:1: ( rule__Kind__TitleAssignment_5_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1742:2: rule__Kind__TitleAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__TitleAssignment_5_1_in_rule__Kind__Group_5__1__Impl3430);
            rule__Kind__TitleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getTitleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5__1__Impl"


    // $ANTLR start "rule__Kind__Group_6__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1756:1: rule__Kind__Group_6__0 : rule__Kind__Group_6__0__Impl rule__Kind__Group_6__1 ;
    public final void rule__Kind__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1760:1: ( rule__Kind__Group_6__0__Impl rule__Kind__Group_6__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1761:2: rule__Kind__Group_6__0__Impl rule__Kind__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_6__0__Impl_in_rule__Kind__Group_6__03464);
            rule__Kind__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_6__1_in_rule__Kind__Group_6__03467);
            rule__Kind__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_6__0"


    // $ANTLR start "rule__Kind__Group_6__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1768:1: rule__Kind__Group_6__0__Impl : ( 'parent' ) ;
    public final void rule__Kind__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1772:1: ( ( 'parent' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1773:1: ( 'parent' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1773:1: ( 'parent' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1774:1: 'parent'
            {
             before(grammarAccess.getKindAccess().getParentKeyword_6_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Kind__Group_6__0__Impl3495); 
             after(grammarAccess.getKindAccess().getParentKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_6__0__Impl"


    // $ANTLR start "rule__Kind__Group_6__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1787:1: rule__Kind__Group_6__1 : rule__Kind__Group_6__1__Impl ;
    public final void rule__Kind__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1791:1: ( rule__Kind__Group_6__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1792:2: rule__Kind__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_6__1__Impl_in_rule__Kind__Group_6__13526);
            rule__Kind__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_6__1"


    // $ANTLR start "rule__Kind__Group_6__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1798:1: rule__Kind__Group_6__1__Impl : ( ( rule__Kind__ParentAssignment_6_1 ) ) ;
    public final void rule__Kind__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1802:1: ( ( ( rule__Kind__ParentAssignment_6_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1803:1: ( ( rule__Kind__ParentAssignment_6_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1803:1: ( ( rule__Kind__ParentAssignment_6_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1804:1: ( rule__Kind__ParentAssignment_6_1 )
            {
             before(grammarAccess.getKindAccess().getParentAssignment_6_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1805:1: ( rule__Kind__ParentAssignment_6_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1805:2: rule__Kind__ParentAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__ParentAssignment_6_1_in_rule__Kind__Group_6__1__Impl3553);
            rule__Kind__ParentAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getParentAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_6__1__Impl"


    // $ANTLR start "rule__Kind__Group_7__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1819:1: rule__Kind__Group_7__0 : rule__Kind__Group_7__0__Impl rule__Kind__Group_7__1 ;
    public final void rule__Kind__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1823:1: ( rule__Kind__Group_7__0__Impl rule__Kind__Group_7__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1824:2: rule__Kind__Group_7__0__Impl rule__Kind__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_7__0__Impl_in_rule__Kind__Group_7__03587);
            rule__Kind__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_7__1_in_rule__Kind__Group_7__03590);
            rule__Kind__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7__0"


    // $ANTLR start "rule__Kind__Group_7__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1831:1: rule__Kind__Group_7__0__Impl : ( 'attributes' ) ;
    public final void rule__Kind__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1835:1: ( ( 'attributes' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1836:1: ( 'attributes' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1836:1: ( 'attributes' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1837:1: 'attributes'
            {
             before(grammarAccess.getKindAccess().getAttributesKeyword_7_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Kind__Group_7__0__Impl3618); 
             after(grammarAccess.getKindAccess().getAttributesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7__0__Impl"


    // $ANTLR start "rule__Kind__Group_7__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1850:1: rule__Kind__Group_7__1 : rule__Kind__Group_7__1__Impl rule__Kind__Group_7__2 ;
    public final void rule__Kind__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1854:1: ( rule__Kind__Group_7__1__Impl rule__Kind__Group_7__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1855:2: rule__Kind__Group_7__1__Impl rule__Kind__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_7__1__Impl_in_rule__Kind__Group_7__13649);
            rule__Kind__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_7__2_in_rule__Kind__Group_7__13652);
            rule__Kind__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7__1"


    // $ANTLR start "rule__Kind__Group_7__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1862:1: rule__Kind__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Kind__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1866:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1867:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1867:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1868:1: '{'
            {
             before(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Kind__Group_7__1__Impl3680); 
             after(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7__1__Impl"


    // $ANTLR start "rule__Kind__Group_7__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1881:1: rule__Kind__Group_7__2 : rule__Kind__Group_7__2__Impl rule__Kind__Group_7__3 ;
    public final void rule__Kind__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1885:1: ( rule__Kind__Group_7__2__Impl rule__Kind__Group_7__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1886:2: rule__Kind__Group_7__2__Impl rule__Kind__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_7__2__Impl_in_rule__Kind__Group_7__23711);
            rule__Kind__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_7__3_in_rule__Kind__Group_7__23714);
            rule__Kind__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7__2"


    // $ANTLR start "rule__Kind__Group_7__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1893:1: rule__Kind__Group_7__2__Impl : ( ( rule__Kind__AttributesAssignment_7_2 ) ) ;
    public final void rule__Kind__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1897:1: ( ( ( rule__Kind__AttributesAssignment_7_2 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1898:1: ( ( rule__Kind__AttributesAssignment_7_2 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1898:1: ( ( rule__Kind__AttributesAssignment_7_2 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1899:1: ( rule__Kind__AttributesAssignment_7_2 )
            {
             before(grammarAccess.getKindAccess().getAttributesAssignment_7_2()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1900:1: ( rule__Kind__AttributesAssignment_7_2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1900:2: rule__Kind__AttributesAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__AttributesAssignment_7_2_in_rule__Kind__Group_7__2__Impl3741);
            rule__Kind__AttributesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getAttributesAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7__2__Impl"


    // $ANTLR start "rule__Kind__Group_7__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1910:1: rule__Kind__Group_7__3 : rule__Kind__Group_7__3__Impl rule__Kind__Group_7__4 ;
    public final void rule__Kind__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1914:1: ( rule__Kind__Group_7__3__Impl rule__Kind__Group_7__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1915:2: rule__Kind__Group_7__3__Impl rule__Kind__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_7__3__Impl_in_rule__Kind__Group_7__33771);
            rule__Kind__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_7__4_in_rule__Kind__Group_7__33774);
            rule__Kind__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7__3"


    // $ANTLR start "rule__Kind__Group_7__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1922:1: rule__Kind__Group_7__3__Impl : ( ( rule__Kind__Group_7_3__0 )* ) ;
    public final void rule__Kind__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1926:1: ( ( ( rule__Kind__Group_7_3__0 )* ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1927:1: ( ( rule__Kind__Group_7_3__0 )* )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1927:1: ( ( rule__Kind__Group_7_3__0 )* )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1928:1: ( rule__Kind__Group_7_3__0 )*
            {
             before(grammarAccess.getKindAccess().getGroup_7_3()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1929:1: ( rule__Kind__Group_7_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1929:2: rule__Kind__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_7_3__0_in_rule__Kind__Group_7__3__Impl3801);
            	    rule__Kind__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getKindAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7__3__Impl"


    // $ANTLR start "rule__Kind__Group_7__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1939:1: rule__Kind__Group_7__4 : rule__Kind__Group_7__4__Impl ;
    public final void rule__Kind__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1943:1: ( rule__Kind__Group_7__4__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1944:2: rule__Kind__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_7__4__Impl_in_rule__Kind__Group_7__43832);
            rule__Kind__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7__4"


    // $ANTLR start "rule__Kind__Group_7__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1950:1: rule__Kind__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Kind__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1954:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1955:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1955:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1956:1: '}'
            {
             before(grammarAccess.getKindAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Kind__Group_7__4__Impl3860); 
             after(grammarAccess.getKindAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7__4__Impl"


    // $ANTLR start "rule__Kind__Group_7_3__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1979:1: rule__Kind__Group_7_3__0 : rule__Kind__Group_7_3__0__Impl rule__Kind__Group_7_3__1 ;
    public final void rule__Kind__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1983:1: ( rule__Kind__Group_7_3__0__Impl rule__Kind__Group_7_3__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1984:2: rule__Kind__Group_7_3__0__Impl rule__Kind__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_7_3__0__Impl_in_rule__Kind__Group_7_3__03901);
            rule__Kind__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_7_3__1_in_rule__Kind__Group_7_3__03904);
            rule__Kind__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7_3__0"


    // $ANTLR start "rule__Kind__Group_7_3__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1991:1: rule__Kind__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Kind__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1995:1: ( ( ',' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1996:1: ( ',' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1996:1: ( ',' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1997:1: ','
            {
             before(grammarAccess.getKindAccess().getCommaKeyword_7_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Kind__Group_7_3__0__Impl3932); 
             after(grammarAccess.getKindAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7_3__0__Impl"


    // $ANTLR start "rule__Kind__Group_7_3__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2010:1: rule__Kind__Group_7_3__1 : rule__Kind__Group_7_3__1__Impl ;
    public final void rule__Kind__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2014:1: ( rule__Kind__Group_7_3__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2015:2: rule__Kind__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_7_3__1__Impl_in_rule__Kind__Group_7_3__13963);
            rule__Kind__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7_3__1"


    // $ANTLR start "rule__Kind__Group_7_3__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2021:1: rule__Kind__Group_7_3__1__Impl : ( ( rule__Kind__AttributesAssignment_7_3_1 ) ) ;
    public final void rule__Kind__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2025:1: ( ( ( rule__Kind__AttributesAssignment_7_3_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2026:1: ( ( rule__Kind__AttributesAssignment_7_3_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2026:1: ( ( rule__Kind__AttributesAssignment_7_3_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2027:1: ( rule__Kind__AttributesAssignment_7_3_1 )
            {
             before(grammarAccess.getKindAccess().getAttributesAssignment_7_3_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2028:1: ( rule__Kind__AttributesAssignment_7_3_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2028:2: rule__Kind__AttributesAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__AttributesAssignment_7_3_1_in_rule__Kind__Group_7_3__1__Impl3990);
            rule__Kind__AttributesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getAttributesAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7_3__1__Impl"


    // $ANTLR start "rule__Kind__Group_8__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2042:1: rule__Kind__Group_8__0 : rule__Kind__Group_8__0__Impl rule__Kind__Group_8__1 ;
    public final void rule__Kind__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2046:1: ( rule__Kind__Group_8__0__Impl rule__Kind__Group_8__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2047:2: rule__Kind__Group_8__0__Impl rule__Kind__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_8__0__Impl_in_rule__Kind__Group_8__04024);
            rule__Kind__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_8__1_in_rule__Kind__Group_8__04027);
            rule__Kind__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__0"


    // $ANTLR start "rule__Kind__Group_8__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2054:1: rule__Kind__Group_8__0__Impl : ( 'actions' ) ;
    public final void rule__Kind__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2058:1: ( ( 'actions' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2059:1: ( 'actions' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2059:1: ( 'actions' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2060:1: 'actions'
            {
             before(grammarAccess.getKindAccess().getActionsKeyword_8_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Kind__Group_8__0__Impl4055); 
             after(grammarAccess.getKindAccess().getActionsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__0__Impl"


    // $ANTLR start "rule__Kind__Group_8__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2073:1: rule__Kind__Group_8__1 : rule__Kind__Group_8__1__Impl rule__Kind__Group_8__2 ;
    public final void rule__Kind__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2077:1: ( rule__Kind__Group_8__1__Impl rule__Kind__Group_8__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2078:2: rule__Kind__Group_8__1__Impl rule__Kind__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_8__1__Impl_in_rule__Kind__Group_8__14086);
            rule__Kind__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_8__2_in_rule__Kind__Group_8__14089);
            rule__Kind__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__1"


    // $ANTLR start "rule__Kind__Group_8__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2085:1: rule__Kind__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Kind__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2089:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2090:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2090:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2091:1: '{'
            {
             before(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Kind__Group_8__1__Impl4117); 
             after(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__1__Impl"


    // $ANTLR start "rule__Kind__Group_8__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2104:1: rule__Kind__Group_8__2 : rule__Kind__Group_8__2__Impl rule__Kind__Group_8__3 ;
    public final void rule__Kind__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2108:1: ( rule__Kind__Group_8__2__Impl rule__Kind__Group_8__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2109:2: rule__Kind__Group_8__2__Impl rule__Kind__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_8__2__Impl_in_rule__Kind__Group_8__24148);
            rule__Kind__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_8__3_in_rule__Kind__Group_8__24151);
            rule__Kind__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__2"


    // $ANTLR start "rule__Kind__Group_8__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2116:1: rule__Kind__Group_8__2__Impl : ( ( rule__Kind__ActionsAssignment_8_2 ) ) ;
    public final void rule__Kind__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2120:1: ( ( ( rule__Kind__ActionsAssignment_8_2 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2121:1: ( ( rule__Kind__ActionsAssignment_8_2 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2121:1: ( ( rule__Kind__ActionsAssignment_8_2 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2122:1: ( rule__Kind__ActionsAssignment_8_2 )
            {
             before(grammarAccess.getKindAccess().getActionsAssignment_8_2()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2123:1: ( rule__Kind__ActionsAssignment_8_2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2123:2: rule__Kind__ActionsAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__ActionsAssignment_8_2_in_rule__Kind__Group_8__2__Impl4178);
            rule__Kind__ActionsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getActionsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__2__Impl"


    // $ANTLR start "rule__Kind__Group_8__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2133:1: rule__Kind__Group_8__3 : rule__Kind__Group_8__3__Impl rule__Kind__Group_8__4 ;
    public final void rule__Kind__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2137:1: ( rule__Kind__Group_8__3__Impl rule__Kind__Group_8__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2138:2: rule__Kind__Group_8__3__Impl rule__Kind__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_8__3__Impl_in_rule__Kind__Group_8__34208);
            rule__Kind__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_8__4_in_rule__Kind__Group_8__34211);
            rule__Kind__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__3"


    // $ANTLR start "rule__Kind__Group_8__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2145:1: rule__Kind__Group_8__3__Impl : ( ( rule__Kind__Group_8_3__0 )* ) ;
    public final void rule__Kind__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2149:1: ( ( ( rule__Kind__Group_8_3__0 )* ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2150:1: ( ( rule__Kind__Group_8_3__0 )* )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2150:1: ( ( rule__Kind__Group_8_3__0 )* )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2151:1: ( rule__Kind__Group_8_3__0 )*
            {
             before(grammarAccess.getKindAccess().getGroup_8_3()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2152:1: ( rule__Kind__Group_8_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2152:2: rule__Kind__Group_8_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_8_3__0_in_rule__Kind__Group_8__3__Impl4238);
            	    rule__Kind__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getKindAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__3__Impl"


    // $ANTLR start "rule__Kind__Group_8__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2162:1: rule__Kind__Group_8__4 : rule__Kind__Group_8__4__Impl ;
    public final void rule__Kind__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2166:1: ( rule__Kind__Group_8__4__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2167:2: rule__Kind__Group_8__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_8__4__Impl_in_rule__Kind__Group_8__44269);
            rule__Kind__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__4"


    // $ANTLR start "rule__Kind__Group_8__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2173:1: rule__Kind__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Kind__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2177:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2178:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2178:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2179:1: '}'
            {
             before(grammarAccess.getKindAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Kind__Group_8__4__Impl4297); 
             after(grammarAccess.getKindAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__4__Impl"


    // $ANTLR start "rule__Kind__Group_8_3__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2202:1: rule__Kind__Group_8_3__0 : rule__Kind__Group_8_3__0__Impl rule__Kind__Group_8_3__1 ;
    public final void rule__Kind__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2206:1: ( rule__Kind__Group_8_3__0__Impl rule__Kind__Group_8_3__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2207:2: rule__Kind__Group_8_3__0__Impl rule__Kind__Group_8_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_8_3__0__Impl_in_rule__Kind__Group_8_3__04338);
            rule__Kind__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_8_3__1_in_rule__Kind__Group_8_3__04341);
            rule__Kind__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8_3__0"


    // $ANTLR start "rule__Kind__Group_8_3__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2214:1: rule__Kind__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Kind__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2218:1: ( ( ',' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2219:1: ( ',' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2219:1: ( ',' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2220:1: ','
            {
             before(grammarAccess.getKindAccess().getCommaKeyword_8_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Kind__Group_8_3__0__Impl4369); 
             after(grammarAccess.getKindAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8_3__0__Impl"


    // $ANTLR start "rule__Kind__Group_8_3__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2233:1: rule__Kind__Group_8_3__1 : rule__Kind__Group_8_3__1__Impl ;
    public final void rule__Kind__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2237:1: ( rule__Kind__Group_8_3__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2238:2: rule__Kind__Group_8_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__Group_8_3__1__Impl_in_rule__Kind__Group_8_3__14400);
            rule__Kind__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8_3__1"


    // $ANTLR start "rule__Kind__Group_8_3__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2244:1: rule__Kind__Group_8_3__1__Impl : ( ( rule__Kind__ActionsAssignment_8_3_1 ) ) ;
    public final void rule__Kind__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2248:1: ( ( ( rule__Kind__ActionsAssignment_8_3_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2249:1: ( ( rule__Kind__ActionsAssignment_8_3_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2249:1: ( ( rule__Kind__ActionsAssignment_8_3_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2250:1: ( rule__Kind__ActionsAssignment_8_3_1 )
            {
             before(grammarAccess.getKindAccess().getActionsAssignment_8_3_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2251:1: ( rule__Kind__ActionsAssignment_8_3_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2251:2: rule__Kind__ActionsAssignment_8_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Kind__ActionsAssignment_8_3_1_in_rule__Kind__Group_8_3__1__Impl4427);
            rule__Kind__ActionsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getActionsAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8_3__1__Impl"


    // $ANTLR start "rule__Mixin__Group__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2265:1: rule__Mixin__Group__0 : rule__Mixin__Group__0__Impl rule__Mixin__Group__1 ;
    public final void rule__Mixin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2269:1: ( rule__Mixin__Group__0__Impl rule__Mixin__Group__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2270:2: rule__Mixin__Group__0__Impl rule__Mixin__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__0__Impl_in_rule__Mixin__Group__04461);
            rule__Mixin__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__1_in_rule__Mixin__Group__04464);
            rule__Mixin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__0"


    // $ANTLR start "rule__Mixin__Group__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2277:1: rule__Mixin__Group__0__Impl : ( 'Mixin' ) ;
    public final void rule__Mixin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2281:1: ( ( 'Mixin' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2282:1: ( 'Mixin' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2282:1: ( 'Mixin' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2283:1: 'Mixin'
            {
             before(grammarAccess.getMixinAccess().getMixinKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Mixin__Group__0__Impl4492); 
             after(grammarAccess.getMixinAccess().getMixinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__0__Impl"


    // $ANTLR start "rule__Mixin__Group__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2296:1: rule__Mixin__Group__1 : rule__Mixin__Group__1__Impl rule__Mixin__Group__2 ;
    public final void rule__Mixin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2300:1: ( rule__Mixin__Group__1__Impl rule__Mixin__Group__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2301:2: rule__Mixin__Group__1__Impl rule__Mixin__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__1__Impl_in_rule__Mixin__Group__14523);
            rule__Mixin__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__2_in_rule__Mixin__Group__14526);
            rule__Mixin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__1"


    // $ANTLR start "rule__Mixin__Group__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2308:1: rule__Mixin__Group__1__Impl : ( ( rule__Mixin__TermAssignment_1 ) ) ;
    public final void rule__Mixin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2312:1: ( ( ( rule__Mixin__TermAssignment_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2313:1: ( ( rule__Mixin__TermAssignment_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2313:1: ( ( rule__Mixin__TermAssignment_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2314:1: ( rule__Mixin__TermAssignment_1 )
            {
             before(grammarAccess.getMixinAccess().getTermAssignment_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2315:1: ( rule__Mixin__TermAssignment_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2315:2: rule__Mixin__TermAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__TermAssignment_1_in_rule__Mixin__Group__1__Impl4553);
            rule__Mixin__TermAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getTermAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__1__Impl"


    // $ANTLR start "rule__Mixin__Group__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2325:1: rule__Mixin__Group__2 : rule__Mixin__Group__2__Impl rule__Mixin__Group__3 ;
    public final void rule__Mixin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2329:1: ( rule__Mixin__Group__2__Impl rule__Mixin__Group__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2330:2: rule__Mixin__Group__2__Impl rule__Mixin__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__2__Impl_in_rule__Mixin__Group__24583);
            rule__Mixin__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__3_in_rule__Mixin__Group__24586);
            rule__Mixin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__2"


    // $ANTLR start "rule__Mixin__Group__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2337:1: rule__Mixin__Group__2__Impl : ( '{' ) ;
    public final void rule__Mixin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2341:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2342:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2342:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2343:1: '{'
            {
             before(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Mixin__Group__2__Impl4614); 
             after(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__2__Impl"


    // $ANTLR start "rule__Mixin__Group__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2356:1: rule__Mixin__Group__3 : rule__Mixin__Group__3__Impl rule__Mixin__Group__4 ;
    public final void rule__Mixin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2360:1: ( rule__Mixin__Group__3__Impl rule__Mixin__Group__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2361:2: rule__Mixin__Group__3__Impl rule__Mixin__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__3__Impl_in_rule__Mixin__Group__34645);
            rule__Mixin__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__4_in_rule__Mixin__Group__34648);
            rule__Mixin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__3"


    // $ANTLR start "rule__Mixin__Group__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2368:1: rule__Mixin__Group__3__Impl : ( 'scheme' ) ;
    public final void rule__Mixin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2372:1: ( ( 'scheme' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2373:1: ( 'scheme' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2373:1: ( 'scheme' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2374:1: 'scheme'
            {
             before(grammarAccess.getMixinAccess().getSchemeKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Mixin__Group__3__Impl4676); 
             after(grammarAccess.getMixinAccess().getSchemeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__3__Impl"


    // $ANTLR start "rule__Mixin__Group__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2387:1: rule__Mixin__Group__4 : rule__Mixin__Group__4__Impl rule__Mixin__Group__5 ;
    public final void rule__Mixin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2391:1: ( rule__Mixin__Group__4__Impl rule__Mixin__Group__5 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2392:2: rule__Mixin__Group__4__Impl rule__Mixin__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__4__Impl_in_rule__Mixin__Group__44707);
            rule__Mixin__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__5_in_rule__Mixin__Group__44710);
            rule__Mixin__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__4"


    // $ANTLR start "rule__Mixin__Group__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2399:1: rule__Mixin__Group__4__Impl : ( ( rule__Mixin__SchemeAssignment_4 ) ) ;
    public final void rule__Mixin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2403:1: ( ( ( rule__Mixin__SchemeAssignment_4 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2404:1: ( ( rule__Mixin__SchemeAssignment_4 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2404:1: ( ( rule__Mixin__SchemeAssignment_4 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2405:1: ( rule__Mixin__SchemeAssignment_4 )
            {
             before(grammarAccess.getMixinAccess().getSchemeAssignment_4()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2406:1: ( rule__Mixin__SchemeAssignment_4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2406:2: rule__Mixin__SchemeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__SchemeAssignment_4_in_rule__Mixin__Group__4__Impl4737);
            rule__Mixin__SchemeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getSchemeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__4__Impl"


    // $ANTLR start "rule__Mixin__Group__5"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2416:1: rule__Mixin__Group__5 : rule__Mixin__Group__5__Impl rule__Mixin__Group__6 ;
    public final void rule__Mixin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2420:1: ( rule__Mixin__Group__5__Impl rule__Mixin__Group__6 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2421:2: rule__Mixin__Group__5__Impl rule__Mixin__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__5__Impl_in_rule__Mixin__Group__54767);
            rule__Mixin__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__6_in_rule__Mixin__Group__54770);
            rule__Mixin__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__5"


    // $ANTLR start "rule__Mixin__Group__5__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2428:1: rule__Mixin__Group__5__Impl : ( ( rule__Mixin__Group_5__0 )? ) ;
    public final void rule__Mixin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2432:1: ( ( ( rule__Mixin__Group_5__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2433:1: ( ( rule__Mixin__Group_5__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2433:1: ( ( rule__Mixin__Group_5__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2434:1: ( rule__Mixin__Group_5__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_5()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2435:1: ( rule__Mixin__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2435:2: rule__Mixin__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_5__0_in_rule__Mixin__Group__5__Impl4797);
                    rule__Mixin__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMixinAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__5__Impl"


    // $ANTLR start "rule__Mixin__Group__6"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2445:1: rule__Mixin__Group__6 : rule__Mixin__Group__6__Impl rule__Mixin__Group__7 ;
    public final void rule__Mixin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2449:1: ( rule__Mixin__Group__6__Impl rule__Mixin__Group__7 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2450:2: rule__Mixin__Group__6__Impl rule__Mixin__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__6__Impl_in_rule__Mixin__Group__64828);
            rule__Mixin__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__7_in_rule__Mixin__Group__64831);
            rule__Mixin__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__6"


    // $ANTLR start "rule__Mixin__Group__6__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2457:1: rule__Mixin__Group__6__Impl : ( ( rule__Mixin__Group_6__0 )? ) ;
    public final void rule__Mixin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2461:1: ( ( ( rule__Mixin__Group_6__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2462:1: ( ( rule__Mixin__Group_6__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2462:1: ( ( rule__Mixin__Group_6__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2463:1: ( rule__Mixin__Group_6__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_6()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2464:1: ( rule__Mixin__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2464:2: rule__Mixin__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_6__0_in_rule__Mixin__Group__6__Impl4858);
                    rule__Mixin__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMixinAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__6__Impl"


    // $ANTLR start "rule__Mixin__Group__7"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2474:1: rule__Mixin__Group__7 : rule__Mixin__Group__7__Impl rule__Mixin__Group__8 ;
    public final void rule__Mixin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2478:1: ( rule__Mixin__Group__7__Impl rule__Mixin__Group__8 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2479:2: rule__Mixin__Group__7__Impl rule__Mixin__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__7__Impl_in_rule__Mixin__Group__74889);
            rule__Mixin__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__8_in_rule__Mixin__Group__74892);
            rule__Mixin__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__7"


    // $ANTLR start "rule__Mixin__Group__7__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2486:1: rule__Mixin__Group__7__Impl : ( ( rule__Mixin__Group_7__0 )? ) ;
    public final void rule__Mixin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2490:1: ( ( ( rule__Mixin__Group_7__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2491:1: ( ( rule__Mixin__Group_7__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2491:1: ( ( rule__Mixin__Group_7__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2492:1: ( rule__Mixin__Group_7__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_7()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2493:1: ( rule__Mixin__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2493:2: rule__Mixin__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_7__0_in_rule__Mixin__Group__7__Impl4919);
                    rule__Mixin__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMixinAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__7__Impl"


    // $ANTLR start "rule__Mixin__Group__8"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2503:1: rule__Mixin__Group__8 : rule__Mixin__Group__8__Impl ;
    public final void rule__Mixin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2507:1: ( rule__Mixin__Group__8__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2508:2: rule__Mixin__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group__8__Impl_in_rule__Mixin__Group__84950);
            rule__Mixin__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__8"


    // $ANTLR start "rule__Mixin__Group__8__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2514:1: rule__Mixin__Group__8__Impl : ( '}' ) ;
    public final void rule__Mixin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2518:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2519:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2519:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2520:1: '}'
            {
             before(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Mixin__Group__8__Impl4978); 
             after(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__8__Impl"


    // $ANTLR start "rule__Mixin__Group_5__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2551:1: rule__Mixin__Group_5__0 : rule__Mixin__Group_5__0__Impl rule__Mixin__Group_5__1 ;
    public final void rule__Mixin__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2555:1: ( rule__Mixin__Group_5__0__Impl rule__Mixin__Group_5__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2556:2: rule__Mixin__Group_5__0__Impl rule__Mixin__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_5__0__Impl_in_rule__Mixin__Group_5__05027);
            rule__Mixin__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_5__1_in_rule__Mixin__Group_5__05030);
            rule__Mixin__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_5__0"


    // $ANTLR start "rule__Mixin__Group_5__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2563:1: rule__Mixin__Group_5__0__Impl : ( 'title' ) ;
    public final void rule__Mixin__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2567:1: ( ( 'title' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2568:1: ( 'title' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2568:1: ( 'title' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2569:1: 'title'
            {
             before(grammarAccess.getMixinAccess().getTitleKeyword_5_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Mixin__Group_5__0__Impl5058); 
             after(grammarAccess.getMixinAccess().getTitleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_5__0__Impl"


    // $ANTLR start "rule__Mixin__Group_5__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2582:1: rule__Mixin__Group_5__1 : rule__Mixin__Group_5__1__Impl ;
    public final void rule__Mixin__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2586:1: ( rule__Mixin__Group_5__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2587:2: rule__Mixin__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_5__1__Impl_in_rule__Mixin__Group_5__15089);
            rule__Mixin__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_5__1"


    // $ANTLR start "rule__Mixin__Group_5__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2593:1: rule__Mixin__Group_5__1__Impl : ( ( rule__Mixin__TitleAssignment_5_1 ) ) ;
    public final void rule__Mixin__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2597:1: ( ( ( rule__Mixin__TitleAssignment_5_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2598:1: ( ( rule__Mixin__TitleAssignment_5_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2598:1: ( ( rule__Mixin__TitleAssignment_5_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2599:1: ( rule__Mixin__TitleAssignment_5_1 )
            {
             before(grammarAccess.getMixinAccess().getTitleAssignment_5_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2600:1: ( rule__Mixin__TitleAssignment_5_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2600:2: rule__Mixin__TitleAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__TitleAssignment_5_1_in_rule__Mixin__Group_5__1__Impl5116);
            rule__Mixin__TitleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getTitleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_5__1__Impl"


    // $ANTLR start "rule__Mixin__Group_6__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2614:1: rule__Mixin__Group_6__0 : rule__Mixin__Group_6__0__Impl rule__Mixin__Group_6__1 ;
    public final void rule__Mixin__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2618:1: ( rule__Mixin__Group_6__0__Impl rule__Mixin__Group_6__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2619:2: rule__Mixin__Group_6__0__Impl rule__Mixin__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_6__0__Impl_in_rule__Mixin__Group_6__05150);
            rule__Mixin__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_6__1_in_rule__Mixin__Group_6__05153);
            rule__Mixin__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6__0"


    // $ANTLR start "rule__Mixin__Group_6__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2626:1: rule__Mixin__Group_6__0__Impl : ( 'attributes' ) ;
    public final void rule__Mixin__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2630:1: ( ( 'attributes' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2631:1: ( 'attributes' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2631:1: ( 'attributes' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2632:1: 'attributes'
            {
             before(grammarAccess.getMixinAccess().getAttributesKeyword_6_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Mixin__Group_6__0__Impl5181); 
             after(grammarAccess.getMixinAccess().getAttributesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6__0__Impl"


    // $ANTLR start "rule__Mixin__Group_6__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2645:1: rule__Mixin__Group_6__1 : rule__Mixin__Group_6__1__Impl rule__Mixin__Group_6__2 ;
    public final void rule__Mixin__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2649:1: ( rule__Mixin__Group_6__1__Impl rule__Mixin__Group_6__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2650:2: rule__Mixin__Group_6__1__Impl rule__Mixin__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_6__1__Impl_in_rule__Mixin__Group_6__15212);
            rule__Mixin__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_6__2_in_rule__Mixin__Group_6__15215);
            rule__Mixin__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6__1"


    // $ANTLR start "rule__Mixin__Group_6__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2657:1: rule__Mixin__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Mixin__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2661:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2662:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2662:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2663:1: '{'
            {
             before(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Mixin__Group_6__1__Impl5243); 
             after(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6__1__Impl"


    // $ANTLR start "rule__Mixin__Group_6__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2676:1: rule__Mixin__Group_6__2 : rule__Mixin__Group_6__2__Impl rule__Mixin__Group_6__3 ;
    public final void rule__Mixin__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2680:1: ( rule__Mixin__Group_6__2__Impl rule__Mixin__Group_6__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2681:2: rule__Mixin__Group_6__2__Impl rule__Mixin__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_6__2__Impl_in_rule__Mixin__Group_6__25274);
            rule__Mixin__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_6__3_in_rule__Mixin__Group_6__25277);
            rule__Mixin__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6__2"


    // $ANTLR start "rule__Mixin__Group_6__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2688:1: rule__Mixin__Group_6__2__Impl : ( ( rule__Mixin__AttributesAssignment_6_2 ) ) ;
    public final void rule__Mixin__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2692:1: ( ( ( rule__Mixin__AttributesAssignment_6_2 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2693:1: ( ( rule__Mixin__AttributesAssignment_6_2 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2693:1: ( ( rule__Mixin__AttributesAssignment_6_2 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2694:1: ( rule__Mixin__AttributesAssignment_6_2 )
            {
             before(grammarAccess.getMixinAccess().getAttributesAssignment_6_2()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2695:1: ( rule__Mixin__AttributesAssignment_6_2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2695:2: rule__Mixin__AttributesAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__AttributesAssignment_6_2_in_rule__Mixin__Group_6__2__Impl5304);
            rule__Mixin__AttributesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getAttributesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6__2__Impl"


    // $ANTLR start "rule__Mixin__Group_6__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2705:1: rule__Mixin__Group_6__3 : rule__Mixin__Group_6__3__Impl rule__Mixin__Group_6__4 ;
    public final void rule__Mixin__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2709:1: ( rule__Mixin__Group_6__3__Impl rule__Mixin__Group_6__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2710:2: rule__Mixin__Group_6__3__Impl rule__Mixin__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_6__3__Impl_in_rule__Mixin__Group_6__35334);
            rule__Mixin__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_6__4_in_rule__Mixin__Group_6__35337);
            rule__Mixin__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6__3"


    // $ANTLR start "rule__Mixin__Group_6__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2717:1: rule__Mixin__Group_6__3__Impl : ( ( rule__Mixin__Group_6_3__0 )* ) ;
    public final void rule__Mixin__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2721:1: ( ( ( rule__Mixin__Group_6_3__0 )* ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2722:1: ( ( rule__Mixin__Group_6_3__0 )* )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2722:1: ( ( rule__Mixin__Group_6_3__0 )* )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2723:1: ( rule__Mixin__Group_6_3__0 )*
            {
             before(grammarAccess.getMixinAccess().getGroup_6_3()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2724:1: ( rule__Mixin__Group_6_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2724:2: rule__Mixin__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_6_3__0_in_rule__Mixin__Group_6__3__Impl5364);
            	    rule__Mixin__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMixinAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6__3__Impl"


    // $ANTLR start "rule__Mixin__Group_6__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2734:1: rule__Mixin__Group_6__4 : rule__Mixin__Group_6__4__Impl ;
    public final void rule__Mixin__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2738:1: ( rule__Mixin__Group_6__4__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2739:2: rule__Mixin__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_6__4__Impl_in_rule__Mixin__Group_6__45395);
            rule__Mixin__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6__4"


    // $ANTLR start "rule__Mixin__Group_6__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2745:1: rule__Mixin__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Mixin__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2749:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2750:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2750:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2751:1: '}'
            {
             before(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Mixin__Group_6__4__Impl5423); 
             after(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6__4__Impl"


    // $ANTLR start "rule__Mixin__Group_6_3__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2774:1: rule__Mixin__Group_6_3__0 : rule__Mixin__Group_6_3__0__Impl rule__Mixin__Group_6_3__1 ;
    public final void rule__Mixin__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2778:1: ( rule__Mixin__Group_6_3__0__Impl rule__Mixin__Group_6_3__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2779:2: rule__Mixin__Group_6_3__0__Impl rule__Mixin__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_6_3__0__Impl_in_rule__Mixin__Group_6_3__05464);
            rule__Mixin__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_6_3__1_in_rule__Mixin__Group_6_3__05467);
            rule__Mixin__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6_3__0"


    // $ANTLR start "rule__Mixin__Group_6_3__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2786:1: rule__Mixin__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Mixin__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2790:1: ( ( ',' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2791:1: ( ',' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2791:1: ( ',' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2792:1: ','
            {
             before(grammarAccess.getMixinAccess().getCommaKeyword_6_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Mixin__Group_6_3__0__Impl5495); 
             after(grammarAccess.getMixinAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6_3__0__Impl"


    // $ANTLR start "rule__Mixin__Group_6_3__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2805:1: rule__Mixin__Group_6_3__1 : rule__Mixin__Group_6_3__1__Impl ;
    public final void rule__Mixin__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2809:1: ( rule__Mixin__Group_6_3__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2810:2: rule__Mixin__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_6_3__1__Impl_in_rule__Mixin__Group_6_3__15526);
            rule__Mixin__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6_3__1"


    // $ANTLR start "rule__Mixin__Group_6_3__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2816:1: rule__Mixin__Group_6_3__1__Impl : ( ( rule__Mixin__AttributesAssignment_6_3_1 ) ) ;
    public final void rule__Mixin__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2820:1: ( ( ( rule__Mixin__AttributesAssignment_6_3_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2821:1: ( ( rule__Mixin__AttributesAssignment_6_3_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2821:1: ( ( rule__Mixin__AttributesAssignment_6_3_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2822:1: ( rule__Mixin__AttributesAssignment_6_3_1 )
            {
             before(grammarAccess.getMixinAccess().getAttributesAssignment_6_3_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2823:1: ( rule__Mixin__AttributesAssignment_6_3_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2823:2: rule__Mixin__AttributesAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__AttributesAssignment_6_3_1_in_rule__Mixin__Group_6_3__1__Impl5553);
            rule__Mixin__AttributesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getAttributesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6_3__1__Impl"


    // $ANTLR start "rule__Mixin__Group_7__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2837:1: rule__Mixin__Group_7__0 : rule__Mixin__Group_7__0__Impl rule__Mixin__Group_7__1 ;
    public final void rule__Mixin__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2841:1: ( rule__Mixin__Group_7__0__Impl rule__Mixin__Group_7__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2842:2: rule__Mixin__Group_7__0__Impl rule__Mixin__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_7__0__Impl_in_rule__Mixin__Group_7__05587);
            rule__Mixin__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_7__1_in_rule__Mixin__Group_7__05590);
            rule__Mixin__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__0"


    // $ANTLR start "rule__Mixin__Group_7__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2849:1: rule__Mixin__Group_7__0__Impl : ( 'actions' ) ;
    public final void rule__Mixin__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2853:1: ( ( 'actions' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2854:1: ( 'actions' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2854:1: ( 'actions' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2855:1: 'actions'
            {
             before(grammarAccess.getMixinAccess().getActionsKeyword_7_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Mixin__Group_7__0__Impl5618); 
             after(grammarAccess.getMixinAccess().getActionsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__0__Impl"


    // $ANTLR start "rule__Mixin__Group_7__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2868:1: rule__Mixin__Group_7__1 : rule__Mixin__Group_7__1__Impl rule__Mixin__Group_7__2 ;
    public final void rule__Mixin__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2872:1: ( rule__Mixin__Group_7__1__Impl rule__Mixin__Group_7__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2873:2: rule__Mixin__Group_7__1__Impl rule__Mixin__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_7__1__Impl_in_rule__Mixin__Group_7__15649);
            rule__Mixin__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_7__2_in_rule__Mixin__Group_7__15652);
            rule__Mixin__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__1"


    // $ANTLR start "rule__Mixin__Group_7__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2880:1: rule__Mixin__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Mixin__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2884:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2885:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2885:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2886:1: '{'
            {
             before(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Mixin__Group_7__1__Impl5680); 
             after(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__1__Impl"


    // $ANTLR start "rule__Mixin__Group_7__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2899:1: rule__Mixin__Group_7__2 : rule__Mixin__Group_7__2__Impl rule__Mixin__Group_7__3 ;
    public final void rule__Mixin__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2903:1: ( rule__Mixin__Group_7__2__Impl rule__Mixin__Group_7__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2904:2: rule__Mixin__Group_7__2__Impl rule__Mixin__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_7__2__Impl_in_rule__Mixin__Group_7__25711);
            rule__Mixin__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_7__3_in_rule__Mixin__Group_7__25714);
            rule__Mixin__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__2"


    // $ANTLR start "rule__Mixin__Group_7__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2911:1: rule__Mixin__Group_7__2__Impl : ( ( rule__Mixin__ActionsAssignment_7_2 ) ) ;
    public final void rule__Mixin__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2915:1: ( ( ( rule__Mixin__ActionsAssignment_7_2 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2916:1: ( ( rule__Mixin__ActionsAssignment_7_2 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2916:1: ( ( rule__Mixin__ActionsAssignment_7_2 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2917:1: ( rule__Mixin__ActionsAssignment_7_2 )
            {
             before(grammarAccess.getMixinAccess().getActionsAssignment_7_2()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2918:1: ( rule__Mixin__ActionsAssignment_7_2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2918:2: rule__Mixin__ActionsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__ActionsAssignment_7_2_in_rule__Mixin__Group_7__2__Impl5741);
            rule__Mixin__ActionsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getActionsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__2__Impl"


    // $ANTLR start "rule__Mixin__Group_7__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2928:1: rule__Mixin__Group_7__3 : rule__Mixin__Group_7__3__Impl rule__Mixin__Group_7__4 ;
    public final void rule__Mixin__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2932:1: ( rule__Mixin__Group_7__3__Impl rule__Mixin__Group_7__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2933:2: rule__Mixin__Group_7__3__Impl rule__Mixin__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_7__3__Impl_in_rule__Mixin__Group_7__35771);
            rule__Mixin__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_7__4_in_rule__Mixin__Group_7__35774);
            rule__Mixin__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__3"


    // $ANTLR start "rule__Mixin__Group_7__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2940:1: rule__Mixin__Group_7__3__Impl : ( ( rule__Mixin__Group_7_3__0 )* ) ;
    public final void rule__Mixin__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2944:1: ( ( ( rule__Mixin__Group_7_3__0 )* ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2945:1: ( ( rule__Mixin__Group_7_3__0 )* )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2945:1: ( ( rule__Mixin__Group_7_3__0 )* )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2946:1: ( rule__Mixin__Group_7_3__0 )*
            {
             before(grammarAccess.getMixinAccess().getGroup_7_3()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2947:1: ( rule__Mixin__Group_7_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2947:2: rule__Mixin__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_7_3__0_in_rule__Mixin__Group_7__3__Impl5801);
            	    rule__Mixin__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMixinAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__3__Impl"


    // $ANTLR start "rule__Mixin__Group_7__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2957:1: rule__Mixin__Group_7__4 : rule__Mixin__Group_7__4__Impl ;
    public final void rule__Mixin__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2961:1: ( rule__Mixin__Group_7__4__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2962:2: rule__Mixin__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_7__4__Impl_in_rule__Mixin__Group_7__45832);
            rule__Mixin__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__4"


    // $ANTLR start "rule__Mixin__Group_7__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2968:1: rule__Mixin__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Mixin__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2972:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2973:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2973:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2974:1: '}'
            {
             before(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Mixin__Group_7__4__Impl5860); 
             after(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__4__Impl"


    // $ANTLR start "rule__Mixin__Group_7_3__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:2997:1: rule__Mixin__Group_7_3__0 : rule__Mixin__Group_7_3__0__Impl rule__Mixin__Group_7_3__1 ;
    public final void rule__Mixin__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3001:1: ( rule__Mixin__Group_7_3__0__Impl rule__Mixin__Group_7_3__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3002:2: rule__Mixin__Group_7_3__0__Impl rule__Mixin__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_7_3__0__Impl_in_rule__Mixin__Group_7_3__05901);
            rule__Mixin__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_7_3__1_in_rule__Mixin__Group_7_3__05904);
            rule__Mixin__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7_3__0"


    // $ANTLR start "rule__Mixin__Group_7_3__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3009:1: rule__Mixin__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Mixin__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3013:1: ( ( ',' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3014:1: ( ',' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3014:1: ( ',' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3015:1: ','
            {
             before(grammarAccess.getMixinAccess().getCommaKeyword_7_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Mixin__Group_7_3__0__Impl5932); 
             after(grammarAccess.getMixinAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7_3__0__Impl"


    // $ANTLR start "rule__Mixin__Group_7_3__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3028:1: rule__Mixin__Group_7_3__1 : rule__Mixin__Group_7_3__1__Impl ;
    public final void rule__Mixin__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3032:1: ( rule__Mixin__Group_7_3__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3033:2: rule__Mixin__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__Group_7_3__1__Impl_in_rule__Mixin__Group_7_3__15963);
            rule__Mixin__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7_3__1"


    // $ANTLR start "rule__Mixin__Group_7_3__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3039:1: rule__Mixin__Group_7_3__1__Impl : ( ( rule__Mixin__ActionsAssignment_7_3_1 ) ) ;
    public final void rule__Mixin__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3043:1: ( ( ( rule__Mixin__ActionsAssignment_7_3_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3044:1: ( ( rule__Mixin__ActionsAssignment_7_3_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3044:1: ( ( rule__Mixin__ActionsAssignment_7_3_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3045:1: ( rule__Mixin__ActionsAssignment_7_3_1 )
            {
             before(grammarAccess.getMixinAccess().getActionsAssignment_7_3_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3046:1: ( rule__Mixin__ActionsAssignment_7_3_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3046:2: rule__Mixin__ActionsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mixin__ActionsAssignment_7_3_1_in_rule__Mixin__Group_7_3__1__Impl5990);
            rule__Mixin__ActionsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getActionsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3060:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3064:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3065:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__06024);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__06027);
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
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3072:1: rule__Attribute__Group__0__Impl : ( 'Attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3076:1: ( ( 'Attribute' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3077:1: ( 'Attribute' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3077:1: ( 'Attribute' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3078:1: 'Attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Attribute__Group__0__Impl6055); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
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
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3091:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3095:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3096:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__16086);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__16089);
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
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3103:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3107:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3108:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3108:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3109:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3110:1: ( rule__Attribute__NameAssignment_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3110:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl6116);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3120:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3124:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3125:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__26146);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__26149);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
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
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3132:1: rule__Attribute__Group__2__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3136:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3137:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3137:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3138:1: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Attribute__Group__2__Impl6177); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__Group__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3151:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3155:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3156:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__36208);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__36211);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3163:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__Group_3__0 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3167:1: ( ( ( rule__Attribute__Group_3__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3168:1: ( ( rule__Attribute__Group_3__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3168:1: ( ( rule__Attribute__Group_3__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3169:1: ( rule__Attribute__Group_3__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_3()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3170:1: ( rule__Attribute__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3170:2: rule__Attribute__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_3__0_in_rule__Attribute__Group__3__Impl6238);
                    rule__Attribute__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3180:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3184:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3185:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__46269);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__46272);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3192:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3196:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3197:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3197:1: ( ( rule__Attribute__Group_4__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3198:1: ( rule__Attribute__Group_4__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_4()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3199:1: ( rule__Attribute__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3199:2: rule__Attribute__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl6299);
                    rule__Attribute__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3209:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3213:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3214:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__56330);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__56333);
            rule__Attribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3221:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3225:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3226:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3226:1: ( ( rule__Attribute__Group_5__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3227:1: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3228:1: ( rule__Attribute__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3228:2: rule__Attribute__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl6360);
                    rule__Attribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3238:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3242:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3243:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__6__Impl_in_rule__Attribute__Group__66391);
            rule__Attribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__7_in_rule__Attribute__Group__66394);
            rule__Attribute__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3250:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__Group_6__0 )? ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3254:1: ( ( ( rule__Attribute__Group_6__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3255:1: ( ( rule__Attribute__Group_6__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3255:1: ( ( rule__Attribute__Group_6__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3256:1: ( rule__Attribute__Group_6__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_6()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3257:1: ( rule__Attribute__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3257:2: rule__Attribute__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_6__0_in_rule__Attribute__Group__6__Impl6421);
                    rule__Attribute__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group__7"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3267:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3271:1: ( rule__Attribute__Group__7__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3272:2: rule__Attribute__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__7__Impl_in_rule__Attribute__Group__76452);
            rule__Attribute__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__7"


    // $ANTLR start "rule__Attribute__Group__7__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3278:1: rule__Attribute__Group__7__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3282:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3283:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3283:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3284:1: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Attribute__Group__7__Impl6480); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__7__Impl"


    // $ANTLR start "rule__Attribute__Group_3__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3313:1: rule__Attribute__Group_3__0 : rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 ;
    public final void rule__Attribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3317:1: ( rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3318:2: rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_3__0__Impl_in_rule__Attribute__Group_3__06527);
            rule__Attribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_3__1_in_rule__Attribute__Group_3__06530);
            rule__Attribute__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__0"


    // $ANTLR start "rule__Attribute__Group_3__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3325:1: rule__Attribute__Group_3__0__Impl : ( 'mutable' ) ;
    public final void rule__Attribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3329:1: ( ( 'mutable' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3330:1: ( 'mutable' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3330:1: ( 'mutable' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3331:1: 'mutable'
            {
             before(grammarAccess.getAttributeAccess().getMutableKeyword_3_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Attribute__Group_3__0__Impl6558); 
             after(grammarAccess.getAttributeAccess().getMutableKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__0__Impl"


    // $ANTLR start "rule__Attribute__Group_3__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3344:1: rule__Attribute__Group_3__1 : rule__Attribute__Group_3__1__Impl ;
    public final void rule__Attribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3348:1: ( rule__Attribute__Group_3__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3349:2: rule__Attribute__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_3__1__Impl_in_rule__Attribute__Group_3__16589);
            rule__Attribute__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__1"


    // $ANTLR start "rule__Attribute__Group_3__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3355:1: rule__Attribute__Group_3__1__Impl : ( ( rule__Attribute__MutableAssignment_3_1 ) ) ;
    public final void rule__Attribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3359:1: ( ( ( rule__Attribute__MutableAssignment_3_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3360:1: ( ( rule__Attribute__MutableAssignment_3_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3360:1: ( ( rule__Attribute__MutableAssignment_3_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3361:1: ( rule__Attribute__MutableAssignment_3_1 )
            {
             before(grammarAccess.getAttributeAccess().getMutableAssignment_3_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3362:1: ( rule__Attribute__MutableAssignment_3_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3362:2: rule__Attribute__MutableAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__MutableAssignment_3_1_in_rule__Attribute__Group_3__1__Impl6616);
            rule__Attribute__MutableAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMutableAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group_4__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3376:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3380:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3381:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__06650);
            rule__Attribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__06653);
            rule__Attribute__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__0"


    // $ANTLR start "rule__Attribute__Group_4__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3388:1: rule__Attribute__Group_4__0__Impl : ( 'required' ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3392:1: ( ( 'required' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3393:1: ( 'required' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3393:1: ( 'required' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3394:1: 'required'
            {
             before(grammarAccess.getAttributeAccess().getRequiredKeyword_4_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Attribute__Group_4__0__Impl6681); 
             after(grammarAccess.getAttributeAccess().getRequiredKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__0__Impl"


    // $ANTLR start "rule__Attribute__Group_4__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3407:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3411:1: ( rule__Attribute__Group_4__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3412:2: rule__Attribute__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__16712);
            rule__Attribute__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__1"


    // $ANTLR start "rule__Attribute__Group_4__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3418:1: rule__Attribute__Group_4__1__Impl : ( ( rule__Attribute__RequiredAssignment_4_1 ) ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3422:1: ( ( ( rule__Attribute__RequiredAssignment_4_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3423:1: ( ( rule__Attribute__RequiredAssignment_4_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3423:1: ( ( rule__Attribute__RequiredAssignment_4_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3424:1: ( rule__Attribute__RequiredAssignment_4_1 )
            {
             before(grammarAccess.getAttributeAccess().getRequiredAssignment_4_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3425:1: ( rule__Attribute__RequiredAssignment_4_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3425:2: rule__Attribute__RequiredAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__RequiredAssignment_4_1_in_rule__Attribute__Group_4__1__Impl6739);
            rule__Attribute__RequiredAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getRequiredAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3439:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3443:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3444:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__06773);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__06776);
            rule__Attribute__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__0"


    // $ANTLR start "rule__Attribute__Group_5__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3451:1: rule__Attribute__Group_5__0__Impl : ( 'default' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3455:1: ( ( 'default' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3456:1: ( 'default' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3456:1: ( 'default' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3457:1: 'default'
            {
             before(grammarAccess.getAttributeAccess().getDefaultKeyword_5_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Attribute__Group_5__0__Impl6804); 
             after(grammarAccess.getAttributeAccess().getDefaultKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3470:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3474:1: ( rule__Attribute__Group_5__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3475:2: rule__Attribute__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__16835);
            rule__Attribute__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__1"


    // $ANTLR start "rule__Attribute__Group_5__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3481:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__DefaultAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3485:1: ( ( ( rule__Attribute__DefaultAssignment_5_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3486:1: ( ( rule__Attribute__DefaultAssignment_5_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3486:1: ( ( rule__Attribute__DefaultAssignment_5_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3487:1: ( rule__Attribute__DefaultAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getDefaultAssignment_5_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3488:1: ( rule__Attribute__DefaultAssignment_5_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3488:2: rule__Attribute__DefaultAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__DefaultAssignment_5_1_in_rule__Attribute__Group_5__1__Impl6862);
            rule__Attribute__DefaultAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDefaultAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__1__Impl"


    // $ANTLR start "rule__Attribute__Group_6__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3502:1: rule__Attribute__Group_6__0 : rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1 ;
    public final void rule__Attribute__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3506:1: ( rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3507:2: rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_6__0__Impl_in_rule__Attribute__Group_6__06896);
            rule__Attribute__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_6__1_in_rule__Attribute__Group_6__06899);
            rule__Attribute__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_6__0"


    // $ANTLR start "rule__Attribute__Group_6__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3514:1: rule__Attribute__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__Attribute__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3518:1: ( ( 'description' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3519:1: ( 'description' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3519:1: ( 'description' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3520:1: 'description'
            {
             before(grammarAccess.getAttributeAccess().getDescriptionKeyword_6_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Attribute__Group_6__0__Impl6927); 
             after(grammarAccess.getAttributeAccess().getDescriptionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_6__0__Impl"


    // $ANTLR start "rule__Attribute__Group_6__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3533:1: rule__Attribute__Group_6__1 : rule__Attribute__Group_6__1__Impl ;
    public final void rule__Attribute__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3537:1: ( rule__Attribute__Group_6__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3538:2: rule__Attribute__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_6__1__Impl_in_rule__Attribute__Group_6__16958);
            rule__Attribute__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_6__1"


    // $ANTLR start "rule__Attribute__Group_6__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3544:1: rule__Attribute__Group_6__1__Impl : ( ( rule__Attribute__DescriptionAssignment_6_1 ) ) ;
    public final void rule__Attribute__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3548:1: ( ( ( rule__Attribute__DescriptionAssignment_6_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3549:1: ( ( rule__Attribute__DescriptionAssignment_6_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3549:1: ( ( rule__Attribute__DescriptionAssignment_6_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3550:1: ( rule__Attribute__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getAttributeAccess().getDescriptionAssignment_6_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3551:1: ( rule__Attribute__DescriptionAssignment_6_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3551:2: rule__Attribute__DescriptionAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__DescriptionAssignment_6_1_in_rule__Attribute__Group_6__1__Impl6985);
            rule__Attribute__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDescriptionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_6__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3565:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3569:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3570:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__07019);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__1_in_rule__Action__Group__07022);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3577:1: rule__Action__Group__0__Impl : ( 'Action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3581:1: ( ( 'Action' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3582:1: ( 'Action' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3582:1: ( 'Action' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3583:1: 'Action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Action__Group__0__Impl7050); 
             after(grammarAccess.getActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3596:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3600:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3601:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__17081);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__2_in_rule__Action__Group__17084);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3608:1: rule__Action__Group__1__Impl : ( ( rule__Action__TermAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3612:1: ( ( ( rule__Action__TermAssignment_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3613:1: ( ( rule__Action__TermAssignment_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3613:1: ( ( rule__Action__TermAssignment_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3614:1: ( rule__Action__TermAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getTermAssignment_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3615:1: ( rule__Action__TermAssignment_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3615:2: rule__Action__TermAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__TermAssignment_1_in_rule__Action__Group__1__Impl7111);
            rule__Action__TermAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getTermAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3625:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3629:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3630:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__27141);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__3_in_rule__Action__Group__27144);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3637:1: rule__Action__Group__2__Impl : ( '{' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3641:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3642:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3642:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3643:1: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Action__Group__2__Impl7172); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3656:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3660:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3661:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__37203);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__4_in_rule__Action__Group__37206);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3668:1: rule__Action__Group__3__Impl : ( 'scheme' ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3672:1: ( ( 'scheme' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3673:1: ( 'scheme' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3673:1: ( 'scheme' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3674:1: 'scheme'
            {
             before(grammarAccess.getActionAccess().getSchemeKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Action__Group__3__Impl7234); 
             after(grammarAccess.getActionAccess().getSchemeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3687:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3691:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3692:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__47265);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__5_in_rule__Action__Group__47268);
            rule__Action__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3699:1: rule__Action__Group__4__Impl : ( ( rule__Action__SchemeAssignment_4 ) ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3703:1: ( ( ( rule__Action__SchemeAssignment_4 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3704:1: ( ( rule__Action__SchemeAssignment_4 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3704:1: ( ( rule__Action__SchemeAssignment_4 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3705:1: ( rule__Action__SchemeAssignment_4 )
            {
             before(grammarAccess.getActionAccess().getSchemeAssignment_4()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3706:1: ( rule__Action__SchemeAssignment_4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3706:2: rule__Action__SchemeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__SchemeAssignment_4_in_rule__Action__Group__4__Impl7295);
            rule__Action__SchemeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getSchemeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3716:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3720:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3721:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__57325);
            rule__Action__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__6_in_rule__Action__Group__57328);
            rule__Action__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3728:1: rule__Action__Group__5__Impl : ( ( rule__Action__Group_5__0 )? ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3732:1: ( ( ( rule__Action__Group_5__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3733:1: ( ( rule__Action__Group_5__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3733:1: ( ( rule__Action__Group_5__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3734:1: ( rule__Action__Group_5__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_5()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3735:1: ( rule__Action__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3735:2: rule__Action__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Action__Group_5__0_in_rule__Action__Group__5__Impl7355);
                    rule__Action__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__6"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3745:1: rule__Action__Group__6 : rule__Action__Group__6__Impl rule__Action__Group__7 ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3749:1: ( rule__Action__Group__6__Impl rule__Action__Group__7 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3750:2: rule__Action__Group__6__Impl rule__Action__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__6__Impl_in_rule__Action__Group__67386);
            rule__Action__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__7_in_rule__Action__Group__67389);
            rule__Action__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6"


    // $ANTLR start "rule__Action__Group__6__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3757:1: rule__Action__Group__6__Impl : ( ( rule__Action__Group_6__0 )? ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3761:1: ( ( ( rule__Action__Group_6__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3762:1: ( ( rule__Action__Group_6__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3762:1: ( ( rule__Action__Group_6__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3763:1: ( rule__Action__Group_6__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_6()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3764:1: ( rule__Action__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3764:2: rule__Action__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Action__Group_6__0_in_rule__Action__Group__6__Impl7416);
                    rule__Action__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6__Impl"


    // $ANTLR start "rule__Action__Group__7"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3774:1: rule__Action__Group__7 : rule__Action__Group__7__Impl ;
    public final void rule__Action__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3778:1: ( rule__Action__Group__7__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3779:2: rule__Action__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__7__Impl_in_rule__Action__Group__77447);
            rule__Action__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7"


    // $ANTLR start "rule__Action__Group__7__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3785:1: rule__Action__Group__7__Impl : ( '}' ) ;
    public final void rule__Action__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3789:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3790:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3790:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3791:1: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Action__Group__7__Impl7475); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7__Impl"


    // $ANTLR start "rule__Action__Group_5__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3820:1: rule__Action__Group_5__0 : rule__Action__Group_5__0__Impl rule__Action__Group_5__1 ;
    public final void rule__Action__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3824:1: ( rule__Action__Group_5__0__Impl rule__Action__Group_5__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3825:2: rule__Action__Group_5__0__Impl rule__Action__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_5__0__Impl_in_rule__Action__Group_5__07522);
            rule__Action__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_5__1_in_rule__Action__Group_5__07525);
            rule__Action__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__0"


    // $ANTLR start "rule__Action__Group_5__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3832:1: rule__Action__Group_5__0__Impl : ( 'title' ) ;
    public final void rule__Action__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3836:1: ( ( 'title' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3837:1: ( 'title' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3837:1: ( 'title' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3838:1: 'title'
            {
             before(grammarAccess.getActionAccess().getTitleKeyword_5_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Action__Group_5__0__Impl7553); 
             after(grammarAccess.getActionAccess().getTitleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__0__Impl"


    // $ANTLR start "rule__Action__Group_5__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3851:1: rule__Action__Group_5__1 : rule__Action__Group_5__1__Impl ;
    public final void rule__Action__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3855:1: ( rule__Action__Group_5__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3856:2: rule__Action__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_5__1__Impl_in_rule__Action__Group_5__17584);
            rule__Action__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__1"


    // $ANTLR start "rule__Action__Group_5__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3862:1: rule__Action__Group_5__1__Impl : ( ( rule__Action__TitleAssignment_5_1 ) ) ;
    public final void rule__Action__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3866:1: ( ( ( rule__Action__TitleAssignment_5_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3867:1: ( ( rule__Action__TitleAssignment_5_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3867:1: ( ( rule__Action__TitleAssignment_5_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3868:1: ( rule__Action__TitleAssignment_5_1 )
            {
             before(grammarAccess.getActionAccess().getTitleAssignment_5_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3869:1: ( rule__Action__TitleAssignment_5_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3869:2: rule__Action__TitleAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__TitleAssignment_5_1_in_rule__Action__Group_5__1__Impl7611);
            rule__Action__TitleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getTitleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__1__Impl"


    // $ANTLR start "rule__Action__Group_6__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3883:1: rule__Action__Group_6__0 : rule__Action__Group_6__0__Impl rule__Action__Group_6__1 ;
    public final void rule__Action__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3887:1: ( rule__Action__Group_6__0__Impl rule__Action__Group_6__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3888:2: rule__Action__Group_6__0__Impl rule__Action__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_6__0__Impl_in_rule__Action__Group_6__07645);
            rule__Action__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_6__1_in_rule__Action__Group_6__07648);
            rule__Action__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__0"


    // $ANTLR start "rule__Action__Group_6__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3895:1: rule__Action__Group_6__0__Impl : ( 'attributes' ) ;
    public final void rule__Action__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3899:1: ( ( 'attributes' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3900:1: ( 'attributes' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3900:1: ( 'attributes' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3901:1: 'attributes'
            {
             before(grammarAccess.getActionAccess().getAttributesKeyword_6_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Action__Group_6__0__Impl7676); 
             after(grammarAccess.getActionAccess().getAttributesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__0__Impl"


    // $ANTLR start "rule__Action__Group_6__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3914:1: rule__Action__Group_6__1 : rule__Action__Group_6__1__Impl rule__Action__Group_6__2 ;
    public final void rule__Action__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3918:1: ( rule__Action__Group_6__1__Impl rule__Action__Group_6__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3919:2: rule__Action__Group_6__1__Impl rule__Action__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_6__1__Impl_in_rule__Action__Group_6__17707);
            rule__Action__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_6__2_in_rule__Action__Group_6__17710);
            rule__Action__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__1"


    // $ANTLR start "rule__Action__Group_6__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3926:1: rule__Action__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Action__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3930:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3931:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3931:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3932:1: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Action__Group_6__1__Impl7738); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__1__Impl"


    // $ANTLR start "rule__Action__Group_6__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3945:1: rule__Action__Group_6__2 : rule__Action__Group_6__2__Impl rule__Action__Group_6__3 ;
    public final void rule__Action__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3949:1: ( rule__Action__Group_6__2__Impl rule__Action__Group_6__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3950:2: rule__Action__Group_6__2__Impl rule__Action__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_6__2__Impl_in_rule__Action__Group_6__27769);
            rule__Action__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_6__3_in_rule__Action__Group_6__27772);
            rule__Action__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__2"


    // $ANTLR start "rule__Action__Group_6__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3957:1: rule__Action__Group_6__2__Impl : ( ( rule__Action__AttributesAssignment_6_2 ) ) ;
    public final void rule__Action__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3961:1: ( ( ( rule__Action__AttributesAssignment_6_2 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3962:1: ( ( rule__Action__AttributesAssignment_6_2 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3962:1: ( ( rule__Action__AttributesAssignment_6_2 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3963:1: ( rule__Action__AttributesAssignment_6_2 )
            {
             before(grammarAccess.getActionAccess().getAttributesAssignment_6_2()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3964:1: ( rule__Action__AttributesAssignment_6_2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3964:2: rule__Action__AttributesAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__AttributesAssignment_6_2_in_rule__Action__Group_6__2__Impl7799);
            rule__Action__AttributesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAttributesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__2__Impl"


    // $ANTLR start "rule__Action__Group_6__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3974:1: rule__Action__Group_6__3 : rule__Action__Group_6__3__Impl rule__Action__Group_6__4 ;
    public final void rule__Action__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3978:1: ( rule__Action__Group_6__3__Impl rule__Action__Group_6__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3979:2: rule__Action__Group_6__3__Impl rule__Action__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_6__3__Impl_in_rule__Action__Group_6__37829);
            rule__Action__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_6__4_in_rule__Action__Group_6__37832);
            rule__Action__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__3"


    // $ANTLR start "rule__Action__Group_6__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3986:1: rule__Action__Group_6__3__Impl : ( ( rule__Action__Group_6_3__0 )* ) ;
    public final void rule__Action__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3990:1: ( ( ( rule__Action__Group_6_3__0 )* ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3991:1: ( ( rule__Action__Group_6_3__0 )* )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3991:1: ( ( rule__Action__Group_6_3__0 )* )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3992:1: ( rule__Action__Group_6_3__0 )*
            {
             before(grammarAccess.getActionAccess().getGroup_6_3()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3993:1: ( rule__Action__Group_6_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==20) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:3993:2: rule__Action__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Action__Group_6_3__0_in_rule__Action__Group_6__3__Impl7859);
            	    rule__Action__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__3__Impl"


    // $ANTLR start "rule__Action__Group_6__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4003:1: rule__Action__Group_6__4 : rule__Action__Group_6__4__Impl ;
    public final void rule__Action__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4007:1: ( rule__Action__Group_6__4__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4008:2: rule__Action__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_6__4__Impl_in_rule__Action__Group_6__47890);
            rule__Action__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__4"


    // $ANTLR start "rule__Action__Group_6__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4014:1: rule__Action__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Action__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4018:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4019:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4019:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4020:1: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Action__Group_6__4__Impl7918); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__4__Impl"


    // $ANTLR start "rule__Action__Group_6_3__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4043:1: rule__Action__Group_6_3__0 : rule__Action__Group_6_3__0__Impl rule__Action__Group_6_3__1 ;
    public final void rule__Action__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4047:1: ( rule__Action__Group_6_3__0__Impl rule__Action__Group_6_3__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4048:2: rule__Action__Group_6_3__0__Impl rule__Action__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_6_3__0__Impl_in_rule__Action__Group_6_3__07959);
            rule__Action__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_6_3__1_in_rule__Action__Group_6_3__07962);
            rule__Action__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6_3__0"


    // $ANTLR start "rule__Action__Group_6_3__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4055:1: rule__Action__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Action__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4059:1: ( ( ',' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4060:1: ( ',' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4060:1: ( ',' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4061:1: ','
            {
             before(grammarAccess.getActionAccess().getCommaKeyword_6_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Action__Group_6_3__0__Impl7990); 
             after(grammarAccess.getActionAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6_3__0__Impl"


    // $ANTLR start "rule__Action__Group_6_3__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4074:1: rule__Action__Group_6_3__1 : rule__Action__Group_6_3__1__Impl ;
    public final void rule__Action__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4078:1: ( rule__Action__Group_6_3__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4079:2: rule__Action__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_6_3__1__Impl_in_rule__Action__Group_6_3__18021);
            rule__Action__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6_3__1"


    // $ANTLR start "rule__Action__Group_6_3__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4085:1: rule__Action__Group_6_3__1__Impl : ( ( rule__Action__AttributesAssignment_6_3_1 ) ) ;
    public final void rule__Action__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4089:1: ( ( ( rule__Action__AttributesAssignment_6_3_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4090:1: ( ( rule__Action__AttributesAssignment_6_3_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4090:1: ( ( rule__Action__AttributesAssignment_6_3_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4091:1: ( rule__Action__AttributesAssignment_6_3_1 )
            {
             before(grammarAccess.getActionAccess().getAttributesAssignment_6_3_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4092:1: ( rule__Action__AttributesAssignment_6_3_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4092:2: rule__Action__AttributesAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__AttributesAssignment_6_3_1_in_rule__Action__Group_6_3__1__Impl8048);
            rule__Action__AttributesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAttributesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6_3__1__Impl"


    // $ANTLR start "rule__EEnum__Group__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4106:1: rule__EEnum__Group__0 : rule__EEnum__Group__0__Impl rule__EEnum__Group__1 ;
    public final void rule__EEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4110:1: ( rule__EEnum__Group__0__Impl rule__EEnum__Group__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4111:2: rule__EEnum__Group__0__Impl rule__EEnum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__0__Impl_in_rule__EEnum__Group__08082);
            rule__EEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__1_in_rule__EEnum__Group__08085);
            rule__EEnum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__0"


    // $ANTLR start "rule__EEnum__Group__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4118:1: rule__EEnum__Group__0__Impl : ( () ) ;
    public final void rule__EEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4122:1: ( ( () ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4123:1: ( () )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4123:1: ( () )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4124:1: ()
            {
             before(grammarAccess.getEEnumAccess().getEEnumAction_0()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4125:1: ()
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4127:1: 
            {
            }

             after(grammarAccess.getEEnumAccess().getEEnumAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__0__Impl"


    // $ANTLR start "rule__EEnum__Group__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4137:1: rule__EEnum__Group__1 : rule__EEnum__Group__1__Impl rule__EEnum__Group__2 ;
    public final void rule__EEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4141:1: ( rule__EEnum__Group__1__Impl rule__EEnum__Group__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4142:2: rule__EEnum__Group__1__Impl rule__EEnum__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__1__Impl_in_rule__EEnum__Group__18143);
            rule__EEnum__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__2_in_rule__EEnum__Group__18146);
            rule__EEnum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__1"


    // $ANTLR start "rule__EEnum__Group__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4149:1: rule__EEnum__Group__1__Impl : ( 'EEnum' ) ;
    public final void rule__EEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4153:1: ( ( 'EEnum' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4154:1: ( 'EEnum' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4154:1: ( 'EEnum' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4155:1: 'EEnum'
            {
             before(grammarAccess.getEEnumAccess().getEEnumKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__EEnum__Group__1__Impl8174); 
             after(grammarAccess.getEEnumAccess().getEEnumKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__1__Impl"


    // $ANTLR start "rule__EEnum__Group__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4168:1: rule__EEnum__Group__2 : rule__EEnum__Group__2__Impl rule__EEnum__Group__3 ;
    public final void rule__EEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4172:1: ( rule__EEnum__Group__2__Impl rule__EEnum__Group__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4173:2: rule__EEnum__Group__2__Impl rule__EEnum__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__2__Impl_in_rule__EEnum__Group__28205);
            rule__EEnum__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__3_in_rule__EEnum__Group__28208);
            rule__EEnum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__2"


    // $ANTLR start "rule__EEnum__Group__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4180:1: rule__EEnum__Group__2__Impl : ( ( rule__EEnum__NameAssignment_2 ) ) ;
    public final void rule__EEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4184:1: ( ( ( rule__EEnum__NameAssignment_2 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4185:1: ( ( rule__EEnum__NameAssignment_2 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4185:1: ( ( rule__EEnum__NameAssignment_2 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4186:1: ( rule__EEnum__NameAssignment_2 )
            {
             before(grammarAccess.getEEnumAccess().getNameAssignment_2()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4187:1: ( rule__EEnum__NameAssignment_2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4187:2: rule__EEnum__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__NameAssignment_2_in_rule__EEnum__Group__2__Impl8235);
            rule__EEnum__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEEnumAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__2__Impl"


    // $ANTLR start "rule__EEnum__Group__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4197:1: rule__EEnum__Group__3 : rule__EEnum__Group__3__Impl rule__EEnum__Group__4 ;
    public final void rule__EEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4201:1: ( rule__EEnum__Group__3__Impl rule__EEnum__Group__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4202:2: rule__EEnum__Group__3__Impl rule__EEnum__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__3__Impl_in_rule__EEnum__Group__38265);
            rule__EEnum__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__4_in_rule__EEnum__Group__38268);
            rule__EEnum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__3"


    // $ANTLR start "rule__EEnum__Group__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4209:1: rule__EEnum__Group__3__Impl : ( '{' ) ;
    public final void rule__EEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4213:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4214:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4214:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4215:1: '{'
            {
             before(grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__EEnum__Group__3__Impl8296); 
             after(grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__3__Impl"


    // $ANTLR start "rule__EEnum__Group__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4228:1: rule__EEnum__Group__4 : rule__EEnum__Group__4__Impl rule__EEnum__Group__5 ;
    public final void rule__EEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4232:1: ( rule__EEnum__Group__4__Impl rule__EEnum__Group__5 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4233:2: rule__EEnum__Group__4__Impl rule__EEnum__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__4__Impl_in_rule__EEnum__Group__48327);
            rule__EEnum__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__5_in_rule__EEnum__Group__48330);
            rule__EEnum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__4"


    // $ANTLR start "rule__EEnum__Group__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4240:1: rule__EEnum__Group__4__Impl : ( ( rule__EEnum__Group_4__0 )? ) ;
    public final void rule__EEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4244:1: ( ( ( rule__EEnum__Group_4__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4245:1: ( ( rule__EEnum__Group_4__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4245:1: ( ( rule__EEnum__Group_4__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4246:1: ( rule__EEnum__Group_4__0 )?
            {
             before(grammarAccess.getEEnumAccess().getGroup_4()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4247:1: ( rule__EEnum__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4247:2: rule__EEnum__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_4__0_in_rule__EEnum__Group__4__Impl8357);
                    rule__EEnum__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEEnumAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__4__Impl"


    // $ANTLR start "rule__EEnum__Group__5"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4257:1: rule__EEnum__Group__5 : rule__EEnum__Group__5__Impl rule__EEnum__Group__6 ;
    public final void rule__EEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4261:1: ( rule__EEnum__Group__5__Impl rule__EEnum__Group__6 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4262:2: rule__EEnum__Group__5__Impl rule__EEnum__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__5__Impl_in_rule__EEnum__Group__58388);
            rule__EEnum__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__6_in_rule__EEnum__Group__58391);
            rule__EEnum__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__5"


    // $ANTLR start "rule__EEnum__Group__5__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4269:1: rule__EEnum__Group__5__Impl : ( ( rule__EEnum__Group_5__0 )? ) ;
    public final void rule__EEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4273:1: ( ( ( rule__EEnum__Group_5__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4274:1: ( ( rule__EEnum__Group_5__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4274:1: ( ( rule__EEnum__Group_5__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4275:1: ( rule__EEnum__Group_5__0 )?
            {
             before(grammarAccess.getEEnumAccess().getGroup_5()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4276:1: ( rule__EEnum__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4276:2: rule__EEnum__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_5__0_in_rule__EEnum__Group__5__Impl8418);
                    rule__EEnum__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEEnumAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__5__Impl"


    // $ANTLR start "rule__EEnum__Group__6"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4286:1: rule__EEnum__Group__6 : rule__EEnum__Group__6__Impl rule__EEnum__Group__7 ;
    public final void rule__EEnum__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4290:1: ( rule__EEnum__Group__6__Impl rule__EEnum__Group__7 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4291:2: rule__EEnum__Group__6__Impl rule__EEnum__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__6__Impl_in_rule__EEnum__Group__68449);
            rule__EEnum__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__7_in_rule__EEnum__Group__68452);
            rule__EEnum__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__6"


    // $ANTLR start "rule__EEnum__Group__6__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4298:1: rule__EEnum__Group__6__Impl : ( ( rule__EEnum__Group_6__0 )? ) ;
    public final void rule__EEnum__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4302:1: ( ( ( rule__EEnum__Group_6__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4303:1: ( ( rule__EEnum__Group_6__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4303:1: ( ( rule__EEnum__Group_6__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4304:1: ( rule__EEnum__Group_6__0 )?
            {
             before(grammarAccess.getEEnumAccess().getGroup_6()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4305:1: ( rule__EEnum__Group_6__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4305:2: rule__EEnum__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_6__0_in_rule__EEnum__Group__6__Impl8479);
                    rule__EEnum__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEEnumAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__6__Impl"


    // $ANTLR start "rule__EEnum__Group__7"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4315:1: rule__EEnum__Group__7 : rule__EEnum__Group__7__Impl rule__EEnum__Group__8 ;
    public final void rule__EEnum__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4319:1: ( rule__EEnum__Group__7__Impl rule__EEnum__Group__8 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4320:2: rule__EEnum__Group__7__Impl rule__EEnum__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__7__Impl_in_rule__EEnum__Group__78510);
            rule__EEnum__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__8_in_rule__EEnum__Group__78513);
            rule__EEnum__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__7"


    // $ANTLR start "rule__EEnum__Group__7__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4327:1: rule__EEnum__Group__7__Impl : ( ( rule__EEnum__Group_7__0 )? ) ;
    public final void rule__EEnum__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4331:1: ( ( ( rule__EEnum__Group_7__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4332:1: ( ( rule__EEnum__Group_7__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4332:1: ( ( rule__EEnum__Group_7__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4333:1: ( rule__EEnum__Group_7__0 )?
            {
             before(grammarAccess.getEEnumAccess().getGroup_7()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4334:1: ( rule__EEnum__Group_7__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4334:2: rule__EEnum__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_7__0_in_rule__EEnum__Group__7__Impl8540);
                    rule__EEnum__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEEnumAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__7__Impl"


    // $ANTLR start "rule__EEnum__Group__8"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4344:1: rule__EEnum__Group__8 : rule__EEnum__Group__8__Impl ;
    public final void rule__EEnum__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4348:1: ( rule__EEnum__Group__8__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4349:2: rule__EEnum__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group__8__Impl_in_rule__EEnum__Group__88571);
            rule__EEnum__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__8"


    // $ANTLR start "rule__EEnum__Group__8__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4355:1: rule__EEnum__Group__8__Impl : ( '}' ) ;
    public final void rule__EEnum__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4359:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4360:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4360:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4361:1: '}'
            {
             before(grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__EEnum__Group__8__Impl8599); 
             after(grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group__8__Impl"


    // $ANTLR start "rule__EEnum__Group_4__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4392:1: rule__EEnum__Group_4__0 : rule__EEnum__Group_4__0__Impl rule__EEnum__Group_4__1 ;
    public final void rule__EEnum__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4396:1: ( rule__EEnum__Group_4__0__Impl rule__EEnum__Group_4__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4397:2: rule__EEnum__Group_4__0__Impl rule__EEnum__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_4__0__Impl_in_rule__EEnum__Group_4__08648);
            rule__EEnum__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_4__1_in_rule__EEnum__Group_4__08651);
            rule__EEnum__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_4__0"


    // $ANTLR start "rule__EEnum__Group_4__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4404:1: rule__EEnum__Group_4__0__Impl : ( 'instanceClassName' ) ;
    public final void rule__EEnum__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4408:1: ( ( 'instanceClassName' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4409:1: ( 'instanceClassName' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4409:1: ( 'instanceClassName' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4410:1: 'instanceClassName'
            {
             before(grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__EEnum__Group_4__0__Impl8679); 
             after(grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_4__0__Impl"


    // $ANTLR start "rule__EEnum__Group_4__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4423:1: rule__EEnum__Group_4__1 : rule__EEnum__Group_4__1__Impl ;
    public final void rule__EEnum__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4427:1: ( rule__EEnum__Group_4__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4428:2: rule__EEnum__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_4__1__Impl_in_rule__EEnum__Group_4__18710);
            rule__EEnum__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_4__1"


    // $ANTLR start "rule__EEnum__Group_4__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4434:1: rule__EEnum__Group_4__1__Impl : ( ( rule__EEnum__InstanceClassNameAssignment_4_1 ) ) ;
    public final void rule__EEnum__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4438:1: ( ( ( rule__EEnum__InstanceClassNameAssignment_4_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4439:1: ( ( rule__EEnum__InstanceClassNameAssignment_4_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4439:1: ( ( rule__EEnum__InstanceClassNameAssignment_4_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4440:1: ( rule__EEnum__InstanceClassNameAssignment_4_1 )
            {
             before(grammarAccess.getEEnumAccess().getInstanceClassNameAssignment_4_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4441:1: ( rule__EEnum__InstanceClassNameAssignment_4_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4441:2: rule__EEnum__InstanceClassNameAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__InstanceClassNameAssignment_4_1_in_rule__EEnum__Group_4__1__Impl8737);
            rule__EEnum__InstanceClassNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEEnumAccess().getInstanceClassNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_4__1__Impl"


    // $ANTLR start "rule__EEnum__Group_5__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4455:1: rule__EEnum__Group_5__0 : rule__EEnum__Group_5__0__Impl rule__EEnum__Group_5__1 ;
    public final void rule__EEnum__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4459:1: ( rule__EEnum__Group_5__0__Impl rule__EEnum__Group_5__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4460:2: rule__EEnum__Group_5__0__Impl rule__EEnum__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_5__0__Impl_in_rule__EEnum__Group_5__08771);
            rule__EEnum__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_5__1_in_rule__EEnum__Group_5__08774);
            rule__EEnum__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_5__0"


    // $ANTLR start "rule__EEnum__Group_5__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4467:1: rule__EEnum__Group_5__0__Impl : ( 'instanceTypeName' ) ;
    public final void rule__EEnum__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4471:1: ( ( 'instanceTypeName' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4472:1: ( 'instanceTypeName' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4472:1: ( 'instanceTypeName' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4473:1: 'instanceTypeName'
            {
             before(grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__EEnum__Group_5__0__Impl8802); 
             after(grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_5__0__Impl"


    // $ANTLR start "rule__EEnum__Group_5__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4486:1: rule__EEnum__Group_5__1 : rule__EEnum__Group_5__1__Impl ;
    public final void rule__EEnum__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4490:1: ( rule__EEnum__Group_5__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4491:2: rule__EEnum__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_5__1__Impl_in_rule__EEnum__Group_5__18833);
            rule__EEnum__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_5__1"


    // $ANTLR start "rule__EEnum__Group_5__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4497:1: rule__EEnum__Group_5__1__Impl : ( ( rule__EEnum__InstanceTypeNameAssignment_5_1 ) ) ;
    public final void rule__EEnum__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4501:1: ( ( ( rule__EEnum__InstanceTypeNameAssignment_5_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4502:1: ( ( rule__EEnum__InstanceTypeNameAssignment_5_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4502:1: ( ( rule__EEnum__InstanceTypeNameAssignment_5_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4503:1: ( rule__EEnum__InstanceTypeNameAssignment_5_1 )
            {
             before(grammarAccess.getEEnumAccess().getInstanceTypeNameAssignment_5_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4504:1: ( rule__EEnum__InstanceTypeNameAssignment_5_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4504:2: rule__EEnum__InstanceTypeNameAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__InstanceTypeNameAssignment_5_1_in_rule__EEnum__Group_5__1__Impl8860);
            rule__EEnum__InstanceTypeNameAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEEnumAccess().getInstanceTypeNameAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_5__1__Impl"


    // $ANTLR start "rule__EEnum__Group_6__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4518:1: rule__EEnum__Group_6__0 : rule__EEnum__Group_6__0__Impl rule__EEnum__Group_6__1 ;
    public final void rule__EEnum__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4522:1: ( rule__EEnum__Group_6__0__Impl rule__EEnum__Group_6__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4523:2: rule__EEnum__Group_6__0__Impl rule__EEnum__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_6__0__Impl_in_rule__EEnum__Group_6__08894);
            rule__EEnum__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_6__1_in_rule__EEnum__Group_6__08897);
            rule__EEnum__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_6__0"


    // $ANTLR start "rule__EEnum__Group_6__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4530:1: rule__EEnum__Group_6__0__Impl : ( 'serializable' ) ;
    public final void rule__EEnum__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4534:1: ( ( 'serializable' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4535:1: ( 'serializable' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4535:1: ( 'serializable' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4536:1: 'serializable'
            {
             before(grammarAccess.getEEnumAccess().getSerializableKeyword_6_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__EEnum__Group_6__0__Impl8925); 
             after(grammarAccess.getEEnumAccess().getSerializableKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_6__0__Impl"


    // $ANTLR start "rule__EEnum__Group_6__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4549:1: rule__EEnum__Group_6__1 : rule__EEnum__Group_6__1__Impl ;
    public final void rule__EEnum__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4553:1: ( rule__EEnum__Group_6__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4554:2: rule__EEnum__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_6__1__Impl_in_rule__EEnum__Group_6__18956);
            rule__EEnum__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_6__1"


    // $ANTLR start "rule__EEnum__Group_6__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4560:1: rule__EEnum__Group_6__1__Impl : ( ( rule__EEnum__SerializableAssignment_6_1 ) ) ;
    public final void rule__EEnum__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4564:1: ( ( ( rule__EEnum__SerializableAssignment_6_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4565:1: ( ( rule__EEnum__SerializableAssignment_6_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4565:1: ( ( rule__EEnum__SerializableAssignment_6_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4566:1: ( rule__EEnum__SerializableAssignment_6_1 )
            {
             before(grammarAccess.getEEnumAccess().getSerializableAssignment_6_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4567:1: ( rule__EEnum__SerializableAssignment_6_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4567:2: rule__EEnum__SerializableAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__SerializableAssignment_6_1_in_rule__EEnum__Group_6__1__Impl8983);
            rule__EEnum__SerializableAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEEnumAccess().getSerializableAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_6__1__Impl"


    // $ANTLR start "rule__EEnum__Group_7__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4581:1: rule__EEnum__Group_7__0 : rule__EEnum__Group_7__0__Impl rule__EEnum__Group_7__1 ;
    public final void rule__EEnum__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4585:1: ( rule__EEnum__Group_7__0__Impl rule__EEnum__Group_7__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4586:2: rule__EEnum__Group_7__0__Impl rule__EEnum__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_7__0__Impl_in_rule__EEnum__Group_7__09017);
            rule__EEnum__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_7__1_in_rule__EEnum__Group_7__09020);
            rule__EEnum__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_7__0"


    // $ANTLR start "rule__EEnum__Group_7__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4593:1: rule__EEnum__Group_7__0__Impl : ( 'eLiterals' ) ;
    public final void rule__EEnum__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4597:1: ( ( 'eLiterals' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4598:1: ( 'eLiterals' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4598:1: ( 'eLiterals' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4599:1: 'eLiterals'
            {
             before(grammarAccess.getEEnumAccess().getELiteralsKeyword_7_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__EEnum__Group_7__0__Impl9048); 
             after(grammarAccess.getEEnumAccess().getELiteralsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_7__0__Impl"


    // $ANTLR start "rule__EEnum__Group_7__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4612:1: rule__EEnum__Group_7__1 : rule__EEnum__Group_7__1__Impl rule__EEnum__Group_7__2 ;
    public final void rule__EEnum__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4616:1: ( rule__EEnum__Group_7__1__Impl rule__EEnum__Group_7__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4617:2: rule__EEnum__Group_7__1__Impl rule__EEnum__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_7__1__Impl_in_rule__EEnum__Group_7__19079);
            rule__EEnum__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_7__2_in_rule__EEnum__Group_7__19082);
            rule__EEnum__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_7__1"


    // $ANTLR start "rule__EEnum__Group_7__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4624:1: rule__EEnum__Group_7__1__Impl : ( '{' ) ;
    public final void rule__EEnum__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4628:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4629:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4629:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4630:1: '{'
            {
             before(grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__EEnum__Group_7__1__Impl9110); 
             after(grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_7__1__Impl"


    // $ANTLR start "rule__EEnum__Group_7__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4643:1: rule__EEnum__Group_7__2 : rule__EEnum__Group_7__2__Impl rule__EEnum__Group_7__3 ;
    public final void rule__EEnum__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4647:1: ( rule__EEnum__Group_7__2__Impl rule__EEnum__Group_7__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4648:2: rule__EEnum__Group_7__2__Impl rule__EEnum__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_7__2__Impl_in_rule__EEnum__Group_7__29141);
            rule__EEnum__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_7__3_in_rule__EEnum__Group_7__29144);
            rule__EEnum__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_7__2"


    // $ANTLR start "rule__EEnum__Group_7__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4655:1: rule__EEnum__Group_7__2__Impl : ( ( rule__EEnum__ELiteralsAssignment_7_2 ) ) ;
    public final void rule__EEnum__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4659:1: ( ( ( rule__EEnum__ELiteralsAssignment_7_2 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4660:1: ( ( rule__EEnum__ELiteralsAssignment_7_2 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4660:1: ( ( rule__EEnum__ELiteralsAssignment_7_2 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4661:1: ( rule__EEnum__ELiteralsAssignment_7_2 )
            {
             before(grammarAccess.getEEnumAccess().getELiteralsAssignment_7_2()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4662:1: ( rule__EEnum__ELiteralsAssignment_7_2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4662:2: rule__EEnum__ELiteralsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__ELiteralsAssignment_7_2_in_rule__EEnum__Group_7__2__Impl9171);
            rule__EEnum__ELiteralsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getEEnumAccess().getELiteralsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_7__2__Impl"


    // $ANTLR start "rule__EEnum__Group_7__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4672:1: rule__EEnum__Group_7__3 : rule__EEnum__Group_7__3__Impl rule__EEnum__Group_7__4 ;
    public final void rule__EEnum__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4676:1: ( rule__EEnum__Group_7__3__Impl rule__EEnum__Group_7__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4677:2: rule__EEnum__Group_7__3__Impl rule__EEnum__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_7__3__Impl_in_rule__EEnum__Group_7__39201);
            rule__EEnum__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_7__4_in_rule__EEnum__Group_7__39204);
            rule__EEnum__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_7__3"


    // $ANTLR start "rule__EEnum__Group_7__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4684:1: rule__EEnum__Group_7__3__Impl : ( ( rule__EEnum__Group_7_3__0 )* ) ;
    public final void rule__EEnum__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4688:1: ( ( ( rule__EEnum__Group_7_3__0 )* ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4689:1: ( ( rule__EEnum__Group_7_3__0 )* )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4689:1: ( ( rule__EEnum__Group_7_3__0 )* )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4690:1: ( rule__EEnum__Group_7_3__0 )*
            {
             before(grammarAccess.getEEnumAccess().getGroup_7_3()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4691:1: ( rule__EEnum__Group_7_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4691:2: rule__EEnum__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_7_3__0_in_rule__EEnum__Group_7__3__Impl9231);
            	    rule__EEnum__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getEEnumAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_7__3__Impl"


    // $ANTLR start "rule__EEnum__Group_7__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4701:1: rule__EEnum__Group_7__4 : rule__EEnum__Group_7__4__Impl ;
    public final void rule__EEnum__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4705:1: ( rule__EEnum__Group_7__4__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4706:2: rule__EEnum__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_7__4__Impl_in_rule__EEnum__Group_7__49262);
            rule__EEnum__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_7__4"


    // $ANTLR start "rule__EEnum__Group_7__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4712:1: rule__EEnum__Group_7__4__Impl : ( '}' ) ;
    public final void rule__EEnum__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4716:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4717:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4717:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4718:1: '}'
            {
             before(grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__EEnum__Group_7__4__Impl9290); 
             after(grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_7__4__Impl"


    // $ANTLR start "rule__EEnum__Group_7_3__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4741:1: rule__EEnum__Group_7_3__0 : rule__EEnum__Group_7_3__0__Impl rule__EEnum__Group_7_3__1 ;
    public final void rule__EEnum__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4745:1: ( rule__EEnum__Group_7_3__0__Impl rule__EEnum__Group_7_3__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4746:2: rule__EEnum__Group_7_3__0__Impl rule__EEnum__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_7_3__0__Impl_in_rule__EEnum__Group_7_3__09331);
            rule__EEnum__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_7_3__1_in_rule__EEnum__Group_7_3__09334);
            rule__EEnum__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_7_3__0"


    // $ANTLR start "rule__EEnum__Group_7_3__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4753:1: rule__EEnum__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__EEnum__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4757:1: ( ( ',' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4758:1: ( ',' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4758:1: ( ',' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4759:1: ','
            {
             before(grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__EEnum__Group_7_3__0__Impl9362); 
             after(grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_7_3__0__Impl"


    // $ANTLR start "rule__EEnum__Group_7_3__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4772:1: rule__EEnum__Group_7_3__1 : rule__EEnum__Group_7_3__1__Impl ;
    public final void rule__EEnum__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4776:1: ( rule__EEnum__Group_7_3__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4777:2: rule__EEnum__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__Group_7_3__1__Impl_in_rule__EEnum__Group_7_3__19393);
            rule__EEnum__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_7_3__1"


    // $ANTLR start "rule__EEnum__Group_7_3__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4783:1: rule__EEnum__Group_7_3__1__Impl : ( ( rule__EEnum__ELiteralsAssignment_7_3_1 ) ) ;
    public final void rule__EEnum__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4787:1: ( ( ( rule__EEnum__ELiteralsAssignment_7_3_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4788:1: ( ( rule__EEnum__ELiteralsAssignment_7_3_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4788:1: ( ( rule__EEnum__ELiteralsAssignment_7_3_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4789:1: ( rule__EEnum__ELiteralsAssignment_7_3_1 )
            {
             before(grammarAccess.getEEnumAccess().getELiteralsAssignment_7_3_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4790:1: ( rule__EEnum__ELiteralsAssignment_7_3_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4790:2: rule__EEnum__ELiteralsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnum__ELiteralsAssignment_7_3_1_in_rule__EEnum__Group_7_3__1__Impl9420);
            rule__EEnum__ELiteralsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEEnumAccess().getELiteralsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__Group_7_3__1__Impl"


    // $ANTLR start "rule__EEnumLiteral__Group__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4804:1: rule__EEnumLiteral__Group__0 : rule__EEnumLiteral__Group__0__Impl rule__EEnumLiteral__Group__1 ;
    public final void rule__EEnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4808:1: ( rule__EEnumLiteral__Group__0__Impl rule__EEnumLiteral__Group__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4809:2: rule__EEnumLiteral__Group__0__Impl rule__EEnumLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group__0__Impl_in_rule__EEnumLiteral__Group__09454);
            rule__EEnumLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group__1_in_rule__EEnumLiteral__Group__09457);
            rule__EEnumLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group__0"


    // $ANTLR start "rule__EEnumLiteral__Group__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4816:1: rule__EEnumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EEnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4820:1: ( ( () ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4821:1: ( () )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4821:1: ( () )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4822:1: ()
            {
             before(grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4823:1: ()
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4825:1: 
            {
            }

             after(grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group__0__Impl"


    // $ANTLR start "rule__EEnumLiteral__Group__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4835:1: rule__EEnumLiteral__Group__1 : rule__EEnumLiteral__Group__1__Impl rule__EEnumLiteral__Group__2 ;
    public final void rule__EEnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4839:1: ( rule__EEnumLiteral__Group__1__Impl rule__EEnumLiteral__Group__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4840:2: rule__EEnumLiteral__Group__1__Impl rule__EEnumLiteral__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group__1__Impl_in_rule__EEnumLiteral__Group__19515);
            rule__EEnumLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group__2_in_rule__EEnumLiteral__Group__19518);
            rule__EEnumLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group__1"


    // $ANTLR start "rule__EEnumLiteral__Group__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4847:1: rule__EEnumLiteral__Group__1__Impl : ( 'EEnumLiteral' ) ;
    public final void rule__EEnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4851:1: ( ( 'EEnumLiteral' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4852:1: ( 'EEnumLiteral' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4852:1: ( 'EEnumLiteral' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4853:1: 'EEnumLiteral'
            {
             before(grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__EEnumLiteral__Group__1__Impl9546); 
             after(grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group__1__Impl"


    // $ANTLR start "rule__EEnumLiteral__Group__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4866:1: rule__EEnumLiteral__Group__2 : rule__EEnumLiteral__Group__2__Impl rule__EEnumLiteral__Group__3 ;
    public final void rule__EEnumLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4870:1: ( rule__EEnumLiteral__Group__2__Impl rule__EEnumLiteral__Group__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4871:2: rule__EEnumLiteral__Group__2__Impl rule__EEnumLiteral__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group__2__Impl_in_rule__EEnumLiteral__Group__29577);
            rule__EEnumLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group__3_in_rule__EEnumLiteral__Group__29580);
            rule__EEnumLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group__2"


    // $ANTLR start "rule__EEnumLiteral__Group__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4878:1: rule__EEnumLiteral__Group__2__Impl : ( ( rule__EEnumLiteral__NameAssignment_2 ) ) ;
    public final void rule__EEnumLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4882:1: ( ( ( rule__EEnumLiteral__NameAssignment_2 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4883:1: ( ( rule__EEnumLiteral__NameAssignment_2 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4883:1: ( ( rule__EEnumLiteral__NameAssignment_2 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4884:1: ( rule__EEnumLiteral__NameAssignment_2 )
            {
             before(grammarAccess.getEEnumLiteralAccess().getNameAssignment_2()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4885:1: ( rule__EEnumLiteral__NameAssignment_2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4885:2: rule__EEnumLiteral__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__NameAssignment_2_in_rule__EEnumLiteral__Group__2__Impl9607);
            rule__EEnumLiteral__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEEnumLiteralAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group__2__Impl"


    // $ANTLR start "rule__EEnumLiteral__Group__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4895:1: rule__EEnumLiteral__Group__3 : rule__EEnumLiteral__Group__3__Impl rule__EEnumLiteral__Group__4 ;
    public final void rule__EEnumLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4899:1: ( rule__EEnumLiteral__Group__3__Impl rule__EEnumLiteral__Group__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4900:2: rule__EEnumLiteral__Group__3__Impl rule__EEnumLiteral__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group__3__Impl_in_rule__EEnumLiteral__Group__39637);
            rule__EEnumLiteral__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group__4_in_rule__EEnumLiteral__Group__39640);
            rule__EEnumLiteral__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group__3"


    // $ANTLR start "rule__EEnumLiteral__Group__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4907:1: rule__EEnumLiteral__Group__3__Impl : ( '{' ) ;
    public final void rule__EEnumLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4911:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4912:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4912:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4913:1: '{'
            {
             before(grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__EEnumLiteral__Group__3__Impl9668); 
             after(grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group__3__Impl"


    // $ANTLR start "rule__EEnumLiteral__Group__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4926:1: rule__EEnumLiteral__Group__4 : rule__EEnumLiteral__Group__4__Impl rule__EEnumLiteral__Group__5 ;
    public final void rule__EEnumLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4930:1: ( rule__EEnumLiteral__Group__4__Impl rule__EEnumLiteral__Group__5 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4931:2: rule__EEnumLiteral__Group__4__Impl rule__EEnumLiteral__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group__4__Impl_in_rule__EEnumLiteral__Group__49699);
            rule__EEnumLiteral__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group__5_in_rule__EEnumLiteral__Group__49702);
            rule__EEnumLiteral__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group__4"


    // $ANTLR start "rule__EEnumLiteral__Group__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4938:1: rule__EEnumLiteral__Group__4__Impl : ( ( rule__EEnumLiteral__Group_4__0 )? ) ;
    public final void rule__EEnumLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4942:1: ( ( ( rule__EEnumLiteral__Group_4__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4943:1: ( ( rule__EEnumLiteral__Group_4__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4943:1: ( ( rule__EEnumLiteral__Group_4__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4944:1: ( rule__EEnumLiteral__Group_4__0 )?
            {
             before(grammarAccess.getEEnumLiteralAccess().getGroup_4()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4945:1: ( rule__EEnumLiteral__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4945:2: rule__EEnumLiteral__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group_4__0_in_rule__EEnumLiteral__Group__4__Impl9729);
                    rule__EEnumLiteral__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEEnumLiteralAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group__4__Impl"


    // $ANTLR start "rule__EEnumLiteral__Group__5"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4955:1: rule__EEnumLiteral__Group__5 : rule__EEnumLiteral__Group__5__Impl rule__EEnumLiteral__Group__6 ;
    public final void rule__EEnumLiteral__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4959:1: ( rule__EEnumLiteral__Group__5__Impl rule__EEnumLiteral__Group__6 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4960:2: rule__EEnumLiteral__Group__5__Impl rule__EEnumLiteral__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group__5__Impl_in_rule__EEnumLiteral__Group__59760);
            rule__EEnumLiteral__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group__6_in_rule__EEnumLiteral__Group__59763);
            rule__EEnumLiteral__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group__5"


    // $ANTLR start "rule__EEnumLiteral__Group__5__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4967:1: rule__EEnumLiteral__Group__5__Impl : ( ( rule__EEnumLiteral__Group_5__0 )? ) ;
    public final void rule__EEnumLiteral__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4971:1: ( ( ( rule__EEnumLiteral__Group_5__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4972:1: ( ( rule__EEnumLiteral__Group_5__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4972:1: ( ( rule__EEnumLiteral__Group_5__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4973:1: ( rule__EEnumLiteral__Group_5__0 )?
            {
             before(grammarAccess.getEEnumLiteralAccess().getGroup_5()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4974:1: ( rule__EEnumLiteral__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4974:2: rule__EEnumLiteral__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group_5__0_in_rule__EEnumLiteral__Group__5__Impl9790);
                    rule__EEnumLiteral__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEEnumLiteralAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group__5__Impl"


    // $ANTLR start "rule__EEnumLiteral__Group__6"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4984:1: rule__EEnumLiteral__Group__6 : rule__EEnumLiteral__Group__6__Impl ;
    public final void rule__EEnumLiteral__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4988:1: ( rule__EEnumLiteral__Group__6__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4989:2: rule__EEnumLiteral__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group__6__Impl_in_rule__EEnumLiteral__Group__69821);
            rule__EEnumLiteral__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group__6"


    // $ANTLR start "rule__EEnumLiteral__Group__6__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4995:1: rule__EEnumLiteral__Group__6__Impl : ( '}' ) ;
    public final void rule__EEnumLiteral__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:4999:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5000:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5000:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5001:1: '}'
            {
             before(grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__EEnumLiteral__Group__6__Impl9849); 
             after(grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group__6__Impl"


    // $ANTLR start "rule__EEnumLiteral__Group_4__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5028:1: rule__EEnumLiteral__Group_4__0 : rule__EEnumLiteral__Group_4__0__Impl rule__EEnumLiteral__Group_4__1 ;
    public final void rule__EEnumLiteral__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5032:1: ( rule__EEnumLiteral__Group_4__0__Impl rule__EEnumLiteral__Group_4__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5033:2: rule__EEnumLiteral__Group_4__0__Impl rule__EEnumLiteral__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group_4__0__Impl_in_rule__EEnumLiteral__Group_4__09894);
            rule__EEnumLiteral__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group_4__1_in_rule__EEnumLiteral__Group_4__09897);
            rule__EEnumLiteral__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group_4__0"


    // $ANTLR start "rule__EEnumLiteral__Group_4__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5040:1: rule__EEnumLiteral__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__EEnumLiteral__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5044:1: ( ( 'value' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5045:1: ( 'value' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5045:1: ( 'value' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5046:1: 'value'
            {
             before(grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__EEnumLiteral__Group_4__0__Impl9925); 
             after(grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group_4__0__Impl"


    // $ANTLR start "rule__EEnumLiteral__Group_4__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5059:1: rule__EEnumLiteral__Group_4__1 : rule__EEnumLiteral__Group_4__1__Impl ;
    public final void rule__EEnumLiteral__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5063:1: ( rule__EEnumLiteral__Group_4__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5064:2: rule__EEnumLiteral__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group_4__1__Impl_in_rule__EEnumLiteral__Group_4__19956);
            rule__EEnumLiteral__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group_4__1"


    // $ANTLR start "rule__EEnumLiteral__Group_4__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5070:1: rule__EEnumLiteral__Group_4__1__Impl : ( ( rule__EEnumLiteral__ValueAssignment_4_1 ) ) ;
    public final void rule__EEnumLiteral__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5074:1: ( ( ( rule__EEnumLiteral__ValueAssignment_4_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5075:1: ( ( rule__EEnumLiteral__ValueAssignment_4_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5075:1: ( ( rule__EEnumLiteral__ValueAssignment_4_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5076:1: ( rule__EEnumLiteral__ValueAssignment_4_1 )
            {
             before(grammarAccess.getEEnumLiteralAccess().getValueAssignment_4_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5077:1: ( rule__EEnumLiteral__ValueAssignment_4_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5077:2: rule__EEnumLiteral__ValueAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__ValueAssignment_4_1_in_rule__EEnumLiteral__Group_4__1__Impl9983);
            rule__EEnumLiteral__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEEnumLiteralAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group_4__1__Impl"


    // $ANTLR start "rule__EEnumLiteral__Group_5__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5091:1: rule__EEnumLiteral__Group_5__0 : rule__EEnumLiteral__Group_5__0__Impl rule__EEnumLiteral__Group_5__1 ;
    public final void rule__EEnumLiteral__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5095:1: ( rule__EEnumLiteral__Group_5__0__Impl rule__EEnumLiteral__Group_5__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5096:2: rule__EEnumLiteral__Group_5__0__Impl rule__EEnumLiteral__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group_5__0__Impl_in_rule__EEnumLiteral__Group_5__010017);
            rule__EEnumLiteral__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group_5__1_in_rule__EEnumLiteral__Group_5__010020);
            rule__EEnumLiteral__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group_5__0"


    // $ANTLR start "rule__EEnumLiteral__Group_5__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5103:1: rule__EEnumLiteral__Group_5__0__Impl : ( 'literal' ) ;
    public final void rule__EEnumLiteral__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5107:1: ( ( 'literal' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5108:1: ( 'literal' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5108:1: ( 'literal' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5109:1: 'literal'
            {
             before(grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__EEnumLiteral__Group_5__0__Impl10048); 
             after(grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group_5__0__Impl"


    // $ANTLR start "rule__EEnumLiteral__Group_5__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5122:1: rule__EEnumLiteral__Group_5__1 : rule__EEnumLiteral__Group_5__1__Impl ;
    public final void rule__EEnumLiteral__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5126:1: ( rule__EEnumLiteral__Group_5__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5127:2: rule__EEnumLiteral__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__Group_5__1__Impl_in_rule__EEnumLiteral__Group_5__110079);
            rule__EEnumLiteral__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group_5__1"


    // $ANTLR start "rule__EEnumLiteral__Group_5__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5133:1: rule__EEnumLiteral__Group_5__1__Impl : ( ( rule__EEnumLiteral__LiteralAssignment_5_1 ) ) ;
    public final void rule__EEnumLiteral__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5137:1: ( ( ( rule__EEnumLiteral__LiteralAssignment_5_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5138:1: ( ( rule__EEnumLiteral__LiteralAssignment_5_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5138:1: ( ( rule__EEnumLiteral__LiteralAssignment_5_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5139:1: ( rule__EEnumLiteral__LiteralAssignment_5_1 )
            {
             before(grammarAccess.getEEnumLiteralAccess().getLiteralAssignment_5_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5140:1: ( rule__EEnumLiteral__LiteralAssignment_5_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5140:2: rule__EEnumLiteral__LiteralAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EEnumLiteral__LiteralAssignment_5_1_in_rule__EEnumLiteral__Group_5__1__Impl10106);
            rule__EEnumLiteral__LiteralAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEEnumLiteralAccess().getLiteralAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__Group_5__1__Impl"


    // $ANTLR start "rule__EDataType_Impl__Group__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5154:1: rule__EDataType_Impl__Group__0 : rule__EDataType_Impl__Group__0__Impl rule__EDataType_Impl__Group__1 ;
    public final void rule__EDataType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5158:1: ( rule__EDataType_Impl__Group__0__Impl rule__EDataType_Impl__Group__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5159:2: rule__EDataType_Impl__Group__0__Impl rule__EDataType_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__0__Impl_in_rule__EDataType_Impl__Group__010140);
            rule__EDataType_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__1_in_rule__EDataType_Impl__Group__010143);
            rule__EDataType_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__0"


    // $ANTLR start "rule__EDataType_Impl__Group__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5166:1: rule__EDataType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__EDataType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5170:1: ( ( () ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5171:1: ( () )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5171:1: ( () )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5172:1: ()
            {
             before(grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5173:1: ()
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5175:1: 
            {
            }

             after(grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__0__Impl"


    // $ANTLR start "rule__EDataType_Impl__Group__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5185:1: rule__EDataType_Impl__Group__1 : rule__EDataType_Impl__Group__1__Impl rule__EDataType_Impl__Group__2 ;
    public final void rule__EDataType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5189:1: ( rule__EDataType_Impl__Group__1__Impl rule__EDataType_Impl__Group__2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5190:2: rule__EDataType_Impl__Group__1__Impl rule__EDataType_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__1__Impl_in_rule__EDataType_Impl__Group__110201);
            rule__EDataType_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__2_in_rule__EDataType_Impl__Group__110204);
            rule__EDataType_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__1"


    // $ANTLR start "rule__EDataType_Impl__Group__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5197:1: rule__EDataType_Impl__Group__1__Impl : ( 'EDataType' ) ;
    public final void rule__EDataType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5201:1: ( ( 'EDataType' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5202:1: ( 'EDataType' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5202:1: ( 'EDataType' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5203:1: 'EDataType'
            {
             before(grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__EDataType_Impl__Group__1__Impl10232); 
             after(grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__1__Impl"


    // $ANTLR start "rule__EDataType_Impl__Group__2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5216:1: rule__EDataType_Impl__Group__2 : rule__EDataType_Impl__Group__2__Impl rule__EDataType_Impl__Group__3 ;
    public final void rule__EDataType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5220:1: ( rule__EDataType_Impl__Group__2__Impl rule__EDataType_Impl__Group__3 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5221:2: rule__EDataType_Impl__Group__2__Impl rule__EDataType_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__2__Impl_in_rule__EDataType_Impl__Group__210263);
            rule__EDataType_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__3_in_rule__EDataType_Impl__Group__210266);
            rule__EDataType_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__2"


    // $ANTLR start "rule__EDataType_Impl__Group__2__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5228:1: rule__EDataType_Impl__Group__2__Impl : ( ( rule__EDataType_Impl__NameAssignment_2 ) ) ;
    public final void rule__EDataType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5232:1: ( ( ( rule__EDataType_Impl__NameAssignment_2 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5233:1: ( ( rule__EDataType_Impl__NameAssignment_2 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5233:1: ( ( rule__EDataType_Impl__NameAssignment_2 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5234:1: ( rule__EDataType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getEDataType_ImplAccess().getNameAssignment_2()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5235:1: ( rule__EDataType_Impl__NameAssignment_2 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5235:2: rule__EDataType_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__NameAssignment_2_in_rule__EDataType_Impl__Group__2__Impl10293);
            rule__EDataType_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEDataType_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__2__Impl"


    // $ANTLR start "rule__EDataType_Impl__Group__3"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5245:1: rule__EDataType_Impl__Group__3 : rule__EDataType_Impl__Group__3__Impl rule__EDataType_Impl__Group__4 ;
    public final void rule__EDataType_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5249:1: ( rule__EDataType_Impl__Group__3__Impl rule__EDataType_Impl__Group__4 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5250:2: rule__EDataType_Impl__Group__3__Impl rule__EDataType_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__3__Impl_in_rule__EDataType_Impl__Group__310323);
            rule__EDataType_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__4_in_rule__EDataType_Impl__Group__310326);
            rule__EDataType_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__3"


    // $ANTLR start "rule__EDataType_Impl__Group__3__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5257:1: rule__EDataType_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__EDataType_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5261:1: ( ( '{' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5262:1: ( '{' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5262:1: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5263:1: '{'
            {
             before(grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__EDataType_Impl__Group__3__Impl10354); 
             after(grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__3__Impl"


    // $ANTLR start "rule__EDataType_Impl__Group__4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5276:1: rule__EDataType_Impl__Group__4 : rule__EDataType_Impl__Group__4__Impl rule__EDataType_Impl__Group__5 ;
    public final void rule__EDataType_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5280:1: ( rule__EDataType_Impl__Group__4__Impl rule__EDataType_Impl__Group__5 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5281:2: rule__EDataType_Impl__Group__4__Impl rule__EDataType_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__4__Impl_in_rule__EDataType_Impl__Group__410385);
            rule__EDataType_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__5_in_rule__EDataType_Impl__Group__410388);
            rule__EDataType_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__4"


    // $ANTLR start "rule__EDataType_Impl__Group__4__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5288:1: rule__EDataType_Impl__Group__4__Impl : ( ( rule__EDataType_Impl__Group_4__0 )? ) ;
    public final void rule__EDataType_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5292:1: ( ( ( rule__EDataType_Impl__Group_4__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5293:1: ( ( rule__EDataType_Impl__Group_4__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5293:1: ( ( rule__EDataType_Impl__Group_4__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5294:1: ( rule__EDataType_Impl__Group_4__0 )?
            {
             before(grammarAccess.getEDataType_ImplAccess().getGroup_4()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5295:1: ( rule__EDataType_Impl__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5295:2: rule__EDataType_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group_4__0_in_rule__EDataType_Impl__Group__4__Impl10415);
                    rule__EDataType_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDataType_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__4__Impl"


    // $ANTLR start "rule__EDataType_Impl__Group__5"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5305:1: rule__EDataType_Impl__Group__5 : rule__EDataType_Impl__Group__5__Impl rule__EDataType_Impl__Group__6 ;
    public final void rule__EDataType_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5309:1: ( rule__EDataType_Impl__Group__5__Impl rule__EDataType_Impl__Group__6 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5310:2: rule__EDataType_Impl__Group__5__Impl rule__EDataType_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__5__Impl_in_rule__EDataType_Impl__Group__510446);
            rule__EDataType_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__6_in_rule__EDataType_Impl__Group__510449);
            rule__EDataType_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__5"


    // $ANTLR start "rule__EDataType_Impl__Group__5__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5317:1: rule__EDataType_Impl__Group__5__Impl : ( ( rule__EDataType_Impl__Group_5__0 )? ) ;
    public final void rule__EDataType_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5321:1: ( ( ( rule__EDataType_Impl__Group_5__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5322:1: ( ( rule__EDataType_Impl__Group_5__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5322:1: ( ( rule__EDataType_Impl__Group_5__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5323:1: ( rule__EDataType_Impl__Group_5__0 )?
            {
             before(grammarAccess.getEDataType_ImplAccess().getGroup_5()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5324:1: ( rule__EDataType_Impl__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5324:2: rule__EDataType_Impl__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group_5__0_in_rule__EDataType_Impl__Group__5__Impl10476);
                    rule__EDataType_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDataType_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__5__Impl"


    // $ANTLR start "rule__EDataType_Impl__Group__6"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5334:1: rule__EDataType_Impl__Group__6 : rule__EDataType_Impl__Group__6__Impl rule__EDataType_Impl__Group__7 ;
    public final void rule__EDataType_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5338:1: ( rule__EDataType_Impl__Group__6__Impl rule__EDataType_Impl__Group__7 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5339:2: rule__EDataType_Impl__Group__6__Impl rule__EDataType_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__6__Impl_in_rule__EDataType_Impl__Group__610507);
            rule__EDataType_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__7_in_rule__EDataType_Impl__Group__610510);
            rule__EDataType_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__6"


    // $ANTLR start "rule__EDataType_Impl__Group__6__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5346:1: rule__EDataType_Impl__Group__6__Impl : ( ( rule__EDataType_Impl__Group_6__0 )? ) ;
    public final void rule__EDataType_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5350:1: ( ( ( rule__EDataType_Impl__Group_6__0 )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5351:1: ( ( rule__EDataType_Impl__Group_6__0 )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5351:1: ( ( rule__EDataType_Impl__Group_6__0 )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5352:1: ( rule__EDataType_Impl__Group_6__0 )?
            {
             before(grammarAccess.getEDataType_ImplAccess().getGroup_6()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5353:1: ( rule__EDataType_Impl__Group_6__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5353:2: rule__EDataType_Impl__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group_6__0_in_rule__EDataType_Impl__Group__6__Impl10537);
                    rule__EDataType_Impl__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDataType_ImplAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__6__Impl"


    // $ANTLR start "rule__EDataType_Impl__Group__7"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5363:1: rule__EDataType_Impl__Group__7 : rule__EDataType_Impl__Group__7__Impl ;
    public final void rule__EDataType_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5367:1: ( rule__EDataType_Impl__Group__7__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5368:2: rule__EDataType_Impl__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group__7__Impl_in_rule__EDataType_Impl__Group__710568);
            rule__EDataType_Impl__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__7"


    // $ANTLR start "rule__EDataType_Impl__Group__7__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5374:1: rule__EDataType_Impl__Group__7__Impl : ( '}' ) ;
    public final void rule__EDataType_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5378:1: ( ( '}' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5379:1: ( '}' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5379:1: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5380:1: '}'
            {
             before(grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__EDataType_Impl__Group__7__Impl10596); 
             after(grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group__7__Impl"


    // $ANTLR start "rule__EDataType_Impl__Group_4__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5409:1: rule__EDataType_Impl__Group_4__0 : rule__EDataType_Impl__Group_4__0__Impl rule__EDataType_Impl__Group_4__1 ;
    public final void rule__EDataType_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5413:1: ( rule__EDataType_Impl__Group_4__0__Impl rule__EDataType_Impl__Group_4__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5414:2: rule__EDataType_Impl__Group_4__0__Impl rule__EDataType_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group_4__0__Impl_in_rule__EDataType_Impl__Group_4__010643);
            rule__EDataType_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group_4__1_in_rule__EDataType_Impl__Group_4__010646);
            rule__EDataType_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group_4__0"


    // $ANTLR start "rule__EDataType_Impl__Group_4__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5421:1: rule__EDataType_Impl__Group_4__0__Impl : ( 'instanceClassName' ) ;
    public final void rule__EDataType_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5425:1: ( ( 'instanceClassName' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5426:1: ( 'instanceClassName' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5426:1: ( 'instanceClassName' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5427:1: 'instanceClassName'
            {
             before(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__EDataType_Impl__Group_4__0__Impl10674); 
             after(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__EDataType_Impl__Group_4__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5440:1: rule__EDataType_Impl__Group_4__1 : rule__EDataType_Impl__Group_4__1__Impl ;
    public final void rule__EDataType_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5444:1: ( rule__EDataType_Impl__Group_4__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5445:2: rule__EDataType_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group_4__1__Impl_in_rule__EDataType_Impl__Group_4__110705);
            rule__EDataType_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group_4__1"


    // $ANTLR start "rule__EDataType_Impl__Group_4__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5451:1: rule__EDataType_Impl__Group_4__1__Impl : ( ( rule__EDataType_Impl__InstanceClassNameAssignment_4_1 ) ) ;
    public final void rule__EDataType_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5455:1: ( ( ( rule__EDataType_Impl__InstanceClassNameAssignment_4_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5456:1: ( ( rule__EDataType_Impl__InstanceClassNameAssignment_4_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5456:1: ( ( rule__EDataType_Impl__InstanceClassNameAssignment_4_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5457:1: ( rule__EDataType_Impl__InstanceClassNameAssignment_4_1 )
            {
             before(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameAssignment_4_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5458:1: ( rule__EDataType_Impl__InstanceClassNameAssignment_4_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5458:2: rule__EDataType_Impl__InstanceClassNameAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__InstanceClassNameAssignment_4_1_in_rule__EDataType_Impl__Group_4__1__Impl10732);
            rule__EDataType_Impl__InstanceClassNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__EDataType_Impl__Group_5__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5472:1: rule__EDataType_Impl__Group_5__0 : rule__EDataType_Impl__Group_5__0__Impl rule__EDataType_Impl__Group_5__1 ;
    public final void rule__EDataType_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5476:1: ( rule__EDataType_Impl__Group_5__0__Impl rule__EDataType_Impl__Group_5__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5477:2: rule__EDataType_Impl__Group_5__0__Impl rule__EDataType_Impl__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group_5__0__Impl_in_rule__EDataType_Impl__Group_5__010766);
            rule__EDataType_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group_5__1_in_rule__EDataType_Impl__Group_5__010769);
            rule__EDataType_Impl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group_5__0"


    // $ANTLR start "rule__EDataType_Impl__Group_5__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5484:1: rule__EDataType_Impl__Group_5__0__Impl : ( 'instanceTypeName' ) ;
    public final void rule__EDataType_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5488:1: ( ( 'instanceTypeName' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5489:1: ( 'instanceTypeName' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5489:1: ( 'instanceTypeName' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5490:1: 'instanceTypeName'
            {
             before(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__EDataType_Impl__Group_5__0__Impl10797); 
             after(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__EDataType_Impl__Group_5__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5503:1: rule__EDataType_Impl__Group_5__1 : rule__EDataType_Impl__Group_5__1__Impl ;
    public final void rule__EDataType_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5507:1: ( rule__EDataType_Impl__Group_5__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5508:2: rule__EDataType_Impl__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group_5__1__Impl_in_rule__EDataType_Impl__Group_5__110828);
            rule__EDataType_Impl__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group_5__1"


    // $ANTLR start "rule__EDataType_Impl__Group_5__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5514:1: rule__EDataType_Impl__Group_5__1__Impl : ( ( rule__EDataType_Impl__InstanceTypeNameAssignment_5_1 ) ) ;
    public final void rule__EDataType_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5518:1: ( ( ( rule__EDataType_Impl__InstanceTypeNameAssignment_5_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5519:1: ( ( rule__EDataType_Impl__InstanceTypeNameAssignment_5_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5519:1: ( ( rule__EDataType_Impl__InstanceTypeNameAssignment_5_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5520:1: ( rule__EDataType_Impl__InstanceTypeNameAssignment_5_1 )
            {
             before(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameAssignment_5_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5521:1: ( rule__EDataType_Impl__InstanceTypeNameAssignment_5_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5521:2: rule__EDataType_Impl__InstanceTypeNameAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__InstanceTypeNameAssignment_5_1_in_rule__EDataType_Impl__Group_5__1__Impl10855);
            rule__EDataType_Impl__InstanceTypeNameAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__EDataType_Impl__Group_6__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5535:1: rule__EDataType_Impl__Group_6__0 : rule__EDataType_Impl__Group_6__0__Impl rule__EDataType_Impl__Group_6__1 ;
    public final void rule__EDataType_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5539:1: ( rule__EDataType_Impl__Group_6__0__Impl rule__EDataType_Impl__Group_6__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5540:2: rule__EDataType_Impl__Group_6__0__Impl rule__EDataType_Impl__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group_6__0__Impl_in_rule__EDataType_Impl__Group_6__010889);
            rule__EDataType_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group_6__1_in_rule__EDataType_Impl__Group_6__010892);
            rule__EDataType_Impl__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group_6__0"


    // $ANTLR start "rule__EDataType_Impl__Group_6__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5547:1: rule__EDataType_Impl__Group_6__0__Impl : ( 'serializable' ) ;
    public final void rule__EDataType_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5551:1: ( ( 'serializable' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5552:1: ( 'serializable' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5552:1: ( 'serializable' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5553:1: 'serializable'
            {
             before(grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__EDataType_Impl__Group_6__0__Impl10920); 
             after(grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__EDataType_Impl__Group_6__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5566:1: rule__EDataType_Impl__Group_6__1 : rule__EDataType_Impl__Group_6__1__Impl ;
    public final void rule__EDataType_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5570:1: ( rule__EDataType_Impl__Group_6__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5571:2: rule__EDataType_Impl__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__Group_6__1__Impl_in_rule__EDataType_Impl__Group_6__110951);
            rule__EDataType_Impl__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group_6__1"


    // $ANTLR start "rule__EDataType_Impl__Group_6__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5577:1: rule__EDataType_Impl__Group_6__1__Impl : ( ( rule__EDataType_Impl__SerializableAssignment_6_1 ) ) ;
    public final void rule__EDataType_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5581:1: ( ( ( rule__EDataType_Impl__SerializableAssignment_6_1 ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5582:1: ( ( rule__EDataType_Impl__SerializableAssignment_6_1 ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5582:1: ( ( rule__EDataType_Impl__SerializableAssignment_6_1 ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5583:1: ( rule__EDataType_Impl__SerializableAssignment_6_1 )
            {
             before(grammarAccess.getEDataType_ImplAccess().getSerializableAssignment_6_1()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5584:1: ( rule__EDataType_Impl__SerializableAssignment_6_1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5584:2: rule__EDataType_Impl__SerializableAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDataType_Impl__SerializableAssignment_6_1_in_rule__EDataType_Impl__Group_6__1__Impl10978);
            rule__EDataType_Impl__SerializableAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEDataType_ImplAccess().getSerializableAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5598:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5602:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5603:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__011012);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__011015);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5610:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5614:1: ( ( ( '-' )? ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5615:1: ( ( '-' )? )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5615:1: ( ( '-' )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5616:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5617:1: ( '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5618:2: '-'
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_rule__EInt__Group__0__Impl11044); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5629:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5633:1: ( rule__EInt__Group__1__Impl )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5634:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__111077);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5640:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5644:1: ( ( RULE_INT ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5645:1: ( RULE_INT )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5645:1: ( RULE_INT )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5646:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl11104); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Extension__NameAssignment_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5662:1: rule__Extension__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Extension__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5666:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5667:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5667:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5668:1: ruleEString
            {
             before(grammarAccess.getExtensionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extension__NameAssignment_111142);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__NameAssignment_1"


    // $ANTLR start "rule__Extension__SchemeAssignment_4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5677:1: rule__Extension__SchemeAssignment_4 : ( ruleEString ) ;
    public final void rule__Extension__SchemeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5681:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5682:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5682:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5683:1: ruleEString
            {
             before(grammarAccess.getExtensionAccess().getSchemeEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extension__SchemeAssignment_411173);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getSchemeEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__SchemeAssignment_4"


    // $ANTLR start "rule__Extension__ImportAssignment_5_2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5692:1: rule__Extension__ImportAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Extension__ImportAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5696:1: ( ( ( ruleEString ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5697:1: ( ( ruleEString ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5697:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5698:1: ( ruleEString )
            {
             before(grammarAccess.getExtensionAccess().getImportExtensionCrossReference_5_2_0()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5699:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5700:1: ruleEString
            {
             before(grammarAccess.getExtensionAccess().getImportExtensionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extension__ImportAssignment_5_211208);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getImportExtensionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getExtensionAccess().getImportExtensionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__ImportAssignment_5_2"


    // $ANTLR start "rule__Extension__ImportAssignment_5_3_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5711:1: rule__Extension__ImportAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Extension__ImportAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5715:1: ( ( ( ruleEString ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5716:1: ( ( ruleEString ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5716:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5717:1: ( ruleEString )
            {
             before(grammarAccess.getExtensionAccess().getImportExtensionCrossReference_5_3_1_0()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5718:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5719:1: ruleEString
            {
             before(grammarAccess.getExtensionAccess().getImportExtensionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extension__ImportAssignment_5_3_111247);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getImportExtensionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getExtensionAccess().getImportExtensionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__ImportAssignment_5_3_1"


    // $ANTLR start "rule__Extension__KindsAssignment_6_2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5730:1: rule__Extension__KindsAssignment_6_2 : ( ruleKind ) ;
    public final void rule__Extension__KindsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5734:1: ( ( ruleKind ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5735:1: ( ruleKind )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5735:1: ( ruleKind )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5736:1: ruleKind
            {
             before(grammarAccess.getExtensionAccess().getKindsKindParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKind_in_rule__Extension__KindsAssignment_6_211282);
            ruleKind();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getKindsKindParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__KindsAssignment_6_2"


    // $ANTLR start "rule__Extension__KindsAssignment_6_3_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5745:1: rule__Extension__KindsAssignment_6_3_1 : ( ruleKind ) ;
    public final void rule__Extension__KindsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5749:1: ( ( ruleKind ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5750:1: ( ruleKind )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5750:1: ( ruleKind )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5751:1: ruleKind
            {
             before(grammarAccess.getExtensionAccess().getKindsKindParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKind_in_rule__Extension__KindsAssignment_6_3_111313);
            ruleKind();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getKindsKindParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__KindsAssignment_6_3_1"


    // $ANTLR start "rule__Extension__MixinsAssignment_7_2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5760:1: rule__Extension__MixinsAssignment_7_2 : ( ruleMixin ) ;
    public final void rule__Extension__MixinsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5764:1: ( ( ruleMixin ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5765:1: ( ruleMixin )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5765:1: ( ruleMixin )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5766:1: ruleMixin
            {
             before(grammarAccess.getExtensionAccess().getMixinsMixinParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMixin_in_rule__Extension__MixinsAssignment_7_211344);
            ruleMixin();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getMixinsMixinParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__MixinsAssignment_7_2"


    // $ANTLR start "rule__Extension__MixinsAssignment_7_3_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5775:1: rule__Extension__MixinsAssignment_7_3_1 : ( ruleMixin ) ;
    public final void rule__Extension__MixinsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5779:1: ( ( ruleMixin ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5780:1: ( ruleMixin )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5780:1: ( ruleMixin )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5781:1: ruleMixin
            {
             before(grammarAccess.getExtensionAccess().getMixinsMixinParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMixin_in_rule__Extension__MixinsAssignment_7_3_111375);
            ruleMixin();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getMixinsMixinParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__MixinsAssignment_7_3_1"


    // $ANTLR start "rule__Kind__TermAssignment_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5790:1: rule__Kind__TermAssignment_1 : ( ruleEString ) ;
    public final void rule__Kind__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5794:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5795:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5795:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5796:1: ruleEString
            {
             before(grammarAccess.getKindAccess().getTermEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Kind__TermAssignment_111406);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKindAccess().getTermEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__TermAssignment_1"


    // $ANTLR start "rule__Kind__SchemeAssignment_4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5805:1: rule__Kind__SchemeAssignment_4 : ( ruleEString ) ;
    public final void rule__Kind__SchemeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5809:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5810:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5810:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5811:1: ruleEString
            {
             before(grammarAccess.getKindAccess().getSchemeEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Kind__SchemeAssignment_411437);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKindAccess().getSchemeEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__SchemeAssignment_4"


    // $ANTLR start "rule__Kind__TitleAssignment_5_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5820:1: rule__Kind__TitleAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Kind__TitleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5824:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5825:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5825:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5826:1: ruleEString
            {
             before(grammarAccess.getKindAccess().getTitleEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Kind__TitleAssignment_5_111468);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKindAccess().getTitleEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__TitleAssignment_5_1"


    // $ANTLR start "rule__Kind__ParentAssignment_6_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5835:1: rule__Kind__ParentAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Kind__ParentAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5839:1: ( ( ( ruleEString ) ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5840:1: ( ( ruleEString ) )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5840:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5841:1: ( ruleEString )
            {
             before(grammarAccess.getKindAccess().getParentKindCrossReference_6_1_0()); 
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5842:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5843:1: ruleEString
            {
             before(grammarAccess.getKindAccess().getParentKindEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Kind__ParentAssignment_6_111503);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKindAccess().getParentKindEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getKindAccess().getParentKindCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__ParentAssignment_6_1"


    // $ANTLR start "rule__Kind__AttributesAssignment_7_2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5854:1: rule__Kind__AttributesAssignment_7_2 : ( ruleAttribute ) ;
    public final void rule__Kind__AttributesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5858:1: ( ( ruleAttribute ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5859:1: ( ruleAttribute )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5859:1: ( ruleAttribute )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5860:1: ruleAttribute
            {
             before(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Kind__AttributesAssignment_7_211538);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__AttributesAssignment_7_2"


    // $ANTLR start "rule__Kind__AttributesAssignment_7_3_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5869:1: rule__Kind__AttributesAssignment_7_3_1 : ( ruleAttribute ) ;
    public final void rule__Kind__AttributesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5873:1: ( ( ruleAttribute ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5874:1: ( ruleAttribute )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5874:1: ( ruleAttribute )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5875:1: ruleAttribute
            {
             before(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Kind__AttributesAssignment_7_3_111569);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__AttributesAssignment_7_3_1"


    // $ANTLR start "rule__Kind__ActionsAssignment_8_2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5884:1: rule__Kind__ActionsAssignment_8_2 : ( ruleAction ) ;
    public final void rule__Kind__ActionsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5888:1: ( ( ruleAction ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5889:1: ( ruleAction )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5889:1: ( ruleAction )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5890:1: ruleAction
            {
             before(grammarAccess.getKindAccess().getActionsActionParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__Kind__ActionsAssignment_8_211600);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getKindAccess().getActionsActionParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__ActionsAssignment_8_2"


    // $ANTLR start "rule__Kind__ActionsAssignment_8_3_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5899:1: rule__Kind__ActionsAssignment_8_3_1 : ( ruleAction ) ;
    public final void rule__Kind__ActionsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5903:1: ( ( ruleAction ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5904:1: ( ruleAction )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5904:1: ( ruleAction )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5905:1: ruleAction
            {
             before(grammarAccess.getKindAccess().getActionsActionParserRuleCall_8_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__Kind__ActionsAssignment_8_3_111631);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getKindAccess().getActionsActionParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__ActionsAssignment_8_3_1"


    // $ANTLR start "rule__Mixin__TermAssignment_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5914:1: rule__Mixin__TermAssignment_1 : ( ruleEString ) ;
    public final void rule__Mixin__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5918:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5919:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5919:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5920:1: ruleEString
            {
             before(grammarAccess.getMixinAccess().getTermEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Mixin__TermAssignment_111662);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getTermEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__TermAssignment_1"


    // $ANTLR start "rule__Mixin__SchemeAssignment_4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5929:1: rule__Mixin__SchemeAssignment_4 : ( ruleEString ) ;
    public final void rule__Mixin__SchemeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5933:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5934:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5934:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5935:1: ruleEString
            {
             before(grammarAccess.getMixinAccess().getSchemeEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Mixin__SchemeAssignment_411693);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getSchemeEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__SchemeAssignment_4"


    // $ANTLR start "rule__Mixin__TitleAssignment_5_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5944:1: rule__Mixin__TitleAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Mixin__TitleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5948:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5949:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5949:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5950:1: ruleEString
            {
             before(grammarAccess.getMixinAccess().getTitleEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Mixin__TitleAssignment_5_111724);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getTitleEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__TitleAssignment_5_1"


    // $ANTLR start "rule__Mixin__AttributesAssignment_6_2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5959:1: rule__Mixin__AttributesAssignment_6_2 : ( ruleAttribute ) ;
    public final void rule__Mixin__AttributesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5963:1: ( ( ruleAttribute ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5964:1: ( ruleAttribute )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5964:1: ( ruleAttribute )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5965:1: ruleAttribute
            {
             before(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Mixin__AttributesAssignment_6_211755);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__AttributesAssignment_6_2"


    // $ANTLR start "rule__Mixin__AttributesAssignment_6_3_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5974:1: rule__Mixin__AttributesAssignment_6_3_1 : ( ruleAttribute ) ;
    public final void rule__Mixin__AttributesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5978:1: ( ( ruleAttribute ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5979:1: ( ruleAttribute )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5979:1: ( ruleAttribute )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5980:1: ruleAttribute
            {
             before(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Mixin__AttributesAssignment_6_3_111786);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__AttributesAssignment_6_3_1"


    // $ANTLR start "rule__Mixin__ActionsAssignment_7_2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5989:1: rule__Mixin__ActionsAssignment_7_2 : ( ruleAction ) ;
    public final void rule__Mixin__ActionsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5993:1: ( ( ruleAction ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5994:1: ( ruleAction )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5994:1: ( ruleAction )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:5995:1: ruleAction
            {
             before(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__Mixin__ActionsAssignment_7_211817);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__ActionsAssignment_7_2"


    // $ANTLR start "rule__Mixin__ActionsAssignment_7_3_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6004:1: rule__Mixin__ActionsAssignment_7_3_1 : ( ruleAction ) ;
    public final void rule__Mixin__ActionsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6008:1: ( ( ruleAction ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6009:1: ( ruleAction )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6009:1: ( ruleAction )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6010:1: ruleAction
            {
             before(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__Mixin__ActionsAssignment_7_3_111848);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__ActionsAssignment_7_3_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6019:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6023:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6024:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6024:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6025:1: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Attribute__NameAssignment_111879);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__MutableAssignment_3_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6034:1: rule__Attribute__MutableAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__Attribute__MutableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6038:1: ( ( ruleEBoolean ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6039:1: ( ruleEBoolean )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6039:1: ( ruleEBoolean )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6040:1: ruleEBoolean
            {
             before(grammarAccess.getAttributeAccess().getMutableEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__Attribute__MutableAssignment_3_111910);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getMutableEBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__MutableAssignment_3_1"


    // $ANTLR start "rule__Attribute__RequiredAssignment_4_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6049:1: rule__Attribute__RequiredAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__Attribute__RequiredAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6053:1: ( ( ruleEBoolean ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6054:1: ( ruleEBoolean )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6054:1: ( ruleEBoolean )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6055:1: ruleEBoolean
            {
             before(grammarAccess.getAttributeAccess().getRequiredEBooleanParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__Attribute__RequiredAssignment_4_111941);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getRequiredEBooleanParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__RequiredAssignment_4_1"


    // $ANTLR start "rule__Attribute__DefaultAssignment_5_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6064:1: rule__Attribute__DefaultAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Attribute__DefaultAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6068:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6069:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6069:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6070:1: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getDefaultEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Attribute__DefaultAssignment_5_111972);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDefaultEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DefaultAssignment_5_1"


    // $ANTLR start "rule__Attribute__DescriptionAssignment_6_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6079:1: rule__Attribute__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Attribute__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6083:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6084:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6084:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6085:1: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Attribute__DescriptionAssignment_6_112003);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DescriptionAssignment_6_1"


    // $ANTLR start "rule__Action__TermAssignment_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6094:1: rule__Action__TermAssignment_1 : ( ruleEString ) ;
    public final void rule__Action__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6098:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6099:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6099:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6100:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getTermEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__TermAssignment_112034);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getTermEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__TermAssignment_1"


    // $ANTLR start "rule__Action__SchemeAssignment_4"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6109:1: rule__Action__SchemeAssignment_4 : ( ruleEString ) ;
    public final void rule__Action__SchemeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6113:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6114:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6114:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6115:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getSchemeEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__SchemeAssignment_412065);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getSchemeEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__SchemeAssignment_4"


    // $ANTLR start "rule__Action__TitleAssignment_5_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6124:1: rule__Action__TitleAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Action__TitleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6128:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6129:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6129:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6130:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getTitleEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__TitleAssignment_5_112096);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getTitleEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__TitleAssignment_5_1"


    // $ANTLR start "rule__Action__AttributesAssignment_6_2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6139:1: rule__Action__AttributesAssignment_6_2 : ( ruleAttribute ) ;
    public final void rule__Action__AttributesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6143:1: ( ( ruleAttribute ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6144:1: ( ruleAttribute )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6144:1: ( ruleAttribute )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6145:1: ruleAttribute
            {
             before(grammarAccess.getActionAccess().getAttributesAttributeParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Action__AttributesAssignment_6_212127);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getActionAccess().getAttributesAttributeParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__AttributesAssignment_6_2"


    // $ANTLR start "rule__Action__AttributesAssignment_6_3_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6154:1: rule__Action__AttributesAssignment_6_3_1 : ( ruleAttribute ) ;
    public final void rule__Action__AttributesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6158:1: ( ( ruleAttribute ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6159:1: ( ruleAttribute )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6159:1: ( ruleAttribute )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6160:1: ruleAttribute
            {
             before(grammarAccess.getActionAccess().getAttributesAttributeParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Action__AttributesAssignment_6_3_112158);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getActionAccess().getAttributesAttributeParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__AttributesAssignment_6_3_1"


    // $ANTLR start "rule__EEnum__NameAssignment_2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6169:1: rule__EEnum__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EEnum__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6173:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6174:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6174:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6175:1: ruleEString
            {
             before(grammarAccess.getEEnumAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__EEnum__NameAssignment_212189);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEEnumAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__NameAssignment_2"


    // $ANTLR start "rule__EEnum__InstanceClassNameAssignment_4_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6184:1: rule__EEnum__InstanceClassNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__EEnum__InstanceClassNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6188:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6189:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6189:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6190:1: ruleEString
            {
             before(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__EEnum__InstanceClassNameAssignment_4_112220);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__InstanceClassNameAssignment_4_1"


    // $ANTLR start "rule__EEnum__InstanceTypeNameAssignment_5_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6199:1: rule__EEnum__InstanceTypeNameAssignment_5_1 : ( ruleEString ) ;
    public final void rule__EEnum__InstanceTypeNameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6203:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6204:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6204:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6205:1: ruleEString
            {
             before(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__EEnum__InstanceTypeNameAssignment_5_112251);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__InstanceTypeNameAssignment_5_1"


    // $ANTLR start "rule__EEnum__SerializableAssignment_6_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6214:1: rule__EEnum__SerializableAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__EEnum__SerializableAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6218:1: ( ( ruleEBoolean ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6219:1: ( ruleEBoolean )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6219:1: ( ruleEBoolean )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6220:1: ruleEBoolean
            {
             before(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__EEnum__SerializableAssignment_6_112282);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__SerializableAssignment_6_1"


    // $ANTLR start "rule__EEnum__ELiteralsAssignment_7_2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6229:1: rule__EEnum__ELiteralsAssignment_7_2 : ( ruleEEnumLiteral ) ;
    public final void rule__EEnum__ELiteralsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6233:1: ( ( ruleEEnumLiteral ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6234:1: ( ruleEEnumLiteral )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6234:1: ( ruleEEnumLiteral )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6235:1: ruleEEnumLiteral
            {
             before(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_rule__EEnum__ELiteralsAssignment_7_212313);
            ruleEEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__ELiteralsAssignment_7_2"


    // $ANTLR start "rule__EEnum__ELiteralsAssignment_7_3_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6244:1: rule__EEnum__ELiteralsAssignment_7_3_1 : ( ruleEEnumLiteral ) ;
    public final void rule__EEnum__ELiteralsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6248:1: ( ( ruleEEnumLiteral ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6249:1: ( ruleEEnumLiteral )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6249:1: ( ruleEEnumLiteral )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6250:1: ruleEEnumLiteral
            {
             before(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_rule__EEnum__ELiteralsAssignment_7_3_112344);
            ruleEEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnum__ELiteralsAssignment_7_3_1"


    // $ANTLR start "rule__EEnumLiteral__NameAssignment_2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6259:1: rule__EEnumLiteral__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EEnumLiteral__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6263:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6264:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6264:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6265:1: ruleEString
            {
             before(grammarAccess.getEEnumLiteralAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__EEnumLiteral__NameAssignment_212375);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEEnumLiteralAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__NameAssignment_2"


    // $ANTLR start "rule__EEnumLiteral__ValueAssignment_4_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6274:1: rule__EEnumLiteral__ValueAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__EEnumLiteral__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6278:1: ( ( ruleEInt ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6279:1: ( ruleEInt )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6279:1: ( ruleEInt )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6280:1: ruleEInt
            {
             before(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__EEnumLiteral__ValueAssignment_4_112406);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__ValueAssignment_4_1"


    // $ANTLR start "rule__EEnumLiteral__LiteralAssignment_5_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6289:1: rule__EEnumLiteral__LiteralAssignment_5_1 : ( ruleEString ) ;
    public final void rule__EEnumLiteral__LiteralAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6293:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6294:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6294:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6295:1: ruleEString
            {
             before(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__EEnumLiteral__LiteralAssignment_5_112437);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEnumLiteral__LiteralAssignment_5_1"


    // $ANTLR start "rule__EDataType_Impl__NameAssignment_2"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6304:1: rule__EDataType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EDataType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6308:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6309:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6309:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6310:1: ruleEString
            {
             before(grammarAccess.getEDataType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__EDataType_Impl__NameAssignment_212468);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEDataType_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__NameAssignment_2"


    // $ANTLR start "rule__EDataType_Impl__InstanceClassNameAssignment_4_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6319:1: rule__EDataType_Impl__InstanceClassNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__EDataType_Impl__InstanceClassNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6323:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6324:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6324:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6325:1: ruleEString
            {
             before(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__EDataType_Impl__InstanceClassNameAssignment_4_112499);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__InstanceClassNameAssignment_4_1"


    // $ANTLR start "rule__EDataType_Impl__InstanceTypeNameAssignment_5_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6334:1: rule__EDataType_Impl__InstanceTypeNameAssignment_5_1 : ( ruleEString ) ;
    public final void rule__EDataType_Impl__InstanceTypeNameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6338:1: ( ( ruleEString ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6339:1: ( ruleEString )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6339:1: ( ruleEString )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6340:1: ruleEString
            {
             before(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__EDataType_Impl__InstanceTypeNameAssignment_5_112530);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__InstanceTypeNameAssignment_5_1"


    // $ANTLR start "rule__EDataType_Impl__SerializableAssignment_6_1"
    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6349:1: rule__EDataType_Impl__SerializableAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__EDataType_Impl__SerializableAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6353:1: ( ( ruleEBoolean ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6354:1: ( ruleEBoolean )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6354:1: ( ruleEBoolean )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:6355:1: ruleEBoolean
            {
             before(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__EDataType_Impl__SerializableAssignment_6_112561);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDataType_Impl__SerializableAssignment_6_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtension68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group__0_in_ruleExtension94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKind_in_entryRuleKind121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKind128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group__0_in_ruleKind154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMixin188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group__0_in_ruleMixin214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnum_in_entryRuleEEnum361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEEnum368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group__0_in_ruleEEnum394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_entryRuleEEnumLiteral421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEEnumLiteral428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group__0_in_ruleEEnumLiteral454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDataType_Impl_in_entryRuleEDataType_Impl481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDataType_Impl488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__0_in_ruleEDataType_Impl514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group__0__Impl_in_rule__Extension__Group__0835 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extension__Group__1_in_rule__Extension__Group__0838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Extension__Group__0__Impl866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group__1__Impl_in_rule__Extension__Group__1897 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Extension__Group__2_in_rule__Extension__Group__1900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__NameAssignment_1_in_rule__Extension__Group__1__Impl927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group__2__Impl_in_rule__Extension__Group__2957 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Extension__Group__3_in_rule__Extension__Group__2960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Extension__Group__2__Impl988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group__3__Impl_in_rule__Extension__Group__31019 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extension__Group__4_in_rule__Extension__Group__31022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Extension__Group__3__Impl1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group__4__Impl_in_rule__Extension__Group__41081 = new BitSet(new long[]{0x0000000000630000L});
        public static final BitSet FOLLOW_rule__Extension__Group__5_in_rule__Extension__Group__41084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__SchemeAssignment_4_in_rule__Extension__Group__4__Impl1111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group__5__Impl_in_rule__Extension__Group__51141 = new BitSet(new long[]{0x0000000000630000L});
        public static final BitSet FOLLOW_rule__Extension__Group__6_in_rule__Extension__Group__51144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_5__0_in_rule__Extension__Group__5__Impl1171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group__6__Impl_in_rule__Extension__Group__61202 = new BitSet(new long[]{0x0000000000630000L});
        public static final BitSet FOLLOW_rule__Extension__Group__7_in_rule__Extension__Group__61205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_6__0_in_rule__Extension__Group__6__Impl1232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group__7__Impl_in_rule__Extension__Group__71263 = new BitSet(new long[]{0x0000000000630000L});
        public static final BitSet FOLLOW_rule__Extension__Group__8_in_rule__Extension__Group__71266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_7__0_in_rule__Extension__Group__7__Impl1293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group__8__Impl_in_rule__Extension__Group__81324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Extension__Group__8__Impl1352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_5__0__Impl_in_rule__Extension__Group_5__01401 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Extension__Group_5__1_in_rule__Extension__Group_5__01404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Extension__Group_5__0__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_5__1__Impl_in_rule__Extension__Group_5__11463 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extension__Group_5__2_in_rule__Extension__Group_5__11466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Extension__Group_5__1__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_5__2__Impl_in_rule__Extension__Group_5__21525 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_rule__Extension__Group_5__3_in_rule__Extension__Group_5__21528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__ImportAssignment_5_2_in_rule__Extension__Group_5__2__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_5__3__Impl_in_rule__Extension__Group_5__31585 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_rule__Extension__Group_5__4_in_rule__Extension__Group_5__31588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_5_3__0_in_rule__Extension__Group_5__3__Impl1615 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Extension__Group_5__4__Impl_in_rule__Extension__Group_5__41646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Extension__Group_5__4__Impl1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_5_3__0__Impl_in_rule__Extension__Group_5_3__01715 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extension__Group_5_3__1_in_rule__Extension__Group_5_3__01718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Extension__Group_5_3__0__Impl1746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_5_3__1__Impl_in_rule__Extension__Group_5_3__11777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__ImportAssignment_5_3_1_in_rule__Extension__Group_5_3__1__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_6__0__Impl_in_rule__Extension__Group_6__01838 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Extension__Group_6__1_in_rule__Extension__Group_6__01841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Extension__Group_6__0__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_6__1__Impl_in_rule__Extension__Group_6__11900 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Extension__Group_6__2_in_rule__Extension__Group_6__11903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Extension__Group_6__1__Impl1931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_6__2__Impl_in_rule__Extension__Group_6__21962 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Extension__Group_6__3_in_rule__Extension__Group_6__21965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__KindsAssignment_6_2_in_rule__Extension__Group_6__2__Impl1992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_6__3__Impl_in_rule__Extension__Group_6__32022 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Extension__Group_6__4_in_rule__Extension__Group_6__32025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_6_3__0_in_rule__Extension__Group_6__3__Impl2052 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Extension__Group_6__4__Impl_in_rule__Extension__Group_6__42083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Extension__Group_6__4__Impl2111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_6_3__0__Impl_in_rule__Extension__Group_6_3__02152 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Extension__Group_6_3__1_in_rule__Extension__Group_6_3__02155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Extension__Group_6_3__0__Impl2183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_6_3__1__Impl_in_rule__Extension__Group_6_3__12214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__KindsAssignment_6_3_1_in_rule__Extension__Group_6_3__1__Impl2241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_7__0__Impl_in_rule__Extension__Group_7__02275 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Extension__Group_7__1_in_rule__Extension__Group_7__02278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Extension__Group_7__0__Impl2306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_7__1__Impl_in_rule__Extension__Group_7__12337 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Extension__Group_7__2_in_rule__Extension__Group_7__12340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Extension__Group_7__1__Impl2368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_7__2__Impl_in_rule__Extension__Group_7__22399 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Extension__Group_7__3_in_rule__Extension__Group_7__22402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__MixinsAssignment_7_2_in_rule__Extension__Group_7__2__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_7__3__Impl_in_rule__Extension__Group_7__32459 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Extension__Group_7__4_in_rule__Extension__Group_7__32462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_7_3__0_in_rule__Extension__Group_7__3__Impl2489 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Extension__Group_7__4__Impl_in_rule__Extension__Group_7__42520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Extension__Group_7__4__Impl2548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_7_3__0__Impl_in_rule__Extension__Group_7_3__02589 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Extension__Group_7_3__1_in_rule__Extension__Group_7_3__02592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Extension__Group_7_3__0__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__Group_7_3__1__Impl_in_rule__Extension__Group_7_3__12651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extension__MixinsAssignment_7_3_1_in_rule__Extension__Group_7_3__1__Impl2678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group__0__Impl_in_rule__Kind__Group__02712 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Kind__Group__1_in_rule__Kind__Group__02715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Kind__Group__0__Impl2743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group__1__Impl_in_rule__Kind__Group__12774 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Kind__Group__2_in_rule__Kind__Group__12777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__TermAssignment_1_in_rule__Kind__Group__1__Impl2804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group__2__Impl_in_rule__Kind__Group__22834 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Kind__Group__3_in_rule__Kind__Group__22837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Kind__Group__2__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group__3__Impl_in_rule__Kind__Group__32896 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Kind__Group__4_in_rule__Kind__Group__32899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Kind__Group__3__Impl2927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group__4__Impl_in_rule__Kind__Group__42958 = new BitSet(new long[]{0x000000000F010000L});
        public static final BitSet FOLLOW_rule__Kind__Group__5_in_rule__Kind__Group__42961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__SchemeAssignment_4_in_rule__Kind__Group__4__Impl2988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group__5__Impl_in_rule__Kind__Group__53018 = new BitSet(new long[]{0x000000000F010000L});
        public static final BitSet FOLLOW_rule__Kind__Group__6_in_rule__Kind__Group__53021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_5__0_in_rule__Kind__Group__5__Impl3048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group__6__Impl_in_rule__Kind__Group__63079 = new BitSet(new long[]{0x000000000F010000L});
        public static final BitSet FOLLOW_rule__Kind__Group__7_in_rule__Kind__Group__63082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_6__0_in_rule__Kind__Group__6__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group__7__Impl_in_rule__Kind__Group__73140 = new BitSet(new long[]{0x000000000F010000L});
        public static final BitSet FOLLOW_rule__Kind__Group__8_in_rule__Kind__Group__73143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_7__0_in_rule__Kind__Group__7__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group__8__Impl_in_rule__Kind__Group__83201 = new BitSet(new long[]{0x000000000F010000L});
        public static final BitSet FOLLOW_rule__Kind__Group__9_in_rule__Kind__Group__83204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_8__0_in_rule__Kind__Group__8__Impl3231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group__9__Impl_in_rule__Kind__Group__93262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Kind__Group__9__Impl3290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_5__0__Impl_in_rule__Kind__Group_5__03341 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Kind__Group_5__1_in_rule__Kind__Group_5__03344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Kind__Group_5__0__Impl3372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_5__1__Impl_in_rule__Kind__Group_5__13403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__TitleAssignment_5_1_in_rule__Kind__Group_5__1__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_6__0__Impl_in_rule__Kind__Group_6__03464 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Kind__Group_6__1_in_rule__Kind__Group_6__03467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Kind__Group_6__0__Impl3495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_6__1__Impl_in_rule__Kind__Group_6__13526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__ParentAssignment_6_1_in_rule__Kind__Group_6__1__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_7__0__Impl_in_rule__Kind__Group_7__03587 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Kind__Group_7__1_in_rule__Kind__Group_7__03590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Kind__Group_7__0__Impl3618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_7__1__Impl_in_rule__Kind__Group_7__13649 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Kind__Group_7__2_in_rule__Kind__Group_7__13652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Kind__Group_7__1__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_7__2__Impl_in_rule__Kind__Group_7__23711 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Kind__Group_7__3_in_rule__Kind__Group_7__23714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__AttributesAssignment_7_2_in_rule__Kind__Group_7__2__Impl3741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_7__3__Impl_in_rule__Kind__Group_7__33771 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Kind__Group_7__4_in_rule__Kind__Group_7__33774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_7_3__0_in_rule__Kind__Group_7__3__Impl3801 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Kind__Group_7__4__Impl_in_rule__Kind__Group_7__43832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Kind__Group_7__4__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_7_3__0__Impl_in_rule__Kind__Group_7_3__03901 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Kind__Group_7_3__1_in_rule__Kind__Group_7_3__03904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Kind__Group_7_3__0__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_7_3__1__Impl_in_rule__Kind__Group_7_3__13963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__AttributesAssignment_7_3_1_in_rule__Kind__Group_7_3__1__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_8__0__Impl_in_rule__Kind__Group_8__04024 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Kind__Group_8__1_in_rule__Kind__Group_8__04027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Kind__Group_8__0__Impl4055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_8__1__Impl_in_rule__Kind__Group_8__14086 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Kind__Group_8__2_in_rule__Kind__Group_8__14089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Kind__Group_8__1__Impl4117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_8__2__Impl_in_rule__Kind__Group_8__24148 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Kind__Group_8__3_in_rule__Kind__Group_8__24151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__ActionsAssignment_8_2_in_rule__Kind__Group_8__2__Impl4178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_8__3__Impl_in_rule__Kind__Group_8__34208 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Kind__Group_8__4_in_rule__Kind__Group_8__34211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_8_3__0_in_rule__Kind__Group_8__3__Impl4238 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Kind__Group_8__4__Impl_in_rule__Kind__Group_8__44269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Kind__Group_8__4__Impl4297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_8_3__0__Impl_in_rule__Kind__Group_8_3__04338 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Kind__Group_8_3__1_in_rule__Kind__Group_8_3__04341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Kind__Group_8_3__0__Impl4369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__Group_8_3__1__Impl_in_rule__Kind__Group_8_3__14400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Kind__ActionsAssignment_8_3_1_in_rule__Kind__Group_8_3__1__Impl4427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group__0__Impl_in_rule__Mixin__Group__04461 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Mixin__Group__1_in_rule__Mixin__Group__04464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Mixin__Group__0__Impl4492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group__1__Impl_in_rule__Mixin__Group__14523 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Mixin__Group__2_in_rule__Mixin__Group__14526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__TermAssignment_1_in_rule__Mixin__Group__1__Impl4553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group__2__Impl_in_rule__Mixin__Group__24583 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Mixin__Group__3_in_rule__Mixin__Group__24586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Mixin__Group__2__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group__3__Impl_in_rule__Mixin__Group__34645 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Mixin__Group__4_in_rule__Mixin__Group__34648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Mixin__Group__3__Impl4676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group__4__Impl_in_rule__Mixin__Group__44707 = new BitSet(new long[]{0x000000000D010000L});
        public static final BitSet FOLLOW_rule__Mixin__Group__5_in_rule__Mixin__Group__44710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__SchemeAssignment_4_in_rule__Mixin__Group__4__Impl4737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group__5__Impl_in_rule__Mixin__Group__54767 = new BitSet(new long[]{0x000000000D010000L});
        public static final BitSet FOLLOW_rule__Mixin__Group__6_in_rule__Mixin__Group__54770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_5__0_in_rule__Mixin__Group__5__Impl4797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group__6__Impl_in_rule__Mixin__Group__64828 = new BitSet(new long[]{0x000000000D010000L});
        public static final BitSet FOLLOW_rule__Mixin__Group__7_in_rule__Mixin__Group__64831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_6__0_in_rule__Mixin__Group__6__Impl4858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group__7__Impl_in_rule__Mixin__Group__74889 = new BitSet(new long[]{0x000000000D010000L});
        public static final BitSet FOLLOW_rule__Mixin__Group__8_in_rule__Mixin__Group__74892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_7__0_in_rule__Mixin__Group__7__Impl4919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group__8__Impl_in_rule__Mixin__Group__84950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Mixin__Group__8__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_5__0__Impl_in_rule__Mixin__Group_5__05027 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Mixin__Group_5__1_in_rule__Mixin__Group_5__05030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Mixin__Group_5__0__Impl5058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_5__1__Impl_in_rule__Mixin__Group_5__15089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__TitleAssignment_5_1_in_rule__Mixin__Group_5__1__Impl5116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_6__0__Impl_in_rule__Mixin__Group_6__05150 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Mixin__Group_6__1_in_rule__Mixin__Group_6__05153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Mixin__Group_6__0__Impl5181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_6__1__Impl_in_rule__Mixin__Group_6__15212 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Mixin__Group_6__2_in_rule__Mixin__Group_6__15215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Mixin__Group_6__1__Impl5243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_6__2__Impl_in_rule__Mixin__Group_6__25274 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Mixin__Group_6__3_in_rule__Mixin__Group_6__25277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__AttributesAssignment_6_2_in_rule__Mixin__Group_6__2__Impl5304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_6__3__Impl_in_rule__Mixin__Group_6__35334 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Mixin__Group_6__4_in_rule__Mixin__Group_6__35337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_6_3__0_in_rule__Mixin__Group_6__3__Impl5364 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_6__4__Impl_in_rule__Mixin__Group_6__45395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Mixin__Group_6__4__Impl5423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_6_3__0__Impl_in_rule__Mixin__Group_6_3__05464 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Mixin__Group_6_3__1_in_rule__Mixin__Group_6_3__05467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Mixin__Group_6_3__0__Impl5495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_6_3__1__Impl_in_rule__Mixin__Group_6_3__15526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__AttributesAssignment_6_3_1_in_rule__Mixin__Group_6_3__1__Impl5553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_7__0__Impl_in_rule__Mixin__Group_7__05587 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Mixin__Group_7__1_in_rule__Mixin__Group_7__05590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Mixin__Group_7__0__Impl5618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_7__1__Impl_in_rule__Mixin__Group_7__15649 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Mixin__Group_7__2_in_rule__Mixin__Group_7__15652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Mixin__Group_7__1__Impl5680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_7__2__Impl_in_rule__Mixin__Group_7__25711 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Mixin__Group_7__3_in_rule__Mixin__Group_7__25714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__ActionsAssignment_7_2_in_rule__Mixin__Group_7__2__Impl5741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_7__3__Impl_in_rule__Mixin__Group_7__35771 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Mixin__Group_7__4_in_rule__Mixin__Group_7__35774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_7_3__0_in_rule__Mixin__Group_7__3__Impl5801 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_7__4__Impl_in_rule__Mixin__Group_7__45832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Mixin__Group_7__4__Impl5860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_7_3__0__Impl_in_rule__Mixin__Group_7_3__05901 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Mixin__Group_7_3__1_in_rule__Mixin__Group_7_3__05904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Mixin__Group_7_3__0__Impl5932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__Group_7_3__1__Impl_in_rule__Mixin__Group_7_3__15963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mixin__ActionsAssignment_7_3_1_in_rule__Mixin__Group_7_3__1__Impl5990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__06024 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__06027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Attribute__Group__0__Impl6055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__16086 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__16089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl6116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__26146 = new BitSet(new long[]{0x00000003C0010000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__26149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Attribute__Group__2__Impl6177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__36208 = new BitSet(new long[]{0x00000003C0010000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__36211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_3__0_in_rule__Attribute__Group__3__Impl6238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__46269 = new BitSet(new long[]{0x00000003C0010000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__46272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl6299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__56330 = new BitSet(new long[]{0x00000003C0010000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__56333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl6360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__6__Impl_in_rule__Attribute__Group__66391 = new BitSet(new long[]{0x00000003C0010000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__7_in_rule__Attribute__Group__66394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_6__0_in_rule__Attribute__Group__6__Impl6421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__7__Impl_in_rule__Attribute__Group__76452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Attribute__Group__7__Impl6480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_3__0__Impl_in_rule__Attribute__Group_3__06527 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Attribute__Group_3__1_in_rule__Attribute__Group_3__06530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Attribute__Group_3__0__Impl6558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_3__1__Impl_in_rule__Attribute__Group_3__16589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__MutableAssignment_3_1_in_rule__Attribute__Group_3__1__Impl6616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__06650 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__06653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Attribute__Group_4__0__Impl6681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__16712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__RequiredAssignment_4_1_in_rule__Attribute__Group_4__1__Impl6739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__06773 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__06776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Attribute__Group_5__0__Impl6804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__16835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__DefaultAssignment_5_1_in_rule__Attribute__Group_5__1__Impl6862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_6__0__Impl_in_rule__Attribute__Group_6__06896 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Attribute__Group_6__1_in_rule__Attribute__Group_6__06899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Attribute__Group_6__0__Impl6927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_6__1__Impl_in_rule__Attribute__Group_6__16958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__DescriptionAssignment_6_1_in_rule__Attribute__Group_6__1__Impl6985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__07019 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__07022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Action__Group__0__Impl7050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__17081 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__17084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__TermAssignment_1_in_rule__Action__Group__1__Impl7111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__27141 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__27144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Action__Group__2__Impl7172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__37203 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__37206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Action__Group__3__Impl7234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__47265 = new BitSet(new long[]{0x0000000005010000L});
        public static final BitSet FOLLOW_rule__Action__Group__5_in_rule__Action__Group__47268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__SchemeAssignment_4_in_rule__Action__Group__4__Impl7295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__57325 = new BitSet(new long[]{0x0000000005010000L});
        public static final BitSet FOLLOW_rule__Action__Group__6_in_rule__Action__Group__57328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_5__0_in_rule__Action__Group__5__Impl7355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__6__Impl_in_rule__Action__Group__67386 = new BitSet(new long[]{0x0000000005010000L});
        public static final BitSet FOLLOW_rule__Action__Group__7_in_rule__Action__Group__67389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_6__0_in_rule__Action__Group__6__Impl7416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__7__Impl_in_rule__Action__Group__77447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Action__Group__7__Impl7475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_5__0__Impl_in_rule__Action__Group_5__07522 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group_5__1_in_rule__Action__Group_5__07525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Action__Group_5__0__Impl7553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_5__1__Impl_in_rule__Action__Group_5__17584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__TitleAssignment_5_1_in_rule__Action__Group_5__1__Impl7611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_6__0__Impl_in_rule__Action__Group_6__07645 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Action__Group_6__1_in_rule__Action__Group_6__07648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Action__Group_6__0__Impl7676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_6__1__Impl_in_rule__Action__Group_6__17707 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Action__Group_6__2_in_rule__Action__Group_6__17710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Action__Group_6__1__Impl7738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_6__2__Impl_in_rule__Action__Group_6__27769 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Action__Group_6__3_in_rule__Action__Group_6__27772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__AttributesAssignment_6_2_in_rule__Action__Group_6__2__Impl7799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_6__3__Impl_in_rule__Action__Group_6__37829 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Action__Group_6__4_in_rule__Action__Group_6__37832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_6_3__0_in_rule__Action__Group_6__3__Impl7859 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Action__Group_6__4__Impl_in_rule__Action__Group_6__47890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Action__Group_6__4__Impl7918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_6_3__0__Impl_in_rule__Action__Group_6_3__07959 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Action__Group_6_3__1_in_rule__Action__Group_6_3__07962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Action__Group_6_3__0__Impl7990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_6_3__1__Impl_in_rule__Action__Group_6_3__18021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__AttributesAssignment_6_3_1_in_rule__Action__Group_6_3__1__Impl8048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group__0__Impl_in_rule__EEnum__Group__08082 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__EEnum__Group__1_in_rule__EEnum__Group__08085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group__1__Impl_in_rule__EEnum__Group__18143 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__EEnum__Group__2_in_rule__EEnum__Group__18146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__EEnum__Group__1__Impl8174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group__2__Impl_in_rule__EEnum__Group__28205 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__EEnum__Group__3_in_rule__EEnum__Group__28208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__NameAssignment_2_in_rule__EEnum__Group__2__Impl8235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group__3__Impl_in_rule__EEnum__Group__38265 = new BitSet(new long[]{0x000000F000010000L});
        public static final BitSet FOLLOW_rule__EEnum__Group__4_in_rule__EEnum__Group__38268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__EEnum__Group__3__Impl8296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group__4__Impl_in_rule__EEnum__Group__48327 = new BitSet(new long[]{0x000000F000010000L});
        public static final BitSet FOLLOW_rule__EEnum__Group__5_in_rule__EEnum__Group__48330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_4__0_in_rule__EEnum__Group__4__Impl8357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group__5__Impl_in_rule__EEnum__Group__58388 = new BitSet(new long[]{0x000000F000010000L});
        public static final BitSet FOLLOW_rule__EEnum__Group__6_in_rule__EEnum__Group__58391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_5__0_in_rule__EEnum__Group__5__Impl8418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group__6__Impl_in_rule__EEnum__Group__68449 = new BitSet(new long[]{0x000000F000010000L});
        public static final BitSet FOLLOW_rule__EEnum__Group__7_in_rule__EEnum__Group__68452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_6__0_in_rule__EEnum__Group__6__Impl8479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group__7__Impl_in_rule__EEnum__Group__78510 = new BitSet(new long[]{0x000000F000010000L});
        public static final BitSet FOLLOW_rule__EEnum__Group__8_in_rule__EEnum__Group__78513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_7__0_in_rule__EEnum__Group__7__Impl8540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group__8__Impl_in_rule__EEnum__Group__88571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EEnum__Group__8__Impl8599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_4__0__Impl_in_rule__EEnum__Group_4__08648 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__EEnum__Group_4__1_in_rule__EEnum__Group_4__08651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__EEnum__Group_4__0__Impl8679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_4__1__Impl_in_rule__EEnum__Group_4__18710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__InstanceClassNameAssignment_4_1_in_rule__EEnum__Group_4__1__Impl8737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_5__0__Impl_in_rule__EEnum__Group_5__08771 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__EEnum__Group_5__1_in_rule__EEnum__Group_5__08774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__EEnum__Group_5__0__Impl8802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_5__1__Impl_in_rule__EEnum__Group_5__18833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__InstanceTypeNameAssignment_5_1_in_rule__EEnum__Group_5__1__Impl8860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_6__0__Impl_in_rule__EEnum__Group_6__08894 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EEnum__Group_6__1_in_rule__EEnum__Group_6__08897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__EEnum__Group_6__0__Impl8925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_6__1__Impl_in_rule__EEnum__Group_6__18956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__SerializableAssignment_6_1_in_rule__EEnum__Group_6__1__Impl8983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_7__0__Impl_in_rule__EEnum__Group_7__09017 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__EEnum__Group_7__1_in_rule__EEnum__Group_7__09020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__EEnum__Group_7__0__Impl9048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_7__1__Impl_in_rule__EEnum__Group_7__19079 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__EEnum__Group_7__2_in_rule__EEnum__Group_7__19082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__EEnum__Group_7__1__Impl9110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_7__2__Impl_in_rule__EEnum__Group_7__29141 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__EEnum__Group_7__3_in_rule__EEnum__Group_7__29144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__ELiteralsAssignment_7_2_in_rule__EEnum__Group_7__2__Impl9171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_7__3__Impl_in_rule__EEnum__Group_7__39201 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__EEnum__Group_7__4_in_rule__EEnum__Group_7__39204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_7_3__0_in_rule__EEnum__Group_7__3__Impl9231 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_7__4__Impl_in_rule__EEnum__Group_7__49262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EEnum__Group_7__4__Impl9290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_7_3__0__Impl_in_rule__EEnum__Group_7_3__09331 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__EEnum__Group_7_3__1_in_rule__EEnum__Group_7_3__09334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__EEnum__Group_7_3__0__Impl9362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__Group_7_3__1__Impl_in_rule__EEnum__Group_7_3__19393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnum__ELiteralsAssignment_7_3_1_in_rule__EEnum__Group_7_3__1__Impl9420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group__0__Impl_in_rule__EEnumLiteral__Group__09454 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group__1_in_rule__EEnumLiteral__Group__09457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group__1__Impl_in_rule__EEnumLiteral__Group__19515 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group__2_in_rule__EEnumLiteral__Group__19518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__EEnumLiteral__Group__1__Impl9546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group__2__Impl_in_rule__EEnumLiteral__Group__29577 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group__3_in_rule__EEnumLiteral__Group__29580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__NameAssignment_2_in_rule__EEnumLiteral__Group__2__Impl9607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group__3__Impl_in_rule__EEnumLiteral__Group__39637 = new BitSet(new long[]{0x0000060000010000L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group__4_in_rule__EEnumLiteral__Group__39640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__EEnumLiteral__Group__3__Impl9668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group__4__Impl_in_rule__EEnumLiteral__Group__49699 = new BitSet(new long[]{0x0000060000010000L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group__5_in_rule__EEnumLiteral__Group__49702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group_4__0_in_rule__EEnumLiteral__Group__4__Impl9729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group__5__Impl_in_rule__EEnumLiteral__Group__59760 = new BitSet(new long[]{0x0000060000010000L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group__6_in_rule__EEnumLiteral__Group__59763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group_5__0_in_rule__EEnumLiteral__Group__5__Impl9790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group__6__Impl_in_rule__EEnumLiteral__Group__69821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EEnumLiteral__Group__6__Impl9849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group_4__0__Impl_in_rule__EEnumLiteral__Group_4__09894 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group_4__1_in_rule__EEnumLiteral__Group_4__09897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__EEnumLiteral__Group_4__0__Impl9925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group_4__1__Impl_in_rule__EEnumLiteral__Group_4__19956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__ValueAssignment_4_1_in_rule__EEnumLiteral__Group_4__1__Impl9983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group_5__0__Impl_in_rule__EEnumLiteral__Group_5__010017 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group_5__1_in_rule__EEnumLiteral__Group_5__010020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__EEnumLiteral__Group_5__0__Impl10048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__Group_5__1__Impl_in_rule__EEnumLiteral__Group_5__110079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EEnumLiteral__LiteralAssignment_5_1_in_rule__EEnumLiteral__Group_5__1__Impl10106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__0__Impl_in_rule__EDataType_Impl__Group__010140 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__1_in_rule__EDataType_Impl__Group__010143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__1__Impl_in_rule__EDataType_Impl__Group__110201 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__2_in_rule__EDataType_Impl__Group__110204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__EDataType_Impl__Group__1__Impl10232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__2__Impl_in_rule__EDataType_Impl__Group__210263 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__3_in_rule__EDataType_Impl__Group__210266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__NameAssignment_2_in_rule__EDataType_Impl__Group__2__Impl10293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__3__Impl_in_rule__EDataType_Impl__Group__310323 = new BitSet(new long[]{0x0000007000010000L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__4_in_rule__EDataType_Impl__Group__310326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__EDataType_Impl__Group__3__Impl10354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__4__Impl_in_rule__EDataType_Impl__Group__410385 = new BitSet(new long[]{0x0000007000010000L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__5_in_rule__EDataType_Impl__Group__410388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group_4__0_in_rule__EDataType_Impl__Group__4__Impl10415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__5__Impl_in_rule__EDataType_Impl__Group__510446 = new BitSet(new long[]{0x0000007000010000L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__6_in_rule__EDataType_Impl__Group__510449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group_5__0_in_rule__EDataType_Impl__Group__5__Impl10476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__6__Impl_in_rule__EDataType_Impl__Group__610507 = new BitSet(new long[]{0x0000007000010000L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__7_in_rule__EDataType_Impl__Group__610510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group_6__0_in_rule__EDataType_Impl__Group__6__Impl10537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group__7__Impl_in_rule__EDataType_Impl__Group__710568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EDataType_Impl__Group__7__Impl10596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group_4__0__Impl_in_rule__EDataType_Impl__Group_4__010643 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group_4__1_in_rule__EDataType_Impl__Group_4__010646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__EDataType_Impl__Group_4__0__Impl10674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group_4__1__Impl_in_rule__EDataType_Impl__Group_4__110705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__InstanceClassNameAssignment_4_1_in_rule__EDataType_Impl__Group_4__1__Impl10732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group_5__0__Impl_in_rule__EDataType_Impl__Group_5__010766 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group_5__1_in_rule__EDataType_Impl__Group_5__010769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__EDataType_Impl__Group_5__0__Impl10797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group_5__1__Impl_in_rule__EDataType_Impl__Group_5__110828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__InstanceTypeNameAssignment_5_1_in_rule__EDataType_Impl__Group_5__1__Impl10855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group_6__0__Impl_in_rule__EDataType_Impl__Group_6__010889 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group_6__1_in_rule__EDataType_Impl__Group_6__010892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__EDataType_Impl__Group_6__0__Impl10920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__Group_6__1__Impl_in_rule__EDataType_Impl__Group_6__110951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDataType_Impl__SerializableAssignment_6_1_in_rule__EDataType_Impl__Group_6__1__Impl10978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__011012 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__011015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__EInt__Group__0__Impl11044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__111077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl11104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extension__NameAssignment_111142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extension__SchemeAssignment_411173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extension__ImportAssignment_5_211208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extension__ImportAssignment_5_3_111247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKind_in_rule__Extension__KindsAssignment_6_211282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKind_in_rule__Extension__KindsAssignment_6_3_111313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixin_in_rule__Extension__MixinsAssignment_7_211344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixin_in_rule__Extension__MixinsAssignment_7_3_111375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Kind__TermAssignment_111406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Kind__SchemeAssignment_411437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Kind__TitleAssignment_5_111468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Kind__ParentAssignment_6_111503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Kind__AttributesAssignment_7_211538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Kind__AttributesAssignment_7_3_111569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__Kind__ActionsAssignment_8_211600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__Kind__ActionsAssignment_8_3_111631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Mixin__TermAssignment_111662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Mixin__SchemeAssignment_411693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Mixin__TitleAssignment_5_111724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Mixin__AttributesAssignment_6_211755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Mixin__AttributesAssignment_6_3_111786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__Mixin__ActionsAssignment_7_211817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__Mixin__ActionsAssignment_7_3_111848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Attribute__NameAssignment_111879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__Attribute__MutableAssignment_3_111910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__Attribute__RequiredAssignment_4_111941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Attribute__DefaultAssignment_5_111972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Attribute__DescriptionAssignment_6_112003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__TermAssignment_112034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__SchemeAssignment_412065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__TitleAssignment_5_112096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Action__AttributesAssignment_6_212127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Action__AttributesAssignment_6_3_112158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__EEnum__NameAssignment_212189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__EEnum__InstanceClassNameAssignment_4_112220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__EEnum__InstanceTypeNameAssignment_5_112251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__EEnum__SerializableAssignment_6_112282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_rule__EEnum__ELiteralsAssignment_7_212313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_rule__EEnum__ELiteralsAssignment_7_3_112344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__EEnumLiteral__NameAssignment_212375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__EEnumLiteral__ValueAssignment_4_112406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__EEnumLiteral__LiteralAssignment_5_112437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__EDataType_Impl__NameAssignment_212468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__EDataType_Impl__InstanceClassNameAssignment_4_112499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__EDataType_Impl__InstanceTypeNameAssignment_5_112530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__EDataType_Impl__SerializableAssignment_6_112561 = new BitSet(new long[]{0x0000000000000002L});
    }


}