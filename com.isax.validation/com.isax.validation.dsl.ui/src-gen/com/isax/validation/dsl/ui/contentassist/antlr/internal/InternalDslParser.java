package com.isax.validation.dsl.ui.contentassist.antlr.internal; 

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
import com.isax.validation.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'as'", "','", "'or'", "'and'", "'implies'", "'=>'", "'becomes'", "':='", "'each'", "'any'", "'must have'", "'must not have'", "'can have'", "'parent'", "'child'", "'ancestor'", "'descendant'", "'multiple parents'", "'multiple children'", "'multiple ancestors'", "'multiple descendants'", "'equals'", "'not equals'", "'greater than'", "'lesser than'", "'greater or equals than'", "'lesser or equals than'", "'start'", "'on'", "'for'", "'holds'", "'that'", "'define'", "'where'", "'{'", "'}'", "'with'", "'property'", "'being'", "'('", "')'", "'['", "']'", "'in'", "'v'", "'n'", "'.'", "'*'", "'not'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
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


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g"; }


     
     	private DslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleValidator"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:60:1: entryRuleValidator : ruleValidator EOF ;
    public final void entryRuleValidator() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:61:1: ( ruleValidator EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:62:1: ruleValidator EOF
            {
             before(grammarAccess.getValidatorRule()); 
            pushFollow(FOLLOW_ruleValidator_in_entryRuleValidator61);
            ruleValidator();

            state._fsp--;

             after(grammarAccess.getValidatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidator68); 

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
    // $ANTLR end "entryRuleValidator"


    // $ANTLR start "ruleValidator"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:69:1: ruleValidator : ( ( ( rule__Validator__SentencesAssignment ) ) ( ( rule__Validator__SentencesAssignment )* ) ) ;
    public final void ruleValidator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:73:2: ( ( ( ( rule__Validator__SentencesAssignment ) ) ( ( rule__Validator__SentencesAssignment )* ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( ( rule__Validator__SentencesAssignment ) ) ( ( rule__Validator__SentencesAssignment )* ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( ( rule__Validator__SentencesAssignment ) ) ( ( rule__Validator__SentencesAssignment )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:75:1: ( ( rule__Validator__SentencesAssignment ) ) ( ( rule__Validator__SentencesAssignment )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:75:1: ( ( rule__Validator__SentencesAssignment ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:76:1: ( rule__Validator__SentencesAssignment )
            {
             before(grammarAccess.getValidatorAccess().getSentencesAssignment()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:77:1: ( rule__Validator__SentencesAssignment )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:77:2: rule__Validator__SentencesAssignment
            {
            pushFollow(FOLLOW_rule__Validator__SentencesAssignment_in_ruleValidator96);
            rule__Validator__SentencesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getValidatorAccess().getSentencesAssignment()); 

            }

            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:80:1: ( ( rule__Validator__SentencesAssignment )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:81:1: ( rule__Validator__SentencesAssignment )*
            {
             before(grammarAccess.getValidatorAccess().getSentencesAssignment()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:82:1: ( rule__Validator__SentencesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=20 && LA1_0<=21)||LA1_0==39||LA1_0==41||LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:82:2: rule__Validator__SentencesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Validator__SentencesAssignment_in_ruleValidator108);
            	    rule__Validator__SentencesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getValidatorAccess().getSentencesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidator"


    // $ANTLR start "entryRuleSentence"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:95:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:96:1: ( ruleSentence EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:97:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_ruleSentence_in_entryRuleSentence138);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentence145); 

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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:104:1: ruleSentence : ( ( rule__Sentence__Alternatives ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:108:2: ( ( ( rule__Sentence__Alternatives ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:109:1: ( ( rule__Sentence__Alternatives ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:109:1: ( ( rule__Sentence__Alternatives ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:110:1: ( rule__Sentence__Alternatives )
            {
             before(grammarAccess.getSentenceAccess().getAlternatives()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:111:1: ( rule__Sentence__Alternatives )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:111:2: rule__Sentence__Alternatives
            {
            pushFollow(FOLLOW_rule__Sentence__Alternatives_in_ruleSentence171);
            rule__Sentence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleStartOnSentence"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:123:1: entryRuleStartOnSentence : ruleStartOnSentence EOF ;
    public final void entryRuleStartOnSentence() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:124:1: ( ruleStartOnSentence EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:125:1: ruleStartOnSentence EOF
            {
             before(grammarAccess.getStartOnSentenceRule()); 
            pushFollow(FOLLOW_ruleStartOnSentence_in_entryRuleStartOnSentence198);
            ruleStartOnSentence();

            state._fsp--;

             after(grammarAccess.getStartOnSentenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartOnSentence205); 

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
    // $ANTLR end "entryRuleStartOnSentence"


    // $ANTLR start "ruleStartOnSentence"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:132:1: ruleStartOnSentence : ( ( rule__StartOnSentence__Group__0 ) ) ;
    public final void ruleStartOnSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:136:2: ( ( ( rule__StartOnSentence__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:137:1: ( ( rule__StartOnSentence__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:137:1: ( ( rule__StartOnSentence__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:138:1: ( rule__StartOnSentence__Group__0 )
            {
             before(grammarAccess.getStartOnSentenceAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:139:1: ( rule__StartOnSentence__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:139:2: rule__StartOnSentence__Group__0
            {
            pushFollow(FOLLOW_rule__StartOnSentence__Group__0_in_ruleStartOnSentence231);
            rule__StartOnSentence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartOnSentenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartOnSentence"


    // $ANTLR start "entryRuleDefinitionSentence"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:151:1: entryRuleDefinitionSentence : ruleDefinitionSentence EOF ;
    public final void entryRuleDefinitionSentence() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:152:1: ( ruleDefinitionSentence EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:153:1: ruleDefinitionSentence EOF
            {
             before(grammarAccess.getDefinitionSentenceRule()); 
            pushFollow(FOLLOW_ruleDefinitionSentence_in_entryRuleDefinitionSentence258);
            ruleDefinitionSentence();

            state._fsp--;

             after(grammarAccess.getDefinitionSentenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionSentence265); 

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
    // $ANTLR end "entryRuleDefinitionSentence"


    // $ANTLR start "ruleDefinitionSentence"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:160:1: ruleDefinitionSentence : ( ( rule__DefinitionSentence__Group__0 ) ) ;
    public final void ruleDefinitionSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:164:2: ( ( ( rule__DefinitionSentence__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:165:1: ( ( rule__DefinitionSentence__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:165:1: ( ( rule__DefinitionSentence__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:166:1: ( rule__DefinitionSentence__Group__0 )
            {
             before(grammarAccess.getDefinitionSentenceAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:167:1: ( rule__DefinitionSentence__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:167:2: rule__DefinitionSentence__Group__0
            {
            pushFollow(FOLLOW_rule__DefinitionSentence__Group__0_in_ruleDefinitionSentence291);
            rule__DefinitionSentence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionSentenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinitionSentence"


    // $ANTLR start "entryRuleConstraintSentence"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:179:1: entryRuleConstraintSentence : ruleConstraintSentence EOF ;
    public final void entryRuleConstraintSentence() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:180:1: ( ruleConstraintSentence EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:181:1: ruleConstraintSentence EOF
            {
             before(grammarAccess.getConstraintSentenceRule()); 
            pushFollow(FOLLOW_ruleConstraintSentence_in_entryRuleConstraintSentence318);
            ruleConstraintSentence();

            state._fsp--;

             after(grammarAccess.getConstraintSentenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintSentence325); 

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
    // $ANTLR end "entryRuleConstraintSentence"


    // $ANTLR start "ruleConstraintSentence"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:188:1: ruleConstraintSentence : ( ( rule__ConstraintSentence__Group__0 ) ) ;
    public final void ruleConstraintSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:192:2: ( ( ( rule__ConstraintSentence__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:193:1: ( ( rule__ConstraintSentence__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:193:1: ( ( rule__ConstraintSentence__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:194:1: ( rule__ConstraintSentence__Group__0 )
            {
             before(grammarAccess.getConstraintSentenceAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:195:1: ( rule__ConstraintSentence__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:195:2: rule__ConstraintSentence__Group__0
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Group__0_in_ruleConstraintSentence351);
            rule__ConstraintSentence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintSentenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintSentence"


    // $ANTLR start "entryRulePredicateDefinitionSentence"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:207:1: entryRulePredicateDefinitionSentence : rulePredicateDefinitionSentence EOF ;
    public final void entryRulePredicateDefinitionSentence() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:208:1: ( rulePredicateDefinitionSentence EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:209:1: rulePredicateDefinitionSentence EOF
            {
             before(grammarAccess.getPredicateDefinitionSentenceRule()); 
            pushFollow(FOLLOW_rulePredicateDefinitionSentence_in_entryRulePredicateDefinitionSentence378);
            rulePredicateDefinitionSentence();

            state._fsp--;

             after(grammarAccess.getPredicateDefinitionSentenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateDefinitionSentence385); 

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
    // $ANTLR end "entryRulePredicateDefinitionSentence"


    // $ANTLR start "rulePredicateDefinitionSentence"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:216:1: rulePredicateDefinitionSentence : ( ( rule__PredicateDefinitionSentence__Group__0 ) ) ;
    public final void rulePredicateDefinitionSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:220:2: ( ( ( rule__PredicateDefinitionSentence__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:221:1: ( ( rule__PredicateDefinitionSentence__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:221:1: ( ( rule__PredicateDefinitionSentence__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:222:1: ( rule__PredicateDefinitionSentence__Group__0 )
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:223:1: ( rule__PredicateDefinitionSentence__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:223:2: rule__PredicateDefinitionSentence__Group__0
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__0_in_rulePredicateDefinitionSentence411);
            rule__PredicateDefinitionSentence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateDefinitionSentenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateDefinitionSentence"


    // $ANTLR start "entryRuleNodeDefinition"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:235:1: entryRuleNodeDefinition : ruleNodeDefinition EOF ;
    public final void entryRuleNodeDefinition() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:236:1: ( ruleNodeDefinition EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:237:1: ruleNodeDefinition EOF
            {
             before(grammarAccess.getNodeDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition438);
            ruleNodeDefinition();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDefinition445); 

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
    // $ANTLR end "entryRuleNodeDefinition"


    // $ANTLR start "ruleNodeDefinition"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:244:1: ruleNodeDefinition : ( ( rule__NodeDefinition__Group__0 ) ) ;
    public final void ruleNodeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:248:2: ( ( ( rule__NodeDefinition__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:249:1: ( ( rule__NodeDefinition__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:249:1: ( ( rule__NodeDefinition__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:250:1: ( rule__NodeDefinition__Group__0 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:251:1: ( rule__NodeDefinition__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:251:2: rule__NodeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__0_in_ruleNodeDefinition471);
            rule__NodeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeDefinition"


    // $ANTLR start "entryRuleNodeReferenceList"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:263:1: entryRuleNodeReferenceList : ruleNodeReferenceList EOF ;
    public final void entryRuleNodeReferenceList() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:264:1: ( ruleNodeReferenceList EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:265:1: ruleNodeReferenceList EOF
            {
             before(grammarAccess.getNodeReferenceListRule()); 
            pushFollow(FOLLOW_ruleNodeReferenceList_in_entryRuleNodeReferenceList498);
            ruleNodeReferenceList();

            state._fsp--;

             after(grammarAccess.getNodeReferenceListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeReferenceList505); 

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
    // $ANTLR end "entryRuleNodeReferenceList"


    // $ANTLR start "ruleNodeReferenceList"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:272:1: ruleNodeReferenceList : ( ( rule__NodeReferenceList__Group__0 ) ) ;
    public final void ruleNodeReferenceList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:276:2: ( ( ( rule__NodeReferenceList__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:277:1: ( ( rule__NodeReferenceList__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:277:1: ( ( rule__NodeReferenceList__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:278:1: ( rule__NodeReferenceList__Group__0 )
            {
             before(grammarAccess.getNodeReferenceListAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:279:1: ( rule__NodeReferenceList__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:279:2: rule__NodeReferenceList__Group__0
            {
            pushFollow(FOLLOW_rule__NodeReferenceList__Group__0_in_ruleNodeReferenceList531);
            rule__NodeReferenceList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeReferenceListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeReferenceList"


    // $ANTLR start "entryRuleTargetDefinition"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:291:1: entryRuleTargetDefinition : ruleTargetDefinition EOF ;
    public final void entryRuleTargetDefinition() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:292:1: ( ruleTargetDefinition EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:293:1: ruleTargetDefinition EOF
            {
             before(grammarAccess.getTargetDefinitionRule()); 
            pushFollow(FOLLOW_ruleTargetDefinition_in_entryRuleTargetDefinition558);
            ruleTargetDefinition();

            state._fsp--;

             after(grammarAccess.getTargetDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetDefinition565); 

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
    // $ANTLR end "entryRuleTargetDefinition"


    // $ANTLR start "ruleTargetDefinition"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:300:1: ruleTargetDefinition : ( ( rule__TargetDefinition__Group__0 ) ) ;
    public final void ruleTargetDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:304:2: ( ( ( rule__TargetDefinition__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:305:1: ( ( rule__TargetDefinition__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:305:1: ( ( rule__TargetDefinition__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:306:1: ( rule__TargetDefinition__Group__0 )
            {
             before(grammarAccess.getTargetDefinitionAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:307:1: ( rule__TargetDefinition__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:307:2: rule__TargetDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group__0_in_ruleTargetDefinition591);
            rule__TargetDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetDefinition"


    // $ANTLR start "entryRuleSelectorList"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:319:1: entryRuleSelectorList : ruleSelectorList EOF ;
    public final void entryRuleSelectorList() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:320:1: ( ruleSelectorList EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:321:1: ruleSelectorList EOF
            {
             before(grammarAccess.getSelectorListRule()); 
            pushFollow(FOLLOW_ruleSelectorList_in_entryRuleSelectorList618);
            ruleSelectorList();

            state._fsp--;

             after(grammarAccess.getSelectorListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectorList625); 

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
    // $ANTLR end "entryRuleSelectorList"


    // $ANTLR start "ruleSelectorList"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:328:1: ruleSelectorList : ( ( rule__SelectorList__Alternatives ) ) ;
    public final void ruleSelectorList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:332:2: ( ( ( rule__SelectorList__Alternatives ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:333:1: ( ( rule__SelectorList__Alternatives ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:333:1: ( ( rule__SelectorList__Alternatives ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:334:1: ( rule__SelectorList__Alternatives )
            {
             before(grammarAccess.getSelectorListAccess().getAlternatives()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:335:1: ( rule__SelectorList__Alternatives )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:335:2: rule__SelectorList__Alternatives
            {
            pushFollow(FOLLOW_rule__SelectorList__Alternatives_in_ruleSelectorList651);
            rule__SelectorList__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectorListAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectorList"


    // $ANTLR start "entryRuleSelectorListDef"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:347:1: entryRuleSelectorListDef : ruleSelectorListDef EOF ;
    public final void entryRuleSelectorListDef() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:348:1: ( ruleSelectorListDef EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:349:1: ruleSelectorListDef EOF
            {
             before(grammarAccess.getSelectorListDefRule()); 
            pushFollow(FOLLOW_ruleSelectorListDef_in_entryRuleSelectorListDef678);
            ruleSelectorListDef();

            state._fsp--;

             after(grammarAccess.getSelectorListDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectorListDef685); 

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
    // $ANTLR end "entryRuleSelectorListDef"


    // $ANTLR start "ruleSelectorListDef"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:356:1: ruleSelectorListDef : ( ( rule__SelectorListDef__Group__0 ) ) ;
    public final void ruleSelectorListDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:360:2: ( ( ( rule__SelectorListDef__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:361:1: ( ( rule__SelectorListDef__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:361:1: ( ( rule__SelectorListDef__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:362:1: ( rule__SelectorListDef__Group__0 )
            {
             before(grammarAccess.getSelectorListDefAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:363:1: ( rule__SelectorListDef__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:363:2: rule__SelectorListDef__Group__0
            {
            pushFollow(FOLLOW_rule__SelectorListDef__Group__0_in_ruleSelectorListDef711);
            rule__SelectorListDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorListDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectorListDef"


    // $ANTLR start "entryRuleSelector"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:375:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:376:1: ( ruleSelector EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:377:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector738);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector745); 

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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:384:1: ruleSelector : ( ( rule__Selector__TypeAssignment ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:388:2: ( ( ( rule__Selector__TypeAssignment ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:389:1: ( ( rule__Selector__TypeAssignment ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:389:1: ( ( rule__Selector__TypeAssignment ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:390:1: ( rule__Selector__TypeAssignment )
            {
             before(grammarAccess.getSelectorAccess().getTypeAssignment()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:391:1: ( rule__Selector__TypeAssignment )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:391:2: rule__Selector__TypeAssignment
            {
            pushFollow(FOLLOW_rule__Selector__TypeAssignment_in_ruleSelector771);
            rule__Selector__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRulePredicateExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:403:1: entryRulePredicateExpression : rulePredicateExpression EOF ;
    public final void entryRulePredicateExpression() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:404:1: ( rulePredicateExpression EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:405:1: rulePredicateExpression EOF
            {
             before(grammarAccess.getPredicateExpressionRule()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression798);
            rulePredicateExpression();

            state._fsp--;

             after(grammarAccess.getPredicateExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateExpression805); 

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
    // $ANTLR end "entryRulePredicateExpression"


    // $ANTLR start "rulePredicateExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:412:1: rulePredicateExpression : ( ruleAndExpression ) ;
    public final void rulePredicateExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:416:2: ( ( ruleAndExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:417:1: ( ruleAndExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:417:1: ( ruleAndExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:418:1: ruleAndExpression
            {
             before(grammarAccess.getPredicateExpressionAccess().getAndExpressionParserRuleCall()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rulePredicateExpression831);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getPredicateExpressionAccess().getAndExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:431:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:432:1: ( ruleAndExpression EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:433:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression857);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression864); 

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:440:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:444:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:445:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:445:1: ( ( rule__AndExpression__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:446:1: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:447:1: ( rule__AndExpression__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:447:2: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression890);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:459:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:460:1: ( ruleOrExpression EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:461:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression917);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression924); 

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:468:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:472:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:473:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:473:1: ( ( rule__OrExpression__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:474:1: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:475:1: ( rule__OrExpression__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:475:2: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression950);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleImpliesExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:487:1: entryRuleImpliesExpression : ruleImpliesExpression EOF ;
    public final void entryRuleImpliesExpression() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:488:1: ( ruleImpliesExpression EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:489:1: ruleImpliesExpression EOF
            {
             before(grammarAccess.getImpliesExpressionRule()); 
            pushFollow(FOLLOW_ruleImpliesExpression_in_entryRuleImpliesExpression977);
            ruleImpliesExpression();

            state._fsp--;

             after(grammarAccess.getImpliesExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpliesExpression984); 

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
    // $ANTLR end "entryRuleImpliesExpression"


    // $ANTLR start "ruleImpliesExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:496:1: ruleImpliesExpression : ( ( rule__ImpliesExpression__Group__0 ) ) ;
    public final void ruleImpliesExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:500:2: ( ( ( rule__ImpliesExpression__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:501:1: ( ( rule__ImpliesExpression__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:501:1: ( ( rule__ImpliesExpression__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:502:1: ( rule__ImpliesExpression__Group__0 )
            {
             before(grammarAccess.getImpliesExpressionAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:503:1: ( rule__ImpliesExpression__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:503:2: rule__ImpliesExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__Group__0_in_ruleImpliesExpression1010);
            rule__ImpliesExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImpliesExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImpliesExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:515:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:516:1: ( rulePrimaryExpression EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:517:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1037);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1044); 

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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:524:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Group__0 ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:528:2: ( ( ( rule__PrimaryExpression__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:529:1: ( ( rule__PrimaryExpression__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:529:1: ( ( rule__PrimaryExpression__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:530:1: ( rule__PrimaryExpression__Group__0 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:531:1: ( rule__PrimaryExpression__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:531:2: rule__PrimaryExpression__Group__0
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group__0_in_rulePrimaryExpression1070);
            rule__PrimaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePredicateCall"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:543:1: entryRulePredicateCall : rulePredicateCall EOF ;
    public final void entryRulePredicateCall() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:544:1: ( rulePredicateCall EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:545:1: rulePredicateCall EOF
            {
             before(grammarAccess.getPredicateCallRule()); 
            pushFollow(FOLLOW_rulePredicateCall_in_entryRulePredicateCall1097);
            rulePredicateCall();

            state._fsp--;

             after(grammarAccess.getPredicateCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateCall1104); 

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
    // $ANTLR end "entryRulePredicateCall"


    // $ANTLR start "rulePredicateCall"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:552:1: rulePredicateCall : ( ( rule__PredicateCall__Group__0 ) ) ;
    public final void rulePredicateCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:556:2: ( ( ( rule__PredicateCall__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:557:1: ( ( rule__PredicateCall__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:557:1: ( ( rule__PredicateCall__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:558:1: ( rule__PredicateCall__Group__0 )
            {
             before(grammarAccess.getPredicateCallAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:559:1: ( rule__PredicateCall__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:559:2: rule__PredicateCall__Group__0
            {
            pushFollow(FOLLOW_rule__PredicateCall__Group__0_in_rulePredicateCall1130);
            rule__PredicateCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateCall"


    // $ANTLR start "entryRulePropertyRelationPredicate"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:571:1: entryRulePropertyRelationPredicate : rulePropertyRelationPredicate EOF ;
    public final void entryRulePropertyRelationPredicate() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:572:1: ( rulePropertyRelationPredicate EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:573:1: rulePropertyRelationPredicate EOF
            {
             before(grammarAccess.getPropertyRelationPredicateRule()); 
            pushFollow(FOLLOW_rulePropertyRelationPredicate_in_entryRulePropertyRelationPredicate1157);
            rulePropertyRelationPredicate();

            state._fsp--;

             after(grammarAccess.getPropertyRelationPredicateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyRelationPredicate1164); 

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
    // $ANTLR end "entryRulePropertyRelationPredicate"


    // $ANTLR start "rulePropertyRelationPredicate"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:580:1: rulePropertyRelationPredicate : ( ( rule__PropertyRelationPredicate__Group__0 ) ) ;
    public final void rulePropertyRelationPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:584:2: ( ( ( rule__PropertyRelationPredicate__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:585:1: ( ( rule__PropertyRelationPredicate__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:585:1: ( ( rule__PropertyRelationPredicate__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:586:1: ( rule__PropertyRelationPredicate__Group__0 )
            {
             before(grammarAccess.getPropertyRelationPredicateAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:587:1: ( rule__PropertyRelationPredicate__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:587:2: rule__PropertyRelationPredicate__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyRelationPredicate__Group__0_in_rulePropertyRelationPredicate1190);
            rule__PropertyRelationPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRelationPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyRelationPredicate"


    // $ANTLR start "entryRuleDefinitionSentencePredicate"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:599:1: entryRuleDefinitionSentencePredicate : ruleDefinitionSentencePredicate EOF ;
    public final void entryRuleDefinitionSentencePredicate() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:600:1: ( ruleDefinitionSentencePredicate EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:601:1: ruleDefinitionSentencePredicate EOF
            {
             before(grammarAccess.getDefinitionSentencePredicateRule()); 
            pushFollow(FOLLOW_ruleDefinitionSentencePredicate_in_entryRuleDefinitionSentencePredicate1217);
            ruleDefinitionSentencePredicate();

            state._fsp--;

             after(grammarAccess.getDefinitionSentencePredicateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionSentencePredicate1224); 

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
    // $ANTLR end "entryRuleDefinitionSentencePredicate"


    // $ANTLR start "ruleDefinitionSentencePredicate"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:608:1: ruleDefinitionSentencePredicate : ( ( rule__DefinitionSentencePredicate__SentenceAssignment ) ) ;
    public final void ruleDefinitionSentencePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:612:2: ( ( ( rule__DefinitionSentencePredicate__SentenceAssignment ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:613:1: ( ( rule__DefinitionSentencePredicate__SentenceAssignment ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:613:1: ( ( rule__DefinitionSentencePredicate__SentenceAssignment ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:614:1: ( rule__DefinitionSentencePredicate__SentenceAssignment )
            {
             before(grammarAccess.getDefinitionSentencePredicateAccess().getSentenceAssignment()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:615:1: ( rule__DefinitionSentencePredicate__SentenceAssignment )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:615:2: rule__DefinitionSentencePredicate__SentenceAssignment
            {
            pushFollow(FOLLOW_rule__DefinitionSentencePredicate__SentenceAssignment_in_ruleDefinitionSentencePredicate1250);
            rule__DefinitionSentencePredicate__SentenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionSentencePredicateAccess().getSentenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinitionSentencePredicate"


    // $ANTLR start "entryRulePredicateReference"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:627:1: entryRulePredicateReference : rulePredicateReference EOF ;
    public final void entryRulePredicateReference() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:628:1: ( rulePredicateReference EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:629:1: rulePredicateReference EOF
            {
             before(grammarAccess.getPredicateReferenceRule()); 
            pushFollow(FOLLOW_rulePredicateReference_in_entryRulePredicateReference1277);
            rulePredicateReference();

            state._fsp--;

             after(grammarAccess.getPredicateReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateReference1284); 

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
    // $ANTLR end "entryRulePredicateReference"


    // $ANTLR start "rulePredicateReference"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:636:1: rulePredicateReference : ( ( rule__PredicateReference__Group__0 ) ) ;
    public final void rulePredicateReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:640:2: ( ( ( rule__PredicateReference__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:641:1: ( ( rule__PredicateReference__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:641:1: ( ( rule__PredicateReference__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:642:1: ( rule__PredicateReference__Group__0 )
            {
             before(grammarAccess.getPredicateReferenceAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:643:1: ( rule__PredicateReference__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:643:2: rule__PredicateReference__Group__0
            {
            pushFollow(FOLLOW_rule__PredicateReference__Group__0_in_rulePredicateReference1310);
            rule__PredicateReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateReference"


    // $ANTLR start "entryRuleParameter"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:655:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:656:1: ( ruleParameter EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:657:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1337);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1344); 

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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:664:1: ruleParameter : ( ( rule__Parameter__NodeAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:668:2: ( ( ( rule__Parameter__NodeAssignment ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:669:1: ( ( rule__Parameter__NodeAssignment ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:669:1: ( ( rule__Parameter__NodeAssignment ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:670:1: ( rule__Parameter__NodeAssignment )
            {
             before(grammarAccess.getParameterAccess().getNodeAssignment()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:671:1: ( rule__Parameter__NodeAssignment )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:671:2: rule__Parameter__NodeAssignment
            {
            pushFollow(FOLLOW_rule__Parameter__NodeAssignment_in_ruleParameter1370);
            rule__Parameter__NodeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNodeAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleParameterList"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:683:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:684:1: ( ruleParameterList EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:685:1: ruleParameterList EOF
            {
             before(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList1397);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getParameterListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList1404); 

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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:692:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:696:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:697:1: ( ( rule__ParameterList__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:697:1: ( ( rule__ParameterList__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:698:1: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:699:1: ( rule__ParameterList__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:699:2: rule__ParameterList__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__0_in_ruleParameterList1430);
            rule__ParameterList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleArgument"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:711:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:712:1: ( ruleArgument EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:713:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument1457);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument1464); 

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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:720:1: ruleArgument : ( ( rule__Argument__NodeAssignment ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:724:2: ( ( ( rule__Argument__NodeAssignment ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:725:1: ( ( rule__Argument__NodeAssignment ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:725:1: ( ( rule__Argument__NodeAssignment ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:726:1: ( rule__Argument__NodeAssignment )
            {
             before(grammarAccess.getArgumentAccess().getNodeAssignment()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:727:1: ( rule__Argument__NodeAssignment )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:727:2: rule__Argument__NodeAssignment
            {
            pushFollow(FOLLOW_rule__Argument__NodeAssignment_in_ruleArgument1490);
            rule__Argument__NodeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNodeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleArgumentList"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:739:1: entryRuleArgumentList : ruleArgumentList EOF ;
    public final void entryRuleArgumentList() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:740:1: ( ruleArgumentList EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:741:1: ruleArgumentList EOF
            {
             before(grammarAccess.getArgumentListRule()); 
            pushFollow(FOLLOW_ruleArgumentList_in_entryRuleArgumentList1517);
            ruleArgumentList();

            state._fsp--;

             after(grammarAccess.getArgumentListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentList1524); 

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
    // $ANTLR end "entryRuleArgumentList"


    // $ANTLR start "ruleArgumentList"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:748:1: ruleArgumentList : ( ( rule__ArgumentList__Group__0 ) ) ;
    public final void ruleArgumentList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:752:2: ( ( ( rule__ArgumentList__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:753:1: ( ( rule__ArgumentList__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:753:1: ( ( rule__ArgumentList__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:754:1: ( rule__ArgumentList__Group__0 )
            {
             before(grammarAccess.getArgumentListAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:755:1: ( rule__ArgumentList__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:755:2: rule__ArgumentList__Group__0
            {
            pushFollow(FOLLOW_rule__ArgumentList__Group__0_in_ruleArgumentList1550);
            rule__ArgumentList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgumentList"


    // $ANTLR start "entryRuleAssignment"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:767:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:768:1: ( ruleAssignment EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:769:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1577);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1584); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:776:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:780:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:781:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:781:1: ( ( rule__Assignment__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:782:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:783:1: ( rule__Assignment__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:783:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment1610);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignmentList"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:795:1: entryRuleAssignmentList : ruleAssignmentList EOF ;
    public final void entryRuleAssignmentList() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:796:1: ( ruleAssignmentList EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:797:1: ruleAssignmentList EOF
            {
             before(grammarAccess.getAssignmentListRule()); 
            pushFollow(FOLLOW_ruleAssignmentList_in_entryRuleAssignmentList1637);
            ruleAssignmentList();

            state._fsp--;

             after(grammarAccess.getAssignmentListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentList1644); 

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
    // $ANTLR end "entryRuleAssignmentList"


    // $ANTLR start "ruleAssignmentList"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:804:1: ruleAssignmentList : ( ( rule__AssignmentList__Group__0 ) ) ;
    public final void ruleAssignmentList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:808:2: ( ( ( rule__AssignmentList__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:809:1: ( ( rule__AssignmentList__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:809:1: ( ( rule__AssignmentList__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:810:1: ( rule__AssignmentList__Group__0 )
            {
             before(grammarAccess.getAssignmentListAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:811:1: ( rule__AssignmentList__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:811:2: rule__AssignmentList__Group__0
            {
            pushFollow(FOLLOW_rule__AssignmentList__Group__0_in_ruleAssignmentList1670);
            rule__AssignmentList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignmentList"


    // $ANTLR start "entryRuleQuantification"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:823:1: entryRuleQuantification : ruleQuantification EOF ;
    public final void entryRuleQuantification() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:824:1: ( ruleQuantification EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:825:1: ruleQuantification EOF
            {
             before(grammarAccess.getQuantificationRule()); 
            pushFollow(FOLLOW_ruleQuantification_in_entryRuleQuantification1697);
            ruleQuantification();

            state._fsp--;

             after(grammarAccess.getQuantificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantification1704); 

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
    // $ANTLR end "entryRuleQuantification"


    // $ANTLR start "ruleQuantification"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:832:1: ruleQuantification : ( ( rule__Quantification__Group__0 ) ) ;
    public final void ruleQuantification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:836:2: ( ( ( rule__Quantification__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:837:1: ( ( rule__Quantification__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:837:1: ( ( rule__Quantification__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:838:1: ( rule__Quantification__Group__0 )
            {
             before(grammarAccess.getQuantificationAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:839:1: ( rule__Quantification__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:839:2: rule__Quantification__Group__0
            {
            pushFollow(FOLLOW_rule__Quantification__Group__0_in_ruleQuantification1730);
            rule__Quantification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuantification"


    // $ANTLR start "entryRuleQuantificationList"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:851:1: entryRuleQuantificationList : ruleQuantificationList EOF ;
    public final void entryRuleQuantificationList() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:852:1: ( ruleQuantificationList EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:853:1: ruleQuantificationList EOF
            {
             before(grammarAccess.getQuantificationListRule()); 
            pushFollow(FOLLOW_ruleQuantificationList_in_entryRuleQuantificationList1757);
            ruleQuantificationList();

            state._fsp--;

             after(grammarAccess.getQuantificationListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantificationList1764); 

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
    // $ANTLR end "entryRuleQuantificationList"


    // $ANTLR start "ruleQuantificationList"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:860:1: ruleQuantificationList : ( ( rule__QuantificationList__Group__0 ) ) ;
    public final void ruleQuantificationList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:864:2: ( ( ( rule__QuantificationList__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:865:1: ( ( rule__QuantificationList__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:865:1: ( ( rule__QuantificationList__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:866:1: ( rule__QuantificationList__Group__0 )
            {
             before(grammarAccess.getQuantificationListAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:867:1: ( rule__QuantificationList__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:867:2: rule__QuantificationList__Group__0
            {
            pushFollow(FOLLOW_rule__QuantificationList__Group__0_in_ruleQuantificationList1790);
            rule__QuantificationList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantificationListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuantificationList"


    // $ANTLR start "entryRulePropertyExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:879:1: entryRulePropertyExpression : rulePropertyExpression EOF ;
    public final void entryRulePropertyExpression() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:880:1: ( rulePropertyExpression EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:881:1: rulePropertyExpression EOF
            {
             before(grammarAccess.getPropertyExpressionRule()); 
            pushFollow(FOLLOW_rulePropertyExpression_in_entryRulePropertyExpression1817);
            rulePropertyExpression();

            state._fsp--;

             after(grammarAccess.getPropertyExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyExpression1824); 

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
    // $ANTLR end "entryRulePropertyExpression"


    // $ANTLR start "rulePropertyExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:888:1: rulePropertyExpression : ( ( rule__PropertyExpression__Alternatives ) ) ;
    public final void rulePropertyExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:892:2: ( ( ( rule__PropertyExpression__Alternatives ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:893:1: ( ( rule__PropertyExpression__Alternatives ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:893:1: ( ( rule__PropertyExpression__Alternatives ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:894:1: ( rule__PropertyExpression__Alternatives )
            {
             before(grammarAccess.getPropertyExpressionAccess().getAlternatives()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:895:1: ( rule__PropertyExpression__Alternatives )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:895:2: rule__PropertyExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PropertyExpression__Alternatives_in_rulePropertyExpression1850);
            rule__PropertyExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyExpression"


    // $ANTLR start "entryRulePropertyValueExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:907:1: entryRulePropertyValueExpression : rulePropertyValueExpression EOF ;
    public final void entryRulePropertyValueExpression() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:908:1: ( rulePropertyValueExpression EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:909:1: rulePropertyValueExpression EOF
            {
             before(grammarAccess.getPropertyValueExpressionRule()); 
            pushFollow(FOLLOW_rulePropertyValueExpression_in_entryRulePropertyValueExpression1877);
            rulePropertyValueExpression();

            state._fsp--;

             after(grammarAccess.getPropertyValueExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValueExpression1884); 

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
    // $ANTLR end "entryRulePropertyValueExpression"


    // $ANTLR start "rulePropertyValueExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:916:1: rulePropertyValueExpression : ( ( rule__PropertyValueExpression__Group__0 ) ) ;
    public final void rulePropertyValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:920:2: ( ( ( rule__PropertyValueExpression__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:921:1: ( ( rule__PropertyValueExpression__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:921:1: ( ( rule__PropertyValueExpression__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:922:1: ( rule__PropertyValueExpression__Group__0 )
            {
             before(grammarAccess.getPropertyValueExpressionAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:923:1: ( rule__PropertyValueExpression__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:923:2: rule__PropertyValueExpression__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyValueExpression__Group__0_in_rulePropertyValueExpression1910);
            rule__PropertyValueExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyValueExpression"


    // $ANTLR start "entryRulePropertyReferenceExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:935:1: entryRulePropertyReferenceExpression : rulePropertyReferenceExpression EOF ;
    public final void entryRulePropertyReferenceExpression() throws RecognitionException {
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:936:1: ( rulePropertyReferenceExpression EOF )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:937:1: rulePropertyReferenceExpression EOF
            {
             before(grammarAccess.getPropertyReferenceExpressionRule()); 
            pushFollow(FOLLOW_rulePropertyReferenceExpression_in_entryRulePropertyReferenceExpression1937);
            rulePropertyReferenceExpression();

            state._fsp--;

             after(grammarAccess.getPropertyReferenceExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyReferenceExpression1944); 

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
    // $ANTLR end "entryRulePropertyReferenceExpression"


    // $ANTLR start "rulePropertyReferenceExpression"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:944:1: rulePropertyReferenceExpression : ( ( rule__PropertyReferenceExpression__Group__0 ) ) ;
    public final void rulePropertyReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:948:2: ( ( ( rule__PropertyReferenceExpression__Group__0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:949:1: ( ( rule__PropertyReferenceExpression__Group__0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:949:1: ( ( rule__PropertyReferenceExpression__Group__0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:950:1: ( rule__PropertyReferenceExpression__Group__0 )
            {
             before(grammarAccess.getPropertyReferenceExpressionAccess().getGroup()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:951:1: ( rule__PropertyReferenceExpression__Group__0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:951:2: rule__PropertyReferenceExpression__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyReferenceExpression__Group__0_in_rulePropertyReferenceExpression1970);
            rule__PropertyReferenceExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyReferenceExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyReferenceExpression"


    // $ANTLR start "ruleQuantor"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:964:1: ruleQuantor : ( ( rule__Quantor__Alternatives ) ) ;
    public final void ruleQuantor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:968:1: ( ( ( rule__Quantor__Alternatives ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:969:1: ( ( rule__Quantor__Alternatives ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:969:1: ( ( rule__Quantor__Alternatives ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:970:1: ( rule__Quantor__Alternatives )
            {
             before(grammarAccess.getQuantorAccess().getAlternatives()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:971:1: ( rule__Quantor__Alternatives )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:971:2: rule__Quantor__Alternatives
            {
            pushFollow(FOLLOW_rule__Quantor__Alternatives_in_ruleQuantor2007);
            rule__Quantor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuantorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuantor"


    // $ANTLR start "ruleRelationQualifier"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:983:1: ruleRelationQualifier : ( ( rule__RelationQualifier__Alternatives ) ) ;
    public final void ruleRelationQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:987:1: ( ( ( rule__RelationQualifier__Alternatives ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:988:1: ( ( rule__RelationQualifier__Alternatives ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:988:1: ( ( rule__RelationQualifier__Alternatives ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:989:1: ( rule__RelationQualifier__Alternatives )
            {
             before(grammarAccess.getRelationQualifierAccess().getAlternatives()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:990:1: ( rule__RelationQualifier__Alternatives )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:990:2: rule__RelationQualifier__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationQualifier__Alternatives_in_ruleRelationQualifier2043);
            rule__RelationQualifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationQualifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationQualifier"


    // $ANTLR start "ruleAxis"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1002:1: ruleAxis : ( ( rule__Axis__Alternatives ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1006:1: ( ( ( rule__Axis__Alternatives ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1007:1: ( ( rule__Axis__Alternatives ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1007:1: ( ( rule__Axis__Alternatives ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1008:1: ( rule__Axis__Alternatives )
            {
             before(grammarAccess.getAxisAccess().getAlternatives()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1009:1: ( rule__Axis__Alternatives )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1009:2: rule__Axis__Alternatives
            {
            pushFollow(FOLLOW_rule__Axis__Alternatives_in_ruleAxis2079);
            rule__Axis__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAxis"


    // $ANTLR start "rulePropertyRelation"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1021:1: rulePropertyRelation : ( ( rule__PropertyRelation__Alternatives ) ) ;
    public final void rulePropertyRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1025:1: ( ( ( rule__PropertyRelation__Alternatives ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1026:1: ( ( rule__PropertyRelation__Alternatives ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1026:1: ( ( rule__PropertyRelation__Alternatives ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1027:1: ( rule__PropertyRelation__Alternatives )
            {
             before(grammarAccess.getPropertyRelationAccess().getAlternatives()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1028:1: ( rule__PropertyRelation__Alternatives )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1028:2: rule__PropertyRelation__Alternatives
            {
            pushFollow(FOLLOW_rule__PropertyRelation__Alternatives_in_rulePropertyRelation2115);
            rule__PropertyRelation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRelationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyRelation"


    // $ANTLR start "rule__Sentence__Alternatives"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1039:1: rule__Sentence__Alternatives : ( ( ruleStartOnSentence ) | ( ruleDefinitionSentence ) | ( ruleConstraintSentence ) | ( rulePredicateDefinitionSentence ) );
    public final void rule__Sentence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1043:1: ( ( ruleStartOnSentence ) | ( ruleDefinitionSentence ) | ( ruleConstraintSentence ) | ( rulePredicateDefinitionSentence ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
            case 20:
            case 21:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            case 44:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1044:1: ( ruleStartOnSentence )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1044:1: ( ruleStartOnSentence )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1045:1: ruleStartOnSentence
                    {
                     before(grammarAccess.getSentenceAccess().getStartOnSentenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStartOnSentence_in_rule__Sentence__Alternatives2150);
                    ruleStartOnSentence();

                    state._fsp--;

                     after(grammarAccess.getSentenceAccess().getStartOnSentenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1050:6: ( ruleDefinitionSentence )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1050:6: ( ruleDefinitionSentence )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1051:1: ruleDefinitionSentence
                    {
                     before(grammarAccess.getSentenceAccess().getDefinitionSentenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDefinitionSentence_in_rule__Sentence__Alternatives2167);
                    ruleDefinitionSentence();

                    state._fsp--;

                     after(grammarAccess.getSentenceAccess().getDefinitionSentenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1056:6: ( ruleConstraintSentence )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1056:6: ( ruleConstraintSentence )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1057:1: ruleConstraintSentence
                    {
                     before(grammarAccess.getSentenceAccess().getConstraintSentenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleConstraintSentence_in_rule__Sentence__Alternatives2184);
                    ruleConstraintSentence();

                    state._fsp--;

                     after(grammarAccess.getSentenceAccess().getConstraintSentenceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1062:6: ( rulePredicateDefinitionSentence )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1062:6: ( rulePredicateDefinitionSentence )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1063:1: rulePredicateDefinitionSentence
                    {
                     before(grammarAccess.getSentenceAccess().getPredicateDefinitionSentenceParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePredicateDefinitionSentence_in_rule__Sentence__Alternatives2201);
                    rulePredicateDefinitionSentence();

                    state._fsp--;

                     after(grammarAccess.getSentenceAccess().getPredicateDefinitionSentenceParserRuleCall_3()); 

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
    // $ANTLR end "rule__Sentence__Alternatives"


    // $ANTLR start "rule__DefinitionSentence__Alternatives_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1073:1: rule__DefinitionSentence__Alternatives_0 : ( ( ( rule__DefinitionSentence__QuantificationAssignment_0_0 ) ) | ( ( rule__DefinitionSentence__NodeAssignment_0_1 ) ) );
    public final void rule__DefinitionSentence__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1077:1: ( ( ( rule__DefinitionSentence__QuantificationAssignment_0_0 ) ) | ( ( rule__DefinitionSentence__NodeAssignment_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=20 && LA3_0<=21)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1078:1: ( ( rule__DefinitionSentence__QuantificationAssignment_0_0 ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1078:1: ( ( rule__DefinitionSentence__QuantificationAssignment_0_0 ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1079:1: ( rule__DefinitionSentence__QuantificationAssignment_0_0 )
                    {
                     before(grammarAccess.getDefinitionSentenceAccess().getQuantificationAssignment_0_0()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1080:1: ( rule__DefinitionSentence__QuantificationAssignment_0_0 )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1080:2: rule__DefinitionSentence__QuantificationAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__DefinitionSentence__QuantificationAssignment_0_0_in_rule__DefinitionSentence__Alternatives_02233);
                    rule__DefinitionSentence__QuantificationAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionSentenceAccess().getQuantificationAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1084:6: ( ( rule__DefinitionSentence__NodeAssignment_0_1 ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1084:6: ( ( rule__DefinitionSentence__NodeAssignment_0_1 ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1085:1: ( rule__DefinitionSentence__NodeAssignment_0_1 )
                    {
                     before(grammarAccess.getDefinitionSentenceAccess().getNodeAssignment_0_1()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1086:1: ( rule__DefinitionSentence__NodeAssignment_0_1 )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1086:2: rule__DefinitionSentence__NodeAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__DefinitionSentence__NodeAssignment_0_1_in_rule__DefinitionSentence__Alternatives_02251);
                    rule__DefinitionSentence__NodeAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionSentenceAccess().getNodeAssignment_0_1()); 

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
    // $ANTLR end "rule__DefinitionSentence__Alternatives_0"


    // $ANTLR start "rule__ConstraintSentence__Alternatives_3"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1095:1: rule__ConstraintSentence__Alternatives_3 : ( ( ( rule__ConstraintSentence__Group_3_0__0 ) ) | ( ':' ) );
    public final void rule__ConstraintSentence__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1099:1: ( ( ( rule__ConstraintSentence__Group_3_0__0 ) ) | ( ':' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==42) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1100:1: ( ( rule__ConstraintSentence__Group_3_0__0 ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1100:1: ( ( rule__ConstraintSentence__Group_3_0__0 ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1101:1: ( rule__ConstraintSentence__Group_3_0__0 )
                    {
                     before(grammarAccess.getConstraintSentenceAccess().getGroup_3_0()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1102:1: ( rule__ConstraintSentence__Group_3_0__0 )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1102:2: rule__ConstraintSentence__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintSentence__Group_3_0__0_in_rule__ConstraintSentence__Alternatives_32284);
                    rule__ConstraintSentence__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintSentenceAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1106:6: ( ':' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1106:6: ( ':' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1107:1: ':'
                    {
                     before(grammarAccess.getConstraintSentenceAccess().getColonKeyword_3_1()); 
                    match(input,11,FOLLOW_11_in_rule__ConstraintSentence__Alternatives_32303); 
                     after(grammarAccess.getConstraintSentenceAccess().getColonKeyword_3_1()); 

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
    // $ANTLR end "rule__ConstraintSentence__Alternatives_3"


    // $ANTLR start "rule__PredicateDefinitionSentence__Alternatives_3"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1119:1: rule__PredicateDefinitionSentence__Alternatives_3 : ( ( 'as' ) | ( ':' ) );
    public final void rule__PredicateDefinitionSentence__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1123:1: ( ( 'as' ) | ( ':' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1124:1: ( 'as' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1124:1: ( 'as' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1125:1: 'as'
                    {
                     before(grammarAccess.getPredicateDefinitionSentenceAccess().getAsKeyword_3_0()); 
                    match(input,12,FOLLOW_12_in_rule__PredicateDefinitionSentence__Alternatives_32338); 
                     after(grammarAccess.getPredicateDefinitionSentenceAccess().getAsKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1132:6: ( ':' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1132:6: ( ':' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1133:1: ':'
                    {
                     before(grammarAccess.getPredicateDefinitionSentenceAccess().getColonKeyword_3_1()); 
                    match(input,11,FOLLOW_11_in_rule__PredicateDefinitionSentence__Alternatives_32358); 
                     after(grammarAccess.getPredicateDefinitionSentenceAccess().getColonKeyword_3_1()); 

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
    // $ANTLR end "rule__PredicateDefinitionSentence__Alternatives_3"


    // $ANTLR start "rule__SelectorList__Alternatives"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1145:1: rule__SelectorList__Alternatives : ( ( ( rule__SelectorList__Group_0__0 ) ) | ( ( rule__SelectorList__Group_1__0 ) ) );
    public final void rule__SelectorList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1149:1: ( ( ( rule__SelectorList__Group_0__0 ) ) | ( ( rule__SelectorList__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==50) ) {
                alt6=1;
            }
            else if ( (LA6_0==51) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1150:1: ( ( rule__SelectorList__Group_0__0 ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1150:1: ( ( rule__SelectorList__Group_0__0 ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1151:1: ( rule__SelectorList__Group_0__0 )
                    {
                     before(grammarAccess.getSelectorListAccess().getGroup_0()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1152:1: ( rule__SelectorList__Group_0__0 )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1152:2: rule__SelectorList__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SelectorList__Group_0__0_in_rule__SelectorList__Alternatives2392);
                    rule__SelectorList__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorListAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1156:6: ( ( rule__SelectorList__Group_1__0 ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1156:6: ( ( rule__SelectorList__Group_1__0 ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1157:1: ( rule__SelectorList__Group_1__0 )
                    {
                     before(grammarAccess.getSelectorListAccess().getGroup_1()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1158:1: ( rule__SelectorList__Group_1__0 )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1158:2: rule__SelectorList__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SelectorList__Group_1__0_in_rule__SelectorList__Alternatives2410);
                    rule__SelectorList__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorListAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SelectorList__Alternatives"


    // $ANTLR start "rule__SelectorListDef__Alternatives_1_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1167:1: rule__SelectorListDef__Alternatives_1_0 : ( ( ',' ) | ( 'or' ) );
    public final void rule__SelectorListDef__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1171:1: ( ( ',' ) | ( 'or' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1172:1: ( ',' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1172:1: ( ',' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1173:1: ','
                    {
                     before(grammarAccess.getSelectorListDefAccess().getCommaKeyword_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__SelectorListDef__Alternatives_1_02444); 
                     after(grammarAccess.getSelectorListDefAccess().getCommaKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1180:6: ( 'or' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1180:6: ( 'or' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1181:1: 'or'
                    {
                     before(grammarAccess.getSelectorListDefAccess().getOrKeyword_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__SelectorListDef__Alternatives_1_02464); 
                     after(grammarAccess.getSelectorListDefAccess().getOrKeyword_1_0_1()); 

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
    // $ANTLR end "rule__SelectorListDef__Alternatives_1_0"


    // $ANTLR start "rule__AndExpression__Alternatives_1_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1193:1: rule__AndExpression__Alternatives_1_1 : ( ( 'and' ) | ( ',' ) );
    public final void rule__AndExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1197:1: ( ( 'and' ) | ( ',' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==13) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1198:1: ( 'and' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1198:1: ( 'and' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1199:1: 'and'
                    {
                     before(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1_0()); 
                    match(input,15,FOLLOW_15_in_rule__AndExpression__Alternatives_1_12499); 
                     after(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1206:6: ( ',' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1206:6: ( ',' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1207:1: ','
                    {
                     before(grammarAccess.getAndExpressionAccess().getCommaKeyword_1_1_1()); 
                    match(input,13,FOLLOW_13_in_rule__AndExpression__Alternatives_1_12519); 
                     after(grammarAccess.getAndExpressionAccess().getCommaKeyword_1_1_1()); 

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
    // $ANTLR end "rule__AndExpression__Alternatives_1_1"


    // $ANTLR start "rule__ImpliesExpression__Alternatives_1_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1219:1: rule__ImpliesExpression__Alternatives_1_0 : ( ( 'implies' ) | ( '=>' ) );
    public final void rule__ImpliesExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1223:1: ( ( 'implies' ) | ( '=>' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1224:1: ( 'implies' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1224:1: ( 'implies' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1225:1: 'implies'
                    {
                     before(grammarAccess.getImpliesExpressionAccess().getImpliesKeyword_1_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__ImpliesExpression__Alternatives_1_02554); 
                     after(grammarAccess.getImpliesExpressionAccess().getImpliesKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1232:6: ( '=>' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1232:6: ( '=>' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1233:1: '=>'
                    {
                     before(grammarAccess.getImpliesExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__ImpliesExpression__Alternatives_1_02574); 
                     after(grammarAccess.getImpliesExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_0_1()); 

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
    // $ANTLR end "rule__ImpliesExpression__Alternatives_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1245:1: rule__PrimaryExpression__Alternatives_1 : ( ( ( rule__PrimaryExpression__CallAssignment_1_0 ) ) | ( ( rule__PrimaryExpression__Group_1_1__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1249:1: ( ( ( rule__PrimaryExpression__CallAssignment_1_0 ) ) | ( ( rule__PrimaryExpression__Group_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=20 && LA10_0<=21)||(LA10_0>=56 && LA10_0<=57)) ) {
                alt10=1;
            }
            else if ( (LA10_0==51) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1250:1: ( ( rule__PrimaryExpression__CallAssignment_1_0 ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1250:1: ( ( rule__PrimaryExpression__CallAssignment_1_0 ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1251:1: ( rule__PrimaryExpression__CallAssignment_1_0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getCallAssignment_1_0()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1252:1: ( rule__PrimaryExpression__CallAssignment_1_0 )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1252:2: rule__PrimaryExpression__CallAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__CallAssignment_1_0_in_rule__PrimaryExpression__Alternatives_12608);
                    rule__PrimaryExpression__CallAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getCallAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1256:6: ( ( rule__PrimaryExpression__Group_1_1__0 ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1256:6: ( ( rule__PrimaryExpression__Group_1_1__0 ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1257:1: ( rule__PrimaryExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1_1()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1258:1: ( rule__PrimaryExpression__Group_1_1__0 )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1258:2: rule__PrimaryExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_1_1__0_in_rule__PrimaryExpression__Alternatives_12626);
                    rule__PrimaryExpression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives_1"


    // $ANTLR start "rule__PredicateCall__Alternatives_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1267:1: rule__PredicateCall__Alternatives_0 : ( ( rulePropertyRelationPredicate ) | ( ruleDefinitionSentencePredicate ) | ( rulePredicateReference ) );
    public final void rule__PredicateCall__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1271:1: ( ( rulePropertyRelationPredicate ) | ( ruleDefinitionSentencePredicate ) | ( rulePredicateReference ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 56:
            case 57:
                {
                alt11=1;
                }
                break;
            case 20:
            case 21:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                int LA11_3 = input.LA(2);

                if ( ((LA11_3>=22 && LA11_3<=24)) ) {
                    alt11=2;
                }
                else if ( (LA11_3==RULE_ID) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1272:1: ( rulePropertyRelationPredicate )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1272:1: ( rulePropertyRelationPredicate )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1273:1: rulePropertyRelationPredicate
                    {
                     before(grammarAccess.getPredicateCallAccess().getPropertyRelationPredicateParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_rulePropertyRelationPredicate_in_rule__PredicateCall__Alternatives_02659);
                    rulePropertyRelationPredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateCallAccess().getPropertyRelationPredicateParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1278:6: ( ruleDefinitionSentencePredicate )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1278:6: ( ruleDefinitionSentencePredicate )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1279:1: ruleDefinitionSentencePredicate
                    {
                     before(grammarAccess.getPredicateCallAccess().getDefinitionSentencePredicateParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleDefinitionSentencePredicate_in_rule__PredicateCall__Alternatives_02676);
                    ruleDefinitionSentencePredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateCallAccess().getDefinitionSentencePredicateParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1284:6: ( rulePredicateReference )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1284:6: ( rulePredicateReference )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1285:1: rulePredicateReference
                    {
                     before(grammarAccess.getPredicateCallAccess().getPredicateReferenceParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_rulePredicateReference_in_rule__PredicateCall__Alternatives_02693);
                    rulePredicateReference();

                    state._fsp--;

                     after(grammarAccess.getPredicateCallAccess().getPredicateReferenceParserRuleCall_0_2()); 

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
    // $ANTLR end "rule__PredicateCall__Alternatives_0"


    // $ANTLR start "rule__Assignment__Alternatives_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1295:1: rule__Assignment__Alternatives_1 : ( ( 'becomes' ) | ( ':=' ) );
    public final void rule__Assignment__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1299:1: ( ( 'becomes' ) | ( ':=' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1300:1: ( 'becomes' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1300:1: ( 'becomes' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1301:1: 'becomes'
                    {
                     before(grammarAccess.getAssignmentAccess().getBecomesKeyword_1_0()); 
                    match(input,18,FOLLOW_18_in_rule__Assignment__Alternatives_12726); 
                     after(grammarAccess.getAssignmentAccess().getBecomesKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1308:6: ( ':=' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1308:6: ( ':=' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1309:1: ':='
                    {
                     before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1_1()); 
                    match(input,19,FOLLOW_19_in_rule__Assignment__Alternatives_12746); 
                     after(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Assignment__Alternatives_1"


    // $ANTLR start "rule__PropertyExpression__Alternatives"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1321:1: rule__PropertyExpression__Alternatives : ( ( rulePropertyValueExpression ) | ( rulePropertyReferenceExpression ) );
    public final void rule__PropertyExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1325:1: ( ( rulePropertyValueExpression ) | ( rulePropertyReferenceExpression ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==56) ) {
                alt13=1;
            }
            else if ( (LA13_0==57) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1326:1: ( rulePropertyValueExpression )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1326:1: ( rulePropertyValueExpression )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1327:1: rulePropertyValueExpression
                    {
                     before(grammarAccess.getPropertyExpressionAccess().getPropertyValueExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePropertyValueExpression_in_rule__PropertyExpression__Alternatives2780);
                    rulePropertyValueExpression();

                    state._fsp--;

                     after(grammarAccess.getPropertyExpressionAccess().getPropertyValueExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1332:6: ( rulePropertyReferenceExpression )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1332:6: ( rulePropertyReferenceExpression )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1333:1: rulePropertyReferenceExpression
                    {
                     before(grammarAccess.getPropertyExpressionAccess().getPropertyReferenceExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePropertyReferenceExpression_in_rule__PropertyExpression__Alternatives2797);
                    rulePropertyReferenceExpression();

                    state._fsp--;

                     after(grammarAccess.getPropertyExpressionAccess().getPropertyReferenceExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__PropertyExpression__Alternatives"


    // $ANTLR start "rule__Quantor__Alternatives"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1343:1: rule__Quantor__Alternatives : ( ( ( 'each' ) ) | ( ( 'any' ) ) );
    public final void rule__Quantor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1347:1: ( ( ( 'each' ) ) | ( ( 'any' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            else if ( (LA14_0==21) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1348:1: ( ( 'each' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1348:1: ( ( 'each' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1349:1: ( 'each' )
                    {
                     before(grammarAccess.getQuantorAccess().getEachEnumLiteralDeclaration_0()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1350:1: ( 'each' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1350:3: 'each'
                    {
                    match(input,20,FOLLOW_20_in_rule__Quantor__Alternatives2830); 

                    }

                     after(grammarAccess.getQuantorAccess().getEachEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1355:6: ( ( 'any' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1355:6: ( ( 'any' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1356:1: ( 'any' )
                    {
                     before(grammarAccess.getQuantorAccess().getAnyEnumLiteralDeclaration_1()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1357:1: ( 'any' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1357:3: 'any'
                    {
                    match(input,21,FOLLOW_21_in_rule__Quantor__Alternatives2851); 

                    }

                     after(grammarAccess.getQuantorAccess().getAnyEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Quantor__Alternatives"


    // $ANTLR start "rule__RelationQualifier__Alternatives"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1367:1: rule__RelationQualifier__Alternatives : ( ( ( 'must have' ) ) | ( ( 'must not have' ) ) | ( ( 'can have' ) ) );
    public final void rule__RelationQualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1371:1: ( ( ( 'must have' ) ) | ( ( 'must not have' ) ) | ( ( 'can have' ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt15=1;
                }
                break;
            case 23:
                {
                alt15=2;
                }
                break;
            case 24:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1372:1: ( ( 'must have' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1372:1: ( ( 'must have' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1373:1: ( 'must have' )
                    {
                     before(grammarAccess.getRelationQualifierAccess().getMustEnumLiteralDeclaration_0()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1374:1: ( 'must have' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1374:3: 'must have'
                    {
                    match(input,22,FOLLOW_22_in_rule__RelationQualifier__Alternatives2887); 

                    }

                     after(grammarAccess.getRelationQualifierAccess().getMustEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1379:6: ( ( 'must not have' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1379:6: ( ( 'must not have' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1380:1: ( 'must not have' )
                    {
                     before(grammarAccess.getRelationQualifierAccess().getMustNotEnumLiteralDeclaration_1()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1381:1: ( 'must not have' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1381:3: 'must not have'
                    {
                    match(input,23,FOLLOW_23_in_rule__RelationQualifier__Alternatives2908); 

                    }

                     after(grammarAccess.getRelationQualifierAccess().getMustNotEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1386:6: ( ( 'can have' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1386:6: ( ( 'can have' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1387:1: ( 'can have' )
                    {
                     before(grammarAccess.getRelationQualifierAccess().getCanEnumLiteralDeclaration_2()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1388:1: ( 'can have' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1388:3: 'can have'
                    {
                    match(input,24,FOLLOW_24_in_rule__RelationQualifier__Alternatives2929); 

                    }

                     after(grammarAccess.getRelationQualifierAccess().getCanEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__RelationQualifier__Alternatives"


    // $ANTLR start "rule__Axis__Alternatives"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1398:1: rule__Axis__Alternatives : ( ( ( 'parent' ) ) | ( ( 'child' ) ) | ( ( 'ancestor' ) ) | ( ( 'descendant' ) ) | ( ( 'multiple parents' ) ) | ( ( 'multiple children' ) ) | ( ( 'multiple ancestors' ) ) | ( ( 'multiple descendants' ) ) );
    public final void rule__Axis__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1402:1: ( ( ( 'parent' ) ) | ( ( 'child' ) ) | ( ( 'ancestor' ) ) | ( ( 'descendant' ) ) | ( ( 'multiple parents' ) ) | ( ( 'multiple children' ) ) | ( ( 'multiple ancestors' ) ) | ( ( 'multiple descendants' ) ) )
            int alt16=8;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt16=1;
                }
                break;
            case 26:
                {
                alt16=2;
                }
                break;
            case 27:
                {
                alt16=3;
                }
                break;
            case 28:
                {
                alt16=4;
                }
                break;
            case 29:
                {
                alt16=5;
                }
                break;
            case 30:
                {
                alt16=6;
                }
                break;
            case 31:
                {
                alt16=7;
                }
                break;
            case 32:
                {
                alt16=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1403:1: ( ( 'parent' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1403:1: ( ( 'parent' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1404:1: ( 'parent' )
                    {
                     before(grammarAccess.getAxisAccess().getParentEnumLiteralDeclaration_0()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1405:1: ( 'parent' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1405:3: 'parent'
                    {
                    match(input,25,FOLLOW_25_in_rule__Axis__Alternatives2965); 

                    }

                     after(grammarAccess.getAxisAccess().getParentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1410:6: ( ( 'child' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1410:6: ( ( 'child' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1411:1: ( 'child' )
                    {
                     before(grammarAccess.getAxisAccess().getChildEnumLiteralDeclaration_1()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1412:1: ( 'child' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1412:3: 'child'
                    {
                    match(input,26,FOLLOW_26_in_rule__Axis__Alternatives2986); 

                    }

                     after(grammarAccess.getAxisAccess().getChildEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1417:6: ( ( 'ancestor' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1417:6: ( ( 'ancestor' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1418:1: ( 'ancestor' )
                    {
                     before(grammarAccess.getAxisAccess().getAncestorEnumLiteralDeclaration_2()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1419:1: ( 'ancestor' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1419:3: 'ancestor'
                    {
                    match(input,27,FOLLOW_27_in_rule__Axis__Alternatives3007); 

                    }

                     after(grammarAccess.getAxisAccess().getAncestorEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1424:6: ( ( 'descendant' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1424:6: ( ( 'descendant' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1425:1: ( 'descendant' )
                    {
                     before(grammarAccess.getAxisAccess().getDescendantEnumLiteralDeclaration_3()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1426:1: ( 'descendant' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1426:3: 'descendant'
                    {
                    match(input,28,FOLLOW_28_in_rule__Axis__Alternatives3028); 

                    }

                     after(grammarAccess.getAxisAccess().getDescendantEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1431:6: ( ( 'multiple parents' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1431:6: ( ( 'multiple parents' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1432:1: ( 'multiple parents' )
                    {
                     before(grammarAccess.getAxisAccess().getParentsEnumLiteralDeclaration_4()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1433:1: ( 'multiple parents' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1433:3: 'multiple parents'
                    {
                    match(input,29,FOLLOW_29_in_rule__Axis__Alternatives3049); 

                    }

                     after(grammarAccess.getAxisAccess().getParentsEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1438:6: ( ( 'multiple children' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1438:6: ( ( 'multiple children' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1439:1: ( 'multiple children' )
                    {
                     before(grammarAccess.getAxisAccess().getChildrenEnumLiteralDeclaration_5()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1440:1: ( 'multiple children' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1440:3: 'multiple children'
                    {
                    match(input,30,FOLLOW_30_in_rule__Axis__Alternatives3070); 

                    }

                     after(grammarAccess.getAxisAccess().getChildrenEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1445:6: ( ( 'multiple ancestors' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1445:6: ( ( 'multiple ancestors' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1446:1: ( 'multiple ancestors' )
                    {
                     before(grammarAccess.getAxisAccess().getAncestorsEnumLiteralDeclaration_6()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1447:1: ( 'multiple ancestors' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1447:3: 'multiple ancestors'
                    {
                    match(input,31,FOLLOW_31_in_rule__Axis__Alternatives3091); 

                    }

                     after(grammarAccess.getAxisAccess().getAncestorsEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1452:6: ( ( 'multiple descendants' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1452:6: ( ( 'multiple descendants' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1453:1: ( 'multiple descendants' )
                    {
                     before(grammarAccess.getAxisAccess().getDescendantsEnumLiteralDeclaration_7()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1454:1: ( 'multiple descendants' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1454:3: 'multiple descendants'
                    {
                    match(input,32,FOLLOW_32_in_rule__Axis__Alternatives3112); 

                    }

                     after(grammarAccess.getAxisAccess().getDescendantsEnumLiteralDeclaration_7()); 

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
    // $ANTLR end "rule__Axis__Alternatives"


    // $ANTLR start "rule__PropertyRelation__Alternatives"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1464:1: rule__PropertyRelation__Alternatives : ( ( ( 'equals' ) ) | ( ( 'not equals' ) ) | ( ( 'greater than' ) ) | ( ( 'lesser than' ) ) | ( ( 'greater or equals than' ) ) | ( ( 'lesser or equals than' ) ) );
    public final void rule__PropertyRelation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1468:1: ( ( ( 'equals' ) ) | ( ( 'not equals' ) ) | ( ( 'greater than' ) ) | ( ( 'lesser than' ) ) | ( ( 'greater or equals than' ) ) | ( ( 'lesser or equals than' ) ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt17=1;
                }
                break;
            case 34:
                {
                alt17=2;
                }
                break;
            case 35:
                {
                alt17=3;
                }
                break;
            case 36:
                {
                alt17=4;
                }
                break;
            case 37:
                {
                alt17=5;
                }
                break;
            case 38:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1469:1: ( ( 'equals' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1469:1: ( ( 'equals' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1470:1: ( 'equals' )
                    {
                     before(grammarAccess.getPropertyRelationAccess().getEqualsEnumLiteralDeclaration_0()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1471:1: ( 'equals' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1471:3: 'equals'
                    {
                    match(input,33,FOLLOW_33_in_rule__PropertyRelation__Alternatives3148); 

                    }

                     after(grammarAccess.getPropertyRelationAccess().getEqualsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1476:6: ( ( 'not equals' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1476:6: ( ( 'not equals' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1477:1: ( 'not equals' )
                    {
                     before(grammarAccess.getPropertyRelationAccess().getNotEqualsEnumLiteralDeclaration_1()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1478:1: ( 'not equals' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1478:3: 'not equals'
                    {
                    match(input,34,FOLLOW_34_in_rule__PropertyRelation__Alternatives3169); 

                    }

                     after(grammarAccess.getPropertyRelationAccess().getNotEqualsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1483:6: ( ( 'greater than' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1483:6: ( ( 'greater than' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1484:1: ( 'greater than' )
                    {
                     before(grammarAccess.getPropertyRelationAccess().getGreaterEnumLiteralDeclaration_2()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1485:1: ( 'greater than' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1485:3: 'greater than'
                    {
                    match(input,35,FOLLOW_35_in_rule__PropertyRelation__Alternatives3190); 

                    }

                     after(grammarAccess.getPropertyRelationAccess().getGreaterEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1490:6: ( ( 'lesser than' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1490:6: ( ( 'lesser than' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1491:1: ( 'lesser than' )
                    {
                     before(grammarAccess.getPropertyRelationAccess().getLesserEnumLiteralDeclaration_3()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1492:1: ( 'lesser than' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1492:3: 'lesser than'
                    {
                    match(input,36,FOLLOW_36_in_rule__PropertyRelation__Alternatives3211); 

                    }

                     after(grammarAccess.getPropertyRelationAccess().getLesserEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1497:6: ( ( 'greater or equals than' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1497:6: ( ( 'greater or equals than' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1498:1: ( 'greater or equals than' )
                    {
                     before(grammarAccess.getPropertyRelationAccess().getGreaterEqualsEnumLiteralDeclaration_4()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1499:1: ( 'greater or equals than' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1499:3: 'greater or equals than'
                    {
                    match(input,37,FOLLOW_37_in_rule__PropertyRelation__Alternatives3232); 

                    }

                     after(grammarAccess.getPropertyRelationAccess().getGreaterEqualsEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1504:6: ( ( 'lesser or equals than' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1504:6: ( ( 'lesser or equals than' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1505:1: ( 'lesser or equals than' )
                    {
                     before(grammarAccess.getPropertyRelationAccess().getLesserEqualsEnumLiteralDeclaration_5()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1506:1: ( 'lesser or equals than' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1506:3: 'lesser or equals than'
                    {
                    match(input,38,FOLLOW_38_in_rule__PropertyRelation__Alternatives3253); 

                    }

                     after(grammarAccess.getPropertyRelationAccess().getLesserEqualsEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__PropertyRelation__Alternatives"


    // $ANTLR start "rule__StartOnSentence__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1518:1: rule__StartOnSentence__Group__0 : rule__StartOnSentence__Group__0__Impl rule__StartOnSentence__Group__1 ;
    public final void rule__StartOnSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1522:1: ( rule__StartOnSentence__Group__0__Impl rule__StartOnSentence__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1523:2: rule__StartOnSentence__Group__0__Impl rule__StartOnSentence__Group__1
            {
            pushFollow(FOLLOW_rule__StartOnSentence__Group__0__Impl_in_rule__StartOnSentence__Group__03286);
            rule__StartOnSentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartOnSentence__Group__1_in_rule__StartOnSentence__Group__03289);
            rule__StartOnSentence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartOnSentence__Group__0"


    // $ANTLR start "rule__StartOnSentence__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1530:1: rule__StartOnSentence__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartOnSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1534:1: ( ( 'start' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1535:1: ( 'start' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1535:1: ( 'start' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1536:1: 'start'
            {
             before(grammarAccess.getStartOnSentenceAccess().getStartKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__StartOnSentence__Group__0__Impl3317); 
             after(grammarAccess.getStartOnSentenceAccess().getStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartOnSentence__Group__0__Impl"


    // $ANTLR start "rule__StartOnSentence__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1549:1: rule__StartOnSentence__Group__1 : rule__StartOnSentence__Group__1__Impl rule__StartOnSentence__Group__2 ;
    public final void rule__StartOnSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1553:1: ( rule__StartOnSentence__Group__1__Impl rule__StartOnSentence__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1554:2: rule__StartOnSentence__Group__1__Impl rule__StartOnSentence__Group__2
            {
            pushFollow(FOLLOW_rule__StartOnSentence__Group__1__Impl_in_rule__StartOnSentence__Group__13348);
            rule__StartOnSentence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartOnSentence__Group__2_in_rule__StartOnSentence__Group__13351);
            rule__StartOnSentence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartOnSentence__Group__1"


    // $ANTLR start "rule__StartOnSentence__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1561:1: rule__StartOnSentence__Group__1__Impl : ( 'on' ) ;
    public final void rule__StartOnSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1565:1: ( ( 'on' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1566:1: ( 'on' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1566:1: ( 'on' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1567:1: 'on'
            {
             before(grammarAccess.getStartOnSentenceAccess().getOnKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__StartOnSentence__Group__1__Impl3379); 
             after(grammarAccess.getStartOnSentenceAccess().getOnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartOnSentence__Group__1__Impl"


    // $ANTLR start "rule__StartOnSentence__Group__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1580:1: rule__StartOnSentence__Group__2 : rule__StartOnSentence__Group__2__Impl ;
    public final void rule__StartOnSentence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1584:1: ( rule__StartOnSentence__Group__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1585:2: rule__StartOnSentence__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StartOnSentence__Group__2__Impl_in_rule__StartOnSentence__Group__23410);
            rule__StartOnSentence__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartOnSentence__Group__2"


    // $ANTLR start "rule__StartOnSentence__Group__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1591:1: rule__StartOnSentence__Group__2__Impl : ( ( rule__StartOnSentence__DefinitionAssignment_2 ) ) ;
    public final void rule__StartOnSentence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1595:1: ( ( ( rule__StartOnSentence__DefinitionAssignment_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1596:1: ( ( rule__StartOnSentence__DefinitionAssignment_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1596:1: ( ( rule__StartOnSentence__DefinitionAssignment_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1597:1: ( rule__StartOnSentence__DefinitionAssignment_2 )
            {
             before(grammarAccess.getStartOnSentenceAccess().getDefinitionAssignment_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1598:1: ( rule__StartOnSentence__DefinitionAssignment_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1598:2: rule__StartOnSentence__DefinitionAssignment_2
            {
            pushFollow(FOLLOW_rule__StartOnSentence__DefinitionAssignment_2_in_rule__StartOnSentence__Group__2__Impl3437);
            rule__StartOnSentence__DefinitionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStartOnSentenceAccess().getDefinitionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartOnSentence__Group__2__Impl"


    // $ANTLR start "rule__DefinitionSentence__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1614:1: rule__DefinitionSentence__Group__0 : rule__DefinitionSentence__Group__0__Impl rule__DefinitionSentence__Group__1 ;
    public final void rule__DefinitionSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1618:1: ( rule__DefinitionSentence__Group__0__Impl rule__DefinitionSentence__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1619:2: rule__DefinitionSentence__Group__0__Impl rule__DefinitionSentence__Group__1
            {
            pushFollow(FOLLOW_rule__DefinitionSentence__Group__0__Impl_in_rule__DefinitionSentence__Group__03473);
            rule__DefinitionSentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefinitionSentence__Group__1_in_rule__DefinitionSentence__Group__03476);
            rule__DefinitionSentence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionSentence__Group__0"


    // $ANTLR start "rule__DefinitionSentence__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1626:1: rule__DefinitionSentence__Group__0__Impl : ( ( rule__DefinitionSentence__Alternatives_0 ) ) ;
    public final void rule__DefinitionSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1630:1: ( ( ( rule__DefinitionSentence__Alternatives_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1631:1: ( ( rule__DefinitionSentence__Alternatives_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1631:1: ( ( rule__DefinitionSentence__Alternatives_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1632:1: ( rule__DefinitionSentence__Alternatives_0 )
            {
             before(grammarAccess.getDefinitionSentenceAccess().getAlternatives_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1633:1: ( rule__DefinitionSentence__Alternatives_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1633:2: rule__DefinitionSentence__Alternatives_0
            {
            pushFollow(FOLLOW_rule__DefinitionSentence__Alternatives_0_in_rule__DefinitionSentence__Group__0__Impl3503);
            rule__DefinitionSentence__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionSentenceAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionSentence__Group__0__Impl"


    // $ANTLR start "rule__DefinitionSentence__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1643:1: rule__DefinitionSentence__Group__1 : rule__DefinitionSentence__Group__1__Impl rule__DefinitionSentence__Group__2 ;
    public final void rule__DefinitionSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1647:1: ( rule__DefinitionSentence__Group__1__Impl rule__DefinitionSentence__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1648:2: rule__DefinitionSentence__Group__1__Impl rule__DefinitionSentence__Group__2
            {
            pushFollow(FOLLOW_rule__DefinitionSentence__Group__1__Impl_in_rule__DefinitionSentence__Group__13533);
            rule__DefinitionSentence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefinitionSentence__Group__2_in_rule__DefinitionSentence__Group__13536);
            rule__DefinitionSentence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionSentence__Group__1"


    // $ANTLR start "rule__DefinitionSentence__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1655:1: rule__DefinitionSentence__Group__1__Impl : ( ( rule__DefinitionSentence__QualifierAssignment_1 ) ) ;
    public final void rule__DefinitionSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1659:1: ( ( ( rule__DefinitionSentence__QualifierAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1660:1: ( ( rule__DefinitionSentence__QualifierAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1660:1: ( ( rule__DefinitionSentence__QualifierAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1661:1: ( rule__DefinitionSentence__QualifierAssignment_1 )
            {
             before(grammarAccess.getDefinitionSentenceAccess().getQualifierAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1662:1: ( rule__DefinitionSentence__QualifierAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1662:2: rule__DefinitionSentence__QualifierAssignment_1
            {
            pushFollow(FOLLOW_rule__DefinitionSentence__QualifierAssignment_1_in_rule__DefinitionSentence__Group__1__Impl3563);
            rule__DefinitionSentence__QualifierAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionSentenceAccess().getQualifierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionSentence__Group__1__Impl"


    // $ANTLR start "rule__DefinitionSentence__Group__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1672:1: rule__DefinitionSentence__Group__2 : rule__DefinitionSentence__Group__2__Impl ;
    public final void rule__DefinitionSentence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1676:1: ( rule__DefinitionSentence__Group__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1677:2: rule__DefinitionSentence__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefinitionSentence__Group__2__Impl_in_rule__DefinitionSentence__Group__23593);
            rule__DefinitionSentence__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionSentence__Group__2"


    // $ANTLR start "rule__DefinitionSentence__Group__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1683:1: rule__DefinitionSentence__Group__2__Impl : ( ( rule__DefinitionSentence__TargetAssignment_2 ) ) ;
    public final void rule__DefinitionSentence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1687:1: ( ( ( rule__DefinitionSentence__TargetAssignment_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1688:1: ( ( rule__DefinitionSentence__TargetAssignment_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1688:1: ( ( rule__DefinitionSentence__TargetAssignment_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1689:1: ( rule__DefinitionSentence__TargetAssignment_2 )
            {
             before(grammarAccess.getDefinitionSentenceAccess().getTargetAssignment_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1690:1: ( rule__DefinitionSentence__TargetAssignment_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1690:2: rule__DefinitionSentence__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__DefinitionSentence__TargetAssignment_2_in_rule__DefinitionSentence__Group__2__Impl3620);
            rule__DefinitionSentence__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionSentenceAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionSentence__Group__2__Impl"


    // $ANTLR start "rule__ConstraintSentence__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1706:1: rule__ConstraintSentence__Group__0 : rule__ConstraintSentence__Group__0__Impl rule__ConstraintSentence__Group__1 ;
    public final void rule__ConstraintSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1710:1: ( rule__ConstraintSentence__Group__0__Impl rule__ConstraintSentence__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1711:2: rule__ConstraintSentence__Group__0__Impl rule__ConstraintSentence__Group__1
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Group__0__Impl_in_rule__ConstraintSentence__Group__03656);
            rule__ConstraintSentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintSentence__Group__1_in_rule__ConstraintSentence__Group__03659);
            rule__ConstraintSentence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__Group__0"


    // $ANTLR start "rule__ConstraintSentence__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1718:1: rule__ConstraintSentence__Group__0__Impl : ( 'for' ) ;
    public final void rule__ConstraintSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1722:1: ( ( 'for' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1723:1: ( 'for' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1723:1: ( 'for' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1724:1: 'for'
            {
             before(grammarAccess.getConstraintSentenceAccess().getForKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__ConstraintSentence__Group__0__Impl3687); 
             after(grammarAccess.getConstraintSentenceAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__Group__0__Impl"


    // $ANTLR start "rule__ConstraintSentence__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1737:1: rule__ConstraintSentence__Group__1 : rule__ConstraintSentence__Group__1__Impl rule__ConstraintSentence__Group__2 ;
    public final void rule__ConstraintSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1741:1: ( rule__ConstraintSentence__Group__1__Impl rule__ConstraintSentence__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1742:2: rule__ConstraintSentence__Group__1__Impl rule__ConstraintSentence__Group__2
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Group__1__Impl_in_rule__ConstraintSentence__Group__13718);
            rule__ConstraintSentence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintSentence__Group__2_in_rule__ConstraintSentence__Group__13721);
            rule__ConstraintSentence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__Group__1"


    // $ANTLR start "rule__ConstraintSentence__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1749:1: rule__ConstraintSentence__Group__1__Impl : ( ( rule__ConstraintSentence__QuantificationsAssignment_1 )? ) ;
    public final void rule__ConstraintSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1753:1: ( ( ( rule__ConstraintSentence__QuantificationsAssignment_1 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1754:1: ( ( rule__ConstraintSentence__QuantificationsAssignment_1 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1754:1: ( ( rule__ConstraintSentence__QuantificationsAssignment_1 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1755:1: ( rule__ConstraintSentence__QuantificationsAssignment_1 )?
            {
             before(grammarAccess.getConstraintSentenceAccess().getQuantificationsAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1756:1: ( rule__ConstraintSentence__QuantificationsAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=20 && LA18_0<=21)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1756:2: rule__ConstraintSentence__QuantificationsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ConstraintSentence__QuantificationsAssignment_1_in_rule__ConstraintSentence__Group__1__Impl3748);
                    rule__ConstraintSentence__QuantificationsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintSentenceAccess().getQuantificationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__Group__1__Impl"


    // $ANTLR start "rule__ConstraintSentence__Group__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1766:1: rule__ConstraintSentence__Group__2 : rule__ConstraintSentence__Group__2__Impl rule__ConstraintSentence__Group__3 ;
    public final void rule__ConstraintSentence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1770:1: ( rule__ConstraintSentence__Group__2__Impl rule__ConstraintSentence__Group__3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1771:2: rule__ConstraintSentence__Group__2__Impl rule__ConstraintSentence__Group__3
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Group__2__Impl_in_rule__ConstraintSentence__Group__23779);
            rule__ConstraintSentence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintSentence__Group__3_in_rule__ConstraintSentence__Group__23782);
            rule__ConstraintSentence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__Group__2"


    // $ANTLR start "rule__ConstraintSentence__Group__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1778:1: rule__ConstraintSentence__Group__2__Impl : ( ( rule__ConstraintSentence__NodesAssignment_2 )? ) ;
    public final void rule__ConstraintSentence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1782:1: ( ( ( rule__ConstraintSentence__NodesAssignment_2 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1783:1: ( ( rule__ConstraintSentence__NodesAssignment_2 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1783:1: ( ( rule__ConstraintSentence__NodesAssignment_2 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1784:1: ( rule__ConstraintSentence__NodesAssignment_2 )?
            {
             before(grammarAccess.getConstraintSentenceAccess().getNodesAssignment_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1785:1: ( rule__ConstraintSentence__NodesAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1785:2: rule__ConstraintSentence__NodesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ConstraintSentence__NodesAssignment_2_in_rule__ConstraintSentence__Group__2__Impl3809);
                    rule__ConstraintSentence__NodesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintSentenceAccess().getNodesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__Group__2__Impl"


    // $ANTLR start "rule__ConstraintSentence__Group__3"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1795:1: rule__ConstraintSentence__Group__3 : rule__ConstraintSentence__Group__3__Impl rule__ConstraintSentence__Group__4 ;
    public final void rule__ConstraintSentence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1799:1: ( rule__ConstraintSentence__Group__3__Impl rule__ConstraintSentence__Group__4 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1800:2: rule__ConstraintSentence__Group__3__Impl rule__ConstraintSentence__Group__4
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Group__3__Impl_in_rule__ConstraintSentence__Group__33840);
            rule__ConstraintSentence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintSentence__Group__4_in_rule__ConstraintSentence__Group__33843);
            rule__ConstraintSentence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__Group__3"


    // $ANTLR start "rule__ConstraintSentence__Group__3__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1807:1: rule__ConstraintSentence__Group__3__Impl : ( ( rule__ConstraintSentence__Alternatives_3 ) ) ;
    public final void rule__ConstraintSentence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1811:1: ( ( ( rule__ConstraintSentence__Alternatives_3 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1812:1: ( ( rule__ConstraintSentence__Alternatives_3 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1812:1: ( ( rule__ConstraintSentence__Alternatives_3 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1813:1: ( rule__ConstraintSentence__Alternatives_3 )
            {
             before(grammarAccess.getConstraintSentenceAccess().getAlternatives_3()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1814:1: ( rule__ConstraintSentence__Alternatives_3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1814:2: rule__ConstraintSentence__Alternatives_3
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Alternatives_3_in_rule__ConstraintSentence__Group__3__Impl3870);
            rule__ConstraintSentence__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintSentenceAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__Group__3__Impl"


    // $ANTLR start "rule__ConstraintSentence__Group__4"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1824:1: rule__ConstraintSentence__Group__4 : rule__ConstraintSentence__Group__4__Impl ;
    public final void rule__ConstraintSentence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1828:1: ( rule__ConstraintSentence__Group__4__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1829:2: rule__ConstraintSentence__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Group__4__Impl_in_rule__ConstraintSentence__Group__43900);
            rule__ConstraintSentence__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__Group__4"


    // $ANTLR start "rule__ConstraintSentence__Group__4__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1835:1: rule__ConstraintSentence__Group__4__Impl : ( ( rule__ConstraintSentence__PredicateAssignment_4 ) ) ;
    public final void rule__ConstraintSentence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1839:1: ( ( ( rule__ConstraintSentence__PredicateAssignment_4 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1840:1: ( ( rule__ConstraintSentence__PredicateAssignment_4 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1840:1: ( ( rule__ConstraintSentence__PredicateAssignment_4 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1841:1: ( rule__ConstraintSentence__PredicateAssignment_4 )
            {
             before(grammarAccess.getConstraintSentenceAccess().getPredicateAssignment_4()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1842:1: ( rule__ConstraintSentence__PredicateAssignment_4 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1842:2: rule__ConstraintSentence__PredicateAssignment_4
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__PredicateAssignment_4_in_rule__ConstraintSentence__Group__4__Impl3927);
            rule__ConstraintSentence__PredicateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConstraintSentenceAccess().getPredicateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__Group__4__Impl"


    // $ANTLR start "rule__ConstraintSentence__Group_3_0__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1862:1: rule__ConstraintSentence__Group_3_0__0 : rule__ConstraintSentence__Group_3_0__0__Impl rule__ConstraintSentence__Group_3_0__1 ;
    public final void rule__ConstraintSentence__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1866:1: ( rule__ConstraintSentence__Group_3_0__0__Impl rule__ConstraintSentence__Group_3_0__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1867:2: rule__ConstraintSentence__Group_3_0__0__Impl rule__ConstraintSentence__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Group_3_0__0__Impl_in_rule__ConstraintSentence__Group_3_0__03967);
            rule__ConstraintSentence__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintSentence__Group_3_0__1_in_rule__ConstraintSentence__Group_3_0__03970);
            rule__ConstraintSentence__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__Group_3_0__0"


    // $ANTLR start "rule__ConstraintSentence__Group_3_0__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1874:1: rule__ConstraintSentence__Group_3_0__0__Impl : ( 'holds' ) ;
    public final void rule__ConstraintSentence__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1878:1: ( ( 'holds' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1879:1: ( 'holds' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1879:1: ( 'holds' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1880:1: 'holds'
            {
             before(grammarAccess.getConstraintSentenceAccess().getHoldsKeyword_3_0_0()); 
            match(input,42,FOLLOW_42_in_rule__ConstraintSentence__Group_3_0__0__Impl3998); 
             after(grammarAccess.getConstraintSentenceAccess().getHoldsKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__Group_3_0__0__Impl"


    // $ANTLR start "rule__ConstraintSentence__Group_3_0__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1893:1: rule__ConstraintSentence__Group_3_0__1 : rule__ConstraintSentence__Group_3_0__1__Impl ;
    public final void rule__ConstraintSentence__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1897:1: ( rule__ConstraintSentence__Group_3_0__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1898:2: rule__ConstraintSentence__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Group_3_0__1__Impl_in_rule__ConstraintSentence__Group_3_0__14029);
            rule__ConstraintSentence__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__Group_3_0__1"


    // $ANTLR start "rule__ConstraintSentence__Group_3_0__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1904:1: rule__ConstraintSentence__Group_3_0__1__Impl : ( 'that' ) ;
    public final void rule__ConstraintSentence__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1908:1: ( ( 'that' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1909:1: ( 'that' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1909:1: ( 'that' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1910:1: 'that'
            {
             before(grammarAccess.getConstraintSentenceAccess().getThatKeyword_3_0_1()); 
            match(input,43,FOLLOW_43_in_rule__ConstraintSentence__Group_3_0__1__Impl4057); 
             after(grammarAccess.getConstraintSentenceAccess().getThatKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__Group_3_0__1__Impl"


    // $ANTLR start "rule__PredicateDefinitionSentence__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1927:1: rule__PredicateDefinitionSentence__Group__0 : rule__PredicateDefinitionSentence__Group__0__Impl rule__PredicateDefinitionSentence__Group__1 ;
    public final void rule__PredicateDefinitionSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1931:1: ( rule__PredicateDefinitionSentence__Group__0__Impl rule__PredicateDefinitionSentence__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1932:2: rule__PredicateDefinitionSentence__Group__0__Impl rule__PredicateDefinitionSentence__Group__1
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__0__Impl_in_rule__PredicateDefinitionSentence__Group__04092);
            rule__PredicateDefinitionSentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__1_in_rule__PredicateDefinitionSentence__Group__04095);
            rule__PredicateDefinitionSentence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinitionSentence__Group__0"


    // $ANTLR start "rule__PredicateDefinitionSentence__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1939:1: rule__PredicateDefinitionSentence__Group__0__Impl : ( 'define' ) ;
    public final void rule__PredicateDefinitionSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1943:1: ( ( 'define' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1944:1: ( 'define' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1944:1: ( 'define' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1945:1: 'define'
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getDefineKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__PredicateDefinitionSentence__Group__0__Impl4123); 
             after(grammarAccess.getPredicateDefinitionSentenceAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinitionSentence__Group__0__Impl"


    // $ANTLR start "rule__PredicateDefinitionSentence__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1958:1: rule__PredicateDefinitionSentence__Group__1 : rule__PredicateDefinitionSentence__Group__1__Impl rule__PredicateDefinitionSentence__Group__2 ;
    public final void rule__PredicateDefinitionSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1962:1: ( rule__PredicateDefinitionSentence__Group__1__Impl rule__PredicateDefinitionSentence__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1963:2: rule__PredicateDefinitionSentence__Group__1__Impl rule__PredicateDefinitionSentence__Group__2
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__1__Impl_in_rule__PredicateDefinitionSentence__Group__14154);
            rule__PredicateDefinitionSentence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__2_in_rule__PredicateDefinitionSentence__Group__14157);
            rule__PredicateDefinitionSentence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinitionSentence__Group__1"


    // $ANTLR start "rule__PredicateDefinitionSentence__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1970:1: rule__PredicateDefinitionSentence__Group__1__Impl : ( ( rule__PredicateDefinitionSentence__NameAssignment_1 ) ) ;
    public final void rule__PredicateDefinitionSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1974:1: ( ( ( rule__PredicateDefinitionSentence__NameAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1975:1: ( ( rule__PredicateDefinitionSentence__NameAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1975:1: ( ( rule__PredicateDefinitionSentence__NameAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1976:1: ( rule__PredicateDefinitionSentence__NameAssignment_1 )
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getNameAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1977:1: ( rule__PredicateDefinitionSentence__NameAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1977:2: rule__PredicateDefinitionSentence__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__NameAssignment_1_in_rule__PredicateDefinitionSentence__Group__1__Impl4184);
            rule__PredicateDefinitionSentence__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateDefinitionSentenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinitionSentence__Group__1__Impl"


    // $ANTLR start "rule__PredicateDefinitionSentence__Group__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1987:1: rule__PredicateDefinitionSentence__Group__2 : rule__PredicateDefinitionSentence__Group__2__Impl rule__PredicateDefinitionSentence__Group__3 ;
    public final void rule__PredicateDefinitionSentence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1991:1: ( rule__PredicateDefinitionSentence__Group__2__Impl rule__PredicateDefinitionSentence__Group__3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1992:2: rule__PredicateDefinitionSentence__Group__2__Impl rule__PredicateDefinitionSentence__Group__3
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__2__Impl_in_rule__PredicateDefinitionSentence__Group__24214);
            rule__PredicateDefinitionSentence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__3_in_rule__PredicateDefinitionSentence__Group__24217);
            rule__PredicateDefinitionSentence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinitionSentence__Group__2"


    // $ANTLR start "rule__PredicateDefinitionSentence__Group__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1999:1: rule__PredicateDefinitionSentence__Group__2__Impl : ( ( rule__PredicateDefinitionSentence__ParametersAssignment_2 )? ) ;
    public final void rule__PredicateDefinitionSentence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2003:1: ( ( ( rule__PredicateDefinitionSentence__ParametersAssignment_2 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2004:1: ( ( rule__PredicateDefinitionSentence__ParametersAssignment_2 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2004:1: ( ( rule__PredicateDefinitionSentence__ParametersAssignment_2 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2005:1: ( rule__PredicateDefinitionSentence__ParametersAssignment_2 )?
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getParametersAssignment_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2006:1: ( rule__PredicateDefinitionSentence__ParametersAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2006:2: rule__PredicateDefinitionSentence__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_rule__PredicateDefinitionSentence__ParametersAssignment_2_in_rule__PredicateDefinitionSentence__Group__2__Impl4244);
                    rule__PredicateDefinitionSentence__ParametersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredicateDefinitionSentenceAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinitionSentence__Group__2__Impl"


    // $ANTLR start "rule__PredicateDefinitionSentence__Group__3"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2016:1: rule__PredicateDefinitionSentence__Group__3 : rule__PredicateDefinitionSentence__Group__3__Impl rule__PredicateDefinitionSentence__Group__4 ;
    public final void rule__PredicateDefinitionSentence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2020:1: ( rule__PredicateDefinitionSentence__Group__3__Impl rule__PredicateDefinitionSentence__Group__4 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2021:2: rule__PredicateDefinitionSentence__Group__3__Impl rule__PredicateDefinitionSentence__Group__4
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__3__Impl_in_rule__PredicateDefinitionSentence__Group__34275);
            rule__PredicateDefinitionSentence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__4_in_rule__PredicateDefinitionSentence__Group__34278);
            rule__PredicateDefinitionSentence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinitionSentence__Group__3"


    // $ANTLR start "rule__PredicateDefinitionSentence__Group__3__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2028:1: rule__PredicateDefinitionSentence__Group__3__Impl : ( ( rule__PredicateDefinitionSentence__Alternatives_3 ) ) ;
    public final void rule__PredicateDefinitionSentence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2032:1: ( ( ( rule__PredicateDefinitionSentence__Alternatives_3 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2033:1: ( ( rule__PredicateDefinitionSentence__Alternatives_3 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2033:1: ( ( rule__PredicateDefinitionSentence__Alternatives_3 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2034:1: ( rule__PredicateDefinitionSentence__Alternatives_3 )
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getAlternatives_3()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2035:1: ( rule__PredicateDefinitionSentence__Alternatives_3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2035:2: rule__PredicateDefinitionSentence__Alternatives_3
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Alternatives_3_in_rule__PredicateDefinitionSentence__Group__3__Impl4305);
            rule__PredicateDefinitionSentence__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getPredicateDefinitionSentenceAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinitionSentence__Group__3__Impl"


    // $ANTLR start "rule__PredicateDefinitionSentence__Group__4"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2045:1: rule__PredicateDefinitionSentence__Group__4 : rule__PredicateDefinitionSentence__Group__4__Impl ;
    public final void rule__PredicateDefinitionSentence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2049:1: ( rule__PredicateDefinitionSentence__Group__4__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2050:2: rule__PredicateDefinitionSentence__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__4__Impl_in_rule__PredicateDefinitionSentence__Group__44335);
            rule__PredicateDefinitionSentence__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinitionSentence__Group__4"


    // $ANTLR start "rule__PredicateDefinitionSentence__Group__4__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2056:1: rule__PredicateDefinitionSentence__Group__4__Impl : ( ( rule__PredicateDefinitionSentence__PredicateAssignment_4 ) ) ;
    public final void rule__PredicateDefinitionSentence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2060:1: ( ( ( rule__PredicateDefinitionSentence__PredicateAssignment_4 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2061:1: ( ( rule__PredicateDefinitionSentence__PredicateAssignment_4 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2061:1: ( ( rule__PredicateDefinitionSentence__PredicateAssignment_4 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2062:1: ( rule__PredicateDefinitionSentence__PredicateAssignment_4 )
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getPredicateAssignment_4()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2063:1: ( rule__PredicateDefinitionSentence__PredicateAssignment_4 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2063:2: rule__PredicateDefinitionSentence__PredicateAssignment_4
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__PredicateAssignment_4_in_rule__PredicateDefinitionSentence__Group__4__Impl4362);
            rule__PredicateDefinitionSentence__PredicateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPredicateDefinitionSentenceAccess().getPredicateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinitionSentence__Group__4__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2083:1: rule__NodeDefinition__Group__0 : rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1 ;
    public final void rule__NodeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2087:1: ( rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2088:2: rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__0__Impl_in_rule__NodeDefinition__Group__04402);
            rule__NodeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__1_in_rule__NodeDefinition__Group__04405);
            rule__NodeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__0"


    // $ANTLR start "rule__NodeDefinition__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2095:1: rule__NodeDefinition__Group__0__Impl : ( ( rule__NodeDefinition__NameAssignment_0 ) ) ;
    public final void rule__NodeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2099:1: ( ( ( rule__NodeDefinition__NameAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2100:1: ( ( rule__NodeDefinition__NameAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2100:1: ( ( rule__NodeDefinition__NameAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2101:1: ( rule__NodeDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2102:1: ( rule__NodeDefinition__NameAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2102:2: rule__NodeDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__NodeDefinition__NameAssignment_0_in_rule__NodeDefinition__Group__0__Impl4432);
            rule__NodeDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__0__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2112:1: rule__NodeDefinition__Group__1 : rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2 ;
    public final void rule__NodeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2116:1: ( rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2117:2: rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__1__Impl_in_rule__NodeDefinition__Group__14462);
            rule__NodeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__2_in_rule__NodeDefinition__Group__14465);
            rule__NodeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__1"


    // $ANTLR start "rule__NodeDefinition__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2124:1: rule__NodeDefinition__Group__1__Impl : ( ( rule__NodeDefinition__CollectionAssignment_1 )? ) ;
    public final void rule__NodeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2128:1: ( ( ( rule__NodeDefinition__CollectionAssignment_1 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2129:1: ( ( rule__NodeDefinition__CollectionAssignment_1 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2129:1: ( ( rule__NodeDefinition__CollectionAssignment_1 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2130:1: ( rule__NodeDefinition__CollectionAssignment_1 )?
            {
             before(grammarAccess.getNodeDefinitionAccess().getCollectionAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2131:1: ( rule__NodeDefinition__CollectionAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==59) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2131:2: rule__NodeDefinition__CollectionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__CollectionAssignment_1_in_rule__NodeDefinition__Group__1__Impl4492);
                    rule__NodeDefinition__CollectionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeDefinitionAccess().getCollectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__1__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2141:1: rule__NodeDefinition__Group__2 : rule__NodeDefinition__Group__2__Impl ;
    public final void rule__NodeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2145:1: ( rule__NodeDefinition__Group__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2146:2: rule__NodeDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__2__Impl_in_rule__NodeDefinition__Group__24523);
            rule__NodeDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__2"


    // $ANTLR start "rule__NodeDefinition__Group__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2152:1: rule__NodeDefinition__Group__2__Impl : ( ( rule__NodeDefinition__SelectorsAssignment_2 )? ) ;
    public final void rule__NodeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2156:1: ( ( ( rule__NodeDefinition__SelectorsAssignment_2 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2157:1: ( ( rule__NodeDefinition__SelectorsAssignment_2 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2157:1: ( ( rule__NodeDefinition__SelectorsAssignment_2 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2158:1: ( rule__NodeDefinition__SelectorsAssignment_2 )?
            {
             before(grammarAccess.getNodeDefinitionAccess().getSelectorsAssignment_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2159:1: ( rule__NodeDefinition__SelectorsAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=50 && LA22_0<=51)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2159:2: rule__NodeDefinition__SelectorsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__SelectorsAssignment_2_in_rule__NodeDefinition__Group__2__Impl4550);
                    rule__NodeDefinition__SelectorsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeDefinitionAccess().getSelectorsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__2__Impl"


    // $ANTLR start "rule__NodeReferenceList__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2175:1: rule__NodeReferenceList__Group__0 : rule__NodeReferenceList__Group__0__Impl rule__NodeReferenceList__Group__1 ;
    public final void rule__NodeReferenceList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2179:1: ( rule__NodeReferenceList__Group__0__Impl rule__NodeReferenceList__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2180:2: rule__NodeReferenceList__Group__0__Impl rule__NodeReferenceList__Group__1
            {
            pushFollow(FOLLOW_rule__NodeReferenceList__Group__0__Impl_in_rule__NodeReferenceList__Group__04587);
            rule__NodeReferenceList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeReferenceList__Group__1_in_rule__NodeReferenceList__Group__04590);
            rule__NodeReferenceList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceList__Group__0"


    // $ANTLR start "rule__NodeReferenceList__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2187:1: rule__NodeReferenceList__Group__0__Impl : ( ( rule__NodeReferenceList__NodesAssignment_0 ) ) ;
    public final void rule__NodeReferenceList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2191:1: ( ( ( rule__NodeReferenceList__NodesAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2192:1: ( ( rule__NodeReferenceList__NodesAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2192:1: ( ( rule__NodeReferenceList__NodesAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2193:1: ( rule__NodeReferenceList__NodesAssignment_0 )
            {
             before(grammarAccess.getNodeReferenceListAccess().getNodesAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2194:1: ( rule__NodeReferenceList__NodesAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2194:2: rule__NodeReferenceList__NodesAssignment_0
            {
            pushFollow(FOLLOW_rule__NodeReferenceList__NodesAssignment_0_in_rule__NodeReferenceList__Group__0__Impl4617);
            rule__NodeReferenceList__NodesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeReferenceListAccess().getNodesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceList__Group__0__Impl"


    // $ANTLR start "rule__NodeReferenceList__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2204:1: rule__NodeReferenceList__Group__1 : rule__NodeReferenceList__Group__1__Impl ;
    public final void rule__NodeReferenceList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2208:1: ( rule__NodeReferenceList__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2209:2: rule__NodeReferenceList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeReferenceList__Group__1__Impl_in_rule__NodeReferenceList__Group__14647);
            rule__NodeReferenceList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceList__Group__1"


    // $ANTLR start "rule__NodeReferenceList__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2215:1: rule__NodeReferenceList__Group__1__Impl : ( ( rule__NodeReferenceList__Group_1__0 )* ) ;
    public final void rule__NodeReferenceList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2219:1: ( ( ( rule__NodeReferenceList__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2220:1: ( ( rule__NodeReferenceList__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2220:1: ( ( rule__NodeReferenceList__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2221:1: ( rule__NodeReferenceList__Group_1__0 )*
            {
             before(grammarAccess.getNodeReferenceListAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2222:1: ( rule__NodeReferenceList__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==13) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2222:2: rule__NodeReferenceList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeReferenceList__Group_1__0_in_rule__NodeReferenceList__Group__1__Impl4674);
            	    rule__NodeReferenceList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getNodeReferenceListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceList__Group__1__Impl"


    // $ANTLR start "rule__NodeReferenceList__Group_1__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2236:1: rule__NodeReferenceList__Group_1__0 : rule__NodeReferenceList__Group_1__0__Impl rule__NodeReferenceList__Group_1__1 ;
    public final void rule__NodeReferenceList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2240:1: ( rule__NodeReferenceList__Group_1__0__Impl rule__NodeReferenceList__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2241:2: rule__NodeReferenceList__Group_1__0__Impl rule__NodeReferenceList__Group_1__1
            {
            pushFollow(FOLLOW_rule__NodeReferenceList__Group_1__0__Impl_in_rule__NodeReferenceList__Group_1__04709);
            rule__NodeReferenceList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeReferenceList__Group_1__1_in_rule__NodeReferenceList__Group_1__04712);
            rule__NodeReferenceList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceList__Group_1__0"


    // $ANTLR start "rule__NodeReferenceList__Group_1__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2248:1: rule__NodeReferenceList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__NodeReferenceList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2252:1: ( ( ',' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2253:1: ( ',' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2253:1: ( ',' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2254:1: ','
            {
             before(grammarAccess.getNodeReferenceListAccess().getCommaKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__NodeReferenceList__Group_1__0__Impl4740); 
             after(grammarAccess.getNodeReferenceListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceList__Group_1__0__Impl"


    // $ANTLR start "rule__NodeReferenceList__Group_1__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2267:1: rule__NodeReferenceList__Group_1__1 : rule__NodeReferenceList__Group_1__1__Impl ;
    public final void rule__NodeReferenceList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2271:1: ( rule__NodeReferenceList__Group_1__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2272:2: rule__NodeReferenceList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeReferenceList__Group_1__1__Impl_in_rule__NodeReferenceList__Group_1__14771);
            rule__NodeReferenceList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceList__Group_1__1"


    // $ANTLR start "rule__NodeReferenceList__Group_1__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2278:1: rule__NodeReferenceList__Group_1__1__Impl : ( ( rule__NodeReferenceList__NodesAssignment_1_1 ) ) ;
    public final void rule__NodeReferenceList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2282:1: ( ( ( rule__NodeReferenceList__NodesAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2283:1: ( ( rule__NodeReferenceList__NodesAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2283:1: ( ( rule__NodeReferenceList__NodesAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2284:1: ( rule__NodeReferenceList__NodesAssignment_1_1 )
            {
             before(grammarAccess.getNodeReferenceListAccess().getNodesAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2285:1: ( rule__NodeReferenceList__NodesAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2285:2: rule__NodeReferenceList__NodesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NodeReferenceList__NodesAssignment_1_1_in_rule__NodeReferenceList__Group_1__1__Impl4798);
            rule__NodeReferenceList__NodesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeReferenceListAccess().getNodesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceList__Group_1__1__Impl"


    // $ANTLR start "rule__TargetDefinition__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2299:1: rule__TargetDefinition__Group__0 : rule__TargetDefinition__Group__0__Impl rule__TargetDefinition__Group__1 ;
    public final void rule__TargetDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2303:1: ( rule__TargetDefinition__Group__0__Impl rule__TargetDefinition__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2304:2: rule__TargetDefinition__Group__0__Impl rule__TargetDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group__0__Impl_in_rule__TargetDefinition__Group__04832);
            rule__TargetDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group__1_in_rule__TargetDefinition__Group__04835);
            rule__TargetDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group__0"


    // $ANTLR start "rule__TargetDefinition__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2311:1: rule__TargetDefinition__Group__0__Impl : ( ( rule__TargetDefinition__AxisAssignment_0 ) ) ;
    public final void rule__TargetDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2315:1: ( ( ( rule__TargetDefinition__AxisAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2316:1: ( ( rule__TargetDefinition__AxisAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2316:1: ( ( rule__TargetDefinition__AxisAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2317:1: ( rule__TargetDefinition__AxisAssignment_0 )
            {
             before(grammarAccess.getTargetDefinitionAccess().getAxisAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2318:1: ( rule__TargetDefinition__AxisAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2318:2: rule__TargetDefinition__AxisAssignment_0
            {
            pushFollow(FOLLOW_rule__TargetDefinition__AxisAssignment_0_in_rule__TargetDefinition__Group__0__Impl4862);
            rule__TargetDefinition__AxisAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTargetDefinitionAccess().getAxisAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group__0__Impl"


    // $ANTLR start "rule__TargetDefinition__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2328:1: rule__TargetDefinition__Group__1 : rule__TargetDefinition__Group__1__Impl rule__TargetDefinition__Group__2 ;
    public final void rule__TargetDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2332:1: ( rule__TargetDefinition__Group__1__Impl rule__TargetDefinition__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2333:2: rule__TargetDefinition__Group__1__Impl rule__TargetDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group__1__Impl_in_rule__TargetDefinition__Group__14892);
            rule__TargetDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group__2_in_rule__TargetDefinition__Group__14895);
            rule__TargetDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group__1"


    // $ANTLR start "rule__TargetDefinition__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2340:1: rule__TargetDefinition__Group__1__Impl : ( ( rule__TargetDefinition__DefinitionAssignment_1 ) ) ;
    public final void rule__TargetDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2344:1: ( ( ( rule__TargetDefinition__DefinitionAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2345:1: ( ( rule__TargetDefinition__DefinitionAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2345:1: ( ( rule__TargetDefinition__DefinitionAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2346:1: ( rule__TargetDefinition__DefinitionAssignment_1 )
            {
             before(grammarAccess.getTargetDefinitionAccess().getDefinitionAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2347:1: ( rule__TargetDefinition__DefinitionAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2347:2: rule__TargetDefinition__DefinitionAssignment_1
            {
            pushFollow(FOLLOW_rule__TargetDefinition__DefinitionAssignment_1_in_rule__TargetDefinition__Group__1__Impl4922);
            rule__TargetDefinition__DefinitionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetDefinitionAccess().getDefinitionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group__1__Impl"


    // $ANTLR start "rule__TargetDefinition__Group__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2357:1: rule__TargetDefinition__Group__2 : rule__TargetDefinition__Group__2__Impl rule__TargetDefinition__Group__3 ;
    public final void rule__TargetDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2361:1: ( rule__TargetDefinition__Group__2__Impl rule__TargetDefinition__Group__3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2362:2: rule__TargetDefinition__Group__2__Impl rule__TargetDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group__2__Impl_in_rule__TargetDefinition__Group__24952);
            rule__TargetDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group__3_in_rule__TargetDefinition__Group__24955);
            rule__TargetDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group__2"


    // $ANTLR start "rule__TargetDefinition__Group__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2369:1: rule__TargetDefinition__Group__2__Impl : ( ( rule__TargetDefinition__Group_2__0 )? ) ;
    public final void rule__TargetDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2373:1: ( ( ( rule__TargetDefinition__Group_2__0 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2374:1: ( ( rule__TargetDefinition__Group_2__0 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2374:1: ( ( rule__TargetDefinition__Group_2__0 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2375:1: ( rule__TargetDefinition__Group_2__0 )?
            {
             before(grammarAccess.getTargetDefinitionAccess().getGroup_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2376:1: ( rule__TargetDefinition__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2376:2: rule__TargetDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TargetDefinition__Group_2__0_in_rule__TargetDefinition__Group__2__Impl4982);
                    rule__TargetDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group__2__Impl"


    // $ANTLR start "rule__TargetDefinition__Group__3"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2386:1: rule__TargetDefinition__Group__3 : rule__TargetDefinition__Group__3__Impl ;
    public final void rule__TargetDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2390:1: ( rule__TargetDefinition__Group__3__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2391:2: rule__TargetDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group__3__Impl_in_rule__TargetDefinition__Group__35013);
            rule__TargetDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group__3"


    // $ANTLR start "rule__TargetDefinition__Group__3__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2397:1: rule__TargetDefinition__Group__3__Impl : ( ( rule__TargetDefinition__Group_3__0 )? ) ;
    public final void rule__TargetDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2401:1: ( ( ( rule__TargetDefinition__Group_3__0 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2402:1: ( ( rule__TargetDefinition__Group_3__0 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2402:1: ( ( rule__TargetDefinition__Group_3__0 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2403:1: ( rule__TargetDefinition__Group_3__0 )?
            {
             before(grammarAccess.getTargetDefinitionAccess().getGroup_3()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2404:1: ( rule__TargetDefinition__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==48) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2404:2: rule__TargetDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TargetDefinition__Group_3__0_in_rule__TargetDefinition__Group__3__Impl5040);
                    rule__TargetDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group__3__Impl"


    // $ANTLR start "rule__TargetDefinition__Group_2__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2422:1: rule__TargetDefinition__Group_2__0 : rule__TargetDefinition__Group_2__0__Impl rule__TargetDefinition__Group_2__1 ;
    public final void rule__TargetDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2426:1: ( rule__TargetDefinition__Group_2__0__Impl rule__TargetDefinition__Group_2__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2427:2: rule__TargetDefinition__Group_2__0__Impl rule__TargetDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__0__Impl_in_rule__TargetDefinition__Group_2__05079);
            rule__TargetDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__1_in_rule__TargetDefinition__Group_2__05082);
            rule__TargetDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_2__0"


    // $ANTLR start "rule__TargetDefinition__Group_2__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2434:1: rule__TargetDefinition__Group_2__0__Impl : ( 'where' ) ;
    public final void rule__TargetDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2438:1: ( ( 'where' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2439:1: ( 'where' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2439:1: ( 'where' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2440:1: 'where'
            {
             before(grammarAccess.getTargetDefinitionAccess().getWhereKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__TargetDefinition__Group_2__0__Impl5110); 
             after(grammarAccess.getTargetDefinitionAccess().getWhereKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__TargetDefinition__Group_2__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2453:1: rule__TargetDefinition__Group_2__1 : rule__TargetDefinition__Group_2__1__Impl rule__TargetDefinition__Group_2__2 ;
    public final void rule__TargetDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2457:1: ( rule__TargetDefinition__Group_2__1__Impl rule__TargetDefinition__Group_2__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2458:2: rule__TargetDefinition__Group_2__1__Impl rule__TargetDefinition__Group_2__2
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__1__Impl_in_rule__TargetDefinition__Group_2__15141);
            rule__TargetDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__2_in_rule__TargetDefinition__Group_2__15144);
            rule__TargetDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_2__1"


    // $ANTLR start "rule__TargetDefinition__Group_2__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2465:1: rule__TargetDefinition__Group_2__1__Impl : ( 'holds' ) ;
    public final void rule__TargetDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2469:1: ( ( 'holds' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2470:1: ( 'holds' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2470:1: ( 'holds' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2471:1: 'holds'
            {
             before(grammarAccess.getTargetDefinitionAccess().getHoldsKeyword_2_1()); 
            match(input,42,FOLLOW_42_in_rule__TargetDefinition__Group_2__1__Impl5172); 
             after(grammarAccess.getTargetDefinitionAccess().getHoldsKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__TargetDefinition__Group_2__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2484:1: rule__TargetDefinition__Group_2__2 : rule__TargetDefinition__Group_2__2__Impl rule__TargetDefinition__Group_2__3 ;
    public final void rule__TargetDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2488:1: ( rule__TargetDefinition__Group_2__2__Impl rule__TargetDefinition__Group_2__3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2489:2: rule__TargetDefinition__Group_2__2__Impl rule__TargetDefinition__Group_2__3
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__2__Impl_in_rule__TargetDefinition__Group_2__25203);
            rule__TargetDefinition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__3_in_rule__TargetDefinition__Group_2__25206);
            rule__TargetDefinition__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_2__2"


    // $ANTLR start "rule__TargetDefinition__Group_2__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2496:1: rule__TargetDefinition__Group_2__2__Impl : ( '{' ) ;
    public final void rule__TargetDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2500:1: ( ( '{' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2501:1: ( '{' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2501:1: ( '{' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2502:1: '{'
            {
             before(grammarAccess.getTargetDefinitionAccess().getLeftCurlyBracketKeyword_2_2()); 
            match(input,46,FOLLOW_46_in_rule__TargetDefinition__Group_2__2__Impl5234); 
             after(grammarAccess.getTargetDefinitionAccess().getLeftCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__TargetDefinition__Group_2__3"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2515:1: rule__TargetDefinition__Group_2__3 : rule__TargetDefinition__Group_2__3__Impl rule__TargetDefinition__Group_2__4 ;
    public final void rule__TargetDefinition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2519:1: ( rule__TargetDefinition__Group_2__3__Impl rule__TargetDefinition__Group_2__4 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2520:2: rule__TargetDefinition__Group_2__3__Impl rule__TargetDefinition__Group_2__4
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__3__Impl_in_rule__TargetDefinition__Group_2__35265);
            rule__TargetDefinition__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__4_in_rule__TargetDefinition__Group_2__35268);
            rule__TargetDefinition__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_2__3"


    // $ANTLR start "rule__TargetDefinition__Group_2__3__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2527:1: rule__TargetDefinition__Group_2__3__Impl : ( ( rule__TargetDefinition__PredicateAssignment_2_3 ) ) ;
    public final void rule__TargetDefinition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2531:1: ( ( ( rule__TargetDefinition__PredicateAssignment_2_3 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2532:1: ( ( rule__TargetDefinition__PredicateAssignment_2_3 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2532:1: ( ( rule__TargetDefinition__PredicateAssignment_2_3 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2533:1: ( rule__TargetDefinition__PredicateAssignment_2_3 )
            {
             before(grammarAccess.getTargetDefinitionAccess().getPredicateAssignment_2_3()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2534:1: ( rule__TargetDefinition__PredicateAssignment_2_3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2534:2: rule__TargetDefinition__PredicateAssignment_2_3
            {
            pushFollow(FOLLOW_rule__TargetDefinition__PredicateAssignment_2_3_in_rule__TargetDefinition__Group_2__3__Impl5295);
            rule__TargetDefinition__PredicateAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getTargetDefinitionAccess().getPredicateAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_2__3__Impl"


    // $ANTLR start "rule__TargetDefinition__Group_2__4"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2544:1: rule__TargetDefinition__Group_2__4 : rule__TargetDefinition__Group_2__4__Impl ;
    public final void rule__TargetDefinition__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2548:1: ( rule__TargetDefinition__Group_2__4__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2549:2: rule__TargetDefinition__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__4__Impl_in_rule__TargetDefinition__Group_2__45325);
            rule__TargetDefinition__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_2__4"


    // $ANTLR start "rule__TargetDefinition__Group_2__4__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2555:1: rule__TargetDefinition__Group_2__4__Impl : ( '}' ) ;
    public final void rule__TargetDefinition__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2559:1: ( ( '}' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2560:1: ( '}' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2560:1: ( '}' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2561:1: '}'
            {
             before(grammarAccess.getTargetDefinitionAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,47,FOLLOW_47_in_rule__TargetDefinition__Group_2__4__Impl5353); 
             after(grammarAccess.getTargetDefinitionAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_2__4__Impl"


    // $ANTLR start "rule__TargetDefinition__Group_3__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2584:1: rule__TargetDefinition__Group_3__0 : rule__TargetDefinition__Group_3__0__Impl rule__TargetDefinition__Group_3__1 ;
    public final void rule__TargetDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2588:1: ( rule__TargetDefinition__Group_3__0__Impl rule__TargetDefinition__Group_3__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2589:2: rule__TargetDefinition__Group_3__0__Impl rule__TargetDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__0__Impl_in_rule__TargetDefinition__Group_3__05394);
            rule__TargetDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__1_in_rule__TargetDefinition__Group_3__05397);
            rule__TargetDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_3__0"


    // $ANTLR start "rule__TargetDefinition__Group_3__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2596:1: rule__TargetDefinition__Group_3__0__Impl : ( 'with' ) ;
    public final void rule__TargetDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2600:1: ( ( 'with' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2601:1: ( 'with' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2601:1: ( 'with' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2602:1: 'with'
            {
             before(grammarAccess.getTargetDefinitionAccess().getWithKeyword_3_0()); 
            match(input,48,FOLLOW_48_in_rule__TargetDefinition__Group_3__0__Impl5425); 
             after(grammarAccess.getTargetDefinitionAccess().getWithKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__TargetDefinition__Group_3__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2615:1: rule__TargetDefinition__Group_3__1 : rule__TargetDefinition__Group_3__1__Impl rule__TargetDefinition__Group_3__2 ;
    public final void rule__TargetDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2619:1: ( rule__TargetDefinition__Group_3__1__Impl rule__TargetDefinition__Group_3__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2620:2: rule__TargetDefinition__Group_3__1__Impl rule__TargetDefinition__Group_3__2
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__1__Impl_in_rule__TargetDefinition__Group_3__15456);
            rule__TargetDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__2_in_rule__TargetDefinition__Group_3__15459);
            rule__TargetDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_3__1"


    // $ANTLR start "rule__TargetDefinition__Group_3__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2627:1: rule__TargetDefinition__Group_3__1__Impl : ( 'property' ) ;
    public final void rule__TargetDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2631:1: ( ( 'property' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2632:1: ( 'property' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2632:1: ( 'property' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2633:1: 'property'
            {
             before(grammarAccess.getTargetDefinitionAccess().getPropertyKeyword_3_1()); 
            match(input,49,FOLLOW_49_in_rule__TargetDefinition__Group_3__1__Impl5487); 
             after(grammarAccess.getTargetDefinitionAccess().getPropertyKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__TargetDefinition__Group_3__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2646:1: rule__TargetDefinition__Group_3__2 : rule__TargetDefinition__Group_3__2__Impl rule__TargetDefinition__Group_3__3 ;
    public final void rule__TargetDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2650:1: ( rule__TargetDefinition__Group_3__2__Impl rule__TargetDefinition__Group_3__3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2651:2: rule__TargetDefinition__Group_3__2__Impl rule__TargetDefinition__Group_3__3
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__2__Impl_in_rule__TargetDefinition__Group_3__25518);
            rule__TargetDefinition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__3_in_rule__TargetDefinition__Group_3__25521);
            rule__TargetDefinition__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_3__2"


    // $ANTLR start "rule__TargetDefinition__Group_3__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2658:1: rule__TargetDefinition__Group_3__2__Impl : ( '{' ) ;
    public final void rule__TargetDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2662:1: ( ( '{' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2663:1: ( '{' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2663:1: ( '{' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2664:1: '{'
            {
             before(grammarAccess.getTargetDefinitionAccess().getLeftCurlyBracketKeyword_3_2()); 
            match(input,46,FOLLOW_46_in_rule__TargetDefinition__Group_3__2__Impl5549); 
             after(grammarAccess.getTargetDefinitionAccess().getLeftCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__TargetDefinition__Group_3__3"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2677:1: rule__TargetDefinition__Group_3__3 : rule__TargetDefinition__Group_3__3__Impl rule__TargetDefinition__Group_3__4 ;
    public final void rule__TargetDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2681:1: ( rule__TargetDefinition__Group_3__3__Impl rule__TargetDefinition__Group_3__4 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2682:2: rule__TargetDefinition__Group_3__3__Impl rule__TargetDefinition__Group_3__4
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__3__Impl_in_rule__TargetDefinition__Group_3__35580);
            rule__TargetDefinition__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__4_in_rule__TargetDefinition__Group_3__35583);
            rule__TargetDefinition__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_3__3"


    // $ANTLR start "rule__TargetDefinition__Group_3__3__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2689:1: rule__TargetDefinition__Group_3__3__Impl : ( ( rule__TargetDefinition__AssignmentsAssignment_3_3 ) ) ;
    public final void rule__TargetDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2693:1: ( ( ( rule__TargetDefinition__AssignmentsAssignment_3_3 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2694:1: ( ( rule__TargetDefinition__AssignmentsAssignment_3_3 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2694:1: ( ( rule__TargetDefinition__AssignmentsAssignment_3_3 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2695:1: ( rule__TargetDefinition__AssignmentsAssignment_3_3 )
            {
             before(grammarAccess.getTargetDefinitionAccess().getAssignmentsAssignment_3_3()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2696:1: ( rule__TargetDefinition__AssignmentsAssignment_3_3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2696:2: rule__TargetDefinition__AssignmentsAssignment_3_3
            {
            pushFollow(FOLLOW_rule__TargetDefinition__AssignmentsAssignment_3_3_in_rule__TargetDefinition__Group_3__3__Impl5610);
            rule__TargetDefinition__AssignmentsAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getTargetDefinitionAccess().getAssignmentsAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_3__3__Impl"


    // $ANTLR start "rule__TargetDefinition__Group_3__4"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2706:1: rule__TargetDefinition__Group_3__4 : rule__TargetDefinition__Group_3__4__Impl ;
    public final void rule__TargetDefinition__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2710:1: ( rule__TargetDefinition__Group_3__4__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2711:2: rule__TargetDefinition__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__4__Impl_in_rule__TargetDefinition__Group_3__45640);
            rule__TargetDefinition__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_3__4"


    // $ANTLR start "rule__TargetDefinition__Group_3__4__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2717:1: rule__TargetDefinition__Group_3__4__Impl : ( '}' ) ;
    public final void rule__TargetDefinition__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2721:1: ( ( '}' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2722:1: ( '}' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2722:1: ( '}' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2723:1: '}'
            {
             before(grammarAccess.getTargetDefinitionAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,47,FOLLOW_47_in_rule__TargetDefinition__Group_3__4__Impl5668); 
             after(grammarAccess.getTargetDefinitionAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__Group_3__4__Impl"


    // $ANTLR start "rule__SelectorList__Group_0__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2746:1: rule__SelectorList__Group_0__0 : rule__SelectorList__Group_0__0__Impl rule__SelectorList__Group_0__1 ;
    public final void rule__SelectorList__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2750:1: ( rule__SelectorList__Group_0__0__Impl rule__SelectorList__Group_0__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2751:2: rule__SelectorList__Group_0__0__Impl rule__SelectorList__Group_0__1
            {
            pushFollow(FOLLOW_rule__SelectorList__Group_0__0__Impl_in_rule__SelectorList__Group_0__05709);
            rule__SelectorList__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectorList__Group_0__1_in_rule__SelectorList__Group_0__05712);
            rule__SelectorList__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorList__Group_0__0"


    // $ANTLR start "rule__SelectorList__Group_0__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2758:1: rule__SelectorList__Group_0__0__Impl : ( 'being' ) ;
    public final void rule__SelectorList__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2762:1: ( ( 'being' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2763:1: ( 'being' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2763:1: ( 'being' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2764:1: 'being'
            {
             before(grammarAccess.getSelectorListAccess().getBeingKeyword_0_0()); 
            match(input,50,FOLLOW_50_in_rule__SelectorList__Group_0__0__Impl5740); 
             after(grammarAccess.getSelectorListAccess().getBeingKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorList__Group_0__0__Impl"


    // $ANTLR start "rule__SelectorList__Group_0__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2777:1: rule__SelectorList__Group_0__1 : rule__SelectorList__Group_0__1__Impl ;
    public final void rule__SelectorList__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2781:1: ( rule__SelectorList__Group_0__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2782:2: rule__SelectorList__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectorList__Group_0__1__Impl_in_rule__SelectorList__Group_0__15771);
            rule__SelectorList__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorList__Group_0__1"


    // $ANTLR start "rule__SelectorList__Group_0__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2788:1: rule__SelectorList__Group_0__1__Impl : ( ( rule__SelectorList__SelectorsAssignment_0_1 ) ) ;
    public final void rule__SelectorList__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2792:1: ( ( ( rule__SelectorList__SelectorsAssignment_0_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2793:1: ( ( rule__SelectorList__SelectorsAssignment_0_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2793:1: ( ( rule__SelectorList__SelectorsAssignment_0_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2794:1: ( rule__SelectorList__SelectorsAssignment_0_1 )
            {
             before(grammarAccess.getSelectorListAccess().getSelectorsAssignment_0_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2795:1: ( rule__SelectorList__SelectorsAssignment_0_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2795:2: rule__SelectorList__SelectorsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__SelectorList__SelectorsAssignment_0_1_in_rule__SelectorList__Group_0__1__Impl5798);
            rule__SelectorList__SelectorsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorListAccess().getSelectorsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorList__Group_0__1__Impl"


    // $ANTLR start "rule__SelectorList__Group_1__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2809:1: rule__SelectorList__Group_1__0 : rule__SelectorList__Group_1__0__Impl rule__SelectorList__Group_1__1 ;
    public final void rule__SelectorList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2813:1: ( rule__SelectorList__Group_1__0__Impl rule__SelectorList__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2814:2: rule__SelectorList__Group_1__0__Impl rule__SelectorList__Group_1__1
            {
            pushFollow(FOLLOW_rule__SelectorList__Group_1__0__Impl_in_rule__SelectorList__Group_1__05832);
            rule__SelectorList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectorList__Group_1__1_in_rule__SelectorList__Group_1__05835);
            rule__SelectorList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorList__Group_1__0"


    // $ANTLR start "rule__SelectorList__Group_1__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2821:1: rule__SelectorList__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SelectorList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2825:1: ( ( '(' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2826:1: ( '(' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2826:1: ( '(' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2827:1: '('
            {
             before(grammarAccess.getSelectorListAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,51,FOLLOW_51_in_rule__SelectorList__Group_1__0__Impl5863); 
             after(grammarAccess.getSelectorListAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorList__Group_1__0__Impl"


    // $ANTLR start "rule__SelectorList__Group_1__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2840:1: rule__SelectorList__Group_1__1 : rule__SelectorList__Group_1__1__Impl rule__SelectorList__Group_1__2 ;
    public final void rule__SelectorList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2844:1: ( rule__SelectorList__Group_1__1__Impl rule__SelectorList__Group_1__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2845:2: rule__SelectorList__Group_1__1__Impl rule__SelectorList__Group_1__2
            {
            pushFollow(FOLLOW_rule__SelectorList__Group_1__1__Impl_in_rule__SelectorList__Group_1__15894);
            rule__SelectorList__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectorList__Group_1__2_in_rule__SelectorList__Group_1__15897);
            rule__SelectorList__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorList__Group_1__1"


    // $ANTLR start "rule__SelectorList__Group_1__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2852:1: rule__SelectorList__Group_1__1__Impl : ( ( rule__SelectorList__SelectorsAssignment_1_1 ) ) ;
    public final void rule__SelectorList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2856:1: ( ( ( rule__SelectorList__SelectorsAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2857:1: ( ( rule__SelectorList__SelectorsAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2857:1: ( ( rule__SelectorList__SelectorsAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2858:1: ( rule__SelectorList__SelectorsAssignment_1_1 )
            {
             before(grammarAccess.getSelectorListAccess().getSelectorsAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2859:1: ( rule__SelectorList__SelectorsAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2859:2: rule__SelectorList__SelectorsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SelectorList__SelectorsAssignment_1_1_in_rule__SelectorList__Group_1__1__Impl5924);
            rule__SelectorList__SelectorsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorListAccess().getSelectorsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorList__Group_1__1__Impl"


    // $ANTLR start "rule__SelectorList__Group_1__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2869:1: rule__SelectorList__Group_1__2 : rule__SelectorList__Group_1__2__Impl ;
    public final void rule__SelectorList__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2873:1: ( rule__SelectorList__Group_1__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2874:2: rule__SelectorList__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SelectorList__Group_1__2__Impl_in_rule__SelectorList__Group_1__25954);
            rule__SelectorList__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorList__Group_1__2"


    // $ANTLR start "rule__SelectorList__Group_1__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2880:1: rule__SelectorList__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SelectorList__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2884:1: ( ( ')' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2885:1: ( ')' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2885:1: ( ')' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2886:1: ')'
            {
             before(grammarAccess.getSelectorListAccess().getRightParenthesisKeyword_1_2()); 
            match(input,52,FOLLOW_52_in_rule__SelectorList__Group_1__2__Impl5982); 
             after(grammarAccess.getSelectorListAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorList__Group_1__2__Impl"


    // $ANTLR start "rule__SelectorListDef__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2905:1: rule__SelectorListDef__Group__0 : rule__SelectorListDef__Group__0__Impl rule__SelectorListDef__Group__1 ;
    public final void rule__SelectorListDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2909:1: ( rule__SelectorListDef__Group__0__Impl rule__SelectorListDef__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2910:2: rule__SelectorListDef__Group__0__Impl rule__SelectorListDef__Group__1
            {
            pushFollow(FOLLOW_rule__SelectorListDef__Group__0__Impl_in_rule__SelectorListDef__Group__06019);
            rule__SelectorListDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectorListDef__Group__1_in_rule__SelectorListDef__Group__06022);
            rule__SelectorListDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorListDef__Group__0"


    // $ANTLR start "rule__SelectorListDef__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2917:1: rule__SelectorListDef__Group__0__Impl : ( ( rule__SelectorListDef__SelectorsAssignment_0 ) ) ;
    public final void rule__SelectorListDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2921:1: ( ( ( rule__SelectorListDef__SelectorsAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2922:1: ( ( rule__SelectorListDef__SelectorsAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2922:1: ( ( rule__SelectorListDef__SelectorsAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2923:1: ( rule__SelectorListDef__SelectorsAssignment_0 )
            {
             before(grammarAccess.getSelectorListDefAccess().getSelectorsAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2924:1: ( rule__SelectorListDef__SelectorsAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2924:2: rule__SelectorListDef__SelectorsAssignment_0
            {
            pushFollow(FOLLOW_rule__SelectorListDef__SelectorsAssignment_0_in_rule__SelectorListDef__Group__0__Impl6049);
            rule__SelectorListDef__SelectorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorListDefAccess().getSelectorsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorListDef__Group__0__Impl"


    // $ANTLR start "rule__SelectorListDef__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2934:1: rule__SelectorListDef__Group__1 : rule__SelectorListDef__Group__1__Impl ;
    public final void rule__SelectorListDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2938:1: ( rule__SelectorListDef__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2939:2: rule__SelectorListDef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectorListDef__Group__1__Impl_in_rule__SelectorListDef__Group__16079);
            rule__SelectorListDef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorListDef__Group__1"


    // $ANTLR start "rule__SelectorListDef__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2945:1: rule__SelectorListDef__Group__1__Impl : ( ( rule__SelectorListDef__Group_1__0 )* ) ;
    public final void rule__SelectorListDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2949:1: ( ( ( rule__SelectorListDef__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2950:1: ( ( rule__SelectorListDef__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2950:1: ( ( rule__SelectorListDef__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2951:1: ( rule__SelectorListDef__Group_1__0 )*
            {
             before(grammarAccess.getSelectorListDefAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2952:1: ( rule__SelectorListDef__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==RULE_ID) ) {
                        int LA26_4 = input.LA(3);

                        if ( (LA26_4==RULE_ID) ) {
                            int LA26_6 = input.LA(4);

                            if ( ((LA26_6>=22 && LA26_6<=24)) ) {
                                alt26=1;
                            }


                        }
                        else if ( (LA26_4==EOF||(LA26_4>=11 && LA26_4<=17)||(LA26_4>=20 && LA26_4<=21)||LA26_4==39||LA26_4==41||(LA26_4>=44 && LA26_4<=45)||(LA26_4>=47 && LA26_4<=48)||(LA26_4>=52 && LA26_4<=53)||LA26_4==55) ) {
                            alt26=1;
                        }


                    }


                }
                else if ( (LA26_0==13) ) {
                    int LA26_3 = input.LA(2);

                    if ( (LA26_3==RULE_ID) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2952:2: rule__SelectorListDef__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SelectorListDef__Group_1__0_in_rule__SelectorListDef__Group__1__Impl6106);
            	    rule__SelectorListDef__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getSelectorListDefAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorListDef__Group__1__Impl"


    // $ANTLR start "rule__SelectorListDef__Group_1__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2966:1: rule__SelectorListDef__Group_1__0 : rule__SelectorListDef__Group_1__0__Impl rule__SelectorListDef__Group_1__1 ;
    public final void rule__SelectorListDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2970:1: ( rule__SelectorListDef__Group_1__0__Impl rule__SelectorListDef__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2971:2: rule__SelectorListDef__Group_1__0__Impl rule__SelectorListDef__Group_1__1
            {
            pushFollow(FOLLOW_rule__SelectorListDef__Group_1__0__Impl_in_rule__SelectorListDef__Group_1__06141);
            rule__SelectorListDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectorListDef__Group_1__1_in_rule__SelectorListDef__Group_1__06144);
            rule__SelectorListDef__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorListDef__Group_1__0"


    // $ANTLR start "rule__SelectorListDef__Group_1__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2978:1: rule__SelectorListDef__Group_1__0__Impl : ( ( rule__SelectorListDef__Alternatives_1_0 ) ) ;
    public final void rule__SelectorListDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2982:1: ( ( ( rule__SelectorListDef__Alternatives_1_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2983:1: ( ( rule__SelectorListDef__Alternatives_1_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2983:1: ( ( rule__SelectorListDef__Alternatives_1_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2984:1: ( rule__SelectorListDef__Alternatives_1_0 )
            {
             before(grammarAccess.getSelectorListDefAccess().getAlternatives_1_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2985:1: ( rule__SelectorListDef__Alternatives_1_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2985:2: rule__SelectorListDef__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__SelectorListDef__Alternatives_1_0_in_rule__SelectorListDef__Group_1__0__Impl6171);
            rule__SelectorListDef__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorListDefAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorListDef__Group_1__0__Impl"


    // $ANTLR start "rule__SelectorListDef__Group_1__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2995:1: rule__SelectorListDef__Group_1__1 : rule__SelectorListDef__Group_1__1__Impl ;
    public final void rule__SelectorListDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2999:1: ( rule__SelectorListDef__Group_1__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3000:2: rule__SelectorListDef__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectorListDef__Group_1__1__Impl_in_rule__SelectorListDef__Group_1__16201);
            rule__SelectorListDef__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorListDef__Group_1__1"


    // $ANTLR start "rule__SelectorListDef__Group_1__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3006:1: rule__SelectorListDef__Group_1__1__Impl : ( ( rule__SelectorListDef__SelectorsAssignment_1_1 ) ) ;
    public final void rule__SelectorListDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3010:1: ( ( ( rule__SelectorListDef__SelectorsAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3011:1: ( ( rule__SelectorListDef__SelectorsAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3011:1: ( ( rule__SelectorListDef__SelectorsAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3012:1: ( rule__SelectorListDef__SelectorsAssignment_1_1 )
            {
             before(grammarAccess.getSelectorListDefAccess().getSelectorsAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3013:1: ( rule__SelectorListDef__SelectorsAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3013:2: rule__SelectorListDef__SelectorsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SelectorListDef__SelectorsAssignment_1_1_in_rule__SelectorListDef__Group_1__1__Impl6228);
            rule__SelectorListDef__SelectorsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorListDefAccess().getSelectorsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorListDef__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3027:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3031:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3032:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__06262);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__06265);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3039:1: rule__AndExpression__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3043:1: ( ( ruleOrExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3044:1: ( ruleOrExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3044:1: ( ruleOrExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3045:1: ruleOrExpression
            {
             before(grammarAccess.getAndExpressionAccess().getOrExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__AndExpression__Group__0__Impl6292);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getOrExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3056:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3060:1: ( rule__AndExpression__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3061:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__16321);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3067:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3071:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3072:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3072:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3073:1: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3074:1: ( rule__AndExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==13||LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3074:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl6348);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3088:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3092:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3093:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__06383);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__06386);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3100:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3104:1: ( ( () ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3105:1: ( () )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3105:1: ( () )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3106:1: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3107:1: ()
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3109:1: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3119:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3123:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3124:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__16444);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__16447);
            rule__AndExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3131:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__Alternatives_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3135:1: ( ( ( rule__AndExpression__Alternatives_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3136:1: ( ( rule__AndExpression__Alternatives_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3136:1: ( ( rule__AndExpression__Alternatives_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3137:1: ( rule__AndExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getAlternatives_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3138:1: ( rule__AndExpression__Alternatives_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3138:2: rule__AndExpression__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__Alternatives_1_1_in_rule__AndExpression__Group_1__1__Impl6474);
            rule__AndExpression__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3148:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3152:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3153:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__26504);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3159:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RhsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3163:1: ( ( ( rule__AndExpression__RhsAssignment_1_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3164:1: ( ( rule__AndExpression__RhsAssignment_1_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3164:1: ( ( rule__AndExpression__RhsAssignment_1_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3165:1: ( rule__AndExpression__RhsAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRhsAssignment_1_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3166:1: ( rule__AndExpression__RhsAssignment_1_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3166:2: rule__AndExpression__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExpression__RhsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl6531);
            rule__AndExpression__RhsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRhsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3182:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3186:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3187:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__06567);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__06570);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3194:1: rule__OrExpression__Group__0__Impl : ( ruleImpliesExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3198:1: ( ( ruleImpliesExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3199:1: ( ruleImpliesExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3199:1: ( ruleImpliesExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3200:1: ruleImpliesExpression
            {
             before(grammarAccess.getOrExpressionAccess().getImpliesExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleImpliesExpression_in_rule__OrExpression__Group__0__Impl6597);
            ruleImpliesExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getImpliesExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3211:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3215:1: ( rule__OrExpression__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3216:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__16626);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3222:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3226:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3227:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3227:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3228:1: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3229:1: ( rule__OrExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3229:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl6653);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3243:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3247:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3248:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__06688);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__06691);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3255:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3259:1: ( ( () ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3260:1: ( () )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3260:1: ( () )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3261:1: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3262:1: ()
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3264:1: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3274:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3278:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3279:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__16749);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__16752);
            rule__OrExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3286:1: rule__OrExpression__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3290:1: ( ( 'or' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3291:1: ( 'or' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3291:1: ( 'or' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3292:1: 'or'
            {
             before(grammarAccess.getOrExpressionAccess().getOrKeyword_1_1()); 
            match(input,14,FOLLOW_14_in_rule__OrExpression__Group_1__1__Impl6780); 
             after(grammarAccess.getOrExpressionAccess().getOrKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3305:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3309:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3310:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__26811);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3316:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RhsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3320:1: ( ( ( rule__OrExpression__RhsAssignment_1_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3321:1: ( ( rule__OrExpression__RhsAssignment_1_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3321:1: ( ( rule__OrExpression__RhsAssignment_1_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3322:1: ( rule__OrExpression__RhsAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRhsAssignment_1_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3323:1: ( rule__OrExpression__RhsAssignment_1_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3323:2: rule__OrExpression__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExpression__RhsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl6838);
            rule__OrExpression__RhsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRhsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3339:1: rule__ImpliesExpression__Group__0 : rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1 ;
    public final void rule__ImpliesExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3343:1: ( rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3344:2: rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__Group__0__Impl_in_rule__ImpliesExpression__Group__06874);
            rule__ImpliesExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImpliesExpression__Group__1_in_rule__ImpliesExpression__Group__06877);
            rule__ImpliesExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__0"


    // $ANTLR start "rule__ImpliesExpression__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3351:1: rule__ImpliesExpression__Group__0__Impl : ( ( rule__ImpliesExpression__LhsAssignment_0 ) ) ;
    public final void rule__ImpliesExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3355:1: ( ( ( rule__ImpliesExpression__LhsAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3356:1: ( ( rule__ImpliesExpression__LhsAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3356:1: ( ( rule__ImpliesExpression__LhsAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3357:1: ( rule__ImpliesExpression__LhsAssignment_0 )
            {
             before(grammarAccess.getImpliesExpressionAccess().getLhsAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3358:1: ( rule__ImpliesExpression__LhsAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3358:2: rule__ImpliesExpression__LhsAssignment_0
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__LhsAssignment_0_in_rule__ImpliesExpression__Group__0__Impl6904);
            rule__ImpliesExpression__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImpliesExpressionAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__0__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3368:1: rule__ImpliesExpression__Group__1 : rule__ImpliesExpression__Group__1__Impl ;
    public final void rule__ImpliesExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3372:1: ( rule__ImpliesExpression__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3373:2: rule__ImpliesExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__Group__1__Impl_in_rule__ImpliesExpression__Group__16934);
            rule__ImpliesExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__1"


    // $ANTLR start "rule__ImpliesExpression__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3379:1: rule__ImpliesExpression__Group__1__Impl : ( ( rule__ImpliesExpression__Group_1__0 )? ) ;
    public final void rule__ImpliesExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3383:1: ( ( ( rule__ImpliesExpression__Group_1__0 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3384:1: ( ( rule__ImpliesExpression__Group_1__0 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3384:1: ( ( rule__ImpliesExpression__Group_1__0 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3385:1: ( rule__ImpliesExpression__Group_1__0 )?
            {
             before(grammarAccess.getImpliesExpressionAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3386:1: ( rule__ImpliesExpression__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=16 && LA29_0<=17)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3386:2: rule__ImpliesExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ImpliesExpression__Group_1__0_in_rule__ImpliesExpression__Group__1__Impl6961);
                    rule__ImpliesExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImpliesExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__1__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group_1__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3400:1: rule__ImpliesExpression__Group_1__0 : rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1 ;
    public final void rule__ImpliesExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3404:1: ( rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3405:2: rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__Group_1__0__Impl_in_rule__ImpliesExpression__Group_1__06996);
            rule__ImpliesExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImpliesExpression__Group_1__1_in_rule__ImpliesExpression__Group_1__06999);
            rule__ImpliesExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__0"


    // $ANTLR start "rule__ImpliesExpression__Group_1__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3412:1: rule__ImpliesExpression__Group_1__0__Impl : ( ( rule__ImpliesExpression__Alternatives_1_0 ) ) ;
    public final void rule__ImpliesExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3416:1: ( ( ( rule__ImpliesExpression__Alternatives_1_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3417:1: ( ( rule__ImpliesExpression__Alternatives_1_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3417:1: ( ( rule__ImpliesExpression__Alternatives_1_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3418:1: ( rule__ImpliesExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getImpliesExpressionAccess().getAlternatives_1_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3419:1: ( rule__ImpliesExpression__Alternatives_1_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3419:2: rule__ImpliesExpression__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__Alternatives_1_0_in_rule__ImpliesExpression__Group_1__0__Impl7026);
            rule__ImpliesExpression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getImpliesExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group_1__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3429:1: rule__ImpliesExpression__Group_1__1 : rule__ImpliesExpression__Group_1__1__Impl ;
    public final void rule__ImpliesExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3433:1: ( rule__ImpliesExpression__Group_1__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3434:2: rule__ImpliesExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__Group_1__1__Impl_in_rule__ImpliesExpression__Group_1__17056);
            rule__ImpliesExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__1"


    // $ANTLR start "rule__ImpliesExpression__Group_1__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3440:1: rule__ImpliesExpression__Group_1__1__Impl : ( ( rule__ImpliesExpression__RhsAssignment_1_1 ) ) ;
    public final void rule__ImpliesExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3444:1: ( ( ( rule__ImpliesExpression__RhsAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3445:1: ( ( rule__ImpliesExpression__RhsAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3445:1: ( ( rule__ImpliesExpression__RhsAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3446:1: ( rule__ImpliesExpression__RhsAssignment_1_1 )
            {
             before(grammarAccess.getImpliesExpressionAccess().getRhsAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3447:1: ( rule__ImpliesExpression__RhsAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3447:2: rule__ImpliesExpression__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__RhsAssignment_1_1_in_rule__ImpliesExpression__Group_1__1__Impl7083);
            rule__ImpliesExpression__RhsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImpliesExpressionAccess().getRhsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3461:1: rule__PrimaryExpression__Group__0 : rule__PrimaryExpression__Group__0__Impl rule__PrimaryExpression__Group__1 ;
    public final void rule__PrimaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3465:1: ( rule__PrimaryExpression__Group__0__Impl rule__PrimaryExpression__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3466:2: rule__PrimaryExpression__Group__0__Impl rule__PrimaryExpression__Group__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group__0__Impl_in_rule__PrimaryExpression__Group__07117);
            rule__PrimaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group__1_in_rule__PrimaryExpression__Group__07120);
            rule__PrimaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group__0"


    // $ANTLR start "rule__PrimaryExpression__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3473:1: rule__PrimaryExpression__Group__0__Impl : ( ( rule__PrimaryExpression__NegatedAssignment_0 )? ) ;
    public final void rule__PrimaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3477:1: ( ( ( rule__PrimaryExpression__NegatedAssignment_0 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3478:1: ( ( rule__PrimaryExpression__NegatedAssignment_0 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3478:1: ( ( rule__PrimaryExpression__NegatedAssignment_0 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3479:1: ( rule__PrimaryExpression__NegatedAssignment_0 )?
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNegatedAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3480:1: ( rule__PrimaryExpression__NegatedAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==60) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3480:2: rule__PrimaryExpression__NegatedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__NegatedAssignment_0_in_rule__PrimaryExpression__Group__0__Impl7147);
                    rule__PrimaryExpression__NegatedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimaryExpressionAccess().getNegatedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3490:1: rule__PrimaryExpression__Group__1 : rule__PrimaryExpression__Group__1__Impl ;
    public final void rule__PrimaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3494:1: ( rule__PrimaryExpression__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3495:2: rule__PrimaryExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group__1__Impl_in_rule__PrimaryExpression__Group__17178);
            rule__PrimaryExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group__1"


    // $ANTLR start "rule__PrimaryExpression__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3501:1: rule__PrimaryExpression__Group__1__Impl : ( ( rule__PrimaryExpression__Alternatives_1 ) ) ;
    public final void rule__PrimaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3505:1: ( ( ( rule__PrimaryExpression__Alternatives_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3506:1: ( ( rule__PrimaryExpression__Alternatives_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3506:1: ( ( rule__PrimaryExpression__Alternatives_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3507:1: ( rule__PrimaryExpression__Alternatives_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3508:1: ( rule__PrimaryExpression__Alternatives_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3508:2: rule__PrimaryExpression__Alternatives_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_1_in_rule__PrimaryExpression__Group__1__Impl7205);
            rule__PrimaryExpression__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1_1__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3522:1: rule__PrimaryExpression__Group_1_1__0 : rule__PrimaryExpression__Group_1_1__0__Impl rule__PrimaryExpression__Group_1_1__1 ;
    public final void rule__PrimaryExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3526:1: ( rule__PrimaryExpression__Group_1_1__0__Impl rule__PrimaryExpression__Group_1_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3527:2: rule__PrimaryExpression__Group_1_1__0__Impl rule__PrimaryExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1_1__0__Impl_in_rule__PrimaryExpression__Group_1_1__07239);
            rule__PrimaryExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1_1__1_in_rule__PrimaryExpression__Group_1_1__07242);
            rule__PrimaryExpression__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1_1__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3534:1: rule__PrimaryExpression__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3538:1: ( ( '(' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3539:1: ( '(' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3539:1: ( '(' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3540:1: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,51,FOLLOW_51_in_rule__PrimaryExpression__Group_1_1__0__Impl7270); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1_1__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3553:1: rule__PrimaryExpression__Group_1_1__1 : rule__PrimaryExpression__Group_1_1__1__Impl rule__PrimaryExpression__Group_1_1__2 ;
    public final void rule__PrimaryExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3557:1: ( rule__PrimaryExpression__Group_1_1__1__Impl rule__PrimaryExpression__Group_1_1__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3558:2: rule__PrimaryExpression__Group_1_1__1__Impl rule__PrimaryExpression__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1_1__1__Impl_in_rule__PrimaryExpression__Group_1_1__17301);
            rule__PrimaryExpression__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1_1__2_in_rule__PrimaryExpression__Group_1_1__17304);
            rule__PrimaryExpression__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1_1__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3565:1: rule__PrimaryExpression__Group_1_1__1__Impl : ( ( rule__PrimaryExpression__InnerAssignment_1_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3569:1: ( ( ( rule__PrimaryExpression__InnerAssignment_1_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3570:1: ( ( rule__PrimaryExpression__InnerAssignment_1_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3570:1: ( ( rule__PrimaryExpression__InnerAssignment_1_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3571:1: ( rule__PrimaryExpression__InnerAssignment_1_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getInnerAssignment_1_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3572:1: ( rule__PrimaryExpression__InnerAssignment_1_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3572:2: rule__PrimaryExpression__InnerAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__InnerAssignment_1_1_1_in_rule__PrimaryExpression__Group_1_1__1__Impl7331);
            rule__PrimaryExpression__InnerAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getInnerAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1_1__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3582:1: rule__PrimaryExpression__Group_1_1__2 : rule__PrimaryExpression__Group_1_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3586:1: ( rule__PrimaryExpression__Group_1_1__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3587:2: rule__PrimaryExpression__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1_1__2__Impl_in_rule__PrimaryExpression__Group_1_1__27361);
            rule__PrimaryExpression__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1_1__2"


    // $ANTLR start "rule__PrimaryExpression__Group_1_1__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3593:1: rule__PrimaryExpression__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3597:1: ( ( ')' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3598:1: ( ')' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3598:1: ( ')' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3599:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_1_2()); 
            match(input,52,FOLLOW_52_in_rule__PrimaryExpression__Group_1_1__2__Impl7389); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1_1__2__Impl"


    // $ANTLR start "rule__PredicateCall__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3618:1: rule__PredicateCall__Group__0 : rule__PredicateCall__Group__0__Impl rule__PredicateCall__Group__1 ;
    public final void rule__PredicateCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3622:1: ( rule__PredicateCall__Group__0__Impl rule__PredicateCall__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3623:2: rule__PredicateCall__Group__0__Impl rule__PredicateCall__Group__1
            {
            pushFollow(FOLLOW_rule__PredicateCall__Group__0__Impl_in_rule__PredicateCall__Group__07426);
            rule__PredicateCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateCall__Group__1_in_rule__PredicateCall__Group__07429);
            rule__PredicateCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateCall__Group__0"


    // $ANTLR start "rule__PredicateCall__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3630:1: rule__PredicateCall__Group__0__Impl : ( ( rule__PredicateCall__Alternatives_0 ) ) ;
    public final void rule__PredicateCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3634:1: ( ( ( rule__PredicateCall__Alternatives_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3635:1: ( ( rule__PredicateCall__Alternatives_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3635:1: ( ( rule__PredicateCall__Alternatives_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3636:1: ( rule__PredicateCall__Alternatives_0 )
            {
             before(grammarAccess.getPredicateCallAccess().getAlternatives_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3637:1: ( rule__PredicateCall__Alternatives_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3637:2: rule__PredicateCall__Alternatives_0
            {
            pushFollow(FOLLOW_rule__PredicateCall__Alternatives_0_in_rule__PredicateCall__Group__0__Impl7456);
            rule__PredicateCall__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateCallAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateCall__Group__0__Impl"


    // $ANTLR start "rule__PredicateCall__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3647:1: rule__PredicateCall__Group__1 : rule__PredicateCall__Group__1__Impl ;
    public final void rule__PredicateCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3651:1: ( rule__PredicateCall__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3652:2: rule__PredicateCall__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PredicateCall__Group__1__Impl_in_rule__PredicateCall__Group__17486);
            rule__PredicateCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateCall__Group__1"


    // $ANTLR start "rule__PredicateCall__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3658:1: rule__PredicateCall__Group__1__Impl : ( ( rule__PredicateCall__Group_1__0 )? ) ;
    public final void rule__PredicateCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3662:1: ( ( ( rule__PredicateCall__Group_1__0 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3663:1: ( ( rule__PredicateCall__Group_1__0 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3663:1: ( ( rule__PredicateCall__Group_1__0 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3664:1: ( rule__PredicateCall__Group_1__0 )?
            {
             before(grammarAccess.getPredicateCallAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3665:1: ( rule__PredicateCall__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3665:2: rule__PredicateCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PredicateCall__Group_1__0_in_rule__PredicateCall__Group__1__Impl7513);
                    rule__PredicateCall__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredicateCallAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateCall__Group__1__Impl"


    // $ANTLR start "rule__PredicateCall__Group_1__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3679:1: rule__PredicateCall__Group_1__0 : rule__PredicateCall__Group_1__0__Impl rule__PredicateCall__Group_1__1 ;
    public final void rule__PredicateCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3683:1: ( rule__PredicateCall__Group_1__0__Impl rule__PredicateCall__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3684:2: rule__PredicateCall__Group_1__0__Impl rule__PredicateCall__Group_1__1
            {
            pushFollow(FOLLOW_rule__PredicateCall__Group_1__0__Impl_in_rule__PredicateCall__Group_1__07548);
            rule__PredicateCall__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateCall__Group_1__1_in_rule__PredicateCall__Group_1__07551);
            rule__PredicateCall__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateCall__Group_1__0"


    // $ANTLR start "rule__PredicateCall__Group_1__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3691:1: rule__PredicateCall__Group_1__0__Impl : ( '[' ) ;
    public final void rule__PredicateCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3695:1: ( ( '[' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3696:1: ( '[' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3696:1: ( '[' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3697:1: '['
            {
             before(grammarAccess.getPredicateCallAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,53,FOLLOW_53_in_rule__PredicateCall__Group_1__0__Impl7579); 
             after(grammarAccess.getPredicateCallAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateCall__Group_1__0__Impl"


    // $ANTLR start "rule__PredicateCall__Group_1__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3710:1: rule__PredicateCall__Group_1__1 : rule__PredicateCall__Group_1__1__Impl rule__PredicateCall__Group_1__2 ;
    public final void rule__PredicateCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3714:1: ( rule__PredicateCall__Group_1__1__Impl rule__PredicateCall__Group_1__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3715:2: rule__PredicateCall__Group_1__1__Impl rule__PredicateCall__Group_1__2
            {
            pushFollow(FOLLOW_rule__PredicateCall__Group_1__1__Impl_in_rule__PredicateCall__Group_1__17610);
            rule__PredicateCall__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateCall__Group_1__2_in_rule__PredicateCall__Group_1__17613);
            rule__PredicateCall__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateCall__Group_1__1"


    // $ANTLR start "rule__PredicateCall__Group_1__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3722:1: rule__PredicateCall__Group_1__1__Impl : ( ( rule__PredicateCall__LabelAssignment_1_1 ) ) ;
    public final void rule__PredicateCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3726:1: ( ( ( rule__PredicateCall__LabelAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3727:1: ( ( rule__PredicateCall__LabelAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3727:1: ( ( rule__PredicateCall__LabelAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3728:1: ( rule__PredicateCall__LabelAssignment_1_1 )
            {
             before(grammarAccess.getPredicateCallAccess().getLabelAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3729:1: ( rule__PredicateCall__LabelAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3729:2: rule__PredicateCall__LabelAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PredicateCall__LabelAssignment_1_1_in_rule__PredicateCall__Group_1__1__Impl7640);
            rule__PredicateCall__LabelAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateCallAccess().getLabelAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateCall__Group_1__1__Impl"


    // $ANTLR start "rule__PredicateCall__Group_1__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3739:1: rule__PredicateCall__Group_1__2 : rule__PredicateCall__Group_1__2__Impl ;
    public final void rule__PredicateCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3743:1: ( rule__PredicateCall__Group_1__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3744:2: rule__PredicateCall__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PredicateCall__Group_1__2__Impl_in_rule__PredicateCall__Group_1__27670);
            rule__PredicateCall__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateCall__Group_1__2"


    // $ANTLR start "rule__PredicateCall__Group_1__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3750:1: rule__PredicateCall__Group_1__2__Impl : ( ']' ) ;
    public final void rule__PredicateCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3754:1: ( ( ']' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3755:1: ( ']' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3755:1: ( ']' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3756:1: ']'
            {
             before(grammarAccess.getPredicateCallAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,54,FOLLOW_54_in_rule__PredicateCall__Group_1__2__Impl7698); 
             after(grammarAccess.getPredicateCallAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateCall__Group_1__2__Impl"


    // $ANTLR start "rule__PropertyRelationPredicate__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3775:1: rule__PropertyRelationPredicate__Group__0 : rule__PropertyRelationPredicate__Group__0__Impl rule__PropertyRelationPredicate__Group__1 ;
    public final void rule__PropertyRelationPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3779:1: ( rule__PropertyRelationPredicate__Group__0__Impl rule__PropertyRelationPredicate__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3780:2: rule__PropertyRelationPredicate__Group__0__Impl rule__PropertyRelationPredicate__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyRelationPredicate__Group__0__Impl_in_rule__PropertyRelationPredicate__Group__07735);
            rule__PropertyRelationPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyRelationPredicate__Group__1_in_rule__PropertyRelationPredicate__Group__07738);
            rule__PropertyRelationPredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRelationPredicate__Group__0"


    // $ANTLR start "rule__PropertyRelationPredicate__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3787:1: rule__PropertyRelationPredicate__Group__0__Impl : ( ( rule__PropertyRelationPredicate__LhsAssignment_0 ) ) ;
    public final void rule__PropertyRelationPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3791:1: ( ( ( rule__PropertyRelationPredicate__LhsAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3792:1: ( ( rule__PropertyRelationPredicate__LhsAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3792:1: ( ( rule__PropertyRelationPredicate__LhsAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3793:1: ( rule__PropertyRelationPredicate__LhsAssignment_0 )
            {
             before(grammarAccess.getPropertyRelationPredicateAccess().getLhsAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3794:1: ( rule__PropertyRelationPredicate__LhsAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3794:2: rule__PropertyRelationPredicate__LhsAssignment_0
            {
            pushFollow(FOLLOW_rule__PropertyRelationPredicate__LhsAssignment_0_in_rule__PropertyRelationPredicate__Group__0__Impl7765);
            rule__PropertyRelationPredicate__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRelationPredicateAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRelationPredicate__Group__0__Impl"


    // $ANTLR start "rule__PropertyRelationPredicate__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3804:1: rule__PropertyRelationPredicate__Group__1 : rule__PropertyRelationPredicate__Group__1__Impl rule__PropertyRelationPredicate__Group__2 ;
    public final void rule__PropertyRelationPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3808:1: ( rule__PropertyRelationPredicate__Group__1__Impl rule__PropertyRelationPredicate__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3809:2: rule__PropertyRelationPredicate__Group__1__Impl rule__PropertyRelationPredicate__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyRelationPredicate__Group__1__Impl_in_rule__PropertyRelationPredicate__Group__17795);
            rule__PropertyRelationPredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyRelationPredicate__Group__2_in_rule__PropertyRelationPredicate__Group__17798);
            rule__PropertyRelationPredicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRelationPredicate__Group__1"


    // $ANTLR start "rule__PropertyRelationPredicate__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3816:1: rule__PropertyRelationPredicate__Group__1__Impl : ( ( rule__PropertyRelationPredicate__RelationAssignment_1 ) ) ;
    public final void rule__PropertyRelationPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3820:1: ( ( ( rule__PropertyRelationPredicate__RelationAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3821:1: ( ( rule__PropertyRelationPredicate__RelationAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3821:1: ( ( rule__PropertyRelationPredicate__RelationAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3822:1: ( rule__PropertyRelationPredicate__RelationAssignment_1 )
            {
             before(grammarAccess.getPropertyRelationPredicateAccess().getRelationAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3823:1: ( rule__PropertyRelationPredicate__RelationAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3823:2: rule__PropertyRelationPredicate__RelationAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyRelationPredicate__RelationAssignment_1_in_rule__PropertyRelationPredicate__Group__1__Impl7825);
            rule__PropertyRelationPredicate__RelationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRelationPredicateAccess().getRelationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRelationPredicate__Group__1__Impl"


    // $ANTLR start "rule__PropertyRelationPredicate__Group__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3833:1: rule__PropertyRelationPredicate__Group__2 : rule__PropertyRelationPredicate__Group__2__Impl ;
    public final void rule__PropertyRelationPredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3837:1: ( rule__PropertyRelationPredicate__Group__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3838:2: rule__PropertyRelationPredicate__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyRelationPredicate__Group__2__Impl_in_rule__PropertyRelationPredicate__Group__27855);
            rule__PropertyRelationPredicate__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRelationPredicate__Group__2"


    // $ANTLR start "rule__PropertyRelationPredicate__Group__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3844:1: rule__PropertyRelationPredicate__Group__2__Impl : ( ( rule__PropertyRelationPredicate__RhsAssignment_2 ) ) ;
    public final void rule__PropertyRelationPredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3848:1: ( ( ( rule__PropertyRelationPredicate__RhsAssignment_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3849:1: ( ( rule__PropertyRelationPredicate__RhsAssignment_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3849:1: ( ( rule__PropertyRelationPredicate__RhsAssignment_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3850:1: ( rule__PropertyRelationPredicate__RhsAssignment_2 )
            {
             before(grammarAccess.getPropertyRelationPredicateAccess().getRhsAssignment_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3851:1: ( rule__PropertyRelationPredicate__RhsAssignment_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3851:2: rule__PropertyRelationPredicate__RhsAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyRelationPredicate__RhsAssignment_2_in_rule__PropertyRelationPredicate__Group__2__Impl7882);
            rule__PropertyRelationPredicate__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRelationPredicateAccess().getRhsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRelationPredicate__Group__2__Impl"


    // $ANTLR start "rule__PredicateReference__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3867:1: rule__PredicateReference__Group__0 : rule__PredicateReference__Group__0__Impl rule__PredicateReference__Group__1 ;
    public final void rule__PredicateReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3871:1: ( rule__PredicateReference__Group__0__Impl rule__PredicateReference__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3872:2: rule__PredicateReference__Group__0__Impl rule__PredicateReference__Group__1
            {
            pushFollow(FOLLOW_rule__PredicateReference__Group__0__Impl_in_rule__PredicateReference__Group__07918);
            rule__PredicateReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateReference__Group__1_in_rule__PredicateReference__Group__07921);
            rule__PredicateReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateReference__Group__0"


    // $ANTLR start "rule__PredicateReference__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3879:1: rule__PredicateReference__Group__0__Impl : ( ( rule__PredicateReference__ReferenceAssignment_0 ) ) ;
    public final void rule__PredicateReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3883:1: ( ( ( rule__PredicateReference__ReferenceAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3884:1: ( ( rule__PredicateReference__ReferenceAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3884:1: ( ( rule__PredicateReference__ReferenceAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3885:1: ( rule__PredicateReference__ReferenceAssignment_0 )
            {
             before(grammarAccess.getPredicateReferenceAccess().getReferenceAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3886:1: ( rule__PredicateReference__ReferenceAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3886:2: rule__PredicateReference__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__PredicateReference__ReferenceAssignment_0_in_rule__PredicateReference__Group__0__Impl7948);
            rule__PredicateReference__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateReferenceAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateReference__Group__0__Impl"


    // $ANTLR start "rule__PredicateReference__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3896:1: rule__PredicateReference__Group__1 : rule__PredicateReference__Group__1__Impl ;
    public final void rule__PredicateReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3900:1: ( rule__PredicateReference__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3901:2: rule__PredicateReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PredicateReference__Group__1__Impl_in_rule__PredicateReference__Group__17978);
            rule__PredicateReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateReference__Group__1"


    // $ANTLR start "rule__PredicateReference__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3907:1: rule__PredicateReference__Group__1__Impl : ( ( rule__PredicateReference__ArgumentsAssignment_1 ) ) ;
    public final void rule__PredicateReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3911:1: ( ( ( rule__PredicateReference__ArgumentsAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3912:1: ( ( rule__PredicateReference__ArgumentsAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3912:1: ( ( rule__PredicateReference__ArgumentsAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3913:1: ( rule__PredicateReference__ArgumentsAssignment_1 )
            {
             before(grammarAccess.getPredicateReferenceAccess().getArgumentsAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3914:1: ( rule__PredicateReference__ArgumentsAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3914:2: rule__PredicateReference__ArgumentsAssignment_1
            {
            pushFollow(FOLLOW_rule__PredicateReference__ArgumentsAssignment_1_in_rule__PredicateReference__Group__1__Impl8005);
            rule__PredicateReference__ArgumentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateReferenceAccess().getArgumentsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateReference__Group__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3928:1: rule__ParameterList__Group__0 : rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3932:1: ( rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3933:2: rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__0__Impl_in_rule__ParameterList__Group__08039);
            rule__ParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__08042);
            rule__ParameterList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__0"


    // $ANTLR start "rule__ParameterList__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3940:1: rule__ParameterList__Group__0__Impl : ( ( rule__ParameterList__ParametersAssignment_0 ) ) ;
    public final void rule__ParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3944:1: ( ( ( rule__ParameterList__ParametersAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3945:1: ( ( rule__ParameterList__ParametersAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3945:1: ( ( rule__ParameterList__ParametersAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3946:1: ( rule__ParameterList__ParametersAssignment_0 )
            {
             before(grammarAccess.getParameterListAccess().getParametersAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3947:1: ( rule__ParameterList__ParametersAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3947:2: rule__ParameterList__ParametersAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterList__ParametersAssignment_0_in_rule__ParameterList__Group__0__Impl8069);
            rule__ParameterList__ParametersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getParametersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__0__Impl"


    // $ANTLR start "rule__ParameterList__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3957:1: rule__ParameterList__Group__1 : rule__ParameterList__Group__1__Impl ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3961:1: ( rule__ParameterList__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3962:2: rule__ParameterList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__1__Impl_in_rule__ParameterList__Group__18099);
            rule__ParameterList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__1"


    // $ANTLR start "rule__ParameterList__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3968:1: rule__ParameterList__Group__1__Impl : ( ( rule__ParameterList__Group_1__0 )* ) ;
    public final void rule__ParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3972:1: ( ( ( rule__ParameterList__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3973:1: ( ( rule__ParameterList__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3973:1: ( ( rule__ParameterList__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3974:1: ( rule__ParameterList__Group_1__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3975:1: ( rule__ParameterList__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==13) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3975:2: rule__ParameterList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ParameterList__Group_1__0_in_rule__ParameterList__Group__1__Impl8126);
            	    rule__ParameterList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getParameterListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__1__Impl"


    // $ANTLR start "rule__ParameterList__Group_1__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3989:1: rule__ParameterList__Group_1__0 : rule__ParameterList__Group_1__0__Impl rule__ParameterList__Group_1__1 ;
    public final void rule__ParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3993:1: ( rule__ParameterList__Group_1__0__Impl rule__ParameterList__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3994:2: rule__ParameterList__Group_1__0__Impl rule__ParameterList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParameterList__Group_1__0__Impl_in_rule__ParameterList__Group_1__08161);
            rule__ParameterList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group_1__1_in_rule__ParameterList__Group_1__08164);
            rule__ParameterList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_1__0"


    // $ANTLR start "rule__ParameterList__Group_1__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4001:1: rule__ParameterList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ParameterList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4005:1: ( ( ',' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4006:1: ( ',' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4006:1: ( ',' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4007:1: ','
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__ParameterList__Group_1__0__Impl8192); 
             after(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterList__Group_1__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4020:1: rule__ParameterList__Group_1__1 : rule__ParameterList__Group_1__1__Impl ;
    public final void rule__ParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4024:1: ( rule__ParameterList__Group_1__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4025:2: rule__ParameterList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterList__Group_1__1__Impl_in_rule__ParameterList__Group_1__18223);
            rule__ParameterList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_1__1"


    // $ANTLR start "rule__ParameterList__Group_1__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4031:1: rule__ParameterList__Group_1__1__Impl : ( ( rule__ParameterList__ParametersAssignment_1_1 ) ) ;
    public final void rule__ParameterList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4035:1: ( ( ( rule__ParameterList__ParametersAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4036:1: ( ( rule__ParameterList__ParametersAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4036:1: ( ( rule__ParameterList__ParametersAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4037:1: ( rule__ParameterList__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getParameterListAccess().getParametersAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4038:1: ( rule__ParameterList__ParametersAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4038:2: rule__ParameterList__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParameterList__ParametersAssignment_1_1_in_rule__ParameterList__Group_1__1__Impl8250);
            rule__ParameterList__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_1__1__Impl"


    // $ANTLR start "rule__ArgumentList__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4052:1: rule__ArgumentList__Group__0 : rule__ArgumentList__Group__0__Impl rule__ArgumentList__Group__1 ;
    public final void rule__ArgumentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4056:1: ( rule__ArgumentList__Group__0__Impl rule__ArgumentList__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4057:2: rule__ArgumentList__Group__0__Impl rule__ArgumentList__Group__1
            {
            pushFollow(FOLLOW_rule__ArgumentList__Group__0__Impl_in_rule__ArgumentList__Group__08284);
            rule__ArgumentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArgumentList__Group__1_in_rule__ArgumentList__Group__08287);
            rule__ArgumentList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group__0"


    // $ANTLR start "rule__ArgumentList__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4064:1: rule__ArgumentList__Group__0__Impl : ( ( rule__ArgumentList__ArgumentsAssignment_0 ) ) ;
    public final void rule__ArgumentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4068:1: ( ( ( rule__ArgumentList__ArgumentsAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4069:1: ( ( rule__ArgumentList__ArgumentsAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4069:1: ( ( rule__ArgumentList__ArgumentsAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4070:1: ( rule__ArgumentList__ArgumentsAssignment_0 )
            {
             before(grammarAccess.getArgumentListAccess().getArgumentsAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4071:1: ( rule__ArgumentList__ArgumentsAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4071:2: rule__ArgumentList__ArgumentsAssignment_0
            {
            pushFollow(FOLLOW_rule__ArgumentList__ArgumentsAssignment_0_in_rule__ArgumentList__Group__0__Impl8314);
            rule__ArgumentList__ArgumentsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentListAccess().getArgumentsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group__0__Impl"


    // $ANTLR start "rule__ArgumentList__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4081:1: rule__ArgumentList__Group__1 : rule__ArgumentList__Group__1__Impl ;
    public final void rule__ArgumentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4085:1: ( rule__ArgumentList__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4086:2: rule__ArgumentList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArgumentList__Group__1__Impl_in_rule__ArgumentList__Group__18344);
            rule__ArgumentList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group__1"


    // $ANTLR start "rule__ArgumentList__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4092:1: rule__ArgumentList__Group__1__Impl : ( ( rule__ArgumentList__Group_1__0 )* ) ;
    public final void rule__ArgumentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4096:1: ( ( ( rule__ArgumentList__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4097:1: ( ( rule__ArgumentList__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4097:1: ( ( rule__ArgumentList__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4098:1: ( rule__ArgumentList__Group_1__0 )*
            {
             before(grammarAccess.getArgumentListAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4099:1: ( rule__ArgumentList__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==13) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==RULE_ID) ) {
                        int LA33_3 = input.LA(3);

                        if ( (LA33_3==RULE_ID) ) {
                            int LA33_4 = input.LA(4);

                            if ( ((LA33_4>=22 && LA33_4<=24)) ) {
                                alt33=1;
                            }


                        }
                        else if ( (LA33_3==EOF||(LA33_3>=13 && LA33_3<=17)||(LA33_3>=20 && LA33_3<=21)||LA33_3==39||LA33_3==41||LA33_3==44||LA33_3==47||(LA33_3>=52 && LA33_3<=53)) ) {
                            alt33=1;
                        }


                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4099:2: rule__ArgumentList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ArgumentList__Group_1__0_in_rule__ArgumentList__Group__1__Impl8371);
            	    rule__ArgumentList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getArgumentListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group__1__Impl"


    // $ANTLR start "rule__ArgumentList__Group_1__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4113:1: rule__ArgumentList__Group_1__0 : rule__ArgumentList__Group_1__0__Impl rule__ArgumentList__Group_1__1 ;
    public final void rule__ArgumentList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4117:1: ( rule__ArgumentList__Group_1__0__Impl rule__ArgumentList__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4118:2: rule__ArgumentList__Group_1__0__Impl rule__ArgumentList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ArgumentList__Group_1__0__Impl_in_rule__ArgumentList__Group_1__08406);
            rule__ArgumentList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArgumentList__Group_1__1_in_rule__ArgumentList__Group_1__08409);
            rule__ArgumentList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group_1__0"


    // $ANTLR start "rule__ArgumentList__Group_1__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4125:1: rule__ArgumentList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ArgumentList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4129:1: ( ( ',' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4130:1: ( ',' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4130:1: ( ',' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4131:1: ','
            {
             before(grammarAccess.getArgumentListAccess().getCommaKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__ArgumentList__Group_1__0__Impl8437); 
             after(grammarAccess.getArgumentListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group_1__0__Impl"


    // $ANTLR start "rule__ArgumentList__Group_1__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4144:1: rule__ArgumentList__Group_1__1 : rule__ArgumentList__Group_1__1__Impl ;
    public final void rule__ArgumentList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4148:1: ( rule__ArgumentList__Group_1__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4149:2: rule__ArgumentList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ArgumentList__Group_1__1__Impl_in_rule__ArgumentList__Group_1__18468);
            rule__ArgumentList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group_1__1"


    // $ANTLR start "rule__ArgumentList__Group_1__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4155:1: rule__ArgumentList__Group_1__1__Impl : ( ( rule__ArgumentList__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__ArgumentList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4159:1: ( ( ( rule__ArgumentList__ArgumentsAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4160:1: ( ( rule__ArgumentList__ArgumentsAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4160:1: ( ( rule__ArgumentList__ArgumentsAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4161:1: ( rule__ArgumentList__ArgumentsAssignment_1_1 )
            {
             before(grammarAccess.getArgumentListAccess().getArgumentsAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4162:1: ( rule__ArgumentList__ArgumentsAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4162:2: rule__ArgumentList__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ArgumentList__ArgumentsAssignment_1_1_in_rule__ArgumentList__Group_1__1__Impl8495);
            rule__ArgumentList__ArgumentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentListAccess().getArgumentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group_1__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4176:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4180:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4181:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__08529);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__08532);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4188:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__ReferenceAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4192:1: ( ( ( rule__Assignment__ReferenceAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4193:1: ( ( rule__Assignment__ReferenceAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4193:1: ( ( rule__Assignment__ReferenceAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4194:1: ( rule__Assignment__ReferenceAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getReferenceAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4195:1: ( rule__Assignment__ReferenceAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4195:2: rule__Assignment__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__ReferenceAssignment_0_in_rule__Assignment__Group__0__Impl8559);
            rule__Assignment__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4205:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4209:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4210:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__18589);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__18592);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4217:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Alternatives_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4221:1: ( ( ( rule__Assignment__Alternatives_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4222:1: ( ( rule__Assignment__Alternatives_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4222:1: ( ( rule__Assignment__Alternatives_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4223:1: ( rule__Assignment__Alternatives_1 )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4224:1: ( rule__Assignment__Alternatives_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4224:2: rule__Assignment__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Assignment__Alternatives_1_in_rule__Assignment__Group__1__Impl8619);
            rule__Assignment__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4234:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4238:1: ( rule__Assignment__Group__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4239:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__28649);
            rule__Assignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4245:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4249:1: ( ( ( rule__Assignment__ExpressionAssignment_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4250:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4250:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4251:1: ( rule__Assignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4252:1: ( rule__Assignment__ExpressionAssignment_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4252:2: rule__Assignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_in_rule__Assignment__Group__2__Impl8676);
            rule__Assignment__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__AssignmentList__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4268:1: rule__AssignmentList__Group__0 : rule__AssignmentList__Group__0__Impl rule__AssignmentList__Group__1 ;
    public final void rule__AssignmentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4272:1: ( rule__AssignmentList__Group__0__Impl rule__AssignmentList__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4273:2: rule__AssignmentList__Group__0__Impl rule__AssignmentList__Group__1
            {
            pushFollow(FOLLOW_rule__AssignmentList__Group__0__Impl_in_rule__AssignmentList__Group__08712);
            rule__AssignmentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssignmentList__Group__1_in_rule__AssignmentList__Group__08715);
            rule__AssignmentList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentList__Group__0"


    // $ANTLR start "rule__AssignmentList__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4280:1: rule__AssignmentList__Group__0__Impl : ( ( rule__AssignmentList__AssignmentsAssignment_0 ) ) ;
    public final void rule__AssignmentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4284:1: ( ( ( rule__AssignmentList__AssignmentsAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4285:1: ( ( rule__AssignmentList__AssignmentsAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4285:1: ( ( rule__AssignmentList__AssignmentsAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4286:1: ( rule__AssignmentList__AssignmentsAssignment_0 )
            {
             before(grammarAccess.getAssignmentListAccess().getAssignmentsAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4287:1: ( rule__AssignmentList__AssignmentsAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4287:2: rule__AssignmentList__AssignmentsAssignment_0
            {
            pushFollow(FOLLOW_rule__AssignmentList__AssignmentsAssignment_0_in_rule__AssignmentList__Group__0__Impl8742);
            rule__AssignmentList__AssignmentsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentListAccess().getAssignmentsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentList__Group__0__Impl"


    // $ANTLR start "rule__AssignmentList__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4297:1: rule__AssignmentList__Group__1 : rule__AssignmentList__Group__1__Impl ;
    public final void rule__AssignmentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4301:1: ( rule__AssignmentList__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4302:2: rule__AssignmentList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentList__Group__1__Impl_in_rule__AssignmentList__Group__18772);
            rule__AssignmentList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentList__Group__1"


    // $ANTLR start "rule__AssignmentList__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4308:1: rule__AssignmentList__Group__1__Impl : ( ( rule__AssignmentList__Group_1__0 )* ) ;
    public final void rule__AssignmentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4312:1: ( ( ( rule__AssignmentList__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4313:1: ( ( rule__AssignmentList__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4313:1: ( ( rule__AssignmentList__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4314:1: ( rule__AssignmentList__Group_1__0 )*
            {
             before(grammarAccess.getAssignmentListAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4315:1: ( rule__AssignmentList__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==13) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4315:2: rule__AssignmentList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AssignmentList__Group_1__0_in_rule__AssignmentList__Group__1__Impl8799);
            	    rule__AssignmentList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getAssignmentListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentList__Group__1__Impl"


    // $ANTLR start "rule__AssignmentList__Group_1__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4329:1: rule__AssignmentList__Group_1__0 : rule__AssignmentList__Group_1__0__Impl rule__AssignmentList__Group_1__1 ;
    public final void rule__AssignmentList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4333:1: ( rule__AssignmentList__Group_1__0__Impl rule__AssignmentList__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4334:2: rule__AssignmentList__Group_1__0__Impl rule__AssignmentList__Group_1__1
            {
            pushFollow(FOLLOW_rule__AssignmentList__Group_1__0__Impl_in_rule__AssignmentList__Group_1__08834);
            rule__AssignmentList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssignmentList__Group_1__1_in_rule__AssignmentList__Group_1__08837);
            rule__AssignmentList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentList__Group_1__0"


    // $ANTLR start "rule__AssignmentList__Group_1__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4341:1: rule__AssignmentList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AssignmentList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4345:1: ( ( ',' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4346:1: ( ',' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4346:1: ( ',' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4347:1: ','
            {
             before(grammarAccess.getAssignmentListAccess().getCommaKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__AssignmentList__Group_1__0__Impl8865); 
             after(grammarAccess.getAssignmentListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentList__Group_1__0__Impl"


    // $ANTLR start "rule__AssignmentList__Group_1__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4360:1: rule__AssignmentList__Group_1__1 : rule__AssignmentList__Group_1__1__Impl ;
    public final void rule__AssignmentList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4364:1: ( rule__AssignmentList__Group_1__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4365:2: rule__AssignmentList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentList__Group_1__1__Impl_in_rule__AssignmentList__Group_1__18896);
            rule__AssignmentList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentList__Group_1__1"


    // $ANTLR start "rule__AssignmentList__Group_1__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4371:1: rule__AssignmentList__Group_1__1__Impl : ( ( rule__AssignmentList__AssignmentsAssignment_1_1 ) ) ;
    public final void rule__AssignmentList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4375:1: ( ( ( rule__AssignmentList__AssignmentsAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4376:1: ( ( rule__AssignmentList__AssignmentsAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4376:1: ( ( rule__AssignmentList__AssignmentsAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4377:1: ( rule__AssignmentList__AssignmentsAssignment_1_1 )
            {
             before(grammarAccess.getAssignmentListAccess().getAssignmentsAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4378:1: ( rule__AssignmentList__AssignmentsAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4378:2: rule__AssignmentList__AssignmentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AssignmentList__AssignmentsAssignment_1_1_in_rule__AssignmentList__Group_1__1__Impl8923);
            rule__AssignmentList__AssignmentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentListAccess().getAssignmentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentList__Group_1__1__Impl"


    // $ANTLR start "rule__Quantification__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4392:1: rule__Quantification__Group__0 : rule__Quantification__Group__0__Impl rule__Quantification__Group__1 ;
    public final void rule__Quantification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4396:1: ( rule__Quantification__Group__0__Impl rule__Quantification__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4397:2: rule__Quantification__Group__0__Impl rule__Quantification__Group__1
            {
            pushFollow(FOLLOW_rule__Quantification__Group__0__Impl_in_rule__Quantification__Group__08957);
            rule__Quantification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantification__Group__1_in_rule__Quantification__Group__08960);
            rule__Quantification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantification__Group__0"


    // $ANTLR start "rule__Quantification__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4404:1: rule__Quantification__Group__0__Impl : ( ( rule__Quantification__QuantorAssignment_0 ) ) ;
    public final void rule__Quantification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4408:1: ( ( ( rule__Quantification__QuantorAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4409:1: ( ( rule__Quantification__QuantorAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4409:1: ( ( rule__Quantification__QuantorAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4410:1: ( rule__Quantification__QuantorAssignment_0 )
            {
             before(grammarAccess.getQuantificationAccess().getQuantorAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4411:1: ( rule__Quantification__QuantorAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4411:2: rule__Quantification__QuantorAssignment_0
            {
            pushFollow(FOLLOW_rule__Quantification__QuantorAssignment_0_in_rule__Quantification__Group__0__Impl8987);
            rule__Quantification__QuantorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuantificationAccess().getQuantorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantification__Group__0__Impl"


    // $ANTLR start "rule__Quantification__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4421:1: rule__Quantification__Group__1 : rule__Quantification__Group__1__Impl rule__Quantification__Group__2 ;
    public final void rule__Quantification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4425:1: ( rule__Quantification__Group__1__Impl rule__Quantification__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4426:2: rule__Quantification__Group__1__Impl rule__Quantification__Group__2
            {
            pushFollow(FOLLOW_rule__Quantification__Group__1__Impl_in_rule__Quantification__Group__19017);
            rule__Quantification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantification__Group__2_in_rule__Quantification__Group__19020);
            rule__Quantification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantification__Group__1"


    // $ANTLR start "rule__Quantification__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4433:1: rule__Quantification__Group__1__Impl : ( ( rule__Quantification__NodeAssignment_1 ) ) ;
    public final void rule__Quantification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4437:1: ( ( ( rule__Quantification__NodeAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4438:1: ( ( rule__Quantification__NodeAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4438:1: ( ( rule__Quantification__NodeAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4439:1: ( rule__Quantification__NodeAssignment_1 )
            {
             before(grammarAccess.getQuantificationAccess().getNodeAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4440:1: ( rule__Quantification__NodeAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4440:2: rule__Quantification__NodeAssignment_1
            {
            pushFollow(FOLLOW_rule__Quantification__NodeAssignment_1_in_rule__Quantification__Group__1__Impl9047);
            rule__Quantification__NodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantificationAccess().getNodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantification__Group__1__Impl"


    // $ANTLR start "rule__Quantification__Group__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4450:1: rule__Quantification__Group__2 : rule__Quantification__Group__2__Impl rule__Quantification__Group__3 ;
    public final void rule__Quantification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4454:1: ( rule__Quantification__Group__2__Impl rule__Quantification__Group__3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4455:2: rule__Quantification__Group__2__Impl rule__Quantification__Group__3
            {
            pushFollow(FOLLOW_rule__Quantification__Group__2__Impl_in_rule__Quantification__Group__29077);
            rule__Quantification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantification__Group__3_in_rule__Quantification__Group__29080);
            rule__Quantification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantification__Group__2"


    // $ANTLR start "rule__Quantification__Group__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4462:1: rule__Quantification__Group__2__Impl : ( 'in' ) ;
    public final void rule__Quantification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4466:1: ( ( 'in' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4467:1: ( 'in' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4467:1: ( 'in' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4468:1: 'in'
            {
             before(grammarAccess.getQuantificationAccess().getInKeyword_2()); 
            match(input,55,FOLLOW_55_in_rule__Quantification__Group__2__Impl9108); 
             after(grammarAccess.getQuantificationAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantification__Group__2__Impl"


    // $ANTLR start "rule__Quantification__Group__3"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4481:1: rule__Quantification__Group__3 : rule__Quantification__Group__3__Impl ;
    public final void rule__Quantification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4485:1: ( rule__Quantification__Group__3__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4486:2: rule__Quantification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Quantification__Group__3__Impl_in_rule__Quantification__Group__39139);
            rule__Quantification__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantification__Group__3"


    // $ANTLR start "rule__Quantification__Group__3__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4492:1: rule__Quantification__Group__3__Impl : ( ( rule__Quantification__NodeSetAssignment_3 ) ) ;
    public final void rule__Quantification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4496:1: ( ( ( rule__Quantification__NodeSetAssignment_3 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4497:1: ( ( rule__Quantification__NodeSetAssignment_3 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4497:1: ( ( rule__Quantification__NodeSetAssignment_3 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4498:1: ( rule__Quantification__NodeSetAssignment_3 )
            {
             before(grammarAccess.getQuantificationAccess().getNodeSetAssignment_3()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4499:1: ( rule__Quantification__NodeSetAssignment_3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4499:2: rule__Quantification__NodeSetAssignment_3
            {
            pushFollow(FOLLOW_rule__Quantification__NodeSetAssignment_3_in_rule__Quantification__Group__3__Impl9166);
            rule__Quantification__NodeSetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuantificationAccess().getNodeSetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantification__Group__3__Impl"


    // $ANTLR start "rule__QuantificationList__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4517:1: rule__QuantificationList__Group__0 : rule__QuantificationList__Group__0__Impl rule__QuantificationList__Group__1 ;
    public final void rule__QuantificationList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4521:1: ( rule__QuantificationList__Group__0__Impl rule__QuantificationList__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4522:2: rule__QuantificationList__Group__0__Impl rule__QuantificationList__Group__1
            {
            pushFollow(FOLLOW_rule__QuantificationList__Group__0__Impl_in_rule__QuantificationList__Group__09204);
            rule__QuantificationList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantificationList__Group__1_in_rule__QuantificationList__Group__09207);
            rule__QuantificationList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantificationList__Group__0"


    // $ANTLR start "rule__QuantificationList__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4529:1: rule__QuantificationList__Group__0__Impl : ( ( rule__QuantificationList__QuantificationsAssignment_0 ) ) ;
    public final void rule__QuantificationList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4533:1: ( ( ( rule__QuantificationList__QuantificationsAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4534:1: ( ( rule__QuantificationList__QuantificationsAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4534:1: ( ( rule__QuantificationList__QuantificationsAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4535:1: ( rule__QuantificationList__QuantificationsAssignment_0 )
            {
             before(grammarAccess.getQuantificationListAccess().getQuantificationsAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4536:1: ( rule__QuantificationList__QuantificationsAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4536:2: rule__QuantificationList__QuantificationsAssignment_0
            {
            pushFollow(FOLLOW_rule__QuantificationList__QuantificationsAssignment_0_in_rule__QuantificationList__Group__0__Impl9234);
            rule__QuantificationList__QuantificationsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuantificationListAccess().getQuantificationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantificationList__Group__0__Impl"


    // $ANTLR start "rule__QuantificationList__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4546:1: rule__QuantificationList__Group__1 : rule__QuantificationList__Group__1__Impl ;
    public final void rule__QuantificationList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4550:1: ( rule__QuantificationList__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4551:2: rule__QuantificationList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QuantificationList__Group__1__Impl_in_rule__QuantificationList__Group__19264);
            rule__QuantificationList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantificationList__Group__1"


    // $ANTLR start "rule__QuantificationList__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4557:1: rule__QuantificationList__Group__1__Impl : ( ( rule__QuantificationList__Group_1__0 )* ) ;
    public final void rule__QuantificationList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4561:1: ( ( ( rule__QuantificationList__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4562:1: ( ( rule__QuantificationList__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4562:1: ( ( rule__QuantificationList__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4563:1: ( rule__QuantificationList__Group_1__0 )*
            {
             before(grammarAccess.getQuantificationListAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4564:1: ( rule__QuantificationList__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==13) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4564:2: rule__QuantificationList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QuantificationList__Group_1__0_in_rule__QuantificationList__Group__1__Impl9291);
            	    rule__QuantificationList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getQuantificationListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantificationList__Group__1__Impl"


    // $ANTLR start "rule__QuantificationList__Group_1__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4578:1: rule__QuantificationList__Group_1__0 : rule__QuantificationList__Group_1__0__Impl rule__QuantificationList__Group_1__1 ;
    public final void rule__QuantificationList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4582:1: ( rule__QuantificationList__Group_1__0__Impl rule__QuantificationList__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4583:2: rule__QuantificationList__Group_1__0__Impl rule__QuantificationList__Group_1__1
            {
            pushFollow(FOLLOW_rule__QuantificationList__Group_1__0__Impl_in_rule__QuantificationList__Group_1__09326);
            rule__QuantificationList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantificationList__Group_1__1_in_rule__QuantificationList__Group_1__09329);
            rule__QuantificationList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantificationList__Group_1__0"


    // $ANTLR start "rule__QuantificationList__Group_1__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4590:1: rule__QuantificationList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__QuantificationList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4594:1: ( ( ',' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4595:1: ( ',' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4595:1: ( ',' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4596:1: ','
            {
             before(grammarAccess.getQuantificationListAccess().getCommaKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__QuantificationList__Group_1__0__Impl9357); 
             after(grammarAccess.getQuantificationListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantificationList__Group_1__0__Impl"


    // $ANTLR start "rule__QuantificationList__Group_1__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4609:1: rule__QuantificationList__Group_1__1 : rule__QuantificationList__Group_1__1__Impl ;
    public final void rule__QuantificationList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4613:1: ( rule__QuantificationList__Group_1__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4614:2: rule__QuantificationList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QuantificationList__Group_1__1__Impl_in_rule__QuantificationList__Group_1__19388);
            rule__QuantificationList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantificationList__Group_1__1"


    // $ANTLR start "rule__QuantificationList__Group_1__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4620:1: rule__QuantificationList__Group_1__1__Impl : ( ( rule__QuantificationList__QuantificationsAssignment_1_1 ) ) ;
    public final void rule__QuantificationList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4624:1: ( ( ( rule__QuantificationList__QuantificationsAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4625:1: ( ( rule__QuantificationList__QuantificationsAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4625:1: ( ( rule__QuantificationList__QuantificationsAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4626:1: ( rule__QuantificationList__QuantificationsAssignment_1_1 )
            {
             before(grammarAccess.getQuantificationListAccess().getQuantificationsAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4627:1: ( rule__QuantificationList__QuantificationsAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4627:2: rule__QuantificationList__QuantificationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__QuantificationList__QuantificationsAssignment_1_1_in_rule__QuantificationList__Group_1__1__Impl9415);
            rule__QuantificationList__QuantificationsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantificationListAccess().getQuantificationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantificationList__Group_1__1__Impl"


    // $ANTLR start "rule__PropertyValueExpression__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4641:1: rule__PropertyValueExpression__Group__0 : rule__PropertyValueExpression__Group__0__Impl rule__PropertyValueExpression__Group__1 ;
    public final void rule__PropertyValueExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4645:1: ( rule__PropertyValueExpression__Group__0__Impl rule__PropertyValueExpression__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4646:2: rule__PropertyValueExpression__Group__0__Impl rule__PropertyValueExpression__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyValueExpression__Group__0__Impl_in_rule__PropertyValueExpression__Group__09449);
            rule__PropertyValueExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyValueExpression__Group__1_in_rule__PropertyValueExpression__Group__09452);
            rule__PropertyValueExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueExpression__Group__0"


    // $ANTLR start "rule__PropertyValueExpression__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4653:1: rule__PropertyValueExpression__Group__0__Impl : ( 'v' ) ;
    public final void rule__PropertyValueExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4657:1: ( ( 'v' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4658:1: ( 'v' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4658:1: ( 'v' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4659:1: 'v'
            {
             before(grammarAccess.getPropertyValueExpressionAccess().getVKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__PropertyValueExpression__Group__0__Impl9480); 
             after(grammarAccess.getPropertyValueExpressionAccess().getVKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueExpression__Group__0__Impl"


    // $ANTLR start "rule__PropertyValueExpression__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4672:1: rule__PropertyValueExpression__Group__1 : rule__PropertyValueExpression__Group__1__Impl ;
    public final void rule__PropertyValueExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4676:1: ( rule__PropertyValueExpression__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4677:2: rule__PropertyValueExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyValueExpression__Group__1__Impl_in_rule__PropertyValueExpression__Group__19511);
            rule__PropertyValueExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueExpression__Group__1"


    // $ANTLR start "rule__PropertyValueExpression__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4683:1: rule__PropertyValueExpression__Group__1__Impl : ( ( rule__PropertyValueExpression__ValueAssignment_1 ) ) ;
    public final void rule__PropertyValueExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4687:1: ( ( ( rule__PropertyValueExpression__ValueAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4688:1: ( ( rule__PropertyValueExpression__ValueAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4688:1: ( ( rule__PropertyValueExpression__ValueAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4689:1: ( rule__PropertyValueExpression__ValueAssignment_1 )
            {
             before(grammarAccess.getPropertyValueExpressionAccess().getValueAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4690:1: ( rule__PropertyValueExpression__ValueAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4690:2: rule__PropertyValueExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyValueExpression__ValueAssignment_1_in_rule__PropertyValueExpression__Group__1__Impl9538);
            rule__PropertyValueExpression__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueExpressionAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueExpression__Group__1__Impl"


    // $ANTLR start "rule__PropertyReferenceExpression__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4704:1: rule__PropertyReferenceExpression__Group__0 : rule__PropertyReferenceExpression__Group__0__Impl rule__PropertyReferenceExpression__Group__1 ;
    public final void rule__PropertyReferenceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4708:1: ( rule__PropertyReferenceExpression__Group__0__Impl rule__PropertyReferenceExpression__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4709:2: rule__PropertyReferenceExpression__Group__0__Impl rule__PropertyReferenceExpression__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyReferenceExpression__Group__0__Impl_in_rule__PropertyReferenceExpression__Group__09572);
            rule__PropertyReferenceExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyReferenceExpression__Group__1_in_rule__PropertyReferenceExpression__Group__09575);
            rule__PropertyReferenceExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReferenceExpression__Group__0"


    // $ANTLR start "rule__PropertyReferenceExpression__Group__0__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4716:1: rule__PropertyReferenceExpression__Group__0__Impl : ( 'n' ) ;
    public final void rule__PropertyReferenceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4720:1: ( ( 'n' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4721:1: ( 'n' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4721:1: ( 'n' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4722:1: 'n'
            {
             before(grammarAccess.getPropertyReferenceExpressionAccess().getNKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__PropertyReferenceExpression__Group__0__Impl9603); 
             after(grammarAccess.getPropertyReferenceExpressionAccess().getNKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReferenceExpression__Group__0__Impl"


    // $ANTLR start "rule__PropertyReferenceExpression__Group__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4735:1: rule__PropertyReferenceExpression__Group__1 : rule__PropertyReferenceExpression__Group__1__Impl rule__PropertyReferenceExpression__Group__2 ;
    public final void rule__PropertyReferenceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4739:1: ( rule__PropertyReferenceExpression__Group__1__Impl rule__PropertyReferenceExpression__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4740:2: rule__PropertyReferenceExpression__Group__1__Impl rule__PropertyReferenceExpression__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyReferenceExpression__Group__1__Impl_in_rule__PropertyReferenceExpression__Group__19634);
            rule__PropertyReferenceExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyReferenceExpression__Group__2_in_rule__PropertyReferenceExpression__Group__19637);
            rule__PropertyReferenceExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReferenceExpression__Group__1"


    // $ANTLR start "rule__PropertyReferenceExpression__Group__1__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4747:1: rule__PropertyReferenceExpression__Group__1__Impl : ( ( rule__PropertyReferenceExpression__NodeAssignment_1 ) ) ;
    public final void rule__PropertyReferenceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4751:1: ( ( ( rule__PropertyReferenceExpression__NodeAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4752:1: ( ( rule__PropertyReferenceExpression__NodeAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4752:1: ( ( rule__PropertyReferenceExpression__NodeAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4753:1: ( rule__PropertyReferenceExpression__NodeAssignment_1 )
            {
             before(grammarAccess.getPropertyReferenceExpressionAccess().getNodeAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4754:1: ( rule__PropertyReferenceExpression__NodeAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4754:2: rule__PropertyReferenceExpression__NodeAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyReferenceExpression__NodeAssignment_1_in_rule__PropertyReferenceExpression__Group__1__Impl9664);
            rule__PropertyReferenceExpression__NodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyReferenceExpressionAccess().getNodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReferenceExpression__Group__1__Impl"


    // $ANTLR start "rule__PropertyReferenceExpression__Group__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4764:1: rule__PropertyReferenceExpression__Group__2 : rule__PropertyReferenceExpression__Group__2__Impl rule__PropertyReferenceExpression__Group__3 ;
    public final void rule__PropertyReferenceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4768:1: ( rule__PropertyReferenceExpression__Group__2__Impl rule__PropertyReferenceExpression__Group__3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4769:2: rule__PropertyReferenceExpression__Group__2__Impl rule__PropertyReferenceExpression__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyReferenceExpression__Group__2__Impl_in_rule__PropertyReferenceExpression__Group__29694);
            rule__PropertyReferenceExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyReferenceExpression__Group__3_in_rule__PropertyReferenceExpression__Group__29697);
            rule__PropertyReferenceExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReferenceExpression__Group__2"


    // $ANTLR start "rule__PropertyReferenceExpression__Group__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4776:1: rule__PropertyReferenceExpression__Group__2__Impl : ( '.' ) ;
    public final void rule__PropertyReferenceExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4780:1: ( ( '.' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4781:1: ( '.' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4781:1: ( '.' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4782:1: '.'
            {
             before(grammarAccess.getPropertyReferenceExpressionAccess().getFullStopKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__PropertyReferenceExpression__Group__2__Impl9725); 
             after(grammarAccess.getPropertyReferenceExpressionAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReferenceExpression__Group__2__Impl"


    // $ANTLR start "rule__PropertyReferenceExpression__Group__3"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4795:1: rule__PropertyReferenceExpression__Group__3 : rule__PropertyReferenceExpression__Group__3__Impl ;
    public final void rule__PropertyReferenceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4799:1: ( rule__PropertyReferenceExpression__Group__3__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4800:2: rule__PropertyReferenceExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PropertyReferenceExpression__Group__3__Impl_in_rule__PropertyReferenceExpression__Group__39756);
            rule__PropertyReferenceExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReferenceExpression__Group__3"


    // $ANTLR start "rule__PropertyReferenceExpression__Group__3__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4806:1: rule__PropertyReferenceExpression__Group__3__Impl : ( ( rule__PropertyReferenceExpression__PropertyAssignment_3 ) ) ;
    public final void rule__PropertyReferenceExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4810:1: ( ( ( rule__PropertyReferenceExpression__PropertyAssignment_3 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4811:1: ( ( rule__PropertyReferenceExpression__PropertyAssignment_3 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4811:1: ( ( rule__PropertyReferenceExpression__PropertyAssignment_3 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4812:1: ( rule__PropertyReferenceExpression__PropertyAssignment_3 )
            {
             before(grammarAccess.getPropertyReferenceExpressionAccess().getPropertyAssignment_3()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4813:1: ( rule__PropertyReferenceExpression__PropertyAssignment_3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4813:2: rule__PropertyReferenceExpression__PropertyAssignment_3
            {
            pushFollow(FOLLOW_rule__PropertyReferenceExpression__PropertyAssignment_3_in_rule__PropertyReferenceExpression__Group__3__Impl9783);
            rule__PropertyReferenceExpression__PropertyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyReferenceExpressionAccess().getPropertyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReferenceExpression__Group__3__Impl"


    // $ANTLR start "rule__Validator__SentencesAssignment"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4832:1: rule__Validator__SentencesAssignment : ( ruleSentence ) ;
    public final void rule__Validator__SentencesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4836:1: ( ( ruleSentence ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4837:1: ( ruleSentence )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4837:1: ( ruleSentence )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4838:1: ruleSentence
            {
             before(grammarAccess.getValidatorAccess().getSentencesSentenceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSentence_in_rule__Validator__SentencesAssignment9826);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getValidatorAccess().getSentencesSentenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validator__SentencesAssignment"


    // $ANTLR start "rule__StartOnSentence__DefinitionAssignment_2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4847:1: rule__StartOnSentence__DefinitionAssignment_2 : ( ruleNodeDefinition ) ;
    public final void rule__StartOnSentence__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4851:1: ( ( ruleNodeDefinition ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4852:1: ( ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4852:1: ( ruleNodeDefinition )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4853:1: ruleNodeDefinition
            {
             before(grammarAccess.getStartOnSentenceAccess().getDefinitionNodeDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_rule__StartOnSentence__DefinitionAssignment_29857);
            ruleNodeDefinition();

            state._fsp--;

             after(grammarAccess.getStartOnSentenceAccess().getDefinitionNodeDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartOnSentence__DefinitionAssignment_2"


    // $ANTLR start "rule__DefinitionSentence__QuantificationAssignment_0_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4862:1: rule__DefinitionSentence__QuantificationAssignment_0_0 : ( ruleQuantification ) ;
    public final void rule__DefinitionSentence__QuantificationAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4866:1: ( ( ruleQuantification ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4867:1: ( ruleQuantification )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4867:1: ( ruleQuantification )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4868:1: ruleQuantification
            {
             before(grammarAccess.getDefinitionSentenceAccess().getQuantificationQuantificationParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleQuantification_in_rule__DefinitionSentence__QuantificationAssignment_0_09888);
            ruleQuantification();

            state._fsp--;

             after(grammarAccess.getDefinitionSentenceAccess().getQuantificationQuantificationParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionSentence__QuantificationAssignment_0_0"


    // $ANTLR start "rule__DefinitionSentence__NodeAssignment_0_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4877:1: rule__DefinitionSentence__NodeAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefinitionSentence__NodeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4881:1: ( ( ( RULE_ID ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4882:1: ( ( RULE_ID ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4882:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4883:1: ( RULE_ID )
            {
             before(grammarAccess.getDefinitionSentenceAccess().getNodeNodeDefinitionCrossReference_0_1_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4884:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4885:1: RULE_ID
            {
             before(grammarAccess.getDefinitionSentenceAccess().getNodeNodeDefinitionIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefinitionSentence__NodeAssignment_0_19923); 
             after(grammarAccess.getDefinitionSentenceAccess().getNodeNodeDefinitionIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getDefinitionSentenceAccess().getNodeNodeDefinitionCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionSentence__NodeAssignment_0_1"


    // $ANTLR start "rule__DefinitionSentence__QualifierAssignment_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4896:1: rule__DefinitionSentence__QualifierAssignment_1 : ( ruleRelationQualifier ) ;
    public final void rule__DefinitionSentence__QualifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4900:1: ( ( ruleRelationQualifier ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4901:1: ( ruleRelationQualifier )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4901:1: ( ruleRelationQualifier )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4902:1: ruleRelationQualifier
            {
             before(grammarAccess.getDefinitionSentenceAccess().getQualifierRelationQualifierEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRelationQualifier_in_rule__DefinitionSentence__QualifierAssignment_19958);
            ruleRelationQualifier();

            state._fsp--;

             after(grammarAccess.getDefinitionSentenceAccess().getQualifierRelationQualifierEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionSentence__QualifierAssignment_1"


    // $ANTLR start "rule__DefinitionSentence__TargetAssignment_2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4911:1: rule__DefinitionSentence__TargetAssignment_2 : ( ruleTargetDefinition ) ;
    public final void rule__DefinitionSentence__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4915:1: ( ( ruleTargetDefinition ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4916:1: ( ruleTargetDefinition )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4916:1: ( ruleTargetDefinition )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4917:1: ruleTargetDefinition
            {
             before(grammarAccess.getDefinitionSentenceAccess().getTargetTargetDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTargetDefinition_in_rule__DefinitionSentence__TargetAssignment_29989);
            ruleTargetDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionSentenceAccess().getTargetTargetDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionSentence__TargetAssignment_2"


    // $ANTLR start "rule__ConstraintSentence__QuantificationsAssignment_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4926:1: rule__ConstraintSentence__QuantificationsAssignment_1 : ( ruleQuantificationList ) ;
    public final void rule__ConstraintSentence__QuantificationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4930:1: ( ( ruleQuantificationList ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4931:1: ( ruleQuantificationList )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4931:1: ( ruleQuantificationList )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4932:1: ruleQuantificationList
            {
             before(grammarAccess.getConstraintSentenceAccess().getQuantificationsQuantificationListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQuantificationList_in_rule__ConstraintSentence__QuantificationsAssignment_110020);
            ruleQuantificationList();

            state._fsp--;

             after(grammarAccess.getConstraintSentenceAccess().getQuantificationsQuantificationListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__QuantificationsAssignment_1"


    // $ANTLR start "rule__ConstraintSentence__NodesAssignment_2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4941:1: rule__ConstraintSentence__NodesAssignment_2 : ( ruleNodeReferenceList ) ;
    public final void rule__ConstraintSentence__NodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4945:1: ( ( ruleNodeReferenceList ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4946:1: ( ruleNodeReferenceList )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4946:1: ( ruleNodeReferenceList )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4947:1: ruleNodeReferenceList
            {
             before(grammarAccess.getConstraintSentenceAccess().getNodesNodeReferenceListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNodeReferenceList_in_rule__ConstraintSentence__NodesAssignment_210051);
            ruleNodeReferenceList();

            state._fsp--;

             after(grammarAccess.getConstraintSentenceAccess().getNodesNodeReferenceListParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__NodesAssignment_2"


    // $ANTLR start "rule__ConstraintSentence__PredicateAssignment_4"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4956:1: rule__ConstraintSentence__PredicateAssignment_4 : ( rulePredicateExpression ) ;
    public final void rule__ConstraintSentence__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4960:1: ( ( rulePredicateExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4961:1: ( rulePredicateExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4961:1: ( rulePredicateExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4962:1: rulePredicateExpression
            {
             before(grammarAccess.getConstraintSentenceAccess().getPredicatePredicateExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_rule__ConstraintSentence__PredicateAssignment_410082);
            rulePredicateExpression();

            state._fsp--;

             after(grammarAccess.getConstraintSentenceAccess().getPredicatePredicateExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintSentence__PredicateAssignment_4"


    // $ANTLR start "rule__PredicateDefinitionSentence__NameAssignment_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4971:1: rule__PredicateDefinitionSentence__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PredicateDefinitionSentence__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4975:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4976:1: ( RULE_ID )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4976:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4977:1: RULE_ID
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PredicateDefinitionSentence__NameAssignment_110113); 
             after(grammarAccess.getPredicateDefinitionSentenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinitionSentence__NameAssignment_1"


    // $ANTLR start "rule__PredicateDefinitionSentence__ParametersAssignment_2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4986:1: rule__PredicateDefinitionSentence__ParametersAssignment_2 : ( ruleParameterList ) ;
    public final void rule__PredicateDefinitionSentence__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4990:1: ( ( ruleParameterList ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4991:1: ( ruleParameterList )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4991:1: ( ruleParameterList )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4992:1: ruleParameterList
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getParametersParameterListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParameterList_in_rule__PredicateDefinitionSentence__ParametersAssignment_210144);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getPredicateDefinitionSentenceAccess().getParametersParameterListParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinitionSentence__ParametersAssignment_2"


    // $ANTLR start "rule__PredicateDefinitionSentence__PredicateAssignment_4"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5001:1: rule__PredicateDefinitionSentence__PredicateAssignment_4 : ( rulePredicateExpression ) ;
    public final void rule__PredicateDefinitionSentence__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5005:1: ( ( rulePredicateExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5006:1: ( rulePredicateExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5006:1: ( rulePredicateExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5007:1: rulePredicateExpression
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getPredicatePredicateExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_rule__PredicateDefinitionSentence__PredicateAssignment_410175);
            rulePredicateExpression();

            state._fsp--;

             after(grammarAccess.getPredicateDefinitionSentenceAccess().getPredicatePredicateExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinitionSentence__PredicateAssignment_4"


    // $ANTLR start "rule__NodeDefinition__NameAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5016:1: rule__NodeDefinition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NodeDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5020:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5021:1: ( RULE_ID )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5021:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5022:1: RULE_ID
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeDefinition__NameAssignment_010206); 
             after(grammarAccess.getNodeDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__NameAssignment_0"


    // $ANTLR start "rule__NodeDefinition__CollectionAssignment_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5031:1: rule__NodeDefinition__CollectionAssignment_1 : ( ( '*' ) ) ;
    public final void rule__NodeDefinition__CollectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5035:1: ( ( ( '*' ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5036:1: ( ( '*' ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5036:1: ( ( '*' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5037:1: ( '*' )
            {
             before(grammarAccess.getNodeDefinitionAccess().getCollectionAsteriskKeyword_1_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5038:1: ( '*' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5039:1: '*'
            {
             before(grammarAccess.getNodeDefinitionAccess().getCollectionAsteriskKeyword_1_0()); 
            match(input,59,FOLLOW_59_in_rule__NodeDefinition__CollectionAssignment_110242); 
             after(grammarAccess.getNodeDefinitionAccess().getCollectionAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getNodeDefinitionAccess().getCollectionAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__CollectionAssignment_1"


    // $ANTLR start "rule__NodeDefinition__SelectorsAssignment_2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5054:1: rule__NodeDefinition__SelectorsAssignment_2 : ( ruleSelectorList ) ;
    public final void rule__NodeDefinition__SelectorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5058:1: ( ( ruleSelectorList ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5059:1: ( ruleSelectorList )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5059:1: ( ruleSelectorList )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5060:1: ruleSelectorList
            {
             before(grammarAccess.getNodeDefinitionAccess().getSelectorsSelectorListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSelectorList_in_rule__NodeDefinition__SelectorsAssignment_210281);
            ruleSelectorList();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getSelectorsSelectorListParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__SelectorsAssignment_2"


    // $ANTLR start "rule__NodeReferenceList__NodesAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5069:1: rule__NodeReferenceList__NodesAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NodeReferenceList__NodesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5073:1: ( ( ( RULE_ID ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5074:1: ( ( RULE_ID ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5074:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5075:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionCrossReference_0_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5076:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5077:1: RULE_ID
            {
             before(grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeReferenceList__NodesAssignment_010316); 
             after(grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceList__NodesAssignment_0"


    // $ANTLR start "rule__NodeReferenceList__NodesAssignment_1_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5088:1: rule__NodeReferenceList__NodesAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__NodeReferenceList__NodesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5092:1: ( ( ( RULE_ID ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5093:1: ( ( RULE_ID ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5093:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5094:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionCrossReference_1_1_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5095:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5096:1: RULE_ID
            {
             before(grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeReferenceList__NodesAssignment_1_110355); 
             after(grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceList__NodesAssignment_1_1"


    // $ANTLR start "rule__TargetDefinition__AxisAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5107:1: rule__TargetDefinition__AxisAssignment_0 : ( ruleAxis ) ;
    public final void rule__TargetDefinition__AxisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5111:1: ( ( ruleAxis ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5112:1: ( ruleAxis )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5112:1: ( ruleAxis )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5113:1: ruleAxis
            {
             before(grammarAccess.getTargetDefinitionAccess().getAxisAxisEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAxis_in_rule__TargetDefinition__AxisAssignment_010390);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getTargetDefinitionAccess().getAxisAxisEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__AxisAssignment_0"


    // $ANTLR start "rule__TargetDefinition__DefinitionAssignment_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5122:1: rule__TargetDefinition__DefinitionAssignment_1 : ( ruleNodeDefinition ) ;
    public final void rule__TargetDefinition__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5126:1: ( ( ruleNodeDefinition ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5127:1: ( ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5127:1: ( ruleNodeDefinition )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5128:1: ruleNodeDefinition
            {
             before(grammarAccess.getTargetDefinitionAccess().getDefinitionNodeDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_rule__TargetDefinition__DefinitionAssignment_110421);
            ruleNodeDefinition();

            state._fsp--;

             after(grammarAccess.getTargetDefinitionAccess().getDefinitionNodeDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__DefinitionAssignment_1"


    // $ANTLR start "rule__TargetDefinition__PredicateAssignment_2_3"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5137:1: rule__TargetDefinition__PredicateAssignment_2_3 : ( rulePredicateExpression ) ;
    public final void rule__TargetDefinition__PredicateAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5141:1: ( ( rulePredicateExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5142:1: ( rulePredicateExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5142:1: ( rulePredicateExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5143:1: rulePredicateExpression
            {
             before(grammarAccess.getTargetDefinitionAccess().getPredicatePredicateExpressionParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_rule__TargetDefinition__PredicateAssignment_2_310452);
            rulePredicateExpression();

            state._fsp--;

             after(grammarAccess.getTargetDefinitionAccess().getPredicatePredicateExpressionParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__PredicateAssignment_2_3"


    // $ANTLR start "rule__TargetDefinition__AssignmentsAssignment_3_3"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5152:1: rule__TargetDefinition__AssignmentsAssignment_3_3 : ( ruleAssignmentList ) ;
    public final void rule__TargetDefinition__AssignmentsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5156:1: ( ( ruleAssignmentList ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5157:1: ( ruleAssignmentList )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5157:1: ( ruleAssignmentList )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5158:1: ruleAssignmentList
            {
             before(grammarAccess.getTargetDefinitionAccess().getAssignmentsAssignmentListParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleAssignmentList_in_rule__TargetDefinition__AssignmentsAssignment_3_310483);
            ruleAssignmentList();

            state._fsp--;

             after(grammarAccess.getTargetDefinitionAccess().getAssignmentsAssignmentListParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__AssignmentsAssignment_3_3"


    // $ANTLR start "rule__SelectorList__SelectorsAssignment_0_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5167:1: rule__SelectorList__SelectorsAssignment_0_1 : ( ruleSelectorListDef ) ;
    public final void rule__SelectorList__SelectorsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5171:1: ( ( ruleSelectorListDef ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5172:1: ( ruleSelectorListDef )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5172:1: ( ruleSelectorListDef )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5173:1: ruleSelectorListDef
            {
             before(grammarAccess.getSelectorListAccess().getSelectorsSelectorListDefParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleSelectorListDef_in_rule__SelectorList__SelectorsAssignment_0_110514);
            ruleSelectorListDef();

            state._fsp--;

             after(grammarAccess.getSelectorListAccess().getSelectorsSelectorListDefParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorList__SelectorsAssignment_0_1"


    // $ANTLR start "rule__SelectorList__SelectorsAssignment_1_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5182:1: rule__SelectorList__SelectorsAssignment_1_1 : ( ruleSelectorListDef ) ;
    public final void rule__SelectorList__SelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5186:1: ( ( ruleSelectorListDef ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5187:1: ( ruleSelectorListDef )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5187:1: ( ruleSelectorListDef )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5188:1: ruleSelectorListDef
            {
             before(grammarAccess.getSelectorListAccess().getSelectorsSelectorListDefParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSelectorListDef_in_rule__SelectorList__SelectorsAssignment_1_110545);
            ruleSelectorListDef();

            state._fsp--;

             after(grammarAccess.getSelectorListAccess().getSelectorsSelectorListDefParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorList__SelectorsAssignment_1_1"


    // $ANTLR start "rule__SelectorListDef__SelectorsAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5197:1: rule__SelectorListDef__SelectorsAssignment_0 : ( ruleSelector ) ;
    public final void rule__SelectorListDef__SelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5201:1: ( ( ruleSelector ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5202:1: ( ruleSelector )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5202:1: ( ruleSelector )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5203:1: ruleSelector
            {
             before(grammarAccess.getSelectorListDefAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSelector_in_rule__SelectorListDef__SelectorsAssignment_010576);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorListDefAccess().getSelectorsSelectorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorListDef__SelectorsAssignment_0"


    // $ANTLR start "rule__SelectorListDef__SelectorsAssignment_1_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5212:1: rule__SelectorListDef__SelectorsAssignment_1_1 : ( ruleSelector ) ;
    public final void rule__SelectorListDef__SelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5216:1: ( ( ruleSelector ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5217:1: ( ruleSelector )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5217:1: ( ruleSelector )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5218:1: ruleSelector
            {
             before(grammarAccess.getSelectorListDefAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSelector_in_rule__SelectorListDef__SelectorsAssignment_1_110607);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorListDefAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorListDef__SelectorsAssignment_1_1"


    // $ANTLR start "rule__Selector__TypeAssignment"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5227:1: rule__Selector__TypeAssignment : ( RULE_ID ) ;
    public final void rule__Selector__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5231:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5232:1: ( RULE_ID )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5232:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5233:1: RULE_ID
            {
             before(grammarAccess.getSelectorAccess().getTypeIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Selector__TypeAssignment10638); 
             after(grammarAccess.getSelectorAccess().getTypeIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__TypeAssignment"


    // $ANTLR start "rule__AndExpression__RhsAssignment_1_2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5242:1: rule__AndExpression__RhsAssignment_1_2 : ( ruleOrExpression ) ;
    public final void rule__AndExpression__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5246:1: ( ( ruleOrExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5247:1: ( ruleOrExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5247:1: ( ruleOrExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5248:1: ruleOrExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRhsOrExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__AndExpression__RhsAssignment_1_210669);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRhsOrExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RhsAssignment_1_2"


    // $ANTLR start "rule__OrExpression__RhsAssignment_1_2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5257:1: rule__OrExpression__RhsAssignment_1_2 : ( ruleImpliesExpression ) ;
    public final void rule__OrExpression__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5261:1: ( ( ruleImpliesExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5262:1: ( ruleImpliesExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5262:1: ( ruleImpliesExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5263:1: ruleImpliesExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRhsImpliesExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleImpliesExpression_in_rule__OrExpression__RhsAssignment_1_210700);
            ruleImpliesExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRhsImpliesExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RhsAssignment_1_2"


    // $ANTLR start "rule__ImpliesExpression__LhsAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5272:1: rule__ImpliesExpression__LhsAssignment_0 : ( rulePrimaryExpression ) ;
    public final void rule__ImpliesExpression__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5276:1: ( ( rulePrimaryExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5277:1: ( rulePrimaryExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5277:1: ( rulePrimaryExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5278:1: rulePrimaryExpression
            {
             before(grammarAccess.getImpliesExpressionAccess().getLhsPrimaryExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__ImpliesExpression__LhsAssignment_010731);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getImpliesExpressionAccess().getLhsPrimaryExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__LhsAssignment_0"


    // $ANTLR start "rule__ImpliesExpression__RhsAssignment_1_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5287:1: rule__ImpliesExpression__RhsAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__ImpliesExpression__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5291:1: ( ( rulePrimaryExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5292:1: ( rulePrimaryExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5292:1: ( rulePrimaryExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5293:1: rulePrimaryExpression
            {
             before(grammarAccess.getImpliesExpressionAccess().getRhsPrimaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__ImpliesExpression__RhsAssignment_1_110762);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getImpliesExpressionAccess().getRhsPrimaryExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__RhsAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__NegatedAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5302:1: rule__PrimaryExpression__NegatedAssignment_0 : ( ( 'not' ) ) ;
    public final void rule__PrimaryExpression__NegatedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5306:1: ( ( ( 'not' ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5307:1: ( ( 'not' ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5307:1: ( ( 'not' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5308:1: ( 'not' )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNegatedNotKeyword_0_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5309:1: ( 'not' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5310:1: 'not'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNegatedNotKeyword_0_0()); 
            match(input,60,FOLLOW_60_in_rule__PrimaryExpression__NegatedAssignment_010798); 
             after(grammarAccess.getPrimaryExpressionAccess().getNegatedNotKeyword_0_0()); 

            }

             after(grammarAccess.getPrimaryExpressionAccess().getNegatedNotKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__NegatedAssignment_0"


    // $ANTLR start "rule__PrimaryExpression__CallAssignment_1_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5325:1: rule__PrimaryExpression__CallAssignment_1_0 : ( rulePredicateCall ) ;
    public final void rule__PrimaryExpression__CallAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5329:1: ( ( rulePredicateCall ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5330:1: ( rulePredicateCall )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5330:1: ( rulePredicateCall )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5331:1: rulePredicateCall
            {
             before(grammarAccess.getPrimaryExpressionAccess().getCallPredicateCallParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulePredicateCall_in_rule__PrimaryExpression__CallAssignment_1_010837);
            rulePredicateCall();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getCallPredicateCallParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__CallAssignment_1_0"


    // $ANTLR start "rule__PrimaryExpression__InnerAssignment_1_1_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5340:1: rule__PrimaryExpression__InnerAssignment_1_1_1 : ( rulePredicateExpression ) ;
    public final void rule__PrimaryExpression__InnerAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5344:1: ( ( rulePredicateExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5345:1: ( rulePredicateExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5345:1: ( rulePredicateExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5346:1: rulePredicateExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getInnerPredicateExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_rule__PrimaryExpression__InnerAssignment_1_1_110868);
            rulePredicateExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getInnerPredicateExpressionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__InnerAssignment_1_1_1"


    // $ANTLR start "rule__PredicateCall__LabelAssignment_1_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5355:1: rule__PredicateCall__LabelAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__PredicateCall__LabelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5359:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5360:1: ( RULE_ID )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5360:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5361:1: RULE_ID
            {
             before(grammarAccess.getPredicateCallAccess().getLabelIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PredicateCall__LabelAssignment_1_110899); 
             after(grammarAccess.getPredicateCallAccess().getLabelIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateCall__LabelAssignment_1_1"


    // $ANTLR start "rule__PropertyRelationPredicate__LhsAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5370:1: rule__PropertyRelationPredicate__LhsAssignment_0 : ( rulePropertyExpression ) ;
    public final void rule__PropertyRelationPredicate__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5374:1: ( ( rulePropertyExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5375:1: ( rulePropertyExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5375:1: ( rulePropertyExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5376:1: rulePropertyExpression
            {
             before(grammarAccess.getPropertyRelationPredicateAccess().getLhsPropertyExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePropertyExpression_in_rule__PropertyRelationPredicate__LhsAssignment_010930);
            rulePropertyExpression();

            state._fsp--;

             after(grammarAccess.getPropertyRelationPredicateAccess().getLhsPropertyExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRelationPredicate__LhsAssignment_0"


    // $ANTLR start "rule__PropertyRelationPredicate__RelationAssignment_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5385:1: rule__PropertyRelationPredicate__RelationAssignment_1 : ( rulePropertyRelation ) ;
    public final void rule__PropertyRelationPredicate__RelationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5389:1: ( ( rulePropertyRelation ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5390:1: ( rulePropertyRelation )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5390:1: ( rulePropertyRelation )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5391:1: rulePropertyRelation
            {
             before(grammarAccess.getPropertyRelationPredicateAccess().getRelationPropertyRelationEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePropertyRelation_in_rule__PropertyRelationPredicate__RelationAssignment_110961);
            rulePropertyRelation();

            state._fsp--;

             after(grammarAccess.getPropertyRelationPredicateAccess().getRelationPropertyRelationEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRelationPredicate__RelationAssignment_1"


    // $ANTLR start "rule__PropertyRelationPredicate__RhsAssignment_2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5400:1: rule__PropertyRelationPredicate__RhsAssignment_2 : ( rulePropertyExpression ) ;
    public final void rule__PropertyRelationPredicate__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5404:1: ( ( rulePropertyExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5405:1: ( rulePropertyExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5405:1: ( rulePropertyExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5406:1: rulePropertyExpression
            {
             before(grammarAccess.getPropertyRelationPredicateAccess().getRhsPropertyExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePropertyExpression_in_rule__PropertyRelationPredicate__RhsAssignment_210992);
            rulePropertyExpression();

            state._fsp--;

             after(grammarAccess.getPropertyRelationPredicateAccess().getRhsPropertyExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRelationPredicate__RhsAssignment_2"


    // $ANTLR start "rule__DefinitionSentencePredicate__SentenceAssignment"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5415:1: rule__DefinitionSentencePredicate__SentenceAssignment : ( ruleDefinitionSentence ) ;
    public final void rule__DefinitionSentencePredicate__SentenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5419:1: ( ( ruleDefinitionSentence ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5420:1: ( ruleDefinitionSentence )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5420:1: ( ruleDefinitionSentence )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5421:1: ruleDefinitionSentence
            {
             before(grammarAccess.getDefinitionSentencePredicateAccess().getSentenceDefinitionSentenceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDefinitionSentence_in_rule__DefinitionSentencePredicate__SentenceAssignment11023);
            ruleDefinitionSentence();

            state._fsp--;

             after(grammarAccess.getDefinitionSentencePredicateAccess().getSentenceDefinitionSentenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionSentencePredicate__SentenceAssignment"


    // $ANTLR start "rule__PredicateReference__ReferenceAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5430:1: rule__PredicateReference__ReferenceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PredicateReference__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5434:1: ( ( ( RULE_ID ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5435:1: ( ( RULE_ID ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5435:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5436:1: ( RULE_ID )
            {
             before(grammarAccess.getPredicateReferenceAccess().getReferencePredicateDefinitionSentenceCrossReference_0_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5437:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5438:1: RULE_ID
            {
             before(grammarAccess.getPredicateReferenceAccess().getReferencePredicateDefinitionSentenceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PredicateReference__ReferenceAssignment_011058); 
             after(grammarAccess.getPredicateReferenceAccess().getReferencePredicateDefinitionSentenceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPredicateReferenceAccess().getReferencePredicateDefinitionSentenceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateReference__ReferenceAssignment_0"


    // $ANTLR start "rule__PredicateReference__ArgumentsAssignment_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5449:1: rule__PredicateReference__ArgumentsAssignment_1 : ( ruleArgumentList ) ;
    public final void rule__PredicateReference__ArgumentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5453:1: ( ( ruleArgumentList ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5454:1: ( ruleArgumentList )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5454:1: ( ruleArgumentList )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5455:1: ruleArgumentList
            {
             before(grammarAccess.getPredicateReferenceAccess().getArgumentsArgumentListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArgumentList_in_rule__PredicateReference__ArgumentsAssignment_111093);
            ruleArgumentList();

            state._fsp--;

             after(grammarAccess.getPredicateReferenceAccess().getArgumentsArgumentListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateReference__ArgumentsAssignment_1"


    // $ANTLR start "rule__Parameter__NodeAssignment"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5464:1: rule__Parameter__NodeAssignment : ( ruleNodeDefinition ) ;
    public final void rule__Parameter__NodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5468:1: ( ( ruleNodeDefinition ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5469:1: ( ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5469:1: ( ruleNodeDefinition )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5470:1: ruleNodeDefinition
            {
             before(grammarAccess.getParameterAccess().getNodeNodeDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_rule__Parameter__NodeAssignment11124);
            ruleNodeDefinition();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNodeNodeDefinitionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NodeAssignment"


    // $ANTLR start "rule__ParameterList__ParametersAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5479:1: rule__ParameterList__ParametersAssignment_0 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5483:1: ( ( ruleParameter ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5484:1: ( ruleParameter )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5484:1: ( ruleParameter )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5485:1: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ParameterList__ParametersAssignment_011155);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__ParametersAssignment_0"


    // $ANTLR start "rule__ParameterList__ParametersAssignment_1_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5494:1: rule__ParameterList__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5498:1: ( ( ruleParameter ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5499:1: ( ruleParameter )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5499:1: ( ruleParameter )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5500:1: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ParameterList__ParametersAssignment_1_111186);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__ParametersAssignment_1_1"


    // $ANTLR start "rule__Argument__NodeAssignment"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5509:1: rule__Argument__NodeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Argument__NodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5513:1: ( ( ( RULE_ID ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5514:1: ( ( RULE_ID ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5514:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5515:1: ( RULE_ID )
            {
             before(grammarAccess.getArgumentAccess().getNodeNodeDefinitionCrossReference_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5516:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5517:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNodeNodeDefinitionIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__NodeAssignment11221); 
             after(grammarAccess.getArgumentAccess().getNodeNodeDefinitionIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getArgumentAccess().getNodeNodeDefinitionCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__NodeAssignment"


    // $ANTLR start "rule__ArgumentList__ArgumentsAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5528:1: rule__ArgumentList__ArgumentsAssignment_0 : ( ruleArgument ) ;
    public final void rule__ArgumentList__ArgumentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5532:1: ( ( ruleArgument ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5533:1: ( ruleArgument )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5533:1: ( ruleArgument )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5534:1: ruleArgument
            {
             before(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__ArgumentList__ArgumentsAssignment_011256);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__ArgumentsAssignment_0"


    // $ANTLR start "rule__ArgumentList__ArgumentsAssignment_1_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5543:1: rule__ArgumentList__ArgumentsAssignment_1_1 : ( ruleArgument ) ;
    public final void rule__ArgumentList__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5547:1: ( ( ruleArgument ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5548:1: ( ruleArgument )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5548:1: ( ruleArgument )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5549:1: ruleArgument
            {
             before(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__ArgumentList__ArgumentsAssignment_1_111287);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__Assignment__ReferenceAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5558:1: rule__Assignment__ReferenceAssignment_0 : ( rulePropertyReferenceExpression ) ;
    public final void rule__Assignment__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5562:1: ( ( rulePropertyReferenceExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5563:1: ( rulePropertyReferenceExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5563:1: ( rulePropertyReferenceExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5564:1: rulePropertyReferenceExpression
            {
             before(grammarAccess.getAssignmentAccess().getReferencePropertyReferenceExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePropertyReferenceExpression_in_rule__Assignment__ReferenceAssignment_011318);
            rulePropertyReferenceExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getReferencePropertyReferenceExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ReferenceAssignment_0"


    // $ANTLR start "rule__Assignment__ExpressionAssignment_2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5573:1: rule__Assignment__ExpressionAssignment_2 : ( rulePropertyExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5577:1: ( ( rulePropertyExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5578:1: ( rulePropertyExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5578:1: ( rulePropertyExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5579:1: rulePropertyExpression
            {
             before(grammarAccess.getAssignmentAccess().getExpressionPropertyExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePropertyExpression_in_rule__Assignment__ExpressionAssignment_211349);
            rulePropertyExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getExpressionPropertyExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ExpressionAssignment_2"


    // $ANTLR start "rule__AssignmentList__AssignmentsAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5588:1: rule__AssignmentList__AssignmentsAssignment_0 : ( ruleAssignment ) ;
    public final void rule__AssignmentList__AssignmentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5592:1: ( ( ruleAssignment ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5593:1: ( ruleAssignment )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5593:1: ( ruleAssignment )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5594:1: ruleAssignment
            {
             before(grammarAccess.getAssignmentListAccess().getAssignmentsAssignmentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAssignment_in_rule__AssignmentList__AssignmentsAssignment_011380);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentListAccess().getAssignmentsAssignmentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentList__AssignmentsAssignment_0"


    // $ANTLR start "rule__AssignmentList__AssignmentsAssignment_1_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5603:1: rule__AssignmentList__AssignmentsAssignment_1_1 : ( ruleAssignment ) ;
    public final void rule__AssignmentList__AssignmentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5607:1: ( ( ruleAssignment ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5608:1: ( ruleAssignment )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5608:1: ( ruleAssignment )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5609:1: ruleAssignment
            {
             before(grammarAccess.getAssignmentListAccess().getAssignmentsAssignmentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAssignment_in_rule__AssignmentList__AssignmentsAssignment_1_111411);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentListAccess().getAssignmentsAssignmentParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentList__AssignmentsAssignment_1_1"


    // $ANTLR start "rule__Quantification__QuantorAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5618:1: rule__Quantification__QuantorAssignment_0 : ( ruleQuantor ) ;
    public final void rule__Quantification__QuantorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5622:1: ( ( ruleQuantor ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5623:1: ( ruleQuantor )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5623:1: ( ruleQuantor )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5624:1: ruleQuantor
            {
             before(grammarAccess.getQuantificationAccess().getQuantorQuantorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQuantor_in_rule__Quantification__QuantorAssignment_011442);
            ruleQuantor();

            state._fsp--;

             after(grammarAccess.getQuantificationAccess().getQuantorQuantorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantification__QuantorAssignment_0"


    // $ANTLR start "rule__Quantification__NodeAssignment_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5633:1: rule__Quantification__NodeAssignment_1 : ( ruleNodeDefinition ) ;
    public final void rule__Quantification__NodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5637:1: ( ( ruleNodeDefinition ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5638:1: ( ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5638:1: ( ruleNodeDefinition )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5639:1: ruleNodeDefinition
            {
             before(grammarAccess.getQuantificationAccess().getNodeNodeDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_rule__Quantification__NodeAssignment_111473);
            ruleNodeDefinition();

            state._fsp--;

             after(grammarAccess.getQuantificationAccess().getNodeNodeDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantification__NodeAssignment_1"


    // $ANTLR start "rule__Quantification__NodeSetAssignment_3"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5648:1: rule__Quantification__NodeSetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Quantification__NodeSetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5652:1: ( ( ( RULE_ID ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5653:1: ( ( RULE_ID ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5653:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5654:1: ( RULE_ID )
            {
             before(grammarAccess.getQuantificationAccess().getNodeSetNodeDefinitionCrossReference_3_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5655:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5656:1: RULE_ID
            {
             before(grammarAccess.getQuantificationAccess().getNodeSetNodeDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Quantification__NodeSetAssignment_311508); 
             after(grammarAccess.getQuantificationAccess().getNodeSetNodeDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getQuantificationAccess().getNodeSetNodeDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantification__NodeSetAssignment_3"


    // $ANTLR start "rule__QuantificationList__QuantificationsAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5667:1: rule__QuantificationList__QuantificationsAssignment_0 : ( ruleQuantification ) ;
    public final void rule__QuantificationList__QuantificationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5671:1: ( ( ruleQuantification ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5672:1: ( ruleQuantification )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5672:1: ( ruleQuantification )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5673:1: ruleQuantification
            {
             before(grammarAccess.getQuantificationListAccess().getQuantificationsQuantificationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQuantification_in_rule__QuantificationList__QuantificationsAssignment_011543);
            ruleQuantification();

            state._fsp--;

             after(grammarAccess.getQuantificationListAccess().getQuantificationsQuantificationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantificationList__QuantificationsAssignment_0"


    // $ANTLR start "rule__QuantificationList__QuantificationsAssignment_1_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5682:1: rule__QuantificationList__QuantificationsAssignment_1_1 : ( ruleQuantification ) ;
    public final void rule__QuantificationList__QuantificationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5686:1: ( ( ruleQuantification ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5687:1: ( ruleQuantification )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5687:1: ( ruleQuantification )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5688:1: ruleQuantification
            {
             before(grammarAccess.getQuantificationListAccess().getQuantificationsQuantificationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleQuantification_in_rule__QuantificationList__QuantificationsAssignment_1_111574);
            ruleQuantification();

            state._fsp--;

             after(grammarAccess.getQuantificationListAccess().getQuantificationsQuantificationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantificationList__QuantificationsAssignment_1_1"


    // $ANTLR start "rule__PropertyValueExpression__ValueAssignment_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5697:1: rule__PropertyValueExpression__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PropertyValueExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5701:1: ( ( RULE_STRING ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5702:1: ( RULE_STRING )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5702:1: ( RULE_STRING )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5703:1: RULE_STRING
            {
             before(grammarAccess.getPropertyValueExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PropertyValueExpression__ValueAssignment_111605); 
             after(grammarAccess.getPropertyValueExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueExpression__ValueAssignment_1"


    // $ANTLR start "rule__PropertyReferenceExpression__NodeAssignment_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5712:1: rule__PropertyReferenceExpression__NodeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyReferenceExpression__NodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5716:1: ( ( ( RULE_ID ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5717:1: ( ( RULE_ID ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5717:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5718:1: ( RULE_ID )
            {
             before(grammarAccess.getPropertyReferenceExpressionAccess().getNodeNodeDefinitionCrossReference_1_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5719:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5720:1: RULE_ID
            {
             before(grammarAccess.getPropertyReferenceExpressionAccess().getNodeNodeDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyReferenceExpression__NodeAssignment_111640); 
             after(grammarAccess.getPropertyReferenceExpressionAccess().getNodeNodeDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPropertyReferenceExpressionAccess().getNodeNodeDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReferenceExpression__NodeAssignment_1"


    // $ANTLR start "rule__PropertyReferenceExpression__PropertyAssignment_3"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5731:1: rule__PropertyReferenceExpression__PropertyAssignment_3 : ( RULE_ID ) ;
    public final void rule__PropertyReferenceExpression__PropertyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5735:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5736:1: ( RULE_ID )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5736:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5737:1: RULE_ID
            {
             before(grammarAccess.getPropertyReferenceExpressionAccess().getPropertyIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyReferenceExpression__PropertyAssignment_311675); 
             after(grammarAccess.getPropertyReferenceExpressionAccess().getPropertyIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReferenceExpression__PropertyAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleValidator_in_entryRuleValidator61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidator68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Validator__SentencesAssignment_in_ruleValidator96 = new BitSet(new long[]{0x0000128000300012L});
    public static final BitSet FOLLOW_rule__Validator__SentencesAssignment_in_ruleValidator108 = new BitSet(new long[]{0x0000128000300012L});
    public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentence145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Alternatives_in_ruleSentence171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartOnSentence_in_entryRuleStartOnSentence198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartOnSentence205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartOnSentence__Group__0_in_ruleStartOnSentence231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentence_in_entryRuleDefinitionSentence258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionSentence265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__Group__0_in_ruleDefinitionSentence291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintSentence_in_entryRuleConstraintSentence318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintSentence325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__0_in_ruleConstraintSentence351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateDefinitionSentence_in_entryRulePredicateDefinitionSentence378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateDefinitionSentence385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__0_in_rulePredicateDefinitionSentence411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDefinition445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__0_in_ruleNodeDefinition471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeReferenceList_in_entryRuleNodeReferenceList498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeReferenceList505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group__0_in_ruleNodeReferenceList531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetDefinition_in_entryRuleTargetDefinition558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetDefinition565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__0_in_ruleTargetDefinition591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorList_in_entryRuleSelectorList618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectorList625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Alternatives_in_ruleSelectorList651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorListDef_in_entryRuleSelectorListDef678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectorListDef685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group__0_in_ruleSelectorListDef711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__TypeAssignment_in_ruleSelector771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateExpression805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rulePredicateExpression831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_entryRuleImpliesExpression977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpliesExpression984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group__0_in_ruleImpliesExpression1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group__0_in_rulePrimaryExpression1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateCall_in_entryRulePredicateCall1097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateCall1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group__0_in_rulePredicateCall1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRelationPredicate_in_entryRulePropertyRelationPredicate1157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyRelationPredicate1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__Group__0_in_rulePropertyRelationPredicate1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentencePredicate_in_entryRuleDefinitionSentencePredicate1217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionSentencePredicate1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentencePredicate__SentenceAssignment_in_ruleDefinitionSentencePredicate1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateReference_in_entryRulePredicateReference1277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateReference1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateReference__Group__0_in_rulePredicateReference1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NodeAssignment_in_ruleParameter1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList1397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__0_in_ruleParameterList1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument1457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NodeAssignment_in_ruleArgument1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentList_in_entryRuleArgumentList1517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentList1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group__0_in_ruleArgumentList1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentList_in_entryRuleAssignmentList1637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentList1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group__0_in_ruleAssignmentList1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantification_in_entryRuleQuantification1697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantification1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__Group__0_in_ruleQuantification1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantificationList_in_entryRuleQuantificationList1757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantificationList1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group__0_in_ruleQuantificationList1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_entryRulePropertyExpression1817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyExpression1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyExpression__Alternatives_in_rulePropertyExpression1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValueExpression_in_entryRulePropertyValueExpression1877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValueExpression1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueExpression__Group__0_in_rulePropertyValueExpression1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReferenceExpression_in_entryRulePropertyReferenceExpression1937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyReferenceExpression1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__Group__0_in_rulePropertyReferenceExpression1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantor__Alternatives_in_ruleQuantor2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationQualifier__Alternatives_in_ruleRelationQualifier2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Axis__Alternatives_in_ruleAxis2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyRelation__Alternatives_in_rulePropertyRelation2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartOnSentence_in_rule__Sentence__Alternatives2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentence_in_rule__Sentence__Alternatives2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintSentence_in_rule__Sentence__Alternatives2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateDefinitionSentence_in_rule__Sentence__Alternatives2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__QuantificationAssignment_0_0_in_rule__DefinitionSentence__Alternatives_02233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__NodeAssignment_0_1_in_rule__DefinitionSentence__Alternatives_02251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group_3_0__0_in_rule__ConstraintSentence__Alternatives_32284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ConstraintSentence__Alternatives_32303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PredicateDefinitionSentence__Alternatives_32338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PredicateDefinitionSentence__Alternatives_32358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_0__0_in_rule__SelectorList__Alternatives2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_1__0_in_rule__SelectorList__Alternatives2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SelectorListDef__Alternatives_1_02444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SelectorListDef__Alternatives_1_02464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AndExpression__Alternatives_1_12499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AndExpression__Alternatives_1_12519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ImpliesExpression__Alternatives_1_02554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ImpliesExpression__Alternatives_1_02574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__CallAssignment_1_0_in_rule__PrimaryExpression__Alternatives_12608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1_1__0_in_rule__PrimaryExpression__Alternatives_12626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRelationPredicate_in_rule__PredicateCall__Alternatives_02659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentencePredicate_in_rule__PredicateCall__Alternatives_02676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateReference_in_rule__PredicateCall__Alternatives_02693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Assignment__Alternatives_12726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Assignment__Alternatives_12746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValueExpression_in_rule__PropertyExpression__Alternatives2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReferenceExpression_in_rule__PropertyExpression__Alternatives2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Quantor__Alternatives2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Quantor__Alternatives2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RelationQualifier__Alternatives2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RelationQualifier__Alternatives2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RelationQualifier__Alternatives2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Axis__Alternatives2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Axis__Alternatives2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Axis__Alternatives3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Axis__Alternatives3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Axis__Alternatives3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Axis__Alternatives3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Axis__Alternatives3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Axis__Alternatives3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PropertyRelation__Alternatives3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PropertyRelation__Alternatives3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PropertyRelation__Alternatives3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__PropertyRelation__Alternatives3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__PropertyRelation__Alternatives3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__PropertyRelation__Alternatives3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartOnSentence__Group__0__Impl_in_rule__StartOnSentence__Group__03286 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__StartOnSentence__Group__1_in_rule__StartOnSentence__Group__03289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__StartOnSentence__Group__0__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartOnSentence__Group__1__Impl_in_rule__StartOnSentence__Group__13348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartOnSentence__Group__2_in_rule__StartOnSentence__Group__13351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__StartOnSentence__Group__1__Impl3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartOnSentence__Group__2__Impl_in_rule__StartOnSentence__Group__23410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartOnSentence__DefinitionAssignment_2_in_rule__StartOnSentence__Group__2__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__Group__0__Impl_in_rule__DefinitionSentence__Group__03473 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__Group__1_in_rule__DefinitionSentence__Group__03476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__Alternatives_0_in_rule__DefinitionSentence__Group__0__Impl3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__Group__1__Impl_in_rule__DefinitionSentence__Group__13533 = new BitSet(new long[]{0x00000001FE000000L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__Group__2_in_rule__DefinitionSentence__Group__13536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__QualifierAssignment_1_in_rule__DefinitionSentence__Group__1__Impl3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__Group__2__Impl_in_rule__DefinitionSentence__Group__23593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__TargetAssignment_2_in_rule__DefinitionSentence__Group__2__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__0__Impl_in_rule__ConstraintSentence__Group__03656 = new BitSet(new long[]{0x0000040000300810L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__1_in_rule__ConstraintSentence__Group__03659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ConstraintSentence__Group__0__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__1__Impl_in_rule__ConstraintSentence__Group__13718 = new BitSet(new long[]{0x0000040000300810L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__2_in_rule__ConstraintSentence__Group__13721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__QuantificationsAssignment_1_in_rule__ConstraintSentence__Group__1__Impl3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__2__Impl_in_rule__ConstraintSentence__Group__23779 = new BitSet(new long[]{0x0000040000300810L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__3_in_rule__ConstraintSentence__Group__23782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__NodesAssignment_2_in_rule__ConstraintSentence__Group__2__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__3__Impl_in_rule__ConstraintSentence__Group__33840 = new BitSet(new long[]{0x1308000000300010L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__4_in_rule__ConstraintSentence__Group__33843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Alternatives_3_in_rule__ConstraintSentence__Group__3__Impl3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__4__Impl_in_rule__ConstraintSentence__Group__43900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__PredicateAssignment_4_in_rule__ConstraintSentence__Group__4__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group_3_0__0__Impl_in_rule__ConstraintSentence__Group_3_0__03967 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group_3_0__1_in_rule__ConstraintSentence__Group_3_0__03970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ConstraintSentence__Group_3_0__0__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group_3_0__1__Impl_in_rule__ConstraintSentence__Group_3_0__14029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ConstraintSentence__Group_3_0__1__Impl4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__0__Impl_in_rule__PredicateDefinitionSentence__Group__04092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__1_in_rule__PredicateDefinitionSentence__Group__04095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__PredicateDefinitionSentence__Group__0__Impl4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__1__Impl_in_rule__PredicateDefinitionSentence__Group__14154 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__2_in_rule__PredicateDefinitionSentence__Group__14157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__NameAssignment_1_in_rule__PredicateDefinitionSentence__Group__1__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__2__Impl_in_rule__PredicateDefinitionSentence__Group__24214 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__3_in_rule__PredicateDefinitionSentence__Group__24217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__ParametersAssignment_2_in_rule__PredicateDefinitionSentence__Group__2__Impl4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__3__Impl_in_rule__PredicateDefinitionSentence__Group__34275 = new BitSet(new long[]{0x1308000000300010L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__4_in_rule__PredicateDefinitionSentence__Group__34278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Alternatives_3_in_rule__PredicateDefinitionSentence__Group__3__Impl4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__4__Impl_in_rule__PredicateDefinitionSentence__Group__44335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__PredicateAssignment_4_in_rule__PredicateDefinitionSentence__Group__4__Impl4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__0__Impl_in_rule__NodeDefinition__Group__04402 = new BitSet(new long[]{0x080C000000000000L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__1_in_rule__NodeDefinition__Group__04405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__NameAssignment_0_in_rule__NodeDefinition__Group__0__Impl4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__1__Impl_in_rule__NodeDefinition__Group__14462 = new BitSet(new long[]{0x080C000000000000L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__2_in_rule__NodeDefinition__Group__14465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__CollectionAssignment_1_in_rule__NodeDefinition__Group__1__Impl4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__2__Impl_in_rule__NodeDefinition__Group__24523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__SelectorsAssignment_2_in_rule__NodeDefinition__Group__2__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group__0__Impl_in_rule__NodeReferenceList__Group__04587 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group__1_in_rule__NodeReferenceList__Group__04590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__NodesAssignment_0_in_rule__NodeReferenceList__Group__0__Impl4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group__1__Impl_in_rule__NodeReferenceList__Group__14647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group_1__0_in_rule__NodeReferenceList__Group__1__Impl4674 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group_1__0__Impl_in_rule__NodeReferenceList__Group_1__04709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group_1__1_in_rule__NodeReferenceList__Group_1__04712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NodeReferenceList__Group_1__0__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group_1__1__Impl_in_rule__NodeReferenceList__Group_1__14771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__NodesAssignment_1_1_in_rule__NodeReferenceList__Group_1__1__Impl4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__0__Impl_in_rule__TargetDefinition__Group__04832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__1_in_rule__TargetDefinition__Group__04835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__AxisAssignment_0_in_rule__TargetDefinition__Group__0__Impl4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__1__Impl_in_rule__TargetDefinition__Group__14892 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__2_in_rule__TargetDefinition__Group__14895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__DefinitionAssignment_1_in_rule__TargetDefinition__Group__1__Impl4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__2__Impl_in_rule__TargetDefinition__Group__24952 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__3_in_rule__TargetDefinition__Group__24955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__0_in_rule__TargetDefinition__Group__2__Impl4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__3__Impl_in_rule__TargetDefinition__Group__35013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__0_in_rule__TargetDefinition__Group__3__Impl5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__0__Impl_in_rule__TargetDefinition__Group_2__05079 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__1_in_rule__TargetDefinition__Group_2__05082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__TargetDefinition__Group_2__0__Impl5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__1__Impl_in_rule__TargetDefinition__Group_2__15141 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__2_in_rule__TargetDefinition__Group_2__15144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TargetDefinition__Group_2__1__Impl5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__2__Impl_in_rule__TargetDefinition__Group_2__25203 = new BitSet(new long[]{0x1308000000300010L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__3_in_rule__TargetDefinition__Group_2__25206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__TargetDefinition__Group_2__2__Impl5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__3__Impl_in_rule__TargetDefinition__Group_2__35265 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__4_in_rule__TargetDefinition__Group_2__35268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__PredicateAssignment_2_3_in_rule__TargetDefinition__Group_2__3__Impl5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__4__Impl_in_rule__TargetDefinition__Group_2__45325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TargetDefinition__Group_2__4__Impl5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__0__Impl_in_rule__TargetDefinition__Group_3__05394 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__1_in_rule__TargetDefinition__Group_3__05397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TargetDefinition__Group_3__0__Impl5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__1__Impl_in_rule__TargetDefinition__Group_3__15456 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__2_in_rule__TargetDefinition__Group_3__15459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TargetDefinition__Group_3__1__Impl5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__2__Impl_in_rule__TargetDefinition__Group_3__25518 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__3_in_rule__TargetDefinition__Group_3__25521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__TargetDefinition__Group_3__2__Impl5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__3__Impl_in_rule__TargetDefinition__Group_3__35580 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__4_in_rule__TargetDefinition__Group_3__35583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__AssignmentsAssignment_3_3_in_rule__TargetDefinition__Group_3__3__Impl5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__4__Impl_in_rule__TargetDefinition__Group_3__45640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TargetDefinition__Group_3__4__Impl5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_0__0__Impl_in_rule__SelectorList__Group_0__05709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_0__1_in_rule__SelectorList__Group_0__05712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__SelectorList__Group_0__0__Impl5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_0__1__Impl_in_rule__SelectorList__Group_0__15771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__SelectorsAssignment_0_1_in_rule__SelectorList__Group_0__1__Impl5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_1__0__Impl_in_rule__SelectorList__Group_1__05832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_1__1_in_rule__SelectorList__Group_1__05835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__SelectorList__Group_1__0__Impl5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_1__1__Impl_in_rule__SelectorList__Group_1__15894 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_1__2_in_rule__SelectorList__Group_1__15897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__SelectorsAssignment_1_1_in_rule__SelectorList__Group_1__1__Impl5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_1__2__Impl_in_rule__SelectorList__Group_1__25954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__SelectorList__Group_1__2__Impl5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group__0__Impl_in_rule__SelectorListDef__Group__06019 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group__1_in_rule__SelectorListDef__Group__06022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__SelectorsAssignment_0_in_rule__SelectorListDef__Group__0__Impl6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group__1__Impl_in_rule__SelectorListDef__Group__16079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group_1__0_in_rule__SelectorListDef__Group__1__Impl6106 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group_1__0__Impl_in_rule__SelectorListDef__Group_1__06141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group_1__1_in_rule__SelectorListDef__Group_1__06144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Alternatives_1_0_in_rule__SelectorListDef__Group_1__0__Impl6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group_1__1__Impl_in_rule__SelectorListDef__Group_1__16201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__SelectorsAssignment_1_1_in_rule__SelectorListDef__Group_1__1__Impl6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__06262 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__06265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__AndExpression__Group__0__Impl6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__16321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl6348 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__06383 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__06386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__16444 = new BitSet(new long[]{0x1308000000300010L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__16447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Alternatives_1_1_in_rule__AndExpression__Group_1__1__Impl6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__26504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__RhsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl6531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__06567 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__06570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_rule__OrExpression__Group__0__Impl6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__16626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl6653 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__06688 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__06691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__16749 = new BitSet(new long[]{0x1308000000300010L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__16752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__OrExpression__Group_1__1__Impl6780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__26811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__RhsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl6838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group__0__Impl_in_rule__ImpliesExpression__Group__06874 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group__1_in_rule__ImpliesExpression__Group__06877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__LhsAssignment_0_in_rule__ImpliesExpression__Group__0__Impl6904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group__1__Impl_in_rule__ImpliesExpression__Group__16934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group_1__0_in_rule__ImpliesExpression__Group__1__Impl6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group_1__0__Impl_in_rule__ImpliesExpression__Group_1__06996 = new BitSet(new long[]{0x1308000000300010L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group_1__1_in_rule__ImpliesExpression__Group_1__06999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Alternatives_1_0_in_rule__ImpliesExpression__Group_1__0__Impl7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group_1__1__Impl_in_rule__ImpliesExpression__Group_1__17056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__RhsAssignment_1_1_in_rule__ImpliesExpression__Group_1__1__Impl7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group__0__Impl_in_rule__PrimaryExpression__Group__07117 = new BitSet(new long[]{0x1308000000300010L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group__1_in_rule__PrimaryExpression__Group__07120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__NegatedAssignment_0_in_rule__PrimaryExpression__Group__0__Impl7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group__1__Impl_in_rule__PrimaryExpression__Group__17178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_1_in_rule__PrimaryExpression__Group__1__Impl7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1_1__0__Impl_in_rule__PrimaryExpression__Group_1_1__07239 = new BitSet(new long[]{0x1308000000300010L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1_1__1_in_rule__PrimaryExpression__Group_1_1__07242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__PrimaryExpression__Group_1_1__0__Impl7270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1_1__1__Impl_in_rule__PrimaryExpression__Group_1_1__17301 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1_1__2_in_rule__PrimaryExpression__Group_1_1__17304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__InnerAssignment_1_1_1_in_rule__PrimaryExpression__Group_1_1__1__Impl7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1_1__2__Impl_in_rule__PrimaryExpression__Group_1_1__27361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__PrimaryExpression__Group_1_1__2__Impl7389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group__0__Impl_in_rule__PredicateCall__Group__07426 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group__1_in_rule__PredicateCall__Group__07429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Alternatives_0_in_rule__PredicateCall__Group__0__Impl7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group__1__Impl_in_rule__PredicateCall__Group__17486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group_1__0_in_rule__PredicateCall__Group__1__Impl7513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group_1__0__Impl_in_rule__PredicateCall__Group_1__07548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group_1__1_in_rule__PredicateCall__Group_1__07551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__PredicateCall__Group_1__0__Impl7579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group_1__1__Impl_in_rule__PredicateCall__Group_1__17610 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group_1__2_in_rule__PredicateCall__Group_1__17613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__LabelAssignment_1_1_in_rule__PredicateCall__Group_1__1__Impl7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group_1__2__Impl_in_rule__PredicateCall__Group_1__27670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__PredicateCall__Group_1__2__Impl7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__Group__0__Impl_in_rule__PropertyRelationPredicate__Group__07735 = new BitSet(new long[]{0x0000007E00000000L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__Group__1_in_rule__PropertyRelationPredicate__Group__07738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__LhsAssignment_0_in_rule__PropertyRelationPredicate__Group__0__Impl7765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__Group__1__Impl_in_rule__PropertyRelationPredicate__Group__17795 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__Group__2_in_rule__PropertyRelationPredicate__Group__17798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__RelationAssignment_1_in_rule__PropertyRelationPredicate__Group__1__Impl7825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__Group__2__Impl_in_rule__PropertyRelationPredicate__Group__27855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__RhsAssignment_2_in_rule__PropertyRelationPredicate__Group__2__Impl7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateReference__Group__0__Impl_in_rule__PredicateReference__Group__07918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PredicateReference__Group__1_in_rule__PredicateReference__Group__07921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateReference__ReferenceAssignment_0_in_rule__PredicateReference__Group__0__Impl7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateReference__Group__1__Impl_in_rule__PredicateReference__Group__17978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateReference__ArgumentsAssignment_1_in_rule__PredicateReference__Group__1__Impl8005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__0__Impl_in_rule__ParameterList__Group__08039 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__08042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ParametersAssignment_0_in_rule__ParameterList__Group__0__Impl8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__1__Impl_in_rule__ParameterList__Group__18099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__0_in_rule__ParameterList__Group__1__Impl8126 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__0__Impl_in_rule__ParameterList__Group_1__08161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__1_in_rule__ParameterList__Group_1__08164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ParameterList__Group_1__0__Impl8192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__1__Impl_in_rule__ParameterList__Group_1__18223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ParametersAssignment_1_1_in_rule__ParameterList__Group_1__1__Impl8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group__0__Impl_in_rule__ArgumentList__Group__08284 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group__1_in_rule__ArgumentList__Group__08287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentList__ArgumentsAssignment_0_in_rule__ArgumentList__Group__0__Impl8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group__1__Impl_in_rule__ArgumentList__Group__18344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group_1__0_in_rule__ArgumentList__Group__1__Impl8371 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group_1__0__Impl_in_rule__ArgumentList__Group_1__08406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group_1__1_in_rule__ArgumentList__Group_1__08409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ArgumentList__Group_1__0__Impl8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group_1__1__Impl_in_rule__ArgumentList__Group_1__18468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentList__ArgumentsAssignment_1_1_in_rule__ArgumentList__Group_1__1__Impl8495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__08529 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__08532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ReferenceAssignment_0_in_rule__Assignment__Group__0__Impl8559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__18589 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__18592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Alternatives_1_in_rule__Assignment__Group__1__Impl8619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__28649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_in_rule__Assignment__Group__2__Impl8676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group__0__Impl_in_rule__AssignmentList__Group__08712 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group__1_in_rule__AssignmentList__Group__08715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentList__AssignmentsAssignment_0_in_rule__AssignmentList__Group__0__Impl8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group__1__Impl_in_rule__AssignmentList__Group__18772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group_1__0_in_rule__AssignmentList__Group__1__Impl8799 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group_1__0__Impl_in_rule__AssignmentList__Group_1__08834 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group_1__1_in_rule__AssignmentList__Group_1__08837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AssignmentList__Group_1__0__Impl8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group_1__1__Impl_in_rule__AssignmentList__Group_1__18896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentList__AssignmentsAssignment_1_1_in_rule__AssignmentList__Group_1__1__Impl8923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__Group__0__Impl_in_rule__Quantification__Group__08957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Quantification__Group__1_in_rule__Quantification__Group__08960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__QuantorAssignment_0_in_rule__Quantification__Group__0__Impl8987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__Group__1__Impl_in_rule__Quantification__Group__19017 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__Quantification__Group__2_in_rule__Quantification__Group__19020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__NodeAssignment_1_in_rule__Quantification__Group__1__Impl9047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__Group__2__Impl_in_rule__Quantification__Group__29077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Quantification__Group__3_in_rule__Quantification__Group__29080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Quantification__Group__2__Impl9108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__Group__3__Impl_in_rule__Quantification__Group__39139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__NodeSetAssignment_3_in_rule__Quantification__Group__3__Impl9166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group__0__Impl_in_rule__QuantificationList__Group__09204 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group__1_in_rule__QuantificationList__Group__09207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantificationList__QuantificationsAssignment_0_in_rule__QuantificationList__Group__0__Impl9234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group__1__Impl_in_rule__QuantificationList__Group__19264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group_1__0_in_rule__QuantificationList__Group__1__Impl9291 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group_1__0__Impl_in_rule__QuantificationList__Group_1__09326 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group_1__1_in_rule__QuantificationList__Group_1__09329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QuantificationList__Group_1__0__Impl9357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group_1__1__Impl_in_rule__QuantificationList__Group_1__19388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantificationList__QuantificationsAssignment_1_1_in_rule__QuantificationList__Group_1__1__Impl9415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueExpression__Group__0__Impl_in_rule__PropertyValueExpression__Group__09449 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PropertyValueExpression__Group__1_in_rule__PropertyValueExpression__Group__09452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__PropertyValueExpression__Group__0__Impl9480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueExpression__Group__1__Impl_in_rule__PropertyValueExpression__Group__19511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueExpression__ValueAssignment_1_in_rule__PropertyValueExpression__Group__1__Impl9538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__Group__0__Impl_in_rule__PropertyReferenceExpression__Group__09572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__Group__1_in_rule__PropertyReferenceExpression__Group__09575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__PropertyReferenceExpression__Group__0__Impl9603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__Group__1__Impl_in_rule__PropertyReferenceExpression__Group__19634 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__Group__2_in_rule__PropertyReferenceExpression__Group__19637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__NodeAssignment_1_in_rule__PropertyReferenceExpression__Group__1__Impl9664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__Group__2__Impl_in_rule__PropertyReferenceExpression__Group__29694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__Group__3_in_rule__PropertyReferenceExpression__Group__29697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__PropertyReferenceExpression__Group__2__Impl9725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__Group__3__Impl_in_rule__PropertyReferenceExpression__Group__39756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__PropertyAssignment_3_in_rule__PropertyReferenceExpression__Group__3__Impl9783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_rule__Validator__SentencesAssignment9826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_rule__StartOnSentence__DefinitionAssignment_29857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantification_in_rule__DefinitionSentence__QuantificationAssignment_0_09888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefinitionSentence__NodeAssignment_0_19923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationQualifier_in_rule__DefinitionSentence__QualifierAssignment_19958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetDefinition_in_rule__DefinitionSentence__TargetAssignment_29989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantificationList_in_rule__ConstraintSentence__QuantificationsAssignment_110020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeReferenceList_in_rule__ConstraintSentence__NodesAssignment_210051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rule__ConstraintSentence__PredicateAssignment_410082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PredicateDefinitionSentence__NameAssignment_110113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_rule__PredicateDefinitionSentence__ParametersAssignment_210144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rule__PredicateDefinitionSentence__PredicateAssignment_410175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeDefinition__NameAssignment_010206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__NodeDefinition__CollectionAssignment_110242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorList_in_rule__NodeDefinition__SelectorsAssignment_210281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeReferenceList__NodesAssignment_010316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeReferenceList__NodesAssignment_1_110355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxis_in_rule__TargetDefinition__AxisAssignment_010390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_rule__TargetDefinition__DefinitionAssignment_110421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rule__TargetDefinition__PredicateAssignment_2_310452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentList_in_rule__TargetDefinition__AssignmentsAssignment_3_310483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorListDef_in_rule__SelectorList__SelectorsAssignment_0_110514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorListDef_in_rule__SelectorList__SelectorsAssignment_1_110545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__SelectorListDef__SelectorsAssignment_010576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__SelectorListDef__SelectorsAssignment_1_110607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Selector__TypeAssignment10638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__AndExpression__RhsAssignment_1_210669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_rule__OrExpression__RhsAssignment_1_210700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__ImpliesExpression__LhsAssignment_010731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__ImpliesExpression__RhsAssignment_1_110762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__PrimaryExpression__NegatedAssignment_010798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateCall_in_rule__PrimaryExpression__CallAssignment_1_010837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rule__PrimaryExpression__InnerAssignment_1_1_110868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PredicateCall__LabelAssignment_1_110899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_rule__PropertyRelationPredicate__LhsAssignment_010930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRelation_in_rule__PropertyRelationPredicate__RelationAssignment_110961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_rule__PropertyRelationPredicate__RhsAssignment_210992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentence_in_rule__DefinitionSentencePredicate__SentenceAssignment11023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PredicateReference__ReferenceAssignment_011058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentList_in_rule__PredicateReference__ArgumentsAssignment_111093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_rule__Parameter__NodeAssignment11124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParameterList__ParametersAssignment_011155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParameterList__ParametersAssignment_1_111186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__NodeAssignment11221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__ArgumentList__ArgumentsAssignment_011256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__ArgumentList__ArgumentsAssignment_1_111287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReferenceExpression_in_rule__Assignment__ReferenceAssignment_011318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_rule__Assignment__ExpressionAssignment_211349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__AssignmentList__AssignmentsAssignment_011380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__AssignmentList__AssignmentsAssignment_1_111411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantor_in_rule__Quantification__QuantorAssignment_011442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_rule__Quantification__NodeAssignment_111473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Quantification__NodeSetAssignment_311508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantification_in_rule__QuantificationList__QuantificationsAssignment_011543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantification_in_rule__QuantificationList__QuantificationsAssignment_1_111574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertyValueExpression__ValueAssignment_111605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyReferenceExpression__NodeAssignment_111640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyReferenceExpression__PropertyAssignment_311675 = new BitSet(new long[]{0x0000000000000002L});

}