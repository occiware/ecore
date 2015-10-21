package org.occiware.clouddesigner.occi.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOCCILexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
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
    public static final int RULE_INT=4;
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
    public static final int T__32=32;
    public static final int RULE_STRING=7;
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

    public InternalOCCILexer() {;} 
    public InternalOCCILexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOCCILexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:11:7: ( 'extension' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:11:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:12:7: ( ':' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:13:7: ( 'import' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:13:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:14:7: ( 'as' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:14:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:15:7: ( 'kind' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:15:9: 'kind'
            {
            match("kind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:16:7: ( '{' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:17:7: ( '}' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:18:7: ( 'extends' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:18:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:19:7: ( 'title' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:19:9: 'title'
            {
            match("title"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:20:7: ( 'mixin' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:20:9: 'mixin'
            {
            match("mixin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:21:7: ( 'depends' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:21:9: 'depends'
            {
            match("depends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:22:7: ( ',' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:23:7: ( 'applies' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:23:9: 'applies'
            {
            match("applies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:24:7: ( 'scheme' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:24:9: 'scheme'
            {
            match("scheme"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:25:7: ( 'attribute' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:25:9: 'attribute'
            {
            match("attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:26:7: ( '=' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:26:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:27:7: ( 'description' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:27:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:28:7: ( 'action' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:28:9: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:29:7: ( '(' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:30:7: ( ')' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:31:7: ( 'datatype' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:31:9: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:32:7: ( 'enum' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:32:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:33:7: ( 'configuration' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:33:9: 'configuration'
            {
            match("configuration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:34:7: ( 'use' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:34:9: 'use'
            {
            match("use"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:35:7: ( 'resource' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:35:9: 'resource'
            {
            match("resource"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:36:7: ( 'mixins' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:36:9: 'mixins'
            {
            match("mixins"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:37:7: ( 'state' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:37:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:38:7: ( 'link' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:38:9: 'link'
            {
            match("link"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:39:7: ( 'target' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:39:9: 'target'
            {
            match("target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:40:7: ( '-' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:40:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:41:7: ( 'mutable' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:41:9: 'mutable'
            {
            match("mutable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:42:7: ( 'required' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:42:9: 'required'
            {
            match("required"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:43:7: ( '*' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:43:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:44:7: ( 'minExclusive' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:44:9: 'minExclusive'
            {
            match("minExclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:45:7: ( 'minInclusive' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:45:9: 'minInclusive'
            {
            match("minInclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:46:7: ( 'maxExclusive' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:46:9: 'maxExclusive'
            {
            match("maxExclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:47:7: ( 'maxInclusive' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:47:9: 'maxInclusive'
            {
            match("maxInclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:48:7: ( 'totalDigits' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:48:9: 'totalDigits'
            {
            match("totalDigits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:49:7: ( 'fractionDigits' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:49:9: 'fractionDigits'
            {
            match("fractionDigits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:50:7: ( 'length' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:50:9: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:51:7: ( 'minLength' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:51:9: 'minLength'
            {
            match("minLength"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:52:7: ( 'maxLength' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:52:9: 'maxLength'
            {
            match("maxLength"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:53:7: ( 'whiteSpace' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:53:9: 'whiteSpace'
            {
            match("whiteSpace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:54:7: ( 'pattern' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:54:9: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "RULE_QUALIFIED_ID"
    public final void mRULE_QUALIFIED_ID() throws RecognitionException {
        try {
            int _type = RULE_QUALIFIED_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7864:19: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )* )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7864:21: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )*
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7864:21: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7864:21: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7864:50: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('.'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7864:112: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7864:146: ( '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='.') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7864:147: '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            	    {
            	    match('.'); 
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7864:175: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUALIFIED_ID"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7866:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7866:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7866:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7866:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7866:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7868:10: ( ( '0' .. '9' )+ )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7868:12: ( '0' .. '9' )+
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7868:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7868:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7870:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7870:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7870:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7870:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7870:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7870:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7870:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7870:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7870:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7870:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7870:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7872:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7872:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7872:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7872:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7874:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7874:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7874:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7874:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7874:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7874:41: ( '\\r' )? '\\n'
                    {
                    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7874:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7874:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7876:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7876:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7876:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7878:16: ( . )
            // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:7878:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_QUALIFIED_ID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=52;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:274: RULE_QUALIFIED_ID
                {
                mRULE_QUALIFIED_ID(); 

                }
                break;
            case 46 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:292: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 47 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:300: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 48 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:309: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 49 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:321: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 50 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:337: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 51 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:353: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 52 :
                // ../org.occiware.clouddesigner.occi.xtext.ui/src-gen/org/occiware/clouddesigner/occi/xtext/ui/contentassist/antlr/internal/InternalOCCI.g:1:361: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\45\1\uffff\3\45\2\uffff\3\45\1\uffff\1\45\3\uffff\4\45\2\uffff\3\45\1\40\1\45\1\uffff\3\40\2\uffff\3\45\3\uffff\1\45\1\120\4\45\2\uffff\10\45\1\uffff\2\45\3\uffff\5\45\2\uffff\4\45\5\uffff\3\45\1\uffff\21\45\1\u0082\10\45\1\u008b\4\45\1\u0090\21\45\1\uffff\2\45\1\u00a4\5\45\1\uffff\4\45\1\uffff\1\u00af\2\45\1\u00b3\13\45\1\u00bf\3\45\1\uffff\6\45\1\u00c9\2\45\1\u00cc\1\uffff\1\u00cd\1\45\1\u00cf\1\uffff\12\45\1\u00da\1\uffff\3\45\1\u00de\4\45\1\u00e3\1\uffff\1\u00e4\1\45\2\uffff\1\45\1\uffff\3\45\1\u00ea\3\45\1\u00ee\2\45\1\uffff\3\45\1\uffff\2\45\1\u00f6\1\45\2\uffff\5\45\1\uffff\3\45\1\uffff\1\45\1\u0101\1\45\1\u0103\1\u0104\2\45\1\uffff\1\u0107\1\u0108\3\45\1\u010c\2\45\1\u010f\1\45\1\uffff\1\45\2\uffff\2\45\2\uffff\3\45\1\uffff\2\45\1\uffff\3\45\1\u011c\1\u011d\4\45\1\u0122\2\45\2\uffff\1\u0125\1\u0126\1\u0127\1\u0128\1\uffff\2\45\4\uffff\1\u012b\1\45\1\uffff\1\u012d\1\uffff";
    static final String DFA17_eofS =
        "\u012e\uffff";
    static final String DFA17_minS =
        "\1\0\1\56\1\uffff\3\56\2\uffff\3\56\1\uffff\1\56\3\uffff\4\56\2\uffff\3\56\1\101\1\56\1\uffff\2\0\1\52\2\uffff\3\56\3\uffff\6\56\2\uffff\10\56\1\uffff\2\56\3\uffff\5\56\2\uffff\4\56\5\uffff\3\56\1\uffff\61\56\1\uffff\10\56\1\uffff\4\56\1\uffff\23\56\1\uffff\12\56\1\uffff\3\56\1\uffff\13\56\1\uffff\11\56\1\uffff\2\56\2\uffff\1\56\1\uffff\12\56\1\uffff\3\56\1\uffff\4\56\2\uffff\5\56\1\uffff\3\56\1\uffff\7\56\1\uffff\12\56\1\uffff\1\56\2\uffff\2\56\2\uffff\3\56\1\uffff\2\56\1\uffff\14\56\2\uffff\4\56\1\uffff\2\56\4\uffff\2\56\1\uffff\1\56\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\172\1\uffff\3\172\2\uffff\3\172\1\uffff\1\172\3\uffff\4\172\2\uffff\5\172\1\uffff\2\uffff\1\57\2\uffff\3\172\3\uffff\6\172\2\uffff\10\172\1\uffff\2\172\3\uffff\5\172\2\uffff\4\172\5\uffff\3\172\1\uffff\61\172\1\uffff\10\172\1\uffff\4\172\1\uffff\23\172\1\uffff\12\172\1\uffff\3\172\1\uffff\13\172\1\uffff\11\172\1\uffff\2\172\2\uffff\1\172\1\uffff\12\172\1\uffff\3\172\1\uffff\4\172\2\uffff\5\172\1\uffff\3\172\1\uffff\7\172\1\uffff\12\172\1\uffff\1\172\2\uffff\2\172\2\uffff\3\172\1\uffff\2\172\1\uffff\14\172\2\uffff\4\172\1\uffff\2\172\4\uffff\2\172\1\uffff\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\3\uffff\1\6\1\7\3\uffff\1\14\1\uffff\1\20\1\23\1\24\4\uffff\1\36\1\41\5\uffff\1\57\3\uffff\1\63\1\64\3\uffff\1\55\1\56\1\2\6\uffff\1\6\1\7\10\uffff\1\14\2\uffff\1\20\1\23\1\24\5\uffff\1\36\1\41\4\uffff\1\57\1\60\1\61\1\62\1\63\3\uffff\1\4\61\uffff\1\30\10\uffff\1\26\4\uffff\1\5\23\uffff\1\34\12\uffff\1\11\3\uffff\1\12\13\uffff\1\33\11\uffff\1\3\2\uffff\1\22\1\35\1\uffff\1\32\12\uffff\1\16\3\uffff\1\50\4\uffff\1\10\1\15\5\uffff\1\37\3\uffff\1\13\7\uffff\1\54\12\uffff\1\25\1\uffff\1\31\1\40\2\uffff\1\1\1\17\3\uffff\1\51\2\uffff\1\52\14\uffff\1\53\1\46\4\uffff\1\21\2\uffff\1\42\1\43\1\44\1\45\2\uffff\1\27\1\uffff\1\47";
    static final String DFA17_specialS =
        "\1\0\33\uffff\1\2\1\1\u0110\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\34\4\40\1\35\1\16\1\17\1\25\1\40\1\13\1\24\1\40\1\36\12\33\1\2\2\40\1\15\3\40\32\32\3\40\1\31\1\32\1\40\1\4\1\32\1\20\1\12\1\1\1\26\2\32\1\3\1\32\1\5\1\23\1\11\2\32\1\30\1\32\1\22\1\14\1\10\1\21\1\32\1\27\3\32\1\6\1\40\1\7\uff82\40",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\42\11\43\1\41\2\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\14\43\1\47\15\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\53\14\43\1\51\2\43\1\50\1\52\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\54\21\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\60\7\43\1\57\5\43\1\61\13\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\64\7\43\1\62\13\43\1\63\5\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\66\3\43\1\65\25\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\70\20\43\1\71\6\43",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\75\13\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\76\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\77\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\101\3\43\1\100\21\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\104\10\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\7\43\1\105\22\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\106\31\43",
            "\32\107\4\uffff\1\107\1\uffff\32\107",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\0\111",
            "\0\111",
            "\1\112\4\uffff\1\113",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\115\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\24\43\1\116\5\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\117\12\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\121\12\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\122\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\123\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\124\14\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\125\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\126\10\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\127\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\131\11\43\1\130\2\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\132\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\27\43\1\133\2\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\134\2\43\1\135\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\136\6\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\7\43\1\137\22\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\140\31\43",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\141\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\142\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\20\43\1\144\1\43\1\143\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\145\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\146\14\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\147\31\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\150\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\151\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\152\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\14\43\1\153\15\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\154\13\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\155\16\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\156\10\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\157\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\160\26\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\161\16\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\162\23\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\163\31\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\164\21\43",
            "\1\44\1\uffff\12\43\7\uffff\4\43\1\165\3\43\1\166\2\43\1\167\16\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\170\31\43",
            "\1\44\1\uffff\12\43\7\uffff\4\43\1\171\3\43\1\172\2\43\1\173\16\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\174\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\175\27\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\176\31\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\177\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u0080\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\5\43\1\u0081\24\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\u0083\13\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\24\43\1\u0084\5\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\12\43\1\u0085\17\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\u0086\23\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\u0087\27\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u0088\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u0089\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u008a\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\u008c\10\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u008d\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u008e\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\u008f\13\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u0091\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u0092\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\u0093\16\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u0094\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\27\43\1\u0095\2\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u0096\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u0097\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\43\1\u0098\30\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\27\43\1\u0099\2\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u009a\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u009b\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u009c\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\u009d\10\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u009e\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\14\43\1\u009f\15\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u00a0\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u00a1\21\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\24\43\1\u00a2\5\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u00a3\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u00a5\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u00a6\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u00a7\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u00a8\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\u00aa\16\43\1\u00a9\7\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u00ab\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u00ac\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\43\1\u00ad\30\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u00ae\14\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u00b0\6\43",
            "\1\44\1\uffff\12\43\7\uffff\3\43\1\u00b1\26\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u00b2\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\u00b4\27\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\u00b5\27\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u00b6\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\u00b7\16\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\u00b8\27\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\u00b9\27\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u00ba\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\u00bb\26\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u00bc\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\30\43\1\u00bd\1\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u00be\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\u00c0\23\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\u00c1\10\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\u00c2\10\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\7\43\1\u00c3\22\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u00c4\21\43",
            "\1\44\1\uffff\12\43\7\uffff\22\43\1\u00c5\7\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\u00c6\10\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u00c7\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u00c8\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u00ca\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\24\43\1\u00cb\5\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u00ce\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\u00d0\16\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\u00d1\16\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\u00d2\23\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u00d3\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\u00d4\16\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\u00d5\16\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\u00d6\23\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u00d7\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\u00d8\12\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\u00d9\12\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\24\43\1\u00db\5\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\u00dc\27\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u00dd\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\u00df\13\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\u00e0\12\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u00e1\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\u00e2\13\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u00e5\6\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\u00e6\23\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\24\43\1\u00e7\5\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\24\43\1\u00e8\5\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u00e9\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\24\43\1\u00eb\5\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\24\43\1\u00ec\5\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u00ed\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u00ef\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u00f0\25\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\u00f1\10\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u00f2\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\u00f3\26\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u00f4\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\u00f5\31\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u00f7\14\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u00f8\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u00f9\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u00fa\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u00fb\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\7\43\1\u00fc\22\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u00fd\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u00fe\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\7\43\1\u00ff\22\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u0100\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\u0102\31\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\3\43\1\u0105\26\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\u0106\27\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u0109\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u010a\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u010b\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u010d\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u010e\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\u0110\13\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u0111\6\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u0112\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u0113\25\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u0114\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\25\43\1\u0115\4\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\25\43\1\u0116\4\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\25\43\1\u0117\4\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\25\43\1\u0118\4\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u0119\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u011a\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\u011b\23\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u011e\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u011f\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u0120\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u0121\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\u0123\13\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u0124\21\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u0129\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u012a\6\43",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u012c\7\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    static class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_QUALIFIED_ID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='e') ) {s = 1;}

                        else if ( (LA17_0==':') ) {s = 2;}

                        else if ( (LA17_0=='i') ) {s = 3;}

                        else if ( (LA17_0=='a') ) {s = 4;}

                        else if ( (LA17_0=='k') ) {s = 5;}

                        else if ( (LA17_0=='{') ) {s = 6;}

                        else if ( (LA17_0=='}') ) {s = 7;}

                        else if ( (LA17_0=='t') ) {s = 8;}

                        else if ( (LA17_0=='m') ) {s = 9;}

                        else if ( (LA17_0=='d') ) {s = 10;}

                        else if ( (LA17_0==',') ) {s = 11;}

                        else if ( (LA17_0=='s') ) {s = 12;}

                        else if ( (LA17_0=='=') ) {s = 13;}

                        else if ( (LA17_0=='(') ) {s = 14;}

                        else if ( (LA17_0==')') ) {s = 15;}

                        else if ( (LA17_0=='c') ) {s = 16;}

                        else if ( (LA17_0=='u') ) {s = 17;}

                        else if ( (LA17_0=='r') ) {s = 18;}

                        else if ( (LA17_0=='l') ) {s = 19;}

                        else if ( (LA17_0=='-') ) {s = 20;}

                        else if ( (LA17_0=='*') ) {s = 21;}

                        else if ( (LA17_0=='f') ) {s = 22;}

                        else if ( (LA17_0=='w') ) {s = 23;}

                        else if ( (LA17_0=='p') ) {s = 24;}

                        else if ( (LA17_0=='^') ) {s = 25;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||LA17_0=='b'||(LA17_0>='g' && LA17_0<='h')||LA17_0=='j'||(LA17_0>='n' && LA17_0<='o')||LA17_0=='q'||LA17_0=='v'||(LA17_0>='x' && LA17_0<='z')) ) {s = 26;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 27;}

                        else if ( (LA17_0=='\"') ) {s = 28;}

                        else if ( (LA17_0=='\'') ) {s = 29;}

                        else if ( (LA17_0=='/') ) {s = 30;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 31;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||LA17_0=='+'||LA17_0=='.'||(LA17_0>=';' && LA17_0<='<')||(LA17_0>='>' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_29 = input.LA(1);

                        s = -1;
                        if ( ((LA17_29>='\u0000' && LA17_29<='\uFFFF')) ) {s = 73;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_28 = input.LA(1);

                        s = -1;
                        if ( ((LA17_28>='\u0000' && LA17_28<='\uFFFF')) ) {s = 73;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}