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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'holds that'", "':'", "'as'", "'and'", "','", "'implies'", "'=>'", "'becomes'", "':='", "'each'", "'any'", "'must have'", "'must not have'", "'can have'", "'parent'", "'child'", "'ancestor'", "'descendant'", "'multiple parents'", "'multiple children'", "'multiple ancestors'", "'multiple descendants'", "'equals'", "'not equals'", "'greater than'", "'lesser than'", "'greater or equals than'", "'lesser or equals than'", "'start on'", "'for'", "'define'", "'where holds'", "'{'", "'}'", "'with property'", "'being'", "'('", "')'", "'or'", "'['", "']'", "'in'", "'.'", "'*'", "'not'"
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

                if ( (LA1_0==RULE_ID||(LA1_0>=20 && LA1_0<=21)||(LA1_0>=39 && LA1_0<=41)) ) {
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:916:1: rulePropertyValueExpression : ( ( rule__PropertyValueExpression__ValueAssignment ) ) ;
    public final void rulePropertyValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:920:2: ( ( ( rule__PropertyValueExpression__ValueAssignment ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:921:1: ( ( rule__PropertyValueExpression__ValueAssignment ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:921:1: ( ( rule__PropertyValueExpression__ValueAssignment ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:922:1: ( rule__PropertyValueExpression__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueExpressionAccess().getValueAssignment()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:923:1: ( rule__PropertyValueExpression__ValueAssignment )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:923:2: rule__PropertyValueExpression__ValueAssignment
            {
            pushFollow(FOLLOW_rule__PropertyValueExpression__ValueAssignment_in_rulePropertyValueExpression1910);
            rule__PropertyValueExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueExpressionAccess().getValueAssignment()); 

            }


            }

        }
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
            case 40:
                {
                alt2=3;
                }
                break;
            case 41:
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1095:1: rule__ConstraintSentence__Alternatives_3 : ( ( 'holds that' ) | ( ':' ) );
    public final void rule__ConstraintSentence__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1099:1: ( ( 'holds that' ) | ( ':' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1100:1: ( 'holds that' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1100:1: ( 'holds that' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1101:1: 'holds that'
                    {
                     before(grammarAccess.getConstraintSentenceAccess().getHoldsThatKeyword_3_0()); 
                    match(input,11,FOLLOW_11_in_rule__ConstraintSentence__Alternatives_32285); 
                     after(grammarAccess.getConstraintSentenceAccess().getHoldsThatKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1108:6: ( ':' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1108:6: ( ':' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1109:1: ':'
                    {
                     before(grammarAccess.getConstraintSentenceAccess().getColonKeyword_3_1()); 
                    match(input,12,FOLLOW_12_in_rule__ConstraintSentence__Alternatives_32305); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1121:1: rule__PredicateDefinitionSentence__Alternatives_3 : ( ( 'as' ) | ( ':' ) );
    public final void rule__PredicateDefinitionSentence__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1125:1: ( ( 'as' ) | ( ':' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1126:1: ( 'as' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1126:1: ( 'as' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1127:1: 'as'
                    {
                     before(grammarAccess.getPredicateDefinitionSentenceAccess().getAsKeyword_3_0()); 
                    match(input,13,FOLLOW_13_in_rule__PredicateDefinitionSentence__Alternatives_32340); 
                     after(grammarAccess.getPredicateDefinitionSentenceAccess().getAsKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1134:6: ( ':' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1134:6: ( ':' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1135:1: ':'
                    {
                     before(grammarAccess.getPredicateDefinitionSentenceAccess().getColonKeyword_3_1()); 
                    match(input,12,FOLLOW_12_in_rule__PredicateDefinitionSentence__Alternatives_32360); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1147:1: rule__SelectorList__Alternatives : ( ( ( rule__SelectorList__Group_0__0 ) ) | ( ( rule__SelectorList__Group_1__0 ) ) );
    public final void rule__SelectorList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1151:1: ( ( ( rule__SelectorList__Group_0__0 ) ) | ( ( rule__SelectorList__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==46) ) {
                alt6=1;
            }
            else if ( (LA6_0==47) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1152:1: ( ( rule__SelectorList__Group_0__0 ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1152:1: ( ( rule__SelectorList__Group_0__0 ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1153:1: ( rule__SelectorList__Group_0__0 )
                    {
                     before(grammarAccess.getSelectorListAccess().getGroup_0()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1154:1: ( rule__SelectorList__Group_0__0 )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1154:2: rule__SelectorList__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SelectorList__Group_0__0_in_rule__SelectorList__Alternatives2394);
                    rule__SelectorList__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorListAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1158:6: ( ( rule__SelectorList__Group_1__0 ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1158:6: ( ( rule__SelectorList__Group_1__0 ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1159:1: ( rule__SelectorList__Group_1__0 )
                    {
                     before(grammarAccess.getSelectorListAccess().getGroup_1()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1160:1: ( rule__SelectorList__Group_1__0 )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1160:2: rule__SelectorList__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SelectorList__Group_1__0_in_rule__SelectorList__Alternatives2412);
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


    // $ANTLR start "rule__AndExpression__Alternatives_1_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1169:1: rule__AndExpression__Alternatives_1_1 : ( ( 'and' ) | ( ',' ) );
    public final void rule__AndExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1173:1: ( ( 'and' ) | ( ',' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1174:1: ( 'and' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1174:1: ( 'and' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1175:1: 'and'
                    {
                     before(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1_0()); 
                    match(input,14,FOLLOW_14_in_rule__AndExpression__Alternatives_1_12446); 
                     after(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1182:6: ( ',' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1182:6: ( ',' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1183:1: ','
                    {
                     before(grammarAccess.getAndExpressionAccess().getCommaKeyword_1_1_1()); 
                    match(input,15,FOLLOW_15_in_rule__AndExpression__Alternatives_1_12466); 
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


    // $ANTLR start "rule__ImpliesExpression__Alternatives_1_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1195:1: rule__ImpliesExpression__Alternatives_1_1 : ( ( 'implies' ) | ( '=>' ) );
    public final void rule__ImpliesExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1199:1: ( ( 'implies' ) | ( '=>' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1200:1: ( 'implies' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1200:1: ( 'implies' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1201:1: 'implies'
                    {
                     before(grammarAccess.getImpliesExpressionAccess().getImpliesKeyword_1_1_0()); 
                    match(input,16,FOLLOW_16_in_rule__ImpliesExpression__Alternatives_1_12501); 
                     after(grammarAccess.getImpliesExpressionAccess().getImpliesKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1208:6: ( '=>' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1208:6: ( '=>' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1209:1: '=>'
                    {
                     before(grammarAccess.getImpliesExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_1_1()); 
                    match(input,17,FOLLOW_17_in_rule__ImpliesExpression__Alternatives_1_12521); 
                     after(grammarAccess.getImpliesExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_1_1()); 

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
    // $ANTLR end "rule__ImpliesExpression__Alternatives_1_1"


    // $ANTLR start "rule__PrimaryExpression__Alternatives_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1221:1: rule__PrimaryExpression__Alternatives_1 : ( ( ( rule__PrimaryExpression__CallAssignment_1_0 ) ) | ( ( rule__PrimaryExpression__Group_1_1__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1225:1: ( ( ( rule__PrimaryExpression__CallAssignment_1_0 ) ) | ( ( rule__PrimaryExpression__Group_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||(LA9_0>=20 && LA9_0<=21)) ) {
                alt9=1;
            }
            else if ( (LA9_0==47) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1226:1: ( ( rule__PrimaryExpression__CallAssignment_1_0 ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1226:1: ( ( rule__PrimaryExpression__CallAssignment_1_0 ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1227:1: ( rule__PrimaryExpression__CallAssignment_1_0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getCallAssignment_1_0()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1228:1: ( rule__PrimaryExpression__CallAssignment_1_0 )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1228:2: rule__PrimaryExpression__CallAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__CallAssignment_1_0_in_rule__PrimaryExpression__Alternatives_12555);
                    rule__PrimaryExpression__CallAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getCallAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1232:6: ( ( rule__PrimaryExpression__Group_1_1__0 ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1232:6: ( ( rule__PrimaryExpression__Group_1_1__0 ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1233:1: ( rule__PrimaryExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1_1()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1234:1: ( rule__PrimaryExpression__Group_1_1__0 )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1234:2: rule__PrimaryExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_1_1__0_in_rule__PrimaryExpression__Alternatives_12573);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1243:1: rule__PredicateCall__Alternatives_0 : ( ( rulePropertyRelationPredicate ) | ( ruleDefinitionSentencePredicate ) | ( rulePredicateReference ) );
    public final void rule__PredicateCall__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1247:1: ( ( rulePropertyRelationPredicate ) | ( ruleDefinitionSentencePredicate ) | ( rulePredicateReference ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt10=3;
                    }
                    break;
                case 53:
                    {
                    alt10=1;
                    }
                    break;
                case 22:
                case 23:
                case 24:
                    {
                    alt10=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }

                }
                break;
            case 20:
            case 21:
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1248:1: ( rulePropertyRelationPredicate )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1248:1: ( rulePropertyRelationPredicate )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1249:1: rulePropertyRelationPredicate
                    {
                     before(grammarAccess.getPredicateCallAccess().getPropertyRelationPredicateParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_rulePropertyRelationPredicate_in_rule__PredicateCall__Alternatives_02606);
                    rulePropertyRelationPredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateCallAccess().getPropertyRelationPredicateParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1254:6: ( ruleDefinitionSentencePredicate )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1254:6: ( ruleDefinitionSentencePredicate )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1255:1: ruleDefinitionSentencePredicate
                    {
                     before(grammarAccess.getPredicateCallAccess().getDefinitionSentencePredicateParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleDefinitionSentencePredicate_in_rule__PredicateCall__Alternatives_02623);
                    ruleDefinitionSentencePredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateCallAccess().getDefinitionSentencePredicateParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1260:6: ( rulePredicateReference )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1260:6: ( rulePredicateReference )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1261:1: rulePredicateReference
                    {
                     before(grammarAccess.getPredicateCallAccess().getPredicateReferenceParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_rulePredicateReference_in_rule__PredicateCall__Alternatives_02640);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1271:1: rule__Assignment__Alternatives_1 : ( ( 'becomes' ) | ( ':=' ) );
    public final void rule__Assignment__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1275:1: ( ( 'becomes' ) | ( ':=' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1276:1: ( 'becomes' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1276:1: ( 'becomes' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1277:1: 'becomes'
                    {
                     before(grammarAccess.getAssignmentAccess().getBecomesKeyword_1_0()); 
                    match(input,18,FOLLOW_18_in_rule__Assignment__Alternatives_12673); 
                     after(grammarAccess.getAssignmentAccess().getBecomesKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1284:6: ( ':=' )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1284:6: ( ':=' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1285:1: ':='
                    {
                     before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1_1()); 
                    match(input,19,FOLLOW_19_in_rule__Assignment__Alternatives_12693); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1297:1: rule__PropertyExpression__Alternatives : ( ( rulePropertyValueExpression ) | ( rulePropertyReferenceExpression ) );
    public final void rule__PropertyExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1301:1: ( ( rulePropertyValueExpression ) | ( rulePropertyReferenceExpression ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1302:1: ( rulePropertyValueExpression )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1302:1: ( rulePropertyValueExpression )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1303:1: rulePropertyValueExpression
                    {
                     before(grammarAccess.getPropertyExpressionAccess().getPropertyValueExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePropertyValueExpression_in_rule__PropertyExpression__Alternatives2727);
                    rulePropertyValueExpression();

                    state._fsp--;

                     after(grammarAccess.getPropertyExpressionAccess().getPropertyValueExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1308:6: ( rulePropertyReferenceExpression )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1308:6: ( rulePropertyReferenceExpression )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1309:1: rulePropertyReferenceExpression
                    {
                     before(grammarAccess.getPropertyExpressionAccess().getPropertyReferenceExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePropertyReferenceExpression_in_rule__PropertyExpression__Alternatives2744);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1319:1: rule__Quantor__Alternatives : ( ( ( 'each' ) ) | ( ( 'any' ) ) );
    public final void rule__Quantor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1323:1: ( ( ( 'each' ) ) | ( ( 'any' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==21) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1324:1: ( ( 'each' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1324:1: ( ( 'each' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1325:1: ( 'each' )
                    {
                     before(grammarAccess.getQuantorAccess().getEachEnumLiteralDeclaration_0()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1326:1: ( 'each' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1326:3: 'each'
                    {
                    match(input,20,FOLLOW_20_in_rule__Quantor__Alternatives2777); 

                    }

                     after(grammarAccess.getQuantorAccess().getEachEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1331:6: ( ( 'any' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1331:6: ( ( 'any' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1332:1: ( 'any' )
                    {
                     before(grammarAccess.getQuantorAccess().getAnyEnumLiteralDeclaration_1()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1333:1: ( 'any' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1333:3: 'any'
                    {
                    match(input,21,FOLLOW_21_in_rule__Quantor__Alternatives2798); 

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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1343:1: rule__RelationQualifier__Alternatives : ( ( ( 'must have' ) ) | ( ( 'must not have' ) ) | ( ( 'can have' ) ) );
    public final void rule__RelationQualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1347:1: ( ( ( 'must have' ) ) | ( ( 'must not have' ) ) | ( ( 'can have' ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt14=1;
                }
                break;
            case 23:
                {
                alt14=2;
                }
                break;
            case 24:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1348:1: ( ( 'must have' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1348:1: ( ( 'must have' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1349:1: ( 'must have' )
                    {
                     before(grammarAccess.getRelationQualifierAccess().getMustEnumLiteralDeclaration_0()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1350:1: ( 'must have' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1350:3: 'must have'
                    {
                    match(input,22,FOLLOW_22_in_rule__RelationQualifier__Alternatives2834); 

                    }

                     after(grammarAccess.getRelationQualifierAccess().getMustEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1355:6: ( ( 'must not have' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1355:6: ( ( 'must not have' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1356:1: ( 'must not have' )
                    {
                     before(grammarAccess.getRelationQualifierAccess().getMustNotEnumLiteralDeclaration_1()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1357:1: ( 'must not have' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1357:3: 'must not have'
                    {
                    match(input,23,FOLLOW_23_in_rule__RelationQualifier__Alternatives2855); 

                    }

                     after(grammarAccess.getRelationQualifierAccess().getMustNotEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1362:6: ( ( 'can have' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1362:6: ( ( 'can have' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1363:1: ( 'can have' )
                    {
                     before(grammarAccess.getRelationQualifierAccess().getCanEnumLiteralDeclaration_2()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1364:1: ( 'can have' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1364:3: 'can have'
                    {
                    match(input,24,FOLLOW_24_in_rule__RelationQualifier__Alternatives2876); 

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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1374:1: rule__Axis__Alternatives : ( ( ( 'parent' ) ) | ( ( 'child' ) ) | ( ( 'ancestor' ) ) | ( ( 'descendant' ) ) | ( ( 'multiple parents' ) ) | ( ( 'multiple children' ) ) | ( ( 'multiple ancestors' ) ) | ( ( 'multiple descendants' ) ) );
    public final void rule__Axis__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1378:1: ( ( ( 'parent' ) ) | ( ( 'child' ) ) | ( ( 'ancestor' ) ) | ( ( 'descendant' ) ) | ( ( 'multiple parents' ) ) | ( ( 'multiple children' ) ) | ( ( 'multiple ancestors' ) ) | ( ( 'multiple descendants' ) ) )
            int alt15=8;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt15=1;
                }
                break;
            case 26:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            case 28:
                {
                alt15=4;
                }
                break;
            case 29:
                {
                alt15=5;
                }
                break;
            case 30:
                {
                alt15=6;
                }
                break;
            case 31:
                {
                alt15=7;
                }
                break;
            case 32:
                {
                alt15=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1379:1: ( ( 'parent' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1379:1: ( ( 'parent' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1380:1: ( 'parent' )
                    {
                     before(grammarAccess.getAxisAccess().getParentEnumLiteralDeclaration_0()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1381:1: ( 'parent' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1381:3: 'parent'
                    {
                    match(input,25,FOLLOW_25_in_rule__Axis__Alternatives2912); 

                    }

                     after(grammarAccess.getAxisAccess().getParentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1386:6: ( ( 'child' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1386:6: ( ( 'child' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1387:1: ( 'child' )
                    {
                     before(grammarAccess.getAxisAccess().getChildEnumLiteralDeclaration_1()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1388:1: ( 'child' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1388:3: 'child'
                    {
                    match(input,26,FOLLOW_26_in_rule__Axis__Alternatives2933); 

                    }

                     after(grammarAccess.getAxisAccess().getChildEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1393:6: ( ( 'ancestor' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1393:6: ( ( 'ancestor' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1394:1: ( 'ancestor' )
                    {
                     before(grammarAccess.getAxisAccess().getAncestorEnumLiteralDeclaration_2()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1395:1: ( 'ancestor' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1395:3: 'ancestor'
                    {
                    match(input,27,FOLLOW_27_in_rule__Axis__Alternatives2954); 

                    }

                     after(grammarAccess.getAxisAccess().getAncestorEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1400:6: ( ( 'descendant' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1400:6: ( ( 'descendant' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1401:1: ( 'descendant' )
                    {
                     before(grammarAccess.getAxisAccess().getDescendantEnumLiteralDeclaration_3()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1402:1: ( 'descendant' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1402:3: 'descendant'
                    {
                    match(input,28,FOLLOW_28_in_rule__Axis__Alternatives2975); 

                    }

                     after(grammarAccess.getAxisAccess().getDescendantEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1407:6: ( ( 'multiple parents' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1407:6: ( ( 'multiple parents' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1408:1: ( 'multiple parents' )
                    {
                     before(grammarAccess.getAxisAccess().getParentsEnumLiteralDeclaration_4()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1409:1: ( 'multiple parents' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1409:3: 'multiple parents'
                    {
                    match(input,29,FOLLOW_29_in_rule__Axis__Alternatives2996); 

                    }

                     after(grammarAccess.getAxisAccess().getParentsEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1414:6: ( ( 'multiple children' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1414:6: ( ( 'multiple children' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1415:1: ( 'multiple children' )
                    {
                     before(grammarAccess.getAxisAccess().getChildrenEnumLiteralDeclaration_5()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1416:1: ( 'multiple children' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1416:3: 'multiple children'
                    {
                    match(input,30,FOLLOW_30_in_rule__Axis__Alternatives3017); 

                    }

                     after(grammarAccess.getAxisAccess().getChildrenEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1421:6: ( ( 'multiple ancestors' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1421:6: ( ( 'multiple ancestors' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1422:1: ( 'multiple ancestors' )
                    {
                     before(grammarAccess.getAxisAccess().getAncestorsEnumLiteralDeclaration_6()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1423:1: ( 'multiple ancestors' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1423:3: 'multiple ancestors'
                    {
                    match(input,31,FOLLOW_31_in_rule__Axis__Alternatives3038); 

                    }

                     after(grammarAccess.getAxisAccess().getAncestorsEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1428:6: ( ( 'multiple descendants' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1428:6: ( ( 'multiple descendants' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1429:1: ( 'multiple descendants' )
                    {
                     before(grammarAccess.getAxisAccess().getDescendantsEnumLiteralDeclaration_7()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1430:1: ( 'multiple descendants' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1430:3: 'multiple descendants'
                    {
                    match(input,32,FOLLOW_32_in_rule__Axis__Alternatives3059); 

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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1440:1: rule__PropertyRelation__Alternatives : ( ( ( 'equals' ) ) | ( ( 'not equals' ) ) | ( ( 'greater than' ) ) | ( ( 'lesser than' ) ) | ( ( 'greater or equals than' ) ) | ( ( 'lesser or equals than' ) ) );
    public final void rule__PropertyRelation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1444:1: ( ( ( 'equals' ) ) | ( ( 'not equals' ) ) | ( ( 'greater than' ) ) | ( ( 'lesser than' ) ) | ( ( 'greater or equals than' ) ) | ( ( 'lesser or equals than' ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt16=1;
                }
                break;
            case 34:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            case 36:
                {
                alt16=4;
                }
                break;
            case 37:
                {
                alt16=5;
                }
                break;
            case 38:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1445:1: ( ( 'equals' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1445:1: ( ( 'equals' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1446:1: ( 'equals' )
                    {
                     before(grammarAccess.getPropertyRelationAccess().getEqualsEnumLiteralDeclaration_0()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1447:1: ( 'equals' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1447:3: 'equals'
                    {
                    match(input,33,FOLLOW_33_in_rule__PropertyRelation__Alternatives3095); 

                    }

                     after(grammarAccess.getPropertyRelationAccess().getEqualsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1452:6: ( ( 'not equals' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1452:6: ( ( 'not equals' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1453:1: ( 'not equals' )
                    {
                     before(grammarAccess.getPropertyRelationAccess().getNotEqualsEnumLiteralDeclaration_1()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1454:1: ( 'not equals' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1454:3: 'not equals'
                    {
                    match(input,34,FOLLOW_34_in_rule__PropertyRelation__Alternatives3116); 

                    }

                     after(grammarAccess.getPropertyRelationAccess().getNotEqualsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1459:6: ( ( 'greater than' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1459:6: ( ( 'greater than' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1460:1: ( 'greater than' )
                    {
                     before(grammarAccess.getPropertyRelationAccess().getGreaterEnumLiteralDeclaration_2()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1461:1: ( 'greater than' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1461:3: 'greater than'
                    {
                    match(input,35,FOLLOW_35_in_rule__PropertyRelation__Alternatives3137); 

                    }

                     after(grammarAccess.getPropertyRelationAccess().getGreaterEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1466:6: ( ( 'lesser than' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1466:6: ( ( 'lesser than' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1467:1: ( 'lesser than' )
                    {
                     before(grammarAccess.getPropertyRelationAccess().getLesserEnumLiteralDeclaration_3()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1468:1: ( 'lesser than' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1468:3: 'lesser than'
                    {
                    match(input,36,FOLLOW_36_in_rule__PropertyRelation__Alternatives3158); 

                    }

                     after(grammarAccess.getPropertyRelationAccess().getLesserEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1473:6: ( ( 'greater or equals than' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1473:6: ( ( 'greater or equals than' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1474:1: ( 'greater or equals than' )
                    {
                     before(grammarAccess.getPropertyRelationAccess().getGreaterEqualsEnumLiteralDeclaration_4()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1475:1: ( 'greater or equals than' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1475:3: 'greater or equals than'
                    {
                    match(input,37,FOLLOW_37_in_rule__PropertyRelation__Alternatives3179); 

                    }

                     after(grammarAccess.getPropertyRelationAccess().getGreaterEqualsEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1480:6: ( ( 'lesser or equals than' ) )
                    {
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1480:6: ( ( 'lesser or equals than' ) )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1481:1: ( 'lesser or equals than' )
                    {
                     before(grammarAccess.getPropertyRelationAccess().getLesserEqualsEnumLiteralDeclaration_5()); 
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1482:1: ( 'lesser or equals than' )
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1482:3: 'lesser or equals than'
                    {
                    match(input,38,FOLLOW_38_in_rule__PropertyRelation__Alternatives3200); 

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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1494:1: rule__StartOnSentence__Group__0 : rule__StartOnSentence__Group__0__Impl rule__StartOnSentence__Group__1 ;
    public final void rule__StartOnSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1498:1: ( rule__StartOnSentence__Group__0__Impl rule__StartOnSentence__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1499:2: rule__StartOnSentence__Group__0__Impl rule__StartOnSentence__Group__1
            {
            pushFollow(FOLLOW_rule__StartOnSentence__Group__0__Impl_in_rule__StartOnSentence__Group__03233);
            rule__StartOnSentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartOnSentence__Group__1_in_rule__StartOnSentence__Group__03236);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1506:1: rule__StartOnSentence__Group__0__Impl : ( 'start on' ) ;
    public final void rule__StartOnSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1510:1: ( ( 'start on' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1511:1: ( 'start on' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1511:1: ( 'start on' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1512:1: 'start on'
            {
             before(grammarAccess.getStartOnSentenceAccess().getStartOnKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__StartOnSentence__Group__0__Impl3264); 
             after(grammarAccess.getStartOnSentenceAccess().getStartOnKeyword_0()); 

            }


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1525:1: rule__StartOnSentence__Group__1 : rule__StartOnSentence__Group__1__Impl ;
    public final void rule__StartOnSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1529:1: ( rule__StartOnSentence__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1530:2: rule__StartOnSentence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StartOnSentence__Group__1__Impl_in_rule__StartOnSentence__Group__13295);
            rule__StartOnSentence__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1536:1: rule__StartOnSentence__Group__1__Impl : ( ( rule__StartOnSentence__DefinitionAssignment_1 ) ) ;
    public final void rule__StartOnSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1540:1: ( ( ( rule__StartOnSentence__DefinitionAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1541:1: ( ( rule__StartOnSentence__DefinitionAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1541:1: ( ( rule__StartOnSentence__DefinitionAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1542:1: ( rule__StartOnSentence__DefinitionAssignment_1 )
            {
             before(grammarAccess.getStartOnSentenceAccess().getDefinitionAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1543:1: ( rule__StartOnSentence__DefinitionAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1543:2: rule__StartOnSentence__DefinitionAssignment_1
            {
            pushFollow(FOLLOW_rule__StartOnSentence__DefinitionAssignment_1_in_rule__StartOnSentence__Group__1__Impl3322);
            rule__StartOnSentence__DefinitionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStartOnSentenceAccess().getDefinitionAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DefinitionSentence__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1557:1: rule__DefinitionSentence__Group__0 : rule__DefinitionSentence__Group__0__Impl rule__DefinitionSentence__Group__1 ;
    public final void rule__DefinitionSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1561:1: ( rule__DefinitionSentence__Group__0__Impl rule__DefinitionSentence__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1562:2: rule__DefinitionSentence__Group__0__Impl rule__DefinitionSentence__Group__1
            {
            pushFollow(FOLLOW_rule__DefinitionSentence__Group__0__Impl_in_rule__DefinitionSentence__Group__03356);
            rule__DefinitionSentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefinitionSentence__Group__1_in_rule__DefinitionSentence__Group__03359);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1569:1: rule__DefinitionSentence__Group__0__Impl : ( ( rule__DefinitionSentence__Alternatives_0 ) ) ;
    public final void rule__DefinitionSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1573:1: ( ( ( rule__DefinitionSentence__Alternatives_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1574:1: ( ( rule__DefinitionSentence__Alternatives_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1574:1: ( ( rule__DefinitionSentence__Alternatives_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1575:1: ( rule__DefinitionSentence__Alternatives_0 )
            {
             before(grammarAccess.getDefinitionSentenceAccess().getAlternatives_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1576:1: ( rule__DefinitionSentence__Alternatives_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1576:2: rule__DefinitionSentence__Alternatives_0
            {
            pushFollow(FOLLOW_rule__DefinitionSentence__Alternatives_0_in_rule__DefinitionSentence__Group__0__Impl3386);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1586:1: rule__DefinitionSentence__Group__1 : rule__DefinitionSentence__Group__1__Impl rule__DefinitionSentence__Group__2 ;
    public final void rule__DefinitionSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1590:1: ( rule__DefinitionSentence__Group__1__Impl rule__DefinitionSentence__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1591:2: rule__DefinitionSentence__Group__1__Impl rule__DefinitionSentence__Group__2
            {
            pushFollow(FOLLOW_rule__DefinitionSentence__Group__1__Impl_in_rule__DefinitionSentence__Group__13416);
            rule__DefinitionSentence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefinitionSentence__Group__2_in_rule__DefinitionSentence__Group__13419);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1598:1: rule__DefinitionSentence__Group__1__Impl : ( ( rule__DefinitionSentence__QualifierAssignment_1 ) ) ;
    public final void rule__DefinitionSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1602:1: ( ( ( rule__DefinitionSentence__QualifierAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1603:1: ( ( rule__DefinitionSentence__QualifierAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1603:1: ( ( rule__DefinitionSentence__QualifierAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1604:1: ( rule__DefinitionSentence__QualifierAssignment_1 )
            {
             before(grammarAccess.getDefinitionSentenceAccess().getQualifierAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1605:1: ( rule__DefinitionSentence__QualifierAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1605:2: rule__DefinitionSentence__QualifierAssignment_1
            {
            pushFollow(FOLLOW_rule__DefinitionSentence__QualifierAssignment_1_in_rule__DefinitionSentence__Group__1__Impl3446);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1615:1: rule__DefinitionSentence__Group__2 : rule__DefinitionSentence__Group__2__Impl ;
    public final void rule__DefinitionSentence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1619:1: ( rule__DefinitionSentence__Group__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1620:2: rule__DefinitionSentence__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefinitionSentence__Group__2__Impl_in_rule__DefinitionSentence__Group__23476);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1626:1: rule__DefinitionSentence__Group__2__Impl : ( ( rule__DefinitionSentence__TargetAssignment_2 ) ) ;
    public final void rule__DefinitionSentence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1630:1: ( ( ( rule__DefinitionSentence__TargetAssignment_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1631:1: ( ( rule__DefinitionSentence__TargetAssignment_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1631:1: ( ( rule__DefinitionSentence__TargetAssignment_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1632:1: ( rule__DefinitionSentence__TargetAssignment_2 )
            {
             before(grammarAccess.getDefinitionSentenceAccess().getTargetAssignment_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1633:1: ( rule__DefinitionSentence__TargetAssignment_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1633:2: rule__DefinitionSentence__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__DefinitionSentence__TargetAssignment_2_in_rule__DefinitionSentence__Group__2__Impl3503);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1649:1: rule__ConstraintSentence__Group__0 : rule__ConstraintSentence__Group__0__Impl rule__ConstraintSentence__Group__1 ;
    public final void rule__ConstraintSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1653:1: ( rule__ConstraintSentence__Group__0__Impl rule__ConstraintSentence__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1654:2: rule__ConstraintSentence__Group__0__Impl rule__ConstraintSentence__Group__1
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Group__0__Impl_in_rule__ConstraintSentence__Group__03539);
            rule__ConstraintSentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintSentence__Group__1_in_rule__ConstraintSentence__Group__03542);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1661:1: rule__ConstraintSentence__Group__0__Impl : ( 'for' ) ;
    public final void rule__ConstraintSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1665:1: ( ( 'for' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1666:1: ( 'for' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1666:1: ( 'for' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1667:1: 'for'
            {
             before(grammarAccess.getConstraintSentenceAccess().getForKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__ConstraintSentence__Group__0__Impl3570); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1680:1: rule__ConstraintSentence__Group__1 : rule__ConstraintSentence__Group__1__Impl rule__ConstraintSentence__Group__2 ;
    public final void rule__ConstraintSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1684:1: ( rule__ConstraintSentence__Group__1__Impl rule__ConstraintSentence__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1685:2: rule__ConstraintSentence__Group__1__Impl rule__ConstraintSentence__Group__2
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Group__1__Impl_in_rule__ConstraintSentence__Group__13601);
            rule__ConstraintSentence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintSentence__Group__2_in_rule__ConstraintSentence__Group__13604);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1692:1: rule__ConstraintSentence__Group__1__Impl : ( ( rule__ConstraintSentence__QuantificationsAssignment_1 )? ) ;
    public final void rule__ConstraintSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1696:1: ( ( ( rule__ConstraintSentence__QuantificationsAssignment_1 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1697:1: ( ( rule__ConstraintSentence__QuantificationsAssignment_1 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1697:1: ( ( rule__ConstraintSentence__QuantificationsAssignment_1 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1698:1: ( rule__ConstraintSentence__QuantificationsAssignment_1 )?
            {
             before(grammarAccess.getConstraintSentenceAccess().getQuantificationsAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1699:1: ( rule__ConstraintSentence__QuantificationsAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=20 && LA17_0<=21)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1699:2: rule__ConstraintSentence__QuantificationsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ConstraintSentence__QuantificationsAssignment_1_in_rule__ConstraintSentence__Group__1__Impl3631);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1709:1: rule__ConstraintSentence__Group__2 : rule__ConstraintSentence__Group__2__Impl rule__ConstraintSentence__Group__3 ;
    public final void rule__ConstraintSentence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1713:1: ( rule__ConstraintSentence__Group__2__Impl rule__ConstraintSentence__Group__3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1714:2: rule__ConstraintSentence__Group__2__Impl rule__ConstraintSentence__Group__3
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Group__2__Impl_in_rule__ConstraintSentence__Group__23662);
            rule__ConstraintSentence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintSentence__Group__3_in_rule__ConstraintSentence__Group__23665);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1721:1: rule__ConstraintSentence__Group__2__Impl : ( ( rule__ConstraintSentence__NodesAssignment_2 )? ) ;
    public final void rule__ConstraintSentence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1725:1: ( ( ( rule__ConstraintSentence__NodesAssignment_2 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1726:1: ( ( rule__ConstraintSentence__NodesAssignment_2 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1726:1: ( ( rule__ConstraintSentence__NodesAssignment_2 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1727:1: ( rule__ConstraintSentence__NodesAssignment_2 )?
            {
             before(grammarAccess.getConstraintSentenceAccess().getNodesAssignment_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1728:1: ( rule__ConstraintSentence__NodesAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1728:2: rule__ConstraintSentence__NodesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ConstraintSentence__NodesAssignment_2_in_rule__ConstraintSentence__Group__2__Impl3692);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1738:1: rule__ConstraintSentence__Group__3 : rule__ConstraintSentence__Group__3__Impl rule__ConstraintSentence__Group__4 ;
    public final void rule__ConstraintSentence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1742:1: ( rule__ConstraintSentence__Group__3__Impl rule__ConstraintSentence__Group__4 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1743:2: rule__ConstraintSentence__Group__3__Impl rule__ConstraintSentence__Group__4
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Group__3__Impl_in_rule__ConstraintSentence__Group__33723);
            rule__ConstraintSentence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintSentence__Group__4_in_rule__ConstraintSentence__Group__33726);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1750:1: rule__ConstraintSentence__Group__3__Impl : ( ( rule__ConstraintSentence__Alternatives_3 ) ) ;
    public final void rule__ConstraintSentence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1754:1: ( ( ( rule__ConstraintSentence__Alternatives_3 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1755:1: ( ( rule__ConstraintSentence__Alternatives_3 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1755:1: ( ( rule__ConstraintSentence__Alternatives_3 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1756:1: ( rule__ConstraintSentence__Alternatives_3 )
            {
             before(grammarAccess.getConstraintSentenceAccess().getAlternatives_3()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1757:1: ( rule__ConstraintSentence__Alternatives_3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1757:2: rule__ConstraintSentence__Alternatives_3
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Alternatives_3_in_rule__ConstraintSentence__Group__3__Impl3753);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1767:1: rule__ConstraintSentence__Group__4 : rule__ConstraintSentence__Group__4__Impl ;
    public final void rule__ConstraintSentence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1771:1: ( rule__ConstraintSentence__Group__4__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1772:2: rule__ConstraintSentence__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__Group__4__Impl_in_rule__ConstraintSentence__Group__43783);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1778:1: rule__ConstraintSentence__Group__4__Impl : ( ( rule__ConstraintSentence__PredicateAssignment_4 ) ) ;
    public final void rule__ConstraintSentence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1782:1: ( ( ( rule__ConstraintSentence__PredicateAssignment_4 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1783:1: ( ( rule__ConstraintSentence__PredicateAssignment_4 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1783:1: ( ( rule__ConstraintSentence__PredicateAssignment_4 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1784:1: ( rule__ConstraintSentence__PredicateAssignment_4 )
            {
             before(grammarAccess.getConstraintSentenceAccess().getPredicateAssignment_4()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1785:1: ( rule__ConstraintSentence__PredicateAssignment_4 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1785:2: rule__ConstraintSentence__PredicateAssignment_4
            {
            pushFollow(FOLLOW_rule__ConstraintSentence__PredicateAssignment_4_in_rule__ConstraintSentence__Group__4__Impl3810);
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


    // $ANTLR start "rule__PredicateDefinitionSentence__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1805:1: rule__PredicateDefinitionSentence__Group__0 : rule__PredicateDefinitionSentence__Group__0__Impl rule__PredicateDefinitionSentence__Group__1 ;
    public final void rule__PredicateDefinitionSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1809:1: ( rule__PredicateDefinitionSentence__Group__0__Impl rule__PredicateDefinitionSentence__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1810:2: rule__PredicateDefinitionSentence__Group__0__Impl rule__PredicateDefinitionSentence__Group__1
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__0__Impl_in_rule__PredicateDefinitionSentence__Group__03850);
            rule__PredicateDefinitionSentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__1_in_rule__PredicateDefinitionSentence__Group__03853);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1817:1: rule__PredicateDefinitionSentence__Group__0__Impl : ( 'define' ) ;
    public final void rule__PredicateDefinitionSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1821:1: ( ( 'define' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1822:1: ( 'define' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1822:1: ( 'define' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1823:1: 'define'
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getDefineKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__PredicateDefinitionSentence__Group__0__Impl3881); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1836:1: rule__PredicateDefinitionSentence__Group__1 : rule__PredicateDefinitionSentence__Group__1__Impl rule__PredicateDefinitionSentence__Group__2 ;
    public final void rule__PredicateDefinitionSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1840:1: ( rule__PredicateDefinitionSentence__Group__1__Impl rule__PredicateDefinitionSentence__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1841:2: rule__PredicateDefinitionSentence__Group__1__Impl rule__PredicateDefinitionSentence__Group__2
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__1__Impl_in_rule__PredicateDefinitionSentence__Group__13912);
            rule__PredicateDefinitionSentence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__2_in_rule__PredicateDefinitionSentence__Group__13915);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1848:1: rule__PredicateDefinitionSentence__Group__1__Impl : ( ( rule__PredicateDefinitionSentence__NameAssignment_1 ) ) ;
    public final void rule__PredicateDefinitionSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1852:1: ( ( ( rule__PredicateDefinitionSentence__NameAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1853:1: ( ( rule__PredicateDefinitionSentence__NameAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1853:1: ( ( rule__PredicateDefinitionSentence__NameAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1854:1: ( rule__PredicateDefinitionSentence__NameAssignment_1 )
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getNameAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1855:1: ( rule__PredicateDefinitionSentence__NameAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1855:2: rule__PredicateDefinitionSentence__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__NameAssignment_1_in_rule__PredicateDefinitionSentence__Group__1__Impl3942);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1865:1: rule__PredicateDefinitionSentence__Group__2 : rule__PredicateDefinitionSentence__Group__2__Impl rule__PredicateDefinitionSentence__Group__3 ;
    public final void rule__PredicateDefinitionSentence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1869:1: ( rule__PredicateDefinitionSentence__Group__2__Impl rule__PredicateDefinitionSentence__Group__3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1870:2: rule__PredicateDefinitionSentence__Group__2__Impl rule__PredicateDefinitionSentence__Group__3
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__2__Impl_in_rule__PredicateDefinitionSentence__Group__23972);
            rule__PredicateDefinitionSentence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__3_in_rule__PredicateDefinitionSentence__Group__23975);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1877:1: rule__PredicateDefinitionSentence__Group__2__Impl : ( ( rule__PredicateDefinitionSentence__ParametersAssignment_2 )? ) ;
    public final void rule__PredicateDefinitionSentence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1881:1: ( ( ( rule__PredicateDefinitionSentence__ParametersAssignment_2 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1882:1: ( ( rule__PredicateDefinitionSentence__ParametersAssignment_2 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1882:1: ( ( rule__PredicateDefinitionSentence__ParametersAssignment_2 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1883:1: ( rule__PredicateDefinitionSentence__ParametersAssignment_2 )?
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getParametersAssignment_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1884:1: ( rule__PredicateDefinitionSentence__ParametersAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1884:2: rule__PredicateDefinitionSentence__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_rule__PredicateDefinitionSentence__ParametersAssignment_2_in_rule__PredicateDefinitionSentence__Group__2__Impl4002);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1894:1: rule__PredicateDefinitionSentence__Group__3 : rule__PredicateDefinitionSentence__Group__3__Impl rule__PredicateDefinitionSentence__Group__4 ;
    public final void rule__PredicateDefinitionSentence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1898:1: ( rule__PredicateDefinitionSentence__Group__3__Impl rule__PredicateDefinitionSentence__Group__4 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1899:2: rule__PredicateDefinitionSentence__Group__3__Impl rule__PredicateDefinitionSentence__Group__4
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__3__Impl_in_rule__PredicateDefinitionSentence__Group__34033);
            rule__PredicateDefinitionSentence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__4_in_rule__PredicateDefinitionSentence__Group__34036);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1906:1: rule__PredicateDefinitionSentence__Group__3__Impl : ( ( rule__PredicateDefinitionSentence__Alternatives_3 ) ) ;
    public final void rule__PredicateDefinitionSentence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1910:1: ( ( ( rule__PredicateDefinitionSentence__Alternatives_3 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1911:1: ( ( rule__PredicateDefinitionSentence__Alternatives_3 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1911:1: ( ( rule__PredicateDefinitionSentence__Alternatives_3 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1912:1: ( rule__PredicateDefinitionSentence__Alternatives_3 )
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getAlternatives_3()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1913:1: ( rule__PredicateDefinitionSentence__Alternatives_3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1913:2: rule__PredicateDefinitionSentence__Alternatives_3
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Alternatives_3_in_rule__PredicateDefinitionSentence__Group__3__Impl4063);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1923:1: rule__PredicateDefinitionSentence__Group__4 : rule__PredicateDefinitionSentence__Group__4__Impl ;
    public final void rule__PredicateDefinitionSentence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1927:1: ( rule__PredicateDefinitionSentence__Group__4__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1928:2: rule__PredicateDefinitionSentence__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__Group__4__Impl_in_rule__PredicateDefinitionSentence__Group__44093);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1934:1: rule__PredicateDefinitionSentence__Group__4__Impl : ( ( rule__PredicateDefinitionSentence__PredicateAssignment_4 ) ) ;
    public final void rule__PredicateDefinitionSentence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1938:1: ( ( ( rule__PredicateDefinitionSentence__PredicateAssignment_4 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1939:1: ( ( rule__PredicateDefinitionSentence__PredicateAssignment_4 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1939:1: ( ( rule__PredicateDefinitionSentence__PredicateAssignment_4 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1940:1: ( rule__PredicateDefinitionSentence__PredicateAssignment_4 )
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getPredicateAssignment_4()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1941:1: ( rule__PredicateDefinitionSentence__PredicateAssignment_4 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1941:2: rule__PredicateDefinitionSentence__PredicateAssignment_4
            {
            pushFollow(FOLLOW_rule__PredicateDefinitionSentence__PredicateAssignment_4_in_rule__PredicateDefinitionSentence__Group__4__Impl4120);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1961:1: rule__NodeDefinition__Group__0 : rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1 ;
    public final void rule__NodeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1965:1: ( rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1966:2: rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__0__Impl_in_rule__NodeDefinition__Group__04160);
            rule__NodeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__1_in_rule__NodeDefinition__Group__04163);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1973:1: rule__NodeDefinition__Group__0__Impl : ( ( rule__NodeDefinition__NameAssignment_0 ) ) ;
    public final void rule__NodeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1977:1: ( ( ( rule__NodeDefinition__NameAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1978:1: ( ( rule__NodeDefinition__NameAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1978:1: ( ( rule__NodeDefinition__NameAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1979:1: ( rule__NodeDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1980:1: ( rule__NodeDefinition__NameAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1980:2: rule__NodeDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__NodeDefinition__NameAssignment_0_in_rule__NodeDefinition__Group__0__Impl4190);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1990:1: rule__NodeDefinition__Group__1 : rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2 ;
    public final void rule__NodeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1994:1: ( rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:1995:2: rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__1__Impl_in_rule__NodeDefinition__Group__14220);
            rule__NodeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__2_in_rule__NodeDefinition__Group__14223);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2002:1: rule__NodeDefinition__Group__1__Impl : ( ( rule__NodeDefinition__CollectionAssignment_1 )? ) ;
    public final void rule__NodeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2006:1: ( ( ( rule__NodeDefinition__CollectionAssignment_1 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2007:1: ( ( rule__NodeDefinition__CollectionAssignment_1 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2007:1: ( ( rule__NodeDefinition__CollectionAssignment_1 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2008:1: ( rule__NodeDefinition__CollectionAssignment_1 )?
            {
             before(grammarAccess.getNodeDefinitionAccess().getCollectionAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2009:1: ( rule__NodeDefinition__CollectionAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==54) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2009:2: rule__NodeDefinition__CollectionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__CollectionAssignment_1_in_rule__NodeDefinition__Group__1__Impl4250);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2019:1: rule__NodeDefinition__Group__2 : rule__NodeDefinition__Group__2__Impl ;
    public final void rule__NodeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2023:1: ( rule__NodeDefinition__Group__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2024:2: rule__NodeDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__2__Impl_in_rule__NodeDefinition__Group__24281);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2030:1: rule__NodeDefinition__Group__2__Impl : ( ( rule__NodeDefinition__SelectorsAssignment_2 )? ) ;
    public final void rule__NodeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2034:1: ( ( ( rule__NodeDefinition__SelectorsAssignment_2 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2035:1: ( ( rule__NodeDefinition__SelectorsAssignment_2 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2035:1: ( ( rule__NodeDefinition__SelectorsAssignment_2 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2036:1: ( rule__NodeDefinition__SelectorsAssignment_2 )?
            {
             before(grammarAccess.getNodeDefinitionAccess().getSelectorsAssignment_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2037:1: ( rule__NodeDefinition__SelectorsAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=46 && LA21_0<=47)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2037:2: rule__NodeDefinition__SelectorsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__SelectorsAssignment_2_in_rule__NodeDefinition__Group__2__Impl4308);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2053:1: rule__NodeReferenceList__Group__0 : rule__NodeReferenceList__Group__0__Impl rule__NodeReferenceList__Group__1 ;
    public final void rule__NodeReferenceList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2057:1: ( rule__NodeReferenceList__Group__0__Impl rule__NodeReferenceList__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2058:2: rule__NodeReferenceList__Group__0__Impl rule__NodeReferenceList__Group__1
            {
            pushFollow(FOLLOW_rule__NodeReferenceList__Group__0__Impl_in_rule__NodeReferenceList__Group__04345);
            rule__NodeReferenceList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeReferenceList__Group__1_in_rule__NodeReferenceList__Group__04348);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2065:1: rule__NodeReferenceList__Group__0__Impl : ( ( rule__NodeReferenceList__NodesAssignment_0 ) ) ;
    public final void rule__NodeReferenceList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2069:1: ( ( ( rule__NodeReferenceList__NodesAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2070:1: ( ( rule__NodeReferenceList__NodesAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2070:1: ( ( rule__NodeReferenceList__NodesAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2071:1: ( rule__NodeReferenceList__NodesAssignment_0 )
            {
             before(grammarAccess.getNodeReferenceListAccess().getNodesAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2072:1: ( rule__NodeReferenceList__NodesAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2072:2: rule__NodeReferenceList__NodesAssignment_0
            {
            pushFollow(FOLLOW_rule__NodeReferenceList__NodesAssignment_0_in_rule__NodeReferenceList__Group__0__Impl4375);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2082:1: rule__NodeReferenceList__Group__1 : rule__NodeReferenceList__Group__1__Impl ;
    public final void rule__NodeReferenceList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2086:1: ( rule__NodeReferenceList__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2087:2: rule__NodeReferenceList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeReferenceList__Group__1__Impl_in_rule__NodeReferenceList__Group__14405);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2093:1: rule__NodeReferenceList__Group__1__Impl : ( ( rule__NodeReferenceList__Group_1__0 )* ) ;
    public final void rule__NodeReferenceList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2097:1: ( ( ( rule__NodeReferenceList__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2098:1: ( ( rule__NodeReferenceList__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2098:1: ( ( rule__NodeReferenceList__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2099:1: ( rule__NodeReferenceList__Group_1__0 )*
            {
             before(grammarAccess.getNodeReferenceListAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2100:1: ( rule__NodeReferenceList__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2100:2: rule__NodeReferenceList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeReferenceList__Group_1__0_in_rule__NodeReferenceList__Group__1__Impl4432);
            	    rule__NodeReferenceList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2114:1: rule__NodeReferenceList__Group_1__0 : rule__NodeReferenceList__Group_1__0__Impl rule__NodeReferenceList__Group_1__1 ;
    public final void rule__NodeReferenceList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2118:1: ( rule__NodeReferenceList__Group_1__0__Impl rule__NodeReferenceList__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2119:2: rule__NodeReferenceList__Group_1__0__Impl rule__NodeReferenceList__Group_1__1
            {
            pushFollow(FOLLOW_rule__NodeReferenceList__Group_1__0__Impl_in_rule__NodeReferenceList__Group_1__04467);
            rule__NodeReferenceList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeReferenceList__Group_1__1_in_rule__NodeReferenceList__Group_1__04470);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2126:1: rule__NodeReferenceList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__NodeReferenceList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2130:1: ( ( ',' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2131:1: ( ',' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2131:1: ( ',' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2132:1: ','
            {
             before(grammarAccess.getNodeReferenceListAccess().getCommaKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__NodeReferenceList__Group_1__0__Impl4498); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2145:1: rule__NodeReferenceList__Group_1__1 : rule__NodeReferenceList__Group_1__1__Impl ;
    public final void rule__NodeReferenceList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2149:1: ( rule__NodeReferenceList__Group_1__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2150:2: rule__NodeReferenceList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeReferenceList__Group_1__1__Impl_in_rule__NodeReferenceList__Group_1__14529);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2156:1: rule__NodeReferenceList__Group_1__1__Impl : ( ( rule__NodeReferenceList__NodesAssignment_1_1 ) ) ;
    public final void rule__NodeReferenceList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2160:1: ( ( ( rule__NodeReferenceList__NodesAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2161:1: ( ( rule__NodeReferenceList__NodesAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2161:1: ( ( rule__NodeReferenceList__NodesAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2162:1: ( rule__NodeReferenceList__NodesAssignment_1_1 )
            {
             before(grammarAccess.getNodeReferenceListAccess().getNodesAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2163:1: ( rule__NodeReferenceList__NodesAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2163:2: rule__NodeReferenceList__NodesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NodeReferenceList__NodesAssignment_1_1_in_rule__NodeReferenceList__Group_1__1__Impl4556);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2177:1: rule__TargetDefinition__Group__0 : rule__TargetDefinition__Group__0__Impl rule__TargetDefinition__Group__1 ;
    public final void rule__TargetDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2181:1: ( rule__TargetDefinition__Group__0__Impl rule__TargetDefinition__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2182:2: rule__TargetDefinition__Group__0__Impl rule__TargetDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group__0__Impl_in_rule__TargetDefinition__Group__04590);
            rule__TargetDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group__1_in_rule__TargetDefinition__Group__04593);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2189:1: rule__TargetDefinition__Group__0__Impl : ( ( rule__TargetDefinition__AxisAssignment_0 ) ) ;
    public final void rule__TargetDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2193:1: ( ( ( rule__TargetDefinition__AxisAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2194:1: ( ( rule__TargetDefinition__AxisAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2194:1: ( ( rule__TargetDefinition__AxisAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2195:1: ( rule__TargetDefinition__AxisAssignment_0 )
            {
             before(grammarAccess.getTargetDefinitionAccess().getAxisAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2196:1: ( rule__TargetDefinition__AxisAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2196:2: rule__TargetDefinition__AxisAssignment_0
            {
            pushFollow(FOLLOW_rule__TargetDefinition__AxisAssignment_0_in_rule__TargetDefinition__Group__0__Impl4620);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2206:1: rule__TargetDefinition__Group__1 : rule__TargetDefinition__Group__1__Impl rule__TargetDefinition__Group__2 ;
    public final void rule__TargetDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2210:1: ( rule__TargetDefinition__Group__1__Impl rule__TargetDefinition__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2211:2: rule__TargetDefinition__Group__1__Impl rule__TargetDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group__1__Impl_in_rule__TargetDefinition__Group__14650);
            rule__TargetDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group__2_in_rule__TargetDefinition__Group__14653);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2218:1: rule__TargetDefinition__Group__1__Impl : ( ( rule__TargetDefinition__DefinitionAssignment_1 ) ) ;
    public final void rule__TargetDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2222:1: ( ( ( rule__TargetDefinition__DefinitionAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2223:1: ( ( rule__TargetDefinition__DefinitionAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2223:1: ( ( rule__TargetDefinition__DefinitionAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2224:1: ( rule__TargetDefinition__DefinitionAssignment_1 )
            {
             before(grammarAccess.getTargetDefinitionAccess().getDefinitionAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2225:1: ( rule__TargetDefinition__DefinitionAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2225:2: rule__TargetDefinition__DefinitionAssignment_1
            {
            pushFollow(FOLLOW_rule__TargetDefinition__DefinitionAssignment_1_in_rule__TargetDefinition__Group__1__Impl4680);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2235:1: rule__TargetDefinition__Group__2 : rule__TargetDefinition__Group__2__Impl rule__TargetDefinition__Group__3 ;
    public final void rule__TargetDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2239:1: ( rule__TargetDefinition__Group__2__Impl rule__TargetDefinition__Group__3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2240:2: rule__TargetDefinition__Group__2__Impl rule__TargetDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group__2__Impl_in_rule__TargetDefinition__Group__24710);
            rule__TargetDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group__3_in_rule__TargetDefinition__Group__24713);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2247:1: rule__TargetDefinition__Group__2__Impl : ( ( rule__TargetDefinition__Group_2__0 )? ) ;
    public final void rule__TargetDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2251:1: ( ( ( rule__TargetDefinition__Group_2__0 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2252:1: ( ( rule__TargetDefinition__Group_2__0 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2252:1: ( ( rule__TargetDefinition__Group_2__0 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2253:1: ( rule__TargetDefinition__Group_2__0 )?
            {
             before(grammarAccess.getTargetDefinitionAccess().getGroup_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2254:1: ( rule__TargetDefinition__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2254:2: rule__TargetDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TargetDefinition__Group_2__0_in_rule__TargetDefinition__Group__2__Impl4740);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2264:1: rule__TargetDefinition__Group__3 : rule__TargetDefinition__Group__3__Impl ;
    public final void rule__TargetDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2268:1: ( rule__TargetDefinition__Group__3__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2269:2: rule__TargetDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group__3__Impl_in_rule__TargetDefinition__Group__34771);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2275:1: rule__TargetDefinition__Group__3__Impl : ( ( rule__TargetDefinition__Group_3__0 )? ) ;
    public final void rule__TargetDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2279:1: ( ( ( rule__TargetDefinition__Group_3__0 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2280:1: ( ( rule__TargetDefinition__Group_3__0 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2280:1: ( ( rule__TargetDefinition__Group_3__0 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2281:1: ( rule__TargetDefinition__Group_3__0 )?
            {
             before(grammarAccess.getTargetDefinitionAccess().getGroup_3()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2282:1: ( rule__TargetDefinition__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2282:2: rule__TargetDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TargetDefinition__Group_3__0_in_rule__TargetDefinition__Group__3__Impl4798);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2300:1: rule__TargetDefinition__Group_2__0 : rule__TargetDefinition__Group_2__0__Impl rule__TargetDefinition__Group_2__1 ;
    public final void rule__TargetDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2304:1: ( rule__TargetDefinition__Group_2__0__Impl rule__TargetDefinition__Group_2__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2305:2: rule__TargetDefinition__Group_2__0__Impl rule__TargetDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__0__Impl_in_rule__TargetDefinition__Group_2__04837);
            rule__TargetDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__1_in_rule__TargetDefinition__Group_2__04840);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2312:1: rule__TargetDefinition__Group_2__0__Impl : ( 'where holds' ) ;
    public final void rule__TargetDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2316:1: ( ( 'where holds' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2317:1: ( 'where holds' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2317:1: ( 'where holds' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2318:1: 'where holds'
            {
             before(grammarAccess.getTargetDefinitionAccess().getWhereHoldsKeyword_2_0()); 
            match(input,42,FOLLOW_42_in_rule__TargetDefinition__Group_2__0__Impl4868); 
             after(grammarAccess.getTargetDefinitionAccess().getWhereHoldsKeyword_2_0()); 

            }


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2331:1: rule__TargetDefinition__Group_2__1 : rule__TargetDefinition__Group_2__1__Impl rule__TargetDefinition__Group_2__2 ;
    public final void rule__TargetDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2335:1: ( rule__TargetDefinition__Group_2__1__Impl rule__TargetDefinition__Group_2__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2336:2: rule__TargetDefinition__Group_2__1__Impl rule__TargetDefinition__Group_2__2
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__1__Impl_in_rule__TargetDefinition__Group_2__14899);
            rule__TargetDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__2_in_rule__TargetDefinition__Group_2__14902);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2343:1: rule__TargetDefinition__Group_2__1__Impl : ( '{' ) ;
    public final void rule__TargetDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2347:1: ( ( '{' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2348:1: ( '{' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2348:1: ( '{' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2349:1: '{'
            {
             before(grammarAccess.getTargetDefinitionAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,43,FOLLOW_43_in_rule__TargetDefinition__Group_2__1__Impl4930); 
             after(grammarAccess.getTargetDefinitionAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2362:1: rule__TargetDefinition__Group_2__2 : rule__TargetDefinition__Group_2__2__Impl rule__TargetDefinition__Group_2__3 ;
    public final void rule__TargetDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2366:1: ( rule__TargetDefinition__Group_2__2__Impl rule__TargetDefinition__Group_2__3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2367:2: rule__TargetDefinition__Group_2__2__Impl rule__TargetDefinition__Group_2__3
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__2__Impl_in_rule__TargetDefinition__Group_2__24961);
            rule__TargetDefinition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__3_in_rule__TargetDefinition__Group_2__24964);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2374:1: rule__TargetDefinition__Group_2__2__Impl : ( ( rule__TargetDefinition__PredicateAssignment_2_2 ) ) ;
    public final void rule__TargetDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2378:1: ( ( ( rule__TargetDefinition__PredicateAssignment_2_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2379:1: ( ( rule__TargetDefinition__PredicateAssignment_2_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2379:1: ( ( rule__TargetDefinition__PredicateAssignment_2_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2380:1: ( rule__TargetDefinition__PredicateAssignment_2_2 )
            {
             before(grammarAccess.getTargetDefinitionAccess().getPredicateAssignment_2_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2381:1: ( rule__TargetDefinition__PredicateAssignment_2_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2381:2: rule__TargetDefinition__PredicateAssignment_2_2
            {
            pushFollow(FOLLOW_rule__TargetDefinition__PredicateAssignment_2_2_in_rule__TargetDefinition__Group_2__2__Impl4991);
            rule__TargetDefinition__PredicateAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetDefinitionAccess().getPredicateAssignment_2_2()); 

            }


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2391:1: rule__TargetDefinition__Group_2__3 : rule__TargetDefinition__Group_2__3__Impl ;
    public final void rule__TargetDefinition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2395:1: ( rule__TargetDefinition__Group_2__3__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2396:2: rule__TargetDefinition__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_2__3__Impl_in_rule__TargetDefinition__Group_2__35021);
            rule__TargetDefinition__Group_2__3__Impl();

            state._fsp--;


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2402:1: rule__TargetDefinition__Group_2__3__Impl : ( '}' ) ;
    public final void rule__TargetDefinition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2406:1: ( ( '}' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2407:1: ( '}' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2407:1: ( '}' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2408:1: '}'
            {
             before(grammarAccess.getTargetDefinitionAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,44,FOLLOW_44_in_rule__TargetDefinition__Group_2__3__Impl5049); 
             after(grammarAccess.getTargetDefinitionAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__TargetDefinition__Group_3__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2429:1: rule__TargetDefinition__Group_3__0 : rule__TargetDefinition__Group_3__0__Impl rule__TargetDefinition__Group_3__1 ;
    public final void rule__TargetDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2433:1: ( rule__TargetDefinition__Group_3__0__Impl rule__TargetDefinition__Group_3__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2434:2: rule__TargetDefinition__Group_3__0__Impl rule__TargetDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__0__Impl_in_rule__TargetDefinition__Group_3__05088);
            rule__TargetDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__1_in_rule__TargetDefinition__Group_3__05091);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2441:1: rule__TargetDefinition__Group_3__0__Impl : ( 'with property' ) ;
    public final void rule__TargetDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2445:1: ( ( 'with property' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2446:1: ( 'with property' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2446:1: ( 'with property' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2447:1: 'with property'
            {
             before(grammarAccess.getTargetDefinitionAccess().getWithPropertyKeyword_3_0()); 
            match(input,45,FOLLOW_45_in_rule__TargetDefinition__Group_3__0__Impl5119); 
             after(grammarAccess.getTargetDefinitionAccess().getWithPropertyKeyword_3_0()); 

            }


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2460:1: rule__TargetDefinition__Group_3__1 : rule__TargetDefinition__Group_3__1__Impl rule__TargetDefinition__Group_3__2 ;
    public final void rule__TargetDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2464:1: ( rule__TargetDefinition__Group_3__1__Impl rule__TargetDefinition__Group_3__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2465:2: rule__TargetDefinition__Group_3__1__Impl rule__TargetDefinition__Group_3__2
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__1__Impl_in_rule__TargetDefinition__Group_3__15150);
            rule__TargetDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__2_in_rule__TargetDefinition__Group_3__15153);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2472:1: rule__TargetDefinition__Group_3__1__Impl : ( '{' ) ;
    public final void rule__TargetDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2476:1: ( ( '{' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2477:1: ( '{' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2477:1: ( '{' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2478:1: '{'
            {
             before(grammarAccess.getTargetDefinitionAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,43,FOLLOW_43_in_rule__TargetDefinition__Group_3__1__Impl5181); 
             after(grammarAccess.getTargetDefinitionAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2491:1: rule__TargetDefinition__Group_3__2 : rule__TargetDefinition__Group_3__2__Impl rule__TargetDefinition__Group_3__3 ;
    public final void rule__TargetDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2495:1: ( rule__TargetDefinition__Group_3__2__Impl rule__TargetDefinition__Group_3__3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2496:2: rule__TargetDefinition__Group_3__2__Impl rule__TargetDefinition__Group_3__3
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__2__Impl_in_rule__TargetDefinition__Group_3__25212);
            rule__TargetDefinition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__3_in_rule__TargetDefinition__Group_3__25215);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2503:1: rule__TargetDefinition__Group_3__2__Impl : ( ( rule__TargetDefinition__AssignmentsAssignment_3_2 ) ) ;
    public final void rule__TargetDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2507:1: ( ( ( rule__TargetDefinition__AssignmentsAssignment_3_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2508:1: ( ( rule__TargetDefinition__AssignmentsAssignment_3_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2508:1: ( ( rule__TargetDefinition__AssignmentsAssignment_3_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2509:1: ( rule__TargetDefinition__AssignmentsAssignment_3_2 )
            {
             before(grammarAccess.getTargetDefinitionAccess().getAssignmentsAssignment_3_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2510:1: ( rule__TargetDefinition__AssignmentsAssignment_3_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2510:2: rule__TargetDefinition__AssignmentsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__TargetDefinition__AssignmentsAssignment_3_2_in_rule__TargetDefinition__Group_3__2__Impl5242);
            rule__TargetDefinition__AssignmentsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetDefinitionAccess().getAssignmentsAssignment_3_2()); 

            }


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2520:1: rule__TargetDefinition__Group_3__3 : rule__TargetDefinition__Group_3__3__Impl ;
    public final void rule__TargetDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2524:1: ( rule__TargetDefinition__Group_3__3__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2525:2: rule__TargetDefinition__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__TargetDefinition__Group_3__3__Impl_in_rule__TargetDefinition__Group_3__35272);
            rule__TargetDefinition__Group_3__3__Impl();

            state._fsp--;


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2531:1: rule__TargetDefinition__Group_3__3__Impl : ( '}' ) ;
    public final void rule__TargetDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2535:1: ( ( '}' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2536:1: ( '}' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2536:1: ( '}' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2537:1: '}'
            {
             before(grammarAccess.getTargetDefinitionAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,44,FOLLOW_44_in_rule__TargetDefinition__Group_3__3__Impl5300); 
             after(grammarAccess.getTargetDefinitionAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SelectorList__Group_0__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2558:1: rule__SelectorList__Group_0__0 : rule__SelectorList__Group_0__0__Impl rule__SelectorList__Group_0__1 ;
    public final void rule__SelectorList__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2562:1: ( rule__SelectorList__Group_0__0__Impl rule__SelectorList__Group_0__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2563:2: rule__SelectorList__Group_0__0__Impl rule__SelectorList__Group_0__1
            {
            pushFollow(FOLLOW_rule__SelectorList__Group_0__0__Impl_in_rule__SelectorList__Group_0__05339);
            rule__SelectorList__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectorList__Group_0__1_in_rule__SelectorList__Group_0__05342);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2570:1: rule__SelectorList__Group_0__0__Impl : ( 'being' ) ;
    public final void rule__SelectorList__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2574:1: ( ( 'being' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2575:1: ( 'being' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2575:1: ( 'being' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2576:1: 'being'
            {
             before(grammarAccess.getSelectorListAccess().getBeingKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__SelectorList__Group_0__0__Impl5370); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2589:1: rule__SelectorList__Group_0__1 : rule__SelectorList__Group_0__1__Impl ;
    public final void rule__SelectorList__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2593:1: ( rule__SelectorList__Group_0__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2594:2: rule__SelectorList__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectorList__Group_0__1__Impl_in_rule__SelectorList__Group_0__15401);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2600:1: rule__SelectorList__Group_0__1__Impl : ( ( rule__SelectorList__SelectorsAssignment_0_1 ) ) ;
    public final void rule__SelectorList__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2604:1: ( ( ( rule__SelectorList__SelectorsAssignment_0_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2605:1: ( ( rule__SelectorList__SelectorsAssignment_0_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2605:1: ( ( rule__SelectorList__SelectorsAssignment_0_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2606:1: ( rule__SelectorList__SelectorsAssignment_0_1 )
            {
             before(grammarAccess.getSelectorListAccess().getSelectorsAssignment_0_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2607:1: ( rule__SelectorList__SelectorsAssignment_0_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2607:2: rule__SelectorList__SelectorsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__SelectorList__SelectorsAssignment_0_1_in_rule__SelectorList__Group_0__1__Impl5428);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2621:1: rule__SelectorList__Group_1__0 : rule__SelectorList__Group_1__0__Impl rule__SelectorList__Group_1__1 ;
    public final void rule__SelectorList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2625:1: ( rule__SelectorList__Group_1__0__Impl rule__SelectorList__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2626:2: rule__SelectorList__Group_1__0__Impl rule__SelectorList__Group_1__1
            {
            pushFollow(FOLLOW_rule__SelectorList__Group_1__0__Impl_in_rule__SelectorList__Group_1__05462);
            rule__SelectorList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectorList__Group_1__1_in_rule__SelectorList__Group_1__05465);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2633:1: rule__SelectorList__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SelectorList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2637:1: ( ( '(' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2638:1: ( '(' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2638:1: ( '(' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2639:1: '('
            {
             before(grammarAccess.getSelectorListAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,47,FOLLOW_47_in_rule__SelectorList__Group_1__0__Impl5493); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2652:1: rule__SelectorList__Group_1__1 : rule__SelectorList__Group_1__1__Impl rule__SelectorList__Group_1__2 ;
    public final void rule__SelectorList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2656:1: ( rule__SelectorList__Group_1__1__Impl rule__SelectorList__Group_1__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2657:2: rule__SelectorList__Group_1__1__Impl rule__SelectorList__Group_1__2
            {
            pushFollow(FOLLOW_rule__SelectorList__Group_1__1__Impl_in_rule__SelectorList__Group_1__15524);
            rule__SelectorList__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectorList__Group_1__2_in_rule__SelectorList__Group_1__15527);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2664:1: rule__SelectorList__Group_1__1__Impl : ( ( rule__SelectorList__SelectorsAssignment_1_1 ) ) ;
    public final void rule__SelectorList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2668:1: ( ( ( rule__SelectorList__SelectorsAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2669:1: ( ( rule__SelectorList__SelectorsAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2669:1: ( ( rule__SelectorList__SelectorsAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2670:1: ( rule__SelectorList__SelectorsAssignment_1_1 )
            {
             before(grammarAccess.getSelectorListAccess().getSelectorsAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2671:1: ( rule__SelectorList__SelectorsAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2671:2: rule__SelectorList__SelectorsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SelectorList__SelectorsAssignment_1_1_in_rule__SelectorList__Group_1__1__Impl5554);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2681:1: rule__SelectorList__Group_1__2 : rule__SelectorList__Group_1__2__Impl ;
    public final void rule__SelectorList__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2685:1: ( rule__SelectorList__Group_1__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2686:2: rule__SelectorList__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SelectorList__Group_1__2__Impl_in_rule__SelectorList__Group_1__25584);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2692:1: rule__SelectorList__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SelectorList__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2696:1: ( ( ')' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2697:1: ( ')' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2697:1: ( ')' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2698:1: ')'
            {
             before(grammarAccess.getSelectorListAccess().getRightParenthesisKeyword_1_2()); 
            match(input,48,FOLLOW_48_in_rule__SelectorList__Group_1__2__Impl5612); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2717:1: rule__SelectorListDef__Group__0 : rule__SelectorListDef__Group__0__Impl rule__SelectorListDef__Group__1 ;
    public final void rule__SelectorListDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2721:1: ( rule__SelectorListDef__Group__0__Impl rule__SelectorListDef__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2722:2: rule__SelectorListDef__Group__0__Impl rule__SelectorListDef__Group__1
            {
            pushFollow(FOLLOW_rule__SelectorListDef__Group__0__Impl_in_rule__SelectorListDef__Group__05649);
            rule__SelectorListDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectorListDef__Group__1_in_rule__SelectorListDef__Group__05652);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2729:1: rule__SelectorListDef__Group__0__Impl : ( ( rule__SelectorListDef__SelectorsAssignment_0 ) ) ;
    public final void rule__SelectorListDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2733:1: ( ( ( rule__SelectorListDef__SelectorsAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2734:1: ( ( rule__SelectorListDef__SelectorsAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2734:1: ( ( rule__SelectorListDef__SelectorsAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2735:1: ( rule__SelectorListDef__SelectorsAssignment_0 )
            {
             before(grammarAccess.getSelectorListDefAccess().getSelectorsAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2736:1: ( rule__SelectorListDef__SelectorsAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2736:2: rule__SelectorListDef__SelectorsAssignment_0
            {
            pushFollow(FOLLOW_rule__SelectorListDef__SelectorsAssignment_0_in_rule__SelectorListDef__Group__0__Impl5679);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2746:1: rule__SelectorListDef__Group__1 : rule__SelectorListDef__Group__1__Impl ;
    public final void rule__SelectorListDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2750:1: ( rule__SelectorListDef__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2751:2: rule__SelectorListDef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectorListDef__Group__1__Impl_in_rule__SelectorListDef__Group__15709);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2757:1: rule__SelectorListDef__Group__1__Impl : ( ( rule__SelectorListDef__Group_1__0 )* ) ;
    public final void rule__SelectorListDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2761:1: ( ( ( rule__SelectorListDef__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2762:1: ( ( rule__SelectorListDef__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2762:1: ( ( rule__SelectorListDef__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2763:1: ( rule__SelectorListDef__Group_1__0 )*
            {
             before(grammarAccess.getSelectorListDefAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2764:1: ( rule__SelectorListDef__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==49) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==RULE_ID) ) {
                        int LA25_3 = input.LA(3);

                        if ( (LA25_3==EOF||(LA25_3>=12 && LA25_3<=17)||(LA25_3>=20 && LA25_3<=21)||(LA25_3>=39 && LA25_3<=42)||(LA25_3>=44 && LA25_3<=45)||(LA25_3>=48 && LA25_3<=50)||LA25_3==52) ) {
                            alt25=1;
                        }
                        else if ( (LA25_3==RULE_ID) ) {
                            int LA25_5 = input.LA(4);

                            if ( ((LA25_5>=22 && LA25_5<=24)) ) {
                                alt25=1;
                            }


                        }


                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2764:2: rule__SelectorListDef__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SelectorListDef__Group_1__0_in_rule__SelectorListDef__Group__1__Impl5736);
            	    rule__SelectorListDef__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2778:1: rule__SelectorListDef__Group_1__0 : rule__SelectorListDef__Group_1__0__Impl rule__SelectorListDef__Group_1__1 ;
    public final void rule__SelectorListDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2782:1: ( rule__SelectorListDef__Group_1__0__Impl rule__SelectorListDef__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2783:2: rule__SelectorListDef__Group_1__0__Impl rule__SelectorListDef__Group_1__1
            {
            pushFollow(FOLLOW_rule__SelectorListDef__Group_1__0__Impl_in_rule__SelectorListDef__Group_1__05771);
            rule__SelectorListDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectorListDef__Group_1__1_in_rule__SelectorListDef__Group_1__05774);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2790:1: rule__SelectorListDef__Group_1__0__Impl : ( 'or' ) ;
    public final void rule__SelectorListDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2794:1: ( ( 'or' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2795:1: ( 'or' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2795:1: ( 'or' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2796:1: 'or'
            {
             before(grammarAccess.getSelectorListDefAccess().getOrKeyword_1_0()); 
            match(input,49,FOLLOW_49_in_rule__SelectorListDef__Group_1__0__Impl5802); 
             after(grammarAccess.getSelectorListDefAccess().getOrKeyword_1_0()); 

            }


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2809:1: rule__SelectorListDef__Group_1__1 : rule__SelectorListDef__Group_1__1__Impl ;
    public final void rule__SelectorListDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2813:1: ( rule__SelectorListDef__Group_1__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2814:2: rule__SelectorListDef__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectorListDef__Group_1__1__Impl_in_rule__SelectorListDef__Group_1__15833);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2820:1: rule__SelectorListDef__Group_1__1__Impl : ( ( rule__SelectorListDef__SelectorsAssignment_1_1 ) ) ;
    public final void rule__SelectorListDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2824:1: ( ( ( rule__SelectorListDef__SelectorsAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2825:1: ( ( rule__SelectorListDef__SelectorsAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2825:1: ( ( rule__SelectorListDef__SelectorsAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2826:1: ( rule__SelectorListDef__SelectorsAssignment_1_1 )
            {
             before(grammarAccess.getSelectorListDefAccess().getSelectorsAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2827:1: ( rule__SelectorListDef__SelectorsAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2827:2: rule__SelectorListDef__SelectorsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SelectorListDef__SelectorsAssignment_1_1_in_rule__SelectorListDef__Group_1__1__Impl5860);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2841:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2845:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2846:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__05894);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__05897);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2853:1: rule__AndExpression__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2857:1: ( ( ruleOrExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2858:1: ( ruleOrExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2858:1: ( ruleOrExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2859:1: ruleOrExpression
            {
             before(grammarAccess.getAndExpressionAccess().getOrExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__AndExpression__Group__0__Impl5924);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2870:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2874:1: ( rule__AndExpression__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2875:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__15953);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2881:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2885:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2886:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2886:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2887:1: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2888:1: ( rule__AndExpression__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=14 && LA26_0<=15)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2888:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl5980);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2902:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2906:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2907:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__06015);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__06018);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2914:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2918:1: ( ( () ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2919:1: ( () )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2919:1: ( () )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2920:1: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2921:1: ()
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2923:1: 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2933:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2937:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2938:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__16076);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__16079);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2945:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__Alternatives_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2949:1: ( ( ( rule__AndExpression__Alternatives_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2950:1: ( ( rule__AndExpression__Alternatives_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2950:1: ( ( rule__AndExpression__Alternatives_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2951:1: ( rule__AndExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getAlternatives_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2952:1: ( rule__AndExpression__Alternatives_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2952:2: rule__AndExpression__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__Alternatives_1_1_in_rule__AndExpression__Group_1__1__Impl6106);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2962:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2966:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2967:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__26136);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2973:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RhsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2977:1: ( ( ( rule__AndExpression__RhsAssignment_1_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2978:1: ( ( rule__AndExpression__RhsAssignment_1_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2978:1: ( ( rule__AndExpression__RhsAssignment_1_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2979:1: ( rule__AndExpression__RhsAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRhsAssignment_1_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2980:1: ( rule__AndExpression__RhsAssignment_1_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2980:2: rule__AndExpression__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExpression__RhsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl6163);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:2996:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3000:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3001:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__06199);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__06202);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3008:1: rule__OrExpression__Group__0__Impl : ( ruleImpliesExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3012:1: ( ( ruleImpliesExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3013:1: ( ruleImpliesExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3013:1: ( ruleImpliesExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3014:1: ruleImpliesExpression
            {
             before(grammarAccess.getOrExpressionAccess().getImpliesExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleImpliesExpression_in_rule__OrExpression__Group__0__Impl6229);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3025:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3029:1: ( rule__OrExpression__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3030:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__16258);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3036:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3040:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3041:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3041:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3042:1: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3043:1: ( rule__OrExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==49) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3043:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl6285);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3057:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3061:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3062:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__06320);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__06323);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3069:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3073:1: ( ( () ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3074:1: ( () )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3074:1: ( () )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3075:1: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3076:1: ()
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3078:1: 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3088:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3092:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3093:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__16381);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__16384);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3100:1: rule__OrExpression__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3104:1: ( ( 'or' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3105:1: ( 'or' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3105:1: ( 'or' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3106:1: 'or'
            {
             before(grammarAccess.getOrExpressionAccess().getOrKeyword_1_1()); 
            match(input,49,FOLLOW_49_in_rule__OrExpression__Group_1__1__Impl6412); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3119:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3123:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3124:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__26443);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3130:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RhsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3134:1: ( ( ( rule__OrExpression__RhsAssignment_1_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3135:1: ( ( rule__OrExpression__RhsAssignment_1_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3135:1: ( ( rule__OrExpression__RhsAssignment_1_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3136:1: ( rule__OrExpression__RhsAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRhsAssignment_1_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3137:1: ( rule__OrExpression__RhsAssignment_1_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3137:2: rule__OrExpression__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExpression__RhsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl6470);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3153:1: rule__ImpliesExpression__Group__0 : rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1 ;
    public final void rule__ImpliesExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3157:1: ( rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3158:2: rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__Group__0__Impl_in_rule__ImpliesExpression__Group__06506);
            rule__ImpliesExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImpliesExpression__Group__1_in_rule__ImpliesExpression__Group__06509);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3165:1: rule__ImpliesExpression__Group__0__Impl : ( ( rule__ImpliesExpression__LhsAssignment_0 ) ) ;
    public final void rule__ImpliesExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3169:1: ( ( ( rule__ImpliesExpression__LhsAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3170:1: ( ( rule__ImpliesExpression__LhsAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3170:1: ( ( rule__ImpliesExpression__LhsAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3171:1: ( rule__ImpliesExpression__LhsAssignment_0 )
            {
             before(grammarAccess.getImpliesExpressionAccess().getLhsAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3172:1: ( rule__ImpliesExpression__LhsAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3172:2: rule__ImpliesExpression__LhsAssignment_0
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__LhsAssignment_0_in_rule__ImpliesExpression__Group__0__Impl6536);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3182:1: rule__ImpliesExpression__Group__1 : rule__ImpliesExpression__Group__1__Impl ;
    public final void rule__ImpliesExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3186:1: ( rule__ImpliesExpression__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3187:2: rule__ImpliesExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__Group__1__Impl_in_rule__ImpliesExpression__Group__16566);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3193:1: rule__ImpliesExpression__Group__1__Impl : ( ( rule__ImpliesExpression__Group_1__0 )? ) ;
    public final void rule__ImpliesExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3197:1: ( ( ( rule__ImpliesExpression__Group_1__0 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3198:1: ( ( rule__ImpliesExpression__Group_1__0 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3198:1: ( ( rule__ImpliesExpression__Group_1__0 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3199:1: ( rule__ImpliesExpression__Group_1__0 )?
            {
             before(grammarAccess.getImpliesExpressionAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3200:1: ( rule__ImpliesExpression__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=16 && LA28_0<=17)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3200:2: rule__ImpliesExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ImpliesExpression__Group_1__0_in_rule__ImpliesExpression__Group__1__Impl6593);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3214:1: rule__ImpliesExpression__Group_1__0 : rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1 ;
    public final void rule__ImpliesExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3218:1: ( rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3219:2: rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__Group_1__0__Impl_in_rule__ImpliesExpression__Group_1__06628);
            rule__ImpliesExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImpliesExpression__Group_1__1_in_rule__ImpliesExpression__Group_1__06631);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3226:1: rule__ImpliesExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ImpliesExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3230:1: ( ( () ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3231:1: ( () )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3231:1: ( () )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3232:1: ()
            {
             before(grammarAccess.getImpliesExpressionAccess().getImpliesExpressionLhsAction_1_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3233:1: ()
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3235:1: 
            {
            }

             after(grammarAccess.getImpliesExpressionAccess().getImpliesExpressionLhsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group_1__1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3245:1: rule__ImpliesExpression__Group_1__1 : rule__ImpliesExpression__Group_1__1__Impl rule__ImpliesExpression__Group_1__2 ;
    public final void rule__ImpliesExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3249:1: ( rule__ImpliesExpression__Group_1__1__Impl rule__ImpliesExpression__Group_1__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3250:2: rule__ImpliesExpression__Group_1__1__Impl rule__ImpliesExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__Group_1__1__Impl_in_rule__ImpliesExpression__Group_1__16689);
            rule__ImpliesExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImpliesExpression__Group_1__2_in_rule__ImpliesExpression__Group_1__16692);
            rule__ImpliesExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3257:1: rule__ImpliesExpression__Group_1__1__Impl : ( ( rule__ImpliesExpression__Alternatives_1_1 ) ) ;
    public final void rule__ImpliesExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3261:1: ( ( ( rule__ImpliesExpression__Alternatives_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3262:1: ( ( rule__ImpliesExpression__Alternatives_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3262:1: ( ( rule__ImpliesExpression__Alternatives_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3263:1: ( rule__ImpliesExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getImpliesExpressionAccess().getAlternatives_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3264:1: ( rule__ImpliesExpression__Alternatives_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3264:2: rule__ImpliesExpression__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__Alternatives_1_1_in_rule__ImpliesExpression__Group_1__1__Impl6719);
            rule__ImpliesExpression__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImpliesExpressionAccess().getAlternatives_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ImpliesExpression__Group_1__2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3274:1: rule__ImpliesExpression__Group_1__2 : rule__ImpliesExpression__Group_1__2__Impl ;
    public final void rule__ImpliesExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3278:1: ( rule__ImpliesExpression__Group_1__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3279:2: rule__ImpliesExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__Group_1__2__Impl_in_rule__ImpliesExpression__Group_1__26749);
            rule__ImpliesExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__2"


    // $ANTLR start "rule__ImpliesExpression__Group_1__2__Impl"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3285:1: rule__ImpliesExpression__Group_1__2__Impl : ( ( rule__ImpliesExpression__RhsAssignment_1_2 ) ) ;
    public final void rule__ImpliesExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3289:1: ( ( ( rule__ImpliesExpression__RhsAssignment_1_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3290:1: ( ( rule__ImpliesExpression__RhsAssignment_1_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3290:1: ( ( rule__ImpliesExpression__RhsAssignment_1_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3291:1: ( rule__ImpliesExpression__RhsAssignment_1_2 )
            {
             before(grammarAccess.getImpliesExpressionAccess().getRhsAssignment_1_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3292:1: ( rule__ImpliesExpression__RhsAssignment_1_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3292:2: rule__ImpliesExpression__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ImpliesExpression__RhsAssignment_1_2_in_rule__ImpliesExpression__Group_1__2__Impl6776);
            rule__ImpliesExpression__RhsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getImpliesExpressionAccess().getRhsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3308:1: rule__PrimaryExpression__Group__0 : rule__PrimaryExpression__Group__0__Impl rule__PrimaryExpression__Group__1 ;
    public final void rule__PrimaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3312:1: ( rule__PrimaryExpression__Group__0__Impl rule__PrimaryExpression__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3313:2: rule__PrimaryExpression__Group__0__Impl rule__PrimaryExpression__Group__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group__0__Impl_in_rule__PrimaryExpression__Group__06812);
            rule__PrimaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group__1_in_rule__PrimaryExpression__Group__06815);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3320:1: rule__PrimaryExpression__Group__0__Impl : ( ( rule__PrimaryExpression__NegatedAssignment_0 )? ) ;
    public final void rule__PrimaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3324:1: ( ( ( rule__PrimaryExpression__NegatedAssignment_0 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3325:1: ( ( rule__PrimaryExpression__NegatedAssignment_0 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3325:1: ( ( rule__PrimaryExpression__NegatedAssignment_0 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3326:1: ( rule__PrimaryExpression__NegatedAssignment_0 )?
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNegatedAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3327:1: ( rule__PrimaryExpression__NegatedAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==55) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3327:2: rule__PrimaryExpression__NegatedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__NegatedAssignment_0_in_rule__PrimaryExpression__Group__0__Impl6842);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3337:1: rule__PrimaryExpression__Group__1 : rule__PrimaryExpression__Group__1__Impl ;
    public final void rule__PrimaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3341:1: ( rule__PrimaryExpression__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3342:2: rule__PrimaryExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group__1__Impl_in_rule__PrimaryExpression__Group__16873);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3348:1: rule__PrimaryExpression__Group__1__Impl : ( ( rule__PrimaryExpression__Alternatives_1 ) ) ;
    public final void rule__PrimaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3352:1: ( ( ( rule__PrimaryExpression__Alternatives_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3353:1: ( ( rule__PrimaryExpression__Alternatives_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3353:1: ( ( rule__PrimaryExpression__Alternatives_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3354:1: ( rule__PrimaryExpression__Alternatives_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3355:1: ( rule__PrimaryExpression__Alternatives_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3355:2: rule__PrimaryExpression__Alternatives_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_1_in_rule__PrimaryExpression__Group__1__Impl6900);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3369:1: rule__PrimaryExpression__Group_1_1__0 : rule__PrimaryExpression__Group_1_1__0__Impl rule__PrimaryExpression__Group_1_1__1 ;
    public final void rule__PrimaryExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3373:1: ( rule__PrimaryExpression__Group_1_1__0__Impl rule__PrimaryExpression__Group_1_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3374:2: rule__PrimaryExpression__Group_1_1__0__Impl rule__PrimaryExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1_1__0__Impl_in_rule__PrimaryExpression__Group_1_1__06934);
            rule__PrimaryExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1_1__1_in_rule__PrimaryExpression__Group_1_1__06937);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3381:1: rule__PrimaryExpression__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3385:1: ( ( '(' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3386:1: ( '(' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3386:1: ( '(' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3387:1: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,47,FOLLOW_47_in_rule__PrimaryExpression__Group_1_1__0__Impl6965); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3400:1: rule__PrimaryExpression__Group_1_1__1 : rule__PrimaryExpression__Group_1_1__1__Impl rule__PrimaryExpression__Group_1_1__2 ;
    public final void rule__PrimaryExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3404:1: ( rule__PrimaryExpression__Group_1_1__1__Impl rule__PrimaryExpression__Group_1_1__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3405:2: rule__PrimaryExpression__Group_1_1__1__Impl rule__PrimaryExpression__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1_1__1__Impl_in_rule__PrimaryExpression__Group_1_1__16996);
            rule__PrimaryExpression__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1_1__2_in_rule__PrimaryExpression__Group_1_1__16999);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3412:1: rule__PrimaryExpression__Group_1_1__1__Impl : ( ( rule__PrimaryExpression__InnerAssignment_1_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3416:1: ( ( ( rule__PrimaryExpression__InnerAssignment_1_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3417:1: ( ( rule__PrimaryExpression__InnerAssignment_1_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3417:1: ( ( rule__PrimaryExpression__InnerAssignment_1_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3418:1: ( rule__PrimaryExpression__InnerAssignment_1_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getInnerAssignment_1_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3419:1: ( rule__PrimaryExpression__InnerAssignment_1_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3419:2: rule__PrimaryExpression__InnerAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__InnerAssignment_1_1_1_in_rule__PrimaryExpression__Group_1_1__1__Impl7026);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3429:1: rule__PrimaryExpression__Group_1_1__2 : rule__PrimaryExpression__Group_1_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3433:1: ( rule__PrimaryExpression__Group_1_1__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3434:2: rule__PrimaryExpression__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1_1__2__Impl_in_rule__PrimaryExpression__Group_1_1__27056);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3440:1: rule__PrimaryExpression__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3444:1: ( ( ')' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3445:1: ( ')' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3445:1: ( ')' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3446:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_1_2()); 
            match(input,48,FOLLOW_48_in_rule__PrimaryExpression__Group_1_1__2__Impl7084); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3465:1: rule__PredicateCall__Group__0 : rule__PredicateCall__Group__0__Impl rule__PredicateCall__Group__1 ;
    public final void rule__PredicateCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3469:1: ( rule__PredicateCall__Group__0__Impl rule__PredicateCall__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3470:2: rule__PredicateCall__Group__0__Impl rule__PredicateCall__Group__1
            {
            pushFollow(FOLLOW_rule__PredicateCall__Group__0__Impl_in_rule__PredicateCall__Group__07121);
            rule__PredicateCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateCall__Group__1_in_rule__PredicateCall__Group__07124);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3477:1: rule__PredicateCall__Group__0__Impl : ( ( rule__PredicateCall__Alternatives_0 ) ) ;
    public final void rule__PredicateCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3481:1: ( ( ( rule__PredicateCall__Alternatives_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3482:1: ( ( rule__PredicateCall__Alternatives_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3482:1: ( ( rule__PredicateCall__Alternatives_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3483:1: ( rule__PredicateCall__Alternatives_0 )
            {
             before(grammarAccess.getPredicateCallAccess().getAlternatives_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3484:1: ( rule__PredicateCall__Alternatives_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3484:2: rule__PredicateCall__Alternatives_0
            {
            pushFollow(FOLLOW_rule__PredicateCall__Alternatives_0_in_rule__PredicateCall__Group__0__Impl7151);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3494:1: rule__PredicateCall__Group__1 : rule__PredicateCall__Group__1__Impl ;
    public final void rule__PredicateCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3498:1: ( rule__PredicateCall__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3499:2: rule__PredicateCall__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PredicateCall__Group__1__Impl_in_rule__PredicateCall__Group__17181);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3505:1: rule__PredicateCall__Group__1__Impl : ( ( rule__PredicateCall__Group_1__0 )? ) ;
    public final void rule__PredicateCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3509:1: ( ( ( rule__PredicateCall__Group_1__0 )? ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3510:1: ( ( rule__PredicateCall__Group_1__0 )? )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3510:1: ( ( rule__PredicateCall__Group_1__0 )? )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3511:1: ( rule__PredicateCall__Group_1__0 )?
            {
             before(grammarAccess.getPredicateCallAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3512:1: ( rule__PredicateCall__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3512:2: rule__PredicateCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PredicateCall__Group_1__0_in_rule__PredicateCall__Group__1__Impl7208);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3526:1: rule__PredicateCall__Group_1__0 : rule__PredicateCall__Group_1__0__Impl rule__PredicateCall__Group_1__1 ;
    public final void rule__PredicateCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3530:1: ( rule__PredicateCall__Group_1__0__Impl rule__PredicateCall__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3531:2: rule__PredicateCall__Group_1__0__Impl rule__PredicateCall__Group_1__1
            {
            pushFollow(FOLLOW_rule__PredicateCall__Group_1__0__Impl_in_rule__PredicateCall__Group_1__07243);
            rule__PredicateCall__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateCall__Group_1__1_in_rule__PredicateCall__Group_1__07246);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3538:1: rule__PredicateCall__Group_1__0__Impl : ( '[' ) ;
    public final void rule__PredicateCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3542:1: ( ( '[' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3543:1: ( '[' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3543:1: ( '[' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3544:1: '['
            {
             before(grammarAccess.getPredicateCallAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,50,FOLLOW_50_in_rule__PredicateCall__Group_1__0__Impl7274); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3557:1: rule__PredicateCall__Group_1__1 : rule__PredicateCall__Group_1__1__Impl rule__PredicateCall__Group_1__2 ;
    public final void rule__PredicateCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3561:1: ( rule__PredicateCall__Group_1__1__Impl rule__PredicateCall__Group_1__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3562:2: rule__PredicateCall__Group_1__1__Impl rule__PredicateCall__Group_1__2
            {
            pushFollow(FOLLOW_rule__PredicateCall__Group_1__1__Impl_in_rule__PredicateCall__Group_1__17305);
            rule__PredicateCall__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateCall__Group_1__2_in_rule__PredicateCall__Group_1__17308);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3569:1: rule__PredicateCall__Group_1__1__Impl : ( ( rule__PredicateCall__LabelAssignment_1_1 ) ) ;
    public final void rule__PredicateCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3573:1: ( ( ( rule__PredicateCall__LabelAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3574:1: ( ( rule__PredicateCall__LabelAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3574:1: ( ( rule__PredicateCall__LabelAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3575:1: ( rule__PredicateCall__LabelAssignment_1_1 )
            {
             before(grammarAccess.getPredicateCallAccess().getLabelAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3576:1: ( rule__PredicateCall__LabelAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3576:2: rule__PredicateCall__LabelAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PredicateCall__LabelAssignment_1_1_in_rule__PredicateCall__Group_1__1__Impl7335);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3586:1: rule__PredicateCall__Group_1__2 : rule__PredicateCall__Group_1__2__Impl ;
    public final void rule__PredicateCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3590:1: ( rule__PredicateCall__Group_1__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3591:2: rule__PredicateCall__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PredicateCall__Group_1__2__Impl_in_rule__PredicateCall__Group_1__27365);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3597:1: rule__PredicateCall__Group_1__2__Impl : ( ']' ) ;
    public final void rule__PredicateCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3601:1: ( ( ']' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3602:1: ( ']' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3602:1: ( ']' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3603:1: ']'
            {
             before(grammarAccess.getPredicateCallAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,51,FOLLOW_51_in_rule__PredicateCall__Group_1__2__Impl7393); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3622:1: rule__PropertyRelationPredicate__Group__0 : rule__PropertyRelationPredicate__Group__0__Impl rule__PropertyRelationPredicate__Group__1 ;
    public final void rule__PropertyRelationPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3626:1: ( rule__PropertyRelationPredicate__Group__0__Impl rule__PropertyRelationPredicate__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3627:2: rule__PropertyRelationPredicate__Group__0__Impl rule__PropertyRelationPredicate__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyRelationPredicate__Group__0__Impl_in_rule__PropertyRelationPredicate__Group__07430);
            rule__PropertyRelationPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyRelationPredicate__Group__1_in_rule__PropertyRelationPredicate__Group__07433);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3634:1: rule__PropertyRelationPredicate__Group__0__Impl : ( ( rule__PropertyRelationPredicate__LhsAssignment_0 ) ) ;
    public final void rule__PropertyRelationPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3638:1: ( ( ( rule__PropertyRelationPredicate__LhsAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3639:1: ( ( rule__PropertyRelationPredicate__LhsAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3639:1: ( ( rule__PropertyRelationPredicate__LhsAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3640:1: ( rule__PropertyRelationPredicate__LhsAssignment_0 )
            {
             before(grammarAccess.getPropertyRelationPredicateAccess().getLhsAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3641:1: ( rule__PropertyRelationPredicate__LhsAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3641:2: rule__PropertyRelationPredicate__LhsAssignment_0
            {
            pushFollow(FOLLOW_rule__PropertyRelationPredicate__LhsAssignment_0_in_rule__PropertyRelationPredicate__Group__0__Impl7460);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3651:1: rule__PropertyRelationPredicate__Group__1 : rule__PropertyRelationPredicate__Group__1__Impl rule__PropertyRelationPredicate__Group__2 ;
    public final void rule__PropertyRelationPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3655:1: ( rule__PropertyRelationPredicate__Group__1__Impl rule__PropertyRelationPredicate__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3656:2: rule__PropertyRelationPredicate__Group__1__Impl rule__PropertyRelationPredicate__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyRelationPredicate__Group__1__Impl_in_rule__PropertyRelationPredicate__Group__17490);
            rule__PropertyRelationPredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyRelationPredicate__Group__2_in_rule__PropertyRelationPredicate__Group__17493);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3663:1: rule__PropertyRelationPredicate__Group__1__Impl : ( ( rule__PropertyRelationPredicate__RelationAssignment_1 ) ) ;
    public final void rule__PropertyRelationPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3667:1: ( ( ( rule__PropertyRelationPredicate__RelationAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3668:1: ( ( rule__PropertyRelationPredicate__RelationAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3668:1: ( ( rule__PropertyRelationPredicate__RelationAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3669:1: ( rule__PropertyRelationPredicate__RelationAssignment_1 )
            {
             before(grammarAccess.getPropertyRelationPredicateAccess().getRelationAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3670:1: ( rule__PropertyRelationPredicate__RelationAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3670:2: rule__PropertyRelationPredicate__RelationAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyRelationPredicate__RelationAssignment_1_in_rule__PropertyRelationPredicate__Group__1__Impl7520);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3680:1: rule__PropertyRelationPredicate__Group__2 : rule__PropertyRelationPredicate__Group__2__Impl ;
    public final void rule__PropertyRelationPredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3684:1: ( rule__PropertyRelationPredicate__Group__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3685:2: rule__PropertyRelationPredicate__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyRelationPredicate__Group__2__Impl_in_rule__PropertyRelationPredicate__Group__27550);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3691:1: rule__PropertyRelationPredicate__Group__2__Impl : ( ( rule__PropertyRelationPredicate__RhsAssignment_2 ) ) ;
    public final void rule__PropertyRelationPredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3695:1: ( ( ( rule__PropertyRelationPredicate__RhsAssignment_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3696:1: ( ( rule__PropertyRelationPredicate__RhsAssignment_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3696:1: ( ( rule__PropertyRelationPredicate__RhsAssignment_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3697:1: ( rule__PropertyRelationPredicate__RhsAssignment_2 )
            {
             before(grammarAccess.getPropertyRelationPredicateAccess().getRhsAssignment_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3698:1: ( rule__PropertyRelationPredicate__RhsAssignment_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3698:2: rule__PropertyRelationPredicate__RhsAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyRelationPredicate__RhsAssignment_2_in_rule__PropertyRelationPredicate__Group__2__Impl7577);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3714:1: rule__PredicateReference__Group__0 : rule__PredicateReference__Group__0__Impl rule__PredicateReference__Group__1 ;
    public final void rule__PredicateReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3718:1: ( rule__PredicateReference__Group__0__Impl rule__PredicateReference__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3719:2: rule__PredicateReference__Group__0__Impl rule__PredicateReference__Group__1
            {
            pushFollow(FOLLOW_rule__PredicateReference__Group__0__Impl_in_rule__PredicateReference__Group__07613);
            rule__PredicateReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateReference__Group__1_in_rule__PredicateReference__Group__07616);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3726:1: rule__PredicateReference__Group__0__Impl : ( ( rule__PredicateReference__ReferenceAssignment_0 ) ) ;
    public final void rule__PredicateReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3730:1: ( ( ( rule__PredicateReference__ReferenceAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3731:1: ( ( rule__PredicateReference__ReferenceAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3731:1: ( ( rule__PredicateReference__ReferenceAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3732:1: ( rule__PredicateReference__ReferenceAssignment_0 )
            {
             before(grammarAccess.getPredicateReferenceAccess().getReferenceAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3733:1: ( rule__PredicateReference__ReferenceAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3733:2: rule__PredicateReference__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__PredicateReference__ReferenceAssignment_0_in_rule__PredicateReference__Group__0__Impl7643);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3743:1: rule__PredicateReference__Group__1 : rule__PredicateReference__Group__1__Impl ;
    public final void rule__PredicateReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3747:1: ( rule__PredicateReference__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3748:2: rule__PredicateReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PredicateReference__Group__1__Impl_in_rule__PredicateReference__Group__17673);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3754:1: rule__PredicateReference__Group__1__Impl : ( ( rule__PredicateReference__ArgumentsAssignment_1 ) ) ;
    public final void rule__PredicateReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3758:1: ( ( ( rule__PredicateReference__ArgumentsAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3759:1: ( ( rule__PredicateReference__ArgumentsAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3759:1: ( ( rule__PredicateReference__ArgumentsAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3760:1: ( rule__PredicateReference__ArgumentsAssignment_1 )
            {
             before(grammarAccess.getPredicateReferenceAccess().getArgumentsAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3761:1: ( rule__PredicateReference__ArgumentsAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3761:2: rule__PredicateReference__ArgumentsAssignment_1
            {
            pushFollow(FOLLOW_rule__PredicateReference__ArgumentsAssignment_1_in_rule__PredicateReference__Group__1__Impl7700);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3775:1: rule__ParameterList__Group__0 : rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3779:1: ( rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3780:2: rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__0__Impl_in_rule__ParameterList__Group__07734);
            rule__ParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__07737);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3787:1: rule__ParameterList__Group__0__Impl : ( ( rule__ParameterList__ParametersAssignment_0 ) ) ;
    public final void rule__ParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3791:1: ( ( ( rule__ParameterList__ParametersAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3792:1: ( ( rule__ParameterList__ParametersAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3792:1: ( ( rule__ParameterList__ParametersAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3793:1: ( rule__ParameterList__ParametersAssignment_0 )
            {
             before(grammarAccess.getParameterListAccess().getParametersAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3794:1: ( rule__ParameterList__ParametersAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3794:2: rule__ParameterList__ParametersAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterList__ParametersAssignment_0_in_rule__ParameterList__Group__0__Impl7764);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3804:1: rule__ParameterList__Group__1 : rule__ParameterList__Group__1__Impl ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3808:1: ( rule__ParameterList__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3809:2: rule__ParameterList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__1__Impl_in_rule__ParameterList__Group__17794);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3815:1: rule__ParameterList__Group__1__Impl : ( ( rule__ParameterList__Group_1__0 )* ) ;
    public final void rule__ParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3819:1: ( ( ( rule__ParameterList__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3820:1: ( ( rule__ParameterList__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3820:1: ( ( rule__ParameterList__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3821:1: ( rule__ParameterList__Group_1__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3822:1: ( rule__ParameterList__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3822:2: rule__ParameterList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ParameterList__Group_1__0_in_rule__ParameterList__Group__1__Impl7821);
            	    rule__ParameterList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3836:1: rule__ParameterList__Group_1__0 : rule__ParameterList__Group_1__0__Impl rule__ParameterList__Group_1__1 ;
    public final void rule__ParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3840:1: ( rule__ParameterList__Group_1__0__Impl rule__ParameterList__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3841:2: rule__ParameterList__Group_1__0__Impl rule__ParameterList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParameterList__Group_1__0__Impl_in_rule__ParameterList__Group_1__07856);
            rule__ParameterList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group_1__1_in_rule__ParameterList__Group_1__07859);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3848:1: rule__ParameterList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ParameterList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3852:1: ( ( ',' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3853:1: ( ',' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3853:1: ( ',' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3854:1: ','
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__ParameterList__Group_1__0__Impl7887); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3867:1: rule__ParameterList__Group_1__1 : rule__ParameterList__Group_1__1__Impl ;
    public final void rule__ParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3871:1: ( rule__ParameterList__Group_1__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3872:2: rule__ParameterList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterList__Group_1__1__Impl_in_rule__ParameterList__Group_1__17918);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3878:1: rule__ParameterList__Group_1__1__Impl : ( ( rule__ParameterList__ParametersAssignment_1_1 ) ) ;
    public final void rule__ParameterList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3882:1: ( ( ( rule__ParameterList__ParametersAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3883:1: ( ( rule__ParameterList__ParametersAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3883:1: ( ( rule__ParameterList__ParametersAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3884:1: ( rule__ParameterList__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getParameterListAccess().getParametersAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3885:1: ( rule__ParameterList__ParametersAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3885:2: rule__ParameterList__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParameterList__ParametersAssignment_1_1_in_rule__ParameterList__Group_1__1__Impl7945);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3899:1: rule__ArgumentList__Group__0 : rule__ArgumentList__Group__0__Impl rule__ArgumentList__Group__1 ;
    public final void rule__ArgumentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3903:1: ( rule__ArgumentList__Group__0__Impl rule__ArgumentList__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3904:2: rule__ArgumentList__Group__0__Impl rule__ArgumentList__Group__1
            {
            pushFollow(FOLLOW_rule__ArgumentList__Group__0__Impl_in_rule__ArgumentList__Group__07979);
            rule__ArgumentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArgumentList__Group__1_in_rule__ArgumentList__Group__07982);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3911:1: rule__ArgumentList__Group__0__Impl : ( ( rule__ArgumentList__ArgumentsAssignment_0 ) ) ;
    public final void rule__ArgumentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3915:1: ( ( ( rule__ArgumentList__ArgumentsAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3916:1: ( ( rule__ArgumentList__ArgumentsAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3916:1: ( ( rule__ArgumentList__ArgumentsAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3917:1: ( rule__ArgumentList__ArgumentsAssignment_0 )
            {
             before(grammarAccess.getArgumentListAccess().getArgumentsAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3918:1: ( rule__ArgumentList__ArgumentsAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3918:2: rule__ArgumentList__ArgumentsAssignment_0
            {
            pushFollow(FOLLOW_rule__ArgumentList__ArgumentsAssignment_0_in_rule__ArgumentList__Group__0__Impl8009);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3928:1: rule__ArgumentList__Group__1 : rule__ArgumentList__Group__1__Impl ;
    public final void rule__ArgumentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3932:1: ( rule__ArgumentList__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3933:2: rule__ArgumentList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArgumentList__Group__1__Impl_in_rule__ArgumentList__Group__18039);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3939:1: rule__ArgumentList__Group__1__Impl : ( ( rule__ArgumentList__Group_1__0 )* ) ;
    public final void rule__ArgumentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3943:1: ( ( ( rule__ArgumentList__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3944:1: ( ( rule__ArgumentList__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3944:1: ( ( rule__ArgumentList__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3945:1: ( rule__ArgumentList__Group_1__0 )*
            {
             before(grammarAccess.getArgumentListAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3946:1: ( rule__ArgumentList__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==15) ) {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==RULE_ID) ) {
                        int LA32_3 = input.LA(3);

                        if ( (LA32_3==EOF||(LA32_3>=14 && LA32_3<=17)||(LA32_3>=20 && LA32_3<=21)||(LA32_3>=39 && LA32_3<=41)||LA32_3==44||(LA32_3>=48 && LA32_3<=50)) ) {
                            alt32=1;
                        }
                        else if ( (LA32_3==RULE_ID) ) {
                            int LA32_5 = input.LA(4);

                            if ( ((LA32_5>=22 && LA32_5<=24)) ) {
                                alt32=1;
                            }


                        }


                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3946:2: rule__ArgumentList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ArgumentList__Group_1__0_in_rule__ArgumentList__Group__1__Impl8066);
            	    rule__ArgumentList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3960:1: rule__ArgumentList__Group_1__0 : rule__ArgumentList__Group_1__0__Impl rule__ArgumentList__Group_1__1 ;
    public final void rule__ArgumentList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3964:1: ( rule__ArgumentList__Group_1__0__Impl rule__ArgumentList__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3965:2: rule__ArgumentList__Group_1__0__Impl rule__ArgumentList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ArgumentList__Group_1__0__Impl_in_rule__ArgumentList__Group_1__08101);
            rule__ArgumentList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArgumentList__Group_1__1_in_rule__ArgumentList__Group_1__08104);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3972:1: rule__ArgumentList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ArgumentList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3976:1: ( ( ',' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3977:1: ( ',' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3977:1: ( ',' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3978:1: ','
            {
             before(grammarAccess.getArgumentListAccess().getCommaKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__ArgumentList__Group_1__0__Impl8132); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3991:1: rule__ArgumentList__Group_1__1 : rule__ArgumentList__Group_1__1__Impl ;
    public final void rule__ArgumentList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3995:1: ( rule__ArgumentList__Group_1__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:3996:2: rule__ArgumentList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ArgumentList__Group_1__1__Impl_in_rule__ArgumentList__Group_1__18163);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4002:1: rule__ArgumentList__Group_1__1__Impl : ( ( rule__ArgumentList__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__ArgumentList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4006:1: ( ( ( rule__ArgumentList__ArgumentsAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4007:1: ( ( rule__ArgumentList__ArgumentsAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4007:1: ( ( rule__ArgumentList__ArgumentsAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4008:1: ( rule__ArgumentList__ArgumentsAssignment_1_1 )
            {
             before(grammarAccess.getArgumentListAccess().getArgumentsAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4009:1: ( rule__ArgumentList__ArgumentsAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4009:2: rule__ArgumentList__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ArgumentList__ArgumentsAssignment_1_1_in_rule__ArgumentList__Group_1__1__Impl8190);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4023:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4027:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4028:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__08224);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__08227);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4035:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__ReferenceAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4039:1: ( ( ( rule__Assignment__ReferenceAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4040:1: ( ( rule__Assignment__ReferenceAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4040:1: ( ( rule__Assignment__ReferenceAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4041:1: ( rule__Assignment__ReferenceAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getReferenceAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4042:1: ( rule__Assignment__ReferenceAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4042:2: rule__Assignment__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__ReferenceAssignment_0_in_rule__Assignment__Group__0__Impl8254);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4052:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4056:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4057:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__18284);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__18287);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4064:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Alternatives_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4068:1: ( ( ( rule__Assignment__Alternatives_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4069:1: ( ( rule__Assignment__Alternatives_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4069:1: ( ( rule__Assignment__Alternatives_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4070:1: ( rule__Assignment__Alternatives_1 )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4071:1: ( rule__Assignment__Alternatives_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4071:2: rule__Assignment__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Assignment__Alternatives_1_in_rule__Assignment__Group__1__Impl8314);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4081:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4085:1: ( rule__Assignment__Group__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4086:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__28344);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4092:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4096:1: ( ( ( rule__Assignment__ExpressionAssignment_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4097:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4097:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4098:1: ( rule__Assignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4099:1: ( rule__Assignment__ExpressionAssignment_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4099:2: rule__Assignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_in_rule__Assignment__Group__2__Impl8371);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4115:1: rule__AssignmentList__Group__0 : rule__AssignmentList__Group__0__Impl rule__AssignmentList__Group__1 ;
    public final void rule__AssignmentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4119:1: ( rule__AssignmentList__Group__0__Impl rule__AssignmentList__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4120:2: rule__AssignmentList__Group__0__Impl rule__AssignmentList__Group__1
            {
            pushFollow(FOLLOW_rule__AssignmentList__Group__0__Impl_in_rule__AssignmentList__Group__08407);
            rule__AssignmentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssignmentList__Group__1_in_rule__AssignmentList__Group__08410);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4127:1: rule__AssignmentList__Group__0__Impl : ( ( rule__AssignmentList__AssignmentsAssignment_0 ) ) ;
    public final void rule__AssignmentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4131:1: ( ( ( rule__AssignmentList__AssignmentsAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4132:1: ( ( rule__AssignmentList__AssignmentsAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4132:1: ( ( rule__AssignmentList__AssignmentsAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4133:1: ( rule__AssignmentList__AssignmentsAssignment_0 )
            {
             before(grammarAccess.getAssignmentListAccess().getAssignmentsAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4134:1: ( rule__AssignmentList__AssignmentsAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4134:2: rule__AssignmentList__AssignmentsAssignment_0
            {
            pushFollow(FOLLOW_rule__AssignmentList__AssignmentsAssignment_0_in_rule__AssignmentList__Group__0__Impl8437);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4144:1: rule__AssignmentList__Group__1 : rule__AssignmentList__Group__1__Impl ;
    public final void rule__AssignmentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4148:1: ( rule__AssignmentList__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4149:2: rule__AssignmentList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentList__Group__1__Impl_in_rule__AssignmentList__Group__18467);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4155:1: rule__AssignmentList__Group__1__Impl : ( ( rule__AssignmentList__Group_1__0 )* ) ;
    public final void rule__AssignmentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4159:1: ( ( ( rule__AssignmentList__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4160:1: ( ( rule__AssignmentList__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4160:1: ( ( rule__AssignmentList__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4161:1: ( rule__AssignmentList__Group_1__0 )*
            {
             before(grammarAccess.getAssignmentListAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4162:1: ( rule__AssignmentList__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==15) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4162:2: rule__AssignmentList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AssignmentList__Group_1__0_in_rule__AssignmentList__Group__1__Impl8494);
            	    rule__AssignmentList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4176:1: rule__AssignmentList__Group_1__0 : rule__AssignmentList__Group_1__0__Impl rule__AssignmentList__Group_1__1 ;
    public final void rule__AssignmentList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4180:1: ( rule__AssignmentList__Group_1__0__Impl rule__AssignmentList__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4181:2: rule__AssignmentList__Group_1__0__Impl rule__AssignmentList__Group_1__1
            {
            pushFollow(FOLLOW_rule__AssignmentList__Group_1__0__Impl_in_rule__AssignmentList__Group_1__08529);
            rule__AssignmentList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssignmentList__Group_1__1_in_rule__AssignmentList__Group_1__08532);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4188:1: rule__AssignmentList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AssignmentList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4192:1: ( ( ',' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4193:1: ( ',' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4193:1: ( ',' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4194:1: ','
            {
             before(grammarAccess.getAssignmentListAccess().getCommaKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__AssignmentList__Group_1__0__Impl8560); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4207:1: rule__AssignmentList__Group_1__1 : rule__AssignmentList__Group_1__1__Impl ;
    public final void rule__AssignmentList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4211:1: ( rule__AssignmentList__Group_1__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4212:2: rule__AssignmentList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentList__Group_1__1__Impl_in_rule__AssignmentList__Group_1__18591);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4218:1: rule__AssignmentList__Group_1__1__Impl : ( ( rule__AssignmentList__AssignmentsAssignment_1_1 ) ) ;
    public final void rule__AssignmentList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4222:1: ( ( ( rule__AssignmentList__AssignmentsAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4223:1: ( ( rule__AssignmentList__AssignmentsAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4223:1: ( ( rule__AssignmentList__AssignmentsAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4224:1: ( rule__AssignmentList__AssignmentsAssignment_1_1 )
            {
             before(grammarAccess.getAssignmentListAccess().getAssignmentsAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4225:1: ( rule__AssignmentList__AssignmentsAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4225:2: rule__AssignmentList__AssignmentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AssignmentList__AssignmentsAssignment_1_1_in_rule__AssignmentList__Group_1__1__Impl8618);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4239:1: rule__Quantification__Group__0 : rule__Quantification__Group__0__Impl rule__Quantification__Group__1 ;
    public final void rule__Quantification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4243:1: ( rule__Quantification__Group__0__Impl rule__Quantification__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4244:2: rule__Quantification__Group__0__Impl rule__Quantification__Group__1
            {
            pushFollow(FOLLOW_rule__Quantification__Group__0__Impl_in_rule__Quantification__Group__08652);
            rule__Quantification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantification__Group__1_in_rule__Quantification__Group__08655);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4251:1: rule__Quantification__Group__0__Impl : ( ( rule__Quantification__QuantorAssignment_0 ) ) ;
    public final void rule__Quantification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4255:1: ( ( ( rule__Quantification__QuantorAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4256:1: ( ( rule__Quantification__QuantorAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4256:1: ( ( rule__Quantification__QuantorAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4257:1: ( rule__Quantification__QuantorAssignment_0 )
            {
             before(grammarAccess.getQuantificationAccess().getQuantorAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4258:1: ( rule__Quantification__QuantorAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4258:2: rule__Quantification__QuantorAssignment_0
            {
            pushFollow(FOLLOW_rule__Quantification__QuantorAssignment_0_in_rule__Quantification__Group__0__Impl8682);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4268:1: rule__Quantification__Group__1 : rule__Quantification__Group__1__Impl rule__Quantification__Group__2 ;
    public final void rule__Quantification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4272:1: ( rule__Quantification__Group__1__Impl rule__Quantification__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4273:2: rule__Quantification__Group__1__Impl rule__Quantification__Group__2
            {
            pushFollow(FOLLOW_rule__Quantification__Group__1__Impl_in_rule__Quantification__Group__18712);
            rule__Quantification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantification__Group__2_in_rule__Quantification__Group__18715);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4280:1: rule__Quantification__Group__1__Impl : ( ( rule__Quantification__NodeAssignment_1 ) ) ;
    public final void rule__Quantification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4284:1: ( ( ( rule__Quantification__NodeAssignment_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4285:1: ( ( rule__Quantification__NodeAssignment_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4285:1: ( ( rule__Quantification__NodeAssignment_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4286:1: ( rule__Quantification__NodeAssignment_1 )
            {
             before(grammarAccess.getQuantificationAccess().getNodeAssignment_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4287:1: ( rule__Quantification__NodeAssignment_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4287:2: rule__Quantification__NodeAssignment_1
            {
            pushFollow(FOLLOW_rule__Quantification__NodeAssignment_1_in_rule__Quantification__Group__1__Impl8742);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4297:1: rule__Quantification__Group__2 : rule__Quantification__Group__2__Impl rule__Quantification__Group__3 ;
    public final void rule__Quantification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4301:1: ( rule__Quantification__Group__2__Impl rule__Quantification__Group__3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4302:2: rule__Quantification__Group__2__Impl rule__Quantification__Group__3
            {
            pushFollow(FOLLOW_rule__Quantification__Group__2__Impl_in_rule__Quantification__Group__28772);
            rule__Quantification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantification__Group__3_in_rule__Quantification__Group__28775);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4309:1: rule__Quantification__Group__2__Impl : ( 'in' ) ;
    public final void rule__Quantification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4313:1: ( ( 'in' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4314:1: ( 'in' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4314:1: ( 'in' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4315:1: 'in'
            {
             before(grammarAccess.getQuantificationAccess().getInKeyword_2()); 
            match(input,52,FOLLOW_52_in_rule__Quantification__Group__2__Impl8803); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4328:1: rule__Quantification__Group__3 : rule__Quantification__Group__3__Impl ;
    public final void rule__Quantification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4332:1: ( rule__Quantification__Group__3__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4333:2: rule__Quantification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Quantification__Group__3__Impl_in_rule__Quantification__Group__38834);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4339:1: rule__Quantification__Group__3__Impl : ( ( rule__Quantification__NodeSetAssignment_3 ) ) ;
    public final void rule__Quantification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4343:1: ( ( ( rule__Quantification__NodeSetAssignment_3 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4344:1: ( ( rule__Quantification__NodeSetAssignment_3 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4344:1: ( ( rule__Quantification__NodeSetAssignment_3 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4345:1: ( rule__Quantification__NodeSetAssignment_3 )
            {
             before(grammarAccess.getQuantificationAccess().getNodeSetAssignment_3()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4346:1: ( rule__Quantification__NodeSetAssignment_3 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4346:2: rule__Quantification__NodeSetAssignment_3
            {
            pushFollow(FOLLOW_rule__Quantification__NodeSetAssignment_3_in_rule__Quantification__Group__3__Impl8861);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4364:1: rule__QuantificationList__Group__0 : rule__QuantificationList__Group__0__Impl rule__QuantificationList__Group__1 ;
    public final void rule__QuantificationList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4368:1: ( rule__QuantificationList__Group__0__Impl rule__QuantificationList__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4369:2: rule__QuantificationList__Group__0__Impl rule__QuantificationList__Group__1
            {
            pushFollow(FOLLOW_rule__QuantificationList__Group__0__Impl_in_rule__QuantificationList__Group__08899);
            rule__QuantificationList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantificationList__Group__1_in_rule__QuantificationList__Group__08902);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4376:1: rule__QuantificationList__Group__0__Impl : ( ( rule__QuantificationList__QuantificationsAssignment_0 ) ) ;
    public final void rule__QuantificationList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4380:1: ( ( ( rule__QuantificationList__QuantificationsAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4381:1: ( ( rule__QuantificationList__QuantificationsAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4381:1: ( ( rule__QuantificationList__QuantificationsAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4382:1: ( rule__QuantificationList__QuantificationsAssignment_0 )
            {
             before(grammarAccess.getQuantificationListAccess().getQuantificationsAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4383:1: ( rule__QuantificationList__QuantificationsAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4383:2: rule__QuantificationList__QuantificationsAssignment_0
            {
            pushFollow(FOLLOW_rule__QuantificationList__QuantificationsAssignment_0_in_rule__QuantificationList__Group__0__Impl8929);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4393:1: rule__QuantificationList__Group__1 : rule__QuantificationList__Group__1__Impl ;
    public final void rule__QuantificationList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4397:1: ( rule__QuantificationList__Group__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4398:2: rule__QuantificationList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QuantificationList__Group__1__Impl_in_rule__QuantificationList__Group__18959);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4404:1: rule__QuantificationList__Group__1__Impl : ( ( rule__QuantificationList__Group_1__0 )* ) ;
    public final void rule__QuantificationList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4408:1: ( ( ( rule__QuantificationList__Group_1__0 )* ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4409:1: ( ( rule__QuantificationList__Group_1__0 )* )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4409:1: ( ( rule__QuantificationList__Group_1__0 )* )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4410:1: ( rule__QuantificationList__Group_1__0 )*
            {
             before(grammarAccess.getQuantificationListAccess().getGroup_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4411:1: ( rule__QuantificationList__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==15) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4411:2: rule__QuantificationList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QuantificationList__Group_1__0_in_rule__QuantificationList__Group__1__Impl8986);
            	    rule__QuantificationList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4425:1: rule__QuantificationList__Group_1__0 : rule__QuantificationList__Group_1__0__Impl rule__QuantificationList__Group_1__1 ;
    public final void rule__QuantificationList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4429:1: ( rule__QuantificationList__Group_1__0__Impl rule__QuantificationList__Group_1__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4430:2: rule__QuantificationList__Group_1__0__Impl rule__QuantificationList__Group_1__1
            {
            pushFollow(FOLLOW_rule__QuantificationList__Group_1__0__Impl_in_rule__QuantificationList__Group_1__09021);
            rule__QuantificationList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantificationList__Group_1__1_in_rule__QuantificationList__Group_1__09024);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4437:1: rule__QuantificationList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__QuantificationList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4441:1: ( ( ',' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4442:1: ( ',' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4442:1: ( ',' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4443:1: ','
            {
             before(grammarAccess.getQuantificationListAccess().getCommaKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__QuantificationList__Group_1__0__Impl9052); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4456:1: rule__QuantificationList__Group_1__1 : rule__QuantificationList__Group_1__1__Impl ;
    public final void rule__QuantificationList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4460:1: ( rule__QuantificationList__Group_1__1__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4461:2: rule__QuantificationList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QuantificationList__Group_1__1__Impl_in_rule__QuantificationList__Group_1__19083);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4467:1: rule__QuantificationList__Group_1__1__Impl : ( ( rule__QuantificationList__QuantificationsAssignment_1_1 ) ) ;
    public final void rule__QuantificationList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4471:1: ( ( ( rule__QuantificationList__QuantificationsAssignment_1_1 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4472:1: ( ( rule__QuantificationList__QuantificationsAssignment_1_1 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4472:1: ( ( rule__QuantificationList__QuantificationsAssignment_1_1 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4473:1: ( rule__QuantificationList__QuantificationsAssignment_1_1 )
            {
             before(grammarAccess.getQuantificationListAccess().getQuantificationsAssignment_1_1()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4474:1: ( rule__QuantificationList__QuantificationsAssignment_1_1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4474:2: rule__QuantificationList__QuantificationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__QuantificationList__QuantificationsAssignment_1_1_in_rule__QuantificationList__Group_1__1__Impl9110);
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


    // $ANTLR start "rule__PropertyReferenceExpression__Group__0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4488:1: rule__PropertyReferenceExpression__Group__0 : rule__PropertyReferenceExpression__Group__0__Impl rule__PropertyReferenceExpression__Group__1 ;
    public final void rule__PropertyReferenceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4492:1: ( rule__PropertyReferenceExpression__Group__0__Impl rule__PropertyReferenceExpression__Group__1 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4493:2: rule__PropertyReferenceExpression__Group__0__Impl rule__PropertyReferenceExpression__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyReferenceExpression__Group__0__Impl_in_rule__PropertyReferenceExpression__Group__09144);
            rule__PropertyReferenceExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyReferenceExpression__Group__1_in_rule__PropertyReferenceExpression__Group__09147);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4500:1: rule__PropertyReferenceExpression__Group__0__Impl : ( ( rule__PropertyReferenceExpression__NodeAssignment_0 ) ) ;
    public final void rule__PropertyReferenceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4504:1: ( ( ( rule__PropertyReferenceExpression__NodeAssignment_0 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4505:1: ( ( rule__PropertyReferenceExpression__NodeAssignment_0 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4505:1: ( ( rule__PropertyReferenceExpression__NodeAssignment_0 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4506:1: ( rule__PropertyReferenceExpression__NodeAssignment_0 )
            {
             before(grammarAccess.getPropertyReferenceExpressionAccess().getNodeAssignment_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4507:1: ( rule__PropertyReferenceExpression__NodeAssignment_0 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4507:2: rule__PropertyReferenceExpression__NodeAssignment_0
            {
            pushFollow(FOLLOW_rule__PropertyReferenceExpression__NodeAssignment_0_in_rule__PropertyReferenceExpression__Group__0__Impl9174);
            rule__PropertyReferenceExpression__NodeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyReferenceExpressionAccess().getNodeAssignment_0()); 

            }


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4517:1: rule__PropertyReferenceExpression__Group__1 : rule__PropertyReferenceExpression__Group__1__Impl rule__PropertyReferenceExpression__Group__2 ;
    public final void rule__PropertyReferenceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4521:1: ( rule__PropertyReferenceExpression__Group__1__Impl rule__PropertyReferenceExpression__Group__2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4522:2: rule__PropertyReferenceExpression__Group__1__Impl rule__PropertyReferenceExpression__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyReferenceExpression__Group__1__Impl_in_rule__PropertyReferenceExpression__Group__19204);
            rule__PropertyReferenceExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyReferenceExpression__Group__2_in_rule__PropertyReferenceExpression__Group__19207);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4529:1: rule__PropertyReferenceExpression__Group__1__Impl : ( '.' ) ;
    public final void rule__PropertyReferenceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4533:1: ( ( '.' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4534:1: ( '.' )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4534:1: ( '.' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4535:1: '.'
            {
             before(grammarAccess.getPropertyReferenceExpressionAccess().getFullStopKeyword_1()); 
            match(input,53,FOLLOW_53_in_rule__PropertyReferenceExpression__Group__1__Impl9235); 
             after(grammarAccess.getPropertyReferenceExpressionAccess().getFullStopKeyword_1()); 

            }


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4548:1: rule__PropertyReferenceExpression__Group__2 : rule__PropertyReferenceExpression__Group__2__Impl ;
    public final void rule__PropertyReferenceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4552:1: ( rule__PropertyReferenceExpression__Group__2__Impl )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4553:2: rule__PropertyReferenceExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyReferenceExpression__Group__2__Impl_in_rule__PropertyReferenceExpression__Group__29266);
            rule__PropertyReferenceExpression__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4559:1: rule__PropertyReferenceExpression__Group__2__Impl : ( ( rule__PropertyReferenceExpression__PropertyAssignment_2 ) ) ;
    public final void rule__PropertyReferenceExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4563:1: ( ( ( rule__PropertyReferenceExpression__PropertyAssignment_2 ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4564:1: ( ( rule__PropertyReferenceExpression__PropertyAssignment_2 ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4564:1: ( ( rule__PropertyReferenceExpression__PropertyAssignment_2 ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4565:1: ( rule__PropertyReferenceExpression__PropertyAssignment_2 )
            {
             before(grammarAccess.getPropertyReferenceExpressionAccess().getPropertyAssignment_2()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4566:1: ( rule__PropertyReferenceExpression__PropertyAssignment_2 )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4566:2: rule__PropertyReferenceExpression__PropertyAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyReferenceExpression__PropertyAssignment_2_in_rule__PropertyReferenceExpression__Group__2__Impl9293);
            rule__PropertyReferenceExpression__PropertyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyReferenceExpressionAccess().getPropertyAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Validator__SentencesAssignment"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4583:1: rule__Validator__SentencesAssignment : ( ruleSentence ) ;
    public final void rule__Validator__SentencesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4587:1: ( ( ruleSentence ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4588:1: ( ruleSentence )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4588:1: ( ruleSentence )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4589:1: ruleSentence
            {
             before(grammarAccess.getValidatorAccess().getSentencesSentenceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSentence_in_rule__Validator__SentencesAssignment9334);
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


    // $ANTLR start "rule__StartOnSentence__DefinitionAssignment_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4598:1: rule__StartOnSentence__DefinitionAssignment_1 : ( ruleNodeDefinition ) ;
    public final void rule__StartOnSentence__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4602:1: ( ( ruleNodeDefinition ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4603:1: ( ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4603:1: ( ruleNodeDefinition )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4604:1: ruleNodeDefinition
            {
             before(grammarAccess.getStartOnSentenceAccess().getDefinitionNodeDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_rule__StartOnSentence__DefinitionAssignment_19365);
            ruleNodeDefinition();

            state._fsp--;

             after(grammarAccess.getStartOnSentenceAccess().getDefinitionNodeDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartOnSentence__DefinitionAssignment_1"


    // $ANTLR start "rule__DefinitionSentence__QuantificationAssignment_0_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4613:1: rule__DefinitionSentence__QuantificationAssignment_0_0 : ( ruleQuantification ) ;
    public final void rule__DefinitionSentence__QuantificationAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4617:1: ( ( ruleQuantification ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4618:1: ( ruleQuantification )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4618:1: ( ruleQuantification )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4619:1: ruleQuantification
            {
             before(grammarAccess.getDefinitionSentenceAccess().getQuantificationQuantificationParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleQuantification_in_rule__DefinitionSentence__QuantificationAssignment_0_09396);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4628:1: rule__DefinitionSentence__NodeAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefinitionSentence__NodeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4632:1: ( ( ( RULE_ID ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4633:1: ( ( RULE_ID ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4633:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4634:1: ( RULE_ID )
            {
             before(grammarAccess.getDefinitionSentenceAccess().getNodeNodeDefinitionCrossReference_0_1_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4635:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4636:1: RULE_ID
            {
             before(grammarAccess.getDefinitionSentenceAccess().getNodeNodeDefinitionIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefinitionSentence__NodeAssignment_0_19431); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4647:1: rule__DefinitionSentence__QualifierAssignment_1 : ( ruleRelationQualifier ) ;
    public final void rule__DefinitionSentence__QualifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4651:1: ( ( ruleRelationQualifier ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4652:1: ( ruleRelationQualifier )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4652:1: ( ruleRelationQualifier )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4653:1: ruleRelationQualifier
            {
             before(grammarAccess.getDefinitionSentenceAccess().getQualifierRelationQualifierEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRelationQualifier_in_rule__DefinitionSentence__QualifierAssignment_19466);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4662:1: rule__DefinitionSentence__TargetAssignment_2 : ( ruleTargetDefinition ) ;
    public final void rule__DefinitionSentence__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4666:1: ( ( ruleTargetDefinition ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4667:1: ( ruleTargetDefinition )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4667:1: ( ruleTargetDefinition )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4668:1: ruleTargetDefinition
            {
             before(grammarAccess.getDefinitionSentenceAccess().getTargetTargetDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTargetDefinition_in_rule__DefinitionSentence__TargetAssignment_29497);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4677:1: rule__ConstraintSentence__QuantificationsAssignment_1 : ( ruleQuantificationList ) ;
    public final void rule__ConstraintSentence__QuantificationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4681:1: ( ( ruleQuantificationList ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4682:1: ( ruleQuantificationList )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4682:1: ( ruleQuantificationList )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4683:1: ruleQuantificationList
            {
             before(grammarAccess.getConstraintSentenceAccess().getQuantificationsQuantificationListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQuantificationList_in_rule__ConstraintSentence__QuantificationsAssignment_19528);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4692:1: rule__ConstraintSentence__NodesAssignment_2 : ( ruleNodeReferenceList ) ;
    public final void rule__ConstraintSentence__NodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4696:1: ( ( ruleNodeReferenceList ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4697:1: ( ruleNodeReferenceList )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4697:1: ( ruleNodeReferenceList )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4698:1: ruleNodeReferenceList
            {
             before(grammarAccess.getConstraintSentenceAccess().getNodesNodeReferenceListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNodeReferenceList_in_rule__ConstraintSentence__NodesAssignment_29559);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4707:1: rule__ConstraintSentence__PredicateAssignment_4 : ( rulePredicateExpression ) ;
    public final void rule__ConstraintSentence__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4711:1: ( ( rulePredicateExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4712:1: ( rulePredicateExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4712:1: ( rulePredicateExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4713:1: rulePredicateExpression
            {
             before(grammarAccess.getConstraintSentenceAccess().getPredicatePredicateExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_rule__ConstraintSentence__PredicateAssignment_49590);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4722:1: rule__PredicateDefinitionSentence__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PredicateDefinitionSentence__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4726:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4727:1: ( RULE_ID )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4727:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4728:1: RULE_ID
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PredicateDefinitionSentence__NameAssignment_19621); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4737:1: rule__PredicateDefinitionSentence__ParametersAssignment_2 : ( ruleParameterList ) ;
    public final void rule__PredicateDefinitionSentence__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4741:1: ( ( ruleParameterList ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4742:1: ( ruleParameterList )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4742:1: ( ruleParameterList )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4743:1: ruleParameterList
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getParametersParameterListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParameterList_in_rule__PredicateDefinitionSentence__ParametersAssignment_29652);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4752:1: rule__PredicateDefinitionSentence__PredicateAssignment_4 : ( rulePredicateExpression ) ;
    public final void rule__PredicateDefinitionSentence__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4756:1: ( ( rulePredicateExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4757:1: ( rulePredicateExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4757:1: ( rulePredicateExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4758:1: rulePredicateExpression
            {
             before(grammarAccess.getPredicateDefinitionSentenceAccess().getPredicatePredicateExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_rule__PredicateDefinitionSentence__PredicateAssignment_49683);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4767:1: rule__NodeDefinition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NodeDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4771:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4772:1: ( RULE_ID )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4772:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4773:1: RULE_ID
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeDefinition__NameAssignment_09714); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4782:1: rule__NodeDefinition__CollectionAssignment_1 : ( ( '*' ) ) ;
    public final void rule__NodeDefinition__CollectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4786:1: ( ( ( '*' ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4787:1: ( ( '*' ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4787:1: ( ( '*' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4788:1: ( '*' )
            {
             before(grammarAccess.getNodeDefinitionAccess().getCollectionAsteriskKeyword_1_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4789:1: ( '*' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4790:1: '*'
            {
             before(grammarAccess.getNodeDefinitionAccess().getCollectionAsteriskKeyword_1_0()); 
            match(input,54,FOLLOW_54_in_rule__NodeDefinition__CollectionAssignment_19750); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4805:1: rule__NodeDefinition__SelectorsAssignment_2 : ( ruleSelectorList ) ;
    public final void rule__NodeDefinition__SelectorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4809:1: ( ( ruleSelectorList ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4810:1: ( ruleSelectorList )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4810:1: ( ruleSelectorList )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4811:1: ruleSelectorList
            {
             before(grammarAccess.getNodeDefinitionAccess().getSelectorsSelectorListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSelectorList_in_rule__NodeDefinition__SelectorsAssignment_29789);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4820:1: rule__NodeReferenceList__NodesAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NodeReferenceList__NodesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4824:1: ( ( ( RULE_ID ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4825:1: ( ( RULE_ID ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4825:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4826:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionCrossReference_0_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4827:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4828:1: RULE_ID
            {
             before(grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeReferenceList__NodesAssignment_09824); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4839:1: rule__NodeReferenceList__NodesAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__NodeReferenceList__NodesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4843:1: ( ( ( RULE_ID ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4844:1: ( ( RULE_ID ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4844:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4845:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionCrossReference_1_1_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4846:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4847:1: RULE_ID
            {
             before(grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeReferenceList__NodesAssignment_1_19863); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4858:1: rule__TargetDefinition__AxisAssignment_0 : ( ruleAxis ) ;
    public final void rule__TargetDefinition__AxisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4862:1: ( ( ruleAxis ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4863:1: ( ruleAxis )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4863:1: ( ruleAxis )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4864:1: ruleAxis
            {
             before(grammarAccess.getTargetDefinitionAccess().getAxisAxisEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAxis_in_rule__TargetDefinition__AxisAssignment_09898);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4873:1: rule__TargetDefinition__DefinitionAssignment_1 : ( ruleNodeDefinition ) ;
    public final void rule__TargetDefinition__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4877:1: ( ( ruleNodeDefinition ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4878:1: ( ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4878:1: ( ruleNodeDefinition )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4879:1: ruleNodeDefinition
            {
             before(grammarAccess.getTargetDefinitionAccess().getDefinitionNodeDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_rule__TargetDefinition__DefinitionAssignment_19929);
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


    // $ANTLR start "rule__TargetDefinition__PredicateAssignment_2_2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4888:1: rule__TargetDefinition__PredicateAssignment_2_2 : ( rulePredicateExpression ) ;
    public final void rule__TargetDefinition__PredicateAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4892:1: ( ( rulePredicateExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4893:1: ( rulePredicateExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4893:1: ( rulePredicateExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4894:1: rulePredicateExpression
            {
             before(grammarAccess.getTargetDefinitionAccess().getPredicatePredicateExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_rule__TargetDefinition__PredicateAssignment_2_29960);
            rulePredicateExpression();

            state._fsp--;

             after(grammarAccess.getTargetDefinitionAccess().getPredicatePredicateExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__PredicateAssignment_2_2"


    // $ANTLR start "rule__TargetDefinition__AssignmentsAssignment_3_2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4903:1: rule__TargetDefinition__AssignmentsAssignment_3_2 : ( ruleAssignmentList ) ;
    public final void rule__TargetDefinition__AssignmentsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4907:1: ( ( ruleAssignmentList ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4908:1: ( ruleAssignmentList )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4908:1: ( ruleAssignmentList )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4909:1: ruleAssignmentList
            {
             before(grammarAccess.getTargetDefinitionAccess().getAssignmentsAssignmentListParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleAssignmentList_in_rule__TargetDefinition__AssignmentsAssignment_3_29991);
            ruleAssignmentList();

            state._fsp--;

             after(grammarAccess.getTargetDefinitionAccess().getAssignmentsAssignmentListParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDefinition__AssignmentsAssignment_3_2"


    // $ANTLR start "rule__SelectorList__SelectorsAssignment_0_1"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4918:1: rule__SelectorList__SelectorsAssignment_0_1 : ( ruleSelectorListDef ) ;
    public final void rule__SelectorList__SelectorsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4922:1: ( ( ruleSelectorListDef ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4923:1: ( ruleSelectorListDef )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4923:1: ( ruleSelectorListDef )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4924:1: ruleSelectorListDef
            {
             before(grammarAccess.getSelectorListAccess().getSelectorsSelectorListDefParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleSelectorListDef_in_rule__SelectorList__SelectorsAssignment_0_110022);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4933:1: rule__SelectorList__SelectorsAssignment_1_1 : ( ruleSelectorListDef ) ;
    public final void rule__SelectorList__SelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4937:1: ( ( ruleSelectorListDef ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4938:1: ( ruleSelectorListDef )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4938:1: ( ruleSelectorListDef )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4939:1: ruleSelectorListDef
            {
             before(grammarAccess.getSelectorListAccess().getSelectorsSelectorListDefParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSelectorListDef_in_rule__SelectorList__SelectorsAssignment_1_110053);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4948:1: rule__SelectorListDef__SelectorsAssignment_0 : ( ruleSelector ) ;
    public final void rule__SelectorListDef__SelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4952:1: ( ( ruleSelector ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4953:1: ( ruleSelector )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4953:1: ( ruleSelector )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4954:1: ruleSelector
            {
             before(grammarAccess.getSelectorListDefAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSelector_in_rule__SelectorListDef__SelectorsAssignment_010084);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4963:1: rule__SelectorListDef__SelectorsAssignment_1_1 : ( ruleSelector ) ;
    public final void rule__SelectorListDef__SelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4967:1: ( ( ruleSelector ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4968:1: ( ruleSelector )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4968:1: ( ruleSelector )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4969:1: ruleSelector
            {
             before(grammarAccess.getSelectorListDefAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSelector_in_rule__SelectorListDef__SelectorsAssignment_1_110115);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4978:1: rule__Selector__TypeAssignment : ( RULE_ID ) ;
    public final void rule__Selector__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4982:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4983:1: ( RULE_ID )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4983:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4984:1: RULE_ID
            {
             before(grammarAccess.getSelectorAccess().getTypeIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Selector__TypeAssignment10146); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4993:1: rule__AndExpression__RhsAssignment_1_2 : ( ruleOrExpression ) ;
    public final void rule__AndExpression__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4997:1: ( ( ruleOrExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4998:1: ( ruleOrExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4998:1: ( ruleOrExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:4999:1: ruleOrExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRhsOrExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__AndExpression__RhsAssignment_1_210177);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5008:1: rule__OrExpression__RhsAssignment_1_2 : ( ruleImpliesExpression ) ;
    public final void rule__OrExpression__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5012:1: ( ( ruleImpliesExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5013:1: ( ruleImpliesExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5013:1: ( ruleImpliesExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5014:1: ruleImpliesExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRhsImpliesExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleImpliesExpression_in_rule__OrExpression__RhsAssignment_1_210208);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5023:1: rule__ImpliesExpression__LhsAssignment_0 : ( rulePrimaryExpression ) ;
    public final void rule__ImpliesExpression__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5027:1: ( ( rulePrimaryExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5028:1: ( rulePrimaryExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5028:1: ( rulePrimaryExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5029:1: rulePrimaryExpression
            {
             before(grammarAccess.getImpliesExpressionAccess().getLhsPrimaryExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__ImpliesExpression__LhsAssignment_010239);
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


    // $ANTLR start "rule__ImpliesExpression__RhsAssignment_1_2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5038:1: rule__ImpliesExpression__RhsAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__ImpliesExpression__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5042:1: ( ( rulePrimaryExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5043:1: ( rulePrimaryExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5043:1: ( rulePrimaryExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5044:1: rulePrimaryExpression
            {
             before(grammarAccess.getImpliesExpressionAccess().getRhsPrimaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__ImpliesExpression__RhsAssignment_1_210270);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getImpliesExpressionAccess().getRhsPrimaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__RhsAssignment_1_2"


    // $ANTLR start "rule__PrimaryExpression__NegatedAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5053:1: rule__PrimaryExpression__NegatedAssignment_0 : ( ( 'not' ) ) ;
    public final void rule__PrimaryExpression__NegatedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5057:1: ( ( ( 'not' ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5058:1: ( ( 'not' ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5058:1: ( ( 'not' ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5059:1: ( 'not' )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNegatedNotKeyword_0_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5060:1: ( 'not' )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5061:1: 'not'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNegatedNotKeyword_0_0()); 
            match(input,55,FOLLOW_55_in_rule__PrimaryExpression__NegatedAssignment_010306); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5076:1: rule__PrimaryExpression__CallAssignment_1_0 : ( rulePredicateCall ) ;
    public final void rule__PrimaryExpression__CallAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5080:1: ( ( rulePredicateCall ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5081:1: ( rulePredicateCall )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5081:1: ( rulePredicateCall )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5082:1: rulePredicateCall
            {
             before(grammarAccess.getPrimaryExpressionAccess().getCallPredicateCallParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulePredicateCall_in_rule__PrimaryExpression__CallAssignment_1_010345);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5091:1: rule__PrimaryExpression__InnerAssignment_1_1_1 : ( rulePredicateExpression ) ;
    public final void rule__PrimaryExpression__InnerAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5095:1: ( ( rulePredicateExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5096:1: ( rulePredicateExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5096:1: ( rulePredicateExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5097:1: rulePredicateExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getInnerPredicateExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_rule__PrimaryExpression__InnerAssignment_1_1_110376);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5106:1: rule__PredicateCall__LabelAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__PredicateCall__LabelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5110:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5111:1: ( RULE_ID )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5111:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5112:1: RULE_ID
            {
             before(grammarAccess.getPredicateCallAccess().getLabelIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PredicateCall__LabelAssignment_1_110407); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5121:1: rule__PropertyRelationPredicate__LhsAssignment_0 : ( rulePropertyExpression ) ;
    public final void rule__PropertyRelationPredicate__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5125:1: ( ( rulePropertyExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5126:1: ( rulePropertyExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5126:1: ( rulePropertyExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5127:1: rulePropertyExpression
            {
             before(grammarAccess.getPropertyRelationPredicateAccess().getLhsPropertyExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePropertyExpression_in_rule__PropertyRelationPredicate__LhsAssignment_010438);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5136:1: rule__PropertyRelationPredicate__RelationAssignment_1 : ( rulePropertyRelation ) ;
    public final void rule__PropertyRelationPredicate__RelationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5140:1: ( ( rulePropertyRelation ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5141:1: ( rulePropertyRelation )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5141:1: ( rulePropertyRelation )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5142:1: rulePropertyRelation
            {
             before(grammarAccess.getPropertyRelationPredicateAccess().getRelationPropertyRelationEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePropertyRelation_in_rule__PropertyRelationPredicate__RelationAssignment_110469);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5151:1: rule__PropertyRelationPredicate__RhsAssignment_2 : ( rulePropertyExpression ) ;
    public final void rule__PropertyRelationPredicate__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5155:1: ( ( rulePropertyExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5156:1: ( rulePropertyExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5156:1: ( rulePropertyExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5157:1: rulePropertyExpression
            {
             before(grammarAccess.getPropertyRelationPredicateAccess().getRhsPropertyExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePropertyExpression_in_rule__PropertyRelationPredicate__RhsAssignment_210500);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5166:1: rule__DefinitionSentencePredicate__SentenceAssignment : ( ruleDefinitionSentence ) ;
    public final void rule__DefinitionSentencePredicate__SentenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5170:1: ( ( ruleDefinitionSentence ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5171:1: ( ruleDefinitionSentence )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5171:1: ( ruleDefinitionSentence )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5172:1: ruleDefinitionSentence
            {
             before(grammarAccess.getDefinitionSentencePredicateAccess().getSentenceDefinitionSentenceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDefinitionSentence_in_rule__DefinitionSentencePredicate__SentenceAssignment10531);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5181:1: rule__PredicateReference__ReferenceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PredicateReference__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5185:1: ( ( ( RULE_ID ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5186:1: ( ( RULE_ID ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5186:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5187:1: ( RULE_ID )
            {
             before(grammarAccess.getPredicateReferenceAccess().getReferencePredicateDefinitionSentenceCrossReference_0_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5188:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5189:1: RULE_ID
            {
             before(grammarAccess.getPredicateReferenceAccess().getReferencePredicateDefinitionSentenceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PredicateReference__ReferenceAssignment_010566); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5200:1: rule__PredicateReference__ArgumentsAssignment_1 : ( ruleArgumentList ) ;
    public final void rule__PredicateReference__ArgumentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5204:1: ( ( ruleArgumentList ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5205:1: ( ruleArgumentList )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5205:1: ( ruleArgumentList )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5206:1: ruleArgumentList
            {
             before(grammarAccess.getPredicateReferenceAccess().getArgumentsArgumentListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArgumentList_in_rule__PredicateReference__ArgumentsAssignment_110601);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5215:1: rule__Parameter__NodeAssignment : ( ruleNodeDefinition ) ;
    public final void rule__Parameter__NodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5219:1: ( ( ruleNodeDefinition ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5220:1: ( ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5220:1: ( ruleNodeDefinition )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5221:1: ruleNodeDefinition
            {
             before(grammarAccess.getParameterAccess().getNodeNodeDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_rule__Parameter__NodeAssignment10632);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5230:1: rule__ParameterList__ParametersAssignment_0 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5234:1: ( ( ruleParameter ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5235:1: ( ruleParameter )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5235:1: ( ruleParameter )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5236:1: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ParameterList__ParametersAssignment_010663);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5245:1: rule__ParameterList__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5249:1: ( ( ruleParameter ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5250:1: ( ruleParameter )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5250:1: ( ruleParameter )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5251:1: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ParameterList__ParametersAssignment_1_110694);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5260:1: rule__Argument__NodeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Argument__NodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5264:1: ( ( ( RULE_ID ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5265:1: ( ( RULE_ID ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5265:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5266:1: ( RULE_ID )
            {
             before(grammarAccess.getArgumentAccess().getNodeNodeDefinitionCrossReference_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5267:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5268:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNodeNodeDefinitionIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__NodeAssignment10729); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5279:1: rule__ArgumentList__ArgumentsAssignment_0 : ( ruleArgument ) ;
    public final void rule__ArgumentList__ArgumentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5283:1: ( ( ruleArgument ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5284:1: ( ruleArgument )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5284:1: ( ruleArgument )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5285:1: ruleArgument
            {
             before(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__ArgumentList__ArgumentsAssignment_010764);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5294:1: rule__ArgumentList__ArgumentsAssignment_1_1 : ( ruleArgument ) ;
    public final void rule__ArgumentList__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5298:1: ( ( ruleArgument ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5299:1: ( ruleArgument )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5299:1: ( ruleArgument )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5300:1: ruleArgument
            {
             before(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__ArgumentList__ArgumentsAssignment_1_110795);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5309:1: rule__Assignment__ReferenceAssignment_0 : ( rulePropertyReferenceExpression ) ;
    public final void rule__Assignment__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5313:1: ( ( rulePropertyReferenceExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5314:1: ( rulePropertyReferenceExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5314:1: ( rulePropertyReferenceExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5315:1: rulePropertyReferenceExpression
            {
             before(grammarAccess.getAssignmentAccess().getReferencePropertyReferenceExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePropertyReferenceExpression_in_rule__Assignment__ReferenceAssignment_010826);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5324:1: rule__Assignment__ExpressionAssignment_2 : ( rulePropertyExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5328:1: ( ( rulePropertyExpression ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5329:1: ( rulePropertyExpression )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5329:1: ( rulePropertyExpression )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5330:1: rulePropertyExpression
            {
             before(grammarAccess.getAssignmentAccess().getExpressionPropertyExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePropertyExpression_in_rule__Assignment__ExpressionAssignment_210857);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5339:1: rule__AssignmentList__AssignmentsAssignment_0 : ( ruleAssignment ) ;
    public final void rule__AssignmentList__AssignmentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5343:1: ( ( ruleAssignment ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5344:1: ( ruleAssignment )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5344:1: ( ruleAssignment )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5345:1: ruleAssignment
            {
             before(grammarAccess.getAssignmentListAccess().getAssignmentsAssignmentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAssignment_in_rule__AssignmentList__AssignmentsAssignment_010888);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5354:1: rule__AssignmentList__AssignmentsAssignment_1_1 : ( ruleAssignment ) ;
    public final void rule__AssignmentList__AssignmentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5358:1: ( ( ruleAssignment ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5359:1: ( ruleAssignment )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5359:1: ( ruleAssignment )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5360:1: ruleAssignment
            {
             before(grammarAccess.getAssignmentListAccess().getAssignmentsAssignmentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAssignment_in_rule__AssignmentList__AssignmentsAssignment_1_110919);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5369:1: rule__Quantification__QuantorAssignment_0 : ( ruleQuantor ) ;
    public final void rule__Quantification__QuantorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5373:1: ( ( ruleQuantor ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5374:1: ( ruleQuantor )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5374:1: ( ruleQuantor )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5375:1: ruleQuantor
            {
             before(grammarAccess.getQuantificationAccess().getQuantorQuantorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQuantor_in_rule__Quantification__QuantorAssignment_010950);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5384:1: rule__Quantification__NodeAssignment_1 : ( ruleNodeDefinition ) ;
    public final void rule__Quantification__NodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5388:1: ( ( ruleNodeDefinition ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5389:1: ( ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5389:1: ( ruleNodeDefinition )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5390:1: ruleNodeDefinition
            {
             before(grammarAccess.getQuantificationAccess().getNodeNodeDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_rule__Quantification__NodeAssignment_110981);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5399:1: rule__Quantification__NodeSetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Quantification__NodeSetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5403:1: ( ( ( RULE_ID ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5404:1: ( ( RULE_ID ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5404:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5405:1: ( RULE_ID )
            {
             before(grammarAccess.getQuantificationAccess().getNodeSetNodeDefinitionCrossReference_3_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5406:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5407:1: RULE_ID
            {
             before(grammarAccess.getQuantificationAccess().getNodeSetNodeDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Quantification__NodeSetAssignment_311016); 
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5418:1: rule__QuantificationList__QuantificationsAssignment_0 : ( ruleQuantification ) ;
    public final void rule__QuantificationList__QuantificationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5422:1: ( ( ruleQuantification ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5423:1: ( ruleQuantification )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5423:1: ( ruleQuantification )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5424:1: ruleQuantification
            {
             before(grammarAccess.getQuantificationListAccess().getQuantificationsQuantificationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQuantification_in_rule__QuantificationList__QuantificationsAssignment_011051);
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
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5433:1: rule__QuantificationList__QuantificationsAssignment_1_1 : ( ruleQuantification ) ;
    public final void rule__QuantificationList__QuantificationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5437:1: ( ( ruleQuantification ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5438:1: ( ruleQuantification )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5438:1: ( ruleQuantification )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5439:1: ruleQuantification
            {
             before(grammarAccess.getQuantificationListAccess().getQuantificationsQuantificationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleQuantification_in_rule__QuantificationList__QuantificationsAssignment_1_111082);
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


    // $ANTLR start "rule__PropertyValueExpression__ValueAssignment"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5448:1: rule__PropertyValueExpression__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__PropertyValueExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5452:1: ( ( RULE_STRING ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5453:1: ( RULE_STRING )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5453:1: ( RULE_STRING )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5454:1: RULE_STRING
            {
             before(grammarAccess.getPropertyValueExpressionAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PropertyValueExpression__ValueAssignment11113); 
             after(grammarAccess.getPropertyValueExpressionAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueExpression__ValueAssignment"


    // $ANTLR start "rule__PropertyReferenceExpression__NodeAssignment_0"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5463:1: rule__PropertyReferenceExpression__NodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyReferenceExpression__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5467:1: ( ( ( RULE_ID ) ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5468:1: ( ( RULE_ID ) )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5468:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5469:1: ( RULE_ID )
            {
             before(grammarAccess.getPropertyReferenceExpressionAccess().getNodeNodeDefinitionCrossReference_0_0()); 
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5470:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5471:1: RULE_ID
            {
             before(grammarAccess.getPropertyReferenceExpressionAccess().getNodeNodeDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyReferenceExpression__NodeAssignment_011148); 
             after(grammarAccess.getPropertyReferenceExpressionAccess().getNodeNodeDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPropertyReferenceExpressionAccess().getNodeNodeDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReferenceExpression__NodeAssignment_0"


    // $ANTLR start "rule__PropertyReferenceExpression__PropertyAssignment_2"
    // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5482:1: rule__PropertyReferenceExpression__PropertyAssignment_2 : ( RULE_ID ) ;
    public final void rule__PropertyReferenceExpression__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5486:1: ( ( RULE_ID ) )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5487:1: ( RULE_ID )
            {
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5487:1: ( RULE_ID )
            // ../com.isax.validation.dsl.ui/src-gen/com/isax/validation/dsl/ui/contentassist/antlr/internal/InternalDsl.g:5488:1: RULE_ID
            {
             before(grammarAccess.getPropertyReferenceExpressionAccess().getPropertyIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyReferenceExpression__PropertyAssignment_211183); 
             after(grammarAccess.getPropertyReferenceExpressionAccess().getPropertyIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReferenceExpression__PropertyAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleValidator_in_entryRuleValidator61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidator68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Validator__SentencesAssignment_in_ruleValidator96 = new BitSet(new long[]{0x0000038000300012L});
    public static final BitSet FOLLOW_rule__Validator__SentencesAssignment_in_ruleValidator108 = new BitSet(new long[]{0x0000038000300012L});
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
    public static final BitSet FOLLOW_rule__PropertyValueExpression__ValueAssignment_in_rulePropertyValueExpression1910 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_11_in_rule__ConstraintSentence__Alternatives_32285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ConstraintSentence__Alternatives_32305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PredicateDefinitionSentence__Alternatives_32340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PredicateDefinitionSentence__Alternatives_32360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_0__0_in_rule__SelectorList__Alternatives2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_1__0_in_rule__SelectorList__Alternatives2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AndExpression__Alternatives_1_12446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AndExpression__Alternatives_1_12466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ImpliesExpression__Alternatives_1_12501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ImpliesExpression__Alternatives_1_12521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__CallAssignment_1_0_in_rule__PrimaryExpression__Alternatives_12555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1_1__0_in_rule__PrimaryExpression__Alternatives_12573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRelationPredicate_in_rule__PredicateCall__Alternatives_02606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentencePredicate_in_rule__PredicateCall__Alternatives_02623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateReference_in_rule__PredicateCall__Alternatives_02640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Assignment__Alternatives_12673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Assignment__Alternatives_12693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValueExpression_in_rule__PropertyExpression__Alternatives2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReferenceExpression_in_rule__PropertyExpression__Alternatives2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Quantor__Alternatives2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Quantor__Alternatives2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RelationQualifier__Alternatives2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RelationQualifier__Alternatives2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RelationQualifier__Alternatives2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Axis__Alternatives2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Axis__Alternatives2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Axis__Alternatives2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Axis__Alternatives2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Axis__Alternatives2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Axis__Alternatives3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Axis__Alternatives3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Axis__Alternatives3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PropertyRelation__Alternatives3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PropertyRelation__Alternatives3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PropertyRelation__Alternatives3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__PropertyRelation__Alternatives3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__PropertyRelation__Alternatives3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__PropertyRelation__Alternatives3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartOnSentence__Group__0__Impl_in_rule__StartOnSentence__Group__03233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartOnSentence__Group__1_in_rule__StartOnSentence__Group__03236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__StartOnSentence__Group__0__Impl3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartOnSentence__Group__1__Impl_in_rule__StartOnSentence__Group__13295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartOnSentence__DefinitionAssignment_1_in_rule__StartOnSentence__Group__1__Impl3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__Group__0__Impl_in_rule__DefinitionSentence__Group__03356 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__Group__1_in_rule__DefinitionSentence__Group__03359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__Alternatives_0_in_rule__DefinitionSentence__Group__0__Impl3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__Group__1__Impl_in_rule__DefinitionSentence__Group__13416 = new BitSet(new long[]{0x00000001FE000000L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__Group__2_in_rule__DefinitionSentence__Group__13419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__QualifierAssignment_1_in_rule__DefinitionSentence__Group__1__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__Group__2__Impl_in_rule__DefinitionSentence__Group__23476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionSentence__TargetAssignment_2_in_rule__DefinitionSentence__Group__2__Impl3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__0__Impl_in_rule__ConstraintSentence__Group__03539 = new BitSet(new long[]{0x0000000000301810L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__1_in_rule__ConstraintSentence__Group__03542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ConstraintSentence__Group__0__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__1__Impl_in_rule__ConstraintSentence__Group__13601 = new BitSet(new long[]{0x0000000000301810L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__2_in_rule__ConstraintSentence__Group__13604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__QuantificationsAssignment_1_in_rule__ConstraintSentence__Group__1__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__2__Impl_in_rule__ConstraintSentence__Group__23662 = new BitSet(new long[]{0x0000000000301810L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__3_in_rule__ConstraintSentence__Group__23665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__NodesAssignment_2_in_rule__ConstraintSentence__Group__2__Impl3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__3__Impl_in_rule__ConstraintSentence__Group__33723 = new BitSet(new long[]{0x0080800000300030L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__4_in_rule__ConstraintSentence__Group__33726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Alternatives_3_in_rule__ConstraintSentence__Group__3__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__Group__4__Impl_in_rule__ConstraintSentence__Group__43783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintSentence__PredicateAssignment_4_in_rule__ConstraintSentence__Group__4__Impl3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__0__Impl_in_rule__PredicateDefinitionSentence__Group__03850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__1_in_rule__PredicateDefinitionSentence__Group__03853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__PredicateDefinitionSentence__Group__0__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__1__Impl_in_rule__PredicateDefinitionSentence__Group__13912 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__2_in_rule__PredicateDefinitionSentence__Group__13915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__NameAssignment_1_in_rule__PredicateDefinitionSentence__Group__1__Impl3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__2__Impl_in_rule__PredicateDefinitionSentence__Group__23972 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__3_in_rule__PredicateDefinitionSentence__Group__23975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__ParametersAssignment_2_in_rule__PredicateDefinitionSentence__Group__2__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__3__Impl_in_rule__PredicateDefinitionSentence__Group__34033 = new BitSet(new long[]{0x0080800000300030L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__4_in_rule__PredicateDefinitionSentence__Group__34036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Alternatives_3_in_rule__PredicateDefinitionSentence__Group__3__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__Group__4__Impl_in_rule__PredicateDefinitionSentence__Group__44093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateDefinitionSentence__PredicateAssignment_4_in_rule__PredicateDefinitionSentence__Group__4__Impl4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__0__Impl_in_rule__NodeDefinition__Group__04160 = new BitSet(new long[]{0x0040C00000000000L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__1_in_rule__NodeDefinition__Group__04163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__NameAssignment_0_in_rule__NodeDefinition__Group__0__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__1__Impl_in_rule__NodeDefinition__Group__14220 = new BitSet(new long[]{0x0040C00000000000L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__2_in_rule__NodeDefinition__Group__14223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__CollectionAssignment_1_in_rule__NodeDefinition__Group__1__Impl4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__2__Impl_in_rule__NodeDefinition__Group__24281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__SelectorsAssignment_2_in_rule__NodeDefinition__Group__2__Impl4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group__0__Impl_in_rule__NodeReferenceList__Group__04345 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group__1_in_rule__NodeReferenceList__Group__04348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__NodesAssignment_0_in_rule__NodeReferenceList__Group__0__Impl4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group__1__Impl_in_rule__NodeReferenceList__Group__14405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group_1__0_in_rule__NodeReferenceList__Group__1__Impl4432 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group_1__0__Impl_in_rule__NodeReferenceList__Group_1__04467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group_1__1_in_rule__NodeReferenceList__Group_1__04470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NodeReferenceList__Group_1__0__Impl4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__Group_1__1__Impl_in_rule__NodeReferenceList__Group_1__14529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeReferenceList__NodesAssignment_1_1_in_rule__NodeReferenceList__Group_1__1__Impl4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__0__Impl_in_rule__TargetDefinition__Group__04590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__1_in_rule__TargetDefinition__Group__04593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__AxisAssignment_0_in_rule__TargetDefinition__Group__0__Impl4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__1__Impl_in_rule__TargetDefinition__Group__14650 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__2_in_rule__TargetDefinition__Group__14653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__DefinitionAssignment_1_in_rule__TargetDefinition__Group__1__Impl4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__2__Impl_in_rule__TargetDefinition__Group__24710 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__3_in_rule__TargetDefinition__Group__24713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__0_in_rule__TargetDefinition__Group__2__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group__3__Impl_in_rule__TargetDefinition__Group__34771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__0_in_rule__TargetDefinition__Group__3__Impl4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__0__Impl_in_rule__TargetDefinition__Group_2__04837 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__1_in_rule__TargetDefinition__Group_2__04840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TargetDefinition__Group_2__0__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__1__Impl_in_rule__TargetDefinition__Group_2__14899 = new BitSet(new long[]{0x0080800000300030L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__2_in_rule__TargetDefinition__Group_2__14902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TargetDefinition__Group_2__1__Impl4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__2__Impl_in_rule__TargetDefinition__Group_2__24961 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__3_in_rule__TargetDefinition__Group_2__24964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__PredicateAssignment_2_2_in_rule__TargetDefinition__Group_2__2__Impl4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_2__3__Impl_in_rule__TargetDefinition__Group_2__35021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TargetDefinition__Group_2__3__Impl5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__0__Impl_in_rule__TargetDefinition__Group_3__05088 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__1_in_rule__TargetDefinition__Group_3__05091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__TargetDefinition__Group_3__0__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__1__Impl_in_rule__TargetDefinition__Group_3__15150 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__2_in_rule__TargetDefinition__Group_3__15153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TargetDefinition__Group_3__1__Impl5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__2__Impl_in_rule__TargetDefinition__Group_3__25212 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__3_in_rule__TargetDefinition__Group_3__25215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__AssignmentsAssignment_3_2_in_rule__TargetDefinition__Group_3__2__Impl5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetDefinition__Group_3__3__Impl_in_rule__TargetDefinition__Group_3__35272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TargetDefinition__Group_3__3__Impl5300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_0__0__Impl_in_rule__SelectorList__Group_0__05339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_0__1_in_rule__SelectorList__Group_0__05342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__SelectorList__Group_0__0__Impl5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_0__1__Impl_in_rule__SelectorList__Group_0__15401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__SelectorsAssignment_0_1_in_rule__SelectorList__Group_0__1__Impl5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_1__0__Impl_in_rule__SelectorList__Group_1__05462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_1__1_in_rule__SelectorList__Group_1__05465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__SelectorList__Group_1__0__Impl5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_1__1__Impl_in_rule__SelectorList__Group_1__15524 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_1__2_in_rule__SelectorList__Group_1__15527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__SelectorsAssignment_1_1_in_rule__SelectorList__Group_1__1__Impl5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorList__Group_1__2__Impl_in_rule__SelectorList__Group_1__25584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__SelectorList__Group_1__2__Impl5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group__0__Impl_in_rule__SelectorListDef__Group__05649 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group__1_in_rule__SelectorListDef__Group__05652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__SelectorsAssignment_0_in_rule__SelectorListDef__Group__0__Impl5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group__1__Impl_in_rule__SelectorListDef__Group__15709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group_1__0_in_rule__SelectorListDef__Group__1__Impl5736 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group_1__0__Impl_in_rule__SelectorListDef__Group_1__05771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group_1__1_in_rule__SelectorListDef__Group_1__05774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__SelectorListDef__Group_1__0__Impl5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__Group_1__1__Impl_in_rule__SelectorListDef__Group_1__15833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectorListDef__SelectorsAssignment_1_1_in_rule__SelectorListDef__Group_1__1__Impl5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__05894 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__05897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__AndExpression__Group__0__Impl5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__15953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl5980 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__06015 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__06018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__16076 = new BitSet(new long[]{0x0080800000300030L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__16079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Alternatives_1_1_in_rule__AndExpression__Group_1__1__Impl6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__26136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__RhsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl6163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__06199 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__06202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_rule__OrExpression__Group__0__Impl6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__16258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl6285 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__06320 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__06323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__16381 = new BitSet(new long[]{0x0080800000300030L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__16384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__OrExpression__Group_1__1__Impl6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__26443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__RhsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl6470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group__0__Impl_in_rule__ImpliesExpression__Group__06506 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group__1_in_rule__ImpliesExpression__Group__06509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__LhsAssignment_0_in_rule__ImpliesExpression__Group__0__Impl6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group__1__Impl_in_rule__ImpliesExpression__Group__16566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group_1__0_in_rule__ImpliesExpression__Group__1__Impl6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group_1__0__Impl_in_rule__ImpliesExpression__Group_1__06628 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group_1__1_in_rule__ImpliesExpression__Group_1__06631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group_1__1__Impl_in_rule__ImpliesExpression__Group_1__16689 = new BitSet(new long[]{0x0080800000300030L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group_1__2_in_rule__ImpliesExpression__Group_1__16692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Alternatives_1_1_in_rule__ImpliesExpression__Group_1__1__Impl6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__Group_1__2__Impl_in_rule__ImpliesExpression__Group_1__26749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpression__RhsAssignment_1_2_in_rule__ImpliesExpression__Group_1__2__Impl6776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group__0__Impl_in_rule__PrimaryExpression__Group__06812 = new BitSet(new long[]{0x0080800000300030L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group__1_in_rule__PrimaryExpression__Group__06815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__NegatedAssignment_0_in_rule__PrimaryExpression__Group__0__Impl6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group__1__Impl_in_rule__PrimaryExpression__Group__16873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_1_in_rule__PrimaryExpression__Group__1__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1_1__0__Impl_in_rule__PrimaryExpression__Group_1_1__06934 = new BitSet(new long[]{0x0080800000300030L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1_1__1_in_rule__PrimaryExpression__Group_1_1__06937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__PrimaryExpression__Group_1_1__0__Impl6965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1_1__1__Impl_in_rule__PrimaryExpression__Group_1_1__16996 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1_1__2_in_rule__PrimaryExpression__Group_1_1__16999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__InnerAssignment_1_1_1_in_rule__PrimaryExpression__Group_1_1__1__Impl7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1_1__2__Impl_in_rule__PrimaryExpression__Group_1_1__27056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__PrimaryExpression__Group_1_1__2__Impl7084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group__0__Impl_in_rule__PredicateCall__Group__07121 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group__1_in_rule__PredicateCall__Group__07124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Alternatives_0_in_rule__PredicateCall__Group__0__Impl7151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group__1__Impl_in_rule__PredicateCall__Group__17181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group_1__0_in_rule__PredicateCall__Group__1__Impl7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group_1__0__Impl_in_rule__PredicateCall__Group_1__07243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group_1__1_in_rule__PredicateCall__Group_1__07246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__PredicateCall__Group_1__0__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group_1__1__Impl_in_rule__PredicateCall__Group_1__17305 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group_1__2_in_rule__PredicateCall__Group_1__17308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__LabelAssignment_1_1_in_rule__PredicateCall__Group_1__1__Impl7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateCall__Group_1__2__Impl_in_rule__PredicateCall__Group_1__27365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__PredicateCall__Group_1__2__Impl7393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__Group__0__Impl_in_rule__PropertyRelationPredicate__Group__07430 = new BitSet(new long[]{0x0000007E00000000L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__Group__1_in_rule__PropertyRelationPredicate__Group__07433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__LhsAssignment_0_in_rule__PropertyRelationPredicate__Group__0__Impl7460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__Group__1__Impl_in_rule__PropertyRelationPredicate__Group__17490 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__Group__2_in_rule__PropertyRelationPredicate__Group__17493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__RelationAssignment_1_in_rule__PropertyRelationPredicate__Group__1__Impl7520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__Group__2__Impl_in_rule__PropertyRelationPredicate__Group__27550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyRelationPredicate__RhsAssignment_2_in_rule__PropertyRelationPredicate__Group__2__Impl7577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateReference__Group__0__Impl_in_rule__PredicateReference__Group__07613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PredicateReference__Group__1_in_rule__PredicateReference__Group__07616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateReference__ReferenceAssignment_0_in_rule__PredicateReference__Group__0__Impl7643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateReference__Group__1__Impl_in_rule__PredicateReference__Group__17673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateReference__ArgumentsAssignment_1_in_rule__PredicateReference__Group__1__Impl7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__0__Impl_in_rule__ParameterList__Group__07734 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__07737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ParametersAssignment_0_in_rule__ParameterList__Group__0__Impl7764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__1__Impl_in_rule__ParameterList__Group__17794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__0_in_rule__ParameterList__Group__1__Impl7821 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__0__Impl_in_rule__ParameterList__Group_1__07856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__1_in_rule__ParameterList__Group_1__07859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ParameterList__Group_1__0__Impl7887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__1__Impl_in_rule__ParameterList__Group_1__17918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ParametersAssignment_1_1_in_rule__ParameterList__Group_1__1__Impl7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group__0__Impl_in_rule__ArgumentList__Group__07979 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group__1_in_rule__ArgumentList__Group__07982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentList__ArgumentsAssignment_0_in_rule__ArgumentList__Group__0__Impl8009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group__1__Impl_in_rule__ArgumentList__Group__18039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group_1__0_in_rule__ArgumentList__Group__1__Impl8066 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group_1__0__Impl_in_rule__ArgumentList__Group_1__08101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group_1__1_in_rule__ArgumentList__Group_1__08104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ArgumentList__Group_1__0__Impl8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentList__Group_1__1__Impl_in_rule__ArgumentList__Group_1__18163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentList__ArgumentsAssignment_1_1_in_rule__ArgumentList__Group_1__1__Impl8190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__08224 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__08227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ReferenceAssignment_0_in_rule__Assignment__Group__0__Impl8254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__18284 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__18287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Alternatives_1_in_rule__Assignment__Group__1__Impl8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__28344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_in_rule__Assignment__Group__2__Impl8371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group__0__Impl_in_rule__AssignmentList__Group__08407 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group__1_in_rule__AssignmentList__Group__08410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentList__AssignmentsAssignment_0_in_rule__AssignmentList__Group__0__Impl8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group__1__Impl_in_rule__AssignmentList__Group__18467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group_1__0_in_rule__AssignmentList__Group__1__Impl8494 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group_1__0__Impl_in_rule__AssignmentList__Group_1__08529 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group_1__1_in_rule__AssignmentList__Group_1__08532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AssignmentList__Group_1__0__Impl8560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentList__Group_1__1__Impl_in_rule__AssignmentList__Group_1__18591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentList__AssignmentsAssignment_1_1_in_rule__AssignmentList__Group_1__1__Impl8618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__Group__0__Impl_in_rule__Quantification__Group__08652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Quantification__Group__1_in_rule__Quantification__Group__08655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__QuantorAssignment_0_in_rule__Quantification__Group__0__Impl8682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__Group__1__Impl_in_rule__Quantification__Group__18712 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Quantification__Group__2_in_rule__Quantification__Group__18715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__NodeAssignment_1_in_rule__Quantification__Group__1__Impl8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__Group__2__Impl_in_rule__Quantification__Group__28772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Quantification__Group__3_in_rule__Quantification__Group__28775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Quantification__Group__2__Impl8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__Group__3__Impl_in_rule__Quantification__Group__38834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantification__NodeSetAssignment_3_in_rule__Quantification__Group__3__Impl8861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group__0__Impl_in_rule__QuantificationList__Group__08899 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group__1_in_rule__QuantificationList__Group__08902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantificationList__QuantificationsAssignment_0_in_rule__QuantificationList__Group__0__Impl8929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group__1__Impl_in_rule__QuantificationList__Group__18959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group_1__0_in_rule__QuantificationList__Group__1__Impl8986 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group_1__0__Impl_in_rule__QuantificationList__Group_1__09021 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group_1__1_in_rule__QuantificationList__Group_1__09024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QuantificationList__Group_1__0__Impl9052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantificationList__Group_1__1__Impl_in_rule__QuantificationList__Group_1__19083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantificationList__QuantificationsAssignment_1_1_in_rule__QuantificationList__Group_1__1__Impl9110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__Group__0__Impl_in_rule__PropertyReferenceExpression__Group__09144 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__Group__1_in_rule__PropertyReferenceExpression__Group__09147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__NodeAssignment_0_in_rule__PropertyReferenceExpression__Group__0__Impl9174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__Group__1__Impl_in_rule__PropertyReferenceExpression__Group__19204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__Group__2_in_rule__PropertyReferenceExpression__Group__19207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__PropertyReferenceExpression__Group__1__Impl9235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__Group__2__Impl_in_rule__PropertyReferenceExpression__Group__29266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReferenceExpression__PropertyAssignment_2_in_rule__PropertyReferenceExpression__Group__2__Impl9293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_rule__Validator__SentencesAssignment9334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_rule__StartOnSentence__DefinitionAssignment_19365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantification_in_rule__DefinitionSentence__QuantificationAssignment_0_09396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefinitionSentence__NodeAssignment_0_19431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationQualifier_in_rule__DefinitionSentence__QualifierAssignment_19466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetDefinition_in_rule__DefinitionSentence__TargetAssignment_29497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantificationList_in_rule__ConstraintSentence__QuantificationsAssignment_19528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeReferenceList_in_rule__ConstraintSentence__NodesAssignment_29559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rule__ConstraintSentence__PredicateAssignment_49590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PredicateDefinitionSentence__NameAssignment_19621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_rule__PredicateDefinitionSentence__ParametersAssignment_29652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rule__PredicateDefinitionSentence__PredicateAssignment_49683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeDefinition__NameAssignment_09714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__NodeDefinition__CollectionAssignment_19750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorList_in_rule__NodeDefinition__SelectorsAssignment_29789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeReferenceList__NodesAssignment_09824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeReferenceList__NodesAssignment_1_19863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxis_in_rule__TargetDefinition__AxisAssignment_09898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_rule__TargetDefinition__DefinitionAssignment_19929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rule__TargetDefinition__PredicateAssignment_2_29960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentList_in_rule__TargetDefinition__AssignmentsAssignment_3_29991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorListDef_in_rule__SelectorList__SelectorsAssignment_0_110022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorListDef_in_rule__SelectorList__SelectorsAssignment_1_110053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__SelectorListDef__SelectorsAssignment_010084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__SelectorListDef__SelectorsAssignment_1_110115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Selector__TypeAssignment10146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__AndExpression__RhsAssignment_1_210177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_rule__OrExpression__RhsAssignment_1_210208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__ImpliesExpression__LhsAssignment_010239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__ImpliesExpression__RhsAssignment_1_210270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__PrimaryExpression__NegatedAssignment_010306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateCall_in_rule__PrimaryExpression__CallAssignment_1_010345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rule__PrimaryExpression__InnerAssignment_1_1_110376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PredicateCall__LabelAssignment_1_110407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_rule__PropertyRelationPredicate__LhsAssignment_010438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRelation_in_rule__PropertyRelationPredicate__RelationAssignment_110469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_rule__PropertyRelationPredicate__RhsAssignment_210500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentence_in_rule__DefinitionSentencePredicate__SentenceAssignment10531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PredicateReference__ReferenceAssignment_010566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentList_in_rule__PredicateReference__ArgumentsAssignment_110601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_rule__Parameter__NodeAssignment10632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParameterList__ParametersAssignment_010663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParameterList__ParametersAssignment_1_110694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__NodeAssignment10729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__ArgumentList__ArgumentsAssignment_010764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__ArgumentList__ArgumentsAssignment_1_110795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReferenceExpression_in_rule__Assignment__ReferenceAssignment_010826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_rule__Assignment__ExpressionAssignment_210857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__AssignmentList__AssignmentsAssignment_010888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__AssignmentList__AssignmentsAssignment_1_110919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantor_in_rule__Quantification__QuantorAssignment_010950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_rule__Quantification__NodeAssignment_110981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Quantification__NodeSetAssignment_311016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantification_in_rule__QuantificationList__QuantificationsAssignment_011051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantification_in_rule__QuantificationList__QuantificationsAssignment_1_111082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertyValueExpression__ValueAssignment11113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyReferenceExpression__NodeAssignment_011148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyReferenceExpression__PropertyAssignment_211183 = new BitSet(new long[]{0x0000000000000002L});

}